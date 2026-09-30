package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class IABLandingPageActivity {
    private final int onExtraCallback;
    private final byte[] onNavigationEvent;

    public String toString() {
        return "ProgressIndication(index=" + this.onExtraCallback + ", data=" + Arrays.toString(this.onNavigationEvent) + ')';
    }

    public IABLandingPageActivity(int i, @Nullable byte[] bArr) {
        this.onExtraCallback = i;
        this.onNavigationEvent = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(IABLandingPageActivity.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, BuildConfig.FLAVOR);
        IABLandingPageActivity iABLandingPageActivity = (IABLandingPageActivity) obj;
        if (this.onExtraCallback != iABLandingPageActivity.onExtraCallback) {
            return false;
        }
        byte[] bArr = this.onNavigationEvent;
        if (bArr != null) {
            byte[] bArr2 = iABLandingPageActivity.onNavigationEvent;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (iABLandingPageActivity.onNavigationEvent != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.onExtraCallback;
        byte[] bArr = this.onNavigationEvent;
        return (i * 31) + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
