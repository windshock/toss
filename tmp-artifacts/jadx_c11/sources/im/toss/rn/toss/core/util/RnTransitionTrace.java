package im.toss.rn.toss.core.util;

import android.os.Build;
import android.os.Trace;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.zzaj;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnTransitionTrace {
    private static int IAuthTabCallback = 0;
    public static final RnTransitionTrace onExtraCallback = new RnTransitionTrace();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 105;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    private RnTransitionTrace() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback() {
        Object obj;
        boolean z;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            if (zzaj.onNavigationEvent().ITrustedWebActivityService_Parcel()) {
                int i2 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (zzaj.onNavigationEvent().onActivityLayout()) {
                    z = true;
                } else {
                    int i4 = onWarmupCompleted + 89;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
                obj = Result.constructor-impl(Boolean.valueOf(z));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.onExtraCallback(obj)) {
            obj = bool;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final void onExtraCallback(@NotNull Function0<String> function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            onExtraCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        if (!onExtraCallback()) {
            int i3 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    private static final Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return unit;
    }

    public final <T> T onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull Function0<Unit> function0, @NotNull Function0<? extends T> function02) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        if (!onExtraCallback()) {
            return (T) function02.invoke();
        }
        Trace.beginSection(str2 + ":" + str);
        try {
            T t = (T) function02.invoke();
            Trace.endSection();
            function0.invoke();
            int i4 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return t;
            }
            throw null;
        } catch (Throwable th) {
            Trace.endSection();
            function0.invoke();
            throw th;
        }
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!onExtraCallback()) {
            return false;
        }
        int i3 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        Trace.beginAsyncSection(str2 + ":" + str, i);
        int i5 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent(@NotNull String str, @NotNull String str2, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (onExtraCallback()) {
            int i5 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection(str2 + ":" + str, i);
                return true;
            }
        }
        int i7 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final String onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strTake = StringsKt.take(StringsKt.replace$default(StringsKt.replace$default(str, '\n', ' ', false, 4, (Object) null), '\r', ' ', false, 4, (Object) null), 1500);
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strTake;
    }
}
