package im.toss.di;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossApiServiceModule$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = TossApiServiceModule.onWarmupCompleted((OkHttpClient.Builder) obj);
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
