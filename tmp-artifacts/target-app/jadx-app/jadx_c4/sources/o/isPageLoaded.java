package o;

import im.toss.components.tuba.variable.TubaVarV1SyncState;
import im.toss.di.StateMachineModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isPageLoaded implements captureStartValues<TubaVarV1SyncState> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<isJacksonCreator> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState tubaVarV1SyncStateIAuthTabCallback = IAuthTabCallback();
        int i4 = onNavigationEvent + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return tubaVarV1SyncStateIAuthTabCallback;
    }

    public TubaVarV1SyncState IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TubaVarV1SyncState tubaVarV1SyncStateOnNavigationEvent = onNavigationEvent((isJacksonCreator) this.onExtraCallbackWithResult.get());
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return tubaVarV1SyncStateOnNavigationEvent;
    }

    public static TubaVarV1SyncState onNavigationEvent(isJacksonCreator isjacksoncreator) {
        TubaVarV1SyncState tubaVarV1SyncState;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            tubaVarV1SyncState = (TubaVarV1SyncState) createAnimator.onNavigationEvent(StateMachineModule.onExtraCallback.onWarmupCompleted(isjacksoncreator));
            int i3 = 62 / 0;
        } else {
            tubaVarV1SyncState = (TubaVarV1SyncState) createAnimator.onNavigationEvent(StateMachineModule.onExtraCallback.onWarmupCompleted(isjacksoncreator));
        }
        int i4 = onNavigationEvent + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return tubaVarV1SyncState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
