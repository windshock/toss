package o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import im.toss.features.home.ui.dst.R;
import im.toss.features.home.ui.dst.view.home.HomeFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getMainPackage extends addPackage implements setBitmapDecoderClass {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = IAuthTabCallback + 47;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = (i3 % 2 != 0 ? 0 : 1) ^ 1;
        int i5 = i2 + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public Fragment onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public int onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public getMainPackage() {
        super(R.layout.home_fragment_launcher_host);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Map mapOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            getChildFragmentManager().findFragmentByTag("home_launcher_home_fragment");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().findFragmentByTag("home_launcher_home_fragment") == null) {
            FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = childFragmentManager.onExtraCallbackWithResult();
            Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult, "");
            int i3 = R.id.launcherHostContainer;
            HomeFragment homeFragment = new HomeFragment();
            FragmentActivity activity = homeFragment.getActivity();
            if (activity != null) {
                int i4 = onNavigationEvent + 7;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Intent intent = activity.getIntent();
                if (intent != null) {
                    int i6 = onExtraCallback + 39;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    Uri data = intent.getData();
                    if (data != null) {
                        int i8 = onNavigationEvent + 73;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        mapOnNavigationEvent = zzcr.onExtraCallbackWithResult(data);
                    } else {
                        mapOnNavigationEvent = null;
                    }
                }
            }
            if (mapOnNavigationEvent == null) {
                mapOnNavigationEvent = access8100.onNavigationEvent();
            }
            Bundle bundleOnExtraCallbackWithResult = zzbf.onExtraCallbackWithResult(mapOnNavigationEvent, (Bundle) null, 1, (Object) null);
            bundleOnExtraCallbackWithResult.putBoolean("from_home_launcher", true);
            homeFragment.setArguments(bundleOnExtraCallbackWithResult);
            Unit unit = Unit.INSTANCE;
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(i3, homeFragment, "home_launcher_home_fragment");
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback();
        }
    }
}
