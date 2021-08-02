package me.classified.shop.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopInventories {

	public static ItemStack back = Utils.itemBuilder(Material.STAINED_GLASS_PANE, (short) 14, 1, "&8« &c&lBack &8»", new String[]{"&7Click to view categories."} , false);
	
	public static void closeShop(Player p){
		p.closeInventory();
	}
	
	String arrows = "»«";

	public static void openShopCategories(Player p){
		ItemStack spacer = Utils.itemBuilder(Material.STAINED_GLASS_PANE, (short) 7, "&f&l???", null, false);
		ItemStack raid = Utils.itemBuilder(Material.TNT, (short) 0, 1, "&8« &3&lRaid Shop &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack spawners = Utils.itemBuilder(Material.MOB_SPAWNER, (short) 0, 1, "&8« &3&lSpawners &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack buildingBlocks = Utils.itemBuilder(Material.STONE, (short) 0, 1, "&8« &3&lBuilding Blocks &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack ores = Utils.itemBuilder(Material.DIAMOND, (short) 0, 1, "&8« &3&lOres and Valuables &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack food = Utils.itemBuilder(Material.WHEAT, (short) 0, 1, "&8« &3&lFood and Farming &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack mobDrops = Utils.itemBuilder(Material.ROTTEN_FLESH, (short) 0, 1, "&8« &3&lMob Drops &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack specialty = Utils.itemBuilder(Material.EYE_OF_ENDER, (short) 0, 1, "&8« &3&lSpecialty Items &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack brewing = Utils.itemBuilder(Material.BREWING_STAND_ITEM, (short) 0, 1, "&8« &3&lBrewing and Potions &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack wool = Utils.itemBuilder(Material.WOOL, (short) 0, 1, "&8« &3&lWool &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack glass = Utils.itemBuilder(Material.STAINED_GLASS, (short) 2, 1, "&8« &3&lGlass &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack clay = Utils.itemBuilder(Material.STAINED_CLAY, (short) 0, 1, "&8« &3&lClay &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack flowers = Utils.itemBuilder(Material.RED_ROSE, (short) 0, 1, "&8« &3&lFlowers &8»", new String[]{"&7Click to view items in this category."}, false);
		ItemStack genWalls = Utils.itemBuilder(Material.OBSIDIAN, (short) 0, 1, "&8« &3&lGen Walls &8»", new String[]{"&7Click to view items in this category."}, true);
		ItemStack enchants = Utils.itemBuilder(Material.ENCHANTED_BOOK, (short) 0, 1, "&8« &3&lEnchantment Items &8»", new String[]{"&7Click to view items in this category."}, true);

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
		inv.setItem(9, enchants);
		inv.setItem(11, ores);
		inv.setItem(12, food);
		inv.setItem(13, mobDrops);
		inv.setItem(14, specialty);
		inv.setItem(15, flowers);
		
		inv.setItem(17, genWalls);


		p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1, 1);
		p.openInventory(inv);
	}

	public static void openEnchantShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 18, Utils.color("&8Shop (Enchant Shop)"));

		ItemStack silk = Utils.createShopItem(Material.ENCHANTED_BOOK, (short) 0, "&8« &3&lSilk Touch I &8»", 75000, 0.0);
		ItemStack looting4 = Utils.createShopItem(Material.ENCHANTED_BOOK, (short) 0, "&8« &3&lLooting IV &8»", 200000, 0.0);
		ItemStack looting5 = Utils.createShopItem(Material.ENCHANTED_BOOK, (short) 0, "&8« &3&lLooting V &8»", 350000, 0.0);
		ItemStack d1 = Utils.createShopItem(Material.ENCHANTED_BOOK, (short) 0, "&8« &3&lDepth Strider I &8»", 100000, 0.0);
		ItemStack d2 = Utils.createShopItem(Material.ENCHANTED_BOOK, (short) 0, "&8« &3&lDepth Strider II &8»", 150000, 0.0);
		ItemStack d3 = Utils.createShopItem(Material.ENCHANTED_BOOK, (short) 0, "&8« &3&lDepth Strider III &8»", 250000, 0.0);
		ItemStack prot = Utils.createShopItem(Material.FEATHER, (short) 0, "&8« &3&lProtection Scroll &8»", 300000, 0.0);
		ItemStack dis = Utils.createShopItem(Material.INK_SACK, (short) 0, "&8« &3&lDisenchant Scroll &8»", 500000, 0.0);
		ItemStack commonMDust = Utils.createShopItem(Material.FIREBALL, (short) 0, "&8« &3&lCommon Mystery Dust &8»", 5000, 50.0);
		ItemStack uncommonMDust = Utils.createShopItem(Material.FIREBALL, (short) 0, "&8« &3&lUncommon Mystery Dust &8»", 6000, 50.0);
		ItemStack rareMDust = Utils.createShopItem(Material.FIREBALL, (short) 0, "&8« &3&lRare Mystery Dust &8»", 7000, 50.0);
		ItemStack ultimateMDust = Utils.createShopItem(Material.FIREBALL, (short) 0, "&8« &3&lUltimate Mystery Dust &8»", 8000, 50.0);
		ItemStack legendaryMDust = Utils.createShopItem(Material.FIREBALL, (short) 0, "&8« &3&lLegendary Mystery Dust &8»", 10000, 50.0);

		inv.setItem(0, silk);
		inv.setItem(1, looting4);
		inv.setItem(2, looting5);
		inv.setItem(3, d1);
		inv.setItem(4, d2);
		inv.setItem(5, d3);
		inv.setItem(6, prot);
		inv.setItem(7, dis);
		inv.setItem(8, commonMDust);
		inv.setItem(9, uncommonMDust);
		inv.setItem(10, rareMDust);
		inv.setItem(11, ultimateMDust);
		inv.setItem(12, legendaryMDust);


		inv.setItem(17, back);
		
		p.openInventory(inv);
	}

	public static void openRaidShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 36, Utils.color("&8Shop (Raid Shop)"));

		ItemStack redstone = Utils.createShopItem(Material.REDSTONE, (short) 0, "&8« &3&lRedstone &8»", 16.25, 0.23);
		ItemStack spiston = Utils.createShopItem(Material.PISTON_STICKY_BASE, (short) 0, "&8« &3&lSticky Piston &8»", 325, 0);
		ItemStack piston = Utils.createShopItem(Material.PISTON_BASE, (short) 0, "&8« &3&lPiston &8»", 195, 0);
		ItemStack stone = Utils.createShopItem(Material.STONE, (short) 0, "&8« &3&lStone &8»", 5.47, 1.48);
		ItemStack glowstone = Utils.createShopItem(Material.GLOWSTONE, (short) 0, "&8« &3&lGlowstone &8»",7.03, 2.50);
		ItemStack sand = Utils.createShopItem(Material.SAND, (short) 0, "&8« &3&lSand &8»", 4.06, 0);
		ItemStack redsand = Utils.createShopItem(Material.SAND, (short) 1, "&8« &3&lRed Sand &8»", 3.05, 0);
		ItemStack ice = Utils.createShopItem(Material.ICE, (short) 0, "&8« &3&lIce &8»", 50, 0);
		ItemStack cobweb = Utils.createShopItem(Material.WEB, (short) 0, "&8« &3&lCobweb &8»", 40, 0);
		ItemStack sponge = Utils.createShopItem(Material.SPONGE, (short) 0, "&8« &3&lSponge &8»", 2000, 0);
		ItemStack tnt = Utils.createShopItem(Material.TNT, (short) 0, "&8« &3&lTNT &8»", 1000, 0);
		ItemStack glass = Utils.createShopItem(Material.GLASS, (short) 0, "&8« &3&lGlass &8»", 4.06, 0);
		ItemStack water = Utils.createShopItem(Material.WATER_BUCKET, (short) 0, "&8« &3&lWater Bucket &8»", 100, 0);
		ItemStack lava = Utils.createShopItem(Material.LAVA_BUCKET, (short) 0, "&8« &3&lLava Bucket &8»", 100, 0);
		ItemStack stoneslab = Utils.createShopItem(Material.STEP, (short) 0, "&8« &3&lStone Slab &8»",80.86, 0);
		ItemStack redstonetorch = Utils.createShopItem(Material.REDSTONE_TORCH_ON, (short) 0, "&8« &3&lRedstone Torch &8»", 25, 0);
		ItemStack comparator = Utils.createShopItem(Material.REDSTONE_COMPARATOR, (short) 0, "&8« &3&lRedstone Comparator &8»", 100, 0);
		ItemStack repeater = Utils.createShopItem(Material.DIODE, (short) 0, "&8« &3&lRedstone Repeater &8»", 85, 0);
		ItemStack dispenser = Utils.createShopItem(Material.DISPENSER, (short) 0, "&8« &3&lDispenser &8»", 150, 0);
		ItemStack dropper = Utils.createShopItem(Material.DROPPER, (short) 0, "&8« &3&lDropper &8»", 100, 0);
		ItemStack ladder = Utils.createShopItem(Material.LADDER, (short) 0, "&8« &3&lLadder &8»", 10, 0);
		ItemStack button = Utils.createShopItem(Material.STONE_BUTTON, (short) 0, "&8« &3&lButton &8»", 5.50, 0);
		ItemStack lever = Utils.createShopItem(Material.LEVER, (short) 0, "&8« &3&lLever &8»", 20, 0);
		ItemStack slimeblock = Utils.createShopItem(Material.SLIME_BLOCK, (short) 0, "&8« &3&lSlime Block &8»", 1850, 0);
		ItemStack sign = Utils.createShopItem(Material.SIGN, (short) 0, "&8« &3&lSign &8»", 20.0, 0);
		ItemStack cegg = Utils.createShopItem(Material.MONSTER_EGG, (short) 50, "&8« &3&lCreeper Egg &8»", 100000, 0);
		ItemStack tcegg = Utils.createShopItem(Material.MONSTER_EGG, (short) 50, "&8« &3&lThrowable C-Egg &8»", 160000, 0);
		ItemStack sbot = Utils.createShopItem(Material.ENDER_PORTAL_FRAME, (short) 65, "&8« &3&lSand Bot &8»", 100000, 0);

		//ItemStack ctcegg = Utils.createShopItem(Material.MONSTER_EGG, (short) 50, "&8« &3&lCharged Throwable C-Egg &8»", 125000, 0);


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
		inv.setItem(10, slimeblock);
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
		inv.setItem(22, lever);
		inv.setItem(23, button);
		inv.setItem(24, sign);
		inv.setItem(25, cegg);
		inv.setItem(26, tcegg);
		inv.setItem(27, sbot);
		//inv.setItem(26, ctcegg);


		
		inv.setItem(35, back);
		
		p.openInventory(inv);
	}

	public static void openSpawnerShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 9, Utils.color("&8Shop (Spawners)"));

		//ItemStack chicken = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lChicken Spawner &8»", 80000, 0);
		//ItemStack pig = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lPig Spawner &8»", 80000, 0);
		//ItemStack cspider = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lCave Spider Spawner &8»", 120000, 0);
		//ItemStack spider = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lSpider Spawner &8»", 120000, 0);
		//ItemStack sheep = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lSheep Spawner &8»", 95000, 0);
		//ItemStack wolf = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lWolf Spawner &8»", 60000, 0);
		ItemStack skeleton = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lSkeleton Spawner &8»", 200000, 0);
		ItemStack zombie = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lZombie Spawner &8»", 115000, 0);
		ItemStack cow = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lCow Spawner &8»", 80000, 0);
		ItemStack enderman = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lEnderman Spawner &8»", 350000, 0);
		//ItemStack zpigman = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lZombie Pigman Spawner &8»", 250000, 0);

		ItemStack blaze = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lBlaze Spawner &8»", 500000, 0);
		//ItemStack slime = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lSlime Spawner &8»", 2000000, 0);
		ItemStack creeper = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lCreeper Spawner &8»", 2000000, 0);
		ItemStack ig = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lIron Golem Spawner &8»", 4000000, 0);
		//ItemStack mystery = Utils.createShopItem(Material.MOB_SPAWNER, (short) 0, "&8« &3&lMystery Spawner &8»", 5000000, 0);


		//inv.setItem(0, wolf);
		inv.setItem(0, cow);
		//inv.setItem(2, pig);
		//inv.setItem(1, cow);
		//inv.setItem(4, sheep);
		inv.setItem(1, zombie);
		//inv.setItem(6, spider);
		//inv.setItem(7, cspider);
		inv.setItem(2, skeleton);
		//inv.setItem(9, zpigman);
		inv.setItem(3, enderman);
		inv.setItem(5, creeper);
		inv.setItem(4, blaze);
		//inv.setItem(13, slime);
		inv.setItem(6, ig);
		//inv.setItem(15, mystery);
		
		inv.setItem(8, back);
		
		p.openInventory(inv);
	}

	public static void openBuildingBlocksShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 36, Utils.color("&8Shop (Building Blocks)"));

		ItemStack grass = Utils.createShopItem(Material.GRASS, (short) 0, "&8« &3&lGrass &8»", 3, 0.70);
		ItemStack oaklog = Utils.createShopItem(Material.LOG, (short) 0, "&8« &3&lOak Log &8»", 8.12, 2.03);
		ItemStack sprucelog = Utils.createShopItem(Material.LOG, (short) 1, "&8« &3&lSpruce Log &8»", 8.12, 2.03);;
		ItemStack birchlog = Utils.createShopItem(Material.LOG, (short) 2, "&8« &3&lBirch Log &8»", 8.12, 2.03);
		ItemStack junglelog = Utils.createShopItem(Material.LOG, (short) 3, "&8« &3&lJungle Log &8»", 8.12, 2.03);
		ItemStack acacialog = Utils.createShopItem(Material.LOG_2, (short) 0, "&8« &3&lAcacia Log &8»", 8.12, 2.03);
		ItemStack darkoaklog = Utils.createShopItem(Material.LOG_2, (short) 1, "&8« &3&lDark Oak Log &8»", 8.12, 2.03);
		ItemStack dirt = Utils.createShopItem(Material.DIRT, (short) 0, "&8« &3&lDirt &8»", 3, 0.70);
		ItemStack podzol = Utils.createShopItem(Material.DIRT, (short) 2, "&8« &3&lPodzol &8»", 10.94, 3.75);
		ItemStack mycelium = Utils.createShopItem(Material.MYCEL, (short) 0, "&8« &3&lMycelium &8»", 10.16, 3.75);
		ItemStack stone = Utils.createShopItem(Material.STONE, (short) 0, "&8« &3&lStone &8»", 5.47, 1.84);
		ItemStack cobblestone = Utils.createShopItem(Material.COBBLESTONE, (short) 0, "&8« &3&lCobblestone &8»", 4.06, 1.02);
		ItemStack stonebrick = Utils.createShopItem(Material.SMOOTH_BRICK, (short) 0, "&8« &3&lStone Brick &8»", 6.56, 0);
		ItemStack mossystonebrick = Utils.createShopItem(Material.SMOOTH_BRICK, (short) 1, "&8« &3&lMossy Stone Brick &8»", 6.56, 0);
		ItemStack crackedstonebrick = Utils.createShopItem(Material.SMOOTH_BRICK, (short) 2, "&8« &3&lCracked Stone Brick &8»", 6.56, 0);
		ItemStack chiseledstonebrick = Utils.createShopItem(Material.SMOOTH_BRICK, (short) 3, "&8« &3&lChiseled Stone Brick &8»", 6.56, 0);
		ItemStack sandstone = Utils.createShopItem(Material.SANDSTONE, (short) 0, "&8« &3&lSandstone &8»", 12.19, 0);
		ItemStack chiseledsandstone = Utils.createShopItem(Material.SANDSTONE, (short) 0, "&8« &3&lChiseled Sandstone &8»", 12.19, 0);
		ItemStack smoothsandstone = Utils.createShopItem(Material.SANDSTONE, (short) 0, "&8« &3&lSmooth Sandstone &8»", 48.75, 0);
		ItemStack quartzblock = Utils.createShopItem(Material.QUARTZ_BLOCK, (short) 0, "&8« &3&lQuartz Block &8»", 12.19, 0);
		ItemStack chiseledquartzblock = Utils.createShopItem(Material.QUARTZ_BLOCK, (short) 1, "&8« &3&lChiseled Quartz Block &8»", 48.75, 0);
		ItemStack pillarquartzblock = Utils.createShopItem(Material.QUARTZ_BLOCK, (short) 2, "&8« &3&lPillar Quartz Block &8»", 12.19, 0);
		ItemStack netherrack = Utils.createShopItem(Material.NETHERRACK, (short) 0, "&8« &3&lNetherrack &8»", 2.34, 0.94);
		ItemStack netherbrick = Utils.createShopItem(Material.NETHER_BRICK, (short) 0, "&8« &3&lNether Brick &8»", 5.74, 0);
		ItemStack glowstone = Utils.createShopItem(Material.GLOWSTONE, (short) 0, "&8« &3&lGlowstone &8»", 7.03, 2.50);
		ItemStack soulsand = Utils.createShopItem(Material.SOUL_SAND, (short) 0, "&8« &3&lSoul Sand &8»", 7.06, 0);
		ItemStack endstone = Utils.createShopItem(Material.ENDER_STONE, (short) 0, "&8« &3&lEnd Stone &8»", 7.03, 0);
		ItemStack sand = Utils.createShopItem(Material.SAND, (short) 0, "&8« &3&lSand &8»", 4.06, 0);
		ItemStack redsand = Utils.createShopItem(Material.SAND, (short) 1, "&8« &3&lRed Sand &8»", 3.05, 0);
		ItemStack gravel = Utils.createShopItem(Material.GRAVEL, (short) 0, "&8« &3&lGravel &8»", 3.52, 0);
		ItemStack obsidian = Utils.createShopItem(Material.OBSIDIAN, (short) 0, "&8« &3&lObsidian &8»", 14.84, 5.47);
		ItemStack ice = Utils.createShopItem(Material.ICE, (short) 0, "&8« &3&lIce &8»", 50, 0);
		ItemStack packedice = Utils.createShopItem(Material.PACKED_ICE, (short) 0, "&8« &3&lPacked Ice &8»", 75, 0);
		ItemStack snow = Utils.createShopItem(Material.SNOW_BLOCK, (short) 0, "&8« &3&lSnow &8»", 250, 0);
		
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
		
		ItemStack coal = Utils.createShopItem(Material.COAL, (short) 0, "&8« &3&lCoal &8»", 9.06, 0.94);
		ItemStack coalb = Utils.createShopItem(Material.COAL_BLOCK, (short) 0, "&8« &3&lCoal Block &8»", 80, 8);
		ItemStack redstone = Utils.createShopItem(Material.REDSTONE, (short) 0, "&8« &3&lRedstone &8»", 16.25, 0.94);
		ItemStack redstoneb = Utils.createShopItem(Material.REDSTONE_BLOCK, (short) 0, "&8« &3&lRedstone Block &8»", 195, 10);
		ItemStack lapis = Utils.createShopItem(Material.INK_SACK, (short) 4, "&8« &3&lLapis &8»", 18.12, 1.25);
		ItemStack lapisb = Utils.createShopItem(Material.LAPIS_BLOCK, (short) 0, "&8« &3&lLapis Block &8»", 160, 9);
		ItemStack iron = Utils.createShopItem(Material.IRON_INGOT, (short) 0, "&8« &3&lIron Ingot &8»", 600, 200);
		ItemStack ironb = Utils.createShopItem(Material.IRON_BLOCK, (short) 0, "&8« &3&lIron Block &8»", 5400, 1800);
		ItemStack gold = Utils.createShopItem(Material.GOLD_INGOT, (short) 0, "&8« &3&lGold Ingot &8»", 700, 210);
		ItemStack goldb = Utils.createShopItem(Material.GOLD_BLOCK, (short) 0, "&8« &3&lGold Block &8»", 6300, 1890);
		ItemStack diamond = Utils.createShopItem(Material.DIAMOND, (short) 0, "&8« &3&lDiamond &8»", 800, 250);
		ItemStack diamondb = Utils.createShopItem(Material.DIAMOND_BLOCK, (short) 0, "&8« &3&lDiamond Block &8»", 6300, 2250);
		ItemStack emerald = Utils.createShopItem(Material.EMERALD, (short) 0, "&8« &3&lEmerald &8»", 1150, 300);
		ItemStack emeraldb = Utils.createShopItem(Material.EMERALD_BLOCK, (short) 0, "&8« &3&lEmerald Block &8»", 10350, 2700);
		ItemStack quartz = Utils.createShopItem(Material.QUARTZ, (short) 0, "&8« &3&lQuartz &8»", 3.05, 0);
		
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
		inv.setItem(14, quartz);
		
		inv.setItem(17, back);
		
		p.openInventory(inv);
	}

	public static void openFoodShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 27, Utils.color("&8Shop (Food and Farming)"));

		ItemStack sugarcane = Utils.createShopItem(Material.SUGAR_CANE, (short) 0, "&8« &3&lSugar Cane &8»", 16.25, 8.0);
		ItemStack cactus = Utils.createShopItem(Material.CACTUS, (short) 0, "&8« &3&lCactus &8»", 18.75, 0.10);
		ItemStack wheat = Utils.createShopItem(Material.WHEAT, (short) 0, "&8« &3&lWheat &8»", 11.88, 6.25);
		ItemStack melon = Utils.createShopItem(Material.MELON, (short) 0, "&8« &3&lMelon &8»", 20.31, 2.5);
		ItemStack pumpkin = Utils.createShopItem(Material.PUMPKIN, (short) 0, "&8« &3&lPumpkin &8»", 325, 3.0);
		ItemStack mseeds = Utils.createShopItem(Material.MELON_SEEDS, (short) 0, "&8« &3&lMelon Seeds &8»", 3.44, 0);
		ItemStack pseeds = Utils.createShopItem(Material.PUMPKIN_SEEDS, (short) 0, "&8« &3&lPumpkin Seeds &8»", 3.44, 0);
		ItemStack seeds = Utils.createShopItem(Material.SEEDS, (short) 0, "&8« &3&lSeeds &8»", 3.19, 0);
		ItemStack carrot = Utils.createShopItem(Material.CARROT_ITEM, (short) 0, "&8« &3&lCarrot &8»", 25, 1.56);
		ItemStack apple = Utils.createShopItem(Material.APPLE, (short) 0, "&8« &3&lApple &8»", 25, 10);
		ItemStack gapple = Utils.createShopItem(Material.GOLDEN_APPLE, (short) 0, "&8« &3&lGolden Apple &8»", 1500, 0);
		ItemStack cake = Utils.createShopItem(Material.CAKE, (short) 0, "&8« &3&lCake &8»", 50, 0);
		ItemStack bread = Utils.createShopItem(Material.BREAD, (short) 0, "&8« &3&lBread &8»", 31.25, 0);
		ItemStack cookie = Utils.createShopItem(Material.COOKIE, (short) 0, "&8« &3&lCookie &8»", 5.94, 0);
		ItemStack rawsteak = Utils.createShopItem(Material.RAW_BEEF, (short) 0, "&8« &3&lRaw Beef &8»", 9.38, 1.00);
		ItemStack steak = Utils.createShopItem(Material.COOKED_BEEF, (short) 0, "&8« &3&lCooked Beef &8»", 11.88, 1.30);
		ItemStack rawpork = Utils.createShopItem(Material.PORK, (short) 0, "&8« &3&lRaw Pork &8»", 10, 0.75);
		ItemStack pork = Utils.createShopItem(Material.GRILLED_PORK, (short) 0, "&8« &3&lCooked Pork &8»", 11.88, 1.88);
		
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

		ItemStack gunpowder = Utils.createShopItem(Material.SULPHUR, (short) 0, "&8« &3&lGun Powder &8»", 25, 3.38);
		ItemStack tnt = Utils.createShopItem(Material.TNT, (short) 0, "&8« &3&lTNT &8»", 1000, 0);
		ItemStack bow = Utils.createShopItem(Material.BOW, (short) 0, "&8« &3&lBow &8»", 25, 10);
		ItemStack arrow = Utils.createShopItem(Material.ARROW, (short) 0, "&8« &3&lArrow &8»", 6.25, 1.5);
		ItemStack feather = Utils.createShopItem(Material.FEATHER, (short) 0, "&8« &3&lFeather &8»", 8.12, 0.50);
		ItemStack brod = Utils.createShopItem(Material.BLAZE_ROD, (short) 0, "&8« &3&lBlaze Rod &8»", 150, 40);
		//ItemStack lillypad = Utils.createShopItem(Material.WATER_LILY, (short) 0, "&8« &3&lLilly Pad &8»", 20, 0);
		ItemStack iron = Utils.createShopItem(Material.IRON_INGOT, (short) 0, "&8« &3&lIron Ingot &8»", 600, 200);
		ItemStack rottenflesh = Utils.createShopItem(Material.ROTTEN_FLESH, (short) 0, "&8« &3&lRotten Flesh &8»", 2.50, 1.25);
		ItemStack string = Utils.createShopItem(Material.STRING, (short) 0, "&8« &3&lString &8»", 8.12, 1.88);
		ItemStack leather = Utils.createShopItem(Material.LEATHER, (short) 0, "&8« &3&lLeather &8»", 16.25, 1.00);
		ItemStack enderpearl = Utils.createShopItem(Material.ENDER_PEARL, (short) 0, "&8« &3&lEnder Pearl &8»", 50, 15);
		ItemStack bone = Utils.createShopItem(Material.BONE, (short) 0, "&8« &3&lBone &8»", 6.25, 1.50);
		ItemStack emerald = Utils.createShopItem(Material.EMERALD, (short) 0, "&8« &3&lEmerald &8»", 1150, 300);
		ItemStack shard = Utils.createShopItem(Material.PRISMARINE_SHARD, (short) 0, "&8« &3&lPrismarine Shard &8»", 2500, 1000);
		
		inv.setItem(10, gunpowder);
		inv.setItem(2, tnt);
		inv.setItem(1, arrow);
		inv.setItem(9, feather);
		inv.setItem(4, brod);
		inv.setItem(5, iron);
		inv.setItem(6, rottenflesh);
		inv.setItem(7, string);
		inv.setItem(8, leather);
		inv.setItem(3, enderpearl);
		inv.setItem(0, bone);
		inv.setItem(11, bow);
		inv.setItem(12, emerald);
		inv.setItem(13, shard);
		
		inv.setItem(17, back);
		
		p.openInventory(inv);
	}

	public static void openSpecialtyShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 36, Utils.color("&8Shop (Specialty Items)"));

		ItemStack chest = Utils.createShopItem(Material.CHEST, (short) 0, "&8« &3&lChest &8»", 15, 0);
		ItemStack tchest = Utils.createShopItem(Material.TRAPPED_CHEST, (short) 0, "&8« &3&lTrapped Chest &8»", 150, 0);
		ItemStack etable = Utils.createShopItem(Material.ENCHANTMENT_TABLE, (short) 0, "&8« &3&lEnchantment Table &8»", 500, 0);
		ItemStack anvil = Utils.createShopItem(Material.ANVIL, (short) 0, "&8« &3&lAnvil &8»", 1000, 0);
		ItemStack echest = Utils.createShopItem(Material.ENDER_CHEST, (short) 0, "&8« &3&lEnder Chest &8»", 1000, 0);
		ItemStack shelf = Utils.createShopItem(Material.BOOKSHELF, (short) 0, "&8« &3&lBook Shelf &8»", 750, 0);
		ItemStack beacon = Utils.createShopItem(Material.BEACON, (short) 0, "&8« &3&lBeacon &8»", 25000, 0);
		ItemStack fns = Utils.createShopItem(Material.FLINT_AND_STEEL, (short) 0, "&8« &3&lFlint And Steel &8»", 145, 0);
		ItemStack dlsensor = Utils.createShopItem(Material.DAYLIGHT_DETECTOR, (short) 0, "&8« &3&lDaylight Sensor &8»", 640, 0);
		ItemStack triphook = Utils.createShopItem(Material.TRIPWIRE_HOOK, (short) 0, "&8« &3&lTripwire Hook &8»", 100, 0);
		ItemStack hopper = Utils.createShopItem(Material.HOPPER, (short) 0, "&8« &3&lHopper &8»", 25000, 0);
		ItemStack stickypiston = Utils.createShopItem(Material.PISTON_STICKY_BASE, (short) 0, "&8« &3&lSticky Piston &8»", 325, 0);
		ItemStack piston = Utils.createShopItem(Material.PISTON_BASE, (short) 0, "&8« &3&lPiston &8»", 195, 0);
		ItemStack redstonelamp = Utils.createShopItem(Material.REDSTONE_LAMP_OFF, (short) 0, "&8« &3&lRedstone Lamp &8»", 730, 0);
		ItemStack cobweb = Utils.createShopItem(Material.WEB, (short) 0, "&8« &3&lCobweb &8»", 40, 0);
		ItemStack dispenser = Utils.createShopItem(Material.DISPENSER, (short) 0, "&8« &3&lDispenser &8»", 50, 0);
		ItemStack ice = Utils.createShopItem(Material.ICE, (short) 0, "&8« &3&lIce &8»", 50, 0);
		ItemStack packedice = Utils.createShopItem(Material.PACKED_ICE, (short) 0, "&8« &3&lPacked Ice &8»", 75, 0);
		ItemStack snow = Utils.createShopItem(Material.SNOW_BLOCK, (short) 0, "&8« &3&lSnow Block &8»", 250, 0);
		ItemStack sponge = Utils.createShopItem(Material.SPONGE, (short) 0, "&8« &3&lSponge &8»", 2000, 0);
		ItemStack netherfence = Utils.createShopItem(Material.NETHER_FENCE, (short) 0, "&8« &3&lNether Fence &8»", 4.06, 1.41);

		ItemStack cchest = Utils.createShopItem(Material.BEACON, (short) 0, "&8« &3&lChunk Collector &8»", 250000, 0);
		ItemStack crod = Utils.createShopItem(Material.BLAZE_ROD, (short) 0, "&8« &3&lCharge Rod &8»", 25000, 0);
		ItemStack tray = Utils.createShopItem(Material.DIAMOND_PICKAXE, (short) 0, "&8« &3&lTray Pickaxe &8»", 100000, 0);
		ItemStack hoe = Utils.createShopItem(Material.DIAMOND_HOE, (short) 0, "&8« &3&lHarvest Hoe &8»", 250000, 0);
		ItemStack bucket = Utils.createShopItem(Material.WATER_BUCKET, (short) 0, "&8« &3&lLarge Water Bucket &8»", 50000, 0);
		ItemStack msword = Utils.createShopItem(Material.DIAMOND_SWORD, (short) 0, "&8« &3&lMob Sword &8»", 150000, 0);
		ItemStack tntwand = Utils.createShopItem(Material.STICK, (short) 0, "&8« &3&lTNT Wand &8»", 100000, 0);
		ItemStack sandwand = Utils.createShopItem(Material.BONE, (short) 0, "&8« &3&lSand Wand &8»", 150000, 0);
		
		inv.setItem(0, chest);
		inv.setItem(1, tchest);
		inv.setItem(2, etable);
		inv.setItem(3, anvil);
		inv.setItem(4, echest);
		inv.setItem(5, shelf);
		inv.setItem(6, beacon);
		inv.setItem(7, fns);
		inv.setItem(8, dlsensor);
		inv.setItem(9, triphook);
		inv.setItem(10, hopper);
		inv.setItem(11, stickypiston);
		inv.setItem(12, piston);
		inv.setItem(13, redstonelamp);
		inv.setItem(14, cobweb);
		inv.setItem(15, dispenser);
		inv.setItem(16, ice);
		inv.setItem(17, packedice);
		inv.setItem(18, snow);
		inv.setItem(19, sponge);
		inv.setItem(20, netherfence);
		inv.setItem(21, cchest);
		inv.setItem(22, crod);
		inv.setItem(23, tray);
		inv.setItem(24, hoe);
		inv.setItem(25, msword);
		inv.setItem(26, bucket);
		inv.setItem(27, tntwand);
		inv.setItem(28, sandwand);
		
		inv.setItem(35, back);
		
		p.openInventory(inv);
	}

	public static void openBrewingPotionShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 27, Utils.color("&8Shop (Brewing and Potions)"));

		ItemStack regenII = Utils.createShopItem(Material.POTION, (short) 8225, "&8« &3&lRegeneration II Potion &8»", 120, 0);
		ItemStack regenIIs = Utils.createShopItem(Material.POTION, (short) 16417, "&8« &3&lRegeneration II Splash &8»", 145, 0);
		ItemStack speedII = Utils.createShopItem(Material.POTION, (short) 8226, "&8« &3&lSpeed II Potion &8»", 30, 0);
		ItemStack speedIIs = Utils.createShopItem(Material.POTION, (short) 16418, "&8« &3&lSpeed II Splash &8»", 55, 0);
		ItemStack strengthII = Utils.createShopItem(Material.POTION, (short) 8233, "&8« &3&lStrength II Potion &8»", 110, 0);
		ItemStack strengthIIs = Utils.createShopItem(Material.POTION, (short) 16425, "&8« &3&lStrength II Splash &8»", 85, 0);
		ItemStack healthIIs = Utils.createShopItem(Material.POTION, (short) 16421, "&8« &3&lHealth II Splash &8»", 75, 0);
		ItemStack waterbreahing = Utils.createShopItem(Material.POTION, (short) 8269, "&8« &3&lWater Breathing Potion &8»", 225, 0);
		ItemStack fireres = Utils.createShopItem(Material.POTION, (short) 8259, "&8« &3&lFire Resistance Potion &8»", 1000, 0);
		ItemStack spidereye = Utils.createShopItem(Material.SPIDER_EYE, (short) 0, "&8« &3&lSpider Eye &8»", 130, 7.50);
		ItemStack ghasttear = Utils.createShopItem(Material.GHAST_TEAR, (short) 0, "&8« &3&lGhast Tear &8»", 97.50, 40);
		ItemStack brewingstand = Utils.createShopItem(Material.BREWING_STAND_ITEM, (short) 0, "&8« &3&lBrewing Stand &8»", 315, 0);
		ItemStack waterbottle = Utils.createShopItem(Material.POTION, (short) 0, "&8« &3&lWater Bottle &8»", 10.44, 0);
		ItemStack goldcarrot = Utils.createShopItem(Material.GOLDEN_CARROT, (short) 0, "&8« &3&lGolden Carrot &8»", 73.12, 0);
		ItemStack glowstonedust = Utils.createShopItem(Material.GLOWSTONE_DUST, (short) 0, "&8« &3&lGlowstone Dust &8»", 5, 0);
		ItemStack sugar = Utils.createShopItem(Material.SUGAR, (short) 0, "&8« &3&lSugar &8»", 5, 0);
		ItemStack slimeball = Utils.createShopItem(Material.SLIME_BALL, (short) 0, "&8« &3&lSlime Ball &8»", 200, 0);
		ItemStack netherwarts = Utils.createShopItem(Material.NETHER_STALK, (short) 0, "&8« &3&lNether Warts &8»", 16.25, 4.06);
		ItemStack gmelon = Utils.createShopItem(Material.SPECKLED_MELON, (short) 0, "&8« &3&lGlistering Melon &8»", 38.75, 0);
		ItemStack milk = Utils.createShopItem(Material.MILK_BUCKET, (short) 0, "&8« &3&lMilk &8»", 50.0, 0);
		
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
		inv.setItem(18, milk);
		inv.setItem(26, back);
		
		p.openInventory(inv);
	}

	public static void openWoolShop(Player p){
		Inventory inv = Bukkit.createInventory(p, 36, Utils.color("&8Shop (Wool)"));

		ItemStack red = Utils.createShopItem(Material.WOOL, (short) 14, "&8« &3&lRed Wool &8»", 2.34, 1.25);
		ItemStack orange = Utils.createShopItem(Material.WOOL, (short) 1, "&8« &3&lOrange Wool &8»", 2.34, 1.25);
		ItemStack yellow = Utils.createShopItem(Material.WOOL, (short) 4, "&8« &3&lYellow Wool &8»", 2.34, 1.25);
		ItemStack lime = Utils.createShopItem(Material.WOOL, (short) 5, "&8« &3&lLime Wool &8»", 2.34, 1.25);
		ItemStack green = Utils.createShopItem(Material.WOOL, (short) 13, "&8« &3&lGreen Wool &8»", 2.34, 1.25);
		ItemStack blue = Utils.createShopItem(Material.WOOL, (short) 11, "&8« &3&lBlue Wool &8»", 2.34, 1.25);
		ItemStack cyan = Utils.createShopItem(Material.WOOL, (short) 9, "&8« &3&lCyan Wool &8»", 2.34, 1.25);
		ItemStack lightblue = Utils.createShopItem(Material.WOOL, (short) 3, "&8« &3&lLight Blue Wool &8»", 2.34, 1.25);
		ItemStack purple = Utils.createShopItem(Material.WOOL, (short) 10, "&8« &3&lPurple Wool &8»", 2.34, 1.25);
		ItemStack magenta = Utils.createShopItem(Material.WOOL, (short) 2, "&8« &3&lMagenta Wool &8»", 2.34, 1.25);
		ItemStack pink = Utils.createShopItem(Material.WOOL, (short) 6, "&8« &3&lPink Wool &8»", 2.34, 1.25);
		ItemStack black = Utils.createShopItem(Material.WOOL, (short) 15, "&8« &3&lBlack Wool &8»", 2.34, 1.25);
		ItemStack gray = Utils.createShopItem(Material.WOOL, (short) 7, "&8« &3&lGray Wool &8»", 2.34, 1.25);
		ItemStack lightgray = Utils.createShopItem(Material.WOOL, (short) 8, "&8« &3&lLight Gray Wool &8»", 2.34, 1.25);
		ItemStack white = Utils.createShopItem(Material.WOOL, (short) 0, "&8« &3&lWhite Wool &8»", 2.34, 1.25);
		ItemStack brown = Utils.createShopItem(Material.WOOL, (short) 12, "&8« &3&lBrown Wool &8»", 2.34, 1.25);
		
		ItemStack redc = Utils.createShopItem(Material.CARPET, (short) 14, "&8« &3&lRed Carpet &8»", 1.56, 0);
		ItemStack orangec = Utils.createShopItem(Material.CARPET, (short) 1, "&8« &3&lOrange Carpet &8»", 1.56, 0);
		ItemStack yellowc = Utils.createShopItem(Material.CARPET, (short) 4, "&8« &3&lYellow Carpet &8»", 1.56, 0);
		ItemStack limec = Utils.createShopItem(Material.CARPET, (short) 5, "&8« &3&lLime Carpet &8»", 1.56, 0);
		ItemStack greenc = Utils.createShopItem(Material.CARPET, (short) 13, "&8« &3&lGreen Carpet &8»", 1.56, 0);
		ItemStack bluec = Utils.createShopItem(Material.CARPET, (short) 11, "&8« &3&lBlue Carpet &8»", 1.56, 0);
		ItemStack cyanc = Utils.createShopItem(Material.CARPET, (short) 9, "&8« &3&lCyan Carpet &8»", 1.56, 0);
		ItemStack lightbluec = Utils.createShopItem(Material.CARPET, (short) 3, "&8« &3&lLight Blue Carpet &8»", 1.56, 0);
		ItemStack purplec = Utils.createShopItem(Material.CARPET, (short) 10, "&8« &3&lPurple Carpet &8»", 1.56, 0);
		ItemStack magentac = Utils.createShopItem(Material.CARPET, (short) 2, "&8« &3&lMagenta Carpet &8»", 1.56, 0);
		ItemStack pinkc = Utils.createShopItem(Material.CARPET, (short) 6, "&8« &3&lPink Carpet &8»", 1.56, 0);
		ItemStack blackc = Utils.createShopItem(Material.CARPET, (short) 15, "&8« &3&lBlack Carpet &8»", 1.56, 0);
		ItemStack grayc = Utils.createShopItem(Material.CARPET, (short) 7, "&8« &3&lGray Carpet &8»", 1.56, 0);
		ItemStack lightgrayc = Utils.createShopItem(Material.CARPET, (short) 8, "&8« &3&lLight Gray Carpet &8»", 1.56, 0);
		ItemStack whitec = Utils.createShopItem(Material.CARPET, (short) 0, "&8« &3&lWhite Carpet &8»", 1.56, 0);
		ItemStack brownc = Utils.createShopItem(Material.CARPET, (short) 12, "&8« &3&lBrown Carpet &8»", 1.56, 0);
		
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

		ItemStack red = Utils.createShopItem(Material.STAINED_GLASS, (short) 14, "&8« &3&lRed Stained Glass &8»", 6.25, 0);
		ItemStack orange = Utils.createShopItem(Material.STAINED_GLASS, (short) 1, "&8« &3&lOrange Stained Glass &8»", 6.25, 0);
		ItemStack yellow = Utils.createShopItem(Material.STAINED_GLASS, (short) 4, "&8« &3&lYellow Stained Glass &8»", 6.25, 0);
		ItemStack lime = Utils.createShopItem(Material.STAINED_GLASS, (short) 5, "&8« &3&lLime Stained Glass &8»", 6.25, 0);
		ItemStack green = Utils.createShopItem(Material.STAINED_GLASS, (short) 13, "&8« &3&lGreen Stained Glass &8»", 6.25, 0);
		ItemStack blue = Utils.createShopItem(Material.STAINED_GLASS, (short) 11, "&8« &3&lBlue Stained Glass &8»", 6.25, 0);
		ItemStack cyan = Utils.createShopItem(Material.STAINED_GLASS, (short) 9, "&8« &3&lCyan Stained Glass &8»", 6.25, 0);
		ItemStack lightblue = Utils.createShopItem(Material.STAINED_GLASS, (short) 3, "&8« &3&lLight Blue Stained Glass &8»", 6.25, 0);
		ItemStack purple = Utils.createShopItem(Material.STAINED_GLASS, (short) 10, "&8« &3&lPurple Stained Glass &8»", 6.25, 0);
		ItemStack magenta = Utils.createShopItem(Material.STAINED_GLASS, (short) 2, "&8« &3&lMagenta Stained Glass &8»", 6.25, 0);
		ItemStack pink = Utils.createShopItem(Material.STAINED_GLASS, (short) 6, "&8« &3&lPink Stained Glass &8»", 6.25, 0);
		ItemStack black = Utils.createShopItem(Material.STAINED_GLASS, (short) 15, "&8« &3&lBlack Stained Glass &8»", 6.25, 0);
		ItemStack gray = Utils.createShopItem(Material.STAINED_GLASS, (short) 7, "&8« &3&lGray Stained Glass &8»", 6.25, 0);
		ItemStack lightgray = Utils.createShopItem(Material.STAINED_GLASS, (short) 8, "&8« &3&lLight Gray Stained Glass &8»", 6.25, 0);
		ItemStack white = Utils.createShopItem(Material.STAINED_GLASS, (short) 0, "&8« &3&lWhite Stained Glass &8»", 6.25, 0);
		ItemStack brown = Utils.createShopItem(Material.STAINED_GLASS, (short) 12, "&8« &3&lBrown Stained Glass &8»", 6.25, 0);

		ItemStack clear = Utils.createShopItem(Material.GLASS, (short) 0, "&8« &3&lGlass &8»", 4.06, 0);
		ItemStack clearp = Utils.createShopItem(Material.THIN_GLASS, (short) 12, "&8« &3&lGlass Pane &8»", 2.34, 0);
		
		
		ItemStack redp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 14, "&8« &3&lRed Stained Glass Pane &8»", 2.34, 0);
		ItemStack orangep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 1, "&8« &3&lOrange Stained Glass Pane &8»", 2.34, 0);
		ItemStack yellowp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 4, "&8« &3&lYellow Stained Glass Pane &8»", 2.34, 0);
		ItemStack limep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 5, "&8« &3&lLime Stained Glass Pane &8»", 2.34, 0);
		ItemStack greenp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 13, "&8« &3&lGreen Stained Glass Pane &8»", 2.34, 0);
		ItemStack bluep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 11, "&8« &3&lBlue Stained Glass Pane &8»", 2.34, 0);
		ItemStack cyanp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 9, "&8« &3&lCyan Stained Glass Pane &8»", 2.34, 0);
		ItemStack lightbluep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 3, "&8« &3&lLight Blue Stained Glass Pane &8»", 2.34, 0);
		ItemStack purplep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 10, "&8« &3&lPurple Stained Glass Pane &8»", 2.34, 0);
		ItemStack magentap = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 2, "&8« &3&lMagenta Stained Glass Pane &8»", 2.34, 0);
		ItemStack pinkp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 6, "&8« &3&lPink Stained Glass Pane &8»", 2.34, 0);
		ItemStack blackp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 15, "&8« &3&lBlack Stained Glass Pane &8»", 2.34, 0);
		ItemStack grayp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 7, "&8« &3&lGray Stained Glass Pane &8»", 2.34, 0);
		ItemStack lightgrayp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 8, "&8« &3&lLight Gray Stained Glass Pane &8»", 2.34, 0);
		ItemStack whitep = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 0, "&8« &3&lWhite Stained Glass Pane &8»", 2.34, 0);
		ItemStack brownp = Utils.createShopItem(Material.STAINED_GLASS_PANE, (short) 12, "&8« &3&lBrown Stained Glass Pane &8»", 2.34, 0);
		
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

		ItemStack red = Utils.createShopItem(Material.STAINED_CLAY, (short) 14, "&8« &3&lRed Stained Clay &8»", 6.25, 0);
		ItemStack orange = Utils.createShopItem(Material.STAINED_CLAY, (short) 1, "&8« &3&lOrange Stained Clay &8»", 6.25, 0);
		ItemStack yellow = Utils.createShopItem(Material.STAINED_CLAY, (short) 4, "&8« &3&lYellow Stained Clay &8»", 6.25, 0);
		ItemStack lime = Utils.createShopItem(Material.STAINED_CLAY, (short) 5, "&8« &3&lLime Stained Clay &8»", 6.25, 0);
		ItemStack green = Utils.createShopItem(Material.STAINED_CLAY, (short) 13, "&8« &3&lGreen Stained Clay &8»", 6.25, 0);
		ItemStack blue = Utils.createShopItem(Material.STAINED_CLAY, (short) 11, "&8« &3&lBlue Stained Clay &8»", 6.25, 0);
		ItemStack cyan = Utils.createShopItem(Material.STAINED_CLAY, (short) 9, "&8« &3&lCyan Stained Clay &8»", 6.25, 0);
		ItemStack lightblue = Utils.createShopItem(Material.STAINED_CLAY, (short) 3, "&8« &3&lLight Blue Stained Clay &8»", 6.25, 0);
		ItemStack purple = Utils.createShopItem(Material.STAINED_CLAY, (short) 10, "&8« &3&lPurple Stained Clay &8»", 6.25, 0);
		ItemStack magenta = Utils.createShopItem(Material.STAINED_CLAY, (short) 2, "&8« &3&lMagenta Stained Clay &8»", 6.25, 0);
		ItemStack pink = Utils.createShopItem(Material.STAINED_CLAY, (short) 6, "&8« &3&lPink Stained Clay &8»", 6.25, 0);
		ItemStack black = Utils.createShopItem(Material.STAINED_CLAY, (short) 15, "&8« &3&lBlack Stained Clay &8»", 6.25, 0);
		ItemStack gray = Utils.createShopItem(Material.STAINED_CLAY, (short) 7, "&8« &3&lGray Stained Clay &8»", 6.25, 0);
		ItemStack lightgray = Utils.createShopItem(Material.STAINED_CLAY, (short) 8, "&8« &3&lLight Gray Stained Clay &8»", 6.25, 0);
		ItemStack white = Utils.createShopItem(Material.STAINED_CLAY, (short) 0, "&8« &3&lWhite Stained Clay &8»", 6.25, 0);
		ItemStack brown = Utils.createShopItem(Material.STAINED_CLAY, (short) 12, "&8« &3&lBrown Stained Clay &8»", 6.25, 0);
		ItemStack hardened = Utils.createShopItem(Material.HARD_CLAY, (short) 0, "&8« &3&lHardened Clay &8»", 6.25, 0);
		ItemStack clay = Utils.createShopItem(Material.CLAY, (short) 0, "&8« &3&lClay &8»", 6.25, 0);
		
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

		ItemStack f1 = Utils.createShopItem(Material.RED_ROSE, (short) 0, "&8« &3&lPoppy &8»", 18.75, 0);
		ItemStack f2 = Utils.createShopItem(Material.YELLOW_FLOWER, (short) 0, "&8« &3&lDandelion &8»", 18.75, 0);
		ItemStack f3 = Utils.createShopItem(Material.RED_ROSE, (short) 1, "&8« &3&lBlue Orchid &8»", 18.75, 0);
		ItemStack f4 = Utils.createShopItem(Material.RED_ROSE, (short) 2, "&8« &3&lAllium &8»", 18.75, 0);
		ItemStack f5 = Utils.createShopItem(Material.RED_ROSE, (short) 3, "&8« &3&lAzure Bluet &8»", 18.75, 0);
		ItemStack f6 = Utils.createShopItem(Material.RED_ROSE, (short) 8, "&8« &3&lOxeye Daisy &8»", 18.75, 0);
		ItemStack f7 = Utils.createShopItem(Material.RED_ROSE, (short) 4, "&8« &3&lRed Tulip &8»", 18.75, 0);
		ItemStack f8 = Utils.createShopItem(Material.RED_ROSE, (short) 5, "&8« &3&lOrange Tulip &8»", 18.75, 0);
		ItemStack f9 = Utils.createShopItem(Material.RED_ROSE, (short) 7, "&8« &3&lPink Tulip &8»", 18.75, 0);
		ItemStack f10 = Utils.createShopItem(Material.RED_ROSE, (short) 6, "&8« &3&lWhite Tulip &8»", 18.75, 0);
		ItemStack f11 = Utils.createShopItem(Material.DOUBLE_PLANT, (short) 0, "&8« &3&lSunflower &8»", 18.75, 0);
		ItemStack f12 = Utils.createShopItem(Material.DOUBLE_PLANT, (short) 1, "&8« &3&lLilac &8»", 18.75, 0);
		ItemStack f13 = Utils.createShopItem(Material.DOUBLE_PLANT, (short) 4, "&8« &3&lRose Bush &8»", 18.75, 0);
		ItemStack f14 = Utils.createShopItem(Material.VINE, (short) 0, "&8« &3&lVine &8»", 75, 0);
		ItemStack f15 = Utils.createShopItem(Material.RED_MUSHROOM, (short) 0, "&8« &3&lRed Mushroom &8»", 10, 0);
		ItemStack pot = Utils.createShopItem(Material.FLOWER_POT_ITEM, (short) 0, "&8« &3&lFlower Pot &8»", 300, 0);
		
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
