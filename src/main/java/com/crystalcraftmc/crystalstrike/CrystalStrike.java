/*
 * Copyright (c) 2016 dellman135, CrystalCraftMC
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.crystalcraftmc.crystalstrike;

//import org.bukkit.ChatColor;
//import org.bukkit.Location;
//import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

/**
 * CrystalStrike is a plug-in that spawns a random crystal if all specifications are met with a chest of random items in the
 * middle of it.
 *
 * @author dellman135; JMW18
 * @version 2016.06.17.v1;2017.08.14.v2
 * 
 * Suggestions: 1) Have crystal only spawn 25% of the time (coin simulator from APCS A would be good algorithm for controlling this) > Done
 * 				2) Make something to Disable Program in game
 */
public class CrystalStrike extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getLogger().info("CrystalStrike has been enabled!");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);
    }

    @EventHandler
    public void onLightning(final LightningStrikeEvent lightning) {
        this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            public void run() {
            	if(Math.random() <= 0.25){
            		 Random randNum = new Random();
                     int ccmc_strike = randNum.nextInt(2);
                     BuildCrystal build = new BuildCrystal(lightning);
                     
                     if (ccmc_strike == 0) {
                         build.firstCrystal();
                     }
                     else if (ccmc_strike == 1) {
                        build.secondCrystal();
                     }
            	} 
            }
        }, 20L);

    }

}
