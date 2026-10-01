package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda13 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final String IAuthTabCallback;
    private final ModalBottomSheetKtExternalSyntheticLambda5[] asInterface;
    public final long onExtraCallback;
    public final long onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final int onWarmupCompleted;

    public ModalBottomSheetKtExternalSyntheticLambda13(String str, int i2, int i3, long j, long j2, ModalBottomSheetKtExternalSyntheticLambda5[] modalBottomSheetKtExternalSyntheticLambda5Arr) {
        super(ChapterFrame.ID);
        this.IAuthTabCallback = str;
        this.onNavigationEvent = i2;
        this.onWarmupCompleted = i3;
        this.onExtraCallback = j;
        this.onExtraCallbackWithResult = j2;
        this.asInterface = modalBottomSheetKtExternalSyntheticLambda5Arr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda13.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda13 modalBottomSheetKtExternalSyntheticLambda13 = (ModalBottomSheetKtExternalSyntheticLambda13) obj;
        return this.onNavigationEvent == modalBottomSheetKtExternalSyntheticLambda13.onNavigationEvent && this.onWarmupCompleted == modalBottomSheetKtExternalSyntheticLambda13.onWarmupCompleted && this.onExtraCallback == modalBottomSheetKtExternalSyntheticLambda13.onExtraCallback && this.onExtraCallbackWithResult == modalBottomSheetKtExternalSyntheticLambda13.onExtraCallbackWithResult && Objects.equals(this.IAuthTabCallback, modalBottomSheetKtExternalSyntheticLambda13.IAuthTabCallback) && Arrays.equals(this.asInterface, modalBottomSheetKtExternalSyntheticLambda13.asInterface);
    }

    public int hashCode() {
        int i2 = this.onNavigationEvent;
        int i3 = this.onWarmupCompleted;
        int i4 = (int) this.onExtraCallback;
        int i5 = (int) this.onExtraCallbackWithResult;
        String str = this.IAuthTabCallback;
        return ((((((((i2 + 527) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (str != null ? str.hashCode() : 0);
    }
}
