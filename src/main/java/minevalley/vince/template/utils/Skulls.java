package minevalley.vince.template.utils;

import eu.minevalley.core.api.Core;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

@AllArgsConstructor
@Getter
public enum Skulls {

    EXAMPLE_SKULL_1(Core.createItem("SKULL-URL1").build()),
    EXAMPLE_SKULL_2(Core.createItem("SKULL-URL2").setDisplayName("NAME").build()),
    EXAMPLE_SKULL_3(Core.createItem("SKULL-URL3").setDisplayName("NAME").setLore("LORE1", "LORE2").build());

    private final ItemStack value;
}
