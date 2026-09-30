package viva.republica.toss.verify.ussCard;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.base.BaseFragment;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
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
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda8;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.N_;
import o.PageContext;
import o.ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.RecomposerrecompositionRunner2;
import o.RippleNode;
import o.SetDetectableSize;
import o.access8100;
import o.addAllCommandLine;
import o.getWrite;
import o.preFillDefault;
import o.verifyEnvelopeVID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.verify.session.VerifySessionViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VerifyUssCardIntroFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char[] onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static char onTransact;
    public static final int onWarmupCompleted;
    private final Lazy IAuthTabCallback;
    private final PageContext onExtraCallbackWithResult;

    static {
        IAuthTabCallback();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(VerifyUssCardIntroFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentUssCardAuthIntroBinding;", 0)};
        onWarmupCompleted = 8;
        int i = IAuthTabCallbackStub + 81;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i5;
        int i8 = ~(i3 | i7);
        int i9 = i6 | i8;
        int i10 = ~i6;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i6)) | (~(i10 | i5));
        int i13 = i5 + i6 + i4 + (513088896 * i2) + ((-1342203445) * i);
        int i14 = i13 * i13;
        int i15 = (665020156 * i5) + 661520384 + (1303681286 * i6) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i4) + ((-771751936) * i2) + (1382285312 * i) + ((-350355456) * i14);
        int i16 = ((i5 * (-363642324)) - 614971735) + (i6 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i4 * (-363641803)) + (i2 * (-2127225984)) + (i * (-1080704249)) + (i14 * (-1523187712));
        if (i15 + (i16 * i16 * (-227409920)) != 1) {
            return onExtraCallbackWithResult(objArr);
        }
        VerifyUssCardIntroFragment verifyUssCardIntroFragment = (VerifyUssCardIntroFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i17 = 2 % 2;
        int i18 = asInterface + 5;
        IAuthTabCallbackDefault = i18 % 128;
        int i19 = i18 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(verifyUssCardIntroFragment, setDetectableSize);
        int i20 = IAuthTabCallbackDefault + 45;
        asInterface = i20 % 128;
        int i21 = i20 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyUssCardIntroFragment verifyUssCardIntroFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {verifyUssCardIntroFragment, view};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent3, -148569754, 148569754, objArr);
        int i4 = IAuthTabCallbackDefault + 101;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(VerifyUssCardIntroFragment verifyUssCardIntroFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(verifyUssCardIntroFragment, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(verifyUssCardIntroFragment, view);
        int i3 = IAuthTabCallbackDefault + 109;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(VerifyUssCardIntroFragment verifyUssCardIntroFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(verifyUssCardIntroFragment, setDetectableSize);
        }
        onWarmupCompleted(verifyUssCardIntroFragment, setDetectableSize);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return 1265511L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public VerifyUssCardIntroFragment() {
        super(R.layout.fragment_uss_card_auth_intro);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onNavigationEvent);
        this.IAuthTabCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(VerifySessionViewModel.class), new IAuthTabCallback(this), new onWarmupCompleted(null, this), new onNavigationEvent(this));
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{'\t', 31, '\b', 11, 13904}, (byte) (80 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), 6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), getString(R.string.teens_uss_card_auth_intro_title))});
        int i4 = asInterface + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        throw null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, verifyEnvelopeVID> {
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, verifyEnvelopeVID.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentUssCardAuthIntroBinding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final verifyEnvelopeVID invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return verifyEnvelopeVID.onExtraCallbackWithResult(view);
        }
    }

    private final verifyEnvelopeVID onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        verifyEnvelopeVID verifyenvelopevidOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, onNavigationEvent[0]);
        int i4 = asInterface + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return verifyenvelopevidOnExtraCallbackWithResult;
    }

    private final VerifySessionViewModel onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        VerifySessionViewModel verifySessionViewModel = (VerifySessionViewModel) this.IAuthTabCallback.getValue();
        int i4 = asInterface + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return verifySessionViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(VerifyUssCardIntroFragment verifyUssCardIntroFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{5, 29, 13866, 13866, '\r', 4, 1, 11, 31, '\t', 16, '\"'}, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 60), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 13, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifyUssCardIntroFragment.getString(R.string.yes_ne));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 103;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final VerifyUssCardIntroFragment verifyUssCardIntroFragment = (VerifyUssCardIntroFragment) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], BuildConfig.FLAVOR);
        ConvertByteArrayToFloatArray.onExtraCallback(1265513L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardIntroFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.f$0, (SetDetectableSize) obj};
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                return (Unit) VerifyUssCardIntroFragment.IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1426122405, -1426122404, objArr2);
            }
        }, 14, (Object) null);
        RippleNode.onNavigationEvent(verifyUssCardIntroFragment).onNavigationEvent(R.id.action_verifyUssCardIntroFragment_to_verifyUssCardPasswordFragment);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        TdsImageView tdsImageView = onNavigationEvent().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(tdsImageView.getContext());
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(tdsImageView.getContext());
        Object[] objArr = new Object[1];
        a(new char[]{'\n', '\b', '\t', '\r', 23, 26, 13768, 13768, 19, '\b', 19, '\n', 3, 27, 19, 6, 14, 22, 21, 19, 31, 27, 30, 14, ' ', 2, 18, 21, 21, 22, 23, 16, 25, 20, 22, '\b', ' ', 27, 25, 22, 16, 22, 17, 16, 25, 19, 31, 22, 7, 23, 21, 16, 7, 1, 21, '\f', 7, 1}, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19), View.MeasureSpec.getMode(0) + 58, objArr);
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = Recomposerjoin2.onExtraCallback(onnavigationevent.onExtraCallback(((String) objArr[0]).intern()), tdsImageView);
        RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, true);
        N_.onExtraCallback(onnavigationeventOnExtraCallback, 0);
        carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallbackWithResult());
        TdsBottomCtaV1View tdsBottomCtaV1View = onNavigationEvent().onNavigationEvent;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        String string = getString(R.string.yes_ne);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardIntroFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return VerifyUssCardIntroFragment.IAuthTabCallback(this.f$0, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        String string2 = getString(im.toss.uikit.R.string.uikit_no);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, string2, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardIntroFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return VerifyUssCardIntroFragment.onExtraCallback(this.f$0, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
    }

    private static final Unit onWarmupCompleted(VerifyUssCardIntroFragment verifyUssCardIntroFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{5, 29, 13866, 13866, '\r', 4, 1, 11, 31, '\t', 16, '\"'}, (byte) (59 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 12 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifyUssCardIntroFragment.getString(im.toss.uikit.R.string.uikit_no));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 103;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final VerifyUssCardIntroFragment verifyUssCardIntroFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        ConvertByteArrayToFloatArray.onExtraCallback(1265513L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardIntroFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return VerifyUssCardIntroFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        VerifySessionViewModel.onExtraCallbackWithResult(-484996305, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{verifyUssCardIntroFragment.onExtraCallback(), ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android.onRelationshipValidationResult.IAuthTabCallback}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 484996306);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
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

    public static final class onNavigationEvent extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 105;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 26 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 26, (ViewConfiguration.getTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getSize(0) + 26, 23138 - ImageFormat.getBitsPerPixel(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i6 = $10 + 103;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24825), 74 - Gravity.getAbsoluteGravity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i7 = $10 + 103;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            try {
                                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback5 == null) {
                                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), View.resolveSize(0, 0) + 30, 19488 - Drawable.resolveOpacity(0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i10 = $11 + 111;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i16 = $10 + 29;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyUssCardIntroFragment verifyUssCardIntroFragment, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent2, 1426122405, -1426122404, new Object[]{verifyUssCardIntroFragment, setDetectableSize});
    }

    private static final Unit onWarmupCompleted(VerifyUssCardIntroFragment verifyUssCardIntroFragment, View view) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, iOnNavigationEvent2, -148569754, 148569754, new Object[]{verifyUssCardIntroFragment, view});
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{51243, 64989, 51245, 51240, 51244, 65004, 51235, 64967, 51247, 64987, 64991, 64897, 64896, 64901, 51246, 64963, 64988, 64961, 64925, 64926, 64960, 64976, 64978, 64966, 51242, 64990, 64983, 51232, 64982, 64905, 51233, 64980, 64924, 64986, 64899, 64977};
        onTransact = (char) 51247;
    }
}
