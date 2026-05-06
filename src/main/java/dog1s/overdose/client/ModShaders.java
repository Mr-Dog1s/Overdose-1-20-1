package dog1s.overdose.client;

import dog1s.overdose.Overdose;
import ladysnake.satin.api.managed.ManagedShaderEffect;
import ladysnake.satin.api.managed.ShaderEffectManager;
import net.minecraft.util.Identifier;

public class ModShaders {

    public static ManagedShaderEffect MIGRAINE;

    public static void init() {
        MIGRAINE = ShaderEffectManager.getInstance()
                .manage(new Identifier("overdose", "shaders/post/migraine.json"));
    }
}