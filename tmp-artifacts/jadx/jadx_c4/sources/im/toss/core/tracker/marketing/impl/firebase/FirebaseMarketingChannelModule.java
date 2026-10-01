package im.toss.core.tracker.marketing.impl.firebase;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.ktx.Firebase;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.checkOcclusion;
import o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class FirebaseMarketingChannelModule {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    static {
        int i = onNavigationEvent + 71;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Singleton
    public abstract r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE onWarmupCompleted(@NotNull checkOcclusion checkocclusion);

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        @Singleton
        public final FirebaseAnalytics onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            FirebaseAnalytics analytics = AnalyticsKt.getAnalytics(Firebase.INSTANCE);
            int i4 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return analytics;
        }
    }
}
