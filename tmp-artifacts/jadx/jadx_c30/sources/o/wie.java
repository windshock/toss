package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class wie {
    public volatile WeakReference<access14900> _lastObservedFrame;
    public volatile String _state;
    public volatile Thread lastObservedThread;
    private final WeakReference<CoroutineContext> onExtraCallback;
    private final ycx onExtraCallbackWithResult;
    public final long onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return wie.this.onExtraCallback(null, null, this);
        }
    }

    public final ycx onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final CoroutineContext onExtraCallbackWithResult() {
        return this.onExtraCallback.get();
    }

    public final List<StackTraceElement> IAuthTabCallback() {
        return IAuthTabCallbackDefault();
    }

    public final String onExtraCallback() {
        return this._state;
    }

    public final access14900 onNavigationEvent() {
        WeakReference<access14900> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final List<StackTraceElement> onTransact() {
        access14900 access14900VarOnNavigationEvent = onNavigationEvent();
        if (access14900VarOnNavigationEvent == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (access14900VarOnNavigationEvent != null) {
            StackTraceElement stackTraceElement = access14900VarOnNavigationEvent.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            access14900VarOnNavigationEvent = access14900VarOnNavigationEvent.getCallerFrame();
        }
        return arrayList;
    }

    private final List<StackTraceElement> IAuthTabCallbackDefault() {
        ycx ycxVar = this.onExtraCallbackWithResult;
        return ycxVar == null ? CollectionsKt.emptyList() : clearRevision.access000(clearRevision.onWarmupCompleted(new IAuthTabCallback(ycxVar, null)));
    }

    static final class IAuthTabCallback extends RestrictedSuspendLambda implements Function2<clearCommandLine<? super StackTraceElement>, access13800<? super Unit>, Object> {
        final /* synthetic */ ycx $bottom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(ycx ycxVar, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$bottom = ycxVar;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallback iAuthTabCallback = wie.this.new IAuthTabCallback(this.$bottom, access13800Var);
            iAuthTabCallback.L$0 = obj;
            return iAuthTabCallback;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(clearCommandLine<? super StackTraceElement> clearcommandline, access13800<? super Unit> access13800Var) {
            return create(clearcommandline, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                clearCommandLine clearcommandline = (clearCommandLine) this.L$0;
                wie wieVar = wie.this;
                access14900 callerFrame = this.$bottom.getCallerFrame();
                this.label = 1;
                if (wieVar.onExtraCallback(clearcommandline, callerFrame, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004b -> B:25:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:24:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(clearCommandLine<? super StackTraceElement> clearcommandline, access14900 access14900Var, access13800<? super Unit> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        access14900 callerFrame;
        wie wieVar;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i = onextracallbackwithresult.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                onextracallbackwithresult.label = i + PKIFailureInfo.systemUnavail;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = onextracallbackwithresult.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            callerFrame = access14900Var;
            wieVar = this;
            if (callerFrame == null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wie wieVar2 = (wie) onextracallbackwithresult.L$2;
            access14900 access14900Var2 = (access14900) onextracallbackwithresult.L$1;
            clearCommandLine<? super StackTraceElement> clearcommandline2 = (clearCommandLine) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(obj);
            callerFrame = access14900Var2;
            wieVar = wieVar2;
            clearcommandline = clearcommandline2;
            callerFrame = callerFrame.getCallerFrame();
            if (callerFrame == null) {
                return Unit.INSTANCE;
            }
            if (callerFrame == null) {
                StackTraceElement stackTraceElement = callerFrame.getStackTraceElement();
                if (stackTraceElement != null) {
                    onextracallbackwithresult.L$0 = clearcommandline;
                    onextracallbackwithresult.L$1 = callerFrame;
                    onextracallbackwithresult.L$2 = wieVar;
                    onextracallbackwithresult.label = 1;
                    if (clearcommandline.onNavigationEvent(stackTraceElement, onextracallbackwithresult) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    clearcommandline2 = clearcommandline;
                    wieVar2 = wieVar;
                    access14900Var2 = callerFrame;
                    callerFrame = access14900Var2;
                    wieVar = wieVar2;
                    clearcommandline = clearcommandline2;
                }
                callerFrame = callerFrame.getCallerFrame();
                if (callerFrame == null) {
                }
                if (callerFrame == null) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + onExtraCallback() + ",context=" + onExtraCallbackWithResult() + ')';
    }
}
