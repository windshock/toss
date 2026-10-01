package o;

import android.os.Process;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda29 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = ~elapsedCpuTime;
        int i3 = (~((i2 ^ 229270090) | (i2 & 229270090))) | (~((elapsedCpuTime ^ 1696278396) | (elapsedCpuTime & 1696278396)));
        int i4 = ~((i2 ^ (-1696278397)) | (i2 & (-1696278397)));
        int i5 = (-1639764297) - (~(((i3 & i4) | (i3 ^ i4)) * 959));
        int i6 = ~((i2 & 1696278396) | (i2 ^ 1696278396));
        int i7 = ~((229270090 & elapsedCpuTime) | (elapsedCpuTime ^ 229270090));
        int i8 = (i6 & i7) | (i6 ^ i7);
        int i9 = ~(elapsedCpuTime | (-1696278397));
        int i10 = ((i9 & i8) | (i8 ^ i9)) * 959;
        int i11 = (i5 & i10) + (i10 | i5);
        int iMyPid = Process.myPid();
        int i12 = ~(iMyPid | 891016783);
        int i13 = i12 ^ (-2113658832);
        int i14 = ~iMyPid;
        int i15 = (i14 & 891016783) | (i14 ^ 891016783);
        int i16 = ~((i15 & (-1778108815)) | (i15 ^ (-1778108815)));
        if (i11 > (((((i12 & (-2113658832)) | i13) * 576) + 1443894753) - (~(((i16 & 335550017) | (i16 ^ 335550017)) * 576))) - 1991742465) {
            throw new NullPointerException();
        }
        if (z) {
            int i17 = onExtraCallbackWithResult + 103;
            onExtraCallback = i17 % 128;
            int i18 = i17 % 2;
            return;
        }
        throw new IllegalStateException();
    }

    public static void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw new NullPointerException();
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        int i4 = i2 + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
