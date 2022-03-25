package com.crazicrafter1.nmsapi.nbt;

import org.bukkit.Bukkit;

public interface INBTBase {

    RuntimeException NOT_IMPLEMENTED = new RuntimeException("Not implemented");

    Object getInstance();

    static INBTBase wrapNBT(Object base) {
        // get name of class
        final String serverVersion = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3].substring(1);
        try {
            return (INBTBase) Class.forName(
                            INBTBase.class.getPackage().getName() + "." + base.getClass().getSimpleName() + serverVersion)
                    .getConstructor(base.getClass()).newInstance(base);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
