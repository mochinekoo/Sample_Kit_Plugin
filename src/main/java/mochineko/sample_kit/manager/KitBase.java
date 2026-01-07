package mochineko.sample_kit.manager;

import org.bukkit.OfflinePlayer;

import java.util.UUID;

public abstract class KitBase {

    private String name; //名前
    private String description; //説明
    private OfflinePlayer player; //キットの所有者

    private KitBase() {}

    public KitBase(String name, OfflinePlayer player) {
        this.name = name;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public OfflinePlayer getOwner() {
        return player;
    }
}
