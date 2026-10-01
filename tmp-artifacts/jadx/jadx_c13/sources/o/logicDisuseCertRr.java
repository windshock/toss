package o;

import java.util.Collection;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface logicDisuseCertRr extends getInfo {

    public interface IAuthTabCallback {
        Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var);

        Object IAuthTabCallback(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var);

        Object onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        Object onNavigationEvent(@NotNull generateAesIV generateaesiv, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        Object onWarmupCompleted(@NotNull Set<? extends generateAesIV> set, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        Object onWarmupCompleted(@NotNull generateAesIV generateaesiv, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        Object onWarmupCompleted(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);
    }

    public interface asInterface {
        Object onExtraCallback(@NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, @NotNull access13800<? super Unit> access13800Var);
    }

    public interface onExtraCallback {
        Object IAuthTabCallback(@NotNull Exception exc, @NotNull access13800<? super Unit> access13800Var);
    }

    public interface onExtraCallbackWithResult {
        Object onWarmupCompleted(@NotNull Function0<String> function0, @NotNull access13800<? super Unit> access13800Var);
    }

    public interface onNavigationEvent {
        Object onNavigationEvent(@NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, @NotNull access13800<? super Unit> access13800Var);
    }

    certGetCertPolicy cC_();

    InterfaceC0051getSignPrikey cD_();

    boolean cE_();

    onExtraCallbackWithResult cF_();

    Collection<IAuthTabCallback> cG_();

    boolean onActivityLayout();

    Object onExtraCallback(@Nullable Object obj, @NotNull access13800<? super Unit> access13800Var);

    @Override // o.generateAesIV
    void onExtraCallback(@NotNull pkcs12GetCertWithPFXEncPKCS8 pkcs12getcertwithpfxencpkcs8);

    boolean onMessageChannelReady();

    Object onNavigationEvent(@NotNull certGetOCSPAddress certgetocspaddress, @Nullable Object obj, @NotNull access13800<? super logicChangeCertPW> access13800Var);

    asInterface readTypedObject();

    public static final class onWarmupCompleted {
        public static /* synthetic */ Object onWarmupCompleted(logicDisuseCertRr logicdisusecertrr, Object obj, access13800 access13800Var, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return logicdisusecertrr.onExtraCallback(obj, access13800Var);
        }

        public static /* synthetic */ Object onNavigationEvent(logicDisuseCertRr logicdisusecertrr, certGetOCSPAddress certgetocspaddress, Object obj, access13800 access13800Var, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processEvent");
            }
            if ((i & 2) != 0) {
                obj = null;
            }
            return logicdisusecertrr.onNavigationEvent(certgetocspaddress, obj, access13800Var);
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            final /* synthetic */ logicVerifyCMSSignedData $visitor;
            int label;
            final /* synthetic */ logicDisuseCertRr this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(logicVerifyCMSSignedData logicverifycmssigneddata, logicDisuseCertRr logicdisusecertrr, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(1, access13800Var);
                this.$visitor = logicverifycmssigneddata;
                this.this$0 = logicdisusecertrr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                return new onExtraCallbackWithResult(this.$visitor, this.this$0, access13800Var);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(access13800<? super Unit> access13800Var) {
                return ((onExtraCallbackWithResult) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    logicVerifyCMSSignedData logicverifycmssigneddata = this.$visitor;
                    logicDisuseCertRr logicdisusecertrr = this.this$0;
                    this.label = 1;
                    if (logicverifycmssigneddata.onNavigationEvent(logicdisusecertrr, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
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

        public static Object onWarmupCompleted(@NotNull logicDisuseCertRr logicdisusecertrr, @NotNull logicVerifyCMSSignedData logicverifycmssigneddata, @NotNull access13800<? super Unit> access13800Var) {
            Object objOnNavigationEvent = logicdisusecertrr.cC_().onNavigationEvent(new onExtraCallbackWithResult(logicverifycmssigneddata, logicdisusecertrr, null), access13800Var);
            return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
        }

        public static void onWarmupCompleted(@NotNull logicDisuseCertRr logicdisusecertrr, @NotNull pkcs12GetCertWithPFXEncPKCS8 pkcs12getcertwithpfxencpkcs8) {
            Intrinsics.checkNotNullParameter(pkcs12getcertwithpfxencpkcs8, "");
            pkcs12getcertwithpfxencpkcs8.IAuthTabCallback(logicdisusecertrr);
        }
    }
}
