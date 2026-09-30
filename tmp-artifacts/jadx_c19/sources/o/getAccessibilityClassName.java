package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getAccessibilityClassName extends dispatchNestedPreFling {
    private static final addFocusables onNavigationEvent = addFocusables.onExtraCallback(getAccessibilityClassName.class.getSimpleName());
    private final dispatchChildDetached IAuthTabCallback;
    private ensureRightGlow onExtraCallback;
    private List<findViewHolderForItemId> onExtraCallbackWithResult;
    private final boolean onTransact;
    private final offsetChildrenVertical onWarmupCompleted;

    public getAccessibilityClassName(@NonNull dispatchChildDetached dispatchchilddetached, @Nullable offsetChildrenVertical offsetchildrenvertical, boolean z) {
        this.onWarmupCompleted = offsetchildrenvertical;
        this.IAuthTabCallback = dispatchchilddetached;
        this.onTransact = z;
    }

    @Override // o.dispatchNestedPreFling
    public ensureRightGlow onNavigationEvent() {
        return this.onExtraCallback;
    }

    public boolean onWarmupCompleted() {
        Iterator<findViewHolderForItemId> it = this.onExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            if (!it.next().onNavigationEvent()) {
                onNavigationEvent.onExtraCallbackWithResult(new Object[]{"isSuccessful:", "returning false."});
                return false;
            }
        }
        onNavigationEvent.onExtraCallbackWithResult(new Object[]{"isSuccessful:", "returning true."});
        return true;
    }

    @Override // o.dispatchNestedPreFling, o.ensureRightGlow
    public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        addFocusables addfocusables = onNavigationEvent;
        addfocusables.onWarmupCompleted(new Object[]{"onStart:", "initializing."});
        IAuthTabCallbackDefault(dispatchonscrollstatechanged);
        addfocusables.onWarmupCompleted(new Object[]{"onStart:", "initialized."});
        super.IAuthTabCallback(dispatchonscrollstatechanged);
    }

    private void IAuthTabCallbackDefault(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
        List arrayList = new ArrayList();
        if (this.onWarmupCompleted != null) {
            getChildDrawingOrder getchilddrawingorder = new getChildDrawingOrder(this.IAuthTabCallback.ICustomTabsCallback(), this.IAuthTabCallback.newSessionWithExtras().an_(), this.IAuthTabCallback.onWarmupCompleted(com.otaliastudios.cameraview.engine.offset.Reference.VIEW), this.IAuthTabCallback.newSessionWithExtras().IAuthTabCallbackStub(), dispatchonscrollstatechanged.onExtraCallback(this), dispatchonscrollstatechanged.onExtraCallbackWithResult(this));
            arrayList = this.onWarmupCompleted.onExtraCallbackWithResult(getchilddrawingorder).onNavigationEvent(Integer.MAX_VALUE, getchilddrawingorder);
        }
        getAdapter getadapter = new getAdapter(arrayList, this.onTransact);
        fling flingVar = new fling(arrayList, this.onTransact);
        getChildLayoutPosition getchildlayoutposition = new getChildLayoutPosition(arrayList, this.onTransact);
        this.onExtraCallbackWithResult = Arrays.asList(getadapter, flingVar, getchildlayoutposition);
        this.onExtraCallback = dispatchNestedScroll.IAuthTabCallback(getadapter, flingVar, getchildlayoutposition);
    }
}
