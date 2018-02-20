package com.crystalcraftmc.crystalstrike;

//import org.bukkit.plugin.PluginManager;
//import org.bukkit.plugin.java.JavaPlugin;
//import org.bukkit.ChatColor;
//import org.bukkit.event.EventHandler;
//import org.bukkit.event.Listener;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;




public class BuildCrystal {
	
	private Location baseLocation;
	private final LightningStrikeEvent event;
	
	public BuildCrystal(final LightningStrikeEvent e){
		baseLocation = e.getLightning().getLocation();
		event = e;
	}
	
	public void firstCrystal(){
		
		event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.CHEST);//0,60,0 (original)
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.PACKED_ICE);//-1,60,0
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.PACKED_ICE);//1,60,0
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.PACKED_ICE);//0,60,1
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.PACKED_ICE);//0,60,-1
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.ICE);//1,60,1
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.ICE);//-1,60,1
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.ICE);//-1,60,-1
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.ICE);//1,60,-1
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);//0,61,0
        event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);//0,59,0
        
        //Adding items to the chest...how do we want to do this?
        Block block = baseLocation.getBlock();
        Chest chest = (Chest)block.getState();
        Inventory inv = chest.getInventory();
        
        List<ItemStack> items = new ArrayList<ItemStack>();
        items.add(new ItemStack(Material.DIAMOND_SWORD, 1));
        items.add(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
        items.add(new ItemStack(Material.ENDER_PEARL, 16));
        
        inv.addItem(items.get(0), items.get(1), items.get(2));
	}
	
	public void secondCrystal(){
		 event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 6, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 5, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 5, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 5, baseLocation.getBlockZ() - 1).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 5, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 5, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 4, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 4, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 4, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 4, baseLocation.getBlockZ() - 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 4, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 4, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 3, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 3, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 3, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 2, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 2, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() + 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 2).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 1).setType(Material.ICE);        
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 3, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.CHEST);//Center
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() + 2).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.GLOWSTONE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 2).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() - 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() - 2).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 3, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);        
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 3, baseLocation.getBlockZ() - 1).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 3, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 3, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 3, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 4, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         
         //Adding items to the chest...how do we want to do this?
         Block block = baseLocation.getBlock();
         Chest chest = (Chest)block.getState();
         Inventory inv = chest.getInventory();
         
         List<ItemStack> items = new ArrayList<ItemStack>();
         items.add(new ItemStack(Material.DIAMOND_SWORD, 1));
         items.add(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
         items.add(new ItemStack(Material.ENDER_PEARL, 16));
         
         inv.addItem(items.get(0), items.get(1), items.get(2));
	}
}
