package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BitmapImageViewTarget;
import o.setResourceInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setResourceInternal<T> extends GeckoLogger<T> implements maybeRemoveAttachStateListener<T>, access14900, syncDoGet {
    private final access13800<T> IAuthTabCallbackStub;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private final CoroutineContext onNavigationEvent;
    private static final /* synthetic */ AtomicIntegerFieldUpdater onWarmupCompleted = AtomicIntegerFieldUpdater.newUpdater(setResourceInternal.class, "_decisionAndIndex$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallbackWithResult = AtomicReferenceFieldUpdater.newUpdater(setResourceInternal.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallback = AtomicReferenceFieldUpdater.newUpdater(setResourceInternal.class, Object.class, "_parentHandle$volatile");

    @Override // o.access14900
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o.GeckoLogger
    public final access13800<T> onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setResourceInternal(@NotNull access13800<? super T> access13800Var, int i) {
        super(i);
        this.IAuthTabCallbackStub = access13800Var;
        this.onNavigationEvent = access13800Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = BaseTarget.onNavigationEvent;
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        return this.onNavigationEvent;
    }

    private final setDeployments IAuthTabCallbackStubProxy() {
        return (setDeployments) onExtraCallback.get(this);
    }

    public final Object asInterface() {
        return onExtraCallbackWithResult.get(this);
    }

    @Override // o.maybeRemoveAttachStateListener
    public boolean onNavigationEvent() {
        return asInterface() instanceof UpdatePackagePackage;
    }

    @Override // o.maybeRemoveAttachStateListener
    public boolean IAuthTabCallback() {
        return !(asInterface() instanceof UpdatePackagePackage);
    }

    @Override // o.maybeRemoveAttachStateListener
    public boolean onWarmupCompleted() {
        return asInterface() instanceof ViewTarget;
    }

    private final String IAuthTabCallback_Parcel() {
        Object objAsInterface = asInterface();
        return objAsInterface instanceof UpdatePackagePackage ? "Active" : objAsInterface instanceof ViewTarget ? "Cancelled" : "Completed";
    }

    public void onTransact() {
        setDeployments setdeploymentsExtraCallback = extraCallback();
        if (setdeploymentsExtraCallback == null || !IAuthTabCallback()) {
            return;
        }
        setdeploymentsExtraCallback.dispose();
        onExtraCallback.set(this, setStrategy.onNavigationEvent);
    }

    private final boolean readTypedObject() {
        if (!redirect.onExtraCallbackWithResult(this.IAuthTabCallback)) {
            return false;
        }
        access13800<T> access13800Var = this.IAuthTabCallbackStub;
        Intrinsics.checkNotNull(access13800Var, "");
        return ((setFlexWrap) access13800Var).onExtraCallback();
    }

    public final boolean getInterfaceDescriptor() {
        Object obj = onExtraCallbackWithResult.get(this);
        if ((obj instanceof exist) && ((exist) obj).onNavigationEvent != null) {
            onExtraCallback();
            return false;
        }
        onWarmupCompleted.set(this, 536870911);
        onExtraCallbackWithResult.set(this, BaseTarget.onNavigationEvent);
        return true;
    }

    @Override // o.access14900
    public access14900 getCallerFrame() {
        access13800<T> access13800Var = this.IAuthTabCallbackStub;
        if (access13800Var instanceof access14900) {
            return (access14900) access13800Var;
        }
        return null;
    }

    @Override // o.GeckoLogger
    public Object access100() {
        return asInterface();
    }

    @Override // o.GeckoLogger
    public void IAuthTabCallback(@Nullable Object obj, @NotNull Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof UpdatePackagePackage) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof ILoader) {
                return;
            }
            if (obj2 instanceof exist) {
                exist existVar = (exist) obj2;
                if (existVar.onNavigationEvent()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, obj2, exist.onExtraCallbackWithResult(existVar, null, null, null, null, th, 15, null))) {
                    existVar.onExtraCallbackWithResult(this, th);
                    return;
                }
            } else if (RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, obj2, new exist(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    private final boolean IAuthTabCallback(Throwable th) {
        if (!readTypedObject()) {
            return false;
        }
        access13800<T> access13800Var = this.IAuthTabCallbackStub;
        Intrinsics.checkNotNull(access13800Var, "");
        return ((setFlexWrap) access13800Var).IAuthTabCallback(th);
    }

    @Override // o.maybeRemoveAttachStateListener
    public boolean onExtraCallback(@Nullable Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof UpdatePackagePackage)) {
                return false;
            }
        } while (!RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, obj, new ViewTarget(this, th, (obj instanceof BitmapImageViewTarget) || (obj instanceof ycx5))));
        UpdatePackagePackage updatePackagePackage = (UpdatePackagePackage) obj;
        if (updatePackagePackage instanceof BitmapImageViewTarget) {
            IAuthTabCallback((BitmapImageViewTarget) obj, th);
        } else if (updatePackagePackage instanceof ycx5) {
            onExtraCallback((ycx5) obj, th);
        }
        access000();
        onNavigationEvent(this.IAuthTabCallback);
        return true;
    }

    public final void onExtraCallbackWithResult(@NotNull Throwable th) {
        if (IAuthTabCallback(th)) {
            return;
        }
        onExtraCallback(th);
        access000();
    }

    public final void IAuthTabCallback(@NotNull BitmapImageViewTarget bitmapImageViewTarget, @Nullable Throwable th) {
        try {
            bitmapImageViewTarget.onExtraCallbackWithResult(th);
        } catch (Throwable th2) {
            inst.onNavigationEvent(getContext(), new Common("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void onExtraCallback(ycx5<?> ycx5Var, Throwable th) {
        int i = onWarmupCompleted.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            ycx5Var.onNavigationEvent(i, th, getContext());
        } catch (Throwable th2) {
            inst.onNavigationEvent(getContext(), new Common("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void onNavigationEvent(@NotNull getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote, @NotNull Throwable th, R r) {
        try {
            getbacktracenote.invoke(th, r, getContext());
        } catch (Throwable th2) {
            inst.onNavigationEvent(getContext(), new Common("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public Throwable onWarmupCompleted(@NotNull getPackageType getpackagetype) {
        return getpackagetype.asBinder();
    }

    private final boolean onMessageChannelReady() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onWarmupCompleted;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!onWarmupCompleted.compareAndSet(this, i, (536870911 & i) + 536870912));
        return true;
    }

    private final boolean onActivityLayout() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onWarmupCompleted;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!onWarmupCompleted.compareAndSet(this, i, (536870911 & i) + 1073741824));
        return true;
    }

    public final Object IAuthTabCallbackDefault() {
        getPackageType getpackagetype;
        boolean typedObject = readTypedObject();
        if (onMessageChannelReady()) {
            if (IAuthTabCallbackStubProxy() == null) {
                extraCallback();
            }
            if (typedObject) {
                IAuthTabCallbackStub();
            }
            return access14100.onExtraCallback();
        }
        if (typedObject) {
            IAuthTabCallbackStub();
        }
        Object objAsInterface = asInterface();
        if (!(objAsInterface instanceof ILoader)) {
            if (redirect.onWarmupCompleted(this.IAuthTabCallback) && (getpackagetype = (getPackageType) getContext().get(getPackageType.onNavigationEvent)) != null && !getpackagetype.onExtraCallback()) {
                CancellationException cancellationExceptionAsBinder = getpackagetype.asBinder();
                IAuthTabCallback(objAsInterface, (Throwable) cancellationExceptionAsBinder);
                throw cancellationExceptionAsBinder;
            }
            return IAuthTabCallback(objAsInterface);
        }
        throw ((ILoader) objAsInterface).IAuthTabCallback;
    }

    private final setDeployments extraCallback() {
        getPackageType getpackagetype = (getPackageType) getContext().get(getPackageType.onNavigationEvent);
        if (getpackagetype == null) {
            return null;
        }
        setDeployments setdeploymentsOnExtraCallback = isFullUpdate.onExtraCallback(getpackagetype, false, new clearOnDetach(this), 1, null);
        RequestBuilder.onWarmupCompleted(onExtraCallback, this, (Object) null, setdeploymentsOnExtraCallback);
        return setdeploymentsOnExtraCallback;
    }

    public final void IAuthTabCallbackStub() {
        Throwable thIAuthTabCallback;
        access13800<T> access13800Var = this.IAuthTabCallbackStub;
        setFlexWrap setflexwrap = access13800Var instanceof setFlexWrap ? (setFlexWrap) access13800Var : null;
        if (setflexwrap == null || (thIAuthTabCallback = setflexwrap.IAuthTabCallback((maybeRemoveAttachStateListener<?>) this)) == null) {
            return;
        }
        onExtraCallback();
        onExtraCallback(thIAuthTabCallback);
    }

    @Override // o.access13800
    public void resumeWith(@NotNull Object obj) {
        onWarmupCompleted(this, InterceptorModel.onWarmupCompleted(obj, this), this.IAuthTabCallback, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Function1 function1, Throwable th, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    @Override // o.maybeRemoveAttachStateListener
    public void IAuthTabCallback(T t, @Nullable final Function1<? super Throwable, Unit> function1) {
        IAuthTabCallback(t, this.IAuthTabCallback, function1 != null ? new getBacktraceNote() { // from class: kotlinx.coroutines.CancellableContinuationImpl$$ExternalSyntheticLambda0
            @Override // o.getBacktraceNote
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return setResourceInternal.onExtraCallbackWithResult(function1, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    @Override // o.maybeRemoveAttachStateListener
    public <R extends T> void IAuthTabCallback(R r, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote) {
        IAuthTabCallback(r, this.IAuthTabCallback, getbacktracenote);
    }

    @Override // o.syncDoGet
    public void IAuthTabCallback(@NotNull ycx5<?> ycx5Var, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onWarmupCompleted;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        onExtraCallbackWithResult(ycx5Var);
    }

    @Override // o.maybeRemoveAttachStateListener
    public void IAuthTabCallback(@NotNull Function1<? super Throwable, Unit> function1) {
        maybeAddAttachStateListener.IAuthTabCallback(this, new BitmapImageViewTarget.onNavigationEvent(function1));
    }

    public final void IAuthTabCallback(@NotNull BitmapImageViewTarget bitmapImageViewTarget) {
        onExtraCallbackWithResult(bitmapImageViewTarget);
    }

    private final void onExtraCallbackWithResult(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof BaseTarget) {
                if (RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof BitmapImageViewTarget) || (obj2 instanceof ycx5)) {
                IAuthTabCallback(obj, obj2);
            } else {
                if (obj2 instanceof ILoader) {
                    ILoader iLoader = (ILoader) obj2;
                    if (!iLoader.onNavigationEvent()) {
                        IAuthTabCallback(obj, obj2);
                    }
                    if (obj2 instanceof ViewTarget) {
                        Throwable th = iLoader.IAuthTabCallback;
                        if (obj instanceof BitmapImageViewTarget) {
                            IAuthTabCallback((BitmapImageViewTarget) obj, th);
                            return;
                        } else {
                            Intrinsics.checkNotNull(obj, "");
                            onExtraCallback((ycx5) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof exist) {
                    exist existVar = (exist) obj2;
                    if (existVar.onExtraCallback != null) {
                        IAuthTabCallback(obj, obj2);
                    }
                    if (obj instanceof ycx5) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "");
                    BitmapImageViewTarget bitmapImageViewTarget = (BitmapImageViewTarget) obj;
                    if (existVar.onNavigationEvent()) {
                        IAuthTabCallback(bitmapImageViewTarget, existVar.onExtraCallbackWithResult);
                        return;
                    } else {
                        if (RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, obj2, exist.onExtraCallbackWithResult(existVar, null, bitmapImageViewTarget, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof ycx5) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "");
                    if (RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, obj2, new exist(obj2, (BitmapImageViewTarget) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final void IAuthTabCallback(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void onNavigationEvent(int i) {
        if (onActivityLayout()) {
            return;
        }
        redirect.onExtraCallback(this, i);
    }

    private final <R> Object onNavigationEvent(UpdatePackagePackage updatePackagePackage, R r, int i, getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote, Object obj) {
        if (r instanceof ILoader) {
            return r;
        }
        if ((redirect.onWarmupCompleted(i) || obj != null) && !(getbacktracenote == null && !(updatePackagePackage instanceof BitmapImageViewTarget) && obj == null)) {
            return new exist(r, updatePackagePackage instanceof BitmapImageViewTarget ? (BitmapImageViewTarget) updatePackagePackage : null, getbacktracenote, obj, null, 16, null);
        }
        return r;
    }

    public static /* synthetic */ void onWarmupCompleted(setResourceInternal setresourceinternal, Object obj, int i, getBacktraceNote getbacktracenote, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            getbacktracenote = null;
        }
        setresourceinternal.IAuthTabCallback(obj, i, getbacktracenote);
    }

    public final <R> void IAuthTabCallback(R r, int i, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof UpdatePackagePackage) {
            } else {
                if (obj instanceof ViewTarget) {
                    ViewTarget viewTarget = (ViewTarget) obj;
                    if (viewTarget.IAuthTabCallback()) {
                        if (getbacktracenote != null) {
                            onNavigationEvent((getBacktraceNote<? super Throwable, ? super Throwable, ? super CoroutineContext, Unit>) getbacktracenote, viewTarget.IAuthTabCallback, (Throwable) r);
                            return;
                        }
                        return;
                    }
                }
                onWarmupCompleted(r);
                throw new setWrite();
            }
        } while (!RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, obj, onNavigationEvent((UpdatePackagePackage) obj, r, i, getbacktracenote, null)));
        access000();
        onNavigationEvent(i);
    }

    private final <R> djExternalSyntheticApiModelOutline0 onNavigationEvent(R r, Object obj, getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallbackWithResult;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof UpdatePackagePackage) {
            } else {
                if ((obj2 instanceof exist) && obj != null && ((exist) obj2).onNavigationEvent == obj) {
                    return getCurrentDrawable.onExtraCallbackWithResult;
                }
                return null;
            }
        } while (!RequestBuilder.onWarmupCompleted(onExtraCallbackWithResult, this, obj2, onNavigationEvent((UpdatePackagePackage) obj2, r, this.IAuthTabCallback, getbacktracenote, obj)));
        access000();
        return getCurrentDrawable.onExtraCallbackWithResult;
    }

    private final Void onWarmupCompleted(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void access000() {
        if (readTypedObject()) {
            return;
        }
        onExtraCallback();
    }

    public final void onExtraCallback() {
        setDeployments setdeploymentsIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        if (setdeploymentsIAuthTabCallbackStubProxy == null) {
            return;
        }
        setdeploymentsIAuthTabCallbackStubProxy.dispose();
        onExtraCallback.set(this, setStrategy.onNavigationEvent);
    }

    @Override // o.maybeRemoveAttachStateListener
    public <R extends T> Object onWarmupCompleted(R r, @Nullable Object obj, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote) {
        return onNavigationEvent((setResourceInternal<T>) r, obj, (getBacktraceNote<? super Throwable, ? super setResourceInternal<T>, ? super CoroutineContext, Unit>) getbacktracenote);
    }

    @Override // o.maybeRemoveAttachStateListener
    public Object onNavigationEvent(@NotNull Throwable th) {
        return onNavigationEvent((setResourceInternal<T>) new ILoader(th, false, 2, null), (Object) null, (getBacktraceNote<? super Throwable, ? super setResourceInternal<T>, ? super CoroutineContext, Unit>) null);
    }

    @Override // o.maybeRemoveAttachStateListener
    public void onExtraCallback(@NotNull Object obj) {
        onNavigationEvent(this.IAuthTabCallback);
    }

    @Override // o.maybeRemoveAttachStateListener
    public void onNavigationEvent(@NotNull GeckoHubImp geckoHubImp, T t) {
        access13800<T> access13800Var = this.IAuthTabCallbackStub;
        setFlexWrap setflexwrap = access13800Var instanceof setFlexWrap ? (setFlexWrap) access13800Var : null;
        onWarmupCompleted(this, t, (setflexwrap != null ? setflexwrap.onExtraCallback : null) == geckoHubImp ? 4 : this.IAuthTabCallback, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.GeckoLogger
    public <T> T IAuthTabCallback(@Nullable Object obj) {
        return obj instanceof exist ? (T) ((exist) obj).onWarmupCompleted : obj;
    }

    @Override // o.GeckoLogger
    public Throwable onNavigationEvent(@Nullable Object obj) {
        Throwable thOnNavigationEvent = super.onNavigationEvent(obj);
        if (thOnNavigationEvent != null) {
            return thOnNavigationEvent;
        }
        return null;
    }

    public String toString() {
        return asBinder() + '(' + getResCount.onExtraCallback(this.IAuthTabCallbackStub) + "){" + IAuthTabCallback_Parcel() + "}@" + getResCount.onExtraCallbackWithResult(this);
    }

    protected String asBinder() {
        return "CancellableContinuation";
    }
}
