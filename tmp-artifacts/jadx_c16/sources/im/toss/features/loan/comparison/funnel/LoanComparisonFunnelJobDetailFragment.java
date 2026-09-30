package im.toss.features.loan.comparison.funnel;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.loan.comparison.funnel.LoanComparisonFunnelJobDetailFragment$;
import im.toss.features.loan.ui.R;
import im.toss.featurescommon.companysearch.model.CompanyInfo;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import im.toss.utils.RxUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.GriverLoadingDialog;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.JsonReaderUnknownNumberParsing;
import o.M_;
import o.PageRenderReadyListener;
import o.SubsamplingScaleImageViewDefaultOnStateChangedListener;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TarConstants;
import o.UST_CRYPT_VerifySignatureValue;
import o.access27100;
import o.access27200;
import o.addAllCommandLine;
import o.clearMessage;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.getAdService;
import o.getByteBuffer;
import o.getLastErrorCode;
import o.getLongOctalBytes;
import o.getResourceFromGlobalPackagePool;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.onAdViewAdDisplayFailed;
import o.onPageExit;
import o.onPreviewReleased;
import o.onRenderReady;
import o.preFillDefault;
import o.readIntokhttp;
import o.resetErrorCode;
import o.setMessageBytes;
import o.setProtocolsokhttp;
import o.toggleTraceDebugPanelStatus;
import o.verifyWithStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.credit.commons.views.TextFieldLineCalendarView;
import viva.republica.toss.credit.commons.views.TextFieldLineDropDownView;
import viva.republica.toss.credit.commons.views.TextFieldLineTextOverlayView;
import viva.republica.toss.network.model.loan.LoanFunnelType;
import viva.republica.toss.widget.TextFieldLineCompanyView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanComparisonFunnelJobDetailFragment extends Hilt_LoanComparisonFunnelJobDetailFragment {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault;
    private deserializeUriCollection IAuthTabCallbackStub;
    private deserializeUriCollection asInterface;

    @Inject
    public GriverLoadingDialog companySearchIntentProvider;
    private final List<TarConstants> getInterfaceDescriptor;
    private final Lazy onNavigationEvent;
    private final access27200<Boolean> onTransact;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(LoanComparisonFunnelJobDetailFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelJobDetailBinding;", 0)};
    public static final IAuthTabCallback Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
    public static final int onExtraCallback = 8;
    private int asBinder = R.layout.fragment_loan_comparison_funnel_job_detail;
    private final PageRenderReadyListener onWarmupCompleted = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.onWarmupCompleted);

    static {
        int i = access000 + 77;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access100 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            writeTypedObject(function1, obj);
            obj2.hashCode();
            throw null;
        }
        Boolean boolWriteTypedObject = writeTypedObject(function1, obj);
        int i3 = access100 + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return boolWriteTypedObject;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanComparisonFunnelJobDetailFragment, bool);
        int i4 = access100 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(loanComparisonFunnelJobDetailFragment);
        int i4 = access100 + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(loanComparisonFunnelJobDetailFragment, toggletracedebugpanelstatus);
        int i4 = access100 + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanComparisonFunnelJobDetailFragment, textFieldLineCalendarView, access27100Var, triple);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = access100 + 83;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(toggletracedebugpanelstatus);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(toggletracedebugpanelstatus);
        int i3 = access100 + 7;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(TextFieldLine textFieldLine, String str) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1934346190, iOnExtraCallbackWithResult, new Object[]{textFieldLine, str}, 1934346199, iOnExtraCallbackWithResult3);
        int i4 = IAuthTabCallbackStubProxy + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallback(TextFieldLineCalendarView textFieldLineCalendarView, Calendar calendar, Calendar calendar2, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, onPreviewReleased onpreviewreleased, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(textFieldLineCalendarView, calendar, calendar2, loanComparisonFunnelJobDetailFragment, onpreviewreleased, view, motionEvent);
        int i4 = IAuthTabCallbackStubProxy + 45;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 2021728312, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -2021728311, iOnExtraCallbackWithResult3);
            int i3 = 59 / 0;
        } else {
            int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, 2021728312, iOnExtraCallbackWithResult4, new Object[]{function1, obj}, -2021728311, iOnExtraCallbackWithResult6);
        }
        int i4 = IAuthTabCallbackStubProxy + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = access100 + 41;
        IAuthTabCallbackStubProxy = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onActivityLayout(function1, obj);
        int i4 = access100 + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        TextFieldLineDropDownView textFieldLineDropDownView = (TextFieldLineDropDownView) objArr[1];
        access27100 access27100Var = (access27100) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(loanComparisonFunnelJobDetailFragment, textFieldLineDropDownView, access27100Var, str);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(loanComparisonFunnelJobDetailFragment, textFieldLineDropDownView, access27100Var, str);
        int i3 = IAuthTabCallbackStubProxy + 99;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 27;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanComparisonFunnelJobDetailFragment, bool);
        int i4 = access100 + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 61;
        access100 = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 43;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1350830851, iOnExtraCallbackWithResult, new Object[]{function1, obj}, 1350830873, iOnExtraCallbackWithResult3);
            int i3 = 55 / 0;
        } else {
            int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, -1350830851, iOnExtraCallbackWithResult4, new Object[]{function1, obj}, 1350830873, iOnExtraCallbackWithResult6);
        }
        int i4 = access100 + 31;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 109;
        access100 = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        TdsCheckBoxV1View tdsCheckBoxV1View = (TdsCheckBoxV1View) objArr[1];
        TextFieldLineCalendarView textFieldLineCalendarView = (TextFieldLineCalendarView) objArr[2];
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = (TextFieldLineTextOverlayView) objArr[3];
        access27100 access27100Var = (access27100) objArr[4];
        access27100 access27100Var2 = (access27100) objArr[5];
        TdsCheckBoxV1View tdsCheckBoxV1View2 = (TdsCheckBoxV1View) objArr[6];
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(loanComparisonFunnelJobDetailFragment, tdsCheckBoxV1View, textFieldLineCalendarView, textFieldLineTextOverlayView, access27100Var, access27100Var2, tdsCheckBoxV1View2, zBooleanValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(loanComparisonFunnelJobDetailFragment, tdsCheckBoxV1View, textFieldLineCalendarView, textFieldLineTextOverlayView, access27100Var, access27100Var2, tdsCheckBoxV1View2, zBooleanValue);
        int i3 = IAuthTabCallbackStubProxy + 101;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Boolean onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnWarmupCompleted = onWarmupCompleted(objArr);
        int i4 = access100 + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return boolOnWarmupCompleted;
    }

    public static /* synthetic */ Long onExtraCallback(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Long lIAuthTabCallback = IAuthTabCallback(charSequence);
        int i4 = IAuthTabCallbackStubProxy + 107;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return lIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Long onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Long l = (Long) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1967056622, iOnExtraCallbackWithResult, new Object[]{function1, obj}, 1967056632, iOnExtraCallbackWithResult3);
        int i4 = access100 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i5;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i3 | i5 | i4));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i4 | i5)) | (~(i13 | i8)) | (~(i3 | i4));
        int i16 = i3 + i5 + i2 + ((-298151579) * i6) + ((-427515960) * i);
        int i17 = i16 * i16;
        int i18 = (i3 * (-431502880)) + 875560960 + ((-431502880) * i5) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i2) + ((-16252928) * i6) + (423624704 * i) + (1109590016 * i17);
        int i19 = ((i3 * (-2003555040)) - 1632655964) + (i5 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i2 * (-2003554617)) + (i6 * 1812671363) + (i * (-1519508360)) + (i17 * (-1288372224));
        switch (i18 + (i19 * i19 * (-1796407296))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallbackStub(objArr);
            case 4:
                return asInterface(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return access000(objArr);
            case 9:
                return IAuthTabCallback_Parcel(objArr);
            case 10:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i20 = 2 % 2;
                int i21 = IAuthTabCallbackStubProxy + 53;
                access100 = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(obj, "");
                Long l = (Long) function1.invoke(obj);
                int i23 = access100 + 61;
                IAuthTabCallbackStubProxy = i23 % 128;
                int i24 = i23 % 2;
                return l;
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return writeTypedObject(objArr);
            case 15:
                return extraCallback(objArr);
            case 16:
                return extraCallbackWithResult(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return readTypedObject(objArr);
            case 19:
                return onActivityResized(objArr);
            case 20:
                return onPostMessage(objArr);
            case 21:
                return onActivityLayout(objArr);
            case 22:
                return onMessageChannelReady(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(loanComparisonFunnelJobDetailFragment, textFieldLineCalendarView, access27100Var, triple);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(loanComparisonFunnelJobDetailFragment, textFieldLineCalendarView, access27100Var, triple);
        int i3 = IAuthTabCallbackStubProxy + 101;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ void onExtraCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(loanComparisonFunnelJobDetailFragment);
        int i4 = IAuthTabCallbackStubProxy + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(loanComparisonFunnelJobDetailFragment, view);
        int i4 = IAuthTabCallbackStubProxy + 9;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Intent onExtraCallbackWithResult(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(loanComparisonFunnelJobDetailFragment);
            throw null;
        }
        Intent intentOnNavigationEvent = onNavigationEvent(loanComparisonFunnelJobDetailFragment);
        int i3 = access100 + 95;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return intentOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(charSequence);
        }
        asInterface(charSequence);
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnMinimized = onMinimized(function1, obj);
        int i4 = access100 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strOnMinimized;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, Long l) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanComparisonFunnelJobDetailFragment, l);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(loanComparisonFunnelJobDetailFragment, textFieldLineCalendarView, access27100Var, triple);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanComparisonFunnelJobDetailFragment, textFieldLineCalendarView, access27100Var, triple);
        int i3 = IAuthTabCallbackStubProxy + 93;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineDropDownView textFieldLineDropDownView, access27100 access27100Var, String str) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1790416726, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, textFieldLineDropDownView, access27100Var, str}, 1790416739, iOnExtraCallbackWithResult3);
        }
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(th);
        int i4 = IAuthTabCallbackStubProxy + 53;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {toggletracedebugpanelstatus};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, 50530353, iOnExtraCallbackWithResult, objArr, -50530351, iOnExtraCallbackWithResult3);
        int i4 = IAuthTabCallbackStubProxy + 23;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, View view) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(toggletracedebugpanelstatus, view);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 103;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(boolean z, toggleTraceDebugPanelStatus toggletracedebugpanelstatus, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(z, toggletracedebugpanelstatus, loanComparisonFunnelJobDetailFragment, view);
        int i4 = IAuthTabCallbackStubProxy + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(TextFieldLineCalendarView textFieldLineCalendarView, Calendar calendar, Calendar calendar2, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, onPreviewReleased onpreviewreleased, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(textFieldLineCalendarView, calendar, calendar2, loanComparisonFunnelJobDetailFragment, onpreviewreleased, view, motionEvent);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return zOnExtraCallback;
    }

    public static /* synthetic */ String onNavigationEvent(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, verifyWithStream verifywithstream) {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(loanComparisonFunnelJobDetailFragment, verifywithstream);
        int i4 = access100 + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(TextFieldLine textFieldLine, access27100 access27100Var, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldLine, access27100Var, loanComparisonFunnelJobDetailFragment, charSequence);
        int i4 = access100 + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, Pair pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 733371289, iOnExtraCallbackWithResult, new Object[]{function0, pair}, -733371275, iOnExtraCallbackWithResult3);
        int i4 = access100 + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(access27100 access27100Var, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineCompanyView textFieldLineCompanyView, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1408652846, iOnExtraCallbackWithResult, new Object[]{access27100Var, loanComparisonFunnelJobDetailFragment, textFieldLineCompanyView, charSequence}, -1408652825, iOnExtraCallbackWithResult3);
        }
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(toggletracedebugpanelstatus, loanComparisonFunnelJobDetailFragment, z);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(toggletracedebugpanelstatus, loanComparisonFunnelJobDetailFragment, z);
        int i3 = access100 + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanComparisonFunnelJobDetailFragment, toggletracedebugpanelstatus);
        int i4 = IAuthTabCallbackStubProxy + 103;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ String onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnPostMessage = onPostMessage(function1, obj);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 7;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return strOnPostMessage;
    }

    public static /* synthetic */ String onWarmupCompleted(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(charSequence);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnNavigationEvent = onNavigationEvent(charSequence);
        int i3 = access100 + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return strOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, 1230670124, iOnExtraCallbackWithResult4, new Object[]{loanComparisonFunnelJobDetailFragment, toggletracedebugpanelstatus}, -1230670118, iOnExtraCallbackWithResult6);
        int i3 = IAuthTabCallbackStubProxy + 75;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 680255946, iOnExtraCallbackWithResult, new Object[]{toggletracedebugpanelstatus}, -680255942, iOnExtraCallbackWithResult3);
        int i4 = access100 + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStub(function1, obj);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 83;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(Pair pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(pair);
        }
        onExtraCallbackWithResult(pair);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanComparisonFunnelJobDetailFragment, iEngagementSignalsCallbackDefault);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = access100 + 3;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return 1014257L;
        }
        int i3 = 2 / 0;
        return 1014257L;
    }

    public LoanComparisonFunnelJobDetailFragment() {
        access27200<Boolean> typedObject = access27200.readTypedObject();
        Intrinsics.checkNotNullExpressionValue(typedObject, "");
        this.onTransact = typedObject;
        this.getInterfaceDescriptor = CollectionsKt.listOf(new TarConstants[]{getLastErrorCode.Companion.onWarmupCompleted(), resetErrorCode.Companion.onWarmupCompleted()});
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda43(this));
        this.IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda44(this));
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return "loan_comparison_job_info";
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.asBinder;
        if (i3 != 0) {
            int i5 = 21 / 0;
        }
        return i4;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, toggleTraceDebugPanelStatus> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = onExtraCallback + 69;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 9 / 0;
            }
        }

        onExtraCallbackWithResult() {
            super(1, toggleTraceDebugPanelStatus.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelJobDetailBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 != 0) {
                onNavigationEvent(view);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            toggleTraceDebugPanelStatus toggletracedebugpanelstatusOnNavigationEvent = onNavigationEvent(view);
            int i3 = onNavigationEvent + 115;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
            return toggletracedebugpanelstatusOnNavigationEvent;
        }

        public final toggleTraceDebugPanelStatus onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallback = toggleTraceDebugPanelStatus.IAuthTabCallback(view);
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return toggletracedebugpanelstatusIAuthTabCallback;
        }
    }

    private final toggleTraceDebugPanelStatus IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100 + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(this, onExtraCallbackWithResult[0]);
        int i4 = access100 + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return toggletracedebugpanelstatusOnNavigationEvent;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i2 = IAuthTabCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asInterface(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallback + 63;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public final GriverLoadingDialog asBinder() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        GriverLoadingDialog griverLoadingDialog = this.companySearchIntentProvider;
        if (griverLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 37;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return griverLoadingDialog;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = (Intent) loanComparisonFunnelJobDetailFragment.onNavigationEvent.getValue();
        int i4 = access100 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    private static final Intent onNavigationEvent(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        GriverLoadingDialog griverLoadingDialogAsBinder = loanComparisonFunnelJobDetailFragment.asBinder();
        Context contextRequireContext = loanComparisonFunnelJobDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intent intentOnExtraCallbackWithResult = getResourceFromGlobalPackagePool.onExtraCallbackWithResult(griverLoadingDialogAsBinder, contextRequireContext, "loan_comparison");
        int i4 = access100 + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return intentOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        CompanyInfo companyInfo;
        Parcelable parcelable;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Object obj = null;
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = IAuthTabCallbackStubProxy + 1;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            if (intentOnExtraCallbackWithResult != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) intentOnExtraCallbackWithResult.getParcelableExtra("EXTRA_COMPANY_INFO_RESULT", CompanyInfo.class);
                    int i3 = IAuthTabCallbackStubProxy + 17;
                    access100 = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    Parcelable parcelableExtra = intentOnExtraCallbackWithResult.getParcelableExtra("EXTRA_COMPANY_INFO_RESULT");
                    if (!(parcelableExtra instanceof CompanyInfo)) {
                        parcelableExtra = null;
                    }
                    parcelable = (CompanyInfo) parcelableExtra;
                }
                companyInfo = (CompanyInfo) parcelable;
                int i5 = IAuthTabCallbackStubProxy + 115;
                access100 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                companyInfo = null;
            }
            toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault();
            if (toggletracedebugpanelstatusIAuthTabCallbackDefault != null) {
                int i7 = access100 + 1;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 != 0) {
                    TextFieldLineCompanyView textFieldLineCompanyView = toggletracedebugpanelstatusIAuthTabCallbackDefault.onWarmupCompleted;
                    obj.hashCode();
                    throw null;
                }
                TextFieldLineCompanyView textFieldLineCompanyView2 = toggletracedebugpanelstatusIAuthTabCallbackDefault.onWarmupCompleted;
                if (textFieldLineCompanyView2 != null) {
                    textFieldLineCompanyView2.IAuthTabCallback(companyInfo);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = access100 + 73;
        IAuthTabCallbackStubProxy = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.asInterface = new deserializeUriCollection();
        asInterface().IAuthTabCallback(LoanFunnelType.MANUAL);
        onPostMessage();
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private final Unit onPostMessage() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault();
            throw null;
        }
        if (IAuthTabCallbackDefault() == null) {
            return null;
        }
        onMessageChannelReady();
        IAuthTabCallbackStub();
        onActivityLayout();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = this.onTransact.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(3000L, TimeUnit.MILLISECONDS).IAuthTabCallback(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda14(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda13(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 85;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonFunnelJobDetailFragment.ICustomTabsCallbackStub();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 13;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final Unit onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault();
            throw null;
        }
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (toggletracedebugpanelstatusIAuthTabCallbackDefault == null) {
            return null;
        }
        toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackDefault.onNavigationEvent().setVisibility(8);
        toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackDefault.setOnKeyboardVisibilityListener(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda21(toggletracedebugpanelstatusIAuthTabCallbackDefault, this));
        KeyboardBottomCta keyboardBottomCta = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        KeyboardBottomCta.setCta$default(keyboardBottomCta, viva.republica.toss.R.string.next, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda22(this), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        KeyboardBottomCta keyboardBottomCta2 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta2, "");
        getLongOctalBytes.onWarmupCompleted(keyboardBottomCta2, false);
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 35;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(boolean z, toggleTraceDebugPanelStatus toggletracedebugpanelstatus, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, View view) {
        int i = 2 % 2;
        if (z) {
            int i2 = access100 + 89;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            ConstraintLayout constraintLayoutIAuthTabCallback = toggletracedebugpanelstatus.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutIAuthTabCallback, "");
            getLongOctalBytes.onWarmupCompleted(constraintLayoutIAuthTabCallback);
            return;
        }
        loanComparisonFunnelJobDetailFragment.onTransact.onWarmupCompleted(Boolean.TRUE);
        int i4 = IAuthTabCallbackStubProxy + 105;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, boolean z) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = access100 + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        KeyboardBottomCta keyboardBottomCta = toggletracedebugpanelstatus.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        if (!z) {
            int i6 = viva.republica.toss.R.string.next;
            int i7 = access100 + 55;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            i2 = i6;
        } else {
            int i9 = access100 + 121;
            IAuthTabCallbackStubProxy = i9 % 128;
            if (i9 % 2 != 0) {
                i = im.toss.uikit.R.string.uikit_confirm;
                int i10 = 52 / 0;
            } else {
                i = im.toss.uikit.R.string.uikit_confirm;
            }
            i2 = i;
        }
        KeyboardBottomCta.setCta$default(keyboardBottomCta, i2, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda45(z, toggletracedebugpanelstatus, loanComparisonFunnelJobDetailFragment), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        access27200<Boolean> access27200Var = loanComparisonFunnelJobDetailFragment.onTransact;
        if (i3 == 0) {
            access27200Var.onWarmupCompleted(Boolean.TRUE);
            throw null;
        }
        access27200Var.onWarmupCompleted(Boolean.TRUE);
        int i4 = access100 + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        toggletracedebugpanelstatus.onTransact.requestFocus(33);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 95;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        toggletracedebugpanelstatus.IAuthTabCallback.requestFocus(i2 % 2 != 0 ? 29 : 33);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 123;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatus.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView, "");
        Object[] objArr = {loanComparisonFunnelJobDetailFragment, textFieldLineTextOverlayView};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        if (i3 != 0) {
            onExtraCallback(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, 923060807, iOnExtraCallbackWithResult, objArr, -923060802, iOnExtraCallbackWithResult3);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        onExtraCallback(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, 923060807, iOnExtraCallbackWithResult, objArr, -923060802, iOnExtraCallbackWithResult3);
        Unit unit2 = Unit.INSTANCE;
        int i4 = access100 + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        toggletracedebugpanelstatus.IAuthTabCallback.requestFocus(i2 % 2 != 0 ? 57 : 33);
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 101;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatus.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView, "");
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 923060807, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, textFieldLineTextOverlayView}, -923060802, iOnExtraCallbackWithResult3);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 95;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatus.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView, "");
        Object[] objArr = {loanComparisonFunnelJobDetailFragment, textFieldLineTextOverlayView};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        if (i3 == 0) {
            onExtraCallback(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, 923060807, iOnExtraCallbackWithResult, objArr, -923060802, iOnExtraCallbackWithResult3);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        onExtraCallback(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, 923060807, iOnExtraCallbackWithResult, objArr, -923060802, iOnExtraCallbackWithResult3);
        Unit unit2 = Unit.INSTANCE;
        int i4 = access100 + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return unit2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Unit onActivityLayout() throws NoWhenBranchMatchedException {
        String string;
        int i = 2 % 2;
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (toggletracedebugpanelstatusIAuthTabCallbackDefault == null) {
            int i2 = IAuthTabCallbackStubProxy + 115;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        onPreviewReleased onpreviewreleasedOnExtraCallback = onPreviewReleased.Companion.onExtraCallback((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{asInterface()}));
        Boolean bool = Boolean.FALSE;
        access27100<Boolean> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(bool);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        access27100<Boolean> access27100VarIAuthTabCallback2 = access27100.IAuthTabCallback(bool);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback2, "");
        access27100<Boolean> access27100VarIAuthTabCallback3 = access27100.IAuthTabCallback(bool);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback3, "");
        access27100<Boolean> access27100VarIAuthTabCallback4 = access27100.IAuthTabCallback(bool);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback4, "");
        TdsTopV1View tdsTopV1View = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallback_Parcel;
        int[] iArr = onWarmupCompleted.onExtraCallbackWithResult;
        int i4 = iArr[onpreviewreleasedOnExtraCallback.ordinal()];
        if (i4 == 1) {
            string = getString(R.string.loan_comparison_funnel___8639440814);
        } else if (i4 != 2) {
            int i5 = access100 + 57;
            IAuthTabCallbackStubProxy = i5 % 128;
            string = (i5 % 2 == 0 ? i4 == 3 : i4 == 3) ? getString(R.string.loan_comparison_funnel___01078de973) : getString(R.string.loan_comparison_funnel___5d4c0e02a6);
        } else {
            string = getString(R.string.loan_comparison_funnel___f9b6531856);
        }
        tdsTopV1View.setUpperText(string);
        ArrayList arrayList = new ArrayList();
        int i6 = iArr[onpreviewreleasedOnExtraCallback.ordinal()];
        if (i6 == 1 || i6 == 2) {
            TextFieldLineCompanyView textFieldLineCompanyView = toggletracedebugpanelstatusIAuthTabCallbackDefault.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(textFieldLineCompanyView, "");
            textFieldLineCompanyView.setVisibility(0);
            TextFieldLineDropDownView textFieldLineDropDownView = toggletracedebugpanelstatusIAuthTabCallbackDefault.onTransact;
            Intrinsics.checkNotNullExpressionValue(textFieldLineDropDownView, "");
            textFieldLineDropDownView.setVisibility(0);
            TextFieldLineCalendarView textFieldLineCalendarView = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(textFieldLineCalendarView, "");
            textFieldLineCalendarView.setVisibility(0);
            TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView, "");
            textFieldLineTextOverlayView.setVisibility(0);
            onNavigationEvent(onpreviewreleasedOnExtraCallback, access27100VarIAuthTabCallback, access27100VarIAuthTabCallback2, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4);
            arrayList.add(access27100VarIAuthTabCallback);
            arrayList.add(access27100VarIAuthTabCallback2);
            arrayList.add(access27100VarIAuthTabCallback3);
            arrayList.add(access27100VarIAuthTabCallback4);
            onWarmupCompleted(access27100VarIAuthTabCallback, access27100VarIAuthTabCallback2, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda6(toggletracedebugpanelstatusIAuthTabCallbackDefault));
            onWarmupCompleted(access27100VarIAuthTabCallback2, access27100VarIAuthTabCallback3, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda7(toggletracedebugpanelstatusIAuthTabCallbackDefault));
            onWarmupCompleted(access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda8(this, toggletracedebugpanelstatusIAuthTabCallbackDefault));
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1684579141, iOnExtraCallbackWithResult, new Object[]{this, arrayList}, -1684579134, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        } else {
            int i7 = IAuthTabCallbackStubProxy + 45;
            access100 = i7 % 128;
            if (i7 % 2 != 0 ? i6 == 3 : i6 == 5) {
                TextFieldLineCompanyView textFieldLineCompanyView2 = toggletracedebugpanelstatusIAuthTabCallbackDefault.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(textFieldLineCompanyView2, "");
                textFieldLineCompanyView2.setVisibility(0);
                TextFieldLineCalendarView textFieldLineCalendarView2 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(textFieldLineCalendarView2, "");
                textFieldLineCalendarView2.setVisibility(0);
                TextFieldLineTextOverlayView textFieldLineTextOverlayView2 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView2, "");
                textFieldLineTextOverlayView2.setVisibility(0);
                TextFieldLineDropDownView textFieldLineDropDownView2 = toggletracedebugpanelstatusIAuthTabCallbackDefault.onTransact;
                Intrinsics.checkNotNullExpressionValue(textFieldLineDropDownView2, "");
                textFieldLineDropDownView2.setVisibility(8);
                onNavigationEvent(onpreviewreleasedOnExtraCallback, access27100VarIAuthTabCallback, access27100VarIAuthTabCallback2, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4);
                arrayList.add(access27100VarIAuthTabCallback);
                arrayList.add(access27100VarIAuthTabCallback3);
                arrayList.add(access27100VarIAuthTabCallback4);
                onWarmupCompleted(access27100VarIAuthTabCallback, access27100VarIAuthTabCallback3, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda9(toggletracedebugpanelstatusIAuthTabCallbackDefault));
                onWarmupCompleted(access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda10(this, toggletracedebugpanelstatusIAuthTabCallbackDefault));
                int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1684579141, iOnExtraCallbackWithResult2, new Object[]{this, arrayList}, -1684579134, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            } else {
                if (i6 != 4 && i6 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                TextFieldLineCalendarView textFieldLineCalendarView3 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(textFieldLineCalendarView3, "");
                textFieldLineCalendarView3.setVisibility(0);
                TextFieldLineTextOverlayView textFieldLineTextOverlayView3 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView3, "");
                textFieldLineTextOverlayView3.setVisibility(0);
                TextFieldLineCompanyView textFieldLineCompanyView3 = toggletracedebugpanelstatusIAuthTabCallbackDefault.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(textFieldLineCompanyView3, "");
                textFieldLineCompanyView3.setVisibility(8);
                TextFieldLineDropDownView textFieldLineDropDownView3 = toggletracedebugpanelstatusIAuthTabCallbackDefault.onTransact;
                Intrinsics.checkNotNullExpressionValue(textFieldLineDropDownView3, "");
                textFieldLineDropDownView3.setVisibility(8);
                TextFieldLineCalendarView textFieldLineCalendarView4 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(textFieldLineCalendarView4, "");
                TextFieldLineTextOverlayView textFieldLineTextOverlayView4 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView4, "");
                onExtraCallback(textFieldLineCalendarView4, textFieldLineTextOverlayView4, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4);
                onNavigationEvent(onpreviewreleasedOnExtraCallback, access27100VarIAuthTabCallback, access27100VarIAuthTabCallback2, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4);
                arrayList.add(access27100VarIAuthTabCallback3);
                arrayList.add(access27100VarIAuthTabCallback4);
                onWarmupCompleted(access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda11(this, toggletracedebugpanelstatusIAuthTabCallbackDefault));
                int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1684579141, iOnExtraCallbackWithResult3, new Object[]{this, arrayList}, -1684579134, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            }
        }
        TextFieldLineTextOverlayView textFieldLineTextOverlayView5 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView5, "");
        return onNavigationEvent(textFieldLineTextOverlayView5);
    }

    private final Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault();
            throw null;
        }
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (toggletracedebugpanelstatusIAuthTabCallbackDefault == null) {
            return null;
        }
        EditText editText = toggletracedebugpanelstatusIAuthTabCallbackDefault.onWarmupCompleted.getEditText();
        if (editText != null) {
            editText.setSaveEnabled(false);
        }
        EditText editText2 = toggletracedebugpanelstatusIAuthTabCallbackDefault.onTransact.getEditText();
        if (editText2 != null) {
            int i3 = IAuthTabCallbackStubProxy + 105;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            editText2.setSaveEnabled(false);
        }
        EditText editText3 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallback.getEditText();
        if (editText3 != null) {
            editText3.setSaveEnabled(false);
        }
        EditText editText4 = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackStub.IAuthTabCallback().getEditText();
        if (editText4 != null) {
            int i5 = IAuthTabCallbackStubProxy + 101;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                editText4.setSaveEnabled(false);
            } else {
                editText4.setSaveEnabled(false);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[PHI: r11 r12
      0x0071: PHI (r11v11 java.lang.String) = (r11v10 java.lang.String), (r11v14 java.lang.String) binds: [B:14:0x006f, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r12v37 java.lang.String) = (r12v36 java.lang.String), (r12v39 java.lang.String) binds: [B:14:0x006f, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Unit onNavigationEvent(onPreviewReleased onpreviewreleased, access27100<Boolean> access27100Var, access27100<Boolean> access27100Var2, access27100<Boolean> access27100Var3, access27100<Boolean> access27100Var4) {
        boolean z;
        String string;
        String strOnExtraCallbackWithResult;
        String string2;
        TarConstants tarConstantsPrevious;
        TarConstants tarConstants;
        String string3;
        List listEmptyList;
        Object objPrevious;
        Triple tripleWriteTypedObject;
        TarConstants tarConstantsPrevious2;
        String strOnNavigationEvent;
        String strIAuthTabCallbackDefault;
        int i = 2 % 2;
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (toggletracedebugpanelstatusIAuthTabCallbackDefault == null) {
            return null;
        }
        TextFieldLineCompanyView textFieldLineCompanyView = toggletracedebugpanelstatusIAuthTabCallbackDefault.onWarmupCompleted;
        EditText editText = textFieldLineCompanyView.getEditText();
        if (editText != null) {
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(editText).onExtraCallbackWithResult().IAuthTabCallback(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda34(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda24(access27100Var, this, textFieldLineCompanyView)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
            autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
            if (onpreviewreleased != onPreviewReleased.ETC) {
                int i2 = IAuthTabCallbackStubProxy + 111;
                access100 = i2 % 128;
                if (i2 % 2 == 0) {
                    strOnNavigationEvent = asInterface().onNavigationEvent();
                    strIAuthTabCallbackDefault = asInterface().IAuthTabCallbackDefault();
                    int i3 = 51 / 0;
                    if (strOnNavigationEvent != null) {
                        if (strOnNavigationEvent.length() > 0 && strIAuthTabCallbackDefault != null && strIAuthTabCallbackDefault.length() > 0) {
                            textFieldLineCompanyView.setCompanyName(strOnNavigationEvent);
                            textFieldLineCompanyView.setCorporateNumber(strIAuthTabCallbackDefault);
                            editText.setText(textFieldLineCompanyView.writeTypedObject());
                        }
                    }
                } else {
                    strOnNavigationEvent = asInterface().onNavigationEvent();
                    strIAuthTabCallbackDefault = asInterface().IAuthTabCallbackDefault();
                    if (strOnNavigationEvent != null) {
                    }
                }
            }
        }
        if (onpreviewreleased.isNeedJobInfo()) {
            String strOnNavigationEvent2 = asInterface().onNavigationEvent();
            if (strOnNavigationEvent2 != null) {
                int i4 = access100 + 47;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                if (strOnNavigationEvent2.length() <= 0) {
                }
            }
            z = true;
        } else {
            z = false;
        }
        autoDisposable((deserializeUriNullableCollection) TextFieldLineCompanyView.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -162976212, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{textFieldLineCompanyView, Boolean.valueOf((onTransact().readTypedObject() || (z ^ true)) ? false : true), new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda35(this)}, 162976213));
        int[] iArr = onWarmupCompleted.onExtraCallbackWithResult;
        int i6 = iArr[onpreviewreleased.ordinal()];
        if (i6 == 2) {
            string = getString(R.string.loan_comparison_funnel___8b32d7f5e0);
        } else if (i6 != 3) {
            int i7 = access100 + 7;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            string = getString(R.string.loan_comparison_funnel___67ce82466b);
        } else {
            string = getString(R.string.loan_comparison_funnel_job_detail_civil_company_hint);
            int i9 = IAuthTabCallbackStubProxy + 81;
            access100 = i9 % 128;
            int i10 = i9 % 2;
        }
        textFieldLineCompanyView.setHint(string);
        TextFieldLineDropDownView textFieldLineDropDownView = toggletracedebugpanelstatusIAuthTabCallbackDefault.onTransact;
        int i11 = iArr[onpreviewreleased.ordinal()];
        if (i11 == 1) {
            strOnExtraCallbackWithResult = (String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(364069555, -364069548, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{asInterface()});
            EditText editText2 = textFieldLineDropDownView.getEditText();
            Intrinsics.checkNotNull(editText2);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = RxTextView.IAuthTabCallback(editText2).onExtraCallbackWithResult().asInterface(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda37(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda36())).IAuthTabCallback(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda39(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda38(this, textFieldLineDropDownView, access27100Var2)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
            autoDisposable(deserializeurinullablecollectionIAuthTabCallback2);
            string2 = getString(R.string.loan_comparison_funnel___537c9e9899);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string4 = getString(R.string.loan_comparison_funnel___2db5dd25be);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            List<TarConstants> list = this.getInterfaceDescriptor;
            ListIterator<TarConstants> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    tarConstantsPrevious = null;
                    break;
                }
                tarConstantsPrevious = listIterator.previous();
                if (Intrinsics.areEqual(tarConstantsPrevious.onNavigationEvent(), "employeeType")) {
                    break;
                }
            }
            tarConstants = tarConstantsPrevious;
            string3 = string4;
        } else if (i11 != 2) {
            string2 = "";
            string3 = string2;
            strOnExtraCallbackWithResult = null;
            tarConstants = null;
        } else {
            strOnExtraCallbackWithResult = asInterface().onExtraCallbackWithResult();
            EditText editText3 = textFieldLineDropDownView.getEditText();
            Intrinsics.checkNotNull(editText3);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback3 = RxTextView.IAuthTabCallback(editText3).onExtraCallbackWithResult().asInterface(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda41(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda40())).IAuthTabCallback(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda25(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda42(this, textFieldLineDropDownView, access27100Var2)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback3, "");
            autoDisposable(deserializeurinullablecollectionIAuthTabCallback3);
            string2 = getString(R.string.loan_comparison_funnel___0fb1a92d85);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            string3 = getString(R.string.loan_comparison_funnel___9f7eafb4c6);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            List<TarConstants> list2 = this.getInterfaceDescriptor;
            ListIterator<TarConstants> listIterator2 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    int i12 = access100 + 29;
                    IAuthTabCallbackStubProxy = i12 % 128;
                    int i13 = i12 % 2;
                    tarConstantsPrevious2 = null;
                    break;
                }
                int i14 = IAuthTabCallbackStubProxy + 85;
                access100 = i14 % 128;
                if (i14 % 2 == 0) {
                    tarConstantsPrevious2 = listIterator2.previous();
                    int i15 = 79 / 0;
                    if (Intrinsics.areEqual(tarConstantsPrevious2.onNavigationEvent(), "businessType")) {
                        break;
                    }
                } else {
                    tarConstantsPrevious2 = listIterator2.previous();
                    if (Intrinsics.areEqual(tarConstantsPrevious2.onNavigationEvent(), "businessType")) {
                        break;
                    }
                }
            }
            tarConstants = tarConstantsPrevious2;
        }
        if (tarConstants != null) {
            int i16 = IAuthTabCallbackStubProxy + 23;
            access100 = i16 % 128;
            if (i16 % 2 == 0) {
                listEmptyList = tarConstants.IAuthTabCallback();
                int i17 = 60 / 0;
            } else {
                listEmptyList = tarConstants.IAuthTabCallback();
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ListIterator listIterator3 = listEmptyList.listIterator(listEmptyList.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator3.previous();
            if (Intrinsics.areEqual(((verifyWithStream) objPrevious).onWarmupCompleted(), strOnExtraCallbackWithResult)) {
                int i18 = access100 + 27;
                IAuthTabCallbackStubProxy = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 81 / 0;
                }
            }
        }
        verifyWithStream verifywithstream = (verifyWithStream) objPrevious;
        List listIAuthTabCallback = tarConstants != null ? tarConstants.IAuthTabCallback() : null;
        autoDisposable(textFieldLineDropDownView.onNavigationEvent(string3, "", listIAuthTabCallback == null ? CollectionsKt.emptyList() : listIAuthTabCallback, verifywithstream, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda26(this)));
        textFieldLineDropDownView.setHint(string2);
        EditText editTextExtraCallbackWithResult = textFieldLineDropDownView.extraCallbackWithResult();
        if (editTextExtraCallbackWithResult != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(editTextExtraCallbackWithResult, new onNavigationEvent(string2, textFieldLineDropDownView, this));
        }
        TextFieldLineCalendarView textFieldLineCalendarView = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallback;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int i20 = onWarmupCompleted.onExtraCallbackWithResult[onpreviewreleased.ordinal()];
        if (i20 == 2) {
            String string5 = getString(R.string.loan_comparison_funnel___f432d8024a);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            objectRef.element = string5;
            tripleWriteTypedObject = asInterface().writeTypedObject();
            textFieldLineCalendarView.setOnValueChanged(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda27(this, textFieldLineCalendarView, access27100Var3));
        } else if (i20 == 4 || i20 == 5) {
            String string6 = getString(R.string.loan_comparison_funnel___23d793890a);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            objectRef.element = string6;
            tripleWriteTypedObject = asInterface().access000();
            textFieldLineCalendarView.setOnValueChanged(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda28(this, textFieldLineCalendarView, access27100Var3));
        } else {
            String string7 = getString(R.string.loan_comparison_funnel___238d95198f);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            objectRef.element = string7;
            tripleWriteTypedObject = asInterface().access000();
            textFieldLineCalendarView.setOnValueChanged(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda29(this, textFieldLineCalendarView, access27100Var3));
        }
        textFieldLineCalendarView.setHint((CharSequence) objectRef.element);
        if (tripleWriteTypedObject != null && ((Number) tripleWriteTypedObject.getFirst()).intValue() != 0 && ((Number) tripleWriteTypedObject.getSecond()).intValue() != 0 && ((Number) tripleWriteTypedObject.getThird()).intValue() != 0) {
            EditText editText4 = textFieldLineCalendarView.getEditText();
            if (editText4 != null) {
                Object first = tripleWriteTypedObject.getFirst();
                String str = String.format("%02d", Arrays.copyOf(new Object[]{tripleWriteTypedObject.getSecond()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                String str2 = String.format("%02d", Arrays.copyOf(new Object[]{tripleWriteTypedObject.getThird()}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                editText4.setText(first + "년 " + str + "월 " + str2 + "일");
            }
            onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1614447032, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this, onpreviewreleased, tripleWriteTypedObject}, 1614447044, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            access27100Var3.onWarmupCompleted(Boolean.TRUE);
        }
        textFieldLineCalendarView.setType(UST_CRYPT_VerifySignatureValue.YEAR_MONTH_DAY);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, 1920);
        calendar2.set(2, 0);
        calendar2.set(5, 0);
        EditText editText5 = textFieldLineCalendarView.getEditText();
        if (editText5 != null) {
            editText5.setOnTouchListener(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda30(textFieldLineCalendarView, calendar2, calendar, this, onpreviewreleased));
        }
        textFieldLineCalendarView.setOnTouchListener(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda31(textFieldLineCalendarView, calendar2, calendar, this, onpreviewreleased));
        EditText editTextExtraCallbackWithResult2 = textFieldLineCalendarView.extraCallbackWithResult();
        if (editTextExtraCallbackWithResult2 != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(editTextExtraCallbackWithResult2, new onExtraCallback(objectRef, textFieldLineCalendarView, this));
        }
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackStub;
        TextFieldLine textFieldLineIAuthTabCallback = textFieldLineTextOverlayView.IAuthTabCallback();
        textFieldLineIAuthTabCallback.setHint(getString(R.string.loan_ui_income));
        EditText editText6 = textFieldLineIAuthTabCallback.getEditText();
        Intrinsics.checkNotNull(editText6);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback4 = RxTextView.IAuthTabCallback(editText6).IAuthTabCallback(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda33(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda32(textFieldLineIAuthTabCallback, access27100Var4, this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback4, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback4);
        EditText editText7 = textFieldLineIAuthTabCallback.getEditText();
        if (editText7 != null) {
            editText7.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(6)});
            if (onpreviewreleased != onPreviewReleased.ETC || !asInterface().getInterfaceDescriptor()) {
                editText7.setText(asInterface().ICustomTabsCallback());
            }
            editText7.setImeOptions(6);
        }
        EditText editText8 = textFieldLineIAuthTabCallback.getEditText();
        if (editText8 != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(editText8, new asBinder(textFieldLineIAuthTabCallback));
        }
        String string8 = getString(R.string.loan_string_money_unit_10000);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        textFieldLineTextOverlayView.setLabel(string8);
        return Unit.INSTANCE;
    }

    private static final void onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 125;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        boolean z = false;
        access27100 access27100Var = (access27100) objArr[0];
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[1];
        TextFieldLineCompanyView textFieldLineCompanyView = (TextFieldLineCompanyView) objArr[2];
        CharSequence charSequence = (CharSequence) objArr[3];
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(charSequence);
            if (charSequence.length() > 0) {
                int i3 = access100 + 99;
                int i4 = i3 % 128;
                IAuthTabCallbackStubProxy = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 5;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            }
            access27100Var.onWarmupCompleted(Boolean.valueOf(z));
            loanComparisonFunnelJobDetailFragment.asInterface().IAuthTabCallback(textFieldLineCompanyView.writeTypedObject(), textFieldLineCompanyView.readTypedObject());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(charSequence);
        charSequence.length();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault;
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            iEngagementSignalsCallback_Parcel.onNavigationEvent((Intent) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -648822369, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment}, 648822384, iOnExtraCallbackWithResult3));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel2 = loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault;
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        iEngagementSignalsCallback_Parcel2.onNavigationEvent((Intent) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, -648822369, iOnExtraCallbackWithResult4, new Object[]{loanComparisonFunnelJobDetailFragment}, 648822384, iOnExtraCallbackWithResult6));
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 37;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final String onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onNavigationEvent(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        String string = charSequence.toString();
        int i4 = access100 + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        String strOnWarmupCompleted;
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        TextFieldLineDropDownView textFieldLineDropDownView = (TextFieldLineDropDownView) objArr[1];
        access27100 access27100Var = (access27100) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerAsInterface = loanComparisonFunnelJobDetailFragment.asInterface();
        verifyWithStream verifywithstream = (verifyWithStream) textFieldLineDropDownView.writeTypedObject();
        Object obj = null;
        if (verifywithstream != null) {
            strOnWarmupCompleted = verifywithstream.onWarmupCompleted();
        } else {
            int i2 = access100 + 9;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            strOnWarmupCompleted = null;
        }
        subsamplingScaleImageViewDefaultOnStateChangedListenerAsInterface.asInterface(strOnWarmupCompleted);
        Intrinsics.checkNotNull(str);
        access27100Var.onWarmupCompleted(Boolean.valueOf(str.length() > 0));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final String asInterface(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            return charSequence.toString();
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        charSequence.toString();
        throw null;
    }

    private static final String onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 31;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 81;
        access100 = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineDropDownView textFieldLineDropDownView, access27100 access27100Var, String str) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        String strOnWarmupCompleted = null;
        if (i2 % 2 == 0) {
            loanComparisonFunnelJobDetailFragment.asInterface();
            throw null;
        }
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerAsInterface = loanComparisonFunnelJobDetailFragment.asInterface();
        verifyWithStream verifywithstream = (verifyWithStream) textFieldLineDropDownView.writeTypedObject();
        if (verifywithstream != null) {
            strOnWarmupCompleted = verifywithstream.onWarmupCompleted();
        } else {
            int i3 = access100 + 93;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(1439812487, -1439812479, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListenerAsInterface, strOnWarmupCompleted});
        Intrinsics.checkNotNull(str);
        if (str.length() > 0) {
            int i5 = access100 + 117;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private static final String IAuthTabCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, verifyWithStream verifywithstream) {
        String string;
        int i = 2 % 2;
        Object obj = null;
        if (verifywithstream != null) {
            int i2 = access100 + 63;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = verifywithstream.onNavigationEvent();
            if (i3 != 0) {
                loanComparisonFunnelJobDetailFragment.getString(iOnNavigationEvent);
                obj.hashCode();
                throw null;
            }
            string = loanComparisonFunnelJobDetailFragment.getString(iOnNavigationEvent);
        } else {
            string = null;
        }
        if (string != null) {
            return string;
        }
        int i4 = access100 + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent extends AccessibilityDelegateCompat {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TextFieldLineDropDownView IAuthTabCallback;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ LoanComparisonFunnelJobDetailFragment onNavigationEvent;

        onNavigationEvent(String str, TextFieldLineDropDownView textFieldLineDropDownView, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = textFieldLineDropDownView;
            this.onNavigationEvent = loanComparisonFunnelJobDetailFragment;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            Editable text;
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            String str = this.onExtraCallbackWithResult;
            EditText editText = this.IAuthTabCallback.getEditText();
            if (editText != null) {
                int i4 = onExtraCallback + 9;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                text = editText.getText();
                int i6 = onExtraCallback + 93;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            } else {
                text = null;
            }
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(str + ", " + ((Object) text) + ", " + this.onNavigationEvent.getString(R.string.loan_talkback_dropdown_guide));
        }
    }

    private static final Unit onNavigationEvent(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(triple, "");
        SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(345925429, -345925428, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{loanComparisonFunnelJobDetailFragment.asInterface(), triple});
        EditText editText = textFieldLineCalendarView.getEditText();
        if (editText != null) {
            Object first = triple.getFirst();
            String str = String.format("%02d", Arrays.copyOf(new Object[]{triple.getSecond()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = String.format("%02d", Arrays.copyOf(new Object[]{triple.getThird()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            editText.setText(first + "년 " + str + "월 " + str2 + "일");
            int i4 = access100 + 63;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        access27100Var.onWarmupCompleted(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i6 = access100 + 97;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(triple, "");
            loanComparisonFunnelJobDetailFragment.asInterface().onExtraCallback(triple);
            textFieldLineCalendarView.getEditText();
            throw null;
        }
        Intrinsics.checkNotNullParameter(triple, "");
        loanComparisonFunnelJobDetailFragment.asInterface().onExtraCallback(triple);
        EditText editText = textFieldLineCalendarView.getEditText();
        if (editText != null) {
            Object first = triple.getFirst();
            String str = String.format("%02d", Arrays.copyOf(new Object[]{triple.getSecond()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = String.format("%02d", Arrays.copyOf(new Object[]{triple.getThird()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            editText.setText(first + "년 " + str + "월 " + str2 + "일");
            int i3 = access100 + 7;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        access27100Var.onWarmupCompleted(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(triple, "");
        loanComparisonFunnelJobDetailFragment.asInterface().onExtraCallback(triple);
        EditText editText = textFieldLineCalendarView.getEditText();
        if (editText != null) {
            Object first = triple.getFirst();
            String str = String.format("%02d", Arrays.copyOf(new Object[]{triple.getSecond()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = String.format("%02d", Arrays.copyOf(new Object[]{triple.getThird()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            editText.setText(first + "년 " + str + "월 " + str2 + "일");
            int i4 = access100 + 55;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        access27100Var.onWarmupCompleted(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private static final boolean onNavigationEvent(TextFieldLineCalendarView textFieldLineCalendarView, Calendar calendar, Calendar calendar2, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, onPreviewReleased onpreviewreleased, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent.getAction() != 1) {
            int i4 = access100 + 47;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Intrinsics.checkNotNull(calendar);
        Intrinsics.checkNotNull(calendar2);
        textFieldLineCalendarView.onNavigationEvent(calendar, calendar2, loanComparisonFunnelJobDetailFragment.IAuthTabCallback(onpreviewreleased), String.valueOf(textFieldLineCalendarView.getHint()));
        int i6 = access100 + 7;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(TextFieldLineCalendarView textFieldLineCalendarView, Calendar calendar, Calendar calendar2, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, onPreviewReleased onpreviewreleased, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent.getAction() != 1) {
            int i4 = IAuthTabCallbackStubProxy + 19;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IAuthTabCallbackStubProxy + 63;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNull(calendar);
        Intrinsics.checkNotNull(calendar2);
        textFieldLineCalendarView.onNavigationEvent(calendar, calendar2, loanComparisonFunnelJobDetailFragment.IAuthTabCallback(onpreviewreleased), String.valueOf(textFieldLineCalendarView.getHint()));
        return true;
    }

    public static final class onExtraCallback extends AccessibilityDelegateCompat {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TextFieldLineCalendarView IAuthTabCallback;
        final /* synthetic */ Ref.ObjectRef<String> onExtraCallback;
        final /* synthetic */ LoanComparisonFunnelJobDetailFragment onExtraCallbackWithResult;

        onExtraCallback(Ref.ObjectRef<String> objectRef, TextFieldLineCalendarView textFieldLineCalendarView, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
            this.onExtraCallback = objectRef;
            this.IAuthTabCallback = textFieldLineCalendarView;
            this.onExtraCallbackWithResult = loanComparisonFunnelJobDetailFragment;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            Editable text;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
                super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
                Object obj2 = this.onExtraCallback.element;
                this.IAuthTabCallback.getEditText();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            Object obj3 = this.onExtraCallback.element;
            EditText editText = this.IAuthTabCallback.getEditText();
            if (editText != null) {
                int i3 = onWarmupCompleted + 13;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                text = editText.getText();
            } else {
                text = null;
            }
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(obj3 + ", " + ((Object) text) + ", " + this.onExtraCallbackWithResult.getString(R.string.loan_talkback_dropdown_guide));
            int i5 = onNavigationEvent + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static final void ICustomTabsCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 3;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        TextFieldLine textFieldLine = (TextFieldLine) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = textFieldLine.getEditText();
        Intrinsics.checkNotNull(editText);
        editText.setSelection(str.length());
        int i4 = access100 + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(TextFieldLine textFieldLine, access27100 access27100Var, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, CharSequence charSequence) {
        String strValueOf;
        boolean z;
        int i = 2 % 2;
        Long longOrNull = StringsKt.toLongOrNull(charSequence.toString());
        if (longOrNull == null || (strValueOf = String.valueOf(longOrNull.longValue())) == null) {
            strValueOf = "";
        }
        String strOnNavigationEvent = new Regex("^0+").onNavigationEvent(strValueOf, "");
        if (strOnNavigationEvent.length() != charSequence.length()) {
            EditText editText = textFieldLine.getEditText();
            Intrinsics.checkNotNull(editText);
            editText.setText(strOnNavigationEvent);
            EditText editText2 = textFieldLine.getEditText();
            Intrinsics.checkNotNull(editText2);
            editText2.post(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda12(textFieldLine, strOnNavigationEvent));
        }
        if (strOnNavigationEvent.length() >= 2) {
            int i2 = access100 + 45;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                TextUtils.isDigitsOnly(strOnNavigationEvent);
                throw null;
            }
            if (TextUtils.isDigitsOnly(strOnNavigationEvent)) {
                z = true;
            } else {
                int i3 = access100 + 7;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            }
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        if (z) {
            loanComparisonFunnelJobDetailFragment.asInterface().onTransact(charSequence.toString());
        }
        return Unit.INSTANCE;
    }

    public static final class asBinder extends AccessibilityDelegateCompat {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TextFieldLine onExtraCallback;

        asBinder(TextFieldLine textFieldLine) {
            this.onExtraCallback = textFieldLine;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            Editable text = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
                super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
                LoanComparisonFunnelJobDetailFragment.this.getString(R.string.loan_ui_income);
                this.onExtraCallback.getEditText();
                text.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            String string = LoanComparisonFunnelJobDetailFragment.this.getString(R.string.loan_ui_income);
            EditText editText = this.onExtraCallback.getEditText();
            if (editText != null) {
                text = editText.getText();
                int i3 = onWarmupCompleted + 49;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(string + ", " + ((Object) text) + LoanComparisonFunnelJobDetailFragment.this.getString(R.string.loan_string_money_unit_10000) + ", " + LoanComparisonFunnelJobDetailFragment.this.getString(R.string.loan_talkback_dropdown_guide));
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserializeUriCollection deserializeuricollection = loanComparisonFunnelJobDetailFragment.asInterface;
            obj.hashCode();
            throw null;
        }
        deserializeUriCollection deserializeuricollection2 = loanComparisonFunnelJobDetailFragment.asInterface;
        if (deserializeuricollection2 != null) {
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onWarmupCompleted(list, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda47(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda46()));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            deserializeuricollection2.onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, (Function1) null, (Function0) null, new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda48(loanComparisonFunnelJobDetailFragment), 3, (Object) null));
            int i3 = IAuthTabCallbackStubProxy + 85;
            access100 = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = access100 + 11;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final Boolean writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Boolean) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{loanComparisonFunnelJobDetailFragment.asInterface()}), onPreviewReleased.ETC.getCode());
            throw null;
        }
        if (Intrinsics.areEqual((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{loanComparisonFunnelJobDetailFragment.asInterface()}), onPreviewReleased.ETC.getCode())) {
            int i3 = access100 + 125;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            if (!loanComparisonFunnelJobDetailFragment.asInterface().getInterfaceDescriptor()) {
                toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault();
                if (toggletracedebugpanelstatusIAuthTabCallbackDefault != null) {
                    int i5 = access100 + 37;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    int i6 = i5 % 2;
                    KeyboardBottomCta keyboardBottomCta = toggletracedebugpanelstatusIAuthTabCallbackDefault.IAuthTabCallbackDefault;
                    if (keyboardBottomCta != null) {
                        Intrinsics.checkNotNull(bool);
                        getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, bool.booleanValue());
                    }
                }
            } else {
                int i7 = IAuthTabCallbackStubProxy + 29;
                access100 = i7 % 128;
                if (i7 % 2 == 0) {
                    loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault();
                    obj.hashCode();
                    throw null;
                }
                toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault2 = loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault();
                if (toggletracedebugpanelstatusIAuthTabCallbackDefault2 != null) {
                    int i8 = IAuthTabCallbackStubProxy + 21;
                    access100 = i8 % 128;
                    int i9 = i8 % 2;
                    KeyboardBottomCta keyboardBottomCta2 = toggletracedebugpanelstatusIAuthTabCallbackDefault2.IAuthTabCallbackDefault;
                    if (keyboardBottomCta2 != null) {
                        getLongOctalBytes.onWarmupCompleted(keyboardBottomCta2, true);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment = (LoanComparisonFunnelJobDetailFragment) objArr[0];
        onPreviewReleased onpreviewreleased = (onPreviewReleased) objArr[1];
        Triple triple = (Triple) objArr[2];
        int i = 2 % 2;
        if (onpreviewreleased != onPreviewReleased.SELF_BUSINESS) {
            loanComparisonFunnelJobDetailFragment.asInterface().onExtraCallback(triple);
            int i2 = IAuthTabCallbackStubProxy + 103;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Object[] objArr2 = {loanComparisonFunnelJobDetailFragment.asInterface(), triple};
        SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(345925429, -345925428, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr2);
        int i4 = IAuthTabCallbackStubProxy + 85;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return null;
    }

    private final void onWarmupCompleted(access27100<Boolean> access27100Var, access27100<Boolean> access27100Var2, Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        deserializeUriCollection deserializeuricollection = this.asInterface;
        Object obj = null;
        if (deserializeuricollection != null) {
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = clearMessage.onWarmupCompleted.IAuthTabCallback(access27100Var, access27100Var2).onWarmupCompleted(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda1(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda0())).onExtraCallbackWithResult(1L);
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallbackWithResult, "");
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            deserializeuricollection.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda3(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda2(function0)), new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda5(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda4())));
            int i4 = IAuthTabCallbackStubProxy + 13;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallbackStubProxy + 29;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = IAuthTabCallbackStubProxy + 77;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallbackWithResult(Pair pair) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pair, "");
            int i3 = 90 / 0;
            if (((Boolean) pair.getFirst()).booleanValue()) {
                int i4 = access100 + 85;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                Boolean bool = (Boolean) pair.getSecond();
                if (i5 != 0) {
                    bool.booleanValue();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!bool.booleanValue()) {
                    return true;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(pair, "");
            if (((Boolean) pair.getFirst()).booleanValue()) {
            }
        }
        return false;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 53;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return null;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final Unit onExtraCallback(TextFieldLineCalendarView textFieldLineCalendarView, TextFieldLineTextOverlayView textFieldLineTextOverlayView, access27100<Boolean> access27100Var, access27100<Boolean> access27100Var2) {
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault();
            obj.hashCode();
            throw null;
        }
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (toggletracedebugpanelstatusIAuthTabCallbackDefault == null) {
            int i3 = access100 + 91;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        LinearLayout linearLayout = toggletracedebugpanelstatusIAuthTabCallbackDefault.asBinder;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        TdsCheckBoxV1View tdsCheckBoxV1View = toggletracedebugpanelstatusIAuthTabCallbackDefault.onExtraCallbackWithResult;
        tdsCheckBoxV1View.setOnCheckedChangeListener(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda15(this, tdsCheckBoxV1View, textFieldLineCalendarView, textFieldLineTextOverlayView, access27100Var, access27100Var2));
        tdsCheckBoxV1View.setChecked(asInterface().getInterfaceDescriptor());
        toggletracedebugpanelstatusIAuthTabCallbackDefault.asBinder.setOnClickListener(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda16(toggletracedebugpanelstatusIAuthTabCallbackDefault));
        LinearLayout linearLayout2 = toggletracedebugpanelstatusIAuthTabCallbackDefault.asBinder;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        setProtocolsokhttp.onExtraCallbackWithResult(linearLayout2, new onTransact(toggletracedebugpanelstatusIAuthTabCallbackDefault, this));
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TdsCheckBoxV1View tdsCheckBoxV1View, TextFieldLineCalendarView textFieldLineCalendarView, TextFieldLineTextOverlayView textFieldLineTextOverlayView, access27100 access27100Var, access27100 access27100Var2, TdsCheckBoxV1View tdsCheckBoxV1View2, boolean z) {
        String string;
        String string2;
        int iOnPostMessage;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsCheckBoxV1View2, "");
        boolean z2 = !z;
        if (z) {
            string = loanComparisonFunnelJobDetailFragment.getString(R.string.loan_comparison_funnel___d58fa73adc);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else {
            int i2 = access100 + 23;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 41 / 0;
            }
            string = "";
        }
        if (z) {
            string2 = "";
        } else {
            string2 = loanComparisonFunnelJobDetailFragment.getString(R.string.loan_comparison_funnel___39029d6abb);
            int i4 = IAuthTabCallbackStubProxy + 109;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNull(tdsCheckBoxV1View);
        if (z) {
            Context context = tdsCheckBoxV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iOnPostMessage = new getUrlokhttp(new asInterface(configuration)).onPostMessage();
            int i6 = access100 + 81;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 % 4;
            }
        } else {
            Context context2 = tdsCheckBoxV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnPostMessage = new getUrlokhttp(new IAuthTabCallbackDefault(configuration2)).onRelationshipValidationResult();
            int i8 = IAuthTabCallbackStubProxy + 85;
            access100 = i8 % 128;
            int i9 = i8 % 2;
        }
        textFieldLineCalendarView.setArrow(z2);
        EditText editText = textFieldLineCalendarView.getEditText();
        if (editText != null) {
            editText.setEnabled(z2);
            editText.setText(string);
            editText.setTextColor(iOnPostMessage);
        }
        textFieldLineTextOverlayView.setLabel(string2);
        EditText editTextOnWarmupCompleted = textFieldLineTextOverlayView.onWarmupCompleted();
        if (editTextOnWarmupCompleted != null) {
            int i10 = IAuthTabCallbackStubProxy + 55;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            editTextOnWarmupCompleted.setEnabled(z2);
            editTextOnWarmupCompleted.setText(string);
            editTextOnWarmupCompleted.setTextColor(iOnPostMessage);
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        access27100Var2.onWarmupCompleted(Boolean.valueOf(z));
        Object obj = null;
        SubsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallbackWithResult(loanComparisonFunnelJobDetailFragment.asInterface(), z, false, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i12 = IAuthTabCallbackStubProxy + 117;
        access100 = i12 % 128;
        if (i12 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, View view) {
        int i = 2 % 2;
        int i2 = access100 + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        toggletracedebugpanelstatus.onExtraCallbackWithResult.toggle();
        int i4 = access100 + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onTransact extends AccessibilityDelegateCompat {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ toggleTraceDebugPanelStatus IAuthTabCallback;
        final /* synthetic */ LoanComparisonFunnelJobDetailFragment onExtraCallbackWithResult;

        onTransact(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
            this.IAuthTabCallback = toggletracedebugpanelstatus;
            this.onExtraCallbackWithResult = loanComparisonFunnelJobDetailFragment;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            Object obj = null;
            if (this.IAuthTabCallback.onExtraCallbackWithResult.isChecked()) {
                int i5 = onWarmupCompleted + 123;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = R.string.loan_talkback_checkbox_checked;
                    obj.hashCode();
                    throw null;
                }
                loanComparisonFunnelJobDetailFragment = this.onExtraCallbackWithResult;
                i = R.string.loan_talkback_checkbox_checked;
            } else {
                loanComparisonFunnelJobDetailFragment = this.onExtraCallbackWithResult;
                i = R.string.loan_talkback_checkbox_unchecked;
                int i7 = onWarmupCompleted + 113;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            String string = loanComparisonFunnelJobDetailFragment.getString(i);
            Intrinsics.checkNotNull(string);
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(this.onExtraCallbackWithResult.getString(R.string.loan_talkback_checkbox) + ", " + string);
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            int i9 = onNavigationEvent + 69;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private final Triple<Integer, Integer, Integer> IAuthTabCallback(onPreviewReleased onpreviewreleased) {
        int i;
        Triple tripleAccess000;
        int i2 = 2 % 2;
        int i3 = access100 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0 ? (i = onWarmupCompleted.onExtraCallbackWithResult[onpreviewreleased.ordinal()]) == 2 : (i = onWarmupCompleted.onExtraCallbackWithResult[onpreviewreleased.ordinal()]) == 2) {
            tripleAccess000 = asInterface().writeTypedObject();
        } else if (i != 4) {
            int i4 = access100 + 105;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                tripleAccess000 = asInterface().access000();
                int i5 = 43 / 0;
            } else {
                tripleAccess000 = asInterface().access000();
            }
        } else {
            tripleAccess000 = asInterface().access000();
        }
        if (tripleAccess000 != null) {
            int i6 = access100 + 123;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (((Number) tripleAccess000.getFirst()).intValue() >= 0 && ((Number) tripleAccess000.getSecond()).intValue() >= 0 && ((Number) tripleAccess000.getThird()).intValue() >= 0) {
                return new Triple<>(tripleAccess000.getFirst(), Integer.valueOf(Math.max(((Number) tripleAccess000.getSecond()).intValue() - 1, 0)), Integer.valueOf(Math.max(((Number) tripleAccess000.getThird()).intValue() - 1, 0)));
            }
        }
        Calendar calendar = Calendar.getInstance();
        Triple<Integer, Integer, Integer> triple = new Triple<>(Integer.valueOf(calendar.get(1)), Integer.valueOf(Math.max(calendar.get(2), 0)), Integer.valueOf(Math.max(calendar.get(5) - 1, 0)));
        int i8 = IAuthTabCallbackStubProxy + 13;
        access100 = i8 % 128;
        int i9 = i8 % 2;
        return triple;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = (TextFieldLineTextOverlayView) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            M_.onWarmupCompleted(M_.onExtraCallback, textFieldLineTextOverlayView.onWarmupCompleted(), 0L, 2, (Object) null);
            return null;
        }
        M_.onWarmupCompleted(M_.onExtraCallback, textFieldLineTextOverlayView.onWarmupCompleted(), 0L, 2, (Object) null);
        return null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        super/*im.toss.base.BaseFragment*/.onDestroyView();
        deserializeUriCollection deserializeuricollection = this.asInterface;
        if (deserializeuricollection != null) {
            int i2 = access100 + 85;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            deserializeuricollection.dispose();
        }
        deserializeUriCollection deserializeuricollection2 = this.IAuthTabCallbackStub;
        if (deserializeuricollection2 != null) {
            int i4 = access100 + 107;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            deserializeuricollection2.dispose();
        }
        this.asInterface = null;
        this.IAuthTabCallbackStub = null;
    }

    public void extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onRenderReady.onNavigationEvent(this, "KEY_FUNNEL_BACK", Boolean.TRUE, true, 2, (Object) null);
        } else {
            onRenderReady.onNavigationEvent(this, "KEY_FUNNEL_BACK", Boolean.TRUE, false, 4, (Object) null);
        }
    }

    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        if (!onTransact().readTypedObject()) {
            IAuthTabCallback_Parcel();
            int i2 = IAuthTabCallbackStubProxy + 115;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 53;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final Unit onNavigationEvent(TextFieldLineTextOverlayView textFieldLineTextOverlayView) {
        long jLongValue;
        int i = 2 % 2;
        Object obj = null;
        if (IAuthTabCallbackDefault() == null) {
            return null;
        }
        EditText editText = textFieldLineTextOverlayView.IAuthTabCallback().getEditText();
        if (editText != null) {
            int i2 = access100 + 3;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Long longOrNull = StringsKt.toLongOrNull(editText.getText().toString());
            if (longOrNull != null) {
                int i4 = access100 + 85;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    longOrNull.longValue();
                    obj.hashCode();
                    throw null;
                }
                jLongValue = longOrNull.longValue();
            } else {
                jLongValue = 0;
            }
            onExtraCallback(jLongValue);
            deserializeUriCollection deserializeuricollection = this.IAuthTabCallbackStub;
            if (deserializeuricollection != null) {
                int i5 = access100 + 81;
                IAuthTabCallbackStubProxy = i5 % 128;
                if (i5 % 2 != 0) {
                    deserializeuricollection.dispose();
                    int i6 = 39 / 0;
                } else {
                    deserializeuricollection.dispose();
                }
            }
            this.IAuthTabCallbackStub = new deserializeUriCollection();
            getByteBuffer getbytebufferAsInterface = RxTextView.IAuthTabCallback(editText).onExtraCallback(500L, TimeUnit.MILLISECONDS).asInterface(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda18(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda17()));
            Intrinsics.checkNotNullExpressionValue(getbytebufferAsInterface, "");
            getByteBuffer getbytebufferOnExtraCallback = getbytebufferAsInterface.onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnExtraCallback.IAuthTabCallback(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda20(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda19(this)));
            deserializeUriCollection deserializeuricollection2 = this.IAuthTabCallbackStub;
            if (deserializeuricollection2 != null) {
                deserializeuricollection2.onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
                int i7 = IAuthTabCallbackStubProxy + 101;
                access100 = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Long IAuthTabCallback(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            StringsKt.toLongOrNull(charSequence.toString());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        Long longOrNull = StringsKt.toLongOrNull(charSequence.toString());
        Long lValueOf = Long.valueOf(longOrNull != null ? longOrNull.longValue() : 0L);
        int i3 = IAuthTabCallbackStubProxy + 105;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return lValueOf;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, Long l) {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(l);
            loanComparisonFunnelJobDetailFragment.onExtraCallback(l.longValue());
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStubProxy + 47;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        Intrinsics.checkNotNull(l);
        loanComparisonFunnelJobDetailFragment.onExtraCallback(l.longValue());
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Unit onExtraCallback(long j) {
        boolean z;
        boolean z2;
        String string;
        boolean z3;
        int i = 2 % 2;
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (toggletracedebugpanelstatusIAuthTabCallbackDefault == null) {
            return null;
        }
        int i2 = access100 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        if (onPreviewReleased.Companion.onExtraCallback((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{asInterface()})) == onPreviewReleased.ETC) {
            int i5 = access100 + 47;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = access100 + 53;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (j > 0) {
            int i9 = access100 + 119;
            int i10 = i9 % 128;
            IAuthTabCallbackStubProxy = i10;
            int i11 = i9 % 2;
            if (j < 2000) {
                int i12 = i10 + 99;
                access100 = i12 % 128;
                int i13 = i12 % 2;
                z2 = true;
            } else {
                int i14 = access100 + 111;
                IAuthTabCallbackStubProxy = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 4 % 4;
                }
                z2 = false;
            }
        }
        int i16 = 8;
        string = "";
        if (!z) {
            Typography6 typography6 = toggletracedebugpanelstatusIAuthTabCallbackDefault.access100;
            Intrinsics.checkNotNullExpressionValue(typography6, "");
            if (z2) {
                i16 = 0;
            } else {
                int i17 = IAuthTabCallbackStubProxy + 77;
                access100 = i17 % 128;
                int i18 = i17 % 2;
            }
            typography6.setVisibility(i16);
            Typography6 typography62 = toggletracedebugpanelstatusIAuthTabCallbackDefault.access100;
            if (z2) {
                int i19 = IAuthTabCallbackStubProxy + 9;
                access100 = i19 % 128;
                if (i19 % 2 == 0) {
                    string = getString(R.string.loan_comparison_funnel_job_detail_low_income_notice);
                    int i20 = 55 / 0;
                } else {
                    string = getString(R.string.loan_comparison_funnel_job_detail_low_income_notice);
                }
            }
            typography62.setText(string);
        } else if (j == 0) {
            z3 = true;
            Typography6 typography63 = toggletracedebugpanelstatusIAuthTabCallbackDefault.access100;
            Intrinsics.checkNotNullExpressionValue(typography63, "");
            if (!(!z3)) {
                int i21 = IAuthTabCallbackStubProxy + 67;
                access100 = i21 % 128;
                int i22 = i21 % 2;
            } else {
                i4 = 8;
            }
            typography63.setVisibility(i4);
            toggletracedebugpanelstatusIAuthTabCallbackDefault.access100.setText(z3 ? j == 0 ? getString(R.string.loan_comparison_funnel_job_detail_no_income_notice) : getString(R.string.loan_comparison_funnel_job_detail_low_income_notice) : "");
        } else if (!z2) {
            z3 = false;
            Typography6 typography632 = toggletracedebugpanelstatusIAuthTabCallbackDefault.access100;
            Intrinsics.checkNotNullExpressionValue(typography632, "");
            if (!(!z3)) {
            }
            typography632.setVisibility(i4);
            toggletracedebugpanelstatusIAuthTabCallbackDefault.access100.setText(z3 ? j == 0 ? getString(R.string.loan_comparison_funnel_job_detail_no_income_notice) : getString(R.string.loan_comparison_funnel_job_detail_low_income_notice) : "");
        } else {
            int i23 = IAuthTabCallbackStubProxy + 101;
            access100 = i23 % 128;
            int i24 = i23 % 2;
            z3 = true;
            Typography6 typography6322 = toggletracedebugpanelstatusIAuthTabCallbackDefault.access100;
            Intrinsics.checkNotNullExpressionValue(typography6322, "");
            if (!(!z3)) {
            }
            typography6322.setVisibility(i4);
            toggletracedebugpanelstatusIAuthTabCallbackDefault.access100.setText(z3 ? j == 0 ? getString(R.string.loan_comparison_funnel_job_detail_no_income_notice) : getString(R.string.loan_comparison_funnel_job_detail_low_income_notice) : "");
        }
        onRelationshipValidationResult();
        return Unit.INSTANCE;
    }

    private final void onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = access100 + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (toggletracedebugpanelstatusIAuthTabCallbackDefault != null) {
            int i4 = IAuthTabCallbackStubProxy + 9;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            ScrollView scrollView = toggletracedebugpanelstatusIAuthTabCallbackDefault.access000;
            if (scrollView != null) {
                scrollView.post(new LoanComparisonFunnelJobDetailFragment$.ExternalSyntheticLambda23(this));
            }
        }
        int i6 = access100 + 23;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment) {
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault;
        ScrollView scrollView;
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault2;
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallbackDefault3;
        Typography6 typography6;
        int i = 2 % 2;
        if (!loanComparisonFunnelJobDetailFragment.isAdded() || (toggletracedebugpanelstatusIAuthTabCallbackDefault = loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault()) == null || (scrollView = toggletracedebugpanelstatusIAuthTabCallbackDefault.access000) == null || (toggletracedebugpanelstatusIAuthTabCallbackDefault2 = loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault()) == null) {
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatusIAuthTabCallbackDefault2.IAuthTabCallbackStub;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextFieldLineTextOverlayView textFieldLineTextOverlayView2 = toggletracedebugpanelstatusIAuthTabCallbackDefault2.IAuthTabCallbackStub;
        if (textFieldLineTextOverlayView2 != null) {
            int i3 = access100 + 9;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            TextFieldLine textFieldLineIAuthTabCallback = textFieldLineTextOverlayView2.IAuthTabCallback();
            if (textFieldLineIAuthTabCallback != null) {
                int i5 = access100 + 11;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                EditText editText = textFieldLineIAuthTabCallback.getEditText();
                if (editText == null || (toggletracedebugpanelstatusIAuthTabCallbackDefault3 = loanComparisonFunnelJobDetailFragment.IAuthTabCallbackDefault()) == null || (typography6 = toggletracedebugpanelstatusIAuthTabCallbackDefault3.access100) == null || !editText.isFocused()) {
                    return;
                }
                int i7 = access100 + 97;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                if (typography6.getVisibility() == 0) {
                    int[] iArr = new int[2];
                    typography6.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    scrollView.getLocationInWindow(iArr2);
                    scrollView.smoothScrollTo(0, scrollView.getScrollY() + ((iArr[1] - iArr2[1]) - (scrollView.getHeight() / 3)));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Boolean onWarmupCompleted(Object[] objArr) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(objArr, "");
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = IAuthTabCallbackStubProxy + 37;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = objArr[i2];
                Intrinsics.checkNotNull(obj, "");
                arrayList.add((Boolean) obj);
                i2 += 60;
            } else {
                Object obj2 = objArr[i2];
                Intrinsics.checkNotNull(obj2, "");
                arrayList.add((Boolean) obj2);
                i2++;
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        int i4 = access100 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Object next = it.next();
        while (it.hasNext()) {
            boolean zBooleanValue = ((Boolean) it.next()).booleanValue();
            if (((Boolean) next).booleanValue()) {
                int i6 = IAuthTabCallbackStubProxy + 29;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                z = zBooleanValue;
            }
            next = Boolean.valueOf(z);
        }
        return (Boolean) next;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 875990394, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -875990391, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, Boolean bool) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1348811512, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, bool}, -1348811512, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1446808833, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, toggletracedebugpanelstatus}, -1446808813, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineDropDownView textFieldLineDropDownView, access27100 access27100Var, String str) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1935986741, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, textFieldLineDropDownView, access27100Var, str}, -1935986730, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TdsCheckBoxV1View tdsCheckBoxV1View, TextFieldLineCalendarView textFieldLineCalendarView, TextFieldLineTextOverlayView textFieldLineTextOverlayView, access27100 access27100Var, access27100 access27100Var2, TdsCheckBoxV1View tdsCheckBoxV1View2, boolean z) {
        Object[] objArr = {loanComparisonFunnelJobDetailFragment, tdsCheckBoxV1View, textFieldLineCalendarView, textFieldLineTextOverlayView, access27100Var, access27100Var2, tdsCheckBoxV1View2, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -683743004, iOnExtraCallbackWithResult, objArr, 683743023, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -2082865944, iOnExtraCallbackWithResult, new Object[]{function1, obj}, 2082865952, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1313922475, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, iEngagementSignalsCallbackDefault}, -1313922457, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 116090110, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -116090094, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onExtraCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, Boolean bool) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1938506108, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, bool}, 1938506125, iOnExtraCallbackWithResult3);
    }

    private static final Unit IAuthTabCallback(Function0 function0, Pair pair) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 733371289, iOnExtraCallbackWithResult, new Object[]{function0, pair}, -733371275, iOnExtraCallbackWithResult3);
    }

    private static final void access000(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1350830851, iOnExtraCallbackWithResult, new Object[]{function1, obj}, 1350830873, iOnExtraCallbackWithResult3);
    }

    private final void onExtraCallback(TextFieldLineTextOverlayView textFieldLineTextOverlayView) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 923060807, iOnExtraCallbackWithResult, new Object[]{this, textFieldLineTextOverlayView}, -923060802, iOnExtraCallbackWithResult3);
    }

    private final Intent onMinimized() {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Intent) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -648822369, iOnExtraCallbackWithResult, new Object[]{this}, 648822384, iOnExtraCallbackWithResult3);
    }

    private static final Long ICustomTabsCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Long) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1967056622, iOnExtraCallbackWithResult, new Object[]{function1, obj}, 1967056632, iOnExtraCallbackWithResult3);
    }

    private static final Unit onExtraCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 50530353, iOnExtraCallbackWithResult, new Object[]{toggletracedebugpanelstatus}, -50530351, iOnExtraCallbackWithResult3);
    }

    private static final Unit IAuthTabCallbackStub(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 680255946, iOnExtraCallbackWithResult, new Object[]{toggletracedebugpanelstatus}, -680255942, iOnExtraCallbackWithResult3);
    }

    private static final Unit onExtraCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1230670124, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, toggletracedebugpanelstatus}, -1230670118, iOnExtraCallbackWithResult3);
    }

    private final void onNavigationEvent(List<access27100<Boolean>> list) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1684579141, iOnExtraCallbackWithResult, new Object[]{this, list}, -1684579134, iOnExtraCallbackWithResult3);
    }

    private static final Unit onExtraCallback(access27100 access27100Var, LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineCompanyView textFieldLineCompanyView, CharSequence charSequence) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1408652846, iOnExtraCallbackWithResult, new Object[]{access27100Var, loanComparisonFunnelJobDetailFragment, textFieldLineCompanyView, charSequence}, -1408652825, iOnExtraCallbackWithResult3);
    }

    private static final Unit onExtraCallback(LoanComparisonFunnelJobDetailFragment loanComparisonFunnelJobDetailFragment, TextFieldLineDropDownView textFieldLineDropDownView, access27100 access27100Var, String str) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1790416726, iOnExtraCallbackWithResult, new Object[]{loanComparisonFunnelJobDetailFragment, textFieldLineDropDownView, access27100Var, str}, 1790416739, iOnExtraCallbackWithResult3);
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 2021728312, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -2021728311, iOnExtraCallbackWithResult3);
    }

    private static final void onExtraCallbackWithResult(TextFieldLine textFieldLine, String str) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1934346190, iOnExtraCallbackWithResult, new Object[]{textFieldLine, str}, 1934346199, iOnExtraCallbackWithResult3);
    }

    private final void onNavigationEvent(onPreviewReleased onpreviewreleased, Triple<Integer, Integer, Integer> triple) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1614447032, iOnExtraCallbackWithResult, new Object[]{this, onpreviewreleased, triple}, 1614447044, iOnExtraCallbackWithResult3);
    }
}
