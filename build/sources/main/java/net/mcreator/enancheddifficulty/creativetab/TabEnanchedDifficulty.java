
package net.mcreator.enancheddifficulty.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.enancheddifficulty.ElementsEnanchedDifficulty;

@ElementsEnanchedDifficulty.ModElement.Tag
public class TabEnanchedDifficulty extends ElementsEnanchedDifficulty.ModElement {
	public TabEnanchedDifficulty(ElementsEnanchedDifficulty instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabenancheddifficulty") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.CHICKEN, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
