package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setFlexWrap<T> extends GeckoLogger<T> implements access14900, access13800<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater asBinder = AtomicReferenceFieldUpdater.newUpdater(setFlexWrap.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final GeckoHubImp onExtraCallback;
    public Object onExtraCallbackWithResult;
    public final Object onNavigationEvent;
    public final access13800<T> onWarmupCompleted;

    @Override // o.access13800
    public CoroutineContext getContext() {
        return this.onWarmupCompleted.getContext();
    }

    @Override // o.access14900
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o.GeckoLogger
    public access13800<T> onExtraCallbackWithResult() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setFlexWrap(@NotNull GeckoHubImp geckoHubImp, @NotNull access13800<? super T> access13800Var) {
        super(-1);
        this.onExtraCallback = geckoHubImp;
        this.onWarmupCompleted = access13800Var;
        this.onExtraCallbackWithResult = setMaxLine.IAuthTabCallback;
        this.onNavigationEvent = getViewPager.onExtraCallback(getContext());
    }

    @Override // o.access14900
    public access14900 getCallerFrame() {
        access13800<T> access13800Var = this.onWarmupCompleted;
        if (access13800Var instanceof access14900) {
            return (access14900) access13800Var;
        }
        return null;
    }

    private final setResourceInternal<?> asInterface() {
        Object obj = asBinder.get(this);
        if (obj instanceof setResourceInternal) {
            return (setResourceInternal) obj;
        }
        return null;
    }

    public final boolean onExtraCallback() {
        return asBinder.get(this) != null;
    }

    public final void IAuthTabCallback() {
        while (asBinder.get(this) == setMaxLine.onExtraCallback) {
        }
    }

    public final void onNavigationEvent() {
        IAuthTabCallback();
        setResourceInternal<?> setresourceinternalAsInterface = asInterface();
        if (setresourceinternalAsInterface != null) {
            setresourceinternalAsInterface.onExtraCallback();
        }
    }

    public final setResourceInternal<T> onWarmupCompleted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asBinder;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                asBinder.set(this, setMaxLine.onExtraCallback);
                return null;
            }
            if (obj instanceof setResourceInternal) {
                if (RequestBuilder.onWarmupCompleted(asBinder, this, obj, setMaxLine.onExtraCallback)) {
                    return (setResourceInternal) obj;
                }
            } else if (obj != setMaxLine.onExtraCallback && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final Throwable IAuthTabCallback(@NotNull maybeRemoveAttachStateListener<?> mayberemoveattachstatelistener) {
        djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asBinder;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            djexternalsyntheticapimodeloutline0 = setMaxLine.onExtraCallback;
            if (obj != djexternalsyntheticapimodeloutline0) {
                if (obj instanceof Throwable) {
                    if (!RequestBuilder.onWarmupCompleted(asBinder, this, obj, (Object) null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    return (Throwable) obj;
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!RequestBuilder.onWarmupCompleted(asBinder, this, djexternalsyntheticapimodeloutline0, mayberemoveattachstatelistener));
        return null;
    }

    public final boolean IAuthTabCallback(@NotNull Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asBinder;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = setMaxLine.onExtraCallback;
            if (Intrinsics.areEqual(obj, djexternalsyntheticapimodeloutline0)) {
                if (RequestBuilder.onWarmupCompleted(asBinder, this, djexternalsyntheticapimodeloutline0, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (RequestBuilder.onWarmupCompleted(asBinder, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    @Override // o.GeckoLogger
    public Object access100() {
        Object obj = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = setMaxLine.IAuthTabCallback;
        return obj;
    }

    @Override // o.access13800
    public void resumeWith(@NotNull Object obj) {
        Object objOnNavigationEvent = InterceptorModel.onNavigationEvent(obj);
        if (setMaxLine.onWarmupCompleted(this.onExtraCallback, getContext())) {
            this.onExtraCallbackWithResult = objOnNavigationEvent;
            this.IAuthTabCallback = 0;
            setMaxLine.IAuthTabCallback(this.onExtraCallback, getContext(), this);
            return;
        }
        CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannelIAuthTabCallback = isDeleteIfFail.onExtraCallbackWithResult.IAuthTabCallback();
        if (checkRequestBodyModelLocalChannelIAuthTabCallback.onWarmupCompleted()) {
            this.onExtraCallbackWithResult = objOnNavigationEvent;
            this.IAuthTabCallback = 0;
            checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallback(this);
            return;
        }
        checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallback(true);
        try {
            CoroutineContext context = getContext();
            Object objOnNavigationEvent2 = getViewPager.onNavigationEvent(context, this.onNavigationEvent);
            try {
                this.onWarmupCompleted.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                while (checkRequestBodyModelLocalChannelIAuthTabCallback.IAuthTabCallbackDefault()) {
                }
            } finally {
                getViewPager.onExtraCallbackWithResult(context, objOnNavigationEvent2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void IAuthTabCallback(@NotNull CoroutineContext coroutineContext, T t) {
        this.onExtraCallbackWithResult = t;
        this.IAuthTabCallback = 1;
        this.onExtraCallback.onExtraCallback(coroutineContext, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.onExtraCallback + ", " + getResCount.onExtraCallback(this.onWarmupCompleted) + ']';
    }
}
