package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.pageRight;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class pageRight {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final FragmentStateAdapter4 onExtraCallback;
    private final Lazy onExtraCallbackWithResult;

    public static /* synthetic */ OkHttpClient IAuthTabCallback(pageRight pageright) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClientOnNavigationEvent = onNavigationEvent(pageright);
        int i4 = onWarmupCompleted + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return okHttpClientOnNavigationEvent;
    }

    @Inject
    public pageRight(@NotNull FragmentStateAdapter4 fragmentStateAdapter4) {
        Intrinsics.checkNotNullParameter(fragmentStateAdapter4, "");
        this.onExtraCallback = fragmentStateAdapter4;
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.remote.NativeAdsHttpClientFactory$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                OkHttpClient okHttpClientIAuthTabCallback = pageRight.IAuthTabCallback(this.f$0);
                int i4 = onExtraCallbackWithResult + 125;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return okHttpClientIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    private final OkHttpClient onExtraCallbackWithResult() {
        OkHttpClient okHttpClient;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            okHttpClient = (OkHttpClient) this.onExtraCallbackWithResult.getValue();
            int i3 = 90 / 0;
        } else {
            okHttpClient = (OkHttpClient) this.onExtraCallbackWithResult.getValue();
        }
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return okHttpClient;
    }

    private static final OkHttpClient onNavigationEvent(pageRight pageright) {
        int i = 2 % 2;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FragmentStateAdapter4 fragmentStateAdapter4 = pageright.onExtraCallback;
        FragmentStateAdapter1 fragmentStateAdapter1 = null;
        if (fragmentStateAdapter4 instanceof FragmentStateAdapter1) {
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                fragmentStateAdapter1.hashCode();
                throw null;
            }
            fragmentStateAdapter1 = (FragmentStateAdapter1) fragmentStateAdapter4;
        }
        if (fragmentStateAdapter1 != null) {
            int i3 = onWarmupCompleted + 77;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            fragmentStateAdapter1.onNavigationEvent(builder);
        }
        OkHttpClient okHttpClientBuild = builder.build();
        int i5 = onWarmupCompleted + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return okHttpClientBuild;
    }

    public final OkHttpClient.Builder IAuthTabCallback() {
        int i = 2 % 2;
        OkHttpClient.Builder builderDispatcher = onExtraCallbackWithResult().newBuilder().dispatcher(new Dispatcher());
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return builderDispatcher;
    }
}
