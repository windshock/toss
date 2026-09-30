package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class isPatchUpdate extends jw1 implements setDeployments, UpdatePackage {
    public setFullPackage IAuthTabCallback;

    @Override // o.UpdatePackage
    public UpdatePackageFileType cf_() {
        return null;
    }

    @Override // o.UpdatePackage
    public boolean cg_() {
        return true;
    }

    public abstract boolean onExtraCallback();

    public abstract void onWarmupCompleted(@Nullable Throwable th);

    public final setFullPackage IAuthTabCallback() {
        setFullPackage setfullpackage = this.IAuthTabCallback;
        if (setfullpackage != null) {
            return setfullpackage;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull setFullPackage setfullpackage) {
        this.IAuthTabCallback = setfullpackage;
    }

    @Override // o.setDeployments
    public void dispose() {
        IAuthTabCallback().IAuthTabCallback(this);
    }

    @Override // o.jw1
    public String toString() {
        return getResCount.IAuthTabCallback(this) + '@' + getResCount.onExtraCallbackWithResult(this) + "[job@" + getResCount.onExtraCallbackWithResult(IAuthTabCallback()) + ']';
    }
}
