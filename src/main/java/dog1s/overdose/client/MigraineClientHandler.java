package dog1s.overdose.client;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class MigraineClientHandler {

    private static Double originalSensitivity = null;
    private static boolean modified = false;

    public static void register() {

    }

    public static void tick(MinecraftClient client) {
        if (client.world == null) return;

        ModShaders.MIGRAINE.findUniform1f("Time")
                .set(client.world.getTime() / 20f);


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


