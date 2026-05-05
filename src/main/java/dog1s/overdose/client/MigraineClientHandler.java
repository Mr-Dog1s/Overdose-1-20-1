package dog1s.overdose.client;

import dog1s.overdose.effect.ModEffects;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class MigraineClientHandler {

    private static Double originalSensitivity = null;
    private static boolean modified = false;

    public static void register(){
        ClientTickEvents.END_CLIENT_TICK.register(
                MigraineClientHandler::tick
        );
    }

    public static void tick(MinecraftClient client){
        if(client.player == null) return;

        boolean hasMigraine = client.player.hasStatusEffect(ModEffects.MIGRAINE);

        if(hasMigraine && !modified){

        }
    }

}
