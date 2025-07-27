package ps.projectsycamore;

import net.fabricmc.api.ModInitializer;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;

public class ProjectSycamore implements ModInitializer {
    public static final String MOD_ID = "projectsycamore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // This DefaultParticleType gets called when you want to use your particle in code.
    public static final SimpleParticleType LE_PARTICLES = FabricParticleTypes.simple();
    public static final SimpleParticleType LE_APIS = FabricParticleTypes.simple();
    public static final SimpleParticleType REGINA_APIS = FabricParticleTypes.simple();
    public static final SimpleParticleType MP_INNOCENS_ANIMA = FabricParticleTypes.simple();
    public static final SimpleParticleType MP_ASCENDENS_ANIMA = FabricParticleTypes.simple();
    public static final SimpleParticleType MP_PERFECTUM_ANIMA = FabricParticleTypes.simple();

    public static final SimpleParticleType AA_PERFECTUM_ANIMA = FabricParticleTypes.simple();
    public static final SimpleParticleType AA_ASCENDENS_ANIMA = FabricParticleTypes.simple();
    public static final SimpleParticleType AA_INNOCENS_ANIMA = FabricParticleTypes.simple();




    @Override
    public void onInitialize() {
        // Register our custom particle type in the mod initializer.
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "le_particles"), LE_PARTICLES);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "le_apis"), LE_APIS);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "regina_apis"), REGINA_APIS);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "mp_ascendens_anima"), MP_ASCENDENS_ANIMA);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "mp_innocens_anima"), MP_INNOCENS_ANIMA);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "mp_perfectum_anima"), MP_PERFECTUM_ANIMA);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "aa_perfectum_anima"), AA_PERFECTUM_ANIMA);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "aa_ascendens_anima"), AA_ASCENDENS_ANIMA);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "aa_innocens_anima"), AA_INNOCENS_ANIMA);
    }
}