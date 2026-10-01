package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.rn.toss.core.ReactSchemeActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RnTossCoreKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static final byte[] $$a = {15, -74, 84, -51};
    private static final int $$b = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted = 478309102;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4 = (i2 * 4) + 105;
        int i5 = b * 3;
        byte[] bArr = $$a;
        int i6 = 4 - (i * 3);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i6;
            int i9 = i7;
            int i10 = 0;
            int i11 = (-i6) + i9;
            int i12 = i8 + 1;
            i3 = i10;
            i4 = i11;
            i6 = i12;
            bArr2[i3] = (byte) i4;
            i10 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i4;
            i8 = i6;
            i6 = bArr[i6];
            i9 = i13;
            int i112 = (-i6) + i9;
            int i122 = i8 + 1;
            i3 = i10;
            i4 = i112;
            i6 = i122;
            bArr2[i3] = (byte) i4;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    /* renamed from: $r8$lambda$-erk0SC_VyZ14ERKyT8VGxoi0dg, reason: not valid java name */
    public static /* synthetic */ Class m311$r8$lambda$erk0SC_VyZ14ERKyT8VGxoi0dg() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$0();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onExtraCallbackWithResult + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$26mHT6pgetJmTABzwL0TB427o1w() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$i8XaNP0r_Uw9WiDCFnWpgkVyBaY() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    public RnTossCoreKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.RnTossCoreKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return RnTossCoreKspDeepLinkRegistry.m311$r8$lambda$erk0SC_VyZ14ERKyT8VGxoi0dg();
                }
                RnTossCoreKspDeepLinkRegistry.m311$r8$lambda$erk0SC_VyZ14ERKyT8VGxoi0dg();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.ALL;
        Object[] objArr = new Object[1];
        a(18 - (Process.myTid() >> 22), 3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{15, 20, 18, '\f', 65486, 4, 17, 14, 2, 65486, 65486, 65497, 18, 18, 14, 19, 17, 4}, true, TextUtils.lastIndexOf("", '0', 0, 0) + 297, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 4 - (Process.myTid() >> 22), new char[]{5, 16, 21, 19, '\r', 65487, 11, 14, 1, 2, 65487, 65487, 65498, 19, 19, 15, 20, 18}, true, ExpandableListView.getPackedPositionType(0L) + 295, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.RnTossCoreKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    RnTossCoreKspDeepLinkRegistry.$r8$lambda$i8XaNP0r_Uw9WiDCFnWpgkVyBaY();
                    throw null;
                }
                Class cls$r8$lambda$i8XaNP0r_Uw9WiDCFnWpgkVyBaY = RnTossCoreKspDeepLinkRegistry.$r8$lambda$i8XaNP0r_Uw9WiDCFnWpgkVyBaY();
                int i3 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 0;
                }
                return cls$r8$lambda$i8XaNP0r_Uw9WiDCFnWpgkVyBaY;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)));
        Object[] objArr3 = new Object[1];
        a(13 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 12, new char[]{65485, 65485, 65496, 17, 17, '\r', 18, 16, 3, 14, 19, 17, 11}, true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 297, objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.RnTossCoreKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    RnTossCoreKspDeepLinkRegistry.$r8$lambda$26mHT6pgetJmTABzwL0TB427o1w();
                    throw null;
                }
                Class cls$r8$lambda$26mHT6pgetJmTABzwL0TB427o1w = RnTossCoreKspDeepLinkRegistry.$r8$lambda$26mHT6pgetJmTABzwL0TB427o1w();
                int i3 = onExtraCallback + 61;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$26mHT6pgetJmTABzwL0TB427o1w;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return ReactSchemeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return ReactSchemeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return ReactSchemeActivity.class;
        }
        int i3 = 2 / 0;
        return ReactSchemeActivity.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - Process.getGidForName("")), 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 10278 - ExpandableListView.getPackedPositionType(0L), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12844), Drawable.resolveOpacity(0, 0) + 55, 2168 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i7 = $11 + 59;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 121;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i10 = $11 + 67;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    cArr2[i11] = cArr3[0];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char cBlue = (char) (Color.blue(0) + 12843);
                        int i13 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 54;
                        int packedPositionChild = 2166 - ExpandableListView.getPackedPositionChild(j);
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, i13, packedPositionChild, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 55 - (ViewConfiguration.getWindowTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 2168, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
                j = 0;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }
}
