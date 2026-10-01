package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getArbitrageLoadingView extends getLandingPageClickBegin {
    public static final getArbitrageLoadingView IAuthTabCallback = new getArbitrageLoadingView();

    private getArbitrageLoadingView() {
    }

    public final char[] onNavigationEvent() {
        return super.onExtraCallback(Http2.INITIAL_MAX_FRAME_SIZE);
    }

    public final void IAuthTabCallback(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        if (cArr.length != 16384) {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
        }
        onNavigationEvent(cArr);
    }
}
