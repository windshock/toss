package o;

import androidx.annotation.Nullable;
import java.util.Objects;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent {
    public final long IAuthTabCallback;
    public final long IAuthTabCallbackDefault;
    public final long IAuthTabCallbackStub;
    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 asBinder;
    public final int asInterface;
    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onExtraCallback;
    public final long onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onTransact;
    public final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onWarmupCompleted;

    public SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent(long j, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, int i3, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2, long j3, long j4) {
        this.IAuthTabCallbackDefault = j;
        this.asBinder = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
        this.asInterface = i2;
        this.onTransact = onextracallbackwithresult;
        this.IAuthTabCallback = j2;
        this.onExtraCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102;
        this.onNavigationEvent = i3;
        this.onWarmupCompleted = onextracallbackwithresult2;
        this.onExtraCallbackWithResult = j3;
        this.IAuthTabCallbackStub = j4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent.class != obj.getClass()) {
            return false;
        }
        SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent = (SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent) obj;
        return this.IAuthTabCallbackDefault == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.IAuthTabCallbackDefault && this.asInterface == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asInterface && this.IAuthTabCallback == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.IAuthTabCallback && this.onNavigationEvent == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onNavigationEvent && this.onExtraCallbackWithResult == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onExtraCallbackWithResult && this.IAuthTabCallbackStub == selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.IAuthTabCallbackStub && Objects.equals(this.asBinder, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.asBinder) && Objects.equals(this.onTransact, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onTransact) && Objects.equals(this.onExtraCallback, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onExtraCallback) && Objects.equals(this.onWarmupCompleted, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent.onWarmupCompleted);
    }

    public int hashCode() {
        long j = this.IAuthTabCallbackDefault;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.asBinder;
        int i2 = this.asInterface;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
        long j2 = this.IAuthTabCallback;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102 = this.onExtraCallback;
        int i3 = this.onNavigationEvent;
        return Objects.hash(Long.valueOf(j), coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, Integer.valueOf(i2), onextracallbackwithresult, Long.valueOf(j2), coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102, Integer.valueOf(i3), this.onWarmupCompleted, Long.valueOf(this.onExtraCallbackWithResult), Long.valueOf(this.IAuthTabCallbackStub));
    }
}
