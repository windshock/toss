package o;

import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setTagBytes {
    public static final setTagBytes onNavigationEvent = new setTagBytes();

    private setTagBytes() {
    }

    /* JADX INFO: Add missing generic type declarations: [T, U] */
    static final class onExtraCallbackWithResult<T1, T2, R, T, U> implements deserializeFloatNullableCollection<T, U, Pair<? extends T, ? extends U>> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
        }

        @Override // o.deserializeFloatNullableCollection
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Pair<T, U> apply(@NotNull T t, @NotNull U u) {
            Intrinsics.checkParameterIsNotNull(t, "");
            Intrinsics.checkParameterIsNotNull(u, "");
            return new Pair<>(t, u);
        }
    }

    public final <T, U> writeRaw<Pair<T, U>> IAuthTabCallback(@NotNull deserializeIp<T> deserializeip, @NotNull deserializeIp<U> deserializeip2) {
        Intrinsics.checkParameterIsNotNull(deserializeip, "");
        Intrinsics.checkParameterIsNotNull(deserializeip2, "");
        writeRaw<Pair<T, U>> writerawIAuthTabCallback = writeRaw.IAuthTabCallback(deserializeip, deserializeip2, onExtraCallbackWithResult.onExtraCallbackWithResult);
        Intrinsics.checkExpressionValueIsNotNull(writerawIAuthTabCallback, "");
        return writerawIAuthTabCallback;
    }

    static final class onNavigationEvent<T1, T2, T3, R> implements deserializeLong<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        onNavigationEvent() {
        }

        @Override // o.deserializeLong
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Triple<T1, T2, T3> apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            Intrinsics.checkParameterIsNotNull(t3, "");
            return new Triple<>(t1, t2, t3);
        }
    }

    public final <T1, T2, T3> writeRaw<Triple<T1, T2, T3>> onExtraCallbackWithResult(@NotNull deserializeIp<T1> deserializeip, @NotNull deserializeIp<T2> deserializeip2, @NotNull deserializeIp<T3> deserializeip3) {
        Intrinsics.checkParameterIsNotNull(deserializeip, "");
        Intrinsics.checkParameterIsNotNull(deserializeip2, "");
        Intrinsics.checkParameterIsNotNull(deserializeip3, "");
        writeRaw<Triple<T1, T2, T3>> writerawIAuthTabCallback = writeRaw.IAuthTabCallback(deserializeip, deserializeip2, deserializeip3, onNavigationEvent.onExtraCallback);
        Intrinsics.checkExpressionValueIsNotNull(writerawIAuthTabCallback, "");
        return writerawIAuthTabCallback;
    }
}
