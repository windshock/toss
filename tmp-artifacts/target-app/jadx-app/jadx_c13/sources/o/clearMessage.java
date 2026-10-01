package o;

import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearMessage {
    public static final clearMessage onWarmupCompleted = new clearMessage();

    private clearMessage() {
    }

    static final class IAuthTabCallback<T1, T2, R> implements deserializeFloatNullableCollection<T1, T2, Pair<? extends T1, ? extends T2>> {
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        IAuthTabCallback() {
        }

        @Override // o.deserializeFloatNullableCollection
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Pair<T1, T2> apply(@NotNull T1 t1, @NotNull T2 t2) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            return getWrite.IAuthTabCallback(t1, t2);
        }
    }

    public final <T1, T2> JsonReaderUnknownNumberParsing<Pair<T1, T2>> IAuthTabCallback(@NotNull JsonReaderUnknownNumberParsing<T1> jsonReaderUnknownNumberParsing, @NotNull JsonReaderUnknownNumberParsing<T2> jsonReaderUnknownNumberParsing2) {
        Intrinsics.checkParameterIsNotNull(jsonReaderUnknownNumberParsing, "");
        Intrinsics.checkParameterIsNotNull(jsonReaderUnknownNumberParsing2, "");
        JsonReaderUnknownNumberParsing<Pair<T1, T2>> jsonReaderUnknownNumberParsingIAuthTabCallback = JsonReaderUnknownNumberParsing.IAuthTabCallback(jsonReaderUnknownNumberParsing, jsonReaderUnknownNumberParsing2, IAuthTabCallback.onWarmupCompleted);
        Intrinsics.checkExpressionValueIsNotNull(jsonReaderUnknownNumberParsingIAuthTabCallback, "");
        return jsonReaderUnknownNumberParsingIAuthTabCallback;
    }

    static final class onExtraCallback<T1, T2, R> implements deserializeFloatNullableCollection<T1, T2, Pair<? extends T1, ? extends T2>> {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        onExtraCallback() {
        }

        @Override // o.deserializeFloatNullableCollection
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Pair<T1, T2> apply(@NotNull T1 t1, @NotNull T2 t2) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            return getWrite.IAuthTabCallback(t1, t2);
        }
    }

    public final <T1, T2> JsonReaderUnknownNumberParsing<Pair<T1, T2>> onExtraCallback(@NotNull JsonReaderUnknownNumberParsing<T1> jsonReaderUnknownNumberParsing, @NotNull JsonReaderUnknownNumberParsing<T2> jsonReaderUnknownNumberParsing2) {
        Intrinsics.checkParameterIsNotNull(jsonReaderUnknownNumberParsing, "");
        Intrinsics.checkParameterIsNotNull(jsonReaderUnknownNumberParsing2, "");
        JsonReaderUnknownNumberParsing<Pair<T1, T2>> jsonReaderUnknownNumberParsingOnExtraCallback = JsonReaderUnknownNumberParsing.onExtraCallback(jsonReaderUnknownNumberParsing, jsonReaderUnknownNumberParsing2, onExtraCallback.onWarmupCompleted);
        Intrinsics.checkExpressionValueIsNotNull(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        return jsonReaderUnknownNumberParsingOnExtraCallback;
    }

    static final class onExtraCallbackWithResult<T1, T2, T3, R> implements deserializeLong<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
        }

        @Override // o.deserializeLong
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Triple<T1, T2, T3> apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            Intrinsics.checkParameterIsNotNull(t3, "");
            return new Triple<>(t1, t2, t3);
        }
    }

    public final <T1, T2, T3> JsonReaderUnknownNumberParsing<Triple<T1, T2, T3>> onWarmupCompleted(@NotNull JsonReaderUnknownNumberParsing<T1> jsonReaderUnknownNumberParsing, @NotNull JsonReaderUnknownNumberParsing<T2> jsonReaderUnknownNumberParsing2, @NotNull JsonReaderUnknownNumberParsing<T3> jsonReaderUnknownNumberParsing3) {
        Intrinsics.checkParameterIsNotNull(jsonReaderUnknownNumberParsing, "");
        Intrinsics.checkParameterIsNotNull(jsonReaderUnknownNumberParsing2, "");
        Intrinsics.checkParameterIsNotNull(jsonReaderUnknownNumberParsing3, "");
        JsonReaderUnknownNumberParsing<Triple<T1, T2, T3>> jsonReaderUnknownNumberParsingIAuthTabCallback = JsonReaderUnknownNumberParsing.IAuthTabCallback(jsonReaderUnknownNumberParsing, jsonReaderUnknownNumberParsing2, jsonReaderUnknownNumberParsing3, onExtraCallbackWithResult.onExtraCallbackWithResult);
        Intrinsics.checkExpressionValueIsNotNull(jsonReaderUnknownNumberParsingIAuthTabCallback, "");
        return jsonReaderUnknownNumberParsingIAuthTabCallback;
    }
}
