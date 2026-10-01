package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractMutableList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MutableOnWriteList<T> extends AbstractMutableList<T> implements RandomAccess, Serializable {
    private final List<T> immutableList;
    private List<? extends T> mutableList;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableOnWriteList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.immutableList = list;
        this.mutableList = list;
    }

    public final List<T> getMutableList$wire_runtime() {
        return this.mutableList;
    }

    public final void setMutableList$wire_runtime(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.mutableList = list;
    }

    public T get(int i2) {
        return this.mutableList.get(i2);
    }

    public int getSize() {
        return this.mutableList.size();
    }

    public T set(int i2, T t) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.checkNotNull(list, "");
        return (T) ((ArrayList) list).set(i2, t);
    }

    public void add(int i2, T t) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.checkNotNull(list, "");
        ((ArrayList) list).add(i2, t);
    }

    public T removeAt(int i2) {
        if (this.mutableList == this.immutableList) {
            this.mutableList = new ArrayList(this.immutableList);
        }
        List<? extends T> list = this.mutableList;
        Intrinsics.checkNotNull(list, "");
        return (T) ((ArrayList) list).remove(i2);
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new ArrayList(this.mutableList);
    }
}
