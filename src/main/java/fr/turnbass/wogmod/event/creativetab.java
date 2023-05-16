package fr.turnbass.wogmod.event;

import fr.turnbass.wogmod.item.item;
import fr.turnbass.wogmod.main;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class creativetab {
    public static CreativeModeTab WOG_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTab(CreativeModeTabEvent.Register event) {
        WOG_TAB = event.registerCreativeModeTab(new ResourceLocation(main.MOD_ID, "wog_tab"), builder -> builder.icon(() -> new ItemStack(item.WEED.get())).title(Component.literal("World of Glory")));
    }


}

