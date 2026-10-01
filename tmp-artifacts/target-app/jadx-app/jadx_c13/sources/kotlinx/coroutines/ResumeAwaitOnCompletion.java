package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import o.ILoader;
import o.isPatchUpdate;
import o.setChannelIndex;
import o.setResourceInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResumeAwaitOnCompletion<T> extends isPatchUpdate {
    private final setResourceInternal<T> onExtraCallback;

    @Override // o.isPatchUpdate
    public boolean onExtraCallback() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeAwaitOnCompletion(@NotNull setResourceInternal<? super T> setresourceinternal) {
        this.onExtraCallback = setresourceinternal;
    }

    @Override // o.isPatchUpdate
    public void onWarmupCompleted(@Nullable Throwable th) {
        Object objCq_ = IAuthTabCallback().cq_();
        if (objCq_ instanceof ILoader) {
            setResourceInternal<T> setresourceinternal = this.onExtraCallback;
            Result.Companion companion = Result.Companion;
            setresourceinternal.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(((ILoader) objCq_).IAuthTabCallback)));
        } else {
            setResourceInternal<T> setresourceinternal2 = this.onExtraCallback;
            Result.Companion companion2 = Result.Companion;
            setresourceinternal2.resumeWith(Result.m31constructorimpl(setChannelIndex.IAuthTabCallback(objCq_)));
        }
    }
}
