package main.dartanman.examplespelladdons;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import main.dartanman.nordicrpg.spells.SelfTargetSpell;

public class SelfPoisonSpell extends SelfTargetSpell{

	public SelfPoisonSpell(String name, String permission) {
		super(name, permission);
	}

	// This is where the magic happens
	@Override
	public void applyEffectToTarget(Player caster, LivingEntity target) {
		caster.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 10*20, 0));
		super.setCooldown(caster, 30);
	}

	// All spells must have this method
	@Override
	public boolean hasPermission(Player caster) {
		return caster.hasPermission(getPermission());
	}

}
