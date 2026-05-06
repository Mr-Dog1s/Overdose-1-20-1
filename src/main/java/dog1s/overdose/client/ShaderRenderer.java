package dog1s.overdose.client;


import ladysnake.satin.api.event.ShaderEffectRenderCallback;
import net.minecraft.client.MinecraftClient;

public class ShaderRenderer {

    public static void register() {
        ShaderEffectRenderCallback.EVENT.register(tickDelta -> {
            MinecraftClient client = MinecraftClient.getInstance();

            if (client.world == null) return;

            ModShaders.MIGRAINE.render(tickDelta);
        });
    }
}
