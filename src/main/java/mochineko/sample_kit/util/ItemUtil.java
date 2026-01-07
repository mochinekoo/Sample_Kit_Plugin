package mochineko.sample_kit.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemUtil {

    private ItemStack itemStack;

    public ItemUtil(Material material, String name, List<String> lore) {
        this.itemStack = new ItemStack(material);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
    }

    public ItemStack build() {
        return itemStack;
    }

}
