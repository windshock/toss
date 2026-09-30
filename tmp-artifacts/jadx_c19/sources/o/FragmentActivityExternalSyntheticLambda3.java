package o;

import java.util.Iterator;
import java.util.Map;
import o.FragmentActivityExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class FragmentActivityExternalSyntheticLambda3 extends FragmentActivityExternalSyntheticLambda0.onWarmupCompleted implements Iterable<FragmentActivityExternalSyntheticLambda3> {
    public double IAuthTabCallback() {
        return 0.0d;
    }

    public int IAuthTabCallbackStub() {
        return 0;
    }

    public abstract onActivityPaused onExtraCallbackWithResult();

    public FragmentActivityExternalSyntheticLambda3 onWarmupCompleted(String str) {
        return null;
    }

    public boolean onWarmupCompleted() {
        return false;
    }

    public final boolean onTransact() {
        return onExtraCallbackWithResult() == onActivityPaused.NULL;
    }

    @Override // java.lang.Iterable
    public final Iterator<FragmentActivityExternalSyntheticLambda3> iterator() {
        return onNavigationEvent();
    }

    public Iterator<FragmentActivityExternalSyntheticLambda3> onNavigationEvent() {
        return SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted();
    }

    public Iterator<Map.Entry<String, FragmentActivityExternalSyntheticLambda3>> onExtraCallback() {
        return SavedStateHandleImplExternalSyntheticLambda0.onWarmupCompleted();
    }
}
