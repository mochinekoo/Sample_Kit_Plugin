package mochineko.sample_kit.command;

import mochineko.sample_kit.manager.KitManager;
import mochineko.sample_kit.status.KitName;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KitCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender send, Command cmd, String s, String[] args) {
        if (cmd.getName().equalsIgnoreCase("sample_kit")) {
            KitManager kitManager = KitManager.getInstance();
            if (args[0].equalsIgnoreCase("add")) {
                Player player = Bukkit.getPlayer(args[1]);
                kitManager.addKit(player, KitName.valueOf(args[2]).newInstance(player));
            }
            else if (args[0].equalsIgnoreCase("remove")) {

            }
            else if (args[0].equalsIgnoreCase("list")) {

            }
        }
        return false;
    }

}
