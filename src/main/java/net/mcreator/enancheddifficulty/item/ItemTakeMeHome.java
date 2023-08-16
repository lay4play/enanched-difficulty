
package net.mcreator.enancheddifficulty.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.enancheddifficulty.creativetab.TabEnanchedDifficulty;
import net.mcreator.enancheddifficulty.ElementsEnanchedDifficulty;

@ElementsEnanchedDifficulty.ModElement.Tag
public class ItemTakeMeHome extends ElementsEnanchedDifficulty.ModElement {
	@GameRegistry.ObjectHolder("enancheddifficulty:takemehome")
	public static final Item block = null;
	public ItemTakeMeHome(ElementsEnanchedDifficulty instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("enancheddifficulty:takemehome", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("takemehome", ElementsEnanchedDifficulty.sounds.get(new ResourceLocation("enancheddifficulty:takemehome")));
			setUnlocalizedName("takemehome");
			setRegistryName("takemehome");
			setCreativeTab(TabEnanchedDifficulty.tab);
		}
	}
}
