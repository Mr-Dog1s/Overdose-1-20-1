package dog1s.overdose.client;

import dog1s.overdose.effect.ModEffects;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class MigraineClientHandler {

    private static Double originalSensitivity = null;
    private static boolean modified = false;

    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(
                MigraineClientHandler::tick
        );
    }

    private static void tick(MinecraftClient client) {
        if (client.player == null) return;

        boolean hasMigraine =
                client.player.hasStatusEffect(ModEffects.MIGRAINE);

        if (hasMigraine && !modified) {
            apply(client);
        } else if (!hasMigraine && modified) {
            restore(client);
        }
    }

    private static void apply(MinecraftClient client) {
        originalSensitivity =
                client.options.getMouseSensitivity().getValue();

        client.options.getMouseSensitivity().setValue(
                originalSensitivity * 0.35
        );

        modified = true;
    }

    private static void restore(MinecraftClient client) {
        if (originalSensitivity != null) {
            client.options.getMouseSensitivity()
                    .setValue(originalSensitivity);
        }

        modified = false;
        originalSensitivity = null;
    }
}


