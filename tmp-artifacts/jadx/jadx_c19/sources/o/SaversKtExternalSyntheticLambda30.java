package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda30 implements SaversKtExternalSyntheticLambda26 {
    private final onMeasure<SaversKtExternalSyntheticLambda3<?>, Object> onExtraCallbackWithResult = new getPaddingWidth();

    public void onWarmupCompleted(@NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(saversKtExternalSyntheticLambda30.onExtraCallbackWithResult);
    }

    public <T> SaversKtExternalSyntheticLambda30 IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda3<T> saversKtExternalSyntheticLambda3, @NonNull T t) {
        this.onExtraCallbackWithResult.put(saversKtExternalSyntheticLambda3, t);
        return this;
    }

    public <T> T IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda3<T> saversKtExternalSyntheticLambda3) {
        return this.onExtraCallbackWithResult.containsKey(saversKtExternalSyntheticLambda3) ? (T) this.onExtraCallbackWithResult.get(saversKtExternalSyntheticLambda3) : saversKtExternalSyntheticLambda3.IAuthTabCallback();
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        if (obj instanceof SaversKtExternalSyntheticLambda30) {
            return this.onExtraCallbackWithResult.equals(((SaversKtExternalSyntheticLambda30) obj).onExtraCallbackWithResult);
        }
        return false;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
            onExtraCallbackWithResult((SaversKtExternalSyntheticLambda3) this.onExtraCallbackWithResult.onWarmupCompleted(i2), this.onExtraCallbackWithResult.onExtraCallbackWithResult(i2), messageDigest);
        }
    }

    public String toString() {
        return "Options{values=" + this.onExtraCallbackWithResult + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void onExtraCallbackWithResult(@NonNull SaversKtExternalSyntheticLambda3<T> saversKtExternalSyntheticLambda3, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        saversKtExternalSyntheticLambda3.onNavigationEvent(obj, messageDigest);
    }
}
