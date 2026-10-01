package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import im.toss.base.BaseFragment;
import im.toss.features.password.api.annotation.RequiresAuth;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.MotionDetectFragment;
import viva.republica.toss.main.update.UpdateGuideActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ConfigurationBuilderExternalSyntheticLambda0 implements SidecarCompatTranslatingCallback {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @Inject
    public ConfigurationBuilderExternalSyntheticLambda0() {
    }

    @Override // o.SidecarCompatTranslatingCallback
    public void onWarmupCompleted(@NotNull Context context, @NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        AttributeCertificate.onWarmupCompleted.onNavigationEvent(context, intent);
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    @Override // o.SidecarCompatTranslatingCallback
    public boolean onNavigationEvent(@NotNull Activity activity) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        boolean zOnWarmupCompleted = transparentBackground.onWarmupCompleted(activity);
        int i4 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public boolean onNavigationEvent(@NotNull Annotation annotation) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(annotation, "");
        boolean z = annotation instanceof DERTaggedObject;
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public boolean onExtraCallbackWithResult(@NotNull Annotation annotation) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(annotation, "");
        boolean z = annotation instanceof RequiresAuth;
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public boolean onNavigationEvent(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @Nullable View view) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        boolean zOnWarmupCompleted = transparentBackground.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, view);
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public void onNavigationEvent(@NotNull Activity activity, @NotNull Throwable th, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_ERROR", (Serializable) CxxInspectorPackagerConnectionDelegateImplconnectWebSocketwebSocket1ExternalSyntheticLambda2.onNavigationEvent.IAuthTabCallback(th));
        if (bundle != null) {
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            intent.putExtras(bundle);
        }
        activity.setResult(500, intent);
        activity.finish();
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public void onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        new H5TinyPopMenu(context).onNavigationEvent();
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public boolean onExtraCallback(@NotNull Fragment fragment) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        boolean z = fragment instanceof MotionDetectFragment;
        int i4 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public boolean IAuthTabCallback(@NotNull Fragment fragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        BaseFragment baseFragment = null;
        if (fragment instanceof BaseFragment) {
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            baseFragment = (BaseFragment) fragment;
        }
        if (baseFragment == null) {
            return false;
        }
        int i3 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return baseFragment.isVisibleToUser();
        }
        int i4 = 27 / 0;
        return baseFragment.isVisibleToUser();
    }

    @Override // o.SidecarCompatTranslatingCallback
    public void onWarmupCompleted(@NotNull Fragment fragment, @NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        ((MotionDetectFragment) fragment).onExtraCallback(motionEvent);
        int i4 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SidecarCompatTranslatingCallback
    public void onWarmupCompleted(@NotNull Activity activity, @Nullable setMediationProvider setmediationprovider) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        getNavigationBar.IAuthTabCallback(UpdateGuideActivity.Companion.IAuthTabCallback(activity, setmediationprovider), activity);
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
