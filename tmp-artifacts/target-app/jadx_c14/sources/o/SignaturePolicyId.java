package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.textField.TextFieldSpinner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SignaturePolicyId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.AccountSelectView$accountSelectedListener$1$;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.send.common.WithdrawAccountListBottomSheet;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignaturePolicyId extends isSignaturePolicyImplied implements RequireInput, getSigPolicyId {
    private Function0<Unit> IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private getSigPolicyId IAuthTabCallbackStub;
    private final CardIssueOverviewViewModel IAuthTabCallback_Parcel;
    private createRewardedVideoAd asBinder;
    private final getDigestAlgorithms<?> asInterface;
    private final TypographyKtExternalSyntheticLambda0 onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private final onExtraCallbackWithResult onNavigationEvent;
    private TextFieldSpinner onTransact;
    private final createBidderTokenProviderApi onWarmupCompleted;
    private static final byte[] $$a = {8, -40, 43, -43};
    private static final int $$b = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int ICustomTabsCallback = 1;
    private static long access000 = 7798559133331975163L;
    private static int getInterfaceDescriptor = -1776194565;
    private static char access100 = 1423;

    private static String $$c(short s, int i, short s2) {
        int i2 = i + 109;
        byte[] bArr = $$a;
        int i3 = 4 - (s2 * 4);
        int i4 = s * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = i3 + i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i6 = bArr[i3];
            i3++;
            i2 += i6;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i6)) | i;
        int i9 = (~(i7 | (~i6))) | (~((~i) | i7)) | (~(i | i2 | i6));
        int i10 = ~(i6 | i);
        int i11 = i + i2 + i5 + ((-813770285) * i3) + (135932771 * i4);
        int i12 = i11 * i11;
        int i13 = (526900465 * i) + 74317824 + ((-1745228167) * i2) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i5) + (1331953664 * i3) + ((-366739456) * i4) + ((-1308753920) * i12);
        int i14 = (i * 1149714451) + 247108311 + (i2 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i5 * 1149713731) + (i3 * 1918847289) + (i4 * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        if (i15 != 1) {
            return i15 != 2 ? i15 != 3 ? i15 != 4 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }
        SignaturePolicyId signaturePolicyId = (SignaturePolicyId) objArr[0];
        createRewardedVideoAd createrewardedvideoad = (createRewardedVideoAd) objArr[1];
        int i16 = 2 % 2;
        TextFieldSpinner textFieldSpinner = signaturePolicyId.onTransact;
        if (textFieldSpinner != null) {
            textFieldSpinner.setTextFieldSpinnerTitle(getSignForPKCS7V2.onExtraCallbackWithResult(createrewardedvideoad.onNavigationEvent()) + " " + createrewardedvideoad.onExtraCallback());
            int i17 = IAuthTabCallbackStubProxy + 25;
            ICustomTabsCallback = i17 % 128;
            int i18 = i17 % 2;
        }
        signaturePolicyId.asBinder = (createRewardedVideoAd) IAuthTabCallback(-772061751, new Object[]{signaturePolicyId, createrewardedvideoad}, 772061751, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        Function0<Unit> function0 = signaturePolicyId.IAuthTabCallback;
        if (function0 != null) {
            function0.invoke();
        }
        int i19 = IAuthTabCallbackStubProxy + 99;
        ICustomTabsCallback = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SignaturePolicyId signaturePolicyId, TextFieldSpinner textFieldSpinner, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(signaturePolicyId, textFieldSpinner, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(signaturePolicyId, textFieldSpinner, view);
        int i3 = IAuthTabCallbackStubProxy + 93;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(dialogInterface);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dialogInterface);
        int i3 = ICustomTabsCallback + 75;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(SignaturePolicyId signaturePolicyId, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(signaturePolicyId, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 33;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        createNativeAdBaseApi createnativeadbaseapi = (createNativeAdBaseApi) objArr[0];
        SignaturePolicyId signaturePolicyId = (SignaturePolicyId) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(createnativeadbaseapi, signaturePolicyId, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        int i5 = ICustomTabsCallback + 7;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = ICustomTabsCallback + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return sessionTrackerbIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(SignaturePolicyId signaturePolicyId, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(signaturePolicyId, dialogInterface);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public SignaturePolicyId(@NotNull createBidderTokenProviderApi createbiddertokenproviderapi, @NotNull Context context, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel, @NotNull getDigestAlgorithms<?> getdigestalgorithms) {
        String strOnNavigationEvent;
        Intrinsics.checkNotNullParameter(createbiddertokenproviderapi, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        this.onWarmupCompleted = createbiddertokenproviderapi;
        this.onExtraCallbackWithResult = context;
        this.onExtraCallback = typographyKtExternalSyntheticLambda0;
        this.IAuthTabCallback_Parcel = cardIssueOverviewViewModel;
        this.asInterface = getdigestalgorithms;
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AccountSelectView$$ExternalSyntheticLambda3
            public final Object invoke() {
                int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                return (SessionTrackerb) SignaturePolicyId.IAuthTabCallback(-126118317, new Object[0], 126118319, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
            }
        });
        createRewardedVideoAd createrewardedvideoadIAuthTabCallback = createbiddertokenproviderapi.IAuthTabCallback();
        createRewardedVideoAd createrewardedvideoadIAuthTabCallback2 = null;
        if (createrewardedvideoadIAuthTabCallback != null) {
            strOnNavigationEvent = createrewardedvideoadIAuthTabCallback.onNavigationEvent();
        } else {
            int i = 2 % 2;
            strOnNavigationEvent = null;
        }
        if (!Intrinsics.areEqual(strOnNavigationEvent, checkNavigationBarByWindowManagerService.TOSS_SECURITIES.getCode())) {
            createrewardedvideoadIAuthTabCallback2 = createbiddertokenproviderapi.IAuthTabCallback();
        } else {
            int i2 = ICustomTabsCallback + 39;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
        }
        this.asBinder = createrewardedvideoadIAuthTabCallback2;
        this.onNavigationEvent = new onExtraCallbackWithResult();
        int i4 = ICustomTabsCallback + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ createBidderTokenProviderApi IAuthTabCallback(SignaturePolicyId signaturePolicyId) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Object obj = null;
        createBidderTokenProviderApi createbiddertokenproviderapi = signaturePolicyId.onWarmupCompleted;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return createbiddertokenproviderapi;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(SignaturePolicyId signaturePolicyId) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        signaturePolicyId.getInterfaceDescriptor();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ CardIssueOverviewViewModel onExtraCallbackWithResult(SignaturePolicyId signaturePolicyId) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 13;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        CardIssueOverviewViewModel cardIssueOverviewViewModel = signaturePolicyId.IAuthTabCallback_Parcel;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 33;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return cardIssueOverviewViewModel;
    }

    public static final /* synthetic */ getDigestAlgorithms onWarmupCompleted(SignaturePolicyId signaturePolicyId) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        getDigestAlgorithms<?> getdigestalgorithms = signaturePolicyId.asInterface;
        int i5 = i3 + 85;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return getdigestalgorithms;
    }

    public static final /* synthetic */ void onWarmupCompleted(SignaturePolicyId signaturePolicyId, createRewardedVideoAd createrewardedvideoad) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallback(-1691107055, new Object[]{signaturePolicyId, createrewardedvideoad}, 1691107056, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
        int i4 = ICustomTabsCallback + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final SessionTrackerb asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = (SessionTrackerb) this.IAuthTabCallbackDefault.getValue();
        int i3 = ICustomTabsCallback + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return sessionTrackerb;
    }

    private static final SessionTrackerb IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            return ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
        }
        Response response2 = Response.onNavigationEvent;
        ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this.onExtraCallbackWithResult);
        linearLayout.setOrientation(1);
        linearLayout.addView(asBinder());
        createNativeBannerAdViewApi createnativebanneradviewapiIAuthTabCallbackStub = this.onWarmupCompleted.IAuthTabCallbackStub();
        if (createnativebanneradviewapiIAuthTabCallbackStub != null) {
            int i2 = IAuthTabCallbackStubProxy + 47;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout linearLayoutOnWarmupCompleted = getSubjectPublicKeyInfo.onWarmupCompleted(createnativebanneradviewapiIAuthTabCallbackStub, context, this.onExtraCallback, this.IAuthTabCallback_Parcel, this.asInterface);
            if (linearLayoutOnWarmupCompleted != null) {
                int i4 = IAuthTabCallbackStubProxy + 109;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                linearLayout.addView(linearLayoutOnWarmupCompleted);
                if (i5 == 0) {
                    int i6 = 67 / 0;
                }
            }
        }
        return linearLayout;
    }

    private final List<KeyBoardVisiblePoint> IAuthTabCallbackStub() {
        int i = 2 % 2;
        DERConstructedSequence dERConstructedSequence = DERConstructedSequence.onNavigationEvent;
        ArrayList arrayList = new ArrayList();
        List listIAuthTabCallback = PageShowPoint.Companion.IAuthTabCallback();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listIAuthTabCallback) {
            if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).requestPostMessageChannelWithExtras()) {
                int i2 = IAuthTabCallbackStubProxy + 65;
                ICustomTabsCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList2.add(obj);
                    int i3 = 81 / 0;
                } else {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!issueCertV3.onTransact((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj2)) {
                int i4 = ICustomTabsCallback + 89;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                arrayList3.add(obj2);
                if (i5 != 0) {
                    int i6 = 18 / 0;
                }
            }
        }
        arrayList.addAll(arrayList3);
        Unit unit = Unit.INSTANCE;
        return onWarmupCompleted((List<? extends KeyBoardVisiblePoint>) dERConstructedSequence.IAuthTabCallback(arrayList));
    }

    public getSigPolicyId onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        getSigPolicyId getsigpolicyid = this.IAuthTabCallbackStub;
        int i5 = i3 + 31;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return getsigpolicyid;
    }

    @Override // o.getSigPolicyId
    public void onExtraCallbackWithResult(@Nullable getSigPolicyId getsigpolicyid) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = getsigpolicyid;
        int i5 = i3 + 81;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final im.toss.uikit.widget.textField.TextFieldSpinner asBinder() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SignaturePolicyId.asBinder():im.toss.uikit.widget.textField.TextFieldSpinner");
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 19;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(SignaturePolicyId signaturePolicyId, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            IAuthTabCallback(-1395322348, new Object[]{signaturePolicyId}, 1395322351, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
            throw null;
        }
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallback(-1395322348, new Object[]{signaturePolicyId}, 1395322351, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        int i3 = IAuthTabCallbackStubProxy + 105;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit onNavigationEvent(createNativeAdBaseApi createnativeadbaseapi, final SignaturePolicyId signaturePolicyId, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(createnativeadbaseapi.IAuthTabCallback());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(createnativeadbaseapi.onExtraCallback());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, createnativeadbaseapi.onExtraCallbackWithResult(), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AccountSelectView$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return SignaturePolicyId.onExtraCallback((DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new DialogInterface.OnDismissListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AccountSelectView$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SignaturePolicyId.onWarmupCompleted(this.f$0, dialogInterface);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 99;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(final SignaturePolicyId signaturePolicyId, TextFieldSpinner textFieldSpinner, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            signaturePolicyId.onWarmupCompleted.onWarmupCompleted();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if (signaturePolicyId.onWarmupCompleted.onWarmupCompleted()) {
            createAdSizeApi createadsizeapiOnExtraCallback = signaturePolicyId.onWarmupCompleted.onExtraCallback();
            if (createadsizeapiOnExtraCallback != null) {
                int i3 = ICustomTabsCallback + 23;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                getDigestAlgorithms.onExtraCallbackWithResult(signaturePolicyId.asInterface, signaturePolicyId.onExtraCallback, createadsizeapiOnExtraCallback, signaturePolicyId.IAuthTabCallback_Parcel, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
            }
        } else {
            final createNativeAdBaseApi createnativeadbaseapiOnNavigationEvent = signaturePolicyId.onWarmupCompleted.onNavigationEvent();
            if (createnativeadbaseapiOnNavigationEvent != null) {
                Context context = textFieldSpinner.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AccountSelectView$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj) {
                        Object[] objArr = {createnativeadbaseapiOnNavigationEvent, signaturePolicyId, (CommonModule_setLeftEdgeTouchEnabled) obj};
                        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                        return (Unit) SignaturePolicyId.IAuthTabCallback(-1623170144, objArr, 1623170148, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
                    }
                });
            } else {
                int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                IAuthTabCallback(-1395322348, new Object[]{signaturePolicyId}, 1395322351, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
            }
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult implements WithdrawAccountListBottomSheet.onExtraCallbackWithResult {
        private static final byte[] $$a = {118, 33, 67, 92};
        private static final int $$b = 84;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int asInterface = 1;
        private static long onExtraCallbackWithResult = 802070979878043191L;
        private static int IAuthTabCallback = -1776194565;
        private static char onNavigationEvent = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, byte r8) {
            /*
                int r8 = r8 * 3
                int r0 = r8 + 1
                int r6 = r6 + 4
                byte[] r1 = o.SignaturePolicyId.onExtraCallbackWithResult.$$a
                int r7 = 110 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L13
                r7 = r6
                r3 = r8
                r4 = r2
                goto L28
            L13:
                r3 = r2
            L14:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                r3 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r5
            L28:
                int r3 = -r3
                int r6 = r6 + r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SignaturePolicyId.onExtraCallbackWithResult.$$c(byte, int, byte):java.lang.String");
        }

        public static /* synthetic */ Unit onExtraCallback(SignaturePolicyId signaturePolicyId, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(signaturePolicyId, setDetectableSize);
            if (i3 != 0) {
                int i4 = 75 / 0;
            }
            int i5 = asInterface + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unitOnNavigationEvent;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i3 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i4 = $10 + 111;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i3, i3));
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 43;
                        int iIndexOf = TextUtils.indexOf("", "", i3, i3) + 1451;
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        String str$$c = $$c(b, b2, b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i3] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, scrollBarSize, iIndexOf, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (-b3);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), 44 - (Process.myPid() >> 22), 1494 - (ViewConfiguration.getLongPressTimeout() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23972), 49 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getPressedStateDuration() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 45849), KeyEvent.getDeadChar(0, 0) + 29, (Process.myPid() >> 22) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                i3 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            String str = new String(cArr6);
            int i6 = $11 + 109;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        onExtraCallbackWithResult() {
        }

        private static final Unit onNavigationEvent(SignaturePolicyId signaturePolicyId, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("card_id", SignaturePolicyId.onExtraCallbackWithResult(signaturePolicyId).IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("funnel_id", SignaturePolicyId.onExtraCallbackWithResult(signaturePolicyId).getInterfaceDescriptor());
            setDetectableSize.onExtraCallback("session_id", SignaturePolicyId.onExtraCallbackWithResult(signaturePolicyId).ICustomTabsCallbackStubProxy());
            setDetectableSize.onExtraCallback("screen_type", ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{SignaturePolicyId.onWarmupCompleted(signaturePolicyId)}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onExtraCallback());
            Object[] objArr = new Object[1];
            a((char) (32348 - TextUtils.lastIndexOf("", '0', 0, 0)), (-1) - MotionEvent.axisFromString(""), new char[]{6686, 29764, 39072, 10927}, new char[]{54732, 5734, 35704, 26395}, new char[]{46266, 19374, 23956, 34942}, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), SignaturePolicyId.IAuthTabCallback(signaturePolicyId).onTransact());
            Object[] objArr2 = new Object[1];
            a((char) (ExpandableListView.getPackedPositionChild(0L) + 20202), 197793867 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{23068, 45064, 42819, 19250, 40696}, new char[]{54732, 5734, 35704, 26395}, new char[]{19325, 51736, 59659, 62286}, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), "계좌 선택");
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 59;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
            }
            return unit;
        }

        @Override // viva.republica.toss.send.common.WithdrawAccountListBottomSheet.onExtraCallbackWithResult
        public void IAuthTabCallback(MyAccountInfo myAccountInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(myAccountInfo, "");
            ConvertByteArrayToFloatArray.onExtraCallback(1385810L, false, (String) null, (Map) null, new AccountSelectView$accountSelectedListener$1$.ExternalSyntheticLambda0(SignaturePolicyId.this), 14, (Object) null);
            SignaturePolicyId.onWarmupCompleted(SignaturePolicyId.this, new createRewardedVideoAd(String.valueOf(myAccountInfo.IAuthTabCallbackStub()), myAccountInfo.onExtraCallback()));
            getSigPolicyId getsigpolicyidOnExtraCallbackWithResult = SignaturePolicyId.this.onExtraCallbackWithResult();
            if (getsigpolicyidOnExtraCallbackWithResult != null) {
                int i2 = onWarmupCompleted + 7;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                getsigpolicyidOnExtraCallbackWithResult.IAuthTabCallbackDefault();
                int i4 = onWarmupCompleted + 5;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 4;
                }
            }
        }

        @Override // viva.republica.toss.send.common.WithdrawAccountListBottomSheet.onExtraCallbackWithResult
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                SignaturePolicyId.onExtraCallback(SignaturePolicyId.this);
                int i3 = 19 / 0;
            } else {
                SignaturePolicyId.onExtraCallback(SignaturePolicyId.this);
            }
            int i4 = onWarmupCompleted + 65;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 49;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), View.resolveSize(0, 0) + 43, MotionEvent.axisFromString("") + 1452, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 44 - View.MeasureSpec.makeMeasureSpec(0, 0), 1494 - KeyEvent.keyCodeFromString(""), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 51, Color.argb(0, 0, 0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45848), 29 - TextUtils.indexOf("", "", 0), 12576 - ExpandableListView.getPackedPositionChild(0L), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (access000 ^ 7798559133331975163L)) ^ ((int) (getInterfaceDescriptor ^ 7798559133331975163L))) ^ ((char) (access100 ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onNavigationEvent(SignaturePolicyId signaturePolicyId, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", signaturePolicyId.IAuthTabCallback_Parcel.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", signaturePolicyId.IAuthTabCallback_Parcel.getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", signaturePolicyId.IAuthTabCallback_Parcel.ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{signaturePolicyId.asInterface}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onExtraCallback());
        Object[] objArr = new Object[1];
        a((char) (5069 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{57466, 18711, 54998, 64631}, new char[]{0, 0, 0, 0}, new char[]{19630, 15946, 52248, 25875}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), signaturePolicyId.onWarmupCompleted.onTransact());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 75;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        KeyBoardVisiblePoint keyBoardVisiblePoint;
        MyAccountInfo myAccountInfoIAuthTabCallbackDefault;
        Object next;
        final SignaturePolicyId signaturePolicyId = (SignaturePolicyId) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (signaturePolicyId.IAuthTabCallbackStub().isEmpty()) {
            int i2 = IAuthTabCallbackStubProxy + 51;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                ((Boolean) createBidderTokenProviderApi.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1144621486, -1144621485, new Object[]{signaturePolicyId.onWarmupCompleted}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).booleanValue();
                obj.hashCode();
                throw null;
            }
            if (((Boolean) createBidderTokenProviderApi.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1144621486, -1144621485, new Object[]{signaturePolicyId.onWarmupCompleted}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).booleanValue()) {
                signaturePolicyId.getInterfaceDescriptor();
                return null;
            }
        }
        createRewardedVideoAd createrewardedvideoad = signaturePolicyId.asBinder;
        if (createrewardedvideoad != null) {
            Iterator<T> it = signaturePolicyId.IAuthTabCallbackStub().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                KeyBoardVisiblePoint keyBoardVisiblePoint2 = (KeyBoardVisiblePoint) next;
                if (Intrinsics.areEqual(createrewardedvideoad.onNavigationEvent(), keyBoardVisiblePoint2.asInterface())) {
                    int i3 = ICustomTabsCallback + 37;
                    IAuthTabCallbackStubProxy = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 0 / 0;
                        if (Intrinsics.areEqual(createrewardedvideoad.onExtraCallback(), keyBoardVisiblePoint2.bP_())) {
                            break;
                        }
                    } else if (Intrinsics.areEqual(createrewardedvideoad.onExtraCallback(), keyBoardVisiblePoint2.bP_())) {
                        break;
                    }
                }
            }
            keyBoardVisiblePoint = (KeyBoardVisiblePoint) next;
        } else {
            int i5 = ICustomTabsCallback + 67;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            keyBoardVisiblePoint = null;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1385804L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AccountSelectView$$ExternalSyntheticLambda1
            public final Object invoke(Object obj2) {
                return SignaturePolicyId.onExtraCallback(this.f$0, (SetDetectableSize) obj2);
            }
        }, 14, (Object) null);
        Context context = signaturePolicyId.onExtraCallbackWithResult;
        SessionTrackerb sessionTrackerbAsInterface = signaturePolicyId.asInterface();
        List<KeyBoardVisiblePoint> listIAuthTabCallbackStub = signaturePolicyId.IAuthTabCallbackStub();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallbackStub, 10));
        Iterator<T> it2 = listIAuthTabCallbackStub.iterator();
        while (!(!it2.hasNext())) {
            int i7 = ICustomTabsCallback + 105;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            arrayList.add(issueCertV3.IAuthTabCallbackDefault((KeyBoardVisiblePoint) it2.next()));
        }
        if (keyBoardVisiblePoint != null) {
            int i9 = ICustomTabsCallback + 105;
            IAuthTabCallbackStubProxy = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 39 / 0;
                myAccountInfoIAuthTabCallbackDefault = issueCertV3.IAuthTabCallbackDefault(keyBoardVisiblePoint);
            } else {
                myAccountInfoIAuthTabCallbackDefault = issueCertV3.IAuthTabCallbackDefault(keyBoardVisiblePoint);
            }
        } else {
            myAccountInfoIAuthTabCallbackDefault = null;
        }
        new WithdrawAccountListBottomSheet(context, sessionTrackerbAsInterface, arrayList, myAccountInfoIAuthTabCallbackDefault, signaturePolicyId.onNavigationEvent, "결제계좌 선택", null, ((Boolean) createBidderTokenProviderApi.onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1144621486, -1144621485, new Object[]{signaturePolicyId.onWarmupCompleted}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).booleanValue(), WithdrawAccountListBottomSheet.onWarmupCompleted.TOSS_PLCC, null, null, null, null, 7744, null).show();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[PHI: r2 r4
      0x0039: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v14 java.lang.String) binds: [B:9:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r4v1 java.lang.Boolean) = (r4v0 java.lang.Boolean), (r4v7 java.lang.Boolean) binds: [B:9:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void getInterfaceDescriptor() {
        /*
            r23 = this;
            r0 = r23
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.SignaturePolicyId.IAuthTabCallbackStubProxy
            int r2 = r2 + 89
            int r3 = r2 % 128
            o.SignaturePolicyId.ICustomTabsCallback = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 != 0) goto L29
            o.createBidderTokenProviderApi r2 = r0.onWarmupCompleted
            java.lang.String r2 = r2.onTransact()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            o.createBidderTokenProviderApi r5 = r0.onWarmupCompleted
            java.lang.String r5 = r5.asBinder()
            r6 = 77
            int r6 = r6 / r3
            if (r5 != 0) goto L25
            goto L39
        L25:
            r8 = r2
            r10 = r4
            r13 = r5
            goto L3c
        L29:
            o.createBidderTokenProviderApi r2 = r0.onWarmupCompleted
            java.lang.String r2 = r2.onTransact()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            o.createBidderTokenProviderApi r5 = r0.onWarmupCompleted
            java.lang.String r5 = r5.asBinder()
            if (r5 != 0) goto L25
        L39:
            java.lang.String r5 = ""
            goto L25
        L3c:
            o.OIWObjectIdentifiers r2 = new o.OIWObjectIdentifiers
            java.lang.String r7 = "ACCOUNT_SELECT"
            r9 = 0
            r11 = 0
            r12 = 0
            o.createBidderTokenProviderApi r4 = r0.onWarmupCompleted
            java.util.List r14 = r4.asInterface()
            r15 = 48
            r16 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            o.TypographyKtExternalSyntheticLambda0 r4 = r0.onExtraCallback
            o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 r4 = r4.asBinder()
            o.TypographyKtExternalSyntheticLambda0 r5 = r0.onExtraCallback
            int r6 = r2.access100()
            o.PullRefreshIndicatorTransformKtExternalSyntheticLambda0 r5 = r5.IAuthTabCallback_Parcel()
            o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 r7 = new o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8
            r7.<init>(r5, r3, r6)
            o.TypographyKtExternalSyntheticLambda0 r5 = r0.onExtraCallback
            o.getDigestAlgorithms r6 = new o.getDigestAlgorithms
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 32
            r22 = 0
            r14 = r6
            r15 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel r8 = r0.IAuthTabCallback_Parcel
            r2.onExtraCallbackWithResult(r5, r7, r6, r8)
            o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 r5 = r7.onExtraCallback()
            r4.onExtraCallback(r5)
            o.TypographyKtExternalSyntheticLambda0 r4 = r0.onExtraCallback
            int r2 = r2.access100()
            java.lang.String r5 = "useForResult"
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            kotlin.Pair r5 = o.getWrite.IAuthTabCallback(r5, r6)
            r6 = 1
            kotlin.Pair[] r7 = new kotlin.Pair[r6]
            r7[r3] = r5
            android.os.Bundle r3 = o.RotationProvider1.onNavigationEvent(r7)
            o.getDigestAlgorithms<?> r5 = r0.asInterface
            r7 = 0
            o.setPositionProvider r5 = o.getDigestAlgorithms.onExtraCallback(r5, r7, r6, r7)
            r4.onWarmupCompleted(r2, r3, r5)
            int r2 = o.SignaturePolicyId.ICustomTabsCallback
            int r2 = r2 + 33
            int r3 = r2 % 128
            o.SignaturePolicyId.IAuthTabCallbackStubProxy = r3
            int r2 = r2 % r1
            if (r2 != 0) goto Lb6
            return
        Lb6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SignaturePolicyId.getInterfaceDescriptor():void");
    }

    @Override // o.getSigPolicyId
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (IAuthTabCallback()) {
            getSigPolicyId getsigpolicyidOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (getsigpolicyidOnExtraCallbackWithResult != null) {
                int i2 = ICustomTabsCallback + 53;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                getsigpolicyidOnExtraCallbackWithResult.IAuthTabCallbackDefault();
                if (i3 != 0) {
                    throw null;
                }
                return;
            }
            return;
        }
        int i4 = IAuthTabCallbackStubProxy + 45;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            IAuthTabCallback(-1395322348, new Object[]{this}, 1395322351, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
        } else {
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            IAuthTabCallback(-1395322348, new Object[]{this}, 1395322351, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
            throw null;
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public Pair<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getWrite.IAuthTabCallback(this.onWarmupCompleted.onTransact(), this.asBinder);
            throw null;
        }
        Pair<String, Object> pairIAuthTabCallback = getWrite.IAuthTabCallback(this.onWarmupCompleted.onTransact(), this.asBinder);
        int i3 = ICustomTabsCallback + 95;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return pairIAuthTabCallback;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        if (this.asBinder != null) {
            int i2 = IAuthTabCallbackStubProxy + 95;
            ICustomTabsCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = ICustomTabsCallback + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = function0;
        int i4 = ICustomTabsCallback + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SignaturePolicyId signaturePolicyId = (SignaturePolicyId) objArr[0];
        createRewardedVideoAd createrewardedvideoad = (createRewardedVideoAd) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        List<Integer> listAsInterface = signaturePolicyId.onWarmupCompleted.asInterface();
        if (!(!listAsInterface.contains(Integer.valueOf(StringsKt.toIntOrNull(createrewardedvideoad.onNavigationEvent()) != null ? r4.intValue() : 0)))) {
            return null;
        }
        int i4 = ICustomTabsCallback + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return createrewardedvideoad;
        }
        throw null;
    }

    public static final class IAuthTabCallback extends View.AccessibilityDelegate {
        IAuthTabCallback() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
    }

    private final void onNavigationEvent(View view) {
        int i = 2 % 2;
        view.setAccessibilityDelegate(new IAuthTabCallback());
        int i2 = ICustomTabsCallback + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
    }

    private final List<KeyBoardVisiblePoint> onWarmupCompleted(List<? extends KeyBoardVisiblePoint> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = IAuthTabCallbackStubProxy + 87;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Object next = it.next();
            List<Integer> listAsInterface = this.onWarmupCompleted.asInterface();
            Integer intOrNull = StringsKt.toIntOrNull(((KeyBoardVisiblePoint) next).asInterface());
            if (!listAsInterface.contains(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0))) {
                int i4 = ICustomTabsCallback + 89;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ SessionTrackerb onExtraCallback() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (SessionTrackerb) IAuthTabCallback(-126118317, new Object[0], 126118319, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(createNativeAdBaseApi createnativeadbaseapi, SignaturePolicyId signaturePolicyId, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) IAuthTabCallback(-1623170144, new Object[]{createnativeadbaseapi, signaturePolicyId, commonModule_setLeftEdgeTouchEnabled}, 1623170148, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
    }

    private final void IAuthTabCallback(createRewardedVideoAd createrewardedvideoad) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallback(-1691107055, new Object[]{this, createrewardedvideoad}, 1691107056, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
    }

    private final void IAuthTabCallbackStubProxy() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallback(-1395322348, new Object[]{this}, 1395322351, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
    }

    private final createRewardedVideoAd onNavigationEvent(createRewardedVideoAd createrewardedvideoad) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (createRewardedVideoAd) IAuthTabCallback(-772061751, new Object[]{this, createrewardedvideoad}, 772061751, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
    }
}
