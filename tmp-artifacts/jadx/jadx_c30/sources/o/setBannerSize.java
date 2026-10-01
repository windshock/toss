package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class setBannerSize extends createOpenAdLoader {
    private final Object IAuthTabCallback;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.IAuthTabCallback, ((setBannerSize) obj).IAuthTabCallback);
    }

    protected Object onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public int hashCode() {
        return Objects.hash(this.IAuthTabCallback);
    }
}
