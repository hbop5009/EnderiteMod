package net.mcreator.enderite.procedures;

import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.enderite.EnderiteModVariables;
import net.mcreator.enderite.EnderiteMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import java.util.HashMap;

public class VoidSaveProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EnderiteMod.LOGGER.warn("Failed to load dependency entity for procedure VoidSave!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double slot = 0;
		if (((entity.getPosY()) < 0)) {
			if ((entity.isAlive())) {
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (0), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite0 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (1), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (2), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (3), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (4), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (5), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (6), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite6 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (7), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite7 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (8), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite8 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (9), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite9 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (10), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite10 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (11), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite11 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (12), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite12 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (13), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite13 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (14), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite14 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (15), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite15 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (16), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite16 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (17), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite17 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (18), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite18 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (19), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite19 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (20), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite20 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (21), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite21 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (22), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite22 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (23), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite23 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (24), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite24 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (25), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite25 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (26), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite26 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (27), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite27 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (28), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite28 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (29), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite29 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (30), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite30 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (31), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite31 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (32), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite32 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (33), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite33 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (34), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite34 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = (new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack((int) (35), entity));
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite35 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = ((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
							: ItemStack.EMPTY);
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite_helmet = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = ((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
							: ItemStack.EMPTY);
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite_chestplate = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = ((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
							: ItemStack.EMPTY);
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite_leggings = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = ((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
							: ItemStack.EMPTY);
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite_boots = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					ItemStack _setval = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY);
					entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.enderite_offhand = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			{
				boolean _setval = (boolean) (true);
				entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.below_y0 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = (boolean) (false);
				entity.getCapability(EnderiteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.below_y0 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
