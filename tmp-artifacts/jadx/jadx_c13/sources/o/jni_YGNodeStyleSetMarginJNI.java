package o;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.UtcOffsetJvmKt$;
import o.jni_YGNodeStyleSetMarginJNI;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetMarginJNI {
    private static final Lazy onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.datetime.UtcOffsetJvmKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return jni_YGNodeStyleSetMarginJNI.IAuthTabCallbackStubProxy();
        }
    });
    private static final Lazy IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.datetime.UtcOffsetJvmKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return jni_YGNodeStyleSetMarginJNI.IAuthTabCallback_Parcel();
        }
    });
    private static final Lazy onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.datetime.UtcOffsetJvmKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return jni_YGNodeStyleSetMarginJNI.IAuthTabCallbackStub();
        }
    });

    public static /* synthetic */ jni_YGNodeStyleSetMarginAutoJNI onWarmupCompleted(Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        return onExtraCallbackWithResult(num, num2, num3);
    }

    public static final jni_YGNodeStyleSetMarginAutoJNI onExtraCallbackWithResult(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfHoursMinutesSeconds, "");
                return new jni_YGNodeStyleSetMarginAutoJNI(zoneOffsetOfHoursMinutesSeconds);
            }
            if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfHoursMinutesSeconds2, "");
                return new jni_YGNodeStyleSetMarginAutoJNI(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            Intrinsics.checkNotNullExpressionValue(zoneOffsetOfTotalSeconds, "");
            return new jni_YGNodeStyleSetMarginAutoJNI(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter IAuthTabCallbackDefault() {
        return (DateTimeFormatter) onExtraCallbackWithResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter IAuthTabCallbackStubProxy() {
        return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter asInterface() {
        return (DateTimeFormatter) IAuthTabCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter IAuthTabCallback_Parcel() {
        return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter asBinder() {
        return (DateTimeFormatter) onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter IAuthTabCallbackStub() {
        return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jni_YGNodeStyleSetMarginAutoJNI onExtraCallbackWithResult(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        try {
            return new jni_YGNodeStyleSetMarginAutoJNI((ZoneOffset) dateTimeFormatter.parse(charSequence, new UtcOffsetJvmKt$.ExternalSyntheticLambda3()));
        } catch (DateTimeException e) {
            throw new jni_YGNodeStyleGetMaxHeightJNI(e);
        }
    }
}
