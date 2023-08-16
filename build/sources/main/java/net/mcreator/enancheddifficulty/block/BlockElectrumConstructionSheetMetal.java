
package net.mcreator.enancheddifficulty.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.enancheddifficulty.creativetab.TabEnanchedDifficulty;
import net.mcreator.enancheddifficulty.ElementsEnanchedDifficulty;

@ElementsEnanchedDifficulty.ModElement.Tag
public class BlockElectrumConstructionSheetMetal extends ElementsEnanchedDifficulty.ModElement {
	@GameRegistry.ObjectHolder("enancheddifficulty:electrumconstructionsheetmetal")
	public static final Block block = null;
	public BlockElectrumConstructionSheetMetal(ElementsEnanchedDifficulty instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("electrumconstructionsheetmetal"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("enancheddifficulty:electrumconstructionsheetmetal", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("electrumconstructionsheetmetal");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabEnanchedDifficulty.tab);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
			return false;
		}
	}
}
