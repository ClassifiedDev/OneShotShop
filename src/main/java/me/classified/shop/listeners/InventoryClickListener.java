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

import java.text.DecimalFormat;
import java.text.NumberFormat;

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
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lRaid Shop &8»"))){
				ShopInventories.openRaidShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lSpawners &8»"))){
				ShopInventories.openSpawnerShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lBuilding Blocks &8»"))){
				ShopInventories.openBuildingBlocksShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lOres and Valuables &8»"))){
				ShopInventories.openOresShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lFood and Farming &8»"))){
				ShopInventories.openFoodShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lMob Drops &8»"))){
				ShopInventories.openMobDropsShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lSpecialty Items &8»"))){
				ShopInventories.openSpecialtyShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lBrewing and Potions &8»"))){
				ShopInventories.openBrewingPotionShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lWool &8»"))){
				ShopInventories.openWoolShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lGlass &8»"))){
				ShopInventories.openGlassShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lClay &8»"))){
				ShopInventories.openClayShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lFlowers &8»"))){
				ShopInventories.openFlowersShop(p);
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lGen Walls &8»"))){
				p.performCommand("gb");
				e.setCancelled(true);
				return;
			}
			if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &3&lEnchantment Items &8»"))){
				ShopInventories.openEnchantShop(p);
				e.setCancelled(true);
				return;
			}
			e.setCancelled(true);
		}

		if(p.getOpenInventory().getTitle().contains(Utils.color("&8Shop (Enchant Shop)"))) {
			if (e.getSlotType().equals(SlotType.OUTSIDE)) return;
			if (!e.getCurrentItem().hasItemMeta()) return;
			ItemStack item = e.getCurrentItem();
			if (item.getType().equals(Material.STAINED_GLASS_PANE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &c&lBack &8»"))) {
				ShopInventories.openShopCategories(p);
				e.setCancelled(true);
				return;
			}

			if(item != null && item.getType() != Material.AIR) {
				if (item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().contains(Utils.color("&8« ")) && item.getItemMeta().getDisplayName().contains(Utils.color(" &8»")) && item.getItemMeta().getLore().get(1).contains(Utils.color("&a&lBUY PRICE: "))) {
					String clicked = Utils.removeColor(item.getItemMeta().getDisplayName());

					if (clicked.contains("Silk Touch I")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + p.getName() + " 403 1 silktouch:1");
									p.sendMessage(Utils.color("&a+ 1x Silk Touch I Book"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Looting IV")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " looting_iv 1");
									p.sendMessage(Utils.color("&a+ 1x Looting IV Book"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Looting V")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " looting_v 1");
									p.sendMessage(Utils.color("&a+ 1x Looting V Book"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Depth Strider I ")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " depth_strider_i 1");
									p.sendMessage(Utils.color("&a+ 1x Depth Strider I Book"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Depth Strider II ")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " depth_strider_ii 1");
									p.sendMessage(Utils.color("&a+ 1x Depth Strider II Book"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Depth Strider III")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " depth_strider_iii 1");
									p.sendMessage(Utils.color("&a+ 1x Depth Strider III Book"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Protection Scroll")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " protection 1");
									p.sendMessage(Utils.color("&a+ 1x Protection Scroll"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Disenchant Scroll")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " disenchant 1 100");
									p.sendMessage(Utils.color("&a+ 1x Disenchant Scroll"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Common Mystery Dust")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " common_mystery_dust 1");
									p.sendMessage(Utils.color("&a+ 1x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " common_mystery_dust 64");
									p.sendMessage(Utils.color("&a+ 64x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}
						e.setCancelled(true);
						return;
					}
					if (clicked.contains("Uncommon Mystery Dust")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " uncommon_mystery_dust 1");
									p.sendMessage(Utils.color("&a+ 1x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " uncommon_mystery_dust 64");
									p.sendMessage(Utils.color("&a+ 64x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Rare Mystery Dust")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " rare_mystery_dust 1");
									p.sendMessage(Utils.color("&a+ 1x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " rare_mystery_dust 64");
									p.sendMessage(Utils.color("&a+ 64x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}
						e.setCancelled(true);
						return;
					}



					if (clicked.contains("Ultimate Mystery Dust")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " ultimate_mystery_dust 1");
									p.sendMessage(Utils.color("&a+ 1x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " ultimate_mystery_dust 64");
									p.sendMessage(Utils.color("&a+ 64x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Legendary Mystery Dust")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " legendary_mystery_dust 1");
									p.sendMessage(Utils.color("&a+ 1x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveenchantitem " + p.getName() + " legendary_mystery_dust 64");
									p.sendMessage(Utils.color("&a+ 64x Mystery Dust"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}
						e.setCancelled(true);
						return;
					}


				}
			}

		}

		if(p.getOpenInventory().getTitle().contains(Utils.color("&8Shop (Mob Drops)"))) {
			if (e.getSlotType().equals(SlotType.OUTSIDE)) return;
			if (!e.getCurrentItem().hasItemMeta()) return;
			ItemStack item = e.getCurrentItem();
			if (item.getType().equals(Material.STAINED_GLASS_PANE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &c&lBack &8»"))) {
				ShopInventories.openShopCategories(p);
				e.setCancelled(true);
				return;
			}

			if(item != null && item.getType() != Material.AIR) {
				if (item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().contains(Utils.color("&8« ")) && item.getItemMeta().getDisplayName().contains(Utils.color(" &8»")) && item.getItemMeta().getLore().get(1).contains(Utils.color("&a&lBUY PRICE: "))) {
					String clicked = Utils.removeColor(item.getItemMeta().getDisplayName());
					if (clicked.contains("Ender Pearl")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + p.getName() + " enderpearl 1");
									p.sendMessage(Utils.color("&a+ 1x Ender Pearl"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + p.getName() + " enderpearl 16");
									p.sendMessage(Utils.color("&a+ 16x Ender Pearl"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}

						if(e.getClick() == ClickType.RIGHT && item.getItemMeta().getLore().get(3).contains(Utils.color("&c&lSELL PRICE:"))){
							if(p.getInventory().contains(item.getType())){
								double itemPrice = Utils.getSingleSellPrice(item);
								OneShotShop.econ.depositPlayer(p, itemPrice);
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c- 1x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a+ $" + sPrice));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);

								}
								else{
									p.sendMessage(Utils.color("&c- 1x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a+ $" + Utils.getSingleSellPrice(item)));
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
							double itemPrice = Utils.getSingleSellPrice(item)*16;
							if(p.getInventory().contains(item.getType(), 16)){
								OneShotShop.econ.depositPlayer(p, itemPrice);
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c- 16x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a+ $" + sPrice));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
									e.setCancelled(true);
								}
								else{
									p.sendMessage(Utils.color("&c- 16x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a+ $" + Utils.getStackSellPrice(item)));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
								}
								Utils.removeItem(p.getInventory(), item.getType(), item.getDurability(), 16);
								e.setCancelled(true);
							}
							else{
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have that item to sell."));
								e.setCancelled(true);
							}
							return;






						}


						e.setCancelled(true);
						return;
					}
				}
			}

		}



		if(p.getOpenInventory().getTitle().contains(Utils.color("&8Shop (Specialty Items)"))) {
			if (e.getSlotType().equals(SlotType.OUTSIDE)) return;
			if (!e.getCurrentItem().hasItemMeta()) return;
			ItemStack item = e.getCurrentItem();
			if (item.getType().equals(Material.STAINED_GLASS_PANE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &c&lBack &8»"))) {
				ShopInventories.openShopCategories(p);
				e.setCancelled(true);
				return;
			}

			if(item != null && item.getType() != Material.AIR) {
				if (item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().contains(Utils.color("&8« ")) && item.getItemMeta().getDisplayName().contains(Utils.color(" &8»")) && item.getItemMeta().getLore().get(1).contains(Utils.color("&a&lBUY PRICE: "))) {
					String clicked = Utils.removeColor(item.getItemMeta().getDisplayName());
					if (clicked.contains("TNT Wand")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givetntwand " + p.getName());
									p.sendMessage(Utils.color("&a+ 1x TNT Wand"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}
					if (clicked.contains("Sand Wand")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givesandwand " + p.getName());
									p.sendMessage(Utils.color("&a+ 1x Sand Wand"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}
					if (clicked.contains("Chunk Collector")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givecollector " + p.getName() + " 1.0 1");
									p.sendMessage(Utils.color("&a+ 1x Chunk Collector"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givecollector " + p.getName() + " 1.0 64");
									p.sendMessage(Utils.color("&a+ 64x Chunk Collector"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Charge Rod")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givechargerod " + p.getName() + " 100");
									p.sendMessage(Utils.color("&a+ 1x Charge Rod"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givechargerod " + p.getName() + " 6400");
									p.sendMessage(Utils.color("&a+ 1x 6,400 Use Charge Rod"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Tray Pickaxe")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givetraypick " + p.getName() + " 5");
									p.sendMessage(Utils.color("&a+ 1x Tray Pickaxe"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Harvest Hoe")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveharvesthoe " + p.getName() + " 250000");
									p.sendMessage(Utils.color("&a+ 1x Harvest Hoe"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Large Water Bucket")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givebucket " + p.getName() + " 250000");
									p.sendMessage(Utils.color("&a+ 1x Large Water Bucket"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}

					if (clicked.contains("Mob Sword")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givesword " + p.getName() + "");
									p.sendMessage(Utils.color("&a+ 1x Mob Sword"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}
				}
			}
		}






		if(p.getOpenInventory().getTitle().contains(Utils.color("&8Shop (Raid Shop)"))) {
			if (e.getSlotType().equals(SlotType.OUTSIDE)) return;
			if (!e.getCurrentItem().hasItemMeta()) return;
			ItemStack item = e.getCurrentItem();
			if (item.getType().equals(Material.STAINED_GLASS_PANE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &c&lBack &8»"))) {
				ShopInventories.openShopCategories(p);
				e.setCancelled(true);
				return;
			}
			if(item != null && item.getType() != Material.AIR) {
				if (item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().contains(Utils.color("&8« ")) && item.getItemMeta().getDisplayName().contains(Utils.color(" &8»")) && item.getItemMeta().getLore().get(1).contains(Utils.color("&a&lBUY PRICE: "))) {
					String clicked = Utils.removeColor(item.getItemMeta().getDisplayName());
					if (clicked.contains("Sand Bot")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givesandbot " + p.getName());
									p.sendMessage(Utils.color("&a+ 1x Sand Bot"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							p.sendMessage(Utils.color("&c&l(!)&c This item cannot be purchased as a stack"));
							e.setCancelled(true);
							return;
						}
						e.setCancelled(true);
						return;
					}
					if (clicked.contains("Throwable C-Egg")) {
						double bal = OneShotShop.econ.getBalance(p);

						if (e.getClick() == ClickType.LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item);
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "cegg give normal " + p.getName() + " 1");
									p.sendMessage(Utils.color("&a+ 1x Throwable C-Egg"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}

						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if (bal >= itemPrice) {
								if (Utils.isInvFull(p)) {
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if (r.transactionSuccess()) {
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if (subPrice.equals("0")) {
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "cegg give normal " + p.getName() + " 64");
									p.sendMessage(Utils.color("&a+ 64x Throwable C-Egg"));
								}
							} else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}
						e.setCancelled(true);
						return;
					}
				}
			}
		}

		if(p.getOpenInventory().getTitle().contains(Utils.color("&8Shop (")) && !Utils.removeColor(p.getOpenInventory().getTitle()).contains("Spawners")){
			if(e.getSlotType().equals(SlotType.OUTSIDE)) return;
			if(!e.getCurrentItem().hasItemMeta()){
			}
			ItemStack item = e.getCurrentItem();
			if(item.getType().equals(Material.STAINED_GLASS_PANE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &c&lBack &8»"))){
				ShopInventories.openShopCategories(p);
				e.setCancelled(true);
				return;
			}
			if(item != null && item.getType() != Material.AIR){
				if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().contains(Utils.color("&8« ")) && item.getItemMeta().getDisplayName().contains(Utils.color(" &8»")) && item.getItemMeta().getLore().get(1).contains(Utils.color("&a&lBUY PRICE: "))){
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
									p.sendMessage(Utils.color("&c- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								else{
									p.sendMessage(Utils.color("&c- $" + Utils.getSingleBuyPrice(item)));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								p.getInventory().addItem(new ItemStack(item.getType(), 1, (short) item.getDurability()));
								p.sendMessage(Utils.color("&a+ 1x " + ItemNames.lookupItem(item)));
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									else{
										p.sendMessage(Utils.color("&c- $" + Utils.getSingleBuyPrice(item)));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									p.getInventory().addItem(new ItemStack(item.getType(), 1, (short) item.getDurability()));
									p.sendMessage(Utils.color("&a+ 1x " + ItemNames.lookupItem(item)));
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
										p.sendMessage(API.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									else{
										p.sendMessage(API.color("&c- $" + API.getSingleBuyPrice(item)));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									p.getInventory().addItem(new ItemStack(item.getType(), 1, (short) item.getDurability()));
									p.sendMessage(API.color("&a+ 1x " + ItemNames.lookupItem(item)));
									if(item.getType() == Material.POTION){
										Main.econ.depositPlayer(p, 4725);
									}
								}*/
								//else{
									String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
									if(subPrice.equals("0")){
										String sPrice = String.valueOf(itemPrice).replace(".0", "");
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									else{
										p.sendMessage(Utils.color("&c- $" + Utils.getStackBuyPrice(item)));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									p.getInventory().addItem(new ItemStack(item.getType(), 64, (short) item.getDurability()));
									p.sendMessage(Utils.color("&a+ 64x " + ItemNames.lookupItem(item)));
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
								p.sendMessage(Utils.color("&c- 1x " + ItemNames.lookupItem(item)));
								p.sendMessage(Utils.color("&a+ $" + sPrice));
								p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);

							}
							else{
								p.sendMessage(Utils.color("&c- 1x " + ItemNames.lookupItem(item)));
								p.sendMessage(Utils.color("&a+ $" + Utils.getSingleSellPrice(item)));
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
									p.sendMessage(Utils.color("&c- 1x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a+ $" + sPrice));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
								}
								else{
									p.sendMessage(Utils.color("&c- 1x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a+ $" + Utils.getSingleSellPrice(item)));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
								}
								Utils.removeItem(p.getInventory(), item.getType(), item.getDurability(), 1);
							}
							return;
						} else {
							if(p.getInventory().contains(item.getType(), 64)){
								String subPrice = String.valueOf(itemPrice).substring(String.valueOf(itemPrice).lastIndexOf(".") + 1);
								if(subPrice.equals("0")){
									String sPrice = String.valueOf(itemPrice).replace(".0", "");
									p.sendMessage(Utils.color("&c- 64x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a+ $" + sPrice));
									p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
									e.setCancelled(true);
								}
								else{
									p.sendMessage(Utils.color("&c- 64x " + ItemNames.lookupItem(item)));
									p.sendMessage(Utils.color("&a+ $" + Utils.getStackSellPrice(item)));
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
			if(item.getType().equals(Material.STAINED_GLASS_PANE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().equals(Utils.color("&8« &c&lBack &8»"))){
				ShopInventories.openShopCategories(p);
				e.setCancelled(true);
				return;
			}
			if(item != null && item.getType() != Material.AIR){
				if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().hasLore() && item.getItemMeta().getDisplayName().contains(Utils.color("&8« ")) && item.getItemMeta().getDisplayName().contains(Utils.color(" &8»")) && item.getItemMeta().getLore().get(1).contains(Utils.color("&a&lBUY PRICE: "))){
					String clicked = Utils.removeColor(item.getItemMeta().getDisplayName());
					if(clicked.contains("Chicken Spawner")) {
						double bal = OneShotShop.econ.getBalance(p);
						if (e.getClick() == ClickType.RIGHT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner chicken 1");
									p.sendMessage(Utils.color("&a+ 1x Chicken Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_RIGHT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner chicken 64");
									p.sendMessage(Utils.color("&a+ 64x Chicken Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}



					}
					if(clicked.contains("Pig Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						if (e.getClick() == ClickType.RIGHT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner pig 1");
									p.sendMessage(Utils.color("&a+ 1x Pig Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_RIGHT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner pig 64");
									p.sendMessage(Utils.color("&a+ 64x Pig Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}

					}
					if(clicked.contains("Cave Spider Spawner")){
						double bal = OneShotShop.econ.getBalance(p);
						if (e.getClick() == ClickType.RIGHT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner cave_spider 1");
									p.sendMessage(Utils.color("&a+ 1x Cave Spider Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_RIGHT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner cave_spider 64");
									p.sendMessage(Utils.color("&a+ 64x Cave Spider Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
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
									p.sendMessage(Utils.color("&c- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner spider 1");
								p.sendMessage(Utils.color("&a+ 1x Spider Spawner"));
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
									p.sendMessage(Utils.color("&c- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner sheep 1");
								p.sendMessage(Utils.color("&a+ 1x Sheep Spawner"));
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
									p.sendMessage(Utils.color("&c- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner wolf 1");
								p.sendMessage(Utils.color("&a+ 1x Wolf Spawner"));
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
						if (e.getClick() == ClickType.LEFT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner skeleton 1");
									p.sendMessage(Utils.color("&a+ 1x Skeleton Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if(bal >= itemPrice){
								if(Utils.isInvFull(p)){
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if(r.transactionSuccess()){
									DecimalFormat n = new DecimalFormat("#");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner skeleton 64");
									p.sendMessage(Utils.color("&c- $" + n.format(itemPrice)));
									p.sendMessage(Utils.color("&a+ 64x Skeleton Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}

					}
					if(clicked.contains("Zombie Spawner")){

						double bal = OneShotShop.econ.getBalance(p);
						if (e.getClick() == ClickType.LEFT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner zombie 1");
									p.sendMessage(Utils.color("&a+ 1x Zombie Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if(bal >= itemPrice){
								if(Utils.isInvFull(p)){
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if(r.transactionSuccess()){
									DecimalFormat n = new DecimalFormat("#");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner zombie 64");
									p.sendMessage(Utils.color("&c- $" + n.format(itemPrice)));
									p.sendMessage(Utils.color("&a+ 64x Zombie Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}

					}
					if(clicked.contains("Cow Spawner")){

						double bal = OneShotShop.econ.getBalance(p);
						if (e.getClick() == ClickType.LEFT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner cow 1");
									p.sendMessage(Utils.color("&a+ 1x Cow Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if(bal >= itemPrice){
								if(Utils.isInvFull(p)){
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if(r.transactionSuccess()){
									DecimalFormat n = new DecimalFormat("#");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner cow 64");
									p.sendMessage(Utils.color("&c- $" + n.format(itemPrice)));
									p.sendMessage(Utils.color("&a+ 64x Cow Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}

					}
					if(clicked.contains("Enderman Spawner")){

						double bal = OneShotShop.econ.getBalance(p);
						if (e.getClick() == ClickType.LEFT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner enderman 1");
									p.sendMessage(Utils.color("&a+ 1x Enderman Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if(bal >= itemPrice){
								if(Utils.isInvFull(p)){
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if(r.transactionSuccess()){
									DecimalFormat n = new DecimalFormat("#");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner enderman 64");
									p.sendMessage(Utils.color("&c- $" + n.format(itemPrice)));
									p.sendMessage(Utils.color("&a+ 64x Enderman Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
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
									p.sendMessage(Utils.color("&c- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner pig_zombie 1");
								p.sendMessage(Utils.color("&a+ 1x Zombie Pigman Spawner"));
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
						if (e.getClick() == ClickType.LEFT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner creeper 1");
									p.sendMessage(Utils.color("&a+ 1x Creeper Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if(bal >= itemPrice){
								if(Utils.isInvFull(p)){
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if(r.transactionSuccess()){
									DecimalFormat n = new DecimalFormat("#");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner creeper 64");
									p.sendMessage(Utils.color("&c- $" + n.format(itemPrice)));
									p.sendMessage(Utils.color("&a+ 64x Creeper Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}

					}
					if(clicked.contains("Blaze Spawner")){

						double bal = OneShotShop.econ.getBalance(p);
						if (e.getClick() == ClickType.LEFT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner blaze 1");
									p.sendMessage(Utils.color("&a+ 1x Blaze Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if(bal >= itemPrice){
								if(Utils.isInvFull(p)){
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if(r.transactionSuccess()){
									DecimalFormat n = new DecimalFormat("#");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner blaze 64");
									p.sendMessage(Utils.color("&c- $" + n.format(itemPrice)));
									p.sendMessage(Utils.color("&a+ 64x Blaze Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
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
									p.sendMessage(Utils.color("&c- $" + sPrice));
									p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner slime 1");
								p.sendMessage(Utils.color("&a+ 1x Slime Spawner"));
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
						if (e.getClick() == ClickType.LEFT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner iron_golem 1");
									p.sendMessage(Utils.color("&a+ 1x Iron Golem Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if(bal >= itemPrice){
								if(Utils.isInvFull(p)){
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if(r.transactionSuccess()){
									DecimalFormat n = new DecimalFormat("#");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stacker give -s " + p.getName() + " spawner iron_golem 64");
									p.sendMessage(Utils.color("&c- $" + n.format(itemPrice)));
									p.sendMessage(Utils.color("&a+ 64x Iron Golem Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}

					}
					if(clicked.contains("Mystery Spawner")){

						double bal = OneShotShop.econ.getBalance(p);
						if (e.getClick() == ClickType.LEFT) {
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
										p.sendMessage(Utils.color("&c- $" + sPrice));
										p.playSound(p.getLocation(), Sound.SUCCESSFUL_HIT, 1, 1);
									}
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " mystery 1");
									p.sendMessage(Utils.color("&a+ 1x Skeleton Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						} else if (e.getClick() == ClickType.SHIFT_LEFT) {
							double itemPrice = Utils.getSingleBuyPrice(item)*64;
							if(bal >= itemPrice){
								if(Utils.isInvFull(p)){
									p.sendMessage(Utils.color("&c&l(!) &cYou can't buy items while your inventory is full!"));
									e.setCancelled(true);
									return;
								}
								EconomyResponse r = OneShotShop.econ.withdrawPlayer(p, itemPrice);
								if(r.transactionSuccess()){
									DecimalFormat n = new DecimalFormat("#");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givespawner " + p.getName() + " mystery 64");
									p.sendMessage(Utils.color("&c- $" + n.format(itemPrice)));
									p.sendMessage(Utils.color("&a+ 64x Mystery Spawner Spawner"));
								}
							}
							else {
								p.sendMessage(Utils.color("&c&l(!) &cYou do not have enough money to buy that."));
								e.setCancelled(true);
								return;
							}
						}

					}
					e.setCancelled(true);
				}
			}
		}
	}

}
