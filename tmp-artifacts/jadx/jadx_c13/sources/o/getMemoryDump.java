package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getMemoryDump<T> implements ReadWriteProperty<Object, T> {
    private T IAuthTabCallback;

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public T getValue(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        T t = this.IAuthTabCallback;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + addallcommandline.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline, @NotNull T t) {
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.IAuthTabCallback = t;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.IAuthTabCallback != null) {
            str = "value=" + this.IAuthTabCallback;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
