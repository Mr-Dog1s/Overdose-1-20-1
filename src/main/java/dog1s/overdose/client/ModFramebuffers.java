package dog1s.overdose.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.SimpleFramebuffer;

public class ModFramebuffers {

    public static SimpleFramebuffer MIGRAINE_BUFFER;

    public static void init() {
        MinecraftClient client = MinecraftClient.getInstance();

        MIGRAINE_BUFFER = new SimpleFramebuffer(
                client.getWindow().getFramebufferWidth(),
                client.getWindow().getFramebufferHeight(),
                true,
                MinecraftClient.IS_SYSTEM_MAC
        );
    }

    public static void resize() {
        MinecraftClient client = MinecraftClient.getInstance();

        MIGRAINE_BUFFER.resize(
                client.getWindow().getFramebufferWidth(),
                client.getWindow().getFramebufferHeight(),
                MinecraftClient.IS_SYSTEM_MAC
        );
    }
}
