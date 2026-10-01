package o;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BackdropScaffoldKtExternalSyntheticLambda26 implements BottomDrawerStateExternalSyntheticLambda2 {
    private Looper IAuthTabCallback;
    private SelectionManagerExternalSyntheticLambda12 asInterface;
    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onTransact;
    private final ArrayList<BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent> onNavigationEvent = new ArrayList<>(1);
    private final HashSet<BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent> onExtraCallback = new HashSet<>(1);
    private final BottomNavigationKtExternalSyntheticLambda0$onExtraCallback onWarmupCompleted = new BottomNavigationKtExternalSyntheticLambda0$onExtraCallback();
    private final SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted onExtraCallbackWithResult = new SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted();

    protected void IAuthTabCallback() {
    }

    protected abstract void onExtraCallbackWithResult();

    protected void onWarmupCompleted() {
    }

    protected abstract void onWarmupCompleted(@Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7);

    public final void onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        this.onTransact = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
        Iterator<BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent> it = this.onNavigationEvent.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        }
    }

    public final BottomNavigationKtExternalSyntheticLambda0$onExtraCallback onExtraCallback(@Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return this.onWarmupCompleted.onExtraCallback(0, onextracallbackwithresult);
    }

    protected final BottomNavigationKtExternalSyntheticLambda0$onExtraCallback asInterface(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return this.onWarmupCompleted.onExtraCallback(i2, onextracallbackwithresult);
    }

    public final SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted onNavigationEvent(@Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return this.onExtraCallbackWithResult.IAuthTabCallback(0, onextracallbackwithresult);
    }

    protected final SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return this.onExtraCallbackWithResult.IAuthTabCallback(i2, onextracallbackwithresult);
    }

    protected final boolean asBinder() {
        return !this.onExtraCallback.isEmpty();
    }

    public final SelectionManagerExternalSyntheticLambda12 IAuthTabCallbackDefault() {
        return (SelectionManagerExternalSyntheticLambda12) RecordingInputConnection_androidKt.onWarmupCompleted(this.asInterface);
    }

    public final void onWarmupCompleted(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        this.asInterface = selectionManagerExternalSyntheticLambda12;
    }

    public final boolean onTransact() {
        return !this.onNavigationEvent.isEmpty();
    }

    public final void onExtraCallback(Handler handler, BottomNavigationKtExternalSyntheticLambda0 bottomNavigationKtExternalSyntheticLambda0) {
        this.onWarmupCompleted.onExtraCallbackWithResult(handler, bottomNavigationKtExternalSyntheticLambda0);
    }

    public final void onNavigationEvent(BottomNavigationKtExternalSyntheticLambda0 bottomNavigationKtExternalSyntheticLambda0) {
        this.onWarmupCompleted.onExtraCallback(bottomNavigationKtExternalSyntheticLambda0);
    }

    public final void IAuthTabCallback(Handler handler, SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8) {
        this.onExtraCallbackWithResult.onWarmupCompleted(handler, selectionManager_androidKtExternalSyntheticLambda8);
    }

    public final void onWarmupCompleted(SelectionManager_androidKtExternalSyntheticLambda8 selectionManager_androidKtExternalSyntheticLambda8) {
        this.onExtraCallbackWithResult.onWarmupCompleted(selectionManager_androidKtExternalSyntheticLambda8);
    }

    public final void onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onnavigationevent, @Nullable TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.IAuthTabCallback;
        RecordingInputConnection_androidKt.onNavigationEvent(looper == null || looper == looperMyLooper);
        this.asInterface = selectionManagerExternalSyntheticLambda12;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 = this.onTransact;
        this.onNavigationEvent.add(onnavigationevent);
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = looperMyLooper;
            this.onExtraCallback.add(onnavigationevent);
            onWarmupCompleted(textFieldSelectionStateExternalSyntheticLambda7);
        } else if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 != null) {
            onWarmupCompleted(onnavigationevent);
            onnavigationevent.onSourceInfoRefreshed(this, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        }
    }

    public final void onWarmupCompleted(BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onnavigationevent) {
        boolean zIsEmpty = this.onExtraCallback.isEmpty();
        this.onExtraCallback.add(onnavigationevent);
        if (zIsEmpty) {
            IAuthTabCallback();
        }
    }

    public final void onNavigationEvent(BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onnavigationevent) {
        boolean zIsEmpty = this.onExtraCallback.isEmpty();
        this.onExtraCallback.remove(onnavigationevent);
        if (zIsEmpty || !this.onExtraCallback.isEmpty()) {
            return;
        }
        onWarmupCompleted();
    }

    public final void IAuthTabCallback(BottomDrawerStateExternalSyntheticLambda2.onNavigationEvent onnavigationevent) {
        this.onNavigationEvent.remove(onnavigationevent);
        if (this.onNavigationEvent.isEmpty()) {
            this.IAuthTabCallback = null;
            this.onTransact = null;
            this.asInterface = null;
            this.onExtraCallback.clear();
            onExtraCallbackWithResult();
            return;
        }
        onNavigationEvent(onnavigationevent);
    }
}
