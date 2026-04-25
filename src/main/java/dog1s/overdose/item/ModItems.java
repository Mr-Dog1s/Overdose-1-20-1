package dog1s.overdose.item;

import dog1s.overdose.Overdose;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));

    public static final Item PEPPER = registerItem("pepper", new Item(new FabricItemSettings()));

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
