package im.toss.features.loan.refinancing.funnel.schedule;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.iap.ac.config.lite.preset.PresetParser;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.schedule.LoanRefinancingSchedulePreScreenFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.component.anim.logo.AnimateLogoSwapView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.ConvertByteArrayToFloatArray;
import o.DERSet;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda22;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda30;
import o.PageContext;
import o.PixelCopyCompatPixelCopyStubExternalSyntheticLambda0;
import o.PluginInfo;
import o.RippleNode;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextKtExternalSyntheticLambda7;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda17;
import o.addAllCommandLine;
import o.clearWrite;
import o.getHostnameVerifierokhttp;
import o.getKekid;
import o.getProxyokhttp;
import o.initTraceDebugEngine;
import o.preFillDefault;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.setTinyAppStartupBaseTime;
import o.trackCheckout;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.IntroErrorReason;
import viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingSchedulePreScreenFragment extends Hilt_LoanRefinancingSchedulePreScreenFragment {
    private static int IAuthTabCallback_Parcel = 0;
    private static int asBinder = 1;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact;
    private Function0<Unit> IAuthTabCallbackDefault;

    @Inject
    public trackCheckout notificationHelper;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted = {new PropertyReference1Impl<>(LoanRefinancingSchedulePreScreenFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingSchedulePreScreenBinding;", 0)};
    public static final int onNavigationEvent = 8;
    private final TextKtExternalSyntheticLambda7 IAuthTabCallback = new TextKtExternalSyntheticLambda7(Reflection.getOrCreateKotlinClass(setTinyAppStartupBaseTime.class), new onNavigationEvent(this));
    private int onExtraCallbackWithResult = R.layout.fragment_loan_refinancing_schedule_pre_screen;
    private final PageContext onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onExtraCallbackWithResult);

    static final /* synthetic */ class onWarmupCompleted implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final /* synthetic */ Function1 onWarmupCompleted;

        onWarmupCompleted(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i2 = IAuthTabCallback + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i4 = IAuthTabCallback + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.onWarmupCompleted;
            int i5 = i3 + 13;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 95 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = IAuthTabCallback + 53;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.invoke(obj);
                int i3 = 39 / 0;
            } else {
                this.onWarmupCompleted.invoke(obj);
            }
            int i4 = IAuthTabCallback + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        int i = getInterfaceDescriptor + 61;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment = (LoanRefinancingSchedulePreScreenFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingSchedulePreScreenFragment, setDetectableSize);
        int i4 = asBinder + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(str, loanRefinancingSchedulePreScreenFragment, view);
        }
        onExtraCallback(str, loanRefinancingSchedulePreScreenFragment, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(loanRefinancingSchedulePreScreenFragment, view);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingSchedulePreScreenFragment, view);
        int i3 = asBinder + 29;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, LoanRefinancingAvailableStatus loanRefinancingAvailableStatus) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingSchedulePreScreenFragment, loanRefinancingAvailableStatus);
        int i4 = onTransact + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment = (LoanRefinancingSchedulePreScreenFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(loanRefinancingSchedulePreScreenFragment, view);
        if (i3 == 0) {
            return null;
        }
        int i4 = 95 / 0;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(str, loanRefinancingSchedulePreScreenFragment, setDetectableSize);
        }
        onExtraCallback(str, loanRefinancingSchedulePreScreenFragment, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i) | i2)) | (~(i | i6));
        int i8 = ~i2;
        int i9 = (~(i8 | i6)) | i;
        int i10 = (~(i6 | i2)) | (~(i8 | (~i6))) | i;
        int i11 = i2 + i + i5 + ((-737137436) * i3) + ((-1840598144) * i4);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i2) - 818937856) + (24099949 * i) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i5) + (1335885824 * i3) + ((-1946157056) * i4) + ((-1593638912) * i12);
        int i14 = (i2 * 1252406331) + 1981669868 + (i * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i5 * 1252407325) + (i3 * (-1820396076)) + (i4 * 1320834432) + (i12 * (-447283200));
        int i15 = i13 + (i14 * i14 * 1511325696);
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i15 == 3) {
            return onExtraCallback(objArr);
        }
        if (i15 != 4) {
            return onExtraCallbackWithResult(objArr);
        }
        LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment = (LoanRefinancingSchedulePreScreenFragment) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i16 = 2 % 2;
        int i17 = onTransact + 81;
        asBinder = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        loanRefinancingSchedulePreScreenFragment.IAuthTabCallback(r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        Unit unit = Unit.INSTANCE;
        int i19 = onTransact + 99;
        asBinder = i19 % 128;
        int i20 = i19 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(1027649331, new Object[]{loanRefinancingSchedulePreScreenFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, -1027649327, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i3 = onTransact + 31;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment = (LoanRefinancingSchedulePreScreenFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingSchedulePreScreenFragment);
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(loanRefinancingSchedulePreScreenFragment, setDetectableSize);
        }
        onExtraCallbackWithResult(loanRefinancingSchedulePreScreenFragment, setDetectableSize);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return 1280867L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final setTinyAppStartupBaseTime onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setTinyAppStartupBaseTime settinyappstartupbasetime = (setTinyAppStartupBaseTime) this.IAuthTabCallback.getValue();
        int i3 = asBinder + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return settinyappstartupbasetime;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 39;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, initTraceDebugEngine> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 47;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, initTraceDebugEngine.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingSchedulePreScreenBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 == 0) {
                return onNavigationEvent(view);
            }
            onNavigationEvent(view);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final initTraceDebugEngine onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                initTraceDebugEngine.onNavigationEvent(view);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            initTraceDebugEngine inittracedebugengineOnNavigationEvent = initTraceDebugEngine.onNavigationEvent(view);
            int i3 = onNavigationEvent + 9;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return inittracedebugengineOnNavigationEvent;
            }
            throw null;
        }
    }

    private final initTraceDebugEngine asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 == 0 ? this.onExtraCallback.onExtraCallbackWithResult(this, onWarmupCompleted[0]) : this.onExtraCallback.onExtraCallbackWithResult(this, onWarmupCompleted[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        initTraceDebugEngine inittracedebugengine = (initTraceDebugEngine) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i3 = onTransact + 71;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return inittracedebugengine;
    }

    public static final class onNavigationEvent implements Function0<Bundle> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment onExtraCallbackWithResult;

        public onNavigationEvent(Fragment fragment) {
            this.onExtraCallbackWithResult = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
        
            throw new java.lang.IllegalStateException("Fragment " + r5.onExtraCallbackWithResult + " has null arguments");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r1 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r1 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r2 = im.toss.features.loan.refinancing.funnel.schedule.LoanRefinancingSchedulePreScreenFragment.onNavigationEvent.IAuthTabCallback;
            r3 = r2 + 17;
            im.toss.features.loan.refinancing.funnel.schedule.LoanRefinancingSchedulePreScreenFragment.onNavigationEvent.onNavigationEvent = r3 % 128;
            r3 = r3 % 2;
            r2 = r2 + 99;
            im.toss.features.loan.refinancing.funnel.schedule.LoanRefinancingSchedulePreScreenFragment.onNavigationEvent.onNavigationEvent = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Bundle onNavigationEvent() {
            Bundle arguments;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                arguments = this.onExtraCallbackWithResult.getArguments();
                int i3 = 84 / 0;
            } else {
                arguments = this.onExtraCallbackWithResult.getArguments();
            }
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ScrollView scrollView = asBinder().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        scrollView.setVisibility(8);
        TdsBottomCtaV1View tdsBottomCtaV1View = asBinder().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        tdsBottomCtaV1View.setVisibility(8);
        onTransact();
        IntroErrorReason introErrorReasonIAuthTabCallback = onExtraCallback().IAuthTabCallback();
        if (introErrorReasonIAuthTabCallback != null) {
            int i4 = onTransact + 109;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallbackWithResult(introErrorReasonIAuthTabCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (onExtraCallbackWithResult(introErrorReasonIAuthTabCallback) != null) {
                int i5 = onTransact + 109;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
        }
        access100().onNavigationEvent();
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingSchedulePreScreenFragment.getString(R.string.loan_refinancing_compare_directly, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, new Object[]{DERSet.onExtraCallback}, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingSchedulePreScreenFragment.getString(R.string.loan_question_want_to_find_new_loan_low));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSchedulePreScreenFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i4 = R.string.loan_refinancing_compare_directly;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingSchedulePreScreenFragment.getString(i4, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingSchedulePreScreenFragment.getString(R.string.loan_question_want_to_find_new_loan_low));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSchedulePreScreenFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i5 = asBinder + 73;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, View view) {
        String str;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1280871L, false, (String) null, (Map) null, new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda4(loanRefinancingSchedulePreScreenFragment), 14, (Object) null);
        if (loanRefinancingSchedulePreScreenFragment.onActivityResized()) {
            int i2 = asBinder + 125;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            str = "refinancing_business_intro";
        } else {
            str = "refinancing_loan__schedule_intro";
        }
        loanRefinancingSchedulePreScreenFragment.onWarmupCompleted(str);
        int i4 = asBinder + 99;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Unit onExtraCallbackWithResult(IntroErrorReason introErrorReason) {
        int i = 2 % 2;
        initTraceDebugEngine inittracedebugengineAsBinder = asBinder();
        ScrollView scrollView = inittracedebugengineAsBinder.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        scrollView.setVisibility(0);
        TdsBottomCtaV1View tdsBottomCtaV1View = inittracedebugengineAsBinder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        tdsBottomCtaV1View.setVisibility(0);
        if (StringsKt.endsWith$default(introErrorReason.IAuthTabCallback(), PresetParser.FILE_EXT, false, 2, (Object) null)) {
            int i2 = asBinder + 117;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            TdsImageView tdsImageView = inittracedebugengineAsBinder.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(8);
            LottieAnimationView lottieAnimationView = inittracedebugengineAsBinder.onTransact;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(0);
            inittracedebugengineAsBinder.onTransact.setAnimationFromUrl(introErrorReason.IAuthTabCallback());
            inittracedebugengineAsBinder.onTransact.playAnimation();
        } else {
            TdsImageView tdsImageView2 = inittracedebugengineAsBinder.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            tdsImageView2.setVisibility(0);
            LottieAnimationView lottieAnimationView2 = inittracedebugengineAsBinder.onTransact;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
            lottieAnimationView2.setVisibility(8);
            TdsImageView tdsImageView3 = inittracedebugengineAsBinder.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            TdsImageView.setImage$default(tdsImageView3, introErrorReason.IAuthTabCallback(), (Function1) null, (Function1) null, 6, (Object) null);
        }
        inittracedebugengineAsBinder.IAuthTabCallbackStubProxy.setText(introErrorReason.onWarmupCompleted());
        inittracedebugengineAsBinder.getInterfaceDescriptor.setText(PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.onExtraCallback(introErrorReason.onExtraCallback(), 0, (Html.ImageGetter) null, (Html.TagHandler) null));
        ConvertByteArrayToFloatArray.onExtraCallback(1280869L, false, (String) null, (Map) null, new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda5(this), 14, (Object) null);
        LinearLayout linearLayout = inittracedebugengineAsBinder.asBinder;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        inittracedebugengineAsBinder.IAuthTabCallbackStub.setOnClickListener(new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda6(this));
        TdsListRowV1View tdsListRowV1View = inittracedebugengineAsBinder.IAuthTabCallbackStub;
        int i4 = R.string.loan_refinancing_compare_directly;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        tdsListRowV1View.setCenterText2(getString(i4, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        BaseTextView baseTextViewICustomTabsCallbackDefault = inittracedebugengineAsBinder.IAuthTabCallbackStub.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            baseTextViewICustomTabsCallbackDefault.setPadding(baseTextViewICustomTabsCallbackDefault.getPaddingLeft(), baseTextViewICustomTabsCallbackDefault.getPaddingTop(), varyMatches.onNavigationEvent(48, displayMetrics), baseTextViewICustomTabsCallbackDefault.getPaddingBottom());
        }
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = inittracedebugengineAsBinder.IAuthTabCallbackStub.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            int i5 = onTransact + 59;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            baseTextViewICustomTabsCallbackStubProxy.setPadding(baseTextViewICustomTabsCallbackStubProxy.getPaddingLeft(), baseTextViewICustomTabsCallbackStubProxy.getPaddingTop(), varyMatches.onNavigationEvent(48, displayMetrics2), baseTextViewICustomTabsCallbackStubProxy.getPaddingBottom());
        }
        AnimateLogoSwapView animateLogoSwapView = inittracedebugengineAsBinder.asInterface;
        List listOnWarmupCompleted = ImagePipelineExperimentsBuilderExternalSyntheticLambda30.INSTANCE.onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnWarmupCompleted.iterator();
        int i7 = onTransact + 99;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        while (it.hasNext()) {
            arrayList.add(new getProxyokhttp((String) it.next(), new PluginInfo(40.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null)));
        }
        animateLogoSwapView.onExtraCallbackWithResult(arrayList);
        return IAuthTabCallback(introErrorReason.onNavigationEvent());
    }

    private final Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initTraceDebugEngine inittracedebugengineAsBinder = asBinder();
        if (inittracedebugengineAsBinder == null) {
            return null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = inittracedebugengineAsBinder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, str, new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda0(str, this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = inittracedebugengineAsBinder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        ScrollView scrollView = inittracedebugengineAsBinder.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View2, scrollView, false, 0, 6, (Object) null);
        if (!onActivityResized()) {
            inittracedebugengineAsBinder.onNavigationEvent.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
            inittracedebugengineAsBinder.onNavigationEvent.setBottomButton(viva.republica.toss.R.string.close, new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda1(this));
            int i4 = asBinder + 71;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, String str) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1280873L, false, (String) null, (Map) null, new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda8(str, loanRefinancingSchedulePreScreenFragment), 14, (Object) null);
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(String str, LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("cta_title", str);
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSchedulePreScreenFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 53;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(String str, LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            IAuthTabCallback(loanRefinancingSchedulePreScreenFragment, str);
            loanRefinancingSchedulePreScreenFragment.onActivityResized();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        IAuthTabCallback(loanRefinancingSchedulePreScreenFragment, str);
        if (loanRefinancingSchedulePreScreenFragment.onActivityResized()) {
            loanRefinancingSchedulePreScreenFragment.onExtraCallbackWithResult();
            int i3 = asBinder + 105;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        } else {
            Object[] objArr = {loanRefinancingSchedulePreScreenFragment.access100(), true};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1612331882, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1612331871, iOnNavigationEvent2, objArr);
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            onNavigationEvent(451773528, new Object[]{loanRefinancingSchedulePreScreenFragment}, -451773525, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            String string = loanRefinancingSchedulePreScreenFragment.getString(viva.republica.toss.R.string.close);
            Intrinsics.checkNotNullExpressionValue(string, "");
            IAuthTabCallback(loanRefinancingSchedulePreScreenFragment, string);
            loanRefinancingSchedulePreScreenFragment.onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        String string2 = loanRefinancingSchedulePreScreenFragment.getString(viva.republica.toss.R.string.close);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        IAuthTabCallback(loanRefinancingSchedulePreScreenFragment, string2);
        loanRefinancingSchedulePreScreenFragment.onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        access100().ICustomTabsCallbackDefault().observe(getViewLifecycleOwner(), new onWarmupCompleted(new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda3(this)));
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, LoanRefinancingAvailableStatus loanRefinancingAvailableStatus) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            if (loanRefinancingAvailableStatus.asBinder()) {
                int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                loanRefinancingSchedulePreScreenFragment.onExtraCallback((String) LoanRefinancingAvailableStatus.IAuthTabCallback(-2044911965, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2044911966, iOnExtraCallbackWithResult, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{loanRefinancingAvailableStatus}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult()));
            } else if (loanRefinancingAvailableStatus.onWarmupCompleted() == ImagePipelineExperimentsBuilderExternalSyntheticLambda22.RESTRICTED) {
                loanRefinancingSchedulePreScreenFragment.onNavigationEvent(loanRefinancingAvailableStatus.onExtraCallbackWithResult(), loanRefinancingAvailableStatus.IAuthTabCallbackDefault());
                int i3 = onTransact + 33;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            } else {
                loanRefinancingSchedulePreScreenFragment.onExtraCallbackWithResult(loanRefinancingAvailableStatus.IAuthTabCallbackDefault());
            }
            return Unit.INSTANCE;
        }
        loanRefinancingAvailableStatus.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment = (LoanRefinancingSchedulePreScreenFragment) objArr[0];
        int i = 2 % 2;
        getHostnameVerifierokhttp.onNavigationEvent(loanRefinancingSchedulePreScreenFragment, (String) null, 1, (Object) null);
        loanRefinancingSchedulePreScreenFragment.onExtraCallback(279L, new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda2(loanRefinancingSchedulePreScreenFragment));
        int i2 = onTransact + 33;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void IAuthTabCallback(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            ConvertByteArrayToFloatArray.onExtraCallback(1003760L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            extraCallback().onExtraCallback(Long.valueOf(onPostMessage().IAuthTabCallbackDefault()));
            if (!(!getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED))) {
                access100().access200();
                RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingGuideFragment);
                return;
            }
            this.IAuthTabCallbackDefault = new LoanRefinancingSchedulePreScreenFragment$.ExternalSyntheticLambda7(this);
        }
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            loanRefinancingSchedulePreScreenFragment.access100().access200();
            RippleNode.onNavigationEvent(loanRefinancingSchedulePreScreenFragment).onNavigationEvent(R.id.loanRefinancingGuideFragment);
            Unit unit = Unit.INSTANCE;
            int i3 = asBinder + 37;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        loanRefinancingSchedulePreScreenFragment.access100().access200();
        RippleNode.onNavigationEvent(loanRefinancingSchedulePreScreenFragment).onNavigationEvent(R.id.loanRefinancingGuideFragment);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        IntroErrorReason introErrorReasonIAuthTabCallback = onExtraCallback().IAuthTabCallback();
        Spanned spannedOnExtraCallback = null;
        if (introErrorReasonIAuthTabCallback != null && (strOnExtraCallback = introErrorReasonIAuthTabCallback.onExtraCallback()) != null) {
            int i4 = onTransact + 31;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            spannedOnExtraCallback = PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.onExtraCallback(strOnExtraCallback, 0, (Html.ImageGetter) null, (Html.TagHandler) null);
        }
        screenParams.put("next_time", spannedOnExtraCallback);
        return screenParams;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        Function0<Unit> function0 = this.IAuthTabCallbackDefault;
        if (function0 != null) {
            int i4 = asBinder + 103;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                function0.invoke();
            } else {
                function0.invoke();
                int i5 = 21 / 0;
            }
        }
        this.IAuthTabCallbackDefault = null;
        dismissLoadingIndicator();
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (!(!access100().onActivityResized())) {
            int i2 = asBinder + 57;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingIntroFragment);
            int i4 = onTransact + 83;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingIntroWebFragment);
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(212770880, new Object[]{loanRefinancingSchedulePreScreenFragment}, -212770878, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(437797205, new Object[]{loanRefinancingSchedulePreScreenFragment, setDetectableSize}, -437797204, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void IAuthTabCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, View view) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        onNavigationEvent(1816936480, new Object[]{loanRefinancingSchedulePreScreenFragment, view}, -1816936480, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private final void IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        onNavigationEvent(451773528, new Object[]{this}, -451773525, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(LoanRefinancingSchedulePreScreenFragment loanRefinancingSchedulePreScreenFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(1027649331, new Object[]{loanRefinancingSchedulePreScreenFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, -1027649327, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
