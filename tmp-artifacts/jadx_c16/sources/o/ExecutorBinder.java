package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.HomeIntelligenceLocal;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ExecutorBinder extends onReceiveCdp<HomeIntelligenceLocal.Image> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final ExecutorBinder IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static boolean onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static boolean onWarmupCompleted;

    static {
        IAuthTabCallback();
        IAuthTabCallback = new ExecutorBinder();
        int i = asBinder + 17;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ExecutorBinder() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HomeIntelligenceLocal.Image.class);
        Pair[] pairArr = {getWrite.IAuthTabCallback("LEFT", Reflection.getOrCreateKotlinClass(HomeIntelligenceLocal.Image.Left.class)), getWrite.IAuthTabCallback("RIGHT", Reflection.getOrCreateKotlinClass(HomeIntelligenceLocal.Image.Right.class))};
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -126, -127}, View.resolveSizeAndState(0, 0, 0) + 127, objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), access8100.onWarmupCompleted(pairArr), (String) null, 8, (DefaultConstructorMarker) null);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = onExtraCallbackWithResult;
        if (cArr4 != null) {
            int i3 = $10 + 33;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 77 - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.getSize(0) + 75, 16037 - ExpandableListView.getPackedPositionType(0L), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallback) {
            int i5 = $11 + 41;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 75;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] * iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 64 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 12214 - KeyEvent.getDeadChar(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 63, 12214 - (Process.myPid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                j = 0;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 62 - TextUtils.lastIndexOf("", '0', 0, 0), MotionEvent.axisFromString("") + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str = new String(cArr6);
        int i9 = $10 + 109;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{32387, 32390, 32399, 32402};
        onNavigationEvent = -1184334017;
        onWarmupCompleted = true;
        onExtraCallback = true;
    }
}
