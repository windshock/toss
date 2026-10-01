package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getLandingPageClickEnd {
    private final access6900<byte[]> IAuthTabCallback = new access6900<>();
    private int onWarmupCompleted;

    protected final byte[] onNavigationEvent(int i) {
        byte[] bArrIAuthTabCallbackDefault;
        synchronized (this) {
            bArrIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
            if (bArrIAuthTabCallbackDefault != null) {
                this.onWarmupCompleted -= bArrIAuthTabCallbackDefault.length / 2;
            } else {
                bArrIAuthTabCallbackDefault = null;
            }
        }
        return bArrIAuthTabCallbackDefault == null ? new byte[i] : bArrIAuthTabCallbackDefault;
    }

    protected final void IAuthTabCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        synchronized (this) {
            if (this.onWarmupCompleted + bArr.length < setBeforeTimestamp.IAuthTabCallback) {
                this.onWarmupCompleted += bArr.length / 2;
                this.IAuthTabCallback.addLast(bArr);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
