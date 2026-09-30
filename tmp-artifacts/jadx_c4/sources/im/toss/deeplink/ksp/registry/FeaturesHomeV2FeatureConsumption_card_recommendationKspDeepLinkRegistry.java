package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home_v2.feature.consumption_card_recommendation.ConsumptionCardRecommendationSchemeActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomeV2FeatureConsumption_card_recommendationKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent;
    private static int onWarmupCompleted;

    /* renamed from: $r8$lambda$dc33-j-eUuA8e8BZbYHnjyfL88c, reason: not valid java name */
    public static /* synthetic */ Class m174$r8$lambda$dc33jeUuA8e8BZbYHnjyfL88c() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        int i = IAuthTabCallback + 9;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesHomeV2FeatureConsumption_card_recommendationKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{-772474362, 1509755037, 147781154, -1384603874, 1702183360, -1441978945, 1427189271, -1272598183, -901580106, -396103865, 1422456625, -598635069, 809749574, 925232091, 1280277363, -1362169218, 1328690656, -1983187106, 2104804920, 406563662, 883395229, -1883915298, -1624232840, 452443110, 1077943031, 1770195123, -430200367, 763368760, 1052148031, 1090179795, -76289599, -470258982}, Color.red(0) + 61, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureConsumption_card_recommendationKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesHomeV2FeatureConsumption_card_recommendationKspDeepLinkRegistry.m174$r8$lambda$dc33jeUuA8e8BZbYHnjyfL88c();
                    throw null;
                }
                Class clsM174$r8$lambda$dc33jeUuA8e8BZbYHnjyfL88c = FeaturesHomeV2FeatureConsumption_card_recommendationKspDeepLinkRegistry.m174$r8$lambda$dc33jeUuA8e8BZbYHnjyfL88c();
                int i3 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return clsM174$r8$lambda$dc33jeUuA8e8BZbYHnjyfL88c;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return ConsumptionCardRecommendationSchemeActivity.class;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i4 = -1469660336;
        float f = 0.0f;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10 + 5;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (KeyEvent.getMaxKeyCode() >> 16) + 72, 8849 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(i6), 72 - KeyEvent.normalizeMetaState(i6), TextUtils.indexOf("", c, i6, i6) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i4 = -1469660336;
                c = '0';
                i5 = 1;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $10 + 79;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 22252), 39 - Color.argb(0, 0, 0, 0), 10302 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i10 += 77;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.indexOf("", "")), 39 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 10301 - Color.red(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i10++;
                }
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), AndroidCharacter.getMirror('0') + 30, 7398 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i16 = $10 + 87;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 3 / 5;
            }
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new int[]{-768553441, 1643994726, 86268826, 949894278, -1586313620, 435663515, -1448573108, -366360099, 268170377, -536107906, 616082368, 1139073153, -1776813909, -1512895438, -63334567, 1624333673, -1470354992, -2138964900};
    }
}
