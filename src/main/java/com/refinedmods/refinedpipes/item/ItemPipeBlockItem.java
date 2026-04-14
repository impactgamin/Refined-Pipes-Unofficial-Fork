package com.refinedmods.refinedpipes.item;

import com.refinedmods.refinedpipes.block.ItemPipeBlock;
import com.refinedmods.refinedpipes.network.pipe.item.ItemPipeType;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ItemPipeBlockItem extends BaseBlockItem {
    private final ItemPipeType type;

    public ItemPipeBlockItem(ItemPipeBlock block) {
        super(block);

        this.type = block.getType();
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        tooltip.add(Component.translatable("misc.refinedpipes.tier", Component.translatable("enchantment.level." + type.getTier())).withStyle(ChatFormatting.YELLOW));

        tooltip.add(Component.translatable(
            "tooltip.refinedpipes.item_pipe.speed",
            Component.literal(type.getSpeedComparedToBasicTier() + "%").withStyle(ChatFormatting.WHITE)
        ).withStyle(ChatFormatting.GRAY));
    }
}
