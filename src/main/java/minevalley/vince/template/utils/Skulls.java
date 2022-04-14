package minevalley.vince.template.utils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import minevalley.core.api.Core;
import org.bukkit.inventory.ItemStack;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Skulls {

    /**
     * Use classes/enums like this to cache often-used itemstacks or so, to reduce lacks of performance
     * <b>Note:</b> Using enums for skull classes is recommended but not required.
     * A usual class with static final object may do their job just as an enum does. Both is accepted as good style.
     */

    EXAMPLE_SKULL_1(Core.createItem("SKULL-URL1").build()),
    EXAMPLE_SKULL_2(Core.createItem("SKULL-URL2").setDisplayName("NAME").build()),
    EXAMPLE_SKULL_3(Core.createItem("SKULL-URL3").setDisplayName("NAME").setLore("LORE1", "LORE2").build());

    private final ItemStack value;
}
