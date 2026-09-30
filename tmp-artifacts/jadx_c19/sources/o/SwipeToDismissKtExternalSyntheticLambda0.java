package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import o.SwipeToDismissKtExternalSyntheticLambda6;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SwipeToDismissKtExternalSyntheticLambda0 extends SwipeToDismissKtExternalSyntheticLambda6 {
    private onExtraCallback onExtraCallbackWithResult;

    public interface onNavigationEvent extends SwipeToDismissKtExternalSyntheticLambda6.onNavigationEvent {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public onExtraCallback IAuthTabCallback(Context context, TabKtExternalSyntheticLambda3 tabKtExternalSyntheticLambda3, Bundle bundle, Looper looper, @Nullable LegacyTextInputMethodRequestExternalSyntheticLambda2 legacyTextInputMethodRequestExternalSyntheticLambda2, long j) {
        SwipeToDismissKtExternalSyntheticLambda3 swipeToDismissKtExternalSyntheticLambda2;
        if (tabKtExternalSyntheticLambda3.onTransact()) {
            swipeToDismissKtExternalSyntheticLambda2 = new SwipeToDismissKtExternalSyntheticLambda3(context, this, tabKtExternalSyntheticLambda3, bundle, looper, (LegacyTextInputMethodRequestExternalSyntheticLambda2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(legacyTextInputMethodRequestExternalSyntheticLambda2), j);
        } else {
            swipeToDismissKtExternalSyntheticLambda2 = new SwipeToDismissKtExternalSyntheticLambda2(context, this, tabKtExternalSyntheticLambda3, bundle, looper);
        }
        this.onExtraCallbackWithResult = swipeToDismissKtExternalSyntheticLambda2;
        return swipeToDismissKtExternalSyntheticLambda2;
    }

    void onExtraCallback(final TextFieldDecoratorModifierNodeExternalSyntheticLambda10<onNavigationEvent> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        final onNavigationEvent onnavigationevent = (onNavigationEvent) ((SwipeToDismissKtExternalSyntheticLambda6) this).onExtraCallback;
        if (onnavigationevent != null) {
            Object[] objArr = {((SwipeToDismissKtExternalSyntheticLambda6) this).IAuthTabCallback, new Runnable() { // from class: androidx.media3.session.MediaBrowser$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(onnavigationevent);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }
}
