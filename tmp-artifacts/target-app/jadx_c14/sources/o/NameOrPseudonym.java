package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import viva.republica.toss.common.web.message.handlers.cascraping.RevokeScrapingHandler;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NameOrPseudonym {
    private static long IAuthTabCallback;
    private static char[] onExtraCallback;
    public static final NameOrPseudonym onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = o.NameOrPseudonym.$$a
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r6 = r6 * 2
            int r6 = r6 + 97
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NameOrPseudonym.$$c(int, byte, short):java.lang.String");
    }

    static {
        onNavigationEvent = 0;
        onExtraCallback();
        onExtraCallbackWithResult = new NameOrPseudonym();
        int i = onWarmupCompleted + 69;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private NameOrPseudonym() {
    }

    public final calculateMaxTextSize onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 aLCFaceValidationInfo = new ALCFaceValidationInfo();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getScrollDefaultDelay() >> 16, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (56567 - ImageFormat.getBitsPerPixel(0)), objArr);
        aLCFaceValidationInfo.onExtraCallbackWithResult(((String) objArr[0]).intern(), getNameDistinguisher.class);
        Object[] objArr2 = new Object[1];
        a(14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 14 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
        aLCFaceValidationInfo.onExtraCallbackWithResult(((String) objArr2[0]).intern(), RevokeScrapingHandler.class);
        Object[] objArr3 = new Object[1];
        a(28 - View.getDefaultSize(0, 0), Color.alpha(0) + 18, (char) TextUtils.getCapsMode("", 0, 0), objArr3);
        aLCFaceValidationInfo.onExtraCallbackWithResult(((String) objArr3[0]).intern(), getDateOfBirth.class);
        calculateMaxTextSize calculatemaxtextsize = new calculateMaxTextSize(new ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1[]{aLCFaceValidationInfo});
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return calculatemaxtextsize;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r26, int r27, char r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NameOrPseudonym.a(int, int, char, java.lang.Object[]):void");
    }

    static void onExtraCallback() {
        onExtraCallback = new char[]{12613, 27007, 33056, 14836, 20915, 34936, 8209, 22756, 61622, 11112, 17214, 64474, 5022, 19026, 60838, 46476, 24024, 58636, 36171, 21632, 64745, 33820, 11342, 63376, 40902, 10018, 53094, 38570, 60839, 46476, 24000, 58631, 36205, 21632, 64713, 33804, 11357, 63382, 40915, 10015, 53095, 38542, 16106, 50734, 28264, 12733};
        IAuthTabCallback = 1799574019448681961L;
    }
}
