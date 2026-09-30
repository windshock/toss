package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class runOnUiThread<T extends View> extends setCreativeDebuggerEnabled<AppLovinSdkConfigurationConsentDialogState> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final T onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public runOnUiThread(@NotNull AppLovinSdkConfigurationConsentDialogState appLovinSdkConfigurationConsentDialogState, @NotNull T t) {
        super(appLovinSdkConfigurationConsentDialogState);
        Intrinsics.checkNotNullParameter(appLovinSdkConfigurationConsentDialogState, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.onWarmupCompleted = t;
    }

    public final T onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        T t = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return t;
    }
}
