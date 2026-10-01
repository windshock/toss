package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.fx.FxAccountChooserActivity;
import im.toss.features.fx.FxIntroActivity;
import im.toss.features.fx.FxRestrictionActivity;
import im.toss.features.fx.FxTransferActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesFxKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 58146;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 53127;
    private static char onExtraCallbackWithResult = 10153;
    private static char onNavigationEvent = 2664;
    private static int onWarmupCompleted;

    /* renamed from: $r8$lambda$-ut1MGeNy2TuI1ycr6eyBO9Ox_E, reason: not valid java name */
    public static /* synthetic */ Class m143$r8$lambda$ut1MGeNy2TuI1ycr6eyBO9Ox_E() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onWarmupCompleted + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$PAiyH_89FYWbLoWKtQWwS9YFUOA() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i4 = IAuthTabCallbackDefault + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$4;
    }

    public static /* synthetic */ Class $r8$lambda$UOnlD7NLs4mJ8ee8DzYyNA3PZIY() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$UmbbUOK1WgtbHaLKPrqZkaqXNkI() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = IAuthTabCallbackDefault + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return cls_init_$lambda$3;
    }

    /* renamed from: $r8$lambda$Z6kVANb53A-uLVSTjA-OQYQo0jY, reason: not valid java name */
    public static /* synthetic */ Class m144$r8$lambda$Z6kVANb53AuLVSTjAOQYQo0jY() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return cls_init_$lambda$2;
    }

    public FeaturesFxKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFxKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 43;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesFxKspDeepLinkRegistry.$r8$lambda$UOnlD7NLs4mJ8ee8DzYyNA3PZIY();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$UOnlD7NLs4mJ8ee8DzYyNA3PZIY = FeaturesFxKspDeepLinkRegistry.$r8$lambda$UOnlD7NLs4mJ8ee8DzYyNA3PZIY();
                int i3 = onExtraCallback + 121;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$UOnlD7NLs4mJ8ee8DzYyNA3PZIY;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{4530, 46362, 34679, 16234, 12008, 14637, 7570, 8323, 20936, 335, 8097, 64708, 56161, 15655, 18877, 61418, 28495, 11479, 13142, 28000, 64109, 28499, 41577, 46246, 20018, 31270, 31399, 59902}, 28 - View.combineMeasuredStates(0, 0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{4530, 46362, 34679, 16234, 12008, 14637, 7570, 8323, 20936, 335, 8097, 64708, 56161, 15655, 18877, 61418, 27737, 39050, 8783, 6173, 20864, 36909, 50260, 63213, 49285, 28759, 65503, 5133}, KeyEvent.normalizeMetaState(0) + 27, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFxKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM143$r8$lambda$ut1MGeNy2TuI1ycr6eyBO9Ox_E = FeaturesFxKspDeepLinkRegistry.m143$r8$lambda$ut1MGeNy2TuI1ycr6eyBO9Ox_E();
                if (i3 != 0) {
                    int i4 = 90 / 0;
                }
                return clsM143$r8$lambda$ut1MGeNy2TuI1ycr6eyBO9Ox_E;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{4530, 46362, 34679, 16234, 12008, 14637, 7570, 8323, 20936, 335, 8097, 64708, 56161, 15655, 18877, 61418, 19985, 33315, 47311, 58957}, 19 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFxKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM144$r8$lambda$Z6kVANb53AuLVSTjAOQYQo0jY = FeaturesFxKspDeepLinkRegistry.m144$r8$lambda$Z6kVANb53AuLVSTjAOQYQo0jY();
                int i4 = onNavigationEvent + 93;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM144$r8$lambda$Z6kVANb53AuLVSTjAOQYQo0jY;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new char[]{4530, 46362, 34679, 16234, 12008, 14637, 7570, 8323, 20936, 335, 8097, 64708, 56161, 15655, 18877, 61418, 40265, 17897, 55858, 36834}, Color.argb(0, 0, 0, 0) + 20, objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFxKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$UmbbUOK1WgtbHaLKPrqZkaqXNkI = FeaturesFxKspDeepLinkRegistry.$r8$lambda$UmbbUOK1WgtbHaLKPrqZkaqXNkI();
                int i4 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$UmbbUOK1WgtbHaLKPrqZkaqXNkI;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new char[]{4530, 46362, 34679, 16234, 12008, 14637, 7570, 8323, 20936, 335, 8097, 64708, 56161, 15655, 19572, 13629}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, objArr5);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesFxKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$PAiyH_89FYWbLoWKtQWwS9YFUOA = FeaturesFxKspDeepLinkRegistry.$r8$lambda$PAiyH_89FYWbLoWKtQWwS9YFUOA();
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$PAiyH_89FYWbLoWKtQWwS9YFUOA;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return FxAccountChooserActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return FxRestrictionActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        Class<FxTransferActivity> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            cls = FxTransferActivity.class;
            int i4 = 44 / 0;
        } else {
            cls = FxTransferActivity.class;
        }
        int i5 = i3 + 103;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 49;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return FxIntroActivity.class;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return FxIntroActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $11 + 15;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $10 + 5;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(i3, i3);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                        int iResolveSize = 12434 - View.resolveSize(i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, jumpTapTimeout, iResolveSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 10 - (ViewConfiguration.getLongPressTimeout() >> 16), 12434 - Color.green(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16013), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 19902 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
