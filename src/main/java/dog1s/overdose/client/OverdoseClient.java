package dog1s.overdose.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class OverdoseClient implements ClientModInitializer {

    private static boolean initialized = false;

    @Override
    public void onInitializeClient() {

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (initialized) return;
            if (client.gameRenderer == null) return;

            initialized = true;

            System.out.println("Renderer is alive.");

            ModFramebuffers.init();
            ModShaders.init();
            ShaderRenderer.register();
        });
    }
}
