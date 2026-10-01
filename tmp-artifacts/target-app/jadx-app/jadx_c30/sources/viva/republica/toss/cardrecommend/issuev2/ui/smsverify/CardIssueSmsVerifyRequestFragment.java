package viva.republica.toss.cardrecommend.issuev2.ui.smsverify;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.define.MobileCarrier;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.textField.TextFieldLine;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseRoundCornerProgressBar1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraProviderInitRetryPolicy1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.Futures3;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.IDEACBCPar;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.M_;
import o.MapConverter;
import o.MaxRecyclerAdaptera;
import o.PageContext;
import o.PlayerErrorCode;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RC2CBCParameter;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.UTIL_BinToHexString;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WebSocketFactory;
import o.ZslRingBuffer;
import o.access13800;
import o.access14000;
import o.addAllCommandLine;
import o.addExtra;
import o.addFixedPosition;
import o.component5;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.getAwbState;
import o.getDigestAlgorithms;
import o.getHostnameVerifierokhttp;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getRawFullResponse;
import o.getSupportedHighSpeedResolutionsFor;
import o.hasVideoUrl;
import o.initMiniApp;
import o.isZslDisabledByByUserCaseConfig;
import o.preFillDefault;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI;
import o.resolveQuirkNames;
import o.resumeForClick;
import o.setAdVideoPlaybackListener;
import o.setHasShown;
import o.setNativeOption;
import o.setPositionProvider;
import o.toPreviewOnlyRange;
import o.transparentBackground;
import o.varyMatches;
import o.writeRaw;
import o.y2;
import o.y4;
import o.y6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueSmsVerifyRequestFragment extends CardIssueBaseFragment<RC2CBCParameter> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static int onExtraCallbackWithResult = 0;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static int onTransact = 1;
    private static long onWarmupCompleted;
    private final PageContext onExtraCallback;

    static {
        IAuthTabCallback();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueSmsVerifyRequestFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueSmsVerifyRequestBinding;", 0)};
        IAuthTabCallback = 8;
        int i = onTransact + 47;
        asInterface = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment = (CardIssueSmsVerifyRequestFragment) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(cardIssueSmsVerifyRequestFragment, dialogInterface);
        }
        onNavigationEvent(cardIssueSmsVerifyRequestFragment, dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(1748611689, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment, commonModule_setLeftEdgeTouchEnabled}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1748611689, iIAuthTabCallback);
        int i4 = onExtraCallbackWithResult + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i5));
        int i11 = (~(i6 | i5)) | (~((~i5) | i7 | i9));
        int i12 = i7 | i5 | i9;
        int i13 = i5 + i + i2 + (1362283521 * i3) + ((-853422242) * i4);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i5) - 1228931072) + ((-782767794) * i) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i2 * 465567744) + (465567744 * i3) + (1887436800 * i4) + ((-1154482176) * i14);
        int i16 = ((i5 * 722868660) - 41817558) + (i * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i2 * 722869185) + (i3 * 1172694977) + (i4 * (-747618338)) + (i14 * 791674880);
        switch (i15 + (i16 * i16 * 751828992)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueSmsVerifyRequestFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 5;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return (Unit) onExtraCallback(-1590962430, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment, setDetectableSize}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1590962434, iIAuthTabCallback);
        }
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(cardIssueSmsVerifyRequestFragment, deserializeurinullablecollection);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueSmsVerifyRequestFragment, deserializeurinullablecollection);
        int i3 = onExtraCallbackWithResult + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            onExtraCallback(1995060703, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{function1, obj}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1995060697, iIAuthTabCallback);
        } else {
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            onExtraCallback(1995060703, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{function1, obj}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1995060697, iIAuthTabCallback2);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(cardIssueSmsVerifyRequestFragment);
        int i4 = onExtraCallbackWithResult + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(337877747, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment, th}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -337877742, iIAuthTabCallback);
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueSmsVerifyRequestFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueSmsVerifyRequestFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = onExtraCallbackWithResult + 93;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, setNativeOption setnativeoption) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueSmsVerifyRequestFragment, setnativeoption);
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, futures3);
        int i4 = IAuthTabCallbackDefault + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(cardIssueSmsVerifyRequestFragment, view);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th, CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th, cardIssueSmsVerifyRequestFragment, dialogInterface);
        int i4 = IAuthTabCallbackDefault + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return true;
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<setNativeOption> apply(writeRaw<BaseApiResponse<setNativeOption>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(new Function1<BaseApiResponse<setNativeOption>, deserializeIp<? extends setNativeOption>>() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment.onWarmupCompleted.1
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends setNativeOption> invoke(BaseApiResponse<setNativeOption> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = setNativeOption.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }) { // from class: o.UtilsKtExternalSyntheticLambda17.registerForActivityResult
                private final /* synthetic */ Function1 onExtraCallbackWithResult;

                public registerForActivityResult(Function1 function1) {
                    Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
                    this.onExtraCallbackWithResult = function1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onExtraCallbackWithResult.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
            MapConverter mapConverter = this.onNavigationEvent;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
            return writerawIAuthTabCallback;
        }
    }

    public CardIssueSmsVerifyRequestFragment() {
        super(R.layout.fragment_card_issue_sms_verify_request);
        this.onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onNavigationEvent);
    }

    public static final /* synthetic */ UTIL_BinToHexString onExtraCallbackWithResult(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return (UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback);
        }
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        throw null;
    }

    public static final /* synthetic */ int onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return iOnExtraCallback;
        }
        throw null;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, UTIL_BinToHexString> {
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();

        onExtraCallback() {
            super(1, UTIL_BinToHexString.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueSmsVerifyRequestBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final UTIL_BinToHexString invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return UTIL_BinToHexString.onExtraCallback(view);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment = (CardIssueSmsVerifyRequestFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        UTIL_BinToHexString uTIL_BinToHexString = (UTIL_BinToHexString) cardIssueSmsVerifyRequestFragment.onExtraCallback.onExtraCallbackWithResult(cardIssueSmsVerifyRequestFragment, onNavigationEvent[0]);
        int i4 = IAuthTabCallbackDefault + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return uTIL_BinToHexString;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment = (CardIssueSmsVerifyRequestFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {cardIssueSmsVerifyRequestFragment};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(((UTIL_BinToHexString) onExtraCallback(-1515714739, iIAuthTabCallback2, objArr2, iIAuthTabCallback3, iIAuthTabCallback4, 1515714740, iIAuthTabCallback)).onExtraCallback, BuildConfig.FLAVOR);
            throw null;
        }
        TdsButtonV1View tdsButtonV1View = ((UTIL_BinToHexString) onExtraCallback(-1515714739, iIAuthTabCallback2, objArr2, iIAuthTabCallback3, iIAuthTabCallback4, 1515714740, iIAuthTabCallback)).onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, BuildConfig.FLAVOR);
        int i4 = IAuthTabCallbackDefault + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsButtonV1View;
        }
        obj.hashCode();
        throw null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        if (!(!extraCallback().requestPostMessageChannelWithExtras())) {
            getDigestAlgorithms.onExtraCallback(writeTypedObject(), RippleNode.onNavigationEvent(this), extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, (String) null, (Map) null, 40, (Object) null);
        }
        View viewOnCreateView = super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return viewOnCreateView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i3 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 83, (ViewConfiguration.getPressedStateDuration() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - ExpandableListView.getPackedPositionGroup(0L)), Color.argb(0, 0, 0, 0) + 19, 8808 - (ViewConfiguration.getLongPressTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $11 + 119;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 125;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        ((TdsButtonV1View) onExtraCallback(-1553653415, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1553653418, iIAuthTabCallback)).setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                CardIssueSmsVerifyRequestFragment.onNavigationEvent(this.f$0, view2);
            }
        });
        int i2 = IAuthTabCallbackDefault + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment = (CardIssueSmsVerifyRequestFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback("card_id", cardIssueSmsVerifyRequestFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueSmsVerifyRequestFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", cardIssueSmsVerifyRequestFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", cardIssueSmsVerifyRequestFragment.readTypedObject().onExtraCallback());
        Object[] objArr2 = new Object[1];
        a(new char[]{23263, 23211, 47866, 8697, 2017, 12609, 25908, 46950, 14098}, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        setDetectableSize.onExtraCallback(strIntern, ((TdsButtonV1View) onExtraCallback(-1553653415, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1553653418, iIAuthTabCallback)).getText());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(final CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385612L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueSmsVerifyRequestFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        resumeForClick resumeforclick = resumeForClick.asBinder;
        BaseActivity baseActivityRequireBaseActivity = cardIssueSmsVerifyRequestFragment.requireBaseActivity();
        Object[] objArr = new Object[1];
        a(new char[]{29261, 29246, 9840, 48495, 16638, 30298, 33574, 20861, 8087, 12054, 58605, 28392, 43374, 20720, 21237, 64732, 15045, 49760, 16221, 18989, 50308, 29718, 44527}, KeyEvent.getDeadChar(0, 0), objArr);
        SessionTrackerb.IAuthTabCallback(resumeforclick, baseActivityRequireBaseActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onStart();
        onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, DialogInterface dialogInterface) throws Throwable {
        resumeForClick resumeforclick;
        BaseActivity baseActivityRequireBaseActivity;
        String strIntern;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 123;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, BuildConfig.FLAVOR);
            resumeforclick = resumeForClick.asBinder;
            baseActivityRequireBaseActivity = cardIssueSmsVerifyRequestFragment.requireBaseActivity();
            Object[] objArr = new Object[1];
            a(new char[]{29261, 29246, 9840, 48495, 16638, 30298, 33574, 20861, 8087, 12054, 58605, 28392, 43374, 20720, 21237, 64732, 15045, 49760, 16221, 18989, 50308, 29718, 44527}, 1 >> TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, 'C', 0, 0), objArr);
            strIntern = ((String) objArr[0]).intern();
            z = true;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 87;
        } else {
            Intrinsics.checkNotNullParameter(dialogInterface, BuildConfig.FLAVOR);
            resumeforclick = resumeForClick.asBinder;
            baseActivityRequireBaseActivity = cardIssueSmsVerifyRequestFragment.requireBaseActivity();
            Object[] objArr2 = new Object[1];
            a(new char[]{29261, 29246, 9840, 48495, 16638, 30298, 33574, 20861, 8087, 12054, 58605, 28392, 43374, 20720, 21237, 64732, 15045, 49760, 16221, 18989, 50308, 29718, 44527}, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            z = false;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 60;
        }
        SessionTrackerb.IAuthTabCallback(resumeforclick, baseActivityRequireBaseActivity, strIntern, z, function1, bundle, z2, i, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment = (CardIssueSmsVerifyRequestFragment) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, BuildConfig.FLAVOR);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(cardIssueSmsVerifyRequestFragment.getString(R.string.app_cardrecommend_issuev2_ui_smsverify___9ee30e968e));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueSmsVerifyRequestFragment.getString(R.string.app_cardrecommend_issuev2_ui_smsverify___57629f1da6));
        String string = cardIssueSmsVerifyRequestFragment.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return (Unit) CardIssueSmsVerifyRequestFragment.onExtraCallback(1104048864, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this.f$0, (DialogInterface) obj}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1104048862, WebSocketFactory.onExtraCallback.IAuthTabCallback());
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        String str = (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        EditText editText = ((UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback)).IAuthTabCallback.getEditText();
        if (editText != null) {
            editText.setText(str);
        }
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        EditText editText2 = ((UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback2)).onExtraCallbackWithResult.getEditText();
        if (editText2 != null) {
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {PlayerErrorCode.onWarmupCompleted};
            int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            editText2.setText(((MobileCarrier) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1620982563, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent3, 1620982568, objArr, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).fullName());
        }
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        TextFieldLine textFieldLine = ((UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback3)).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(textFieldLine, BuildConfig.FLAVOR);
        transparentBackground.onExtraCallback(textFieldLine);
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        EditText editText3 = ((UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback4)).onExtraCallbackWithResult.getEditText();
        if (editText3 != null) {
            editText3.setSaveEnabled(false);
        }
        int iIAuthTabCallback5 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        TextFieldLine textFieldLine2 = ((UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback5)).IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(textFieldLine2, BuildConfig.FLAVOR);
        transparentBackground.onExtraCallback(textFieldLine2);
        int iIAuthTabCallback6 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        EditText editText4 = ((UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback6)).IAuthTabCallback.getEditText();
        if (editText4 != null) {
            int i4 = IAuthTabCallbackDefault + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            editText4.setSaveEnabled(false);
        }
        if (!StringsKt.isBlank(str)) {
            onTransact();
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return CardIssueSmsVerifyRequestFragment.IAuthTabCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
    }

    private final void onTransact() {
        int i = 2 % 2;
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        ((UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback)).onNavigationEvent.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        ((UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback2)).onNavigationEvent.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(2007968543, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda12
            public final Object invoke(Object obj, Object obj2) {
                return CardIssueSmsVerifyRequestFragment.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })));
        int i2 = IAuthTabCallbackDefault + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, BuildConfig.FLAVOR);
        if (!(!r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed())) {
            int i4 = onExtraCallbackWithResult + 45;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            cardIssueSmsVerifyRequestFragment.onNavigationEvent();
        } else {
            cardIssueSmsVerifyRequestFragment.onActivityLayout();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, BuildConfig.FLAVOR);
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, (int) futures3.asBinder());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(futures3, BuildConfig.FLAVOR);
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, (int) futures3.asBinder());
        int i3 = 58 / 0;
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Integer> $termsViewHeight$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$termsViewHeight$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueSmsVerifyRequestFragment.this.new onNavigationEvent(this.$termsViewHeight$delegate, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (CardIssueSmsVerifyRequestFragment.onWarmupCompleted(this.$termsViewHeight$delegate) > 0) {
                ViewGroup.LayoutParams layoutParams = CardIssueSmsVerifyRequestFragment.onExtraCallbackWithResult(CardIssueSmsVerifyRequestFragment.this).onWarmupCompleted.getLayoutParams();
                int iIAuthTabCallbackDefault = M_.onExtraCallback.IAuthTabCallbackDefault();
                int iOnWarmupCompleted = CardIssueSmsVerifyRequestFragment.onWarmupCompleted(this.$termsViewHeight$delegate);
                Integer numOnNavigationEvent = access14000.onNavigationEvent(40);
                DisplayMetrics displayMetrics = CardIssueSmsVerifyRequestFragment.this.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
                layoutParams.height = (iIAuthTabCallbackDefault - iOnWarmupCompleted) - varyMatches.onNavigationEvent(numOnNavigationEvent, displayMetrics);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(final CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 5;
            IAuthTabCallbackDefault = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = IAuthTabCallbackDefault + 89;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(336510824, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment.showTerms.<anonymous>.<anonymous> (CardIssueSmsVerifyRequestFragment.kt:112)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
            M_ m_ = M_.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(m_.onTransact() * 0.6f), 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onWarmupCompleted(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = onExtraCallbackWithResult + 77;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(0, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(m_.onTransact() * 0.5f), 1, (Object) null);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda10
                    public final Object invoke(Object obj) {
                        return CardIssueSmsVerifyRequestFragment.onNavigationEvent(getsupportedhighspeedresolutionsfor, (Futures3) obj);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized2);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(cardIssueSmsVerifyRequestFragment);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj = objOnMinimized3;
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda11
                        public final Object invoke(Object obj2) {
                            return CardIssueSmsVerifyRequestFragment.onExtraCallbackWithResult(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj2);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                    obj = function1;
                }
                hasVideoUrl.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent, "STD_52_IDENTIFICATION2", (String) null, (String) null, (Long) null, (Map) null, (setHasShown) null, (StandardTermsV2CustomVariable[]) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, (Function1) obj, Float.valueOf(0.1f), (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, (StandardTermsV2YouthRegisterParam) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getRawFullResponse) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 384, 1042428);
                int iOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(cardIssueSmsVerifyRequestFragment);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!zOnExtraCallback2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = cardIssueSmsVerifyRequestFragment.new onNavigationEvent(getsupportedhighspeedresolutionsfor, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    int i10 = onExtraCallbackWithResult + 97;
                    IAuthTabCallbackDefault = i10 % 128;
                    int i11 = i10 % 2;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(iOnExtraCallback), (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = onExtraCallbackWithResult + 79;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        if (i3 % 2 != 0 ? (i & 3) == 2 : (i & 4) == 5) {
            int i5 = i4 + 89;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            int i7 = i4 + 85;
            int i8 = i7 % 128;
            onExtraCallbackWithResult = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 103;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2007968543, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment.showTerms.<anonymous> (CardIssueSmsVerifyRequestFragment.kt:111)");
            }
            y4.onNavigationEvent((addFixedPosition) null, (MaxRecyclerAdaptera) null, (y2) null, (y6) null, ForwardingCameraControl.onExtraCallback(336510824, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda13
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueSmsVerifyRequestFragment.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 15);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = IAuthTabCallbackDefault + 3;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getHostnameVerifierokhttp.onNavigationEvent(cardIssueSmsVerifyRequestFragment, (String) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSmsVerifyRequestFragment.dismissLoadingIndicator();
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
    }

    private static final Unit onExtraCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, setNativeOption setnativeoption) {
        int i = 2 % 2;
        setPositionProvider setpositionproviderOnExtraCallbackWithResult = setPositionProvider.IAuthTabCallback.onNavigationEvent(new setPositionProvider.IAuthTabCallback(), R.id.cardIssueSmsVerifyRequestFragment, true, false, 4, (Object) null).onExtraCallbackWithResult();
        cardIssueSmsVerifyRequestFragment.requireArguments().putInt("unifiedId", setnativeoption.IAuthTabCallback());
        IDEACBCPar.onExtraCallback(RippleNode.onNavigationEvent(cardIssueSmsVerifyRequestFragment), R.id.smsVerifyAction, cardIssueSmsVerifyRequestFragment.requireArguments(), setpositionproviderOnExtraCallbackWithResult, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Throwable th, CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        if (th instanceof TossApiCallException.ApiError) {
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(((TossApiCallException.ApiError) th).asBinder(), "TELCO_SMS_OWNER_CHECK_FAILED");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(((TossApiCallException.ApiError) th).asBinder(), "TELCO_SMS_OWNER_CHECK_FAILED")) {
                resumeForClick resumeforclick = resumeForClick.asBinder;
                BaseActivity baseActivityRequireBaseActivity = cardIssueSmsVerifyRequestFragment.requireBaseActivity();
                Object[] objArr = new Object[1];
                a(new char[]{29261, 29246, 9840, 48495, 16638, 30298, 33574, 20861, 8087, 12054, 58605, 28392, 43374, 20720, 21237, 64732, 15045, 49760, 16221, 18989, 50308, 29718, 44527}, 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                SessionTrackerb.IAuthTabCallback(resumeforclick, baseActivityRequireBaseActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                int i3 = onExtraCallbackWithResult + 57;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        o.enableViewRecyclingForImage.onWarmupCompleted(o.enableViewRecyclingForImage.onWarmupCompleted, requireBaseActivity(), (kotlin.text.Regex) null, 2, (java.lang.Object) null);
        r0 = o.AdSettingsIntegrationErrorMode.onNavigationEvent.asInterface().onNavigationEvent(new o.setSecondaryTextColor(r3, o.PlayerErrorCode.onPostMessage(), o.PlayerErrorCode.readTypedObject(), r2, r1.onRelationshipValidationResult().serverValue()));
        r1 = o.clearTid.onExtraCallback();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, net.sf.scuba.smartcards.BuildConfig.FLAVOR);
        r0 = r0.IAuthTabCallback(new viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment.onWarmupCompleted(r1, o.NetConverter3.onExtraCallback()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, net.sf.scuba.smartcards.BuildConfig.FLAVOR);
        r3 = new viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda1(r9);
        r0 = r0.onExtraCallback(new viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda2(r3)).onWarmupCompleted(new viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda3(r9));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, net.sf.scuba.smartcards.BuildConfig.FLAVOR);
        autoDisposable(o.setMessageBytes.onExtraCallbackWithResult(r0, new viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda4(r9), new viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda5(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r2 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent() {
        BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1OnUnminimized;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        String strICustomTabsCallback = addExtra.ICustomTabsCallback(playerErrorCode);
        if (strICustomTabsCallback != null) {
            int i4 = onExtraCallbackWithResult + 33;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                baseRoundCornerProgressBar1OnUnminimized = extraCallback().onUnminimized();
                int i5 = 42 / 0;
            } else {
                baseRoundCornerProgressBar1OnUnminimized = extraCallback().onUnminimized();
            }
        }
        int i6 = IAuthTabCallbackDefault + 49;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        final CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment = (CardIssueSmsVerifyRequestFragment) objArr[0];
        final Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        getParamImp.onWarmupCompleted(th, cardIssueSmsVerifyRequestFragment.requireBaseActivity(), true, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.smsverify.CardIssueSmsVerifyRequestFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return CardIssueSmsVerifyRequestFragment.onWarmupCompleted(th, cardIssueSmsVerifyRequestFragment, (DialogInterface) obj);
            }
        }, 12, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final int onExtraCallback(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).intValue();
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = onExtraCallbackWithResult + 71;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf(i));
        int i5 = onExtraCallbackWithResult + 37;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, DialogInterface dialogInterface) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onExtraCallback(1104048864, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment, dialogInterface}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1104048862, iIAuthTabCallback);
    }

    private final UTIL_BinToHexString onExtraCallbackWithResult() {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (UTIL_BinToHexString) onExtraCallback(-1515714739, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1515714740, iIAuthTabCallback);
    }

    private final TdsButtonV1View onExtraCallback() {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (TdsButtonV1View) onExtraCallback(-1553653415, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1553653418, iIAuthTabCallback);
    }

    private static final Unit onWarmupCompleted(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onExtraCallback(1748611689, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment, commonModule_setLeftEdgeTouchEnabled}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1748611689, iIAuthTabCallback);
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        onExtraCallback(1995060703, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{function1, obj}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1995060697, iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, Throwable th) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onExtraCallback(337877747, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment, th}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -337877742, iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallback(CardIssueSmsVerifyRequestFragment cardIssueSmsVerifyRequestFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onExtraCallback(-1590962430, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{cardIssueSmsVerifyRequestFragment, setDetectableSize}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1590962434, iIAuthTabCallback);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = -4637524795909283738L;
    }
}
