package fr.tunbass.wogmod;


import com.google.common.eventbus.Subscribe;
import com.mojang.logging.LogUtils;
import fr.tunbass.wogmod.block.Modblock;
import fr.tunbass.wogmod.item.item;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(main.MOD_ID)
public class main {
    public static final String MOD_ID = "wogmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        item.register(modEventBus);
        Modblock.register(modEventBus);
        modEventBus.addListener(this::addcreative);
        MinecraftForge.EVENT_BUS.register(this);


    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    private void addcreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == creativetab.WOG_TAB){

            //item
            event.accept(item.WEED);
            event.accept(item.WEED_SEC);
            event.accept(item.LSD);
            event.accept(item.COKE);
            event.accept(item.BOISSONS_SURVITAMINEES);
            event.accept(item.BROWNIES_DE_WEED);
            event.accept(item.METH);
            event.accept(item.STEROIDES);
            event.accept(item.VODKA);
            event.accept(item.POT_ITEM);
            event.accept(item.POT_ITEM_STAGE_FINAL);


            //block
            event.accept(Modblock.POT);
            event.accept(Modblock.POT_STAGE_FINAL);
        }
    }
}
