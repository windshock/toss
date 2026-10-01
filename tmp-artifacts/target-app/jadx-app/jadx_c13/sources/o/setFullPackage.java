package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ResumeAwaitOnCompletion;
import kotlinx.coroutines.ResumeOnCompletion;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setFullPackage implements removeCallback, setMd5 {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onWarmupCompleted = AtomicReferenceFieldUpdater.newUpdater(setFullPackage.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallback = AtomicReferenceFieldUpdater.newUpdater(setFullPackage.class, Object.class, "_parentHandle$volatile");

    protected void IAuthTabCallbackDefault(@Nullable Throwable th) {
    }

    protected boolean asInterface(@NotNull Throwable th) {
        return false;
    }

    protected void b_(@Nullable Object obj) {
    }

    public boolean cj_() {
        return true;
    }

    public boolean cp_() {
        return false;
    }

    protected void onActivityResized() {
    }

    protected void onExtraCallbackWithResult(@Nullable Object obj) {
    }

    protected boolean onExtraCallbackWithResult() {
        return false;
    }

    @Deprecated
    public /* synthetic */ void cancel() {
        onNavigationEvent((CancellationException) null);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) getPackageType.onWarmupCompleted.onWarmupCompleted(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
        return (E) getPackageType.onWarmupCompleted.onNavigationEvent(this, onextracallback);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        return getPackageType.onWarmupCompleted.onExtraCallback(this, onextracallback);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return getPackageType.onWarmupCompleted.onExtraCallback(this, coroutineContext);
    }

    public setFullPackage(boolean z) {
        this._state$volatile = z ? setChannelIndex.onExtraCallbackWithResult : setChannelIndex.onWarmupCompleted;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.onExtraCallback<?> getKey() {
        return getPackageType.onNavigationEvent;
    }

    public final resumeMyRequest extraCallbackWithResult() {
        return (resumeMyRequest) onExtraCallback.get(this);
    }

    public final void onExtraCallbackWithResult(@Nullable resumeMyRequest resumemyrequest) {
        onExtraCallback.set(this, resumemyrequest);
    }

    public getPackageType ICustomTabsCallback() {
        resumeMyRequest resumemyrequestExtraCallbackWithResult = extraCallbackWithResult();
        if (resumemyrequestExtraCallbackWithResult != null) {
            return resumemyrequestExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        return null;
    }

    public final void onExtraCallbackWithResult(@Nullable getPackageType getpackagetype) {
        if (getpackagetype == null) {
            onExtraCallbackWithResult((resumeMyRequest) setStrategy.onNavigationEvent);
            return;
        }
        getpackagetype.IAuthTabCallback_Parcel();
        resumeMyRequest resumemyrequestOnExtraCallbackWithResult = getpackagetype.onExtraCallbackWithResult(this);
        onExtraCallbackWithResult(resumemyrequestOnExtraCallbackWithResult);
        if (IAuthTabCallbackStubProxy()) {
            resumemyrequestOnExtraCallbackWithResult.dispose();
            onExtraCallbackWithResult((resumeMyRequest) setStrategy.onNavigationEvent);
        }
    }

    public final Object cq_() {
        return onWarmupCompleted.get(this);
    }

    @Override // o.getPackageType
    public boolean onExtraCallback() {
        Object objCq_ = cq_();
        return (objCq_ instanceof UpdatePackage) && ((UpdatePackage) objCq_).cg_();
    }

    @Override // o.getPackageType
    public final boolean IAuthTabCallbackStubProxy() {
        return !(cq_() instanceof UpdatePackage);
    }

    @Override // o.getPackageType
    public final boolean access000() {
        Object objCq_ = cq_();
        if (objCq_ instanceof ILoader) {
            return true;
        }
        return (objCq_ instanceof onNavigationEvent) && ((onNavigationEvent) objCq_).IAuthTabCallback();
    }

    private final Object onWarmupCompleted(onNavigationEvent onnavigationevent, Object obj) throws Throwable {
        boolean zIAuthTabCallback;
        Throwable thOnWarmupCompleted;
        ILoader iLoader = obj instanceof ILoader ? (ILoader) obj : null;
        Throwable th = iLoader != null ? iLoader.IAuthTabCallback : null;
        synchronized (onnavigationevent) {
            zIAuthTabCallback = onnavigationevent.IAuthTabCallback();
            List<Throwable> listIAuthTabCallback = onnavigationevent.IAuthTabCallback(th);
            thOnWarmupCompleted = onWarmupCompleted(onnavigationevent, (List<? extends Throwable>) listIAuthTabCallback);
            if (thOnWarmupCompleted != null) {
                IAuthTabCallback(thOnWarmupCompleted, (List<? extends Throwable>) listIAuthTabCallback);
            }
        }
        if (thOnWarmupCompleted != null && thOnWarmupCompleted != th) {
            obj = new ILoader(thOnWarmupCompleted, false, 2, null);
        }
        if (thOnWarmupCompleted != null && (onExtraCallback(thOnWarmupCompleted) || asInterface(thOnWarmupCompleted))) {
            Intrinsics.checkNotNull(obj, "");
            ((ILoader) obj).onNavigationEvent();
        }
        if (!zIAuthTabCallback) {
            IAuthTabCallbackDefault(thOnWarmupCompleted);
        }
        onExtraCallbackWithResult(obj);
        RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, onnavigationevent, setChannelIndex.onNavigationEvent(obj));
        onNavigationEvent((UpdatePackage) onnavigationevent, obj);
        return obj;
    }

    private final Throwable onWarmupCompleted(onNavigationEvent onnavigationevent, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (onnavigationevent.IAuthTabCallback()) {
                return new getPatch(cl_(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof WebResourceResponseModel) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof WebResourceResponseModel)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final void IAuthTabCallback(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                    setExecute.onNavigationEvent(th, th2);
                }
            }
        }
    }

    private final boolean IAuthTabCallback(UpdatePackage updatePackage, Object obj) throws Throwable {
        if (!RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, updatePackage, setChannelIndex.onNavigationEvent(obj))) {
            return false;
        }
        IAuthTabCallbackDefault((Throwable) null);
        onExtraCallbackWithResult(obj);
        onNavigationEvent(updatePackage, obj);
        return true;
    }

    private final void onNavigationEvent(UpdatePackage updatePackage, Object obj) throws Throwable {
        resumeMyRequest resumemyrequestExtraCallbackWithResult = extraCallbackWithResult();
        if (resumemyrequestExtraCallbackWithResult != null) {
            resumemyrequestExtraCallbackWithResult.dispose();
            onExtraCallbackWithResult((resumeMyRequest) setStrategy.onNavigationEvent);
        }
        ILoader iLoader = obj instanceof ILoader ? (ILoader) obj : null;
        Throwable th = iLoader != null ? iLoader.IAuthTabCallback : null;
        if (updatePackage instanceof isPatchUpdate) {
            try {
                ((isPatchUpdate) updatePackage).onWarmupCompleted(th);
                return;
            } catch (Throwable th2) {
                onExtraCallbackWithResult((Throwable) new Common("Exception in completion handler " + updatePackage + " for " + this, th2));
                return;
            }
        }
        UpdatePackageFileType updatePackageFileTypeCf_ = updatePackage.cf_();
        if (updatePackageFileTypeCf_ != null) {
            IAuthTabCallback(updatePackageFileTypeCf_, th);
        }
    }

    private final void onExtraCallbackWithResult(UpdatePackageFileType updatePackageFileType, Throwable th) throws Throwable {
        IAuthTabCallbackDefault(th);
        updatePackageFileType.IAuthTabCallback(4);
        Object objIAuthTabCallbackStub = updatePackageFileType.IAuthTabCallbackStub();
        Intrinsics.checkNotNull(objIAuthTabCallbackStub, "");
        Common common = null;
        for (jw1 jw1VarAsBinder = (jw1) objIAuthTabCallbackStub; !Intrinsics.areEqual(jw1VarAsBinder, updatePackageFileType); jw1VarAsBinder = jw1VarAsBinder.asBinder()) {
            if ((jw1VarAsBinder instanceof isPatchUpdate) && ((isPatchUpdate) jw1VarAsBinder).onExtraCallback()) {
                try {
                    ((isPatchUpdate) jw1VarAsBinder).onWarmupCompleted(th);
                } catch (Throwable th2) {
                    if (common != null) {
                        setExecute.onNavigationEvent(common, th2);
                    } else {
                        Common common2 = new Common("Exception in completion handler " + jw1VarAsBinder + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                        common = common2;
                    }
                }
            }
        }
        if (common != null) {
            onExtraCallbackWithResult((Throwable) common);
        }
        onExtraCallback(th);
    }

    private final boolean onExtraCallback(Throwable th) {
        if (onExtraCallbackWithResult()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        resumeMyRequest resumemyrequestExtraCallbackWithResult = extraCallbackWithResult();
        return (resumemyrequestExtraCallbackWithResult == null || resumemyrequestExtraCallbackWithResult == setStrategy.onNavigationEvent) ? z : resumemyrequestExtraCallbackWithResult.onExtraCallbackWithResult(th) || z;
    }

    private final void IAuthTabCallback(UpdatePackageFileType updatePackageFileType, Throwable th) throws Throwable {
        updatePackageFileType.IAuthTabCallback(1);
        Object objIAuthTabCallbackStub = updatePackageFileType.IAuthTabCallbackStub();
        Intrinsics.checkNotNull(objIAuthTabCallbackStub, "");
        Common common = null;
        for (jw1 jw1VarAsBinder = (jw1) objIAuthTabCallbackStub; !Intrinsics.areEqual(jw1VarAsBinder, updatePackageFileType); jw1VarAsBinder = jw1VarAsBinder.asBinder()) {
            if (jw1VarAsBinder instanceof isPatchUpdate) {
                try {
                    ((isPatchUpdate) jw1VarAsBinder).onWarmupCompleted(th);
                } catch (Throwable th2) {
                    if (common != null) {
                        setExecute.onNavigationEvent(common, th2);
                    } else {
                        Common common2 = new Common("Exception in completion handler " + jw1VarAsBinder + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                        common = common2;
                    }
                }
            }
        }
        if (common != null) {
            onExtraCallbackWithResult((Throwable) common);
        }
    }

    private final int asInterface(Object obj) {
        if (obj instanceof CheckRequestBodyModelChannel) {
            if (((CheckRequestBodyModelChannel) obj).cg_()) {
                return 0;
            }
            if (!RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, obj, setChannelIndex.onExtraCallbackWithResult)) {
                return -1;
            }
            onActivityResized();
            return 1;
        }
        if (!(obj instanceof getAccessKey)) {
            return 0;
        }
        if (!RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, obj, ((getAccessKey) obj).cf_())) {
            return -1;
        }
        onActivityResized();
        return 1;
    }

    @Override // o.getPackageType
    public final CancellationException asBinder() {
        Object objCq_ = cq_();
        if (objCq_ instanceof onNavigationEvent) {
            Throwable thOnNavigationEvent = ((onNavigationEvent) objCq_).onNavigationEvent();
            if (thOnNavigationEvent != null) {
                CancellationException cancellationExceptionOnExtraCallbackWithResult = onExtraCallbackWithResult(thOnNavigationEvent, getResCount.IAuthTabCallback(this) + " is cancelling");
                if (cancellationExceptionOnExtraCallbackWithResult != null) {
                    return cancellationExceptionOnExtraCallbackWithResult;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objCq_ instanceof UpdatePackage) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objCq_ instanceof ILoader) {
            return onExtraCallback(this, ((ILoader) objCq_).IAuthTabCallback, null, 1, null);
        }
        return new getPatch(getResCount.IAuthTabCallback(this) + " has completed normally", null, this);
    }

    public static /* synthetic */ CancellationException onExtraCallback(setFullPackage setfullpackage, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return setfullpackage.onExtraCallbackWithResult(th, str);
    }

    protected final CancellationException onExtraCallbackWithResult(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = cl_();
        }
        return new getPatch(str, th, this);
    }

    public final Throwable cn_() {
        Object objCq_ = cq_();
        if (objCq_ instanceof onNavigationEvent) {
            Throwable thOnNavigationEvent = ((onNavigationEvent) objCq_).onNavigationEvent();
            if (thOnNavigationEvent != null) {
                return thOnNavigationEvent;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objCq_ instanceof UpdatePackage) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objCq_ instanceof ILoader) {
            return ((ILoader) objCq_).IAuthTabCallback;
        }
        return null;
    }

    public final boolean co_() {
        Object objCq_ = cq_();
        return (objCq_ instanceof ILoader) && ((ILoader) objCq_).onExtraCallbackWithResult();
    }

    @Override // o.getPackageType
    public final setDeployments onExtraCallback(@NotNull Function1<? super Throwable, Unit> function1) {
        return onExtraCallback(true, new getStrategy(function1));
    }

    @Override // o.getPackageType
    public final setDeployments onWarmupCompleted(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        isPatchUpdate getstrategy;
        if (z) {
            getstrategy = new ComponentModelc(function1);
        } else {
            getstrategy = new getStrategy(function1);
        }
        return onExtraCallback(z2, getstrategy);
    }

    public final setDeployments onExtraCallback(boolean z, @NotNull isPatchUpdate ispatchupdate) {
        boolean zIAuthTabCallback;
        ispatchupdate.onExtraCallbackWithResult(this);
        while (true) {
            Object objCq_ = cq_();
            if (objCq_ instanceof CheckRequestBodyModelChannel) {
                CheckRequestBodyModelChannel checkRequestBodyModelChannel = (CheckRequestBodyModelChannel) objCq_;
                if (checkRequestBodyModelChannel.cg_()) {
                    if (RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, objCq_, ispatchupdate)) {
                        break;
                    }
                } else {
                    IAuthTabCallback(checkRequestBodyModelChannel);
                }
            } else {
                if (!(objCq_ instanceof UpdatePackage)) {
                    if (z) {
                        Object objCq_2 = cq_();
                        ILoader iLoader = objCq_2 instanceof ILoader ? (ILoader) objCq_2 : null;
                        ispatchupdate.onWarmupCompleted(iLoader != null ? iLoader.IAuthTabCallback : null);
                    }
                    return setStrategy.onNavigationEvent;
                }
                UpdatePackage updatePackage = (UpdatePackage) objCq_;
                UpdatePackageFileType updatePackageFileTypeCf_ = updatePackage.cf_();
                if (updatePackageFileTypeCf_ != null) {
                    if (ispatchupdate.onExtraCallback()) {
                        onNavigationEvent onnavigationevent = updatePackage instanceof onNavigationEvent ? (onNavigationEvent) updatePackage : null;
                        Throwable thOnNavigationEvent = onnavigationevent != null ? onnavigationevent.onNavigationEvent() : null;
                        if (thOnNavigationEvent == null) {
                            zIAuthTabCallback = updatePackageFileTypeCf_.IAuthTabCallback(ispatchupdate, 5);
                        } else {
                            if (z) {
                                ispatchupdate.onWarmupCompleted(thOnNavigationEvent);
                            }
                            return setStrategy.onNavigationEvent;
                        }
                    } else {
                        zIAuthTabCallback = updatePackageFileTypeCf_.IAuthTabCallback(ispatchupdate, 1);
                    }
                    if (zIAuthTabCallback) {
                        break;
                    }
                } else {
                    Intrinsics.checkNotNull(objCq_, "");
                    onExtraCallback((isPatchUpdate) objCq_);
                }
            }
        }
        return ispatchupdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.getAccessKey] */
    private final void IAuthTabCallback(CheckRequestBodyModelChannel checkRequestBodyModelChannel) {
        UpdatePackageFileType updatePackageFileType = new UpdatePackageFileType();
        if (!checkRequestBodyModelChannel.cg_()) {
            updatePackageFileType = new getAccessKey(updatePackageFileType);
        }
        RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, checkRequestBodyModelChannel, updatePackageFileType);
    }

    private final void onExtraCallback(isPatchUpdate ispatchupdate) {
        ispatchupdate.onWarmupCompleted(new UpdatePackageFileType());
        RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, ispatchupdate, ispatchupdate.asBinder());
    }

    @Override // o.getPackageType
    public final Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        if (!onActivityLayout()) {
            getFullPackage.IAuthTabCallback(access13800Var.getContext());
            return Unit.INSTANCE;
        }
        Object objOnWarmupCompleted = onWarmupCompleted(access13800Var);
        return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
    }

    final /* synthetic */ class IAuthTabCallbackStub extends FunctionReferenceImpl implements getBacktraceNote<setFullPackage, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> {
        public static final IAuthTabCallbackStub onWarmupCompleted = new IAuthTabCallbackStub();

        IAuthTabCallbackStub() {
            super(3, setFullPackage.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Unit invoke(setFullPackage setfullpackage, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            onNavigationEvent(setfullpackage, jni_ygnodestylegetborderjni, obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(setFullPackage setfullpackage, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            setfullpackage.onNavigationEvent(jni_ygnodestylegetborderjni, obj);
        }
    }

    @Override // o.getPackageType
    public final jni_YGNodeStyleGetAlignContentJNI IAuthTabCallbackDefault() {
        IAuthTabCallbackStub iAuthTabCallbackStub = IAuthTabCallbackStub.onWarmupCompleted;
        Intrinsics.checkNotNull(iAuthTabCallbackStub, "");
        return new jni_YGNodeSetHasMeasureFuncJNI(this, (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(iAuthTabCallbackStub, 3), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationEvent(jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
        if (!onActivityLayout()) {
            jni_ygnodestylegetborderjni.onExtraCallback(Unit.INSTANCE);
        } else {
            jni_ygnodestylegetborderjni.onExtraCallbackWithResult(isFullUpdate.onExtraCallback(this, false, new onExtraCallback(this, jni_ygnodestylegetborderjni), 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String cl_() {
        return "Job was cancelled";
    }

    public void onNavigationEvent(@NotNull Throwable th) throws Throwable {
        onExtraCallback((Object) th);
    }

    @Override // o.removeCallback
    public final void onExtraCallbackWithResult(@NotNull setMd5 setmd5) throws Throwable {
        onExtraCallback(setmd5);
    }

    public boolean IAuthTabCallback(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return onExtraCallback((Object) th) && cj_();
    }

    public final boolean onWarmupCompleted(@Nullable Throwable th) {
        return onExtraCallback((Object) th);
    }

    public final boolean onExtraCallback(@Nullable Object obj) throws Throwable {
        Object objOnTransact = setChannelIndex.onNavigationEvent;
        if (cp_() && (objOnTransact = onNavigationEvent(obj)) == setChannelIndex.onExtraCallback) {
            return true;
        }
        if (objOnTransact == setChannelIndex.onNavigationEvent) {
            objOnTransact = onTransact(obj);
        }
        if (objOnTransact == setChannelIndex.onNavigationEvent || objOnTransact == setChannelIndex.onExtraCallback) {
            return true;
        }
        if (objOnTransact == setChannelIndex.onTransact) {
            return false;
        }
        b_(objOnTransact);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Throwable] */
    @Override // o.setMd5
    public CancellationException access100() {
        CancellationException cancellationExceptionOnNavigationEvent;
        Object objCq_ = cq_();
        if (objCq_ instanceof onNavigationEvent) {
            cancellationExceptionOnNavigationEvent = ((onNavigationEvent) objCq_).onNavigationEvent();
        } else if (objCq_ instanceof ILoader) {
            cancellationExceptionOnNavigationEvent = ((ILoader) objCq_).IAuthTabCallback;
        } else {
            if (objCq_ instanceof UpdatePackage) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objCq_).toString());
            }
            cancellationExceptionOnNavigationEvent = null;
        }
        CancellationException cancellationException = cancellationExceptionOnNavigationEvent instanceof CancellationException ? cancellationExceptionOnNavigationEvent : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new getPatch("Parent job is " + access100(objCq_), cancellationExceptionOnNavigationEvent, this);
    }

    private final Throwable onWarmupCompleted(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new getPatch(cl_(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "");
        return ((setMd5) obj).access100();
    }

    private final UpdatePackageFileType onExtraCallbackWithResult(UpdatePackage updatePackage) {
        UpdatePackageFileType updatePackageFileTypeCf_ = updatePackage.cf_();
        if (updatePackageFileTypeCf_ != null) {
            return updatePackageFileTypeCf_;
        }
        if (updatePackage instanceof CheckRequestBodyModelChannel) {
            return new UpdatePackageFileType();
        }
        if (updatePackage instanceof isPatchUpdate) {
            onExtraCallback((isPatchUpdate) updatePackage);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + updatePackage).toString());
    }

    private final boolean IAuthTabCallback(UpdatePackage updatePackage, Throwable th) throws Throwable {
        UpdatePackageFileType updatePackageFileTypeOnExtraCallbackWithResult = onExtraCallbackWithResult(updatePackage);
        if (updatePackageFileTypeOnExtraCallbackWithResult == null) {
            return false;
        }
        if (!RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, updatePackage, new onNavigationEvent(updatePackageFileTypeOnExtraCallbackWithResult, false, th))) {
            return false;
        }
        onExtraCallbackWithResult(updatePackageFileTypeOnExtraCallbackWithResult, th);
        return true;
    }

    private final Object onNavigationEvent(Object obj, Object obj2) {
        if (!(obj instanceof UpdatePackage)) {
            return setChannelIndex.onNavigationEvent;
        }
        if ((!(obj instanceof CheckRequestBodyModelChannel) && !(obj instanceof isPatchUpdate)) || (obj instanceof setTagId) || (obj2 instanceof ILoader)) {
            return onExtraCallbackWithResult((UpdatePackage) obj, obj2);
        }
        return IAuthTabCallback((UpdatePackage) obj, obj2) ? obj2 : setChannelIndex.IAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object onExtraCallbackWithResult(UpdatePackage updatePackage, Object obj) throws Throwable {
        UpdatePackageFileType updatePackageFileTypeOnExtraCallbackWithResult = onExtraCallbackWithResult(updatePackage);
        if (updatePackageFileTypeOnExtraCallbackWithResult == null) {
            return setChannelIndex.IAuthTabCallback;
        }
        onNavigationEvent onnavigationevent = updatePackage instanceof onNavigationEvent ? (onNavigationEvent) updatePackage : null;
        if (onnavigationevent == null) {
            onnavigationevent = new onNavigationEvent(updatePackageFileTypeOnExtraCallbackWithResult, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (onnavigationevent) {
            if (onnavigationevent.onExtraCallbackWithResult()) {
                return setChannelIndex.onNavigationEvent;
            }
            onnavigationevent.onExtraCallbackWithResult(true);
            if (onnavigationevent != updatePackage && !RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, updatePackage, onnavigationevent)) {
                return setChannelIndex.IAuthTabCallback;
            }
            boolean zIAuthTabCallback = onnavigationevent.IAuthTabCallback();
            ILoader iLoader = obj instanceof ILoader ? (ILoader) obj : null;
            if (iLoader != null) {
                onnavigationevent.onNavigationEvent(iLoader.IAuthTabCallback);
            }
            ?? OnNavigationEvent = zIAuthTabCallback ? 0 : onnavigationevent.onNavigationEvent();
            objectRef.element = OnNavigationEvent;
            Unit unit = Unit.INSTANCE;
            if (OnNavigationEvent != 0) {
                onExtraCallbackWithResult(updatePackageFileTypeOnExtraCallbackWithResult, (Throwable) OnNavigationEvent);
            }
            setTagId settagidIAuthTabCallback = IAuthTabCallback(updatePackageFileTypeOnExtraCallbackWithResult);
            if (settagidIAuthTabCallback != null && onNavigationEvent(onnavigationevent, settagidIAuthTabCallback, obj)) {
                return setChannelIndex.onExtraCallback;
            }
            updatePackageFileTypeOnExtraCallbackWithResult.IAuthTabCallback(2);
            setTagId settagidIAuthTabCallback2 = IAuthTabCallback(updatePackageFileTypeOnExtraCallbackWithResult);
            if (settagidIAuthTabCallback2 != null && onNavigationEvent(onnavigationevent, settagidIAuthTabCallback2, obj)) {
                return setChannelIndex.onExtraCallback;
            }
            return onWarmupCompleted(onnavigationevent, obj);
        }
    }

    private final Throwable IAuthTabCallbackDefault(Object obj) {
        ILoader iLoader = obj instanceof ILoader ? (ILoader) obj : null;
        if (iLoader != null) {
            return iLoader.IAuthTabCallback;
        }
        return null;
    }

    private final boolean onNavigationEvent(onNavigationEvent onnavigationevent, setTagId settagid, Object obj) {
        while (getFullPackage.onExtraCallback(settagid.onWarmupCompleted, false, new onWarmupCompleted(this, onnavigationevent, settagid, obj)) == setStrategy.onNavigationEvent) {
            settagid = IAuthTabCallback((jw1) settagid);
            if (settagid == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(onNavigationEvent onnavigationevent, setTagId settagid, Object obj) {
        setTagId settagidIAuthTabCallback = IAuthTabCallback((jw1) settagid);
        if (settagidIAuthTabCallback == null || !onNavigationEvent(onnavigationevent, settagidIAuthTabCallback, obj)) {
            onnavigationevent.cf_().IAuthTabCallback(2);
            setTagId settagidIAuthTabCallback2 = IAuthTabCallback((jw1) settagid);
            if (settagidIAuthTabCallback2 == null || !onNavigationEvent(onnavigationevent, settagidIAuthTabCallback2, obj)) {
                b_(onWarmupCompleted(onnavigationevent, obj));
            }
        }
    }

    private final setTagId IAuthTabCallback(jw1 jw1Var) {
        while (jw1Var.ch_()) {
            jw1Var = jw1Var.onTransact();
        }
        while (true) {
            jw1Var = jw1Var.asBinder();
            if (!jw1Var.ch_()) {
                if (jw1Var instanceof setTagId) {
                    return (setTagId) jw1Var;
                }
                if (jw1Var instanceof UpdatePackageFileType) {
                    return null;
                }
            }
        }
    }

    static final class IAuthTabCallbackDefault extends RestrictedSuspendLambda implements Function2<clearCommandLine<? super getPackageType>, access13800<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(clearCommandLine<? super getPackageType> clearcommandline, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackDefault) create(clearcommandline, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = setFullPackage.this.new IAuthTabCallbackDefault(access13800Var);
            iAuthTabCallbackDefault.L$0 = obj;
            return iAuthTabCallbackDefault;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (r7.onNavigationEvent(r1, r6) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        
            if (r4.onNavigationEvent(r7, r6) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UpdatePackageFileType updatePackageFileTypeCf_;
            clearCommandLine clearcommandline;
            ludycx ludycxVar;
            jw1 jw1VarAsBinder;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                clearCommandLine clearcommandline2 = (clearCommandLine) this.L$0;
                Object objCq_ = setFullPackage.this.cq_();
                if (objCq_ instanceof setTagId) {
                    removeCallback removecallback = ((setTagId) objCq_).onWarmupCompleted;
                    this.label = 1;
                } else if ((objCq_ instanceof UpdatePackage) && (updatePackageFileTypeCf_ = ((UpdatePackage) objCq_).cf_()) != null) {
                    Object objIAuthTabCallbackStub = updatePackageFileTypeCf_.IAuthTabCallbackStub();
                    Intrinsics.checkNotNull(objIAuthTabCallbackStub, "");
                    jw1 jw1Var = (jw1) objIAuthTabCallbackStub;
                    clearcommandline = clearcommandline2;
                    ludycxVar = updatePackageFileTypeCf_;
                    jw1VarAsBinder = jw1Var;
                    if (!Intrinsics.areEqual(jw1VarAsBinder, ludycxVar)) {
                    }
                }
            } else if (i == 1) {
                ResultKt.onNavigationEvent(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jw1VarAsBinder = (jw1) this.L$2;
                ludycxVar = (ludycx) this.L$1;
                clearcommandline = (clearCommandLine) this.L$0;
                ResultKt.onNavigationEvent(obj);
                jw1VarAsBinder = jw1VarAsBinder.asBinder();
                if (!Intrinsics.areEqual(jw1VarAsBinder, ludycxVar)) {
                    if (jw1VarAsBinder instanceof setTagId) {
                        removeCallback removecallback2 = ((setTagId) jw1VarAsBinder).onWarmupCompleted;
                        this.L$0 = clearcommandline;
                        this.L$1 = ludycxVar;
                        this.L$2 = jw1VarAsBinder;
                        this.label = 2;
                    }
                    jw1VarAsBinder = jw1VarAsBinder.asBinder();
                    if (!Intrinsics.areEqual(jw1VarAsBinder, ludycxVar)) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.getPackageType
    public final Sequence<getPackageType> cm_() {
        return clearSignalInfo.onNavigationEvent(new IAuthTabCallbackDefault(null));
    }

    @Override // o.getPackageType
    public final resumeMyRequest onExtraCallbackWithResult(@NotNull removeCallback removecallback) {
        setTagId settagid = new setTagId(removecallback);
        settagid.onExtraCallbackWithResult(this);
        while (true) {
            Object objCq_ = cq_();
            if (objCq_ instanceof CheckRequestBodyModelChannel) {
                CheckRequestBodyModelChannel checkRequestBodyModelChannel = (CheckRequestBodyModelChannel) objCq_;
                if (checkRequestBodyModelChannel.cg_()) {
                    if (RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, objCq_, settagid)) {
                        return settagid;
                    }
                } else {
                    IAuthTabCallback(checkRequestBodyModelChannel);
                }
            } else {
                if (!(objCq_ instanceof UpdatePackage)) {
                    Object objCq_2 = cq_();
                    ILoader iLoader = objCq_2 instanceof ILoader ? (ILoader) objCq_2 : null;
                    settagid.onWarmupCompleted(iLoader != null ? iLoader.IAuthTabCallback : null);
                    return setStrategy.onNavigationEvent;
                }
                UpdatePackageFileType updatePackageFileTypeCf_ = ((UpdatePackage) objCq_).cf_();
                if (updatePackageFileTypeCf_ != null) {
                    if (!updatePackageFileTypeCf_.IAuthTabCallback(settagid, 7)) {
                        boolean zIAuthTabCallback = updatePackageFileTypeCf_.IAuthTabCallback(settagid, 3);
                        Object objCq_3 = cq_();
                        if (objCq_3 instanceof onNavigationEvent) {
                            thOnNavigationEvent = ((onNavigationEvent) objCq_3).onNavigationEvent();
                        } else {
                            ILoader iLoader2 = objCq_3 instanceof ILoader ? (ILoader) objCq_3 : null;
                            if (iLoader2 != null) {
                                thOnNavigationEvent = iLoader2.IAuthTabCallback;
                            }
                        }
                        settagid.onWarmupCompleted(thOnNavigationEvent);
                        if (!zIAuthTabCallback) {
                            return setStrategy.onNavigationEvent;
                        }
                    }
                    return settagid;
                }
                Intrinsics.checkNotNull(objCq_, "");
                onExtraCallback((isPatchUpdate) objCq_);
            }
        }
    }

    public void onExtraCallbackWithResult(@NotNull Throwable th) throws Throwable {
        throw th;
    }

    public String toString() {
        return onMessageChannelReady() + '@' + getResCount.onExtraCallbackWithResult(this);
    }

    public final String onMessageChannelReady() {
        return ck_() + '{' + access100(cq_()) + '}';
    }

    public String ck_() {
        return getResCount.IAuthTabCallback(this);
    }

    private final String access100(Object obj) {
        if (!(obj instanceof onNavigationEvent)) {
            return obj instanceof UpdatePackage ? ((UpdatePackage) obj).cg_() ? "Active" : "New" : obj instanceof ILoader ? "Cancelled" : "Completed";
        }
        onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
        return onnavigationevent.IAuthTabCallback() ? "Cancelling" : onnavigationevent.onExtraCallbackWithResult() ? "Completing" : "Active";
    }

    static final class onNavigationEvent implements UpdatePackage {
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;
        private final UpdatePackageFileType onNavigationEvent;
        private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(onNavigationEvent.class, "_isCompleting$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallbackWithResult = AtomicReferenceFieldUpdater.newUpdater(onNavigationEvent.class, Object.class, "_rootCause$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater IAuthTabCallback = AtomicReferenceFieldUpdater.newUpdater(onNavigationEvent.class, Object.class, "_exceptionsHolder$volatile");

        @Override // o.UpdatePackage
        public UpdatePackageFileType cf_() {
            return this.onNavigationEvent;
        }

        public onNavigationEvent(@NotNull UpdatePackageFileType updatePackageFileType, boolean z, @Nullable Throwable th) {
            this.onNavigationEvent = updatePackageFileType;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        public final boolean onExtraCallbackWithResult() {
            return onExtraCallback.get(this) == 1;
        }

        public final void onExtraCallbackWithResult(boolean z) {
            onExtraCallback.set(this, z ? 1 : 0);
        }

        public final Throwable onNavigationEvent() {
            return (Throwable) onExtraCallbackWithResult.get(this);
        }

        public final void onExtraCallback(@Nullable Throwable th) {
            onExtraCallbackWithResult.set(this, th);
        }

        private final Object asInterface() {
            return IAuthTabCallback.get(this);
        }

        private final void IAuthTabCallback(Object obj) {
            IAuthTabCallback.set(this, obj);
        }

        public final boolean IAuthTabCallbackDefault() {
            return asInterface() == setChannelIndex.IAuthTabCallbackDefault;
        }

        public final boolean IAuthTabCallback() {
            return onNavigationEvent() != null;
        }

        @Override // o.UpdatePackage
        public boolean cg_() {
            return onNavigationEvent() == null;
        }

        public final List<Throwable> IAuthTabCallback(@Nullable Throwable th) {
            ArrayList<Throwable> arrayListAsBinder;
            Object objAsInterface = asInterface();
            if (objAsInterface == null) {
                arrayListAsBinder = asBinder();
            } else if (objAsInterface instanceof Throwable) {
                ArrayList<Throwable> arrayListAsBinder2 = asBinder();
                arrayListAsBinder2.add(objAsInterface);
                arrayListAsBinder = arrayListAsBinder2;
            } else {
                if (!(objAsInterface instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objAsInterface).toString());
                }
                arrayListAsBinder = (ArrayList) objAsInterface;
            }
            Throwable thOnNavigationEvent = onNavigationEvent();
            if (thOnNavigationEvent != null) {
                arrayListAsBinder.add(0, thOnNavigationEvent);
            }
            if (th != null && !Intrinsics.areEqual(th, thOnNavigationEvent)) {
                arrayListAsBinder.add(th);
            }
            IAuthTabCallback(setChannelIndex.IAuthTabCallbackDefault);
            return arrayListAsBinder;
        }

        public final void onNavigationEvent(@NotNull Throwable th) {
            Throwable thOnNavigationEvent = onNavigationEvent();
            if (thOnNavigationEvent == null) {
                onExtraCallback(th);
                return;
            }
            if (th != thOnNavigationEvent) {
                Object objAsInterface = asInterface();
                if (objAsInterface == null) {
                    IAuthTabCallback((Object) th);
                    return;
                }
                if (objAsInterface instanceof Throwable) {
                    if (th == objAsInterface) {
                        return;
                    }
                    ArrayList<Throwable> arrayListAsBinder = asBinder();
                    arrayListAsBinder.add(objAsInterface);
                    arrayListAsBinder.add(th);
                    IAuthTabCallback(arrayListAsBinder);
                    return;
                }
                if (objAsInterface instanceof ArrayList) {
                    ((ArrayList) objAsInterface).add(th);
                    return;
                }
                throw new IllegalStateException(("State is " + objAsInterface).toString());
            }
        }

        private final ArrayList<Throwable> asBinder() {
            return new ArrayList<>(4);
        }

        public String toString() {
            return "Finishing[cancelling=" + IAuthTabCallback() + ", completing=" + onExtraCallbackWithResult() + ", rootCause=" + onNavigationEvent() + ", exceptions=" + asInterface() + ", list=" + cf_() + ']';
        }
    }

    static final class onWarmupCompleted extends isPatchUpdate {
        private final setTagId onExtraCallback;
        private final onNavigationEvent onExtraCallbackWithResult;
        private final Object onNavigationEvent;
        private final setFullPackage onWarmupCompleted;

        @Override // o.isPatchUpdate
        public boolean onExtraCallback() {
            return false;
        }

        public onWarmupCompleted(@NotNull setFullPackage setfullpackage, @NotNull onNavigationEvent onnavigationevent, @NotNull setTagId settagid, @Nullable Object obj) {
            this.onWarmupCompleted = setfullpackage;
            this.onExtraCallbackWithResult = onnavigationevent;
            this.onExtraCallback = settagid;
            this.onNavigationEvent = obj;
        }

        @Override // o.isPatchUpdate
        public void onWarmupCompleted(@Nullable Throwable th) {
            this.onWarmupCompleted.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, this.onNavigationEvent);
        }
    }

    static final class IAuthTabCallback<T> extends setResourceInternal<T> {
        private final setFullPackage onExtraCallback;

        public IAuthTabCallback(@NotNull access13800<? super T> access13800Var, @NotNull setFullPackage setfullpackage) {
            super(access13800Var, 1);
            this.onExtraCallback = setfullpackage;
        }

        @Override // o.setResourceInternal
        public Throwable onWarmupCompleted(@NotNull getPackageType getpackagetype) {
            Throwable thOnNavigationEvent;
            Object objCq_ = this.onExtraCallback.cq_();
            return (!(objCq_ instanceof onNavigationEvent) || (thOnNavigationEvent = ((onNavigationEvent) objCq_).onNavigationEvent()) == null) ? objCq_ instanceof ILoader ? ((ILoader) objCq_).IAuthTabCallback : getpackagetype.asBinder() : thOnNavigationEvent;
        }

        @Override // o.setResourceInternal
        protected String asBinder() {
            return "AwaitContinuation";
        }
    }

    public final Throwable ce_() {
        Object objCq_ = cq_();
        if (objCq_ instanceof UpdatePackage) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return IAuthTabCallbackDefault(objCq_);
    }

    public final Object getInterfaceDescriptor() throws Throwable {
        Object objCq_ = cq_();
        if (objCq_ instanceof UpdatePackage) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objCq_ instanceof ILoader) {
            throw ((ILoader) objCq_).IAuthTabCallback;
        }
        return setChannelIndex.IAuthTabCallback(objCq_);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object a_(@NotNull access13800<Object> access13800Var) throws Throwable {
        Object objCq_;
        do {
            objCq_ = cq_();
            if (!(objCq_ instanceof UpdatePackage)) {
                if (!(objCq_ instanceof ILoader)) {
                    return setChannelIndex.IAuthTabCallback(objCq_);
                }
                throw ((ILoader) objCq_).IAuthTabCallback;
            }
        } while (asInterface(objCq_) < 0);
        return IAuthTabCallback(access13800Var);
    }

    private final Object IAuthTabCallback(access13800<Object> access13800Var) {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access14200.onExtraCallbackWithResult(access13800Var), this);
        iAuthTabCallback.onTransact();
        maybeAddAttachStateListener.onExtraCallbackWithResult(iAuthTabCallback, isFullUpdate.onExtraCallback(this, false, new ResumeAwaitOnCompletion(iAuthTabCallback), 1, null));
        Object objIAuthTabCallbackDefault = iAuthTabCallback.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }

    final /* synthetic */ class asInterface extends FunctionReferenceImpl implements getBacktraceNote<setFullPackage, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> {
        public static final asInterface IAuthTabCallback = new asInterface();

        asInterface() {
            super(3, setFullPackage.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Unit invoke(setFullPackage setfullpackage, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            onExtraCallback(setfullpackage, jni_ygnodestylegetborderjni, obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(setFullPackage setfullpackage, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
            setfullpackage.IAuthTabCallback(jni_ygnodestylegetborderjni, obj);
        }
    }

    final /* synthetic */ class onTransact extends FunctionReferenceImpl implements getBacktraceNote<setFullPackage, Object, Object, Object> {
        public static final onTransact IAuthTabCallback = new onTransact();

        onTransact() {
            super(3, setFullPackage.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.getBacktraceNote
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setFullPackage setfullpackage, Object obj, Object obj2) {
            return setfullpackage.IAuthTabCallback(obj, obj2);
        }
    }

    protected final jni_YGNodeStyleGetAlignItemsJNI<?> extraCallback() {
        asInterface asinterface = asInterface.IAuthTabCallback;
        Intrinsics.checkNotNull(asinterface, "");
        getBacktraceNote getbacktracenote = (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(asinterface, 3);
        onTransact ontransact = onTransact.IAuthTabCallback;
        Intrinsics.checkNotNull(ontransact, "");
        return new jni_YGNodeStyleGetAlignSelfJNI(this, getbacktracenote, (getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(ontransact, 3), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallback(jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
        Object objCq_;
        do {
            objCq_ = cq_();
            if (!(objCq_ instanceof UpdatePackage)) {
                if (!(objCq_ instanceof ILoader)) {
                    objCq_ = setChannelIndex.IAuthTabCallback(objCq_);
                }
                jni_ygnodestylegetborderjni.onExtraCallback(objCq_);
                return;
            }
        } while (asInterface(objCq_) < 0);
        jni_ygnodestylegetborderjni.onExtraCallbackWithResult(isFullUpdate.onExtraCallback(this, false, new onExtraCallbackWithResult(jni_ygnodestylegetborderjni), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IAuthTabCallback(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof ILoader) {
            throw ((ILoader) obj2).IAuthTabCallback;
        }
        return obj2;
    }

    final class onExtraCallbackWithResult extends isPatchUpdate {
        private final jni_YGNodeStyleGetBorderJNI<?> onExtraCallback;

        @Override // o.isPatchUpdate
        public boolean onExtraCallback() {
            return false;
        }

        public onExtraCallbackWithResult(@NotNull jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni) {
            this.onExtraCallback = jni_ygnodestylegetborderjni;
        }

        @Override // o.isPatchUpdate
        public void onWarmupCompleted(@Nullable Throwable th) {
            Object objCq_ = setFullPackage.this.cq_();
            if (!(objCq_ instanceof ILoader)) {
                objCq_ = setChannelIndex.IAuthTabCallback(objCq_);
            }
            this.onExtraCallback.onExtraCallbackWithResult(setFullPackage.this, objCq_);
        }
    }

    @Override // o.getPackageType
    public final boolean IAuthTabCallback_Parcel() {
        int iAsInterface;
        do {
            iAsInterface = asInterface(cq_());
            if (iAsInterface == 0) {
                return false;
            }
        } while (iAsInterface != 1);
        return true;
    }

    private final boolean onActivityLayout() {
        Object objCq_;
        do {
            objCq_ = cq_();
            if (!(objCq_ instanceof UpdatePackage)) {
                return false;
            }
        } while (asInterface(objCq_) < 0);
        return true;
    }

    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        maybeAddAttachStateListener.onExtraCallbackWithResult(setresourceinternal, isFullUpdate.onExtraCallback(this, false, new ResumeOnCompletion(setresourceinternal), 1, null));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault == access14100.onExtraCallback() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
    }

    public final void IAuthTabCallback(@NotNull isPatchUpdate ispatchupdate) {
        Object objCq_;
        do {
            objCq_ = cq_();
            if (!(objCq_ instanceof isPatchUpdate)) {
                if (!(objCq_ instanceof UpdatePackage) || ((UpdatePackage) objCq_).cf_() == null) {
                    return;
                }
                ispatchupdate.ci_();
                return;
            }
            if (objCq_ != ispatchupdate) {
                return;
            }
        } while (!RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, objCq_, setChannelIndex.onExtraCallbackWithResult));
    }

    @Override // o.getPackageType
    public void onNavigationEvent(@Nullable CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new getPatch(cl_(), null, this);
        }
        onNavigationEvent((Throwable) cancellationException);
    }

    private final Object onNavigationEvent(Object obj) {
        Object objOnNavigationEvent;
        do {
            Object objCq_ = cq_();
            if (!(objCq_ instanceof UpdatePackage) || ((objCq_ instanceof onNavigationEvent) && ((onNavigationEvent) objCq_).onExtraCallbackWithResult())) {
                return setChannelIndex.onNavigationEvent;
            }
            objOnNavigationEvent = onNavigationEvent(objCq_, new ILoader(onWarmupCompleted(obj), false, 2, null));
        } while (objOnNavigationEvent == setChannelIndex.IAuthTabCallback);
        return objOnNavigationEvent;
    }

    private final Object onTransact(Object obj) throws Throwable {
        Throwable thOnWarmupCompleted = null;
        while (true) {
            Object objCq_ = cq_();
            if (!(objCq_ instanceof onNavigationEvent)) {
                if (!(objCq_ instanceof UpdatePackage)) {
                    return setChannelIndex.onTransact;
                }
                if (thOnWarmupCompleted == null) {
                    thOnWarmupCompleted = onWarmupCompleted(obj);
                }
                UpdatePackage updatePackage = (UpdatePackage) objCq_;
                if (updatePackage.cg_()) {
                    if (IAuthTabCallback(updatePackage, thOnWarmupCompleted)) {
                        return setChannelIndex.onNavigationEvent;
                    }
                } else {
                    Object objOnNavigationEvent = onNavigationEvent(objCq_, new ILoader(thOnWarmupCompleted, false, 2, null));
                    if (objOnNavigationEvent != setChannelIndex.onNavigationEvent) {
                        if (objOnNavigationEvent != setChannelIndex.IAuthTabCallback) {
                            return objOnNavigationEvent;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + objCq_).toString());
                    }
                }
            } else {
                synchronized (objCq_) {
                    if (((onNavigationEvent) objCq_).IAuthTabCallbackDefault()) {
                        return setChannelIndex.onTransact;
                    }
                    boolean zIAuthTabCallback = ((onNavigationEvent) objCq_).IAuthTabCallback();
                    if (obj != null || !zIAuthTabCallback) {
                        if (thOnWarmupCompleted == null) {
                            thOnWarmupCompleted = onWarmupCompleted(obj);
                        }
                        ((onNavigationEvent) objCq_).onNavigationEvent(thOnWarmupCompleted);
                    }
                    Throwable thOnNavigationEvent = zIAuthTabCallback ? null : ((onNavigationEvent) objCq_).onNavigationEvent();
                    if (thOnNavigationEvent != null) {
                        onExtraCallbackWithResult(((onNavigationEvent) objCq_).cf_(), thOnNavigationEvent);
                    }
                    return setChannelIndex.onNavigationEvent;
                }
            }
        }
    }

    public final boolean IAuthTabCallbackStub(@Nullable Object obj) {
        Object objOnNavigationEvent;
        do {
            objOnNavigationEvent = onNavigationEvent(cq_(), obj);
            if (objOnNavigationEvent == setChannelIndex.onNavigationEvent) {
                return false;
            }
            if (objOnNavigationEvent == setChannelIndex.onExtraCallback) {
                return true;
            }
        } while (objOnNavigationEvent == setChannelIndex.IAuthTabCallback);
        b_(objOnNavigationEvent);
        return true;
    }

    public final Object asBinder(@Nullable Object obj) {
        Object objOnNavigationEvent;
        do {
            objOnNavigationEvent = onNavigationEvent(cq_(), obj);
            if (objOnNavigationEvent == setChannelIndex.onNavigationEvent) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, IAuthTabCallbackDefault(obj));
            }
        } while (objOnNavigationEvent == setChannelIndex.IAuthTabCallback);
        return objOnNavigationEvent;
    }
}
