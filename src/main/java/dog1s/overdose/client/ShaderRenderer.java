package dog1s.overdose.client;

import ladysnake.satin.api.event.PostWorldRenderCallback;
import net.minecraft.client.MinecraftClient;

import ladysnake.satin.api.event.ShaderEffectRenderCallback;
import net.minecraft.client.MinecraftClient;

public class ShaderRenderer {

    public static void register() {

        MinecraftClient client = MinecraftClient.getInstance();

        client.getFramebuffer().beginWrite(false);

        ModFramebuffers.MIGRAINE_BUFFER.beginWrite(false);
        /*
        client.getFramebuffer().draw(
                client.getWindow().getFramebufferWidth(),
                client.getWindow().getFramebufferHeight()
        );
         */


        client.getFramebuffer().beginWrite(false);

        ModShaders.MIGRAINE.findUniform1f("Time")
                .set((client.world.getTime()) / 20f);

        ModShaders.MIGRAINE.render(0);
    }
}
