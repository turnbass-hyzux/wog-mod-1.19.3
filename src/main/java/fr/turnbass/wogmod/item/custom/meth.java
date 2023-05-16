package fr.turnbass.wogmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class meth extends Item{
    public meth(Properties p_41383_) {
        super(p_41383_);
    }
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 3));
        player.addEffect(new MobEffectInstance(MobEffects.HEAL, 600, 2));
        player.addEffect(new MobEffectInstance(MobEffects.POISON, 600 , 2));
        return super.use(world, player, hand);
    }
}
