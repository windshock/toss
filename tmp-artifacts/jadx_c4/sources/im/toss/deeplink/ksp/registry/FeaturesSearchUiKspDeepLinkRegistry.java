package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.search.ui.SearchActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesSearchUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$d46fh3pc7Z0m4T_DedZYkykQOiM() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$eJAcJsk_I45--Rn5HEFLgs_y-4Q, reason: not valid java name */
    public static /* synthetic */ Class m213$r8$lambda$eJAcJsk_I45Rn5HEFLgs_y4Q() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$opmzquilE1knQXkzT2RNzUVMf8w() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$3;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$xHhm1OSawty1zYw5NC3zbr8j2sI() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        int i = onNavigationEvent + 47;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public FeaturesSearchUiKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesSearchUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesSearchUiKspDeepLinkRegistry.$r8$lambda$d46fh3pc7Z0m4T_DedZYkykQOiM();
                }
                FeaturesSearchUiKspDeepLinkRegistry.$r8$lambda$d46fh3pc7Z0m4T_DedZYkykQOiM();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{42921, 28160, 13556, 64178, 33044, 22469, 7599, 9312, 60113, 45255, 18211, 3440, 54173, 39516, 41001, 30441, 15689, 49965}, KeyEvent.keyCodeFromString("") + 51631, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{42921, 26956, 14956, 51990, 39972, 44481, 32487, 3996, 53425, 57883, 45867, 17460, 5389, 9784, 63441, 47333, 18825, 6817, 11267, 64880, 36355, 24375, 24622, 12758, 49905, 37780}, (ViewConfiguration.getScrollBarSize() >> 8) + 52963, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesSearchUiKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    FeaturesSearchUiKspDeepLinkRegistry.$r8$lambda$xHhm1OSawty1zYw5NC3zbr8j2sI();
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$xHhm1OSawty1zYw5NC3zbr8j2sI = FeaturesSearchUiKspDeepLinkRegistry.$r8$lambda$xHhm1OSawty1zYw5NC3zbr8j2sI();
                int i3 = onWarmupCompleted + 15;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return cls$r8$lambda$xHhm1OSawty1zYw5NC3zbr8j2sI;
                }
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{42921, 36320, 62260, 55634, 3732, 29733, 23151, 36736, 62929, 56103, 227, 30352, 23581, 33212, 63465, 56585, 841, 26765, 24187, 33907, 59801, 57285, 1393, 27322, 20639, 34304, 60339, 53729, 1819, 27984, 21173, 47167, 61011, 54149}, 10830 - TextUtils.lastIndexOf("", '0'), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesSearchUiKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Class clsM213$r8$lambda$eJAcJsk_I45Rn5HEFLgs_y4Q;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM213$r8$lambda$eJAcJsk_I45Rn5HEFLgs_y4Q = FeaturesSearchUiKspDeepLinkRegistry.m213$r8$lambda$eJAcJsk_I45Rn5HEFLgs_y4Q();
                    int i3 = 13 / 0;
                } else {
                    clsM213$r8$lambda$eJAcJsk_I45Rn5HEFLgs_y4Q = FeaturesSearchUiKspDeepLinkRegistry.m213$r8$lambda$eJAcJsk_I45Rn5HEFLgs_y4Q();
                }
                int i4 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 1 / 0;
                }
                return clsM213$r8$lambda$eJAcJsk_I45Rn5HEFLgs_y4Q;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new char[]{42921, 53426, 18832, 49896, 31708, 62527, 27931, 58978, 8001, 38885, 215, 47562, 13045, 43974, 9261, 23835, 54889, 20319, 51199, 28816, 59895, 25301, 39885, 5228, 36099, 1663, 48984, 14246}, 30492 - Process.getGidForName(""), objArr4);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesSearchUiKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$opmzquilE1knQXkzT2RNzUVMf8w = FeaturesSearchUiKspDeepLinkRegistry.$r8$lambda$opmzquilE1knQXkzT2RNzUVMf8w();
                int i4 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$opmzquilE1knQXkzT2RNzUVMf8w;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return SearchActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return SearchActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return SearchActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return SearchActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 37;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 23 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() % (onExtraCallback + 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 59 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getOffsetAfter("", 0) + 24, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 59, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 37;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 58, Color.green(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i8 = $11 + 85;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallback = 5779375223253377773L;
    }
}
