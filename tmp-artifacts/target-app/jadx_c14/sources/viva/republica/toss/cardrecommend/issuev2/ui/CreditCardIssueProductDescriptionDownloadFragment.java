package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import im.toss.webview.TossWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_closeView;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DynamicLoader;
import o.IconRoundCornerProgressBar1;
import o.PBES2Parameters;
import o.PageContext;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.RippleNode;
import o.TypographyKtExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.checkCryptoState;
import o.createAdSizeApi;
import o.getCommitmentTypeId;
import o.getDigestAlgorithms;
import o.getProcessNameViaReflection;
import o.getTestDevicesList;
import o.preFillDefault;
import o.roundedRect;
import o.setBodyokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueProductDescriptionDownloadFragment extends CardIssueBaseFragment<PBES2Parameters> {
    private static int $10 = 0;
    private static int $11 = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static char asBinder = 0;
    private static int asInterface = 1;
    private static int getInterfaceDescriptor;
    private static char onExtraCallback;
    public static final int onNavigationEvent;
    private static char onTransact;
    private getCommitmentTypeId onExtraCallbackWithResult;
    private final PageContext onWarmupCompleted;

    static {
        onExtraCallback();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(CreditCardIssueProductDescriptionDownloadFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueDescriptionDownloadBinding;", 0)};
        onNavigationEvent = 8;
        int i = access100 + 79;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, DynamicLoader dynamicLoader, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditCardIssueProductDescriptionDownloadFragment, dynamicLoader, view);
        int i4 = asInterface + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -301533465, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 301533468, new Object[]{view, motionEvent}, iOnExtraCallbackWithResult)).booleanValue();
        int i4 = IAuthTabCallbackStub + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i5);
        int i9 = ~i2;
        int i10 = ~i5;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i6 | i5)) | (~(i7 | i9 | i10));
        int i13 = i2 + i5 + i3 + ((-1136091917) * i) + (376669458 * i4);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i2) + 1718550528 + ((-1748215485) * i5) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i3) + ((-2044854272) * i) + (41156608 * i4) + (1721171968 * i14);
        int i16 = ((i2 * (-924404593)) - 1636593565) + (i5 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i3 * (-924404175)) + (i * (-2083730301)) + (i4 * 182666354) + (i14 * (-51970048));
        int i17 = i15 + (i16 * i16 * (-653721600));
        if (i17 == 1) {
            final CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment = (CreditCardIssueProductDescriptionDownloadFragment) objArr[0];
            String str = (String) objArr[1];
            int i18 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            TdsBottomCtaV1View.setCta$default(creditCardIssueProductDescriptionDownloadFragment.onExtraCallbackWithResult(), str, new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueProductDescriptionDownloadFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreditCardIssueProductDescriptionDownloadFragment.onNavigationEvent(this.f$0, view);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            creditCardIssueProductDescriptionDownloadFragment.onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i19 = asInterface + 103;
            IAuthTabCallbackStub = i19 % 128;
            int i20 = i19 % 2;
            return unit;
        }
        if (i17 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 3) {
            return onNavigationEvent(objArr);
        }
        getProcessNameViaReflection getprocessnameviareflection = (getProcessNameViaReflection) objArr[0];
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[1];
        CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment2 = (CreditCardIssueProductDescriptionDownloadFragment) objArr[2];
        View view = (View) objArr[3];
        int i21 = 2 % 2;
        int i22 = asInterface + 35;
        IAuthTabCallbackStub = i22 % 128;
        int i23 = i22 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getprocessnameviareflection, tdsListRowV1View, creditCardIssueProductDescriptionDownloadFragment2, view);
        int i24 = IAuthTabCallbackStub + 81;
        asInterface = i24 % 128;
        int i25 = i24 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditCardIssueProductDescriptionDownloadFragment);
        int i4 = asInterface + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1252121661, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1252121662, new Object[]{creditCardIssueProductDescriptionDownloadFragment, str}, iOnExtraCallbackWithResult);
        int i4 = asInterface + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 213033347, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -213033345, new Object[]{creditCardIssueProductDescriptionDownloadFragment, view}, iOnExtraCallbackWithResult);
            int i3 = 66 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 213033347, iOnExtraCallbackWithResult4, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -213033345, new Object[]{creditCardIssueProductDescriptionDownloadFragment, view}, iOnExtraCallbackWithResult3);
        }
        int i4 = IAuthTabCallbackStub + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, getProcessNameViaReflection getprocessnameviareflection, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditCardIssueProductDescriptionDownloadFragment, getprocessnameviareflection, view);
        int i4 = asInterface + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ View IAuthTabCallback(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        View viewAsBinder = creditCardIssueProductDescriptionDownloadFragment.asBinder();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return viewAsBinder;
    }

    public CreditCardIssueProductDescriptionDownloadFragment() {
        super(R.layout.fragment_credit_card_issue_description_download);
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onExtraCallback);
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, checkCryptoState> {
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, checkCryptoState.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueDescriptionDownloadBinding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final checkCryptoState invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return checkCryptoState.IAuthTabCallback(view);
        }
    }

    private final checkCryptoState onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        checkCryptoState checkcryptostate = (checkCryptoState) this.onWarmupCompleted.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
        int i4 = IAuthTabCallbackStub + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return checkcryptostate;
    }

    private final LinearLayout IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = onWarmupCompleted().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int i4 = asInterface + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    private final TossWebView asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(onWarmupCompleted().onExtraCallback, "");
            throw null;
        }
        TossWebView tossWebView = onWarmupCompleted().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tossWebView, "");
        return tossWebView;
    }

    private final TdsBottomCtaV1View onExtraCallbackWithResult() {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            tdsBottomCtaV1View = onWarmupCompleted().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            int i3 = 34 / 0;
        } else {
            tdsBottomCtaV1View = onWarmupCompleted().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        }
        int i4 = asInterface + 57;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return tdsBottomCtaV1View;
    }

    private final View asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        View view = getView();
        if (view == null) {
            return null;
        }
        int i4 = IAuthTabCallbackStub + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        View viewFindViewById = view.findViewById(R.id.progress);
        int i6 = asInterface + 109;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return viewFindViewById;
    }

    private static final Unit onExtraCallback(getProcessNameViaReflection getprocessnameviareflection, TdsListRowV1View tdsListRowV1View, CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        getprocessnameviareflection.onExtraCallbackWithResult(!getprocessnameviareflection.onExtraCallbackWithResult());
        if (!getprocessnameviareflection.onExtraCallbackWithResult()) {
            tdsListRowV1View.setLeftImage(R.drawable.icon_check_circle_mono);
        } else {
            int i2 = asInterface + 69;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                tdsListRowV1View.setLeftImage(im.toss.core.R.drawable.icon_check_circle_blue);
                throw null;
            }
            tdsListRowV1View.setLeftImage(im.toss.core.R.drawable.icon_check_circle_blue);
        }
        creditCardIssueProductDescriptionDownloadFragment.onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 59;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, getProcessNameViaReflection getprocessnameviareflection, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            ReactNativeFeatureFlagsCxxInterop reactNativeFeatureFlagsCxxInterop = ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted;
            Context contextRequireContext = creditCardIssueProductDescriptionDownloadFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            reactNativeFeatureFlagsCxxInterop.onNavigationEvent(contextRequireContext, getprocessnameviareflection.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        ReactNativeFeatureFlagsCxxInterop reactNativeFeatureFlagsCxxInterop2 = ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted;
        Context contextRequireContext2 = creditCardIssueProductDescriptionDownloadFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        reactNativeFeatureFlagsCxxInterop2.onNavigationEvent(contextRequireContext2, getprocessnameviareflection.onNavigationEvent());
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 119;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static final class onNavigationEvent extends roundedRect {
        private final int IAuthTabCallback;
        private int onExtraCallbackWithResult;

        onNavigationEvent() {
            super((IconRoundCornerProgressBar1) null, 1, (DefaultConstructorMarker) null);
            this.IAuthTabCallback = 20;
        }

        public void onPageFinished(WebView webView, String str) {
            View viewIAuthTabCallback;
            String title;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageFinished(webView, str);
            if (this.onExtraCallbackWithResult < this.IAuthTabCallback && onExtraCallbackWithResult(str) && ((title = webView.getTitle()) == null || title.length() == 0)) {
                this.onExtraCallbackWithResult++;
                webView.reload();
                return;
            }
            this.onExtraCallbackWithResult = 0;
            View viewIAuthTabCallback2 = CreditCardIssueProductDescriptionDownloadFragment.IAuthTabCallback(CreditCardIssueProductDescriptionDownloadFragment.this);
            if (viewIAuthTabCallback2 == null || viewIAuthTabCallback2.getVisibility() != 0 || (viewIAuthTabCallback = CreditCardIssueProductDescriptionDownloadFragment.IAuthTabCallback(CreditCardIssueProductDescriptionDownloadFragment.this)) == null) {
                return;
            }
            viewIAuthTabCallback.setVisibility(8);
        }

        private final boolean onExtraCallbackWithResult(String str) {
            return StringsKt.contains$default(str, "docs.google.com/gview?embedded=true", false, 2, (Object) null);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 29;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), iLastIndexOf, iLastIndexOf2, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 10 - Color.green(0), (Process.myPid() >> 22) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    int i11 = $10 + 125;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getEdgeSlop() >> 16)), 14 - (Process.myPid() >> 22), (Process.myTid() >> 22) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        view.getParent().requestDisallowInterceptTouchEvent(true);
        int i4 = IAuthTabCallbackStub + 35;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static final Unit onNavigationEvent(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, DynamicLoader dynamicLoader, View view) {
        createAdSizeApi createadsizeapiOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        getDigestAlgorithms<PBES2Parameters> getdigestalgorithmsWriteTypedObject = creditCardIssueProductDescriptionDownloadFragment.writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueProductDescriptionDownloadFragment);
        DynamicLoader dynamicLoaderOnNavigationEvent = creditCardIssueProductDescriptionDownloadFragment.readTypedObject().onWarmupCompleted().onNavigationEvent();
        if (dynamicLoaderOnNavigationEvent != null) {
            int i2 = asInterface + 75;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                createadsizeapiOnWarmupCompleted = dynamicLoaderOnNavigationEvent.onWarmupCompleted();
                int i3 = 25 / 0;
            } else {
                createadsizeapiOnWarmupCompleted = dynamicLoaderOnNavigationEvent.onWarmupCompleted();
            }
            int i4 = IAuthTabCallbackStub + 65;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } else {
            createadsizeapiOnWarmupCompleted = null;
        }
        getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, createadsizeapiOnWarmupCompleted, creditCardIssueProductDescriptionDownloadFragment.extraCallback(), dynamicLoader.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment = (CreditCardIssueProductDescriptionDownloadFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            getCommitmentTypeId getcommitmenttypeid = creditCardIssueProductDescriptionDownloadFragment.onExtraCallbackWithResult;
            throw null;
        }
        getCommitmentTypeId getcommitmenttypeid2 = creditCardIssueProductDescriptionDownloadFragment.onExtraCallbackWithResult;
        if (getcommitmenttypeid2 != null) {
            getcommitmenttypeid2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueProductDescriptionDownloadFragment$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return CreditCardIssueProductDescriptionDownloadFragment.onExtraCallbackWithResult(this.f$0);
                }
            });
            int i3 = asInterface + 85;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 3;
            }
        }
        int i5 = asInterface + 97;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        getDigestAlgorithms<PBES2Parameters> getdigestalgorithmsWriteTypedObject = creditCardIssueProductDescriptionDownloadFragment.writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueProductDescriptionDownloadFragment);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = creditCardIssueProductDescriptionDownloadFragment.extraCallback();
        String str = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().format(zzaj.onWarmupCompleted().asBinder());
        Intrinsics.checkNotNullExpressionValue(str, "");
        getTestDevicesList gettestdeviceslist = new getTestDevicesList(str);
        createAdSizeApi createadsizeapiOnWarmupCompleted = creditCardIssueProductDescriptionDownloadFragment.readTypedObject().onWarmupCompleted().onExtraCallback().onWarmupCompleted();
        Object obj = null;
        if (createadsizeapiOnWarmupCompleted != null) {
            int i2 = IAuthTabCallbackStub + 59;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                createadsizeapiOnWarmupCompleted.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            strIAuthTabCallback = createadsizeapiOnWarmupCompleted.IAuthTabCallback();
        } else {
            strIAuthTabCallback = null;
        }
        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, gettestdeviceslist, strIAuthTabCallback, creditCardIssueProductDescriptionDownloadFragment.readTypedObject().onWarmupCompleted().onExtraCallback().onNavigationEvent(), (Map) null, 32, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 119;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        List<getProcessNameViaReflection> listOnTransact = readTypedObject().onTransact();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnTransact, 10));
        Iterator<T> it = listOnTransact.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallbackStub + 103;
            asInterface = i2 % 128;
            ((getProcessNameViaReflection) (i2 % 2 == 0 ? it.next() : it.next())).onExtraCallbackWithResult(true);
            arrayList.add(Unit.INSTANCE);
        }
        LinearLayout linearLayoutIAuthTabCallback = IAuthTabCallback();
        Context context = linearLayoutIAuthTabCallback.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics = tdsTopV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsTopV1View, varyMatches.onNavigationEvent(10, displayMetrics));
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(readTypedObject().writeTypedObject());
        String strAsInterface = readTypedObject().asInterface();
        Object obj = null;
        if (strAsInterface != null) {
            int i3 = asInterface + 97;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP6);
                tdsTopV1View.setLowerText(strAsInterface);
                obj.hashCode();
                throw null;
            }
            tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP6);
            tdsTopV1View.setLowerText(strAsInterface);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayoutIAuthTabCallback, tdsTopV1View);
        DisplayMetrics displayMetrics2 = linearLayoutIAuthTabCallback.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(linearLayoutIAuthTabCallback, varyMatches.onNavigationEvent(16, displayMetrics2));
        int i4 = asInterface + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        for (final getProcessNameViaReflection getprocessnameviareflection : readTypedObject().onTransact()) {
            Context context2 = linearLayoutIAuthTabCallback.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            final TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context2, (AttributeSet) null, 0, false, 6, (DefaultConstructorMarker) null);
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            DisplayMetrics displayMetrics3 = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics3);
            DisplayMetrics displayMetrics4 = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics4));
            if (readTypedObject().onTransact().size() > 1) {
                ViewGroup.LayoutParams layoutParams = tdsListRowV1View.getLayoutParams();
                DisplayMetrics displayMetrics5 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                layoutParams.height = varyMatches.onNavigationEvent(Float.valueOf(48.0f), displayMetrics5);
                DisplayMetrics displayMetrics6 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsListRowV1View, varyMatches.onNavigationEvent(12, displayMetrics6));
                tdsListRowV1View.setLeftImage(im.toss.core.R.drawable.icon_check_circle_blue);
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{tdsListRowV1View, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueProductDescriptionDownloadFragment$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj2) {
                        Object[] objArr = {getprocessnameviareflection, tdsListRowV1View, this, (View) obj2};
                        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                        return (Unit) CreditCardIssueProductDescriptionDownloadFragment.onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -606966113, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 606966113, objArr, iOnExtraCallbackWithResult);
                    }
                }}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
            } else {
                tdsListRowV1View.setLeftImage(R.drawable.icon_document_lines);
                DisplayMetrics displayMetrics7 = tdsListRowV1View.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsListRowV1View, varyMatches.onNavigationEvent(8, displayMetrics7));
            }
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
            tdsListRowV1View.setCenterText1(getprocessnameviareflection.onExtraCallback());
            tdsListRowV1View.setCenterText1Color(setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy());
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.BUTTON);
            tdsListRowV1View.setRightButtonLabel(getString(R.string.menu_save));
            tdsListRowV1View.setRightButtonTheme(new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.SMALL, (TdsButtonV1View.IAuthTabCallback) null, 8, (DefaultConstructorMarker) null));
            tdsListRowV1View.setRightOnButtonClickListener(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueProductDescriptionDownloadFragment$$ExternalSyntheticLambda3
                public final Object invoke(Object obj2) {
                    return CreditCardIssueProductDescriptionDownloadFragment.onWarmupCompleted(this.f$0, getprocessnameviareflection, (View) obj2);
                }
            });
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayoutIAuthTabCallback, tdsListRowV1View);
        }
        WebSettings settings = asInterface().getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        asInterface().setWebViewClient(new onNavigationEvent());
        TossWebView tossWebViewAsInterface = asInterface();
        String strIAuthTabCallbackStub = readTypedObject().IAuthTabCallbackStub();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{41038, 24195, 53462, 12732, 53650, 11688, 63175, 17728, 40301, 10074, 36305, 23314, 44608, 16290, 30106, 7017, 33582, 63621, 19930, 43592, 42731, 29956, 35374, 9885, 30360, 44464, 63838, 3766, 17294, 32984, 44837, 36282, 61260, 40163, 39435, 61632, 62132, 32789, 45456, 11137, 49700, 13504, 46110, 158, 37601, 57101, 54677, 25518}, Color.rgb(0, 0, 0) + 16777264, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strIAuthTabCallbackStub);
        tossWebViewAsInterface.loadUrl(sb.toString());
        asInterface().setBackgroundColor(setBodyokhttp.onExtraCallback(this).extraCallback());
        asInterface().setOnTouchListener(new View.OnTouchListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueProductDescriptionDownloadFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return CreditCardIssueProductDescriptionDownloadFragment.onExtraCallback(view2, motionEvent);
            }
        });
        final DynamicLoader dynamicLoaderOnNavigationEvent = readTypedObject().onWarmupCompleted().onNavigationEvent();
        if (dynamicLoaderOnNavigationEvent != null) {
            TdsBottomCtaV1View.setSecondary$default(onExtraCallbackWithResult(), dynamicLoaderOnNavigationEvent.onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueProductDescriptionDownloadFragment$$ExternalSyntheticLambda5
                public final Object invoke(Object obj2) {
                    return CreditCardIssueProductDescriptionDownloadFragment.IAuthTabCallback(this.f$0, dynamicLoaderOnNavigationEvent, (View) obj2);
                }
            }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
            int i6 = IAuthTabCallbackStub + 67;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }
        NestedScrollView nestedScrollView = onWarmupCompleted().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        getCommitmentTypeId getcommitmenttypeid = new getCommitmentTypeId(nestedScrollView, readTypedObject().access000(), readTypedObject().onExtraCallbackWithResult(), readTypedObject().onWarmupCompleted().onExtraCallback().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueProductDescriptionDownloadFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj2) {
                return CreditCardIssueProductDescriptionDownloadFragment.onNavigationEvent(this.f$0, (String) obj2);
            }
        });
        getcommitmenttypeid.onWarmupCompleted();
        this.onExtraCallbackWithResult = getcommitmenttypeid;
        onNavigationEvent();
        int i8 = asInterface + 53;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        getCommitmentTypeId getcommitmenttypeid = this.onExtraCallbackWithResult;
        if (getcommitmenttypeid != null) {
            int i5 = i3 + 37;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            getcommitmenttypeid.onExtraCallbackWithResult();
        }
        this.onExtraCallbackWithResult = null;
        super.onDestroyView();
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = readTypedObject().onTransact() instanceof Collection;
            obj.hashCode();
            throw null;
        }
        List<getProcessNameViaReflection> listOnTransact = readTypedObject().onTransact();
        boolean z2 = true;
        if (!(listOnTransact instanceof Collection) || !listOnTransact.isEmpty()) {
            Iterator<T> it = listOnTransact.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i3 = asInterface + 71;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    ((getProcessNameViaReflection) it.next()).onExtraCallbackWithResult();
                    throw null;
                }
                if (!((getProcessNameViaReflection) it.next()).onExtraCallbackWithResult()) {
                    z2 = false;
                    break;
                }
            }
        } else {
            int i4 = IAuthTabCallbackStub + 7;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        onExtraCallbackWithResult().setEnabledCta(z2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getProcessNameViaReflection getprocessnameviareflection, TdsListRowV1View tdsListRowV1View, CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, View view) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -606966113, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 606966113, new Object[]{getprocessnameviareflection, tdsListRowV1View, creditCardIssueProductDescriptionDownloadFragment, view}, iOnExtraCallbackWithResult);
    }

    private static final boolean onExtraCallbackWithResult(View view, MotionEvent motionEvent) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -301533465, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 301533468, new Object[]{view, motionEvent}, iOnExtraCallbackWithResult)).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, String str) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1252121661, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1252121662, new Object[]{creditCardIssueProductDescriptionDownloadFragment, str}, iOnExtraCallbackWithResult);
    }

    private static final void IAuthTabCallback(CreditCardIssueProductDescriptionDownloadFragment creditCardIssueProductDescriptionDownloadFragment, View view) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 213033347, iOnExtraCallbackWithResult2, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -213033345, new Object[]{creditCardIssueProductDescriptionDownloadFragment, view}, iOnExtraCallbackWithResult);
    }

    static void onExtraCallback() {
        onExtraCallback = (char) 23391;
        asBinder = (char) 27741;
        IAuthTabCallbackDefault = (char) 9759;
        onTransact = (char) 1331;
    }
}
