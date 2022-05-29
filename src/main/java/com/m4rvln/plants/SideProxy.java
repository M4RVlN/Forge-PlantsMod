package com.m4rvln.plants;

import com.m4rvln.plants.client.ColorHandlers;
import com.m4rvln.plants.common.registries.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy {

    SideProxy() {
        Registration.init();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(SideProxy::commonSetup);
        modEventBus.addListener(SideProxy::enqueueIMC);
        modEventBus.addListener(SideProxy::processIMC);

        MinecraftForge.EVENT_BUS.register(this);
    }


    private static void commonSetup(final FMLCommonSetupEvent event) {

    }

    private static void enqueueIMC(final InterModEnqueueEvent event) {

    }

    private static void processIMC(final InterModProcessEvent event) {

    }

    @SubscribeEvent
    public static void serverStarting(ServerStartingEvent event) {

    }

    static class Client extends SideProxy {

        Client() {
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
            modEventBus.addListener(Client::clientSetup);
            modEventBus.addListener(ColorHandlers::setupItemColors);
            modEventBus.addListener(ColorHandlers::setupBlockColors);
        }

        private static void clientSetup(final FMLClientSetupEvent event) {

        }
    }

    static class Server extends SideProxy {

        Server() {
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
            modEventBus.addListener(Server::serverSetup);
        }

        private static void serverSetup(final FMLDedicatedServerSetupEvent event) {

        }
    }

}
