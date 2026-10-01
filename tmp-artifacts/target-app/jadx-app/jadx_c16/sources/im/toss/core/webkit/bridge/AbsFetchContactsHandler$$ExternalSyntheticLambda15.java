package im.toss.core.webkit.bridge;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda15 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static int onNavigationEvent;
    public static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        surfaceDestroyed.onExtraCallbackWithResult(this.f$0, obj);
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static int onWarmupCompleted() {
        int i = onWarmupCompleted;
        int i2 = i % 9482887;
        onWarmupCompleted = i + 1;
        if (i2 != 0) {
            return onNavigationEvent;
        }
        int streamMaxVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMaxVolume(3);
        onNavigationEvent = streamMaxVolume;
        return streamMaxVolume;
    }
}
