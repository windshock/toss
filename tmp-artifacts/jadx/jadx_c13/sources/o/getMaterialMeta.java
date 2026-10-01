package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getMaterialMeta extends getLandingPageClickEnd {
    public static final getMaterialMeta onExtraCallbackWithResult = new getMaterialMeta();

    private getMaterialMeta() {
    }

    public final byte[] onExtraCallbackWithResult() {
        return super.onNavigationEvent(8196);
    }

    public final void onNavigationEvent(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        IAuthTabCallback(bArr);
    }
}
