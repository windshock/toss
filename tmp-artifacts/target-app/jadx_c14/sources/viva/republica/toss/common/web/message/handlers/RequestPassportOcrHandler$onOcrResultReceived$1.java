package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;
import o.setTopGuideBackgroundColor;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestPassportOcrHandler$onOcrResultReceived$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static short[] onExtraCallback;
    final /* synthetic */ setTopGuideBackgroundColor $callbackProxy;
    final /* synthetic */ WebViewContentOwner $contentOwner;
    final /* synthetic */ JsonObject $data;
    final /* synthetic */ int $resultCode;
    final /* synthetic */ Bundle $resultData;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    int label;
    final /* synthetic */ RequestPassportOcrHandler this$0;
    private static final byte[] $$a = {25, 43, 92, -56};
    private static final int $$b = 253;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private static int onExtraCallbackWithResult = -1235701551;
    private static int IAuthTabCallback = -1538795419;
    private static int onNavigationEvent = 1381254070;
    private static byte[] onWarmupCompleted = {63, 77, 61, 55, 78, 53, 75, 68, -117, -16, 60, 67, 58, -97, 49, 10, 50, 52, 49, 64, 77, -118, 79, -13, 59, 75, 65, 73, 75, -118, 49, 10, 48, 48, 74, 70, 59, -125, 79, -7, 51, -100, -4, 72, 67, 54, 110, 88, 108, 79, -116, 49, 94, 86, 68, 116, 52, 81, 79, 105, 105, 69, 85, 84, -122, 84, 104, 100, -108, -90, -123, -72, -77, -81, -47, -117, -71, -66, -63, -121, -87, -71, -89, -67, -92, 83, 114, 111, 69, -116, 108, 91, -117, 107, 123, 108, 88, 125, 123, 91, -113, 80, 111, 109, 116, 125, 105, 120, 86, 125, -119, 54, Byte.MAX_VALUE, 116, 75, 98, 99, 111, 109, 96, 114, 113, 76, 97, 126, 80, 100, 124, 115, -31, -20, -18, -21, -6, -25, 59, -97, -30, -16, -28, -30, -48, 4, -57, -31, 9, -13, 1, 12, -1, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    private static char[] asInterface = {27256, 27172, 27168, 27168, 27171, 27198, 27173, 27175, 27176, 27250, 27169, 27174, 27329, 27474, 27485, 27478, 27458, 27465, 27485, 27486, 27484, 27471, 27462, 27483, 27485, 27483, 27185, 27313, 27315, 27470, 27322, 27326, 27468, 27470, 27468, 27323, 27324, 27467, 27463, 27320, 27296, 27315, 27467, 27463, 27470, 27471, 27466, 27177, 27291, 27284, 27293, 27288, 27280, 27307, 27304, 27285, 27311, 27260, 27178, 27174, 27171, 27196, 27196, 27173, 27146, 27143, 27198, 27198, 27196, 27157, 27159, 27168};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$onOcrResultReceived$1.$$a
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 * 2
            int r7 = r7 + 115
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$onOcrResultReceived$1.$$c(short, short, int):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPassportOcrHandler$onOcrResultReceived$1(WebViewContentOwner webViewContentOwner, JsonObject jsonObject, int i, Bundle bundle, RequestPassportOcrHandler requestPassportOcrHandler, setTopGuideBackgroundColor settopguidebackgroundcolor, access13800<? super RequestPassportOcrHandler$onOcrResultReceived$1> access13800Var) {
        super(2, access13800Var);
        this.$contentOwner = webViewContentOwner;
        this.$data = jsonObject;
        this.$resultCode = i;
        this.$resultData = bundle;
        this.this$0 = requestPassportOcrHandler;
        this.$callbackProxy = settopguidebackgroundcolor;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestPassportOcrHandler$onOcrResultReceived$1 requestPassportOcrHandler$onOcrResultReceived$1 = new RequestPassportOcrHandler$onOcrResultReceived$1(this.$contentOwner, this.$data, this.$resultCode, this.$resultData, this.this$0, this.$callbackProxy, access13800Var);
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return requestPassportOcrHandler$onOcrResultReceived$1;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj3 = null;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            onExtraCallback(findresandmsg, access13800Var);
            obj3.hashCode();
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
        int i3 = IAuthTabCallbackDefault + 73;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RequestPassportOcrHandler$onOcrResultReceived$1 requestPassportOcrHandler$onOcrResultReceived$1Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return requestPassportOcrHandler$onOcrResultReceived$1Create.invokeSuspend(unit);
        }
        requestPassportOcrHandler$onOcrResultReceived$1Create.invokeSuspend(unit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02e2  */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestPassportOcrHandler$onOcrResultReceived$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = asInterface;
        float f = 0.0f;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16812499), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 35, 14239 - (ViewConfiguration.getScrollBarSize() >> 8), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $11 + 65;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 81;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 4 / 3;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i12 = $10 + 43;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i14 = $10 + 57;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getTapTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) + 65, 16718 - (KeyEvent.getMaxKeyCode() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i15] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.getOffsetBefore("", 0) + 65, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), MotionEvent.axisFromString("") + 30, 17656 - ((byte) KeyEvent.getModifierMetaStateMask()), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.blue(0) + 70, 12486 - View.MeasureSpec.getSize(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i18 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i18, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i18);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i19 = $10 + 3;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i4 << trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i20 = $11 + 19;
                $10 = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int length;
        byte[] bArr;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16733792) - Color.rgb(0, 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, 22439 - TextUtils.indexOf("", "", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $11;
                int i7 = i6 + 117;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = onWarmupCompleted;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i8 = i6 + 115;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    for (int i10 = 0; i10 < length2; i10++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 12843), View.MeasureSpec.getSize(0) + 55, Color.argb(0, 0, 0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), 42 - TextUtils.indexOf("", "", 0), 22439 - KeyEvent.keyCodeFromString(""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = $11 + 63;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 86 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.alpha(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onWarmupCompleted;
                if (bArr5 != null) {
                    int i13 = $11 + 109;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        bArr[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                boolean z = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
