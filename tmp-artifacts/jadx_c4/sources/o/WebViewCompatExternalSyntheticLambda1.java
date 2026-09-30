package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewCompatExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final boolean onExtraCallback;
    private final boolean onNavigationEvent;
    private final boolean onWarmupCompleted;

    public WebViewCompatExternalSyntheticLambda1() {
        this(false, false, false, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewCompatExternalSyntheticLambda1)) {
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1 = (WebViewCompatExternalSyntheticLambda1) obj;
        if (this.onExtraCallback != webViewCompatExternalSyntheticLambda1.onExtraCallback) {
            return false;
        }
        if (this.onNavigationEvent != webViewCompatExternalSyntheticLambda1.onNavigationEvent) {
            int i4 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onWarmupCompleted == webViewCompatExternalSyntheticLambda1.onWarmupCompleted) {
            return true;
        }
        int i6 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.onExtraCallback);
        return i3 == 0 ? (((iHashCode * 15) << Boolean.hashCode(this.onNavigationEvent)) + 112) >>> Boolean.hashCode(this.onWarmupCompleted) : (((iHashCode * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NativeAdsRowImpression(isHairlineImpressed=" + this.onExtraCallback + ", isImpressed=" + this.onNavigationEvent + ", isCompleteImpressed=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public WebViewCompatExternalSyntheticLambda1(boolean z, boolean z2, boolean z3) {
        this.onExtraCallback = z;
        this.onNavigationEvent = z2;
        this.onWarmupCompleted = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WebViewCompatExternalSyntheticLambda1(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            z2 = false;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            z3 = false;
        }
        this(z, z2, z3);
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 67;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onExtraCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.onNavigationEvent;
            int i4 = 23 / 0;
        } else {
            z = this.onNavigationEvent;
        }
        int i5 = i2 + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean IAuthTabCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.onWarmupCompleted;
            int i4 = 48 / 0;
        } else {
            z = this.onWarmupCompleted;
        }
        int i5 = i2 + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
