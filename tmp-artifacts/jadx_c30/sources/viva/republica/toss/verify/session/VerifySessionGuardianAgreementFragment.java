package viva.republica.toss.verify.session;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.base.BaseFragment;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PageContext;
import o.PerformanceTracerTracingStateCallback;
import o.ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0;
import o.ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android;
import o.addAllCommandLine;
import o.preFillDefault;
import o.reportTimeStamp;
import o.subscribeToTracingStateChanges;
import o.unsubscribeFromTracingStateChanges;
import o.verifyValidity;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.verify.session.VerifySessionGuardianAgreementFragment;
import viva.republica.toss.widget.SnappingLinearLayoutManager;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VerifySessionGuardianAgreementFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static boolean access000 = false;
    private static boolean access100 = false;
    private static int asBinder = 0;
    private static int extraCallback = 1;
    private static int getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static char[] onTransact;
    private unsubscribeFromTracingStateChanges IAuthTabCallbackDefault;
    private unsubscribeFromTracingStateChanges onWarmupCompleted;
    private final PageContext IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onExtraCallbackWithResult);
    private final Lazy asInterface = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(VerifySessionViewModel.class), new onWarmupCompleted(this), new asInterface(null, this), new IAuthTabCallbackDefault(this));
    private final List<ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0> IAuthTabCallbackStub = new ArrayList();
    private final List<ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0> onNavigationEvent = new ArrayList();

    static {
        onWarmupCompleted();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(VerifySessionGuardianAgreementFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentGuardianAgreeBinding;", 0)};
        onExtraCallbackWithResult = 8;
        int i = extraCallback + 19;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i5) | i3);
        int i8 = ~((~i) | i3);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i3) | i5)) | i7;
        int i11 = i3 + i5 + i4 + ((-1814252664) * i6) + (2073254503 * i2);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i3) + 1943797760 + (1745420935 * i5) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i4) + ((-1631584256) * i6) + ((-1368915968) * i2) + ((-1053032448) * i12);
        int i14 = (i3 * (-1919122223)) + 1408767311 + (i5 * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i4 * (-1919121629)) + (i6 * (-390511720)) + (i2 * 1804971285) + (i12 * 255066112);
        return i13 + ((i14 * i14) * 379846656) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(verifySessionGuardianAgreementFragment, view);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = getInterfaceDescriptor + 19;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(verifySessionGuardianAgreementFragment, view);
        int i4 = getInterfaceDescriptor + 123;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List IAuthTabCallback(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        List<ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0> list = verifySessionGuardianAgreementFragment.onNavigationEvent;
        int i5 = i3 + 85;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final /* synthetic */ void onExtraCallback(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onExtraCallbackWithResult(iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{verifySessionGuardianAgreementFragment}, 505975149, iOnExtraCallbackWithResult2, -505975149, iOnExtraCallbackWithResult3);
            return;
        }
        int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult4, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{verifySessionGuardianAgreementFragment}, 505975149, iOnExtraCallbackWithResult5, -505975149, iOnExtraCallbackWithResult6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List onExtraCallbackWithResult(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        List<ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0> list = verifySessionGuardianAgreementFragment.IAuthTabCallbackStub;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return list;
    }

    public static final /* synthetic */ verifyValidity onWarmupCompleted(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {verifySessionGuardianAgreementFragment};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        verifyValidity verifyvalidity = (verifyValidity) onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, objArr, 1593284653, iOnExtraCallbackWithResult2, -1593284652, iOnExtraCallbackWithResult3);
        int i4 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return verifyvalidity;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, verifyValidity> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, verifyValidity.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentGuardianAgreeBinding;", 0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final verifyValidity invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return verifyValidity.onExtraCallbackWithResult(view);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment = (VerifySessionGuardianAgreementFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        verifyValidity verifyvalidity = (verifyValidity) verifySessionGuardianAgreementFragment.IAuthTabCallback.onExtraCallbackWithResult(verifySessionGuardianAgreementFragment, onExtraCallback[0]);
        int i4 = getInterfaceDescriptor + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return verifyvalidity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final VerifySessionViewModel onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        VerifySessionViewModel verifySessionViewModel = (VerifySessionViewModel) this.asInterface.getValue();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return verifySessionViewModel;
    }

    public static final class onNavigationEvent extends OnBackPressedCallback {
        final /* synthetic */ FragmentActivity IAuthTabCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(FragmentActivity fragmentActivity) {
            super(true);
            this.IAuthTabCallback = fragmentActivity;
        }

        public void handleOnBackPressed() {
            this.IAuthTabCallback.finish();
        }
    }

    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onAttach(context);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, BuildConfig.FLAVOR);
        fragmentActivityRequireActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new onNavigationEvent(fragmentActivityRequireActivity));
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_guardian_agree, viewGroup, false);
        int i4 = getInterfaceDescriptor + 55;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return viewInflate;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            super.onViewCreated(view, bundle);
            onNavigationEvent();
            asBinder();
            int i3 = 28 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            super.onViewCreated(view, bundle);
            onNavigationEvent();
            asBinder();
        }
        int i4 = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        verifySessionGuardianAgreementFragment.onExtraCallbackWithResult().access000();
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        int i5 = getInterfaceDescriptor + 49;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onWarmupCompleted(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        FragmentActivity activity = verifySessionGuardianAgreementFragment.getActivity();
        if (activity != null) {
            int i2 = IAuthTabCallback_Parcel + 125;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            activity.finish();
            int i4 = getInterfaceDescriptor + 95;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallback implements unsubscribeFromTracingStateChanges.onExtraCallbackWithResult {
        @Override // o.unsubscribeFromTracingStateChanges.onExtraCallbackWithResult
        public void onExtraCallbackWithResult(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        }

        onExtraCallback() {
        }

        @Override // o.unsubscribeFromTracingStateChanges.onExtraCallbackWithResult
        public void IAuthTabCallback(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            for (ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 : VerifySessionGuardianAgreementFragment.onExtraCallbackWithResult(VerifySessionGuardianAgreementFragment.this)) {
                if (Intrinsics.areEqual(reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.IAuthTabCallback(), str)) {
                    reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.onExtraCallback(z);
                    VerifySessionGuardianAgreementFragment.onExtraCallback(VerifySessionGuardianAgreementFragment.this);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // o.unsubscribeFromTracingStateChanges.onExtraCallbackWithResult
        public void onExtraCallbackWithResult(final int i) {
            RecyclerView recyclerView = VerifySessionGuardianAgreementFragment.onWarmupCompleted(VerifySessionGuardianAgreementFragment.this).IAuthTabCallbackStubProxy;
            final VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment = VerifySessionGuardianAgreementFragment.this;
            recyclerView.postDelayed(new Runnable() { // from class: viva.republica.toss.verify.session.VerifySessionGuardianAgreementFragment$initLayout$2$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VerifySessionGuardianAgreementFragment.onExtraCallback.onExtraCallback(verifySessionGuardianAgreementFragment, i);
                }
            }, 200L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallback(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment, int i) {
            RecyclerView.LayoutManager layoutManager = VerifySessionGuardianAgreementFragment.onWarmupCompleted(verifySessionGuardianAgreementFragment).IAuthTabCallbackStubProxy.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.smoothScrollToPosition(VerifySessionGuardianAgreementFragment.onWarmupCompleted(verifySessionGuardianAgreementFragment).IAuthTabCallbackStubProxy, (RecyclerView.State) null, i);
            }
        }
    }

    public static final class IAuthTabCallback implements unsubscribeFromTracingStateChanges.onExtraCallbackWithResult {
        @Override // o.unsubscribeFromTracingStateChanges.onExtraCallbackWithResult
        public void onExtraCallbackWithResult(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        }

        IAuthTabCallback() {
        }

        @Override // o.unsubscribeFromTracingStateChanges.onExtraCallbackWithResult
        public void IAuthTabCallback(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            for (ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 : VerifySessionGuardianAgreementFragment.IAuthTabCallback(VerifySessionGuardianAgreementFragment.this)) {
                if (Intrinsics.areEqual(reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.IAuthTabCallback(), str)) {
                    reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.onExtraCallback(z);
                    VerifySessionGuardianAgreementFragment.onExtraCallback(VerifySessionGuardianAgreementFragment.this);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // o.unsubscribeFromTracingStateChanges.onExtraCallbackWithResult
        public void onExtraCallbackWithResult(final int i) {
            RecyclerView recyclerView = VerifySessionGuardianAgreementFragment.onWarmupCompleted(VerifySessionGuardianAgreementFragment.this).IAuthTabCallback;
            final VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment = VerifySessionGuardianAgreementFragment.this;
            recyclerView.postDelayed(new Runnable() { // from class: viva.republica.toss.verify.session.VerifySessionGuardianAgreementFragment$initLayout$3$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VerifySessionGuardianAgreementFragment.IAuthTabCallback.onExtraCallbackWithResult(verifySessionGuardianAgreementFragment, i);
                }
            }, 200L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallbackWithResult(VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment, int i) {
            RecyclerView.LayoutManager layoutManager = VerifySessionGuardianAgreementFragment.onWarmupCompleted(verifySessionGuardianAgreementFragment).IAuthTabCallback.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.smoothScrollToPosition(VerifySessionGuardianAgreementFragment.onWarmupCompleted(verifySessionGuardianAgreementFragment).IAuthTabCallback, (RecyclerView.State) null, i);
            }
        }
    }

    private final void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        TdsImageView tdsImageView = ((verifyValidity) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1593284653, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1593284652, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-105, -106, ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.LCS_BYTE, -107, -109, ISOFileInfo.ENV_TEMP_EF, -108, -109, -110, -122, -124, -120, -111, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.SECURITY_ATTR_COMPACT, -112, -113, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.LCS_BYTE, -124, -124, ISOFileInfo.SECURITY_ATTR_EXP, -126, ISOFileInfo.LCS_BYTE, -119, -120, -126, ISOFileInfo.FCI_EXT, -126, -124, -122, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, 127 - Color.green(0), objArr);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View = ((verifyValidity) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1593284653, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1593284652, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).onWarmupCompleted;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        String string = getString(R.string.app_verify_session___9b47aa7a4b);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new View.OnClickListener() { // from class: viva.republica.toss.verify.session.VerifySessionGuardianAgreementFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifySessionGuardianAgreementFragment.onExtraCallbackWithResult(this.f$0, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
        tdsBottomCtaV1View.setBottomButton(getString(R.string.close), new Function1() { // from class: viva.republica.toss.verify.session.VerifySessionGuardianAgreementFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return VerifySessionGuardianAgreementFragment.onNavigationEvent(this.f$0, (View) obj);
            }
        });
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges = new unsubscribeFromTracingStateChanges(true, true, true);
        Object[] objArr2 = {unsubscribefromtracingstatechanges, new onExtraCallback()};
        unsubscribeFromTracingStateChanges.onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1243348636, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1243348637, objArr2);
        this.IAuthTabCallbackDefault = unsubscribefromtracingstatechanges;
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges2 = new unsubscribeFromTracingStateChanges(true, true, true);
        Object[] objArr3 = {unsubscribefromtracingstatechanges2, new IAuthTabCallback()};
        unsubscribeFromTracingStateChanges.onWarmupCompleted(zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1243348636, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1243348637, objArr3);
        this.onWarmupCompleted = unsubscribefromtracingstatechanges2;
        RecyclerView recyclerView = ((verifyValidity) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1593284653, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1593284652, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).IAuthTabCallbackStubProxy;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        recyclerView.setLayoutManager(new SnappingLinearLayoutManager(contextRequireContext, 1, false));
        RecyclerView recyclerView2 = ((verifyValidity) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1593284653, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1593284652, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).IAuthTabCallback;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, BuildConfig.FLAVOR);
        recyclerView2.setLayoutManager(new SnappingLinearLayoutManager(contextRequireContext2, 1, false));
        RecyclerView recyclerView3 = ((verifyValidity) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1593284653, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1593284652, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).IAuthTabCallbackStubProxy;
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges3 = this.IAuthTabCallbackDefault;
        if (unsubscribefromtracingstatechanges3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            int i2 = IAuthTabCallback_Parcel + 111;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            unsubscribefromtracingstatechanges3 = null;
        }
        recyclerView3.setAdapter(unsubscribefromtracingstatechanges3);
        RecyclerView recyclerView4 = ((verifyValidity) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1593284653, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1593284652, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).IAuthTabCallback;
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges4 = this.onWarmupCompleted;
        if (unsubscribefromtracingstatechanges4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            unsubscribefromtracingstatechanges4 = null;
        }
        recyclerView4.setAdapter(unsubscribefromtracingstatechanges4);
        int i4 = IAuthTabCallback_Parcel + 51;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void asBinder() throws Throwable {
        int i = 2 % 2;
        String string = getString(R.string.app_verify_session___9e37dd37a6);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        String string2 = getString(R.string.auth_consent_sheet_term_1);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges = null;
        a(null, null, new byte[]{-106, ISOFileInfo.SECURITY_ATTR_EXP, -120, -126, -110, -126, -120, -126, -124, -106, -103, -124, ISOFileInfo.SECURITY_ATTR_COMPACT, -104, -112, -101, -106, ISOFileInfo.SECURITY_ATTR_EXP, -120, -126, ISOFileInfo.FCI_EXT, -119, -120, -102, -120, -126, -106, -112, ISOFileInfo.CHANNEL_SECURITY, -103, ISOFileInfo.CHANNEL_SECURITY, -112, -126, ISOFileInfo.FCI_EXT, -104, -105, -112, -126, -106, -120, -122, -126, -106, -112, ISOFileInfo.SECURITY_ATTR_COMPACT, -112, -112, -104, -105, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.LCS_BYTE, -124, -124, ISOFileInfo.SECURITY_ATTR_EXP, -126, -122, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + CertificateBody.profileType, objArr);
        ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android = new ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android(1352L, string2, ((String) objArr[0]).intern());
        String string3 = getString(R.string.auth_consent_sheet_term_2);
        Intrinsics.checkNotNullExpressionValue(string3, BuildConfig.FLAVOR);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.SECURITY_ATTR_EXP, -102, -106, -103, -99, ISOFileInfo.FCI_EXT, -106, ISOFileInfo.SECURITY_ATTR_EXP, -124, -104, -112, -100, -106, ISOFileInfo.SECURITY_ATTR_EXP, -120, -126, ISOFileInfo.FCI_EXT, -119, -120, -102, -120, -126, -106, -112, ISOFileInfo.CHANNEL_SECURITY, -103, ISOFileInfo.CHANNEL_SECURITY, -112, -126, ISOFileInfo.FCI_EXT, -104, -105, -112, -126, -106, -120, -122, -126, -106, -112, ISOFileInfo.SECURITY_ATTR_COMPACT, -112, -112, -104, -105, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.LCS_BYTE, -124, -124, ISOFileInfo.SECURITY_ATTR_EXP, -126, -122, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, 126 - ExpandableListView.getPackedPositionChild(0L), objArr2);
        ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android2 = new ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android(1336L, string3, ((String) objArr2[0]).intern());
        String string4 = getString(R.string.auth_consent_sheet_term_3);
        Intrinsics.checkNotNullExpressionValue(string4, BuildConfig.FLAVOR);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-120, -120, -100, -106, ISOFileInfo.SECURITY_ATTR_EXP, -120, -126, ISOFileInfo.FCI_EXT, -119, -120, -102, -120, -126, -106, -112, ISOFileInfo.CHANNEL_SECURITY, -103, ISOFileInfo.CHANNEL_SECURITY, -112, -126, ISOFileInfo.FCI_EXT, -104, -105, -112, -126, -106, -120, -122, -126, -106, -112, ISOFileInfo.SECURITY_ATTR_COMPACT, -112, -112, -104, -105, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.LCS_BYTE, -124, -124, ISOFileInfo.SECURITY_ATTR_EXP, -126, -122, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, 127 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr3);
        ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android3 = new ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android(1338L, string4, ((String) objArr3[0]).intern());
        String string5 = getString(R.string.auth_consent_sheet_term_4);
        Intrinsics.checkNotNullExpressionValue(string5, BuildConfig.FLAVOR);
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-124, ISOFileInfo.SECURITY_ATTR_COMPACT, -104, -112, -101, -106, ISOFileInfo.SECURITY_ATTR_EXP, -120, -126, ISOFileInfo.FCI_EXT, -119, -120, -102, -120, -126, -106, -112, ISOFileInfo.CHANNEL_SECURITY, -103, ISOFileInfo.CHANNEL_SECURITY, -112, -126, ISOFileInfo.FCI_EXT, -104, -105, -112, -126, -106, -120, -122, -126, -106, -112, ISOFileInfo.SECURITY_ATTR_COMPACT, -112, -112, -104, -105, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.LCS_BYTE, -124, -124, ISOFileInfo.SECURITY_ATTR_EXP, -126, -122, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, (ViewConfiguration.getTapTimeout() >> 16) + CertificateBody.profileType, objArr4);
        ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 = new ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0(string, false, CollectionsKt.listOf(new ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android[]{reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android, reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android2, reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android3, new ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android(1334L, string5, ((String) objArr4[0]).intern())}));
        this.IAuthTabCallbackStub.clear();
        this.onNavigationEvent.clear();
        this.IAuthTabCallbackStub.add(reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0);
        this.onNavigationEvent.add(reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0);
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges2 = this.IAuthTabCallbackDefault;
        if (unsubscribefromtracingstatechanges2 == null) {
            int i2 = IAuthTabCallback_Parcel + 67;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            int i4 = getInterfaceDescriptor + 27;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            unsubscribefromtracingstatechanges2 = null;
        }
        unsubscribefromtracingstatechanges2.onExtraCallback(onExtraCallback(CollectionsKt.listOf(reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0)));
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges3 = this.onWarmupCompleted;
        if (unsubscribefromtracingstatechanges3 == null) {
            int i6 = getInterfaceDescriptor + 33;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
        } else {
            unsubscribefromtracingstatechanges = unsubscribefromtracingstatechanges3;
        }
        unsubscribefromtracingstatechanges.onExtraCallback(onExtraCallback(CollectionsKt.listOf(reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges;
        boolean z = false;
        VerifySessionGuardianAgreementFragment verifySessionGuardianAgreementFragment = (VerifySessionGuardianAgreementFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            unsubscribefromtracingstatechanges = verifySessionGuardianAgreementFragment.onWarmupCompleted;
            int i3 = 44 / 0;
            if (unsubscribefromtracingstatechanges == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                unsubscribefromtracingstatechanges = null;
            }
        } else {
            unsubscribefromtracingstatechanges = verifySessionGuardianAgreementFragment.onWarmupCompleted;
            if (unsubscribefromtracingstatechanges == null) {
            }
        }
        if (unsubscribefromtracingstatechanges.onNavigationEvent()) {
            unsubscribeFromTracingStateChanges unsubscribefromtracingstatechanges2 = verifySessionGuardianAgreementFragment.IAuthTabCallbackDefault;
            if (unsubscribefromtracingstatechanges2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                unsubscribefromtracingstatechanges2 = null;
            }
            if (unsubscribefromtracingstatechanges2.onNavigationEvent()) {
                int i4 = IAuthTabCallback_Parcel + 47;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
        }
        ((verifyValidity) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{verifySessionGuardianAgreementFragment}, 1593284653, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1593284652, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).onWarmupCompleted.asInterface().setEnabled(z);
        return null;
    }

    private final List<reportTimeStamp> onExtraCallback(List<ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0> list) {
        int i = 2 % 2;
        List<ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0> list2 = list;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 : list2) {
            String strIAuthTabCallback = reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.IAuthTabCallback();
            List<ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android> listOnExtraCallback = reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.onExtraCallback();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallback, i2));
            for (ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android : listOnExtraCallback) {
                arrayList2.add(new subscribeToTracingStateChanges(reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android.IAuthTabCallback(), reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android.onNavigationEvent(), null, false, null, 28, null));
            }
            arrayList.add(new PerformanceTracerTracingStateCallback(strIAuthTabCallback, CollectionsKt.toMutableList(arrayList2), !reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.onExtraCallbackWithResult(), reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.onExtraCallbackWithResult()));
            int i3 = IAuthTabCallback_Parcel + 99;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            i2 = 10;
        }
        return arrayList;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onTransact;
        char c = '0';
        if (cArr3 != null) {
            int i4 = $10 + 113;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf(BuildConfig.FLAVOR, c, 0, 0)), 76 - TextUtils.indexOf(BuildConfig.FLAVOR, c, 0, 0), 20952 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asBinder)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 76, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i5 = 1052772399;
            if (access100) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $11 + 49;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] % iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 63, (Process.myPid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 63 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    i5 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!access000) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i7 = $11 + 87;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 63 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 12215 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final void IAuthTabCallback() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 505975149, iOnExtraCallbackWithResult2, -505975149, iOnExtraCallbackWithResult3);
    }

    private final verifyValidity onExtraCallback() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (verifyValidity) onExtraCallbackWithResult(iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1593284653, iOnExtraCallbackWithResult2, -1593284652, iOnExtraCallbackWithResult3);
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
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

    static void onWarmupCompleted() {
        onTransact = new char[]{32265, 32261, 32257, 32262, 32511, 32450, 32272, 32264, 32278, 32451, 32258, 32268, 32454, 32277, 32460, 32276, 32271, 32260, 32448, 32491, 32500, 32259, 32266, 32263, 32488, 32267, 32485, 32481, 32269};
        asBinder = -1184334159;
        access000 = true;
        access100 = true;
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Function0 function0, Fragment fragment) {
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

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }
}
