package net.mockingbird.learnmod.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.mockingbird.learnmod.util.ModTags;

public class ODScannerItem extends Item {

    public ODScannerItem(Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            BlockPos clickedPosition = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            int cnt = 0;
            for (int x = -6; x <= 6; x++) {
                for (int y = 0; y <= 12; y++) {
                    for (int z = -6; z <= 6; z++) {
                        BlockState state = context.getWorld().getBlockState(clickedPosition.east(x).down(y).south(z));
                        if (valuebleBlockCount(state)) {
                            cnt++;
                        }
                    }
                }
            }

            player.sendMessage(Text.literal("Found " + cnt + " Uranium Ore"));
        }
        return ActionResult.SUCCESS;
    }

    private boolean valuebleBlockCount(BlockState state) {
        return state.isIn(ModTags.Blocks.OD_SCANNER_COUNT_ORE);
    }
}
