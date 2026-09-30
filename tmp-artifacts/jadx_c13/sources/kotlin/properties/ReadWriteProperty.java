package kotlin.properties;

import o.addAllCommandLine;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
    @Override // kotlin.properties.ReadOnlyProperty
    V getValue(T t, @NotNull addAllCommandLine<?> addallcommandline);

    void setValue(T t, @NotNull addAllCommandLine<?> addallcommandline, V v);
}
