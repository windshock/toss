package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda0 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(8);
    private int onWarmupCompleted;

    public boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        long j = 1024;
        if (jOnExtraCallback != -1 && jOnExtraCallback <= 1024) {
            j = jOnExtraCallback;
        }
        int i2 = (int) j;
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallback.onExtraCallback(), 0, 4);
        long jOnActivityResized = this.onExtraCallback.onActivityResized();
        this.onWarmupCompleted = 4;
        while (jOnActivityResized != 440786851) {
            int i3 = this.onWarmupCompleted + 1;
            this.onWarmupCompleted = i3;
            if (i3 == i2) {
                return false;
            }
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallback.onExtraCallback(), 0, 1);
            jOnActivityResized = ((jOnActivityResized << 8) & (-256)) | (this.onExtraCallback.onExtraCallback()[0] & 255);
        }
        long jOnNavigationEvent = onNavigationEvent(drawerKtExternalSyntheticLambda9);
        long j2 = this.onWarmupCompleted;
        if (jOnNavigationEvent != Long.MIN_VALUE && (jOnExtraCallback == -1 || j2 + jOnNavigationEvent < jOnExtraCallback)) {
            while (true) {
                long j3 = this.onWarmupCompleted;
                long j4 = j2 + jOnNavigationEvent;
                if (j3 < j4) {
                    if (onNavigationEvent(drawerKtExternalSyntheticLambda9) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jOnNavigationEvent2 = onNavigationEvent(drawerKtExternalSyntheticLambda9);
                    if (jOnNavigationEvent2 < 0 || jOnNavigationEvent2 > 2147483647L) {
                        break;
                    }
                    if (jOnNavigationEvent2 != 0) {
                        int i4 = (int) jOnNavigationEvent2;
                        drawerKtExternalSyntheticLambda9.IAuthTabCallback(i4);
                        this.onWarmupCompleted += i4;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private long onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        int i2 = 0;
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallback.onExtraCallback(), 0, 1);
        int i3 = this.onExtraCallback.onExtraCallback()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onExtraCallback.onExtraCallback(), 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (i6 << 8) + (this.onExtraCallback.onExtraCallback()[i2] & 255);
        }
        this.onWarmupCompleted += i5 + 1;
        return i6;
    }
}
