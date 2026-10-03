package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda30 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String BIZ_REFINANCING_INTRO_URL;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda30 INSTANCE;
    public static final String LOAN_REFINANCING_INTRO_URL;
    public static final String PRE_PAYMENT_COMMISSION_EVENT_URL;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final List<String> logoList;
    private static boolean onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onWarmupCompleted;

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda30() {
    }

    public final List<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 53;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = logoList;
        int i5 = i2 + 77;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return list;
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -113, -126, -124, -126, -112, -113, -120, -123, -127, -127, -123, -114, -114, -120, -122, -112, -121, -113, -126, -114, -115, -116, -117, -126, -125, -117, -118, -118, -119, -127, -127, -120, -121, -126, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr);
        PRE_PAYMENT_COMMISSION_EVENT_URL = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-109, -113, -123, -122, -113, -116, -113, -123, -110, -126, -125, -118, -113, -120, -123, -121, -116, -122, -123, -111, -117, -117, -116, -112, -113, -116, -120, -111, -118, -118, -119, -127, -127, -120, -121, -126, -122, -123, -124, -125, -126, -127}, (KeyEvent.getMaxKeyCode() >> 16) + 127, objArr2);
        LOAN_REFINANCING_INTRO_URL = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-120, -125, -121, -113, -123, -118, -125, -126, -113, -106, -120, -112, -127, -127, -126, -113, -123, -127, -107, -108, -118, -109, -113, -123, -122, -113, -116, -113, -123, -110, -126, -125, -118, -113, -120, -123, -121, -116, -122, -123, -111, -117, -117, -116, -112, -113, -116, -120, -111, -118, -118, -119, -127, -127, -120, -121, -126, -122, -123, -124, -125, -126, -127}, KeyEvent.normalizeMetaState(0) + 127, objArr3);
        BIZ_REFINANCING_INTRO_URL = ((String) objArr3[0]).intern();
        INSTANCE = new ImagePipelineExperimentsBuilderExternalSyntheticLambda30();
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-109, -113, -117, -104, -127, -127, -120, -121, -112, -111, -111, -123, -110, -112, -101, -113, -116, -108, -112, -113, -122, -123, -118, -102, -103, -118, -109, -113, -117, -118, -127, -113, -120, -122, -123, -118, -114, -123, -104, -127, -127, -120, -121, -104, -122, -123, -121, -116, -121, -127, -118, -118, -119, -127, -117, -121, -121, -105}, (Process.myTid() >> 22) + 127, objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-109, -113, -117, -104, -116, -113, -116, -105, -112, -111, -111, -123, -110, -112, -101, -113, -116, -108, -112, -113, -122, -123, -118, -102, -103, -118, -109, -113, -117, -118, -127, -113, -120, -122, -123, -118, -114, -123, -104, -127, -127, -120, -121, -104, -122, -123, -121, -116, -121, -127, -118, -118, -119, -127, -117, -121, -121, -105}, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-109, -113, -117, -104, -123, -125, -120, -120, -106, -112, -111, -111, -123, -110, -112, -101, -113, -116, -108, -112, -113, -122, -123, -118, -102, -103, -118, -109, -113, -117, -118, -127, -113, -120, -122, -123, -118, -114, -123, -104, -127, -127, -120, -121, -104, -122, -123, -121, -116, -121, -127, -118, -118, -119, -127, -117, -121, -121, -105}, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
        String strIntern3 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-109, -113, -117, -104, -101, -113, -116, -108, -101, -112, -111, -111, -123, -110, -112, -101, -113, -116, -108, -112, -113, -122, -123, -118, -102, -103, -118, -109, -113, -117, -118, -127, -113, -120, -122, -123, -118, -114, -123, -104, -127, -127, -120, -121, -104, -122, -123, -121, -116, -121, -127, -118, -118, -119, -127, -117, -121, -121, -105}, TextUtils.indexOf("", "") + 127, objArr7);
        logoList = CollectionsKt.listOf(new String[]{strIntern, strIntern2, strIntern3, ((String) objArr7[0]).intern()});
        int i = asInterface + 85;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 55;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 76 - MotionEvent.axisFromString(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        float f = 0.0f;
        char c = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), Color.argb(0, 0, 0, 0) + 75, 16038 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $11 + 39;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 63, 12214 - (ViewConfiguration.getWindowTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $10 + 1;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] * iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", c)), 64 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 12214 - Color.alpha(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 64 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 12214 - (ViewConfiguration.getEdgeSlop() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            f = 0.0f;
            c = '0';
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{32398, 32412, 32399, 32387, 32400, 32414, 32397, 32394, 32583, 32586, 32393, 32408, 32384, 32404, 32395, 32596, 32405, 32403, 32402, 32415, 32396, 32386, 32401, 32587, 32589, 32385, 32406};
        onWarmupCompleted = -1184334023;
        onNavigationEvent = true;
        onExtraCallback = true;
    }
}
