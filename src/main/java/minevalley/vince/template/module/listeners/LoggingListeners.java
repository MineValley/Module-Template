package minevalley.vince.template.module.listeners;

import minevalley.core.api.Core;
import minevalley.core.api.utils.EventListener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public final class LoggingListeners {

    public static void initListeners() {
        Core.registerListener(PlayerJoinEvent.class, (EventListener<PlayerJoinEvent>) event -> {
            // Logic here
        });

        Core.registerListener(PlayerQuitEvent.class, (EventListener<PlayerQuitEvent>) event -> {
            // Logic here
        });
    }
}