package im.toss.deeplink.ksp.registry;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.foreigner.bridge.ForeignerTossBankBridgeActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesForeignerKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static long IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$BDVZhJXkrBDKZX7UmcnQkQW8r9o() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onNavigationEvent + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    static {
        onNavigationEvent();
        int i = onExtraCallbackWithResult + 7;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesForeignerKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{34396, 20637, 11217, 543, 56641, 47032, 36586, 22829, 12388, 2794, 58822, 48269, 38685, 28251, 14527, 5091, 59958, 50559, 40895, 30351, 16849, 6227, 62273, 52641, 42228, 32563, 22139, 8371, 64389, 53967, 44370, 33876, 24253, 10721, '%', 56189, 46518}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54982, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesForeignerKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$BDVZhJXkrBDKZX7UmcnQkQW8r9o = FeaturesForeignerKspDeepLinkRegistry.$r8$lambda$BDVZhJXkrBDKZX7UmcnQkQW8r9o();
                int i4 = onNavigationEvent + 85;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$BDVZhJXkrBDKZX7UmcnQkQW8r9o;
                }
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return ForeignerTossBankBridgeActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 89;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "", 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 58, 6383 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $10 + 125;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 59 - View.MeasureSpec.getMode(0), 6384 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = 3938979194877772568L;
    }
}
