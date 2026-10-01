package o;

import im.toss.appsintoss.iap.model.AppsInTossCashReceipt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RuleController {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final AppsInTossCashReceipt IAuthTabCallback;
    private final boolean onExtraCallback;
    private final Throwable onExtraCallbackWithResult;

    public RuleController() {
        this(false, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleController)) {
            int i4 = i3 + 41;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }
        RuleController ruleController = (RuleController) obj;
        if (this.onExtraCallback != ruleController.onExtraCallback || (!Intrinsics.areEqual(this.IAuthTabCallback, ruleController.IAuthTabCallback))) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ruleController.onExtraCallbackWithResult)) {
            return true;
        }
        int i5 = onWarmupCompleted + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.onExtraCallback);
        AppsInTossCashReceipt appsInTossCashReceipt = this.IAuthTabCallback;
        int iHashCode3 = 0;
        if (appsInTossCashReceipt == null) {
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = appsInTossCashReceipt.hashCode();
        }
        Throwable th = this.onExtraCallbackWithResult;
        if (th != null) {
            int i4 = onWarmupCompleted + 97;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode3 = th.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InAppPurchaseCashReceiptState(isLoading=" + this.onExtraCallback + ", item=" + this.IAuthTabCallback + ", error=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RuleController(boolean z, @Nullable AppsInTossCashReceipt appsInTossCashReceipt, @Nullable Throwable th) {
        this.onExtraCallback = z;
        this.IAuthTabCallback = appsInTossCashReceipt;
        this.onExtraCallbackWithResult = th;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RuleController(boolean z, AppsInTossCashReceipt appsInTossCashReceipt, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 5;
            } else {
                int i6 = 2 % 2;
            }
            appsInTossCashReceipt = null;
        }
        this(z, appsInTossCashReceipt, (i & 4) != 0 ? null : th);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.onExtraCallback;
        int i4 = i3 + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final AppsInTossCashReceipt onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        AppsInTossCashReceipt appsInTossCashReceipt = this.IAuthTabCallback;
        int i5 = i3 + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return appsInTossCashReceipt;
    }
}
