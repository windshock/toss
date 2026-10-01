package o;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosMemoryMappingOrBuilder<T> implements Lazy<T>, Serializable {
    private volatile Object _value;
    private Function0<? extends T> initializer;
    private final Object lock;

    public TombstoneProtosMemoryMappingOrBuilder(@NotNull Function0<? extends T> function0, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.initializer = function0;
        this._value = TombstoneProtosRegisterOrBuilder.onWarmupCompleted;
        this.lock = obj == null ? this : obj;
    }

    public /* synthetic */ TombstoneProtosMemoryMappingOrBuilder(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : obj);
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T tInvoke;
        T t = (T) this._value;
        TombstoneProtosRegisterOrBuilder tombstoneProtosRegisterOrBuilder = TombstoneProtosRegisterOrBuilder.onWarmupCompleted;
        if (t != tombstoneProtosRegisterOrBuilder) {
            return t;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == tombstoneProtosRegisterOrBuilder) {
                Function0<? extends T> function0 = this.initializer;
                Intrinsics.checkNotNull(function0);
                tInvoke = function0.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this._value != TombstoneProtosRegisterOrBuilder.onWarmupCompleted;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new getLoadBias(getValue());
    }
}
