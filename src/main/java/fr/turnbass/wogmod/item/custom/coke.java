package fr.turnbass.wogmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class coke extends Item {
    public coke(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 2));
        player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600, 1));
        player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,600, 1));
        player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100,2));
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3));
        return super.use(world, player, hand);
    }

}
