package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AppLoadInterceptorPoint$onExtraCallback extends AppLoadInterceptorPoint {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final enableEndSpmReportInIOThread onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLoadInterceptorPoint$onExtraCallback)) {
            int i5 = i3 + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((AppLoadInterceptorPoint$onExtraCallback) obj).onExtraCallbackWithResult)) {
            return false;
        }
        int i7 = IAuthTabCallback + 57;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShowSubmitResult(submitResult=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLoadInterceptorPoint$onExtraCallback(@NotNull enableEndSpmReportInIOThread enableendspmreportiniothread) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(enableendspmreportiniothread, "");
        this.onExtraCallbackWithResult = enableendspmreportiniothread;
    }

    public final enableEndSpmReportInIOThread onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        enableEndSpmReportInIOThread enableendspmreportiniothread = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return enableendspmreportiniothread;
    }
}
