package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ScaffoldKtExternalSyntheticLambda4 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackDefault = -1478914302721940605L;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    public final int IAuthTabCallback;
    public final int asBinder;
    public final int onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final int onWarmupCompleted;

    private ScaffoldKtExternalSyntheticLambda4(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.onExtraCallback = i2;
        this.onWarmupCompleted = i3;
        this.onNavigationEvent = i4;
        this.IAuthTabCallback = i5;
        this.asBinder = i6;
        this.onExtraCallbackWithResult = i7;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackDefault ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $11 + 47;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.getSize(0)), TextUtils.lastIndexOf("", '0') + 85, Color.alpha(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 14185), 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 8808 - (ViewConfiguration.getScrollBarSize() >> 8), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[PHI: r5
      0x005d: PHI (r5v14 java.lang.String) = (r5v8 java.lang.String), (r5v18 java.lang.String) binds: [B:11:0x0058, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[PHI: r5
      0x008c: PHI (r5v13 java.lang.String) = (r5v8 java.lang.String), (r5v18 java.lang.String) binds: [B:11:0x0058, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[PHI: r5
      0x0096: PHI (r5v12 java.lang.String) = (r5v8 java.lang.String), (r5v18 java.lang.String) binds: [B:11:0x0058, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0 A[PHI: r5
      0x00a0: PHI (r5v10 java.lang.String) = (r5v8 java.lang.String), (r5v18 java.lang.String) binds: [B:11:0x0058, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[PHI: r5
      0x00ca: PHI (r5v9 java.lang.String) = (r5v8 java.lang.String), (r5v18 java.lang.String) binds: [B:11:0x0058, B:8:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ScaffoldKtExternalSyntheticLambda4 onNavigationEvent(String str) throws Throwable {
        String lowerCase;
        char c;
        int i2 = 2 % 2;
        RecordingInputConnection_androidKt.onNavigationEvent(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            int i9 = onTransact + 29;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                lowerCase = Ascii.toLowerCase(strArrSplit[i8].trim());
                int i10 = 32 / 0;
                switch (lowerCase.hashCode()) {
                    case 100571:
                        if (!lowerCase.equals(TtmlNode.END)) {
                            c = 65535;
                            break;
                        } else {
                            c = 0;
                            break;
                        }
                    case 3556653:
                        Object[] objArr = new Object[1];
                        a(new char[]{29285, 30654, 51621, 1286, 29201, 44884, 30915, 36063}, KeyEvent.getDeadChar(0, 0) + 1, objArr);
                        if (lowerCase.equals(((String) objArr[0]).intern())) {
                            int i11 = IAuthTabCallbackStub + 29;
                            onTransact = i11 % 128;
                            int i12 = i11 % 2;
                            c = 1;
                            break;
                        }
                        break;
                    case 102749521:
                        if (lowerCase.equals("layer")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 109757538:
                        if (lowerCase.equals("start")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109780401:
                        Object[] objArr2 = new Object[1];
                        a(new char[]{13722, 29595, 19334, 2017, 13801, 43872, 64225, 36384, 22467}, (Process.myTid() >> 22) + 1, objArr2);
                        if (lowerCase.equals(((String) objArr2[0]).intern())) {
                            int i13 = onTransact + 91;
                            IAuthTabCallbackStub = i13 % 128;
                            if (i13 % 2 == 0) {
                                c = 4;
                                break;
                            }
                        }
                        break;
                }
            } else {
                lowerCase = Ascii.toLowerCase(strArrSplit[i8].trim());
                switch (lowerCase.hashCode()) {
                    case 100571:
                        break;
                    case 3556653:
                        break;
                    case 102749521:
                        break;
                    case 109757538:
                        break;
                    case 109780401:
                        break;
                }
            }
            if (c == 0) {
                i5 = i8;
            } else if (c == 1) {
                i7 = i8;
            } else if (c == 2) {
                i3 = i8;
            } else if (c == 3) {
                i4 = i8;
            } else if (c == 4) {
                i6 = i8;
            }
        }
        if (i4 == -1) {
            return null;
        }
        int i14 = onTransact + 71;
        IAuthTabCallbackStub = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 22 / 0;
            if (i5 == -1) {
                return null;
            }
        } else if (i5 == -1) {
            return null;
        }
        if (i7 != -1) {
            return new ScaffoldKtExternalSyntheticLambda4(i3, i4, i5, i6, i7, strArrSplit.length);
        }
        return null;
    }
}
