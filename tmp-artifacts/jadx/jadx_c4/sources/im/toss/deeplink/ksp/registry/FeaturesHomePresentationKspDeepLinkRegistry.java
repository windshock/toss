package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.presentation.bottomsheet.HomeAccountBottomSheetSchemeActivity;
import im.toss.features.home.presentation.bottomsheet.TransactionBlockTransferSchemeActivity;
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
public final class FeaturesHomePresentationKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static int onExtraCallback;
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 243;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2 = 105 - (s * 4);
        int i3 = s2 * 2;
        int i4 = 4 - (s3 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            int i7 = 0;
            int i8 = i4 + i5;
            i = i7;
            i4 = i6 + 1;
            i2 = i8;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i4];
            int i9 = i4;
            i4 = i2;
            i6 = i9;
            int i82 = i4 + i5;
            i = i7;
            i4 = i6 + 1;
            i2 = i82;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i3) {
            }
        }
    }

    public static /* synthetic */ Class $r8$lambda$Yq46cTgwAnimUuz4WZn1vtwa2qM() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    /* renamed from: $r8$lambda$a-astSzYnFuZUz69Av96nxLhE4E, reason: not valid java name */
    public static /* synthetic */ Class m149$r8$lambda$aastSzYnFuZUz69Av96nxLhE4E() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$2();
        }
        _init_$lambda$2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$uBFCkho-p9iKsEKl3Hf7J_kMrOk, reason: not valid java name */
    public static /* synthetic */ Class m150$r8$lambda$uBFCkhop9iKsEKl3Hf7J_kMrOk() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$1();
        }
        _init_$lambda$1();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallbackWithResult();
        int i = onNavigationEvent + 9;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }

    public FeaturesHomePresentationKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomePresentationKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 15;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesHomePresentationKspDeepLinkRegistry.$r8$lambda$Yq46cTgwAnimUuz4WZn1vtwa2qM();
                }
                FeaturesHomePresentationKspDeepLinkRegistry.$r8$lambda$Yq46cTgwAnimUuz4WZn1vtwa2qM();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.ALL;
        Object[] objArr = new Object[1];
        a(40 - Color.blue(0), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{'\n', '\f', 5, 65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, '\b', 0, '\f', '\t', 65535, 65482, 15, 2, 3, 16, 11, 65534, 15, 17, 65484, 20, '\f', '\t', 3, 5, 16, 65534, 0, 65484, 2}, true, Process.getGidForName("") + 192, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, MotionEvent.axisFromString("") + 21, new char[]{17, 0, 2, 65486, 4, '\f', 14, 7, 65486, 65486, 65497, 18, 18, 14, 19, 17, 4, 15, 20, 18, 19, '\r', 20, 14, 2, 2, 0, 65484, 17, 4, 19, 18, '\b', 6, 4, 17, 65486, 11, '\b', 0, 19, 4, 3, 65486, 11, 11, '\b', 1, 65484, 3}, true, View.combineMeasuredStates(0, 0) + 189, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomePresentationKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesHomePresentationKspDeepLinkRegistry.m150$r8$lambda$uBFCkhop9iKsEKl3Hf7J_kMrOk();
                    throw null;
                }
                Class clsM150$r8$lambda$uBFCkhop9iKsEKl3Hf7J_kMrOk = FeaturesHomePresentationKspDeepLinkRegistry.m150$r8$lambda$uBFCkhop9iKsEKl3Hf7J_kMrOk();
                int i3 = onExtraCallback + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return clsM150$r8$lambda$uBFCkhop9iKsEKl3Hf7J_kMrOk;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(49 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 29 - Color.blue(0), new char[]{18, 4, 65485, 2, '\t', '\f', '\f', 65487, 4, 5, 20, 1, '\t', '\f', 65487, 3, '\b', 1, 18, 7, 5, 65485, 1, 3, 3, 15, 21, 14, 20, 19, 21, 16, 5, 18, 20, 15, 19, 19, 65498, 65487, 65487, '\b', 15, '\r', 5, 65487, 3, 1}, false, 188 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomePresentationKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesHomePresentationKspDeepLinkRegistry.m149$r8$lambda$aastSzYnFuZUz69Av96nxLhE4E();
                }
                FeaturesHomePresentationKspDeepLinkRegistry.m149$r8$lambda$aastSzYnFuZUz69Av96nxLhE4E();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return TransactionBlockTransferSchemeActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return HomeAccountBottomSheetSchemeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return HomeAccountBottomSheetSchemeActivity.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 21;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 35125), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, 10278 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char trimmedLength = (char) (12843 - TextUtils.getTrimmedLength(""));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 55;
                    int i9 = 2168 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(trimmedLength, scrollDefaultDelay, i9, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i10 = $11 + 11;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char mode = (char) (12843 - View.MeasureSpec.getMode(0));
                    int iMyTid = 55 - (Process.myTid() >> 22);
                    int iBlue = Color.blue(0) + 2167;
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, iMyTid, iBlue, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr3 = cArr2;
        }
        String str = new String(cArr3);
        int i11 = $11 + 7;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = 478308981;
    }
}
