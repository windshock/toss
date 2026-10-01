package o;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRubIn extends getStarImageView<getMaxCornerRadius<?>> {
    public access13800<? super Unit> onExtraCallbackWithResult;
    public long onWarmupCompleted = -1;

    @Override // o.getStarImageView
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NotNull getMaxCornerRadius<?> getmaxcornerradius) {
        if (this.onWarmupCompleted >= 0) {
            return false;
        }
        this.onWarmupCompleted = getmaxcornerradius.onTransact();
        return true;
    }

    @Override // o.getStarImageView
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public access13800<Unit>[] onExtraCallbackWithResult(@NotNull getMaxCornerRadius<?> getmaxcornerradius) {
        long j = this.onWarmupCompleted;
        this.onWarmupCompleted = -1L;
        this.onExtraCallbackWithResult = null;
        return getmaxcornerradius.IAuthTabCallback(j);
    }
}
