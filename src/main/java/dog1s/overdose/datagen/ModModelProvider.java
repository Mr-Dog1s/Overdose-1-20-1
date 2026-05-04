package dog1s.overdose.datagen;

import dog1s.overdose.block.ModBlocks;
import dog1s.overdose.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEED_CROP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COCA_CROP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POPPY_CROP);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_MONSTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.COCA_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCA_PASTE, Models.GENERATED);

        itemModelGenerator.register(ModItems.POPPY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.POPPY_HEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.POPPY_JUICE, Models.GENERATED);

        itemModelGenerator.register(ModItems.WEED_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.WEED_BUD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRY_WEED_BUD, Models.GENERATED);

    }
}
