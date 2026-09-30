package o;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearPid {
    public static final clearPid onWarmupCompleted = new clearPid();

    private clearPid() {
    }

    static final class onNavigationEvent<T1, T2, R> implements deserializeFloatNullableCollection<T1, T2, Pair<? extends T1, ? extends T2>> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        onNavigationEvent() {
        }

        @Override // o.deserializeFloatNullableCollection
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Pair<T1, T2> apply(@NotNull T1 t1, @NotNull T2 t2) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            return getWrite.IAuthTabCallback(t1, t2);
        }
    }

    public final <T1, T2> getByteBuffer<Pair<T1, T2>> onWarmupCompleted(@NotNull getByteBuffer<T1> getbytebuffer, @NotNull getByteBuffer<T2> getbytebuffer2) {
        Intrinsics.checkParameterIsNotNull(getbytebuffer, "");
        Intrinsics.checkParameterIsNotNull(getbytebuffer2, "");
        getByteBuffer<Pair<T1, T2>> getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(getbytebuffer, getbytebuffer2, onNavigationEvent.onNavigationEvent);
        Intrinsics.checkExpressionValueIsNotNull(getbytebufferOnWarmupCompleted, "");
        return getbytebufferOnWarmupCompleted;
    }
}
