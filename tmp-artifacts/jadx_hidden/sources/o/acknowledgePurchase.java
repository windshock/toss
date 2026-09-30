package o;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel;

/* loaded from: classes.dex */
public final class acknowledgePurchase {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static short[] asBinder = null;
    private static int asInterface = 1;
    static GlobalOnboardingResetPasswordViewModel keepFieldType;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    public static String onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 89), 583554521 + (ViewConfiguration.getJumpTapTimeout() >> 16), 916481966 - MotionEvent.axisFromString(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 68, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        int i = onTransact + 31;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r14, byte r15, int r16, int r17, int r18, java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.acknowledgePurchase.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 2037412399;
        IAuthTabCallback = -1538795501;
        onExtraCallbackWithResult = 1830305970;
        onExtraCallback = new byte[]{-88, -82, 90, -115, 121, -67, 83, -68, 93, 93, -84, 87, -85, -81, -67, -66, 115, -96, 93, -95, -68, 68, 86, -86, -86, 93, -66, 93, -94, 91, -80, 76, -92, 80, 92, -84, -118, -74, 101, 93, -84, 87, -85, -81, -67, 94, -66, 68, -96, 93, -95, 92, -21, 106, 91, -24, 104, 86, -86, -86, 93, -66, 93, -94, 91, 80, 82, -94, 93, 81, -24, 20, -95, 92, 82, -82, -68, 83, 80, -105, 109, -92, 80, 92, -84, -86, -106, 20, -81, -85, 84, -23, 110, -85, 8};
    }
}
