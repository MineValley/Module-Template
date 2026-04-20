package eu.minevalley.template.module.listener;

import eu.minevalley.proxima.api.Proxima;
import eu.minevalley.proxima.api.event.EventListener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public final class LoggingListeners {

    public static void initListeners() {
        Proxima.registerListener(PlayerJoinEvent.class, (EventListener<PlayerJoinEvent>) event -> {
            // Logic here
        });

        Proxima.registerListener(PlayerQuitEvent.class, (EventListener<PlayerQuitEvent>) event -> {
            // Logic here
        });
    }
}