package com.refinedmods.refinedpipes;

import com.refinedmods.refinedpipes.item.AttachmentItem;
import com.refinedmods.refinedpipes.item.EnergyPipeBlockItem;
import com.refinedmods.refinedpipes.item.FluidPipeBlockItem;
import com.refinedmods.refinedpipes.item.ItemPipeBlockItem;
import com.refinedmods.refinedpipes.network.pipe.attachment.extractor.ExtractorAttachmentFactory;
import com.refinedmods.refinedpipes.network.pipe.attachment.extractor.ExtractorAttachmentType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class RefinedPipesItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RefinedPipes.ID);

    public static final RegistryObject<ItemPipeBlockItem> BASIC_ITEM_PIPE = ITEMS.register("basic_item_pipe", () -> new ItemPipeBlockItem(RefinedPipesBlocks.BASIC_ITEM_PIPE.get()));
    public static final RegistryObject<ItemPipeBlockItem> IMPROVED_ITEM_PIPE = ITEMS.register("improved_item_pipe", () -> new ItemPipeBlockItem(RefinedPipesBlocks.IMPROVED_ITEM_PIPE.get()));
    public static final RegistryObject<ItemPipeBlockItem> ADVANCED_ITEM_PIPE = ITEMS.register("advanced_item_pipe", () -> new ItemPipeBlockItem(RefinedPipesBlocks.ADVANCED_ITEM_PIPE.get()));

    public static final RegistryObject<FluidPipeBlockItem> BASIC_FLUID_PIPE = ITEMS.register("basic_fluid_pipe", () -> new FluidPipeBlockItem(RefinedPipesBlocks.BASIC_FLUID_PIPE.get()));
    public static final RegistryObject<FluidPipeBlockItem> IMPROVED_FLUID_PIPE = ITEMS.register("improved_fluid_pipe", () -> new FluidPipeBlockItem(RefinedPipesBlocks.IMPROVED_FLUID_PIPE.get()));
    public static final RegistryObject<FluidPipeBlockItem> ADVANCED_FLUID_PIPE = ITEMS.register("advanced_fluid_pipe", () -> new FluidPipeBlockItem(RefinedPipesBlocks.ADVANCED_FLUID_PIPE.get()));
    public static final RegistryObject<FluidPipeBlockItem> ELITE_FLUID_PIPE = ITEMS.register("elite_fluid_pipe", () -> new FluidPipeBlockItem(RefinedPipesBlocks.ELITE_FLUID_PIPE.get()));
    public static final RegistryObject<FluidPipeBlockItem> ULTIMATE_FLUID_PIPE = ITEMS.register("ultimate_fluid_pipe", () -> new FluidPipeBlockItem(RefinedPipesBlocks.ULTIMATE_FLUID_PIPE.get()));

    public static final RegistryObject<EnergyPipeBlockItem> BASIC_ENERGY_PIPE = ITEMS.register("basic_energy_pipe", () -> new EnergyPipeBlockItem(RefinedPipesBlocks.BASIC_ENERGY_PIPE.get()));
    public static final RegistryObject<EnergyPipeBlockItem> IMPROVED_ENERGY_PIPE = ITEMS.register("improved_energy_pipe", () -> new EnergyPipeBlockItem(RefinedPipesBlocks.IMPROVED_ENERGY_PIPE.get()));
    public static final RegistryObject<EnergyPipeBlockItem> ADVANCED_ENERGY_PIPE = ITEMS.register("advanced_energy_pipe", () -> new EnergyPipeBlockItem(RefinedPipesBlocks.ADVANCED_ENERGY_PIPE.get()));
    public static final RegistryObject<EnergyPipeBlockItem> ELITE_ENERGY_PIPE = ITEMS.register("elite_energy_pipe", () -> new EnergyPipeBlockItem(RefinedPipesBlocks.ELITE_ENERGY_PIPE.get()));
    public static final RegistryObject<EnergyPipeBlockItem> ULTIMATE_ENERGY_PIPE = ITEMS.register("ultimate_energy_pipe", () -> new EnergyPipeBlockItem(RefinedPipesBlocks.ULTIMATE_ENERGY_PIPE.get()));

    public static final RegistryObject<AttachmentItem> BASIC_EXTRACTOR_ATTACHMENT = ITEMS.register("basic_extractor_attachment", () -> new AttachmentItem(new ExtractorAttachmentFactory(ExtractorAttachmentType.BASIC)));
    public static final RegistryObject<AttachmentItem> IMPROVED_EXTRACTOR_ATTACHMENT = ITEMS.register("improved_extractor_attachment", () -> new AttachmentItem(new ExtractorAttachmentFactory(ExtractorAttachmentType.IMPROVED)));
    public static final RegistryObject<AttachmentItem> ADVANCED_EXTRACTOR_ATTACHMENT = ITEMS.register("advanced_extractor_attachment", () -> new AttachmentItem(new ExtractorAttachmentFactory(ExtractorAttachmentType.ADVANCED)));
    public static final RegistryObject<AttachmentItem> ELITE_EXTRACTOR_ATTACHMENT = ITEMS.register("elite_extractor_attachment", () -> new AttachmentItem(new ExtractorAttachmentFactory(ExtractorAttachmentType.ELITE)));
    public static final RegistryObject<AttachmentItem> ULTIMATE_EXTRACTOR_ATTACHMENT = ITEMS.register("ultimate_extractor_attachment", () -> new AttachmentItem(new ExtractorAttachmentFactory(ExtractorAttachmentType.ULTIMATE)));

    private RefinedPipesItems() {
    }
}
