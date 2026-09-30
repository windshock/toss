package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.presentation.transaction_exclude.HomeConsumptionAccountTransactionExcludeBottomSheetActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomePresentationTransaction_excludeKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onNavigationEvent = {27153, 27377, 27379, 27387, 27384, 27376, 27378, 27378, 27376, 27375, 27185, 27188, 27352, 27384, 27383, 27386, 27355, 27354, 27386, 27383, 27381, 27377, 27378, 27383, 27379, 27383, 27385, 27383, 27351, 27357, 27363, 27360, 27386, 27379, 27378, 27378, 27346, 27346, 27376, 27386, 27388, 27381, 27387, 27363, 27384, 27383, 27385, 27383, 27351, 27355, 27383, 27382, 27388, 27381, 27385, 27361, 27355, 27357, 27389, 27378, 27377, 27378, 27383, 27381, 27382, 27391, 27390, 27385};

    public static /* synthetic */ Class $r8$lambda$JSLcAbagvHeTC7j3YLriqRva9j8() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesHomePresentationTransaction_excludeKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{0, 68, 75, 0}, false, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1}, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomePresentationTransaction_excludeKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                Class cls$r8$lambda$JSLcAbagvHeTC7j3YLriqRva9j8;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    cls$r8$lambda$JSLcAbagvHeTC7j3YLriqRva9j8 = FeaturesHomePresentationTransaction_excludeKspDeepLinkRegistry.$r8$lambda$JSLcAbagvHeTC7j3YLriqRva9j8();
                    int i3 = 69 / 0;
                } else {
                    cls$r8$lambda$JSLcAbagvHeTC7j3YLriqRva9j8 = FeaturesHomePresentationTransaction_excludeKspDeepLinkRegistry.$r8$lambda$JSLcAbagvHeTC7j3YLriqRva9j8();
                }
                int i4 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$JSLcAbagvHeTC7j3YLriqRva9j8;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 73;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return HomeConsumptionAccountTransactionExcludeBottomSheetActivity.class;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int i7 = $11 + 27;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 35283), ((byte) KeyEvent.getModifierMetaStateMask()) + 36, Color.green(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = $10 + 117;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10935), TextUtils.indexOf((CharSequence) "", '0') + 66, 16718 - Color.blue(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 29 - Color.green(0), 17656 - MotionEvent.axisFromString(""), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (KeyEvent.getMaxKeyCode() >> 16)), 69 - TextUtils.indexOf((CharSequence) "", '0'), View.resolveSize(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            int i13 = $11 + 71;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i15 = $10 + 97;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
