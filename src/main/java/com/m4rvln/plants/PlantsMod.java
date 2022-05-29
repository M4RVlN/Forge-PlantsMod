package com.m4rvln.plants;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PlantsMod.MOD_ID)
public class PlantsMod {

    public static final String MOD_ID = "plants";

    public PlantsMod() {
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> SideProxy.Client::new);
        DistExecutor.unsafeRunWhenOn(Dist.DEDICATED_SERVER, () -> SideProxy.Server::new);
    }
}
