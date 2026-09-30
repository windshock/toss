package o;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel;

/* loaded from: classes.dex */
public final class enableUpdatePkgRes {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    static SchemeHistoryViewModel keepFieldType;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onTransact;
    private static int onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((short) (MotionEvent.axisFromString("") + 1), (byte) ((-120) - ((byte) KeyEvent.getModifierMetaStateMask())), 41212 - AndroidCharacter.getMirror('0'), 1298543282 - View.combineMeasuredStates(0, 0), (-102) - TextUtils.indexOf("", ""), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        int i = asInterface + 109;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[PHI: r0
      0x00b8: PHI (r0v5 int) = (r0v4 int), (r0v24 int) binds: [B:31:0x00b6, B:28:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba A[PHI: r0
      0x00ba: PHI (r0v21 int) = (r0v4 int), (r0v24 int) binds: [B:31:0x00b6, B:28:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r14, byte r15, int r16, int r17, int r18, java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.enableUpdatePkgRes.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        onNavigationEvent = -1271232708;
        onWarmupCompleted = -1538795411;
        onExtraCallbackWithResult = 383653311;
        onExtraCallback = new byte[]{-45, -122, Byte.MIN_VALUE, 116, -93, 87, -109, 125, -110, 92, -122, -126, 122, Byte.MIN_VALUE, -117, -96, 98, 121, -119, 124, -124, -111, -92, 52, -122, -126, 122, Byte.MIN_VALUE, -117, Byte.MIN_VALUE, -69, 72, 121, -119, 124, -124, 113, -60, 68, 117, -58, 72, 121, -123, 116, -121, 120, -126, -59, 67, 124, -127, 122, Byte.MAX_VALUE, -112, Byte.MIN_VALUE, -73, 58, -127, -123, 122, -57, 64, -123};
    }
}
