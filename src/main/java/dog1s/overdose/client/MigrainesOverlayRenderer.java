package dog1s.overdose.client;

import dog1s.overdose.Overdose;
import dog1s.overdose.effect.ModEffects;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;

public class MigrainesOverlayRenderer {
    private static final Identifier TEXTURE =
            new Identifier(
                    Overdose.MOD_ID,
                    "textures/gui/migraine_overlay.png"
            );
    public static void register(){
        HudRenderCallback.EVENT.register(
                MigrainesOverlayRenderer::render
        );
    }

    public static void render(DrawContext context,
                              float tickDelta)
    {
        MinecraftClient client = MinecraftClient.getInstance();

        if(client.player == null || client.world == null) return;

        if (!client.player.hasStatusEffect(ModEffects.MIGRAINE)) return;

        float time = client.world.getTime() + tickDelta;

        float alpha = 0.08f + (float)Math.sin(time * 0.07f) * 0.05f;

        context.setShaderColor(1f, 1f, 1f, alpha);

        context.drawTexture(
                TEXTURE,
                0,
                0,
                0,
                client.getWindow().getScaledWidth(),
                client.getWindow().getScaledHeight(),
                client.getWindow().getScaledWidth()
        );

        context.setShaderColor(1f,1f,1f,1f);
    }
}
