package com.crazicrafter1.nmsapi.nbt;

import net.minecraft.server.v1_12_R1.*;

public class NBTTagList1_12_R1 extends INBTTagList {
    private NBTTagList instance;

    public NBTTagList1_12_R1() {
        instance = new NBTTagList();
    }
    public NBTTagList1_12_R1(NBTTagList instance) {
        this.instance = instance;
    }

    @Override
    public Object getInstance() {
        return instance;
    }

    @Override
    public void add(int index, INBTBase tag) {
        instance.add((NBTBase) tag.getInstance());
    }

    @Override
    public int size() {
        return instance.size();
    }

    @Override
    public INBTBase get(int index) {
        return INBTBase.wrapNBT(instance.i(index));
    }

    @Override
    public INBTTagCompound getCompound(int index) {
        return new NBTTagCompound1_12_R1(instance.get(index));
    }

    @Override
    public INBTTagList getNBTTagList(int index) {
        throw NOT_IMPLEMENTED;
    }

    @Override
    public short getShort(int index) {
        throw NOT_IMPLEMENTED;
    }

    @Override
    public int getInt(int index) {
        return instance.c(index);
    }

    @Override
    public int[] getIntArray(int index) {
        return instance.d(index);
    }

    @Override
    public long[] getLongArray(int index) {
        throw NOT_IMPLEMENTED;
    }

    @Override
    public double getDouble(int index) {
        return instance.f(index);
    }

    @Override
    public float getFloat(int index) {
        return instance.g(index);
    }

    @Override
    public String getString(int index) {
        return instance.getString(index);
    }
}
