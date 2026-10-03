package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_GetCertWithSignedData implements UST_CMS_EncryptedData {
    private final Function1<View, Unit> IAuthTabCallback;
    private final long onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final long onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public UST_CMS_GetCertWithSignedData(float f, int i, @Nullable Function1<? super View, Unit> function1) {
        this.onNavigationEvent = f;
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallback = function1;
        long jHashCode = (f + "-" + i + "-" + (function1 != 0 ? function1.hashCode() : 0)).hashCode();
        this.onExtraCallback = jHashCode;
        this.onWarmupCompleted = jHashCode;
    }

    public /* synthetic */ UST_CMS_GetCertWithSignedData(float f, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : function1);
    }

    public final float onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final int onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final Function1<View, Unit> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.IAuthTabCallback_Parcel();
    }
}
