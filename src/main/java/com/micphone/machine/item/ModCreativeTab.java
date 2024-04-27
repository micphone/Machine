package com.micphone.machine.item;

import com.micphone.machine.Machine;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Machine.MOD_ID);

    public static final String MACHINE_TAB_STRING = "creaitvetab.machine";

    public static final Supplier<CreativeModeTab> MACHINE_TAB =
            CREATIVE_MODE_TABS.register("machine_tab", () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .title(Component.translatable(MACHINE_TAB_STRING))
                    .icon(() -> ModItems.MECHANICALCORE.get().getDefaultInstance())
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MECHANICALCORE.get());
                        pOutput.accept(ModItems.COPPERWIRE.get());
                        pOutput.accept(ModItems.GEAR.get());
                        pOutput.accept(ModItems.LUBRICANT.get());
                        pOutput.accept(ModItems.SILICONWAFER.get());
                    })
                    .build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
