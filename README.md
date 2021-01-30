# ExampleNordicRPGAddons
Example addons for NordicRPG spells.


# TUTORIAL

Make sure you add NordicRPG as an external JAR in your build path (sorry, no Gradle or Maven).

When programming new spells, make sure that if they are meant to target the caster (e.g. a healing spell), it extends SelfTargetShout.

If it is meant to target the entity they are looking at (e.g. a damage spell), it should extend TargetShout.
MAKE SURE TO DO A NULL CHECK ON THE TARGET, otherwise, you'll get errors.

I made a stupid mistake while programming, so you have to have the exact same hasPermission() method in each Spell. It looks like this:

	@Override
	public boolean hasPermission(Player caster) {
		return caster.hasPermission(getPermission());
	}

All spells must have a applyEffectToTarget() method as well. It looks like this:

	@Override
	public void applyEffectToTarget(Player caster, LivingEntity target) {
		// Your code here.
		// If this is a SelfTargetSpell, caster and target are the same player.
		// If this is a TargetSpell, caster is the player doing the spell and target is the target of the spell.
	}

Make sure you register each Spell you make in your onEnable() like this:

	NordicRPG.getSpellManager().addSpell(new CustomSpell(String spellName, String permissionToUseThisSpell));
    
Lastly, make sure you add NordicRPG as a depend in your plugin.yml.
