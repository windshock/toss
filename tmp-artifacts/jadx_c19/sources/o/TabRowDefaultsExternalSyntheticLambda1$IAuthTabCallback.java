package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import o.TabRowDefaultsExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabRowDefaultsExternalSyntheticLambda1$IAuthTabCallback extends TabRowDefaultsExternalSyntheticLambda2.IAuthTabCallback {
    private TabRowDefaultsExternalSyntheticLambda2 IAuthTabCallback;
    private final Intent onExtraCallback;
    private final Context onNavigationEvent;
    private final BroadcastReceiver.PendingResult onTransact;

    TabRowDefaultsExternalSyntheticLambda1$IAuthTabCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.onNavigationEvent = context;
        this.onExtraCallback = intent;
        this.onTransact = pendingResult;
    }

    void onWarmupCompleted(TabRowDefaultsExternalSyntheticLambda2 tabRowDefaultsExternalSyntheticLambda2) {
        this.IAuthTabCallback = tabRowDefaultsExternalSyntheticLambda2;
    }

    public void onWarmupCompleted() {
        new TabRowKtExternalSyntheticLambda11(this.onNavigationEvent, ((TabRowDefaultsExternalSyntheticLambda2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).onExtraCallbackWithResult()).onExtraCallback((KeyEvent) this.onExtraCallback.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        onNavigationEvent();
    }

    public void onExtraCallbackWithResult() {
        onNavigationEvent();
    }

    public void IAuthTabCallback() {
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        ((TabRowDefaultsExternalSyntheticLambda2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).onExtraCallback();
        this.onTransact.finish();
    }
}
