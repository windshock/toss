package o;

import android.os.SystemClock;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.PredicateExternalSyntheticLambda4;
import o.r8lambdaa1zquKmpelcW4siJ2c_P2aVYISk;
import okhttp3.Headers;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda6osh7Edz0N3trwTGLtlaj6kkhM extends PredicateExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda6osh7Edz0N3trwTGLtlaj6kkhM(@NotNull okhttp3.OkHttpClient okHttpClient) {
        super(okHttpClient);
        Intrinsics.checkNotNullParameter(okHttpClient, "");
    }

    public /* synthetic */ void onExtraCallbackWithResult(setGoogleApiAvailability setgoogleapiavailability, r8lambdaa1zquKmpelcW4siJ2c_P2aVYISk.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((PredicateExternalSyntheticLambda4.IAuthTabCallback) setgoogleapiavailability, onextracallback);
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent(@NotNull PredicateExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback, @NotNull r8lambdaa1zquKmpelcW4siJ2c_P2aVYISk.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            iAuthTabCallback.IAuthTabCallback = SystemClock.elapsedRealtime();
            access8100.onNavigationEvent();
            boolean z = iAuthTabCallback.onNavigationEvent().asBinder() instanceof ReactNetworkImageRequest;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        iAuthTabCallback.IAuthTabCallback = SystemClock.elapsedRealtime();
        Map mapOnNavigationEvent = access8100.onNavigationEvent();
        if (iAuthTabCallback.onNavigationEvent().asBinder() instanceof ReactNetworkImageRequest) {
            int i3 = onWarmupCompleted + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNull(iAuthTabCallback.onNavigationEvent().asBinder(), "");
            int i5 = IAuthTabCallback + 43;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 2;
            }
        }
        Request.Builder builderCacheControl = new Request.Builder().cacheControl(okhttp3.CacheControl.FORCE_CACHE);
        String string = iAuthTabCallback.IAuthTabCallbackDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        onExtraCallbackWithResult(iAuthTabCallback, onextracallback, builderCacheControl.url(string).headers(Headers.Companion.of(mapOnNavigationEvent)).get().build());
        int i7 = IAuthTabCallback + 73;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }
}
