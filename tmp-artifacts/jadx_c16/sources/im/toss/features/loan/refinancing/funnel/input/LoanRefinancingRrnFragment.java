package im.toss.features.loan.refinancing.funnel.input;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.common.RefinancingLoanType;
import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingRrnFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.textField.BaseEditText;
import im.toss.uikit.widget.textField.TextField;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.PageContext;
import o.PlayerErrorCode;
import o.RippleNode;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TransitionTransitionNotificationExternalSyntheticLambda1;
import o.access13800;
import o.addAllCommandLine;
import o.addExtra;
import o.auth;
import o.clearWrite;
import o.generateLink;
import o.getReporter;
import o.getThisUpdate;
import o.maybeUpdateAnimatable;
import o.mediationData;
import o.mergeParams;
import o.onCenterChanged;
import o.preFillDefault;
import o.setRandomHost;
import o.zzad;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.securekey.SecureKeyboardView;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingRrnFragment extends Hilt_LoanRefinancingRrnFragment {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult;
    private static int onTransact;

    @Inject
    public mediationData api;

    @Inject
    public zzad injectedEnvironments;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted = {new PropertyReference1Impl<>(LoanRefinancingRrnFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/ActivityComparisonInputRnnBinding;", 0)};
    public static final int IAuthTabCallback = 8;
    private int onNavigationEvent = R.layout.activity_comparison_input_rnn;
    private final PageContext onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onNavigationEvent);

    static final /* synthetic */ class IAuthTabCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 IAuthTabCallback;

        IAuthTabCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onNavigationEvent + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i4 = onNavigationEvent + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return zAreEqual;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i3 + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    static {
        int i = onTransact + 29;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 72 / 0;
        }
    }

    public static /* synthetic */ String IAuthTabCallback(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(charSequence);
        int i4 = IAuthTabCallbackDefault + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
    }

    public static /* synthetic */ String onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(function1, obj);
        int i4 = IAuthTabCallbackDefault + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingRrnFragment loanRefinancingRrnFragment, Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingRrnFragment, unit);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = i5 | i7 | i8;
        int i10 = (~(i7 | i2)) | (~(i8 | i5));
        int i11 = (~(i2 | i5)) | (~(i7 | (~i5) | i8));
        int i12 = i5 + i4 + i + ((-160716491) * i6) + (1883135422 * i3);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i5) - 666828800) + ((-962678542) * i4) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i) + ((-1967783936) * i6) + ((-2092695552) * i3) + ((-870252544) * i13);
        int i15 = (i5 * 1975847376) + 750996803 + (i4 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i * 1975846509) + (i6 * (-526956143)) + (i3 * 972447206) + (i13 * (-1341325312));
        int i16 = i14 + (i15 * i15 * 1929838592);
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 3) {
            return onExtraCallback(objArr);
        }
        LoanRefinancingRrnFragment loanRefinancingRrnFragment = (LoanRefinancingRrnFragment) objArr[0];
        int i17 = 2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        RxTextView.IAuthTabCallback(((getReporter) onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{loanRefinancingRrnFragment}, -851665500, 851665503, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult())).onNavigationEvent.IAuthTabCallback()).onExtraCallbackWithResult().asInterface(new LoanRefinancingRrnFragment$.ExternalSyntheticLambda2(new LoanRefinancingRrnFragment$.ExternalSyntheticLambda1())).IAuthTabCallback(new LoanRefinancingRrnFragment$.ExternalSyntheticLambda4(new LoanRefinancingRrnFragment$.ExternalSyntheticLambda3(loanRefinancingRrnFragment)));
        int i18 = IAuthTabCallbackDefault + 19;
        onExtraCallbackWithResult = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingRrnFragment loanRefinancingRrnFragment, String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingRrnFragment, str);
        int i4 = onExtraCallbackWithResult + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 1251681L;
    }

    public static final /* synthetic */ getReporter onExtraCallback(LoanRefinancingRrnFragment loanRefinancingRrnFragment) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        getReporter getreporter = (getReporter) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{loanRefinancingRrnFragment}, -851665500, 851665503, iOnExtraCallbackWithResult3);
        int i4 = IAuthTabCallbackDefault + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getreporter;
    }

    public static final /* synthetic */ void onNavigationEvent(LoanRefinancingRrnFragment loanRefinancingRrnFragment, String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingRrnFragment.onNavigationEvent(str);
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 113;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, getReporter> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 55;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, getReporter.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/ActivityComparisonInputRnnBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getReporter getreporterOnNavigationEvent = onNavigationEvent((View) obj);
            int i4 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return getreporterOnNavigationEvent;
            }
            throw null;
        }

        public final getReporter onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                getReporter.IAuthTabCallback(view);
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            getReporter getreporterIAuthTabCallback = getReporter.IAuthTabCallback(view);
            int i3 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return getreporterIAuthTabCallback;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanRefinancingRrnFragment loanRefinancingRrnFragment = (LoanRefinancingRrnFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getReporter getreporterOnExtraCallbackWithResult = loanRefinancingRrnFragment.onExtraCallback.onExtraCallbackWithResult(loanRefinancingRrnFragment, onWarmupCompleted[0]);
        int i4 = IAuthTabCallbackDefault + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return getreporterOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final mediationData onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        mediationData mediationdata = this.api;
        if (mediationdata != null) {
            int i5 = i2 + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return mediationdata;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = onExtraCallbackWithResult + 53;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final zzad onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = this.injectedEnvironments;
        if (zzadVar != null) {
            int i5 = i2 + 7;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = IAuthTabCallbackDefault + 55;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private final zzad IAuthTabCallbackStub() {
        int i = 2 % 2;
        if (this.injectedEnvironments != null) {
            zzad zzadVarOnTransact = onTransact();
            int i2 = IAuthTabCallbackDefault + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return zzadVarOnTransact;
        }
        auth.IAuthTabCallback(auth.onNavigationEvent, new IllegalStateException("environments accessed before injection: LoanRefinancingRrnFragment"), (Map) null, 2, (Object) null);
        zzad zzadVarOnNavigationEvent = zzaj.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zzadVarOnNavigationEvent;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, 1365730066, -1365730066, iOnExtraCallbackWithResult3);
            int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            onExtraCallbackWithResult(iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1538694267, 1538694268, iOnExtraCallbackWithResult6);
            int iOnExtraCallbackWithResult7 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult8 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult9 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            onExtraCallbackWithResult(iOnExtraCallbackWithResult8, iOnExtraCallbackWithResult7, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, 237292717, -237292715, iOnExtraCallbackWithResult9);
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int iOnExtraCallbackWithResult10 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult11 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult12 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult11, iOnExtraCallbackWithResult10, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, 1365730066, -1365730066, iOnExtraCallbackWithResult12);
        int iOnExtraCallbackWithResult13 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult14 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult15 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult14, iOnExtraCallbackWithResult13, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1538694267, 1538694268, iOnExtraCallbackWithResult15);
        int iOnExtraCallbackWithResult16 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult17 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult18 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult17, iOnExtraCallbackWithResult16, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, 237292717, -237292715, iOnExtraCallbackWithResult18);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanRefinancingRrnFragment loanRefinancingRrnFragment = (LoanRefinancingRrnFragment) objArr[0];
        int i = 2 % 2;
        loanRefinancingRrnFragment.access100().ICustomTabsCallbackStubProxy().observe(loanRefinancingRrnFragment.getViewLifecycleOwner(), new IAuthTabCallback(new LoanRefinancingRrnFragment$.ExternalSyntheticLambda0(loanRefinancingRrnFragment)));
        int i2 = IAuthTabCallbackDefault + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(LoanRefinancingRrnFragment loanRefinancingRrnFragment, Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingRrnFragment.newAuthTabSession();
        Unit unit2 = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final String onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (String) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i3 = 7 / 0;
        return str;
    }

    private static final String onWarmupCompleted(CharSequence charSequence) {
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            string = charSequence.toString();
            int i3 = 70 / 0;
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
            string = charSequence.toString();
        }
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(LoanRefinancingRrnFragment loanRefinancingRrnFragment, String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (str.length() == 7) {
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNull(str);
                int i3 = 50 / 0;
                if (StringsKt.toIntOrNull(str) != null) {
                    int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    Object[] objArr = {((getReporter) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{loanRefinancingRrnFragment}, -851665500, 851665503, iOnExtraCallbackWithResult3)).onWarmupCompleted};
                    int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    Editable editable = (Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, objArr, -450491624, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                    int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                    Object[] objArr2 = {((getReporter) onExtraCallbackWithResult(iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{loanRefinancingRrnFragment}, -851665500, 851665503, iOnExtraCallbackWithResult6)).onNavigationEvent};
                    int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    Editable editable2 = (Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, objArr2, -450491624, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) editable);
                    sb.append((Object) editable2);
                    String string = sb.toString();
                    Object obj = null;
                    if (!loanRefinancingRrnFragment.IAuthTabCallbackStub().onActivityLayout()) {
                        int i4 = onExtraCallbackWithResult + 1;
                        IAuthTabCallbackDefault = i4 % 128;
                        int i5 = i4 % 2;
                        if (!loanRefinancingRrnFragment.IAuthTabCallbackStub().RemoteActionCompatParcelizer()) {
                            int i6 = onExtraCallbackWithResult + 71;
                            IAuthTabCallbackDefault = i6 % 128;
                            if (i6 % 2 == 0) {
                                loanRefinancingRrnFragment.IAuthTabCallbackStub().MediaBrowserCompatMediaItem();
                                obj.hashCode();
                                throw null;
                            }
                            if (loanRefinancingRrnFragment.IAuthTabCallbackStub().MediaBrowserCompatMediaItem()) {
                                if (Intrinsics.areEqual(string, onCenterChanged.IAuthTabCallback.IAuthTabCallback_Parcel())) {
                                    int i7 = onExtraCallbackWithResult + 55;
                                    IAuthTabCallbackDefault = i7 % 128;
                                    int i8 = i7 % 2;
                                    loanRefinancingRrnFragment.onNavigationEvent(string);
                                    return Unit.INSTANCE;
                                }
                            }
                            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(loanRefinancingRrnFragment), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(loanRefinancingRrnFragment, string, (access13800) null), 3, (Object) null);
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNull(str);
                if (StringsKt.toIntOrNull(str) != null) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        if (r11 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c3, code lost:
    
        o.RippleNode.onNavigationEvent(r10).onNavigationEvent(im.toss.features.loan.ui.R.id.bizRefinancingAccountLoadingFragment);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d2, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00db, code lost:
    
        if (access100().newAuthTabSession() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dd, code lost:
    
        r11 = im.toss.features.loan.refinancing.funnel.input.LoanRefinancingRrnFragment.onExtraCallbackWithResult + 69;
        im.toss.features.loan.refinancing.funnel.input.LoanRefinancingRrnFragment.IAuthTabCallbackDefault = r11 % 128;
        r11 = r11 % 2;
        o.RippleNode.onNavigationEvent(r10).onNavigationEvent(im.toss.features.loan.ui.R.id.loanRefinancingJobInputFragment);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ef, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f0, code lost:
    
        access100().onWarmupCompleted();
        r11 = im.toss.features.loan.refinancing.funnel.input.LoanRefinancingRrnFragment.IAuthTabCallbackDefault + 39;
        im.toss.features.loan.refinancing.funnel.input.LoanRefinancingRrnFragment.onExtraCallbackWithResult = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0100, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0061, code lost:
    
        if (r11 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b6, code lost:
    
        if (r11 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b8, code lost:
    
        r1 = im.toss.features.loan.refinancing.funnel.input.LoanRefinancingRrnFragment.onExtraCallbackWithResult + 15;
        im.toss.features.loan.refinancing.funnel.input.LoanRefinancingRrnFragment.IAuthTabCallbackDefault = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(String str) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {onCenterChanged.IAuthTabCallback, str};
            onCenterChanged.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1757845090, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1757845097, objArr);
            access100().asBinder(true);
            Object[] objArr2 = {access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            i = onNavigationEvent.IAuthTabCallback[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, iOnNavigationEvent2, objArr2)).ordinal()];
        } else {
            Object[] objArr3 = {onCenterChanged.IAuthTabCallback, str};
            onCenterChanged.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1757845090, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1757845097, objArr3);
            access100().asBinder(true);
            Object[] objArr4 = {access100()};
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            i = onNavigationEvent.IAuthTabCallback[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, iOnNavigationEvent4, objArr4)).ordinal()];
        }
    }

    private final void newAuthTabSession() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        access100().asBinder(true);
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingJobInputFragment);
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanRefinancingRrnFragment loanRefinancingRrnFragment = (LoanRefinancingRrnFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        getReporter getreporter = (getReporter) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{loanRefinancingRrnFragment}, -851665500, 851665503, iOnExtraCallbackWithResult3);
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        Typography3 typography3 = ((getReporter) onExtraCallbackWithResult(iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{loanRefinancingRrnFragment}, -851665500, 851665503, iOnExtraCallbackWithResult6)).IAuthTabCallbackStub;
        String string = loanRefinancingRrnFragment.getString(R.string.loan_rrn_input_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        typography3.setText(mergeParams.asBinder(string));
        BaseEditText baseEditTextIAuthTabCallback = getreporter.onWarmupCompleted.IAuthTabCallback();
        baseEditTextIAuthTabCallback.setEnabled(false);
        String strICustomTabsCallback = addExtra.ICustomTabsCallback(PlayerErrorCode.onWarmupCompleted);
        Object obj = null;
        if (strICustomTabsCallback == null) {
            int i4 = IAuthTabCallbackDefault;
            int i5 = i4 + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i4 + 77;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 2;
            }
            strICustomTabsCallback = "";
        }
        baseEditTextIAuthTabCallback.setText(strICustomTabsCallback);
        baseEditTextIAuthTabCallback.setTextSize(2, 24.0f);
        baseEditTextIAuthTabCallback.setInputType(2);
        BaseEditText baseEditTextIAuthTabCallback2 = getreporter.onNavigationEvent.IAuthTabCallback();
        baseEditTextIAuthTabCallback2.setText("");
        baseEditTextIAuthTabCallback2.setTextSize(2, 24.0f);
        baseEditTextIAuthTabCallback2.setInputType(2);
        baseEditTextIAuthTabCallback2.setTransformationMethod(new TransitionTransitionNotificationExternalSyntheticLambda1());
        baseEditTextIAuthTabCallback2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        SecureKeyboardView secureKeyboardView = getreporter.onTransact;
        Intrinsics.checkNotNullExpressionValue(secureKeyboardView, "");
        getThisUpdate.onExtraCallback(baseEditTextIAuthTabCallback2, secureKeyboardView, false, (Function1) null, 6, (Object) null);
        SecureKeyboardView secureKeyboardView2 = getreporter.onTransact;
        Resources resources = loanRefinancingRrnFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        secureKeyboardView2.setDarkMode(generateLink.IAuthTabCallback(resources));
        int i8 = onExtraCallbackWithResult + 65;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public View getFocusableInput() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        BaseEditText baseEditTextIAuthTabCallback = ((getReporter) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -851665500, 851665503, iOnExtraCallbackWithResult3)).onNavigationEvent.IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return baseEditTextIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final getReporter asBinder() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (getReporter) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -851665500, 851665503, iOnExtraCallbackWithResult3);
    }

    private final void asInterface() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, 237292717, -237292715, iOnExtraCallbackWithResult3);
    }

    private final void isEngagementSignalsApiAvailable() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, 1365730066, -1365730066, iOnExtraCallbackWithResult3);
    }

    private final void prefetch() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this}, -1538694267, 1538694268, iOnExtraCallbackWithResult3);
    }
}
