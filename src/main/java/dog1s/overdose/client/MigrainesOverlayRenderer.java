package dog1s.overdose.client;

import com.mojang.blaze3d.systems.RenderSystem;
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

        double time = client.world.getTime() + tickDelta;

        float alpha = (float)(
                0.06 + (Math.sin(time * 0.025) + 5.0) * 0.06
        );

        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();

        context.setShaderColor(1f, 1f, 1f, alpha);

        context.drawTexture(
                TEXTURE,
                0,
                0,
                0,
                0,
                client.getWindow().getScaledWidth(),
                client.getWindow().getScaledHeight(),
                512,
                512
        );

        context.setShaderColor(1f,1f,1f,1f);
    }
}
