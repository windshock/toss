package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.benefit.test.BenefitTestActivity;
import im.toss.features.benefit.ui.launcher.BenefitLauncherActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.Workflow;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesBenefitKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static byte[] onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {35, -27, Byte.MIN_VALUE, 50};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3 = (i * 2) + 4;
        byte[] bArr = $$a;
        int i4 = (s * 3) + 115;
        int i5 = b * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 += -i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i3];
            i4 += -i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    /* renamed from: $r8$lambda$9fd0_3L-cW0Zfhzb7p3tRXfDIgg, reason: not valid java name */
    public static /* synthetic */ Class m110$r8$lambda$9fd0_3LcW0Zfhzb7p3tRXfDIgg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = IAuthTabCallbackStub + 109;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$KZ4g6cjt9f29jdSV73ttwjUOh1g() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$2();
        }
        _init_$lambda$2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$wSQS_amJ2Xak6Rv6lLw0PrcklU0() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onTransact = 1;
        IAuthTabCallback();
        int i = IAuthTabCallbackDefault + 117;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public FeaturesBenefitKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesBenefitKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesBenefitKspDeepLinkRegistry.$r8$lambda$wSQS_amJ2Xak6Rv6lLw0PrcklU0();
                    throw null;
                }
                Class cls$r8$lambda$wSQS_amJ2Xak6Rv6lLw0PrcklU0 = FeaturesBenefitKspDeepLinkRegistry.$r8$lambda$wSQS_amJ2Xak6Rv6lLw0PrcklU0();
                int i3 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$wSQS_amJ2Xak6Rv6lLw0PrcklU0;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((short) ((-124) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-476185561) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 1245040670, (-123) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((short) (((Process.getThreadPriority(0) + 20) >> 6) + 35), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 476185534, 1245040669 - TextUtils.indexOf((CharSequence) "", '0'), (Process.myPid() >> 22) - 124, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesBenefitKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM110$r8$lambda$9fd0_3LcW0Zfhzb7p3tRXfDIgg = FeaturesBenefitKspDeepLinkRegistry.m110$r8$lambda$9fd0_3LcW0Zfhzb7p3tRXfDIgg();
                int i4 = onNavigationEvent + 29;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return clsM110$r8$lambda$9fd0_3LcW0Zfhzb7p3tRXfDIgg;
                }
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)));
        Object[] objArr3 = new Object[1];
        a((short) ((-85) - ExpandableListView.getPackedPositionType(0L)), (byte) (Process.myPid() >> 22), Color.argb(0, 0, 0, 0) - 476185510, 1245040670 - ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 123, objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesBenefitKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$KZ4g6cjt9f29jdSV73ttwjUOh1g = FeaturesBenefitKspDeepLinkRegistry.$r8$lambda$KZ4g6cjt9f29jdSV73ttwjUOh1g();
                int i4 = onNavigationEvent + 91;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$KZ4g6cjt9f29jdSV73ttwjUOh1g;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return Workflow.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return BenefitTestActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return BenefitLauncherActivity.class;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.red(0)), (Process.myPid() >> 22) + 42, TextUtils.indexOf("", "") + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            char c = '0';
            if ((i7 ^ 1) == 0) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 33;
                        $11 = i9 % 128;
                        if (i9 % i5 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0, 0) + 12844), 54 - MotionEvent.axisFromString(""), 2166 - ((byte) KeyEvent.getModifierMetaStateMask()), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i8 %= 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 12843), 54 - TextUtils.indexOf((CharSequence) "", '0', 0), View.getDefaultSize(0, 0) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i5 = 2;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43424), (KeyEvent.getMaxKeyCode() >> 16) + 42, 22438 - TextUtils.indexOf((CharSequence) "", '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    int i10 = $11 + 107;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j)) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), View.MeasureSpec.getMode(0) + 86, 9567 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i13 = $11 + 3;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback % (((byte) (((byte) (bArr6[r7] - 4629411779493505016L)) * s)) ^ b);
                        } else {
                            byte[] bArr7 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i4;
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    int i14 = $10 + 73;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
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

    static void IAuthTabCallback() {
        onNavigationEvent = -1205478446;
        IAuthTabCallback = -1538795405;
        onWarmupCompleted = 294512733;
        onExtraCallback = new byte[]{-87, -105, 81, 115, 101, -125, 114, 121, -123, AbstractSmartcard.BYTE_READ_MORE, -55, 48, -118, Byte.MAX_VALUE, -127, 101, -55, 116, 121, 75, 116, -120, Byte.MAX_VALUE, 118, -127, 121, Byte.MAX_VALUE, 118, -107, -42, -29, -58, 42, -112, -32, -24, -42, -36, -18, -24, 24, -43, -38, -84, -43, -23, -48, -41, -30, -38, -48, -41, -82, 104, 80, 94, 68, 86, 80, Byte.MIN_VALUE, 26, 106, 90, 82, 66, 70, AbstractSmartcard.BYTE_READ_MORE, 66, -102, 23, 69, 91, 84, -122, 93, 66, 20, 93, 81, 88, 95, 106, 66, 88, 95};
    }
}
