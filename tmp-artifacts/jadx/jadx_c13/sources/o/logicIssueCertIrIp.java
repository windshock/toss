package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.certGetOCSPAddress;
import o.logicIssueCertSendConf;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicIssueCertIrIp<E extends certGetOCSPAddress> implements logicIssueCertGenmGenp<E> {
    private final Set<logicIssueCertSendConf.IAuthTabCallback> IAuthTabCallback;
    private Function2<? super logicRenewCertKur<E>, ? super access13800<? super logicIssueClose>, ? extends Object> asBinder;
    private final certSetTrustRootCACert onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final certGetCertValidityNotAfter<E> onNavigationEvent;
    private final logicRenewCertResult onTransact;
    private final cryptVerifySignatureValue onWarmupCompleted;

    @Override // o.logicIssueCertSendConf
    public Object IAuthTabCallback(@NotNull certGetOCSPAddress certgetocspaddress, @NotNull access13800<? super Boolean> access13800Var) {
        return onExtraCallback(this, certgetocspaddress, access13800Var);
    }

    @Override // o.logicIssueCertGenmGenp
    public Object onWarmupCompleted(@NotNull logicRenewCertKur<E> logicrenewcertkur, @NotNull access13800<? super logicIssueClose> access13800Var) {
        return IAuthTabCallback(this, logicrenewcertkur, access13800Var);
    }

    public logicIssueCertIrIp(@Nullable String str, @NotNull certGetCertValidityNotAfter<E> certgetcertvaliditynotafter, @NotNull logicRenewCertResult logicrenewcertresult, @NotNull generateAesIV generateaesiv, @Nullable certSetTrustRootCACert certsettrustrootcacert) {
        Intrinsics.checkNotNullParameter(certgetcertvaliditynotafter, "");
        Intrinsics.checkNotNullParameter(logicrenewcertresult, "");
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = certgetcertvaliditynotafter;
        this.onTransact = logicrenewcertresult;
        this.onExtraCallback = certsettrustrootcacert;
        this.IAuthTabCallback = new LinkedHashSet();
        this.onWarmupCompleted = (cryptVerifySignatureValue) generateaesiv;
        this.asBinder = new onExtraCallbackWithResult(null);
    }

    @Override // o.logicIssueCertSendConf
    public String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.logicIssueCertSendConf
    public certGetCertValidityNotAfter<E> onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.logicIssueCertSendConf
    public logicRenewCertResult IAuthTabCallbackStub() {
        return this.onTransact;
    }

    @Override // o.logicIssueCertSendConf
    public certSetTrustRootCACert IAuthTabCallback() {
        return this.onExtraCallback;
    }

    /* renamed from: o.logicIssueCertIrIp$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<logicRenewCertKur<E>, access13800<? super logicIssueClose>, Object> {
        final /* synthetic */ generateAesIV $targetState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(generateAesIV generateaesiv, access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
            this.$targetState = generateaesiv;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$targetState, access13800Var);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(logicRenewCertKur<E> logicrenewcertkur, access13800<? super logicIssueClose> access13800Var) {
            return ((AnonymousClass5) create(logicrenewcertkur, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            logicRenewCertKur logicrenewcertkur = (logicRenewCertKur) this.L$0;
            generateAesIV generateaesiv = this.$targetState;
            this.label = 1;
            Object objIAuthTabCallback = logicrenewcertkur.IAuthTabCallback(generateaesiv, this);
            return objIAuthTabCallback == objOnExtraCallback ? objOnExtraCallback : objIAuthTabCallback;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public logicIssueCertIrIp(@Nullable String str, @NotNull certGetCertValidityNotAfter<E> certgetcertvaliditynotafter, @NotNull logicRenewCertResult logicrenewcertresult, @Nullable certSetTrustRootCACert certsettrustrootcacert, @NotNull generateAesIV generateaesiv, @Nullable generateAesIV generateaesiv2) {
        this(str, certgetcertvaliditynotafter, logicrenewcertresult, generateaesiv, certsettrustrootcacert);
        Intrinsics.checkNotNullParameter(certgetcertvaliditynotafter, "");
        Intrinsics.checkNotNullParameter(logicrenewcertresult, "");
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        this.asBinder = new AnonymousClass5(generateaesiv2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public logicIssueCertIrIp(@Nullable String str, @NotNull certGetCertValidityNotAfter<E> certgetcertvaliditynotafter, @NotNull logicRenewCertResult logicrenewcertresult, @Nullable certSetTrustRootCACert certsettrustrootcacert, @NotNull generateAesIV generateaesiv, @NotNull Function2<? super logicRenewCertKur<E>, ? super access13800<? super logicIssueClose>, ? extends Object> function2) {
        this(str, certgetcertvaliditynotafter, logicrenewcertresult, generateaesiv, certsettrustrootcacert);
        Intrinsics.checkNotNullParameter(certgetcertvaliditynotafter, "");
        Intrinsics.checkNotNullParameter(logicrenewcertresult, "");
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.asBinder = function2;
    }

    @Override // o.logicIssueCertSendConf
    public Collection<logicIssueCertSendConf.IAuthTabCallback> onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.logicIssueCertSendConf
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public cryptVerifySignatureValue onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<logicRenewCertKur<E>, access13800<? super logicIssueClose>, Object> {
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(logicRenewCertKur<E> logicrenewcertkur, access13800<? super logicIssueClose> access13800Var) {
            return ((onExtraCallbackWithResult) create(logicrenewcertkur, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return logicRenewCertKup.onNavigationEvent();
        }
    }

    public <L extends logicIssueCertSendConf.IAuthTabCallback> L onExtraCallbackWithResult(@NotNull L l) {
        Intrinsics.checkNotNullParameter(l, "");
        if (this.IAuthTabCallback.add(l)) {
            return l;
        }
        throw new IllegalArgumentException((l + " is already added").toString());
    }

    static /* synthetic */ <E extends certGetOCSPAddress> Object onExtraCallback(logicIssueCertIrIp<E> logicissuecertirip, certGetOCSPAddress certgetocspaddress, access13800<? super Boolean> access13800Var) {
        return logicissuecertirip.onWarmupCompleted().onExtraCallbackWithResult(certgetocspaddress, access13800Var);
    }

    static /* synthetic */ <E extends certGetOCSPAddress> Object IAuthTabCallback(logicIssueCertIrIp<E> logicissuecertirip, logicRenewCertKur<E> logicrenewcertkur, access13800<? super logicIssueClose> access13800Var) {
        return ((logicIssueCertIrIp) logicissuecertirip).asBinder.invoke(logicrenewcertkur, access13800Var);
    }

    public String toString() {
        String str;
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        if (onNavigationEvent() != null) {
            str = "(" + onNavigationEvent() + ")";
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return simpleName + str;
    }
}
