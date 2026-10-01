package com.squareup.wire.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ImmutableList<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private final ArrayList<T> list;

    public ImmutableList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.list = new ArrayList<>(list);
    }

    public int getSize() {
        return this.list.size();
    }

    public T get(int i2) {
        return this.list.get(i2);
    }

    public Object[] toArray() {
        return this.list.toArray(new Object[0]);
    }

    private final Object writeReplace() throws ObjectStreamException {
        List listUnmodifiableList = Collections.unmodifiableList(this.list);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        return listUnmodifiableList;
    }
}
