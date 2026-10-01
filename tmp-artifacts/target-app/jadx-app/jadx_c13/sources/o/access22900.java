package o;

import android.os.Looper;
import javax.annotation.Nullable;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access22900 implements TombstoneProtosMemoryErrorTypeTypeVerifier {
    public static boolean onWarmupCompleted = false;
    private final Looper onNavigationEvent = Looper.myLooper();
    private final boolean onExtraCallback = IAuthTabCallback();

    @Override // o.TombstoneProtosMemoryErrorTypeTypeVerifier
    public boolean onExtraCallbackWithResult() {
        return onWarmupCompleted() && !this.onExtraCallback;
    }

    @Override // o.TombstoneProtosMemoryErrorTypeTypeVerifier
    public void onNavigationEvent(@Nullable String str) {
        boolean zOnWarmupCompleted = onWarmupCompleted();
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (!zOnWarmupCompleted) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(str2);
        }
        if (this.onExtraCallback) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(str2);
        }
    }

    @Override // o.TombstoneProtosMemoryErrorTypeTypeVerifier
    public boolean onExtraCallback() {
        Looper looper = this.onNavigationEvent;
        if (looper != null) {
            return onWarmupCompleted || looper == Looper.getMainLooper();
        }
        return false;
    }

    private boolean onWarmupCompleted() {
        return this.onNavigationEvent != null;
    }

    private static boolean IAuthTabCallback() {
        String name = Thread.currentThread().getName();
        return name != null && name.startsWith("IntentService[");
    }
}
