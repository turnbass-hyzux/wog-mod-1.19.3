package fr.tunbass.wogmod.item;

import fr.tunbass.wogmod.block.Modblock;
import fr.tunbass.wogmod.item.custom.coke;
import fr.tunbass.wogmod.item.custom.lsd;
import fr.tunbass.wogmod.item.custom.meth;
import fr.tunbass.wogmod.item.custom.steroides;
import fr.tunbass.wogmod.main;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.openjdk.nashorn.internal.codegen.Compiler;

import static fr.tunbass.wogmod.main.MOD_ID;

public class item {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, main.MOD_ID);

    public static final RegistryObject<Item> WEED = ITEMS.register("weed", () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> WEED_SEC = ITEMS.register("weed_sec", () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BROWNIES_DE_WEED = ITEMS.register("brownies_de_weed", () -> new Item(new Item.Properties().stacksTo(64).food(Foods.BROWNIES_DE_WEED)));
    public static final RegistryObject<Item> STEROIDES = ITEMS.register("steroides", () -> new steroides(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> METH = ITEMS.register("meth", () -> new meth(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> COKE = ITEMS.register("coke", () -> new coke(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> VODKA = ITEMS.register("vodka", () -> new Item(new Item.Properties().stacksTo(16).food(Foods.VODKA)));
    public static final RegistryObject<Item> BOISSONS_SURVITAMINEES = ITEMS.register("boissons_survitaminees", () -> new Item(new Item.Properties().stacksTo(16).food(Foods.BOISSONS_SURVITAMINEES)));
    public static final RegistryObject<Item> LSD = ITEMS.register("lsd", () -> new lsd(new Item.Properties().stacksTo(16)));



    //en reflection
    public static final RegistryObject<Item> POT_ITEM = ITEMS.register("pot_de_plantation_item", () -> new BlockItem(Modblock.POT.get(), new Item.Properties().stacksTo(64)));


    //blocks items
    public static final RegistryObject<Item> POT_ITEM_STAGE_FINAL = ITEMS.register("pot_de_plantation_item_stage_final", () -> new BlockItem(Modblock.POT_STAGE_FINAL.get(), new Item.Properties().stacksTo(64)));


    //food
    public static class Foods {
        public static final FoodProperties BROWNIES_DE_WEED = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6f)
                .meat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 1),0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 25, 2),0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 10, 1),0.9f)
                .build();
        public static final FoodProperties VODKA = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6f)
                .meat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 2), 0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 600, 2), 0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 1),0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 10, 1),0.9f)
                .build();
        public static final FoodProperties BOISSONS_SURVITAMINEES = new FoodProperties.Builder()
                .nutrition(2)
                .saturationMod(0.6f)
                .meat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 2), 0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 2), 0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 50, 1),0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 25, 1),0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 10, 1),0.9f)
                .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 10, 1),0.9f)
                .build();
    }
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
