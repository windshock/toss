package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access12900<T> implements Lazy<T>, Serializable {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final AtomicReferenceFieldUpdater<access12900<?>, Object> onNavigationEvent = AtomicReferenceFieldUpdater.newUpdater(access12900.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final, reason: not valid java name */
    private final Object f0final;
    private volatile Function0<? extends T> initializer;

    public access12900(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.initializer = function0;
        TombstoneProtosRegisterOrBuilder tombstoneProtosRegisterOrBuilder = TombstoneProtosRegisterOrBuilder.onWarmupCompleted;
        this._value = tombstoneProtosRegisterOrBuilder;
        this.f0final = tombstoneProtosRegisterOrBuilder;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t = (T) this._value;
        TombstoneProtosRegisterOrBuilder tombstoneProtosRegisterOrBuilder = TombstoneProtosRegisterOrBuilder.onWarmupCompleted;
        if (t != tombstoneProtosRegisterOrBuilder) {
            return t;
        }
        Function0<? extends T> function0 = this.initializer;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            if (RequestBuilder.onWarmupCompleted(onNavigationEvent, this, tombstoneProtosRegisterOrBuilder, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
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

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
