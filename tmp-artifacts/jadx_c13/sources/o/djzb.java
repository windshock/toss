package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import o.djzb;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class djzb<T> extends ContinuationImpl implements setRipple<T> {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final setRipple<T> collector;
    private access13800<? super Unit> completion_;
    private CoroutineContext lastEmissionContext;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onExtraCallback(int i, CoroutineContext.Element element) {
        return i + 1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, o.access14900
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public djzb(@NotNull setRipple<? super T> setripple, @NotNull CoroutineContext coroutineContext) {
        super(ycx2.onWarmupCompleted, access13600.IAuthTabCallback);
        this.collector = setripple;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(djzb.onExtraCallback(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, o.access14900
    public access14900 getCallerFrame() {
        access13800<? super Unit> access13800Var = this.completion_;
        if (access13800Var instanceof access14900) {
            return (access14900) access13800Var;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, o.access13800
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? access13600.IAuthTabCallback : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(@NotNull Object obj) {
        Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(obj);
        if (thM32exceptionOrNullimpl != null) {
            this.lastEmissionContext = new syalud(thM32exceptionOrNullimpl, getContext());
        }
        access13800<? super Unit> access13800Var = this.completion_;
        if (access13800Var != null) {
            access13800Var.resumeWith(obj);
        }
        return access14100.onExtraCallback();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // o.setRipple
    public Object emit(T t, @NotNull access13800<? super Unit> access13800Var) {
        try {
            Object objOnNavigationEvent = onNavigationEvent(access13800Var, t);
            if (objOnNavigationEvent == access14100.onExtraCallback()) {
                access14600.IAuthTabCallback(access13800Var);
            }
            return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new syalud(th, access13800Var.getContext());
            throw th;
        }
    }

    private final Object onNavigationEvent(access13800<? super Unit> access13800Var, T t) {
        CoroutineContext context = access13800Var.getContext();
        getFullPackage.IAuthTabCallback(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            onNavigationEvent(context, coroutineContext, t);
            this.lastEmissionContext = context;
        }
        this.completion_ = access13800Var;
        getBacktraceNote getbacktracenote = dj1.onExtraCallback;
        setRipple<T> setripple = this.collector;
        Intrinsics.checkNotNull(setripple, "");
        Intrinsics.checkNotNull(this, "");
        Object objInvoke = getbacktracenote.invoke(setripple, t, this);
        if (!Intrinsics.areEqual(objInvoke, access14100.onExtraCallback())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    private final void onNavigationEvent(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof syalud) {
            IAuthTabCallback((syalud) coroutineContext2, t);
        }
        getDividerDrawableHorizontal.onNavigationEvent(this, coroutineContext);
    }

    private final void IAuthTabCallback(syalud syaludVar, Object obj) {
        throw new IllegalStateException(StringsKt__IndentKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + syaludVar.onExtraCallback + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
