package im.toss.rn.toss.core.common.airline;

import im.toss.rn.toss.core.common.di.ReactNetworkServiceCreator;
import javax.inject.Singleton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AdControlButton;
import o.g1;
import o.r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AirlineModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final AirlineModule onNavigationEvent = new AirlineModule();
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 83;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AirlineModule() {
    }

    @Singleton
    public final r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs IAuthTabCallback(@NotNull final ReactNetworkServiceCreator reactNetworkServiceCreator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactNetworkServiceCreator, "");
        r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs r8lambda77qfhzwh7dbw9osh2dyiqtxjabs = (r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs) g1.onExtraCallback(ReactNetworkServiceCreator.onNavigationEvent(reactNetworkServiceCreator), r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs.class, AdControlButton.Companion.onNavigationEvent(ReactNetworkServiceCreator.onWarmupCompleted(reactNetworkServiceCreator).onExtraCallbackWithResult()).getBaseURL(), (Long) null, (Long) null, new Function1<OkHttpClient.Builder, Unit>() { // from class: im.toss.rn.toss.core.common.di.ReactNetworkServiceCreator$create$1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 81;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback((OkHttpClient.Builder) obj);
                if (i4 == 0) {
                    return Unit.INSTANCE;
                }
                int i5 = 3 / 0;
                return Unit.INSTANCE;
            }

            public final void onExtraCallback(OkHttpClient.Builder builder) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 43;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(builder, "");
                builder.cache(ReactNetworkServiceCreator.IAuthTabCallback(reactNetworkServiceCreator));
                int i5 = IAuthTabCallback + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 12, (Object) null);
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return r8lambda77qfhzwh7dbw9osh2dyiqtxjabs;
        }
        throw null;
    }
}
