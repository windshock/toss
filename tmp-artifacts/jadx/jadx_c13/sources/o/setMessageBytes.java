package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setMessageBytes {
    private static final Function1<Object, Unit> IAuthTabCallback = onExtraCallback.onExtraCallbackWithResult;
    private static final Function1<Throwable, Unit> onNavigationEvent = onWarmupCompleted.onWarmupCompleted;
    private static final Function0<Unit> onExtraCallbackWithResult = IAuthTabCallback.onWarmupCompleted;

    static final class IAuthTabCallback extends Lambda implements Function0<Unit> {
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        IAuthTabCallback() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallback extends Lambda implements Function1<Object, Unit> {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        onExtraCallback() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(@NotNull Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "");
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function1<Throwable, Unit> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            onWarmupCompleted(th);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.clearTimestamp] */
    private static final <T> deserializeFloat<T> onExtraCallbackWithResult(@NotNull Function1<? super T, Unit> function1) {
        if (function1 == IAuthTabCallback) {
            deserializeFloat<T> deserializefloatOnNavigationEvent = doubleExponent.onNavigationEvent();
            Intrinsics.checkExpressionValueIsNotNull(deserializefloatOnNavigationEvent, "");
            return deserializefloatOnNavigationEvent;
        }
        if (function1 != null) {
            function1 = new clearTimestamp(function1);
        }
        return (deserializeFloat) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.clearTimestamp] */
    private static final deserializeFloat<Throwable> onWarmupCompleted(@NotNull Function1<? super Throwable, Unit> function1) {
        if (function1 == onNavigationEvent) {
            deserializeFloat<Throwable> deserializefloat = doubleExponent.access100;
            Intrinsics.checkExpressionValueIsNotNull(deserializefloat, "");
            return deserializefloat;
        }
        if (function1 != null) {
            function1 = new clearTimestamp(function1);
        }
        return (deserializeFloat) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.clearPriority] */
    private static final deserializeDecimalCollection IAuthTabCallback(@NotNull Function0<Unit> function0) {
        if (function0 == onExtraCallbackWithResult) {
            deserializeDecimalCollection deserializedecimalcollection = doubleExponent.onNavigationEvent;
            Intrinsics.checkExpressionValueIsNotNull(deserializedecimalcollection, "");
            return deserializedecimalcollection;
        }
        if (function0 != null) {
            function0 = new clearPriority(function0);
        }
        return (deserializeDecimalCollection) function0;
    }

    public static /* synthetic */ deserializeUriNullableCollection onExtraCallbackWithResult(getByteBuffer getbytebuffer, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = onNavigationEvent;
        }
        if ((i & 2) != 0) {
            function0 = onExtraCallbackWithResult;
        }
        if ((i & 4) != 0) {
            function12 = IAuthTabCallback;
        }
        return onNavigationEvent(getbytebuffer, function1, function0, function12);
    }

    public static final <T> deserializeUriNullableCollection onNavigationEvent(@NotNull getByteBuffer<T> getbytebuffer, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(getbytebuffer, "");
        Intrinsics.checkParameterIsNotNull(function1, "");
        Intrinsics.checkParameterIsNotNull(function0, "");
        Intrinsics.checkParameterIsNotNull(function12, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = getbytebuffer.onWarmupCompleted(onExtraCallbackWithResult(function12), onWarmupCompleted(function1), IAuthTabCallback(function0));
        Intrinsics.checkExpressionValueIsNotNull(deserializeurinullablecollectionOnWarmupCompleted, "");
        return deserializeurinullablecollectionOnWarmupCompleted;
    }

    public static /* synthetic */ deserializeUriNullableCollection onNavigationEvent(JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = onNavigationEvent;
        }
        if ((i & 2) != 0) {
            function0 = onExtraCallbackWithResult;
        }
        if ((i & 4) != 0) {
            function12 = IAuthTabCallback;
        }
        return onExtraCallback(jsonReaderUnknownNumberParsing, function1, function0, function12);
    }

    public static final <T> deserializeUriNullableCollection onExtraCallback(@NotNull JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(jsonReaderUnknownNumberParsing, "");
        Intrinsics.checkParameterIsNotNull(function1, "");
        Intrinsics.checkParameterIsNotNull(function0, "");
        Intrinsics.checkParameterIsNotNull(function12, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = jsonReaderUnknownNumberParsing.onNavigationEvent(onExtraCallbackWithResult(function12), onWarmupCompleted(function1), IAuthTabCallback(function0));
        Intrinsics.checkExpressionValueIsNotNull(deserializeurinullablecollectionOnNavigationEvent, "");
        return deserializeurinullablecollectionOnNavigationEvent;
    }

    public static /* synthetic */ deserializeUriNullableCollection onNavigationEvent(writeRaw writeraw, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = onNavigationEvent;
        }
        if ((i & 2) != 0) {
            function12 = IAuthTabCallback;
        }
        return onExtraCallbackWithResult(writeraw, function1, function12);
    }

    public static final <T> deserializeUriNullableCollection onExtraCallbackWithResult(@NotNull writeRaw<T> writeraw, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(writeraw, "");
        Intrinsics.checkParameterIsNotNull(function1, "");
        Intrinsics.checkParameterIsNotNull(function12, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writeraw.onNavigationEvent(onExtraCallbackWithResult(function12), onWarmupCompleted(function1));
        Intrinsics.checkExpressionValueIsNotNull(deserializeurinullablecollectionOnNavigationEvent, "");
        return deserializeurinullablecollectionOnNavigationEvent;
    }

    public static final <T> deserializeUriNullableCollection onExtraCallbackWithResult(@NotNull advance<T> advanceVar, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(advanceVar, "");
        Intrinsics.checkParameterIsNotNull(function1, "");
        Intrinsics.checkParameterIsNotNull(function0, "");
        Intrinsics.checkParameterIsNotNull(function12, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = advanceVar.onExtraCallbackWithResult(onExtraCallbackWithResult(function12), onWarmupCompleted(function1), IAuthTabCallback(function0));
        Intrinsics.checkExpressionValueIsNotNull(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        return deserializeurinullablecollectionOnExtraCallbackWithResult;
    }

    public static final deserializeUriNullableCollection onNavigationEvent(@NotNull wasLastName waslastname, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(waslastname, "");
        Intrinsics.checkParameterIsNotNull(function1, "");
        Intrinsics.checkParameterIsNotNull(function0, "");
        Function1<Throwable, Unit> function12 = onNavigationEvent;
        if (function1 == function12 && function0 == onExtraCallbackWithResult) {
            deserializeUriNullableCollection deserializeurinullablecollectionBK_ = waslastname.bK_();
            Intrinsics.checkExpressionValueIsNotNull(deserializeurinullablecollectionBK_, "");
            return deserializeurinullablecollectionBK_;
        }
        if (function1 == function12) {
            deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = waslastname.onExtraCallback(new clearPriority(function0));
            Intrinsics.checkExpressionValueIsNotNull(deserializeurinullablecollectionOnExtraCallback, "");
            return deserializeurinullablecollectionOnExtraCallback;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = waslastname.onWarmupCompleted(IAuthTabCallback(function0), new clearTimestamp(function1));
        Intrinsics.checkExpressionValueIsNotNull(deserializeurinullablecollectionOnWarmupCompleted, "");
        return deserializeurinullablecollectionOnWarmupCompleted;
    }
}
