package viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ECGOST3410ParamSetParameters;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PKCS12_GetCertWithPFX_ENCPKCS8;
import o.PageRenderReadyListener;
import o.RippleNode;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.getUnauthenticatedAttributes;
import o.preFillDefault;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueOcrIntroStep2Fragment extends Hilt_CardIssueOcrIntroStep2Fragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    public static final int onNavigationEvent;
    private static int onTransact;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private final Lazy onExtraCallback;
    private final PageRenderReadyListener onExtraCallbackWithResult;

    static {
        onExtraCallback();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueOcrIntroStep2Fragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueOcrImplOcrIntroStep2Binding;", 0)};
        onNavigationEvent = 8;
        int i = IAuthTabCallbackDefault + 41;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueOcrIntroStep2Fragment);
        int i4 = asInterface + 29;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueOcrIntroStep2Fragment, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 77;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = i9 | i10 | (~(i8 | i5));
        int i12 = i10 | i6;
        int i13 = ~i5;
        int i14 = (~(i6 | i13 | i4)) | (~(i7 | i13 | i8)) | (~(i8 | i4 | i5));
        int i15 = i4 + i5 + i + ((-1329026341) * i2) + ((-1277752516) * i3);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i4) - 1912602624) + ((-659060787) * i5) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i) + (494927872 * i2) + (1577058304 * i3) + ((-1783103488) * i16);
        int i18 = (i4 * 595972471) + 129777640 + (i5 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i * 595972219) + (i2 * (-1341978823)) + (i3 * 731850196) + (i16 * 1869086720);
        if (i17 + (i18 * i18 * (-846725120)) != 1) {
            CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment = (CardIssueOcrIntroStep2Fragment) objArr[0];
            int i19 = 2 % 2;
            int i20 = asInterface + 103;
            IAuthTabCallbackStub = i20 % 128;
            int i21 = i20 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueOcrIntroStep2Fragment);
            int i22 = asInterface + 73;
            IAuthTabCallbackStub = i22 % 128;
            int i23 = i22 % 2;
            return unitIAuthTabCallback;
        }
        int i24 = 2 % 2;
        int i25 = asInterface + 81;
        IAuthTabCallbackStub = i25 % 128;
        int i26 = i25 % 2;
        Object[] objArr2 = new Object[1];
        a(new int[]{-1696524460, -1589561942, 780005472, 194195113, -1941050689, -982456733, 302606442, -659321834, -1822347808, -1448563260, 1220879050, -1093213842, -1168481790, 1305171571, 172532247, -584225004, 1928847136, -1960352152, 529753346, 1047932842, -1218155039, 528393238, 1741711676, 6581153, -1976951320, 2003280548, 1588751844, 177200470}, 54 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i27 = IAuthTabCallbackStub + 73;
        asInterface = i27 % 128;
        int i28 = i27 % 2;
        return strIntern;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueOcrIntroStep2Fragment, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = i3 + 61;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return 1473797L;
    }

    public CardIssueOcrIntroStep2Fragment() {
        super(R.layout.fragment_card_issue_ocr_impl_ocr_intro_step2);
        this.onExtraCallbackWithResult = preFillDefault.IAuthTabCallback(this, onExtraCallback.IAuthTabCallback);
        this.onExtraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOcrIntroV2ViewModel.class), new IAuthTabCallback(this), new onExtraCallbackWithResult(null, this), new onWarmupCompleted(this));
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, PKCS12_GetCertWithPFX_ENCPKCS8> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        onExtraCallback() {
            super(1, PKCS12_GetCertWithPFX_ENCPKCS8.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueOcrImplOcrIntroStep2Binding;", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final PKCS12_GetCertWithPFX_ENCPKCS8 invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return PKCS12_GetCertWithPFX_ENCPKCS8.onExtraCallbackWithResult(view);
        }
    }

    private final PKCS12_GetCertWithPFX_ENCPKCS8 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        PKCS12_GetCertWithPFX_ENCPKCS8 pKCS12_GetCertWithPFX_ENCPKCS8 = (PKCS12_GetCertWithPFX_ENCPKCS8) this.onExtraCallbackWithResult.onNavigationEvent(this, onWarmupCompleted[0]);
        int i4 = IAuthTabCallbackStub + 81;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return pKCS12_GetCertWithPFX_ENCPKCS8;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep2Fragment$$ExternalSyntheticLambda1
            public final Object invoke() {
                return (Unit) CardIssueOcrIntroStep2Fragment.onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this.f$0}, -458454212, 458454212, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
            }
        }, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep2Fragment$$ExternalSyntheticLambda2
            public final Object invoke() {
                return CardIssueOcrIntroStep2Fragment.onNavigationEvent(this.f$0);
            }
        });
        int i2 = IAuthTabCallbackStub + 55;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        CharSequence text;
        TdsBottomCtaV1View tdsBottomCtaV1View;
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback(cardIssueOcrIntroStep2Fragment.getScreenParams());
        PKCS12_GetCertWithPFX_ENCPKCS8 pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted = cardIssueOcrIntroStep2Fragment.onWarmupCompleted();
        if (pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted == null || (tdsBottomCtaV1View = pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted.onNavigationEvent) == null) {
            text = null;
        } else {
            int i4 = asInterface + 77;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
            if (tdsButtonV1ViewAsInterface != null) {
                int i6 = asInterface + 53;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                text = tdsButtonV1ViewAsInterface.getText();
            }
        }
        Object[] objArr = new Object[1];
        a(new int[]{-703122396, -2015997953, 1813622006, 2029425373}, 5 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), text);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackStub + 119;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 87 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(final CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep2Fragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueOcrIntroStep2Fragment.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        RippleNode.onNavigationEvent(cardIssueOcrIntroStep2Fragment).onNavigationEvent(R.id.step3_fragment);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 123;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r12
      0x0035: PHI (r12v2 o.PKCS12_GetCertWithPFX_ENCPKCS8) = (r12v1 o.PKCS12_GetCertWithPFX_ENCPKCS8), (r12v14 o.PKCS12_GetCertWithPFX_ENCPKCS8) binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        PKCS12_GetCertWithPFX_ENCPKCS8 pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        asInterface = i2 % 128;
        CharSequence text = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            setDetectableSize.onExtraCallback(cardIssueOcrIntroStep2Fragment.getScreenParams());
            pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted = cardIssueOcrIntroStep2Fragment.onWarmupCompleted();
            int i3 = 4 / 0;
            if (pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted != null) {
                TdsBottomCtaV1View tdsBottomCtaV1View = pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted.onNavigationEvent;
                if (tdsBottomCtaV1View != null) {
                    int i4 = IAuthTabCallbackStub + 101;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr = {tdsBottomCtaV1View};
                    int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    if (i5 == 0) {
                        text.hashCode();
                        throw null;
                    }
                    TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback, objArr, -1667615339, 1667615356, iIAuthTabCallback4);
                    if (tdsButtonV1View != null) {
                        text = tdsButtonV1View.getText();
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            setDetectableSize.onExtraCallback(cardIssueOcrIntroStep2Fragment.getScreenParams());
            pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted = cardIssueOcrIntroStep2Fragment.onWarmupCompleted();
            if (pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted != null) {
            }
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{-703122396, -2015997953, 1813622006, 2029425373}, 5 - View.MeasureSpec.getSize(0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), text);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 3;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(final CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep2Fragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return CardIssueOcrIntroStep2Fragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        RippleNode.onNavigationEvent(cardIssueOcrIntroStep2Fragment).onExtraCallbackWithResult(ECGOST3410ParamSetParameters.Companion.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(Function0<Unit> function0, Function0<Unit> function02) {
        int i = 2 % 2;
        PKCS12_GetCertWithPFX_ENCPKCS8 pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted = onWarmupCompleted();
        if (pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted != null) {
            int i2 = IAuthTabCallbackStub + 15;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            String str = (String) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, -1662598682, 1662598683, iOnNavigationEvent);
            TdsImageView tdsImageView = pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
            TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
            AnimateText animateText = pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(animateText, BuildConfig.FLAVOR);
            getUnauthenticatedAttributes.onWarmupCompleted(animateText, onTransact());
            AnimateText animateText2 = pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(animateText2, BuildConfig.FLAVOR);
            getUnauthenticatedAttributes.onExtraCallbackWithResult(animateText2, IAuthTabCallbackDefault());
            TdsBottomCtaV1View tdsBottomCtaV1View = pKCS12_GetCertWithPFX_ENCPKCS8OnWarmupCompleted.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, BuildConfig.FLAVOR);
            getUnauthenticatedAttributes.onExtraCallbackWithResult(tdsBottomCtaV1View, function0, function02);
        }
        int i4 = IAuthTabCallbackStub + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public Map<String, Object> getScreenParams() {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity;
        int i = 2 % 2;
        CardIssueOcrIntroV2Activity activity = getActivity();
        if (!(!(activity instanceof CardIssueOcrIntroV2Activity))) {
            int i2 = asInterface + 71;
            IAuthTabCallbackStub = i2 % 128;
            cardIssueOcrIntroV2Activity = activity;
            if (i2 % 2 != 0) {
                throw null;
            }
        } else {
            int i3 = IAuthTabCallbackStub + 3;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            cardIssueOcrIntroV2Activity = null;
        }
        if (cardIssueOcrIntroV2Activity == null) {
            return null;
        }
        int i5 = IAuthTabCallbackStub + 11;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return cardIssueOcrIntroV2Activity.onWarmupCompleted("bring_your_idcard");
    }

    private final String onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(R.string.card_ocr_impl_intro_step2_title);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        int i4 = asInterface + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(getString(R.string.card_ocr_impl_intro_step2_description), BuildConfig.FLAVOR);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = getString(R.string.card_ocr_impl_intro_step2_description);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        int i3 = IAuthTabCallbackStub + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i4 = -1469660336;
        char c = '0';
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10 + 61;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 119;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 72, AndroidCharacter.getMirror(c) + 8800, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = -1469660336;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        long j = 0;
        if (iArr5 != null) {
            int i11 = $11 + 5;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr5[i13]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 71, 8848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i13++;
                int i14 = $10 + 65;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                i5 = 1;
                i6 = 0;
                j = 0;
            }
            i2 = i6;
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
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 40, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16773183) - Color.rgb(0, 0, 0)), 78 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i21 = $11 + 31;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i23 = $10 + 103;
        $11 = i23 % 128;
        int i24 = i23 % 2;
        objArr[0] = str;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueOcrIntroStep2Fragment cardIssueOcrIntroStep2Fragment) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{cardIssueOcrIntroStep2Fragment}, -458454212, 458454212, iOnNavigationEvent);
    }

    private final String asInterface() {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (String) onWarmupCompleted(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this}, -1662598682, 1662598683, iOnNavigationEvent);
    }

    static void onExtraCallback() {
        IAuthTabCallback = new int[]{-1126791755, 1539105836, -2093975672, 1344533457, -1851589040, -1489419719, -625231925, -1368942443, 1393231769, 1268932027, -321075320, 1303801738, 2074379980, -521917597, -124796626, 2100505791, -1654120811, 414207222};
    }
}
