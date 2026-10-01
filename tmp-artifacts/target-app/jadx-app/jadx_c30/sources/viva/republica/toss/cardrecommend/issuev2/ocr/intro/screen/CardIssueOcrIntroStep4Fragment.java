package viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cache;
import o.ConvertByteArrayToFloatArray;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PageRenderReadyListener;
import o.SetDetectableSize;
import o.TSA_VerifyTimeStampToken;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.addAllCommandLine;
import o.authenticate;
import o.findResAndMsg;
import o.getCreatorConstructor;
import o.getUnauthenticatedAttributes;
import o.isFireOS;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.setRandomHost;
import o.setRubIn;
import o.varyMatches;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueOcrIntroStep4Fragment extends Hilt_CardIssueOcrIntroStep4Fragment {
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int access000;
    private static byte[] asBinder;
    private static int asInterface;
    private static short[] getInterfaceDescriptor;
    public static final int onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private final PageRenderReadyListener IAuthTabCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Lazy onTransact;
    private static final byte[] $$a = {46, ISOFileInfo.A1, 11, -87};
    private static final int $$b = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[getCreatorConstructor.values().length];
            try {
                iArr[getCreatorConstructor.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            IAuthTabCallback = iArr;
        }
    }

    private static String $$c(byte b, byte b2, short s) {
        byte[] bArr = $$a;
        int i = s * 2;
        int i2 = 115 - (b * 4);
        int i3 = 3 - (b2 * 3);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = i + i2;
        }
        while (true) {
            i4++;
            i3++;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
        }
    }

    static {
        access000 = 0;
        onExtraCallbackWithResult();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueOcrIntroStep4Fragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueOcrImplOcrIntroStep4Binding;", 0)};
        onExtraCallback = 8;
        int i = access100 + 117;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment = (CardIssueOcrIntroStep4Fragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(cardIssueOcrIntroStep4Fragment, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueOcrIntroStep4Fragment, setDetectableSize);
        int i3 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ String IAuthTabCallback(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(cardIssueOcrIntroStep4Fragment);
        int i4 = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, AuthenticatorCompanion.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 242225111, -242225109, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueOcrIntroStep4Fragment, onextracallbackwithresult}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnTransact = onTransact(cardIssueOcrIntroStep4Fragment);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return strOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, cardIssueOcrIntroStep4Fragment, view);
        int i4 = IAuthTabCallbackStubProxy + 11;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, AuthenticatorCompanion.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueOcrIntroStep4Fragment, onwarmupcompleted);
        int i4 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i2 | i3);
        int i11 = i9 | i10 | (~(i2 | i));
        int i12 = i8 | i2;
        int i13 = (~((~i) | i2)) | i10;
        int i14 = i2 + i3 + i4 + (111814883 * i5) + (1975835455 * i6);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i2) - 1583611904) + (47848387 * i3) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i4) + ((-648806400) * i5) + (1432616960 * i6) + (442957824 * i15);
        int i17 = ((i2 * 961080817) - 60187382) + (i3 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i4 * 961079685) + (i5 * 1618335983) + (i6 * 193609403) + (i15 * 1988296704);
        int i18 = i16 + (i17 * i17 * 176226304);
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 == 3) {
            return onNavigationEvent(objArr);
        }
        CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment = (CardIssueOcrIntroStep4Fragment) objArr[0];
        int i19 = 2 % 2;
        int i20 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i20 % 128;
        int i21 = i20 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cardIssueOcrIntroStep4Fragment);
        int i22 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i22 % 128;
        int i23 = i22 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return 1473797L;
        }
        throw null;
    }

    public static final /* synthetic */ CardIssueOcrIntroV2ViewModel onExtraCallbackWithResult(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return cardIssueOcrIntroStep4Fragment.onNavigationEvent();
        }
        cardIssueOcrIntroStep4Fragment.onNavigationEvent();
        throw null;
    }

    public static final /* synthetic */ TSA_VerifyTimeStampToken onWarmupCompleted(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return cardIssueOcrIntroStep4Fragment.asBinder();
        }
        cardIssueOcrIntroStep4Fragment.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CardIssueOcrIntroStep4Fragment() {
        super(R.layout.fragment_card_issue_ocr_impl_ocr_intro_step4);
        this.IAuthTabCallback = preFillDefault.IAuthTabCallback(this, onNavigationEvent.onNavigationEvent);
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$$ExternalSyntheticLambda0
            public final Object invoke() {
                return CardIssueOcrIntroStep4Fragment.IAuthTabCallback(this.f$0);
            }
        });
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$$ExternalSyntheticLambda1
            public final Object invoke() {
                return CardIssueOcrIntroStep4Fragment.onExtraCallback(this.f$0);
            }
        });
        this.onNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOcrIntroV2ViewModel.class), new onExtraCallbackWithResult(this), new onExtraCallback(null, this), new asBinder(this));
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, TSA_VerifyTimeStampToken> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        onNavigationEvent() {
            super(1, TSA_VerifyTimeStampToken.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueOcrImplOcrIntroStep4Binding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final TSA_VerifyTimeStampToken invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return TSA_VerifyTimeStampToken.onExtraCallbackWithResult(view);
        }
    }

    private final TSA_VerifyTimeStampToken asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        return (TSA_VerifyTimeStampToken) this.IAuthTabCallback.onNavigationEvent(this, i2 % 2 != 0 ? onWarmupCompleted[1] : onWarmupCompleted[0]);
    }

    private final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onTransact.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String IAuthTabCallbackStub(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String string = cardIssueOcrIntroStep4Fragment.getString(R.string.card_ocr_impl_ocr_impl_intro_step4_title, new Object[]{cardIssueOcrIntroStep4Fragment.onExtraCallbackWithResult(cardIssueOcrIntroStep4Fragment.onNavigationEvent().onExtraCallback())});
        int i4 = IAuthTabCallbackStubProxy + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onExtraCallbackWithResult.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final String onTransact(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.string.card_ocr_impl_ocr_intro_step4_cta_title;
        if (i3 != 0) {
            return cardIssueOcrIntroStep4Fragment.getString(i4);
        }
        cardIssueOcrIntroStep4Fragment.getString(i4);
        throw null;
    }

    private final CardIssueOcrIntroV2ViewModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOcrIntroV2ViewModel cardIssueOcrIntroV2ViewModel = (CardIssueOcrIntroV2ViewModel) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return cardIssueOcrIntroV2ViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        cardIssueOcrIntroStep4Fragment.onNavigationEvent().IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1220741976, -1220741973, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$$ExternalSyntheticLambda5
            public final Object invoke() {
                return (Unit) CardIssueOcrIntroStep4Fragment.onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1990728825, -1990728825, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.f$0}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            }
        }}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, BuildConfig.FLAVOR);
        onExtraCallback((findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner));
        int i2 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment = (CardIssueOcrIntroStep4Fragment) objArr[0];
        final Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TSA_VerifyTimeStampToken tSA_VerifyTimeStampTokenAsBinder = cardIssueOcrIntroStep4Fragment.asBinder();
        if (tSA_VerifyTimeStampTokenAsBinder == null) {
            return null;
        }
        View view = tSA_VerifyTimeStampTokenAsBinder.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(view, BuildConfig.FLAVOR);
        isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{view, AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.LEFT, AuthenticatorCompanionAuthenticatorNone.SLOW, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return CardIssueOcrIntroStep4Fragment.onExtraCallback(this.f$0, (AuthenticatorCompanion.onWarmupCompleted) obj);
            }
        }, 8, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
        AnimateText animateText = tSA_VerifyTimeStampTokenAsBinder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(animateText, BuildConfig.FLAVOR);
        getUnauthenticatedAttributes.onWarmupCompleted(animateText, cardIssueOcrIntroStep4Fragment.onTransact());
        TdsBottomCtaV1View tdsBottomCtaV1View = tSA_VerifyTimeStampTokenAsBinder.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, BuildConfig.FLAVOR);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, cardIssueOcrIntroStep4Fragment.IAuthTabCallbackDefault(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return CardIssueOcrIntroStep4Fragment.onExtraCallback(function0, cardIssueOcrIntroStep4Fragment, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment = (CardIssueOcrIntroStep4Fragment) objArr[0];
        AuthenticatorCompanion.onExtraCallbackWithResult onextracallbackwithresult = (AuthenticatorCompanion.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullExpressionValue(cardIssueOcrIntroStep4Fragment.getResources().getDisplayMetrics(), BuildConfig.FLAVOR);
        onextracallbackwithresult.onExtraCallback(varyMatches.onNavigationEvent(100, r0));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(final CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, AuthenticatorCompanion.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, BuildConfig.FLAVOR);
        onwarmupcompleted.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CardIssueOcrIntroStep4Fragment.IAuthTabCallback(this.f$0, (AuthenticatorCompanion.onExtraCallbackWithResult) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2ActivityRequireActivity = cardIssueOcrIntroStep4Fragment.requireActivity();
        if (cardIssueOcrIntroV2ActivityRequireActivity instanceof CardIssueOcrIntroV2Activity) {
            int i4 = IAuthTabCallback_Parcel + 117;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            cardIssueOcrIntroV2Activity = cardIssueOcrIntroV2ActivityRequireActivity;
        } else {
            cardIssueOcrIntroV2Activity = null;
        }
        setDetectableSize.onExtraCallback(cardIssueOcrIntroV2Activity != null ? cardIssueOcrIntroV2Activity.onWarmupCompleted("intro_end") : null);
        Object[] objArr = new Object[1];
        a((short) ((-13) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (byte) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 112), 731654393 - Drawable.resolveOpacity(0, 0), 472042538 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (-43) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueOcrIntroStep4Fragment.IAuthTabCallbackDefault());
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, final CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return (Unit) CardIssueOcrIntroStep4Fragment.onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -434354424, 434354425, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.f$0, (SetDetectableSize) obj}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            }
        }, 14, (Object) null);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueOcrIntroStep4Fragment.this.new IAuthTabCallback(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$IAuthTabCallback$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            int label;
            final /* synthetic */ CardIssueOcrIntroStep4Fragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = cardIssueOcrIntroStep4Fragment;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass2(this.this$0, access13800Var);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep4Fragment$IAuthTabCallback$2$2, reason: invalid class name and collision with other inner class name */
            static final class C00132 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ CardIssueOcrIntroStep4Fragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00132(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, access13800<? super C00132> access13800Var) {
                    super(2, access13800Var);
                    this.this$0 = cardIssueOcrIntroStep4Fragment;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    C00132 c00132 = new C00132(this.this$0, access13800Var);
                    c00132.Z$0 = ((Boolean) obj).booleanValue();
                    return c00132;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return onExtraCallbackWithResult(((Boolean) obj).booleanValue(), (access13800) obj2);
                }

                public final Object onExtraCallbackWithResult(boolean z, access13800<? super Unit> access13800Var) {
                    return create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    TdsBottomCtaV1View tdsBottomCtaV1View;
                    TdsButtonV1View tdsButtonV1ViewAsInterface;
                    boolean z = this.Z$0;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    TSA_VerifyTimeStampToken tSA_VerifyTimeStampTokenOnWarmupCompleted = CardIssueOcrIntroStep4Fragment.onWarmupCompleted(this.this$0);
                    if (tSA_VerifyTimeStampTokenOnWarmupCompleted != null && (tdsBottomCtaV1View = tSA_VerifyTimeStampTokenOnWarmupCompleted.IAuthTabCallback) != null && (tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface()) != null) {
                        tdsButtonV1ViewAsInterface.setLoading(z);
                    }
                    return Unit.INSTANCE;
                }
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setRubIn setrubinAsBinder = CardIssueOcrIntroStep4Fragment.onExtraCallbackWithResult(this.this$0).asBinder();
                    C00132 c00132 = new C00132(this.this$0, null);
                    this.label = 1;
                    if (ycxycx.onWarmupCompleted(setrubinAsBinder, c00132, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment = CardIssueOcrIntroStep4Fragment.this;
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cardIssueOcrIntroStep4Fragment, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.onExtraCallback(cardIssueOcrIntroStep4Fragment, onextracallback, anonymousClass2, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(findResAndMsg findresandmsg) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    public Map<String, Object> getScreenParams() {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOcrIntroV2Activity activity = getActivity();
        if (activity instanceof CardIssueOcrIntroV2Activity) {
            cardIssueOcrIntroV2Activity = activity;
            int i4 = IAuthTabCallback_Parcel + 25;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            }
        } else {
            cardIssueOcrIntroV2Activity = null;
        }
        if (cardIssueOcrIntroV2Activity == null) {
            return null;
        }
        int i6 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return cardIssueOcrIntroV2Activity.onWarmupCompleted("intro_end");
        }
        cardIssueOcrIntroV2Activity.onWarmupCompleted("intro_end");
        throw null;
    }

    private final String onExtraCallbackWithResult(getCreatorConstructor getcreatorconstructor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0 ? onWarmupCompleted.IAuthTabCallback[getcreatorconstructor.ordinal()] == 1 : onWarmupCompleted.IAuthTabCallback[getcreatorconstructor.ordinal()] == 0) {
            String string = getString(viva.republica.toss.R.string.card_ocr_impl_ocr_identity_document_type_passport);
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            int i3 = IAuthTabCallback_Parcel + 111;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }
        String string2 = getString(viva.republica.toss.R.string.card_ocr_impl_ocr_identity_document_type_id_card);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        return string2;
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function0 function0, Fragment fragment) {
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

    public static final class asBinder extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Fragment fragment) {
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

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackDefault)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            float f = 0.0f;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43423), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22440 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10;
                int i9 = i8 + 21;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i8 + 19;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 3 / 5;
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i13 = $11 + 121;
                int i14 = i13 % 128;
                $10 = i14;
                if (i13 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = asBinder;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i15 = i14 + 25;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = 0;
                    while (i17 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i17])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 12843), KeyEvent.normalizeMetaState(0) + 55, 2167 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i17] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i17++;
                        f = 0.0f;
                    }
                    int i18 = $11 + 83;
                    $10 = i18 % 128;
                    i6 = 2;
                    int i19 = i18 % 2;
                    bArr = bArr2;
                } else {
                    i6 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asBinder;
                    Object[] objArr4 = new Object[i6];
                    objArr4[1] = Integer.valueOf(asInterface);
                    objArr4[0] = Integer.valueOf(i);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 42, 22439 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (getInterfaceDescriptor[i + ((int) (asInterface ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i20 = ((i + iIntValue) - 2) + ((int) (asInterface ^ (-4629411779493505016L)));
                if (z) {
                    int i21 = $11 + 27;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i20 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackStub), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 86 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = asBinder;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i23 = 0; i23 < length2; i23++) {
                        bArr5[i23] = (byte) (bArr4[i23] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        int i24 = $11 + 117;
                        $10 = i24 % 128;
                        if (i24 % 2 != 0) {
                            byte[] bArr6 = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent << 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback * (((byte) (((byte) (bArr6[r8] / (-4629411779493505016L))) * s)) ^ b);
                        } else {
                            byte[] bArr7 = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = getInterfaceDescriptor;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment) {
        return (Unit) onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1990728825, -1990728825, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueOcrIntroStep4Fragment}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, SetDetectableSize setDetectableSize) {
        return (Unit) onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -434354424, 434354425, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueOcrIntroStep4Fragment, setDetectableSize}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void IAuthTabCallback(Function0<Unit> function0) {
        onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1220741976, -1220741973, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, function0}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(CardIssueOcrIntroStep4Fragment cardIssueOcrIntroStep4Fragment, AuthenticatorCompanion.onExtraCallbackWithResult onextracallbackwithresult) {
        return (Unit) onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 242225111, -242225109, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{cardIssueOcrIntroStep4Fragment, onextracallbackwithresult}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    static void onExtraCallbackWithResult() {
        asInterface = 1881411343;
        IAuthTabCallbackDefault = -1538795464;
        IAuthTabCallbackStub = 1201335362;
        asBinder = new byte[]{-98, -99, ISOFileInfo.DATA_BYTES1, -102, 8};
    }
}
