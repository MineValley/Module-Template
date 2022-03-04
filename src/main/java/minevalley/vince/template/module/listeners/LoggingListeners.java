package minevalley.vince.template.module.listeners;

import minevalley.core.api.Core;
import minevalley.core.api.utils.EventListener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public final class LoggingListeners {

    public static void initListeners() {
        Core.registerEvent(PlayerJoinEvent.class, (EventListener<PlayerJoinEvent>) event -> {
            // Logic here
        });

        Core.registerEvent(PlayerQuitEvent.class, (EventListener<PlayerQuitEvent>) event -> {
            // Logic here
        });
    }
}