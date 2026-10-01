package im.toss.features.loan.refinancing.funnel.intro;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.ads.zzgc;
import com.iap.ac.config.lite.preset.PresetParser;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.component.anim.logo.AnimateLogoSwapView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda30;
import o.PageRenderReadyListener;
import o.PixelCopyCompatPixelCopyStubExternalSyntheticLambda0;
import o.PluginInfo;
import o.RVWebSocketManager1;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextKtExternalSyntheticLambda7;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TraceProtocolType;
import o._string;
import o.addAllCommandLine;
import o.clearWrite;
import o.getKekid;
import o.getProxyokhttp;
import o.getTinyAppStartupBaseTime;
import o.preFillDefault;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.trackCheckout;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.IntroErrorReason;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingInterruptFragment extends Hilt_LoanRefinancingInterruptFragment {
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static int IAuthTabCallback_Parcel;
    private static long access100;
    public static final int onExtraCallback;
    private final Lazy asBinder;

    @Inject
    public trackCheckout notificationHelper;
    private Function0<Unit> onTransact;
    private static final byte[] $$a = {73, 121, -48, -56};
    private static final int $$b = 153;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int access000 = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private final TextKtExternalSyntheticLambda7 onWarmupCompleted = new TextKtExternalSyntheticLambda7(Reflection.getOrCreateKotlinClass(getTinyAppStartupBaseTime.class), new onExtraCallbackWithResult(this));
    private int onExtraCallbackWithResult = R.layout.fragment_loan_refinancing_interrupt;
    private final PageRenderReadyListener onNavigationEvent = preFillDefault.IAuthTabCallback(this, onWarmupCompleted.onNavigationEvent);

    static final /* synthetic */ class onExtraCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        onExtraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onWarmupCompleted + 1;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 85;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            clearWrite functionDelegate = getFunctionDelegate();
            clearWrite functionDelegate2 = ((FunctionAdapter) obj).getFunctionDelegate();
            if (i6 != 0) {
                return Intrinsics.areEqual(functionDelegate, functionDelegate2);
            }
            Intrinsics.areEqual(functionDelegate, functionDelegate2);
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onWarmupCompleted + 107;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = IAuthTabCallback + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static String $$c(byte b, byte b2, short s) {
        int i = b * 4;
        int i2 = (b2 * 2) + 97;
        byte[] bArr = $$a;
        int i3 = s + 4;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = i + (-i3);
            i3 = i3;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            int i6 = i3 + 1;
            if (i5 == i) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i6];
            i3 = i6;
            i4 = i5;
        }
    }

    static {
        IAuthTabCallback_Parcel = 0;
        asBinder();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingInterruptFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingInterruptBinding;", 0)};
        onExtraCallback = 8;
        int i = getInterfaceDescriptor + 13;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingInterruptFragment, th);
        int i4 = IAuthTabCallbackStubProxy + 71;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TraceProtocolType traceProtocolType, LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, View view) {
        int i = 2 % 2;
        int i2 = access000 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(traceProtocolType, loanRefinancingInterruptFragment, view);
        }
        onExtraCallback(traceProtocolType, loanRefinancingInterruptFragment, view);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i2 | i4 | i3);
        int i8 = ~i4;
        int i9 = (~(i8 | i3)) | (~((~i3) | i2));
        int i10 = (~(i3 | (~i2))) | i8;
        int i11 = i2 + i4 + i + ((-2044576983) * i6) + (1743660113 * i5);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i2) - 713031680) + (164951516 * i4) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i) + (689963008 * i6) + ((-299892736) * i5) + ((-1081737216) * i12);
        int i14 = ((i2 * 2048727874) - 782056376) + (i4 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i * 2048728315) + (i6 * 2142076211) + (i5 * (-1448904853)) + (i12 * 1885470720);
        switch (i13 + (i14 * i14 * (-1618345984))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                LoanRefinancingInterruptFragment loanRefinancingInterruptFragment = (LoanRefinancingInterruptFragment) objArr[0];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i15 = 2 % 2;
                int i16 = IAuthTabCallbackStubProxy + 121;
                access000 = i16 % 128;
                int i17 = i16 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingInterruptFragment, setDetectableSize);
                int i18 = access000 + 73;
                IAuthTabCallbackStubProxy = i18 % 128;
                int i19 = i18 % 2;
                return unitOnExtraCallbackWithResult;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return onTransact(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ void onExtraCallback(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(loanRefinancingInterruptFragment, view);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingInterruptFragment, view);
        int i4 = access000 + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingInterruptFragment, unit);
        int i4 = access000 + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            return (Unit) onExtraCallback(new Object[]{str, loanRefinancingInterruptFragment, setDetectableSize}, _string.onNavigationEvent.IAuthTabCallback(), -1350689330, iIAuthTabCallback, 1350689331, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, String str, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(loanRefinancingInterruptFragment, str, view);
        }
        IAuthTabCallback(loanRefinancingInterruptFragment, str, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(loanRefinancingInterruptFragment, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(loanRefinancingInterruptFragment, setDetectableSize);
        int i3 = access000 + 49;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingInterruptFragment, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 115;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = access000 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(loanRefinancingInterruptFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingInterruptFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = access000 + 63;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000 + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return 1251633L;
    }

    public LoanRefinancingInterruptFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(new onNavigationEvent(this)));
        this.asBinder = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanRefinancingIntroViewModel.class), new asInterface(lazyOnNavigationEvent), new asBinder(null, lazyOnNavigationEvent), new IAuthTabCallbackStub(this, lazyOnNavigationEvent));
    }

    private final getTinyAppStartupBaseTime IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getTinyAppStartupBaseTime gettinyappstartupbasetime = (getTinyAppStartupBaseTime) this.onWarmupCompleted.getValue();
        if (i3 == 0) {
            return gettinyappstartupbasetime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 105;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, TraceProtocolType> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        onWarmupCompleted() {
            super(1, TraceProtocolType.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingInterruptBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallback = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 != 0) {
                return onNavigationEvent(view);
            }
            onNavigationEvent(view);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final TraceProtocolType onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            TraceProtocolType traceProtocolTypeOnNavigationEvent = TraceProtocolType.onNavigationEvent(view);
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return traceProtocolTypeOnNavigationEvent;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<Bundle> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Fragment onWarmupCompleted;

        public onExtraCallbackWithResult(Fragment fragment) {
            this.onWarmupCompleted = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Bundle bundleIAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return bundleIAuthTabCallback;
        }

        public final Bundle IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Bundle arguments = this.onWarmupCompleted.getArguments();
            if (arguments != null) {
                int i4 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.onWarmupCompleted + " has null arguments");
        }
    }

    private final TraceProtocolType asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TraceProtocolType traceProtocolTypeOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(this, IAuthTabCallback[0]);
        int i4 = access000 + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return traceProtocolTypeOnNavigationEvent;
    }

    private final LoanRefinancingIntroViewModel onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingIntroViewModel loanRefinancingIntroViewModel = (LoanRefinancingIntroViewModel) this.asBinder.getValue();
        int i4 = IAuthTabCallbackStubProxy + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return loanRefinancingIntroViewModel;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        trackCheckout trackcheckout = ((LoanRefinancingInterruptFragment) objArr[0]).notificationHelper;
        if (trackcheckout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = access000 + 19;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return trackcheckout;
        }
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoanRefinancingAppScreen", "LoanRefinancingInterruptFragment launched", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        onTransact().onNavigationEvent(access100());
        newAuthTabSession();
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallback(new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback(), -1421402611, iIAuthTabCallback, 1421402615, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
        int i4 = access000 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Unit newAuthTabSession() throws Throwable {
        String strIntern;
        String string;
        String string2;
        String string3;
        int i = 2 % 2;
        TraceProtocolType traceProtocolTypeAsInterface = asInterface();
        Object obj = null;
        if (traceProtocolTypeAsInterface == null) {
            return null;
        }
        int i2 = access000 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IntroErrorReason introErrorReasonOnExtraCallback = IAuthTabCallbackStub().onExtraCallback();
        if (introErrorReasonOnExtraCallback == null || (strIntern = introErrorReasonOnExtraCallback.IAuthTabCallback()) == null) {
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getMinimumFlingVelocity() >> 16, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 54, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        IAuthTabCallback(strIntern);
        TdsBottomCtaV1View tdsBottomCtaV1View = traceProtocolTypeAsInterface.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        tdsBottomCtaV1View.setVisibility(0);
        TdsTopV1View tdsTopV1View = traceProtocolTypeAsInterface.getInterfaceDescriptor;
        if (introErrorReasonOnExtraCallback != null) {
            int i4 = IAuthTabCallbackStubProxy + 87;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            string = introErrorReasonOnExtraCallback.onWarmupCompleted();
            if (string == null) {
                string = getString(R.string.loan_refinancing_impossible_now);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
        }
        tdsTopV1View.setUpperText(string);
        if (introErrorReasonOnExtraCallback != null) {
            int i6 = IAuthTabCallbackStubProxy + 1;
            access000 = i6 % 128;
            if (i6 % 2 != 0) {
                StringsKt.isBlank(introErrorReasonOnExtraCallback.onExtraCallback());
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(introErrorReasonOnExtraCallback.onExtraCallback())) {
                traceProtocolTypeAsInterface.getInterfaceDescriptor.setLowerText(PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.onExtraCallback(introErrorReasonOnExtraCallback.onExtraCallback(), 0, (Html.ImageGetter) null, (Html.TagHandler) null));
            }
        } else {
            if (!StringsKt.isBlank(IAuthTabCallbackStub().onExtraCallbackWithResult())) {
                int i7 = IAuthTabCallbackStubProxy + 31;
                access000 = i7 % 128;
                if (i7 % 2 != 0) {
                    string2 = IAuthTabCallbackStub().onExtraCallbackWithResult();
                    int i8 = 95 / 0;
                } else {
                    string2 = IAuthTabCallbackStub().onExtraCallbackWithResult();
                }
            } else if (StringsKt.isBlank(access100().access100())) {
                string2 = getString(R.string.loan_refinancing_possible_time_guide);
                Intrinsics.checkNotNullExpressionValue(string2, "");
            } else {
                string2 = access100().access100();
            }
            traceProtocolTypeAsInterface.getInterfaceDescriptor.setLowerText(PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.onExtraCallback(string2, 0, (Html.ImageGetter) null, (Html.TagHandler) null));
        }
        isEngagementSignalsApiAvailable();
        postMessage();
        if (introErrorReasonOnExtraCallback != null) {
            int i9 = access000 + 101;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            string3 = introErrorReasonOnExtraCallback.onNavigationEvent();
            if (string3 == null) {
                string3 = getString(R.string.loan_refinancing_alarm_on_possible_time);
                Intrinsics.checkNotNullExpressionValue(string3, "");
            }
        }
        return (Unit) onExtraCallback(new Object[]{this, string3}, _string.onNavigationEvent.IAuthTabCallback(), 1880922195, _string.onNavigationEvent.IAuthTabCallback(), -1880922190, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingInterruptFragment loanRefinancingInterruptFragment = (LoanRefinancingInterruptFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        TraceProtocolType traceProtocolTypeAsInterface = loanRefinancingInterruptFragment.asInterface();
        if (traceProtocolTypeAsInterface == null) {
            return null;
        }
        int i2 = IAuthTabCallbackStubProxy + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (loanRefinancingInterruptFragment.onActivityResized()) {
            TdsBottomCtaV1View tdsBottomCtaV1View = traceProtocolTypeAsInterface.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.loan_common_confirmed, new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda1(loanRefinancingInterruptFragment), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        } else {
            TdsBottomCtaV1View tdsBottomCtaV1View2 = traceProtocolTypeAsInterface.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, str, new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda2(loanRefinancingInterruptFragment, str), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            int i4 = IAuthTabCallbackStubProxy + 43;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("cta_title", loanRefinancingInterruptFragment.getString(R.string.loan_common_confirmed));
            setDetectableSize.onExtraCallback("business_yn", loanRefinancingInterruptFragment.writeTypedObject());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("cta_title", loanRefinancingInterruptFragment.getString(R.string.loan_common_confirmed));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingInterruptFragment.writeTypedObject());
        int i3 = 88 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1251637L, false, (String) null, (Map) null, new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda4(loanRefinancingInterruptFragment), 14, (Object) null);
        loanRefinancingInterruptFragment.onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        float f;
        int i3;
        Object obj;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            f = 0.0f;
            i3 = -1401950695;
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = $10 + 79;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 59697), TextUtils.getCapsMode("", 0, 0) + 17, 10974 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(access100), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "") + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49123), View.MeasureSpec.getMode(0) + 44, MotionEvent.axisFromString("") + 1495, -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = $11 + 3;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 / 3;
                }
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i10 = $10 + 49;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.argb(0, 0, 0, 0)), 44 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), 1493 - MotionEvent.axisFromString(""), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(obj, objArr5);
                int i11 = 96 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 49124), 43 - TextUtils.indexOf((CharSequence) "", '0'), 1494 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    obj = null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            f = 0.0f;
            i3 = -1401950695;
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        LoanRefinancingInterruptFragment loanRefinancingInterruptFragment = (LoanRefinancingInterruptFragment) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("cta_title", str);
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingInterruptFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, String str, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1251637L, false, (String) null, (Map) null, new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda10(str, loanRefinancingInterruptFragment), 14, (Object) null);
        loanRefinancingInterruptFragment.requestPostMessageChannel();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent extends Lambda implements Function0<Fragment> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnNavigationEvent = onNavigationEvent();
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return fragmentOnNavigationEvent;
        }

        public final Fragment onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 69;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Fragment fragment = this.$this_viewModels;
            int i4 = i2 + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return fragment;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            }
            throw null;
        }
    }

    private final Unit isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        TraceProtocolType traceProtocolTypeAsInterface = asInterface();
        if (traceProtocolTypeAsInterface == null) {
            return null;
        }
        BaseTextView baseTextViewICustomTabsCallbackDefault = traceProtocolTypeAsInterface.asBinder.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            int i2 = IAuthTabCallbackStubProxy + 119;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            baseTextViewICustomTabsCallbackDefault.setPadding(baseTextViewICustomTabsCallbackDefault.getPaddingLeft(), baseTextViewICustomTabsCallbackDefault.getPaddingTop(), varyMatches.onNavigationEvent(48, displayMetrics), baseTextViewICustomTabsCallbackDefault.getPaddingBottom());
        }
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = traceProtocolTypeAsInterface.asBinder.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            int i4 = access000 + 111;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            baseTextViewICustomTabsCallbackStubProxy.setPadding(baseTextViewICustomTabsCallbackStubProxy.getPaddingLeft(), baseTextViewICustomTabsCallbackStubProxy.getPaddingTop(), varyMatches.onNavigationEvent(48, displayMetrics2), baseTextViewICustomTabsCallbackStubProxy.getPaddingBottom());
        }
        TdsListRowV1View tdsListRowV1View = traceProtocolTypeAsInterface.asBinder;
        int i6 = R.string.loan_inquiry_on_number_of_bank;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        tdsListRowV1View.setCenterText2(getString(i6, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        ConvertByteArrayToFloatArray.onExtraCallback(1280857L, false, (String) null, (Map) null, new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda5(this), 14, (Object) null);
        traceProtocolTypeAsInterface.asBinder.setOnClickListener(new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda6(this));
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i2 = onWarmupCompleted + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null || (defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory()) == null) {
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                return defaultViewModelProviderFactory2;
            }
            int i4 = onWarmupCompleted + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelProviderFactory;
        }
    }

    public static final class asBinder extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
                int i3 = 99 / 0;
            } else {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
            }
            int i4 = IAuthTabCallback + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r2
          0x001c: PHI (r2v3 kotlin.jvm.functions.Function0) = (r2v2 kotlin.jvm.functions.Function0), (r2v8 kotlin.jvm.functions.Function0) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            Function0 function0;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 33;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                function0 = this.$extrasProducer;
                int i4 = 65 / 0;
                if (function0 != null) {
                    int i5 = i2 + 103;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        textFieldKeyInputExternalSyntheticLambda6.hashCode();
                        throw null;
                    }
                    AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                    if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                }
            } else {
                function0 = this.$extrasProducer;
                if (function0 != null) {
                }
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            textFieldKeyInputExternalSyntheticLambda6 = androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? (TextFieldKeyInputExternalSyntheticLambda6) androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent : null;
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback onextracallback = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            int i6 = onNavigationEvent + 53;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return onextracallback;
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = IAuthTabCallback + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    private static final Unit IAuthTabCallback(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i4 = R.string.loan_inquiry_on_number_of_bank;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingInterruptFragment.getString(i4, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingInterruptFragment.getString(R.string.loan_question_want_to_find_new_loan_low));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingInterruptFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStubProxy + 73;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, View view) {
        int i = 2 % 2;
        loanRefinancingInterruptFragment.onWarmupCompleted("refinancing_loan__restricted");
        ConvertByteArrayToFloatArray.onExtraCallback(1251635L, false, (String) null, (Map) null, new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda9(loanRefinancingInterruptFragment), 14, (Object) null);
        int i2 = access000 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onTransact(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i4 = R.string.loan_inquiry_on_number_of_bank;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingInterruptFragment.getString(i4, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingInterruptFragment.getString(R.string.loan_question_want_to_find_new_loan_low));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingInterruptFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStubProxy + 125;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final void postMessage() {
        AnimateLogoSwapView animateLogoSwapView;
        int i = 2 % 2;
        int i2 = access000 + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface();
            throw null;
        }
        TraceProtocolType traceProtocolTypeAsInterface = asInterface();
        if (traceProtocolTypeAsInterface == null || (animateLogoSwapView = traceProtocolTypeAsInterface.IAuthTabCallback_Parcel) == null) {
            return;
        }
        List listOnWarmupCompleted = ImagePipelineExperimentsBuilderExternalSyntheticLambda30.INSTANCE.onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            arrayList.add(new getProxyokhttp((String) it.next(), new PluginInfo(40.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null)));
        }
        animateLogoSwapView.onExtraCallbackWithResult(arrayList);
        int i3 = access000 + 95;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    private final Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface();
            obj.hashCode();
            throw null;
        }
        TraceProtocolType traceProtocolTypeAsInterface = asInterface();
        if (traceProtocolTypeAsInterface == null) {
            return null;
        }
        int i3 = access000 + 101;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (StringsKt.endsWith$default(str, PresetParser.FILE_EXT, false, 2, (Object) null)) {
            int i5 = access000 + 23;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            LottieAnimationView lottieAnimationView = traceProtocolTypeAsInterface.asInterface;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(0);
            TdsImageView tdsImageView = traceProtocolTypeAsInterface.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(8);
            traceProtocolTypeAsInterface.asInterface.setAnimationFromUrl(str);
        } else {
            LottieAnimationView lottieAnimationView2 = traceProtocolTypeAsInterface.asInterface;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
            lottieAnimationView2.setVisibility(8);
            TdsImageView tdsImageView2 = traceProtocolTypeAsInterface.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            tdsImageView2.setVisibility(0);
            TdsImageView tdsImageView3 = traceProtocolTypeAsInterface.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            TdsImageView.setImage$default(tdsImageView3, str, (Function1) null, (Function1) null, 6, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStubProxy + 35;
        access000 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 57 / 0;
        }
        return unit;
    }

    private final void requestPostMessageChannel() {
        int i = 2 % 2;
        Object[] objArr = {access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, "STD_7171_LOAN_REFINANCING_NOTIFICATION", 216L, new RVWebSocketManager1(), (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr), "refinancing_loan_comparison", (Function0) null, new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda3(this), 32, (Object) null);
        int i2 = access000 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int i2 = access000 + 13;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
                onExtraCallback(new Object[]{loanRefinancingInterruptFragment}, _string.onNavigationEvent.IAuthTabCallback(), 101279257, iIAuthTabCallback, -101279251, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
                throw null;
            }
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            onExtraCallback(new Object[]{loanRefinancingInterruptFragment}, _string.onNavigationEvent.IAuthTabCallback(), 101279257, iIAuthTabCallback2, -101279251, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
            int i3 = access000 + 31;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        if ((r0 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        r9 = o._string.onNavigationEvent.IAuthTabCallback();
        r0 = (o.trackCheckout) onExtraCallback(new java.lang.Object[]{r13}, o._string.onNavigationEvent.IAuthTabCallback(), 2126521213, r9, -2126521213, o._string.onNavigationEvent.IAuthTabCallback(), o._string.onNavigationEvent.IAuthTabCallback());
        r13 = r13.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        r0.asBinder(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
    
        r9 = o._string.onNavigationEvent.IAuthTabCallback();
        r0 = (o.trackCheckout) onExtraCallback(new java.lang.Object[]{r13}, o._string.onNavigationEvent.IAuthTabCallback(), 2126521213, r9, -2126521213, o._string.onNavigationEvent.IAuthTabCallback(), o._string.onNavigationEvent.IAuthTabCallback());
        r13 = r13.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        r0.asBinder(r13);
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d8, code lost:
    
        r13.onTransact().asBinder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00df, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
    
        if (r2.onExtraCallback(r6) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0073, code lost:
    
        if (r0.onExtraCallback(r2) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
    
        r0 = im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment.IAuthTabCallbackStubProxy + 45;
        im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment.access000 = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        LoanRefinancingInterruptFragment loanRefinancingInterruptFragment = (LoanRefinancingInterruptFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            trackCheckout trackcheckout = (trackCheckout) onExtraCallback(new Object[]{loanRefinancingInterruptFragment}, _string.onNavigationEvent.IAuthTabCallback(), 2126521213, iIAuthTabCallback, -2126521213, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
            Context contextRequireContext = loanRefinancingInterruptFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int i3 = 45 / 0;
        } else {
            int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
            trackCheckout trackcheckout2 = (trackCheckout) onExtraCallback(new Object[]{loanRefinancingInterruptFragment}, _string.onNavigationEvent.IAuthTabCallback(), 2126521213, iIAuthTabCallback2, -2126521213, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
            Context contextRequireContext2 = loanRefinancingInterruptFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        }
    }

    private static final Unit onWarmupCompleted(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, Unit unit) {
        int i = 2 % 2;
        int i2 = access000 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingInterruptFragment.prefetch();
        Unit unit2 = Unit.INSTANCE;
        int i4 = access000 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanRefinancingInterruptFragment loanRefinancingInterruptFragment = (LoanRefinancingInterruptFragment) objArr[0];
        int i = 2 % 2;
        loanRefinancingInterruptFragment.onTransact().onNavigationEvent().observe(loanRefinancingInterruptFragment.getViewLifecycleOwner(), new onExtraCallback(new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda7(loanRefinancingInterruptFragment)));
        loanRefinancingInterruptFragment.onTransact().onExtraCallback().observe(loanRefinancingInterruptFragment.getViewLifecycleOwner(), new onExtraCallback(new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda8(loanRefinancingInterruptFragment)));
        int i2 = IAuthTabCallbackStubProxy + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, Throwable th) {
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        int i = 2 % 2;
        int i2 = access000 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            loanRefinancingInterruptFragment.asInterface();
            throw null;
        }
        TraceProtocolType traceProtocolTypeAsInterface = loanRefinancingInterruptFragment.asInterface();
        if (traceProtocolTypeAsInterface != null) {
            int i3 = IAuthTabCallbackStubProxy + 25;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                TdsBottomCtaV1View tdsBottomCtaV1View = traceProtocolTypeAsInterface.onNavigationEvent;
                throw null;
            }
            TdsBottomCtaV1View tdsBottomCtaV1View2 = traceProtocolTypeAsInterface.onNavigationEvent;
            if (tdsBottomCtaV1View2 != null && (tdsButtonV1ViewAsInterface = tdsBottomCtaV1View2.asInterface()) != null) {
                int i4 = access000 + 93;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    tdsButtonV1ViewAsInterface.setLoading(true);
                } else {
                    tdsButtonV1ViewAsInterface.setLoading(true);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (o.EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(requireContext()).onWarmupCompleted() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r1 = r1.onWarmupCompleted();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r4 = getString(im.toss.features.loan.ui.R.string.loan_refinancing_message_alarm_on_possible_time);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
        im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent.onNavigationEvent(new im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent(r1, r4), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (java.lang.Object) null).onNavigationEvent();
        r4 = o._string.onNavigationEvent.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        return (kotlin.Unit) onExtraCallback(new java.lang.Object[]{r13}, o._string.onNavigationEvent.IAuthTabCallback(), -1392826804, r4, 1392826806, o._string.onNavigationEvent.IAuthTabCallback(), o._string.onNavigationEvent.IAuthTabCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        r9 = o._string.onNavigationEvent.IAuthTabCallback();
        r0 = (o.trackCheckout) onExtraCallback(new java.lang.Object[]{r13}, o._string.onNavigationEvent.IAuthTabCallback(), 2126521213, r9, -2126521213, o._string.onNavigationEvent.IAuthTabCallback(), o._string.onNavigationEvent.IAuthTabCallback());
        r1 = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r0.asBinder(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ad, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ae, code lost:
    
        r1 = im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment.access000 + 41;
        im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment.IAuthTabCallbackStubProxy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r4 = im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment.access000 + 81;
        im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment.IAuthTabCallbackStubProxy = r4 % 128;
        r4 = r4 % 2;
        r1.onNavigationEvent.asInterface().setLoading(false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Unit prefetch() {
        TraceProtocolType traceProtocolTypeAsInterface;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            traceProtocolTypeAsInterface = asInterface();
            int i3 = 27 / 0;
        } else {
            traceProtocolTypeAsInterface = asInterface();
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanRefinancingInterruptFragment loanRefinancingInterruptFragment = (LoanRefinancingInterruptFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            loanRefinancingInterruptFragment.asInterface();
            throw null;
        }
        TraceProtocolType traceProtocolTypeAsInterface = loanRefinancingInterruptFragment.asInterface();
        if (traceProtocolTypeAsInterface == null) {
            return null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = traceProtocolTypeAsInterface.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.loan_refinancing_will_alarm_on_possible_time, new LoanRefinancingInterruptFragment$.ExternalSyntheticLambda0(traceProtocolTypeAsInterface, loanRefinancingInterruptFragment), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.XLARGE, (TdsButtonV1View.IAuthTabCallback) null, 8, (DefaultConstructorMarker) null), false, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = access000 + 105;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(TraceProtocolType traceProtocolType, LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConstraintLayout constraintLayoutOnWarmupCompleted = traceProtocolType.onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
        String string = loanRefinancingInterruptFragment.getString(R.string.loan_refinancing_message_alarm_on_possible_time);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(constraintLayoutOnWarmupCompleted, string), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        o.RippleNode.onNavigationEvent(r3).onNavigationEvent(im.toss.features.loan.ui.R.id.loanRefinancingIntroFragment);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        o.RippleNode.onNavigationEvent(r3).onNavigationEvent(im.toss.features.loan.ui.R.id.loanRefinancingIntroFragment);
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        o.RippleNode.onNavigationEvent(r3).onNavigationEvent(im.toss.features.loan.ui.R.id.loanRefinancingIntroWebFragment);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (access100().onActivityResized() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (access100().onActivityResized() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment.IAuthTabCallbackStubProxy + 35;
        im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingInterruptFragment.access000 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        Function0<Unit> function0 = this.onTransact;
        if (function0 != null) {
            int i2 = access000 + 85;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
        }
        this.onTransact = null;
        int i4 = IAuthTabCallbackStubProxy + 119;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(new Object[]{loanRefinancingInterruptFragment, setDetectableSize}, _string.onNavigationEvent.IAuthTabCallback(), -496612409, iIAuthTabCallback, 496612412, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    private final Unit onNavigationEvent(String str) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(new Object[]{this, str}, _string.onNavigationEvent.IAuthTabCallback(), 1880922195, iIAuthTabCallback, -1880922190, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(String str, LoanRefinancingInterruptFragment loanRefinancingInterruptFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(new Object[]{str, loanRefinancingInterruptFragment, setDetectableSize}, _string.onNavigationEvent.IAuthTabCallback(), -1350689330, iIAuthTabCallback, 1350689331, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    private final void newSession() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallback(new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback(), -1421402611, iIAuthTabCallback, 1421402615, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    private final void newSessionWithExtras() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallback(new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback(), 101279257, iIAuthTabCallback, -101279251, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    private final Unit requestPostMessageChannelWithExtras() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (Unit) onExtraCallback(new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback(), -1392826804, iIAuthTabCallback, 1392826806, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    public final trackCheckout onExtraCallback() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        return (trackCheckout) onExtraCallback(new Object[]{this}, _string.onNavigationEvent.IAuthTabCallback(), 2126521213, iIAuthTabCallback, -2126521213, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    static void asBinder() {
        IAuthTabCallbackDefault = new char[]{60860, 28880, 55104, 13812, 39015, 65246, 23899, 41963, 1575, 25936, 52181, 11888, 36093, 4871, 29146, 54320, 15035, 39383, 64583, 17066, 41341, 1929, 27227, 51368, 12091, 45648, 4288, 30573, 54769, 14359, 40665, 64807, 17339, 42697, 1369, 27627, 52858, 11467, 45841, 4534, 29734, 56139, 14790, 39977, 58022, 16713, 42887, 2612, 26811, 53200, 21018, 45294, 5991, 30091, 55322};
        access100 = 1353792536622559396L;
    }
}
