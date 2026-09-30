package o;

import android.content.Context;
import im.toss.di.TossPayCardRegisterModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppConstants implements captureStartValues<clearNestedRecyclerViewIfNotNested> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<Context> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public clearNestedRecyclerViewIfNotNested onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted((Context) this.onNavigationEvent.get());
            throw null;
        }
        clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnestedOnWarmupCompleted = onWarmupCompleted((Context) this.onNavigationEvent.get());
        int i3 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return clearnestedrecyclerviewifnotnestedOnWarmupCompleted;
        }
        throw null;
    }

    public static clearNestedRecyclerViewIfNotNested onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        clearNestedRecyclerViewIfNotNested clearnestedrecyclerviewifnotnested = (clearNestedRecyclerViewIfNotNested) createAnimator.onNavigationEvent(TossPayCardRegisterModule.onExtraCallback.onNavigationEvent(context));
        int i3 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return clearnestedrecyclerviewifnotnested;
    }
}
