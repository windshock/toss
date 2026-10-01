package o;

import java.io.IOException;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BackdropScaffoldStateExternalSyntheticLambda1 implements BottomDrawerStateCompanionExternalSyntheticLambda1, BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted {
    private BottomDrawerStateCompanionExternalSyntheticLambda1 IAuthTabCallback;
    private BottomDrawerStateExternalSyntheticLambda2 IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub = -9223372036854775807L;
    private boolean asBinder;
    private final long asInterface;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda3 onExtraCallback;
    public final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallbackWithResult;
    private onExtraCallbackWithResult onNavigationEvent;
    private BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        void onExtraCallback(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, IOException iOException);

        void onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult);
    }

    public BackdropScaffoldStateExternalSyntheticLambda1(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        this.onExtraCallbackWithResult = onextracallbackwithresult;
        this.onExtraCallback = composableSingletonsScaffoldKtExternalSyntheticLambda3;
        this.asInterface = j;
    }

    public void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
        this.onNavigationEvent = onextracallbackwithresult;
    }

    public long asBinder() {
        return this.asInterface;
    }

    public void onWarmupCompleted(long j) {
        this.IAuthTabCallbackStub = j;
    }

    public long onTransact() {
        return this.IAuthTabCallbackStub;
    }

    public void IAuthTabCallback(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault == null);
        this.IAuthTabCallbackDefault = bottomDrawerStateExternalSyntheticLambda2;
    }

    public void onExtraCallback(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        long jOnExtraCallback = onExtraCallback(this.asInterface);
        BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1OnExtraCallbackWithResult = ((BottomDrawerStateExternalSyntheticLambda2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault)).onExtraCallbackWithResult(onextracallbackwithresult, this.onExtraCallback, jOnExtraCallback);
        this.IAuthTabCallback = bottomDrawerStateCompanionExternalSyntheticLambda1OnExtraCallbackWithResult;
        if (this.onWarmupCompleted != null) {
            bottomDrawerStateCompanionExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback(this, jOnExtraCallback);
        }
    }

    public void asInterface() {
        if (this.IAuthTabCallback != null) {
            ((BottomDrawerStateExternalSyntheticLambda2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault)).onExtraCallbackWithResult(this.IAuthTabCallback);
        }
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) {
        this.onWarmupCompleted = bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
        BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 = this.IAuthTabCallback;
        if (bottomDrawerStateCompanionExternalSyntheticLambda1 != null) {
            bottomDrawerStateCompanionExternalSyntheticLambda1.onExtraCallback(this, onExtraCallback(this.asInterface));
        }
    }

    public void onNavigationEvent() throws IOException {
        try {
            BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 = this.IAuthTabCallback;
            if (bottomDrawerStateCompanionExternalSyntheticLambda1 != null) {
                bottomDrawerStateCompanionExternalSyntheticLambda1.onNavigationEvent();
                return;
            }
            BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2 = this.IAuthTabCallbackDefault;
            if (bottomDrawerStateExternalSyntheticLambda2 != null) {
                bottomDrawerStateExternalSyntheticLambda2.onExtraCallback();
            }
        } catch (IOException e) {
            onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
            if (onextracallbackwithresult == null) {
                throw e;
            }
            if (this.asBinder) {
                return;
            }
            this.asBinder = true;
            onextracallbackwithresult.onExtraCallback(this.onExtraCallbackWithResult, e);
        }
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 ab_() {
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).ab_();
    }

    public long IAuthTabCallback(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j) {
        long j2 = this.IAuthTabCallbackStub;
        long j3 = (j2 == -9223372036854775807L || j != this.asInterface) ? j : j2;
        this.IAuthTabCallbackStub = -9223372036854775807L;
        Object[] objArr = {this.IAuthTabCallback};
        return ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742)).IAuthTabCallback(colorsKtExternalSyntheticLambda0Arr, zArr, bottomNavigationKtExternalSyntheticLambda5Arr, zArr2, j3);
    }

    public void onExtraCallback(long j, boolean z) {
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallback(j, z);
    }

    public long IAuthTabCallbackStub() {
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).IAuthTabCallbackStub();
    }

    public long onWarmupCompleted() {
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onWarmupCompleted();
    }

    public long onExtraCallbackWithResult(long j) {
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallbackWithResult(j);
    }

    public long onExtraCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallback(j, selectionContainerKtExternalSyntheticLambda2);
    }

    public long onExtraCallback() {
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallback();
    }

    public void IAuthTabCallback(long j) {
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((BottomDrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).IAuthTabCallback(j);
    }

    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 = this.IAuthTabCallback;
        return bottomDrawerStateCompanionExternalSyntheticLambda1 != null && bottomDrawerStateCompanionExternalSyntheticLambda1.IAuthTabCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1);
    }

    public boolean IAuthTabCallback() {
        BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 = this.IAuthTabCallback;
        return bottomDrawerStateCompanionExternalSyntheticLambda1 != null && bottomDrawerStateCompanionExternalSyntheticLambda1.IAuthTabCallback();
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda8$onExtraCallback
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        Object[] objArr = {this.onWarmupCompleted};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onWarmupCompleted(this);
    }

    @Override // o.BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted
    public void IAuthTabCallback(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        Object[] objArr = {this.onWarmupCompleted};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).IAuthTabCallback(this);
        onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        }
    }

    private long onExtraCallback(long j) {
        long j2 = this.IAuthTabCallbackStub;
        return j2 != -9223372036854775807L ? j2 : j;
    }
}
