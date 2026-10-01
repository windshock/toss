package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda8 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final int IAuthTabCallback;
    public final int onExtraCallback;
    public final int[] onExtraCallbackWithResult;
    public final int[] onNavigationEvent;
    public final int onWarmupCompleted;

    public ModalBottomSheetKtExternalSyntheticLambda8(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super(MlltFrame.ID);
        this.onExtraCallback = i2;
        this.onWarmupCompleted = i3;
        this.IAuthTabCallback = i4;
        this.onExtraCallbackWithResult = iArr;
        this.onNavigationEvent = iArr2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda8.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda8 modalBottomSheetKtExternalSyntheticLambda8 = (ModalBottomSheetKtExternalSyntheticLambda8) obj;
        return this.onExtraCallback == modalBottomSheetKtExternalSyntheticLambda8.onExtraCallback && this.onWarmupCompleted == modalBottomSheetKtExternalSyntheticLambda8.onWarmupCompleted && this.IAuthTabCallback == modalBottomSheetKtExternalSyntheticLambda8.IAuthTabCallback && Arrays.equals(this.onExtraCallbackWithResult, modalBottomSheetKtExternalSyntheticLambda8.onExtraCallbackWithResult) && Arrays.equals(this.onNavigationEvent, modalBottomSheetKtExternalSyntheticLambda8.onNavigationEvent);
    }

    public int hashCode() {
        int i2 = this.onExtraCallback;
        int i3 = this.onWarmupCompleted;
        return ((((((((i2 + 527) * 31) + i3) * 31) + this.IAuthTabCallback) * 31) + Arrays.hashCode(this.onExtraCallbackWithResult)) * 31) + Arrays.hashCode(this.onNavigationEvent);
    }
}
