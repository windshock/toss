package o;

import java.nio.Buffer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getTlsokhttp extends tlsVersions {
    public static final onNavigationEvent Companion = onNavigationEvent.onNavigationEvent;

    void onExtraCallback(@NotNull Buffer buffer);

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        static final /* synthetic */ onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
        }

        public final getTlsokhttp IAuthTabCallback(int i, int i2) {
            int i3 = 2 % 2;
            accessgetMONTH_PATTERNcp accessgetmonth_patterncp = new accessgetMONTH_PATTERNcp(i, i2);
            int i4 = onWarmupCompleted + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return accessgetmonth_patterncp;
        }
    }
}
