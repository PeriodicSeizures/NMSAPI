package com.crazicrafter1.nmsapi.nbt;

import net.minecraft.server.v1_16_R3.*;

public class NBTTagList1_16_R3 extends INBTTagList {
    private NBTTagList instance;

    public NBTTagList1_16_R3() {
        instance = new NBTTagList();
    }
    public NBTTagList1_16_R3(NBTTagList instance) {
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
        return INBTBase.wrapNBT(instance.get(index));
    }

    @Override
    public INBTTagCompound getCompound(int index) {
        return new NBTTagCompound1_16_R3(instance.getCompound(index));
    }

    @Override
    public INBTTagList getNBTTagList(int index) {
        return new NBTTagList1_16_R3(instance.b(index));
    }

    @Override
    public short getShort(int index) {
        return instance.d(index);
    }

    @Override
    public int getInt(int index) {
        return instance.e(index);
    }

    @Override
    public int[] getIntArray(int index) {
        return instance.f(index);
    }

    @Override
    public long[] getLongArray(int index) {
        throw NOT_IMPLEMENTED;
    }

    @Override
    public double getDouble(int index) {
        return instance.h(index);
    }

    @Override
    public float getFloat(int index) {
        return instance.i(index);
    }

    @Override
    public String getString(int index) {
        return instance.getString(index);
    }
}
