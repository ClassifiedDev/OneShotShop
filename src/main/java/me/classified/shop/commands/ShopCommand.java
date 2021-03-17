package me.classified.shop.commands;

import me.classified.shop.utils.ShopInventories;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCommand implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("shop")){
			if(!(sender instanceof Player)){
				return false;
			}
			Player p = (Player) sender;
			ShopInventories.openShopCategories(p);
		}
		return false;
	}

}
