package com.micphone.machine.item;

import com.micphone.machine.Machine;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

/*
* The class that holds all the items for the mod.
* */
public class ModItems {
    // The DeferredRegister for the items.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Machine.MOD_ID);

    // The items.
    public static final Supplier<Item> COPPERWIRE = ITEMS.register("copperwire", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> GEAR = ITEMS.register("gear", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> LUBRICANT = ITEMS.register("lubricant", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> MECHANICALCORE = ITEMS.register("mechanicalcore", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> SILICONWAFER = ITEMS.register("siliconwafer", () -> new Item(new Item.Properties()));

    // Registers the items.
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}