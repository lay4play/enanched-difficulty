
package net.mcreator.enancheddifficulty.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.enancheddifficulty.item.ItemEmptyCell;
import net.mcreator.enancheddifficulty.ElementsEnanchedDifficulty;

@ElementsEnanchedDifficulty.ModElement.Tag
public class TabEnanchedDifficultyCells extends ElementsEnanchedDifficulty.ModElement {
	public TabEnanchedDifficultyCells(ElementsEnanchedDifficulty instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabenancheddifficultycells") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemEmptyCell.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
