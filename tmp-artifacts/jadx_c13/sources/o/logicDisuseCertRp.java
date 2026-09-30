package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.logicDisuseCertRr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicDisuseCertRp {

    static final class onNavigationEvent extends SuspendLambda implements Function1<access13800<? super logicChangeCertPW>, Object> {
        final /* synthetic */ Object $argument;
        final /* synthetic */ certGetOCSPAddress $event;
        final /* synthetic */ logicDisuseCertRr $this_processEventBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(logicDisuseCertRr logicdisusecertrr, certGetOCSPAddress certgetocspaddress, Object obj, access13800<? super onNavigationEvent> access13800Var) {
            super(1, access13800Var);
            this.$this_processEventBlocking = logicdisusecertrr;
            this.$event = certgetocspaddress;
            this.$argument = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new onNavigationEvent(this.$this_processEventBlocking, this.$event, this.$argument, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super logicChangeCertPW> access13800Var) {
            return ((onNavigationEvent) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
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
            logicDisuseCertRr logicdisusecertrr = this.$this_processEventBlocking;
            certGetOCSPAddress certgetocspaddress = this.$event;
            Object obj2 = this.$argument;
            this.label = 1;
            Object objOnNavigationEvent = logicdisusecertrr.onNavigationEvent(certgetocspaddress, obj2, this);
            return objOnNavigationEvent == objOnExtraCallback ? objOnExtraCallback : objOnNavigationEvent;
        }
    }

    public static /* synthetic */ logicChangeCertPW IAuthTabCallback(logicDisuseCertRr logicdisusecertrr, certGetOCSPAddress certgetocspaddress, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return onNavigationEvent(logicdisusecertrr, certgetocspaddress, obj);
    }

    public static final logicChangeCertPW onNavigationEvent(@NotNull logicDisuseCertRr logicdisusecertrr, @NotNull certGetOCSPAddress certgetocspaddress, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        Intrinsics.checkNotNullParameter(certgetocspaddress, "");
        return (logicChangeCertPW) logicdisusecertrr.cC_().onWarmupCompleted(new onNavigationEvent(logicdisusecertrr, certgetocspaddress, obj, null));
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        final /* synthetic */ logicDisuseCertRr $this_stop;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(logicDisuseCertRr logicdisusecertrr, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(1, access13800Var);
            this.$this_stop = logicdisusecertrr;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackDefault) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new IAuthTabCallbackDefault(this.$this_stop, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                logicDisuseCert.onExtraCallbackWithResult(this.$this_stop);
                if (!this.$this_stop.onActivityLayout()) {
                    return Unit.INSTANCE;
                }
                logicDisuseCertRr logicdisusecertrr = this.$this_stop;
                certGetSignatureAlgorithm certgetsignaturealgorithm = certGetSignatureAlgorithm.IAuthTabCallback;
                this.label = 1;
                if (logicDisuseCertRr.onWarmupCompleted.onNavigationEvent(logicdisusecertrr, certgetsignaturealgorithm, null, this, 2, null) == objOnExtraCallback) {
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

    public static final Object onNavigationEvent(@NotNull logicDisuseCertRr logicdisusecertrr, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnNavigationEvent = logicdisusecertrr.cC_().onNavigationEvent(new IAuthTabCallbackDefault(logicdisusecertrr, null), access13800Var);
        return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $stop;
        final /* synthetic */ logicDisuseCertRr $this_destroy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(logicDisuseCertRr logicdisusecertrr, boolean z, access13800<? super IAuthTabCallback> access13800Var) {
            super(1, access13800Var);
            this.$this_destroy = logicdisusecertrr;
            this.$stop = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$this_destroy, this.$stop, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallback) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$this_destroy.onMessageChannelReady()) {
                    return Unit.INSTANCE;
                }
                logicDisuseCertRr logicdisusecertrr = this.$this_destroy;
                certGetIssuerDN certgetissuerdn = new certGetIssuerDN(this.$stop);
                this.label = 1;
                if (logicDisuseCertRr.onWarmupCompleted.onNavigationEvent(logicdisusecertrr, certgetissuerdn, null, this, 2, null) == objOnExtraCallback) {
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

    public static final Object IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnNavigationEvent = logicdisusecertrr.cC_().onNavigationEvent(new IAuthTabCallback(logicdisusecertrr, z, null), access13800Var);
        return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
    }

    public static /* synthetic */ Object onNavigationEvent(logicDisuseCertRr logicdisusecertrr, boolean z, access13800 access13800Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return IAuthTabCallback(logicdisusecertrr, z, access13800Var);
    }

    static final class onExtraCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $stop;
        final /* synthetic */ logicDisuseCertRr $this_destroyBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(logicDisuseCertRr logicdisusecertrr, boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(1, access13800Var);
            this.$this_destroyBlocking = logicdisusecertrr;
            this.$stop = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new onExtraCallback(this.$this_destroyBlocking, this.$stop, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Unit> access13800Var) {
            return ((onExtraCallback) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                logicDisuseCertRr logicdisusecertrr = this.$this_destroyBlocking;
                boolean z = this.$stop;
                this.label = 1;
                if (logicDisuseCertRp.IAuthTabCallback(logicdisusecertrr, z, this) == objOnExtraCallback) {
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

    public static final void IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr, boolean z) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        logicdisusecertrr.cC_().onWarmupCompleted(new onExtraCallback(logicdisusecertrr, z, null));
    }

    public static /* synthetic */ void onExtraCallbackWithResult(logicDisuseCertRr logicdisusecertrr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        IAuthTabCallback(logicdisusecertrr, z);
    }

    public static /* synthetic */ logicDisuseCertRr onExtraCallbackWithResult(String str, certVerifyCertificate certverifycertificate, boolean z, InterfaceC0051getSignPrikey interfaceC0051getSignPrikey, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            certverifycertificate = certVerifyCertificate.EXCLUSIVE;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            interfaceC0051getSignPrikey = logicCMSSignedDataNoConWithB64Hash.onWarmupCompleted(onWarmupCompleted.onWarmupCompleted);
        }
        return onNavigationEvent(str, certverifycertificate, z, interfaceC0051getSignPrikey, (Function2<? super getLastDebugError, ? super access13800<? super Unit>, ? extends Object>) function2);
    }

    static final class onWarmupCompleted extends Lambda implements Function1<logicCMSSignedData, Unit> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1);
        }

        public final void onExtraCallbackWithResult(logicCMSSignedData logiccmssigneddata) {
            Intrinsics.checkNotNullParameter(logiccmssigneddata, "");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(logicCMSSignedData logiccmssigneddata) {
            onExtraCallbackWithResult(logiccmssigneddata);
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function1<access13800<? super logicDisuseCertRr>, Object> {
        final /* synthetic */ certVerifyCertificate $childMode;
        final /* synthetic */ InterfaceC0051getSignPrikey $creationArguments;
        final /* synthetic */ Function2<getLastDebugError, access13800<? super Unit>, Object> $init;
        final /* synthetic */ String $name;
        final /* synthetic */ boolean $start;
        final /* synthetic */ certGetKeyUsage $this_with;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(certGetKeyUsage certgetkeyusage, String str, certVerifyCertificate certverifycertificate, boolean z, InterfaceC0051getSignPrikey interfaceC0051getSignPrikey, Function2<? super getLastDebugError, ? super access13800<? super Unit>, ? extends Object> function2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(1, access13800Var);
            this.$this_with = certgetkeyusage;
            this.$name = str;
            this.$childMode = certverifycertificate;
            this.$start = z;
            this.$creationArguments = interfaceC0051getSignPrikey;
            this.$init = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(this.$this_with, this.$name, this.$childMode, this.$start, this.$creationArguments, this.$init, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super logicDisuseCertRr> access13800Var) {
            return ((onExtraCallbackWithResult) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
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
            certGetKeyUsage certgetkeyusage = this.$this_with;
            String str = this.$name;
            certVerifyCertificate certverifycertificate = this.$childMode;
            boolean z = this.$start;
            InterfaceC0051getSignPrikey interfaceC0051getSignPrikey = this.$creationArguments;
            Function2<getLastDebugError, access13800<? super Unit>, Object> function2 = this.$init;
            this.label = 1;
            Object objOnWarmupCompleted = certGetCRLDP.onWarmupCompleted(certgetkeyusage, str, certverifycertificate, z, interfaceC0051getSignPrikey, function2, this);
            return objOnWarmupCompleted == objOnExtraCallback ? objOnExtraCallback : objOnWarmupCompleted;
        }
    }

    public static final logicDisuseCertRr onNavigationEvent(@Nullable String str, @NotNull certVerifyCertificate certverifycertificate, boolean z, @NotNull InterfaceC0051getSignPrikey interfaceC0051getSignPrikey, @NotNull Function2<? super getLastDebugError, ? super access13800<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(certverifycertificate, "");
        Intrinsics.checkNotNullParameter(interfaceC0051getSignPrikey, "");
        Intrinsics.checkNotNullParameter(function2, "");
        certGetKeyUsage certgetkeyusage = new certGetKeyUsage();
        return (logicDisuseCertRr) certgetkeyusage.onWarmupCompleted(new onExtraCallbackWithResult(certgetkeyusage, str, certverifycertificate, z, interfaceC0051getSignPrikey, function2, null));
    }
}
