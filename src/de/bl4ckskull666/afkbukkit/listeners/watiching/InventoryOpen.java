/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.bl4ckskull666.afkbukkit.listeners.watiching;

import de.bl4ckskull666.afkbukkit.AFKBukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

/**
 *
 * @author PapaHarni
 */
public class InventoryOpen implements Listener {
    @EventHandler(priority = EventPriority.HIGH)
    public void onInventoryOpen(InventoryOpenEvent e) {
        if(AFKBukkit.getPlugin().getConfig().getBoolean("check.inventory-open", false)) {
            if(e.getPlayer() instanceof Player)
                AFKBukkit.getPlugin().sendPluginMessage(((Player)e.getPlayer()));
        }
    }
}
