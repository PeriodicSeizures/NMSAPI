package com.crazicrafter1.nmsapi;

import java.util.AbstractList;

public abstract class INBTList<T extends INBTBase> extends AbstractList<T> implements INBTBase {
    @Override
    public T set(int index, T tag) {
        throw NOT_IMPLEMENTED;
    }

    @Override
    public abstract void add(int index, T tag);

    @Override
    public T remove(int index) {
        throw NOT_IMPLEMENTED;
    }

    @Override
    public T get(int index) {
        throw new IndexOutOfBoundsException();
    }
}
