package fr.random.nk.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Deop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String NotPlayer;
        String deopet;
        deopet = "You are now a Player!";
        NotPlayer = "You are not a Player!";
        Player player = (Player) sender;
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + NotPlayer);

        }else{
            player.setOp(false);
            sender.sendMessage(ChatColor.AQUA + deopet);
        }

        return false;
    }
}

