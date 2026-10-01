package o;

import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.TextFieldBufferExternalSyntheticLambda0;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ModalBottomSheetKtExternalSyntheticLambda1 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final String IAuthTabCallback;
    public final String onExtraCallback;

    public ModalBottomSheetKtExternalSyntheticLambda1(String str, String str2) {
        this.IAuthTabCallback = Ascii.toUpperCase(str);
        this.onExtraCallback = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(TextFieldBufferExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
        switch (this.IAuthTabCallback) {
            case "TOTALTRACKS":
                Integer numTryParse = Ints.tryParse(this.onExtraCallback);
                if (numTryParse != null) {
                    onextracallbackwithresult.access000(numTryParse);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numTryParse2 = Ints.tryParse(this.onExtraCallback);
                if (numTryParse2 != null) {
                    onextracallbackwithresult.IAuthTabCallbackDefault(numTryParse2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numTryParse3 = Ints.tryParse(this.onExtraCallback);
                if (numTryParse3 != null) {
                    onextracallbackwithresult.IAuthTabCallback_Parcel(numTryParse3);
                    break;
                }
                break;
            case "ALBUM":
                onextracallbackwithresult.onExtraCallbackWithResult(this.onExtraCallback);
                break;
            case "GENRE":
                onextracallbackwithresult.asInterface(this.onExtraCallback);
                break;
            case "TITLE":
                onextracallbackwithresult.getInterfaceDescriptor(this.onExtraCallback);
                break;
            case "DESCRIPTION":
                onextracallbackwithresult.onTransact(this.onExtraCallback);
                break;
            case "DISCNUMBER":
                Integer numTryParse4 = Ints.tryParse(this.onExtraCallback);
                if (numTryParse4 != null) {
                    onextracallbackwithresult.onNavigationEvent(numTryParse4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                onextracallbackwithresult.onWarmupCompleted(this.onExtraCallback);
                break;
            case "ARTIST":
                onextracallbackwithresult.onExtraCallback(this.onExtraCallback);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.IAuthTabCallback + "=" + this.onExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda1 modalBottomSheetKtExternalSyntheticLambda1 = (ModalBottomSheetKtExternalSyntheticLambda1) obj;
        return this.IAuthTabCallback.equals(modalBottomSheetKtExternalSyntheticLambda1.IAuthTabCallback) && this.onExtraCallback.equals(modalBottomSheetKtExternalSyntheticLambda1.onExtraCallback);
    }

    public int hashCode() {
        return ((this.IAuthTabCallback.hashCode() + 527) * 31) + this.onExtraCallback.hashCode();
    }
}
