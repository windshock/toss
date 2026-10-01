package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import java.util.Objects;
import o.TextFieldBufferExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda12 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final int IAuthTabCallback;
    public final byte[] onExtraCallbackWithResult;
    public final String onNavigationEvent;
    public final String onWarmupCompleted;

    public ModalBottomSheetKtExternalSyntheticLambda12(String str, @Nullable String str2, int i2, byte[] bArr) {
        super(ApicFrame.ID);
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
        this.IAuthTabCallback = i2;
        this.onExtraCallbackWithResult = bArr;
    }

    public void onWarmupCompleted(TextFieldBufferExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.IAuthTabCallback(this.onExtraCallbackWithResult, this.IAuthTabCallback);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda12.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda12 modalBottomSheetKtExternalSyntheticLambda12 = (ModalBottomSheetKtExternalSyntheticLambda12) obj;
        return this.IAuthTabCallback == modalBottomSheetKtExternalSyntheticLambda12.IAuthTabCallback && Objects.equals(this.onNavigationEvent, modalBottomSheetKtExternalSyntheticLambda12.onNavigationEvent) && Objects.equals(this.onWarmupCompleted, modalBottomSheetKtExternalSyntheticLambda12.onWarmupCompleted) && Arrays.equals(this.onExtraCallbackWithResult, modalBottomSheetKtExternalSyntheticLambda12.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int i2 = this.IAuthTabCallback;
        String str = this.onNavigationEvent;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.onWarmupCompleted;
        return ((((((i2 + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.onExtraCallbackWithResult);
    }

    @Override // o.ModalBottomSheetKtExternalSyntheticLambda5
    public String toString() {
        return this.asBinder + ": mimeType=" + this.onNavigationEvent + ", description=" + this.onWarmupCompleted;
    }
}
