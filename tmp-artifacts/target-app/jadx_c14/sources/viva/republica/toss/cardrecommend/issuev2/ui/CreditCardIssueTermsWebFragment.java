package viva.republica.toss.cardrecommend.issuev2.ui;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.base.BaseFragment;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.ANActivityLifecycleCallbacksListener;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.JsonReaderUnknownNumberParsing;
import o.PageContext;
import o.RSAESOAEPparams;
import o.RippleNode;
import o.RotationProvider1;
import o.TypographyKtExternalSyntheticLambda0;
import o.UTIL_GetDataFromLDAP;
import o.addAllCommandLine;
import o.getANActivityLifecycleCallbacksListener;
import o.getCoefficient;
import o.getDigestAlgorithms;
import o.getIconPaddingLeft;
import o.getNameRegistrationAuthorities;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.preFillDefault;
import o.setMessageBytes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.service.LabFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueTermsWebFragment extends CardIssueBaseFragment<RSAESOAEPparams> {
    private static int $10 = 0;
    private static int $11 = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static char asBinder = 0;
    private static int asInterface = 0;
    public static final int onExtraCallback;
    private static int onTransact = 1;
    private final PageContext onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final Lazy onWarmupCompleted;

    static {
        onWarmupCompleted();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(CreditCardIssueTermsWebFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueCommonContainerBinding;", 0)};
        onExtraCallback = 8;
        int i = asInterface + 119;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditCardIssueTermsWebFragment creditCardIssueTermsWebFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditCardIssueTermsWebFragment, th);
        int i4 = IAuthTabCallbackDefault + 121;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditCardIssueTermsWebFragment creditCardIssueTermsWebFragment, getNameRegistrationAuthorities getnameregistrationauthorities) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(creditCardIssueTermsWebFragment, getnameregistrationauthorities);
        }
        IAuthTabCallback(creditCardIssueTermsWebFragment, getnameregistrationauthorities);
        throw null;
    }

    public CreditCardIssueTermsWebFragment() {
        super(R.layout.fragment_credit_card_issue_common_container);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.IAuthTabCallback);
        this.onWarmupCompleted = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOverviewViewModel.class), new onWarmupCompleted(this), new onExtraCallbackWithResult(null, this), new IAuthTabCallback(this));
    }

    public static final /* synthetic */ CardIssueOverviewViewModel onExtraCallbackWithResult(CreditCardIssueTermsWebFragment creditCardIssueTermsWebFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return creditCardIssueTermsWebFragment.onExtraCallback();
        }
        creditCardIssueTermsWebFragment.onExtraCallback();
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 13;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.onNavigationEvent;
        int i4 = i2 + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, UTIL_GetDataFromLDAP> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        onExtraCallback() {
            super(1, UTIL_GetDataFromLDAP.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueCommonContainerBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final UTIL_GetDataFromLDAP invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return UTIL_GetDataFromLDAP.onExtraCallback(view);
        }
    }

    private final UTIL_GetDataFromLDAP onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        return (UTIL_GetDataFromLDAP) this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, i2 % 2 == 0 ? IAuthTabCallback[1] : IAuthTabCallback[0]);
    }

    private final CardIssueOverviewViewModel onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOverviewViewModel cardIssueOverviewViewModel = (CardIssueOverviewViewModel) this.onWarmupCompleted.getValue();
        int i4 = IAuthTabCallbackDefault + 21;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return cardIssueOverviewViewModel;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(CreditCardIssueTermsWebFragment creditCardIssueTermsWebFragment, getNameRegistrationAuthorities getnameregistrationauthorities) {
        int i = 2 % 2;
        getDigestAlgorithms<RSAESOAEPparams> getdigestalgorithmsWriteTypedObject = creditCardIssueTermsWebFragment.writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueTermsWebFragment);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = creditCardIssueTermsWebFragment.extraCallback();
        List<String> listOnExtraCallbackWithResult = getnameregistrationauthorities.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallbackWithResult, 10));
        Iterator<T> it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            int i2 = onTransact + 5;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add((String) it.next());
        }
        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new ANActivityLifecycleCallbacksListener(arrayList), (String) null, (String) null, (Map) null, 40, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(CreditCardIssueTermsWebFragment creditCardIssueTermsWebFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, creditCardIssueTermsWebFragment.requireBaseActivity(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String strOnWarmupCompleted = readTypedObject().onWarmupCompleted();
        UUID uuidRandomUUID = UUID.randomUUID();
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 2, 13821}, (byte) (7 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 2 - ImageFormat.getBitsPerPixel(0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), strOnWarmupCompleted + "&uuid=" + uuidRandomUUID);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\b', 4, 0, 2, '\r', '\t', '\n', '\b', '\r', '\n', 5, '\f'}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49), KeyEvent.getDeadChar(0, 0) + 12, objArr2);
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "true")});
        LabFragment labFragmentInstantiate = childFragmentManager.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), LabFragment.class.getName());
        if (labFragmentInstantiate == null) {
            throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.service.LabFragment");
        }
        LabFragment labFragment = labFragmentInstantiate;
        if (bundleOnNavigationEvent != null) {
            int i2 = IAuthTabCallbackDefault + 117;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            labFragment.setArguments(bundleOnNavigationEvent);
            int i4 = onTransact + 103;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        getChildFragmentManager().onExtraCallbackWithResult().IAuthTabCallback(onNavigationEvent().onExtraCallback.getId(), labFragment).IAuthTabCallback();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(getNameRegistrationAuthorities.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        autoDisposable(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueTermsWebFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CreditCardIssueTermsWebFragment.onExtraCallback(this.f$0, (Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueTermsWebFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CreditCardIssueTermsWebFragment.onWarmupCompleted(this.f$0, (getNameRegistrationAuthorities) obj);
            }
        }, 2, (Object) null));
        onExtraCallback().extraCallbackWithResult().observe(getViewLifecycleOwner(), new BaseFragment.ICustomTabsService(new onNavigationEvent()));
        int i6 = IAuthTabCallbackDefault + 111;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
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
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackStub;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), MotionEvent.axisFromString("") + 27, 23140 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        float f = 0.0f;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 26 - View.MeasureSpec.getMode(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 73;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $11 + 125;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i9 = $11 + 25;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback % b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent / 0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 24824), 74 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 30, (KeyEvent.getMaxKeyCode() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i11 = $10 + 39;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                f = 0.0f;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $11 + 65;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr4[i17] = (char) (cArr4[i17] ^ 23078);
                i17 += 76;
            } else {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = new char[]{64964, 64963, 64967, 64986, 64960, 64993, 64966, 64984, 64991, 64982, 64988, 64981, 64989, 64987, 64961, 64985};
        asBinder = (char) 51245;
    }

    public static final class onNavigationEvent implements Function1<Triple<? extends TypographyKtExternalSyntheticLambda0, ? extends getANActivityLifecycleCallbacksListener, ? extends getDigestAlgorithms<? extends getCoefficient>>, Unit> {
        public onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Triple<? extends TypographyKtExternalSyntheticLambda0, ? extends getANActivityLifecycleCallbacksListener, ? extends getDigestAlgorithms<? extends getCoefficient>> triple) {
            Triple<? extends TypographyKtExternalSyntheticLambda0, ? extends getANActivityLifecycleCallbacksListener, ? extends getDigestAlgorithms<? extends getCoefficient>> triple2 = triple;
            getDigestAlgorithms.onExtraCallback((getDigestAlgorithms) triple2.IAuthTabCallback(), (TypographyKtExternalSyntheticLambda0) triple2.onExtraCallbackWithResult(), CreditCardIssueTermsWebFragment.onExtraCallbackWithResult(CreditCardIssueTermsWebFragment.this), (getANActivityLifecycleCallbacksListener) triple2.onExtraCallback(), (String) null, (String) null, (Map) null, 40, (Object) null);
        }
    }
}
