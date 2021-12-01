package minevalley.vince.template;

import minevalley.core.api.Core;
import minevalley.core.api.CoreModule;
import minevalley.core.api.CoreServer;
import minevalley.vince.template.module.commands.ExampleCommand;
import minevalley.vince.template.module.listeners.PlayerJoinListener;
import minevalley.vince.template.module.listeners.UserRefreshListener;

@CoreModule.Description(
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
