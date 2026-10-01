package o;

import android.net.Uri;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.util.Map;
import o.SelectionManager_androidKtExternalSyntheticLambda5;
import o.TextFieldSelectionStateExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda4;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda7 implements SelectionRegistrarImplExternalSyntheticLambda1 {
    private SelectionRegistrarImplExternalSyntheticLambda0 IAuthTabCallback;
    private String asBinder;
    private final Object onExtraCallback = new Object();
    private TextFieldStateKtExternalSyntheticLambda0.onNavigationEvent onExtraCallbackWithResult;
    private ComposableSingletonsScaffoldKtExternalSyntheticLambda5 onNavigationEvent;
    private TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onWarmupCompleted;

    @Override // o.SelectionRegistrarImplExternalSyntheticLambda1
    public SelectionRegistrarImplExternalSyntheticLambda0 get(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0;
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
        TextFieldStateKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult.IAuthTabCallback;
        if (onnavigationevent == null) {
            return SelectionRegistrarImplExternalSyntheticLambda0.onExtraCallback;
        }
        synchronized (this.onExtraCallback) {
            if (!onnavigationevent.equals(this.onExtraCallbackWithResult)) {
                this.onExtraCallbackWithResult = onnavigationevent;
                this.IAuthTabCallback = onExtraCallback(onnavigationevent);
            }
            selectionRegistrarImplExternalSyntheticLambda0 = (SelectionRegistrarImplExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback);
        }
        return selectionRegistrarImplExternalSyntheticLambda0;
    }

    private SelectionRegistrarImplExternalSyntheticLambda0 onExtraCallback(TextFieldStateKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent) {
        TextFieldSelectionStateExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallbackOnExtraCallback = this.onWarmupCompleted;
        if (iAuthTabCallbackOnExtraCallback == null) {
            iAuthTabCallbackOnExtraCallback = new TextFieldSelectionStateExternalSyntheticLambda4.IAuthTabCallback().onExtraCallback(this.asBinder);
        }
        Uri uri = onnavigationevent.onWarmupCompleted;
        TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda0 textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda0 = new TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda0(uri == null ? null : uri.toString(), onnavigationevent.onExtraCallback, iAuthTabCallbackOnExtraCallback);
        UnmodifiableIterator it = onnavigationevent.onNavigationEvent.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda0.onNavigationEvent((String) entry.getKey(), (String) entry.getValue());
        }
        SelectionManager_androidKtExternalSyntheticLambda5.onWarmupCompleted onwarmupcompletedIAuthTabCallback = new SelectionManager_androidKtExternalSyntheticLambda5.onWarmupCompleted().onWarmupCompleted(onnavigationevent.IAuthTabCallbackDefault, SelectionRegistrarImplExternalSyntheticLambda2.onExtraCallbackWithResult).onWarmupCompleted(onnavigationevent.IAuthTabCallbackStub).onExtraCallbackWithResult(onnavigationevent.onTransact).IAuthTabCallback(Ints.toArray(onnavigationevent.IAuthTabCallback));
        ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5 = this.onNavigationEvent;
        if (composableSingletonsScaffoldKtExternalSyntheticLambda5 != null) {
            onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult(composableSingletonsScaffoldKtExternalSyntheticLambda5);
        }
        SelectionManager_androidKtExternalSyntheticLambda5 selectionManager_androidKtExternalSyntheticLambda5OnExtraCallback = onwarmupcompletedIAuthTabCallback.onExtraCallback(textFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda0);
        selectionManager_androidKtExternalSyntheticLambda5OnExtraCallback.onNavigationEvent(0, onnavigationevent.onNavigationEvent());
        return selectionManager_androidKtExternalSyntheticLambda5OnExtraCallback;
    }
}
