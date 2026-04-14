/*
 * Fork / port of Refined Pipes (https://github.com/refinedmods/refinedpipes) by Refined Mods — MIT License.
 * See LICENSE.md and META-INF/mods.toml for attribution and upstream copyright.
 */
package com.refinedmods.refinedpipes;

import com.refinedmods.refinedpipes.config.ServerConfig;
import com.refinedmods.refinedpipes.setup.ClientSetup;
import com.refinedmods.refinedpipes.setup.CommonSetup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RefinedPipes.ID)
public class RefinedPipes {
    public static final String ID = "refinedpipes";
    public static final RefinedPipesNetwork NETWORK = new RefinedPipesNetwork();
    public static final ServerConfig SERVER_CONFIG = new ServerConfig();

    public RefinedPipes() {
        var modBus = FMLJavaModLoadingContext.get().getModEventBus();

        RefinedPipesBlocks.BLOCKS.register(modBus);
        RefinedPipesItems.ITEMS.register(modBus);
        RefinedPipesBlockEntities.BLOCK_ENTITY_TYPES.register(modBus);
        RefinedPipesContainerMenus.MENU_TYPES.register(modBus);
        RefinedPipesCreativeTabs.CREATIVE_MODE_TABS.register(modBus);

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modBus.register(ClientSetup.class));

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG.getSpec());

        modBus.addListener(CommonSetup::onConstructMod);
        modBus.addListener(CommonSetup::onCommonSetup);

        MinecraftForge.EVENT_BUS.addListener(CommonSetup::onLevelTick);
    }
}
