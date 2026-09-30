package o;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.common.LifecycleState;
import im.toss.rn.spec.ReactAutoLinkedPackageList;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hExternalSyntheticLambda3 {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final ArrayList<ReactPackage> onExtraCallback;
    private final r8lambda87fRNsORQVq76SotLLUbTbiqM onExtraCallbackWithResult;
    private final ebExternalSyntheticLambda0 onNavigationEvent;
    private final ReactPackage onWarmupCompleted;

    @Deprecated
    public interface onWarmupCompleted {
        hExternalSyntheticLambda3 IAuthTabCallback(@NotNull ReactPackage reactPackage);
    }

    static {
        int i = onTransact + 7;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public hExternalSyntheticLambda3(@ReactAutoLinkedPackageList @NotNull ArrayList<ReactPackage> arrayList, @NotNull ReactPackage reactPackage, @NotNull ebExternalSyntheticLambda0 ebexternalsyntheticlambda0, @NotNull r8lambda87fRNsORQVq76SotLLUbTbiqM r8lambda87frnsorqvq76sotllubtbiqm) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(reactPackage, "");
        Intrinsics.checkNotNullParameter(ebexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(r8lambda87frnsorqvq76sotllubtbiqm, "");
        this.onExtraCallback = arrayList;
        this.onWarmupCompleted = reactPackage;
        this.onNavigationEvent = ebexternalsyntheticlambda0;
        this.onExtraCallbackWithResult = r8lambda87frnsorqvq76sotllubtbiqm;
    }

    public final ReactInstanceManager onExtraCallbackWithResult(@NotNull TossReactContentOwner tossReactContentOwner, @NotNull JSBundleLoader jSBundleLoader, @NotNull JSExceptionHandler jSExceptionHandler, boolean z) {
        Application application;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossReactContentOwner, "");
        Intrinsics.checkNotNullParameter(jSBundleLoader, "");
        Intrinsics.checkNotNullParameter(jSExceptionHandler, "");
        FragmentActivity activity = tossReactContentOwner.getActivity();
        if (activity != null) {
            application = activity.getApplication();
        } else {
            int i2 = IAuthTabCallbackStub + 27;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            application = null;
        }
        ReactInstanceManagerBuilder reactInstanceManagerBuilderIAuthTabCallback = ReactInstanceManager.IAuthTabCallback();
        Intrinsics.checkNotNull(application);
        ReactInstanceManagerBuilder reactInstanceManagerBuilderOnWarmupCompleted = reactInstanceManagerBuilderIAuthTabCallback.onExtraCallbackWithResult(application).onWarmupCompleted(new SplashScreenImplExternalSyntheticLambda1());
        FragmentActivity activity2 = tossReactContentOwner.getActivity();
        Intrinsics.checkNotNull(activity2);
        ReactInstanceManagerBuilder reactInstanceManagerBuilderOnWarmupCompleted2 = reactInstanceManagerBuilderOnWarmupCompleted.onNavigationEvent(activity2).onExtraCallback(this.onExtraCallback).onWarmupCompleted(this.onWarmupCompleted).IAuthTabCallback(LifecycleState.RESUMED).onWarmupCompleted(tossReactContentOwner);
        if (zzaj.onNavigationEvent().onActivityLayout() && !z) {
            reactInstanceManagerBuilderOnWarmupCompleted2.onNavigationEvent(jSExceptionHandler);
            int i4 = IAuthTabCallbackStub + 25;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!IAuthTabCallback) {
            int i6 = IAuthTabCallbackStub + 121;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            this.onExtraCallbackWithResult.IAuthTabCallback(CommonModule_setSecureScreen.onWarmupCompleted.onExtraCallbackWithResult(application));
            IAuthTabCallback = true;
        }
        if (z) {
            reactInstanceManagerBuilderOnWarmupCompleted2.IAuthTabCallback("index").IAuthTabCallback(true);
        } else {
            reactInstanceManagerBuilderOnWarmupCompleted2.onWarmupCompleted(jSBundleLoader);
        }
        return reactInstanceManagerBuilderOnWarmupCompleted2.onWarmupCompleted();
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
