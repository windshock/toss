package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class base64Encode implements StreamParsingException {
    private boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private boolean onWarmupCompleted;

    public base64Encode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.onNavigationEvent = str;
    }

    public final String onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public boolean onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public void onNavigationEvent(boolean z) {
        this.onExtraCallbackWithResult = z;
    }

    public boolean IAuthTabCallbackStub() {
        return this.onWarmupCompleted;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.onWarmupCompleted = z;
    }
}
