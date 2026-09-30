package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetStateExternalSyntheticLambda0 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final String onExtraCallback;
    public final byte[] onNavigationEvent;

    public ModalBottomSheetStateExternalSyntheticLambda0(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.onExtraCallback = str;
        this.onNavigationEvent = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetStateExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetStateExternalSyntheticLambda0 modalBottomSheetStateExternalSyntheticLambda0 = (ModalBottomSheetStateExternalSyntheticLambda0) obj;
        return Objects.equals(this.onExtraCallback, modalBottomSheetStateExternalSyntheticLambda0.onExtraCallback) && Arrays.equals(this.onNavigationEvent, modalBottomSheetStateExternalSyntheticLambda0.onNavigationEvent);
    }

    public int hashCode() {
        String str = this.onExtraCallback;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.onNavigationEvent);
    }

    @Override // o.ModalBottomSheetKtExternalSyntheticLambda5
    public String toString() {
        return this.asBinder + ": owner=" + this.onExtraCallback;
    }
}
