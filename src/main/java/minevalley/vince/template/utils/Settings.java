package minevalley.vince.template.utils;

import eu.minevalley.core.api.Core;
import eu.minevalley.core.api.database.Value;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Settings {
    EXAMPLE_SETTING1(Core.databaseEntry("settings", new Value("name", "template_setting1"))
            .getString("value")),
    EXAMPLE_SETTING2(Core.databaseEntry("settings", new Value("name", "template_setting2"))
            .getString("value")),
    EXAMPLE_SETTING3(Core.databaseEntry("settings", new Value("name", "template_setting3"))
            .getString("value"));

    private final String value;
}
