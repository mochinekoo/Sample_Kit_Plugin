package mochineko.sample_kit.manager;

import org.bukkit.OfflinePlayer;

import java.util.Map;

public class KitManager {

    private static KitManager instance;
    private static Map<OfflinePlayer, KitBase> kitPlayers;

    private KitManager() {}

    public static KitManager getInstance() {
        if (instance == null) {
            instance = new KitManager();
        }
        return instance;
    }

    public void addKit(OfflinePlayer player, KitBase kit) {
        kitPlayers.put(player, kit);
    }

    public void removeKit(OfflinePlayer player) {
        kitPlayers.remove(player);
    }

    public KitBase getKit(OfflinePlayer player) {
        return kitPlayers.get(player);
    }
}
