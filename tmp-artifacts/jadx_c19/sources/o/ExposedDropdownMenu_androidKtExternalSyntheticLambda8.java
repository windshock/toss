package o;

import androidx.annotation.Nullable;
import java.io.IOException;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenu_androidKtExternalSyntheticLambda8 {
    private int IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private long onNavigationEvent;
    private final byte[] onTransact = new byte[10];
    private int onWarmupCompleted;

    public void IAuthTabCallback() {
        this.IAuthTabCallbackDefault = false;
        this.IAuthTabCallback = 0;
    }

    public void onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onTransact, 0, 10);
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        if (DrawerKtExternalSyntheticLambda25.onNavigationEvent(this.onTransact) == 0) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
    }

    public void onExtraCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, long j, int i2, int i3, int i4, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback <= i3 + i4, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.IAuthTabCallbackDefault) {
            int i5 = this.IAuthTabCallback;
            int i6 = i5 + 1;
            this.IAuthTabCallback = i6;
            if (i5 == 0) {
                this.onNavigationEvent = j;
                this.onWarmupCompleted = i2;
                this.onExtraCallbackWithResult = 0;
            }
            this.onExtraCallbackWithResult += i3;
            this.onExtraCallback = i4;
            if (i6 >= 16) {
                onExtraCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda5, iAuthTabCallback);
            }
        }
    }

    public void onExtraCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback) {
        if (this.IAuthTabCallback > 0) {
            exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(this.onNavigationEvent, this.onWarmupCompleted, this.onExtraCallbackWithResult, this.onExtraCallback, iAuthTabCallback);
            this.IAuthTabCallback = 0;
        }
    }
}
