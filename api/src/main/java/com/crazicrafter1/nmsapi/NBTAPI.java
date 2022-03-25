package com.crazicrafter1.nmsapi;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

public class NBTAPI {

    private static final INBTTagCompound COMPOUND_impl = new NBTAPI().match();

    private INBTTagCompound match() {
        final String serverVersion = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3].substring(1);
        try {
            return (INBTTagCompound) Class.forName(getClass().getPackage().getName() + "." + serverVersion).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static INBTTagCompound getNBT() {
        return COMPOUND_impl.getNBT();
    }

    public static INBTTagCompound getNBT(String s) {
        return COMPOUND_impl.getNBT(s);
    }

    public static INBTTagCompound getNBT(ItemStack itemStack) {
        return COMPOUND_impl.getNBT(itemStack);
    }
}
