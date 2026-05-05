package dog1s.overdose.effect;

import dog1s.overdose.Overdose;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final StatusEffect MIGRAINE =
            Registry.register(
                    Registries.STATUS_EFFECT,
                    new Identifier(Overdose.MOD_ID, "migraine"),
                    new MigrainesEffect()
            );

    public static void register(){}
}
