package me.classified.shop.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Random;

public class Utils {

	public static String color(String msg){
		return ChatColor.translateAlternateColorCodes('&', msg);
	}

	public static String removeColor(String msg){
		return ChatColor.stripColor(msg);
	}

	public static void broadcastMsg(String msg){
		Bukkit.broadcastMessage(color(msg));
	}

	public static int randomInt(int min, int max){
		Random rand = new Random();
		int randomNum = rand.nextInt(max - min + 1) + min;
		return randomNum;
	}

	public static ItemStack itemBuilder(Material Material, Short Data, String ItemName, ArrayList<String> Lore, Boolean Glowing){
		ItemStack item = new ItemStack(Material, 1, (short) Data);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(color(ItemName));
		meta.setLore(Lore);
		if(Glowing){
			meta.addEnchant(Enchantment.DURABILITY, 1, true);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		item.setItemMeta(meta);
		return item;
	}

	public static ItemStack itemBuilder(Material item, Short data, int amount, String name, String[] lore, boolean glowing){
		ArrayList<String> itemLore = new ArrayList<String>();
		ItemStack is = new ItemStack(item, amount, (short) data);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(color(name));
		for(String s : lore){
			itemLore.add(color(s));
		}
		im.setLore(itemLore);
		if(glowing){
			im.addEnchant(Enchantment.DURABILITY, 1, true);
			im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		if(item == Material.POTION){
			im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		}
		is.setItemMeta(im);
		return is;
	}

	public static ItemStack createShopItem(Material item, Short data, String name, Double buy, Double sell){
		ArrayList<String> itemLore = new ArrayList<String>();
		String[] buyonlylore = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x","&dShift Left-Click &7to buy 64x","&7&m----------------------"};
		String[] buyselllore = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&c&lSELL PRICE: &7$" + sell + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x","&dShift Left-Click &7to buy 64x"," ","&dRight-Click &7to sell 1x","&dShift Right-Click &7to sell 64x","&7&m----------------------"};
		String[] buyonlylorens = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x", "&dShift Left-Click &7to buy 1x","&7&m----------------------"};
		String[] buyselllorens = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&c&lSELL PRICE: &7$" + sell + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x", "&dShift Left-Click &7to buy 1x"," ","&dRight-Click &7to sell 1x","&dShift Right-Click &7to sell 1x","&7&m----------------------"};
		ItemStack is = new ItemStack(item, 1, (short) data);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(color(name));
		if(item == Material.FLINT_AND_STEEL || item == Material.WATER_BUCKET || item == Material.LAVA_BUCKET || item == Material.POTION || item == Material.BOW){
			if(sell == 0){
				for(String s : buyonlylorens){
					itemLore.add(color(s));
				}
			}
			else{
				for(String s : buyselllorens){
					itemLore.add(color(s));
				}
			}
		}
		else{
			if(sell == 0){
				for(String s : buyonlylore){
					itemLore.add(color(s));
				}
			}
			else{
				for(String s : buyselllore){
					itemLore.add(color(s));
				}
			}
		}
		im.setLore(itemLore);
		if(item == Material.POTION){
			im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		}
		is.setItemMeta(im);
		return is;
	}

