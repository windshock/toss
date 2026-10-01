package o;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import javax.annotation.Nullable;
import o.getLocationStatus;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class calculateTotalMemory extends ErrorType<getLocationStatus<?>, Object> implements getScreenDensityDpi {
    private static final Comparator<getLocationStatus<?>> onWarmupCompleted = Comparator.comparing(new Function() { // from class: io.opentelemetry.api.common.ArrayBackedAttributes$$ExternalSyntheticLambda0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((getLocationStatus) obj).IAuthTabCallback();
        }
    });
    static final getScreenDensityDpi IAuthTabCallback = getScreenDensityDpi.onWarmupCompleted().onExtraCallback();

    private calculateTotalMemory(Object[] objArr, Comparator<getLocationStatus<?>> comparator) {
        super(objArr, comparator);
    }

    calculateTotalMemory(Object[] objArr) {
        super(objArr);
    }

    @Override // o.getScreenDensityDpi
    public getNetworkAccess onExtraCallbackWithResult() {
        return new r8lambdam_Qv1Bq95F9USSqzH_fdoo4U8lk(new ArrayList(IAuthTabCallback()));
    }

    @Override // o.getScreenDensityDpi
    @Nullable
    public <T> T onNavigationEvent(getLocationStatus<T> getlocationstatus) {
        return (T) super.onExtraCallbackWithResult(getlocationstatus);
    }

    static getScreenDensityDpi onExtraCallback(Object... objArr) {
        for (int i = 0; i < objArr.length; i += 2) {
            getLocationStatus getlocationstatus = (getLocationStatus) objArr[i];
            if (getlocationstatus != null && getlocationstatus.IAuthTabCallback().isEmpty()) {
                objArr[i] = null;
            }
        }
        return new calculateTotalMemory(objArr, onWarmupCompleted);
    }
}
