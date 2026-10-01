package o;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import im.toss.features.main.ui.MainTabFragment;
import im.toss.features.main.ui.tab.MainTabFragmentProvider$;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface ExtHubPage {
    static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        return onNavigationEvent(setDetectableSize);
    }

    Fragment onExtraCallbackWithResult(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, int i, @Nullable Bundle bundle, @Nullable Integer num);

    private static Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("ui_type", !(addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted) ^ true) ? "topB" : "standard");
        return Unit.INSTANCE;
    }

    default Fragment onExtraCallback(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NotNull String str, @Nullable Bundle bundle, @Nullable Integer num) {
        Uri uriIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (bundle == null || (uriIAuthTabCallback = MainTabFragment.Companion.IAuthTabCallback(bundle)) == null) {
            uriIAuthTabCallback = Uri.EMPTY;
        }
        String queryParameter = uriIAuthTabCallback.getQueryParameter("referrer");
        if (queryParameter == null) {
            queryParameter = "all_tab";
        }
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("referrer", queryParameter), getWrite.IAuthTabCallback("fromMainTab", Boolean.TRUE)});
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1239001L, false, (String) null, (Map) null, new MainTabFragmentProvider$.ExternalSyntheticLambda0(), 14, (Object) null);
        return onRenderReady.IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, bundleOnNavigationEvent, str);
    }
}
