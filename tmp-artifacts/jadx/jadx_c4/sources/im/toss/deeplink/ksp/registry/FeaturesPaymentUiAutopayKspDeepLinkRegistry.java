package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.payment.ui.autopay.activity.AutoPayBackupRegisterActivity;
import im.toss.features.payment.ui.autopay.activity.GooglePaymentActivity;
import im.toss.features.payment.ui.autopay.activity.PayResellerRegisterActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GriverDatePickerExtension;
import o.TrackGroupExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesPaymentUiAutopayKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char[] IAuthTabCallback = null;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$3goV3WLhoqAVGmQVhB3vCI_sy_0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = onNavigationEvent + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return cls_init_$lambda$3;
    }

    public static /* synthetic */ Class $r8$lambda$AEu6PXrVrPLGVjOlk4oiwYBNKlI() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onExtraCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$SP1_QtYUGWOC82-_ifuryRVVPvo, reason: not valid java name */
    public static /* synthetic */ Class m203$r8$lambda$SP1_QtYUGWOC82_ifuryRVVPvo() {
        Class cls_init_$lambda$2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$2 = _init_$lambda$2();
            int i3 = 24 / 0;
        } else {
            cls_init_$lambda$2 = _init_$lambda$2();
        }
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$XeBEWkgqFH4Gb5vu9N7Wk4Ox29w() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return cls_init_$lambda$0;
    }

    static {
        IAuthTabCallback();
        int i = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public FeaturesPaymentUiAutopayKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiAutopayKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 103;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesPaymentUiAutopayKspDeepLinkRegistry.$r8$lambda$XeBEWkgqFH4Gb5vu9N7Wk4Ox29w();
                }
                FeaturesPaymentUiAutopayKspDeepLinkRegistry.$r8$lambda$XeBEWkgqFH4Gb5vu9N7Wk4Ox29w();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new int[]{0, 26, 0, 0}, true, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new int[]{26, 33, 133, 0}, false, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiAutopayKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesPaymentUiAutopayKspDeepLinkRegistry.$r8$lambda$AEu6PXrVrPLGVjOlk4oiwYBNKlI();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$AEu6PXrVrPLGVjOlk4oiwYBNKlI = FeaturesPaymentUiAutopayKspDeepLinkRegistry.$r8$lambda$AEu6PXrVrPLGVjOlk4oiwYBNKlI();
                int i3 = onNavigationEvent + 65;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$AEu6PXrVrPLGVjOlk4oiwYBNKlI;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new int[]{59, 26, 0, 26}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1}, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiAutopayKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesPaymentUiAutopayKspDeepLinkRegistry.m203$r8$lambda$SP1_QtYUGWOC82_ifuryRVVPvo();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class clsM203$r8$lambda$SP1_QtYUGWOC82_ifuryRVVPvo = FeaturesPaymentUiAutopayKspDeepLinkRegistry.m203$r8$lambda$SP1_QtYUGWOC82_ifuryRVVPvo();
                int i3 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return clsM203$r8$lambda$SP1_QtYUGWOC82_ifuryRVVPvo;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new int[]{85, 35, 0, 4}, false, new byte[]{1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1}, objArr4);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiAutopayKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$3goV3WLhoqAVGmQVhB3vCI_sy_0 = FeaturesPaymentUiAutopayKspDeepLinkRegistry.$r8$lambda$3goV3WLhoqAVGmQVhB3vCI_sy_0();
                int i4 = onExtraCallback + 17;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$3goV3WLhoqAVGmQVhB3vCI_sy_0;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return GriverDatePickerExtension.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return AutoPayBackupRegisterActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return GooglePaymentActivity.class;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return PayResellerRegisterActivity.class;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 85;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - ExpandableListView.getPackedPositionType(0L)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, 14239 - View.combineMeasuredStates(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = $10 + 123;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 10935), TextUtils.getOffsetAfter("", 0) + 65, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 29 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49467), 70 - Color.argb(0, 0, 0, 0), 12485 - TextUtils.indexOf((CharSequence) "", '0'), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $10 + 63;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{27250, 27169, 27158, 27159, 27172, 27173, 27172, 27170, 27172, 27179, 27142, 27162, 27171, 27174, 27137, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27186, 27319, 27321, 27297, 27326, 27318, 27320, 27320, 27318, 27285, 27383, 27386, 27290, 27299, 27324, 27287, 27267, 27300, 27297, 27327, 27297, 27326, 27297, 27280, 27283, 27322, 27287, 27267, 27304, 27305, 27298, 27323, 27321, 27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27137, 27174, 27171, 27197, 27175, 27175, 27199, 27167, 27141, 27173, 27169, 27173, 27175, 27174, 27261, 27159, 27158, 27169, 27192, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27137, 27174, 27171, 27162, 27166, 27173, 27170, 27170, 27174, 27170, 27174, 27173, 27166, 27142, 27179, 27172, 27170, 27172, 27173};
    }
}
