package im.toss.features.loan.common;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.features.loan.common.LoanApplicationTermsWebViewFragment$;
import im.toss.features.loan.ui.R;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.IPostMessageServiceStubProxy;
import o.PageContext;
import o.RotationProvider1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.getHostnameVerifierokhttp;
import o.getLongOctalBytes;
import o.getWrite;
import o.onInit;
import o.preFillDefault;
import o.startSurface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.service.LabFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanApplicationTermsWebViewFragment extends BaseFragment implements startSurface {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static int IAuthTabCallbackStubProxy = 0;
    private static long IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    public static final int onExtraCallbackWithResult;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private Function0<Unit> asBinder;
    private final Lazy asInterface;
    private LabFragment onExtraCallback;
    private final PageContext onNavigationEvent;
    private Function0<Unit> onTransact;
    private final Lazy onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanApplicationTermsWebViewFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/ViewLoanApplicationWebviewBinding;", 0)};
        Companion = new onWarmupCompleted(null);
        onExtraCallbackWithResult = 8;
        int i = IAuthTabCallbackStubProxy + 75;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(function0, view);
        }
        onExtraCallbackWithResult(function0, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -2028079271, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2028079271, new Object[]{loanApplicationTermsWebViewFragment})).booleanValue();
        int i4 = access100 + 117;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i4)) | (~(i7 | i8));
        int i10 = ~i4;
        int i11 = (~(i3 | i10 | i6)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i4 + i6 + i + ((-1228711472) * i2) + ((-141981132) * i5);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i4) - 2072313856) + (1118068377 * i6) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i) + ((-287309824) * i2) + ((-1573388288) * i5) + ((-2138374144) * i14);
        int i16 = ((i4 * (-646461497)) - 273503129) + (i6 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i * (-646461009)) + (i2 * 1623110960) + (i5 * (-2035004020)) + (i14 * 33882112);
        int i17 = i15 + (i16 * i16 * (-1051394048));
        if (i17 != 1) {
            if (i17 == 2) {
                return onExtraCallbackWithResult(objArr);
            }
            if (i17 != 3) {
                return i17 != 4 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
            }
            LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment = (LoanApplicationTermsWebViewFragment) objArr[0];
            int i18 = 2 % 2;
            int i19 = access100 + 93;
            getInterfaceDescriptor = i19 % 128;
            int i20 = i19 % 2;
            String str = (String) loanApplicationTermsWebViewFragment.IAuthTabCallbackStub.getValue();
            int i21 = access100 + 95;
            getInterfaceDescriptor = i21 % 128;
            int i22 = i21 % 2;
            return str;
        }
        LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment2 = (LoanApplicationTermsWebViewFragment) objArr[0];
        int i23 = 2 % 2;
        int i24 = getInterfaceDescriptor + 91;
        access100 = i24 % 128;
        int i25 = i24 % 2;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = loanApplicationTermsWebViewFragment2.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{3958, 55990, 42209}, 54727 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), getLongOctalBytes.onExtraCallbackWithResult(loanApplicationTermsWebViewFragment2.IAuthTabCallbackStub()))});
        LabFragment labFragmentInstantiate = childFragmentManager.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), LabFragment.class.getName());
        if (labFragmentInstantiate == null) {
            throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.service.LabFragment");
        }
        LabFragment labFragment = labFragmentInstantiate;
        if (bundleOnNavigationEvent != null) {
            int i26 = getInterfaceDescriptor + 91;
            access100 = i26 % 128;
            int i27 = i26 % 2;
            labFragment.setArguments(bundleOnNavigationEvent);
        }
        loanApplicationTermsWebViewFragment2.onExtraCallback = labFragment;
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = loanApplicationTermsWebViewFragment2.getChildFragmentManager().onExtraCallbackWithResult();
        int id = loanApplicationTermsWebViewFragment2.IAuthTabCallback().onExtraCallback.getId();
        Fragment fragment = loanApplicationTermsWebViewFragment2.onExtraCallback;
        if (fragment == null) {
            int i28 = getInterfaceDescriptor + 61;
            access100 = i28 % 128;
            int i29 = i28 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragment = null;
        }
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback(id, fragment).IAuthTabCallback();
        return null;
    }

    public static /* synthetic */ String onExtraCallback(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = asBinder(loanApplicationTermsWebViewFragment);
        int i4 = access100 + 19;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(loanApplicationTermsWebViewFragment);
        int i4 = getInterfaceDescriptor + 33;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(loanApplicationTermsWebViewFragment);
        }
        onTransact(loanApplicationTermsWebViewFragment);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(baseActivity, view);
        int i4 = access100 + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ String onWarmupCompleted(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = asInterface(loanApplicationTermsWebViewFragment);
        int i4 = access100 + 63;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return strAsInterface;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 45;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return -1L;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, onInit> {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 93;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        onNavigationEvent() {
            super(1, onInit.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/ViewLoanApplicationWebviewBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(view);
            }
            onExtraCallbackWithResult(view);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final onInit onExtraCallbackWithResult(View view) {
            onInit oninitOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                oninitOnNavigationEvent = onInit.onNavigationEvent(view);
                int i3 = 42 / 0;
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                oninitOnNavigationEvent = onInit.onNavigationEvent(view);
            }
            int i4 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return oninitOnNavigationEvent;
        }
    }

    public LoanApplicationTermsWebViewFragment() {
        super(R.layout.view_loan_application_webview);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.IAuthTabCallback);
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new LoanApplicationTermsWebViewFragment$.ExternalSyntheticLambda0(this));
        this.IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new LoanApplicationTermsWebViewFragment$.ExternalSyntheticLambda1(this));
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new LoanApplicationTermsWebViewFragment$.ExternalSyntheticLambda2(this));
        this.asInterface = LazyKt.onExtraCallbackWithResult(new LoanApplicationTermsWebViewFragment$.ExternalSyntheticLambda3(this));
    }

    private final onInit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onInit oninitOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
        Intrinsics.checkNotNullExpressionValue(oninitOnExtraCallbackWithResult, "");
        onInit oninit = oninitOnExtraCallbackWithResult;
        int i4 = access100 + 111;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return oninit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String asInterface(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = loanApplicationTermsWebViewFragment.getArguments();
        if (arguments != null) {
            int i4 = getInterfaceDescriptor + 13;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            String string = arguments.getString("KEY_CTA_TITLE", "");
            if (i5 == 0) {
                int i6 = 9 / 0;
            }
        }
        String string2 = loanApplicationTermsWebViewFragment.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    private final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onWarmupCompleted.getValue();
        int i4 = access100 + 65;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onTransact(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = loanApplicationTermsWebViewFragment.getArguments();
        if (arguments != null) {
            int i4 = access100 + 15;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            String string = arguments.getString("KEY_PAGE_TITLE", "");
            if (string != null) {
                int i6 = getInterfaceDescriptor;
                int i7 = i6 + 67;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 113;
                access100 = i9 % 128;
                if (i9 % 2 != 0) {
                    return string;
                }
                throw null;
            }
        }
        return "";
    }

    private final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    private static final String asBinder(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        String string;
        int i = 2 % 2;
        Bundle arguments = loanApplicationTermsWebViewFragment.getArguments();
        if (arguments == null || (string = arguments.getString("KEY_URI", "")) == null) {
            return "";
        }
        int i2 = getInterfaceDescriptor + 83;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return string;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment = (LoanApplicationTermsWebViewFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 117;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            loanApplicationTermsWebViewFragment.getArguments();
            throw null;
        }
        Bundle arguments = loanApplicationTermsWebViewFragment.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("KEY_SHOW_CTA"));
        }
        int i3 = getInterfaceDescriptor + 93;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asInterface.getValue();
        if (i3 == 0) {
            return ((Boolean) value).booleanValue();
        }
        int i4 = 0 / 0;
        return ((Boolean) value).booleanValue();
    }

    public final void onExtraCallback(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.asBinder = function0;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 47;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onWarmupCompleted(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 89;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.onTransact = function0;
        int i5 = i2 + 101;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(BaseActivity baseActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.finish();
        int i4 = getInterfaceDescriptor + 63;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        BaseActivity baseActivity;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        BaseActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = activity;
        } else {
            int i2 = getInterfaceDescriptor + 47;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            baseActivity = null;
        }
        if (baseActivity != null) {
            baseActivity.setSupportActionBar(view.findViewById(R.id.toolbar));
            IPostMessageServiceStubProxy supportActionBar = baseActivity.getSupportActionBar();
            if (supportActionBar != null) {
                int i4 = access100 + 5;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                supportActionBar.IAuthTabCallbackStub(false);
            }
            IPostMessageServiceStubProxy supportActionBar2 = baseActivity.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.onNavigationEvent(true);
            }
            IAuthTabCallback().onNavigationEvent.setNavigationOnClickListener(new LoanApplicationTermsWebViewFragment$.ExternalSyntheticLambda5(baseActivity));
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            if (!StringsKt.isBlank((String) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 1218903281, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1218903278, new Object[]{this}))) {
                Typography5 typography5 = IAuthTabCallback().asInterface;
                int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                typography5.setText((String) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 1218903281, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1218903278, new Object[]{this}));
            }
        }
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, 931215066, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -931215065, new Object[]{this});
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted4, 701896850, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -701896848, new Object[]{this});
        int i6 = access100 + 5;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean onBackPressed() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        asInterface();
        return i3 == 0;
    }

    private final void asInterface() {
        int i = 2 % 2;
        LabFragment labFragment = this.onExtraCallback;
        Object obj = null;
        if (labFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            labFragment = null;
        }
        if (!labFragment.onBackPressed()) {
            int i2 = getInterfaceDescriptor + 119;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                getParentFragmentManager().extraCommand();
                obj.hashCode();
                throw null;
            }
            getParentFragmentManager().extraCommand();
            Function0<Unit> function0 = this.onTransact;
            if (function0 != null) {
                function0.invoke();
            }
        }
        int i3 = getInterfaceDescriptor + 95;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = access100 + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        Function0<Unit> function0 = this.onTransact;
        if (function0 != null) {
            int i4 = access100 + 123;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
            if (i5 != 0) {
                int i6 = 64 / 0;
            }
        }
        int i7 = getInterfaceDescriptor + 43;
        access100 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 78 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r2
      0x0026: PHI (r2v4 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r2v2 kotlin.jvm.functions.Function0<kotlin.Unit>), (r2v5 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 13;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            function0 = loanApplicationTermsWebViewFragment.asBinder;
            int i4 = 68 / 0;
            if (function0 != null) {
                Intrinsics.checkNotNull(function0);
                function0.invoke();
                int i5 = access100 + 3;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = i2 + 7;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                loanApplicationTermsWebViewFragment.asInterface();
            }
        } else {
            function0 = loanApplicationTermsWebViewFragment.asBinder;
            if (function0 == null) {
            }
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 63;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 79;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), Process.getGidForName("") + 25, ImageFormat.getBitsPerPixel(0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (IAuthTabCallback_Parcel % 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 59 - Color.red(0), 6383 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, Gravity.getAbsoluteGravity(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ IAuthTabCallback_Parcel);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 58 - Process.getGidForName(""), 6384 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i8 = $11 + 95;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i10 = $10 + 77;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), ((Process.getThreadPriority(0) + 20) >> 6) + 59, (ViewConfiguration.getTouchSlop() >> 8) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[PHI: r2
      0x0042: PHI (r2v9 im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View) = 
      (r2v5 im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View)
      (r2v11 im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View)
     binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r2
      0x0037: PHI (r2v6 im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View) = 
      (r2v5 im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View)
      (r2v11 im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View)
     binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        int i;
        LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment = (LoanApplicationTermsWebViewFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = access100 + 109;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            tdsBottomCtaV1View = loanApplicationTermsWebViewFragment.IAuthTabCallback().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            int i4 = 14 / 0;
            if (!loanApplicationTermsWebViewFragment.onExtraCallback()) {
                int i5 = access100 + 93;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                i = 8;
            } else {
                int i7 = access100 + 25;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                i = 0;
            }
        } else {
            tdsBottomCtaV1View = loanApplicationTermsWebViewFragment.IAuthTabCallback().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            if (loanApplicationTermsWebViewFragment.onExtraCallback()) {
            }
        }
        tdsBottomCtaV1View.setVisibility(i);
        loanApplicationTermsWebViewFragment.onNavigationEvent(loanApplicationTermsWebViewFragment.onNavigationEvent(), (Function0<Unit>) new LoanApplicationTermsWebViewFragment$.ExternalSyntheticLambda4(loanApplicationTermsWebViewFragment));
        loanApplicationTermsWebViewFragment.IAuthTabCallback().IAuthTabCallback.setEnabledCta(false);
        return null;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 109;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private final void onNavigationEvent(String str, Function0<Unit> function0) {
        int i = 2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1View = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, str, new LoanApplicationTermsWebViewFragment$.ExternalSyntheticLambda6(function0), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        int i2 = getInterfaceDescriptor + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull WebView webView, @NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            getHostnameVerifierokhttp.onNavigationEvent(this, (String) null, 0, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            getHostnameVerifierokhttp.onNavigationEvent(this, (String) null, 1, (Object) null);
        }
        int i3 = getInterfaceDescriptor + 33;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
    }

    public void onNavigationEvent(@NotNull WebView webView, @NotNull String str) {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        boolean z;
        int i = 2 % 2;
        int i2 = access100 + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            dismissLoadingIndicator();
            tdsBottomCtaV1View = IAuthTabCallback().IAuthTabCallback;
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            dismissLoadingIndicator();
            tdsBottomCtaV1View = IAuthTabCallback().IAuthTabCallback;
            z = true;
        }
        tdsBottomCtaV1View.setEnabledCta(z);
    }

    public static final class onWarmupCompleted {
        private static final byte[] $$a = {46, -35, 45, 111};
        private static final int $$b = 21;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int IAuthTabCallback = 1;
        private static long onExtraCallbackWithResult = 8209700617820611587L;
        private static int onExtraCallback = -1776194565;
        private static char onNavigationEvent = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, short s) {
            int i;
            int i2 = b2 + 109;
            int i3 = b * 3;
            int i4 = (s * 2) + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            if (bArr == null) {
                int i6 = i5;
                int i7 = 0;
                i2 += i6;
                i4++;
                i = i7;
                bArr2[i] = (byte) i2;
                i7 = i + 1;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i4];
                i2 += i6;
                i4++;
                i = i7;
                bArr2[i] = (byte) i2;
                i7 = i + 1;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i2;
                i7 = i + 1;
                if (i == i5) {
                }
            }
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public static /* synthetic */ LoanApplicationTermsWebViewFragment onExtraCallback(onWarmupCompleted onwarmupcompleted, String str, String str2, String str3, boolean z, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 2) != 0) {
                int i6 = i3 + 97;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                str2 = "";
            }
            if ((i & 4) != 0) {
                Object[] objArr = new Object[1];
                a((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4736), TextUtils.indexOf("", "", 0), new char[]{15476, 43697}, new char[]{53240, 39841, 47873, 7636}, new char[]{13857, 39476, 32895, 59154}, objArr);
                str3 = ((String) objArr[0]).intern();
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return onwarmupcompleted.onNavigationEvent(str, str2, str3, z);
        }

        public final LoanApplicationTermsWebViewFragment onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment = new LoanApplicationTermsWebViewFragment();
            loanApplicationTermsWebViewFragment.setArguments(RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("KEY_PAGE_TITLE", str2), getWrite.IAuthTabCallback("KEY_URI", str), getWrite.IAuthTabCallback("KEY_CTA_TITLE", str3), getWrite.IAuthTabCallback("KEY_SHOW_CTA", Boolean.valueOf(z))}));
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return loanApplicationTermsWebViewFragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $10 + 95;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), KeyEvent.getDeadChar(0, 0) + 43, 1451 - KeyEvent.keyCodeFromString(""), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49123), TextUtils.getCapsMode("", 0, 0) + 44, 1494 - (Process.myTid() >> 22), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0', 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, Color.alpha(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 29 - Color.red(0), 12577 - (ViewConfiguration.getEdgeSlop() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i5 = $10 + 21;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
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
    }

    public static /* synthetic */ void onWarmupCompleted(BaseActivity baseActivity, View view) throws Throwable {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 2137592482, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2137592478, new Object[]{baseActivity, view});
    }

    private final String onWarmupCompleted() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (String) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 1218903281, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1218903278, new Object[]{this});
    }

    private final void IAuthTabCallbackDefault() throws Throwable {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 931215066, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -931215065, new Object[]{this});
    }

    private final void asBinder() throws Throwable {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 701896850, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -701896848, new Object[]{this});
    }

    private static final boolean IAuthTabCallbackStub(LoanApplicationTermsWebViewFragment loanApplicationTermsWebViewFragment) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -2028079271, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2028079271, new Object[]{loanApplicationTermsWebViewFragment})).booleanValue();
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback_Parcel = 5935587818780265012L;
    }
}
