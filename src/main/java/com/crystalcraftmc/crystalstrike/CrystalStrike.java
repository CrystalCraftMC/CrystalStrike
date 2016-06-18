/*
 * Copyright (c) 2016 dellman135, CrystalCraftMC
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.crystalcraftmc.crystalstrike;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * CrystalStrike is a plugin that does...
 *
 * @author dellman135
 * @version 2016.06.17.v1
 */
public class CrystalStrike extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getLogger().info("CrystalStrike has been enabled");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);
    }

    @EventHandler
    public void onLightning(LightningStrikeEvent e) {
        Location baseLocation = e.getLightning().getLocation();
        //first "stike"
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.LAVA);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.PACKED_ICE);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.PACKED_ICE);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.ICE);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.ICE);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.ICE);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.ICE);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
        e.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);



    }

}
