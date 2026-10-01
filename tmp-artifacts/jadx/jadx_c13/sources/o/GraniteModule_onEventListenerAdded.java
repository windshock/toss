package o;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import androidx.annotation.RawRes;
import kotlin.jvm.internal.Intrinsics;
import o.GraniteModule_onEventListenerAdded;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GraniteModule_onEventListenerAdded {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static final SoundPool onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final GraniteModule_onEventListenerAdded onWarmupCompleted = new GraniteModule_onEventListenerAdded();

    public static /* synthetic */ void onNavigationEvent(float f, SoundPool soundPool, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(f, soundPool, i, i2);
        int i6 = onNavigationEvent + 21;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private GraniteModule_onEventListenerAdded() {
    }

    static {
        SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).setMaxStreams(8).build();
        Intrinsics.checkNotNullExpressionValue(soundPoolBuild, "");
        onExtraCallbackWithResult = soundPoolBuild;
        int i = asBinder + 27;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
    }

    private static final void onWarmupCompleted(float f, SoundPool soundPool, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult.play(i, f, f, 0, 0, 1.0f);
        int i6 = onExtraCallback + 19;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull Context context, @RawRes int i, final float f) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SoundPool soundPool = onExtraCallbackWithResult;
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: im.toss.uikit.utils.SoundUtils$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool2, int i3, int i4) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 9;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    GraniteModule_onEventListenerAdded.onNavigationEvent(f, soundPool2, i3, i4);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                GraniteModule_onEventListenerAdded.onNavigationEvent(f, soundPool2, i3, i4);
                int i7 = onExtraCallback + 27;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 18 / 0;
                }
            }
        });
        soundPool.load(context, i, 1);
        int i3 = onExtraCallback + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
