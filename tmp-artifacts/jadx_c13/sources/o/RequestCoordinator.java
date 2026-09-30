package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RequestCoordinator<T> extends setFullPackage implements access13800<T>, findResAndMsg {
    private final CoroutineContext onExtraCallbackWithResult;

    protected void onExtraCallback(@NotNull Throwable th, boolean z) {
    }

    protected void onWarmupCompleted(T t) {
    }

    public RequestCoordinator(@NotNull CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            onExtraCallbackWithResult((getPackageType) coroutineContext.get(getPackageType.onNavigationEvent));
        }
        this.onExtraCallbackWithResult = coroutineContext.plus(this);
    }

    @Override // o.access13800
    public final CoroutineContext getContext() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.findResAndMsg
    public CoroutineContext getCoroutineContext() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.setFullPackage, o.getPackageType
    public boolean onExtraCallback() {
        return super.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setFullPackage
    public String cl_() {
        return getResCount.IAuthTabCallback(this) + " was cancelled";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setFullPackage
    protected final void onExtraCallbackWithResult(@Nullable Object obj) {
        if (obj instanceof ILoader) {
            ILoader iLoader = (ILoader) obj;
            onExtraCallback(iLoader.IAuthTabCallback, iLoader.onExtraCallbackWithResult());
        } else {
            onWarmupCompleted((RequestCoordinator<T>) obj);
        }
    }

    @Override // o.access13800
    public final void resumeWith(@NotNull Object obj) {
        Object objAsBinder = asBinder(InterceptorModel.onNavigationEvent(obj));
        if (objAsBinder == setChannelIndex.onExtraCallback) {
            return;
        }
        onNavigationEvent(objAsBinder);
    }

    protected void onNavigationEvent(@Nullable Object obj) {
        b_(obj);
    }

    @Override // o.setFullPackage
    public final void onExtraCallbackWithResult(@NotNull Throwable th) {
        inst.onNavigationEvent(this.onExtraCallbackWithResult, th);
    }

    @Override // o.setFullPackage
    public String ck_() {
        String strIAuthTabCallback = StatisticData.IAuthTabCallback(this.onExtraCallbackWithResult);
        if (strIAuthTabCallback == null) {
            return super.ck_();
        }
        return '\"' + strIAuthTabCallback + "\":" + super.ck_();
    }

    public final <R> void onExtraCallback(@NotNull setRandomHost setrandomhost, R r, @NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2) {
        setrandomhost.invoke(function2, r, this);
    }
}
