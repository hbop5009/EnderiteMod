package net.mcreator.enderite;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class EnderiteModVariables {
	public EnderiteModVariables(EnderiteModElements elements) {
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("enderite", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.put("enderite_helmet", instance.enderite_helmet.write(new CompoundNBT()));
			nbt.put("enderite_chestplate", instance.enderite_chestplate.write(new CompoundNBT()));
			nbt.put("enderite_leggings", instance.enderite_leggings.write(new CompoundNBT()));
			nbt.put("enderite_boots", instance.enderite_boots.write(new CompoundNBT()));
			nbt.put("enderite1", instance.enderite1.write(new CompoundNBT()));
			nbt.put("enderite2", instance.enderite2.write(new CompoundNBT()));
			nbt.put("enderite3", instance.enderite3.write(new CompoundNBT()));
			nbt.put("enderite4", instance.enderite4.write(new CompoundNBT()));
			nbt.put("enderite5", instance.enderite5.write(new CompoundNBT()));
			nbt.put("enderite6", instance.enderite6.write(new CompoundNBT()));
			nbt.put("enderite7", instance.enderite7.write(new CompoundNBT()));
			nbt.put("enderite8", instance.enderite8.write(new CompoundNBT()));
			nbt.put("enderite9", instance.enderite9.write(new CompoundNBT()));
			nbt.put("enderite10", instance.enderite10.write(new CompoundNBT()));
			nbt.put("enderite11", instance.enderite11.write(new CompoundNBT()));
			nbt.put("enderite12", instance.enderite12.write(new CompoundNBT()));
			nbt.put("enderite13", instance.enderite13.write(new CompoundNBT()));
			nbt.put("enderite14", instance.enderite14.write(new CompoundNBT()));
			nbt.put("enderite15", instance.enderite15.write(new CompoundNBT()));
			nbt.put("enderite16", instance.enderite16.write(new CompoundNBT()));
			nbt.put("enderite17", instance.enderite17.write(new CompoundNBT()));
			nbt.put("enderite18", instance.enderite18.write(new CompoundNBT()));
			nbt.put("enderite19", instance.enderite19.write(new CompoundNBT()));
			nbt.put("enderite20", instance.enderite20.write(new CompoundNBT()));
			nbt.put("enderite21", instance.enderite21.write(new CompoundNBT()));
			nbt.put("enderite22", instance.enderite22.write(new CompoundNBT()));
			nbt.put("enderite23", instance.enderite23.write(new CompoundNBT()));
			nbt.put("enderite24", instance.enderite24.write(new CompoundNBT()));
			nbt.put("enderite25", instance.enderite25.write(new CompoundNBT()));
			nbt.put("enderite26", instance.enderite26.write(new CompoundNBT()));
			nbt.put("enderite27", instance.enderite27.write(new CompoundNBT()));
			nbt.put("enderite28", instance.enderite28.write(new CompoundNBT()));
			nbt.put("enderite29", instance.enderite29.write(new CompoundNBT()));
			nbt.put("enderite30", instance.enderite30.write(new CompoundNBT()));
			nbt.put("enderite31", instance.enderite31.write(new CompoundNBT()));
			nbt.put("enderite32", instance.enderite32.write(new CompoundNBT()));
			nbt.put("enderite33", instance.enderite33.write(new CompoundNBT()));
			nbt.put("enderite34", instance.enderite34.write(new CompoundNBT()));
			nbt.put("enderite35", instance.enderite35.write(new CompoundNBT()));
			nbt.put("enderite0", instance.enderite0.write(new CompoundNBT()));
			nbt.put("enderite_offhand", instance.enderite_offhand.write(new CompoundNBT()));
			nbt.putBoolean("below_y0", instance.below_y0);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.enderite_helmet = ItemStack.read(nbt.getCompound("enderite_helmet"));
			instance.enderite_chestplate = ItemStack.read(nbt.getCompound("enderite_chestplate"));
			instance.enderite_leggings = ItemStack.read(nbt.getCompound("enderite_leggings"));
			instance.enderite_boots = ItemStack.read(nbt.getCompound("enderite_boots"));
			instance.enderite1 = ItemStack.read(nbt.getCompound("enderite1"));
			instance.enderite2 = ItemStack.read(nbt.getCompound("enderite2"));
			instance.enderite3 = ItemStack.read(nbt.getCompound("enderite3"));
			instance.enderite4 = ItemStack.read(nbt.getCompound("enderite4"));
			instance.enderite5 = ItemStack.read(nbt.getCompound("enderite5"));
			instance.enderite6 = ItemStack.read(nbt.getCompound("enderite6"));
			instance.enderite7 = ItemStack.read(nbt.getCompound("enderite7"));
			instance.enderite8 = ItemStack.read(nbt.getCompound("enderite8"));
			instance.enderite9 = ItemStack.read(nbt.getCompound("enderite9"));
			instance.enderite10 = ItemStack.read(nbt.getCompound("enderite10"));
			instance.enderite11 = ItemStack.read(nbt.getCompound("enderite11"));
			instance.enderite12 = ItemStack.read(nbt.getCompound("enderite12"));
			instance.enderite13 = ItemStack.read(nbt.getCompound("enderite13"));
			instance.enderite14 = ItemStack.read(nbt.getCompound("enderite14"));
			instance.enderite15 = ItemStack.read(nbt.getCompound("enderite15"));
			instance.enderite16 = ItemStack.read(nbt.getCompound("enderite16"));
			instance.enderite17 = ItemStack.read(nbt.getCompound("enderite17"));
			instance.enderite18 = ItemStack.read(nbt.getCompound("enderite18"));
			instance.enderite19 = ItemStack.read(nbt.getCompound("enderite19"));
			instance.enderite20 = ItemStack.read(nbt.getCompound("enderite20"));
			instance.enderite21 = ItemStack.read(nbt.getCompound("enderite21"));
			instance.enderite22 = ItemStack.read(nbt.getCompound("enderite22"));
			instance.enderite23 = ItemStack.read(nbt.getCompound("enderite23"));
			instance.enderite24 = ItemStack.read(nbt.getCompound("enderite24"));
			instance.enderite25 = ItemStack.read(nbt.getCompound("enderite25"));
			instance.enderite26 = ItemStack.read(nbt.getCompound("enderite26"));
			instance.enderite27 = ItemStack.read(nbt.getCompound("enderite27"));
			instance.enderite28 = ItemStack.read(nbt.getCompound("enderite28"));
			instance.enderite29 = ItemStack.read(nbt.getCompound("enderite29"));
			instance.enderite30 = ItemStack.read(nbt.getCompound("enderite30"));
			instance.enderite31 = ItemStack.read(nbt.getCompound("enderite31"));
			instance.enderite32 = ItemStack.read(nbt.getCompound("enderite32"));
			instance.enderite33 = ItemStack.read(nbt.getCompound("enderite33"));
			instance.enderite34 = ItemStack.read(nbt.getCompound("enderite34"));
			instance.enderite35 = ItemStack.read(nbt.getCompound("enderite35"));
			instance.enderite0 = ItemStack.read(nbt.getCompound("enderite0"));
			instance.enderite_offhand = ItemStack.read(nbt.getCompound("enderite_offhand"));
			instance.below_y0 = nbt.getBoolean("below_y0");
		}
	}

	public static class PlayerVariables {
		public ItemStack enderite_helmet = ItemStack.EMPTY;
		public ItemStack enderite_chestplate = ItemStack.EMPTY;
		public ItemStack enderite_leggings = ItemStack.EMPTY;
		public ItemStack enderite_boots = ItemStack.EMPTY;
		public ItemStack enderite1 = ItemStack.EMPTY;
		public ItemStack enderite2 = ItemStack.EMPTY;
		public ItemStack enderite3 = ItemStack.EMPTY;
		public ItemStack enderite4 = ItemStack.EMPTY;
		public ItemStack enderite5 = ItemStack.EMPTY;
		public ItemStack enderite6 = ItemStack.EMPTY;
		public ItemStack enderite7 = ItemStack.EMPTY;
		public ItemStack enderite8 = ItemStack.EMPTY;
		public ItemStack enderite9 = ItemStack.EMPTY;
		public ItemStack enderite10 = ItemStack.EMPTY;
		public ItemStack enderite11 = ItemStack.EMPTY;
		public ItemStack enderite12 = ItemStack.EMPTY;
		public ItemStack enderite13 = ItemStack.EMPTY;
		public ItemStack enderite14 = ItemStack.EMPTY;
		public ItemStack enderite15 = ItemStack.EMPTY;
		public ItemStack enderite16 = ItemStack.EMPTY;
		public ItemStack enderite17 = ItemStack.EMPTY;
		public ItemStack enderite18 = ItemStack.EMPTY;
		public ItemStack enderite19 = ItemStack.EMPTY;
		public ItemStack enderite20 = ItemStack.EMPTY;
		public ItemStack enderite21 = ItemStack.EMPTY;
		public ItemStack enderite22 = ItemStack.EMPTY;
		public ItemStack enderite23 = ItemStack.EMPTY;
		public ItemStack enderite24 = ItemStack.EMPTY;
		public ItemStack enderite25 = ItemStack.EMPTY;
		public ItemStack enderite26 = ItemStack.EMPTY;
		public ItemStack enderite27 = ItemStack.EMPTY;
		public ItemStack enderite28 = ItemStack.EMPTY;
		public ItemStack enderite29 = ItemStack.EMPTY;
		public ItemStack enderite30 = ItemStack.EMPTY;
		public ItemStack enderite31 = ItemStack.EMPTY;
		public ItemStack enderite32 = ItemStack.EMPTY;
		public ItemStack enderite33 = ItemStack.EMPTY;
		public ItemStack enderite34 = ItemStack.EMPTY;
		public ItemStack enderite35 = ItemStack.EMPTY;
		public ItemStack enderite0 = ItemStack.EMPTY;
		public ItemStack enderite_offhand = ItemStack.EMPTY;
		public boolean below_y0 = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				EnderiteMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity),
						new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.enderite_helmet = original.enderite_helmet;
		clone.enderite_chestplate = original.enderite_chestplate;
		clone.enderite_leggings = original.enderite_leggings;
		clone.enderite_boots = original.enderite_boots;
		clone.enderite1 = original.enderite1;
		clone.enderite2 = original.enderite2;
		clone.enderite3 = original.enderite3;
		clone.enderite4 = original.enderite4;
		clone.enderite5 = original.enderite5;
		clone.enderite6 = original.enderite6;
		clone.enderite7 = original.enderite7;
		clone.enderite8 = original.enderite8;
		clone.enderite9 = original.enderite9;
		clone.enderite10 = original.enderite10;
		clone.enderite11 = original.enderite11;
		clone.enderite12 = original.enderite12;
		clone.enderite13 = original.enderite13;
		clone.enderite14 = original.enderite14;
		clone.enderite15 = original.enderite15;
		clone.enderite16 = original.enderite16;
		clone.enderite17 = original.enderite17;
		clone.enderite18 = original.enderite18;
		clone.enderite19 = original.enderite19;
		clone.enderite20 = original.enderite20;
		clone.enderite21 = original.enderite21;
		clone.enderite22 = original.enderite22;
		clone.enderite23 = original.enderite23;
		clone.enderite24 = original.enderite24;
		clone.enderite25 = original.enderite25;
		clone.enderite26 = original.enderite26;
		clone.enderite27 = original.enderite27;
		clone.enderite28 = original.enderite28;
		clone.enderite29 = original.enderite29;
		clone.enderite30 = original.enderite30;
		clone.enderite31 = original.enderite31;
		clone.enderite32 = original.enderite32;
		clone.enderite33 = original.enderite33;
		clone.enderite34 = original.enderite34;
		clone.enderite35 = original.enderite35;
		clone.enderite0 = original.enderite0;
		clone.enderite_offhand = original.enderite_offhand;
		clone.below_y0 = original.below_y0;
		if (!event.isWasDeath()) {
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.enderite_helmet = message.data.enderite_helmet;
					variables.enderite_chestplate = message.data.enderite_chestplate;
					variables.enderite_leggings = message.data.enderite_leggings;
					variables.enderite_boots = message.data.enderite_boots;
					variables.enderite1 = message.data.enderite1;
					variables.enderite2 = message.data.enderite2;
					variables.enderite3 = message.data.enderite3;
					variables.enderite4 = message.data.enderite4;
					variables.enderite5 = message.data.enderite5;
					variables.enderite6 = message.data.enderite6;
					variables.enderite7 = message.data.enderite7;
					variables.enderite8 = message.data.enderite8;
					variables.enderite9 = message.data.enderite9;
					variables.enderite10 = message.data.enderite10;
					variables.enderite11 = message.data.enderite11;
					variables.enderite12 = message.data.enderite12;
					variables.enderite13 = message.data.enderite13;
					variables.enderite14 = message.data.enderite14;
					variables.enderite15 = message.data.enderite15;
					variables.enderite16 = message.data.enderite16;
					variables.enderite17 = message.data.enderite17;
					variables.enderite18 = message.data.enderite18;
					variables.enderite19 = message.data.enderite19;
					variables.enderite20 = message.data.enderite20;
					variables.enderite21 = message.data.enderite21;
					variables.enderite22 = message.data.enderite22;
					variables.enderite23 = message.data.enderite23;
					variables.enderite24 = message.data.enderite24;
					variables.enderite25 = message.data.enderite25;
					variables.enderite26 = message.data.enderite26;
					variables.enderite27 = message.data.enderite27;
					variables.enderite28 = message.data.enderite28;
					variables.enderite29 = message.data.enderite29;
					variables.enderite30 = message.data.enderite30;
					variables.enderite31 = message.data.enderite31;
					variables.enderite32 = message.data.enderite32;
					variables.enderite33 = message.data.enderite33;
					variables.enderite34 = message.data.enderite34;
					variables.enderite35 = message.data.enderite35;
					variables.enderite0 = message.data.enderite0;
					variables.enderite_offhand = message.data.enderite_offhand;
					variables.below_y0 = message.data.below_y0;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
