package com.spreadmouse.helenesfisch;

import com.spreadmouse.helenesfisch.commands.commands;
import com.spreadmouse.helenesfisch.items.ItemManager;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class HelenesFisch extends JavaPlugin {

    //public static NamespacedKey key = new NamespacedKey("HelenesFisch", "Helenes_Fisch");

    @Override
    public void onEnable() {
        ItemManager.init();
        getCommand("HELENESFISCH").setExecutor(new commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
