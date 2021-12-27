package rocks.gravili.disablevillagerbreeding;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

public class VillagerEvents implements Listener {

    @EventHandler
    public void onBreed(EntityBreedEvent e){
        if(e.getEntity().getType() == EntityType.VILLAGER){
            if(e.getBreeder() != null && e.getBreeder().hasPermission("disablevillagerbreeding.bypass")){
                return;
            }
            e.setCancelled(true);
        }
    }
}
