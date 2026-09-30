package o;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setCommon implements Executor {
    public final GeckoHubImp onExtraCallbackWithResult;

    public setCommon(@NotNull GeckoHubImp geckoHubImp) {
        this.onExtraCallbackWithResult = geckoHubImp;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        GeckoHubImp geckoHubImp = this.onExtraCallbackWithResult;
        access13600 access13600Var = access13600.IAuthTabCallback;
        if (setMaxLine.onWarmupCompleted(geckoHubImp, access13600Var)) {
            setMaxLine.IAuthTabCallback(this.onExtraCallbackWithResult, access13600Var, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.onExtraCallbackWithResult.toString();
    }
}
