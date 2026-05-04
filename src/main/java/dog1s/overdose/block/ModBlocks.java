package dog1s.overdose.block;

import dog1s.overdose.Overdose;
import dog1s.overdose.block.custom.CocaCropBlock;
import dog1s.overdose.block.custom.WeedCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SALT_BLOCK = registerBlock("salt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND)));

    public static final Block WEED_CROP = Registry.register(Registries.BLOCK, new Identifier(Overdose.MOD_ID, "weed_crop"),
            new WeedCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block COCA_CROP = Registry.register(Registries.BLOCK, new Identifier(Overdose.MOD_ID, "coca_crop"),
            new CocaCropBlock(FabricBlockSettings.copyOf(Blocks.BEETROOTS)));

    public static final Block POPPY_CROP = Registry.register(Registries.BLOCK, new Identifier(Overdose.MOD_ID, "poppy_crop"),
            new CocaCropBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));


    public static void registerModBlock(){
        Overdose.LOGGER.info("Registering ModBlocks for " + Overdose.MOD_ID);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Overdose.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Overdose.MOD_ID, name), block);
    }
}
