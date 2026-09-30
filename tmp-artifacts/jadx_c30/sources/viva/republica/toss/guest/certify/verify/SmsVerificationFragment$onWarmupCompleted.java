package viva.republica.toss.guest.certify.verify;

import android.os.Bundle;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.RotationProvider1;
import o.getWrite;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SmsVerificationFragment$onWarmupCompleted {
    public /* synthetic */ SmsVerificationFragment$onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SmsVerificationFragment$onWarmupCompleted() {
    }

    public static /* synthetic */ Bundle onExtraCallbackWithResult(SmsVerificationFragment$onWarmupCompleted smsVerificationFragment$onWarmupCompleted, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return smsVerificationFragment$onWarmupCompleted.onExtraCallback(j, z);
    }

    public final Bundle onExtraCallback(long j, boolean z) {
        return RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("EXTRA_UNIFIED_ID", Long.valueOf(j)), getWrite.IAuthTabCallback("EXTRA_IS_PASSWORD_RESET", Boolean.valueOf(z))});
    }
}
