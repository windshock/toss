package run.granite.microfrontend;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.transV2GenerateCertNum;
import o.transV2GetOtherOS;
import o.transV2Init;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;
import run.granite.microfrontend.GraniteMicroFrontendRuntimeModule$;

@ReactModule(IAuthTabCallback = NativeGraniteMicroFrontendRuntimeSpec.NAME)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GraniteMicroFrontendRuntimeModule extends NativeGraniteMicroFrontendRuntimeSpec implements transV2GetOtherOS {
    private static final IAuthTabCallback Companion;

    @Deprecated
    public static final String ERROR_EVALUATE_SCRIPT = "EVALUATE_SCRIPT_FAILED";

    @Deprecated
    public static final String ERROR_INVALID_REQUEST = "INVALID_REQUEST";
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 204;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    private static String $$c(int i, byte b, byte b2) {
        int i2 = b2 * 4;
        byte[] bArr = $$a;
        int i3 = i + 109;
        int i4 = 3 - (b * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i8];
            i4 = i8;
            i6 = i7;
        }
    }

    public static /* synthetic */ void $r8$lambda$0cPxHfaH5x62yq3kcfWpwpqeR4Q(GraniteMicroFrontendRuntimeModule graniteMicroFrontendRuntimeModule, transV2GenerateCertNum transv2generatecertnum, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        emit$lambda$0(graniteMicroFrontendRuntimeModule, transv2generatecertnum, function0);
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: $r8$lambda$drAVs-rmDYJ11yygcLx8pfbzaqo, reason: not valid java name */
    public static /* synthetic */ void m329$r8$lambda$drAVsrmDYJ11yygcLx8pfbzaqo(GraniteMicroFrontendRuntimeModule graniteMicroFrontendRuntimeModule, String str, Promise promise) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        evaluateScript$lambda$0(graniteMicroFrontendRuntimeModule, str, promise);
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        onTransact = 1;
        onExtraCallback();
        Companion = new IAuthTabCallback(null);
        int i = asInterface + 125;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraniteMicroFrontendRuntimeModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
    }

    public void initialize() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*com.facebook.react.bridge.BaseJavaModule*/.initialize();
            transV2Init.onNavigationEvent.onWarmupCompleted(this);
            int i3 = IAuthTabCallback + 105;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super/*com.facebook.react.bridge.BaseJavaModule*/.initialize();
        transV2Init.onNavigationEvent.onWarmupCompleted(this);
        throw null;
    }

    public void invalidate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            transV2Init.onNavigationEvent.onExtraCallback(this);
            super/*com.facebook.react.bridge.BaseJavaModule*/.invalidate();
        } else {
            transV2Init.onNavigationEvent.onExtraCallback(this);
            super/*com.facebook.react.bridge.BaseJavaModule*/.invalidate();
            throw null;
        }
    }

    private static final void evaluateScript$lambda$0(GraniteMicroFrontendRuntimeModule graniteMicroFrontendRuntimeModule, String str, Promise promise) {
        int i = 2 % 2;
        try {
            ReactApplicationContext reactApplicationContext = graniteMicroFrontendRuntimeModule.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "");
            new BundleEvaluator(reactApplicationContext).onExtraCallback(str);
            promise.resolve((Object) null);
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 22 / 0;
            }
        } catch (Exception e) {
            promise.reject(ERROR_EVALUATE_SCRIPT, e.getMessage(), e);
        }
    }

    @Override // run.granite.microfrontend.NativeGraniteMicroFrontendRuntimeSpec
    public void evaluateScript(@NotNull ReadableMap readableMap, @NotNull Promise promise) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        String string = readableMap.getString("filePath");
        if (string != null) {
            if (!getReactApplicationContext().runOnJSQueueThread(new GraniteMicroFrontendRuntimeModule$.ExternalSyntheticLambda1(this, string, promise))) {
                int i4 = onExtraCallback + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                promise.reject(ERROR_EVALUATE_SCRIPT, "Failed to enqueue script evaluation on the JS queue");
                int i6 = onExtraCallback + 77;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            return;
        }
        int i8 = IAuthTabCallback + 49;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            Object[] objArr = new Object[1];
            a((char) (Color.alpha(0) * 22155), 1053335358 << (ViewConfiguration.getJumpTapTimeout() + 53), new char[]{28643, 9673, 64694, 59699, 60215, 62723, 42524, 64146, 38685, 42555, 62414, 65342, 42014, 2998, 57415}, new char[]{0, 0, 0, 0}, new char[]{15970, 51359, 48958, 13881}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((char) (14783 - Color.alpha(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1053335358, new char[]{28643, 9673, 64694, 59699, 60215, 62723, 42524, 64146, 38685, 42555, 62414, 65342, 42014, 2998, 57415}, new char[]{0, 0, 0, 0}, new char[]{15970, 51359, 48958, 13881}, objArr2);
            obj = objArr2[0];
        }
        promise.reject(((String) obj).intern(), "evaluateScript requires request.filePath");
    }

    @Override // run.granite.microfrontend.NativeGraniteMicroFrontendRuntimeSpec
    public void startEventDelivery() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        transV2Init.onNavigationEvent.IAuthTabCallback(this);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.transV2GetOtherOS
    public boolean emit(@NotNull final transV2GenerateCertNum transv2generatecertnum, @NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transv2generatecertnum, "");
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zRunOnJSQueueThread = getReactApplicationContext().runOnJSQueueThread(new Runnable() { // from class: run.granite.microfrontend.GraniteMicroFrontendRuntimeModule$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GraniteMicroFrontendRuntimeModule.$r8$lambda$0cPxHfaH5x62yq3kcfWpwpqeR4Q(this.f$0, transv2generatecertnum, function0);
            }
        });
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return zRunOnJSQueueThread;
    }

    private static final void emit$lambda$0(GraniteMicroFrontendRuntimeModule graniteMicroFrontendRuntimeModule, transV2GenerateCertNum transv2generatecertnum, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        graniteMicroFrontendRuntimeModule.emitOnEvent(transv2generatecertnum.onExtraCallbackWithResult());
        function0.invoke();
        int i4 = IAuthTabCallback + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 42 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 1452 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), 43 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 1495, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 23972), 50 - (ViewConfiguration.getTouchSlop() >> 8), View.combineMeasuredStates(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 45848), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i3 = $11 + 27;
                            $10 = i3 % 128;
                            int i4 = i3 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 53;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onWarmupCompleted = 7798559133331975163L;
        onNavigationEvent = -1776194565;
        onExtraCallbackWithResult = (char) 40528;
    }
}
