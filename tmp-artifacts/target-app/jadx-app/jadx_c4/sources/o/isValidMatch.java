package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isValidMatch {
    private final boolean onExtraCallback;
    private TextLinkScopeExternalSyntheticLambda7 onExtraCallbackWithResult;
    private AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onNavigationEvent;

    public isValidMatch(@Nullable AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
        this.onExtraCallback = androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 == null;
        this.onNavigationEvent = androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
    }

    public void onNavigationEvent() {
        this.onNavigationEvent = null;
    }

    public void onExtraCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) {
        if (this.onExtraCallbackWithResult != null) {
            return;
        }
        this.onNavigationEvent = androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
    }

    public boolean onExtraCallback() {
        return this.onExtraCallbackWithResult == null && this.onNavigationEvent == null;
    }
}
