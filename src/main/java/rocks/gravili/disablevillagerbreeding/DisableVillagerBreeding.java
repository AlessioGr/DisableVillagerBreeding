package rocks.gravili.disablevillagerbreeding;

import org.bukkit.plugin.java.JavaPlugin;

public final class DisableVillagerBreeding extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new VillagerEvents(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
