package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import javax.inject.Inject;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.getSegmentCollection;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.core.AppStateManager;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CoroutineWorker implements SidecarAdapterExternalSyntheticLambda2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @Inject
    public CoroutineWorker() {
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda2
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean z = AppStateManager.onExtraCallbackWithResult.onActivityLayout().onExtraCallbackWithResult() instanceof getSegmentCollection.IAuthTabCallback;
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda2
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Function0<Boolean> function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(function0, "");
            AppStateManager.onExtraCallbackWithResult.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function0);
        } else {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(function0, "");
            AppStateManager.onExtraCallbackWithResult.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function0);
            int i3 = 60 / 0;
        }
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda2
    public Activity onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda2
    public getAdUnitIds onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AppStateManager appStateManager = AppStateManager.onExtraCallbackWithResult;
        if (i3 != 0) {
            return appStateManager.IAuthTabCallback_Parcel();
        }
        appStateManager.IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SidecarAdapterExternalSyntheticLambda2
    public void onExtraCallbackWithResult(@NotNull Fragment fragment) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            AppStateManager.onExtraCallbackWithResult.onExtraCallback(fragment);
        } else {
            Intrinsics.checkNotNullParameter(fragment, "");
            AppStateManager.onExtraCallbackWithResult.onExtraCallback(fragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
