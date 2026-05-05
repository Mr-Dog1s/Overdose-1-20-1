package dog1s.overdose;

import dog1s.overdose.block.ModBlocks;
import dog1s.overdose.effect.ModEffects;
import dog1s.overdose.item.ModItemGroups;
import dog1s.overdose.item.ModItems;
import dog1s.overdose.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Overdose implements ModInitializer {
        public static final String MOD_ID = "overdose";
        public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItem();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlock();
        ModEffects.register();
        ModSounds.register();
    }
}
