package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setDpMargin implements SaversKtExternalSyntheticLambda26 {
    private final Object onNavigationEvent;

    public setDpMargin(@NonNull Object obj) {
        this.onNavigationEvent = markHierarchyDirty.onExtraCallbackWithResult(obj);
    }

    public String toString() {
        return "ObjectKey{object=" + this.onNavigationEvent + '}';
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        if (obj instanceof setDpMargin) {
            return this.onNavigationEvent.equals(((setDpMargin) obj).onNavigationEvent);
        }
        return false;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        return this.onNavigationEvent.hashCode();
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.onNavigationEvent.toString().getBytes(SaversKtExternalSyntheticLambda26.IAuthTabCallback));
    }
}
