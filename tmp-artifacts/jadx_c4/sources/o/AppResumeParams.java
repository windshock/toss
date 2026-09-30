package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppResumeParams {

    public static final class onNavigationEvent implements Function1<OkHttpClient.Builder, Unit> {
        private static int IAuthTabCallback = 1;
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 113;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(OkHttpClient.Builder builder) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(builder, "");
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((OkHttpClient.Builder) obj);
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 14 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }
}
