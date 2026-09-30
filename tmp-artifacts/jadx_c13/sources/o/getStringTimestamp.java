package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getStringTimestamp {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final <T> BreadcrumbInternal<Unit, T> onWarmupCompleted(@NotNull Function1<? super Breadcrumb<Unit, T>, Unit> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        BreadcrumbInternal<Unit, T> breadcrumbInternalOnExtraCallback = updateStatebugsnag_android_core_release.onExtraCallback(_UrlKt.FRAGMENT_ENCODE_SET, function1);
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return breadcrumbInternalOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final <T> T IAuthTabCallback(@NotNull BreadcrumbInternal<Unit, T> breadcrumbInternal, @NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(breadcrumbInternal, "");
        Intrinsics.checkNotNullParameter(str, "");
        T tOnExtraCallbackWithResult = breadcrumbInternal.onExtraCallbackWithResult(str, Unit.INSTANCE);
        int i4 = onWarmupCompleted + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return tOnExtraCallbackWithResult;
        }
        throw null;
    }
}
