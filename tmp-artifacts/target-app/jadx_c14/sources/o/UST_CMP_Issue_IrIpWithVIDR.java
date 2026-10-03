package o;

import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Issue_IrIpWithVIDR implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final float onNavigationEvent;
    private final Function1<TdsButtonV1View, Unit> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMP_Issue_IrIpWithVIDR)) {
            return false;
        }
        UST_CMP_Issue_IrIpWithVIDR uST_CMP_Issue_IrIpWithVIDR = (UST_CMP_Issue_IrIpWithVIDR) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, uST_CMP_Issue_IrIpWithVIDR.onWarmupCompleted) && Float.compare(this.onNavigationEvent, uST_CMP_Issue_IrIpWithVIDR.onNavigationEvent) == 0;
    }

    public int hashCode() {
        return (this.onWarmupCompleted.hashCode() * 31) + Float.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "ButtonItem(buttonSetter=" + this.onWarmupCompleted + ", horizontalPaddingAsDp=" + this.onNavigationEvent + ")";
    }

    public final Function1<TdsButtonV1View, Unit> onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final float onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onExtraCallbackWithResult();
    }
}
