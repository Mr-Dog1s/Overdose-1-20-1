package dog1s.overdose.client;

import dog1s.overdose.Overdose;
import ladysnake.satin.api.managed.ManagedShaderEffect;
import ladysnake.satin.api.managed.ShaderEffectManager;
import net.minecraft.util.Identifier;

public class ModShaders {
    public static final ManagedShaderEffect MIGRAINE =
            ShaderEffectManager.getInstance()
                    .manage(new Identifier(Overdose.MOD_ID,
                    "shaders/post/migraine.json"
                    ));
    static {
        System.out.println("Loading migraine shader");
    }
}
