package o;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setOval extends getStarImageView<setEraseEnabled<?>> {
    private final AtomicReference<Object> IAuthTabCallback = new AtomicReference<>(null);

    @Override // o.getStarImageView
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NotNull setEraseEnabled<?> seteraseenabled) {
        if (getShowDividerHorizontal.onExtraCallbackWithResult(this.IAuthTabCallback) != null) {
            return false;
        }
        getShowDividerHorizontal.onExtraCallback(this.IAuthTabCallback, setShine.IAuthTabCallback);
        return true;
    }

    @Override // o.getStarImageView
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public access13800<Unit>[] onExtraCallbackWithResult(@NotNull setEraseEnabled<?> seteraseenabled) {
        getShowDividerHorizontal.onExtraCallback(this.IAuthTabCallback, null);
        return setTileModeY.onWarmupCompleted;
    }

    public final void onNavigationEvent() {
        AtomicReference<Object> atomicReference = this.IAuthTabCallback;
        while (true) {
            Object objOnExtraCallbackWithResult = getShowDividerHorizontal.onExtraCallbackWithResult(atomicReference);
            if (objOnExtraCallbackWithResult == null || objOnExtraCallbackWithResult == setShine.onWarmupCompleted) {
                return;
            }
            if (objOnExtraCallbackWithResult == setShine.IAuthTabCallback) {
                if (setSupportImageTintList.onNavigationEvent(this.IAuthTabCallback, objOnExtraCallbackWithResult, setShine.onWarmupCompleted)) {
                    return;
                }
            } else if (setSupportImageTintList.onNavigationEvent(this.IAuthTabCallback, objOnExtraCallbackWithResult, setShine.IAuthTabCallback)) {
                Result.Companion companion = Result.Companion;
                ((setResourceInternal) objOnExtraCallbackWithResult).resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    public final boolean IAuthTabCallback() {
        Object andSet = this.IAuthTabCallback.getAndSet(setShine.IAuthTabCallback);
        Intrinsics.checkNotNull(andSet);
        return andSet == setShine.onWarmupCompleted;
    }

    public final Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        if (!setSupportImageTintList.onNavigationEvent(this.IAuthTabCallback, setShine.IAuthTabCallback, setresourceinternal)) {
            Result.Companion companion = Result.Companion;
            setresourceinternal.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault == access14100.onExtraCallback() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
    }
}
