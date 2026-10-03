package viva.republica.toss.network.model.verify;

import kotlinx.serialization.KSerializer;
import o.invokeCallback;
import o.liq;

@liq(onNavigationEvent = invokeCallback.class)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface SessionType {
    public static final Companion Companion = Companion.$$INSTANCE;

    String getName();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        static {
            int i = onExtraCallback + 5;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private Companion() {
        }

        public final KSerializer<SessionType> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            invokeCallback invokecallback = invokeCallback.INSTANCE;
            int i4 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return invokecallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
