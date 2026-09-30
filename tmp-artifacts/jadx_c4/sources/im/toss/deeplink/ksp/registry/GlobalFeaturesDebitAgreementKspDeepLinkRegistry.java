package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.global.features.debitagreement.ui.scheme.TransferDebitAgreementSchemeActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GlobalFeaturesDebitAgreementKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$AkC35Xv52xKOtSLWWMMDkmHctP8() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        int i = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalFeaturesDebitAgreementKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{47590, 47766, 50312, 50361, 22493, 19176, 50988, 49883, 13202, 12482, 49447, 46445, 25449, 54545, 34016, 53881, 58703, 55855, 18880, 24698, 57845, 60724, 57885, 24172, 38814, 16693, 170, 6947, 20375, 57199, 19977, 30629, 32606, 17911, 44926, 38312}, (KeyEvent.getMaxKeyCode() >> 16) + 36, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesDebitAgreementKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return GlobalFeaturesDebitAgreementKspDeepLinkRegistry.$r8$lambda$AkC35Xv52xKOtSLWWMMDkmHctP8();
                }
                GlobalFeaturesDebitAgreementKspDeepLinkRegistry.$r8$lambda$AkC35Xv52xKOtSLWWMMDkmHctP8();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.GLOBAL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return TransferDebitAgreementSchemeActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $10 + 91;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i10 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, i10, iResolveOpacity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i11 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "") + 10, 12434 - View.MeasureSpec.makeMeasureSpec(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i11 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16793230), (ViewConfiguration.getEdgeSlop() >> 16) + 14, (Process.myTid() >> 22) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 89;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = (char) 24869;
        onExtraCallback = (char) 18035;
        onWarmupCompleted = (char) 31785;
        onNavigationEvent = (char) 56238;
    }
}
