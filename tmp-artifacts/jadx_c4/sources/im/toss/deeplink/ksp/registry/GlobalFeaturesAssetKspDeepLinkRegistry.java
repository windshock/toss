package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GRVAndroidMediaPlayer15;
import o.GRVAndroidMediaPlayer16;
import o.GRVAndroidMediaPlayer2;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GlobalFeaturesAssetKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static long IAuthTabCallback;
    private static int asInterface;
    private static int onExtraCallbackWithResult;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {99, 53, 44, 107};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3;
        int i4 = 110 - s;
        int i5 = 1 - (i * 2);
        byte[] bArr = $$a;
        int i6 = b + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i4 += -i7;
            i2 = i3;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i6];
            i4 += -i7;
            i2 = i3;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i6++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* renamed from: $r8$lambda$kdtylr6-2Kb4MFg_2Bsw8yN_Ges, reason: not valid java name */
    public static /* synthetic */ Class m258$r8$lambda$kdtylr62Kb4MFg_2Bsw8yN_Ges() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$1;
    }

    /* renamed from: $r8$lambda$nqoVttS4FbOrMDBg9r9-HfBxiyo, reason: not valid java name */
    public static /* synthetic */ Class m259$r8$lambda$nqoVttS4FbOrMDBg9r9HfBxiyo() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$oStGV3u76Jm-e31H65KzuaaHpk8, reason: not valid java name */
    public static /* synthetic */ Class m260$r8$lambda$oStGV3u76Jme31H65KzuaaHpk8() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$2();
            throw null;
        }
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i3 = onNavigationEvent + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$2;
    }

    static {
        asInterface = 1;
        onExtraCallback();
        int i = IAuthTabCallbackStub + 15;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public GlobalFeaturesAssetKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesAssetKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return GlobalFeaturesAssetKspDeepLinkRegistry.m259$r8$lambda$nqoVttS4FbOrMDBg9r9HfBxiyo();
                }
                GlobalFeaturesAssetKspDeepLinkRegistry.m259$r8$lambda$nqoVttS4FbOrMDBg9r9HfBxiyo();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.GLOBAL;
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-556711059) + ExpandableListView.getPackedPositionGroup(0L), new char[]{27802, 25455, 34882, 39735, 59620, 46944, 18540, 21311, 64099, 51296, 22788, 38787, 13935, 5902, 21702, 18583, 54182, 21327, 30732, 62950, 34184, 48053, 34297, 5839, 25219, 42868, 23187, 64313, 5205, 35100, 32547, 483, 40595}, new char[]{0, 0, 0, 0}, new char[]{28107, 53571, 30174, 64613}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((char) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) "", '0') - 2046223153, new char[]{56569, 28319, 4489, 58696, 45808, 50863, 26547, 19652, 10679, 21444, 2589, 40521, 15609, 46791, 23537, 25442, 23723, 46659, 4659, 19654, 15590, 23582, 59161, 60781, 55341, 13163, 61025, 43875, 14859, 62356, 59753, 63165, 62367}, new char[]{0, 0, 0, 0}, new char[]{52812, 2332, 17798, 39740}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesAssetKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM258$r8$lambda$kdtylr62Kb4MFg_2Bsw8yN_Ges = GlobalFeaturesAssetKspDeepLinkRegistry.m258$r8$lambda$kdtylr62Kb4MFg_2Bsw8yN_Ges();
                int i4 = onNavigationEvent + 71;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM258$r8$lambda$kdtylr62Kb4MFg_2Bsw8yN_Ges;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59604), Color.argb(0, 0, 0, 0), new char[]{59691, 35581, 2454, 8862, 4463, 61812, 45206, 26567, 57142, 17939, 27459, 53870, 47552, 38761, 47042, 17913, 41641, 40303, 36753, 39301, 46877, 43413, 5980, 49705, 55696, 31490, 41706, 60551, 46509, 805}, new char[]{0, 0, 0, 0}, new char[]{5999, 41729, 54375, 59368}, objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesAssetKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM260$r8$lambda$oStGV3u76Jme31H65KzuaaHpk8 = GlobalFeaturesAssetKspDeepLinkRegistry.m260$r8$lambda$oStGV3u76Jme31H65KzuaaHpk8();
                int i4 = IAuthTabCallback + 5;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return clsM260$r8$lambda$oStGV3u76Jme31H65KzuaaHpk8;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return GRVAndroidMediaPlayer2.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return GRVAndroidMediaPlayer16.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return GRVAndroidMediaPlayer15.class;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(i4) + 20) >> 6);
                    int gidForName = 42 - Process.getGidForName("");
                    int keyRepeatDelay = 1451 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, gidForName, keyRepeatDelay, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (-b3);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", i4) + 49123), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, 22939 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 45848), (KeyEvent.getMaxKeyCode() >> 16) + 29, ImageFormat.getBitsPerPixel(0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i7 = $11 + 1;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 / 4;
                }
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i9 = $10 + 61;
        $11 = i9 % 128;
        if (i9 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i10 = 88 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallback() {
        IAuthTabCallback = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        onWarmupCompleted = (char) 36741;
    }
}
