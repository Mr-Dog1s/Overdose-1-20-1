package dog1s.overdose.item;

import dog1s.overdose.Overdose;
import dog1s.overdose.block.ModBlocks;
import dog1s.overdose.block.custom.ModConsumableComponents;
import dog1s.overdose.item.custom.DetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Crafting Items

    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));


    public static final Item WHITE_MONSTER = registerItem("white_monster", new Item(new FabricItemSettings().food(ModConsumableComponents.WHITE_MONSTER)));

    public static final Item PEPPER = registerItem("pepper", new Item(new FabricItemSettings()));

    public static final Item POPPY_HEAD = registerItem("poppy_head", new Item(new FabricItemSettings()));

    public static final Item POPPY_JUICE = registerItem("poppy_juice", new Item(new FabricItemSettings()));


    public static final Item WEED_BUD = registerItem("weed_bud", new Item((new FabricItemSettings())));

    public static final Item DRY_WEED_BUD = registerItem("dry_weed_bud", new Item(new FabricItemSettings()));


    public static final Item COCA_LEAF = registerItem("coca_leaf", new Item(new FabricItemSettings()));

    public static final Item COCA_PASTE = registerItem("coca_paste", new Item(new FabricItemSettings()));

    //Special Items

    public static final Item DETECTOR = registerItem("detector", new DetectorItem(new FabricItemSettings().maxDamage(5)));

    //Seeds

    public static final Item WEED_SEEDS = registerItem("weed_seeds", new AliasedBlockItem(ModBlocks.WEED_CROP, new FabricItemSettings()));

    public static final Item COCA_SEEDS = registerItem("coca_seeds", new AliasedBlockItem(ModBlocks.COCA_CROP, new FabricItemSettings()));

    public static final Item POPPY_SEEDS = registerItem("poppy_seeds", new AliasedBlockItem(ModBlocks.POPPY_CROP, new FabricItemSettings()));

    private static void addItemGroup(FabricItemGroupEntries entries){
        entries.add(SALT);
    }



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Overdose.MOD_ID, name), item);
    }

    public static void  registerModItem(){
        Overdose.LOGGER.info("Registering Mod Items for +" + Overdose.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemGroup);
    }

}
