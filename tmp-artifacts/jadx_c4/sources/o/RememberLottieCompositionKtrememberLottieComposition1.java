package o;

import android.util.Base64;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RememberLottieCompositionKtrememberLottieComposition1 implements onValueChanged {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    RememberLottieCompositionKtrememberLottieComposition1() {
    }

    @Override // o.onValueChanged
    public String onExtraCallbackWithResult(byte[] bArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return Base64.encodeToString(bArr, 0);
    }

    @Override // o.onValueChanged
    public byte[] onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrDecode = Base64.decode(str, 0);
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return bArrDecode;
    }
}
