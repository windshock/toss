package o;

import im.toss.core.referrer.ReferrerProvider;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isReverse {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    public static final isReverse onExtraCallbackWithResult = new isReverse();
    private static int onNavigationEvent = 1;
    private static volatile WeakReference<ReferrerProvider> onWarmupCompleted;

    static {
        int i = onNavigationEvent + 5;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private isReverse() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 java.lang.ref.WeakReference<im.toss.core.referrer.ReferrerProvider>) = 
      (r1v4 java.lang.ref.WeakReference<im.toss.core.referrer.ReferrerProvider>)
      (r1v11 java.lang.ref.WeakReference<im.toss.core.referrer.ReferrerProvider>)
     binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String IAuthTabCallback() {
        WeakReference<ReferrerProvider> weakReference;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            weakReference = onWarmupCompleted;
            int i3 = 13 / 0;
            if (weakReference != null) {
                ReferrerProvider referrerProvider = weakReference.get();
                if (referrerProvider != null) {
                    return referrerProvider.onExtraCallback();
                }
            }
        } else {
            weakReference = onWarmupCompleted;
            if (weakReference != null) {
            }
        }
        int i4 = asInterface + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onExtraCallback(@NotNull ReferrerProvider referrerProvider) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(referrerProvider, "");
        onWarmupCompleted = new WeakReference<>(referrerProvider);
        int i2 = asInterface + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }
}
