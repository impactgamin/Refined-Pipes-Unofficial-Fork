package com.refinedmods.refinedpipes;

import com.refinedmods.refinedpipes.blockentity.EnergyPipeBlockEntity;
import com.refinedmods.refinedpipes.blockentity.FluidPipeBlockEntity;
import com.refinedmods.refinedpipes.blockentity.ItemPipeBlockEntity;
import com.refinedmods.refinedpipes.network.pipe.energy.EnergyPipeType;
import com.refinedmods.refinedpipes.network.pipe.fluid.FluidPipeType;
import com.refinedmods.refinedpipes.network.pipe.item.ItemPipeType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class RefinedPipesBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RefinedPipes.ID);

    public static final RegistryObject<BlockEntityType<ItemPipeBlockEntity>> BASIC_ITEM_PIPE = BLOCK_ENTITY_TYPES.register("basic_item_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new ItemPipeBlockEntity(pos, state, ItemPipeType.BASIC), RefinedPipesBlocks.BASIC_ITEM_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<ItemPipeBlockEntity>> IMPROVED_ITEM_PIPE = BLOCK_ENTITY_TYPES.register("improved_item_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new ItemPipeBlockEntity(pos, state, ItemPipeType.IMPROVED), RefinedPipesBlocks.IMPROVED_ITEM_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<ItemPipeBlockEntity>> ADVANCED_ITEM_PIPE = BLOCK_ENTITY_TYPES.register("advanced_item_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new ItemPipeBlockEntity(pos, state, ItemPipeType.ADVANCED), RefinedPipesBlocks.ADVANCED_ITEM_PIPE.get()).build(null));

    public static final RegistryObject<BlockEntityType<FluidPipeBlockEntity>> BASIC_FLUID_PIPE = BLOCK_ENTITY_TYPES.register("basic_fluid_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new FluidPipeBlockEntity(pos, state, FluidPipeType.BASIC), RefinedPipesBlocks.BASIC_FLUID_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<FluidPipeBlockEntity>> IMPROVED_FLUID_PIPE = BLOCK_ENTITY_TYPES.register("improved_fluid_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new FluidPipeBlockEntity(pos, state, FluidPipeType.IMPROVED), RefinedPipesBlocks.IMPROVED_FLUID_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<FluidPipeBlockEntity>> ADVANCED_FLUID_PIPE = BLOCK_ENTITY_TYPES.register("advanced_fluid_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new FluidPipeBlockEntity(pos, state, FluidPipeType.ADVANCED), RefinedPipesBlocks.ADVANCED_FLUID_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<FluidPipeBlockEntity>> ELITE_FLUID_PIPE = BLOCK_ENTITY_TYPES.register("elite_fluid_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new FluidPipeBlockEntity(pos, state, FluidPipeType.ELITE), RefinedPipesBlocks.ELITE_FLUID_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<FluidPipeBlockEntity>> ULTIMATE_FLUID_PIPE = BLOCK_ENTITY_TYPES.register("ultimate_fluid_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new FluidPipeBlockEntity(pos, state, FluidPipeType.ULTIMATE), RefinedPipesBlocks.ULTIMATE_FLUID_PIPE.get()).build(null));

    public static final RegistryObject<BlockEntityType<EnergyPipeBlockEntity>> BASIC_ENERGY_PIPE = BLOCK_ENTITY_TYPES.register("basic_energy_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new EnergyPipeBlockEntity(pos, state, EnergyPipeType.BASIC), RefinedPipesBlocks.BASIC_ENERGY_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<EnergyPipeBlockEntity>> IMPROVED_ENERGY_PIPE = BLOCK_ENTITY_TYPES.register("improved_energy_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new EnergyPipeBlockEntity(pos, state, EnergyPipeType.IMPROVED), RefinedPipesBlocks.IMPROVED_ENERGY_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<EnergyPipeBlockEntity>> ADVANCED_ENERGY_PIPE = BLOCK_ENTITY_TYPES.register("advanced_energy_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new EnergyPipeBlockEntity(pos, state, EnergyPipeType.ADVANCED), RefinedPipesBlocks.ADVANCED_ENERGY_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<EnergyPipeBlockEntity>> ELITE_ENERGY_PIPE = BLOCK_ENTITY_TYPES.register("elite_energy_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new EnergyPipeBlockEntity(pos, state, EnergyPipeType.ELITE), RefinedPipesBlocks.ELITE_ENERGY_PIPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<EnergyPipeBlockEntity>> ULTIMATE_ENERGY_PIPE = BLOCK_ENTITY_TYPES.register("ultimate_energy_pipe", () -> BlockEntityType.Builder.of((pos, state) -> new EnergyPipeBlockEntity(pos, state, EnergyPipeType.ULTIMATE), RefinedPipesBlocks.ULTIMATE_ENERGY_PIPE.get()).build(null));

    private RefinedPipesBlockEntities() {
    }
}
