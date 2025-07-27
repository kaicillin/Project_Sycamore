package ps.projectsycamore;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.EndRodParticle;

import net.minecraft.client.particle.FireflyParticle;

public class ProjectSycamoreClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.LE_PARTICLES, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.LE_APIS, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.REGINA_APIS, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.MP_INNOCENS_ANIMA, FireflyParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.MP_PERFECTUM_ANIMA, FireflyParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.MP_ASCENDENS_ANIMA, FireflyParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.AA_INNOCENS_ANIMA, FireflyParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.AA_PERFECTUM_ANIMA, FireflyParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ProjectSycamore.AA_ASCENDENS_ANIMA, FireflyParticle.Factory::new);
    }
}
