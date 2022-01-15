package fr.random.nk;

import fr.random.nk.command.*;
import fr.random.nk.listeners.BlockListeners;
import fr.random.nk.listeners.ConectionListeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Random extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "Hello \n How are you?");
        getCommand("secdeop").setExecutor(new Deop());
        getCommand("do").setExecutor(new DoCommand());
        getCommand("fly").setExecutor(new fly());
        getCommand("secop").setExecutor(new op());
        getCommand("Hallo").setExecutor(new TestCommand());
        getCommand("joke").setExecutor(new witze());

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new BlockListeners(), this);
        pluginManager.registerEvents(new ConectionListeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.GREEN + "Bey \n Have a nice day");
    }
}
