package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import o.addAllCommandLine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
    private V IAuthTabCallback;

    protected void afterChange(@NotNull addAllCommandLine<?> addallcommandline, V v, V v2) {
        Intrinsics.checkNotNullParameter(addallcommandline, "");
    }

    protected boolean beforeChange(@NotNull addAllCommandLine<?> addallcommandline, V v, V v2) {
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        return true;
    }

    public ObservableProperty(V v) {
        this.IAuthTabCallback = v;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        return this.IAuthTabCallback;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline, V v) {
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        V v2 = this.IAuthTabCallback;
        if (beforeChange(addallcommandline, v2, v)) {
            this.IAuthTabCallback = v;
            afterChange(addallcommandline, v2, v);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.IAuthTabCallback + ')';
    }
}
