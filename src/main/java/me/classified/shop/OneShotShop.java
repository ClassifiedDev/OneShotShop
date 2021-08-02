package me.classified.shop;

import me.classified.shop.commands.ShopCommand;
import me.classified.shop.listeners.InventoryClickListener;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class OneShotShop extends JavaPlugin{
	
	public static Economy econ = null;
	
	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		registerEvents();
		registerCommands();
		if(!setupEconomy()){
			logger.severe(String.format("[%s] - Disabled due to no Vault dependency found!", pdfFile.getName()));
			getServer().getPluginManager().disablePlugin(this);
			return;
		}
		logger.info(pdfFile.getName() + " has been ENABLED " + pdfFile.getVersion());
	}

	public void onDisable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		logger.info(pdfFile.getName() + " has been DISABLED " + pdfFile.getVersion());
	}

	private boolean setupEconomy(){
		if(getServer().getPluginManager().getPlugin("Vault") == null){
			return false;
		}
		RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
		if(rsp == null){			
			return false;
		}
		econ = rsp.getProvider();
		return econ != null;
	}
	
	private void registerCommands(){
		getCommand("shop").setExecutor(new ShopCommand());
	}

	private void registerEvents(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new InventoryClickListener(), this);
	}

}
