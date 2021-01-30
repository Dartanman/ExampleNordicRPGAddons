package main.dartanman.examplespelladdons;

import org.bukkit.plugin.java.JavaPlugin;

import main.dartanman.nordicrpg.NordicRPG;

public class Main extends JavaPlugin{
	
	// You have to register your spells like this in your onEnable() method
	public void onEnable() {
		NordicRPG.getSpellManager().addSpell(new SelfPoisonSpell("SelfPoison", "permission.to.use.this.spell"));
		NordicRPG.getSpellManager().addSpell(new TargetPoisonSpell("PoisonAttack", "addon.poisonattackspell"));
	}
	
	public void onDisable() {
		
	}

}
