package o;

import android.media.AudioTrack;
import im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel;
import o.s3c;

/* loaded from: classes.dex */
public final class onAlternativeBillingOnlyTokenResponse {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    static GlobalOnboardingResetPasswordViewModel keepFieldType;
    private static char onExtraCallback;
    public static String onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{46214, 51112, 59255, 3607, 51704, 22558, 27651, 37945, 13642, 43651, 50938, 10773, 44265, 26407, 61119, 36826, 24247, 61199, 33329, 26289, 14222, 39178, 27651, 37945, 37788, 32768, 51513, 54398, 3065, 1848, 6297, 24038, 27302, 24748, 3939, 11345, 46883, 23039, 57137, 7203, 44405, 54227, 14222, 39178, 22789, 50550, 27158, 17112, 46466, 50645, 29700, 10620, 11143, 60170, 15321, 43752, 26169, 13472, 16589, 52876, 2263, 58323, 33281, 49998, 43927, 63755, 8761, 523, 15321, 43752, 49079, 54992, 45454, 47163, 23096, 37532, 47611, 46282, 18524, 4080, 29700, 10620, 11143, 60170, 15321, 43752, 51008, 937, 12981, 31721, 6098, 57011, 21224, 29920, 54421, 36552}, 95 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        int i = asInterface + 15;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i3 = $11 + 123;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $10 + 33;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i5) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L))), c2 >>> 5, onNavigationEvent);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i5) ^ ((C << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L))), C >>> 5, onExtraCallback);
                i5 -= 40503;
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = (char) 30137;
        onExtraCallback = (char) 4058;
        onWarmupCompleted = (char) 42675;
        onNavigationEvent = (char) 1308;
    }
}
