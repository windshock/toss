package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BigIntegers implements StreamParsingException {
    private boolean IAuthTabCallback;
    private final String onExtraCallback;
    private final String onNavigationEvent;
    private boolean onWarmupCompleted;

    public BigIntegers(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.onNavigationEvent = str;
        this.onExtraCallback = str2;
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public boolean onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public void onNavigationEvent(boolean z) {
        this.onWarmupCompleted = z;
    }

    public boolean IAuthTabCallbackStub() {
        return this.IAuthTabCallback;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.IAuthTabCallback = z;
    }
}
