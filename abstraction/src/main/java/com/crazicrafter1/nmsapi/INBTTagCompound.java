package com.crazicrafter1.nmsapi;

import org.bukkit.inventory.ItemStack;

import java.util.Set;
import java.util.UUID;

public abstract class INBTTagCompound implements INBTBase {

    abstract public void set(String k, INBTBase v);
    abstract public void setByte(String k, byte v);
    abstract public void setShort(String k, short v);
    abstract public void setInt(String k, int v);
    abstract public void setLong(String k, long v);
    abstract public void setUUID(String k, UUID v);
    abstract public void setFloat(String k, float v);
    abstract public void setDouble(String k, double v);
    abstract public void setString(String k, String v);
    abstract public void setByteArray(String k, byte[] v);
    abstract public void setIntArray(String k, int[] v);
    abstract public void setLongArray(String k, long[] v);
    //abstract public void setCompound(String k, INBTTagCompound v);
    //abstract public INBTTagList setList(String s, int v);
    abstract public void setBoolean(String k, boolean v);

    abstract public INBTBase get(String k);
    abstract public byte getByte(String k);
    abstract public short getShort(String k);
    abstract public int getInt(String k);
    abstract public long getLong(String k);
    abstract public UUID getUUID(String k);
    abstract public float getFloat(String k);
    abstract public double getDouble(String k);
    abstract public String getString(String k);
    abstract public byte[] getByteArray(String k);
    abstract public int[] getIntArray(String k);
    abstract public long[] getLongArray(String k);
    abstract public INBTTagCompound getCompound(String k);
    abstract public INBTTagList getList(String k, int i);
    abstract public boolean getBoolean(String k);

    abstract public int getSize();
    abstract public void remove(String s);
    abstract public boolean isEmpty();

    abstract public Set<String> keys();
    abstract public boolean hasKey(String s);
    abstract public boolean hasKeyOfType(String s, int i);
    abstract public byte getTypeIdOf(String s);

    abstract public String serialize();

    abstract public ItemStack setNBT(ItemStack itemStack);

    abstract public INBTTagCompound getNBT();
    abstract public INBTTagCompound getNBT(String s);
    abstract public INBTTagCompound getNBT(ItemStack itemStack);
}
