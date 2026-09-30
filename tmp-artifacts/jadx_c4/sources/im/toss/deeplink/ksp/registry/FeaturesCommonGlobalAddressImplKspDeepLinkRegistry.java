package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.featurescommon.globaladdress.impl.test.GlobalAddressTestActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesCommonGlobalAddressImplKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallbackDefault;
    private static long onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {114, 69, -115, -114};
    private static final int $$b = 195;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = (i * 4) + 1;
        int i7 = i3 + 4;
        int i8 = 110 - i2;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i8;
            i5 = 0;
            i8 = i6;
            i8 += i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            i7++;
            if (i5 == i6) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i7];
            i8 += i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            i7++;
            if (i5 == i6) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            i7++;
            if (i5 == i6) {
            }
        }
    }

    public static /* synthetic */ Class $r8$lambda$areCyFT8j8KsXTL9TcV6xRqqlvo() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        int i = asInterface + 95;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesCommonGlobalAddressImplKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a((char) (Color.argb(0, 0, 0, 0) + 33975), (-1546497126) - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{17953, 54959, 51588, 14631, 47776, ' ', 65442, 33354, 35733, 39393, 59030, 9387, 28497, 209, 20096, 30168, 65085, 3271, 33824, 5356, 39503, 48221, 40134, 33916, 15060, 9501, 55283, 34138, 64255, 42382, 52118}, new char[]{0, 0, 0, 0}, new char[]{39591, 53843, 47011, 32388}, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCommonGlobalAddressImplKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 117;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$areCyFT8j8KsXTL9TcV6xRqqlvo = FeaturesCommonGlobalAddressImplKspDeepLinkRegistry.$r8$lambda$areCyFT8j8KsXTL9TcV6xRqqlvo();
                int i4 = IAuthTabCallback + 35;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$areCyFT8j8KsXTL9TcV6xRqqlvo;
                }
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return GlobalAddressTestActivity.class;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 125;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int absoluteGravity = Gravity.getAbsoluteGravity(i3, i3) + 43;
                    int i6 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1450;
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, absoluteGravity, i6, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) i3;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0')), 43 - MotionEvent.axisFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, (byte) (-b4)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 23973), 50 - TextUtils.indexOf("", ""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - View.MeasureSpec.getMode(0)), 29 - TextUtils.indexOf("", ""), 12577 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i3 = 0;
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
        int i7 = $11 + 3;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 7798559133331975163L;
        onWarmupCompleted = -1776194565;
        onNavigationEvent = (char) 44757;
    }
}
