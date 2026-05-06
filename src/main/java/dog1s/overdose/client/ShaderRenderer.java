package dog1s.overdose.client;

import ladysnake.satin.api.event.PostWorldRenderCallback;
import net.minecraft.client.MinecraftClient;

import ladysnake.satin.api.event.ShaderEffectRenderCallback;
import net.minecraft.client.MinecraftClient;

public class ShaderRenderer {

    public static void register() {

        ShaderEffectRenderCallback.EVENT.register(tickDelta -> {

            System.out.println("MIGRAINE CALLBACK");

            MinecraftClient client = MinecraftClient.getInstance();

            if (client.world == null) return;
            if (ModShaders.MIGRAINE == null) return;


            ModShaders.MIGRAINE.render(tickDelta);
        });
    }
}
