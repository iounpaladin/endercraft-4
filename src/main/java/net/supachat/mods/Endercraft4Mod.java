package net.supachat.mods;

import net.minecraft.block.BlockBeacon;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Endercraft4Mod.MODID, name = Endercraft4Mod.NAME, version = Endercraft4Mod.VERSION)
public class Endercraft4Mod {
    public static final String MODID = "endercraft4";
    public static final String NAME = "Endercaft 4 Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addShapedRecipe(
                new ResourceLocation("endercraft4_make_spawner"),
                new ResourceLocation(""),
                new ItemStack(Blocks.MOB_SPAWNER),
                "XXX",
                "XAX",
                "XXX",
                'X', Blocks.IRON_BARS,
                'A', Items.NETHER_STAR
        );

        NBTTagCompound nbtPotion = new NBTTagCompound();
        nbtPotion.setString("Potion", "minecraft:levitation");
//        ItemStack itemStack = new ItemStack(null);
//        PotionUtils.addPotionToItemStack(null, PotionTypes.LEAPING);
        BrewingRecipeRegistry.addRecipe(
                new ItemStack(Items.SHULKER_SHELL),
                new ItemStack(Items.FEATHER),
                new ItemStack(Items.POTIONITEM, 1, 0, nbtPotion)
        );
    }
}
