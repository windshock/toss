package im.toss.deeplink.annotation;

import im.toss.deeplink.TargetRegion;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import kotlin.collections.CollectionsKt;

@Target({ElementType.TYPE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention
/* loaded from: /tmp/toss_alldex/classes4.dex */
public @interface DeepLink {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String IS_DEEP_LINK = "im.toss.is_deep_link_flag";
    public static final String IS_PARENT_ACTIVITY = "im.toss.is_parent_activity_flag";
    public static final String REFERRER_URI = "im.toss.deeplink.referrer_uri";
    public static final String URI = "im.toss.deep_link_uri";

    String description() default "";

    TargetRegion[] regions();

    String[] service() default {};

    String value();

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        public static final String IS_DEEP_LINK = "im.toss.is_deep_link_flag";
        public static final String IS_PARENT_ACTIVITY = "im.toss.is_parent_activity_flag";
        public static final String REFERRER_URI = "im.toss.deeplink.referrer_uri";
        public static final String URI = "im.toss.deep_link_uri";
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final List<String> deepLinkParams = CollectionsKt.listOf(new String[]{"im.toss.is_deep_link_flag", "im.toss.deep_link_uri", "im.toss.deeplink.referrer_uri", "im.toss.is_parent_activity_flag"});

        private Companion() {
        }

        public final List<String> getDeepLinkParams() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            List<String> list = deepLinkParams;
            int i5 = i2 + 99;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        static {
            int i = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
