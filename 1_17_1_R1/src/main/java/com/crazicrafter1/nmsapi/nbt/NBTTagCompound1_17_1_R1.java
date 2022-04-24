package com.crazicrafter1.nmsapi.nbt;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.MojangsonParser;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import org.bukkit.craftbukkit.v1_17_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public final class NBTTagCompound1_17_1_R1 implements INBTTagCompound {

    @Override
    public Object getInstance() {
        return instance;
    }

    private final NBTTagCompound instance;

    public NBTTagCompound1_17_1_R1() {
        this(new NBTTagCompound());
    }
    public NBTTagCompound1_17_1_R1(NBTTagCompound instance) {
        this.instance = instance;
    }

    @Override
    public void set(String k, INBTBase v) {
        instance.set(k, (NBTBase) v.getInstance());
    }

    @Override
    public void setByte(String k, byte v) {
        instance.setByte(k, v);
    }

    @Override
    public void setShort(String k, short v) {
        instance.setShort(k, v);
    }

    @Override
    public void setInt(String k, int v) {
        instance.setInt(k, v);
    }

    @Override
    public void setLong(String k, long v) {
        instance.setLong(k, v);
    }

    @Override
    public void setUUID(String k, UUID v) {
        instance.a(k, v);
    }

    @Override
    public void setFloat(String k, float v) {
        instance.setFloat(k, v);
    }

    @Override
    public void setDouble(String k, double v) {
        instance.setDouble(k, v);
    }

    @Override
    public void setString(String k, String v) {
        instance.setString(k, v);
    }

    @Override
    public void setByteArray(String k, byte[] v) {
        instance.setByteArray(k, v);
    }

    @Override
    public void setIntArray(String k, int[] v) {
        instance.setIntArray(k, v);
    }

    @Override
    public void setLongArray(String k, long[] v) {
        instance.a(k, v);
    }

    @Override
    public void setBoolean(String k, boolean v) {
        instance.setBoolean(k, v);
    }



    @Override
    public INBTBase get(String k) {
        return INBTBase.wrapNBT(instance.get(k));
    }

    @Override
    public byte getByte(String k) {
        return instance.getByte(k);
    }

    @Override
    public short getShort(String k) {
        return instance.getShort(k);
    }

    @Override
    public int getInt(String k) {
        return instance.getInt(k);
    }

    @Override
    public long getLong(String k) {
        return instance.getLong(k);
    }

    @Override
    public UUID getUUID(String k) {
        return instance.a(k);
    }

    @Override
    public float getFloat(String k) {
        return instance.getFloat(k);
    }

    @Override
    public double getDouble(String k) {
        return instance.getDouble(k);
    }

    @Override
    public String getString(String k) {
        return instance.getString(k);
    }

    @Override
    public byte[] getByteArray(String k) {
        return instance.getByteArray(k);
    }

    @Override
    public int[] getIntArray(String k) {
        return instance.getIntArray(k);
    }

    @Override
    public long[] getLongArray(String k) {
        return instance.getLongArray(k);
    }

    @Override
    public INBTTagCompound getCompound(String k) {
        return new NBTTagCompound1_17_1_R1(instance.getCompound(k));
    }

    @Override
    public INBTTagList getList(String k, int i) {
        return new NBTTagList1_17_1_R1(instance.getList(k, i));
    }

    @Override
    public boolean getBoolean(String k) {
        return instance.getBoolean(k);
    }



    @Override
    public int getSize() {
        return keys().size();
    }

    @Override
    public void remove(String k) {
        instance.remove(k);
    }

    @Override
    public boolean isEmpty() {
        return instance.isEmpty();
    }



    @Override
    public Set<String> keys() {
        return instance.getKeys();
    }

    @Override
    public boolean hasKey(String k) {
        return instance.hasKey(k);
    }

    @Override
    public boolean hasKeyOfType(String k, int i) {
        return instance.hasKeyOfType(k, i);
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
        nmsStack.setTag(instance);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }

    @Override
    public INBTTagCompound getNBT() {
        return new NBTTagCompound1_17_1_R1();
    }

    @Override
    public INBTTagCompound getNBT(String s) {
        try {
            return new NBTTagCompound1_17_1_R1(MojangsonParser.parse(s));
        } catch (CommandSyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public INBTTagCompound getNBT(ItemStack itemStack) {
        try {
            return new NBTTagCompound1_17_1_R1(
                    Objects.requireNonNull(CraftItemStack.asNMSCopy(itemStack).getTag()));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public INBTTagCompound getOrCreateNBT(ItemStack itemStack) {
        return new NBTTagCompound1_17_1_R1(
                CraftItemStack.asNMSCopy(itemStack).getOrCreateTag());
    }
}
