package com.crazicrafter1.nmsapi.nbt;

public abstract class INBTTagList extends INBTList<INBTBase> {
    abstract public INBTTagCompound getCompound(int index);
    abstract public INBTTagList getNBTTagList(int index);
    abstract public short getShort(int index);
    abstract public int getInt(int index);
    abstract public int[] getIntArray(int index);
    abstract public long[] getLongArray(int index);
    abstract public double getDouble(int index);
    abstract public float getFloat(int index);
    abstract public String getString(int index);
    //abstract public INBTBase getNBTBase(int index);
    // will be get()^
}
