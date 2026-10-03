package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AdSettingsIntegrationErrorMode;
import o.AvoidCaptureProcessProgressAvailabilityCheckQuirk;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ExtraHints;
import o.GeckoHubImp;
import o.PageContext;
import o.RequestOptionConfigBuilderExternalSyntheticLambda0;
import o.RippleNode;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UTIL_Base64Decode;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15300;
import o.access15400;
import o.addAllCommandLine;
import o.createRewardedVideoAd;
import o.equalsMethodParams;
import o.findResAndMsg;
import o.formatMsgs;
import o.getDigestAlgorithms;
import o.getHostnameVerifierokhttp;
import o.getMacData;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.putChannelInfo;
import o.response;
import o.setAutoCaptured;
import o.setRandomHost;
import o.zzaj;
import o.zzbb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueSingleDigitArsRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueSingleDigitArsResp;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueSingleDigitArsVerifyFragment extends CardIssueBaseFragment<getMacData> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int getInterfaceDescriptor;
    public static final int onExtraCallback;
    private static int onTransact;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private boolean IAuthTabCallback;
    private String IAuthTabCallbackDefault;
    private final PageContext asBinder;
    private boolean asInterface;
    private onExtraCallbackWithResult onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.REPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    static {
        onNavigationEvent();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueSingleDigitArsVerifyFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueSingleDigitArsVerifyBinding;", 0)};
        onExtraCallback = 8;
        int i = getInterfaceDescriptor + 89;
        access000 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(cardIssueSingleDigitArsVerifyFragment, dialogInterface);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueSingleDigitArsVerifyFragment, dialogInterface);
        int i3 = onTransact + 113;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = i9 | i10 | (~(i8 | i5));
        int i12 = i10 | i4;
        int i13 = ~i5;
        int i14 = (~(i4 | i13 | i)) | (~(i7 | i13 | i8)) | (~(i8 | i | i5));
        int i15 = i + i5 + i3 + ((-1329026341) * i2) + ((-1277752516) * i6);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i) - 1912602624) + ((-659060787) * i5) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i3) + (494927872 * i2) + (1577058304 * i6) + ((-1783103488) * i16);
        int i18 = (i * 595972471) + 129777640 + (i5 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i3 * 595972219) + (i2 * (-1341978823)) + (i6 * 731850196) + (i16 * 1869086720);
        int i19 = i17 + (i18 * i18 * (-846725120));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? i19 != 5 ? onNavigationEvent(objArr) : asInterface(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment = (CardIssueSingleDigitArsVerifyFragment) objArr[0];
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(cardIssueSingleDigitArsVerifyFragment, tdsBottomCtaV1View, setDetectableSize);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueSingleDigitArsVerifyFragment, tdsBottomCtaV1View, setDetectableSize);
        int i3 = IAuthTabCallback_Parcel + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, cardIssueSingleDigitArsVerifyFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallback_Parcel + 105;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(cardIssueSingleDigitArsVerifyFragment, dialogInterface);
        }
        onExtraCallback(cardIssueSingleDigitArsVerifyFragment, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
        CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment = (CardIssueSingleDigitArsVerifyFragment) objArr[1];
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(2042634813, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -2042634813, new Object[]{iAuthTabCallback, cardIssueSingleDigitArsVerifyFragment, tdsBottomCtaV1View, view}, setAutoCaptured.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback_Parcel + 53;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CardIssueSingleDigitArsVerifyFragment() {
        super(R.layout.fragment_card_issue_single_digit_ars_verify);
        this.asBinder = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.onExtraCallback);
        this.IAuthTabCallbackDefault = "";
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment = (CardIssueSingleDigitArsVerifyFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 123;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        boolean z = cardIssueSingleDigitArsVerifyFragment.asInterface;
        int i5 = i3 + 101;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment = (CardIssueSingleDigitArsVerifyFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSingleDigitArsVerifyFragment.onWarmupCompleted(str);
        int i4 = onTransact + 37;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void onExtraCallback(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        cardIssueSingleDigitArsVerifyFragment.IAuthTabCallbackDefault = str;
        int i5 = i2 + 23;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSingleDigitArsVerifyFragment.onWarmupCompleted(iAuthTabCallback);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        cardIssueSingleDigitArsVerifyFragment.asInterface = z;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 21;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSingleDigitArsVerifyFragment.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSingleDigitArsVerifyFragment.onExtraCallbackWithResult(str, str2);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        cardIssueSingleDigitArsVerifyFragment.IAuthTabCallback = z;
        int i5 = i3 + 117;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        cardIssueSingleDigitArsVerifyFragment.onNavigationEvent = z;
        int i5 = i3 + 89;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ UTIL_Base64Decode onWarmupCompleted(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        UTIL_Base64Decode uTIL_Base64DecodeOnExtraCallback = cardIssueSingleDigitArsVerifyFragment.onExtraCallback();
        int i4 = onTransact + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return uTIL_Base64DecodeOnExtraCallback;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, UTIL_Base64Decode> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        onNavigationEvent() {
            super(1, UTIL_Base64Decode.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueSingleDigitArsVerifyBinding;", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final UTIL_Base64Decode invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return UTIL_Base64Decode.onExtraCallbackWithResult(view);
        }
    }

    private final UTIL_Base64Decode onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        return (UTIL_Base64Decode) this.asBinder.onExtraCallbackWithResult(this, i2 % 2 == 0 ? onWarmupCompleted[1] : onWarmupCompleted[0]);
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        if (new RxPermissions(this).onExtraCallbackWithResult("android.permission.READ_PHONE_STATE")) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            this.onExtraCallbackWithResult = onextracallbackwithresult;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            zzbb.onExtraCallbackWithResult(onextracallbackwithresult, contextRequireContext, new IntentFilter("android.intent.action.PHONE_STATE"), 2);
        }
        int i2 = IAuthTabCallback_Parcel + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onWarmupCompleted();
        onWarmupCompleted(IAuthTabCallback.REQUEST);
        int i4 = IAuthTabCallback_Parcel + 115;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onPause();
        if (!this.IAuthTabCallback || new RxPermissions(this).onExtraCallbackWithResult("android.permission.READ_PHONE_STATE")) {
            return;
        }
        int i2 = IAuthTabCallback_Parcel + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = true;
        dismissProgressDialog();
        int i4 = IAuthTabCallback_Parcel + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onDestroy() {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            onextracallbackwithresult = this.onExtraCallbackWithResult;
            int i3 = 4 / 0;
            if (onextracallbackwithresult == null) {
                return;
            }
        } else {
            super.onDestroy();
            onextracallbackwithresult = this.onExtraCallbackWithResult;
            if (onextracallbackwithresult == null) {
                return;
            }
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        zzbb.onWarmupCompleted(onextracallbackwithresult, contextRequireContext);
        int i4 = onTransact + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SubTypography5 subTypography5 = onExtraCallback().onWarmupCompleted;
        subTypography5.setTextSize(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(54)));
        subTypography5.onNavigationEvent(response.Medium);
        subTypography5.setText(String.valueOf(readTypedObject().onExtraCallbackWithResult()));
        onExtraCallback().IAuthTabCallback.setText(readTypedObject().asInterface());
        int i4 = IAuthTabCallback_Parcel + 15;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    private final void onWarmupCompleted(final IAuthTabCallback iAuthTabCallback) {
        Context context;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 59;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        final TdsBottomCtaV1View tdsBottomCtaV1View = onExtraCallback().onExtraCallback;
        String string = tdsBottomCtaV1View.getContext().getString(R.string.card_issue_single_digit_ars_description);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsBottomCtaV1View.setTopDescription(string);
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        if (iAuthTabCallback == IAuthTabCallback.REQUEST) {
            context = tdsBottomCtaV1View.getContext();
            i = R.string.card_issue_single_digit_ars_request_cta;
        } else {
            Context context2 = tdsBottomCtaV1View.getContext();
            int i5 = R.string.card_issue_single_digit_ars_report_cta;
            int i6 = IAuthTabCallback_Parcel + 39;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            context = context2;
            i = i5;
        }
        String string2 = context.getString(i);
        Intrinsics.checkNotNull(string2);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSingleDigitArsVerifyFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                Object[] objArr = {iAuthTabCallback, this, tdsBottomCtaV1View, (View) obj};
                int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
                return (Unit) CardIssueSingleDigitArsVerifyFragment.onExtraCallback(-1537219226, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1537219230, objArr, setAutoCaptured.onExtraCallbackWithResult());
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
    }

    private static final Unit onNavigationEvent(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, TdsBottomCtaV1View tdsBottomCtaV1View, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueSingleDigitArsVerifyFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", cardIssueSingleDigitArsVerifyFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueSingleDigitArsVerifyFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", cardIssueSingleDigitArsVerifyFragment.readTypedObject().onExtraCallback());
        Object[] objArr = new Object[1];
        a(new int[]{-1131128812, 1285437349, -1889460934, -1417321394}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), tdsBottomCtaV1View.asInterface().getText());
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
        final CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment = (CardIssueSingleDigitArsVerifyFragment) objArr[1];
        final TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (iAuthTabCallback == IAuthTabCallback.REQUEST) {
            ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSingleDigitArsVerifyFragment$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    Object[] objArr2 = {this.f$0, tdsBottomCtaV1View, (SetDetectableSize) obj};
                    int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
                    return (Unit) CardIssueSingleDigitArsVerifyFragment.onExtraCallback(1812972384, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1812972382, objArr2, setAutoCaptured.onExtraCallbackWithResult());
                }
            }, 14, (Object) null);
        }
        getHostnameVerifierokhttp.onNavigationEvent(cardIssueSingleDigitArsVerifyFragment.onExtraCallback().onExtraCallback.asInterface(), (String) null, 1, (Object) null);
        int i4 = onWarmupCompleted.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i4 == 1) {
            cardIssueSingleDigitArsVerifyFragment.IAuthTabCallbackStub();
            int i5 = onTransact + 57;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr2 = {cardIssueSingleDigitArsVerifyFragment, cardIssueSingleDigitArsVerifyFragment.IAuthTabCallbackDefault};
            int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
            onExtraCallback(1344475217, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1344475216, objArr2, setAutoCaptured.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ createRewardedVideoAd $account;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        final /* synthetic */ CardIssueSingleDigitArsVerifyFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(createRewardedVideoAd createrewardedvideoad, CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$account = createrewardedvideoad;
            this.this$0 = cardIssueSingleDigitArsVerifyFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(this.$account, this.this$0, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CardIssueSingleDigitArsResp>, Object> {
            final /* synthetic */ createRewardedVideoAd $account$inlined;
            int I$0;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, createRewardedVideoAd createrewardedvideoad) {
                super(2, access13800Var);
                this.$account$inlined = createrewardedvideoad;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onNavigationEvent(access13800Var, this.$account$inlined);
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super CardIssueSingleDigitArsResp> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ExtraHints extraHintsOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.onExtraCallback();
                    CardIssueSingleDigitArsRequest cardIssueSingleDigitArsRequest = new CardIssueSingleDigitArsRequest(this.$account$inlined.onExtraCallback(), this.$account$inlined.onNavigationEvent());
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = extraHintsOnExtraCallback.onExtraCallback(cardIssueSingleDigitArsRequest, (access13800<? super BaseApiResponse<CardIssueSingleDigitArsResp>>) this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
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
                            return (CardIssueSingleDigitArsResp) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.cardsales.funnel.CardIssueSingleDigitArsResp");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(CardIssueSingleDigitArsResp.class, Object.class) || Intrinsics.areEqual(CardIssueSingleDigitArsResp.class, Unit.class)) {
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

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    createRewardedVideoAd createrewardedvideoad = this.$account;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onNavigationEvent onnavigationevent = new onNavigationEvent(null, createrewardedvideoad);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment = this.this$0;
            if (Result.onNavigationEvent(obj2)) {
                CardIssueSingleDigitArsVerifyFragment.onExtraCallback(cardIssueSingleDigitArsVerifyFragment, ((CardIssueSingleDigitArsResp) obj2).onNavigationEvent());
                CardIssueSingleDigitArsVerifyFragment.onWarmupCompleted(cardIssueSingleDigitArsVerifyFragment).onExtraCallback.asInterface().dismissLoadingIndicator();
                CardIssueSingleDigitArsVerifyFragment.onExtraCallback(cardIssueSingleDigitArsVerifyFragment, IAuthTabCallback.REPORT);
                CardIssueSingleDigitArsVerifyFragment.onExtraCallbackWithResult(cardIssueSingleDigitArsVerifyFragment, true);
                if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
                    CardIssueSingleDigitArsVerifyFragment.onNavigationEvent(cardIssueSingleDigitArsVerifyFragment, true);
                }
            }
            CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment2 = this.this$0;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                CardIssueSingleDigitArsVerifyFragment.onWarmupCompleted(cardIssueSingleDigitArsVerifyFragment2).onExtraCallback.asInterface().dismissLoadingIndicator();
            }
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(readTypedObject().onWarmupCompleted(), this, null), 3, (Object) null);
        int i2 = onTransact + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueSingleDigitArsVerifyFragment.this.new IAuthTabCallbackDefault(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(10000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            CardIssueSingleDigitArsVerifyFragment.this.dismissProgressDialog();
            CardIssueSingleDigitArsVerifyFragment.onExtraCallbackWithResult(CardIssueSingleDigitArsVerifyFragment.this);
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $requestId;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        final /* synthetic */ CardIssueSingleDigitArsVerifyFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(String str, CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$requestId = str;
            this.this$0 = cardIssueSingleDigitArsVerifyFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStub(this.$requestId, this.this$0, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            final /* synthetic */ String $requestId$inlined;
            int I$0;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(access13800 access13800Var, String str) {
                super(2, access13800Var);
                this.$requestId$inlined = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallbackWithResult(access13800Var, this.$requestId$inlined);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ExtraHints extraHintsOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.onExtraCallback();
                    String str = this.$requestId$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = extraHintsOnExtraCallback.onWarmupCompleted(str, (access13800<? super BaseApiResponse<Boolean>>) this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
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

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    String str = this.$requestId;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, str);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment = this.this$0;
            String str2 = this.$requestId;
            if (Result.onNavigationEvent(obj2)) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                CardIssueSingleDigitArsVerifyFragment.onWarmupCompleted(cardIssueSingleDigitArsVerifyFragment).onExtraCallback.asInterface().dismissLoadingIndicator();
                if (zBooleanValue) {
                    int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
                    CardIssueSingleDigitArsVerifyFragment.onExtraCallback(289301841, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -289301836, new Object[]{cardIssueSingleDigitArsVerifyFragment, str2}, setAutoCaptured.onExtraCallbackWithResult());
                } else {
                    String string = cardIssueSingleDigitArsVerifyFragment.getString(R.string.card_issue_single_digit_ars_fail_message);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    CardIssueSingleDigitArsVerifyFragment.IAuthTabCallback(cardIssueSingleDigitArsVerifyFragment, null, string, 1, null);
                }
            }
            CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment2 = this.this$0;
            TossApiCallException.ApiError apiError = Result.exceptionOrNull-impl(obj2);
            if (apiError != null) {
                CardIssueSingleDigitArsVerifyFragment.onWarmupCompleted(cardIssueSingleDigitArsVerifyFragment2).onExtraCallback.asInterface().dismissLoadingIndicator();
                if (apiError instanceof TossApiCallException.ApiError) {
                    TossApiCallException.ApiError apiError2 = apiError;
                    String strOnTransact = apiError2.onTransact();
                    if (strOnTransact == null) {
                        strOnTransact = cardIssueSingleDigitArsVerifyFragment2.getString(R.string.card_issue_single_digit_ars_fail_title);
                        Intrinsics.checkNotNullExpressionValue(strOnTransact, "");
                    }
                    String localizedMessage = apiError2.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = cardIssueSingleDigitArsVerifyFragment2.getString(R.string.card_issue_single_digit_ars_fail_message);
                        Intrinsics.checkNotNullExpressionValue(localizedMessage, "");
                    }
                    CardIssueSingleDigitArsVerifyFragment.onExtraCallbackWithResult(cardIssueSingleDigitArsVerifyFragment2, strOnTransact, localizedMessage);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment = (CardIssueSingleDigitArsVerifyFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (cardIssueSingleDigitArsVerifyFragment.onNavigationEvent) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(cardIssueSingleDigitArsVerifyFragment), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(str, cardIssueSingleDigitArsVerifyFragment, null), 3, (Object) null);
            int i4 = IAuthTabCallback_Parcel + 41;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return null;
        }
        cardIssueSingleDigitArsVerifyFragment.onExtraCallback().onExtraCallback.asInterface().dismissLoadingIndicator();
        String string = cardIssueSingleDigitArsVerifyFragment.getString(R.string.ars_verification_progress);
        Intrinsics.checkNotNullExpressionValue(string, "");
        cardIssueSingleDigitArsVerifyFragment.showProgressDialog(string, false);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(cardIssueSingleDigitArsVerifyFragment), (CoroutineContext) null, (setRandomHost) null, cardIssueSingleDigitArsVerifyFragment.new IAuthTabCallbackDefault(null), 3, (Object) null);
        int i6 = IAuthTabCallback_Parcel + 89;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackStub;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 72 - Color.red(0), 8848 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackStub;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i7]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', i5, i5) + 1), 72 - View.MeasureSpec.getMode(i5), 8848 - (ViewConfiguration.getEdgeSlop() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                int i8 = $11 + 107;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 4;
                }
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39, TextUtils.indexOf("", "", 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i10++;
            }
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - Color.green(0)), Color.blue(0) + 78, 7398 - View.MeasureSpec.getSize(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i15 = $10 + 73;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        if (this.IAuthTabCallback && new RxPermissions(this).onExtraCallbackWithResult("android.permission.READ_PHONE_STATE")) {
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 113;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (!this.asInterface && (!this.onNavigationEvent)) {
                int i5 = i2 + 19;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                this.onNavigationEvent = true;
            }
        }
    }

    static /* synthetic */ void IAuthTabCallback(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 67;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = null;
        }
        cardIssueSingleDigitArsVerifyFragment.onExtraCallbackWithResult(str, str2);
        int i4 = onTransact + 65;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(final String str, final String str2) {
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSingleDigitArsVerifyFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return CardIssueSingleDigitArsVerifyFragment.onNavigationEvent(str, str2, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i2 = onTransact + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (cardIssueSingleDigitArsVerifyFragment.isAdded()) {
            cardIssueSingleDigitArsVerifyFragment.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:15994905")));
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback_Parcel + 91;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        int i5 = IAuthTabCallback_Parcel + 107;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Unit unit2 = Unit.INSTANCE;
        int i7 = onTransact + 9;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
        return unit2;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            cardIssueSingleDigitArsVerifyFragment.onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        cardIssueSingleDigitArsVerifyFragment.onExtraCallbackWithResult();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 49;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, final CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        String string = cardIssueSingleDigitArsVerifyFragment.getString(R.string.app_common___6ed6d08d94);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSingleDigitArsVerifyFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueSingleDigitArsVerifyFragment.onNavigationEvent(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = cardIssueSingleDigitArsVerifyFragment.getString(R.string.app_common___cc8d0598f1);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSingleDigitArsVerifyFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueSingleDigitArsVerifyFragment.IAuthTabCallback(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        getDigestAlgorithms.onExtraCallback(writeTypedObject(), RippleNode.onNavigationEvent(this), extraCallback(), new equalsMethodParams(str, String.valueOf(readTypedObject().onExtraCallbackWithResult())), (String) null, onExtraCallback().onExtraCallback.asInterface().getText().toString(), (Map) null, 40, (Object) null);
        int i2 = onTransact + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallback = true;
            this.onNavigationEvent = true;
        } else {
            this.IAuthTabCallback = false;
            this.onNavigationEvent = false;
        }
        this.asInterface = false;
        onWarmupCompleted(IAuthTabCallback.REQUEST);
    }

    public static /* synthetic */ Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-1537219226, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1537219230, new Object[]{iAuthTabCallback, cardIssueSingleDigitArsVerifyFragment, tdsBottomCtaV1View, view}, setAutoCaptured.onExtraCallbackWithResult());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback REQUEST = new IAuthTabCallback("REQUEST", 0);
        public static final IAuthTabCallback REPORT = new IAuthTabCallback("REPORT", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            return new IAuthTabCallback[]{REQUEST, REPORT};
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            return $ENTRIES;
        }

        public static IAuthTabCallback valueOf(String str) {
            return (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
        }

        public static IAuthTabCallback[] values() {
            return (IAuthTabCallback[]) $VALUES.clone();
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, TdsBottomCtaV1View tdsBottomCtaV1View, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(1812972384, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1812972382, new Object[]{cardIssueSingleDigitArsVerifyFragment, tdsBottomCtaV1View, setDetectableSize}, setAutoCaptured.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ boolean onNavigationEvent(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(296542640, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -296542637, new Object[]{cardIssueSingleDigitArsVerifyFragment}, setAutoCaptured.onExtraCallbackWithResult())).booleanValue();
    }

    public static final /* synthetic */ void IAuthTabCallback(CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, String str) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        onExtraCallback(289301841, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -289301836, new Object[]{cardIssueSingleDigitArsVerifyFragment, str}, setAutoCaptured.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, CardIssueSingleDigitArsVerifyFragment cardIssueSingleDigitArsVerifyFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(2042634813, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -2042634813, new Object[]{iAuthTabCallback, cardIssueSingleDigitArsVerifyFragment, tdsBottomCtaV1View, view}, setAutoCaptured.onExtraCallbackWithResult());
    }

    public final class onExtraCallbackWithResult extends BroadcastReceiver {
        public onExtraCallbackWithResult() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.PHONE_STATE")) {
                String stringExtra = intent.getStringExtra("state");
                if (Intrinsics.areEqual(stringExtra, TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    CardIssueSingleDigitArsVerifyFragment.onExtraCallback(CardIssueSingleDigitArsVerifyFragment.this, true);
                    return;
                }
                if (Intrinsics.areEqual(stringExtra, TelephonyManager.EXTRA_STATE_IDLE)) {
                    Object[] objArr = {CardIssueSingleDigitArsVerifyFragment.this};
                    if (((Boolean) CardIssueSingleDigitArsVerifyFragment.onExtraCallback(296542640, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -296542637, objArr, setAutoCaptured.onExtraCallbackWithResult())).booleanValue()) {
                        CardIssueSingleDigitArsVerifyFragment.onNavigationEvent(CardIssueSingleDigitArsVerifyFragment.this, true);
                        CardIssueSingleDigitArsVerifyFragment.this.dismissProgressDialog();
                    }
                }
            }
        }
    }

    private final void onNavigationEvent(String str) {
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        onExtraCallback(1344475217, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1344475216, new Object[]{this, str}, setAutoCaptured.onExtraCallbackWithResult());
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = new int[]{644590932, 1546201074, -2033663238, -19770085, -1437775740, -1033036408, 540981913, 1818791841, 1148673729, 1357649770, 605080420, 377995907, 1880319002, -1953826770, 568487691, -1489020495, -1299674006, -42645594};
    }
}
