package o;

import android.app.Application;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface Q0 {
    public static final onNavigationEvent Companion = onNavigationEvent.onExtraCallbackWithResult;

    void onExtraCallback();

    void onNavigationEvent(long j, @NotNull String str);

    void onNavigationEvent(@NotNull String str);

    void onWarmupCompleted(@NotNull Application application);

    static /* synthetic */ void onExtraCallback(Q0 q0, long j, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: overrideAppSessionTimeout-VtjQ1oo");
        }
        if ((i & 2) != 0) {
            str = "default_session_key";
        }
        q0.onNavigationEvent(j, str);
    }

    static /* synthetic */ void onExtraCallback(Q0 q0, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetAppSessionTimeout");
        }
        if ((i & 1) != 0) {
            str = "default_session_key";
        }
        q0.onNavigationEvent(str);
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface = 0;
        private static final long onExtraCallback;
        static final /* synthetic */ onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static final long onNavigationEvent;
        private static int onWarmupCompleted = 1;

        private onNavigationEvent() {
        }

        static {
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            setRevision setrevision = setRevision.MINUTES;
            onNavigationEvent = setCommandLine.onWarmupCompleted(5, setrevision);
            onExtraCallback = setCommandLine.onWarmupCompleted(1, setrevision);
            int i = IAuthTabCallback + 117;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public final long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 11;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            long j = onNavigationEvent;
            int i5 = i3 + 91;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 69;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            long j = onExtraCallback;
            int i4 = i2 + 49;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }
    }
}
