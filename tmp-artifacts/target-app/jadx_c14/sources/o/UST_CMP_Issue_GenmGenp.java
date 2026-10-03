package o;

import im.toss.uikit.widget.Banner;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Issue_GenmGenp implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;
    private final Function0<Map<String, Object>> onNavigationEvent;
    private final Function1<Banner, Unit> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMP_Issue_GenmGenp)) {
            return false;
        }
        UST_CMP_Issue_GenmGenp uST_CMP_Issue_GenmGenp = (UST_CMP_Issue_GenmGenp) obj;
        return this.onExtraCallbackWithResult == uST_CMP_Issue_GenmGenp.onExtraCallbackWithResult && Intrinsics.areEqual(this.onNavigationEvent, uST_CMP_Issue_GenmGenp.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, uST_CMP_Issue_GenmGenp.onWarmupCompleted);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.onExtraCallbackWithResult);
        Function0<Map<String, Object>> function0 = this.onNavigationEvent;
        return (((iHashCode * 31) + (function0 == null ? 0 : function0.hashCode())) * 31) + this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        return "BannerItem(isPlayable=" + this.onExtraCallbackWithResult + ", logParams=" + this.onNavigationEvent + ", bannerSetUp=" + this.onWarmupCompleted + ")";
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final Function1<Banner, Unit> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.IAuthTabCallback();
    }
}
