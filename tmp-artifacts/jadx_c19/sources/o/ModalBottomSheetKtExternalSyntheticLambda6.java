package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda6 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final boolean IAuthTabCallback;
    public final boolean onExtraCallback;
    private final ModalBottomSheetKtExternalSyntheticLambda5[] onExtraCallbackWithResult;
    public final String[] onNavigationEvent;
    public final String onWarmupCompleted;

    public ModalBottomSheetKtExternalSyntheticLambda6(String str, boolean z, boolean z2, String[] strArr, ModalBottomSheetKtExternalSyntheticLambda5[] modalBottomSheetKtExternalSyntheticLambda5Arr) {
        super(ChapterTocFrame.ID);
        this.onWarmupCompleted = str;
        this.onExtraCallback = z;
        this.IAuthTabCallback = z2;
        this.onNavigationEvent = strArr;
        this.onExtraCallbackWithResult = modalBottomSheetKtExternalSyntheticLambda5Arr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda6.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda6 modalBottomSheetKtExternalSyntheticLambda6 = (ModalBottomSheetKtExternalSyntheticLambda6) obj;
        return this.onExtraCallback == modalBottomSheetKtExternalSyntheticLambda6.onExtraCallback && this.IAuthTabCallback == modalBottomSheetKtExternalSyntheticLambda6.IAuthTabCallback && Objects.equals(this.onWarmupCompleted, modalBottomSheetKtExternalSyntheticLambda6.onWarmupCompleted) && Arrays.equals(this.onNavigationEvent, modalBottomSheetKtExternalSyntheticLambda6.onNavigationEvent) && Arrays.equals(this.onExtraCallbackWithResult, modalBottomSheetKtExternalSyntheticLambda6.onExtraCallbackWithResult);
    }

    public int hashCode() {
        boolean z = this.onExtraCallback;
        boolean z2 = this.IAuthTabCallback;
        String str = this.onWarmupCompleted;
        return (((((z ? 1 : 0) + 527) * 31) + (z2 ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }
}
