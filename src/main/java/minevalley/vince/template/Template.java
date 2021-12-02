package minevalley.vince.template;

import minevalley.core.api.Core;
import minevalley.core.api.CoreModule;
import minevalley.core.api.CoreServer;
import minevalley.core.api.Description;
import minevalley.vince.template.module.commands.ExampleCommand;
import minevalley.vince.template.module.listeners.PlayerJoinListener;
import minevalley.vince.template.module.listeners.UserRefreshListener;

@Description(
        name = "Template",
        authors = "vince",
        version = "1.0"
)
public final class Template extends CoreModule {

    public Template(CoreServer server) {
        super(server);
    }

    // TODO: Rename package
    // TODO: Rename main-class
    // TODO: Edit Description-annotation
    // TODO: Update Core-API in pom.xml to newest version
    // TODO: Add artifact (Click on the module and press F4)

    @Override
    public void onEnable() {
        // Module startup logic

        new ExampleCommand(); // Commands are registered by creating an new instance of the commands class

        Core.registerListeners(new PlayerJoinListener()); // Listener-registrations
        Core.registerListeners(new UserRefreshListener());
    }

    @Override
    public void onDisable() {
        // Module shutdown logic
    }
}
