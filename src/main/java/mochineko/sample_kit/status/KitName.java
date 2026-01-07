package mochineko.sample_kit.status;

import mochineko.sample_kit.manager.Jumper;
import mochineko.sample_kit.manager.KitBase;
import org.bukkit.OfflinePlayer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum KitName {
    JUMPER(Jumper.class);

    private Class<? extends KitBase> kit_class;

    KitName(Class<? extends KitBase> kit_class) {
        this.kit_class = kit_class;
    }

    public Class<? extends KitBase> getKitClass() {
        return kit_class;
    }

    public KitBase newInstance(OfflinePlayer player) {
        try {
            Constructor<? extends KitBase> constructor = kit_class.getConstructor(OfflinePlayer.class);
            return constructor.newInstance(player);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    public static KitName getKitName(Class<? extends KitBase> kit_class) {
        for (KitName kitName : KitName.values()) {
            if (kitName.getKitClass() == kit_class) {
                return kitName;
            }
        }
        return null;
    }
}
