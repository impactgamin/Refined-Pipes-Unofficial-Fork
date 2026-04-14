package com.refinedmods.refinedpipes;

import com.refinedmods.refinedpipes.container.ExtractorAttachmentContainerMenu;
import com.refinedmods.refinedpipes.container.factory.ExtractorAttachmentContainerFactory;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class RefinedPipesContainerMenus {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RefinedPipes.ID);

    public static final RegistryObject<MenuType<ExtractorAttachmentContainerMenu>> EXTRACTOR_ATTACHMENT = MENU_TYPES.register("extractor_attachment", () -> IForgeMenuType.create(new ExtractorAttachmentContainerFactory()));

    private RefinedPipesContainerMenus() {
    }
}
