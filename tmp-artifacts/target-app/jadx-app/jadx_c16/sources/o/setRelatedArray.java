package o;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobileid.impl.status.ComposableSingletons$MobileIdDeleteWalletByInfoChangeActivityKt$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getPrivacyDestinationUri;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setRelatedArray {
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static char asInterface;
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static long onExtraCallbackWithResult;
    public static final setRelatedArray onNavigationEvent;
    private static int onTransact;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static final byte[] $$a = {119, -40, 16, 123};
    private static final int $$b = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3 = 4 - (b * 2);
        int i4 = s + 109;
        int i5 = 1 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 += i6;
            i3++;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i4 += i6;
            i3++;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 53;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackDefault + 45;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 109;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public final getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        int i5 = i3 + 85;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    static {
        onTransact = 0;
        IAuthTabCallback();
        onNavigationEvent = new setRelatedArray();
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(1100962824, false, new ComposableSingletons$MobileIdDeleteWalletByInfoChangeActivityKt$.ExternalSyntheticLambda0());
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(2100901656, false, new ComposableSingletons$MobileIdDeleteWalletByInfoChangeActivityKt$.ExternalSyntheticLambda1());
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1429943454, false, new ComposableSingletons$MobileIdDeleteWalletByInfoChangeActivityKt$.ExternalSyntheticLambda2());
        int i = IAuthTabCallback_Parcel + 21;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 27;
        asBinder = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 2) == 2) {
            int i5 = i3 + 23;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1100962824, i, -1, "im.toss.features.mobileid.impl.status.ComposableSingletons$MobileIdDeleteWalletByInfoChangeActivityKt.lambda$1100962824.<anonymous> (MobileIdDeleteWalletByInfoChangeActivity.kt:79)");
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            int i5 = asBinder + 101;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                int i7 = IAuthTabCallbackDefault + 73;
                asBinder = i7 % 128;
                i3 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i |= i3;
        }
        if ((i & 19) != 18) {
            int i8 = asBinder + 101;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2100901656, i, -1, "im.toss.features.mobileid.impl.status.ComposableSingletons$MobileIdDeleteWalletByInfoChangeActivityKt.lambda$2100901656.<anonymous> (MobileIdDeleteWalletByInfoChangeActivity.kt:101)");
            }
            Object[] objArr = new Object[1];
            a((char) (View.MeasureSpec.getSize(0) + 56155), (Process.myPid() >> 22) + 475300420, new char[]{13207, 12089, 28566, 27275, 53265, 50422, 55122, 17526, 60192, 7876, 6749, 39505, 57160, 49500, 32227, 17554, 20495, 927, 64321, 3380, 45825, 53951, 19908, 10876, 8297, 64486, 5514, 50647, 62162, 49805, 29234, 59599, 23673, 39743, 45745, 64347, 7612, 40349, 14752, 46666, 11339, 50208, 12177, 51804, 31102, 58055, 30343, 63104, 37429, 27058, 40231, 32265, 19072, 32268, 16277}, new char[]{56912, 50222, 51203, 18822}, new char[]{17600, 21634, 23324, 37083}, objArr);
            appLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 21) & 29360128) | 6, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallbackDefault + 51;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                i2 = asBinder + 9;
                IAuthTabCallbackDefault = i2 % 128;
            }
            Unit unit = Unit.INSTANCE;
            int i12 = IAuthTabCallbackDefault + 31;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            return unit;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        int i14 = i2 % 2;
        Unit unit2 = Unit.INSTANCE;
        int i122 = IAuthTabCallbackDefault + 31;
        asBinder = i122 % 128;
        int i132 = i122 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 3;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(y1bVar, "");
            if ((i & 91) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1bVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = asBinder + 7;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i7 = asBinder + 87;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1429943454, i2, -1, "im.toss.features.mobileid.impl.status.ComposableSingletons$MobileIdDeleteWalletByInfoChangeActivityKt.lambda$-1429943454.<anonymous> (MobileIdDeleteWalletByInfoChangeActivity.kt:97)");
            }
            y1bVar.onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), (Function0) null, onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 199686, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
            int i4 = $10 + 97;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 43 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1451 - ExpandableListView.getPackedPositionGroup(0L), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 1494 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23971), TextUtils.indexOf((CharSequence) "", '0', 0) + 51, 22939 - (ViewConfiguration.getLongPressTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45848), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i6 = $10 + 11;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
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
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 2719264008314009003L;
        IAuthTabCallbackStub = -1776194565;
        asInterface = (char) 27643;
    }
}
