package fr.random.nk.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class ConectionListeners implements Listener {

    @EventHandler

    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.YELLOW + player.getName() + " " + ChatColor.GRAY + "Ist der Arme beigetretten");
        player.getInventory().addItem(new ItemStack(Material.DIAMOND));
    }

    @EventHandler

    public void onLeft(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW + player.getName() + " " + ChatColor.GRAY + "hat uns verlassen");


    }

}
