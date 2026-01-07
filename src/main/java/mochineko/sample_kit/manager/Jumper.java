package mochineko.sample_kit.manager;

import mochineko.sample_kit.util.ItemUtil;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

public class Jumper extends KitBase {

    private static final String KIT_NAME = "Jumper";

    public Jumper(OfflinePlayer player) {
        super(KIT_NAME, player, Arrays.asList(
                new ItemUtil(Material.FISHING_ROD, ChatColor.GOLD + "Jumper", Arrays.asList("ジャンプするキット")).build()
        ));
    }
}
