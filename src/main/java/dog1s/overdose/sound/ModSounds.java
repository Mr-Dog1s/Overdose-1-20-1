package dog1s.overdose.sound;

import dog1s.overdose.Overdose;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier MIGRAINE_RING_ID =
            new Identifier(Overdose.MOD_ID, "migraine_ring");

    public static final SoundEvent MIGRAINE_RING =
            SoundEvent.of(MIGRAINE_RING_ID);

    public static void register(){
        Registry.register(
                Registries.SOUND_EVENT,
                MIGRAINE_RING_ID,
                MIGRAINE_RING
        );
    }
}
