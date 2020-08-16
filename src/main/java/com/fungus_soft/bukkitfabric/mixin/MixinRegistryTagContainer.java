package com.fungus_soft.bukkitfabric.mixin;

import org.spongepowered.asm.mixin.Mixin;

import com.fungus_soft.bukkitfabric.interfaces.IMixinRegistryTagContainer;

import net.minecraft.tag.TagGroup;

@Mixin(TagGroup.class)
public class MixinRegistryTagContainer implements IMixinRegistryTagContainer {

    public int version;

    @Override
    public int getVersion() {
        return version;
    }

}