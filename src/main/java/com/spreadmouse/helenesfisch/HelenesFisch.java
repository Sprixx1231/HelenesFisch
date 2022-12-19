package com.spreadmouse.helenesfisch;

import com.spreadmouse.helenesfisch.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelenesFisch extends JavaPlugin {

    //public static NamespacedKey key = new NamespacedKey("HelenesFisch", "Helenes_Fisch");

    @Override
    public void onEnable() {
        ItemManager.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
