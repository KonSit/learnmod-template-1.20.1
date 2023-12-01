package net.mockingbird.learnmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mockingbird.learnmod.LearnMod;

public class ModItems {
    public static final Item URANIUM_238 = registerItem("uranium-238", new Item(new FabricItemSettings()));
    public static final Item URANIUM_235 = registerItem("uranium-235", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(URANIUM_238);
        entries.add(URANIUM_235);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LearnMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LearnMod.LOGGER.info("Registering MOd Items for" + LearnMod.MOD_ID);
    }
}
