package o;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import im.toss.features.main.ui.MainTabFragment;
import im.toss.features.setting.AppSettingFragment;
import im.toss.features.visitor.home.VisitorGuideFragment;
import im.toss.features.visitor.home.VisitorHomeFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readData implements ExtHubPage {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @Override // o.ExtHubPage
    public /* bridge */ Fragment onExtraCallback(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NotNull String str, @Nullable Bundle bundle, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragmentOnExtraCallback = super.onExtraCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, str, bundle, num);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = onExtraCallback + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return fragmentOnExtraCallback;
    }

    @Override // o.ExtHubPage
    public Fragment onExtraCallbackWithResult(@NotNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, int i, @Nullable Bundle bundle, @Nullable Integer num) {
        Uri uriIAuthTabCallback;
        Uri uriIAuthTabCallback2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        if (i == 8) {
            if (bundle == null || (uriIAuthTabCallback = MainTabFragment.Companion.IAuthTabCallback(bundle)) == null) {
                uriIAuthTabCallback = Uri.EMPTY;
            }
            VisitorHomeFragment.onExtraCallbackWithResult onextracallbackwithresult = VisitorHomeFragment.Companion;
            Intrinsics.checkNotNull(uriIAuthTabCallback);
            Bundle bundleOnNavigationEvent = onextracallbackwithresult.onNavigationEvent(uriIAuthTabCallback);
            VisitorHomeFragment visitorHomeFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), VisitorHomeFragment.class.getName());
            if (visitorHomeFragmentInstantiate == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.features.visitor.home.VisitorHomeFragment");
            }
            VisitorHomeFragment visitorHomeFragment = visitorHomeFragmentInstantiate;
            if (bundleOnNavigationEvent != null) {
                int i5 = onWarmupCompleted + 43;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                visitorHomeFragment.setArguments(bundleOnNavigationEvent);
            }
            return visitorHomeFragment;
        }
        int i7 = onExtraCallback + 37;
        int i8 = i7 % 128;
        onWarmupCompleted = i8;
        if (i7 % 2 != 0 ? i == 20 : i == 112) {
            AppSettingFragment appSettingFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), AppSettingFragment.class.getName());
            if (appSettingFragmentInstantiate != null) {
                return appSettingFragmentInstantiate;
            }
            throw new NullPointerException("null cannot be cast to non-null type im.toss.features.setting.AppSettingFragment");
        }
        int i9 = i8 + 49;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0 ? i != 53 : i != 124) {
            return null;
        }
        if (bundle == null || (uriIAuthTabCallback2 = MainTabFragment.Companion.IAuthTabCallback(bundle)) == null) {
            uriIAuthTabCallback2 = Uri.EMPTY;
        }
        VisitorGuideFragment.onExtraCallbackWithResult onextracallbackwithresult2 = VisitorGuideFragment.Companion;
        Intrinsics.checkNotNull(uriIAuthTabCallback2);
        Bundle bundleOnWarmupCompleted = onextracallbackwithresult2.onWarmupCompleted(uriIAuthTabCallback2);
        VisitorGuideFragment visitorGuideFragmentInstantiate = flowMeasureLazyPolicyExternalSyntheticLambda3.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), VisitorGuideFragment.class.getName());
        if (visitorGuideFragmentInstantiate == null) {
            throw new NullPointerException("null cannot be cast to non-null type im.toss.features.visitor.home.VisitorGuideFragment");
        }
        VisitorGuideFragment visitorGuideFragment = visitorGuideFragmentInstantiate;
        if (bundleOnWarmupCompleted != null) {
            int i10 = onWarmupCompleted + 91;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                visitorGuideFragment.setArguments(bundleOnWarmupCompleted);
                throw null;
            }
            visitorGuideFragment.setArguments(bundleOnWarmupCompleted);
        }
        return visitorGuideFragment;
    }
}
