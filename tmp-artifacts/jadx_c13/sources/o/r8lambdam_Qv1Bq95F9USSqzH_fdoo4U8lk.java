package o;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import o.getLocationStatus;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class r8lambdam_Qv1Bq95F9USSqzH_fdoo4U8lk implements getNetworkAccess {
    private final List<Object> onNavigationEvent;

    r8lambdam_Qv1Bq95F9USSqzH_fdoo4U8lk() {
        this.onNavigationEvent = new ArrayList();
    }

    r8lambdam_Qv1Bq95F9USSqzH_fdoo4U8lk(List<Object> list) {
        this.onNavigationEvent = list;
    }

    @Override // o.getNetworkAccess
    public getScreenDensityDpi onExtraCallback() {
        if (this.onNavigationEvent.size() == 2 && this.onNavigationEvent.get(0) != null) {
            return new calculateTotalMemory(this.onNavigationEvent.toArray());
        }
        return calculateTotalMemory.onExtraCallback(this.onNavigationEvent.toArray());
    }

    @Override // o.getNetworkAccess
    public <T> getNetworkAccess onNavigationEvent(getLocationStatus<T> getlocationstatus, T t) {
        if (getlocationstatus != null && !getlocationstatus.IAuthTabCallback().isEmpty() && t != null) {
            this.onNavigationEvent.add(getlocationstatus);
            this.onNavigationEvent.add(t);
        }
        return this;
    }

    @Override // o.getNetworkAccess
    public getNetworkAccess onExtraCallback(getScreenDensityDpi getscreendensitydpi) {
        if (getscreendensitydpi == null) {
            return this;
        }
        getscreendensitydpi.forEach(new BiConsumer() { // from class: io.opentelemetry.api.common.ArrayBackedAttributesBuilder$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f$0.onNavigationEvent((getLocationStatus<getLocationStatus<getLocationStatus>>) ((getLocationStatus<getLocationStatus>) obj), (getLocationStatus<getLocationStatus>) ((getLocationStatus) obj2));
            }
        });
        return this;
    }

    public static /* synthetic */ boolean onNavigationEvent(getLocationStatus getlocationstatus, getLocationStatus getlocationstatus2) {
        return getlocationstatus.IAuthTabCallback().equals(getlocationstatus2.IAuthTabCallback()) && getlocationstatus.onNavigationEvent().equals(getlocationstatus2.onNavigationEvent());
    }

    @Override // o.getNetworkAccess
    public getNetworkAccess onExtraCallback(Predicate<getLocationStatus<?>> predicate) {
        if (predicate != null) {
            for (int i = 0; i < this.onNavigationEvent.size() - 1; i += 2) {
                Object obj = this.onNavigationEvent.get(i);
                if ((obj instanceof getLocationStatus) && predicate.test((getLocationStatus) obj)) {
                    this.onNavigationEvent.set(i, null);
                    this.onNavigationEvent.set(i + 1, null);
                }
            }
        }
        return this;
    }
}
