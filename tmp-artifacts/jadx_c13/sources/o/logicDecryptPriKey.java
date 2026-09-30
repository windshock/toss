package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import o.certGetCertValidityNotAfter;
import o.logicDisuseCertRr;
import o.logicIssueCertSendConf;
import o.logicRenewCertKur;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.nsk.kstatemachine.visitors.RequireNonBlankNamesVisitorKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicDecryptPriKey extends getVIDRandom {
    private boolean IAuthTabCallback;
    private Exception IAuthTabCallbackDefault;
    private final Set<logicDisuseCertRr.IAuthTabCallback> IAuthTabCallbackStub;
    private logicDisuseCertRr.onExtraCallback IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private logicDisuseCertRr.onExtraCallbackWithResult access100;
    private logicDisuseCertRr.onNavigationEvent asBinder;
    private final certGetCertPolicy asInterface;
    private logicDisuseCertRr.asInterface getInterfaceDescriptor;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final InterfaceC0051getSignPrikey onTransact;
    private final certGetVersion onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.onWarmupCompleted(this);
        }
    }

    static final class IAuthTabCallback_Parcel<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.onNavigationEvent((Function1) null, this);
        }
    }

    static final class ICustomTabsCallback extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        ICustomTabsCallback(access13800<? super ICustomTabsCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.onWarmupCompleted((logicIssueCertMakePOPOSigningInputMsg<?>) null, (logicDeleteCert) null, this);
        }
    }

    static final class asBinder extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.IAuthTabCallbackStub(this);
        }
    }

    static final class extraCallbackWithResult extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        extraCallbackWithResult(access13800<? super extraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.onExtraCallbackWithResult((logicIssueCertMakePOPOSigningInputMsg<?>) null, this);
        }
    }

    static final class onMinimized extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.onTransact(null, this);
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[logicChangeCertPW.values().length];
            try {
                iArr[logicChangeCertPW.PROCESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[logicChangeCertPW.IGNORED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[logicChangeCertPW.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static final class onPostMessage<R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onPostMessage(access13800<? super onPostMessage> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.onExtraCallback((Function1) null, (access13800) this);
        }
    }

    static final class onWarmupCompleted<E extends certGetOCSPAddress> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.onExtraCallback((logicIssueCertMakePOPOSigningInputMsg) null, (access13800<? super Boolean>) this);
        }
    }

    static final class readTypedObject extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        readTypedObject(access13800<? super readTypedObject> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptPriKey.this.onNavigationEvent((logicIssueCertMakePOPOSigningInputMsg<?>) null, this);
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        final /* synthetic */ Object $argument;
        final /* synthetic */ certGetPublicKeyAlgorithmType $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(certGetPublicKeyAlgorithmType certgetpublickeyalgorithmtype, Object obj, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(1, access13800Var);
            this.$event = certgetpublickeyalgorithmtype;
            this.$argument = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return logicDecryptPriKey.this.new IAuthTabCallbackStub(this.$event, this.$argument, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackStub) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: o.logicDecryptPriKey$IAuthTabCallbackStub$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            final /* synthetic */ Object $argument;
            final /* synthetic */ certGetPublicKeyAlgorithmType $event;
            final /* synthetic */ logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType> $eventAndArgument;
            int label;
            final /* synthetic */ logicDecryptPriKey this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(logicDecryptPriKey logicdecryptprikey, logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType> logicissuecertmakepoposigninginputmsg, certGetPublicKeyAlgorithmType certgetpublickeyalgorithmtype, Object obj, access13800<? super AnonymousClass4> access13800Var) {
                super(1, access13800Var);
                this.this$0 = logicdecryptprikey;
                this.$eventAndArgument = logicissuecertmakepoposigninginputmsg;
                this.$event = certgetpublickeyalgorithmtype;
                this.$argument = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                return new AnonymousClass4(this.this$0, this.$eventAndArgument, this.$event, this.$argument, access13800Var);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(access13800<? super Unit> access13800Var) {
                return ((AnonymousClass4) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: o.logicDecryptPriKey$IAuthTabCallbackStub$4$onWarmupCompleted */
            static final class onWarmupCompleted extends SuspendLambda implements Function1<access13800<? super logicDeleteCert>, Object> {
                final /* synthetic */ Object $argument;
                final /* synthetic */ certGetPublicKeyAlgorithmType $event;
                final /* synthetic */ logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType> $eventAndArgument;
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ logicDecryptPriKey this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                onWarmupCompleted(certGetPublicKeyAlgorithmType certgetpublickeyalgorithmtype, logicDecryptPriKey logicdecryptprikey, Object obj, logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType> logicissuecertmakepoposigninginputmsg, access13800<? super onWarmupCompleted> access13800Var) {
                    super(1, access13800Var);
                    this.$event = certgetpublickeyalgorithmtype;
                    this.this$0 = logicdecryptprikey;
                    this.$argument = obj;
                    this.$eventAndArgument = logicissuecertmakepoposigninginputmsg;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(access13800<?> access13800Var) {
                    return new onWarmupCompleted(this.$event, this.this$0, this.$argument, this.$eventAndArgument, access13800Var);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final Object invoke(access13800<? super logicDeleteCert> access13800Var) {
                    return ((onWarmupCompleted) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
                }

                /* renamed from: o.logicDecryptPriKey$IAuthTabCallbackStub$4$onWarmupCompleted$onExtraCallbackWithResult */
                public static final class onExtraCallbackWithResult implements certGetCertValidityNotAfter<certGetPublicKeyAlgorithmType> {
                    private final KClass<certGetPublicKeyAlgorithmType> onWarmupCompleted = Reflection.getOrCreateKotlinClass(certGetPublicKeyAlgorithmType.class);

                    @Override // o.certGetCertValidityNotAfter
                    public KClass<certGetPublicKeyAlgorithmType> onExtraCallback() {
                        return this.onWarmupCompleted;
                    }

                    @Override // o.certGetCertValidityNotAfter
                    public Object onExtraCallbackWithResult(certGetOCSPAddress certgetocspaddress, access13800<? super Boolean> access13800Var) {
                        return access14000.onNavigationEvent(certgetocspaddress instanceof certGetPublicKeyAlgorithmType);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
                /* JADX WARN: Type inference failed for: r1v7, types: [o.logicIssueCertSendConf] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    certGetPublicKeyAlgorithmType certgetpublickeyalgorithmtype;
                    Object obj2;
                    logicIssueCertIrIp logicissuecertirip;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        certgetpublickeyalgorithmtype = this.$event;
                        logicDecryptPriKey logicdecryptprikey = this.this$0;
                        generateAesIV generateaesivIAuthTabCallback = certgetpublickeyalgorithmtype.IAuthTabCallback();
                        Object obj3 = this.$argument;
                        certGetCertValidityNotAfter.onNavigationEvent onnavigationevent = certGetCertValidityNotAfter.Companion;
                        logicIssueCertIrIp logicissuecertirip2 = new logicIssueCertIrIp("Starting", new onExtraCallbackWithResult(), logicRenewCertResult.LOCAL, (certSetTrustRootCACert) null, logicdecryptprikey, generateaesivIAuthTabCallback);
                        logicRenewCertKur.onExtraCallback onextracallback = new logicRenewCertKur.onExtraCallback(new logicIssueCertMakePOPOSigningInputMsg(certgetpublickeyalgorithmtype, obj3));
                        this.L$0 = certgetpublickeyalgorithmtype;
                        this.L$1 = obj3;
                        this.L$2 = logicissuecertirip2;
                        this.label = 1;
                        Object objOnWarmupCompleted = logicissuecertirip2.onWarmupCompleted(onextracallback, this);
                        if (objOnWarmupCompleted != objOnExtraCallback) {
                            obj2 = obj3;
                            obj = objOnWarmupCompleted;
                            logicissuecertirip = logicissuecertirip2;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj);
                            return obj;
                        }
                        ResultKt.onNavigationEvent(obj);
                        logicDecryptPriKey logicdecryptprikey2 = this.this$0;
                        logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType> logicissuecertmakepoposigninginputmsg = this.$eventAndArgument;
                        this.label = 3;
                        Object objOnExtraCallbackWithResult = logicdecryptprikey2.onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg, this);
                        return objOnExtraCallbackWithResult != objOnExtraCallback ? objOnExtraCallback : objOnExtraCallbackWithResult;
                    }
                    ?? r1 = (logicIssueCertSendConf) this.L$2;
                    obj2 = this.L$1;
                    certgetpublickeyalgorithmtype = (certGetPublicKeyAlgorithmType) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    logicissuecertirip = r1;
                    logicRenewCertGenmGenp logicrenewcertgenmgenp = new logicRenewCertGenmGenp(logicissuecertirip, (logicIssueClose) obj, certgetpublickeyalgorithmtype, obj2);
                    logicDecryptPriKey logicdecryptprikey3 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (logicdecryptprikey3.onTransact(logicrenewcertgenmgenp, this) != objOnExtraCallback) {
                        logicDecryptPriKey logicdecryptprikey22 = this.this$0;
                        logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType> logicissuecertmakepoposigninginputmsg2 = this.$eventAndArgument;
                        this.label = 3;
                        Object objOnExtraCallbackWithResult2 = logicdecryptprikey22.onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg2, this);
                        if (objOnExtraCallbackWithResult2 != objOnExtraCallback) {
                        }
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
            
                if (r1.onWarmupCompleted(r3, (o.logicDeleteCert) r11, r10) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    logicDecryptPriKey logicdecryptprikey = this.this$0;
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$event, logicdecryptprikey, this.$argument, this.$eventAndArgument, null);
                    this.label = 1;
                    obj = logicdecryptprikey.onExtraCallback((Function1) onwarmupcompleted, (access13800) this);
                    if (obj != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                logicDecryptPriKey logicdecryptprikey2 = this.this$0;
                logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType> logicissuecertmakepoposigninginputmsg = this.$eventAndArgument;
                this.label = 2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                logicDecryptPriKey.this.onPostMessage();
                logicIssueCertMakePOPOSigningInputMsg logicissuecertmakepoposigninginputmsg = new logicIssueCertMakePOPOSigningInputMsg(this.$event, this.$argument);
                logicDecryptPriKey logicdecryptprikey = logicDecryptPriKey.this;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(logicdecryptprikey, logicissuecertmakepoposigninginputmsg, this.$event, this.$argument, null);
                this.label = 1;
                if (logicdecryptprikey.onNavigationEvent(anonymousClass4, this) == objOnExtraCallback) {
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

    public static final class ICustomTabsCallbackDefault implements certGetCertValidityNotAfter<certGetPublicKeyAlgorithmType> {
        private final KClass<certGetPublicKeyAlgorithmType> onWarmupCompleted = Reflection.getOrCreateKotlinClass(certGetPublicKeyAlgorithmType.class);

        @Override // o.certGetCertValidityNotAfter
        public KClass<certGetPublicKeyAlgorithmType> onExtraCallback() {
            return this.onWarmupCompleted;
        }

        @Override // o.certGetCertValidityNotAfter
        public Object onExtraCallbackWithResult(certGetOCSPAddress certgetocspaddress, access13800<? super Boolean> access13800Var) {
            return access14000.onNavigationEvent(certgetocspaddress instanceof certGetPublicKeyAlgorithmType);
        }
    }

    public static final class onRelationshipValidationResult implements certGetCertValidityNotAfter<certGetSignAlgType> {
        private final KClass<certGetSignAlgType> onExtraCallback = Reflection.getOrCreateKotlinClass(certGetSignAlgType.class);

        @Override // o.certGetCertValidityNotAfter
        public KClass<certGetSignAlgType> onExtraCallback() {
            return this.onExtraCallback;
        }

        @Override // o.certGetCertValidityNotAfter
        public Object onExtraCallbackWithResult(certGetOCSPAddress certgetocspaddress, access13800<? super Boolean> access13800Var) {
            return access14000.onNavigationEvent(certgetocspaddress instanceof certGetSignAlgType);
        }
    }

    @Override // o.logicDisuseCertRr
    public InterfaceC0051getSignPrikey cD_() {
        return this.onTransact;
    }

    @Override // o.logicDisuseCertRr
    public certGetCertPolicy cC_() {
        return this.asInterface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logicDecryptPriKey(@Nullable String str, @NotNull certVerifyCertificate certverifycertificate, @NotNull InterfaceC0051getSignPrikey interfaceC0051getSignPrikey, @NotNull certGetCertPolicy certgetcertpolicy) {
        super(str, certverifycertificate);
        Intrinsics.checkNotNullParameter(certverifycertificate, "");
        Intrinsics.checkNotNullParameter(interfaceC0051getSignPrikey, "");
        Intrinsics.checkNotNullParameter(certgetcertpolicy, "");
        this.onTransact = interfaceC0051getSignPrikey;
        this.asInterface = certgetcertpolicy;
        this.IAuthTabCallbackStub = new LinkedHashSet();
        this.access100 = access100.IAuthTabCallback;
        this.asBinder = IAuthTabCallbackStubProxy.onExtraCallbackWithResult;
        this.getInterfaceDescriptor = logicChangeCertPassword.onNavigationEvent(this);
        this.IAuthTabCallbackStubProxy = access000.IAuthTabCallback;
        logicCMSEnvelopedData logiccmsenvelopeddataOnExtraCallbackWithResult = cD_().onExtraCallbackWithResult();
        this.onWarmupCompleted = logiccmsenvelopeddataOnExtraCallbackWithResult != null ? new certGetVersion(this, logiccmsenvelopeddataOnExtraCallbackWithResult) : null;
        logicIssueCertNoConf logicissuecertnoconf = new logicIssueCertNoConf("start transition", onExtraCallbackWithResult());
        onExtraCallbackWithResult();
        certGetCertValidityNotAfter.onNavigationEvent onnavigationevent = certGetCertValidityNotAfter.Companion;
        logicissuecertnoconf.onExtraCallbackWithResult(new ICustomTabsCallbackDefault());
        logicissuecertnoconf.onNavigationEvent(new onExtraCallback(null));
        logicissuecertnoconf.onExtraCallbackWithResult(certSetCACert.onNavigationEvent);
        onExtraCallbackWithResult(logicissuecertnoconf.IAuthTabCallback());
        if (cD_().onExtraCallback()) {
            getSignCert getsigncert = (getSignCert) IAuthTabCallback((logicDecryptPriKey) new getSignCert());
            logicRenewCertResult logicrenewcertresult = logicRenewCertResult.LOCAL;
            onExtraCallbackWithResult();
            onExtraCallbackWithResult(new logicIssueCertIrIp("undo transition", new onRelationshipValidationResult(), logicrenewcertresult, (certSetTrustRootCACert) null, onExtraCallbackWithResult(), getsigncert));
        }
    }

    static final class access100 implements logicDisuseCertRr.onExtraCallbackWithResult {
        public static final access100 IAuthTabCallback = new access100();

        access100() {
        }

        @Override // o.logicDisuseCertRr.onExtraCallbackWithResult
        public final Object onWarmupCompleted(Function0<String> function0, access13800<? super Unit> access13800Var) {
            return Unit.INSTANCE;
        }
    }

    @Override // o.logicDisuseCertRr
    public Collection<logicDisuseCertRr.IAuthTabCallback> cG_() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.logicDisuseCertRr
    public logicDisuseCertRr.onExtraCallbackWithResult cF_() {
        return this.access100;
    }

    static final class IAuthTabCallbackStubProxy implements logicDisuseCertRr.onNavigationEvent {
        public static final IAuthTabCallbackStubProxy onExtraCallbackWithResult = new IAuthTabCallbackStubProxy();

        IAuthTabCallbackStubProxy() {
        }

        @Override // o.logicDisuseCertRr.onNavigationEvent
        public final Object onNavigationEvent(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, access13800<? super Unit> access13800Var) {
            return Unit.INSTANCE;
        }
    }

    public logicDisuseCertRr.onNavigationEvent onActivityResized() {
        return this.asBinder;
    }

    @Override // o.logicDisuseCertRr
    public logicDisuseCertRr.asInterface readTypedObject() {
        return this.getInterfaceDescriptor;
    }

    static final class access000 implements logicDisuseCertRr.onExtraCallback {
        public static final access000 IAuthTabCallback = new access000();

        access000() {
        }

        @Override // o.logicDisuseCertRr.onExtraCallback
        public final Object IAuthTabCallback(Exception exc, access13800<? super Unit> access13800Var) throws Exception {
            throw exc;
        }
    }

    public logicDisuseCertRr.onExtraCallback onMinimized() {
        return this.IAuthTabCallbackStubProxy;
    }

    @Override // o.logicDisuseCertRr
    public boolean onMessageChannelReady() {
        return this.IAuthTabCallback;
    }

    @Override // o.logicDisuseCertRr
    public boolean onActivityLayout() {
        return this.onNavigationEvent;
    }

    @Override // o.logicDisuseCertRr
    public boolean cE_() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getVIDRandom
    public boolean extraCallbackWithResult() {
        return this.onExtraCallback;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType>, access13800<? super logicIssueClose>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onExtraCallback onextracallback = new onExtraCallback(access13800Var);
            onextracallback.L$0 = obj;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(logicIssueCertMakePOPOSigningInputMsg<certGetPublicKeyAlgorithmType> logicissuecertmakepoposigninginputmsg, access13800<? super logicIssueClose> access13800Var) {
            return ((onExtraCallback) create(logicissuecertmakepoposigninginputmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r7 != r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        
            if (r7 != r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        
            if (r7 == r0) goto L28;
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
                if (i == 2) {
                    ResultKt.onNavigationEvent(obj);
                    return (logicIssueClose) obj;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return (logicIssueClose) obj;
            }
            ResultKt.onNavigationEvent(obj);
            logicIssueCertMakePOPOSigningInputMsg logicissuecertmakepoposigninginputmsg = (logicIssueCertMakePOPOSigningInputMsg) this.L$0;
            certGetPublicKeyAlgorithmType certgetpublickeyalgorithmtype = (certGetPublicKeyAlgorithmType) logicissuecertmakepoposigninginputmsg.onWarmupCompleted();
            if (certgetpublickeyalgorithmtype instanceof certGetSubjectKeyIdentifier) {
                if (((certGetSubjectKeyIdentifier) logicissuecertmakepoposigninginputmsg.onWarmupCompleted()).onWarmupCompleted().size() == 1) {
                    generateAesIV generateaesivIAuthTabCallback = ((certGetPublicKeyAlgorithmType) logicissuecertmakepoposigninginputmsg.onWarmupCompleted()).IAuthTabCallback();
                    this.label = 1;
                    obj = logicRenewCertKup.IAuthTabCallback(logicissuecertmakepoposigninginputmsg, generateaesivIAuthTabCallback, this);
                } else {
                    Set<generateAesIV> setOnWarmupCompleted = ((certGetSubjectKeyIdentifier) logicissuecertmakepoposigninginputmsg.onWarmupCompleted()).onWarmupCompleted();
                    this.label = 2;
                    obj = logicRenewCertKup.onWarmupCompleted((logicIssueCertMakePOPOSigningInputMsg<?>) logicissuecertmakepoposigninginputmsg, setOnWarmupCompleted, this);
                }
            } else {
                if (!(certgetpublickeyalgorithmtype instanceof certGetPublicKeyInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                cryptGenerateMACWithSHA256 cryptgeneratemacwithsha256IAuthTabCallback = ((certGetPublicKeyInfo) logicissuecertmakepoposigninginputmsg.onWarmupCompleted()).IAuthTabCallback();
                this.label = 3;
                obj = logicRenewCertKup.IAuthTabCallback(logicissuecertmakepoposigninginputmsg, cryptgeneratemacwithsha256IAuthTabCallback, this);
            }
            return objOnExtraCallback;
        }
    }

    public static final class getInterfaceDescriptor implements logicCMSSignedDataWithSign {
        getInterfaceDescriptor() {
            if (!logicDecryptPriKey.this.onExtraCallback) {
                logicDecryptPriKey.this.onExtraCallback = true;
                return;
            }
            throw new IllegalStateException(("Seems " + Reflection.getOrCreateKotlinClass(logicCMSSignedDataWithSign.class).getSimpleName() + " is already open, multiple simultaneous sections are not supported").toString());
        }

        public void onExtraCallback() {
            logicDecryptPriKey.this.onExtraCallback = false;
        }
    }

    @Override // o.getVIDRandom
    public logicCMSSignedDataWithSign extraCallback() {
        return new getInterfaceDescriptor();
    }

    @Override // o.getVIDRandom
    public void onExtraCallback(@NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (this.IAuthTabCallbackDefault == null) {
            this.IAuthTabCallbackDefault = exc;
        }
    }

    @Override // o.logicDisuseCertRr
    public Object onExtraCallback(@Nullable Object obj, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnNavigationEvent = onNavigationEvent(clearFaultAddress.onNavigationEvent(this), obj, access13800Var);
        return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
    }

    public Object onNavigationEvent(@NotNull Set<? extends generateAesIV> set, @Nullable Object obj, @NotNull access13800<? super Unit> access13800Var) {
        Object objIAuthTabCallback = IAuthTabCallback(new certGetSubjectKeyIdentifier(set), obj, access13800Var);
        return objIAuthTabCallback == access14100.onExtraCallback() ? objIAuthTabCallback : Unit.INSTANCE;
    }

    private final Object IAuthTabCallback(certGetPublicKeyAlgorithmType certgetpublickeyalgorithmtype, Object obj, access13800<? super Unit> access13800Var) {
        Object objOnNavigationEvent = cC_().onNavigationEvent(new IAuthTabCallbackStub(certgetpublickeyalgorithmtype, obj, null), access13800Var);
        return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPostMessage() {
        onExtraCallback(new logicVerifyCMSSignedDataWithContent());
        onExtraCallback(new logicRenewCertNoConf());
        if (cD_().IAuthTabCallback()) {
            RequireNonBlankNamesVisitorKt.IAuthTabCallback(this);
        }
        logicDisuseCert.onExtraCallbackWithResult(this);
        if (onActivityLayout()) {
            throw new IllegalStateException((this + " is already started").toString());
        }
        if (this.IAuthTabCallback_Parcel) {
            throw new IllegalStateException((this + " is already processing event, this is internal error, please report a bug").toString());
        }
        if (IAuthTabCallback() == certVerifyCertificate.EXCLUSIVE) {
            cryptSeed.onExtraCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (o.cryptSeed.onExtraCallback(r8, r10, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (onWarmupCompleted(r9, r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onTransact(logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        onMinimized onminimized;
        logicDisuseCertRr logicdisusecertrr;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2;
        Iterator it;
        if (access13800Var instanceof onMinimized) {
            onminimized = (onMinimized) access13800Var;
            int i = onminimized.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onminimized.label = i - 2147483648;
            } else {
                onminimized = new onMinimized(access13800Var);
            }
        }
        Object obj = onminimized.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onminimized.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.onNavigationEvent = true;
            this.onExtraCallbackWithResult = false;
            onActivityResized onactivityresized = new onActivityResized();
            onminimized.L$0 = logicrenewcertgenmgenp;
            onminimized.label = 1;
        } else if (i2 == 1) {
            logicrenewcertgenmgenp = (logicRenewCertGenmGenp) onminimized.L$0;
            ResultKt.onNavigationEvent(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            getVIDRandom getvidrandom = (getVIDRandom) onminimized.L$3;
            it = (Iterator) onminimized.L$2;
            logicdisusecertrr = (logicDisuseCertRr) onminimized.L$1;
            logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) onminimized.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Exception e) {
                getvidrandom.onExtraCallback(e);
            }
            while (it.hasNext()) {
                logicDisuseCertRr.IAuthTabCallback iAuthTabCallback = (logicDisuseCertRr.IAuthTabCallback) it.next();
                getVIDRandom getvidrandom2 = (getVIDRandom) logicdisusecertrr;
                try {
                    onminimized.L$0 = logicrenewcertgenmgenp2;
                    onminimized.L$1 = logicdisusecertrr;
                    onminimized.L$2 = it;
                    onminimized.L$3 = getvidrandom2;
                    onminimized.label = 2;
                } catch (Exception e2) {
                    getvidrandom2.onExtraCallback(e2);
                }
                if (iAuthTabCallback.IAuthTabCallback(logicrenewcertgenmgenp2, onminimized) == objOnExtraCallback) {
                    break;
                }
            }
            logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
            onminimized.L$0 = null;
            onminimized.L$1 = null;
            onminimized.L$2 = null;
            onminimized.L$3 = null;
            onminimized.label = 3;
        }
        Intrinsics.checkNotNull(this, "");
        if (!extraCallbackWithResult()) {
            logicdisusecertrr = this;
            logicrenewcertgenmgenp2 = logicrenewcertgenmgenp;
            it = CollectionsKt___CollectionsKt.toList(cG_()).iterator();
            while (it.hasNext()) {
            }
            logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
        }
        onminimized.L$0 = null;
        onminimized.L$1 = null;
        onminimized.L$2 = null;
        onminimized.L$3 = null;
        onminimized.label = 3;
    }

    static final class onActivityResized extends Lambda implements Function0<String> {
        onActivityResized() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return logicDecryptPriKey.this + " started";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (o.cryptSeed.onExtraCallback(r6, r7, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a3 -> B:29:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallbackStub(access13800<? super Unit> access13800Var) {
        asBinder asbinder;
        logicDisuseCertRr logicdisusecertrr;
        Iterator it;
        if (access13800Var instanceof asBinder) {
            asbinder = (asBinder) access13800Var;
            int i = asbinder.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asbinder.label = i - 2147483648;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object obj = asbinder.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = asbinder.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.onNavigationEvent = false;
            asbinder.label = 1;
            if (onNavigationEvent(asbinder) != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.onNavigationEvent(obj);
                Intrinsics.checkNotNull(this, "");
                if (!extraCallbackWithResult()) {
                    logicdisusecertrr = this;
                    it = CollectionsKt___CollectionsKt.toList(cG_()).iterator();
                    while (it.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getVIDRandom getvidrandom = (getVIDRandom) asbinder.L$2;
            it = (Iterator) asbinder.L$1;
            logicdisusecertrr = (logicDisuseCertRr) asbinder.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Exception e) {
                getvidrandom.onExtraCallback(e);
            }
            while (it.hasNext()) {
                logicDisuseCertRr.IAuthTabCallback iAuthTabCallback = (logicDisuseCertRr.IAuthTabCallback) it.next();
                getvidrandom = (getVIDRandom) logicdisusecertrr;
                asbinder.L$0 = logicdisusecertrr;
                asbinder.L$1 = it;
                asbinder.L$2 = getvidrandom;
                asbinder.label = 3;
                if (iAuthTabCallback.IAuthTabCallback(asbinder) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        asInterface asinterface = new asInterface();
        asbinder.label = 2;
    }

    static final class asInterface extends Lambda implements Function0<String> {
        asInterface() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return logicDecryptPriKey.this + " stopped";
        }
    }

    @Override // o.logicDisuseCertRr
    public Object onNavigationEvent(@NotNull certGetOCSPAddress certgetocspaddress, @Nullable Object obj, @NotNull access13800<? super logicChangeCertPW> access13800Var) {
        if (certgetocspaddress instanceof certGetPublicKeyAlgorithmType) {
            throw new IllegalStateException(("Incorrect " + Reflection.getOrCreateKotlinClass(certGetPublicKeyAlgorithmType.class).getSimpleName() + " usage. Use start() method instead").toString());
        }
        return cC_().onNavigationEvent(new extraCallback(certgetocspaddress, obj, null), access13800Var);
    }

    static final class extraCallback extends SuspendLambda implements Function1<access13800<? super logicChangeCertPW>, Object> {
        final /* synthetic */ Object $argument;
        final /* synthetic */ certGetOCSPAddress $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        extraCallback(certGetOCSPAddress certgetocspaddress, Object obj, access13800<? super extraCallback> access13800Var) {
            super(1, access13800Var);
            this.$event = certgetocspaddress;
            this.$argument = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return logicDecryptPriKey.this.new extraCallback(this.$event, this.$argument, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super logicChangeCertPW> access13800Var) {
            return ((extraCallback) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        
            if (r1.onExtraCallback(r6, r5) != r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                logicDisuseCert.onExtraCallbackWithResult(logicDecryptPriKey.this);
                boolean z = logicDecryptPriKey.this.onActivityLayout() || (this.$event instanceof certGetIssuerDN);
                logicDecryptPriKey logicdecryptprikey = logicDecryptPriKey.this;
                if (!z) {
                    throw new IllegalStateException((logicdecryptprikey + " is not started, call start() first").toString());
                }
                logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg = new logicIssueCertMakePOPOSigningInputMsg<>(this.$event, this.$argument);
                if (logicDecryptPriKey.this.IAuthTabCallback_Parcel) {
                    logicDisuseCertRr.asInterface typedObject = logicDecryptPriKey.this.readTypedObject();
                    this.label = 1;
                } else {
                    logicDecryptPriKey logicdecryptprikey2 = logicDecryptPriKey.this;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(logicdecryptprikey2, logicissuecertmakepoposigninginputmsg, null);
                    this.label = 2;
                    Object objOnNavigationEvent = logicdecryptprikey2.onNavigationEvent(anonymousClass1, this);
                    if (objOnNavigationEvent != objOnExtraCallback) {
                        return objOnNavigationEvent;
                    }
                }
                return objOnExtraCallback;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            return logicChangeCertPW.PENDING;
        }

        /* renamed from: o.logicDecryptPriKey$extraCallback$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function1<access13800<? super logicChangeCertPW>, Object> {
            final /* synthetic */ logicIssueCertMakePOPOSigningInputMsg<certGetOCSPAddress> $eventAndArgument;
            int label;
            final /* synthetic */ logicDecryptPriKey this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(logicDecryptPriKey logicdecryptprikey, logicIssueCertMakePOPOSigningInputMsg<certGetOCSPAddress> logicissuecertmakepoposigninginputmsg, access13800<? super AnonymousClass1> access13800Var) {
                super(1, access13800Var);
                this.this$0 = logicdecryptprikey;
                this.$eventAndArgument = logicissuecertmakepoposigninginputmsg;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                return new AnonymousClass1(this.this$0, this.$eventAndArgument, access13800Var);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(access13800<? super logicChangeCertPW> access13800Var) {
                return ((AnonymousClass1) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
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
                logicDecryptPriKey logicdecryptprikey = this.this$0;
                logicIssueCertMakePOPOSigningInputMsg<certGetOCSPAddress> logicissuecertmakepoposigninginputmsg = this.$eventAndArgument;
                this.label = 1;
                Object objOnNavigationEvent = logicdecryptprikey.onNavigationEvent(logicissuecertmakepoposigninginputmsg, this);
                return objOnNavigationEvent == objOnExtraCallback ? objOnExtraCallback : objOnNavigationEvent;
            }
        }
    }

    private final logicIssueCertMakePOPOSigningInputMsg<?> onExtraCallbackWithResult(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg) {
        if (!cD_().onExtraCallback() || !(logicissuecertmakepoposigninginputmsg.onWarmupCompleted() instanceof certGetSubjectDN)) {
            return logicissuecertmakepoposigninginputmsg;
        }
        generateAesIV generateaesivOnExtraCallback = cryptSeed.onExtraCallback((generateAesIV) this, (KClass<generateAesIV>) Reflection.getOrCreateKotlinClass(getSignCert.class), true);
        if (generateaesivOnExtraCallback != null) {
            return new logicIssueCertMakePOPOSigningInputMsg<>(((getSignCert) generateaesivOnExtraCallback).extraCallbackWithResult(), logicissuecertmakepoposigninginputmsg.onNavigationEvent());
        }
        throw new IllegalArgumentException(("State " + Reflection.getOrCreateKotlinClass(getSignCert.class).getSimpleName() + " not found").toString());
    }

    static final class writeTypedObject extends SuspendLambda implements Function1<access13800<? super logicDeleteCert>, Object> {
        final /* synthetic */ logicIssueCertMakePOPOSigningInputMsg<?> $eventAndArgument;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, access13800<? super writeTypedObject> access13800Var) {
            super(1, access13800Var);
            this.$eventAndArgument = logicissuecertmakepoposigninginputmsg;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            return logicDecryptPriKey.this.new writeTypedObject(this.$eventAndArgument, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super logicDeleteCert> access13800Var) {
            return ((writeTypedObject) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
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
            logicDecryptPriKey logicdecryptprikey = logicDecryptPriKey.this;
            logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg = this.$eventAndArgument;
            this.label = 1;
            Object objOnExtraCallbackWithResult = logicdecryptprikey.onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg, this);
            return objOnExtraCallbackWithResult == objOnExtraCallback ? objOnExtraCallback : objOnExtraCallbackWithResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, access13800<? super logicChangeCertPW> access13800Var) {
        readTypedObject readtypedobject;
        if (access13800Var instanceof readTypedObject) {
            readtypedobject = (readTypedObject) access13800Var;
            int i = readtypedobject.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                readtypedobject.label = i - 2147483648;
            } else {
                readtypedobject = new readTypedObject(access13800Var);
            }
        }
        Object objOnExtraCallback = readtypedobject.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i2 = readtypedobject.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            writeTypedObject writetypedobject = new writeTypedObject(logicissuecertmakepoposigninginputmsg, null);
            readtypedobject.L$0 = logicissuecertmakepoposigninginputmsg;
            readtypedobject.label = 1;
            objOnExtraCallback = onExtraCallback((Function1) writetypedobject, (access13800) readtypedobject);
            if (objOnExtraCallback != objOnExtraCallback2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            return objOnExtraCallback;
        }
        logicissuecertmakepoposigninginputmsg = (logicIssueCertMakePOPOSigningInputMsg) readtypedobject.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        readtypedobject.L$0 = null;
        readtypedobject.label = 2;
        Object objOnWarmupCompleted = onWarmupCompleted(logicissuecertmakepoposigninginputmsg, (logicDeleteCert) objOnExtraCallback, readtypedobject);
        return objOnWarmupCompleted == objOnExtraCallback2 ? objOnExtraCallback2 : objOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (IAuthTabCallbackStub(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (onWarmupCompleted(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, access13800<? super logicDeleteCert> access13800Var) {
        extraCallbackWithResult extracallbackwithresult;
        logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult;
        Object objOnExtraCallback;
        certGetVersion certgetversion;
        if (access13800Var instanceof extraCallbackWithResult) {
            extracallbackwithresult = (extraCallbackWithResult) access13800Var;
            int i = extracallbackwithresult.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                extracallbackwithresult.label = i - 2147483648;
            } else {
                extracallbackwithresult = new extraCallbackWithResult(access13800Var);
            }
        }
        Object obj = extracallbackwithresult.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i2 = extracallbackwithresult.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult = onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg);
            certGetOCSPAddress certgetocspaddressOnWarmupCompleted = logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult.onWarmupCompleted();
            if (certgetocspaddressOnWarmupCompleted instanceof certGetSignatureAlgorithm) {
                extracallbackwithresult.L$0 = logicissuecertmakepoposigninginputmsg;
                extracallbackwithresult.L$1 = logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult;
                extracallbackwithresult.label = 1;
            } else if (certgetocspaddressOnWarmupCompleted instanceof certGetIssuerDN) {
                if (((certGetIssuerDN) certgetocspaddressOnWarmupCompleted).onExtraCallbackWithResult() && onActivityLayout()) {
                    extracallbackwithresult.L$0 = logicissuecertmakepoposigninginputmsg;
                    extracallbackwithresult.L$1 = logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult;
                    extracallbackwithresult.label = 2;
                    if (IAuthTabCallbackStub(extracallbackwithresult) != objOnExtraCallback2) {
                    }
                }
                extracallbackwithresult.L$0 = logicissuecertmakepoposigninginputmsg;
                extracallbackwithresult.L$1 = logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult;
                extracallbackwithresult.label = 3;
            } else {
                extracallbackwithresult.L$0 = logicissuecertmakepoposigninginputmsg;
                extracallbackwithresult.L$1 = logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult;
                extracallbackwithresult.label = 4;
                objOnExtraCallback = onExtraCallback(logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult, (access13800<? super Boolean>) extracallbackwithresult);
            }
            return objOnExtraCallback2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg2 = (logicIssueCertMakePOPOSigningInputMsg) extracallbackwithresult.L$1;
                logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg3 = (logicIssueCertMakePOPOSigningInputMsg) extracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj);
                logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult = logicissuecertmakepoposigninginputmsg2;
                logicissuecertmakepoposigninginputmsg = logicissuecertmakepoposigninginputmsg3;
                extracallbackwithresult.L$0 = logicissuecertmakepoposigninginputmsg;
                extracallbackwithresult.L$1 = logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult;
                extracallbackwithresult.label = 3;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg4 = (logicIssueCertMakePOPOSigningInputMsg) extracallbackwithresult.L$1;
                logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg5 = (logicIssueCertMakePOPOSigningInputMsg) extracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj);
                logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult = logicissuecertmakepoposigninginputmsg4;
                logicissuecertmakepoposigninginputmsg = logicissuecertmakepoposigninginputmsg5;
                objOnExtraCallback = obj;
                zBooleanValue = ((Boolean) objOnExtraCallback).booleanValue();
                logicChangeCertPW logicchangecertpw = !zBooleanValue ? logicChangeCertPW.PROCESSED : logicChangeCertPW.IGNORED;
                certgetversion = this.onWarmupCompleted;
                if (certgetversion != null) {
                    certgetversion.onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg, logicchangecertpw);
                }
                return new logicDeleteCert(logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult, logicchangecertpw);
            }
        }
        logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg6 = (logicIssueCertMakePOPOSigningInputMsg) extracallbackwithresult.L$1;
        logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg7 = (logicIssueCertMakePOPOSigningInputMsg) extracallbackwithresult.L$0;
        ResultKt.onNavigationEvent(obj);
        logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult = logicissuecertmakepoposigninginputmsg6;
        logicissuecertmakepoposigninginputmsg = logicissuecertmakepoposigninginputmsg7;
        if (!zBooleanValue) {
        }
        certgetversion = this.onWarmupCompleted;
        if (certgetversion != null) {
        }
        return new logicDeleteCert(logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult, logicchangecertpw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r6.onNavigationEvent(r8, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, logicDeleteCert logicdeletecert, access13800<? super logicChangeCertPW> access13800Var) {
        ICustomTabsCallback iCustomTabsCallback;
        if (access13800Var instanceof ICustomTabsCallback) {
            iCustomTabsCallback = (ICustomTabsCallback) access13800Var;
            int i = iCustomTabsCallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iCustomTabsCallback.label = i - 2147483648;
            } else {
                iCustomTabsCallback = new ICustomTabsCallback(access13800Var);
            }
        }
        Object obj = iCustomTabsCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iCustomTabsCallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            int i3 = onNavigationEvent.IAuthTabCallback[logicdeletecert.onNavigationEvent().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    onActivityLayout onactivitylayout = new onActivityLayout(logicdeletecert);
                    iCustomTabsCallback.L$0 = logicdeletecert;
                    iCustomTabsCallback.label = 1;
                    if (cryptSeed.onExtraCallback(this, onactivitylayout, iCustomTabsCallback) != objOnExtraCallback) {
                        logicDisuseCertRr.onNavigationEvent onnavigationeventOnActivityResized = onActivityResized();
                        logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult = logicdeletecert.onExtraCallbackWithResult();
                        iCustomTabsCallback.L$0 = logicdeletecert;
                        iCustomTabsCallback.label = 2;
                    }
                    return objOnExtraCallback;
                }
                if (i3 == 3) {
                    throw new IllegalStateException(("Internal error, " + logicChangeCertPW.PENDING + " is not expected here").toString());
                }
            } else if (!(logicissuecertmakepoposigninginputmsg.onWarmupCompleted() instanceof certGetPublicKeyAlgorithmType)) {
                this.onExtraCallbackWithResult = true;
            }
            return logicdeletecert.onNavigationEvent();
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            logicdeletecert = (logicDeleteCert) iCustomTabsCallback.L$0;
            ResultKt.onNavigationEvent(obj);
            return logicdeletecert.onNavigationEvent();
        }
        logicdeletecert = (logicDeleteCert) iCustomTabsCallback.L$0;
        ResultKt.onNavigationEvent(obj);
        logicDisuseCertRr.onNavigationEvent onnavigationeventOnActivityResized2 = onActivityResized();
        logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsgOnExtraCallbackWithResult2 = logicdeletecert.onExtraCallbackWithResult();
        iCustomTabsCallback.L$0 = logicdeletecert;
        iCustomTabsCallback.label = 2;
    }

    static final class onActivityLayout extends Lambda implements Function0<String> {
        final /* synthetic */ logicDeleteCert $step1Result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onActivityLayout(logicDeleteCert logicdeletecert) {
            super(0);
            this.$step1Result = logicdeletecert;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return logicDecryptPriKey.this + " ignored " + Reflection.getOrCreateKotlinClass(this.$step1Result.onExtraCallbackWithResult().onWarmupCompleted().getClass()).getSimpleName();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (r10.onExtraCallbackWithResult(r0) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        if (r10 != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
    
        if (r10.onWarmupCompleted(r2) != r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        if (r3.onWarmupCompleted(r0) == r1) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf A[Catch: all -> 0x007c, Exception -> 0x007f, TRY_ENTER, TryCatch #1 {Exception -> 0x007f, blocks: (B:16:0x0041, B:62:0x00f9, B:19:0x0054, B:22:0x0060, B:25:0x006f, B:51:0x00d1, B:28:0x0078, B:48:0x00bf), top: B:86:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da A[Catch: all -> 0x007c, Exception -> 0x010f, TRY_ENTER, TryCatch #0 {Exception -> 0x010f, blocks: (B:65:0x0109, B:54:0x00da, B:56:0x00e0, B:59:0x00e7, B:68:0x0112), top: B:84:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #3 {all -> 0x007c, blocks: (B:13:0x0032, B:81:0x013d, B:16:0x0041, B:65:0x0109, B:54:0x00da, B:56:0x00e0, B:59:0x00e7, B:62:0x00f9, B:68:0x0112, B:78:0x012d, B:19:0x0054, B:22:0x0060, B:25:0x006f, B:51:0x00d1, B:28:0x0078, B:48:0x00bf, B:44:0x00af), top: B:86:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [o.logicDecCMSEnvelopedData] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r8v0, types: [o.logicDecryptPriKey] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0106 -> B:17:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object onNavigationEvent(Function1<? super access13800<? super R>, ? extends Object> function1, access13800<? super R> access13800Var) {
        IAuthTabCallback_Parcel iAuthTabCallback_Parcel;
        Function1<? super access13800<? super R>, ? extends Object> function12;
        logicDecCMSEnvelopedData logicdeccmsenvelopeddata;
        logicDecCMSEnvelopedData logicdeccmsenvelopeddata2;
        Object obj;
        logicDecCMSEnvelopedData logicdeccmsenvelopeddata3;
        logicDecCMSEnvelopedData logicdeccmsenvelopeddata4;
        logicDecCMSEnvelopedData logicdeccmsenvelopeddata5;
        Object obj2;
        IAuthTabCallback_Parcel iAuthTabCallback_Parcel2;
        logicIssueCertMakePOPOSigningInputMsg logicissuecertmakepoposigninginputmsg;
        logicDecCMSEnvelopedData logicdeccmsenvelopeddata6;
        Object obj3;
        logicDecCMSEnvelopedData logicdeccmsenvelopeddata7;
        if (access13800Var instanceof IAuthTabCallback_Parcel) {
            iAuthTabCallback_Parcel = (IAuthTabCallback_Parcel) access13800Var;
            int i = iAuthTabCallback_Parcel.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback_Parcel.label = i - 2147483648;
            } else {
                iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(access13800Var);
            }
        }
        Object objInvoke = iAuthTabCallback_Parcel.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        ?? r3 = 1;
        try {
            try {
            } catch (Exception e) {
                e = e;
            }
            switch (iAuthTabCallback_Parcel.label) {
                case 0:
                    ResultKt.onNavigationEvent(objInvoke);
                    logicDisuseCertRr.asInterface typedObject = readTypedObject();
                    logicDecCMSEnvelopedData logicdeccmsenvelopeddata8 = typedObject instanceof logicDecCMSEnvelopedData ? (logicDecCMSEnvelopedData) typedObject : null;
                    if (logicdeccmsenvelopeddata8 != null) {
                        iAuthTabCallback_Parcel.L$0 = function1;
                        iAuthTabCallback_Parcel.L$1 = logicdeccmsenvelopeddata8;
                        iAuthTabCallback_Parcel.label = 1;
                        break;
                    }
                    function12 = function1;
                    logicdeccmsenvelopeddata = logicdeccmsenvelopeddata8;
                    this.IAuthTabCallback_Parcel = true;
                    try {
                        iAuthTabCallback_Parcel.L$0 = logicdeccmsenvelopeddata;
                        iAuthTabCallback_Parcel.L$1 = null;
                        iAuthTabCallback_Parcel.label = 2;
                        objInvoke = function12.invoke(iAuthTabCallback_Parcel);
                        if (objInvoke != objOnExtraCallback) {
                            logicdeccmsenvelopeddata2 = logicdeccmsenvelopeddata;
                            if (logicdeccmsenvelopeddata2 != null) {
                                iAuthTabCallback_Parcel.L$0 = logicdeccmsenvelopeddata2;
                                iAuthTabCallback_Parcel.L$1 = objInvoke;
                                iAuthTabCallback_Parcel.L$2 = logicdeccmsenvelopeddata2;
                                iAuthTabCallback_Parcel.label = 3;
                                Object objIAuthTabCallback = logicdeccmsenvelopeddata2.IAuthTabCallback(iAuthTabCallback_Parcel);
                                if (objIAuthTabCallback != objOnExtraCallback) {
                                    obj = objInvoke;
                                    objInvoke = objIAuthTabCallback;
                                    logicdeccmsenvelopeddata3 = logicdeccmsenvelopeddata2;
                                    logicdeccmsenvelopeddata4 = logicdeccmsenvelopeddata2;
                                    logicIssueCertMakePOPOSigningInputMsg logicissuecertmakepoposigninginputmsg2 = (logicIssueCertMakePOPOSigningInputMsg) objInvoke;
                                    logicdeccmsenvelopeddata5 = logicdeccmsenvelopeddata3;
                                    obj2 = obj;
                                    iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel;
                                    logicissuecertmakepoposigninginputmsg = logicissuecertmakepoposigninginputmsg2;
                                    r3 = logicdeccmsenvelopeddata4;
                                    if (logicissuecertmakepoposigninginputmsg != null) {
                                        if (onMessageChannelReady() || !onActivityLayout()) {
                                            iAuthTabCallback_Parcel2.L$0 = r3;
                                            iAuthTabCallback_Parcel2.L$1 = obj2;
                                            iAuthTabCallback_Parcel2.L$2 = null;
                                            iAuthTabCallback_Parcel2.label = 4;
                                            break;
                                        } else {
                                            iAuthTabCallback_Parcel2.L$0 = r3;
                                            iAuthTabCallback_Parcel2.L$1 = obj2;
                                            iAuthTabCallback_Parcel2.L$2 = logicdeccmsenvelopeddata5;
                                            iAuthTabCallback_Parcel2.label = 5;
                                            if (onNavigationEvent(logicissuecertmakepoposigninginputmsg, iAuthTabCallback_Parcel2) != objOnExtraCallback) {
                                                iAuthTabCallback_Parcel = iAuthTabCallback_Parcel2;
                                                obj3 = obj2;
                                                logicdeccmsenvelopeddata6 = logicdeccmsenvelopeddata5;
                                                logicdeccmsenvelopeddata7 = r3;
                                                iAuthTabCallback_Parcel.L$0 = logicdeccmsenvelopeddata7;
                                                iAuthTabCallback_Parcel.L$1 = obj3;
                                                iAuthTabCallback_Parcel.L$2 = logicdeccmsenvelopeddata6;
                                                iAuthTabCallback_Parcel.label = 6;
                                                objInvoke = logicdeccmsenvelopeddata6.IAuthTabCallback(iAuthTabCallback_Parcel);
                                                r3 = logicdeccmsenvelopeddata7;
                                                break;
                                            }
                                        }
                                    } else {
                                        objInvoke = obj2;
                                    }
                                }
                            }
                            return objInvoke;
                        }
                    } catch (Exception e2) {
                        r3 = logicdeccmsenvelopeddata;
                        e = e2;
                        if (r3 != 0) {
                        }
                        throw e;
                    }
                    return objOnExtraCallback;
                case 1:
                    logicdeccmsenvelopeddata = (logicDecCMSEnvelopedData) iAuthTabCallback_Parcel.L$1;
                    function12 = (Function1) iAuthTabCallback_Parcel.L$0;
                    ResultKt.onNavigationEvent(objInvoke);
                    this.IAuthTabCallback_Parcel = true;
                    iAuthTabCallback_Parcel.L$0 = logicdeccmsenvelopeddata;
                    iAuthTabCallback_Parcel.L$1 = null;
                    iAuthTabCallback_Parcel.label = 2;
                    objInvoke = function12.invoke(iAuthTabCallback_Parcel);
                    if (objInvoke != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                case 2:
                    logicDecCMSEnvelopedData logicdeccmsenvelopeddata9 = (logicDecCMSEnvelopedData) iAuthTabCallback_Parcel.L$0;
                    ResultKt.onNavigationEvent(objInvoke);
                    logicdeccmsenvelopeddata2 = logicdeccmsenvelopeddata9;
                    if (logicdeccmsenvelopeddata2 != null) {
                    }
                    return objInvoke;
                case 3:
                    logicdeccmsenvelopeddata3 = (logicDecCMSEnvelopedData) iAuthTabCallback_Parcel.L$2;
                    obj = iAuthTabCallback_Parcel.L$1;
                    logicDecCMSEnvelopedData logicdeccmsenvelopeddata10 = (logicDecCMSEnvelopedData) iAuthTabCallback_Parcel.L$0;
                    ResultKt.onNavigationEvent(objInvoke);
                    logicdeccmsenvelopeddata4 = logicdeccmsenvelopeddata10;
                    logicIssueCertMakePOPOSigningInputMsg logicissuecertmakepoposigninginputmsg22 = (logicIssueCertMakePOPOSigningInputMsg) objInvoke;
                    logicdeccmsenvelopeddata5 = logicdeccmsenvelopeddata3;
                    obj2 = obj;
                    iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel;
                    logicissuecertmakepoposigninginputmsg = logicissuecertmakepoposigninginputmsg22;
                    r3 = logicdeccmsenvelopeddata4;
                    if (logicissuecertmakepoposigninginputmsg != null) {
                    }
                    break;
                case 4:
                    obj2 = iAuthTabCallback_Parcel.L$1;
                    ResultKt.onNavigationEvent(objInvoke);
                    return obj2;
                case 5:
                    logicdeccmsenvelopeddata6 = (logicDecCMSEnvelopedData) iAuthTabCallback_Parcel.L$2;
                    obj3 = iAuthTabCallback_Parcel.L$1;
                    logicDecCMSEnvelopedData logicdeccmsenvelopeddata11 = (logicDecCMSEnvelopedData) iAuthTabCallback_Parcel.L$0;
                    ResultKt.onNavigationEvent(objInvoke);
                    logicdeccmsenvelopeddata7 = logicdeccmsenvelopeddata11;
                    iAuthTabCallback_Parcel.L$0 = logicdeccmsenvelopeddata7;
                    iAuthTabCallback_Parcel.L$1 = obj3;
                    iAuthTabCallback_Parcel.L$2 = logicdeccmsenvelopeddata6;
                    iAuthTabCallback_Parcel.label = 6;
                    objInvoke = logicdeccmsenvelopeddata6.IAuthTabCallback(iAuthTabCallback_Parcel);
                    r3 = logicdeccmsenvelopeddata7;
                    break;
                case 6:
                    logicdeccmsenvelopeddata6 = (logicDecCMSEnvelopedData) iAuthTabCallback_Parcel.L$2;
                    obj3 = iAuthTabCallback_Parcel.L$1;
                    logicDecCMSEnvelopedData logicdeccmsenvelopeddata12 = (logicDecCMSEnvelopedData) iAuthTabCallback_Parcel.L$0;
                    ResultKt.onNavigationEvent(objInvoke);
                    r3 = logicdeccmsenvelopeddata12;
                    IAuthTabCallback_Parcel iAuthTabCallback_Parcel3 = iAuthTabCallback_Parcel;
                    logicDecCMSEnvelopedData logicdeccmsenvelopeddata13 = logicdeccmsenvelopeddata6;
                    obj2 = obj3;
                    iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel3;
                    try {
                        logicissuecertmakepoposigninginputmsg = (logicIssueCertMakePOPOSigningInputMsg) objInvoke;
                        logicdeccmsenvelopeddata5 = logicdeccmsenvelopeddata13;
                        r3 = r3;
                        if (logicissuecertmakepoposigninginputmsg != null) {
                        }
                    } catch (Exception e3) {
                        e = e3;
                        iAuthTabCallback_Parcel = iAuthTabCallback_Parcel2;
                        if (r3 != 0) {
                            iAuthTabCallback_Parcel.L$0 = e;
                            iAuthTabCallback_Parcel.L$1 = null;
                            iAuthTabCallback_Parcel.L$2 = null;
                            iAuthTabCallback_Parcel.label = 7;
                            break;
                        }
                        throw e;
                    }
                    break;
                case 7:
                    e = (Exception) iAuthTabCallback_Parcel.L$0;
                    ResultKt.onNavigationEvent(objInvoke);
                    throw e;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } finally {
            this.IAuthTabCallback_Parcel = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.generateAesIV, o.logicDecryptPriKey] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Exception, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object onExtraCallback(Function1<? super access13800<? super R>, ? extends Object> function1, access13800<? super R> access13800Var) {
        onPostMessage onpostmessage;
        Function1<? super access13800<? super R>, ? extends Object> function12;
        ?? r8;
        if (access13800Var instanceof onPostMessage) {
            onpostmessage = (onPostMessage) access13800Var;
            int i = onpostmessage.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onpostmessage.label = i - 2147483648;
            } else {
                onpostmessage = new onPostMessage(access13800Var);
            }
        }
        Object objInvoke = onpostmessage.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onpostmessage.label;
        try {
        } catch (Exception e) {
            onMessageChannelReady onmessagechannelready = new onMessageChannelReady(e);
            onpostmessage.L$0 = e;
            onpostmessage.label = 2;
            function12 = e;
            if (cryptSeed.onExtraCallback((generateAesIV) this, onmessagechannelready, onpostmessage) != objOnExtraCallback) {
            }
        }
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objInvoke);
            onpostmessage.label = 1;
            objInvoke = function1.invoke(onpostmessage);
            if (objInvoke != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th));
            r8 = function1;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj = onpostmessage.L$0;
                    ResultKt.onNavigationEvent(objInvoke);
                    return obj;
                }
                Function1<? super access13800<? super R>, ? extends Object> function13 = (Function1<? super access13800<? super R>, ? extends Object>) ((Exception) onpostmessage.L$0);
                ResultKt.onNavigationEvent(objInvoke);
                function1 = function13;
                Result.m31constructorimpl(Unit.INSTANCE);
                r8 = function1;
                throw r8;
            }
            ?? r82 = (Exception) onpostmessage.L$0;
            ResultKt.onNavigationEvent(objInvoke);
            function12 = r82;
            Result.Companion companion2 = Result.Companion;
            onpostmessage.L$0 = function12;
            onpostmessage.label = 3;
            function1 = function12;
            if (onWarmupCompleted(onpostmessage) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
            Result.m31constructorimpl(Unit.INSTANCE);
            r8 = function1;
            throw r8;
        }
        ResultKt.onNavigationEvent(objInvoke);
        Exception exc = this.IAuthTabCallbackDefault;
        if (exc != null) {
            this.IAuthTabCallbackDefault = null;
            logicDisuseCertRr.onExtraCallback onextracallbackOnMinimized = onMinimized();
            onpostmessage.L$0 = objInvoke;
            onpostmessage.label = 4;
            if (onextracallbackOnMinimized.IAuthTabCallback(exc, onpostmessage) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        }
        return objInvoke;
    }

    static final class onMessageChannelReady extends Lambda implements Function0<String> {
        final /* synthetic */ Exception $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMessageChannelReady(Exception exc) {
            super(0);
            this.$e = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Fatal exception happened, " + logicDecryptPriKey.this + " machine is in unpredictable state and will be destroyed: " + this.$e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        if (o.cryptSeed.onExtraCallback(r13, r14, r0) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0236, code lost:
    
        if (IAuthTabCallback(r14, r0) == r1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends certGetOCSPAddress> Object onExtraCallback(logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg, access13800<? super Boolean> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        certGetOCSPAddress certgetocspaddressOnExtraCallbackWithResult;
        Object obj;
        Pair pair;
        logicIssueCertGenmGenp logicissuecertgenmgenp;
        Set<? extends cryptVerifySignatureValue> setIAuthTabCallback;
        Object next;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp;
        getVIDRandom getvidrandom;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2;
        logicIssueCertGenmGenp logicissuecertgenmgenp2;
        Iterator it;
        Set<? extends cryptVerifySignatureValue> set;
        getVIDRandom getvidrandom2;
        Set<? extends cryptVerifySignatureValue> set2;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp3;
        logicIssueCertGenmGenp logicissuecertgenmgenp3;
        logicDisuseCertRr logicdisusecertrr;
        Iterator it2;
        getVIDRandom getvidrandom3;
        cryptVerifySignatureValue cryptverifysignaturevalueAsBinder;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp4;
        logicIssueCertGenmGenp logicissuecertgenmgenp4;
        Set<? extends generateAesIV> setOnExtraCallback;
        getVIDRandom getvidrandom4;
        Iterator it3;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp5;
        Set<? extends generateAesIV> set3;
        Iterator it4;
        logicDisuseCertRr logicdisusecertrr2;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp6;
        Set<? extends generateAesIV> set4;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i = onwarmupcompleted.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj2 = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        switch (onwarmupcompleted.label) {
            case 0:
                ResultKt.onNavigationEvent(obj2);
                certgetocspaddressOnExtraCallbackWithResult = logicissuecertmakepoposigninginputmsg.onExtraCallbackWithResult();
                Object objOnExtraCallback2 = logicissuecertmakepoposigninginputmsg.onExtraCallback();
                if (writeTypedObject()) {
                    onTransact ontransact = new onTransact(certgetocspaddressOnExtraCallbackWithResult, objOnExtraCallback2);
                    onwarmupcompleted.label = 1;
                    break;
                } else {
                    onwarmupcompleted.L$0 = certgetocspaddressOnExtraCallbackWithResult;
                    onwarmupcompleted.L$1 = objOnExtraCallback2;
                    onwarmupcompleted.label = 2;
                    Object objOnWarmupCompleted = onWarmupCompleted(logicissuecertmakepoposigninginputmsg, onwarmupcompleted);
                    if (objOnWarmupCompleted != objOnExtraCallback) {
                        obj2 = objOnWarmupCompleted;
                        obj = objOnExtraCallback2;
                        pair = (Pair) obj2;
                        if (pair != null) {
                            return access14000.onNavigationEvent(false);
                        }
                        logicissuecertgenmgenp = (logicIssueCertGenmGenp) pair.onExtraCallbackWithResult();
                        logicIssueClose logicissueclose = (logicIssueClose) pair.IAuthTabCallback();
                        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp7 = new logicRenewCertGenmGenp<>(logicissuecertgenmgenp, logicissueclose, certgetocspaddressOnExtraCallbackWithResult, obj);
                        setIAuthTabCallback = logicissueclose.IAuthTabCallback();
                        Intrinsics.checkNotNull(setIAuthTabCallback, "");
                        Iterator<T> it5 = setIAuthTabCallback.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next = it5.next();
                                cryptVerifySignatureValue cryptverifysignaturevalue = (cryptVerifySignatureValue) next;
                                if (cryptverifysignaturevalue == this || certGetCertCPS.onExtraCallback(cryptverifysignaturevalue, this)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        cryptVerifySignatureValue cryptverifysignaturevalue2 = (cryptVerifySignatureValue) next;
                        if (cryptverifysignaturevalue2 != null) {
                            throw new IllegalStateException(("Transitioning to targetState " + cryptverifysignaturevalue2 + " from another state machine is not possible").toString());
                        }
                        IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(setIAuthTabCallback, certgetocspaddressOnExtraCallbackWithResult, logicissuecertgenmgenp);
                        onwarmupcompleted.L$0 = logicissuecertgenmgenp;
                        onwarmupcompleted.L$1 = logicrenewcertgenmgenp7;
                        onwarmupcompleted.L$2 = setIAuthTabCallback;
                        onwarmupcompleted.label = 3;
                        if (cryptSeed.onExtraCallback(this, iAuthTabCallbackDefault, onwarmupcompleted) != objOnExtraCallback) {
                            logicrenewcertgenmgenp = logicrenewcertgenmgenp7;
                            logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub = logicissuecertgenmgenp.onExtraCallbackWithResult().IAuthTabCallbackStub();
                            Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub, "");
                            getvidrandom = (getVIDRandom) logicdisusecertrrIAuthTabCallbackStub;
                            if (!getvidrandom.extraCallbackWithResult()) {
                                logicrenewcertgenmgenp2 = logicrenewcertgenmgenp;
                                logicissuecertgenmgenp2 = logicissuecertgenmgenp;
                                it = CollectionsKt___CollectionsKt.toList(logicissuecertgenmgenp.onExtraCallback()).iterator();
                                set = setIAuthTabCallback;
                                getvidrandom2 = getvidrandom;
                                while (it.hasNext()) {
                                    logicIssueCertSendConf.IAuthTabCallback iAuthTabCallback = (logicIssueCertSendConf.IAuthTabCallback) it.next();
                                    try {
                                    } catch (Exception e) {
                                        getvidrandom3 = getvidrandom2;
                                        getvidrandom2.onExtraCallback(e);
                                        break;
                                    }
                                    onwarmupcompleted.L$0 = logicissuecertgenmgenp2;
                                    onwarmupcompleted.L$1 = logicrenewcertgenmgenp2;
                                    onwarmupcompleted.L$2 = set;
                                    onwarmupcompleted.L$3 = getvidrandom2;
                                    onwarmupcompleted.L$4 = it;
                                    onwarmupcompleted.L$5 = getvidrandom2;
                                    onwarmupcompleted.label = 4;
                                    if (iAuthTabCallback.onExtraCallbackWithResult(logicrenewcertgenmgenp2, onwarmupcompleted) != objOnExtraCallback) {
                                    }
                                }
                                setIAuthTabCallback = set;
                                logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
                                logicissuecertgenmgenp = logicissuecertgenmgenp2;
                            }
                            Intrinsics.checkNotNull(this, "");
                            if (!extraCallbackWithResult()) {
                                set2 = setIAuthTabCallback;
                                logicrenewcertgenmgenp3 = logicrenewcertgenmgenp;
                                logicissuecertgenmgenp3 = logicissuecertgenmgenp;
                                logicdisusecertrr = this;
                                it2 = CollectionsKt___CollectionsKt.toList(cG_()).iterator();
                                while (it2.hasNext()) {
                                    logicDisuseCertRr.IAuthTabCallback iAuthTabCallback2 = (logicDisuseCertRr.IAuthTabCallback) it2.next();
                                    getVIDRandom getvidrandom5 = (getVIDRandom) logicdisusecertrr;
                                    try {
                                        onwarmupcompleted.L$0 = logicissuecertgenmgenp3;
                                        onwarmupcompleted.L$1 = logicrenewcertgenmgenp3;
                                        onwarmupcompleted.L$2 = set2;
                                        onwarmupcompleted.L$3 = logicdisusecertrr;
                                        onwarmupcompleted.L$4 = it2;
                                        onwarmupcompleted.L$5 = getvidrandom5;
                                        onwarmupcompleted.label = 5;
                                    } catch (Exception e2) {
                                        getvidrandom5.onExtraCallback(e2);
                                    }
                                    if (iAuthTabCallback2.onWarmupCompleted(logicrenewcertgenmgenp3, onwarmupcompleted) == objOnExtraCallback) {
                                    }
                                }
                                setIAuthTabCallback = set2;
                                logicrenewcertgenmgenp = logicrenewcertgenmgenp3;
                                logicissuecertgenmgenp = logicissuecertgenmgenp3;
                            }
                            cryptverifysignaturevalueAsBinder = logicissuecertgenmgenp.onExtraCallbackWithResult();
                            onwarmupcompleted.L$0 = logicissuecertgenmgenp;
                            onwarmupcompleted.L$1 = logicrenewcertgenmgenp;
                            onwarmupcompleted.L$2 = null;
                            onwarmupcompleted.L$3 = null;
                            onwarmupcompleted.L$4 = null;
                            onwarmupcompleted.L$5 = null;
                            onwarmupcompleted.label = 6;
                            if (onNavigationEvent(setIAuthTabCallback, cryptverifysignaturevalueAsBinder, logicrenewcertgenmgenp, onwarmupcompleted) != objOnExtraCallback) {
                                logicrenewcertgenmgenp4 = logicrenewcertgenmgenp;
                                logicissuecertgenmgenp4 = logicissuecertgenmgenp;
                                onwarmupcompleted.L$0 = logicissuecertgenmgenp4;
                                onwarmupcompleted.L$1 = logicrenewcertgenmgenp4;
                                onwarmupcompleted.label = 7;
                                break;
                            }
                        }
                    }
                }
                return objOnExtraCallback;
            case 1:
                ResultKt.onNavigationEvent(obj2);
                return access14000.onNavigationEvent(false);
            case 2:
                obj = onwarmupcompleted.L$1;
                certgetocspaddressOnExtraCallbackWithResult = (certGetOCSPAddress) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(obj2);
                pair = (Pair) obj2;
                if (pair != null) {
                }
                break;
            case 3:
                setIAuthTabCallback = (Set) onwarmupcompleted.L$2;
                logicrenewcertgenmgenp = (logicRenewCertGenmGenp) onwarmupcompleted.L$1;
                logicissuecertgenmgenp = (logicIssueCertGenmGenp) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(obj2);
                logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub2 = logicissuecertgenmgenp.onExtraCallbackWithResult().IAuthTabCallbackStub();
                Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub2, "");
                getvidrandom = (getVIDRandom) logicdisusecertrrIAuthTabCallbackStub2;
                if (!getvidrandom.extraCallbackWithResult()) {
                }
                Intrinsics.checkNotNull(this, "");
                if (!extraCallbackWithResult()) {
                }
                cryptverifysignaturevalueAsBinder = logicissuecertgenmgenp.onExtraCallbackWithResult();
                onwarmupcompleted.L$0 = logicissuecertgenmgenp;
                onwarmupcompleted.L$1 = logicrenewcertgenmgenp;
                onwarmupcompleted.L$2 = null;
                onwarmupcompleted.L$3 = null;
                onwarmupcompleted.L$4 = null;
                onwarmupcompleted.L$5 = null;
                onwarmupcompleted.label = 6;
                if (onNavigationEvent(setIAuthTabCallback, cryptverifysignaturevalueAsBinder, logicrenewcertgenmgenp, onwarmupcompleted) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            case 4:
                getVIDRandom getvidrandom6 = (getVIDRandom) onwarmupcompleted.L$5;
                it = (Iterator) onwarmupcompleted.L$4;
                getvidrandom3 = (getVIDRandom) onwarmupcompleted.L$3;
                set = (Set) onwarmupcompleted.L$2;
                logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) onwarmupcompleted.L$1;
                logicissuecertgenmgenp2 = (logicIssueCertGenmGenp) onwarmupcompleted.L$0;
                try {
                    ResultKt.onNavigationEvent(obj2);
                } catch (Exception e3) {
                    getvidrandom6.onExtraCallback(e3);
                }
                getvidrandom2 = getvidrandom3;
                while (it.hasNext()) {
                }
                setIAuthTabCallback = set;
                logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
                logicissuecertgenmgenp = logicissuecertgenmgenp2;
                Intrinsics.checkNotNull(this, "");
                if (!extraCallbackWithResult()) {
                }
                cryptverifysignaturevalueAsBinder = logicissuecertgenmgenp.onExtraCallbackWithResult();
                onwarmupcompleted.L$0 = logicissuecertgenmgenp;
                onwarmupcompleted.L$1 = logicrenewcertgenmgenp;
                onwarmupcompleted.L$2 = null;
                onwarmupcompleted.L$3 = null;
                onwarmupcompleted.L$4 = null;
                onwarmupcompleted.L$5 = null;
                onwarmupcompleted.label = 6;
                if (onNavigationEvent(setIAuthTabCallback, cryptverifysignaturevalueAsBinder, logicrenewcertgenmgenp, onwarmupcompleted) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            case 5:
                getVIDRandom getvidrandom7 = (getVIDRandom) onwarmupcompleted.L$5;
                it2 = (Iterator) onwarmupcompleted.L$4;
                logicdisusecertrr = (logicDisuseCertRr) onwarmupcompleted.L$3;
                set2 = (Set) onwarmupcompleted.L$2;
                logicrenewcertgenmgenp3 = (logicRenewCertGenmGenp) onwarmupcompleted.L$1;
                logicissuecertgenmgenp3 = (logicIssueCertGenmGenp) onwarmupcompleted.L$0;
                try {
                    ResultKt.onNavigationEvent(obj2);
                } catch (Exception e4) {
                    getvidrandom7.onExtraCallback(e4);
                }
                while (it2.hasNext()) {
                }
                setIAuthTabCallback = set2;
                logicrenewcertgenmgenp = logicrenewcertgenmgenp3;
                logicissuecertgenmgenp = logicissuecertgenmgenp3;
                cryptverifysignaturevalueAsBinder = logicissuecertgenmgenp.onExtraCallbackWithResult();
                onwarmupcompleted.L$0 = logicissuecertgenmgenp;
                onwarmupcompleted.L$1 = logicrenewcertgenmgenp;
                onwarmupcompleted.L$2 = null;
                onwarmupcompleted.L$3 = null;
                onwarmupcompleted.L$4 = null;
                onwarmupcompleted.L$5 = null;
                onwarmupcompleted.label = 6;
                if (onNavigationEvent(setIAuthTabCallback, cryptverifysignaturevalueAsBinder, logicrenewcertgenmgenp, onwarmupcompleted) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            case 6:
                logicrenewcertgenmgenp4 = (logicRenewCertGenmGenp) onwarmupcompleted.L$1;
                logicissuecertgenmgenp4 = (logicIssueCertGenmGenp) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(obj2);
                onwarmupcompleted.L$0 = logicissuecertgenmgenp4;
                onwarmupcompleted.L$1 = logicrenewcertgenmgenp4;
                onwarmupcompleted.label = 7;
                break;
            case 7:
                logicrenewcertgenmgenp4 = (logicRenewCertGenmGenp) onwarmupcompleted.L$1;
                logicissuecertgenmgenp4 = (logicIssueCertGenmGenp) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(obj2);
                setOnExtraCallback = cryptSeed.onExtraCallback(this, false, 1, null);
                logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub3 = logicissuecertgenmgenp4.onExtraCallbackWithResult().IAuthTabCallbackStub();
                Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub3, "");
                getvidrandom4 = (getVIDRandom) logicdisusecertrrIAuthTabCallbackStub3;
                if (!getvidrandom4.extraCallbackWithResult()) {
                    it3 = CollectionsKt___CollectionsKt.toList(logicissuecertgenmgenp4.onExtraCallback()).iterator();
                    logicrenewcertgenmgenp5 = logicrenewcertgenmgenp4;
                    set3 = setOnExtraCallback;
                    while (true) {
                        getVIDRandom getvidrandom8 = getvidrandom4;
                        while (it3.hasNext()) {
                            logicIssueCertSendConf.IAuthTabCallback iAuthTabCallback3 = (logicIssueCertSendConf.IAuthTabCallback) it3.next();
                            try {
                                onwarmupcompleted.L$0 = logicrenewcertgenmgenp5;
                                onwarmupcompleted.L$1 = set3;
                                onwarmupcompleted.L$2 = getvidrandom8;
                                onwarmupcompleted.L$3 = it3;
                                onwarmupcompleted.L$4 = getvidrandom8;
                                onwarmupcompleted.label = 8;
                                if (iAuthTabCallback3.onNavigationEvent(set3, logicrenewcertgenmgenp5, onwarmupcompleted) != objOnExtraCallback) {
                                }
                            } catch (Exception e5) {
                                getvidrandom4 = getvidrandom8;
                                getvidrandom8.onExtraCallback(e5);
                            }
                        }
                        setOnExtraCallback = set3;
                        logicrenewcertgenmgenp4 = logicrenewcertgenmgenp5;
                        getvidrandom8.onExtraCallback(e5);
                    }
                    return objOnExtraCallback;
                }
                Intrinsics.checkNotNull(this, "");
                if (!extraCallbackWithResult()) {
                    it4 = CollectionsKt___CollectionsKt.toList(cG_()).iterator();
                    logicdisusecertrr2 = this;
                    logicrenewcertgenmgenp6 = logicrenewcertgenmgenp4;
                    set4 = setOnExtraCallback;
                    while (it4.hasNext()) {
                        logicDisuseCertRr.IAuthTabCallback iAuthTabCallback4 = (logicDisuseCertRr.IAuthTabCallback) it4.next();
                        getVIDRandom getvidrandom9 = (getVIDRandom) logicdisusecertrr2;
                        try {
                            onwarmupcompleted.L$0 = logicrenewcertgenmgenp6;
                            onwarmupcompleted.L$1 = set4;
                            onwarmupcompleted.L$2 = logicdisusecertrr2;
                            onwarmupcompleted.L$3 = it4;
                            onwarmupcompleted.L$4 = getvidrandom9;
                            onwarmupcompleted.label = 9;
                        } catch (Exception e6) {
                            getvidrandom9.onExtraCallback(e6);
                        }
                        if (iAuthTabCallback4.onWarmupCompleted(set4, logicrenewcertgenmgenp6, onwarmupcompleted) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    }
                }
                return access14000.onNavigationEvent(true);
            case 8:
                getVIDRandom getvidrandom10 = (getVIDRandom) onwarmupcompleted.L$4;
                it3 = (Iterator) onwarmupcompleted.L$3;
                getvidrandom4 = (getVIDRandom) onwarmupcompleted.L$2;
                set3 = (Set) onwarmupcompleted.L$1;
                logicrenewcertgenmgenp5 = (logicRenewCertGenmGenp) onwarmupcompleted.L$0;
                try {
                    ResultKt.onNavigationEvent(obj2);
                } catch (Exception e7) {
                    getvidrandom10.onExtraCallback(e7);
                }
                while (true) {
                    getVIDRandom getvidrandom82 = getvidrandom4;
                    while (it3.hasNext()) {
                    }
                    setOnExtraCallback = set3;
                    logicrenewcertgenmgenp4 = logicrenewcertgenmgenp5;
                    getvidrandom82.onExtraCallback(e5);
                    break;
                }
                return objOnExtraCallback;
            case 9:
                getVIDRandom getvidrandom11 = (getVIDRandom) onwarmupcompleted.L$4;
                it4 = (Iterator) onwarmupcompleted.L$3;
                logicdisusecertrr2 = (logicDisuseCertRr) onwarmupcompleted.L$2;
                set4 = (Set) onwarmupcompleted.L$1;
                logicrenewcertgenmgenp6 = (logicRenewCertGenmGenp) onwarmupcompleted.L$0;
                try {
                    ResultKt.onNavigationEvent(obj2);
                } catch (Exception e8) {
                    getvidrandom11.onExtraCallback(e8);
                }
                while (it4.hasNext()) {
                }
                return access14000.onNavigationEvent(true);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class onTransact extends Lambda implements Function0<String> {
        final /* synthetic */ Object $argument;

        /* JADX INFO: Incorrect field signature: TE; */
        final /* synthetic */ certGetOCSPAddress $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lo/logicDecryptPriKey;TE;Ljava/lang/Object;)V */
        onTransact(certGetOCSPAddress certgetocspaddress, Object obj) {
            super(0);
            this.$event = certgetocspaddress;
            this.$argument = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return logicDecryptPriKey.this + " is finished, skipping event " + Reflection.getOrCreateKotlinClass(this.$event.getClass()).getSimpleName() + ", with argument " + this.$argument;
        }
    }

    static final class IAuthTabCallbackDefault extends Lambda implements Function0<String> {

        /* JADX INFO: Incorrect field signature: TE; */
        final /* synthetic */ certGetOCSPAddress $event;
        final /* synthetic */ Set<cryptVerifySignatureValue> $targetStates;
        final /* synthetic */ logicIssueCertGenmGenp<E> $transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<+Lo/cryptVerifySignatureValue;>;TE;Lo/logicIssueCertGenmGenp<TE;>;)V */
        IAuthTabCallbackDefault(Set set, certGetOCSPAddress certgetocspaddress, logicIssueCertGenmGenp logicissuecertgenmgenp) {
            super(0);
            this.$targetStates = set;
            this.$event = certgetocspaddress;
            this.$transition = logicissuecertgenmgenp;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String str;
            if (this.$targetStates.isEmpty()) {
                str = "[target-less]";
            } else {
                str = "to [" + CollectionsKt___CollectionsKt.joinToString$default(this.$targetStates, null, null, null, 0, null, null, 63, null) + "]";
            }
            String simpleName = Reflection.getOrCreateKotlinClass(this.$event.getClass()).getSimpleName();
            logicIssueCertGenmGenp<E> logicissuecertgenmgenp = this.$transition;
            return simpleName + " triggers " + logicissuecertgenmgenp + " from " + logicissuecertgenmgenp.onExtraCallbackWithResult() + " " + str;
        }
    }

    @Override // o.cryptECDHKeyAgreement, o.cryptVerifySignatureValue
    public Object onWarmupCompleted(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        if (onActivityLayout()) {
            Object objOnWarmupCompleted = super.onWarmupCompleted(logicrenewcertgenmgenp, access13800Var);
            return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
        }
        Object objOnWarmupCompleted2 = logicDisuseCertRr.onWarmupCompleted.onWarmupCompleted(this, null, access13800Var, 1, null);
        return objOnWarmupCompleted2 == access14100.onExtraCallback() ? objOnWarmupCompleted2 : Unit.INSTANCE;
    }

    @Override // o.cryptECDHKeyAgreement, o.cryptVerifySignatureValue
    public Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        this.IAuthTabCallbackStub.clear();
        Object objOnExtraCallback = super.onExtraCallback(access13800Var);
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (onExtraCallback(r9, (o.access13800<? super kotlin.Unit>) r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008e -> B:25:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        logicDisuseCertRr logicdisusecertrr;
        Iterator it;
        getVIDRandom getvidrandom;
        onExtraCallbackWithResult onextracallbackwithresult;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i = iAuthTabCallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iAuthTabCallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.IAuthTabCallback = true;
            Intrinsics.checkNotNull(this, "");
            if (!extraCallbackWithResult()) {
                logicdisusecertrr = this;
                it = CollectionsKt___CollectionsKt.toList(cG_()).iterator();
            }
            onextracallbackwithresult = new onExtraCallbackWithResult();
            iAuthTabCallback.L$0 = null;
            iAuthTabCallback.L$1 = null;
            iAuthTabCallback.L$2 = null;
            iAuthTabCallback.label = 2;
            if (cryptSeed.onExtraCallback(this, onextracallbackwithresult, iAuthTabCallback) != objOnExtraCallback) {
                logicVerifyCMSSignedData logicverifycert = new logicVerifyCert();
                iAuthTabCallback.label = 3;
            }
            return objOnExtraCallback;
        }
        if (i2 == 1) {
            getvidrandom = (getVIDRandom) iAuthTabCallback.L$2;
            it = (Iterator) iAuthTabCallback.L$1;
            logicdisusecertrr = (logicDisuseCertRr) iAuthTabCallback.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Exception e) {
                getvidrandom.onExtraCallback(e);
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            logicVerifyCMSSignedData logicverifycert2 = new logicVerifyCert();
            iAuthTabCallback.label = 3;
        }
        while (it.hasNext()) {
            logicDisuseCertRr.IAuthTabCallback iAuthTabCallback2 = (logicDisuseCertRr.IAuthTabCallback) it.next();
            getvidrandom = (getVIDRandom) logicdisusecertrr;
            iAuthTabCallback.L$0 = logicdisusecertrr;
            iAuthTabCallback.L$1 = it;
            iAuthTabCallback.L$2 = getvidrandom;
            iAuthTabCallback.label = 1;
            if (iAuthTabCallback2.onExtraCallback(iAuthTabCallback) == objOnExtraCallback) {
                break;
            }
        }
        onextracallbackwithresult = new onExtraCallbackWithResult();
        iAuthTabCallback.L$0 = null;
        iAuthTabCallback.L$1 = null;
        iAuthTabCallback.L$2 = null;
        iAuthTabCallback.label = 2;
        if (cryptSeed.onExtraCallback(this, onextracallbackwithresult, iAuthTabCallback) != objOnExtraCallback) {
        }
        return objOnExtraCallback;
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function0<String> {
        onExtraCallbackWithResult() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return logicDecryptPriKey.this + " destroyed";
        }
    }
}
