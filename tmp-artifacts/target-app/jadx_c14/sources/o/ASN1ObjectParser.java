package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ASN1ObjectParser;
import o.AdComponentFrameLayout;
import o.S2SRewardedVideoAdExtendedListener;
import o.VideoStartReason;
import o.getAdComponentViewApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.notification.join.AccountNotificationJoinActivity;
import viva.republica.toss.network.model.account.notification.AccountNotificationGetCiResp;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ASN1ObjectParser {
    public static final ASN1ObjectParser IAuthTabCallback = new ASN1ObjectParser();

    static final class IAuthTabCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ASN1ObjectParser.this.onWarmupCompleted(null, null, null, 0, this);
        }
    }

    private ASN1ObjectParser() {
    }

    public final writeRaw<getAdComponentViewApi> onExtraCallbackWithResult() throws Throwable {
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - TextUtils.indexOf("", "", 0)), 22 - View.MeasureSpec.getSize(0), 24734 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - TextUtils.getOffsetAfter("", 0)), Drawable.resolveOpacity(0, 0) + 22, 24734 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
            }
            writeRaw<BaseApiResponse<getAdComponentViewApi>> writerawOnNavigationEvent = ((BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw<getAdComponentViewApi> writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final writeRaw<AdComponentViewParentApi> onExtraCallback(final int i) throws Throwable {
        writeRaw<getAdComponentViewApi> writerawOnExtraCallbackWithResult = onExtraCallbackWithResult();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return ASN1ObjectParser.onExtraCallbackWithResult(i, (getAdComponentViewApi) obj);
            }
        };
        writeRaw<AdComponentViewParentApi> writerawAsInterface = writerawOnExtraCallbackWithResult.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda7
            public final Object apply(Object obj) {
                return ASN1ObjectParser.onTransact(function1, obj);
            }
        }).asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda8
            public final Object apply(Object obj) {
                return ASN1ObjectParser.onExtraCallback((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawAsInterface, "");
        return writerawAsInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdComponentViewParentApi onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AdComponentViewParentApi) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdComponentViewParentApi onExtraCallbackWithResult(int i, getAdComponentViewApi getadcomponentviewapi) {
        Object next;
        Intrinsics.checkNotNullParameter(getadcomponentviewapi, "");
        List<AdComponentViewParentApi> listOnExtraCallbackWithResult = getadcomponentviewapi.onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult != null) {
            Iterator<T> it = listOnExtraCallbackWithResult.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdComponentViewParentApi) next).onExtraCallbackWithResult() == i) {
                    break;
                }
            }
            AdComponentViewParentApi adComponentViewParentApi = (AdComponentViewParentApi) next;
            if (adComponentViewParentApi != null) {
                return adComponentViewParentApi;
            }
        }
        return new AdComponentViewParentApi(0, null, 0, false, null, false, false, null, 255, null);
    }

    public static final class asBinder<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public asBinder(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onMultiWindowModeChanged(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: o.ASN1ObjectParser.asBinder.5
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Boolean> invoke(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Boolean.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class asInterface<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public asInterface(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<AccountNotificationGetCiResp> apply(writeRaw<BaseApiResponse<AccountNotificationGetCiResp>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onMultiWindowModeChanged(new Function1<BaseApiResponse<AccountNotificationGetCiResp>, deserializeIp<? extends AccountNotificationGetCiResp>>() { // from class: o.ASN1ObjectParser.asInterface.3
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends AccountNotificationGetCiResp> invoke(BaseApiResponse<AccountNotificationGetCiResp> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = AccountNotificationGetCiResp.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onExtraCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onMultiWindowModeChanged(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: o.ASN1ObjectParser.onExtraCallback.1
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Boolean> invoke(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Boolean.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<AdComponentFrameLayout> apply(writeRaw<BaseApiResponse<AdComponentFrameLayout>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onMultiWindowModeChanged(new Function1<BaseApiResponse<AdComponentFrameLayout>, deserializeIp<? extends AdComponentFrameLayout>>() { // from class: o.ASN1ObjectParser.onExtraCallbackWithResult.4
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends AdComponentFrameLayout> invoke(BaseApiResponse<AdComponentFrameLayout> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = AdComponentFrameLayout.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onNavigationEvent;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<getAdComponentViewApi> apply(writeRaw<BaseApiResponse<getAdComponentViewApi>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onMultiWindowModeChanged(new Function1<BaseApiResponse<getAdComponentViewApi>, deserializeIp<? extends getAdComponentViewApi>>() { // from class: o.ASN1ObjectParser.onNavigationEvent.2
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getAdComponentViewApi> invoke(BaseApiResponse<getAdComponentViewApi> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getAdComponentViewApi.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<attachAdComponentViewApi> apply(writeRaw<BaseApiResponse<attachAdComponentViewApi>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onMultiWindowModeChanged(new Function1<BaseApiResponse<attachAdComponentViewApi>, deserializeIp<? extends attachAdComponentViewApi>>() { // from class: o.ASN1ObjectParser.onWarmupCompleted.1
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends attachAdComponentViewApi> invoke(BaseApiResponse<attachAdComponentViewApi> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = attachAdComponentViewApi.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdComponentViewParentApi onExtraCallback(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationUtil::getSubscription", th);
        return new AdComponentViewParentApi(0, null, 0, false, null, false, false, null, 255, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull android.content.Context r35, @org.jetbrains.annotations.NotNull o.getDummyAd r36, @org.jetbrains.annotations.NotNull o.SessionTrackera r37, int r38, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ASN1ObjectParser.onWarmupCompleted(android.content.Context, o.getDummyAd, o.SessionTrackera, int, o.access13800):java.lang.Object");
    }

    public final void onNavigationEvent(@NotNull final BaseActivity baseActivity, final int i, @Nullable final Integer num, @Nullable final String str, @Nullable final String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        writeRaw<AdComponentFrameLayout> writerawOnWarmupCompleted = onWarmupCompleted(CollectionsKt.listOf(Integer.valueOf(i)));
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return ASN1ObjectParser.onWarmupCompleted(i, (AdComponentFrameLayout) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = writerawOnWarmupCompleted.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda1
            public final Object apply(Object obj) {
                return ASN1ObjectParser.asBinder(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return ASN1ObjectParser.onNavigationEvent(baseActivity, i, str, str2, num, (S2SRewardedVideoAdExtendedListener) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                ASN1ObjectParser.getInterfaceDescriptor(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return ASN1ObjectParser.IAuthTabCallback(baseActivity, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnExtraCallbackWithResult.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                ASN1ObjectParser.access000(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, baseActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (deserializeIp) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp onWarmupCompleted(int i, AdComponentFrameLayout adComponentFrameLayout) throws Throwable {
        final S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        Object next;
        Intrinsics.checkNotNullParameter(adComponentFrameLayout, "");
        List<S2SRewardedVideoAdExtendedListener> listOnWarmupCompleted = adComponentFrameLayout.onWarmupCompleted();
        if (listOnWarmupCompleted != null) {
            Iterator<T> it = listOnWarmupCompleted.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((S2SRewardedVideoAdExtendedListener) next).onWarmupCompleted() == i) {
                    break;
                }
            }
            s2SRewardedVideoAdExtendedListener = (S2SRewardedVideoAdExtendedListener) next;
        } else {
            s2SRewardedVideoAdExtendedListener = null;
        }
        if (s2SRewardedVideoAdExtendedListener != null && s2SRewardedVideoAdExtendedListener.onExtraCallbackWithResult()) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 29426), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21, 24735 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 29426), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24735, -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
                }
                writeRaw<BaseApiResponse<Boolean>> writerawOnExtraCallbackWithResult = ((BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallbackWithResult(new onRewardServerSuccess(i));
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new asBinder(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj2) {
                        return ASN1ObjectParser.onWarmupCompleted((Boolean) obj2);
                    }
                };
                writeRaw writerawOnExtraCallbackWithResult2 = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda10
                    public final Object apply(Object obj2) {
                        return ASN1ObjectParser.IAuthTabCallbackStub(function1, obj2);
                    }
                });
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda11
                    public final Object invoke(Object obj2) {
                        return ASN1ObjectParser.onExtraCallbackWithResult(s2SRewardedVideoAdExtendedListener, (AccountNotificationGetCiResp) obj2);
                    }
                };
                writeRaw writerawOnWarmupCompleted = writerawOnExtraCallbackWithResult2.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.notification.AccountNotificationUtil$$ExternalSyntheticLambda12
                    public final Object apply(Object obj2) {
                        return ASN1ObjectParser.IAuthTabCallbackDefault(function12, obj2);
                    }
                });
                Intrinsics.checkNotNull(writerawOnWarmupCompleted);
                return writerawOnWarmupCompleted;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(s2SRewardedVideoAdExtendedListener);
        Intrinsics.checkNotNull(writerawOnExtraCallback);
        return writerawOnExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp IAuthTabCallbackStub(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (deserializeIp) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp onWarmupCompleted(Boolean bool) throws Throwable {
        Intrinsics.checkNotNullParameter(bool, "");
        if (!bool.booleanValue()) {
            writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(new AccountNotificationGetCiResp((String) null, 1, (DefaultConstructorMarker) null));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
            return writerawOnExtraCallback;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.indexOf((CharSequence) "", '0')), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, 24734 - Gravity.getAbsoluteGravity(0, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Color.blue(0) + 22, 24733 - MotionEvent.axisFromString(""), -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
            }
            writeRaw<BaseApiResponse<AccountNotificationGetCiResp>> writerawOnWarmupCompleted = ((BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new asInterface(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S2SRewardedVideoAdExtendedListener IAuthTabCallbackDefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (S2SRewardedVideoAdExtendedListener) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S2SRewardedVideoAdExtendedListener onExtraCallbackWithResult(S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener, AccountNotificationGetCiResp accountNotificationGetCiResp) {
        Intrinsics.checkNotNullParameter(accountNotificationGetCiResp, "");
        String strOnExtraCallback = accountNotificationGetCiResp.onExtraCallback();
        s2SRewardedVideoAdExtendedListener.onNavigationEvent(strOnExtraCallback != null ? strOnExtraCallback : "");
        return s2SRewardedVideoAdExtendedListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(BaseActivity baseActivity, int i, String str, String str2, Integer num, S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener) throws Throwable {
        if (s2SRewardedVideoAdExtendedListener != null) {
            Intent intentIAuthTabCallback = AccountNotificationJoinActivity.Companion.IAuthTabCallback(baseActivity, i, s2SRewardedVideoAdExtendedListener, str, str2, true);
            if (num == null) {
                baseActivity.startActivity(intentIAuthTabCallback);
            } else {
                baseActivity.startActivityForResult(intentIAuthTabCallback, num.intValue());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access000(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(BaseActivity baseActivity, Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationUtil::startSubscribe", th);
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, baseActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        return Unit.INSTANCE;
    }

    public final writeRaw<attachAdComponentViewApi> IAuthTabCallback(boolean z, int i, @NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        return onExtraCallbackWithResult(z, i, ArraysKt.toList(strArr));
    }

    public final writeRaw<attachAdComponentViewApi> onExtraCallbackWithResult(boolean z, int i, @NotNull List<String> list) throws Throwable {
        Intrinsics.checkNotNullParameter(list, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.indexOf((CharSequence) "", '0')), 22 - (Process.myPid() >> 22), 24734 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29426), (Process.myTid() >> 22) + 22, 24734 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
            }
            BidderTokenProvider bidderTokenProvider = (BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null);
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new VideoStartReason(z ? VideoStartReason.onExtraCallback.SUBSCRIBE : VideoStartReason.onExtraCallback.UNSUBSCRIBE, i, (String) it.next()));
            }
            writeRaw<BaseApiResponse<attachAdComponentViewApi>> writerawOnNavigationEvent = bidderTokenProvider.onNavigationEvent(new VideoAutoplayBehavior(arrayList));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw<attachAdComponentViewApi> writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final writeRaw<Boolean> onExtraCallback(@NotNull List<Integer> list) throws Throwable {
        Intrinsics.checkNotNullParameter(list, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 21 - TextUtils.indexOf((CharSequence) "", '0'), Color.blue(0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 29426), Color.alpha(0) + 22, 24734 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
            }
            writeRaw<BaseApiResponse<Boolean>> writerawOnWarmupCompleted = ((BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted(new AdComponentView(list));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw<Boolean> writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final writeRaw<AdComponentFrameLayout> onWarmupCompleted(@NotNull List<Integer> list) throws Throwable {
        Intrinsics.checkNotNullParameter(list, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 29426), 22 - (KeyEvent.getMaxKeyCode() >> 16), ImageFormat.getBitsPerPixel(0) + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 29427), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, 24733 - TextUtils.lastIndexOf("", '0', 0), -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
            }
            writeRaw<BaseApiResponse<AdComponentFrameLayout>> writerawOnExtraCallback = ((BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback(new AdComponentViewApi(list));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw<AdComponentFrameLayout> writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