	public static ItemStack createShopItem(Material item, Short data, String name, Integer buy, Double sell){
		ArrayList<String> itemLore = new ArrayList<String>();
		String[] buyonlylore = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x","&dShift Left-Click &7to buy 64x","&7&m----------------------"};
		String[] buyselllore = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&c&lSELL PRICE: &7$" + sell + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x","&dShift Left-Click &7to buy 64x"," ","&dRight-Click &7to sell 1x","&dShift Right-Click &7to sell 64x","&7&m----------------------"};
		String[] buyonlylorens = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x", "&dShift Left-Click &7to buy 1x","&7&m----------------------"};
		String[] buyselllorens = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&c&lSELL PRICE: &7$" + sell + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x", "&dShift Left-Click &7to buy 1x"," ","&dRight-Click &7to sell 1x","&dShift Right-Click &7to sell 1x","&7&m----------------------"};
		ItemStack is = new ItemStack(item, 1, (short) data);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(color(name));
		if(item == Material.FLINT_AND_STEEL || item == Material.WATER_BUCKET || item == Material.LAVA_BUCKET || item == Material.POTION || item == Material.BOW){
			if(sell == 0){
				for(String s : buyonlylorens){
					itemLore.add(color(s));
				}
			}
			else{
				for(String s : buyselllorens){
					itemLore.add(color(s));
				}
			}
		}
		else{
			if(sell == 0){
				for(String s : buyonlylore){
					itemLore.add(color(s));
				}
			}
			else{
				for(String s : buyselllore){
					itemLore.add(color(s));
				}
			}
		}
		im.setLore(itemLore);
		if(item == Material.POTION){
			im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		}
		is.setItemMeta(im);
		return is;
	}

	public static ItemStack createShopItem(Material item, Short data, String name, Integer buy, Integer sell){
		ArrayList<String> itemLore = new ArrayList<String>();
		String[] buyonlylore = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x","&dShift Left-Click &7to buy 64x","&7&m----------------------"};
		String[] buyselllore = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&c&lSELL PRICE: &7$" + sell + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x","&dShift Left-Click &7to buy 64x"," ","&dRight-Click &7to sell 1x","&dShift Right-Click &7to sell 64x","&7&m----------------------"};
		String[] buyonlylorens = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x", "&dShift Left-Click &7to buy 1x","&7&m----------------------"};
		String[] buyselllorens = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&c&lSELL PRICE: &7$" + sell + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x", "&dShift Left-Click &7to buy 1x"," ","&dRight-Click &7to sell 1x","&dShift Right-Click &7to sell 1x","&7&m----------------------"};
		ItemStack is = new ItemStack(item, 1, (short) data);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(color(name));
		if(item == Material.FLINT_AND_STEEL || item == Material.WATER_BUCKET || item == Material.LAVA_BUCKET || item == Material.POTION || item == Material.BOW){
			if(sell == 0){
				for(String s : buyonlylorens){
					itemLore.add(color(s));
				}
			}
			else{
				for(String s : buyselllorens){
					itemLore.add(color(s));
				}
			}
		}
		else{
			if(sell == 0){
				for(String s : buyonlylore){
					itemLore.add(color(s));
				}
			}
			else{
				for(String s : buyselllore){
					itemLore.add(color(s));
				}
			}
		}
		im.setLore(itemLore);
		if(item == Material.POTION){
			im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		}
		is.setItemMeta(im);
		return is;
	}

	public static ItemStack createShopItem(Material item, Short data, String name, Double buy, Integer sell){
		ArrayList<String> itemLore = new ArrayList<String>();
		String[] buyonlylore = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x","&dShift Left-Click &7to buy 64x","&7&m----------------------"};
		String[] buyselllore = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&c&lSELL PRICE: &7$" + sell + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x","&dShift Left-Click &7to buy 64x"," ","&dRight-Click &7to sell 1x","&dShift Right-Click &7to sell 64x","&7&m----------------------"};
		String[] buyonlylorens = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x", "&dShift Left-Click &7to buy 1x","&7&m----------------------"};
		String[] buyselllorens = new String[]{" ", "&a&lBUY PRICE: &7$" + buy + "/ea", " ", "&c&lSELL PRICE: &7$" + sell + "/ea", " ", "&7&m----------------------", "&dLeft Click &7to buy 1x", "&dShift Left-Click &7to buy 1x"," ","&dRight-Click &7to sell 1x","&dShift Right-Click &7to sell 1x","&7&m----------------------"};
		ItemStack is = new ItemStack(item, 1, (short) data);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(color(name));
		if(item == Material.FLINT_AND_STEEL || item == Material.WATER_BUCKET || item == Material.LAVA_BUCKET || item == Material.POTION || item == Material.BOW){
			if(sell == 0){
				for(String s : buyonlylorens){
					itemLore.add(color(s));
				}
			}
			else{
				for(String s : buyselllorens){
					itemLore.add(color(s));
				}
			}
		}
		else{
			if(sell == 0){
				for(String s : buyonlylore){
					itemLore.add(color(s));
				}
			}
			else{
				for(String s : buyselllore){
					itemLore.add(color(s));
				}
			}
		}
		im.setLore(itemLore);
		if(item == Material.POTION){
			im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		}
		is.setItemMeta(im);
		return is;
	}

	public static double getSingleBuyPrice(ItemStack is){
		String b = is.getItemMeta().getLore().get(1);
		b = removeColor(b);
		b = b.replace("BUY PRICE: $", "");
		b = b.replace("/ea", "");
		double price = Double.parseDouble(b);
		return price;
	}

	public static double getStackBuyPrice(ItemStack is){
		String b = is.getItemMeta().getLore().get(1);
		b = removeColor(b);
		b = b.replace("BUY PRICE: $", "");
		b = b.replace("/ea", "");
		double price = Double.parseDouble(b) * 64;
		return price;
	}

	public static double getSingleSellPrice(ItemStack is){
		String s = is.getItemMeta().getLore().get(3);
		s = removeColor(s);
		s = s.replace("SELL PRICE: $", "");
		s = s.replace("/ea", "");
		double price = Double.parseDouble(s);
		return price;
	}

	public static double getStackSellPrice(ItemStack is){
		String s = is.getItemMeta().getLore().get(3);
		s = removeColor(s);
		s = s.replace("SELL PRICE: $", "");
		s = s.replace("/ea", "");
		double price = Double.parseDouble(s) * 64;
		return price;
	}

	public static int removeItem(PlayerInventory inventory, Material item, short meta, int quantity) {
        int rest = quantity;
        for( int i = 0 ; i < inventory.getSize() ; i++ ){
            ItemStack stack = inventory.getItem(i); 
            if( stack == null || stack.getType() != item )
                continue;
            if( rest >= stack.getAmount() ){
                rest -= stack.getAmount();
                inventory.clear(i);
            } else if( rest>0 ){
                    stack.setAmount(stack.getAmount()-rest);
                    rest = 0;
            } else {
                break;
            }
        }
        return quantity-rest;
    }

	public static boolean isInvFull(Player p){
		if(p.getInventory().firstEmpty() > -1){
			return false;
		}
		else{
			return true;
		}
	}
}
