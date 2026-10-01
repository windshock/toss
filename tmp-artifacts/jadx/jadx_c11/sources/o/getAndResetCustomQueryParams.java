package o;

import dagger.Lazy;
import im.toss.splittarget.impl.analytics.toss.PiiSanitizerModule;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAndResetCustomQueryParams implements captureStartValues<getBidToken> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<getBillingPeriod> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getBidToken getbidtokenOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getbidtokenOnExtraCallback;
    }

    public getBidToken onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getBidToken getbidtokenOnWarmupCompleted = onWarmupCompleted(clearValues.onExtraCallback(this.onWarmupCompleted));
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getbidtokenOnWarmupCompleted;
    }

    public static getBidToken onWarmupCompleted(Lazy<getBillingPeriod> lazy) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getBidToken getbidtoken = (getBidToken) createAnimator.onNavigationEvent(PiiSanitizerModule.IAuthTabCallback.IAuthTabCallback(lazy));
        if (i3 == 0) {
            return getbidtoken;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
