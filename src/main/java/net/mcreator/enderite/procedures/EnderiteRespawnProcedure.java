package net.mcreator.enderite.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.tags.ItemTags;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.enderite.EnderiteModVariables;
import net.mcreator.enderite.EnderiteMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class EnderiteRespawnProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("endconquered", event.isEndConquered());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EnderiteMod.LOGGER.warn("Failed to load dependency entity for procedure EnderiteRespawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack current_item = ItemStack.EMPTY;
		if (((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new EnderiteModVariables.PlayerVariables())).below_y0)) {
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite0);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (0);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite1);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (1);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite2);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (2);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite3);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (3);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite4);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (4);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite5);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (5);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite6);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (6);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite7);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (7);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite8);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (8);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite9);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (9);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite10);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (10);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite11);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (11);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite12);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (12);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite13);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (13);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite14);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (14);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite15);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (15);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite16);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (16);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite17);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (17);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite18);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (18);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite19);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (19);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite20);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (20);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite21);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (21);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite22);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (22);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite23);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (23);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite24);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (24);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite25);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (25);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite26);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (26);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite27);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (27);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite28);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (28);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite29);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (29);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite30);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (30);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite31);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (31);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite32);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (32);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite33);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (33);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite34);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (34);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite35);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					{
						final ItemStack _setstack = (current_item);
						final int _sltid = (int) (35);
						_setstack.setCount((int) (((current_item)).getCount()));
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite_helmet);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					if (entity instanceof LivingEntity) {
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).inventory.armorInventory.set((int) 3, (current_item));
						else
							((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3),
									(current_item));
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite_chestplate);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					if (entity instanceof LivingEntity) {
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).inventory.armorInventory.set((int) 2, (current_item));
						else
							((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2),
									(current_item));
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite_leggings);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					if (entity instanceof LivingEntity) {
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).inventory.armorInventory.set((int) 1, (current_item));
						else
							((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1),
									(current_item));
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite_boots);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					if (entity instanceof LivingEntity) {
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).inventory.armorInventory.set((int) 0, (current_item));
						else
							((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0),
									(current_item));
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
			if ((true)) {
				current_item = ((entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new EnderiteModVariables.PlayerVariables())).enderite_offhand);
				{
					ItemStack _ist = (current_item);
					if (_ist.attemptDamageItem((int) Math.floor((((((current_item)).getMaxDamage()) - (((current_item)).getDamage())) / 2)),
							new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if ((ItemTags.getCollection().getTagByID(new ResourceLocation(("forge:void_respawn").toLowerCase(java.util.Locale.ENGLISH)))
						.contains((current_item).getItem()))) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = (current_item);
						_setstack.setCount((int) (((current_item)).getCount()));
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				}
			}
		}
	}
}
