package nukkitcoders.mobplugin.entities.animal.swimming;

import cn.nukkit.item.Item;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import nukkitcoders.mobplugin.entities.animal.SwimmingAnimal;

public class TropicalFish extends SwimmingAnimal {

    public static final int NETWORK_ID = 111;

    public TropicalFish(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Override
    public float getWidth() {
        return 0.5f;
    }

    @Override
    public float getHeight() {
        return 0.4f;
    }

    @Override
    public void initEntity() {
        super.initEntity();
        this.setMaxHealth(3);
    }

    @Override
    public int getKillExperience() {
        return 0;
    }

    @Override
    public Item[] getDrops() {
        return new Item[]{Item.get(Item.CLOWNFISH, 0, 1)};
    }

    @Override
    public String getName() {
        return this.hasCustomName() ? this.getNameTag() : "Tropical Fish";
    }
}
