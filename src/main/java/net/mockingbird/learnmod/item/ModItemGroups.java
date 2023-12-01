package net.mockingbird.learnmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mockingbird.learnmod.LearnMod;

public class ModItemGroups {
    public static final ItemGroup NUCLEAR_POWER = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LearnMod.MOD_ID, "nuclear-power"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nuclear-power"))
                    .icon(() -> new ItemStack(ModItems.URANIUM_238)).entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM_238);
                        entries.add(ModItems.URANIUM_235);
                    }).build());
    public static void registerItemGroups() {
        LearnMod.LOGGER.info("Registering Item Groups for " + LearnMod.MOD_ID);
    }
}
