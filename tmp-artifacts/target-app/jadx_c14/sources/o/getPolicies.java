package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.network.model.cardsales.funnel.UploadImageReq;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPolicies {

    static final class onNavigationEvent extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getPolicies.onWarmupCompleted(null, null, null, this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getPolicies.IAuthTabCallback(null, false, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue.IdType r7, @org.jetbrains.annotations.NotNull byte[] r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof o.getPolicies.onNavigationEvent
            if (r0 == 0) goto L13
            r0 = r10
            o.getPolicies$onNavigationEvent r0 = (o.getPolicies.onNavigationEvent) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.getPolicies$onNavigationEvent r0 = new o.getPolicies$onNavigationEvent
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$3
            o.access13800 r7 = (o.access13800) r7
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$1
            byte[] r7 = (byte[]) r7
            java.lang.Object r7 = r0.L$0
            viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue$IdType r7 = (viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue.IdType) r7
            kotlin.ResultKt.onNavigationEvent(r10)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            goto L78
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            kotlin.ResultKt.onNavigationEvent(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            o.GeckoHubImp r10 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            o.getPolicies$onExtraCallbackWithResult r2 = new o.getPolicies$onExtraCallbackWithResult     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r4 = 0
            r2.<init>(r4, r8, r7, r9)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            java.lang.Object r7 = o.access15400.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r0.L$0 = r7     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            java.lang.Object r7 = o.access15400.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r0.L$1 = r7     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            java.lang.Object r7 = o.access15400.onNavigationEvent(r9)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r0.L$2 = r7     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            java.lang.Object r7 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r0.L$3 = r7     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r7 = 0
            r0.I$0 = r7     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r0.I$1 = r7     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r0.I$2 = r7     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            r0.label = r3     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            java.lang.Object r10 = o.maybeUpdateAnimatable.onExtraCallback(r10, r2, r0)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            if (r10 != r1) goto L78
            return r1
        L78:
            java.lang.Object r7 = kotlin.Result.constructor-impl(r10)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L89 o.WebResourceResponseModel -> L8b
            goto L96
        L7d:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            goto L96
        L89:
            r7 = move-exception
            throw r7
        L8b:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
        L96:
            java.lang.Throwable r8 = kotlin.Result.exceptionOrNull-impl(r7)
            if (r8 == 0) goto La3
            o.ConvertFloatArrayToByteArray r9 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r10 = "CardIssueOcrImageUploader"
            r9.IAuthTabCallback(r10, r8)
        La3:
            kotlin.ResultKt.onNavigationEvent(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lb1
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        Lb1:
            o.ConvertFloatArrayToByteArray r0 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r1 = "CardIssueOcrImageUploader"
            java.lang.String r2 = "UploadImage API failed"
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "UploadImage API failed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPolicies.onWarmupCompleted(viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue$IdType, byte[], java.lang.String, o.access13800):java.lang.Object");
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        final /* synthetic */ IdVerificationFormValue.IdType $idType$inlined;
        final /* synthetic */ byte[] $imageBytes$inlined;
        final /* synthetic */ String $sessionId$inlined;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, byte[] bArr, IdVerificationFormValue.IdType idType, String str) {
            super(2, access13800Var);
            this.$imageBytes$inlined = bArr;
            this.$idType$inlined = idType;
            this.$sessionId$inlined = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(access13800Var, this.$imageBytes$inlined, this.$idType$inlined, this.$sessionId$inlined);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                byte[] bArr = this.$imageBytes$inlined;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (bitmapDecodeByteArray == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                try {
                    IANAObjectIdentifiers iANAObjectIdentifiers = new IANAObjectIdentifiers();
                    try {
                        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, iANAObjectIdentifiers);
                        byte[] byteArray = iANAObjectIdentifiers.toByteArray();
                        CloseableKt.closeFinally(iANAObjectIdentifiers, (Throwable) null);
                        try {
                            Intrinsics.checkNotNull(byteArray);
                            String strOnExtraCallbackWithResult = Page.onExtraCallbackWithResult(byteArray, 0, 1, (Object) null);
                            ArraysKt.fill$default(byteArray, (byte) 0, 0, 0, 6, (Object) null);
                            bitmapDecodeByteArray.recycle();
                            ExtraHints extraHintsOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.onExtraCallback();
                            UploadImageReq uploadImageReq = new UploadImageReq(this.$idType$inlined, strOnExtraCallbackWithResult, this.$sessionId$inlined);
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(bitmapDecodeByteArray);
                            this.L$2 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
                            this.I$0 = 0;
                            this.label = 1;
                            obj = extraHintsOnExtraCallback.onExtraCallback(uploadImageReq, (access13800<? super BaseApiResponse<Boolean>>) this);
                            if (obj == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        } catch (Throwable th) {
                            Intrinsics.checkNotNull(byteArray);
                            ArraysKt.fill$default(byteArray, (byte) 0, 0, 0, 6, (Object) null);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    bitmapDecodeByteArray.recycle();
                    throw th2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (Boolean) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(Boolean.class, Object.class) || Intrinsics.areEqual(Boolean.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    public static final Object onExtraCallback(@NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        CardIssueOverviewViewModel.onExtraCallback onextracallbackICustomTabsCallback = cardIssueOverviewViewModel.ICustomTabsCallback();
        String strICustomTabsCallbackStubProxy = cardIssueOverviewViewModel.ICustomTabsCallbackStubProxy();
        if (strICustomTabsCallbackStubProxy == null) {
            strICustomTabsCallbackStubProxy = "";
        }
        Object objIAuthTabCallback = IAuthTabCallback(onextracallbackICustomTabsCallback, z, strICustomTabsCallbackStubProxy, new onExtraCallback(cardIssueOverviewViewModel), null, access13800Var, 16, null);
        return objIAuthTabCallback == access14300.onWarmupCompleted() ? objIAuthTabCallback : Unit.INSTANCE;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        onExtraCallback(Object obj) {
            super(0, obj, CardIssueOverviewViewModel.class, "clearPendingOcrImage", "clearPendingOcrImage$Legacy_release()V", 0);
        }

        public /* synthetic */ Object invoke() {
            onNavigationEvent();
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent() {
            ((CardIssueOverviewViewModel) ((CallableReference) this).receiver).IAuthTabCallback();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object IAuthTabCallback(@org.jetbrains.annotations.Nullable viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.onExtraCallback r4, boolean r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r7, @org.jetbrains.annotations.NotNull o.setTaggedAddrCtrl<? super viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue.IdType, ? super byte[], ? super java.lang.String, ? super o.access13800<? super kotlin.Unit>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof o.getPolicies.onWarmupCompleted
            if (r0 == 0) goto L13
            r0 = r9
            o.getPolicies$onWarmupCompleted r0 = (o.getPolicies.onWarmupCompleted) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.getPolicies$onWarmupCompleted r0 = new o.getPolicies$onWarmupCompleted
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r4 = r0.L$3
            o.setTaggedAddrCtrl r4 = (o.setTaggedAddrCtrl) r4
            java.lang.Object r4 = r0.L$2
            r7 = r4
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$0
            viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$onExtraCallback r4 = (viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.onExtraCallback) r4
            kotlin.ResultKt.onNavigationEvent(r9)
            goto L7c
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L42:
            kotlin.ResultKt.onNavigationEvent(r9)
            if (r5 == 0) goto L50
            if (r4 == 0) goto L4a
            goto L50
        L4a:
            o.getDataGroupHashValue r4 = new o.getDataGroupHashValue
            r4.<init>()
            throw r4
        L50:
            if (r4 != 0) goto L55
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L55:
            viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue$IdType r9 = r4.onNavigationEvent()
            byte[] r2 = r4.IAuthTabCallback()
            java.lang.Object r4 = o.access15400.onNavigationEvent(r4)
            r0.L$0 = r4
            java.lang.Object r4 = o.access15400.onNavigationEvent(r6)
            r0.L$1 = r4
            r0.L$2 = r7
            java.lang.Object r4 = o.access15400.onNavigationEvent(r8)
            r0.L$3 = r4
            r0.Z$0 = r5
            r0.label = r3
            java.lang.Object r4 = r8.invoke(r9, r2, r6, r0)
            if (r4 != r1) goto L7c
            return r1
        L7c:
            r7.invoke()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPolicies.IAuthTabCallback(viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$onExtraCallback, boolean, java.lang.String, kotlin.jvm.functions.Function0, o.setTaggedAddrCtrl, o.access13800):java.lang.Object");
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements setTaggedAddrCtrl<IdVerificationFormValue.IdType, byte[], String, access13800<? super Unit>, Object> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        IAuthTabCallback() {
            super(4, getPolicies.class, "uploadCardIssueOcrImage", "uploadCardIssueOcrImage(Lviva/republica/toss/network/model/cardsales/funnel/formvalue/IdVerificationFormValue$IdType;[BLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(IdVerificationFormValue.IdType idType, byte[] bArr, String str, access13800<? super Unit> access13800Var) {
            return getPolicies.onWarmupCompleted(idType, bArr, str, access13800Var);
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(CardIssueOverviewViewModel.onExtraCallback onextracallback, boolean z, String str, Function0 function0, setTaggedAddrCtrl settaggedaddrctrl, access13800 access13800Var, int i, Object obj) {
        if ((i & 16) != 0) {
            settaggedaddrctrl = IAuthTabCallback.onExtraCallbackWithResult;
        }
        return IAuthTabCallback(onextracallback, z, str, function0, settaggedaddrctrl, access13800Var);
    }
}
