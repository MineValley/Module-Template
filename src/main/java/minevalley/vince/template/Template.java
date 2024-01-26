package minevalley.vince.template;

import minevalley.core.api.Core;
import minevalley.core.api.CoreModule;
import minevalley.core.api.CoreServer;
import minevalley.core.api.Description;
import minevalley.vince.template.module.commands.ExampleCommand;
import minevalley.vince.template.module.listeners.LoggingListeners;
import minevalley.vince.template.module.listeners.UserRefreshListener;

@Description(
        name = "Template",
        authors = "vince",
        version = "1.0"
)
@SuppressWarnings("unused")
public final class Template extends CoreModule {

    public Template(CoreServer server) {
        super(server);
    }

    // TODO: Rename package (author and module name)
    // TODO: Rename main-class
    // TODO: Rename module and project
    // TODO: Edit Description-annotation of main class
    // TODO: Update Core-API in pom.xml to newest version (https://github.com/MineValley/Core-API/packages/)
    // TODO: Rename Group-, ArtifactID and project name in pom.xml
    // TODO: Add artifact (Click on the module and press F4)

    @Override
    public void onEnable() {
        // Module startup logic

        new ExampleCommand(); // Commands are registered by creating a new instance of the commands class

        Core.registerListener(new UserRefreshListener()); // Listener-registrations
        LoggingListeners.initListeners();
    }

    @Override
    public void onDisable() {
        // Module shutdown logic
    }
}
