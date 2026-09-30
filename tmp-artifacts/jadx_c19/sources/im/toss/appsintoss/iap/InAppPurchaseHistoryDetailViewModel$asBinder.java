package im.toss.appsintoss.iap;

import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IAnimation;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SplitControllersplitInfoList1ExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.WindowInfoTrackerCompanionExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getWrite;
import o.setRipple;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchaseHistoryDetailViewModel$asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    int label;
    final /* synthetic */ InAppPurchaseHistoryDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchaseHistoryDetailViewModel$asBinder(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, access13800<? super InAppPurchaseHistoryDetailViewModel$asBinder> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchaseHistoryDetailViewModel;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchaseHistoryDetailViewModel$asBinder inAppPurchaseHistoryDetailViewModel$asBinder = new InAppPurchaseHistoryDetailViewModel$asBinder(this.this$0, access13800Var);
        int i3 = IAuthTabCallback + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return inAppPurchaseHistoryDetailViewModel$asBinder;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        int i5 = IAuthTabCallback + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i5 = IAuthTabCallback + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult implements IAnimation<Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ IAnimation onWarmupCompleted;

        /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel$asBinder$onExtraCallbackWithResult$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements setRipple {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ setRipple onNavigationEvent;

            /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel$asBinder$onExtraCallbackWithResult$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass3(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass1.this.emit(null, this);
                    int i5 = IAuthTabCallback + 41;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return objEmit;
                }
            }

            public AnonymousClass1(setRipple setripple) {
                this.onNavigationEvent = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass3 anonymousClass3;
                int i2 = 2 % 2;
                if (access13800Var instanceof AnonymousClass3) {
                    anonymousClass3 = (AnonymousClass3) access13800Var;
                    int i3 = anonymousClass3.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        anonymousClass3.label = i3 - 2147483648;
                    } else {
                        anonymousClass3 = new AnonymousClass3(access13800Var);
                    }
                }
                Object obj2 = anonymousClass3.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = anonymousClass3.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.onNavigationEvent;
                    if (obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult) {
                        int i5 = IAuthTabCallback + 119;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        anonymousClass3.L$0 = access15400.onNavigationEvent(obj);
                        anonymousClass3.L$1 = access15400.onNavigationEvent(anonymousClass3);
                        anonymousClass3.L$2 = access15400.onNavigationEvent(obj);
                        anonymousClass3.L$3 = access15400.onNavigationEvent(setripple);
                        anonymousClass3.I$0 = 0;
                        anonymousClass3.label = 1;
                        if (setripple.emit(obj, anonymousClass3) == objOnWarmupCompleted) {
                            int i7 = onExtraCallback;
                            int i8 = i7 + 57;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            int i10 = i7 + 37;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % 2;
                            return objOnWarmupCompleted;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = IAuthTabCallback + 49;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj2);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public onExtraCallbackWithResult(IAnimation iAnimation) {
            this.onWarmupCompleted = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i2 = 2 % 2;
            Object objCollect = this.onWarmupCompleted.collect(new AnonymousClass1(setripple), access13800Var);
            if (objCollect != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i3 = onExtraCallbackWithResult + 87;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 75;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return objCollect;
        }
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel$asBinder$5, reason: invalid class name */
    static final class AnonymousClass5<T> implements setRipple {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ InAppPurchaseHistoryDetailViewModel onWarmupCompleted;

        /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel$asBinder$5$onExtraCallback */
        static final class onExtraCallback extends ContinuationImpl {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            boolean Z$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ AnonymousClass5<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallback(AnonymousClass5<? super T> anonymousClass5, access13800<? super onExtraCallback> access13800Var) {
                super(access13800Var);
                this.this$0 = anonymousClass5;
            }

            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                Object objOnWarmupCompleted = this.this$0.onWarmupCompleted(null, this);
                int i5 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 0 / 0;
                }
                return objOnWarmupCompleted;
            }
        }

        AnonymousClass5(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
            this.onWarmupCompleted = inAppPurchaseHistoryDetailViewModel;
        }

        public /* synthetic */ Object emit(Object obj, access13800 access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 121;
            onNavigationEvent = i3 % 128;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult) obj;
            if (i3 % 2 != 0) {
                onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult, access13800Var);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult, access13800Var);
            int i4 = onExtraCallback + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x01b3, code lost:
        
            if (r0.onNavigationEvent(r9, r3) != r4) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult, access13800<? super Unit> access13800Var) {
            onExtraCallback onextracallback;
            String str;
            String strAccess000;
            WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult2;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3;
            Object obj;
            getBorderRadius getborderradiusAsInterface;
            Boolean boolOnNavigationEvent;
            boolean z;
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult4;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (access13800Var instanceof onExtraCallback) {
                onextracallback = (onExtraCallback) access13800Var;
                int i5 = onextracallback.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    onextracallback.label = i5 - 2147483648;
                } else {
                    onextracallback = new onExtraCallback(this, access13800Var);
                }
            }
            Object objOnNavigationEvent = onextracallback.result;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i6 = onextracallback.label;
            try {
                if (i6 == 0) {
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = InAppPurchaseHistoryDetailViewModel.onExtraCallback(this.onWarmupCompleted);
                    if (onextracallbackwithresultOnExtraCallback != null) {
                        String strIAuthTabCallback_Parcel = onextracallbackwithresultOnExtraCallback.IAuthTabCallback_Parcel();
                        int i7 = onNavigationEvent + 19;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        str = strIAuthTabCallback_Parcel;
                    } else {
                        str = null;
                    }
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback2 = InAppPurchaseHistoryDetailViewModel.onExtraCallback(this.onWarmupCompleted);
                    if (onextracallbackwithresultOnExtraCallback2 != null) {
                        int i9 = onExtraCallback + 89;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        strAccess000 = onextracallbackwithresultOnExtraCallback2.access000();
                    } else {
                        strAccess000 = null;
                    }
                    windowInfoTrackerCompanionExternalSyntheticLambda0 = new WindowInfoTrackerCompanionExternalSyntheticLambda0(strAccess000, str, (Integer) null, 4, (DefaultConstructorMarker) null);
                    InAppPurchaseHistoryDetailViewModel.onNavigationEvent(this.onWarmupCompleted, "on_product_grant_event", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.asInterface()), getWrite.IAuthTabCallback("mini_app_info", windowInfoTrackerCompanionExternalSyntheticLambda0.toString())}));
                    InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = this.onWarmupCompleted;
                    try {
                        Result.Companion companion = Result.Companion;
                        SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0OnWarmupCompleted = InAppPurchaseHistoryDetailViewModel.onWarmupCompleted(inAppPurchaseHistoryDetailViewModel);
                        String strAsInterface = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult.asInterface();
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult2 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult;
                        try {
                            onextracallback.L$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult2;
                            onextracallback.L$1 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                            onextracallback.L$2 = access15400.onNavigationEvent(onextracallback);
                            onextracallback.I$0 = 0;
                            onextracallback.I$1 = 0;
                            onextracallback.label = 1;
                            objOnNavigationEvent = splitControllersplitInfoList1ExternalSyntheticLambda0OnWarmupCompleted.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0, strAsInterface, true, onextracallback);
                            if (objOnNavigationEvent != objOnWarmupCompleted) {
                                safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult2;
                            }
                        } catch (WebResourceResponseModel e) {
                            e = e;
                            safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult2;
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(e));
                            Boolean boolOnNavigationEvent2 = access14000.onNavigationEvent(false);
                            if (Result.onExtraCallback(obj)) {
                            }
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            InAppPurchaseHistoryDetailViewModel.onNavigationEvent(this.onWarmupCompleted, "process_product_grant_result", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3.asInterface()), getWrite.IAuthTabCallback("granted", access14000.onNavigationEvent(zBooleanValue))}));
                            getborderradiusAsInterface = InAppPurchaseHistoryDetailViewModel.asInterface(this.onWarmupCompleted);
                            boolOnNavigationEvent = access14000.onNavigationEvent(zBooleanValue);
                            onextracallback.L$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3;
                            onextracallback.L$1 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                            onextracallback.L$2 = null;
                            onextracallback.Z$0 = zBooleanValue;
                            onextracallback.label = 2;
                            if (getborderradiusAsInterface.emit(boolOnNavigationEvent, onextracallback) != objOnWarmupCompleted) {
                            }
                            return objOnWarmupCompleted;
                        } catch (Exception e2) {
                            e = e2;
                            safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult2;
                            Result.Companion companion3 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(e));
                            Boolean boolOnNavigationEvent22 = access14000.onNavigationEvent(false);
                            if (Result.onExtraCallback(obj)) {
                            }
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            InAppPurchaseHistoryDetailViewModel.onNavigationEvent(this.onWarmupCompleted, "process_product_grant_result", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3.asInterface()), getWrite.IAuthTabCallback("granted", access14000.onNavigationEvent(zBooleanValue2))}));
                            getborderradiusAsInterface = InAppPurchaseHistoryDetailViewModel.asInterface(this.onWarmupCompleted);
                            boolOnNavigationEvent = access14000.onNavigationEvent(zBooleanValue2);
                            onextracallback.L$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3;
                            onextracallback.L$1 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                            onextracallback.L$2 = null;
                            onextracallback.Z$0 = zBooleanValue2;
                            onextracallback.label = 2;
                            if (getborderradiusAsInterface.emit(boolOnNavigationEvent, onextracallback) != objOnWarmupCompleted) {
                            }
                            return objOnWarmupCompleted;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult2 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult;
                    } catch (WebResourceResponseModel e4) {
                        e = e4;
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult2 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult;
                    }
                    return objOnWarmupCompleted;
                }
                int i11 = onExtraCallback + 87;
                int i12 = i11 % 128;
                onNavigationEvent = i12;
                int i13 = i11 % 2;
                if (i6 != 1) {
                    int i14 = i12 + 95;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    if (i6 != 2) {
                        if (i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(objOnNavigationEvent);
                        return Unit.INSTANCE;
                    }
                    z = onextracallback.Z$0;
                    windowInfoTrackerCompanionExternalSyntheticLambda0 = (WindowInfoTrackerCompanionExternalSyntheticLambda0) onextracallback.L$1;
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult4 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult) onextracallback.L$0;
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20IAuthTabCallback = InAppPurchaseHistoryDetailViewModel.IAuthTabCallback(this.onWarmupCompleted);
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult4.asInterface(), z);
                    onextracallback.L$0 = access15400.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult4);
                    onextracallback.L$1 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                    onextracallback.Z$0 = z;
                    onextracallback.label = 3;
                } else {
                    windowInfoTrackerCompanionExternalSyntheticLambda0 = (WindowInfoTrackerCompanionExternalSyntheticLambda0) onextracallback.L$1;
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult) onextracallback.L$0;
                    try {
                        ResultKt.onNavigationEvent(objOnNavigationEvent);
                    } catch (Exception e5) {
                        e = e5;
                        Result.Companion companion32 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(e));
                        Boolean boolOnNavigationEvent222 = access14000.onNavigationEvent(false);
                        if (Result.onExtraCallback(obj)) {
                        }
                        boolean zBooleanValue22 = ((Boolean) obj).booleanValue();
                        InAppPurchaseHistoryDetailViewModel.onNavigationEvent(this.onWarmupCompleted, "process_product_grant_result", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3.asInterface()), getWrite.IAuthTabCallback("granted", access14000.onNavigationEvent(zBooleanValue22))}));
                        getborderradiusAsInterface = InAppPurchaseHistoryDetailViewModel.asInterface(this.onWarmupCompleted);
                        boolOnNavigationEvent = access14000.onNavigationEvent(zBooleanValue22);
                        onextracallback.L$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3;
                        onextracallback.L$1 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                        onextracallback.L$2 = null;
                        onextracallback.Z$0 = zBooleanValue22;
                        onextracallback.label = 2;
                        if (getborderradiusAsInterface.emit(boolOnNavigationEvent, onextracallback) != objOnWarmupCompleted) {
                        }
                        return objOnWarmupCompleted;
                    } catch (WebResourceResponseModel e6) {
                        e = e6;
                        Result.Companion companion22 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(e));
                        Boolean boolOnNavigationEvent2222 = access14000.onNavigationEvent(false);
                        if (Result.onExtraCallback(obj)) {
                        }
                        boolean zBooleanValue222 = ((Boolean) obj).booleanValue();
                        InAppPurchaseHistoryDetailViewModel.onNavigationEvent(this.onWarmupCompleted, "process_product_grant_result", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3.asInterface()), getWrite.IAuthTabCallback("granted", access14000.onNavigationEvent(zBooleanValue222))}));
                        getborderradiusAsInterface = InAppPurchaseHistoryDetailViewModel.asInterface(this.onWarmupCompleted);
                        boolOnNavigationEvent = access14000.onNavigationEvent(zBooleanValue222);
                        onextracallback.L$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3;
                        onextracallback.L$1 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                        onextracallback.L$2 = null;
                        onextracallback.Z$0 = zBooleanValue222;
                        onextracallback.label = 2;
                        if (getborderradiusAsInterface.emit(boolOnNavigationEvent, onextracallback) != objOnWarmupCompleted) {
                        }
                        return objOnWarmupCompleted;
                    }
                }
                obj = Result.constructor-impl(objOnNavigationEvent);
                Boolean boolOnNavigationEvent22222 = access14000.onNavigationEvent(false);
                if (Result.onExtraCallback(obj)) {
                    obj = boolOnNavigationEvent22222;
                }
                boolean zBooleanValue2222 = ((Boolean) obj).booleanValue();
                InAppPurchaseHistoryDetailViewModel.onNavigationEvent(this.onWarmupCompleted, "process_product_grant_result", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3.asInterface()), getWrite.IAuthTabCallback("granted", access14000.onNavigationEvent(zBooleanValue2222))}));
                getborderradiusAsInterface = InAppPurchaseHistoryDetailViewModel.asInterface(this.onWarmupCompleted);
                boolOnNavigationEvent = access14000.onNavigationEvent(zBooleanValue2222);
                onextracallback.L$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3;
                onextracallback.L$1 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                onextracallback.L$2 = null;
                onextracallback.Z$0 = zBooleanValue2222;
                onextracallback.label = 2;
                if (getborderradiusAsInterface.emit(boolOnNavigationEvent, onextracallback) != objOnWarmupCompleted) {
                    z = zBooleanValue2222;
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult4 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult3;
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20IAuthTabCallback2 = InAppPurchaseHistoryDetailViewModel.IAuthTabCallback(this.onWarmupCompleted);
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult2 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult4.asInterface(), z);
                    onextracallback.L$0 = access15400.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda35$onExtraCallbackWithResult4);
                    onextracallback.L$1 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                    onextracallback.Z$0 = z;
                    onextracallback.label = 3;
                }
                return objOnWarmupCompleted;
            } catch (CancellationException e7) {
                throw e7;
            }
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 81;
        IAuthTabCallback = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            access14300.onWarmupCompleted();
            obj2.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 != 0) {
            int i5 = onExtraCallback;
            int i6 = i5 + 97;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = i5 + 13;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(InAppPurchaseHistoryDetailViewModel.IAuthTabCallback(this.this$0).IAuthTabCallback());
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0);
            this.label = 1;
            if (onextracallbackwithresult.collect(anonymousClass5, this) == objOnWarmupCompleted) {
                int i9 = IAuthTabCallback + 17;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
