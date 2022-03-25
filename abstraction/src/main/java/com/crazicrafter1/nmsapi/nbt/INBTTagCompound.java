package com.crazicrafter1.nmsapi.nbt;

import org.bukkit.inventory.ItemStack;

import java.util.Set;
import java.util.UUID;

public interface INBTTagCompound extends INBTBase {

    void set(String k, INBTBase v);
    void setByte(String k, byte v);
    void setShort(String k, short v);
    void setInt(String k, int v);
    void setLong(String k, long v);
    void setUUID(String k, UUID v);
    void setFloat(String k, float v);
    void setDouble(String k, double v);
    void setString(String k, String v);
    void setByteArray(String k, byte[] v);
    void setIntArray(String k, int[] v);
    void setLongArray(String k, long[] v);
    void setBoolean(String k, boolean v);

    INBTBase get(String k);
    byte getByte(String k);
    short getShort(String k);
    int getInt(String k);
    long getLong(String k);
    UUID getUUID(String k);
    float getFloat(String k);
    double getDouble(String k);
    String getString(String k);
    byte[] getByteArray(String k);
    int[] getIntArray(String k);
    long[] getLongArray(String k);
    INBTTagCompound getCompound(String k);
    INBTTagList getList(String k, int i);
    boolean getBoolean(String k);

    int getSize();
    void remove(String s);
    boolean isEmpty();

    Set<String> keys();
    boolean hasKey(String s);
    boolean hasKeyOfType(String s, int i);
    byte getTypeIdOf(String s);

    String serialize();

    ItemStack setNBT(ItemStack itemStack);

    INBTTagCompound getNBT();
    INBTTagCompound getNBT(String s);
    INBTTagCompound getNBT(ItemStack itemStack);
    INBTTagCompound getOrCreateNBT(ItemStack itemStack);
}
