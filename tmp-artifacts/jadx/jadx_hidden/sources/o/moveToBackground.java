package o;

import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.devtool.sharedpref.presentation.SharedPrefStoreViewModel;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import o.EngineConfig1;

/* loaded from: classes.dex */
public final class moveToBackground {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    static SharedPrefStoreViewModel keepFieldType;
    private static char[] onExtraCallback;
    public static String onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 64, 44, 0}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0}, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        int i = IAuthTabCallback + 19;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int i7 = $11;
            int i8 = i7 + 41;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i9 = i7 + 17;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            for (int i11 = 0; i11 < length; i11++) {
                cArr[i11] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i11]);
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i12 = $10 + 37;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i14 = $11 + 17;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i17 = $11 + 45;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i19 = $11 + 11;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] / iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        onExtraCallback = new char[]{27138, 27354, 27358, 27355, 27332, 27328, 27348, 27357, 27333, 27335, 27353, 27346, 27347, 27329, 27334, 27359, 27353, 27331, 27336, 27358, 27353, 27355, 27358, 27335, 27170, 27188, 27348, 27350, 27348, 27352, 27352, 27347, 27355, 27350, 27350, 27353, 27347, 27189, 27192, 27359, 27353, 27347, 27352, 27358, 27353, 27355, 27358, 27351, 27186, 27191, 27351, 27349, 27347, 27375, 27351, 27358, 27195, 27186, 27345, 27347, 27347, 27187, 27191, 27353};
    }
}
