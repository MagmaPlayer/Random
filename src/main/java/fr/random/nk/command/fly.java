package fr.random.nk.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String NotPlayer;
        String flying;
        flying = "You can now fly!";
        NotPlayer = "You are not a Player!";

        Player player = (Player) sender;

        if (!(sender instanceof Player)) {

            sender.sendMessage(ChatColor.RED + NotPlayer);

        } else if (!(player.getAllowFlight())){

            player.setAllowFlight(true);
            player.setFlying(true);
            sender.sendMessage(ChatColor.GREEN + flying);

        }
        return false;
    }
}
