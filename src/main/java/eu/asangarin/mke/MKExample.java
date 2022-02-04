package eu.asangarin.mke;

import eu.asangarin.mythickeys.api.MythicKeyPressEvent;
import eu.asangarin.mythickeys.api.MythicKeyReleaseEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class MKExample extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	private void onMythicPress(MythicKeyPressEvent event) {
		Bukkit.broadcastMessage("MythicKey pressed ! Id=" + event.getId());
	}

	@EventHandler
	private void onMythicRelease(MythicKeyReleaseEvent event) {
		Bukkit.broadcastMessage("MythicKey released ! Id=" + event.getId());
	}
}
