package dog1s.overdose.client;

import ladysnake.satin.api.event.ShaderEffectRenderCallback;
import net.minecraft.client.MinecraftClient;

public class ShaderRenderer {

    public static void register() {

        ShaderEffectRenderCallback.EVENT.register(tickDelta -> {

            MinecraftClient client = MinecraftClient.getInstance();
            if (client.world == null) return;

            if (ModShaders.MIGRAINE == null) return;

            ModShaders.MIGRAINE.findUniform1f("Time")
                    .set((client.world.getTime() + tickDelta) / 20f);

            ModShaders.MIGRAINE.render(tickDelta);
        });
    }
}
