package im.toss.rn.toss.core.observability;

import androidx.fragment.app.Fragment;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeRouteLcpSessionManager$callbacks$1 extends FlowMeasureLazyPolicyExternalSyntheticLambda3.onWarmupCompleted {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    final /* synthetic */ ReactNativeRouteLcpSessionManager IAuthTabCallback;

    public static /* synthetic */ void onExtraCallback(Fragment fragment, ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager, Screen screen) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(fragment, reactNativeRouteLcpSessionManager, screen);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = onExtraCallbackWithResult + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
    }

    ReactNativeRouteLcpSessionManager$callbacks$1(ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager) {
        this.IAuthTabCallback = reactNativeRouteLcpSessionManager;
    }

    public void IAuthTabCallback(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, final Fragment fragment) throws NoWhenBranchMatchedException {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        if (!(fragment instanceof ScreenFragment) || ReactNativeRouteLcpSessionManager.onWarmupCompleted(this.IAuthTabCallback).contains(fragment)) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(((ScreenFragment) fragment).getScreen());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            obj = null;
        }
        final Screen screen = (Screen) obj;
        if (screen == null) {
            return;
        }
        String screenId = screen.getScreenId();
        if (screenId != null) {
            int i3 = onExtraCallbackWithResult + 55;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (screenId.length() != 0) {
                ReactNativeRouteLcpSessionManager.onWarmupCompleted(this.IAuthTabCallback, (ScreenFragment) fragment, screen);
                return;
            }
        }
        final ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager = this.IAuthTabCallback;
        screen.post(new Runnable() { // from class: im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager$callbacks$1$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // java.lang.Runnable
            public final void run() throws NoWhenBranchMatchedException {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 27;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                ReactNativeRouteLcpSessionManager$callbacks$1.onExtraCallback(fragment, reactNativeRouteLcpSessionManager, screen);
                int i8 = onExtraCallback + 47;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i5 = onExtraCallbackWithResult + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
    }

    private static final void IAuthTabCallback(Fragment fragment, ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager, Screen screen) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        ScreenFragment screenFragment = (ScreenFragment) fragment;
        if (screenFragment.isResumed()) {
            int i2 = onExtraCallbackWithResult + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!ReactNativeRouteLcpSessionManager.onWarmupCompleted(reactNativeRouteLcpSessionManager).contains(fragment)) {
                int i4 = onExtraCallbackWithResult + 111;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                ReactNativeRouteLcpSessionManager.onWarmupCompleted(reactNativeRouteLcpSessionManager, screenFragment, screen);
                if (i5 != 0) {
                    int i6 = 9 / 0;
                }
            }
        }
    }

    public void onTransact(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, Fragment fragment) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        ReactNativeRouteLcpSessionManager.onWarmupCompleted(this.IAuthTabCallback, fragment, "screen_stop");
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void IAuthTabCallbackDefault(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, Fragment fragment) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            ReactNativeRouteLcpSessionManager.onWarmupCompleted(this.IAuthTabCallback, fragment, "screen_exit");
            int i3 = 67 / 0;
        } else {
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            ReactNativeRouteLcpSessionManager.onWarmupCompleted(this.IAuthTabCallback, fragment, "screen_exit");
        }
        int i4 = onExtraCallbackWithResult + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallback(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, Fragment fragment) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            ReactNativeRouteLcpSessionManager.onWarmupCompleted(this.IAuthTabCallback, fragment, "screen_exit");
            ReactNativeRouteLcpSessionManager.onExtraCallback(this.IAuthTabCallback).IAuthTabCallback(fragment);
            return;
        }
        Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        ReactNativeRouteLcpSessionManager.onWarmupCompleted(this.IAuthTabCallback, fragment, "screen_exit");
        ReactNativeRouteLcpSessionManager.onExtraCallback(this.IAuthTabCallback).IAuthTabCallback(fragment);
        throw null;
    }
}
