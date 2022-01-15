package fr.random.nk.command;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String creative;
        String survival;
        String NotPlayer;
        String Usage;
        Usage = "Usage do <one/two>";
        survival = "Du bist jetzt in Survival";
        creative = "Du bist jetzt in Creative";
        NotPlayer = "Dieser Befehl kann nur als Spieler ausgeführt werden";
        if (!(sender instanceof Player)) {

            System.out.println(ChatColor.RED + NotPlayer);
            return false;
        }
        Player player = (Player) sender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("one")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GREEN + creative);

            } else if (args[0].equalsIgnoreCase("two")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GREEN + survival);

            } else {
                sender.sendMessage(ChatColor.RED + Usage);
            }

        } else {
            sender.sendMessage(ChatColor.RED + Usage);
        }
        return false;
    }
}
