package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda7 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final String IAuthTabCallback;
    public final String onExtraCallback;
    public final String onNavigationEvent;

    public ModalBottomSheetKtExternalSyntheticLambda7(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.onExtraCallback = str;
        this.IAuthTabCallback = str2;
        this.onNavigationEvent = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda7.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda7 modalBottomSheetKtExternalSyntheticLambda7 = (ModalBottomSheetKtExternalSyntheticLambda7) obj;
        return Objects.equals(this.IAuthTabCallback, modalBottomSheetKtExternalSyntheticLambda7.IAuthTabCallback) && Objects.equals(this.onExtraCallback, modalBottomSheetKtExternalSyntheticLambda7.onExtraCallback) && Objects.equals(this.onNavigationEvent, modalBottomSheetKtExternalSyntheticLambda7.onNavigationEvent);
    }

    public int hashCode() {
        String str = this.onExtraCallback;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IAuthTabCallback;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.onNavigationEvent;
        return ((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // o.ModalBottomSheetKtExternalSyntheticLambda5
    public String toString() {
        return this.asBinder + ": domain=" + this.onExtraCallback + ", description=" + this.IAuthTabCallback;
    }
}
