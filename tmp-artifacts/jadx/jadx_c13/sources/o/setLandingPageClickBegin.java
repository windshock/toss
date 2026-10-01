package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setLandingPageClickBegin extends setCalculationMethod {
    private final boolean onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLandingPageClickBegin(@NotNull setPreProgressHundred setpreprogresshundred, boolean z) {
        super(setpreprogresshundred);
        Intrinsics.checkNotNullParameter(setpreprogresshundred, "");
        this.onExtraCallback = z;
    }

    @Override // o.setCalculationMethod
    public void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.onExtraCallback) {
            super.onExtraCallback(str);
        } else {
            super.onExtraCallbackWithResult(str);
        }
    }
}
