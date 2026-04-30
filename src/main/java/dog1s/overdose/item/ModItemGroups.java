package dog1s.overdose.item;

import dog1s.overdose.Overdose;
import dog1s.overdose.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CHEMICALS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Overdose.MOD_ID, "salt"),
            FabricItemGroup.builder().displayName(Text.translatable("overdose.itemGroup.chemicals"))
                    .icon(() -> new ItemStack(ModItems.SALT)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.SALT);
                        entries.add(ModBlocks.SALT_BLOCK);
                        entries.add(ModItems.PEPPER);
                        entries.add(ModItems.DETECTOR);
                        entries.add(ModItems.WHITE_MONSTER);
                        entries.add(ModItems.WEED_SEEDS);
                    })).build());

    public static void registerItemGroups(){
        Overdose.LOGGER.info("Registering Item Groups");
    }

}
