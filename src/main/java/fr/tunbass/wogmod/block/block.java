package fr.tunbass.wogmod.block;

import fr.tunbass.wogmod.block.custom.pot;
import fr.tunbass.wogmod.block.custom.potfinal;
import fr.tunbass.wogmod.item.item;
import fr.tunbass.wogmod.main;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class block {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, main.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, main.MOD_ID);
public static final RegistryObject<Block> POT = BLOCKS.register("pot_de_plantation", () -> new pot());
public static final RegistryObject<Block> POT_STAGE_FINAL = BLOCKS.register("pot_stage_final", () -> new potfinal());


    private static <T extends Block> RegistryObject<BlockItem> registerBlock(String name, RegistryObject<T> block) {
        return item.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);}
}

