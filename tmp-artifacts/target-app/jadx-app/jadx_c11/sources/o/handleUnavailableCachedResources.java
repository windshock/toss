package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class handleUnavailableCachedResources extends areCachedAdResourcesMissing {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final int onNavigationEvent;

    public /* synthetic */ handleUnavailableCachedResources(int i, int i2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f);
    }

    private handleUnavailableCachedResources(int i, int i2, float f) {
        super(i2, f, null);
        this.onNavigationEvent = i;
    }

    @Override // o.areCachedAdResourcesMissing
    protected Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Integer.valueOf(this.onNavigationEvent);
            obj.hashCode();
            throw null;
        }
        Integer numValueOf = Integer.valueOf(this.onNavigationEvent);
        int i3 = onWarmupCompleted + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return numValueOf;
        }
        obj.hashCode();
        throw null;
    }
}
