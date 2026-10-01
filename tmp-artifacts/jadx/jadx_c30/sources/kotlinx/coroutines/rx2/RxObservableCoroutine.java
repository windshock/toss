package kotlinx.coroutines.rx2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.RequestCoordinator;
import o.access13800;
import o.access14300;
import o.deserializeDecimalNullableCollection;
import o.jni_YGNodeStyleGetBorderJNI;
import o.jni_YGNodeStyleGetFlexBasisJNI;
import o.jni_YGNodeStyleGetFlexGrowJNI;
import o.lt;
import o.lud;
import o.maybeUpdateAnimatable;
import o.ok;
import o.setRandomHost;
import o.setRead;
import o.writeBinary;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RxObservableCoroutine<T> extends RequestCoordinator<Unit> implements ok<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallbackWithResult = AtomicIntegerFieldUpdater.newUpdater(RxObservableCoroutine.class, "_signal$volatile");
    private final jni_YGNodeStyleGetFlexBasisJNI IAuthTabCallback;
    private volatile /* synthetic */ int _signal$volatile;
    private final writeBinary<T> onExtraCallback;

    public lt<T> onActivityLayout() {
        return this;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Function1 function1) {
        onWarmupCompleted((Function1<? super Throwable, Unit>) function1);
    }

    public RxObservableCoroutine(@NotNull CoroutineContext coroutineContext, @NotNull writeBinary<T> writebinary) {
        super(coroutineContext, false, true);
        this.onExtraCallback = writebinary;
        this.IAuthTabCallback = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
    }

    public boolean IAuthTabCallback() {
        return !onExtraCallback();
    }

    public boolean onExtraCallback(@Nullable Throwable th) {
        return onWarmupCompleted(th);
    }

    public Void onWarmupCompleted(@NotNull Function1<? super Throwable, Unit> function1) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallback(jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
        if (jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(this.IAuthTabCallback, (Object) null, 1, (Object) null)) {
            jni_ygnodestylegetborderjni.onExtraCallback(Unit.INSTANCE);
        } else {
            maybeUpdateAnimatable.onNavigationEvent(this, (CoroutineContext) null, (setRandomHost) null, new RxObservableCoroutine$registerSelectForSend$1(this, jni_ygnodestylegetborderjni, null), 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object onWarmupCompleted(Object obj, Object obj2) throws Throwable {
        Intrinsics.checkNotNull(obj, BuildConfig.FLAVOR);
        Throwable thAsInterface = asInterface(obj);
        if (thAsInterface == null) {
            return this;
        }
        throw thAsInterface;
    }

    public Object IAuthTabCallback(@NotNull T t) {
        if (!jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(this.IAuthTabCallback, (Object) null, 1, (Object) null)) {
            return lud.Companion.onExtraCallbackWithResult();
        }
        Throwable thAsInterface = asInterface(t);
        if (thAsInterface == null) {
            return lud.Companion.onNavigationEvent(Unit.INSTANCE);
        }
        return lud.Companion.onExtraCallback(thAsInterface);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull T t, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        RxObservableCoroutine$send$1 rxObservableCoroutine$send$1;
        RxObservableCoroutine<T> rxObservableCoroutine;
        if (access13800Var instanceof RxObservableCoroutine$send$1) {
            rxObservableCoroutine$send$1 = (RxObservableCoroutine$send$1) access13800Var;
            int i = rxObservableCoroutine$send$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                rxObservableCoroutine$send$1.label = i + PKIFailureInfo.systemUnavail;
            } else {
                rxObservableCoroutine$send$1 = new RxObservableCoroutine$send$1(this, access13800Var);
            }
        }
        Object obj = rxObservableCoroutine$send$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = rxObservableCoroutine$send$1.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni = this.IAuthTabCallback;
            rxObservableCoroutine$send$1.L$0 = this;
            rxObservableCoroutine$send$1.L$1 = t;
            rxObservableCoroutine$send$1.label = 1;
            if (jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(jni_ygnodestylegetflexbasisjni, (Object) null, rxObservableCoroutine$send$1, 1, (Object) null) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            rxObservableCoroutine = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t = (T) rxObservableCoroutine$send$1.L$1;
            rxObservableCoroutine = (RxObservableCoroutine) rxObservableCoroutine$send$1.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        Throwable thAsInterface = rxObservableCoroutine.asInterface(t);
        if (thAsInterface != null) {
            throw thAsInterface;
        }
        return Unit.INSTANCE;
    }

    private final Throwable asInterface(T t) {
        if (!onExtraCallback()) {
            onExtraCallbackWithResult(cn_(), co_());
            return asBinder();
        }
        try {
            this.onExtraCallback.IAuthTabCallback(t);
            onPostMessage();
            return null;
        } catch (Throwable th) {
            deserializeDecimalNullableCollection deserializedecimalnullablecollection = new deserializeDecimalNullableCollection(th);
            boolean zOnExtraCallback = onExtraCallback((Throwable) deserializedecimalnullablecollection);
            onPostMessage();
            if (zOnExtraCallback) {
                return deserializedecimalnullablecollection;
            }
            RxCancellableKt.onNavigationEvent(deserializedecimalnullablecollection, getContext());
            return asBinder();
        }
    }

    private final void onPostMessage() {
        jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onExtraCallback(this.IAuthTabCallback, (Object) null, 1, (Object) null);
        if (onExtraCallback() || !jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(this.IAuthTabCallback, (Object) null, 1, (Object) null)) {
            return;
        }
        onExtraCallbackWithResult(cn_(), co_());
    }

    private final void onExtraCallbackWithResult(Throwable th, boolean z) {
        try {
            if (onExtraCallbackWithResult.get(this) != -2) {
                onExtraCallbackWithResult.set(this, -2);
                Throwable th2 = th != null ? th : null;
                if (th2 == null) {
                    try {
                        this.onExtraCallback.onNavigationEvent();
                    } catch (Exception e) {
                        RxCancellableKt.onNavigationEvent(e, getContext());
                    }
                } else if ((th2 instanceof deserializeDecimalNullableCollection) && !z) {
                    RxCancellableKt.onNavigationEvent(th, getContext());
                } else if (th2 != asBinder() || !this.onExtraCallback.isDisposed()) {
                    try {
                        this.onExtraCallback.onExtraCallback(th);
                    } catch (Exception e2) {
                        setRead.onWarmupCompleted(th, e2);
                        RxCancellableKt.onNavigationEvent(th, getContext());
                    }
                }
            }
        } finally {
            jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onExtraCallback(this.IAuthTabCallback, (Object) null, 1, (Object) null);
        }
    }

    private final void onWarmupCompleted(Throwable th, boolean z) {
        if (onExtraCallbackWithResult.compareAndSet(this, 0, -1) && jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(this.IAuthTabCallback, (Object) null, 1, (Object) null)) {
            onExtraCallbackWithResult(th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(@NotNull Unit unit) {
        onWarmupCompleted((Throwable) null, false);
    }

    public void onExtraCallback(@NotNull Throwable th, boolean z) {
        onWarmupCompleted(th, z);
    }
}
