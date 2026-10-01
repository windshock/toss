package viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;
import java.lang.reflect.Method;
import java.util.Arrays;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PKCS12_MakePFX_WINS;
import o.PageRenderReadyListener;
import o.PlayerErrorCode;
import o.RippleNode;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.addAllCommandLine;
import o.findResAndMsg;
import o.formatMsgs;
import o.getCreatorConstructor;
import o.getPackageType;
import o.getUnauthenticatedAttributes;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.setRandomHost;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel;
import viva.republica.toss.widget.LottiePlayCountAnimationView;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueOcrIntroStep1Fragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static char[] asBinder = null;
    private static int asInterface = 0;
    public static final int onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult;
    private static int onTransact = 1;
    private getPackageType IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy onNavigationEvent;
    private final PageRenderReadyListener onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
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

    static {
        onWarmupCompleted();
        onExtraCallbackWithResult = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueOcrIntroStep1Fragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueOcrImplOcrIntroStep1Binding;", 0)};
        onExtraCallback = 8;
        int i = asInterface + 63;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = ~(i4 | i3);
        int i11 = i9 | i10;
        int i12 = ~i5;
        int i13 = (~(i12 | i3)) | (~(i12 | i4)) | i10;
        int i14 = (~(i7 | i3)) | (~(i8 | i4));
        int i15 = i4 + i3 + i2 + (1040777104 * i) + ((-1861505373) * i6);
        int i16 = i15 * i15;
        int i17 = (i4 * (-1036928585)) + 527892480 + ((-1036928585) * i3) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i2) + (1608515584 * i) + ((-1123418112) * i6) + ((-2114519040) * i16);
        int i18 = (i4 * 1703033811) + 1712528133 + (i3 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i2 * 1703034565) + (i * (-2114876976)) + (i6 * 1880022383) + (i16 * (-720175104));
        if (i17 + (i18 * i18 * (-739180544)) != 1) {
            return onExtraCallback(objArr);
        }
        CardIssueOcrIntroStep1Fragment cardIssueOcrIntroStep1Fragment = (CardIssueOcrIntroStep1Fragment) objArr[0];
        int i19 = 2 % 2;
        int i20 = onTransact + 39;
        IAuthTabCallbackStub = i20 % 128;
        return (PKCS12_MakePFX_WINS) (i20 % 2 != 0 ? cardIssueOcrIntroStep1Fragment.onWarmupCompleted.onNavigationEvent(cardIssueOcrIntroStep1Fragment, onExtraCallbackWithResult[1]) : cardIssueOcrIntroStep1Fragment.onWarmupCompleted.onNavigationEvent(cardIssueOcrIntroStep1Fragment, onExtraCallbackWithResult[0]));
    }

    public static /* synthetic */ String onExtraCallbackWithResult(CardIssueOcrIntroStep1Fragment cardIssueOcrIntroStep1Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(cardIssueOcrIntroStep1Fragment);
        int i4 = onTransact + 63;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return strOnNavigationEvent;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return 1473797L;
        }
        throw null;
    }

    public CardIssueOcrIntroStep1Fragment() {
        super(R.layout.fragment_card_issue_ocr_impl_ocr_intro_step1);
        this.onWarmupCompleted = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.onWarmupCompleted);
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep1Fragment$$ExternalSyntheticLambda0
            public final Object invoke() {
                return CardIssueOcrIntroStep1Fragment.onExtraCallbackWithResult(this.f$0);
            }
        });
        this.onNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOcrIntroV2ViewModel.class), new onNavigationEvent(this), new onWarmupCompleted(null, this), new onTransact(this));
    }

    public static final /* synthetic */ void IAuthTabCallback(CardIssueOcrIntroStep1Fragment cardIssueOcrIntroStep1Fragment) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        cardIssueOcrIntroStep1Fragment.onTransact();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CardIssueOcrIntroStep1Fragment cardIssueOcrIntroStep1Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -795855881, 795855881, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{cardIssueOcrIntroStep1Fragment});
            return;
        }
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = setVisitUrl.onExtraCallbackWithResult();
        IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, -795855881, 795855881, iOnExtraCallbackWithResult3, setVisitUrl.onExtraCallbackWithResult(), new Object[]{cardIssueOcrIntroStep1Fragment});
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, PKCS12_MakePFX_WINS> {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, PKCS12_MakePFX_WINS.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueOcrImplOcrIntroStep1Binding;", 0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final PKCS12_MakePFX_WINS invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return PKCS12_MakePFX_WINS.IAuthTabCallback(view);
        }
    }

    private final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackDefault.getValue();
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onNavigationEvent(CardIssueOcrIntroStep1Fragment cardIssueOcrIntroStep1Fragment) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = cardIssueOcrIntroStep1Fragment.getString(R.string.card_ocr_impl_intro_step1_title);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        String str = String.format(string, Arrays.copyOf(new Object[]{PlayerErrorCode.onPostMessage(), cardIssueOcrIntroStep1Fragment.onExtraCallbackWithResult(cardIssueOcrIntroStep1Fragment.onNavigationEvent().onExtraCallback())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, BuildConfig.FLAVOR);
        int i4 = onTransact + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final CardIssueOcrIntroV2ViewModel onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOcrIntroV2ViewModel cardIssueOcrIntroV2ViewModel = (CardIssueOcrIntroV2ViewModel) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackStub + 15;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return cardIssueOcrIntroV2ViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueOcrIntroStep1Fragment.this.new IAuthTabCallback(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CardIssueOcrIntroStep1Fragment.onWarmupCompleted(CardIssueOcrIntroStep1Fragment.this);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(3000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            CardIssueOcrIntroStep1Fragment.IAuthTabCallback(CardIssueOcrIntroStep1Fragment.this);
            return Unit.INSTANCE;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        this.IAuthTabCallback = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.step2_fragment);
        int i4 = onTransact + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        CardIssueOcrIntroStep1Fragment cardIssueOcrIntroStep1Fragment = (CardIssueOcrIntroStep1Fragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        PKCS12_MakePFX_WINS pKCS12_MakePFX_WINS = (PKCS12_MakePFX_WINS) IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1772209069, -1772209068, iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult(), new Object[]{cardIssueOcrIntroStep1Fragment});
        if (pKCS12_MakePFX_WINS != null) {
            int i3 = IAuthTabCallbackStub + 41;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                cardIssueOcrIntroStep1Fragment.onNavigationEvent(cardIssueOcrIntroStep1Fragment.IAuthTabCallback());
                throw null;
            }
            String strIAuthTabCallback = cardIssueOcrIntroStep1Fragment.IAuthTabCallback();
            if (!cardIssueOcrIntroStep1Fragment.onNavigationEvent(strIAuthTabCallback)) {
                LottiePlayCountAnimationView lottiePlayCountAnimationView = pKCS12_MakePFX_WINS.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(lottiePlayCountAnimationView, BuildConfig.FLAVOR);
                lottiePlayCountAnimationView.setVisibility(8);
                TdsImageView tdsImageView = pKCS12_MakePFX_WINS.onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
                tdsImageView.setVisibility(0);
                TdsImageView tdsImageView2 = pKCS12_MakePFX_WINS.onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, BuildConfig.FLAVOR);
                TdsImageView.setImage$default(tdsImageView2, strIAuthTabCallback, (Function1) null, (Function1) null, 6, (Object) null);
            } else {
                LottiePlayCountAnimationView lottiePlayCountAnimationView2 = pKCS12_MakePFX_WINS.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(lottiePlayCountAnimationView2, BuildConfig.FLAVOR);
                lottiePlayCountAnimationView2.setVisibility(0);
                TdsImageView tdsImageView3 = pKCS12_MakePFX_WINS.onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(tdsImageView3, BuildConfig.FLAVOR);
                tdsImageView3.setVisibility(8);
                pKCS12_MakePFX_WINS.onExtraCallback.setAnimationFromUrl(strIAuthTabCallback);
                int i4 = IAuthTabCallbackStub + 99;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            AnimateText animateText = pKCS12_MakePFX_WINS.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(animateText, BuildConfig.FLAVOR);
            getUnauthenticatedAttributes.onWarmupCompleted(animateText, cardIssueOcrIntroStep1Fragment.onExtraCallbackWithResult());
            LottiePlayCountAnimationView lottiePlayCountAnimationView3 = pKCS12_MakePFX_WINS.IAuthTabCallback;
            Object[] objArr2 = new Object[1];
            a(new int[]{162, 70, ISO7816.TAG_SM_ENCRYPTED_DATA_WITH_PADDING_INDICATOR, 6}, true, new byte[]{1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0}, objArr2);
            lottiePlayCountAnimationView3.setAnimationFromUrl(((String) objArr2[0]).intern());
        }
        return null;
    }

    public Map<String, Object> getScreenParams() {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity;
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOcrIntroV2Activity activity = getActivity();
        if (activity instanceof CardIssueOcrIntroV2Activity) {
            int i4 = onTransact + 83;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            cardIssueOcrIntroV2Activity = activity;
        } else {
            int i6 = onTransact + 57;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            cardIssueOcrIntroV2Activity = null;
        }
        if (cardIssueOcrIntroV2Activity == null) {
            return null;
        }
        int i8 = onTransact + 109;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        Map<String, Object> mapOnWarmupCompleted = cardIssueOcrIntroV2Activity.onWarmupCompleted("intro_start");
        if (i9 != 0) {
            int i10 = 31 / 0;
        }
        return mapOnWarmupCompleted;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
            if (this.IAuthTabCallback == null || !(!r1.onExtraCallback())) {
                return;
            }
            int i3 = onTransact + 53;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            onTransact();
            if (i4 != 0) {
                int i5 = 37 / 0;
                return;
            }
            return;
        }
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        return ((java.lang.String) r2[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (o.addExtra.onExtraCallback(o.PlayerErrorCode.onWarmupCompleted) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep1Fragment.IAuthTabCallbackStub + 3;
        viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep1Fragment.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r3 = new java.lang.Object[1];
        a(new int[]{56, 53, 0, 0}, false, new byte[]{0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, r3);
        r1 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r5 = new java.lang.Object[1];
        a(new int[]{56, 53, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, r5);
        r1 = r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r1 = ((java.lang.String) r1).intern();
        r2 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep1Fragment.onTransact + 97;
        viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep1Fragment.IAuthTabCallbackStub = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r2 = new java.lang.Object[1];
        a(new int[]{109, 53, 0, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1}, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        return ((java.lang.String) r2[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (onNavigationEvent().onExtraCallback() == o.getCreatorConstructor.PASSPORT) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (onNavigationEvent().onExtraCallback() == o.getCreatorConstructor.PASSPORT) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep1Fragment.IAuthTabCallbackStub + 69;
        viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep1Fragment.onTransact = r1 % 128;
        r1 = r1 % 2;
        r2 = new java.lang.Object[1];
        a(new int[]{0, 56, 0, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1}, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
    }

    private final boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackStub = i2 % 128;
        return i2 % 2 != 0 ? StringsKt.endsWith$default(str, ".json", true, 5, (Object) null) : StringsKt.endsWith$default(str, ".json", false, 2, (Object) null);
    }

    private final String onExtraCallbackWithResult(getCreatorConstructor getcreatorconstructor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback.IAuthTabCallback[getcreatorconstructor.ordinal()] == 1) {
            String string = getString(R.string.card_ocr_impl_ocr_identity_document_type_passport);
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            int i4 = IAuthTabCallbackStub + 33;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return string;
        }
        String string2 = getString(R.string.card_ocr_impl_ocr_identity_document_type_id_card);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        int i6 = IAuthTabCallbackStub + 19;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return string2;
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
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

    public static final class onTransact extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = asBinder;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 29;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 35284), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, 14239 - KeyEvent.getDeadChar(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getFadingEdgeLength() >> 16)), View.resolveSize(0, 0) + 35, (-16762977) - Color.rgb(0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $11 + 103;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10934), (Process.myPid() >> 22) + 65, 16717 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 17657 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 49467), 70 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i14 = $10 + 67;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $11 + 43;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private final PKCS12_MakePFX_WINS onExtraCallback() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (PKCS12_MakePFX_WINS) IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1772209069, -1772209068, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{this});
    }

    private final void asInterface() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -795855881, 795855881, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{this});
    }

    static void onWarmupCompleted() {
        asBinder = new char[]{27258, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27138, 27172, 27170, 27198, 27194, 27197, 27197, 27167, 27138, 27173, 27172, 27140, 27136, 27174, 27172, 27197, 27199, 27169, 27198, 27197, 27166, 27233, 27233, 27166, 27196, 27197, 27173, 27175, 27173, 27143, 27137, 27169, 27172, 27257, 27168, 27199, 27168, 27138, 27136, 27177, 27180, 27173, 27166, 27137, 27173, 27175, 27172, 27174, 27177, 27173, 27198, 27172, 27143, 27142, 27176, 27138, 27167, 27170, 27177, 27168, 27194, 27199, 27171, 27139, 27136, 27173, 27141, 27166, 27197, 27199, 27199, 27167, 27142, 27176, 27168, 27172, 27172, 27197, 27167, 27233, 27258, 27160, 27199, 27196, 27194, 27168, 27258, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27139, 27171, 27199, 27194, 27168, 27177, 27170, 27167, 27167, 27170, 27173, 27194, 27169, 27176, 27178, 27140, 27138, 27176, 27142, 27166, 27173, 27180, 27177, 27139, 27233, 27262, 27138, 27168, 27199, 27168, 27182, 27283, 27318, 27319, 27317, 27323, 27324, 27323, 27318, 27323, 27293, 27295, 27327, 27324, 27299, 27303, 27297, 27322, 27298, 27303, 27297, 27296, 27303, 27324, 27324, 27305, 27302, 27324, 27326, 27297, 27297, 27298, 27322, 27327, 27303, 27294, 27294, 27324, 27326, 27297, 27297, 27298, 27322, 27327, 27303, 27294, 27286, 27325, 27296, 27323, 27317, 27318, 27322, 27290, 27291, 27324, 27292, 27289, 27316, 27318, 27318, 27286, 27265, 27299, 27323, 27327, 27327, 27316, 27286, 27384};
    }
}
