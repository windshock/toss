package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RequestFutureTargetWaiter<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(RequestFutureTargetWaiter.class, "notCompletedCount$volatile");
    private volatile /* synthetic */ int notCompletedCount$volatile;
    private final GeckoHubImp1<T>[] onExtraCallbackWithResult;

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater IAuthTabCallback() {
        return onExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestFutureTargetWaiter(@NotNull GeckoHubImp1<? extends T>[] geckoHubImp1Arr) {
        this.onExtraCallbackWithResult = geckoHubImp1Arr;
        this.notCompletedCount$volatile = geckoHubImp1Arr.length;
    }

    final class IAuthTabCallback implements BitmapImageViewTarget {
        private final RequestFutureTargetWaiter<T>.onExtraCallbackWithResult[] onWarmupCompleted;

        public IAuthTabCallback(@NotNull RequestFutureTargetWaiter<T>.onExtraCallbackWithResult[] onextracallbackwithresultArr) {
            this.onWarmupCompleted = onextracallbackwithresultArr;
        }

        public final void onExtraCallback() {
            for (RequestFutureTargetWaiter<T>.onExtraCallbackWithResult onextracallbackwithresult : this.onWarmupCompleted) {
                onextracallbackwithresult.onNavigationEvent().dispose();
            }
        }

        @Override // o.BitmapImageViewTarget
        public void onExtraCallbackWithResult(@Nullable Throwable th) {
            onExtraCallback();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.onWarmupCompleted + ']';
        }
    }

    final class onExtraCallbackWithResult extends isPatchUpdate {
        private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallback = AtomicReferenceFieldUpdater.newUpdater(onExtraCallbackWithResult.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;
        private final maybeRemoveAttachStateListener<List<? extends T>> onExtraCallbackWithResult;
        public setDeployments onNavigationEvent;

        @Override // o.isPatchUpdate
        public boolean onExtraCallback() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallbackWithResult(@NotNull maybeRemoveAttachStateListener<? super List<? extends T>> mayberemoveattachstatelistener) {
            this.onExtraCallbackWithResult = mayberemoveattachstatelistener;
        }

        public final setDeployments onNavigationEvent() {
            setDeployments setdeployments = this.onNavigationEvent;
            if (setdeployments != null) {
                return setdeployments;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }

        public final void onWarmupCompleted(@NotNull setDeployments setdeployments) {
            this.onNavigationEvent = setdeployments;
        }

        public final RequestFutureTargetWaiter<T>.IAuthTabCallback onWarmupCompleted() {
            return (IAuthTabCallback) onExtraCallback.get(this);
        }

        public final void onExtraCallback(@Nullable RequestFutureTargetWaiter<T>.IAuthTabCallback iAuthTabCallback) {
            onExtraCallback.set(this, iAuthTabCallback);
        }

        @Override // o.isPatchUpdate
        public void onWarmupCompleted(@Nullable Throwable th) {
            if (th == null) {
                if (RequestFutureTargetWaiter.IAuthTabCallback().decrementAndGet(RequestFutureTargetWaiter.this) == 0) {
                    maybeRemoveAttachStateListener<List<? extends T>> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
                    GeckoHubImp1[] geckoHubImp1Arr = ((RequestFutureTargetWaiter) RequestFutureTargetWaiter.this).onExtraCallbackWithResult;
                    ArrayList arrayList = new ArrayList(geckoHubImp1Arr.length);
                    for (GeckoHubImp1 geckoHubImp1 : geckoHubImp1Arr) {
                        arrayList.add(geckoHubImp1.IAuthTabCallback());
                    }
                    Result.Companion companion = Result.Companion;
                    mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(arrayList));
                    return;
                }
                return;
            }
            Object objOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(th);
            if (objOnNavigationEvent != null) {
                this.onExtraCallbackWithResult.onExtraCallback(objOnNavigationEvent);
                RequestFutureTargetWaiter<T>.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = onWarmupCompleted();
                if (iAuthTabCallbackOnWarmupCompleted != null) {
                    iAuthTabCallbackOnWarmupCompleted.onExtraCallback();
                }
            }
        }
    }

    public final Object IAuthTabCallback(@NotNull access13800<? super List<? extends T>> access13800Var) {
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        int length = this.onExtraCallbackWithResult.length;
        onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[length];
        for (int i = 0; i < length; i++) {
            GeckoHubImp1 geckoHubImp1 = this.onExtraCallbackWithResult[i];
            geckoHubImp1.IAuthTabCallback_Parcel();
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(setresourceinternal);
            onextracallbackwithresult.onWarmupCompleted(isFullUpdate.onExtraCallback(geckoHubImp1, false, onextracallbackwithresult, 1, null));
            Unit unit = Unit.INSTANCE;
            onextracallbackwithresultArr[i] = onextracallbackwithresult;
        }
        RequestFutureTargetWaiter<T>.IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(onextracallbackwithresultArr);
        for (int i2 = 0; i2 < length; i2++) {
            onextracallbackwithresultArr[i2].onExtraCallback(iAuthTabCallback);
        }
        if (setresourceinternal.IAuthTabCallback()) {
            iAuthTabCallback.onExtraCallback();
        } else {
            maybeAddAttachStateListener.IAuthTabCallback(setresourceinternal, iAuthTabCallback);
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }
}
