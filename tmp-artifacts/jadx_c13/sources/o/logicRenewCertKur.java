package o;

import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.certGetOCSPAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class logicRenewCertKur<E extends certGetOCSPAddress> {
    public /* synthetic */ logicRenewCertKur(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object IAuthTabCallback(@Nullable generateAesIV generateaesiv, @NotNull access13800<? super logicIssueClose> access13800Var);

    private logicRenewCertKur() {
    }

    public static final class onExtraCallback<E extends certGetOCSPAddress> extends logicRenewCertKur<E> {
        private final logicIssueCertMakePOPOSigningInputMsg<E> onNavigationEvent;

        static final class onWarmupCompleted extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ onExtraCallback<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(onExtraCallback<E> onextracallback, access13800<? super onWarmupCompleted> access13800Var) {
                super(access13800Var);
                this.this$0 = onextracallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.IAuthTabCallback(null, this);
            }
        }

        public final logicIssueCertMakePOPOSigningInputMsg<E> onNavigationEvent() {
            return this.onNavigationEvent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg) {
            super(null);
            Intrinsics.checkNotNullParameter(logicissuecertmakepoposigninginputmsg, "");
            this.onNavigationEvent = logicissuecertmakepoposigninginputmsg;
        }

        public Object onWarmupCompleted(@NotNull generateAesIV generateaesiv, @NotNull access13800<? super logicIssueClose> access13800Var) {
            return logicRenewCertKup.IAuthTabCallback(this.onNavigationEvent, generateaesiv, access13800Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.logicRenewCertKur
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object IAuthTabCallback(@Nullable generateAesIV generateaesiv, @NotNull access13800<? super logicIssueClose> access13800Var) {
            onWarmupCompleted onwarmupcompleted;
            if (access13800Var instanceof onWarmupCompleted) {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i = onwarmupcompleted.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(this, access13800Var);
                }
            }
            Object objOnWarmupCompleted = onwarmupcompleted.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = onwarmupcompleted.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                if (generateaesiv != null) {
                    onwarmupcompleted.label = 1;
                    objOnWarmupCompleted = onWarmupCompleted(generateaesiv, onwarmupcompleted);
                    if (objOnWarmupCompleted == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
                return logicRenewCertKup.onNavigationEvent();
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            logicIssueClose logicissueclose = (logicIssueClose) objOnWarmupCompleted;
            if (logicissueclose != null) {
                return logicissueclose;
            }
            return logicRenewCertKup.onNavigationEvent();
        }
    }

    public static final class IAuthTabCallback<E extends certGetOCSPAddress> extends logicRenewCertKur<E> {

        static final class onExtraCallbackWithResult extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ IAuthTabCallback<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(IAuthTabCallback<E> iAuthTabCallback, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(access13800Var);
                this.this$0 = iAuthTabCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.IAuthTabCallback(null, this);
            }
        }

        public IAuthTabCallback() {
            super(null);
        }

        public Object onWarmupCompleted(@NotNull generateAesIV generateaesiv, @NotNull access13800<? super logicIssueClose> access13800Var) {
            return logicRenewCertKup.onExtraCallback(generateaesiv);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.logicRenewCertKur
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object IAuthTabCallback(@Nullable generateAesIV generateaesiv, @NotNull access13800<? super logicIssueClose> access13800Var) {
            onExtraCallbackWithResult onextracallbackwithresult;
            if (access13800Var instanceof onExtraCallbackWithResult) {
                onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
                int i = onextracallbackwithresult.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onextracallbackwithresult.label = i - 2147483648;
                } else {
                    onextracallbackwithresult = new onExtraCallbackWithResult(this, access13800Var);
                }
            }
            Object objOnWarmupCompleted = onextracallbackwithresult.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = onextracallbackwithresult.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                if (generateaesiv != null) {
                    onextracallbackwithresult.label = 1;
                    objOnWarmupCompleted = onWarmupCompleted(generateaesiv, onextracallbackwithresult);
                    if (objOnWarmupCompleted == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
                return logicRenewCertKup.onNavigationEvent();
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            logicIssueClose logicissueclose = (logicIssueClose) objOnWarmupCompleted;
            if (logicissueclose != null) {
                return logicissueclose;
            }
            return logicRenewCertKup.onNavigationEvent();
        }
    }

    public static final class onExtraCallbackWithResult<E extends certGetOCSPAddress> extends logicRenewCertKur<E> {
        private final logicIssueCertMakePOPOSigningInputMsg<E> onExtraCallback;

        static final class IAuthTabCallback extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ onExtraCallbackWithResult<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(onExtraCallbackWithResult<E> onextracallbackwithresult, access13800<? super IAuthTabCallback> access13800Var) {
                super(access13800Var);
                this.this$0 = onextracallbackwithresult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.IAuthTabCallback(null, this);
            }
        }

        public final logicIssueCertMakePOPOSigningInputMsg<E> onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public Object onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv, @NotNull access13800<? super logicIssueClose> access13800Var) {
            return logicRenewCertKup.onExtraCallback(generateaesiv);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.logicRenewCertKur
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object IAuthTabCallback(@Nullable generateAesIV generateaesiv, @NotNull access13800<? super logicIssueClose> access13800Var) {
            IAuthTabCallback iAuthTabCallback;
            if (access13800Var instanceof IAuthTabCallback) {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                int i = iAuthTabCallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallback.label = i - 2147483648;
                } else {
                    iAuthTabCallback = new IAuthTabCallback(this, access13800Var);
                }
            }
            Object objOnExtraCallbackWithResult = iAuthTabCallback.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = iAuthTabCallback.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                if (generateaesiv != null) {
                    iAuthTabCallback.label = 1;
                    objOnExtraCallbackWithResult = onExtraCallbackWithResult(generateaesiv, iAuthTabCallback);
                    if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
                return logicRenewCertKup.onNavigationEvent();
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            logicIssueClose logicissueclose = (logicIssueClose) objOnExtraCallbackWithResult;
            if (logicissueclose != null) {
                return logicissueclose;
            }
            return logicRenewCertKup.onNavigationEvent();
        }
    }
}
