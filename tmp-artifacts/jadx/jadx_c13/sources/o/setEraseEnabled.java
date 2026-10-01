package o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setEraseEnabled<T> extends setTileModeX<setOval> implements getCornerRadius<T>, rmf<T>, syalt<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater onWarmupCompleted = AtomicReferenceFieldUpdater.newUpdater(setEraseEnabled.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    private int onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ setEraseEnabled<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(setEraseEnabled<T> seteraseenabled, access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
            this.this$0 = seteraseenabled;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public setEraseEnabled(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    @Override // o.getCornerRadius, o.setRubIn
    public T IAuthTabCallback() {
        djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = syazb.onNavigationEvent;
        T t = (T) onWarmupCompleted.get(this);
        if (t == djexternalsyntheticapimodeloutline0) {
            return null;
        }
        return t;
    }

    @Override // o.getCornerRadius
    public void onWarmupCompleted(T t) {
        if (t == null) {
            t = (T) syazb.onNavigationEvent;
        }
        onNavigationEvent(null, t);
    }

    @Override // o.getCornerRadius
    public boolean onWarmupCompleted(T t, T t2) {
        if (t == null) {
            t = (T) syazb.onNavigationEvent;
        }
        if (t2 == null) {
            t2 = (T) syazb.onNavigationEvent;
        }
        return onNavigationEvent(t, t2);
    }

    @Override // o.getTileModeX
    public List<T> onExtraCallback() {
        return CollectionsKt__CollectionsJVMKt.listOf(IAuthTabCallback());
    }

    @Override // o.getBorderRadius
    public boolean onNavigationEvent(T t) {
        onWarmupCompleted((setEraseEnabled<T>) t);
        return true;
    }

    @Override // o.getBorderRadius, o.setRipple
    public Object emit(T t, @NotNull access13800<? super Unit> access13800Var) {
        onWarmupCompleted((setEraseEnabled<T>) t);
        return Unit.INSTANCE;
    }

    @Override // o.getBorderRadius
    public void onNavigationEvent() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (((o.setEraseRadius) r11).onNavigationEvent(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, (java.lang.Object) r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x00a6, B:50:0x00dc], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:38:0x00b5, B:40:0x00bb], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:40:0x00bb, B:38:0x00b5], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:40:0x00bb, B:48:0x00d6], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:50:0x00dc, B:34:0x00a6], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:60:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:60:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:60:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00da -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ec -> B:34:0x00a6). Please report as a decompilation issue!!! */
    @Override // o.getTileModeX, o.IAnimation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<?> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        setOval setovalIAuthTabCallbackDefault;
        setEraseEnabled<T> seteraseenabled;
        setOval setoval;
        getPackageType getpackagetype;
        setRipple setripple2;
        Object obj;
        setOval setoval2;
        boolean zIAuthTabCallback;
        T t;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i = iAuthTabCallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(this, access13800Var);
            }
        }
        Object obj2 = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iAuthTabCallback.label;
        ?? r6 = 1;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj2);
                setovalIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                try {
                    if (setripple instanceof setEraseRadius) {
                        iAuthTabCallback.L$0 = this;
                        iAuthTabCallback.L$1 = setripple;
                        iAuthTabCallback.L$2 = setovalIAuthTabCallbackDefault;
                        iAuthTabCallback.label = 1;
                    }
                    seteraseenabled = this;
                    setoval = setovalIAuthTabCallbackDefault;
                } catch (Throwable th) {
                    th = th;
                    seteraseenabled = this;
                    seteraseenabled.onWarmupCompleted((setEraseEnabled<T>) setovalIAuthTabCallbackDefault);
                    throw th;
                }
            } else if (i2 == 1) {
                setOval setoval3 = (setOval) iAuthTabCallback.L$2;
                setripple = (setRipple) iAuthTabCallback.L$1;
                seteraseenabled = (setEraseEnabled) iAuthTabCallback.L$0;
                ResultKt.onNavigationEvent(obj2);
                setoval = setoval3;
            } else if (i2 == 2) {
                obj = iAuthTabCallback.L$4;
                getpackagetype = (getPackageType) iAuthTabCallback.L$3;
                setOval setoval4 = (setOval) iAuthTabCallback.L$2;
                setripple2 = (setRipple) iAuthTabCallback.L$1;
                seteraseenabled = (setEraseEnabled) iAuthTabCallback.L$0;
                ResultKt.onNavigationEvent(obj2);
                setoval2 = setoval4;
                zIAuthTabCallback = setoval2.IAuthTabCallback();
                r6 = setoval2;
                if (!zIAuthTabCallback) {
                }
                ?? r12 = onWarmupCompleted.get(seteraseenabled);
                if (getpackagetype != null) {
                }
                if (obj != null) {
                }
                if (r12 != syazb.onNavigationEvent) {
                }
                iAuthTabCallback.L$0 = seteraseenabled;
                iAuthTabCallback.L$1 = setripple2;
                iAuthTabCallback.L$2 = r6;
                iAuthTabCallback.L$3 = getpackagetype;
                iAuthTabCallback.L$4 = r12;
                iAuthTabCallback.label = 2;
                if (setripple2.emit(t, iAuthTabCallback) != objOnExtraCallback) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = iAuthTabCallback.L$4;
                getpackagetype = (getPackageType) iAuthTabCallback.L$3;
                setOval setoval5 = (setOval) iAuthTabCallback.L$2;
                setripple2 = (setRipple) iAuthTabCallback.L$1;
                seteraseenabled = (setEraseEnabled) iAuthTabCallback.L$0;
                ResultKt.onNavigationEvent(obj2);
                r6 = setoval5;
                ?? r122 = onWarmupCompleted.get(seteraseenabled);
                if (getpackagetype != null) {
                    getFullPackage.IAuthTabCallback(getpackagetype);
                }
                if (obj != null) {
                    setoval2 = r6;
                }
                t = r122 != syazb.onNavigationEvent ? null : r122;
                iAuthTabCallback.L$0 = seteraseenabled;
                iAuthTabCallback.L$1 = setripple2;
                iAuthTabCallback.L$2 = r6;
                iAuthTabCallback.L$3 = getpackagetype;
                iAuthTabCallback.L$4 = r122;
                iAuthTabCallback.label = 2;
                if (setripple2.emit(t, iAuthTabCallback) != objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                obj = r122;
                setoval2 = r6;
                zIAuthTabCallback = setoval2.IAuthTabCallback();
                r6 = setoval2;
                if (!zIAuthTabCallback) {
                    iAuthTabCallback.L$0 = seteraseenabled;
                    iAuthTabCallback.L$1 = setripple2;
                    iAuthTabCallback.L$2 = setoval2;
                    iAuthTabCallback.L$3 = getpackagetype;
                    iAuthTabCallback.L$4 = obj;
                    iAuthTabCallback.label = 3;
                    Object objOnNavigationEvent = setoval2.onNavigationEvent((access13800<? super Unit>) iAuthTabCallback);
                    r6 = setoval2;
                    if (objOnNavigationEvent != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
                ?? r1222 = onWarmupCompleted.get(seteraseenabled);
                if (getpackagetype != null) {
                }
                if (obj != null) {
                }
                if (r1222 != syazb.onNavigationEvent) {
                }
                iAuthTabCallback.L$0 = seteraseenabled;
                iAuthTabCallback.L$1 = setripple2;
                iAuthTabCallback.L$2 = r6;
                iAuthTabCallback.L$3 = getpackagetype;
                iAuthTabCallback.L$4 = r1222;
                iAuthTabCallback.label = 2;
                if (setripple2.emit(t, iAuthTabCallback) != objOnExtraCallback) {
                }
            }
            getpackagetype = (getPackageType) iAuthTabCallback.getContext().get(getPackageType.onNavigationEvent);
            setripple2 = setripple;
            obj = null;
            r6 = setoval;
            ?? r12222 = onWarmupCompleted.get(seteraseenabled);
            if (getpackagetype != null) {
            }
            if (obj != null) {
            }
            if (r12222 != syazb.onNavigationEvent) {
            }
            iAuthTabCallback.L$0 = seteraseenabled;
            iAuthTabCallback.L$1 = setripple2;
            iAuthTabCallback.L$2 = r6;
            iAuthTabCallback.L$3 = getpackagetype;
            iAuthTabCallback.L$4 = r12222;
            iAuthTabCallback.label = 2;
            if (setripple2.emit(t, iAuthTabCallback) != objOnExtraCallback) {
            }
        } catch (Throwable th2) {
            th = th2;
            setovalIAuthTabCallbackDefault = r6;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTileModeX
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public setOval asBinder() {
        return new setOval();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTileModeX
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public setOval[] onExtraCallback(int i) {
        return new setOval[i];
    }

    @Override // o.syalt
    public IAnimation<T> onExtraCallback(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return setShine.IAuthTabCallback(this, coroutineContext, i, closeableUtils);
    }

    private final boolean onNavigationEvent(Object obj, Object obj2) {
        int i;
        setOval[] setovalArrIAuthTabCallback_Parcel;
        synchronized (this) {
            Object obj3 = onWarmupCompleted.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            onWarmupCompleted.set(this, obj2);
            int i2 = this.onNavigationEvent;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.onNavigationEvent = i3;
                setOval[] setovalArrIAuthTabCallback_Parcel2 = IAuthTabCallback_Parcel();
                Unit unit = Unit.INSTANCE;
                while (true) {
                    setOval[] setovalArr = setovalArrIAuthTabCallback_Parcel2;
                    if (setovalArr != null) {
                        for (setOval setoval : setovalArr) {
                            if (setoval != null) {
                                setoval.onNavigationEvent();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.onNavigationEvent;
                        if (i == i3) {
                            this.onNavigationEvent = i3 + 1;
                            return true;
                        }
                        setovalArrIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    setovalArrIAuthTabCallback_Parcel2 = setovalArrIAuthTabCallback_Parcel;
                    i3 = i;
                }
            } else {
                this.onNavigationEvent = i2 + 2;
                return true;
            }
        }
    }
}
