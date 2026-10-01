package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda3 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final String onExtraCallback;
    public final String onExtraCallbackWithResult;
    public final String onNavigationEvent;
    public final byte[] onWarmupCompleted;

    public ModalBottomSheetKtExternalSyntheticLambda3(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.onNavigationEvent = str3;
        this.onWarmupCompleted = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda3.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda3 modalBottomSheetKtExternalSyntheticLambda3 = (ModalBottomSheetKtExternalSyntheticLambda3) obj;
        return Objects.equals(this.onExtraCallback, modalBottomSheetKtExternalSyntheticLambda3.onExtraCallback) && Objects.equals(this.onExtraCallbackWithResult, modalBottomSheetKtExternalSyntheticLambda3.onExtraCallbackWithResult) && Objects.equals(this.onNavigationEvent, modalBottomSheetKtExternalSyntheticLambda3.onNavigationEvent) && Arrays.equals(this.onWarmupCompleted, modalBottomSheetKtExternalSyntheticLambda3.onWarmupCompleted);
    }

    public int hashCode() {
        String str = this.onExtraCallback;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.onExtraCallbackWithResult;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.onNavigationEvent;
        return ((((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.onWarmupCompleted);
    }

    @Override // o.ModalBottomSheetKtExternalSyntheticLambda5
    public String toString() {
        return this.asBinder + ": mimeType=" + this.onExtraCallback + ", filename=" + this.onExtraCallbackWithResult + ", description=" + this.onNavigationEvent;
    }
}
