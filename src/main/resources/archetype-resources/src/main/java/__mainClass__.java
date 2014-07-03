package ${package};

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ${mainClass} extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);

	}
	
	@Override
	public void onDisable() {
		
	}
	
}
