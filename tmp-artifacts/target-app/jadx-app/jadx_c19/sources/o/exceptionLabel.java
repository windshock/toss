package o;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class exceptionLabel extends ensureRightGlow {
    protected abstract void IAuthTabCallbackDefault(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged);

    protected abstract boolean IAuthTabCallbackStub(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged);

    protected abstract boolean onTransact(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged);

    @Override // o.ensureRightGlow
    public final void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        super.IAuthTabCallback(dispatchonscrollstatechanged);
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(dispatchonscrollstatechanged);
        if (onTransact(dispatchonscrollstatechanged) && !zIAuthTabCallbackStub) {
            IAuthTabCallbackDefault(dispatchonscrollstatechanged);
        } else {
            onNavigationEvent(Integer.MAX_VALUE);
        }
    }
}
