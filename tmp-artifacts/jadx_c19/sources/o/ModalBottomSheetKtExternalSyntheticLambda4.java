package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda4 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final String IAuthTabCallback;
    public final String onExtraCallbackWithResult;
    public final String onWarmupCompleted;

    public ModalBottomSheetKtExternalSyntheticLambda4(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.onWarmupCompleted = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallbackWithResult = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda4.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda4 modalBottomSheetKtExternalSyntheticLambda4 = (ModalBottomSheetKtExternalSyntheticLambda4) obj;
        return Objects.equals(this.IAuthTabCallback, modalBottomSheetKtExternalSyntheticLambda4.IAuthTabCallback) && Objects.equals(this.onWarmupCompleted, modalBottomSheetKtExternalSyntheticLambda4.onWarmupCompleted) && Objects.equals(this.onExtraCallbackWithResult, modalBottomSheetKtExternalSyntheticLambda4.onExtraCallbackWithResult);
    }

    public int hashCode() {
        String str = this.onWarmupCompleted;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IAuthTabCallback;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.onExtraCallbackWithResult;
        return ((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // o.ModalBottomSheetKtExternalSyntheticLambda5
    public String toString() {
        return this.asBinder + ": language=" + this.onWarmupCompleted + ", description=" + this.IAuthTabCallback + ", text=" + this.onExtraCallbackWithResult;
    }
}
