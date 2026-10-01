package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextFieldKtExternalSyntheticLambda5 {
    private final String onNavigationEvent;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final BasicTextFieldKtExternalSyntheticLambda5 IAuthTabCallback = new BasicTextFieldKtExternalSyntheticLambda5("serif");
    private static final BasicTextFieldKtExternalSyntheticLambda5 onExtraCallbackWithResult = new BasicTextFieldKtExternalSyntheticLambda5("sans-serif");
    private static final BasicTextFieldKtExternalSyntheticLambda5 onWarmupCompleted = new BasicTextFieldKtExternalSyntheticLambda5("monospace");
    private static final BasicTextFieldKtExternalSyntheticLambda5 onExtraCallback = new BasicTextFieldKtExternalSyntheticLambda5("cursive");

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public BasicTextFieldKtExternalSyntheticLambda5(@NotNull String str) {
        this.onNavigationEvent = str;
    }

    public final String onExtraCallback() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return this.onNavigationEvent;
    }
}
