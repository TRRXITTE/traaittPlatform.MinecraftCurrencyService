package nugetzrul3.mc.tipbot.commands;

import nugetzrul3.mc.tipbot.Main;
import nugetzrul3.mc.tipbot.config.Constants;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    private Main plugin;

    public HelpCommand(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("tiphelp").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You not a player m8");
            return true;
        }

        Constants constants = new Constants();

        Player player = (Player) sender;
        player.sendMessage(ChatColor.BLUE + "Welcome to the " + ChatColor.BLUE + constants.coinName + " Minecraft Currency Service. Here are my commands\n" +
                ChatColor.DARK_PURPLE + "1. /tiphelp: " + ChatColor.WHITE + "Displays this help message\n" +
                ChatColor.DARK_PURPLE + "2. /tip <username> <amount>: " + ChatColor.WHITE + "Tip's a certain amount of ETRX to another user\n" +
                ChatColor.DARK_PURPLE + "3. /deposit: " + ChatColor.WHITE +"Gives you a ETRX address to deposit ETRX to\n" +
                ChatColor.DARK_PURPLE + "4. /withdraw <amount> <ETRX address>: " + ChatColor.WHITE + "Withdraw a certain amount from your bot balance\n" +
                ChatColor.DARK_PURPLE + "5. /info: " + ChatColor.WHITE + "Returns general information on the traaittPlatform blockchain\n" +
                ChatColor.DARK_PURPLE + "6. /balance: " + ChatColor.WHITE + "Returns your current account balance"
        );
        return false;
    }
}
