package me.classified.shop.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShopInventories {

	public static ItemStack back = Utils.itemBuilder(Material.STAINED_GLASS_PANE, (short) 14, 1, "&7» &c&lBack &7«", new String[]{"&7Click to view categories."} , false);
	
	public static void closeShop(Player p){
		p.closeInventory();
	}
	
	String arrows = "»«";

	public static void openShopCategories(Player p){
		ItemStack spacer = Utils.itemBuilder(Material.STAINED_GLASS_PANE, (short) 0, "&f&l???", null, false);
		ItemStack raid = Utils.itemBuilder(Material.TNT, (short) 0, 1, "&7» &d&lRaid Shop &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack spawners = Utils.itemBuilder(Material.MOB_SPAWNER, (short) 0, 1, "&7» &d&lSpawners &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack buildingBlocks = Utils.itemBuilder(Material.STONE, (short) 0, 1, "&7» &d&lBuilding Blocks &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack ores = Utils.itemBuilder(Material.DIAMOND, (short) 0, 1, "&7» &d&lOres and Valuables &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack food = Utils.itemBuilder(Material.COOKED_BEEF, (short) 0, 1, "&7» &d&lFood and Farming &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack mobDrops = Utils.itemBuilder(Material.BONE, (short) 0, 1, "&7» &d&lMob Drops &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack specialty = Utils.itemBuilder(Material.EYE_OF_ENDER, (short) 0, 1, "&7» &d&lSpecialty Items &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack brewing = Utils.itemBuilder(Material.BREWING_STAND_ITEM, (short) 0, 1, "&7» &d&lBrewing and Potions &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack wool = Utils.itemBuilder(Material.WOOL, (short) 0, 1, "&7» &d&lWool &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack glass = Utils.itemBuilder(Material.STAINED_GLASS, (short) 2, 1, "&7» &d&lGlass &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack clay = Utils.itemBuilder(Material.STAINED_CLAY, (short) 0, 1, "&7» &d&lClay &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack flowers = Utils.itemBuilder(Material.RED_ROSE, (short) 0, 1, "&7» &d&lFlowers &7«", new String[]{"&7Click to view items in this category."}, false);
		ItemStack genWalls = Utils.itemBuilder(Material.LAVA_BUCKET, (short) 0, 1, "&7» &d&lGen Walls &7«", new String[]{"&7Click to view items in this category."}, false);

		Inventory inv = Bukkit.createInventory(p, 18, Utils.color("&8Shop Categories"));
		for(int i = 0; i < 18; i++){
			inv.setItem(i, spacer);
		}
		inv.setItem(1, raid);
		inv.setItem(2, spawners);
		inv.setItem(3, buildingBlocks);
		inv.setItem(4, wool);
		inv.setItem(5, glass);
		inv.setItem(6, clay);
		inv.setItem(7, brewing);
		inv.setItem(11, ores);
		inv.setItem(12, food);
		inv.setItem(13, mobDrops);
		inv.setItem(14, specialty);
		inv.setItem(15, flowers);
		
		inv.setItem(17, genWalls);


		p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1, 1);
		p.openInventory(inv);
	}

	public static void openPotionShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 18, Utils.color("&8Shop (Potion Shop)"));
		
		inv.setItem(17, back);
		
		p.openInventory(inv);
	}

	public static void openRaidShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 27, Utils.color("&8Shop (Raid Shop)"));

		ItemStack redstone = Utils.createShopItem(Material.REDSTONE, (short) 0, "&7» &d&lRedstone &7«", 16.25, 0.23);
		ItemStack spiston = Utils.createShopItem(Material.PISTON_STICKY_BASE, (short) 0, "&7» &d&lSticky Piston &7«", 325, 0);
		ItemStack piston = Utils.createShopItem(Material.PISTON_BASE, (short) 0, "&7» &d&lPiston &7«", 195, 0);
		ItemStack stone = Utils.createShopItem(Material.STONE, (short) 0, "&7» &d&lStone &7«", 5.47, 1.48);
		ItemStack glowstone = Utils.createShopItem(Material.GLOWSTONE, (short) 0, "&7» &d&lGlowstone &7«",7.03, 2.50);
		ItemStack sand = Utils.createShopItem(Material.SAND, (short) 0, "&7» &d&lSand &7«", 4.06, 0);
		ItemStack redsand = Utils.createShopItem(Material.SAND, (short) 1, "&7» &d&lRed Sand &7«", 3.05, 0);
		ItemStack ice = Utils.createShopItem(Material.ICE, (short) 0, "&7» &d&lIce &7«", 50, 0);
		ItemStack cobweb = Utils.createShopItem(Material.WEB, (short) 0, "&7» &d&lCobweb &7«", 40, 0);
		ItemStack sponge = Utils.createShopItem(Material.SPONGE, (short) 0, "&7» &d&lSponge &7«", 2000, 0);
		ItemStack quartz = Utils.createShopItem(Material.QUARTZ, (short) 0, "&7» &d&lQuartz &7«", 3.05, 0);
		ItemStack tnt = Utils.createShopItem(Material.TNT, (short) 0, "&7» &d&lTNT &7«", 81.25, 8.12);
		ItemStack glass = Utils.createShopItem(Material.GLASS, (short) 0, "&7» &d&lGlass &7«", 4.06, 0);
		ItemStack water = Utils.createShopItem(Material.WATER_BUCKET, (short) 0, "&7» &d&lWater Bucket &7«", 500, 0);
		ItemStack lava = Utils.createShopItem(Material.LAVA_BUCKET, (short) 0, "&7» &d&lLava Bucket &7«", 500, 0);
		ItemStack stoneslab = Utils.createShopItem(Material.STONE_SLAB2, (short) 0, "&7» &d&lStone Slab &7«",80.86, 0);
		ItemStack redstonetorch = Utils.createShopItem(Material.REDSTONE_TORCH_ON, (short) 0, "&7» &d&lRedstone Torch &7«", 25, 0);
		ItemStack comparator = Utils.createShopItem(Material.REDSTONE_COMPARATOR, (short) 0, "&7» &d&lRedstone Comparator &7«", 100, 0);
		ItemStack repeater = Utils.createShopItem(Material.DIODE, (short) 0, "&7» &d&lRedstone Repeater &7«", 85, 0);
		ItemStack dispenser = Utils.createShopItem(Material.DISPENSER, (short) 0, "&7» &d&lDispenser &7«", 819, 0);
		ItemStack dropper = Utils.createShopItem(Material.DROPPER, (short) 0, "&7» &d&lDropper &7«", 100, 0);
		ItemStack ladder = Utils.createShopItem(Material.LADDER, (short) 0, "&7» &d&lLadder &7«", 10, 0);
		ItemStack cegg = Utils.createShopItem(Material.MONSTER_EGG, (short) 50, "&7» &d&lCreeper Egg &7«", 250000, 0);
		ItemStack button = Utils.createShopItem(Material.STONE_BUTTON, (short) 0, "&7» &d&lButton &7«", 5.50, 0);
		ItemStack lever = Utils.createShopItem(Material.LEVER, (short) 0, "&7» &d&lLever &7«", 20, 0);
		
		inv.setItem(0, redstone);
		inv.setItem(1, spiston);
		inv.setItem(2, piston);
		inv.setItem(3, stone);
		inv.setItem(4, glowstone);
		inv.setItem(5, sand);
		inv.setItem(6, redsand);
		inv.setItem(7, ice);
		inv.setItem(8, cobweb);
		inv.setItem(9, sponge);
		inv.setItem(10, quartz);
		inv.setItem(11, tnt);
		inv.setItem(12, glass);
		inv.setItem(13, water);
		inv.setItem(14, lava);
		inv.setItem(15, stoneslab);
		inv.setItem(16, redstonetorch);
		inv.setItem(17, comparator);
		inv.setItem(18, repeater);
		inv.setItem(19, dispenser);
		inv.setItem(20, dropper);
		inv.setItem(21, ladder);
		inv.setItem(22, cegg);
		inv.setItem(23, button);
		inv.setItem(24, lever);
		
		inv.setItem(26, back);
		
		p.openInventory(inv);
	}

	public static void openSpawnerShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 18, Utils.color("&8Shop (Spawners)"));

		ItemStack chicken = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lChicken Spawner &7«", 65000, 0);
		ItemStack pig = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lPig Spawner &7«", 65000, 0);
		ItemStack cspider = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lCave Spider Spawner &7«", 90000, 0);
		ItemStack spider = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lSpider Spawner &7«", 95000, 0);
		ItemStack sheep = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lSheep Spawner &7«", 95000, 0);
		ItemStack wolf = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lWolf Spawner &7«", 97500, 0);
		ItemStack skeleton = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lSkeleton Spawner &7«", 115000, 0);
		ItemStack zombie = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lZombie Spawner &7«", 115000, 0);
		ItemStack cow = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lCow Spawner &7«", 162500, 0);
		ItemStack enderman = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lEnderman Spawner &7«", 390000, 0);
		ItemStack zpigman = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lZombie Pigman Spawner &7«", 390000, 0);
		ItemStack creeper = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lCreeper Spawner &7«", 390000, 0);
		ItemStack blaze = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lBlaze Spawner &7«", 390000, 0);
		ItemStack slime = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lSlime Spawner &7«", 1300000, 0);
		ItemStack ig = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lIron Golem Spawner &7«", 2000000, 0);
		ItemStack mystery = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&7» &d&lMystery Spawner &7«", 4000000, 0);
		
		inv.setItem(0, chicken);
		inv.setItem(1, pig);
		inv.setItem(2, cspider);
		inv.setItem(3, spider);
		inv.setItem(4, sheep);
		inv.setItem(5, wolf);
		inv.setItem(6, skeleton);
		inv.setItem(7, zombie);
		inv.setItem(8, cow);
		inv.setItem(9, enderman);
		inv.setItem(10, zpigman);
		inv.setItem(11, creeper);
		inv.setItem(12, blaze);
		inv.setItem(13, slime);
		inv.setItem(14, ig);
		inv.setItem(15, mystery);
		
		inv.setItem(17, back);
		
		p.openInventory(inv);
	}

	public static void openBuildingBlocksShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 36, Utils.color("&8Shop (Building Blocks)"));

		ItemStack grass = Utils.createShopItem(Material.GRASS, (short) 0, "&7» &d&lGrass &7«", 3, 0.70);
		ItemStack oaklog = Utils.createShopItem(Material.LOG, (short) 0, "&7» &d&lOak Log &7«", 8.12, 2.03);
		ItemStack sprucelog = Utils.createShopItem(Material.LOG, (short) 1, "&7» &d&lSpruce Log &7«", 8.12, 2.03);;
		ItemStack birchlog = Utils.createShopItem(Material.LOG, (short) 2, "&7» &d&lBirch Log &7«", 8.12, 2.03);
		ItemStack junglelog = Utils.createShopItem(Material.LOG, (short) 3, "&7» &d&lJungle Log &7«", 8.12, 2.03);
		ItemStack acacialog = Utils.createShopItem(Material.LOG_2, (short) 0, "&7» &d&lAcacia Log &7«", 8.12, 2.03);
		ItemStack darkoaklog = Utils.createShopItem(Material.LOG_2, (short) 1, "&7» &d&lDark Oak Log &7«", 8.12, 2.03);
		ItemStack dirt = Utils.createShopItem(Material.DIRT, (short) 0, "&7» &d&lDirt &7«", 3, 0.70);
		ItemStack podzol = Utils.createShopItem(Material.DIRT, (short) 2, "&7» &d&lPodzol &7«", 10.94, 3.75);
		ItemStack mycelium = Utils.createShopItem(Material.MYCEL, (short) 0, "&7» &d&lMycelium &7«", 10.16, 3.75);
		ItemStack stone = Utils.createShopItem(Material.STONE, (short) 0, "&7» &d&lStone &7«", 5.47, 1.84);
		ItemStack cobblestone = Utils.createShopItem(Material.COBBLESTONE, (short) 0, "&7» &d&lCobblestone &7«", 4.06, 1.02);
		ItemStack stonebrick = Utils.createShopItem(Material.SMOOTH_BRICK, (short) 0, "&7» &d&lStone Brick &7«", 6.56, 0);
		ItemStack mossystonebrick = Utils.createShopItem(Material.SMOOTH_BRICK, (short) 1, "&7» &d&lMossy Stone Brick &7«", 6.56, 0);
		ItemStack crackedstonebrick = Utils.createShopItem(Material.SMOOTH_BRICK, (short) 2, "&7» &d&lCracked Stone Brick &7«", 6.56, 0);
		ItemStack chiseledstonebrick = Utils.createShopItem(Material.SMOOTH_BRICK, (short) 3, "&7» &d&lChiseled Stone Brick &7«", 6.56, 0);
		ItemStack sandstone = Utils.createShopItem(Material.SANDSTONE, (short) 0, "&7» &d&lSandstone &7«", 12.19, 0);
		ItemStack chiseledsandstone = Utils.createShopItem(Material.SANDSTONE, (short) 0, "&7» &d&lChiseled Sandstone &7«", 12.19, 0);
		ItemStack smoothsandstone = Utils.createShopItem(Material.SANDSTONE, (short) 0, "&7» &d&lSmooth Sandstone &7«", 48.75, 0);
		ItemStack quartzblock = Utils.createShopItem(Material.QUARTZ_BLOCK, (short) 0, "&7» &d&lQuartz Block &7«", 12.19, 0);
		ItemStack chiseledquartzblock = Utils.createShopItem(Material.QUARTZ_BLOCK, (short) 1, "&7» &d&lChiseled Quartz Block &7«", 48.75, 0);
		ItemStack pillarquartzblock = Utils.createShopItem(Material.QUARTZ_BLOCK, (short) 2, "&7» &d&lPillar Quartz Block &7«", 12.19, 0);
		ItemStack netherrack = Utils.createShopItem(Material.NETHERRACK, (short) 0, "&7» &d&lNetherrack &7«", 2.34, 0.94);
		ItemStack netherbrick = Utils.createShopItem(Material.NETHER_BRICK, (short) 0, "&7» &d&lNether Brick &7«", 5.74, 0);
		ItemStack glowstone = Utils.createShopItem(Material.GLOWSTONE, (short) 0, "&7» &d&lGlowstone &7«", 7.03, 2.50);
		ItemStack soulsand = Utils.createShopItem(Material.SOUL_SAND, (short) 0, "&7» &d&lSoul Sand &7«", 7.06, 0);
		ItemStack endstone = Utils.createShopItem(Material.ENDER_STONE, (short) 0, "&7» &d&lEnd Stone &7«", 7.03, 0);
		ItemStack sand = Utils.createShopItem(Material.SAND, (short) 0, "&7» &d&lSand &7«", 4.06, 0);
		ItemStack redsand = Utils.createShopItem(Material.SAND, (short) 1, "&7» &d&lRed Sand &7«", 3.05, 0);
		ItemStack gravel = Utils.createShopItem(Material.GRAVEL, (short) 0, "&7» &d&lGravel &7«", 3.52, 0);
		ItemStack obsidian = Utils.createShopItem(Material.OBSIDIAN, (short) 0, "&7» &d&lObsidian &7«", 14.84, 5.47);
		ItemStack ice = Utils.createShopItem(Material.ICE, (short) 0, "&7» &d&lIce &7«", 50, 0);
		ItemStack packedice = Utils.createShopItem(Material.PACKED_ICE, (short) 0, "&7» &d&lPacked Ice &7«", 75, 0);
		ItemStack snow = Utils.createShopItem(Material.SNOW_BLOCK, (short) 0, "&7» &d&lSnow &7«", 250, 0);
		
		inv.setItem(0, grass);
		inv.setItem(1, oaklog);
		inv.setItem(2, sprucelog);
		inv.setItem(3, birchlog);
		inv.setItem(4, junglelog);
		inv.setItem(5, acacialog);
		inv.setItem(6, darkoaklog);
		inv.setItem(7, dirt);
		inv.setItem(8, podzol);
		inv.setItem(9, mycelium);
		inv.setItem(10, stone);
		inv.setItem(11, cobblestone);
		inv.setItem(12, stonebrick);
		inv.setItem(13, mossystonebrick);
		inv.setItem(14, crackedstonebrick);
		inv.setItem(15, chiseledstonebrick);
		inv.setItem(16, sandstone);
		inv.setItem(17, chiseledsandstone);
		inv.setItem(18, smoothsandstone);
		inv.setItem(19, quartzblock);
		inv.setItem(20, chiseledquartzblock);
		inv.setItem(21, pillarquartzblock);
		inv.setItem(22, netherrack);
		inv.setItem(23, netherbrick);
		inv.setItem(24, glowstone);
		inv.setItem(25, soulsand);
		inv.setItem(26, endstone);
		inv.setItem(27, sand);
		inv.setItem(28, redsand);
		inv.setItem(29, gravel);
		inv.setItem(30, obsidian);
		inv.setItem(31, ice);
		inv.setItem(32, packedice);
		inv.setItem(33, snow);
		
		inv.setItem(35, back);
		
		p.openInventory(inv);
	}

	public static void openOresShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 18, Utils.color("&8Shop (Ores and Valuables)"));
		
		ItemStack coal = Utils.createShopItem(Material.COAL, (short) 0, "&7» &d&lCoal &7«", 9.06, 0.94);
		ItemStack coalb = Utils.createShopItem(Material.COAL_BLOCK, (short) 0, "&7» &d&lCoal Block &7«", 80, 8);
		ItemStack redstone = Utils.createShopItem(Material.REDSTONE, (short) 0, "&7» &d&lRedstone &7«", 16.25, 0.94);
		ItemStack redstoneb = Utils.createShopItem(Material.REDSTONE_BLOCK, (short) 0, "&7» &d&lRedstone Block &7«", 195, 10);
		ItemStack lapis = Utils.createShopItem(Material.INK_SACK, (short) 4, "&7» &d&lLapis &7«", 18.12, 1.25);
		ItemStack lapisb = Utils.createShopItem(Material.LAPIS_BLOCK, (short) 0, "&7» &d&lLapis Block &7«", 160, 9);
		ItemStack iron = Utils.createShopItem(Material.IRON_INGOT, (short) 0, "&7» &d&lIron Ingot &7«", 130, 40);
		ItemStack ironb = Utils.createShopItem(Material.IRON_BLOCK, (short) 0, "&7» &d&lIron Block &7«", 1170, 350);
		ItemStack gold = Utils.createShopItem(Material.GOLD_INGOT, (short) 0, "&7» &d&lGold Ingot &7«", 100, 50);
		ItemStack goldb = Utils.createShopItem(Material.GOLD_BLOCK, (short) 0, "&7» &d&lGold Block &7«", 1850, 450);
		ItemStack diamond = Utils.createShopItem(Material.DIAMOND, (short) 0, "&7» &d&lDiamond &7«", 390, 100);
		ItemStack diamondb = Utils.createShopItem(Material.DIAMOND_BLOCK, (short) 0, "&7» &d&lDiamond Block &7«", 3500, 800);
		ItemStack emerald = Utils.createShopItem(Material.EMERALD, (short) 0, "&7» &d&lEmerald &7«", 1150, 200);
		ItemStack emeraldb = Utils.createShopItem(Material.EMERALD_BLOCK, (short) 0, "&7» &d&lEmerald Block &7«", 8775, 1250);
		
		inv.setItem(0, coal);
		inv.setItem(1, coalb);
		inv.setItem(2, redstone);
		inv.setItem(3, redstoneb);
		inv.setItem(4, lapis);
		inv.setItem(5, lapisb);
		inv.setItem(6, iron);
		inv.setItem(7, ironb);
		inv.setItem(8, gold);
		inv.setItem(9, goldb);
		inv.setItem(10, diamond);
		inv.setItem(11, diamondb);
		inv.setItem(12, emerald);
		inv.setItem(13, emeraldb);
		
		inv.setItem(17, back);
		
		p.openInventory(inv);
	}

	public static void openFoodShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 27, Utils.color("&8Shop (Food and Fariming)"));

		ItemStack mseeds = Utils.createShopItem(Material.MELON_SEEDS, (short) 0, "&7» &d&lMelon Seeds &7«", 3.44, 0);
		ItemStack pseeds = Utils.createShopItem(Material.PUMPKIN_SEEDS, (short) 0, "&7» &d&lPumpkin Seeds &7«", 3.44, 0);
		ItemStack seeds = Utils.createShopItem(Material.SEEDS, (short) 0, "&7» &d&lSeeds &7«", 3.19, 0);
		ItemStack cactus = Utils.createShopItem(Material.CACTUS, (short) 0, "&7» &d&lCactus &7«", 18.75, 3.75);
		ItemStack sugarcane = Utils.createShopItem(Material.SUGAR_CANE, (short) 0, "&7» &d&lSugar Cane &7«", 16.25, 3.12);
		ItemStack carrot = Utils.createShopItem(Material.CARROT_ITEM, (short) 0, "&7» &d&lCarrot &7«", 25, 1.56);
		ItemStack melon = Utils.createShopItem(Material.MELON, (short) 0, "&7» &d&lMelon &7«", 20.31, 6.25);
		ItemStack pumpkin = Utils.createShopItem(Material.PUMPKIN, (short) 0, "&7» &d&lPumpkin &7«", 325, 5.31);
		ItemStack wheat = Utils.createShopItem(Material.WHEAT, (short) 0, "&7» &d&lWheat &7«", 11.88, 6.25);
		ItemStack apple = Utils.createShopItem(Material.APPLE, (short) 0, "&7» &d&lApple &7«", 25, 10);
		ItemStack gapple = Utils.createShopItem(Material.GOLDEN_APPLE, (short) 0, "&7» &d&lGolden Apple &7«", 1500, 0);
		ItemStack cake = Utils.createShopItem(Material.CAKE, (short) 0, "&7» &d&lCake &7«", 50, 0);
		ItemStack bread = Utils.createShopItem(Material.BREAD, (short) 0, "&7» &d&lBread &7«", 31.25, 0);
		ItemStack cookie = Utils.createShopItem(Material.COOKIE, (short) 0, "&7» &d&lCookie &7«", 5.94, 0);
		ItemStack rawsteak = Utils.createShopItem(Material.RAW_BEEF, (short) 0, "&7» &d&lRaw Beef &7«", 9.38, 2.19);
		ItemStack steak = Utils.createShopItem(Material.COOKED_BEEF, (short) 0, "&7» &d&lCooked Beef &7«", 11.88, 2.81);
		ItemStack rawpork = Utils.createShopItem(Material.PORK, (short) 0, "&7» &d&lRaw Pork &7«", 10, 1.25);
		ItemStack pork = Utils.createShopItem(Material.GRILLED_PORK, (short) 0, "&7» &d&lCooked Pork &7«", 11.88, 1.88);
		
		inv.setItem(0, mseeds);
		inv.setItem(1, pseeds);
		inv.setItem(2, seeds);
		inv.setItem(3, cactus);
		inv.setItem(4, sugarcane);
		inv.setItem(5, carrot);
		inv.setItem(6, melon);
		inv.setItem(7, pumpkin);
		inv.setItem(8, wheat);
		inv.setItem(9, apple);
		inv.setItem(10, gapple);
		inv.setItem(11, cake);
		inv.setItem(12, bread);
		inv.setItem(13, cookie);
		inv.setItem(14, rawsteak);
		inv.setItem(15, steak);
		inv.setItem(16, rawpork);
		inv.setItem(17, pork);
		
		inv.setItem(26, back);
		
		p.openInventory(inv);
	}

	public static void openMobDropsShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 18, Utils.color("&8Shop (Mob Drops)"));

		ItemStack gunpowder = Utils.createShopItem(Material.SULPHUR, (short) 0, "&7» &d&lGun Powder &7«", 25, 4.38);
		ItemStack bow = Utils.createShopItem(Material.BOW, (short) 0, "&7» &d&lBow &7«", 25, 10);
		ItemStack arrow = Utils.createShopItem(Material.ARROW, (short) 0, "&7» &d&lArrow &7«", 6.25, 2.19);
		ItemStack feather = Utils.createShopItem(Material.FEATHER, (short) 0, "&7» &d&lFeather &7«", 8.12, 1.09);
		ItemStack brod = Utils.createShopItem(Material.BLAZE_ROD, (short) 0, "&7» &d&lBlaze Rod &7«", 62.51, 28.75);
		ItemStack lillypad = Utils.createShopItem(Material.WATER_LILY, (short) 0, "&7» &d&lLilly Pad &7«", 20, 0);
		ItemStack rottenflesh = Utils.createShopItem(Material.ROTTEN_FLESH, (short) 0, "&7» &d&lRotten Flesh &7«", 2.50, 1.04);
		ItemStack string = Utils.createShopItem(Material.STRING, (short) 0, "&7» &d&lString &7«", 8.12, 1.88);
		ItemStack leather = Utils.createShopItem(Material.LEATHER, (short) 0, "&7» &d&lLeather &7«", 16.25, 5.62);
		ItemStack enderpearl = Utils.createShopItem(Material.ENDER_PEARL, (short) 0, "&7» &d&lEnder Pearl &7«", 50, 25);
		ItemStack bone = Utils.createShopItem(Material.BONE, (short) 0, "&7» &d&lBone &7«", 6.25, 0.50);
		
		inv.setItem(0, gunpowder);
		inv.setItem(1, bow);
		inv.setItem(2, arrow);
		inv.setItem(3, feather);
		inv.setItem(4, brod);
		inv.setItem(5, lillypad);
		inv.setItem(6, rottenflesh);
		inv.setItem(7, string);
		inv.setItem(8, leather);
		inv.setItem(9, enderpearl);
		inv.setItem(10, bone);
		
		inv.setItem(17, back);
		
		p.openInventory(inv);
	}

	public static void openSpecialtyShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 27, Utils.color("&8Shop (Specialty Items)"));

		ItemStack chest = Utils.createShopItem(Material.CHEST, (short) 0, "&7» &d&lChest &7«", 15, 0);
		ItemStack tchest = Utils.createShopItem(Material.TRAPPED_CHEST, (short) 0, "&7» &d&lTrapped Chest &7«", 150, 0);
		ItemStack etable = Utils.createShopItem(Material.ENCHANTMENT_TABLE, (short) 0, "&7» &d&lenchantment Table &7«", 793, 0);
		ItemStack anvil = Utils.createShopItem(Material.ANVIL, (short) 0, "&7» &d&lAnvil &7«", 3543, 0);
		ItemStack echest = Utils.createShopItem(Material.ENDER_CHEST, (short) 0, "&7» &d&lEnder Chest &7«", 6430, 0);
		ItemStack beacon = Utils.createShopItem(Material.BEACON, (short) 0, "&7» &d&lBeacon &7«", 250000, 0);
		ItemStack fns = Utils.createShopItem(Material.FLINT_AND_STEEL, (short) 0, "&7» &d&lFlint And Steel &7«", 145, 0);
		ItemStack dlsensor = Utils.createShopItem(Material.DAYLIGHT_DETECTOR, (short) 0, "&7» &d&lDaylight Sensor &7«", 640, 0);
		ItemStack triphook = Utils.createShopItem(Material.TRIPWIRE_HOOK, (short) 0, "&7» &d&lTripwire Hook &7«", 100, 0);
		ItemStack hopper = Utils.createShopItem(Material.HOPPER, (short) 0, "&7» &d&lHopper &7«", 25000, 0);
		ItemStack stickypiston = Utils.createShopItem(Material.PISTON_STICKY_BASE, (short) 0, "&7» &d&lSticky Piston &7«", 325, 0);
		ItemStack piston = Utils.createShopItem(Material.PISTON_BASE, (short) 0, "&7» &d&lPiston &7«", 195, 0);
		ItemStack redstonelamp = Utils.createShopItem(Material.REDSTONE_LAMP_OFF, (short) 0, "&7» &d&lRedstone Lamp &7«", 730, 0);
		ItemStack cobweb = Utils.createShopItem(Material.WEB, (short) 0, "&7» &d&lCobweb &7«", 40, 0);
		ItemStack dispenser = Utils.createShopItem(Material.DISPENSER, (short) 0, "&7» &d&lDispenser &7«", 819, 0);
		ItemStack ice = Utils.createShopItem(Material.ICE, (short) 0, "&7» &d&lIce &7«", 50, 0);
		ItemStack packedice = Utils.createShopItem(Material.PACKED_ICE, (short) 0, "&7» &d&lPacked Ice &7«", 75, 0);
		ItemStack snow = Utils.createShopItem(Material.SNOW_BLOCK, (short) 0, "&7» &d&lSnow Block &7«", 250, 0);
		ItemStack sponge = Utils.createShopItem(Material.SPONGE, (short) 0, "&7» &d&lSponge &7«", 2000, 0);
		ItemStack netherfence = Utils.createShopItem(Material.NETHER_FENCE, (short) 0, "&7» &d&lNether Fence &7«", 4.06, 1.41);
		
		inv.setItem(0, chest);
		inv.setItem(1, tchest);
		inv.setItem(2, etable);
		inv.setItem(3, anvil);
		inv.setItem(4, echest);
		inv.setItem(5, beacon);
		inv.setItem(6, fns);
		inv.setItem(7, dlsensor);
		inv.setItem(8, triphook);
		inv.setItem(9, hopper);
		inv.setItem(10, stickypiston);
		inv.setItem(11, piston);
		inv.setItem(12, redstonelamp);
		inv.setItem(13, cobweb);
		inv.setItem(14, dispenser);
		inv.setItem(15, ice);
		inv.setItem(16, packedice);
		inv.setItem(17, snow);
		inv.setItem(18, sponge);
		inv.setItem(19, netherfence);
		
		inv.setItem(26, back);
		
		p.openInventory(inv);
	}

	public static void openBrewingPotionShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 27, Utils.color("&8Shop (Brewing and Potions)"));

		ItemStack regenII = Utils.createShopItem(Material.POTION, (short) 8225, "&7» &d&lRegeneration II Potion &7«", 120, 0);
		ItemStack regenIIs = Utils.createShopItem(Material.POTION, (short) 16417, "&7» &d&lRegeneration II Splash &7«", 145, 0);
		ItemStack speedII = Utils.createShopItem(Material.POTION, (short) 8226, "&7» &d&lSpeed II Potion &7«", 30, 0);
		ItemStack speedIIs = Utils.createShopItem(Material.POTION, (short) 16418, "&7» &d&lSpeed II Splash &7«", 55, 0);
		ItemStack strengthII = Utils.createShopItem(Material.POTION, (short) 8233, "&7» &d&lStrength II Potion &7«", 110, 0);
		ItemStack strengthIIs = Utils.createShopItem(Material.POTION, (short) 16425, "&7» &d&lStrength II Splash &7«", 85, 0);
		ItemStack healthIIs = Utils.createShopItem(Material.POTION, (short) 16421, "&7» &d&lHealth II Splash &7«", 75, 0);
		ItemStack waterbreahing = Utils.createShopItem(Material.POTION, (short) 8269, "&7» &d&lWater Breathing Potion &7«", 225, 0);
		ItemStack fireres = Utils.createShopItem(Material.POTION, (short) 8259, "&7» &d&lFire Resistance Potion &7«", 1000, 0);
		ItemStack spidereye = Utils.createShopItem(Material.SPIDER_EYE, (short) 0, "&7» &d&lSpider Eye &7«", 130, 7.50);
		ItemStack ghasttear = Utils.createShopItem(Material.GHAST_TEAR, (short) 0, "&7» &d&lGhast Tear &7«", 97.50, 40);
		ItemStack brewingstand = Utils.createShopItem(Material.BREWING_STAND_ITEM, (short) 0, "&7» &d&lBrewing Stand &7«", 315, 0);
		ItemStack waterbottle = Utils.createShopItem(Material.POTION, (short) 0, "&7» &d&lWater Bottle &7«", 10.44, 0);
		ItemStack goldcarrot = Utils.createShopItem(Material.GOLDEN_CARROT, (short) 0, "&7» &d&lGolden Carrot &7«", 73.12, 0);
		ItemStack glowstonedust = Utils.createShopItem(Material.GLOWSTONE_DUST, (short) 0, "&7» &d&lGlowstone Dust &7«", 5, 0);
		ItemStack sugar = Utils.createShopItem(Material.SUGAR, (short) 0, "&7» &d&lSugar &7«", 5, 0);
		ItemStack slimeball = Utils.createShopItem(Material.SLIME_BALL, (short) 0, "&7» &d&lSlime Ball &7«", 200, 0);
		ItemStack netherwarts = Utils.createShopItem(Material.NETHER_STALK, (short) 0, "&7» &d&lNether Warts &7«", 16.25, 4.06);
		ItemStack gmelon = Utils.createShopItem(Material.SPECKLED_MELON, (short) 0, "&7» &d&lGlistering Melon &7«", 38.75, 0);
		
		inv.setItem(0, regenII);
		inv.setItem(1, regenIIs);
		inv.setItem(2, speedII);
		inv.setItem(3, speedIIs);
		inv.setItem(4, strengthII);
		inv.setItem(5, strengthIIs);
		inv.setItem(6, healthIIs);
		inv.setItem(7, waterbreahing);
		inv.setItem(8, fireres);
		inv.setItem(9, spidereye);
		inv.setItem(10, ghasttear);
		inv.setItem(11, brewingstand);
		inv.setItem(12, waterbottle);
		inv.setItem(13, goldcarrot);
		inv.setItem(14, glowstonedust);
		inv.setItem(15, sugar);
		inv.setItem(16, slimeball);
		inv.setItem(17, netherwarts);
		inv.setItem(18, gmelon);
		inv.setItem(26, back);
		
		p.openInventory(inv);
	}

	public static void openWoolShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 36, Utils.color("&8Shop (Wool)"));

		ItemStack red = Utils.createShopItem(Material.WOOL, (short) 14, "&7» &d&lRed Wool &7«", 2.34, 1.25);
		ItemStack orange = Utils.createShopItem(Material.WOOL, (short) 1, "&7» &d&lOrange Wool &7«", 2.34, 1.25);
		ItemStack yellow = Utils.createShopItem(Material.WOOL, (short) 4, "&7» &d&lYellow Wool &7«", 2.34, 1.25);
		ItemStack lime = Utils.createShopItem(Material.WOOL, (short) 5, "&7» &d&lLime Wool &7«", 2.34, 1.25);
		ItemStack green = Utils.createShopItem(Material.WOOL, (short) 13, "&7» &d&lGreen Wool &7«", 2.34, 1.25);
		ItemStack blue = Utils.createShopItem(Material.WOOL, (short) 11, "&7» &d&lBlue Wool &7«", 2.34, 1.25);
		ItemStack cyan = Utils.createShopItem(Material.WOOL, (short) 9, "&7» &d&lCyan Wool &7«", 2.34, 1.25);
		ItemStack lightblue = Utils.createShopItem(Material.WOOL, (short) 3, "&7» &d&lLight Blue Wool &7«", 2.34, 1.25);
		ItemStack purple = Utils.createShopItem(Material.WOOL, (short) 10, "&7» &d&lPurple Wool &7«", 2.34, 1.25);
		ItemStack magenta = Utils.createShopItem(Material.WOOL, (short) 2, "&7» &d&lMagenta Wool &7«", 2.34, 1.25);
		ItemStack pink = Utils.createShopItem(Material.WOOL, (short) 6, "&7» &d&lPink Wool &7«", 2.34, 1.25);
		ItemStack black = Utils.createShopItem(Material.WOOL, (short) 15, "&7» &d&lBlack Wool &7«", 2.34, 1.25);
		ItemStack gray = Utils.createShopItem(Material.WOOL, (short) 7, "&7» &d&lGray Wool &7«", 2.34, 1.25);
		ItemStack lightgray = Utils.createShopItem(Material.WOOL, (short) 8, "&7» &d&lLight Gray Wool &7«", 2.34, 1.25);
		ItemStack white = Utils.createShopItem(Material.WOOL, (short) 0, "&7» &d&lWhite Wool &7«", 2.34, 1.25);
		ItemStack brown = Utils.createShopItem(Material.WOOL, (short) 12, "&7» &d&lBrown Wool &7«", 2.34, 1.25);
		
		ItemStack redc = Utils.createShopItem(Material.CARPET, (short) 14, "&7» &d&lRed Carpet &7«", 1.56, 0);
		ItemStack orangec = Utils.createShopItem(Material.CARPET, (short) 1, "&7» &d&lOrange Carpet &7«", 1.56, 0);
		ItemStack yellowc = Utils.createShopItem(Material.CARPET, (short) 4, "&7» &d&lYellow Carpet &7«", 1.56, 0);
		ItemStack limec = Utils.createShopItem(Material.CARPET, (short) 5, "&7» &d&lLime Carpet &7«", 1.56, 0);
		ItemStack greenc = Utils.createShopItem(Material.CARPET, (short) 13, "&7» &d&lGreen Carpet &7«", 1.56, 0);
		ItemStack bluec = Utils.createShopItem(Material.CARPET, (short) 11, "&7» &d&lBlue Carpet &7«", 1.56, 0);
		ItemStack cyanc = Utils.createShopItem(Material.CARPET, (short) 9, "&7» &d&lCyan Carpet &7«", 1.56, 0);
		ItemStack lightbluec = Utils.createShopItem(Material.CARPET, (short) 3, "&7» &d&lLight Blue Carpet &7«", 1.56, 0);
		ItemStack purplec = Utils.createShopItem(Material.CARPET, (short) 10, "&7» &d&lPurple Carpet &7«", 1.56, 0);
		ItemStack magentac = Utils.createShopItem(Material.CARPET, (short) 2, "&7» &d&lMagenta Carpet &7«", 1.56, 0);
		ItemStack pinkc = Utils.createShopItem(Material.CARPET, (short) 6, "&7» &d&lPink Carpet &7«", 1.56, 0);
		ItemStack blackc = Utils.createShopItem(Material.CARPET, (short) 15, "&7» &d&lBlack Carpet &7«", 1.56, 0);
		ItemStack grayc = Utils.createShopItem(Material.CARPET, (short) 7, "&7» &d&lGray Carpet &7«", 1.56, 0);
		ItemStack lightgrayc = Utils.createShopItem(Material.CARPET, (short) 8, "&7» &d&lLight Gray Carpet &7«", 1.56, 0);
		ItemStack whitec = Utils.createShopItem(Material.CARPET, (short) 0, "&7» &d&lWhite Carpet &7«", 1.56, 0);
		ItemStack brownc = Utils.createShopItem(Material.CARPET, (short) 12, "&7» &d&lBrown Carpet &7«", 1.56, 0);
		
		inv.setItem(0, red);
		inv.setItem(1, orange);
		inv.setItem(2, yellow);
		inv.setItem(3, lime);
		inv.setItem(4, green);
		inv.setItem(5, blue);
		inv.setItem(6, cyan);
		inv.setItem(7, lightblue);
		inv.setItem(8, purple);
		inv.setItem(9, magenta);
		inv.setItem(10, pink);
		inv.setItem(11, black);
		inv.setItem(12, gray);
		inv.setItem(13, lightgray);
		inv.setItem(14, white);
		inv.setItem(15, brown);
		inv.setItem(16, redc);
		inv.setItem(17, orangec);
		inv.setItem(18, yellowc);
		inv.setItem(19, limec);
		inv.setItem(20, greenc);
		inv.setItem(21, bluec);
		inv.setItem(22, cyanc);
		inv.setItem(23, lightbluec);
		inv.setItem(24, purplec);
		inv.setItem(25, magentac);
		inv.setItem(26, pinkc);
		inv.setItem(27, blackc);
		inv.setItem(28, grayc);
		inv.setItem(29, lightgrayc);
		inv.setItem(30, whitec);
		inv.setItem(31, brownc);
		inv.setItem(35, back);
		
		p.openInventory(inv);
	}

	public static void openGlassShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 36, Utils.color("&8Shop (Glass)"));

		ItemStack red = Utils.createShopItem(Material.STAINED_GLASS, (short) 14, "&7» &d&lRed Stained Glass &7«", 6.25, 0);
		ItemStack orange = Utils.createShopItem(Material.STAINED_GLASS, (short) 1, "&7» &d&lOrange Stained Glass &7«", 6.25, 0);
		ItemStack yellow = Utils.createShopItem(Material.STAINED_GLASS, (short) 4, "&7» &d&lYellow Stained Glass &7«", 6.25, 0);
		ItemStack lime = Utils.createShopItem(Material.STAINED_GLASS, (short) 5, "&7» &d&lLime Stained Glass &7«", 6.25, 0);
		ItemStack green = Utils.createShopItem(Material.STAINED_GLASS, (short) 13, "&7» &d&lGreen Stained Glass &7«", 6.25, 0);
		ItemStack blue = Utils.createShopItem(Material.STAINED_GLASS, (short) 11, "&7» &d&lBlue Stained Glass &7«", 6.25, 0);
		ItemStack cyan = Utils.createShopItem(Material.STAINED_GLASS, (short) 9, "&7» &d&lCyan Stained Glass &7«", 6.25, 0);
		ItemStack lightblue = Utils.createShopItem(Material.STAINED_GLASS, (short) 3, "&7» &d&lLight Blue Stained Glass &7«", 6.25, 0);
		ItemStack purple = Utils.createShopItem(Material.STAINED_GLASS, (short) 10, "&7» &d&lPurple Stained Glass &7«", 6.25, 0);
		ItemStack magenta = Utils.createShopItem(Material.STAINED_GLASS, (short) 2, "&7» &d&lMagenta Stained Glass &7«", 6.25, 0);
		ItemStack pink = Utils.createShopItem(Material.STAINED_GLASS, (short) 6, "&7» &d&lPink Stained Glass &7«", 6.25, 0);
		ItemStack black = Utils.createShopItem(Material.STAINED_GLASS, (short) 15, "&7» &d&lBlack Stained Glass &7«", 6.25, 0);
		ItemStack gray = Utils.createShopItem(Material.STAINED_GLASS, (short) 7, "&7» &d&lGray Stained Glass &7«", 6.25, 0);
		ItemStack lightgray = Utils.createShopItem(Material.STAINED_GLASS, (short) 8, "&7» &d&lLight Gray Stained Glass &7«", 6.25, 0);
		ItemStack white = Utils.createShopItem(Material.STAINED_GLASS, (short) 0, "&7» &d&lWhite Stained Glass &7«", 6.25, 0);
		ItemStack brown = Utils.createShopItem(Material.STAINED_GLASS, (short) 12, "&7» &d&lBrown Stained Glass &7«", 6.25, 0);

		ItemStack clear = Utils.createShopItem(Material.GLASS, (short) 0, "&7» &d&lGlass &7«", 4.06, 0);
		ItemStack clearp = Utils.createShopItem(Material.THIN_GLASS, (short) 12, "&7» &d&lGlass Pane &7«", 2.34, 0);
		
		
		ItemStack redp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 14, "&7» &d&lRed Stained Glass Pane &7«", 2.34, 0);
		ItemStack orangep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 1, "&7» &d&lOrange Stained Glass Pane &7«", 2.34, 0);
		ItemStack yellowp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 4, "&7» &d&lYellow Stained Glass Pane &7«", 2.34, 0);
		ItemStack limep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 5, "&7» &d&lLime Stained Glass Pane &7«", 2.34, 0);
		ItemStack greenp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 13, "&7» &d&lGreen Stained Glass Pane &7«", 2.34, 0);
		ItemStack bluep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 11, "&7» &d&lBlue Stained Glass Pane &7«", 2.34, 0);
		ItemStack cyanp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 9, "&7» &d&lCyan Stained Glass Pane &7«", 2.34, 0);
		ItemStack lightbluep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 3, "&7» &d&lLight Blue Stained Glass Pane &7«", 2.34, 0);
		ItemStack purplep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 10, "&7» &d&lPurple Stained Glass Pane &7«", 2.34, 0);
		ItemStack magentap = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 2, "&7» &d&lMagenta Stained Glass Pane &7«", 2.34, 0);
		ItemStack pinkp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 6, "&7» &d&lPink Stained Glass Pane &7«", 2.34, 0);
		ItemStack blackp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 15, "&7» &d&lBlack Stained Glass Pane &7«", 2.34, 0);
		ItemStack grayp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 7, "&7» &d&lGray Stained Glass Pane &7«", 2.34, 0);
		ItemStack lightgrayp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 8, "&7» &d&lLight Gray Stained Glass Pane &7«", 2.34, 0);
		ItemStack whitep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 0, "&7» &d&lWhite Stained Glass Pane &7«", 2.34, 0);
		ItemStack brownp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 12, "&7» &d&lBrown Stained Glass Pane &7«", 2.34, 0);
		
		inv.setItem(0, red);
		inv.setItem(1, orange);
		inv.setItem(2, yellow);
		inv.setItem(3, lime);
		inv.setItem(4, green);
		inv.setItem(5, blue);
		inv.setItem(6, cyan);
		inv.setItem(7, lightblue);
		inv.setItem(8, purple);
		inv.setItem(9, magenta);
		inv.setItem(10, pink);
		inv.setItem(11, black);
		inv.setItem(12, gray);
		inv.setItem(13, lightgray);
		inv.setItem(14, white);
		inv.setItem(15, brown);
		inv.setItem(16, clear);
		inv.setItem(17, clearp);
		inv.setItem(18, redp);
		inv.setItem(19, orangep);
		inv.setItem(20, yellowp);
		inv.setItem(21, limep);
		inv.setItem(22, greenp);
		inv.setItem(23, bluep);
		inv.setItem(24, cyanp);
		inv.setItem(25, lightbluep);
		inv.setItem(26, purplep);
		inv.setItem(27, magentap);
		inv.setItem(28, pinkp);
		inv.setItem(29, blackp);
		inv.setItem(30, grayp);
		inv.setItem(31, lightgrayp);
		inv.setItem(32, whitep);
		inv.setItem(33, brownp);
		
		inv.setItem(35, back);
		
		p.openInventory(inv);
	}

	public static void openClayShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 27, Utils.color("&8Shop (Clay)"));

		ItemStack red = Utils.createShopItem(Material.STAINED_CLAY, (short) 14, "&7» &d&lRed Stained Clay &7«", 6.25, 0);
		ItemStack orange = Utils.createShopItem(Material.STAINED_CLAY, (short) 1, "&7» &d&lOrange Stained Clay &7«", 6.25, 0);
		ItemStack yellow = Utils.createShopItem(Material.STAINED_CLAY, (short) 4, "&7» &d&lYellow Stained Clay &7«", 6.25, 0);
		ItemStack lime = Utils.createShopItem(Material.STAINED_CLAY, (short) 5, "&7» &d&lLime Stained Clay &7«", 6.25, 0);
		ItemStack green = Utils.createShopItem(Material.STAINED_CLAY, (short) 13, "&7» &d&lGreen Stained Clay &7«", 6.25, 0);
		ItemStack blue = Utils.createShopItem(Material.STAINED_CLAY, (short) 11, "&7» &d&lBlue Stained Clay &7«", 6.25, 0);
		ItemStack cyan = Utils.createShopItem(Material.STAINED_CLAY, (short) 9, "&7» &d&lCyan Stained Clay &7«", 6.25, 0);
		ItemStack lightblue = Utils.createShopItem(Material.STAINED_CLAY, (short) 3, "&7» &d&lLight Blue Stained Clay &7«", 6.25, 0);
		ItemStack purple = Utils.createShopItem(Material.STAINED_CLAY, (short) 10, "&7» &d&lPurple Stained Clay &7«", 6.25, 0);
		ItemStack magenta = Utils.createShopItem(Material.STAINED_CLAY, (short) 2, "&7» &d&lMagenta Stained Clay &7«", 6.25, 0);
		ItemStack pink = Utils.createShopItem(Material.STAINED_CLAY, (short) 6, "&7» &d&lPink Stained Clay &7«", 6.25, 0);
		ItemStack black = Utils.createShopItem(Material.STAINED_CLAY, (short) 15, "&7» &d&lBlack Stained Clay &7«", 6.25, 0);
		ItemStack gray = Utils.createShopItem(Material.STAINED_CLAY, (short) 7, "&7» &d&lGray Stained Clay &7«", 6.25, 0);
		ItemStack lightgray = Utils.createShopItem(Material.STAINED_CLAY, (short) 8, "&7» &d&lLight Gray Stained Clay &7«", 6.25, 0);
		ItemStack white = Utils.createShopItem(Material.STAINED_CLAY, (short) 0, "&7» &d&lWhite Stained Clay &7«", 6.25, 0);
		ItemStack brown = Utils.createShopItem(Material.STAINED_CLAY, (short) 12, "&7» &d&lBrown Stained Clay &7«", 6.25, 0);
		ItemStack hardened = Utils.createShopItem(Material.HARD_CLAY, (short) 0, "&7» &d&lHardened Clay &7«", 6.25, 0);
		ItemStack clay = Utils.createShopItem(Material.CLAY, (short) 0, "&7» &d&lClay &7«", 6.25, 0);
		
		inv.setItem(0, red);
		inv.setItem(1, orange);
		inv.setItem(2, yellow);
		inv.setItem(3, lime);
		inv.setItem(4, green);
		inv.setItem(5, blue);
		inv.setItem(6, cyan);
		inv.setItem(7, lightblue);
		inv.setItem(8, purple);
		inv.setItem(9, magenta);
		inv.setItem(10, pink);
		inv.setItem(11, black);
		inv.setItem(12, gray);
		inv.setItem(13, lightgray);
		inv.setItem(14, white);
		inv.setItem(15, brown);
		inv.setItem(16, hardened);
		inv.setItem(17, clay);
		
		inv.setItem(26, back);
		
		p.openInventory(inv);
	}

	public static void openFlowersShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 18, Utils.color("&8Shop (Flowers)"));

		ItemStack f1 = Utils.createShopItem(Material.RED_ROSE, (short) 0, "&7» &d&lPoppy &7«", 18.75, 0);
		ItemStack f2 = Utils.createShopItem(Material.YELLOW_FLOWER, (short) 0, "&7» &d&lDandelion &7«", 18.75, 0);
		ItemStack f3 = Utils.createShopItem(Material.RED_ROSE, (short) 1, "&7» &d&lBlue Orchid &7«", 18.75, 0);
		ItemStack f4 = Utils.createShopItem(Material.RED_ROSE, (short) 2, "&7» &d&lAllium &7«", 18.75, 0);
		ItemStack f5 = Utils.createShopItem(Material.RED_ROSE, (short) 3, "&7» &d&lAzure Bluet &7«", 18.75, 0);
		ItemStack f6 = Utils.createShopItem(Material.RED_ROSE, (short) 8, "&7» &d&lOxeye Daisy &7«", 18.75, 0);
		ItemStack f7 = Utils.createShopItem(Material.RED_ROSE, (short) 4, "&7» &d&lRed Tulip &7«", 18.75, 0);
		ItemStack f8 = Utils.createShopItem(Material.RED_ROSE, (short) 5, "&7» &d&lOrange Tulip &7«", 18.75, 0);
		ItemStack f9 = Utils.createShopItem(Material.RED_ROSE, (short) 7, "&7» &d&lPink Tulip &7«", 18.75, 0);
		ItemStack f10 = Utils.createShopItem(Material.RED_ROSE, (short) 6, "&7» &d&lWhite Tulip &7«", 18.75, 0);
		ItemStack f11 = Utils.createShopItem(Material.DOUBLE_PLANT, (short) 0, "&7» &d&lSunflower &7«", 18.75, 0);
		ItemStack f12 = Utils.createShopItem(Material.DOUBLE_PLANT, (short) 1, "&7» &d&lLilac &7«", 18.75, 0);
		ItemStack f13 = Utils.createShopItem(Material.DOUBLE_PLANT, (short) 4, "&7» &d&lRose Bush &7«", 18.75, 0);
		ItemStack f14 = Utils.createShopItem(Material.VINE, (short) 0, "&7» &d&lVine &7«", 75, 0);
		ItemStack f15 = Utils.createShopItem(Material.RED_MUSHROOM, (short) 0, "&7» &d&lRed Mushroom &7«", 10, 0);
		ItemStack pot = Utils.createShopItem(Material.FLOWER_POT_ITEM, (short) 0, "&7» &d&lFlower Pot &7«", 300, 0);
		
		inv.setItem(0, f1);
		inv.setItem(1, f2);
		inv.setItem(2, f3);
		inv.setItem(3, f4);
		inv.setItem(4, f5);
		inv.setItem(5, f6);
		inv.setItem(6, f7);
		inv.setItem(7, f8);
		inv.setItem(8, f9);
		inv.setItem(9, f10);
		inv.setItem(10, f11);
		inv.setItem(11, f12);
		inv.setItem(12, f13);
		inv.setItem(13, f14);
		inv.setItem(14, f15);
		inv.setItem(15, pot);
		
		inv.setItem(17, back);
		
		p.openInventory(inv);
	}


}
