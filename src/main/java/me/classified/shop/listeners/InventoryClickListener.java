package me.classified.shop.listeners;

import me.classified.shop.OneShotShop;
import me.classified.shop.utils.ItemNames;
import me.classified.shop.utils.ShopInventories;
import me.classified.shop.utils.Utils;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener{

	@EventHandler
	public void onShopClick(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(p.getOpenInventory().getTitle().equals(Utils.color("&8Shop Categories"))){
			if(e.getSlotType().equals(SlotType.OUTSIDE)) return;
			if(!e.getCurrentItem().hasItemMeta()){
			}
			if(e.getCurrentItem().getType().equals(Material.STAINED_GLASS_PANE)){
				e.setCancelled(true);
				return;
			}
			ItemStack item = e.getCurrentItem();
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lRaid Shop &7«"))){
				ShopInventories.openRaidShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lSpawners &7«"))){
				ShopInventories.openSpawnerShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lBuilding Blocks &7«"))){
				ShopInventories.openBuildingBlocksShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lOres and Valuables &7«"))){
				ShopInventories.openOresShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lFood and Farming &7«"))){
				ShopInventories.openFoodShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lMob Drops &7«"))){
				ShopInventories.openMobDropsShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lSpecialty Items &7«"))){
				ShopInventories.openSpecialtyShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lBrewing and Potions &7«"))){
				ShopInventories.openBrewingPotionShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lWool &7«"))){
				ShopInventories.openWoolShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lGlass &7«"))){
				ShopInventories.openGlassShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lClay &7«"))){
				ShopInventories.openClayShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lFlowers &7«"))){
				ShopInventories.openFlowersShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &d&lGen Walls &7«"))){
				p.performCommand("genwallshop");
				e.setCancelled(true);
				return;
			}
			e.setCancelled(true);
		}
		if(p.getOpenInventory().getTitle().contains(Utils.color("&8Shop (")) && !Utils.removeColor(p.getOpenInventory().getTitle()).contains("Spawners")){
			if(e.getSlotType().equals(SlotType.OUTSIDE)) return;
			if(!e.getCurrentItem().hasItemMeta()){
			}
			ItemStack item = e.getCurrentItem();
			if(item.getType().equals(Material.STAINED_GLASS_PANE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &c&lBack &7«"))){
				ShopInventories.openShopCategories(p);
				e.setCancelled(true);
				return;
			}
			if(item != null && item.getType() != Material.AIR){
				if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().contains(Utils.color("&7» ")) && item.getItemMeta().getDisplayName().contains(Utils.color(" &7«")) && item.getItemMeta().getLore().get(1).contains(Utils.color("&a&lBUY PRICE: "))){
					e.setCancelled(true);
					if(e.getClick() == ClickType.LEFT){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								else{
									p.sendMessage(Utils.color("&c&l- $" + Utils.getSingleBuyPrice(item)));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								p.getInventory().addItem(new ItemStack(item.getType(), 1, (short) item.getDurability()));
								p.sendMessage(Utils.color("&a&l+ 1x " + ItemNames.lookupItem(item)));
							}
						}
						else{
							p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that!"));
						}
					}
					if(e.getClick() == ClickType.SHIFT_LEFT){
						double bal = OneShotShop.econ.getBalance(p);
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							if(item.getType() == Material.FLINT_AND_STEEL || item.getType() == Material.WATER_BUCKET || item.getType() == Material.LAVA_BUCKET || item.getType() == Material.POTION || item.getType() == Material.BOW){
								double sitemPrice = Utils.getSingleBuyPrice(item);
								if(!(bal >= sitemPrice)){
									p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
									e.setCancelled(true);
									return;
								}
								EconomyResponse sr = OneShotShop.econ.withdrawPlayer(p, sitemPrice);
								if(sr.transactionSuccess()){
									double sItemPrice = Utils.getSingleBuyPrice(item);
									String subPrice = String.valueOf(sItemPrice).substring(String.valueOf(sItemPrice).lastIndexOf(".") + 1);
									if(subPrice.equals("0")){
										String sPrice = String.valueOf(sItemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c&l- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									else{
										p.sendMessage(Utils.color("&c&l- $" + Utils.getSingleBuyPrice(item)));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									p.getInventory().addItem(new ItemStack(item.getType(), 1, (short) item.getDurability()));
									p.sendMessage(Utils.color("&a&l+ 1x " + ItemNames.lookupItem(item)));
								}
							}
							else{
								double itemPrice = Utils.getStackBuyPrice(item);
								if(!(bal >= itemPrice)){
									p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								/*if(item.getType() == Material.FLINT_AND_STEEL || item.getType() == Material.WATER_BUCKET || item.getType() == Material.LAVA_BUCKET || item.getType() == Material.POTION || item.getType() == Material.BOW){
									double sItemPrice = API.getSingleBuyPrice(item);
									String subPrice = String.valueOf(sItemPrice).substring(String.valueOf(sItemPrice).lastIndexOf(".") + 1);
									if(subPrice.equals("0")){
										String sPrice = String.valueOf(sItemPrice).replace(".0", "");
										p.sendMessage(API.color("&c&l- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									else{
										p.sendMessage(API.color("&c&l- $" + API.getSingleBuyPrice(item)));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									p.getInventory().addItem(new ItemStack(item.getType(), 1, (short) item.getDurability()));
									p.sendMessage(API.color("&a&l+ 1x " + ItemNames.lookupItem(item)));
									if(item.getType() == Material.POTION){
										Main.econ.depositPlayer(p, 4725);
									}
								}*/
								//else{
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if(subPrice.equals("0")){
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c&l- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									else{
										p.sendMessage(Utils.color("&c&l- $" + Utils.getStackBuyPrice(item)));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									p.getInventory().addItem(new ItemStack(item.getType(), 64, (short) item.getDurability()));
									p.sendMessage(Utils.color("&a&l+ 64x " + ItemNames.lookupItem(item)));
								//}
							}
							}

					}
					if(e.getClick() == ClickType.RIGHT && item.getItemMeta().getLore().get(3).contains(Utils.color("&c&lSELL PRICE:"))){
						if(p.getInventory().contains(item.getType())){
							double itemPrice = Utils.getSingleSellPrice(item);
							OneShotShop.econ.depositPlayer(p, itemPrice);
							String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
							if(subPrice.equals("0")){
								String sPrice = String.valueOf(itemPrice).replace(".0", "");
								p.sendMessage(Utils.color("&c&l- 1x " + ItemNames.lookupItem(item)));
								p.sendMessage(Utils.color("&a&l+ $" + sPrice));
								p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);

							}
							else{
								p.sendMessage(Utils.color("&c&l- 1x " + ItemNames.lookupItem(item)));
								p.sendMessage(Utils.color("&a&l+ $" + Utils.getSingleSellPrice(item)));
								p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
							}
							Utils.removeItem(p.getInventory(), item.getType(), item.getDurability(), 1);
						}
						else{
							p.sendMessage(Utils.color("&c&l(!) &cYou do not have that item to sell."));
							e.setCancelled(true);
						}
						e.setCancelled(true);
					}
					if(e.getClick() == ClickType.SHIFT_RIGHT && item.getItemMeta().getLore().get(3).contains(Utils.color("&c&lSELL PRICE:"))){
						double itemPrice = Utils.getStackSellPrice(item);
						OneShotShop.econ.depositPlayer(p, itemPrice);

						if(item.getType() == Material.FLINT_AND_STEEL || item.getType() == Material.WATER_BUCKET || item.getType() == Material.LAVA_BUCKET || item.getType() == Material.POTION || item.getType() == Material.BOW){
							if(p.getInventory().contains(item.getType())){
								double sItemPrice = Utils.getSingleSellPrice(item);
								String subPrice = String.valueOf(sItemPrice).substring(String.valueOf(sItemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(sItemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- 1x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a&l+ $" + sPrice));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
								}
								else{
									p.sendMessage(Utils.color("&c&l- 1x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a&l+ $" + Utils.getSingleSellPrice(item)));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
								}
								Utils.removeItem(p.getInventory(), item.getType(), item.getDurability(), 1);
							}
							return;
						}
						else{
							if(p.getInventory().contains(item.getType(), 64)){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- 64x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a&l+ $" + sPrice));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
									e.setCancelled(true);
								}
								else{
									p.sendMessage(Utils.color("&c&l- 64x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a&l+ $" + Utils.getStackSellPrice(item)));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
								}
								Utils.removeItem(p.getInventory(), item.getType(), item.getDurability(), 64);
								e.setCancelled(true);
							}
							else{
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have that item to sell."));
								e.setCancelled(true);
							}
							return;
						}
					}
					e.setCancelled(true);
				}
			}
			e.setCancelled(true);
		}
		
		if(p.getOpenInventory().getTitle().contains(Utils.color("&8Shop (Spawners)"))){
			if(e.getSlotType().equals(SlotType.OUTSIDE)) return;
			if(!e.getCurrentItem().hasItemMeta()){
			}
			ItemStack item = e.getCurrentItem();
			if(item.getType().equals(Material.STAINED_GLASS_PANE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&7» &c&lBack &7«"))){
				ShopInventories.openShopCategories(p);
				e.setCancelled(true);
				return;
			}
			if(item != null && item.getType() != Material.AIR){
				if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().contains(Utils.color("&7» ")) && item.getItemMeta().getDisplayName().contains(Utils.color(" &7«")) && item.getItemMeta().getLore().get(1).contains(Utils.color("&a&lBUY PRICE: "))){
					String clicked = Utils.removeColor(item.getItemMeta().getDisplayName());
					if(clicked.contains("Chicken Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " chicken 1");
								p.sendMessage(Utils.color("&a&l+ 1x Chicken Spawner"));
							}
						}
						else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Pig Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " pig 1");
								p.sendMessage(Utils.color("&a&l+ 1x Pig Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Cave Spider Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " cavespider 1");
								p.sendMessage(Utils.color("&a&l+ 1x Cave Spider Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.equals("» Spider Spawner «")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " spider 1");
								p.sendMessage(Utils.color("&a&l+ 1x Spider Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Sheep Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " sheep 1");
								p.sendMessage(Utils.color("&a&l+ 1x Sheep Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Wolf Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " wolf 1");
								p.sendMessage(Utils.color("&a&l+ 1x Wolf Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Skeleton Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " skeleton 1");
								p.sendMessage(Utils.color("&a&l+ 1x Skeleton Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Zombie Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " zombie 1");
								p.sendMessage(Utils.color("&a&l+ 1x Zombie Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Cow Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " cow 1");
								p.sendMessage(Utils.color("&a&l+ 1x Cow Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Enderman Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " enderman 1");
								p.sendMessage(Utils.color("&a&l+ 1x Enderman Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Zombie Pigman Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " pigzombie 1");
								p.sendMessage(Utils.color("&a&l+ 1x Zombie Pigman Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Creeper Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " creeper 1");
								p.sendMessage(Utils.color("&a&l+ 1x Creeper Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Blaze Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " blaze 1");
								p.sendMessage(Utils.color("&a&l+ 1x Blaze Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Slime Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " slime 1");
								p.sendMessage(Utils.color("&a&l+ 1x Slime Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Iron Golem Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " ig 1");
								p.sendMessage(Utils.color("&a&l+ 1x Iron Golem Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					if(clicked.contains("Mystery Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						double itemPrice = Utils.getSingleBuyPrice(item);
						if(bal >= itemPrice){
							if(Utils.isInvFull(p)){
								p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
								e.setCancelled(true);
								return;
							}
							EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
							if(r.transactionSuccess()){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c&l- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " mystery 1");
								p.sendMessage(Utils.color("&a&l+ 1x Mystery Spawner"));
							}
						}
                        else {
                            p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
                            e.setCancelled(true);
                            return;
                        }
					}
					e.setCancelled(true);
				}
			}
		}
	}

}
