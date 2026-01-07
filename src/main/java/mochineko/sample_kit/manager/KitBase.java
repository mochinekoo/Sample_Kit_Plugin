package mochineko.sample_kit.manager;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class KitBase {

    private String name; //名前
    private String description; //説明
    private OfflinePlayer player; //キットの所有者
    private List<ItemStack> items; //キットのデフォルトのアイテム

    private KitBase() {}

    public KitBase(String name, OfflinePlayer player, List<ItemStack> items) {
        this.name = name;
        this.player = player;
        this.items = items;
    }

    public KitBase(String name, OfflinePlayer player) {
        this.name = name;
        this.player = player;
        this.items = Collections.emptyList();
    }

    public String getName() {
        return name;
    }

    public OfflinePlayer getOwner() {
        return player;
    }

    public List<ItemStack> getItems() {
        return items;
    }
}
