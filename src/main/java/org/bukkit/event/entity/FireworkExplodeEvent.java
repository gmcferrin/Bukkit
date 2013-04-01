package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Firework;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Called when a firework explodes
 */
public class FireworkExplodeEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private final Location location;

    public FireworkExplodeEvent(final Firework what, final Location location) {
        super(what);
        this.location = location;
        this.cancel = false;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Get the location of where the firework exploded.
     *
     * @return the location of the explosion
     */
    public Location getLocation() {
        return location;
    }

    @Override
    public Firework getEntity() {
        return (Firework) entity;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
