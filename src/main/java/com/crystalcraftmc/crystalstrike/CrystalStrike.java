/*
 * Copyright (c) 2016 Brian Burke, CrystalCraftMC
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.crystalcraftmc.crystalstrike;

import org.bukkit.entity.LightningStrike;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
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
    }

    @EventHandler
    public void onLightning(LightningStrike e) {


    }

}
