package com.crazicrafter1.nmsapi;

import com.crazicrafter1.nmsapi.nbt.INBTTagCompound;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

public enum NMSAPI {
    ;

    private static final INBTTagCompound COMPOUND_impl = matchNBT();

    private static INBTTagCompound matchNBT() {
        final String serverVersion = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3].substring(1);
        try {
            return (INBTTagCompound) Class.forName(INBTTagCompound.class.getPackage().getName() + ".NBTTagCompound" + serverVersion).newInstance();
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

    public static INBTTagCompound getOrCreateNBT(ItemStack itemStack) {
        return COMPOUND_impl.getOrCreateNBT(itemStack);
    }

    //public static getItemStack()

}
