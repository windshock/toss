package o;

import androidx.annotation.Nullable;
import java.util.Arrays;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.TextFieldBufferExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda10 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final String IAuthTabCallback;
    public final byte[] onExtraCallback;
    public final String onWarmupCompleted;

    public ModalBottomSheetKtExternalSyntheticLambda10(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.onExtraCallback = bArr;
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = str2;
    }

    public void onWarmupCompleted(TextFieldBufferExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
        String str = this.IAuthTabCallback;
        if (str != null) {
            onextracallbackwithresult.getInterfaceDescriptor(str);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda10.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.onExtraCallback, ((ModalBottomSheetKtExternalSyntheticLambda10) obj).onExtraCallback);
    }

    public int hashCode() {
        return Arrays.hashCode(this.onExtraCallback);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.IAuthTabCallback, this.onWarmupCompleted, Integer.valueOf(this.onExtraCallback.length));
    }
}
