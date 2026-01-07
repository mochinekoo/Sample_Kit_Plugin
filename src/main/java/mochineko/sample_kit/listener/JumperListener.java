package mochineko.sample_kit.listener;

import mochineko.sample_kit.manager.KitBase;
import mochineko.sample_kit.manager.KitManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.FishHook;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class JumperListener implements Listener {

    @EventHandler
    public void onFish(PlayerFishEvent event) {
        Player player = event.getPlayer();
        KitManager kitManager = KitManager.getInstance();
        KitBase kit = kitManager.getKit(player);
        if (kit == null) return;
        if (!kit.getName().equals("Jumper")) return;
        if (player.getInventory().getItemInMainHand().getType() != Material.FISHING_ROD) return;

        FishHook hook = event.getHook();
        Location hook_loc = hook.getLocation();
        Location p_location = player.getLocation();
        Vector p_velocity = player.getVelocity();

        Vector direction = hook_loc.toVector().subtract(p_location.toVector()).normalize();
        player.setVelocity(p_velocity.add(direction));
    }
}
