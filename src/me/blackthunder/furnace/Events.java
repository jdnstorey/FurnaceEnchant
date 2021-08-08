package me.blackthunder.furnace;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {

    ItemStack iron = new ItemStack(Material.IRON_INGOT);
    ItemStack gold = new ItemStack(Material.GOLD_INGOT);

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Block block = e.getBlock();
        Player p = e.getPlayer();
        Location loc = block.getLocation();

        if(block.getType().equals(Material.IRON_ORE)) {
            e.setDropItems(false);
            loc.getWorld().dropItem(loc, iron);

        } else if (block.getType().equals(Material.GOLD_ORE)){
            e.setDropItems(false);
            loc.getWorld().dropItem(loc, gold);
        } else {
            return;
        }
    }
}
