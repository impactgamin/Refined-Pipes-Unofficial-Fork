package com.refinedmods.refinedpipes;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class RefinedPipesCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RefinedPipes.ID);

    public static final RegistryObject<CreativeModeTab> MAIN = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
        .icon(() -> new ItemStack(RefinedPipesItems.BASIC_ITEM_PIPE.get()))
        .title(Component.translatable("itemGroup.refinedpipes"))
        .displayItems((params, output) -> {
            output.accept(RefinedPipesItems.BASIC_ITEM_PIPE.get());
            output.accept(RefinedPipesItems.IMPROVED_ITEM_PIPE.get());
            output.accept(RefinedPipesItems.ADVANCED_ITEM_PIPE.get());
            output.accept(RefinedPipesItems.BASIC_FLUID_PIPE.get());
            output.accept(RefinedPipesItems.IMPROVED_FLUID_PIPE.get());
            output.accept(RefinedPipesItems.ADVANCED_FLUID_PIPE.get());
            output.accept(RefinedPipesItems.ELITE_FLUID_PIPE.get());
            output.accept(RefinedPipesItems.ULTIMATE_FLUID_PIPE.get());
            output.accept(RefinedPipesItems.BASIC_ENERGY_PIPE.get());
            output.accept(RefinedPipesItems.IMPROVED_ENERGY_PIPE.get());
            output.accept(RefinedPipesItems.ADVANCED_ENERGY_PIPE.get());
            output.accept(RefinedPipesItems.ELITE_ENERGY_PIPE.get());
            output.accept(RefinedPipesItems.ULTIMATE_ENERGY_PIPE.get());
            output.accept(RefinedPipesItems.BASIC_EXTRACTOR_ATTACHMENT.get());
            output.accept(RefinedPipesItems.IMPROVED_EXTRACTOR_ATTACHMENT.get());
            output.accept(RefinedPipesItems.ADVANCED_EXTRACTOR_ATTACHMENT.get());
            output.accept(RefinedPipesItems.ELITE_EXTRACTOR_ATTACHMENT.get());
            output.accept(RefinedPipesItems.ULTIMATE_EXTRACTOR_ATTACHMENT.get());
        })
        .build());

    private RefinedPipesCreativeTabs() {
    }
}
