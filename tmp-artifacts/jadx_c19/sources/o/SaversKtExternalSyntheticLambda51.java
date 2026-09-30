package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda51 implements SaversKtExternalSyntheticLambda26 {
    private final SaversKtExternalSyntheticLambda26 onNavigationEvent;
    private final SaversKtExternalSyntheticLambda26 onWarmupCompleted;

    SaversKtExternalSyntheticLambda51(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda262) {
        this.onNavigationEvent = saversKtExternalSyntheticLambda26;
        this.onWarmupCompleted = saversKtExternalSyntheticLambda262;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        if (!(obj instanceof SaversKtExternalSyntheticLambda51)) {
            return false;
        }
        SaversKtExternalSyntheticLambda51 saversKtExternalSyntheticLambda51 = (SaversKtExternalSyntheticLambda51) obj;
        return this.onNavigationEvent.equals(saversKtExternalSyntheticLambda51.onNavigationEvent) && this.onWarmupCompleted.equals(saversKtExternalSyntheticLambda51.onWarmupCompleted);
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        return (this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.onNavigationEvent + ", signature=" + this.onWarmupCompleted + '}';
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.onNavigationEvent.updateDiskCacheKey(messageDigest);
        this.onWarmupCompleted.updateDiskCacheKey(messageDigest);
    }
}
