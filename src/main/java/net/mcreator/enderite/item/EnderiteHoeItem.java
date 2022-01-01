
package net.mcreator.enderite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.enderite.EnderiteModElements;

@EnderiteModElements.ModElement.Tag
public class EnderiteHoeItem extends EnderiteModElements.ModElement {
	@ObjectHolder("enderite:enderite_hoe")
	public static final Item block = null;

	public EnderiteHoeItem(EnderiteModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2032;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("enderite_hoe"));
	}
}
