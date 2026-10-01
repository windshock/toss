package im.toss.features.loan.refinancing.funnel.input;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingCarInputFragment$;
import im.toss.features.loan.ui.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextField;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.ConvertByteArrayToFloatArray;
import o.M_;
import o.PageContext;
import o.SetDetectableSize;
import o.SubsamplingScaleImageViewDefaultOnStateChangedListener;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.addAllCommandLine;
import o.collectFps;
import o.deserializeUriNullableCollection;
import o.getLongOctalBytes;
import o.onCenterChanged;
import o.onRenderReady;
import o.preFillDefault;
import o.response;
import o.setProtocolsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingCarInputFragment extends Hilt_LoanRefinancingCarInputFragment {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000;
    private static int asBinder;
    private boolean onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(LoanRefinancingCarInputFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonCarInputBinding;", 0)};
    public static final int IAuthTabCallback = 8;
    private int onTransact = R.layout.fragment_loan_comparison_car_input;
    private final PageContext onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.IAuthTabCallback);
    private String onExtraCallback = "";

    static {
        int i = access000 + 79;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, setDetectableSize);
        int i4 = asBinder + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(LoanRefinancingCarInputFragment loanRefinancingCarInputFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(new Object[]{loanRefinancingCarInputFragment, view}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1155992957, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1155992957, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            throw null;
        }
        onExtraCallbackWithResult(new Object[]{loanRefinancingCarInputFragment, view}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1155992957, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1155992957, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        int i3 = asBinder + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 | i3;
        int i8 = ~i5;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = (~(i3 | i8)) | (~(i9 | i2));
        int i12 = i2 + i5 + i4 + (1389894630 * i) + ((-1243605516) * i6);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i2) + 1335230464 + (862422157 * i5) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i4) + (1607991296 * i) + ((-548405248) * i6) + ((-1553596416) * i13);
        int i15 = ((i2 * (-88671125)) - 261777699) + (i5 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i4 * (-88671137)) + (i * (-349388198)) + (i6 * (-147040884)) + (i13 * 182059008);
        int i16 = i14 + (i15 * i15 * (-132513792));
        return i16 != 1 ? i16 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingCarInputFragment loanRefinancingCarInputFragment, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{loanRefinancingCarInputFragment, charSequence}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2025467991, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2025467993, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        int i4 = asBinder + 37;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingCarInputFragment loanRefinancingCarInputFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(loanRefinancingCarInputFragment, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingCarInputFragment loanRefinancingCarInputFragment, collectFps collectfps, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(loanRefinancingCarInputFragment, collectfps, view);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(new Object[]{function1, obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269049156, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269049157, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        onExtraCallbackWithResult(new Object[]{function1, obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269049156, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269049157, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        int i3 = asBinder + 119;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return 1329041L;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.onTransact;
        int i5 = i3 + 111;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, collectFps> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 85;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        onExtraCallback() {
            super(1, collectFps.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonCarInputBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            View view = (View) obj;
            if (i2 % 2 != 0) {
                onExtraCallback(view);
                obj2.hashCode();
                throw null;
            }
            collectFps collectfpsOnExtraCallback = onExtraCallback(view);
            int i3 = onExtraCallback + 99;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return collectfpsOnExtraCallback;
            }
            throw null;
        }

        public final collectFps onExtraCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            collectFps collectfpsOnWarmupCompleted = collectFps.onWarmupCompleted(view);
            int i4 = onExtraCallback + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return collectfpsOnWarmupCompleted;
        }
    }

    private final collectFps onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        collectFps collectfpsOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]);
        int i4 = IAuthTabCallbackDefault + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return collectfpsOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[PHI: r4
      0x0053: PHI (r4v12 java.lang.String) = (r4v4 java.lang.String), (r4v16 java.lang.String) binds: [B:8:0x0047, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        String str = "";
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            this.onWarmupCompleted = extraCallback().onTransact();
            strOnExtraCallback = extraCallback().onExtraCallback();
            int i3 = 78 / 0;
            if (strOnExtraCallback == null) {
                int i4 = IAuthTabCallbackDefault + 55;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = strOnExtraCallback;
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            this.onWarmupCompleted = extraCallback().onTransact();
            strOnExtraCallback = extraCallback().onExtraCallback();
            if (strOnExtraCallback == null) {
            }
        }
        this.onExtraCallback = str;
        isEngagementSignalsApiAvailable();
        int i6 = asBinder + 39;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        collectFps collectfpsOnExtraCallback = onExtraCallback();
        asBinder();
        TdsListRowV1View tdsListRowV1View = collectfpsOnExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        tdsListRowV1View.setVisibility(0);
        TdsListRowV1View tdsListRowV1View2 = collectfpsOnExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View2, "");
        tdsListRowV1View2.setVisibility(0);
        IAuthTabCallbackStub();
        asInterface();
        newSessionWithExtras();
        onTransact();
        int i4 = asBinder + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        collectFps collectfpsOnExtraCallback = onExtraCallback();
        BaseTextView baseTextViewAsInterface = collectfpsOnExtraCallback.onTransact.asInterface();
        if (baseTextViewAsInterface != null) {
            int i4 = IAuthTabCallbackDefault + 17;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                baseTextViewAsInterface.onNavigationEvent(response.Medium);
            } else {
                baseTextViewAsInterface.onNavigationEvent(response.Medium);
                int i5 = 22 / 0;
            }
        }
        collectfpsOnExtraCallback.onTransact.setLowerText(getString(R.string.loan_car_input_subtitle));
        collectfpsOnExtraCallback.onTransact.setUpperText(getString(R.string.loan_car_input_title));
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingCarInputFragment loanRefinancingCarInputFragment = (LoanRefinancingCarInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingCarInputFragment.onWarmupCompleted = false;
        loanRefinancingCarInputFragment.extraCallback().IAuthTabCallback(loanRefinancingCarInputFragment.onWarmupCompleted);
        loanRefinancingCarInputFragment.newSessionWithExtras();
        int i4 = IAuthTabCallbackDefault + 109;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return null;
    }

    private final void asInterface() {
        int i = 2 % 2;
        collectFps collectfpsOnExtraCallback = onExtraCallback();
        collectfpsOnExtraCallback.onWarmupCompleted.setCenterText1(getString(R.string.loan_car_mortgage_no));
        collectfpsOnExtraCallback.onWarmupCompleted.setOnClickListener(new LoanRefinancingCarInputFragment$.ExternalSyntheticLambda0(this));
        collectfpsOnExtraCallback.onExtraCallbackWithResult.setOnClickListener(new LoanRefinancingCarInputFragment$.ExternalSyntheticLambda1(this));
        int i2 = IAuthTabCallbackDefault + 31;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(LoanRefinancingCarInputFragment loanRefinancingCarInputFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingCarInputFragment.onWarmupCompleted = true;
        loanRefinancingCarInputFragment.extraCallback().IAuthTabCallback(loanRefinancingCarInputFragment.onWarmupCompleted);
        loanRefinancingCarInputFragment.newSessionWithExtras();
    }

    public static final class onExtraCallbackWithResult extends AccessibilityDelegateCompat {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ LoanRefinancingCarInputFragment onExtraCallbackWithResult;
        final /* synthetic */ collectFps onWarmupCompleted;

        onExtraCallbackWithResult(collectFps collectfps, LoanRefinancingCarInputFragment loanRefinancingCarInputFragment) {
            this.onWarmupCompleted = collectfps;
            this.onExtraCallbackWithResult = loanRefinancingCarInputFragment;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = this.onWarmupCompleted.onExtraCallbackWithResult.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                int i2 = IAuthTabCallback + 17;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0 ? tdsCheckBoxV2ViewPrefetchWithMultipleUrls.isChecked() : !tdsCheckBoxV2ViewPrefetchWithMultipleUrls.isChecked()) {
                    suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(this.onExtraCallbackWithResult.getString(R.string.loan_accessibility_checkbox_checked));
                    int i3 = IAuthTabCallback + 125;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(this.onExtraCallbackWithResult.getString(R.string.loan_accessibility_checkbox_not_checked));
        }
    }

    public static final class onNavigationEvent extends AccessibilityDelegateCompat {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ LoanRefinancingCarInputFragment onExtraCallback;
        final /* synthetic */ collectFps onWarmupCompleted;

        onNavigationEvent(collectFps collectfps, LoanRefinancingCarInputFragment loanRefinancingCarInputFragment) {
            this.onWarmupCompleted = collectfps;
            this.onExtraCallback = loanRefinancingCarInputFragment;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = this.onWarmupCompleted.onWarmupCompleted.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls == null || !tdsCheckBoxV2ViewPrefetchWithMultipleUrls.isChecked()) {
                suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(this.onExtraCallback.getString(R.string.loan_accessibility_checkbox_not_checked));
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(this.onExtraCallback.getString(R.string.loan_accessibility_checkbox_checked));
            int i4 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        collectFps collectfpsOnExtraCallback = onExtraCallback();
        if (!this.onWarmupCompleted) {
            collectfpsOnExtraCallback.onExtraCallbackWithResult.setRightType(TdsListRowV1View.asBinder.NONE);
            collectfpsOnExtraCallback.onWarmupCompleted.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
            collectfpsOnExtraCallback.onWarmupCompleted.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE_TRANSPARENT);
            collectfpsOnExtraCallback.onWarmupCompleted.setRightCheckBoxCheckedState(true);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = collectfpsOnExtraCallback.onWarmupCompleted.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setImportantForAccessibility(4);
            }
            M_.onExtraCallback.onExtraCallback(collectfpsOnExtraCallback.IAuthTabCallbackStub.IAuthTabCallback());
            KeyboardBottomCta keyboardBottomCta = collectfpsOnExtraCallback.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, true);
            TextField textField = collectfpsOnExtraCallback.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(textField, "");
            textField.setVisibility(8);
        } else {
            int i4 = asBinder + 101;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            collectfpsOnExtraCallback.onWarmupCompleted.setRightType(TdsListRowV1View.asBinder.NONE);
            collectfpsOnExtraCallback.onExtraCallbackWithResult.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
            collectfpsOnExtraCallback.onExtraCallbackWithResult.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE_TRANSPARENT);
            collectfpsOnExtraCallback.onExtraCallbackWithResult.setRightCheckBoxCheckedState(true);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = collectfpsOnExtraCallback.onExtraCallbackWithResult.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setImportantForAccessibility(4);
            }
            TextField textField2 = collectfpsOnExtraCallback.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(textField2, "");
            textField2.setVisibility(0);
        }
        TdsListRowV1View tdsListRowV1View = collectfpsOnExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        setProtocolsokhttp.onExtraCallbackWithResult(tdsListRowV1View, new onExtraCallbackWithResult(collectfpsOnExtraCallback, this));
        TdsListRowV1View tdsListRowV1View2 = collectfpsOnExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View2, "");
        setProtocolsokhttp.onExtraCallbackWithResult(tdsListRowV1View2, new onNavigationEvent(collectfpsOnExtraCallback, this));
    }

    private final void onTransact() {
        int i = 2 % 2;
        collectFps collectfpsOnExtraCallback = onExtraCallback();
        KeyboardBottomCta keyboardBottomCta = collectfpsOnExtraCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        KeyboardBottomCta.setCta$default(keyboardBottomCta, viva.republica.toss.R.string.next, new LoanRefinancingCarInputFragment$.ExternalSyntheticLambda5(this, collectfpsOnExtraCallback), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        int i2 = IAuthTabCallbackDefault + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("owner_yn", z ? "Y" : "N");
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 83;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(LoanRefinancingCarInputFragment loanRefinancingCarInputFragment, collectFps collectfps, View view) {
        int i = 2 % 2;
        String strReplace$default = StringsKt.replace$default(loanRefinancingCarInputFragment.onExtraCallback, " ", "", false, 4, (Object) null);
        loanRefinancingCarInputFragment.onExtraCallback = strReplace$default;
        boolean z = loanRefinancingCarInputFragment.onWarmupCompleted;
        String str = "";
        if (z && !onCenterChanged.IAuthTabCallback.onExtraCallbackWithResult(strReplace$default)) {
            int i2 = asBinder + 57;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            KeyboardBottomCta keyboardBottomCta = collectfps.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, false);
            onRenderReady.onExtraCallbackWithResult(loanRefinancingCarInputFragment, loanRefinancingCarInputFragment.getString(R.string.loan_wrong_car_no_message));
            return;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1329043L, false, (String) null, (Map) null, new LoanRefinancingCarInputFragment$.ExternalSyntheticLambda4(z), 14, (Object) null);
        loanRefinancingCarInputFragment.extraCallback().IAuthTabCallback(z);
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback = loanRefinancingCarInputFragment.extraCallback();
        if (z) {
            int i4 = IAuthTabCallbackDefault + 45;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            str = loanRefinancingCarInputFragment.onExtraCallback;
        }
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(-1924183993, 1924183997, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback, str});
        if (onWarmupCompleted.onExtraCallbackWithResult[loanRefinancingCarInputFragment.access100().getInterfaceDescriptor().ordinal()] != 1) {
            loanRefinancingCarInputFragment.ICustomTabsCallback_Parcel();
            return;
        }
        int i6 = asBinder + 45;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            loanRefinancingCarInputFragment.extraCommand();
            return;
        }
        loanRefinancingCarInputFragment.extraCommand();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 51;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        TextField textField = onExtraCallback().IAuthTabCallbackStub;
        Intrinsics.checkNotNull(textField);
        getLongOctalBytes.onExtraCallbackWithResult(textField);
        textField.setTextFieldType(TextField.onWarmupCompleted.MEDIUM);
        textField.setText(extraCallback().onExtraCallback());
        textField.setHint(getString(R.string.loan_car_no));
        textField.setUseMessage(true);
        textField.setMessage(getString(R.string.loan_car_no_input_message));
        textField.setClearable(false);
        textField.IAuthTabCallback().setSingleLine();
        textField.setImeOptions(6);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(textField.IAuthTabCallback()).IAuthTabCallback(new LoanRefinancingCarInputFragment$.ExternalSyntheticLambda3(new LoanRefinancingCarInputFragment$.ExternalSyntheticLambda2(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        int i2 = IAuthTabCallbackDefault + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanRefinancingCarInputFragment loanRefinancingCarInputFragment = (LoanRefinancingCarInputFragment) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KeyboardBottomCta keyboardBottomCta = loanRefinancingCarInputFragment.onExtraCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, true);
        loanRefinancingCarInputFragment.onExtraCallback = charSequence.toString();
        Object[] objArr2 = {loanRefinancingCarInputFragment.extraCallback(), charSequence.toString()};
        SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(-1924183993, 1924183997, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr2);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallback(LoanRefinancingCarInputFragment loanRefinancingCarInputFragment, View view) {
        onExtraCallbackWithResult(new Object[]{loanRefinancingCarInputFragment, view}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1155992957, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1155992957, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final Unit onExtraCallback(LoanRefinancingCarInputFragment loanRefinancingCarInputFragment, CharSequence charSequence) {
        return (Unit) onExtraCallbackWithResult(new Object[]{loanRefinancingCarInputFragment, charSequence}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2025467991, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2025467993, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        onExtraCallbackWithResult(new Object[]{function1, obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1269049156, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1269049157, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }
}
