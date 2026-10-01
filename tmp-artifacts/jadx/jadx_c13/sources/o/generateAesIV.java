package o;

import java.util.Collection;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface generateAesIV extends getKMPrikey {
    certVerifyCertificate IAuthTabCallback();

    <S extends generateAesIV> S IAuthTabCallback(@NotNull S s);

    void IAuthTabCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult);

    logicDisuseCertRr IAuthTabCallbackStub();

    String IAuthTabCallbackStubProxy();

    certSetTrustRootCACert IAuthTabCallback_Parcel();

    generateAesIV ICustomTabsCallback();

    boolean access100();

    Collection<onExtraCallbackWithResult> asBinder();

    Set<generateAesIV> getInterfaceDescriptor();

    generateAesIV onExtraCallback();

    void onExtraCallback(@NotNull pkcs12GetCertWithPFXEncPKCS8 pkcs12getcertwithpfxencpkcs8);

    <L extends onExtraCallbackWithResult> L onExtraCallbackWithResult(@NotNull L l);

    void onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv);

    boolean writeTypedObject();

    public static final class onExtraCallback {

        static final class onNavigationEvent extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            final /* synthetic */ logicVerifyCMSSignedData $visitor;
            int label;
            final /* synthetic */ generateAesIV this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(logicVerifyCMSSignedData logicverifycmssigneddata, generateAesIV generateaesiv, access13800<? super onNavigationEvent> access13800Var) {
                super(1, access13800Var);
                this.$visitor = logicverifycmssigneddata;
                this.this$0 = generateaesiv;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(access13800<? super Unit> access13800Var) {
                return ((onNavigationEvent) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                return new onNavigationEvent(this.$visitor, this.this$0, access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    logicVerifyCMSSignedData logicverifycmssigneddata = this.$visitor;
                    generateAesIV generateaesiv = this.this$0;
                    this.label = 1;
                    if (logicverifycmssigneddata.onWarmupCompleted(generateaesiv, this) == objOnExtraCallback) {
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

        public static Object onNavigationEvent(@NotNull generateAesIV generateaesiv, @NotNull logicVerifyCMSSignedData logicverifycmssigneddata, @NotNull access13800<? super Unit> access13800Var) {
            Object objOnNavigationEvent = generateaesiv.IAuthTabCallbackStub().cC_().onNavigationEvent(new onNavigationEvent(logicverifycmssigneddata, generateaesiv, null), access13800Var);
            return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
        }

        public static void IAuthTabCallback(@NotNull generateAesIV generateaesiv, @NotNull pkcs12GetCertWithPFXEncPKCS8 pkcs12getcertwithpfxencpkcs8) {
            Intrinsics.checkNotNullParameter(pkcs12getcertwithpfxencpkcs8, "");
            pkcs12getcertwithpfxencpkcs8.onExtraCallbackWithResult(generateaesiv);
        }

        public static Object onWarmupCompleted(@NotNull generateAesIV generateaesiv, @NotNull access13800<? super Unit> access13800Var) {
            return Unit.INSTANCE;
        }

        public static Object onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv, @NotNull access13800<? super Unit> access13800Var) {
            return Unit.INSTANCE;
        }
    }

    public interface onExtraCallbackWithResult {
        Object onExtraCallbackWithResult(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        Object onNavigationEvent(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        Object onWarmupCompleted(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        public static final class onWarmupCompleted {
            public static Object onNavigationEvent(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
                return Unit.INSTANCE;
            }

            public static Object IAuthTabCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
                return Unit.INSTANCE;
            }

            public static Object onWarmupCompleted(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
                return Unit.INSTANCE;
            }
        }
    }
}
