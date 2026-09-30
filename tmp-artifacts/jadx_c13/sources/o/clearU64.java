package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearU64<T> implements Lazy<T>, Serializable {
    private Object _value;
    private Function0<? extends T> initializer;

    public clearU64(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.initializer = function0;
        this._value = TombstoneProtosRegisterOrBuilder.onWarmupCompleted;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        if (this._value == TombstoneProtosRegisterOrBuilder.onWarmupCompleted) {
            Function0<? extends T> function0 = this.initializer;
            Intrinsics.checkNotNull(function0);
            this._value = function0.invoke();
            this.initializer = null;
        }
        return (T) this._value;
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

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
