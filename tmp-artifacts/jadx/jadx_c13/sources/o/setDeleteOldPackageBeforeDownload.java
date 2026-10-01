package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setDeleteOldPackageBeforeDownload<U, T extends U> extends ycx4<T> implements Runnable {
    public final long onWarmupCompleted;

    public setDeleteOldPackageBeforeDownload(long j, @NotNull access13800<? super U> access13800Var) {
        super(access13800Var.getContext(), access13800Var);
        this.onWarmupCompleted = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        onWarmupCompleted((Throwable) doGet.IAuthTabCallback(this.onWarmupCompleted, formatMsgs.onExtraCallback(getContext()), this));
    }

    @Override // o.RequestCoordinator, o.setFullPackage
    public String ck_() {
        return super.ck_() + "(timeMillis=" + this.onWarmupCompleted + ')';
    }
}
