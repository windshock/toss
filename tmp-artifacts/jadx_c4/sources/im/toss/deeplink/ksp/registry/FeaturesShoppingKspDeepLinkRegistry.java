package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.shopping.tab.api.ShoppingLauncherWrapperActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesShoppingKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted;

    /* renamed from: $r8$lambda$b_kAf-Rkc-dNQV2ZksB-OMH0Cyw, reason: not valid java name */
    public static /* synthetic */ Class m215$r8$lambda$b_kAfRkcdNQV2ZksBOMH0Cyw() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onNavigationEvent + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    static {
        onExtraCallbackWithResult();
        int i = onExtraCallback + 95;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesShoppingKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{1712828345, -491452393, 2001117434, 739958915, 1315724062, -1226918998, 1201789077, 1720824689, 959490656, -55399949, -1668338928, -303885221, 609977293, 1210027303, -706803458, -709224159, -2001804123, -1182913935}, Color.argb(0, 0, 0, 0) + 34, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesShoppingKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM215$r8$lambda$b_kAfRkcdNQV2ZksBOMH0Cyw = FeaturesShoppingKspDeepLinkRegistry.m215$r8$lambda$b_kAfRkcdNQV2ZksBOMH0Cyw();
                int i4 = IAuthTabCallback + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM215$r8$lambda$b_kAfRkcdNQV2ZksBOMH0Cyw;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return ShoppingLauncherWrapperActivity.class;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 72 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 8848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = $10 + 117;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 21;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i8]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 71, 8849 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i8 <<= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 8848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i8++;
                }
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i10 = i4;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i10] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 22253), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 38, (ViewConfiguration.getPressedStateDuration() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 78 - KeyEvent.keyCodeFromString(""), View.getDefaultSize(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i10 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new int[]{51621736, 1738357910, -580047618, -1869836619, -2034347738, -1073254446, 1196240952, 1114406108, -1112051993, 1010727104, 264773703, 2133047671, -1824385471, -2079176840, 2053721913, -977290225, -2090004612, 867323931};
    }
}
