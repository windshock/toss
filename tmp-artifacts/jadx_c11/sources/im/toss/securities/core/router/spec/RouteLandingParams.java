package im.toss.securities.core.router.spec;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.LiveDataObservableExternalSyntheticLambda1;
import o.access8100;
import o.getDebugUserGeography;
import o.getWrite;
import o.qExternalSyntheticLambda0;
import o.setDebugUserGeography;
import o.setTermsOfServiceUri;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RouteLandingParams implements getDebugUserGeography {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private final Set<String> onExtraCallback;
    private volatile boolean onExtraCallbackWithResult;
    private final qExternalSyntheticLambda0 onWarmupCompleted;
    private static char[] onNavigationEvent = {32536, 32521};
    private static int IAuthTabCallback = -1184333895;
    private static boolean IAuthTabCallbackStub = true;
    private static boolean IAuthTabCallbackDefault = true;

    public RouteLandingParams(@NotNull qExternalSyntheticLambda0 qexternalsyntheticlambda0) {
        Intrinsics.checkNotNullParameter(qexternalsyntheticlambda0, "");
        this.onWarmupCompleted = qexternalsyntheticlambda0;
        this.onExtraCallback = new LinkedHashSet();
    }

    @Override // o.getDebugUserGeography
    public Map<String, String> onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.onExtraCallbackWithResult) {
                Map<String, String> mapOnNavigationEvent = access8100.onNavigationEvent();
                int i3 = onTransact + 101;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return mapOnNavigationEvent;
            }
            setTermsOfServiceUri settermsofserviceuriOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
            if (settermsofserviceuriOnNavigationEvent == null) {
                int i5 = asInterface + 23;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    return access8100.onNavigationEvent();
                }
                int i6 = 54 / 0;
                return access8100.onNavigationEvent();
            }
            return access8100.onWarmupCompleted(setDebugUserGeography.onExtraCallbackWithResult(settermsofserviceuriOnNavigationEvent.IAuthTabCallback(), null), access8100.onExtraCallbackWithResult(settermsofserviceuriOnNavigationEvent.onNavigationEvent()));
        }
        throw null;
    }

    @Override // o.getDebugUserGeography
    public Map<String, String> IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        if (this.onWarmupCompleted.IAuthTabCallbackStub() instanceof TossSecRoute.Main) {
            int i2 = asInterface + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("prevEvent", TossSecRoute.Main.PATH);
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-126, -126, -127}, 127 - TextUtils.indexOf("", "", 0), objArr);
            Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("prevEventPlatform", ((String) objArr[0]).intern())});
            int i4 = onTransact + 63;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return mapOnWarmupCompleted;
        }
        return access8100.onNavigationEvent();
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
        this.onExtraCallbackWithResult = (strOnExtraCallbackWithResult == null || this.onExtraCallback.add(strOnExtraCallbackWithResult)) ? false : true;
        Set<String> set = this.onExtraCallback;
        LiveDataObservableExternalSyntheticLambda1<setTermsOfServiceUri> liveDataObservableExternalSyntheticLambda1IAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
        HashSet hashSet = new HashSet();
        Iterator it = liveDataObservableExternalSyntheticLambda1IAuthTabCallback.iterator();
        while (!(!it.hasNext())) {
            int i4 = asInterface + 79;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            hashSet.add(((setTermsOfServiceUri) it.next()).onExtraCallback());
        }
        set.retainAll(hashSet);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        float f = 0.0f;
        if (cArr3 != null) {
            int i5 = $10 + 59;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $11 + 123;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 77, MotionEvent.axisFromString("") + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 77 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 20952 - View.resolveSize(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i2++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                f = 0.0f;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 75 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 16037 - View.resolveSize(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i7 = $10 + 5;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 / 4;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 13;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] * iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63, TextUtils.indexOf("", "", 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 62, 12214 - View.MeasureSpec.getSize(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 64 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        String str = new String(cArr6);
        int i10 = $10 + 37;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i11 = 58 / 0;
            objArr[0] = str;
        }
    }
}
