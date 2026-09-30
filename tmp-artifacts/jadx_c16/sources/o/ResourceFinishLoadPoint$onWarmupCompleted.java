package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ResourceFinishLoadPoint$onWarmupCompleted implements ResourceFinishLoadPoint {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final ResourceFinishLoadPoint$onWarmupCompleted onExtraCallbackWithResult = new ResourceFinishLoadPoint$onWarmupCompleted();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 103;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return obj instanceof ResourceFinishLoadPoint$onWarmupCompleted;
        }
        int i5 = i3 + 7;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return -875468768;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return "Cancelled";
    }

    private ResourceFinishLoadPoint$onWarmupCompleted() {
    }
}
