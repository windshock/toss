package o;

import android.content.Context;
import im.toss.appsintoss.di.AppsInTossUseCaseModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ExtensionEmbeddingBackendExternalSyntheticLambda0 implements captureStartValues<SplitControllersplitInfoList1ExternalSyntheticLambda0> {
    private static int IAuthTabCallback = 0;
    public static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static int onNavigationEvent;
    private final createAnimators<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            throw null;
        }
        SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        return splitControllersplitInfoList1ExternalSyntheticLambda0OnExtraCallbackWithResult;
    }

    public SplitControllersplitInfoList1ExternalSyntheticLambda0 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43) this.onWarmupCompleted.get());
        int i4 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return splitControllersplitInfoList1ExternalSyntheticLambda0OnWarmupCompleted;
    }

    public static SplitControllersplitInfoList1ExternalSyntheticLambda0 onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0IAuthTabCallbackStub = AppsInTossUseCaseModule.onWarmupCompleted.IAuthTabCallbackStub(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        if (i3 == 0) {
            return (SplitControllersplitInfoList1ExternalSyntheticLambda0) createAnimator.onNavigationEvent(splitControllersplitInfoList1ExternalSyntheticLambda0IAuthTabCallbackStub);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int onExtraCallback() {
        int i = onNavigationEvent;
        int i2 = i % 9820905;
        onNavigationEvent = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        onExtraCallback = i3;
        return i3;
    }
}
