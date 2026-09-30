package im.toss.tosssecurities.tuba.variable.v2.impl.di;

import android.content.Context;
import im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableService;
import java.io.File;
import javax.inject.Singleton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AFe1oSDK;
import o.accessgetStatep;
import o.g1;
import o.performOnAppAttribution;
import okhttp3.Cache;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NetworkModule {
    public static final NetworkModule IAuthTabCallback = new NetworkModule();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 83;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CookieJar cookieJar, Context context, OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cookieJar, context, builder);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return unitIAuthTabCallback;
    }

    private NetworkModule() {
    }

    @Singleton
    public final TubaVariableService IAuthTabCallback(@NotNull accessgetStatep accessgetstatep, @NotNull performOnAppAttribution performonappattribution) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(performonappattribution, "");
        TubaVariableService tubaVariableService = (TubaVariableService) performOnAppAttribution.onWarmupCompleted(performonappattribution, TubaVariableService.class, accessgetstatep.RatingCompatApi19Impl(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return tubaVariableService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final AFe1oSDK onExtraCallbackWithResult(@NotNull final Context context, @NotNull accessgetStatep accessgetstatep, @NotNull g1 g1Var, @NotNull final CookieJar cookieJar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(cookieJar, "");
        AFe1oSDK aFe1oSDK = (AFe1oSDK) g1.onExtraCallback(g1Var, AFe1oSDK.class, accessgetstatep.ResultReceiverMyResultReceiver(), (Long) null, (Long) null, new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.di.NetworkModule$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 69;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = NetworkModule.onWarmupCompleted(cookieJar, context, (OkHttpClient.Builder) obj);
                int i5 = onWarmupCompleted + 107;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 12, (Object) null);
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return aFe1oSDK;
    }

    private static final Unit IAuthTabCallback(CookieJar cookieJar, Context context, OkHttpClient.Builder builder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        builder.cookieJar(cookieJar);
        builder.cache(new Cache(new File(context.getCacheDir(), "tosssec_tuba_okhttp_cache"), 10485760L));
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
