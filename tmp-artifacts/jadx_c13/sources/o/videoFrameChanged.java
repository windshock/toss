package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class videoFrameChanged {
    public static /* synthetic */ wie2 onWarmupCompleted(wie2 wie2Var, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            wie2Var = wie2.Default;
        }
        return onWarmupCompleted(wie2Var, function1);
    }

    public static final wie2 onWarmupCompleted(@NotNull wie2 wie2Var, @NotNull Function1<? super adInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(function1, "");
        adInfo adinfo = new adInfo(wie2Var);
        function1.invoke(adinfo);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return new requestPauseVideo((changeVideoState) adInfo.onExtraCallbackWithResult(181802516, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, -181802516, new Object[]{adinfo}, iOnExtraCallback2, iOnExtraCallback), adinfo.onExtraCallback());
    }
}
