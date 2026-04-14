package com.refinedmods.refinedpipes.setup;

import com.refinedmods.refinedpipes.RefinedPipes;
import com.refinedmods.refinedpipes.network.NetworkManager;
import com.refinedmods.refinedpipes.network.NetworkRegistry;
import com.refinedmods.refinedpipes.network.energy.EnergyNetworkFactory;
import com.refinedmods.refinedpipes.network.fluid.FluidNetworkFactory;
import com.refinedmods.refinedpipes.network.item.ItemNetwork;
import com.refinedmods.refinedpipes.network.item.ItemNetworkFactory;
import com.refinedmods.refinedpipes.network.pipe.PipeRegistry;
import com.refinedmods.refinedpipes.network.pipe.attachment.AttachmentRegistry;
import com.refinedmods.refinedpipes.network.pipe.attachment.extractor.ExtractorAttachmentFactory;
import com.refinedmods.refinedpipes.network.pipe.attachment.extractor.ExtractorAttachmentType;
import com.refinedmods.refinedpipes.network.pipe.energy.EnergyPipe;
import com.refinedmods.refinedpipes.network.pipe.energy.EnergyPipeFactory;
import com.refinedmods.refinedpipes.network.pipe.energy.EnergyPipeType;
import com.refinedmods.refinedpipes.network.pipe.fluid.FluidPipe;
import com.refinedmods.refinedpipes.network.pipe.fluid.FluidPipeFactory;
import com.refinedmods.refinedpipes.network.pipe.fluid.FluidPipeType;
import com.refinedmods.refinedpipes.network.pipe.item.ItemPipe;
import com.refinedmods.refinedpipes.network.pipe.item.ItemPipeFactory;
import com.refinedmods.refinedpipes.network.pipe.transport.callback.ItemBounceBackTransportCallback;
import com.refinedmods.refinedpipes.network.pipe.transport.callback.ItemInsertTransportCallback;
import com.refinedmods.refinedpipes.network.pipe.transport.callback.ItemPipeGoneTransportCallback;
import com.refinedmods.refinedpipes.network.pipe.transport.callback.TransportCallbackFactoryRegistry;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;

public final class CommonSetup {
    private CommonSetup() {
    }

    @SubscribeEvent
    public static void onConstructMod(FMLConstructModEvent e) {
        NetworkRegistry.INSTANCE.addFactory(ItemNetwork.TYPE, new ItemNetworkFactory());

        for (FluidPipeType pipeType : FluidPipeType.values()) {
            NetworkRegistry.INSTANCE.addFactory(pipeType.getNetworkType(), new FluidNetworkFactory(pipeType));
        }

        for (EnergyPipeType pipeType : EnergyPipeType.values()) {
            NetworkRegistry.INSTANCE.addFactory(pipeType.getNetworkType(), new EnergyNetworkFactory(pipeType));
        }

        PipeRegistry.INSTANCE.addFactory(ItemPipe.ID, new ItemPipeFactory());
        PipeRegistry.INSTANCE.addFactory(FluidPipe.ID, new FluidPipeFactory());
        PipeRegistry.INSTANCE.addFactory(EnergyPipe.ID, new EnergyPipeFactory());

        AttachmentRegistry.INSTANCE.addFactory(ExtractorAttachmentType.BASIC.getId(), new ExtractorAttachmentFactory(ExtractorAttachmentType.BASIC));
        AttachmentRegistry.INSTANCE.addFactory(ExtractorAttachmentType.IMPROVED.getId(), new ExtractorAttachmentFactory(ExtractorAttachmentType.IMPROVED));
        AttachmentRegistry.INSTANCE.addFactory(ExtractorAttachmentType.ADVANCED.getId(), new ExtractorAttachmentFactory(ExtractorAttachmentType.ADVANCED));
        AttachmentRegistry.INSTANCE.addFactory(ExtractorAttachmentType.ELITE.getId(), new ExtractorAttachmentFactory(ExtractorAttachmentType.ELITE));
        AttachmentRegistry.INSTANCE.addFactory(ExtractorAttachmentType.ULTIMATE.getId(), new ExtractorAttachmentFactory(ExtractorAttachmentType.ULTIMATE));

        TransportCallbackFactoryRegistry.INSTANCE.addFactory(ItemInsertTransportCallback.ID, ItemInsertTransportCallback::of);
        TransportCallbackFactoryRegistry.INSTANCE.addFactory(ItemBounceBackTransportCallback.ID, ItemBounceBackTransportCallback::of);
        TransportCallbackFactoryRegistry.INSTANCE.addFactory(ItemPipeGoneTransportCallback.ID, ItemPipeGoneTransportCallback::of);
    }

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent e) {
        RefinedPipes.NETWORK.register();
    }

    @SubscribeEvent
    public static void onLevelTick(TickEvent.LevelTickEvent e) {
        if (!e.level.isClientSide && e.phase == TickEvent.Phase.END) {
            NetworkManager manager = NetworkManager.get(e.level);
            for (var network : manager.getNetworks()) {
                network.update(e.level);
            }
        }
    }
}
