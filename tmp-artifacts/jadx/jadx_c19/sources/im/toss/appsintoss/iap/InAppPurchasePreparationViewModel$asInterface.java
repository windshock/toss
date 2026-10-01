package im.toss.appsintoss.iap;

import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import im.toss.appsintoss.manager.model.AppsInTossProduct;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.IAnimation;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult;
import o.SplitControllersplitInfoList1ExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.WindowInfoTrackerCompanionExternalSyntheticLambda0;
import o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.doGet;
import o.findResAndMsg;
import o.getBorderRadius;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setRipple;
import o.setRubIn;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchasePreparationViewModel$asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    final /* synthetic */ String $rawReceipt;
    final /* synthetic */ String $targetOrderId;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InAppPurchasePreparationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchasePreparationViewModel$asInterface(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, String str, String str2, access13800<? super InAppPurchasePreparationViewModel$asInterface> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchasePreparationViewModel;
        this.$targetOrderId = str;
        this.$rawReceipt = str2;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchasePreparationViewModel$asInterface inAppPurchasePreparationViewModel$asInterface = new InAppPurchasePreparationViewModel$asInterface(this.this$0, this.$targetOrderId, this.$rawReceipt, access13800Var);
        inAppPurchasePreparationViewModel$asInterface.L$0 = obj;
        int i3 = onExtraCallback + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
        }
        return inAppPurchasePreparationViewModel$asInterface;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        onNavigationEvent = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
        int i4 = onExtraCallback + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i5 = onExtraCallback + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $targetOrderId;
        Object L$0;
        int label;
        final /* synthetic */ InAppPurchasePreparationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, String str, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = inAppPurchasePreparationViewModel;
            this.$targetOrderId = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$targetOrderId, access13800Var);
            int i3 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i4 == 0) {
                int i5 = 54 / 0;
            }
            int i6 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult>, Object> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ String $targetOrderId;
            int label;
            final /* synthetic */ InAppPurchasePreparationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = inAppPurchasePreparationViewModel;
                this.$targetOrderId = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, this.$targetOrderId, access13800Var);
                int i3 = onNavigationEvent + 125;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 113;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i5 = onWarmupCompleted + 71;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult> access13800Var) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 83;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i4 != 0) {
                    return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                }
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final class IAuthTabCallback implements IAnimation<Object> {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ IAnimation onNavigationEvent;

                /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationViewModel$asInterface$onExtraCallback$onExtraCallbackWithResult$IAuthTabCallback$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements setRipple {
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;
                    final /* synthetic */ setRipple onWarmupCompleted;

                    /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationViewModel$asInterface$onExtraCallback$onExtraCallbackWithResult$IAuthTabCallback$2$2, reason: invalid class name and collision with other inner class name */
                    public static final class C00362 extends ContinuationImpl {
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public C00362(access13800 access13800Var) {
                            super(access13800Var);
                        }

                        public final Object invokeSuspend(Object obj) {
                            int i2 = 2 % 2;
                            int i3 = onExtraCallbackWithResult + 81;
                            onExtraCallback = i3 % 128;
                            int i4 = i3 % 2;
                            Object obj2 = null;
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            Object objEmit = AnonymousClass2.this.emit(null, this);
                            if (i4 == 0) {
                                int i5 = 10 / 0;
                            }
                            int i6 = onExtraCallbackWithResult + 21;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                return objEmit;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    }

                    public AnonymousClass2(setRipple setripple) {
                        this.onWarmupCompleted = setripple;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, access13800 access13800Var) {
                        C00362 c00362;
                        int i2 = 2 % 2;
                        if (access13800Var instanceof C00362) {
                            c00362 = (C00362) access13800Var;
                            int i3 = c00362.label;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                c00362.label = i3 - 2147483648;
                            } else {
                                c00362 = new C00362(access13800Var);
                            }
                        }
                        Object obj2 = c00362.result;
                        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                        int i4 = c00362.label;
                        if (i4 == 0) {
                            ResultKt.onNavigationEvent(obj2);
                            setRipple setripple = this.onWarmupCompleted;
                            if (!(!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult))) {
                                int i5 = onNavigationEvent + 103;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                c00362.L$0 = access15400.onNavigationEvent(obj);
                                c00362.L$1 = access15400.onNavigationEvent(c00362);
                                c00362.L$2 = access15400.onNavigationEvent(obj);
                                c00362.L$3 = access15400.onNavigationEvent(setripple);
                                c00362.I$0 = 0;
                                c00362.label = 1;
                                if (setripple.emit(obj, c00362) == objOnWarmupCompleted) {
                                    int i7 = onNavigationEvent + 33;
                                    IAuthTabCallback = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i8 = 63 / 0;
                                    }
                                    return objOnWarmupCompleted;
                                }
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                public IAuthTabCallback(IAnimation iAnimation) {
                    this.onNavigationEvent = iAnimation;
                }

                public Object collect(setRipple setripple, access13800 access13800Var) {
                    int i2 = 2 % 2;
                    Object objCollect = this.onNavigationEvent.collect(new AnonymousClass2(setripple), access13800Var);
                    if (objCollect == access14300.onWarmupCompleted()) {
                        int i3 = onWarmupCompleted + 27;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        return objCollect;
                    }
                    Unit unit = Unit.INSTANCE;
                    int i5 = onExtraCallback + 97;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }
            }

            /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationViewModel$asInterface$onExtraCallback$onExtraCallbackWithResult$onExtraCallback, reason: collision with other inner class name */
            public static final class C0037onExtraCallback implements IAnimation<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                final /* synthetic */ IAnimation onNavigationEvent;
                final /* synthetic */ String onWarmupCompleted;

                /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationViewModel$asInterface$onExtraCallback$onExtraCallbackWithResult$onExtraCallback$3, reason: invalid class name */
                public static final class AnonymousClass3<T> implements setRipple {
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;
                    final /* synthetic */ setRipple onExtraCallbackWithResult;
                    final /* synthetic */ String onWarmupCompleted;

                    /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationViewModel$asInterface$onExtraCallback$onExtraCallbackWithResult$onExtraCallback$3$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(access13800 access13800Var) {
                            super(access13800Var);
                        }

                        public final Object invokeSuspend(Object obj) {
                            int i2 = 2 % 2;
                            int i3 = IAuthTabCallback + 113;
                            onWarmupCompleted = i3 % 128;
                            int i4 = i3 % 2;
                            Object obj2 = null;
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            if (i4 != 0) {
                                anonymousClass3.emit(null, this);
                                obj2.hashCode();
                                throw null;
                            }
                            Object objEmit = anonymousClass3.emit(null, this);
                            int i5 = IAuthTabCallback + 53;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            return objEmit;
                        }
                    }

                    public AnonymousClass3(setRipple setripple, String str) {
                        this.onExtraCallbackWithResult = setripple;
                        this.onWarmupCompleted = str;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, access13800 access13800Var) {
                        AnonymousClass1 anonymousClass1;
                        int i2 = 2 % 2;
                        if (access13800Var instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) access13800Var;
                            int i3 = anonymousClass1.label;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                int i4 = onExtraCallback + 23;
                                IAuthTabCallback = i4 % 128;
                                if (i4 % 2 == 0) {
                                    anonymousClass1.label = i3 - 2147483648;
                                } else {
                                    anonymousClass1.label = i3 - 2147483648;
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(access13800Var);
                                int i5 = IAuthTabCallback + 97;
                                onExtraCallback = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i6 = 5 % 4;
                                }
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                        int i7 = anonymousClass1.label;
                        if (i7 == 0) {
                            ResultKt.onNavigationEvent(obj2);
                            setRipple setripple = this.onExtraCallbackWithResult;
                            if (Intrinsics.areEqual(((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult) obj).onWarmupCompleted(), this.onWarmupCompleted)) {
                                int i8 = IAuthTabCallback + 71;
                                onExtraCallback = i8 % 128;
                                int i9 = i8 % 2;
                                anonymousClass1.L$0 = access15400.onNavigationEvent(obj);
                                anonymousClass1.L$1 = access15400.onNavigationEvent(anonymousClass1);
                                anonymousClass1.L$2 = access15400.onNavigationEvent(obj);
                                anonymousClass1.L$3 = access15400.onNavigationEvent(setripple);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (setripple.emit(obj, anonymousClass1) == objOnWarmupCompleted) {
                                    return objOnWarmupCompleted;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                public C0037onExtraCallback(IAnimation iAnimation, String str) {
                    this.onNavigationEvent = iAnimation;
                    this.onWarmupCompleted = str;
                }

                public Object collect(setRipple setripple, access13800 access13800Var) {
                    int i2 = 2 % 2;
                    Object objCollect = this.onNavigationEvent.collect(new AnonymousClass3(setripple, this.onWarmupCompleted), access13800Var);
                    if (objCollect != access14300.onWarmupCompleted()) {
                        return Unit.INSTANCE;
                    }
                    int i3 = IAuthTabCallback;
                    int i4 = i3 + 35;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 81;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        return objCollect;
                    }
                    throw null;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 != 0) {
                    int i4 = onWarmupCompleted + 43;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                C0037onExtraCallback c0037onExtraCallback = new C0037onExtraCallback(new IAuthTabCallback(InAppPurchasePreparationViewModel.onWarmupCompleted(this.this$0).onExtraCallbackWithResult()), this.$targetOrderId);
                this.label = 1;
                Object objOnExtraCallback = ycxycx.onExtraCallback(c0037onExtraCallback, this);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    return objOnExtraCallback;
                }
                int i6 = onNavigationEvent + 109;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        
            if (r3.emit(r4, r8) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            if (r3.emit(r5, r8) == r1) goto L30;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, this.$targetOrderId, null);
                this.label = 1;
                obj = doGet.onWarmupCompleted(30000L, onextracallbackwithresult, this);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                InAppPurchasePreparationViewModel.access100(this.this$0).onWarmupCompleted(access14000.onNavigationEvent(false));
                Unit unit = Unit.INSTANCE;
                int i5 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult) obj;
            if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult == null || !safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult.onExtraCallbackWithResult()) {
                getBorderRadius getborderradiusAsInterface = InAppPurchasePreparationViewModel.asInterface(this.this$0);
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onTransact ontransact = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onTransact.onExtraCallback;
                this.L$0 = access15400.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult);
                this.label = 3;
            } else {
                getBorderRadius getborderradiusIAuthTabCallbackStubProxy = InAppPurchasePreparationViewModel.IAuthTabCallbackStubProxy(this.this$0);
                Unit unit2 = Unit.INSTANCE;
                this.L$0 = access15400.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult);
                this.label = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f1, code lost:
    
        if (r0 != r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i2;
        String strIAuthTabCallbackStub;
        int iOnWarmupCompleted;
        String strOnExtraCallback;
        Throwable th;
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel;
        Object objOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (Exception e3) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            InAppPurchasePreparationViewModel.access100(this.this$0).onWarmupCompleted(access14000.onNavigationEvent(true));
            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel2 = this.this$0;
            String str = this.$targetOrderId;
            String str2 = this.$rawReceipt;
            Result.Companion companion3 = Result.Companion;
            SplitControllersplitInfoList1ExternalSyntheticLambda1 splitControllersplitInfoList1ExternalSyntheticLambda1OnNavigationEvent = InAppPurchasePreparationViewModel.onNavigationEvent(inAppPurchasePreparationViewModel2);
            WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = (WindowInfoTrackerCompanionExternalSyntheticLambda0) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel2}, -893111417, 893111419);
            if (windowInfoTrackerCompanionExternalSyntheticLambda0 == null) {
                int i5 = onNavigationEvent + 19;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                windowInfoTrackerCompanionExternalSyntheticLambda0 = null;
            }
            InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer = (InAppPurchaseProductAuthorizer) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel2}, -693604272, 693604272);
            this.L$0 = findresandmsg;
            this.L$1 = access15400.onNavigationEvent(this);
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            objOnExtraCallbackWithResult = splitControllersplitInfoList1ExternalSyntheticLambda1OnNavigationEvent.onExtraCallbackWithResult(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, inAppPurchaseProductAuthorizer, this);
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    int i7 = onExtraCallback;
                    int i8 = i7 + 89;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i10 = i7 + 81;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 != 0) {
                        inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) this.L$2;
                        ResultKt.onNavigationEvent(obj);
                        int i11 = 95 / 0;
                    } else {
                        inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) this.L$2;
                        ResultKt.onNavigationEvent(obj);
                    }
                    InAppPurchasePreparationViewModel.access100(inAppPurchasePreparationViewModel).onWarmupCompleted(access14000.onNavigationEvent(false));
                    return Unit.INSTANCE;
                }
                obj2 = this.L$1;
                ResultKt.onNavigationEvent(obj);
                int i12 = onNavigationEvent + 37;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel3 = this.this$0;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    int i14 = onNavigationEvent + 111;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    getBorderRadius getborderradiusAsInterface = InAppPurchasePreparationViewModel.asInterface(inAppPurchasePreparationViewModel3);
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault iAuthTabCallbackDefault = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault.onExtraCallback;
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = obj2;
                    this.L$2 = inAppPurchasePreparationViewModel3;
                    this.L$3 = access15400.onNavigationEvent(th);
                    this.I$0 = 0;
                    this.label = 3;
                    if (getborderradiusAsInterface.emit(iAuthTabCallbackDefault, this) != objOnWarmupCompleted) {
                        inAppPurchasePreparationViewModel = inAppPurchasePreparationViewModel3;
                        InAppPurchasePreparationViewModel.access100(inAppPurchasePreparationViewModel).onWarmupCompleted(access14000.onNavigationEvent(false));
                    }
                    return objOnWarmupCompleted;
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallbackWithResult = obj;
        }
        obj2 = Result.constructor-impl(objOnExtraCallbackWithResult);
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel4 = this.this$0;
        String str3 = this.$targetOrderId;
        if (Result.onNavigationEvent(obj2)) {
            Unit unit = (Unit) obj2;
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(inAppPurchasePreparationViewModel4, str3, null), 3, (Object) null);
            WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) ((setRubIn) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel4}, -225118289, 225118298)).IAuthTabCallback();
            AppsInTossProduct appsInTossProductAsInterface = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 != null ? windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.asInterface() : null;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20OnWarmupCompleted = InAppPurchasePreparationViewModel.onWarmupCompleted(inAppPurchasePreparationViewModel4);
            String interfaceDescriptor = inAppPurchasePreparationViewModel4.getInterfaceDescriptor();
            if (appsInTossProductAsInterface != null) {
                int i16 = onExtraCallback + 77;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                String strIAuthTabCallback = appsInTossProductAsInterface.IAuthTabCallback();
                String str4 = strIAuthTabCallback == null ? "" : strIAuthTabCallback;
                if (appsInTossProductAsInterface != null) {
                    int i18 = onNavigationEvent + 15;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    String strOnNavigationEvent = appsInTossProductAsInterface.onNavigationEvent();
                    String str5 = strOnNavigationEvent == null ? "" : strOnNavigationEvent;
                    String str6 = (appsInTossProductAsInterface == null || (strOnExtraCallback = appsInTossProductAsInterface.onExtraCallback()) == null) ? "" : strOnExtraCallback;
                    long jOnExtraCallbackWithResult = appsInTossProductAsInterface != null ? appsInTossProductAsInterface.onExtraCallbackWithResult() : 0L;
                    if (appsInTossProductAsInterface != null) {
                        int i20 = onExtraCallback + 53;
                        onNavigationEvent = i20 % 128;
                        if (i20 % 2 != 0) {
                            iOnWarmupCompleted = appsInTossProductAsInterface.onWarmupCompleted();
                            int i21 = 83 / 0;
                        } else {
                            iOnWarmupCompleted = appsInTossProductAsInterface.onWarmupCompleted();
                        }
                        i2 = iOnWarmupCompleted;
                    } else {
                        i2 = 0;
                    }
                    WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda02 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) ((setRubIn) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel4}, -225118289, 225118298)).IAuthTabCallback();
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult(str3, interfaceDescriptor, str4, str5, str6, jOnExtraCallbackWithResult, i2, (windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda02 == null || (strIAuthTabCallbackStub = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda02.IAuthTabCallbackStub()) == null) ? "" : strIAuthTabCallbackStub);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = obj2;
                    this.L$2 = access15400.onNavigationEvent(unit);
                    this.L$3 = access15400.onNavigationEvent(appsInTossProductAsInterface);
                    this.I$0 = 0;
                    this.label = 2;
                    if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda20OnWarmupCompleted.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult, this) != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
        int i122 = onNavigationEvent + 37;
        onExtraCallback = i122 % 128;
        int i132 = i122 % 2;
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel32 = this.this$0;
        th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
        }
        return Unit.INSTANCE;
    }
}
