package o;

import android.view.VelocityTracker;
import com.tmoney.LiveCheckConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class needsUpdate {
    private final double IAuthTabCallbackStubProxy;
    private final double access000;
    private final double access100;
    private final double asBinder;
    private final double getInterfaceDescriptor;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final needsUpdate onWarmupCompleted = new needsUpdate(-1.0d, 0.0d);
    private static final needsUpdate onExtraCallback = new needsUpdate(1.0d, 0.0d);
    private static final needsUpdate IAuthTabCallbackDefault = new needsUpdate(0.0d, -1.0d);
    private static final needsUpdate onExtraCallbackWithResult = new needsUpdate(0.0d, 1.0d);
    private static final needsUpdate onTransact = new needsUpdate(1.0d, -1.0d);
    private static final needsUpdate asInterface = new needsUpdate(1.0d, 1.0d);
    private static final needsUpdate onNavigationEvent = new needsUpdate(-1.0d, -1.0d);
    private static final needsUpdate IAuthTabCallback = new needsUpdate(-1.0d, 1.0d);
    private static final needsUpdate IAuthTabCallbackStub = new needsUpdate(0.0d, 0.0d);

    public needsUpdate(double d, double d2) {
        this.access000 = d;
        this.getInterfaceDescriptor = d2;
        double dHypot = Math.hypot(d, d2);
        this.asBinder = dHypot;
        boolean z = dHypot > 0.1d;
        this.access100 = z ? d / dHypot : 0.0d;
        this.IAuthTabCallbackStubProxy = z ? d2 / dHypot : 0.0d;
    }

    public final double IAuthTabCallbackStub() {
        return this.asBinder;
    }

    private final double onWarmupCompleted(needsUpdate needsupdate) {
        return (this.access100 * needsupdate.access100) + (this.IAuthTabCallbackStubProxy * needsupdate.IAuthTabCallbackStubProxy);
    }

    public final boolean onExtraCallback(@NotNull needsUpdate needsupdate, double d) {
        Intrinsics.checkNotNullParameter(needsupdate, "");
        return onWarmupCompleted(needsupdate) > d;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final needsUpdate onExtraCallback(int i) {
            switch (i) {
                case 1:
                    return needsUpdate.onExtraCallback;
                case 2:
                    return needsUpdate.onWarmupCompleted;
                case 3:
                case 7:
                default:
                    return needsUpdate.IAuthTabCallbackStub;
                case 4:
                    return needsUpdate.IAuthTabCallbackDefault;
                case 5:
                    return needsUpdate.onTransact;
                case 6:
                    return needsUpdate.onNavigationEvent;
                case 8:
                    return needsUpdate.onExtraCallbackWithResult;
                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                    return needsUpdate.asInterface;
                case 10:
                    return needsUpdate.IAuthTabCallback;
            }
        }

        public final needsUpdate onExtraCallback(@NotNull VelocityTracker velocityTracker) {
            Intrinsics.checkNotNullParameter(velocityTracker, "");
            velocityTracker.computeCurrentVelocity(1000);
            return new needsUpdate(velocityTracker.getXVelocity(), velocityTracker.getYVelocity());
        }
    }
}
