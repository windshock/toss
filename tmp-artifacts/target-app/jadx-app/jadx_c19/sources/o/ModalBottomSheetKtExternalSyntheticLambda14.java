package o;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda14 extends ModalBottomSheetKtExternalSyntheticLambda5 {
    public final byte[] IAuthTabCallback;

    public ModalBottomSheetKtExternalSyntheticLambda14(String str, byte[] bArr) {
        super(str);
        this.IAuthTabCallback = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda14.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda14 modalBottomSheetKtExternalSyntheticLambda14 = (ModalBottomSheetKtExternalSyntheticLambda14) obj;
        return this.asBinder.equals(modalBottomSheetKtExternalSyntheticLambda14.asBinder) && Arrays.equals(this.IAuthTabCallback, modalBottomSheetKtExternalSyntheticLambda14.IAuthTabCallback);
    }

    public int hashCode() {
        return ((this.asBinder.hashCode() + 527) * 31) + Arrays.hashCode(this.IAuthTabCallback);
    }
}
