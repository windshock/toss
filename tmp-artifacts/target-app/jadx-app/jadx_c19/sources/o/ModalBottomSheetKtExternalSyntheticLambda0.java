package o;

import androidx.annotation.Nullable;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.TextFieldBufferExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda0 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final int IAuthTabCallback;
    public final byte[] IAuthTabCallbackDefault;
    public final int asBinder;
    public final int onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final String onNavigationEvent;
    public final int onTransact;
    public final String onWarmupCompleted;

    public ModalBottomSheetKtExternalSyntheticLambda0(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.asBinder = i2;
        this.onWarmupCompleted = str;
        this.onNavigationEvent = str2;
        this.onTransact = i3;
        this.IAuthTabCallback = i4;
        this.onExtraCallback = i5;
        this.onExtraCallbackWithResult = i6;
        this.IAuthTabCallbackDefault = bArr;
    }

    public void onWarmupCompleted(TextFieldBufferExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.IAuthTabCallback(this.IAuthTabCallbackDefault, this.asBinder);
    }

    public String toString() {
        return "Picture: mimeType=" + this.onWarmupCompleted + ", description=" + this.onNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda0 modalBottomSheetKtExternalSyntheticLambda0 = (ModalBottomSheetKtExternalSyntheticLambda0) obj;
        return this.asBinder == modalBottomSheetKtExternalSyntheticLambda0.asBinder && this.onWarmupCompleted.equals(modalBottomSheetKtExternalSyntheticLambda0.onWarmupCompleted) && this.onNavigationEvent.equals(modalBottomSheetKtExternalSyntheticLambda0.onNavigationEvent) && this.onTransact == modalBottomSheetKtExternalSyntheticLambda0.onTransact && this.IAuthTabCallback == modalBottomSheetKtExternalSyntheticLambda0.IAuthTabCallback && this.onExtraCallback == modalBottomSheetKtExternalSyntheticLambda0.onExtraCallback && this.onExtraCallbackWithResult == modalBottomSheetKtExternalSyntheticLambda0.onExtraCallbackWithResult && Arrays.equals(this.IAuthTabCallbackDefault, modalBottomSheetKtExternalSyntheticLambda0.IAuthTabCallbackDefault);
    }

    public int hashCode() {
        int i2 = this.asBinder;
        int iHashCode = this.onWarmupCompleted.hashCode();
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int i3 = this.onTransact;
        int i4 = this.IAuthTabCallback;
        return ((((((((((((((i2 + 527) * 31) + iHashCode) * 31) + iHashCode2) * 31) + i3) * 31) + i4) * 31) + this.onExtraCallback) * 31) + this.onExtraCallbackWithResult) * 31) + Arrays.hashCode(this.IAuthTabCallbackDefault);
    }

    public static ModalBottomSheetKtExternalSyntheticLambda0 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        Object[] objArr = {textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(), StandardCharsets.US_ASCII)};
        String str = (String) AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -750012447, 750012450, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr);
        String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iAsBinder4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iAsBinder5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iAsBinder6 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        byte[] bArr = new byte[iAsBinder6];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, iAsBinder6);
        return new ModalBottomSheetKtExternalSyntheticLambda0(iAsBinder, str, strOnWarmupCompleted, iAsBinder2, iAsBinder3, iAsBinder4, iAsBinder5, bArr);
    }
}
