package fr.tunbass.wogmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class lsd extends Item {
    public lsd(Properties p_41383_) {
        super(p_41383_);
    }
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 2));
        player.addEffect(new MobEffectInstance(MobEffects.HEAL, 600, 2));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600 , 2));
        player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,600, 3));
        player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100,2));
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 4));
        player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 2));
        player.addEffect(new MobEffectInstance(MobEffects.WITHER, 150, 2));
        return super.use(world, player, hand);
    }
}
