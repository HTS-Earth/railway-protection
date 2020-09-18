package htsearth.railwayprotect;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class RailwayProtect extends JavaPlugin implements Listener{



    @Override
    public void onEnable() {
        // Plugin startup logic
    	getLogger().info("Enabling railway protection, official HTS Earth plugin.");
    	getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    	getLogger().info("Disabling railway protection, official HTS Earth plugin.");

    }
    @EventHandler
    public void addSlowDigging(PlayerInteractEvent event) {
        Player player = event.getPlayer();
            if (event.getClickedBlock().getType() == Material.RAIL) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 60, 2));
        }
    }
}
