package im.toss.url.resolver;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResolverOptions {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolverOptions)) {
            return false;
        }
        ResolverOptions resolverOptions = (ResolverOptions) obj;
        if (this.onExtraCallbackWithResult == resolverOptions.onExtraCallbackWithResult) {
            return this.onExtraCallback == resolverOptions.onExtraCallback;
        }
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.onExtraCallbackWithResult);
        return i3 == 0 ? (iHashCode + 65) / Boolean.hashCode(this.onExtraCallback) : (iHashCode * 31) + Boolean.hashCode(this.onExtraCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ResolverOptions(ignoreTrailingSlash=" + this.onExtraCallbackWithResult + ", pathCaseSensitive=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ResolverOptions(boolean z, boolean z2) {
        this.onExtraCallbackWithResult = z;
        this.onExtraCallback = z2;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onExtraCallback;
        int i4 = i3 + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
