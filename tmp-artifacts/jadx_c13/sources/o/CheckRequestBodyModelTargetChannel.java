package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CheckRequestBodyModelTargetChannel {
    public static final ComponentModela onWarmupCompleted(@NotNull ExecutorService executorService) {
        return new ComponentModel(executorService);
    }

    public static final GeckoHubImp onExtraCallback(@NotNull Executor executor) {
        GeckoHubImp geckoHubImp;
        setCommon setcommon = executor instanceof setCommon ? (setCommon) executor : null;
        return (setcommon == null || (geckoHubImp = setcommon.onExtraCallbackWithResult) == null) ? new ComponentModel(executor) : geckoHubImp;
    }

    public static final Executor onWarmupCompleted(@NotNull GeckoHubImp geckoHubImp) {
        Executor executorOnExtraCallbackWithResult;
        ComponentModela componentModela = geckoHubImp instanceof ComponentModela ? (ComponentModela) geckoHubImp : null;
        return (componentModela == null || (executorOnExtraCallbackWithResult = componentModela.onExtraCallbackWithResult()) == null) ? new setCommon(geckoHubImp) : executorOnExtraCallbackWithResult;
    }
}
