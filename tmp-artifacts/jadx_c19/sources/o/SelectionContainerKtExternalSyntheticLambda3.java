package o;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda3 {
    public static final SelectionContainerKtExternalSyntheticLambda3 IAuthTabCallback = new onWarmupCompleted().onExtraCallback();
    public final boolean IAuthTabCallbackDefault;
    public final boolean IAuthTabCallbackStub;

    @Deprecated
    public final boolean asInterface;
    public final Double onExtraCallback;
    public final boolean onExtraCallbackWithResult;
    public final ImmutableSet<Integer> onNavigationEvent;
    public final boolean onTransact;
    public final Double onWarmupCompleted;

    public static final class onWarmupCompleted {
        private Double onExtraCallbackWithResult;
        private Double onNavigationEvent;
        private ImmutableSet<Integer> onWarmupCompleted = ImmutableSet.of(1, 5);
        private boolean onTransact = true;
        private boolean onExtraCallback = true;
        private boolean IAuthTabCallback = true;
        private boolean IAuthTabCallbackDefault = true;

        public SelectionContainerKtExternalSyntheticLambda3 onExtraCallback() {
            return new SelectionContainerKtExternalSyntheticLambda3(this);
        }
    }

    private SelectionContainerKtExternalSyntheticLambda3(onWarmupCompleted onwarmupcompleted) {
        this.onNavigationEvent = onwarmupcompleted.onWarmupCompleted;
        this.onExtraCallback = onwarmupcompleted.onExtraCallbackWithResult;
        this.onWarmupCompleted = onwarmupcompleted.onNavigationEvent;
        this.IAuthTabCallbackStub = onwarmupcompleted.onTransact;
        this.asInterface = !onwarmupcompleted.onExtraCallback;
        this.onExtraCallbackWithResult = onwarmupcompleted.onExtraCallback;
        this.IAuthTabCallbackDefault = onwarmupcompleted.IAuthTabCallback;
        this.onTransact = onwarmupcompleted.IAuthTabCallbackDefault;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SelectionContainerKtExternalSyntheticLambda3)) {
            return false;
        }
        SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda3 = (SelectionContainerKtExternalSyntheticLambda3) obj;
        return this.onNavigationEvent.equals(selectionContainerKtExternalSyntheticLambda3.onNavigationEvent) && this.onExtraCallbackWithResult == selectionContainerKtExternalSyntheticLambda3.onExtraCallbackWithResult && Objects.equals(this.onExtraCallback, selectionContainerKtExternalSyntheticLambda3.onExtraCallback) && Objects.equals(this.onWarmupCompleted, selectionContainerKtExternalSyntheticLambda3.onWarmupCompleted) && this.IAuthTabCallbackStub == selectionContainerKtExternalSyntheticLambda3.IAuthTabCallbackStub && this.IAuthTabCallbackDefault == selectionContainerKtExternalSyntheticLambda3.IAuthTabCallbackDefault && this.onTransact == selectionContainerKtExternalSyntheticLambda3.onTransact;
    }

    public int hashCode() {
        return Objects.hash(this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted, Boolean.valueOf(this.IAuthTabCallbackStub), Boolean.valueOf(this.onExtraCallbackWithResult), Boolean.valueOf(this.IAuthTabCallbackDefault), Boolean.valueOf(this.onTransact));
    }
}
