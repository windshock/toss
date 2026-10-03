package o;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getColorInstance {
    public static final String onNavigationEvent(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, int i) {
        String string;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        FragmentActivity activity = rememberLottieCompositionKtlottieComposition1.getActivity();
        return (activity == null || (string = activity.getString(i)) == null) ? AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(i) : string;
    }

    public static final Bundle IAuthTabCallback(@NotNull Function1<? super TypeUtils7, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        r8lambdaDGwJRW0c6OVy__N1uvoZmVIXJ_U r8lambdadgwjrw0c6ovy__n1uvozmvixj_u = new r8lambdaDGwJRW0c6OVy__N1uvoZmVIXJ_U();
        function1.invoke(r8lambdadgwjrw0c6ovy__n1uvozmvixj_u);
        return r8lambdadgwjrw0c6ovy__n1uvozmvixj_u.onExtraCallback();
    }
}
