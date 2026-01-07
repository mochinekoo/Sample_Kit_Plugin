package mochineko.sample_kit;

import mochineko.sample_kit.command.KitCommand;
import mochineko.sample_kit.listener.JumperListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager plm = getServer().getPluginManager();
        plm.registerEvents(new JumperListener(), this);

        getCommand("sample_kit").setExecutor(new KitCommand());
    }

    @Override
    public void onDisable() {
    }
}
