package o;

import android.os.SystemClock;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKekid implements getOther {
    public static final int $stable = 8;
    public static int onExtraCallback;
    public static int onNavigationEvent;
    private int index;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getKekid) && this.index == ((getKekid) obj).index;
    }

    public int hashCode() {
        return Integer.hashCode(this.index);
    }

    public String toString() {
        return "UserCardTransactionSkeleton(index=" + this.index + ")";
    }

    public getKekid(int i) {
        this.index = i;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.TRANSACTION_SKELETON;
    }

    public static int onExtraCallback() {
        int i = onNavigationEvent;
        int i2 = i % 8096803;
        onNavigationEvent = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        onExtraCallback = iUptimeMillis;
        return iUptimeMillis;
    }
}
