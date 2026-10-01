package im.toss.core.webkit.bridge;

import com.google.android.exoplayer2.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getFaceYuvToByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PlayNotificationSoundHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = getFaceYuvToByteArray.onWarmupCompleted((ExoPlayer) obj);
        int i4 = IAuthTabCallback + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
