package com.crazicrafter1.nmsapi.nbt;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;

public class NBTTagList1_19_R1 extends INBTTagList {
    private NBTTagList instance;

    public NBTTagList1_19_R1() {
        instance = new NBTTagList();
    }
    public NBTTagList1_19_R1(NBTTagList instance) {
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
        return INBTBase.wrapNBT(instance.k(index));
    }

    @Override
    public INBTTagCompound getCompound(int index) {
        return new NBTTagCompound1_19_R1(instance.a(index));
    }

    @Override
    public INBTTagList getNBTTagList(int index) {
        return new NBTTagList1_19_R1(instance.b(index));
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
        return instance.g(index);
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
        return instance.j(index);
    }
}
