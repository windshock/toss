package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.featurescommon.servicetermsagreement.youthparentconsent.presentation.LegalRepConsentActivity;
import im.toss.featurescommon.servicetermsagreement.youthparentconsent.presentation.YouthParentConsentResultActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesCommonServiceTermsAgreementYouthParentConsentKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static char[] onWarmupCompleted;

    /* renamed from: $r8$lambda$623Uo-q5pba45byHmRQ4QoLW1Xo, reason: not valid java name */
    public static /* synthetic */ Class m116$r8$lambda$623Uoq5pba45byHmRQ4QoLW1Xo() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = asInterface + 105;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$wsgN4HTqpjorF9wxsDa_C9kpwcI() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onExtraCallbackWithResult + 37;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    static {
        onNavigationEvent();
        int i = IAuthTabCallbackStub + 53;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesCommonServiceTermsAgreementYouthParentConsentKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCommonServiceTermsAgreementYouthParentConsentKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$wsgN4HTqpjorF9wxsDa_C9kpwcI = FeaturesCommonServiceTermsAgreementYouthParentConsentKspDeepLinkRegistry.$r8$lambda$wsgN4HTqpjorF9wxsDa_C9kpwcI();
                int i4 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 0;
                }
                return cls$r8$lambda$wsgN4HTqpjorF9wxsDa_C9kpwcI;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-111, -112, -113, -123, -124, -114, -115, -125, -124, -123, -115, -118, -116, -117, -124, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-122, -118, -126, -127, -124, -123, -115, -122, -109, -124, -127, -109, -121, -108, -115, -122, -109, -124, -123, -116, -125, -115, -110, -122, -126, -121, -111, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCommonServiceTermsAgreementYouthParentConsentKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM116$r8$lambda$623Uoq5pba45byHmRQ4QoLW1Xo = FeaturesCommonServiceTermsAgreementYouthParentConsentKspDeepLinkRegistry.m116$r8$lambda$623Uoq5pba45byHmRQ4QoLW1Xo();
                int i4 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return clsM116$r8$lambda$623Uoq5pba45byHmRQ4QoLW1Xo;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return LegalRepConsentActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return YouthParentConsentResultActivity.class;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        if (cArr3 != null) {
            int i4 = $11;
            int i5 = i4 + 79;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            int i6 = i4 + 31;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 76 - TextUtils.indexOf((CharSequence) "", '0'), 20952 - Color.blue(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 75 - (ViewConfiguration.getLongPressTimeout() >> 16), 16037 - KeyEvent.getDeadChar(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i8 = 1052772399;
        if (onNavigationEvent) {
            int i9 = $10 + 71;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            }
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 63, 12214 - ExpandableListView.getPackedPositionType(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 63 - Color.blue(0), KeyEvent.keyCodeFromString("") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i10 = $10 + 97;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            i8 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{32563, 32561, 32574, 32513, 32572, 32562, 32575, 32756, 32767, 32570, 32519, 32525, 32761, 32560, 32517, 32512, 32565, 32518, 32568, 32515};
        onExtraCallback = -1184333906;
        IAuthTabCallback = true;
        onNavigationEvent = true;
    }
}
