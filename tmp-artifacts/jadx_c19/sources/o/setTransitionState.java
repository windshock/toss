package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setTransitionState implements SaversKtExternalSyntheticLambda26 {
    private static final setTransitionState onWarmupCompleted = new setTransitionState();

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }

    public static setTransitionState onExtraCallbackWithResult() {
        return onWarmupCompleted;
    }

    private setTransitionState() {
    }

    public String toString() {
        return "EmptySignature";
    }
}
