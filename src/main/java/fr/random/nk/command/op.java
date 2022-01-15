package fr.random.nk.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class op implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String NotPlayer;
        String op;
        op = "You are now Operator";
        NotPlayer = "You are not a Player!";

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + NotPlayer);
            return false;
        }else {
            Player player = (Player) sender;
            player.setOp(true);
            sender.sendMessage(ChatColor.AQUA + op);

        }

        return false;
    }
}
