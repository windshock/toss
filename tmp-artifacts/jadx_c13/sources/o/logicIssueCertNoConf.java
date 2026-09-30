package o;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.certGetOCSPAddress;
import o.logicIssueCertSendConf;
import o.logicRenewCertKur;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicIssueCertNoConf<E extends certGetOCSPAddress> extends logicIssueCertResult<E> {
    public Function2<? super logicIssueCertMakePOPOSigningInputMsg<E>, ? super access13800<? super logicIssueClose>, ? extends Object> onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logicIssueCertNoConf(@Nullable String str, @NotNull generateAesIV generateaesiv) {
        super(str, generateaesiv);
        Intrinsics.checkNotNullParameter(generateaesiv, "");
    }

    public final void onNavigationEvent(@NotNull Function2<? super logicIssueCertMakePOPOSigningInputMsg<E>, ? super access13800<? super logicIssueClose>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.onExtraCallbackWithResult = function2;
    }

    public final Function2<logicIssueCertMakePOPOSigningInputMsg<E>, access13800<? super logicIssueClose>, Object> onWarmupCompleted() {
        Function2<? super logicIssueCertMakePOPOSigningInputMsg<E>, ? super access13800<? super logicIssueClose>, ? extends Object> function2 = this.onExtraCallbackWithResult;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        return null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<logicRenewCertKur<E>, access13800<? super logicIssueClose>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ logicIssueCertNoConf<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(logicIssueCertNoConf<E> logicissuecertnoconf, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.this$0 = logicissuecertnoconf;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, access13800Var);
            onwarmupcompleted.L$0 = obj;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(logicRenewCertKur<E> logicrenewcertkur, access13800<? super logicIssueClose> access13800Var) {
            return ((onWarmupCompleted) create(logicrenewcertkur, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r5 != r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        
            if (r5 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.onNavigationEvent(obj);
                    return (logicIssueClose) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return (logicIssueClose) obj;
            }
            ResultKt.onNavigationEvent(obj);
            logicRenewCertKur logicrenewcertkur = (logicRenewCertKur) this.L$0;
            if (logicrenewcertkur instanceof logicRenewCertKur.onExtraCallback) {
                Function2<logicIssueCertMakePOPOSigningInputMsg<E>, access13800<? super logicIssueClose>, Object> function2OnWarmupCompleted = this.this$0.onWarmupCompleted();
                logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsgOnNavigationEvent = ((logicRenewCertKur.onExtraCallback) logicrenewcertkur).onNavigationEvent();
                this.label = 1;
                obj = function2OnWarmupCompleted.invoke(logicissuecertmakepoposigninginputmsgOnNavigationEvent, this);
            } else {
                if (logicrenewcertkur instanceof logicRenewCertKur.IAuthTabCallback) {
                    return logicRenewCertKup.onWarmupCompleted();
                }
                if (!(logicrenewcertkur instanceof logicRenewCertKur.onExtraCallbackWithResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                Function2<logicIssueCertMakePOPOSigningInputMsg<E>, access13800<? super logicIssueClose>, Object> function2OnWarmupCompleted2 = this.this$0.onWarmupCompleted();
                logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult = ((logicRenewCertKur.onExtraCallbackWithResult) logicrenewcertkur).onExtraCallbackWithResult();
                this.label = 2;
                obj = function2OnWarmupCompleted2.invoke(logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult, this);
            }
            return objOnExtraCallback;
        }
    }

    public logicIssueCertSendConf<E> IAuthTabCallback() {
        logicIssueCertIrIp logicissuecertirip = new logicIssueCertIrIp(IAuthTabCallbackStub(), onNavigationEvent(), asBinder(), onExtraCallback(), asInterface(), new onWarmupCompleted(this, null));
        Iterator<T> it = onExtraCallbackWithResult().iterator();
        while (it.hasNext()) {
            logicissuecertirip.onExtraCallbackWithResult((logicIssueCertSendConf.IAuthTabCallback) it.next());
        }
        return logicissuecertirip;
    }
}
