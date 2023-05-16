package fr.turnbass.wogmod;


import com.mojang.blaze3d.platform.Window;
import com.mojang.logging.LogUtils;
import fr.turnbass.wogmod.block.Modblock;
import fr.turnbass.wogmod.event.creativetab;
import fr.turnbass.wogmod.item.item;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(main.MOD_ID)
public class main {
    public static final String MOD_ID = "wogmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> IExtensionPoint.DisplayTest.IGNORESERVERONLY, (a, b) -> true));
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        modEventBus.addListener(this::commonSetup);
        item.register(modEventBus);
        Modblock.register(modEventBus);
        modEventBus.addListener(this::addcreative);
        MinecraftForge.EVENT_BUS.register(this);


    }
    private void commonSetup(final FMLCommonSetupEvent e) {
    }    private void onClientSetup(final FMLCommonSetupEvent e) {
        e.enqueueWork(this::updateTitle);
    }

    private void updateTitle() {
        final Window window = Minecraft.getInstance().getWindow();
        window.setTitle("WoG 1.19.3");
    };

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
