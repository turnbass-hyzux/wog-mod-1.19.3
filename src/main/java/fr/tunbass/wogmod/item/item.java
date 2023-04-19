package fr.tunbass.wogmod.item;

import fr.tunbass.wogmod.main;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static fr.tunbass.wogmod.block.block.POT;
import static fr.tunbass.wogmod.block.block.POT_STAGE_FINAL;
import static fr.tunbass.wogmod.main.MOD_ID;

public class item {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, main.MOD_ID);

    public static final RegistryObject<Item> WEED = ITEMS.register("weed", () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> WEED_SEC = ITEMS.register("weed_sec", () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> POT_ITEM = ITEMS.register("pot_de_plantation_item", () -> new BlockItem(POT.get(), new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> POT_ITEM_STAGE_FINAL = ITEMS.register("pot_de_plantation_item_stage_final", () -> new BlockItem(POT_STAGE_FINAL.get(), new Item.Properties().stacksTo(64)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
