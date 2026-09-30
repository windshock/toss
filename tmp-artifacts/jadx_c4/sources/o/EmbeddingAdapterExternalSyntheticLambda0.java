package o;

import com.google.android.gms.internal.ads.zzgc;
import im.toss.appsintoss.data.remote.model.AppsInTossAvailableProductListRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossCashReceiptRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoResponse;
import im.toss.appsintoss.data.remote.model.AppsInTossPurchaseHistoryDetailRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossPurchaseHistoryListRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossRefundRequest;
import im.toss.appsintoss.data.remote.model.CreateOrderRequest;
import im.toss.appsintoss.data.remote.model.CreateOrderResponse;
import im.toss.appsintoss.data.remote.model.ProcessProductGrantRequest;
import im.toss.appsintoss.data.remote.model.SubmitOrderRequest;
import im.toss.appsintoss.iap.model.AppsInTossCashReceipt;
import im.toss.appsintoss.iap.model.AppsInTossPurchaseHistoryInfo;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedDetailItem;
import im.toss.appsintoss.iap.model.AppsInTossRefundRequestResult;
import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbeddingAdapterExternalSyntheticLambda0 implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 {
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 IAuthTabCallback;
    private static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallbackWithResult = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = EmbeddingAdapterExternalSyntheticLambda0.this.onExtraCallbackWithResult(null, null, this);
            if (i3 != 0) {
                int i4 = 9 / 0;
            }
            int i5 = onExtraCallback + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = EmbeddingAdapterExternalSyntheticLambda0.this.onNavigationEvent(null, null, null, this);
            if (i3 == 0) {
                int i4 = 3 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = EmbeddingAdapterExternalSyntheticLambda0.this.onNavigationEvent(null, this);
            if (i3 != 0) {
                int i4 = 62 / 0;
            }
            int i5 = IAuthTabCallback + 63;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 84 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    static final class IAuthTabCallback_Parcel extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = EmbeddingAdapterExternalSyntheticLambda0.this.onExtraCallback(null, null, false, this);
            int i4 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static final class access000 extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        access000(access13800<? super access000> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            EmbeddingAdapterExternalSyntheticLambda0 embeddingAdapterExternalSyntheticLambda0 = EmbeddingAdapterExternalSyntheticLambda0.this;
            if (i3 != 0) {
                return embeddingAdapterExternalSyntheticLambda0.onNavigationEvent(null, null, this);
            }
            embeddingAdapterExternalSyntheticLambda0.onNavigationEvent(null, null, this);
            throw null;
        }
    }

    static final class access100 extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = EmbeddingAdapterExternalSyntheticLambda0.this.onExtraCallback(null, null, null, null, this);
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return objOnExtraCallback;
        }
    }

    static final class asBinder extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            r5 = kotlin.Result.IAuthTabCallback(r5);
            r1 = o.EmbeddingAdapterExternalSyntheticLambda0.asBinder.IAuthTabCallback + 81;
            o.EmbeddingAdapterExternalSyntheticLambda0.asBinder.onExtraCallback = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        
            if ((r1 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        
            if (r5 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (r5 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        
            return r5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = EmbeddingAdapterExternalSyntheticLambda0.this.onExtraCallbackWithResult(null, this);
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
        }
    }

    static final class asInterface extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = EmbeddingAdapterExternalSyntheticLambda0.this.onWarmupCompleted(null, null, null, null, this);
            int i4 = onExtraCallback + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            EmbeddingAdapterExternalSyntheticLambda0 embeddingAdapterExternalSyntheticLambda0 = EmbeddingAdapterExternalSyntheticLambda0.this;
            if (i3 != 0) {
                return embeddingAdapterExternalSyntheticLambda0.onWarmupCompleted(null, null, null, null, null, null, this);
            }
            Object objOnWarmupCompleted = embeddingAdapterExternalSyntheticLambda0.onWarmupCompleted(null, null, null, null, null, null, this);
            int i4 = 18 / 0;
            return objOnWarmupCompleted;
        }
    }

    static {
        int i = onExtraCallback + 15;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public EmbeddingAdapterExternalSyntheticLambda0(@NotNull ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(activityWindowInfoCallbackControllerExternalSyntheticLambda0, "");
        this.IAuthTabCallback = activityWindowInfoCallbackControllerExternalSyntheticLambda0;
    }

    public static final /* synthetic */ ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 onExtraCallback(EmbeddingAdapterExternalSyntheticLambda0 embeddingAdapterExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = embeddingAdapterExternalSyntheticLambda0.IAuthTabCallback;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 83;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return activityWindowInfoCallbackControllerExternalSyntheticLambda0;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull access13800<? super WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> access13800Var) {
        asInterface asinterface;
        WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!(access13800Var instanceof asInterface)) {
            asinterface = new asInterface(access13800Var);
        } else {
            asinterface = (asInterface) access13800Var;
            int i2 = asinterface.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onWarmupCompleted + 69;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                asinterface.label = i2 - 2147483648;
                int i5 = asBinder + 97;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Object objOnExtraCallbackWithResult = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = asinterface.label;
        if (i7 != 0) {
            int i8 = asBinder + 45;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) asinterface.L$1;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = windowInfoTrackerCompanionExternalSyntheticLambda0.onExtraCallbackWithResult();
            String strOnNavigationEvent = windowInfoTrackerCompanionExternalSyntheticLambda0.onNavigationEvent();
            AppsInTossProductInfoRequest appsInTossProductInfoRequest = new AppsInTossProductInfoRequest(str, str2, str3);
            asinterface.L$0 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
            asinterface.L$1 = str;
            asinterface.L$2 = access15400.onNavigationEvent(str2);
            asinterface.L$3 = access15400.onNavigationEvent(str3);
            asinterface.label = 1;
            objOnExtraCallbackWithResult = activityWindowInfoCallbackControllerExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult, strOnNavigationEvent, appsInTossProductInfoRequest, (access13800<? super BaseApiResponse<AppsInTossProductInfoResponse>>) asinterface);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        AppsInTossProductInfoResponse appsInTossProductInfoResponse = (AppsInTossProductInfoResponse) ((BaseApiResponse) objOnExtraCallbackWithResult).onTransact();
        if (appsInTossProductInfoResponse == null || (windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallbackWithResult = EmbeddingAdapterExternalSyntheticLambda4.onExtraCallbackWithResult(appsInTossProductInfoResponse, str)) == null) {
            throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
        }
        int i10 = onWarmupCompleted + 55;
        asBinder = i10 % 128;
        int i11 = i10 % 2;
        return windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, @Nullable String str4, @NotNull access13800<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda31> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer2;
        Object obj;
        CreateOrderResponse createOrderResponse;
        String strOnNavigationEvent;
        String str5 = str;
        String str6 = str2;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i2 = onWarmupCompleted + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = asBinder + 89;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                onwarmupcompleted.label = i4 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objOnExtraCallback = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onwarmupcompleted.label;
        try {
            if (i7 != 0) {
                int i8 = asBinder + 55;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer3 = (InAppPurchaseProductAuthorizer) onwarmupcompleted.L$4;
                str6 = (String) onwarmupcompleted.L$2;
                String str7 = (String) onwarmupcompleted.L$1;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    inAppPurchaseProductAuthorizer2 = inAppPurchaseProductAuthorizer3;
                    str5 = str7;
                    obj = kotlin.Result.constructor-impl(objOnExtraCallback);
                } catch (Exception e) {
                    e = e;
                    inAppPurchaseProductAuthorizer2 = inAppPurchaseProductAuthorizer3;
                    str5 = str7;
                    Result.Companion companion = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    if (kotlin.Result.onExtraCallback(obj)) {
                    }
                    createOrderResponse = (CreateOrderResponse) obj;
                    if (createOrderResponse != null) {
                    }
                    throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
                } catch (WebResourceResponseModel e2) {
                    e = e2;
                    inAppPurchaseProductAuthorizer2 = inAppPurchaseProductAuthorizer3;
                    str5 = str7;
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    if (kotlin.Result.onExtraCallback(obj)) {
                    }
                    createOrderResponse = (CreateOrderResponse) obj;
                    if (createOrderResponse != null) {
                    }
                    throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
                }
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                CreateOrderRequest createOrderRequest = new CreateOrderRequest(str5, str6, str3, str4);
                try {
                    Result.Companion companion3 = kotlin.Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, inAppPurchaseProductAuthorizer, this, windowInfoTrackerCompanionExternalSyntheticLambda0, createOrderRequest);
                    onwarmupcompleted.L$0 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                    onwarmupcompleted.L$1 = str5;
                    onwarmupcompleted.L$2 = str6;
                    onwarmupcompleted.L$3 = access15400.onNavigationEvent(str3);
                    inAppPurchaseProductAuthorizer2 = inAppPurchaseProductAuthorizer;
                    try {
                        onwarmupcompleted.L$4 = inAppPurchaseProductAuthorizer2;
                        onwarmupcompleted.L$5 = access15400.onNavigationEvent(str4);
                        onwarmupcompleted.L$6 = access15400.onNavigationEvent(createOrderRequest);
                        onwarmupcompleted.L$7 = access15400.onNavigationEvent(onwarmupcompleted);
                        onwarmupcompleted.I$0 = 0;
                        onwarmupcompleted.I$1 = 0;
                        onwarmupcompleted.I$2 = 0;
                        onwarmupcompleted.label = 1;
                        objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, onwarmupcompleted);
                        if (objOnExtraCallback == objOnWarmupCompleted) {
                            int i10 = asBinder + 115;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                            return objOnWarmupCompleted;
                        }
                        obj = kotlin.Result.constructor-impl(objOnExtraCallback);
                    } catch (Exception e3) {
                        e = e3;
                        Result.Companion companion4 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                        if (kotlin.Result.onExtraCallback(obj)) {
                        }
                        createOrderResponse = (CreateOrderResponse) obj;
                        if (createOrderResponse != null) {
                        }
                        throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
                    } catch (WebResourceResponseModel e4) {
                        e = e4;
                        Result.Companion companion22 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                        if (kotlin.Result.onExtraCallback(obj)) {
                        }
                        createOrderResponse = (CreateOrderResponse) obj;
                        if (createOrderResponse != null) {
                        }
                        throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
                    }
                } catch (Exception e5) {
                    e = e5;
                    inAppPurchaseProductAuthorizer2 = inAppPurchaseProductAuthorizer;
                    Result.Companion companion42 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    if (kotlin.Result.onExtraCallback(obj)) {
                    }
                    createOrderResponse = (CreateOrderResponse) obj;
                    if (createOrderResponse != null) {
                    }
                    throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
                } catch (WebResourceResponseModel e6) {
                    e = e6;
                    inAppPurchaseProductAuthorizer2 = inAppPurchaseProductAuthorizer;
                    Result.Companion companion222 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                    if (kotlin.Result.onExtraCallback(obj)) {
                    }
                    createOrderResponse = (CreateOrderResponse) obj;
                    if (createOrderResponse != null) {
                    }
                    throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
                }
            }
            if (kotlin.Result.onExtraCallback(obj)) {
                obj = null;
            }
            createOrderResponse = (CreateOrderResponse) obj;
            if (createOrderResponse != null || (strOnNavigationEvent = createOrderResponse.onNavigationEvent()) == null) {
                throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted;
            }
            String strOnExtraCallbackWithResult = createOrderResponse.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "apps_in_toss_create_order", "skuToPurchase missing. orderId=" + strOnNavigationEvent + ", type=" + str5 + ", authorizer=" + inAppPurchaseProductAuthorizer2 + ", requestedSku=" + str6, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            } else {
                str6 = strOnExtraCallbackWithResult;
            }
            return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda31(strOnNavigationEvent, str6);
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, boolean z, @NotNull access13800<? super Boolean> access13800Var) {
        IAuthTabCallback_Parcel iAuthTabCallback_Parcel;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!(access13800Var instanceof IAuthTabCallback_Parcel)) {
            iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(access13800Var);
        } else {
            int i5 = i2 + 61;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iAuthTabCallback_Parcel = (IAuthTabCallback_Parcel) access13800Var;
            int i7 = iAuthTabCallback_Parcel.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback_Parcel.label = i7 - 2147483648;
            }
        }
        Object objOnExtraCallback = iAuthTabCallback_Parcel.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = iAuthTabCallback_Parcel.label;
        if (i8 != 0) {
            int i9 = asBinder + 87;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0 ? i8 != 1 : i8 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = windowInfoTrackerCompanionExternalSyntheticLambda0.onExtraCallbackWithResult();
            String strOnNavigationEvent = windowInfoTrackerCompanionExternalSyntheticLambda0.onNavigationEvent();
            ProcessProductGrantRequest processProductGrantRequest = new ProcessProductGrantRequest(str, z);
            iAuthTabCallback_Parcel.L$0 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
            iAuthTabCallback_Parcel.L$1 = access15400.onNavigationEvent(str);
            iAuthTabCallback_Parcel.Z$0 = z;
            iAuthTabCallback_Parcel.label = 1;
            objOnExtraCallback = activityWindowInfoCallbackControllerExternalSyntheticLambda0.onExtraCallback(strOnExtraCallbackWithResult, strOnNavigationEvent, processProductGrantRequest, (access13800<? super BaseApiResponse<Object>>) iAuthTabCallback_Parcel);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return access14000.onNavigationEvent(((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{(BaseApiResponse) objOnExtraCallback}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull access13800<? super AppsInTossPurchaseHistoryInfo> access13800Var) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (!(access13800Var instanceof IAuthTabCallbackDefault)) {
            iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
            int i5 = onWarmupCompleted + 53;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = i2 + 81;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i9 = iAuthTabCallbackDefault.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackDefault.label = i9 - 2147483648;
            }
        }
        Object objIAuthTabCallback = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = iAuthTabCallbackDefault.label;
        if (i10 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = this.IAuthTabCallback;
            AppsInTossPurchaseHistoryListRequest appsInTossPurchaseHistoryListRequest = new AppsInTossPurchaseHistoryListRequest(str2, str3, str);
            iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(str);
            iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(str2);
            iAuthTabCallbackDefault.L$2 = access15400.onNavigationEvent(str3);
            iAuthTabCallbackDefault.label = 1;
            objIAuthTabCallback = activityWindowInfoCallbackControllerExternalSyntheticLambda0.IAuthTabCallback(appsInTossPurchaseHistoryListRequest, iAuthTabCallbackDefault);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i11 = asBinder + 45;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = asBinder + 105;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        return ((BaseApiResponse) objIAuthTabCallback).onTransact();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super AppsInTossPurchasedDetailItem> access13800Var) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
            if (access13800Var instanceof IAuthTabCallbackStub) {
                iAuthTabCallbackStub = (IAuthTabCallbackStub) access13800Var;
                int i4 = iAuthTabCallbackStub.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    int i5 = onWarmupCompleted + 117;
                    asBinder = i5 % 128;
                    if (i5 % 2 == 0) {
                        iAuthTabCallbackStub.label = i4 << Integer.MIN_VALUE;
                    } else {
                        iAuthTabCallbackStub.label = i4 - 2147483648;
                    }
                } else {
                    iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
                }
            }
        } else if (!(access13800Var instanceof IAuthTabCallbackStub)) {
        }
        Object objOnExtraCallbackWithResult = iAuthTabCallbackStub.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallbackStub.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = this.IAuthTabCallback;
            AppsInTossPurchaseHistoryDetailRequest appsInTossPurchaseHistoryDetailRequest = new AppsInTossPurchaseHistoryDetailRequest(str);
            iAuthTabCallbackStub.L$0 = access15400.onNavigationEvent(str);
            iAuthTabCallbackStub.label = 1;
            objOnExtraCallbackWithResult = activityWindowInfoCallbackControllerExternalSyntheticLambda0.onExtraCallbackWithResult(appsInTossPurchaseHistoryDetailRequest, iAuthTabCallbackStub);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                int i7 = asBinder + 7;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 28 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        }
        return ((BaseApiResponse) objOnExtraCallbackWithResult).onTransact();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull access13800<? super AppsInTossRefundRequestResult> access13800Var) {
        access000 access000Var;
        int i = 2 % 2;
        if (access13800Var instanceof access000) {
            access000Var = (access000) access13800Var;
            int i2 = access000Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = asBinder + 79;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                access000Var.label = i2 - 2147483648;
                int i5 = onWarmupCompleted + 13;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            } else {
                access000Var = new access000(access13800Var);
            }
        }
        Object objOnExtraCallback = access000Var.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = access000Var.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = this.IAuthTabCallback;
            AppsInTossRefundRequest appsInTossRefundRequest = new AppsInTossRefundRequest(str, str2);
            access000Var.L$0 = access15400.onNavigationEvent(str);
            access000Var.L$1 = access15400.onNavigationEvent(str2);
            access000Var.label = 1;
            objOnExtraCallback = activityWindowInfoCallbackControllerExternalSyntheticLambda0.onExtraCallback(appsInTossRefundRequest, (access13800<? super BaseApiResponse<AppsInTossRefundRequestResult>>) access000Var);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        return ((BaseApiResponse) objOnExtraCallback).onTransact();
    }

    public static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super AppsInTossCashReceipt>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $orderId$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ EmbeddingAdapterExternalSyntheticLambda0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(access13800 access13800Var, EmbeddingAdapterExternalSyntheticLambda0 embeddingAdapterExternalSyntheticLambda0, String str) {
            super(2, access13800Var);
            this.this$0 = embeddingAdapterExternalSyntheticLambda0;
            this.$orderId$inlined = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(access13800Var, this.this$0, this.$orderId$inlined);
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 14 / 0;
            }
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super AppsInTossCashReceipt> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
        
            if (r1 != null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
        
            if (r1 != null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
        
            r2 = o.EmbeddingAdapterExternalSyntheticLambda0.onTransact.onExtraCallbackWithResult + 125;
            o.EmbeddingAdapterExternalSyntheticLambda0.onTransact.onWarmupCompleted = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        
            return (im.toss.appsintoss.iap.model.AppsInTossCashReceipt) r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type im.toss.appsintoss.iap.model.AppsInTossCashReceipt");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnTransact;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0OnExtraCallback = EmbeddingAdapterExternalSyntheticLambda0.onExtraCallback(this.this$0);
                AppsInTossCashReceiptRequest appsInTossCashReceiptRequest = new AppsInTossCashReceiptRequest(this.$orderId$inlined);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = activityWindowInfoCallbackControllerExternalSyntheticLambda0OnExtraCallback.onExtraCallback(appsInTossCashReceiptRequest, (access13800<? super BaseApiResponse<AppsInTossCashReceipt>>) this);
                if (obj == objOnWarmupCompleted) {
                    int i3 = onExtraCallbackWithResult + 55;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 75 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult != null) {
                    throw apiErrorExtraCallbackWithResult;
                }
                int i6 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                int i8 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                throw apiErrorOnExtraCallbackWithResult;
            }
            int i10 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i10 % 128;
            try {
                if (i10 % 2 == 0) {
                    objOnTransact = baseApiResponse.onTransact();
                    int i11 = 87 / 0;
                } else {
                    objOnTransact = baseApiResponse.onTransact();
                }
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(AppsInTossCashReceipt.class, Object.class) || Intrinsics.areEqual(AppsInTossCashReceipt.class, Unit.class)) {
                    return Unit.INSTANCE;
                }
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult2 = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult2.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult2;
            }
        }
    }

    static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreateOrderResponse>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ InAppPurchaseProductAuthorizer $authorizer$inlined;
        final /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0 $miniAppInfo$inlined;
        final /* synthetic */ CreateOrderRequest $request$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ EmbeddingAdapterExternalSyntheticLambda0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, EmbeddingAdapterExternalSyntheticLambda0 embeddingAdapterExternalSyntheticLambda0, WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, CreateOrderRequest createOrderRequest) {
            super(2, access13800Var);
            this.$authorizer$inlined = inAppPurchaseProductAuthorizer;
            this.this$0 = embeddingAdapterExternalSyntheticLambda0;
            this.$miniAppInfo$inlined = windowInfoTrackerCompanionExternalSyntheticLambda0;
            this.$request$inlined = createOrderRequest;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.$authorizer$inlined, this.this$0, this.$miniAppInfo$inlined, this.$request$inlined);
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super CreateOrderResponse> access13800Var) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
            int i5 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            if (r12 == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
        
            if (r12 == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallback.onWarmupCompleted[this.$authorizer$inlined.ordinal()];
                if (i5 == 1) {
                    ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0OnExtraCallback = EmbeddingAdapterExternalSyntheticLambda0.onExtraCallback(this.this$0);
                    String strOnExtraCallbackWithResult = this.$miniAppInfo$inlined.onExtraCallbackWithResult();
                    String strOnNavigationEvent = this.$miniAppInfo$inlined.onNavigationEvent();
                    CreateOrderRequest createOrderRequest = this.$request$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = activityWindowInfoCallbackControllerExternalSyntheticLambda0OnExtraCallback.onWarmupCompleted(strOnExtraCallbackWithResult, strOnNavigationEvent, createOrderRequest, (access13800<? super BaseApiResponse<CreateOrderResponse>>) this);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i6 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0OnExtraCallback2 = EmbeddingAdapterExternalSyntheticLambda0.onExtraCallback(this.this$0);
                    String strOnExtraCallbackWithResult2 = this.$miniAppInfo$inlined.onExtraCallbackWithResult();
                    String strOnNavigationEvent2 = this.$miniAppInfo$inlined.onNavigationEvent();
                    CreateOrderRequest createOrderRequest2 = this.$request$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 2;
                    obj = activityWindowInfoCallbackControllerExternalSyntheticLambda0OnExtraCallback2.onExtraCallbackWithResult(strOnExtraCallbackWithResult2, strOnNavigationEvent2, createOrderRequest2, (access13800<? super BaseApiResponse<CreateOrderResponse>>) this);
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact == null) {
                    throw new NullPointerException("null cannot be cast to non-null type im.toss.appsintoss.data.remote.model.CreateOrderResponse");
                }
                int i8 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    return (CreateOrderResponse) objOnTransact;
                }
                throw null;
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(CreateOrderResponse.class, Object.class) && !Intrinsics.areEqual(CreateOrderResponse.class, Unit.class)) {
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
                CreateOrderResponse createOrderResponse = Unit.INSTANCE;
                int i9 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 24 / 0;
                }
                return createOrderResponse;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull access13800<? super JsonObject> access13800Var) throws TossApiCallException.ApiError {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 41;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (access13800Var instanceof IAuthTabCallback) {
            int i5 = i2 + 53;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = ((IAuthTabCallback) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i7 = iAuthTabCallback.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = onWarmupCompleted + 53;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    iAuthTabCallback.label = i7 >>> Integer.MIN_VALUE;
                } else {
                    iAuthTabCallback.label = i7 - 2147483648;
                }
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = iAuthTabCallback.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = windowInfoTrackerCompanionExternalSyntheticLambda0.onExtraCallbackWithResult();
            String strOnNavigationEvent = windowInfoTrackerCompanionExternalSyntheticLambda0.onNavigationEvent();
            AppsInTossAvailableProductListRequest appsInTossAvailableProductListRequest = new AppsInTossAvailableProductListRequest(str);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
            iAuthTabCallback.L$1 = access15400.onNavigationEvent(str);
            iAuthTabCallback.label = 1;
            objOnExtraCallback = activityWindowInfoCallbackControllerExternalSyntheticLambda0.onExtraCallback(strOnExtraCallbackWithResult, strOnNavigationEvent, appsInTossAvailableProductListRequest, (access13800<? super BaseApiResponse<JsonObject>>) iAuthTabCallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        BaseApiResponse baseApiResponse = (BaseApiResponse) objOnExtraCallback;
        if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
        try {
            Object objOnTransact = baseApiResponse.onTransact();
            if (objOnTransact == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            }
            int i10 = asBinder + 53;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                return (JsonObject) objOnTransact;
            }
            throw null;
        } catch (NullPointerException e) {
            if (Intrinsics.areEqual(JsonObject.class, Object.class) || Intrinsics.areEqual(JsonObject.class, Unit.class)) {
                return Unit.INSTANCE;
            }
            TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
            apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
            throw apiErrorOnExtraCallbackWithResult;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r3 != r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0178, code lost:
    
        if (r3 == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b7, code lost:
    
        if (r3.onTransact() != null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @NotNull InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, @NotNull access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException, TossApiCallException.ApiError {
        access100 access100Var;
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof access100;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof access100) {
            access100Var = (access100) access13800Var;
            int i3 = access100Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                access100Var.label = i3 - 2147483648;
            } else {
                access100Var = new access100(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = access100Var.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = access100Var.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            int i5 = onExtraCallback.onWarmupCompleted[inAppPurchaseProductAuthorizer.ordinal()];
            if (i5 == 1) {
                ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = this.IAuthTabCallback;
                String strOnExtraCallbackWithResult = windowInfoTrackerCompanionExternalSyntheticLambda0.onExtraCallbackWithResult();
                String strOnNavigationEvent = windowInfoTrackerCompanionExternalSyntheticLambda0.onNavigationEvent();
                SubmitOrderRequest submitOrderRequest = new SubmitOrderRequest(str, str2);
                access100Var.L$0 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                access100Var.L$1 = access15400.onNavigationEvent(str);
                access100Var.L$2 = access15400.onNavigationEvent(str2);
                access100Var.L$3 = access15400.onNavigationEvent(inAppPurchaseProductAuthorizer);
                access100Var.label = 1;
                objOnExtraCallbackWithResult = activityWindowInfoCallbackControllerExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult, strOnNavigationEvent, submitOrderRequest, (access13800<? super BaseApiResponse<Object>>) access100Var);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda02 = this.IAuthTabCallback;
                String strOnExtraCallbackWithResult2 = windowInfoTrackerCompanionExternalSyntheticLambda0.onExtraCallbackWithResult();
                String strOnNavigationEvent2 = windowInfoTrackerCompanionExternalSyntheticLambda0.onNavigationEvent();
                SubmitOrderRequest submitOrderRequest2 = new SubmitOrderRequest(str, str2);
                access100Var.L$0 = access15400.onNavigationEvent(windowInfoTrackerCompanionExternalSyntheticLambda0);
                access100Var.L$1 = access15400.onNavigationEvent(str);
                access100Var.L$2 = access15400.onNavigationEvent(str2);
                access100Var.L$3 = access15400.onNavigationEvent(inAppPurchaseProductAuthorizer);
                access100Var.label = 2;
                objOnExtraCallbackWithResult = activityWindowInfoCallbackControllerExternalSyntheticLambda02.onWarmupCompleted(strOnExtraCallbackWithResult2, strOnNavigationEvent2, submitOrderRequest2, (access13800<? super BaseApiResponse<Object>>) access100Var);
            }
            return objOnWarmupCompleted;
        }
        int i6 = onWarmupCompleted + 111;
        int i7 = i6 % 128;
        asBinder = i7;
        if (i6 % 2 != 0 ? i4 == 1 : i4 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            BaseApiResponse baseApiResponse = (BaseApiResponse) objOnExtraCallbackWithResult;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i8 = asBinder + 53;
            onWarmupCompleted = i8 % 128;
            try {
                if (i8 % 2 == 0) {
                    if (baseApiResponse.onTransact() != null) {
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                int i9 = 66 / 0;
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(Object.class, Object.class) && !Intrinsics.areEqual(Object.class, Unit.class)) {
                    int i10 = asBinder + 113;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult2 = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult2.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    int i11 = 22 / 0;
                    throw apiErrorOnExtraCallbackWithResult2;
                }
                Unit unit = Unit.INSTANCE;
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = i7 + 95;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                throw null;
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            BaseApiResponse baseApiResponse2 = (BaseApiResponse) objOnExtraCallbackWithResult;
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse2}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult2 = baseApiResponse2.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult2 == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse2);
                }
                throw apiErrorExtraCallbackWithResult2;
            }
            try {
                if (baseApiResponse2.onTransact() == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
            } catch (NullPointerException e2) {
                if (!Intrinsics.areEqual(Object.class, Object.class) && !Intrinsics.areEqual(Object.class, Unit.class)) {
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult3 = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e2);
                    apiErrorOnExtraCallbackWithResult3.onWarmupCompleted(baseApiResponse2.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult3;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull String str, @NotNull access13800<? super kotlin.Result<AppsInTossCashReceipt>> access13800Var) {
        asBinder asbinder;
        int i = 2 % 2;
        if (!(!(access13800Var instanceof asBinder))) {
            asbinder = (asBinder) access13800Var;
            int i2 = asbinder.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = asBinder + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                asbinder.label = i2 - 2147483648;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object objOnExtraCallback = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = asbinder.label;
        try {
            if (i5 != 0) {
                int i6 = onWarmupCompleted + 65;
                int i7 = i6 % 128;
                asBinder = i7;
                int i8 = i6 % 2;
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = i7 + 25;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                ResultKt.onNavigationEvent(objOnExtraCallback);
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = kotlin.Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onTransact ontransact = new onTransact(null, this, str);
                asbinder.L$0 = access15400.onNavigationEvent(str);
                asbinder.L$1 = access15400.onNavigationEvent(asbinder);
                asbinder.I$0 = 0;
                asbinder.I$1 = 0;
                asbinder.I$2 = 0;
                asbinder.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, ontransact, asbinder);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return kotlin.Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
        }
    }
}
