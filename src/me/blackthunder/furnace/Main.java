package me.blackthunder.furnace;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Furnace Enabled");
    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Furnace Disabled");
    }


}
