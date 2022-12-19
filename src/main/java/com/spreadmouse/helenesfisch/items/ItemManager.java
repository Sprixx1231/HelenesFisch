package com.spreadmouse.helenesfisch.items;

import com.spreadmouse.helenesfisch.HelenesFisch;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public static ItemStack fish;

    public static void init(){
        CreateFish();
    }

    public static void CreateFish(){

        ItemStack item = new ItemStack(Material.TROPICAL_FISH,1);
        ItemMeta meta = item.getItemMeta();



        meta.setDisplayName("§bHelenes Fisch");

        List<String> lore = new ArrayList<>();
        lore.add("§cThis powerful relic of the past");
        lore.add("§cwas once Helenes most powerful weapon");
        lore.add("§cThis stronk fish will slay all your  enemies");

        meta.setLore(lore);

        meta.addEnchant(Enchantment.DAMAGE_ALL,5,true);
        meta.addEnchant(Enchantment.KNOCKBACK, 5,true);
        meta.addEnchant(Enchantment.DURABILITY, 999,true);
        meta.addEnchant(Enchantment.LUCK, 5,true);
        meta.addEnchant(Enchantment.BINDING_CURSE, 5,true);
        meta.addEnchant(Enchantment.DIG_SPEED, 5,true);
        meta.addEnchant(Enchantment.PIERCING, 2,true);
        meta.addEnchant(Enchantment.SILK_TOUCH, 2,true);
        meta.addEnchant(Enchantment.VANISHING_CURSE, 2,true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10,true);
        meta.addEnchant(Enchantment.IMPALING, 5,true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);


        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(item);

        recipe.shape(
                " G ", "GFG", " G "
        );

        recipe.setIngredient('G', Material.GOLD_BLOCK);
        recipe.setIngredient('F', Material.TROPICAL_FISH);

        Bukkit.addRecipe(recipe);

        fish = item;
    }
}

