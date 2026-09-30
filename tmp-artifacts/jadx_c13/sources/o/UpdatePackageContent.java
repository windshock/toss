package o;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UpdatePackageContent extends AbstractCoroutineContextElement implements getPackageType {
    public static final UpdatePackageContent onExtraCallback = new UpdatePackageContent();

    @Override // o.getPackageType
    public boolean IAuthTabCallbackStubProxy() {
        return false;
    }

    @Override // o.getPackageType
    @Deprecated
    public boolean IAuthTabCallback_Parcel() {
        return false;
    }

    @Override // o.getPackageType
    public boolean access000() {
        return false;
    }

    @Override // o.getPackageType
    public boolean onExtraCallback() {
        return true;
    }

    @Override // o.getPackageType
    @Deprecated
    public void onNavigationEvent(@Nullable CancellationException cancellationException) {
    }

    private UpdatePackageContent() {
        super(getPackageType.onNavigationEvent);
    }

    @Override // o.getPackageType
    @Deprecated
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // o.getPackageType
    public jni_YGNodeStyleGetAlignContentJNI IAuthTabCallbackDefault() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // o.getPackageType
    @Deprecated
    public CancellationException asBinder() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // o.getPackageType
    @Deprecated
    public setDeployments onExtraCallback(@NotNull Function1<? super Throwable, Unit> function1) {
        return setStrategy.onNavigationEvent;
    }

    @Override // o.getPackageType
    @Deprecated
    public setDeployments onWarmupCompleted(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        return setStrategy.onNavigationEvent;
    }

    @Override // o.getPackageType
    public Sequence<getPackageType> cm_() {
        return clearSelinuxLabel.onExtraCallback();
    }

    @Override // o.getPackageType
    @Deprecated
    public resumeMyRequest onExtraCallbackWithResult(@NotNull removeCallback removecallback) {
        return setStrategy.onNavigationEvent;
    }

    public String toString() {
        return "NonCancellable";
    }
}
