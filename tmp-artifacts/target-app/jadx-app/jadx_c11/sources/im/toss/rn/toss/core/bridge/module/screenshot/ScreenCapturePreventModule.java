package im.toss.rn.toss.core.bridge.module.screenshot;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import im.toss.base.BaseActivity;
import im.toss.rn.toss.core.bridge.module.screenshot.ScreenCapturePreventModule$;
import kotlin.jvm.internal.Intrinsics;
import o.onAdViewAdDisplayFailed;
import o.setEnabledAmazonAdUnitIds;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ScreenCapturePreventModule extends ReactContextBaseJavaModule {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ void $r8$lambda$v0EWsAKwIzpgyWXx2MKJtj00dTA(ScreenCapturePreventModule screenCapturePreventModule) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        disableSecureScreen$lambda$0(screenCapturePreventModule);
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void $r8$lambda$wmbvHJevJBnHMKlPrR8cTDwb0ZY(ScreenCapturePreventModule screenCapturePreventModule) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        enableSecureScreen$lambda$0(screenCapturePreventModule);
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCapturePreventModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
    }

    private final BaseActivity getActivity() {
        Activity currentActivity;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if ((getReactApplicationContext().getCurrentActivity() instanceof BaseActivity) && (currentActivity = getReactApplicationContext().getCurrentActivity()) != null) {
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (!currentActivity.isFinishing()) {
                int i6 = onNavigationEvent + 103;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                BaseActivity currentActivity2 = getReactApplicationContext().getCurrentActivity();
                Intrinsics.checkNotNull(currentActivity2, "");
                return currentActivity2;
            }
        }
        int i8 = onWarmupCompleted + 117;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "ScreenCapturePreventModule";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 im.toss.base.BaseActivity) = (r1v4 im.toss.base.BaseActivity), (r1v9 im.toss.base.BaseActivity) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @ReactMethod(isBlockingSynchronousMethod = true)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void enableSecureScreen() {
        BaseActivity activity;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            activity = getActivity();
            int i3 = 61 / 0;
            if (activity != null) {
                activity.runOnUiThread(new ScreenCapturePreventModule$.ExternalSyntheticLambda0(this));
            }
        } else {
            activity = getActivity();
            if (activity != null) {
            }
        }
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void enableSecureScreen$lambda$0(ScreenCapturePreventModule screenCapturePreventModule) {
        int i = 2 % 2;
        BaseActivity activity = screenCapturePreventModule.getActivity();
        if (activity != null) {
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1566333150, new Object[]{activity, setEnabledAmazonAdUnitIds.SECURE}, -1566333132, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            } else {
                BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1566333150, new Object[]{activity, setEnabledAmazonAdUnitIds.SECURE}, -1566333132, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                throw null;
            }
        }
        BaseActivity activity2 = screenCapturePreventModule.getActivity();
        if (activity2 != null) {
            int i3 = onNavigationEvent + 51;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            activity2.newSession();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final void disableSecureScreen() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            getActivity();
            throw null;
        }
        BaseActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new ScreenCapturePreventModule$.ExternalSyntheticLambda1(this));
        }
        int i3 = onNavigationEvent + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void disableSecureScreen$lambda$0(ScreenCapturePreventModule screenCapturePreventModule) {
        int i = 2 % 2;
        BaseActivity activity = screenCapturePreventModule.getActivity();
        if (activity != null) {
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1566333150, new Object[]{activity, setEnabledAmazonAdUnitIds.NON_SECURE}, -1566333132, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
                int i3 = 29 / 0;
            } else {
                BaseActivity.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1566333150, new Object[]{activity, setEnabledAmazonAdUnitIds.NON_SECURE}, -1566333132, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            }
        }
        BaseActivity activity2 = screenCapturePreventModule.getActivity();
        if (activity2 != null) {
            activity2.newSession();
            int i4 = onNavigationEvent + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
