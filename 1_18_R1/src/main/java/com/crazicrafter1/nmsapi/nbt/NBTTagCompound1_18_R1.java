package com.crazicrafter1.nmsapi.nbt;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.MojangsonParser;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import org.bukkit.craftbukkit.v1_18_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import java.util.Set;
import java.util.UUID;

public final class NBTTagCompound1_18_R1 implements INBTTagCompound {

    @Override
    public Object getInstance() {
        return instance;
    }

    private final NBTTagCompound instance;

    public NBTTagCompound1_18_R1() {
        this(new NBTTagCompound());
    }
    public NBTTagCompound1_18_R1(NBTTagCompound instance) {
        this.instance = instance;
    }

    @Override
    public void set(String k, INBTBase v) {
        instance.a(k, (NBTBase) v.getInstance());
    }

    @Override
    public void setByte(String k, byte v) {
        //MojangsonParser.
        instance.a(k, v);
    }

    @Override
    public void setShort(String k, short v) {
        instance.a(k, v);
    }

    @Override
    public void setInt(String k, int v) {
        instance.a(k, v);
    }

    @Override
    public void setLong(String k, long v) {
        instance.a(k, v);
    }

    @Override
    public void setUUID(String k, UUID v) {
        instance.a(k, v);
    }

    @Override
    public void setFloat(String k, float v) {
        instance.a(k, v);
    }

    @Override
    public void setDouble(String k, double v) {
        instance.a(k, v);
    }

    @Override
    public void setString(String k, String v) {
        instance.a(k, v);
    }

    @Override
    public void setByteArray(String k, byte[] v) {
        instance.a(k, v);
    }

    @Override
    public void setIntArray(String k, int[] v) {
        instance.a(k, v);
    }

    @Override
    public void setLongArray(String k, long[] v) {
        instance.a(k, v);
    }

    @Override
    public void setBoolean(String k, boolean v) {
        instance.a(k, v);
    }



    @Override
    public INBTBase get(String k) {
        return INBTBase.wrapNBT(instance.c(k));
    }

    @Override
    public byte getByte(String k) {
        return instance.f(k);
    }

    @Override
    public short getShort(String k) {
        return instance.g(k);
    }

    @Override
    public int getInt(String k) {
        return instance.h(k);
    }

    @Override
    public long getLong(String k) {
        return instance.i(k);
    }

    @Override
    public UUID getUUID(String k) {
        return instance.a(k);
    }

    @Override
    public float getFloat(String k) {
        return instance.j(k);
    }

    @Override
    public double getDouble(String k) {
        return instance.k(k);
    }

    @Override
    public String getString(String k) {
        return instance.l(k);
    }

    @Override
    public byte[] getByteArray(String k) {
        return instance.m(k);
    }

    @Override
    public int[] getIntArray(String k) {
        return instance.n(k);
    }

    @Override
    public long[] getLongArray(String k) {
        return instance.o(k);
    }

    @Override
    public INBTTagCompound getCompound(String k) {
        return new NBTTagCompound1_18_R1(instance.p(k));
    }

    @Override
    public INBTTagList getList(String k, int i) {
        return new NBTTagList1_18_R1(instance.c(k, i));
    }

    @Override
    public boolean getBoolean(String k) {
        return instance.b(k);
    }



    @Override
    public int getSize() {
        return keys().size();
    }

    @Override
    public void remove(String k) {
        instance.r(k);
    }

    @Override
    public boolean isEmpty() {
        return instance.f();
    }



    @Override
    public Set<String> keys() {
        return instance.d();
    }

    @Override
    public boolean hasKey(String k) {
        return instance.e(k);
    }

    @Override
    public boolean hasKeyOfType(String k, int i) {
        return instance.b(k, i);
    }

    @Override
    public byte getTypeIdOf(String k) {
        return instance.d(k);
    }

    @Override
    public String serialize() {
        return instance.toString();
    }

    @Override
    public ItemStack setNBT(ItemStack itemStack) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        nmsStack.c(instance);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }

    @Override
    public INBTTagCompound getNBT() {
        return new NBTTagCompound1_18_R1();
    }

    @Override
    public INBTTagCompound getNBT(String s) {
        try {
            return new NBTTagCompound1_18_R1(MojangsonParser.a(s));
        } catch (CommandSyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public INBTTagCompound getNBT(ItemStack itemStack) {
        return new NBTTagCompound1_18_R1(
                CraftItemStack.asNMSCopy(itemStack).t());
    }

    @Override
    public INBTTagCompound getOrCreateNBT(ItemStack itemStack) {
        return new NBTTagCompound1_18_R1(
                CraftItemStack.asNMSCopy(itemStack).t());
    }
}
