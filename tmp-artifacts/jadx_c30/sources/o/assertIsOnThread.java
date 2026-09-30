package o;

import androidx.fragment.app.Fragment;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class assertIsOnThread {

    public static final class onExtraCallback extends FlowMeasureLazyPolicyExternalSyntheticLambda3.onWarmupCompleted {
        final /* synthetic */ Fragment onNavigationEvent;
        final /* synthetic */ Function0<Unit> onWarmupCompleted;

        onExtraCallback(Fragment fragment, Function0<Unit> function0) {
            this.onNavigationEvent = fragment;
            this.onWarmupCompleted = function0;
        }

        public void onExtraCallback(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, Fragment fragment) {
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(fragment, BuildConfig.FLAVOR);
            if (fragment == this.onNavigationEvent) {
                this.onWarmupCompleted.invoke();
            }
        }

        public void onWarmupCompleted(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, Fragment fragment) {
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(fragment, BuildConfig.FLAVOR);
            if (fragment == this.onNavigationEvent) {
                this.onWarmupCompleted.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageQueueThreadImpl onNavigationEvent(Fragment fragment, Function0<Unit> function0) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(fragment.getParentFragmentManager());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3 = (FlowMeasureLazyPolicyExternalSyntheticLambda3) obj;
        if (flowMeasureLazyPolicyExternalSyntheticLambda3 == null) {
            return null;
        }
        onExtraCallback onextracallback = new onExtraCallback(fragment, function0);
        flowMeasureLazyPolicyExternalSyntheticLambda3.onNavigationEvent(onextracallback, false);
        return new MessageQueueThreadImpl(flowMeasureLazyPolicyExternalSyntheticLambda3, onextracallback);
    }
}
