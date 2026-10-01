package o;

import im.toss.rn.toss.core.common.airline.AirlineModule;
import im.toss.rn.toss.core.common.di.ReactNetworkServiceCreator;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setControlState implements captureStartValues<r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<ReactNetworkServiceCreator> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs r8lambda77qfhzwh7dbw9osh2dyiqtxjabsOnExtraCallback = onExtraCallback((ReactNetworkServiceCreator) this.IAuthTabCallback.get());
        int i4 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return r8lambda77qfhzwh7dbw9osh2dyiqtxjabsOnExtraCallback;
    }

    public static r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs onExtraCallback(ReactNetworkServiceCreator reactNetworkServiceCreator) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs r8lambda77qfhzwh7dbw9osh2dyiqtxjabs = (r8lambda77QfHZwh7Dbw9oSh2DYiQTXjabs) createAnimator.onNavigationEvent(AirlineModule.onNavigationEvent.IAuthTabCallback(reactNetworkServiceCreator));
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return r8lambda77qfhzwh7dbw9osh2dyiqtxjabs;
    }
}
