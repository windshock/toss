package kotlinx.coroutines;

import kotlin.Result;
import kotlin.Unit;
import o.access13800;
import o.isPatchUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResumeOnCompletion extends isPatchUpdate {
    private final access13800<Unit> onExtraCallback;

    @Override // o.isPatchUpdate
    public boolean onExtraCallback() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeOnCompletion(@NotNull access13800<? super Unit> access13800Var) {
        this.onExtraCallback = access13800Var;
    }

    @Override // o.isPatchUpdate
    public void onWarmupCompleted(@Nullable Throwable th) {
        access13800<Unit> access13800Var = this.onExtraCallback;
        Result.Companion companion = Result.Companion;
        access13800Var.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
    }
}
