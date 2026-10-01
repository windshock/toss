package im.toss.deeplink.ksp.registry;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.account_terminator.ui.AccountTerminateActivity;
import im.toss.features.account_terminator.ui.devtool.AccountTerminateDevToolActivity;
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
public final class FeaturesAccountTerminatorKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    /* renamed from: $r8$lambda$E7DSlg-2OXsB4JbsUbEDEBdiaYc, reason: not valid java name */
    public static /* synthetic */ Class m106$r8$lambda$E7DSlg2OXsB4JbsUbEDEBdiaYc() {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$I_SH5LU7thSkAwCArQ1mXgnlpXg() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$1();
        }
        _init_$lambda$1();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        int i = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesAccountTerminatorKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAccountTerminatorKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 7;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    FeaturesAccountTerminatorKspDeepLinkRegistry.m106$r8$lambda$E7DSlg2OXsB4JbsUbEDEBdiaYc();
                    throw null;
                }
                Class clsM106$r8$lambda$E7DSlg2OXsB4JbsUbEDEBdiaYc = FeaturesAccountTerminatorKspDeepLinkRegistry.m106$r8$lambda$E7DSlg2OXsB4JbsUbEDEBdiaYc();
                int i3 = onExtraCallback + 19;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return clsM106$r8$lambda$E7DSlg2OXsB4JbsUbEDEBdiaYc;
                }
                obj.hashCode();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{48356, 55364, 21434, 10831, 27455, 52608, 57473, 52210, 63080, 37362, 39795, 7881, 49559, 18991, 55309, 28554, 12970, 50421, 40758, 47941, 49069, 34883, 31958, 4176, 63011, 28399, 2858, 13646, 43709, 21674}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{48356, 55364, 21434, 10831, 27455, 52608, 57473, 52210, 63080, 37362, 39795, 7881, 49559, 18991, 55309, 28554, 12970, 50421, 40758, 47941, 49069, 34883, 31958, 4176, 63011, 28399, 2858, 13646, 35655, 58775, 36766, 9854, 55688, 37591, 41381, 61038, 11702, 14812, 7582, 3793}, Drawable.resolveOpacity(0, 0) + 40, objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAccountTerminatorKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesAccountTerminatorKspDeepLinkRegistry.$r8$lambda$I_SH5LU7thSkAwCArQ1mXgnlpXg();
                    throw null;
                }
                Class cls$r8$lambda$I_SH5LU7thSkAwCArQ1mXgnlpXg = FeaturesAccountTerminatorKspDeepLinkRegistry.$r8$lambda$I_SH5LU7thSkAwCArQ1mXgnlpXg();
                int i3 = onNavigationEvent + 31;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return cls$r8$lambda$I_SH5LU7thSkAwCArQ1mXgnlpXg;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return AccountTerminateActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return AccountTerminateDevToolActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 17;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 61;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i3);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, trimmedLength, maximumDrawingCacheSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 10, 12434 - KeyEvent.normalizeMetaState(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $10 + 23;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13, 19901 - KeyEvent.normalizeMetaState(0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i14 = $11 + 65;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onNavigationEvent = (char) 22907;
        onExtraCallback = (char) 10287;
        onExtraCallbackWithResult = (char) 34263;
        IAuthTabCallback = (char) 11726;
    }
}
