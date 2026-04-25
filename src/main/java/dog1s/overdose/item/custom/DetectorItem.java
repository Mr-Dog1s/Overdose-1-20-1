package dog1s.overdose.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class DetectorItem extends Item {
    public DetectorItem(Item.Settings settings){
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if(!context.getWorld().isClient()){
            BlockPos posClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();

            boolean foundBlock = false;

            for (int i = 0; i <= posClicked.getY() + 64; i++){
                BlockState state = context.getWorld().getBlockState(posClicked.down(i));

                if(isValuableBlock(state)){
                    outputValuableCoords(posClicked.down(i), player, state.getBlock());
                    foundBlock = true;
                    
                    break;
                }
            }

            if(!foundBlock){
                player.sendMessage(Text.translatable("detector_failure"));
            }

        }

        context.getStack().damage(1, context.getPlayer(), playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void outputValuableCoords(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.translatable(
                "detector_success" + block.asItem().getName().getString() + "detector_success2"
                        + blockPos.getX() + "," + blockPos.getY() + "," + blockPos.getZ()), false);
    }

    private boolean isValuableBlock(BlockState state) {

        return state.isOf(Blocks.IRON_BLOCK) || state.isOf(Blocks.DIAMOND_ORE);
    }
}
