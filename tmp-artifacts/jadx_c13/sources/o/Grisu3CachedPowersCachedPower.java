package o;

import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Grisu3CachedPowersCachedPower extends Resource {

    @Nullable
    private final String IAuthTabCallback;
    private final getScreenDensityDpi onNavigationEvent;

    public Grisu3CachedPowersCachedPower(@Nullable String str, getScreenDensityDpi getscreendensitydpi) {
        this.IAuthTabCallback = str;
        if (getscreendensitydpi == null) {
            throw new NullPointerException("Null attributes");
        }
        this.onNavigationEvent = getscreendensitydpi;
    }

    @Override // io.opentelemetry.sdk.resources.Resource
    @Nullable
    public String IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // io.opentelemetry.sdk.resources.Resource
    public getScreenDensityDpi onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return "Resource{schemaUrl=" + this.IAuthTabCallback + ", attributes=" + this.onNavigationEvent + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        String str = this.IAuthTabCallback;
        if (str == null) {
            if (resource.IAuthTabCallback() != null) {
                return false;
            }
        } else if (!str.equals(resource.IAuthTabCallback())) {
            return false;
        }
        return this.onNavigationEvent.equals(resource.onNavigationEvent());
    }

    public int hashCode() {
        String str = this.IAuthTabCallback;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.onNavigationEvent.hashCode();
    }
}
