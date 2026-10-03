package o;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.core.cache.RxSharedApiCall;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.UST_CERT_GetSignatureAlgorithm;
import o.deserializeUriNullableCollection;
import o.setApTextSize;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.init.CheckoutReq;
import viva.republica.toss.network.model.init.v2.CheckoutResult;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetSignatureAlgorithm {
    public static final int IAuthTabCallback;
    public static final UST_CERT_GetSignatureAlgorithm onExtraCallback;
    private static final RxSharedApiCall<CheckoutResult> onExtraCallbackWithResult;

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = UST_CERT_GetSignatureAlgorithm.this.onNavigationEvent(false, (access13800<? super Result<Unit>>) this);
            return objOnNavigationEvent == access14300.onWarmupCompleted() ? objOnNavigationEvent : Result.IAuthTabCallback(objOnNavigationEvent);
        }
    }

    private UST_CERT_GetSignatureAlgorithm() {
    }

    private final writeRaw<CheckoutResult> onExtraCallbackWithResult() throws Throwable {
        final Ref.LongRef longRef = new Ref.LongRef();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29425), ((Process.getThreadPriority(0) + 20) >> 6) + 22, 24734 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1627237207);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29426), TextUtils.indexOf((CharSequence) "", '0') + 23, (ViewConfiguration.getScrollBarSize() >> 8) + 24734, -1371362759, false, "asInterface", new Class[0]);
            }
            writeRaw<BaseApiResponse<CheckoutResult>> writerawOnWarmupCompleted = ((MediaViewListener) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted(new CheckoutReq((String) null, (String) null, (Long) null, (Long) null, 0, (String) null, 63, (DefaultConstructorMarker) null));
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.CheckoutManager$$ExternalSyntheticLambda4
                public final Object invoke(Object obj2) {
                    return UST_CERT_GetSignatureAlgorithm.onNavigationEvent(longRef, (deserializeUriNullableCollection) obj2);
                }
            };
            writeRaw writerawOnExtraCallback = writerawOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.core.CheckoutManager$$ExternalSyntheticLambda5
                public final void accept(Object obj2) {
                    UST_CERT_GetSignatureAlgorithm.onExtraCallbackWithResult(function1, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.core.CheckoutManager$$ExternalSyntheticLambda6
                public final Object invoke(Object obj2) {
                    return UST_CERT_GetSignatureAlgorithm.IAuthTabCallback(longRef, (CheckoutResult) obj2);
                }
            };
            writeRaw<CheckoutResult> writerawOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.core.CheckoutManager$$ExternalSyntheticLambda7
                public final void accept(Object obj2) {
                    UST_CERT_GetSignatureAlgorithm.onTransact(function12, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
            return writerawOnNavigationEvent;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(Ref.LongRef longRef, deserializeUriNullableCollection deserializeurinullablecollection) {
        longRef.element = zzaj.onWarmupCompleted().onExtraCallbackWithResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransact(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(Ref.LongRef longRef, CheckoutResult checkoutResult) {
        Object[] objArr = {checkoutResult, Long.valueOf(zzaj.onWarmupCompleted().onExtraCallbackWithResult() - longRef.element)};
        setTestMode.onExtraCallback(-1340737858, 1340737862, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    static {
        UST_CERT_GetSignatureAlgorithm uST_CERT_GetSignatureAlgorithm = new UST_CERT_GetSignatureAlgorithm();
        onExtraCallback = uST_CERT_GetSignatureAlgorithm;
        RxSharedApiCall.Companion companion = RxSharedApiCall.Companion;
        writeRaw<CheckoutResult> writerawOnExtraCallbackWithResult = uST_CERT_GetSignatureAlgorithm.onExtraCallbackWithResult();
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        onExtraCallbackWithResult = RxSharedApiCall.Companion.onWarmupCompleted(companion, "checkout", writerawOnExtraCallbackWithResult, (Object) null, setLogBuffers.onWarmupCompleted(setCommandLine.onWarmupCompleted(2, setRevision.SECONDS)), 4, (Object) null);
        IAuthTabCallback = 8;
    }

    public final JsonReaderUnknownNumberParsing<CheckoutResult> onExtraCallback() {
        Object[] objArr = {onExtraCallbackWithResult, null, null, false, 7, null};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        JsonReaderUnknownNumberParsing<CheckoutResult> jsonReaderUnknownNumberParsingBG_ = ((writeRaw) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -939077752, 939077756, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent())).bG_();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingBG_, "");
        return jsonReaderUnknownNumberParsingBG_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CheckoutResult checkoutResult) {
        return Unit.INSTANCE;
    }

    public final void onNavigationEvent() {
        Object[] objArr = {onExtraCallbackWithResult, null, null, false, 7, null};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        writeRaw writeraw = (writeRaw) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -939077752, 939077756, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.core.CheckoutManager$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UST_CERT_GetSignatureAlgorithm.onWarmupCompleted((CheckoutResult) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.core.CheckoutManager$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                UST_CERT_GetSignatureAlgorithm.IAuthTabCallbackStub(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.core.CheckoutManager$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return UST_CERT_GetSignatureAlgorithm.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        writeraw.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.core.CheckoutManager$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                UST_CERT_GetSignatureAlgorithm.asInterface(function12, obj);
            }
        });
    }

    public static /* synthetic */ Object onExtraCallback(UST_CERT_GetSignatureAlgorithm uST_CERT_GetSignatureAlgorithm, boolean z, access13800 access13800Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return uST_CERT_GetSignatureAlgorithm.onNavigationEvent(z, (access13800<? super Result<Unit>>) access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNavigationEvent(boolean r12, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<kotlin.Unit>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof o.UST_CERT_GetSignatureAlgorithm.onWarmupCompleted
            if (r0 == 0) goto L13
            r0 = r13
            o.UST_CERT_GetSignatureAlgorithm$onWarmupCompleted r0 = (o.UST_CERT_GetSignatureAlgorithm.onWarmupCompleted) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.UST_CERT_GetSignatureAlgorithm$onWarmupCompleted r0 = new o.UST_CERT_GetSignatureAlgorithm$onWarmupCompleted
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.L$0
            o.access13800 r12 = (o.access13800) r12
            kotlin.ResultKt.onNavigationEvent(r13)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            goto L8c
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.ResultKt.onNavigationEvent(r13)
            kotlin.Result$Companion r13 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            im.toss.core.cache.RxSharedApiCall r13 = IAuthTabCallback()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r2 = 6
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r2 = 0
            r9[r2] = r13     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r13 = 0
            r9[r3] = r13     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r4 = 2
            r9[r4] = r13     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r5 = 3
            r9[r5] = r4     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r5 = 4
            r9[r5] = r4     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r4 = 5
            r9[r4] = r13     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            int r6 = o.setApTextSize.onNavigationEvent.4.onNavigationEvent()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            int r4 = o.setApTextSize.onNavigationEvent.4.onNavigationEvent()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            int r10 = o.setApTextSize.onNavigationEvent.4.onNavigationEvent()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            int r5 = o.setApTextSize.onNavigationEvent.4.onNavigationEvent()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r7 = -939077752(0xffffffffc806cf88, float:-138046.12)
            r8 = 939077756(0x37f9307c, float:2.970569E-5)
            java.lang.Object r13 = im.toss.core.cache.RxSharedApiCall.onExtraCallback(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            o.writeRaw r13 = (o.writeRaw) r13     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            java.lang.Object r4 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r0.L$0 = r4     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r0.Z$0 = r12     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r0.I$0 = r2     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r0.I$1 = r2     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            r0.label = r3     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            java.lang.Object r12 = kotlinx.coroutines.rx2.RxAwaitKt.onWarmupCompleted(r13, r0)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            if (r12 != r1) goto L8c
            return r1
        L8c:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            java.lang.Object r12 = kotlin.Result.constructor-impl(r12)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> L9f o.WebResourceResponseModel -> La1
            return r12
        L93:
            r12 = move-exception
            kotlin.Result$Companion r13 = kotlin.Result.Companion
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.constructor-impl(r12)
            goto Lac
        L9f:
            r12 = move-exception
            throw r12
        La1:
            r12 = move-exception
            kotlin.Result$Companion r13 = kotlin.Result.Companion
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.constructor-impl(r12)
        Lac:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetSignatureAlgorithm.onNavigationEvent(boolean, o.access13800):java.lang.Object");
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<CheckoutResult> apply(writeRaw<BaseApiResponse<CheckoutResult>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass3 anonymousClass3 = new Function1<BaseApiResponse<CheckoutResult>, deserializeIp<? extends CheckoutResult>>() { // from class: o.UST_CERT_GetSignatureAlgorithm.onExtraCallbackWithResult.3
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends CheckoutResult> invoke(BaseApiResponse<CheckoutResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = CheckoutResult.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass3) { // from class: o.UtilsKtExternalSyntheticLambda17$removeOnNewIntentListener
                private final /* synthetic */ Function1 onWarmupCompleted;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass3, "");
                    this.onWarmupCompleted = anonymousClass3;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onWarmupCompleted.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }
}
