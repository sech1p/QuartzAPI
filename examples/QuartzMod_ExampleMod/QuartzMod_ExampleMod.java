package net.minecraft.src;

/**
 * This is a simple example for making mods for QuartzAPI.
 * Mod to be recognized by QuartzAPI loader must be starting from QuartzMod_
 * 
 * @author Eliza "sech1p" Semeniuk
 */
public class QuartzMod_Example extends QuartzMod {	
	/**
	 * Constructor of mod
	 * @param modName Name of the modification
	 * @param modAuthor Author of the modification
	 * @param modVersion Version of the modification
	 */
	public QuartzMod_Example() {
		super("Example", "Eliza 'sech1p' Semeniuk", "0.0");
	}
	
	/**
	 * Initialize function, you can for e.g. registers block here.
	 */
	@Override
	public void init() {
		// In game console you should saw this sentence, it's means that mod works. :)
		System.out.println("Mod started successfully");
		
		super.init();
	}
	
	/**
	 * Function called when you started playing world in Minecraft.
	 * For e.g. you can write on chat something like thanks for installing mod or other informations about mod.
	 */
	@Override
	public void onWorldStart() {
		this.DisplayChatLine("Hewwo, world!~");
		super.onWorldStart();
	}
	
	/**
	 * Update function, it's main loop of mod which is runned constantly during the game,
	 * You can manipulate terrain generator or doing rest of things here which depends on constantly updating.
	 */
	@Override
	public void update() {
		super.update();
	}
}
