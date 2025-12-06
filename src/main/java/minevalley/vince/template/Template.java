package minevalley.vince.template;

import minevalley.core.api.Core;
import minevalley.core.api.CoreModule;
import minevalley.core.api.Module;
import minevalley.vince.template.module.commands.ExampleCommand;
import minevalley.vince.template.module.listeners.LoggingListeners;
import minevalley.vince.template.module.listeners.UserEnterTeamServiceListener;

@SuppressWarnings("unused")
@Module(name = "Template")
public final class Template extends CoreModule {

    // TODO: Rename package (author and module name)
    // TODO: Rename main-class
    // TODO: Rename module and project
    // TODO: Edit @Module in main class
    // TODO: Edit module name, description, version, groupId, artifactId, developers, etc. in pom.xml
    // TODO: Add dependencies and update api versions (e.g. CoreAPI: https://github.com/MineValley/Core-API/packages/)

    @Override
    public void onEnable() {

        // Module startup logic
        ExampleCommand.initCommand();

        Core.registerListener(new UserEnterTeamServiceListener());
        LoggingListeners.initListeners();
        // ...
    }

    @Override
    public void onDisable() {
        // Module shutdown logic
    }
}
