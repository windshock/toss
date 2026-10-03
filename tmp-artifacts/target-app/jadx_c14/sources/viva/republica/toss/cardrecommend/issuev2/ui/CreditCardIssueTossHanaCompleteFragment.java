package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.OnBackPressedCallback;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography7;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DERSet;
import o.PageContext;
import o.RSAPrivateKeyStructure;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.callTimeoutMillis;
import o.certificateChainCleaner;
import o.extraCommand;
import o.getKekid;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.preFillDefault;
import o.setBodyokhttp;
import o.toCircle;
import o.verifyCertCRLFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueTossHanaCompleteFragment extends CardIssueBaseFragment<RSAPrivateKeyStructure> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int asInterface;
    private static int[] onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private final PageContext onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[toCircle.IAuthTabCallback.values().length];
            try {
                iArr[toCircle.IAuthTabCallback.CLEAR_BLUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[toCircle.IAuthTabCallback.CLEAR_WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[toCircle.IAuthTabCallback.GRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[toCircle.IAuthTabCallback.WHITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr;
        }
    }

    static {
        onExtraCallback();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(CreditCardIssueTossHanaCompleteFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueTossHanaPlccCompleteBinding;", 0)};
        IAuthTabCallback = 8;
        int i = asBinder + 75;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(TdsButtonV1View tdsButtonV1View, CreditCardIssueTossHanaCompleteFragment creditCardIssueTossHanaCompleteFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tdsButtonV1View, creditCardIssueTossHanaCompleteFragment, view);
        int i4 = IAuthTabCallbackDefault + 125;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditCardIssueTossHanaCompleteFragment creditCardIssueTossHanaCompleteFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditCardIssueTossHanaCompleteFragment, setDetectableSize);
        int i4 = asInterface + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return unitIAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i | i6)) | (~(i7 | i9));
        int i12 = ~(i9 | i5 | i6);
        int i13 = i5 + i6 + i3 + ((-194346734) * i4) + (9035316 * i2);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i5) - 443744256) + ((-1492047866) * i6) + (352114683 * i10) + ((-352114683) * i11) + ((-352114683) * i12) + ((-1139933184) * i3) + (1190920192 * i4) + (1456996352 * i2) + ((-1774911488) * i14);
        int i16 = (i5 * 1174986172) + 1294669563 + (i6 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i3 * 1174986385) + (i4 * (-1060063438)) + (i2 * 107475828) + (i14 * 168099840);
        if (i15 + (i16 * i16 * 40566784) != 1) {
            return IAuthTabCallback(objArr);
        }
        toCircle.IAuthTabCallback iAuthTabCallback = (toCircle.IAuthTabCallback) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i17 = 2 % 2;
        int i18 = IAuthTabCallbackDefault + 51;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        int i20 = onExtraCallbackWithResult.onNavigationEvent[iAuthTabCallback.ordinal()];
        if (i20 == 1) {
            if (zBooleanValue) {
                Object[] objArr2 = new Object[1];
                a(new int[]{-1382822948, -1289832579, -629636811, 532711677, 664783222, 1687997288, 843446408, 1373995021, 1208332287, 340448288, -1546807733, -455470924, -1234999331, 517428035, -1697111468, 358789326, -952897191, -868624815, 227838960, 1923849727, -163295236, -1598484918, -393389564, 2072728926, -1873538871, 468300046, 1992965903, -1189125915, 1771995795, -2140959971, -727574601, 817699109, -1966885775, -2026967918, 1841305736, 2038978431, -282507043, 405646579, -2079000465, -1553190685, -482644050, 344328172, -2001957951, 1785389561}, (KeyEvent.getMaxKeyCode() >> 16) + 87, objArr2);
                return ((String) objArr2[0]).intern();
            }
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr3 = new Object[1];
            a(new int[]{-1382822948, -1289832579, -629636811, 532711677, 664783222, 1687997288, 843446408, 1373995021, 1208332287, 340448288, -1546807733, -455470924, -1234999331, 517428035, -1697111468, 358789326, -952897191, -868624815, 227838960, 1923849727, -163295236, -1598484918, -393389564, 2072728926, -1873538871, 468300046, 1992965903, -1189125915, 1771995795, -2140959971, -727574601, 817699109, -1966885775, -2026967918, 1841305736, 2038978431, -282507043, 405646579, -2079000465, -1553190685, -859478170, 140692135, -777295560, -1475719533, 1053631545, -700650606, 261813104, 387834224, -1318794698, 760571528}, 98 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            return ((String) objArr3[0]).intern();
        }
        if (i20 != 2) {
            int i21 = IAuthTabCallbackDefault + 9;
            asInterface = i21 % 128;
            int i22 = i21 % 2;
            if (i20 == 3) {
                Object[] objArr4 = new Object[1];
                a(new int[]{-1382822948, -1289832579, -629636811, 532711677, 664783222, 1687997288, 843446408, 1373995021, 1208332287, 340448288, -1546807733, -455470924, -1234999331, 517428035, -1697111468, 358789326, -952897191, -868624815, 227838960, 1923849727, -163295236, -1598484918, -393389564, 2072728926, -1873538871, 468300046, 1992965903, -1189125915, 1771995795, -2140959971, -727574601, 817699109, -1966885775, -2026967918, 1841305736, 2038978431, -282507043, 405646579, -1539744186, -1894107930, -825822129, -1757693005}, 85 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
                return ((String) objArr4[0]).intern();
            }
            if (i20 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr5 = new Object[1];
            a(new int[]{-1382822948, -1289832579, -629636811, 532711677, 664783222, 1687997288, 843446408, 1373995021, 1208332287, 340448288, -1546807733, -455470924, -1234999331, 517428035, -1697111468, 358789326, -952897191, -868624815, 227838960, 1923849727, -163295236, -1598484918, -393389564, 2072728926, -1873538871, 468300046, 1992965903, -1189125915, 1771995795, -2140959971, -727574601, 817699109, -1966885775, -2026967918, 1841305736, 2038978431, -282507043, 405646579, 291250885, 232632385, -1318794698, 760571528}, 82 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr5);
            return ((String) objArr5[0]).intern();
        }
        if (!zBooleanValue) {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr6 = new Object[1];
            a(new int[]{-1382822948, -1289832579, -629636811, 532711677, 664783222, 1687997288, 843446408, 1373995021, 1208332287, 340448288, -1546807733, -455470924, -1234999331, 517428035, -1697111468, 358789326, -952897191, -868624815, 227838960, 1923849727, -163295236, -1598484918, -393389564, 2072728926, -1873538871, 468300046, 1992965903, -1189125915, 1771995795, -2140959971, -727574601, 817699109, -1966885775, -2026967918, 1841305736, 2038978431, -282507043, 405646579, -2079000465, -1553190685, 173074397, -476382652, -777295560, -1475719533, 1053631545, -700650606, 261813104, 387834224, -1318794698, 760571528}, View.resolveSize(0, 0) + 98, objArr6);
            return ((String) objArr6[0]).intern();
        }
        int i23 = IAuthTabCallbackDefault + 91;
        asInterface = i23 % 128;
        int i24 = i23 % 2;
        Object[] objArr7 = new Object[1];
        a(new int[]{-1382822948, -1289832579, -629636811, 532711677, 664783222, 1687997288, 843446408, 1373995021, 1208332287, 340448288, -1546807733, -455470924, -1234999331, 517428035, -1697111468, 358789326, -952897191, -868624815, 227838960, 1923849727, -163295236, -1598484918, -393389564, 2072728926, -1873538871, 468300046, 1992965903, -1189125915, 1771995795, -2140959971, -727574601, 817699109, -1966885775, -2026967918, 1841305736, 2038978431, -282507043, 405646579, -2079000465, -1553190685, 2099004578, 575284241, -2001957951, 1785389561}, Process.getGidForName("") + 88, objArr7);
        String strIntern = ((String) objArr7[0]).intern();
        int i25 = IAuthTabCallbackDefault + 73;
        asInterface = i25 % 128;
        int i26 = i25 % 2;
        return strIntern;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditCardIssueTossHanaCompleteFragment creditCardIssueTossHanaCompleteFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(creditCardIssueTossHanaCompleteFragment, onBackPressedCallback);
        }
        onExtraCallbackWithResult(creditCardIssueTossHanaCompleteFragment, onBackPressedCallback);
        throw null;
    }

    public CreditCardIssueTossHanaCompleteFragment() {
        super(R.layout.fragment_credit_card_issue_toss_hana_plcc_complete);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.IAuthTabCallback);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 33;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i2 + 27;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, verifyCertCRLFile> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        onExtraCallback() {
            super(1, verifyCertCRLFile.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueTossHanaPlccCompleteBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final verifyCertCRLFile invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return verifyCertCRLFile.onExtraCallback(view);
        }
    }

    private final verifyCertCRLFile onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        asInterface = i2 % 128;
        return (verifyCertCRLFile) this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, i2 % 2 != 0 ? onWarmupCompleted[1] : onWarmupCompleted[0]);
    }

    private final Typography7 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Typography7 typography7 = onNavigationEvent().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        int i4 = asInterface + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return typography7;
    }

    private final TdsButtonV1View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsButtonV1View tdsButtonV1View = onNavigationEvent().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        int i4 = asInterface + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return tdsButtonV1View;
    }

    private final TdsImageView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = onNavigationEvent().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsImageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsTopV2View IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsTopV2View tdsTopV2View = onNavigationEvent().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTopV2View, "");
        int i4 = asInterface + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsTopV2View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(TdsButtonV1View tdsButtonV1View, final CreditCardIssueTossHanaCompleteFragment creditCardIssueTossHanaCompleteFragment, View view) {
        int i = 2 % 2;
        callTimeoutMillis.onNavigationEvent onnavigationevent = callTimeoutMillis.Companion;
        Context context = tdsButtonV1View.getContext();
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        callTimeoutMillis.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, context, (String) DERSet.onExtraCallback(1303958531, objArr, -1303958503, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback), new certificateChainCleaner((String) null, "tosscreditcard_register", (String) null, 4, (DefaultConstructorMarker) null), (List) null, (String) null, (String) null, (Function1) null, (Function1) null, 248, (Object) null);
        ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__complete_issuance_confirm", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueTossHanaCompleteFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CreditCardIssueTossHanaCompleteFragment.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        int i2 = asInterface + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(CreditCardIssueTossHanaCompleteFragment creditCardIssueTossHanaCompleteFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", creditCardIssueTossHanaCompleteFragment.getScreenName());
        Object[] objArr = new Object[1];
        a(new int[]{678517833, -1414997402}, 4 - Color.blue(0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "share");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        Object obj;
        toCircle.IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        toCircle.IAuthTabCallback[] iAuthTabCallbackArrValues = toCircle.IAuthTabCallback.values();
        int length = iAuthTabCallbackArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= length) {
                iAuthTabCallback = null;
                break;
            }
            iAuthTabCallback = iAuthTabCallbackArrValues[i3];
            if (Intrinsics.areEqual(iAuthTabCallback.name(), readTypedObject().onWarmupCompleted())) {
                break;
            }
            i3++;
            int i4 = asInterface + 87;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        if (iAuthTabCallback == null) {
            int i6 = IAuthTabCallbackDefault + 9;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                toCircle.IAuthTabCallback iAuthTabCallback2 = toCircle.IAuthTabCallback.CLEAR_BLUE;
                obj.hashCode();
                throw null;
            }
            iAuthTabCallback = toCircle.IAuthTabCallback.CLEAR_BLUE;
        }
        onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{this, iAuthTabCallback, Boolean.valueOf(readTypedObject().onExtraCallbackWithResult())}, -2045120640, 2045120640);
        TdsTopV2View tdsTopV2ViewIAuthTabCallbackStub = IAuthTabCallbackStub();
        tdsTopV2ViewIAuthTabCallbackStub.setUpperGap(24);
        tdsTopV2ViewIAuthTabCallbackStub.setLowerGap(24);
        tdsTopV2ViewIAuthTabCallbackStub.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        tdsTopV2ViewIAuthTabCallbackStub.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2ViewIAuthTabCallbackStub.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2ViewIAuthTabCallbackStub.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        tdsTopV2ViewIAuthTabCallbackStub.setTitleTextColor(setBodyokhttp.onExtraCallback(this).onUnminimized());
        getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(this);
        tdsTopV2ViewIAuthTabCallbackStub.setSubtitle2TextColor(geturlokhttpOnExtraCallback.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttpOnExtraCallback.getInterfaceDescriptor().ICustomTabsCallbackStubProxy() : geturlokhttpOnExtraCallback.requestPostMessageChannel().onMinimized());
        String string = getString(R.string.app_cardrecommend_plcc_issue_complete_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2ViewIAuthTabCallbackStub.setTitleText(string);
        String string2 = getString(R.string.app_cardrecommend_plcc_issue_complete_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsTopV2ViewIAuthTabCallbackStub.setSubtitle2Text(string2);
        final TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = onWarmupCompleted();
        tdsButtonV1ViewOnWarmupCompleted.setText(getString(R.string.app_cardrecommend_issuev2_ui___f4108d78e4));
        tdsButtonV1ViewOnWarmupCompleted.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueTossHanaCompleteFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCardIssueTossHanaCompleteFragment.IAuthTabCallback(tdsButtonV1ViewOnWarmupCompleted, this, view2);
            }
        });
        Typography7 typography7IAuthTabCallback = IAuthTabCallback();
        if (readTypedObject().IAuthTabCallbackStub()) {
            int i7 = IAuthTabCallbackDefault + 123;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = 8;
        }
        typography7IAuthTabCallback.setVisibility(i2);
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueTossHanaCompleteFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj2) {
                return CreditCardIssueTossHanaCompleteFragment.onNavigationEvent(this.f$0, (OnBackPressedCallback) obj2);
            }
        }, 2, (Object) null);
    }

    private static final Unit onExtraCallbackWithResult(CreditCardIssueTossHanaCompleteFragment creditCardIssueTossHanaCompleteFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
            creditCardIssueTossHanaCompleteFragment.requireBaseActivity().finish();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        creditCardIssueTossHanaCompleteFragment.requireBaseActivity().finish();
        int i3 = 61 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditCardIssueTossHanaCompleteFragment creditCardIssueTossHanaCompleteFragment = (CreditCardIssueTossHanaCompleteFragment) objArr[0];
        toCircle.IAuthTabCallback iAuthTabCallback = (toCircle.IAuthTabCallback) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            TdsImageView tdsImageViewOnExtraCallbackWithResult = creditCardIssueTossHanaCompleteFragment.onExtraCallbackWithResult();
            Object[] objArr2 = {creditCardIssueTossHanaCompleteFragment, iAuthTabCallback, Boolean.valueOf(zBooleanValue)};
            TdsImageView.setImage$default(tdsImageViewOnExtraCallbackWithResult, (String) onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), objArr2, 837400897, -837400896), (Function1) null, (Function1) null, 113, (Object) null);
            return null;
        }
        TdsImageView tdsImageViewOnExtraCallbackWithResult2 = creditCardIssueTossHanaCompleteFragment.onExtraCallbackWithResult();
        Object[] objArr3 = {creditCardIssueTossHanaCompleteFragment, iAuthTabCallback, Boolean.valueOf(zBooleanValue)};
        TdsImageView.setImage$default(tdsImageViewOnExtraCallbackWithResult2, (String) onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), objArr3, 837400897, -837400896), (Function1) null, (Function1) null, 6, (Object) null);
        return null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i3 = -1469660336;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "", 0) + 72, 8848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1469660336;
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
        int[] iArr5 = onExtraCallback;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[i5] = Integer.valueOf(iArr5[i7]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(j), 72 - (ViewConfiguration.getScrollBarSize() >> 8), 8848 - TextUtils.getOffsetBefore("", i5), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                i4 = 1;
                i5 = 0;
                j = 0;
            }
            iArr5 = iArr6;
        }
        int i8 = i5;
        System.arraycopy(iArr5, i8, iArr4, i8, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i8;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i8] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                int i11 = $11 + 49;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i9];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.green(0) + 39, KeyEvent.keyCodeFromString("") + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i9 += 36;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i9];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.getDefaultSize(0, 0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i9++;
                }
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
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4033), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 78, 7398 - Drawable.resolveOpacity(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i15 = $10 + 21;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 5 / 2;
            }
            i8 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final String onWarmupCompleted(toCircle.IAuthTabCallback iAuthTabCallback, boolean z) {
        Object[] objArr = {this, iAuthTabCallback, Boolean.valueOf(z)};
        return (String) onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), objArr, 837400897, -837400896);
    }

    private final void IAuthTabCallback(toCircle.IAuthTabCallback iAuthTabCallback, boolean z) throws Throwable {
        Object[] objArr = {this, iAuthTabCallback, Boolean.valueOf(z)};
        onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), objArr, -2045120640, 2045120640);
    }

    static void onExtraCallback() {
        onExtraCallback = new int[]{1358732885, 2122943412, 940388809, -362331699, 1356219417, 773834349, -1384965919, 879130471, -750791693, 1386040616, -517637664, 1870203148, 1943970566, 819300060, -643000549, 1630907312, -1243109016, 1903870181};
    }
}
