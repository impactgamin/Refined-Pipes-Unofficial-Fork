package com.refinedmods.refinedpipes;

import com.refinedmods.refinedpipes.block.EnergyPipeBlock;
import com.refinedmods.refinedpipes.block.FluidPipeBlock;
import com.refinedmods.refinedpipes.block.ItemPipeBlock;
import com.refinedmods.refinedpipes.network.pipe.energy.EnergyPipeType;
import com.refinedmods.refinedpipes.network.pipe.fluid.FluidPipeType;
import com.refinedmods.refinedpipes.network.pipe.item.ItemPipeType;
import com.refinedmods.refinedpipes.network.pipe.shape.PipeShapeCache;
import com.refinedmods.refinedpipes.network.pipe.shape.PipeShapeFactory;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class RefinedPipesBlocks {
    public static final PipeShapeCache PIPE_SHAPE_CACHE = new PipeShapeCache(new PipeShapeFactory());

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RefinedPipes.ID);

    public static final RegistryObject<ItemPipeBlock> BASIC_ITEM_PIPE = BLOCKS.register("basic_item_pipe", () -> new ItemPipeBlock(PIPE_SHAPE_CACHE, ItemPipeType.BASIC));
    public static final RegistryObject<ItemPipeBlock> IMPROVED_ITEM_PIPE = BLOCKS.register("improved_item_pipe", () -> new ItemPipeBlock(PIPE_SHAPE_CACHE, ItemPipeType.IMPROVED));
    public static final RegistryObject<ItemPipeBlock> ADVANCED_ITEM_PIPE = BLOCKS.register("advanced_item_pipe", () -> new ItemPipeBlock(PIPE_SHAPE_CACHE, ItemPipeType.ADVANCED));

    public static final RegistryObject<FluidPipeBlock> BASIC_FLUID_PIPE = BLOCKS.register("basic_fluid_pipe", () -> new FluidPipeBlock(PIPE_SHAPE_CACHE, FluidPipeType.BASIC));
    public static final RegistryObject<FluidPipeBlock> IMPROVED_FLUID_PIPE = BLOCKS.register("improved_fluid_pipe", () -> new FluidPipeBlock(PIPE_SHAPE_CACHE, FluidPipeType.IMPROVED));
    public static final RegistryObject<FluidPipeBlock> ADVANCED_FLUID_PIPE = BLOCKS.register("advanced_fluid_pipe", () -> new FluidPipeBlock(PIPE_SHAPE_CACHE, FluidPipeType.ADVANCED));
    public static final RegistryObject<FluidPipeBlock> ELITE_FLUID_PIPE = BLOCKS.register("elite_fluid_pipe", () -> new FluidPipeBlock(PIPE_SHAPE_CACHE, FluidPipeType.ELITE));
    public static final RegistryObject<FluidPipeBlock> ULTIMATE_FLUID_PIPE = BLOCKS.register("ultimate_fluid_pipe", () -> new FluidPipeBlock(PIPE_SHAPE_CACHE, FluidPipeType.ULTIMATE));

    public static final RegistryObject<EnergyPipeBlock> BASIC_ENERGY_PIPE = BLOCKS.register("basic_energy_pipe", () -> new EnergyPipeBlock(PIPE_SHAPE_CACHE, EnergyPipeType.BASIC));
    public static final RegistryObject<EnergyPipeBlock> IMPROVED_ENERGY_PIPE = BLOCKS.register("improved_energy_pipe", () -> new EnergyPipeBlock(PIPE_SHAPE_CACHE, EnergyPipeType.IMPROVED));
    public static final RegistryObject<EnergyPipeBlock> ADVANCED_ENERGY_PIPE = BLOCKS.register("advanced_energy_pipe", () -> new EnergyPipeBlock(PIPE_SHAPE_CACHE, EnergyPipeType.ADVANCED));
    public static final RegistryObject<EnergyPipeBlock> ELITE_ENERGY_PIPE = BLOCKS.register("elite_energy_pipe", () -> new EnergyPipeBlock(PIPE_SHAPE_CACHE, EnergyPipeType.ELITE));
    public static final RegistryObject<EnergyPipeBlock> ULTIMATE_ENERGY_PIPE = BLOCKS.register("ultimate_energy_pipe", () -> new EnergyPipeBlock(PIPE_SHAPE_CACHE, EnergyPipeType.ULTIMATE));

    private RefinedPipesBlocks() {
    }
}
