package dog1s.overdose;

import dog1s.overdose.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Overdose implements ModInitializer {
        public static final String MOD_ID = "overdose";
        public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItem();
    }
}
