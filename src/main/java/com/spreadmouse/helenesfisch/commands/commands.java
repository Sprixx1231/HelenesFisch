package com.spreadmouse.helenesfisch.commands;

import com.spreadmouse.helenesfisch.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("Only players can use that command");
            return true;
        }

        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("HELENESFISCH")){
            player.getInventory().addItem(ItemManager.fish);
        }

        return true;
    }
}
