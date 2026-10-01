package kotlinx.coroutines.reactive;

import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.CloseableUtils;
import o.access13800;
import o.access14100;
import o.lt;
import o.lud;
import o.nLockFileSegment;
import o.ycxExternalSyntheticLambda0;
import o.ycxExternalSyntheticLambda1;
import o.zb;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactiveSubscriber<T> implements ycxExternalSyntheticLambda0<T> {
    private final nLockFileSegment<T> onExtraCallback;
    private final long onExtraCallbackWithResult;
    private ycxExternalSyntheticLambda1 onNavigationEvent;

    public ReactiveSubscriber(int i, @NotNull CloseableUtils closeableUtils, long j) {
        this.onExtraCallbackWithResult = j;
        this.onExtraCallback = zb.onExtraCallbackWithResult(i == 0 ? 1 : i, closeableUtils, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull access13800<? super T> access13800Var) throws Throwable {
        ReactiveSubscriber$takeNextOrNull$1 reactiveSubscriber$takeNextOrNull$1;
        Object objIAuthTabCallback;
        if (access13800Var instanceof ReactiveSubscriber$takeNextOrNull$1) {
            reactiveSubscriber$takeNextOrNull$1 = (ReactiveSubscriber$takeNextOrNull$1) access13800Var;
            int i = reactiveSubscriber$takeNextOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reactiveSubscriber$takeNextOrNull$1.label = i - 2147483648;
            } else {
                reactiveSubscriber$takeNextOrNull$1 = new ReactiveSubscriber$takeNextOrNull$1(this, access13800Var);
            }
        }
        Object obj = reactiveSubscriber$takeNextOrNull$1.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = reactiveSubscriber$takeNextOrNull$1.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            nLockFileSegment<T> nlockfilesegment = this.onExtraCallback;
            reactiveSubscriber$takeNextOrNull$1.label = 1;
            objIAuthTabCallback = nlockfilesegment.IAuthTabCallback(reactiveSubscriber$takeNextOrNull$1);
            if (objIAuthTabCallback == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = ((lud) obj).onExtraCallback();
        }
        Throwable thOnWarmupCompleted = lud.onWarmupCompleted(objIAuthTabCallback);
        if (thOnWarmupCompleted != null) {
            throw thOnWarmupCompleted;
        }
        if (!(objIAuthTabCallback instanceof lud.onExtraCallback)) {
            return objIAuthTabCallback;
        }
        lud.onWarmupCompleted(objIAuthTabCallback);
        return null;
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(@NotNull T t) {
        if (lud.asInterface(this.onExtraCallback.IAuthTabCallback((nLockFileSegment<T>) t))) {
            return;
        }
        throw new IllegalArgumentException(("Element " + t + " was not added to channel because it was full, " + this.onExtraCallback).toString());
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        lt.onWarmupCompleted.onExtraCallbackWithResult(this.onExtraCallback, null, 1, null);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(@Nullable Throwable th) {
        this.onExtraCallback.onExtraCallback(th);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallback(@NotNull ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        this.onNavigationEvent = ycxexternalsyntheticlambda1;
        onExtraCallback();
    }

    public final void onExtraCallback() {
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.onNavigationEvent;
        if (ycxexternalsyntheticlambda1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ycxexternalsyntheticlambda1 = null;
        }
        ycxexternalsyntheticlambda1.request(this.onExtraCallbackWithResult);
    }

    public final void onNavigationEvent() {
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.onNavigationEvent;
        if (ycxexternalsyntheticlambda1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ycxexternalsyntheticlambda1 = null;
        }
        ycxexternalsyntheticlambda1.cancel();
    }
}
