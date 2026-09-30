package o;

import androidx.annotation.Nullable;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda11 {
    public final String IAuthTabCallback;
    public final boolean onExtraCallback;
    public final byte[] onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback onWarmupCompleted;

    public ProgressIndicatorKtExternalSyntheticLambda11(boolean z, @Nullable String str, int i2, byte[] bArr, int i3, int i4, @Nullable byte[] bArr2) {
        RecordingInputConnection_androidKt.onNavigationEvent((bArr2 == null) ^ (i2 == 0));
        this.onExtraCallback = z;
        this.IAuthTabCallback = str;
        this.onNavigationEvent = i2;
        this.onExtraCallbackWithResult = bArr2;
        this.onWarmupCompleted = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback(onNavigationEvent(str), bArr, i3, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int onNavigationEvent(@Nullable String str) {
        char c;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (!str.equals("cbc1")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 2;
        }
        if (c != 2 && c != 3) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        }
        return 1;
    }
}
