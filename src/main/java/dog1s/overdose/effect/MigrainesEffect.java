package dog1s.overdose.effect;

import dog1s.overdose.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class MigrainesEffect extends StatusEffect {

    public MigrainesEffect() {
        super(StatusEffectCategory.HARMFUL, 0xA8B8FF);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!(entity instanceof PlayerEntity player)) return;

        if (player.getWorld().isClient()) return;

        if (player.getRandom().nextFloat() < 0.002f) {
            player.playSound(
                    ModSounds.MIGRAINE_RING,
                    0.35f,
                    1.7f + player.getRandom().nextFloat() * 0.4f
            );
        }
    }
}
