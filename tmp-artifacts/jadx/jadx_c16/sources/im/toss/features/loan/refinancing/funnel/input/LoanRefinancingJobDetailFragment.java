package im.toss.features.loan.refinancing.funnel.input;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.lguplus.usimlib.TsmResponse;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.common.RefinancingLoanType;
import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingJobDetailFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.featurescommon.companysearch.model.CompanyInfo;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.GriverLoadingDialog;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.JsonReaderUnknownNumberParsing;
import o.M_;
import o.PageContext;
import o.RippleNode;
import o.RotationProvider1;
import o.RsaUtil;
import o.SetDetectableSize;
import o.SubsamplingScaleImageViewDefaultOnStateChangedListener;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TarConstants;
import o.TrackGroupExternalSyntheticLambda0;
import o.UST_CRYPT_VerifySignatureValue;
import o.access27100;
import o.access27200;
import o.addAllCommandLine;
import o.clearMessage;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.getAdService;
import o.getLastErrorCode;
import o.getLongOctalBytes;
import o.getResourceFromGlobalPackagePool;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.onAdViewAdDisplayFailed;
import o.onPageExit;
import o.onPreviewReleased;
import o.onRenderReady;
import o.preFillDefault;
import o.readIntokhttp;
import o.resetErrorCode;
import o.setApTextSize;
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
public final class LoanRefinancingJobDetailFragment extends Hilt_LoanRefinancingJobDetailFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char[] IAuthTabCallback_Parcel = null;
    private static int ICustomTabsCallback = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final int onWarmupCompleted;
    private deserializeUriCollection asBinder;

    @Inject
    public GriverLoadingDialog companySearchIntentProvider;
    private final List<TarConstants> getInterfaceDescriptor;
    private final Lazy onExtraCallbackWithResult;
    private final IEngagementSignalsCallback_Parcel<Intent> onNavigationEvent;
    private final access27200<Boolean> onTransact;
    private int IAuthTabCallbackDefault = R.layout.fragment_loan_comparison_funnel_job_detail;
    private final PageContext IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onNavigationEvent);

    static {
        onTransact();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingJobDetailFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelJobDetailBinding;", 0)};
        onWarmupCompleted = 8;
        int i = access000 + 69;
        ICustomTabsCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ String IAuthTabCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, verifyWithStream verifywithstream) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(loanRefinancingJobDetailFragment, verifywithstream);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnExtraCallback = onExtraCallback(loanRefinancingJobDetailFragment, verifywithstream);
        int i3 = IAuthTabCallbackStubProxy + 41;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TdsCheckBoxV1View tdsCheckBoxV1View, TextFieldLineCalendarView textFieldLineCalendarView, TextFieldLineTextOverlayView textFieldLineTextOverlayView, access27100 access27100Var, access27100 access27100Var2, TdsCheckBoxV1View tdsCheckBoxV1View2, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(loanRefinancingJobDetailFragment, tdsCheckBoxV1View, textFieldLineCalendarView, textFieldLineTextOverlayView, access27100Var, access27100Var2, tdsCheckBoxV1View2, z);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingJobDetailFragment, tdsCheckBoxV1View, textFieldLineCalendarView, textFieldLineTextOverlayView, access27100Var, access27100Var2, tdsCheckBoxV1View2, z);
        int i3 = access100 + 109;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return (Unit) onNavigationEvent(-242230723, iOnNavigationEvent, 242230723, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, bool}, iOnNavigationEvent2, iOnNavigationEvent3);
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingJobDetailFragment, toggletracedebugpanelstatus);
        int i4 = IAuthTabCallbackStubProxy + 39;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(toggletracedebugpanelstatus);
        int i4 = IAuthTabCallbackStubProxy + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onNavigationEvent(994941577, iOnNavigationEvent, -994941571, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, iOnNavigationEvent2, iOnNavigationEvent3);
            throw null;
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(994941577, iOnNavigationEvent4, -994941571, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, iOnNavigationEvent5, iOnNavigationEvent6);
        int i3 = IAuthTabCallbackStubProxy + 87;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 63;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return (Unit) onNavigationEvent(1262221831, iOnNavigationEvent, -1262221811, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, bool}, iOnNavigationEvent2, iOnNavigationEvent3);
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        TextFieldLine textFieldLine = (TextFieldLine) objArr[0];
        access27100 access27100Var = (access27100) objArr[1];
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[2];
        CharSequence charSequence = (CharSequence) objArr[3];
        int i = 2 % 2;
        int i2 = access100 + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(textFieldLine, access27100Var, loanRefinancingJobDetailFragment, charSequence);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(textFieldLine, access27100Var, loanRefinancingJobDetailFragment, charSequence);
        int i3 = IAuthTabCallbackStubProxy + 3;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Boolean IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolWriteTypedObject = writeTypedObject(function1, obj);
        int i4 = access100 + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return boolWriteTypedObject;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(loanRefinancingJobDetailFragment, view);
        if (i3 == 0) {
            return null;
        }
        int i4 = 66 / 0;
        return null;
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = access100 + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Object[] objArr2 = (Object[]) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(objArr2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolOnExtraCallback = onExtraCallback(objArr2);
        int i3 = IAuthTabCallbackStubProxy + 95;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return boolOnExtraCallback;
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intentOnNavigationEvent = onNavigationEvent(loanRefinancingJobDetailFragment);
        int i4 = IAuthTabCallbackStubProxy + 19;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return intentOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy(function1, obj);
            throw null;
        }
        boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i3 = access100 + 13;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
        return zIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = access100 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(loanRefinancingJobDetailFragment, iEngagementSignalsCallbackDefault);
        }
        onExtraCallbackWithResult(loanRefinancingJobDetailFragment, iEngagementSignalsCallbackDefault);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(-1699780038, iOnNavigationEvent4, 1699780042, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, toggletracedebugpanelstatus}, iOnNavigationEvent5, iOnNavigationEvent6);
        int i3 = access100 + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(th);
        int i4 = IAuthTabCallbackStubProxy + 73;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, View view) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(toggletracedebugpanelstatus, view);
        int i4 = access100 + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(TextFieldLineCalendarView textFieldLineCalendarView, Calendar calendar, Calendar calendar2, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, onPreviewReleased onpreviewreleased, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(textFieldLineCalendarView, calendar, calendar2, loanRefinancingJobDetailFragment, onpreviewreleased, view, motionEvent);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = access100 + 69;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return zIAuthTabCallback;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityResized(function1, obj);
        }
        onActivityResized(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingJobDetailFragment);
        int i4 = access100 + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return (Unit) onNavigationEvent(37280790, iOnNavigationEvent, -37280780, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, setDetectableSize}, iOnNavigationEvent2, iOnNavigationEvent3);
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(-1726951063, iOnNavigationEvent, 1726951082, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, textFieldLineCalendarView, access27100Var, triple}, iOnNavigationEvent2, iOnNavigationEvent3);
        int i4 = IAuthTabCallbackStubProxy + 81;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineDropDownView textFieldLineDropDownView, access27100 access27100Var, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingJobDetailFragment, textFieldLineDropDownView, access27100Var, str);
        int i4 = IAuthTabCallbackStubProxy + 3;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, Pair pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return (Unit) onNavigationEvent(1312579992, iOnNavigationEvent, -1312579974, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function0, pair}, iOnNavigationEvent2, iOnNavigationEvent3);
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(1312579992, iOnNavigationEvent4, -1312579974, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function0, pair}, iOnNavigationEvent5, iOnNavigationEvent6);
        int i3 = 9 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(854837464, iOnNavigationEvent4, -854837461, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{toggletracedebugpanelstatus}, iOnNavigationEvent5, iOnNavigationEvent6);
        int i3 = access100 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(toggletracedebugpanelstatus, loanRefinancingJobDetailFragment, z);
        int i4 = IAuthTabCallbackStubProxy + 55;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        String strIntern;
        Object objOnExtraCallback;
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = ~i3;
        int i12 = (~(i8 | i11 | i)) | i10;
        int i13 = (~(i2 | i11)) | (~(i7 | i11));
        int i14 = i + i3 + i5 + (1941422536 * i6) + ((-555707305) * i4);
        int i15 = i14 * i14;
        int i16 = (i * (-2131549542)) + 177471488 + ((-2131549542) * i3) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i5) + ((-1363148800) * i6) + (2141716480 * i4) + ((-573308928) * i15);
        int i17 = ((i * 487360618) - 1291405921) + (i3 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i5 * 487361161) + (i6 * (-1188264952)) + (i4 * 624576655) + (i15 * (-25952256));
        switch (i16 + (i17 * i17 * 74186752)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) objArr[0];
                int i18 = 2 % 2;
                int i19 = IAuthTabCallbackStubProxy + 43;
                access100 = i19 % 128;
                toggletracedebugpanelstatus.IAuthTabCallback.requestFocus(i19 % 2 == 0 ? 98 : 33);
                return Unit.INSTANCE;
            case 4:
                return asInterface(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                Pair pair = (Pair) objArr[0];
                int i20 = 2 % 2;
                Intrinsics.checkNotNullParameter(pair, "");
                if (!(!((Boolean) pair.getFirst()).booleanValue())) {
                    int i21 = IAuthTabCallbackStubProxy + 11;
                    access100 = i21 % 128;
                    int i22 = i21 % 2;
                    if (!((Boolean) pair.getSecond()).booleanValue()) {
                        int i23 = access100 + 111;
                        int i24 = i23 % 128;
                        IAuthTabCallbackStubProxy = i24;
                        int i25 = i23 % 2;
                        int i26 = i24 + 59;
                        access100 = i26 % 128;
                        int i27 = i26 % 2;
                        return true;
                    }
                }
                return false;
            case 9:
                return onTransact(objArr);
            case 10:
                LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i28 = 2 % 2;
                int i29 = IAuthTabCallbackStubProxy + 5;
                access100 = i29 % 128;
                if (i29 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    Object[] objArr2 = new Object[1];
                    a(new int[]{0, 8, 0, 6}, true, new byte[]{0, 1, 1, 0, 1, 1, 0, 1}, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment.access100()});
                } else {
                    Intrinsics.checkNotNullParameter(setDetectableSize, "");
                    Object[] objArr3 = new Object[1];
                    a(new int[]{0, 8, 0, 6}, false, new byte[]{0, 1, 1, 0, 1, 1, 0, 1}, objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment.access100()});
                }
                setDetectableSize.onExtraCallback(strIntern, (String) objOnExtraCallback);
                setDetectableSize.onExtraCallback("business_yn", loanRefinancingJobDetailFragment.writeTypedObject());
                Unit unit = Unit.INSTANCE;
                int i30 = access100 + 65;
                IAuthTabCallbackStubProxy = i30 % 128;
                int i31 = i30 % 2;
                return unit;
            case 11:
                CharSequence charSequence = (CharSequence) objArr[0];
                int i32 = 2 % 2;
                int i33 = IAuthTabCallbackStubProxy + 95;
                access100 = i33 % 128;
                int i34 = i33 % 2;
                String strOnExtraCallback = onExtraCallback(charSequence);
                int i35 = access100 + 37;
                IAuthTabCallbackStubProxy = i35 % 128;
                int i36 = i35 % 2;
                return strOnExtraCallback;
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return access000(objArr);
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                return readTypedObject(objArr);
            case 18:
                return writeTypedObject(objArr);
            case 19:
                LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment2 = (LoanRefinancingJobDetailFragment) objArr[0];
                TextFieldLineCalendarView textFieldLineCalendarView = (TextFieldLineCalendarView) objArr[1];
                access27100 access27100Var = (access27100) objArr[2];
                Triple triple = (Triple) objArr[3];
                int i37 = 2 % 2;
                int i38 = access100 + 3;
                IAuthTabCallbackStubProxy = i38 % 128;
                int i39 = i38 % 2;
                Intrinsics.checkNotNullParameter(triple, "");
                SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(345925429, -345925428, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{loanRefinancingJobDetailFragment2.extraCallback(), triple});
                EditText editText = textFieldLineCalendarView.getEditText();
                if (editText != null) {
                    Object first = triple.getFirst();
                    String str = String.format("%02d", Arrays.copyOf(new Object[]{triple.getSecond()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    String str2 = String.format("%02d", Arrays.copyOf(new Object[]{triple.getThird()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    editText.setText(first + "년 " + str + "월 " + str2 + "일");
                }
                access27100Var.onWarmupCompleted(Boolean.TRUE);
                Unit unit2 = Unit.INSTANCE;
                int i40 = access100 + 123;
                IAuthTabCallbackStubProxy = i40 % 128;
                int i41 = i40 % 2;
                return unit2;
            case 20:
                return ICustomTabsCallback(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        TextFieldLineCalendarView textFieldLineCalendarView = (TextFieldLineCalendarView) objArr[1];
        access27100 access27100Var = (access27100) objArr[2];
        Triple triple = (Triple) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingJobDetailFragment, textFieldLineCalendarView, access27100Var, triple);
        int i4 = IAuthTabCallbackStubProxy + 53;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ String onNavigationEvent(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(charSequence);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return strIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(loanRefinancingJobDetailFragment, toggletracedebugpanelstatus);
        int i4 = access100 + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(loanRefinancingJobDetailFragment, textFieldLineCalendarView, access27100Var, triple);
        int i4 = IAuthTabCallbackStubProxy + 39;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineDropDownView textFieldLineDropDownView, access27100 access27100Var, String str) {
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingJobDetailFragment, textFieldLineDropDownView, access27100Var, str);
        int i4 = IAuthTabCallbackStubProxy + 3;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(toggletracedebugpanelstatus);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(toggletracedebugpanelstatus);
        int i3 = access100 + 55;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(loanRefinancingJobDetailFragment, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TextFieldLine textFieldLine = (TextFieldLine) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(textFieldLine, str);
        int i4 = access100 + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ String onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onActivityLayout(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        String strOnActivityLayout = onActivityLayout(function1, obj);
        int i3 = access100 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return strOnActivityLayout;
    }

    public static /* synthetic */ Unit onWarmupCompleted(access27100 access27100Var, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineCompanyView textFieldLineCompanyView, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(access27100Var, loanRefinancingJobDetailFragment, textFieldLineCompanyView, charSequence);
        }
        onNavigationEvent(access27100Var, loanRefinancingJobDetailFragment, textFieldLineCompanyView, charSequence);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(loanRefinancingJobDetailFragment, view);
        int i4 = access100 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(TextFieldLineCalendarView textFieldLineCalendarView, Calendar calendar, Calendar calendar2, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, onPreviewReleased onpreviewreleased, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(textFieldLineCalendarView, calendar, calendar2, loanRefinancingJobDetailFragment, onpreviewreleased, view, motionEvent);
        int i4 = IAuthTabCallbackStubProxy + 93;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Pair pair = (Pair) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return Boolean.valueOf(((Boolean) onNavigationEvent(-740218766, iOnNavigationEvent, 740218774, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{pair}, iOnNavigationEvent2, iOnNavigationEvent3)).booleanValue());
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((Boolean) onNavigationEvent(-740218766, iOnNavigationEvent4, 740218774, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{pair}, iOnNavigationEvent5, iOnNavigationEvent6)).booleanValue();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return 1251723L;
        }
        int i3 = 63 / 0;
        return 1251723L;
    }

    public LoanRefinancingJobDetailFragment() {
        access27200<Boolean> typedObject = access27200.readTypedObject();
        Intrinsics.checkNotNullExpressionValue(typedObject, "");
        this.onTransact = typedObject;
        this.getInterfaceDescriptor = CollectionsKt.listOf(new TarConstants[]{getLastErrorCode.Companion.onWarmupCompleted(), resetErrorCode.Companion.onWarmupCompleted()});
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda44(this));
        this.onNavigationEvent = onPageExit.onNavigationEvent(this, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda45(this));
    }

    public int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 31;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.IAuthTabCallbackDefault;
            int i5 = 77 / 0;
        } else {
            i = this.IAuthTabCallbackDefault;
        }
        int i6 = i3 + 107;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, toggleTraceDebugPanelStatus> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        onExtraCallbackWithResult() {
            super(1, toggleTraceDebugPanelStatus.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelJobDetailBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            toggleTraceDebugPanelStatus toggletracedebugpanelstatusOnNavigationEvent = onNavigationEvent((View) obj);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            int i5 = onExtraCallback + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return toggletracedebugpanelstatusOnNavigationEvent;
        }

        public final toggleTraceDebugPanelStatus onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            toggleTraceDebugPanelStatus toggletracedebugpanelstatusIAuthTabCallback = toggleTraceDebugPanelStatus.IAuthTabCallback(view);
            int i4 = IAuthTabCallback + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return toggletracedebugpanelstatusIAuthTabCallback;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            pageContext = loanRefinancingJobDetailFragment.IAuthTabCallback;
            addallcommandline = onExtraCallback[1];
        } else {
            pageContext = loanRefinancingJobDetailFragment.IAuthTabCallback;
            addallcommandline = onExtraCallback[0];
        }
        toggleTraceDebugPanelStatus toggletracedebugpanelstatusOnExtraCallbackWithResult = pageContext.onExtraCallbackWithResult(loanRefinancingJobDetailFragment, addallcommandline);
        int i3 = access100 + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
        return toggletracedebugpanelstatusOnExtraCallbackWithResult;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = IAuthTabCallback + 105;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                int i6 = 57 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final GriverLoadingDialog onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 17;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        GriverLoadingDialog griverLoadingDialog = this.companySearchIntentProvider;
        Object obj = null;
        if (griverLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 41;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return griverLoadingDialog;
        }
        obj.hashCode();
        throw null;
    }

    private final Intent IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = (Intent) this.onExtraCallbackWithResult.getValue();
        if (i3 != 0) {
            return intent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Intent onNavigationEvent(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        GriverLoadingDialog griverLoadingDialogOnExtraCallback = loanRefinancingJobDetailFragment.onExtraCallback();
        Context contextRequireContext = loanRefinancingJobDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intent intentOnExtraCallbackWithResult = getResourceFromGlobalPackagePool.onExtraCallbackWithResult(griverLoadingDialogOnExtraCallback, contextRequireContext, "refinancing_loan_comparison");
        int i4 = IAuthTabCallbackStubProxy + 25;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return intentOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[PHI: r11
      0x002c: PHI (r11v2 android.content.Intent) = (r11v1 android.content.Intent), (r11v12 android.content.Intent) binds: [B:10:0x002a, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        Intent intentOnExtraCallbackWithResult;
        CompanyInfo companyInfo;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = IAuthTabCallbackStubProxy + 75;
            access100 = i2 % 128;
            CompanyInfo companyInfo2 = null;
            if (i2 % 2 == 0) {
                intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                int i3 = 80 / 0;
                if (intentOnExtraCallbackWithResult != null) {
                    int i4 = IAuthTabCallbackStubProxy + 99;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    if (Build.VERSION.SDK_INT >= 33) {
                        int i6 = access100 + 11;
                        IAuthTabCallbackStubProxy = i6 % 128;
                        int i7 = i6 % 2;
                        companyInfo = (Parcelable) intentOnExtraCallbackWithResult.getParcelableExtra("EXTRA_COMPANY_INFO_RESULT", CompanyInfo.class);
                    } else {
                        CompanyInfo parcelableExtra = intentOnExtraCallbackWithResult.getParcelableExtra("EXTRA_COMPANY_INFO_RESULT");
                        if (parcelableExtra instanceof CompanyInfo) {
                            companyInfo2 = parcelableExtra;
                        } else {
                            int i8 = IAuthTabCallbackStubProxy + 75;
                            access100 = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        companyInfo = companyInfo2;
                        int i10 = access100 + 45;
                        IAuthTabCallbackStubProxy = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    companyInfo2 = companyInfo;
                }
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                ((toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment}, iOnNavigationEvent2, iOnNavigationEvent3)).onWarmupCompleted.IAuthTabCallback(companyInfo2);
            } else {
                intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                if (intentOnExtraCallbackWithResult != null) {
                }
                int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent22 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent32 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                ((toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent4, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment}, iOnNavigationEvent22, iOnNavigationEvent32)).onWarmupCompleted.IAuthTabCallback(companyInfo2);
            }
        }
        return Unit.INSTANCE;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.asBinder = new deserializeUriCollection();
        extraCallback().IAuthTabCallback(LoanFunnelType.MANUAL);
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(-1583052678, iOnNavigationEvent, 1583052680, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
        int i2 = access100 + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onExtraCallbackWithResult(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ConstraintLayout constraintLayoutIAuthTabCallback = ((toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment}, iOnNavigationEvent2, iOnNavigationEvent3)).IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutIAuthTabCallback, "");
        getLongOctalBytes.onWarmupCompleted(constraintLayoutIAuthTabCallback);
        int i4 = IAuthTabCallbackStubProxy + 65;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    private static final void onExtraCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, View view) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251725L, false, (String) null, (Map) null, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda0(loanRefinancingJobDetailFragment), 14, (Object) null);
        loanRefinancingJobDetailFragment.onTransact.onWarmupCompleted(Boolean.TRUE);
        int i2 = IAuthTabCallbackStubProxy + 37;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
    }

    private static final Unit onExtraCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            KeyboardBottomCta keyboardBottomCta = toggletracedebugpanelstatus.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            KeyboardBottomCta.setCta$default(keyboardBottomCta, im.toss.uikit.R.string.uikit_confirm, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda16(loanRefinancingJobDetailFragment), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        } else {
            KeyboardBottomCta keyboardBottomCta2 = toggletracedebugpanelstatus.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta2, "");
            KeyboardBottomCta.setCta$default(keyboardBottomCta2, viva.republica.toss.R.string.next, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda17(loanRefinancingJobDetailFragment), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 27;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallbackStub(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingJobDetailFragment.onTransact.onWarmupCompleted(Boolean.TRUE);
        int i4 = IAuthTabCallbackStubProxy + 87;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 21;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0075 A[PHI: r3
      0x0075: PHI (r3v9 int) = (r3v8 int), (r3v19 int) binds: [B:8:0x0073, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = access100 + 13;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr2 = {loanRefinancingJobDetailFragment.access100()};
            i = onNavigationEvent.onNavigationEvent[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2)).ordinal()];
            if (i == 0) {
                loanRefinancingJobDetailFragment.prefetch();
                int i4 = access100 + 75;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = access100 + 113;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                RsaUtil rsaUtil = RsaUtil.onNavigationEvent;
                Context contextRequireContext = loanRefinancingJobDetailFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                RippleNode.onNavigationEvent(loanRefinancingJobDetailFragment).onWarmupCompleted(R.id.loanRefinancingAdditionalInputFragment, RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("additionalInfo", RsaUtil.onWarmupCompleted(rsaUtil, contextRequireContext, false, 2, (Object) null))}));
            }
        } else {
            Object[] objArr3 = {loanRefinancingJobDetailFragment.access100()};
            i = onNavigationEvent.onNavigationEvent[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr3)).ordinal()];
            if (i != 1) {
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        int i = 2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment}, iOnNavigationEvent2, iOnNavigationEvent3);
        toggletracedebugpanelstatus.IAuthTabCallbackDefault.setOnKeyboardVisibilityListener(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda40(toggletracedebugpanelstatus, loanRefinancingJobDetailFragment));
        KeyboardBottomCta keyboardBottomCta = toggletracedebugpanelstatus.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        KeyboardBottomCta.setCta$default(keyboardBottomCta, viva.republica.toss.R.string.next, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda41(loanRefinancingJobDetailFragment), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        KeyboardBottomCta keyboardBottomCta2 = toggletracedebugpanelstatus.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta2, "");
        getLongOctalBytes.onWarmupCompleted(keyboardBottomCta2, false);
        loanRefinancingJobDetailFragment.asBinder();
        loanRefinancingJobDetailFragment.newSessionWithExtras();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = loanRefinancingJobDetailFragment.onTransact.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(3000L, TimeUnit.MILLISECONDS).IAuthTabCallback(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda43(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda42(loanRefinancingJobDetailFragment)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        loanRefinancingJobDetailFragment.autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        int i2 = IAuthTabCallbackStubProxy + 39;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
        return null;
    }

    private final void prefetch() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (extraCallback().onMessageChannelReady()) {
                int i3 = access100 + 113;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 == 0) {
                    RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingRrnFragment);
                    return;
                } else {
                    RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingRrnFragment);
                    obj.hashCode();
                    throw null;
                }
            }
            IAuthTabCallbackDefault();
            return;
        }
        extraCallback().onMessageChannelReady();
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access100 = i2 % 128;
        toggletracedebugpanelstatus.onTransact.requestFocus(i2 % 2 == 0 ? 118 : 33);
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatus.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView, "");
        if (i3 != 0) {
            loanRefinancingJobDetailFragment.onExtraCallbackWithResult(textFieldLineTextOverlayView);
            return Unit.INSTANCE;
        }
        loanRefinancingJobDetailFragment.onExtraCallbackWithResult(textFieldLineTextOverlayView);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void newSessionWithExtras() throws Throwable {
        String string;
        int i = 2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
        onPreviewReleased.onWarmupCompleted onwarmupcompleted = onPreviewReleased.Companion;
        Object[] objArr = {extraCallback()};
        onPreviewReleased onpreviewreleasedOnExtraCallback = onwarmupcompleted.onExtraCallback((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr));
        Boolean bool = Boolean.FALSE;
        access27100<Boolean> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(bool);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        access27100<Boolean> access27100VarIAuthTabCallback2 = access27100.IAuthTabCallback(bool);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback2, "");
        access27100<Boolean> access27100VarIAuthTabCallback3 = access27100.IAuthTabCallback(bool);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback3, "");
        access27100<Boolean> access27100VarIAuthTabCallback4 = access27100.IAuthTabCallback(bool);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback4, "");
        TdsTopV1View tdsTopV1View = toggletracedebugpanelstatus.IAuthTabCallback_Parcel;
        int[] iArr = onNavigationEvent.onExtraCallback;
        int i2 = iArr[onpreviewreleasedOnExtraCallback.ordinal()];
        if (i2 == 1) {
            string = getString(R.string.loan_refinancing_funnel_input___8639440814);
        } else if (i2 == 2) {
            string = getString(R.string.loan_refinancing_funnel_input___f9b6531856);
        } else if (i2 == 3) {
            string = getString(R.string.loan_refinancing_funnel_input___01078de973);
        } else {
            string = getString(R.string.loan_refinancing_funnel_input___5d4c0e02a6);
        }
        tdsTopV1View.setUpperText(string);
        ArrayList arrayList = new ArrayList();
        int i3 = iArr[onpreviewreleasedOnExtraCallback.ordinal()];
        if (i3 != 1) {
            int i4 = access100;
            int i5 = i4 + 45;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            if (i3 != 2) {
                int i7 = i4 + 57;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 == 0 ? i3 == 3 : i3 == 5) {
                    TextFieldLineCompanyView textFieldLineCompanyView = toggletracedebugpanelstatus.onWarmupCompleted;
                    Intrinsics.checkNotNullExpressionValue(textFieldLineCompanyView, "");
                    textFieldLineCompanyView.setVisibility(0);
                    TextFieldLineCalendarView textFieldLineCalendarView = toggletracedebugpanelstatus.IAuthTabCallback;
                    Intrinsics.checkNotNullExpressionValue(textFieldLineCalendarView, "");
                    textFieldLineCalendarView.setVisibility(0);
                    TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatus.IAuthTabCallbackStub;
                    Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView, "");
                    textFieldLineTextOverlayView.setVisibility(0);
                    TextFieldLineDropDownView textFieldLineDropDownView = toggletracedebugpanelstatus.onTransact;
                    Intrinsics.checkNotNullExpressionValue(textFieldLineDropDownView, "");
                    textFieldLineDropDownView.setVisibility(8);
                    IAuthTabCallback(onpreviewreleasedOnExtraCallback, access27100VarIAuthTabCallback, access27100VarIAuthTabCallback2, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4);
                    arrayList.add(access27100VarIAuthTabCallback);
                    arrayList.add(access27100VarIAuthTabCallback3);
                    arrayList.add(access27100VarIAuthTabCallback4);
                    Object[] objArr2 = {this, access27100VarIAuthTabCallback, access27100VarIAuthTabCallback3, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda7(toggletracedebugpanelstatus)};
                    onNavigationEvent(-615291330, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 615291344, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
                    Object[] objArr3 = {this, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda8(this, toggletracedebugpanelstatus)};
                    onNavigationEvent(-615291330, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 615291344, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr3, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
                    onNavigationEvent(arrayList);
                    return;
                }
                if (i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                TextFieldLineCalendarView textFieldLineCalendarView2 = toggletracedebugpanelstatus.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(textFieldLineCalendarView2, "");
                textFieldLineCalendarView2.setVisibility(0);
                TextFieldLineTextOverlayView textFieldLineTextOverlayView2 = toggletracedebugpanelstatus.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView2, "");
                textFieldLineTextOverlayView2.setVisibility(0);
                TextFieldLineCompanyView textFieldLineCompanyView2 = toggletracedebugpanelstatus.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(textFieldLineCompanyView2, "");
                textFieldLineCompanyView2.setVisibility(8);
                TextFieldLineDropDownView textFieldLineDropDownView2 = toggletracedebugpanelstatus.onTransact;
                Intrinsics.checkNotNullExpressionValue(textFieldLineDropDownView2, "");
                textFieldLineDropDownView2.setVisibility(8);
                TextFieldLineCalendarView textFieldLineCalendarView3 = toggletracedebugpanelstatus.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(textFieldLineCalendarView3, "");
                TextFieldLineTextOverlayView textFieldLineTextOverlayView3 = toggletracedebugpanelstatus.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView3, "");
                IAuthTabCallback(textFieldLineCalendarView3, textFieldLineTextOverlayView3, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4);
                IAuthTabCallback(onpreviewreleasedOnExtraCallback, access27100VarIAuthTabCallback, access27100VarIAuthTabCallback2, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4);
                arrayList.add(access27100VarIAuthTabCallback3);
                arrayList.add(access27100VarIAuthTabCallback4);
                Object[] objArr4 = {this, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda9(this, toggletracedebugpanelstatus)};
                onNavigationEvent(-615291330, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 615291344, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr4, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
                onNavigationEvent(arrayList);
                return;
            }
        }
        TextFieldLineCompanyView textFieldLineCompanyView3 = toggletracedebugpanelstatus.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(textFieldLineCompanyView3, "");
        textFieldLineCompanyView3.setVisibility(0);
        TextFieldLineDropDownView textFieldLineDropDownView3 = toggletracedebugpanelstatus.onTransact;
        Intrinsics.checkNotNullExpressionValue(textFieldLineDropDownView3, "");
        textFieldLineDropDownView3.setVisibility(0);
        TextFieldLineCalendarView textFieldLineCalendarView4 = toggletracedebugpanelstatus.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(textFieldLineCalendarView4, "");
        textFieldLineCalendarView4.setVisibility(0);
        TextFieldLineTextOverlayView textFieldLineTextOverlayView4 = toggletracedebugpanelstatus.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView4, "");
        textFieldLineTextOverlayView4.setVisibility(0);
        IAuthTabCallback(onpreviewreleasedOnExtraCallback, access27100VarIAuthTabCallback, access27100VarIAuthTabCallback2, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4);
        arrayList.add(access27100VarIAuthTabCallback);
        arrayList.add(access27100VarIAuthTabCallback2);
        arrayList.add(access27100VarIAuthTabCallback3);
        arrayList.add(access27100VarIAuthTabCallback4);
        Object[] objArr5 = {this, access27100VarIAuthTabCallback, access27100VarIAuthTabCallback2, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda4(toggletracedebugpanelstatus)};
        onNavigationEvent(-615291330, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 615291344, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr5, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        Object[] objArr6 = {this, access27100VarIAuthTabCallback2, access27100VarIAuthTabCallback3, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda5(toggletracedebugpanelstatus)};
        onNavigationEvent(-615291330, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 615291344, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr6, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        Object[] objArr7 = {this, access27100VarIAuthTabCallback3, access27100VarIAuthTabCallback4, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda6(this, toggletracedebugpanelstatus)};
        onNavigationEvent(-615291330, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 615291344, setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr7, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        onNavigationEvent(arrayList);
    }

    private static final Unit IAuthTabCallbackDefault(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        toggletracedebugpanelstatus.IAuthTabCallback.requestFocus(i2 % 2 == 0 ? 56 : 33);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatus.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView, "");
        if (i3 != 0) {
            loanRefinancingJobDetailFragment.onExtraCallbackWithResult(textFieldLineTextOverlayView);
            return Unit.INSTANCE;
        }
        loanRefinancingJobDetailFragment.onExtraCallbackWithResult(textFieldLineTextOverlayView);
        int i4 = 53 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int i = 2 % 2;
        int i2 = access100 + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatus.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textFieldLineTextOverlayView, "");
        loanRefinancingJobDetailFragment.onExtraCallbackWithResult(textFieldLineTextOverlayView);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 111;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
        EditText editText = toggletracedebugpanelstatus.onWarmupCompleted.getEditText();
        if (editText != null) {
            editText.setSaveEnabled(false);
        }
        EditText editText2 = toggletracedebugpanelstatus.onTransact.getEditText();
        if (editText2 != null) {
            editText2.setSaveEnabled(false);
        }
        EditText editText3 = toggletracedebugpanelstatus.IAuthTabCallback.getEditText();
        if (editText3 != null) {
            int i2 = access100 + 27;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                editText3.setSaveEnabled(true);
            } else {
                editText3.setSaveEnabled(false);
            }
        }
        EditText editText4 = toggletracedebugpanelstatus.IAuthTabCallbackStub.IAuthTabCallback().getEditText();
        if (editText4 != null) {
            int i3 = IAuthTabCallbackStubProxy + 53;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            editText4.setSaveEnabled(false);
        }
        int i5 = IAuthTabCallbackStubProxy + 7;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback_Parcel;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 5;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - KeyEvent.normalizeMetaState(0)), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 34, Color.red(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = $10 + 55;
                $11 = i9 % 128;
                if (i9 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = $10 + 45;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 10935), 65 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10934), 64 - ExpandableListView.getPackedPositionChild(0L), 16718 - TextUtils.getOffsetBefore("", 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 71, 12485 - ExpandableListView.getPackedPositionChild(0L), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i14 = $11 + 57;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 1, i3);
                System.arraycopy(cArr5, 1, cArr3, i3 << i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i3 + i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i15 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i15, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i15);
            }
        }
        if (z) {
            int i16 = $10 + 107;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = access100 + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(access27100 access27100Var, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineCompanyView textFieldLineCompanyView, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        boolean z = false;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(charSequence);
            int i3 = 56 / 0;
            if (charSequence.length() <= 0) {
                int i4 = access100 + 67;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = IAuthTabCallbackStubProxy + 21;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            }
        } else {
            Intrinsics.checkNotNull(charSequence);
            if (charSequence.length() > 0) {
            }
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        loanRefinancingJobDetailFragment.extraCallback().IAuthTabCallback(textFieldLineCompanyView.writeTypedObject(), textFieldLineCompanyView.readTypedObject());
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingJobDetailFragment.onNavigationEvent.onNavigationEvent(loanRefinancingJobDetailFragment.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final String IAuthTabCallback(CharSequence charSequence) {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            string = charSequence.toString();
            int i3 = 6 / 0;
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
            string = charSequence.toString();
        }
        int i4 = access100 + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private static final String onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 37;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final void onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 13;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r3
      0x0030: PHI (r3v10 o.SubsamplingScaleImageViewDefaultOnStateChangedListener) = 
      (r3v1 o.SubsamplingScaleImageViewDefaultOnStateChangedListener)
      (r3v11 o.SubsamplingScaleImageViewDefaultOnStateChangedListener)
     binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r3 r4
      0x002b: PHI (r3v2 o.SubsamplingScaleImageViewDefaultOnStateChangedListener) = 
      (r3v1 o.SubsamplingScaleImageViewDefaultOnStateChangedListener)
      (r3v11 o.SubsamplingScaleImageViewDefaultOnStateChangedListener)
     binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v3 o.verifyWithStream) = (r4v2 o.verifyWithStream), (r4v12 o.verifyWithStream) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineDropDownView textFieldLineDropDownView, access27100 access27100Var, String str) {
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback;
        verifyWithStream verifywithstream;
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        boolean z = false;
        if (i2 % 2 != 0) {
            subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback = loanRefinancingJobDetailFragment.extraCallback();
            verifywithstream = (verifyWithStream) textFieldLineDropDownView.writeTypedObject();
            int i3 = 53 / 0;
            if (verifywithstream != null) {
                strOnWarmupCompleted = verifywithstream.onWarmupCompleted();
            } else {
                int i4 = IAuthTabCallbackStubProxy + 117;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                strOnWarmupCompleted = null;
            }
        } else {
            subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback = loanRefinancingJobDetailFragment.extraCallback();
            verifywithstream = (verifyWithStream) textFieldLineDropDownView.writeTypedObject();
            if (verifywithstream != null) {
            }
        }
        subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback.asInterface(strOnWarmupCompleted);
        Intrinsics.checkNotNull(str);
        if (str.length() > 0) {
            int i6 = access100 + 65;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private static final String onActivityResized(Function1 function1, Object obj) {
        String str;
        int i = 2 % 2;
        int i2 = access100 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            str = (String) function1.invoke(obj);
            int i3 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            str = (String) function1.invoke(obj);
        }
        int i4 = IAuthTabCallbackStubProxy + 115;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onExtraCallback(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            charSequence.toString();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        String string = charSequence.toString();
        int i3 = IAuthTabCallbackStubProxy + 53;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineDropDownView textFieldLineDropDownView, access27100 access27100Var, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        access100 = i2 % 128;
        String strOnWarmupCompleted = null;
        if (i2 % 2 != 0) {
            SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback = loanRefinancingJobDetailFragment.extraCallback();
            verifyWithStream verifywithstream = (verifyWithStream) textFieldLineDropDownView.writeTypedObject();
            if (verifywithstream != null) {
                int i3 = IAuthTabCallbackStubProxy + 55;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                strOnWarmupCompleted = verifywithstream.onWarmupCompleted();
            }
            SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(1439812487, -1439812479, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback, strOnWarmupCompleted});
            Intrinsics.checkNotNull(str);
            access27100Var.onWarmupCompleted(Boolean.valueOf(str.length() > 0));
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallbackStubProxy + 45;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
        loanRefinancingJobDetailFragment.extraCallback();
        throw null;
    }

    private static final String onExtraCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, verifyWithStream verifywithstream) {
        String string;
        int i = 2 % 2;
        if (verifywithstream != null) {
            string = loanRefinancingJobDetailFragment.getString(verifywithstream.onNavigationEvent());
        } else {
            int i2 = IAuthTabCallbackStubProxy + 125;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            string = null;
        }
        if (string != null) {
            return string;
        }
        int i4 = IAuthTabCallbackStubProxy + 7;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        throw null;
    }

    public static final class onExtraCallback extends AccessibilityDelegateCompat {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ LoanRefinancingJobDetailFragment IAuthTabCallback;
        final /* synthetic */ TextFieldLineDropDownView onExtraCallback;
        final /* synthetic */ String onWarmupCompleted;

        onExtraCallback(String str, TextFieldLineDropDownView textFieldLineDropDownView, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment) {
            this.onWarmupCompleted = str;
            this.onExtraCallback = textFieldLineDropDownView;
            this.IAuthTabCallback = loanRefinancingJobDetailFragment;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            String str = this.onWarmupCompleted;
            EditText editText = this.onExtraCallback.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(str + ", " + ((Object) text) + ", " + this.IAuthTabCallback.getString(R.string.loan_talkback_dropdown_guide));
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(triple, "");
        loanRefinancingJobDetailFragment.extraCallback().onExtraCallback(triple);
        EditText editText = textFieldLineCalendarView.getEditText();
        if (editText != null) {
            Object first = triple.getFirst();
            String str = String.format("%02d", Arrays.copyOf(new Object[]{triple.getSecond()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = String.format("%02d", Arrays.copyOf(new Object[]{triple.getThird()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            editText.setText(first + "년 " + str + "월 " + str2 + "일");
            int i2 = IAuthTabCallbackStubProxy + 45;
            access100 = i2 % 128;
            int i3 = i2 % 2;
        }
        access27100Var.onWarmupCompleted(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 9;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(triple, "");
            loanRefinancingJobDetailFragment.extraCallback().onExtraCallback(triple);
            textFieldLineCalendarView.getEditText();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(triple, "");
        loanRefinancingJobDetailFragment.extraCallback().onExtraCallback(triple);
        EditText editText = textFieldLineCalendarView.getEditText();
        if (editText != null) {
            Object first = triple.getFirst();
            String str = String.format("%02d", Arrays.copyOf(new Object[]{triple.getSecond()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = String.format("%02d", Arrays.copyOf(new Object[]{triple.getThird()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            editText.setText(first + "년 " + str + "월 " + str2 + "일");
        }
        access27100Var.onWarmupCompleted(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 37;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final boolean onNavigationEvent(TextFieldLineCalendarView textFieldLineCalendarView, Calendar calendar, Calendar calendar2, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, onPreviewReleased onpreviewreleased, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0 ? motionEvent.getAction() != 1 : motionEvent.getAction() != 0) {
            int i3 = IAuthTabCallbackStubProxy + 93;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        Intrinsics.checkNotNull(calendar);
        Intrinsics.checkNotNull(calendar2);
        textFieldLineCalendarView.onNavigationEvent(calendar, calendar2, loanRefinancingJobDetailFragment.IAuthTabCallback(onpreviewreleased), String.valueOf(textFieldLineCalendarView.getHint()));
        return true;
    }

    private static final boolean IAuthTabCallback(TextFieldLineCalendarView textFieldLineCalendarView, Calendar calendar, Calendar calendar2, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, onPreviewReleased onpreviewreleased, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        access100 = i2 % 128;
        if (i2 % 2 != 0 ? motionEvent.getAction() != 1 : motionEvent.getAction() != 1) {
            int i3 = access100 + 19;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        Intrinsics.checkNotNull(calendar);
        Intrinsics.checkNotNull(calendar2);
        textFieldLineCalendarView.onNavigationEvent(calendar, calendar2, loanRefinancingJobDetailFragment.IAuthTabCallback(onpreviewreleased), String.valueOf(textFieldLineCalendarView.getHint()));
        return true;
    }

    public static final class onWarmupCompleted extends AccessibilityDelegateCompat {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String onExtraCallback;
        final /* synthetic */ TextFieldLineCalendarView onExtraCallbackWithResult;
        final /* synthetic */ LoanRefinancingJobDetailFragment onWarmupCompleted;

        onWarmupCompleted(String str, TextFieldLineCalendarView textFieldLineCalendarView, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment) {
            this.onExtraCallback = str;
            this.onExtraCallbackWithResult = textFieldLineCalendarView;
            this.onWarmupCompleted = loanRefinancingJobDetailFragment;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            Editable text;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            String str = this.onExtraCallback;
            EditText editText = this.onExtraCallbackWithResult.getEditText();
            if (editText != null) {
                int i2 = IAuthTabCallback + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                text = editText.getText();
                int i4 = IAuthTabCallback + 61;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                text = null;
            }
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(str + ", " + ((Object) text) + ", " + this.onWarmupCompleted.getString(R.string.loan_talkback_dropdown_guide));
            int i6 = IAuthTabCallback + 81;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 49 / 0;
            }
        }
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access100 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(TextFieldLine textFieldLine, String str) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = textFieldLine.getEditText();
        Intrinsics.checkNotNull(editText);
        editText.setSelection(str.length());
        int i4 = access100 + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(TextFieldLine textFieldLine, access27100 access27100Var, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, CharSequence charSequence) {
        String strValueOf;
        boolean z;
        int i = 2 % 2;
        Long longOrNull = StringsKt.toLongOrNull(charSequence.toString());
        if (longOrNull == null || (strValueOf = String.valueOf(longOrNull.longValue())) == null) {
            strValueOf = "";
        }
        if (strValueOf.length() != charSequence.length()) {
            EditText editText = textFieldLine.getEditText();
            Intrinsics.checkNotNull(editText);
            editText.setText(strValueOf);
            EditText editText2 = textFieldLine.getEditText();
            Intrinsics.checkNotNull(editText2);
            editText2.post(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda3(textFieldLine, strValueOf));
        }
        if (strValueOf.length() < 2 || !TextUtils.isDigitsOnly(strValueOf)) {
            z = false;
        } else {
            int i2 = access100 + 45;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        if (z) {
            loanRefinancingJobDetailFragment.extraCallback().onTransact(strValueOf);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback extends AccessibilityDelegateCompat {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ TextFieldLine IAuthTabCallback;

        IAuthTabCallback(TextFieldLine textFieldLine) {
            this.IAuthTabCallback = textFieldLine;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            String string = LoanRefinancingJobDetailFragment.this.getString(R.string.loan_ui_income);
            EditText editText = this.IAuthTabCallback.getEditText();
            Editable text = null;
            if (editText != null) {
                int i2 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    editText.getText();
                    throw null;
                }
                text = editText.getText();
            } else {
                int i3 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 / 2;
                }
            }
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(string + ", " + ((Object) text) + LoanRefinancingJobDetailFragment.this.getString(R.string.loan_string_money_unit_10000) + ", " + LoanRefinancingJobDetailFragment.this.getString(R.string.loan_talkback_dropdown_guide));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(onPreviewReleased onpreviewreleased, access27100<Boolean> access27100Var, access27100<Boolean> access27100Var2, access27100<Boolean> access27100Var3, access27100<Boolean> access27100Var4) {
        String string;
        String strOnExtraCallbackWithResult;
        String string2;
        String string3;
        TarConstants tarConstantsPrevious;
        TarConstants tarConstants;
        String str;
        List listEmptyList;
        ListIterator listIterator;
        Object objPrevious;
        EditText editTextExtraCallbackWithResult;
        int i;
        String string4;
        Triple<Integer, Integer, Integer> tripleWriteTypedObject;
        EditText editText;
        EditText editTextExtraCallbackWithResult2;
        EditText editText2;
        EditText editText3;
        int i2;
        TarConstants tarConstantsPrevious2;
        String strIAuthTabCallbackDefault;
        int i3 = 2 % 2;
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        TextFieldLineCompanyView textFieldLineCompanyView = toggletracedebugpanelstatus.onWarmupCompleted;
        EditText editText4 = textFieldLineCompanyView.getEditText();
        if (editText4 != null) {
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(editText4).onExtraCallbackWithResult().IAuthTabCallback(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda28(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda18(access27100Var, this, textFieldLineCompanyView)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
            autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
            if (onpreviewreleased != onPreviewReleased.ETC) {
                String strOnNavigationEvent = extraCallback().onNavigationEvent();
                String strIAuthTabCallbackDefault2 = extraCallback().IAuthTabCallbackDefault();
                if (strOnNavigationEvent != null && strOnNavigationEvent.length() > 0 && strIAuthTabCallbackDefault2 != null) {
                    int i4 = access100 + 11;
                    IAuthTabCallbackStubProxy = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 68 / 0;
                        if (strIAuthTabCallbackDefault2.length() > 0) {
                            textFieldLineCompanyView.setCompanyName(strOnNavigationEvent);
                            textFieldLineCompanyView.setCorporateNumber(strIAuthTabCallbackDefault2);
                            editText4.setText(textFieldLineCompanyView.writeTypedObject());
                        }
                    } else if (strIAuthTabCallbackDefault2.length() > 0) {
                    }
                }
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i6 = access100 + 41;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            string = arguments.getString(TsmResponse.errorCode);
            if (string == null) {
                string = "";
            }
        }
        autoDisposable((deserializeUriNullableCollection) TextFieldLineCompanyView.onExtraCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -162976212, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{textFieldLineCompanyView, Boolean.valueOf(StringsKt.isBlank(string) && (!(onpreviewreleased.isNeedJobInfo() ^ true) && ((strIAuthTabCallbackDefault = extraCallback().IAuthTabCallbackDefault()) == null || strIAuthTabCallbackDefault.length() <= 0))), new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda29(this)}, 162976213));
        int[] iArr = onNavigationEvent.onExtraCallback;
        int i8 = iArr[onpreviewreleased.ordinal()];
        textFieldLineCompanyView.setHint(i8 != 2 ? i8 != 3 ? getString(R.string.loan_comparison_funnel___67ce82466b) : getString(R.string.loan_comparison_funnel_job_detail_civil_company_hint) : getString(R.string.loan_comparison_funnel___8b32d7f5e0));
        TextFieldLineDropDownView textFieldLineDropDownView = toggletracedebugpanelstatus.onTransact;
        int i9 = iArr[onpreviewreleased.ordinal()];
        if (i9 == 1) {
            strOnExtraCallbackWithResult = (String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(364069555, -364069548, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{extraCallback()});
            EditText editText5 = textFieldLineDropDownView.getEditText();
            Intrinsics.checkNotNull(editText5);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = RxTextView.IAuthTabCallback(editText5).onExtraCallbackWithResult().asInterface(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda31(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda30())).IAuthTabCallback(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda33(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda32(this, textFieldLineDropDownView, access27100Var2)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
            autoDisposable(deserializeurinullablecollectionIAuthTabCallback2);
            string2 = getString(R.string.loan_refinancing_funnel_input___537c9e9899);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            string3 = getString(R.string.loan_refinancing_funnel_input___2db5dd25be);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            List<TarConstants> list = this.getInterfaceDescriptor;
            ListIterator<TarConstants> listIterator2 = list.listIterator(list.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    tarConstantsPrevious = null;
                    break;
                }
                int i10 = IAuthTabCallbackStubProxy + 75;
                access100 = i10 % 128;
                int i11 = i10 % 2;
                tarConstantsPrevious = listIterator2.previous();
                if (Intrinsics.areEqual(tarConstantsPrevious.onNavigationEvent(), "employeeType")) {
                    break;
                }
            }
            tarConstants = tarConstantsPrevious;
        } else {
            if (i9 != 2) {
                int i12 = IAuthTabCallbackStubProxy + 115;
                access100 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                string2 = "";
                str = string2;
                strOnExtraCallbackWithResult = null;
                tarConstants = null;
                if (tarConstants == null) {
                    int i13 = IAuthTabCallbackStubProxy + 59;
                    access100 = i13 % 128;
                    int i14 = i13 % 2;
                    listEmptyList = tarConstants.IAuthTabCallback();
                } else {
                    listEmptyList = null;
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                listIterator = listEmptyList.listIterator(listEmptyList.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (Intrinsics.areEqual(((verifyWithStream) objPrevious).onWarmupCompleted(), strOnExtraCallbackWithResult)) {
                            break;
                        }
                    }
                }
                verifyWithStream verifywithstream = (verifyWithStream) objPrevious;
                List listIAuthTabCallback = tarConstants == null ? tarConstants.IAuthTabCallback() : null;
                autoDisposable(textFieldLineDropDownView.onNavigationEvent(str, "", listIAuthTabCallback != null ? CollectionsKt.emptyList() : listIAuthTabCallback, verifywithstream, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda20(this)));
                textFieldLineDropDownView.setHint(string2);
                editTextExtraCallbackWithResult = textFieldLineDropDownView.extraCallbackWithResult();
                if (editTextExtraCallbackWithResult != null) {
                    setProtocolsokhttp.onExtraCallbackWithResult(editTextExtraCallbackWithResult, new onExtraCallback(string2, textFieldLineDropDownView, this));
                }
                TextFieldLineCalendarView textFieldLineCalendarView = toggletracedebugpanelstatus.IAuthTabCallback;
                i = onNavigationEvent.onExtraCallback[onpreviewreleased.ordinal()];
                if (i == 2) {
                    int i15 = IAuthTabCallbackStubProxy + 9;
                    access100 = i15 % 128;
                    if (i15 % 2 != 0 ? i == 4 : i == 5) {
                        string4 = getString(R.string.loan_refinancing_funnel_input___23d793890a);
                        Intrinsics.checkNotNullExpressionValue(string4, "");
                        tripleWriteTypedObject = extraCallback().access000();
                        textFieldLineCalendarView.setOnValueChanged(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda22(this, textFieldLineCalendarView, access27100Var3));
                    } else if (i != 5) {
                        string4 = getString(R.string.loan_refinancing_funnel_input___238d95198f);
                        Intrinsics.checkNotNullExpressionValue(string4, "");
                        tripleWriteTypedObject = extraCallback().access000();
                        textFieldLineCalendarView.setOnValueChanged(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda23(this, textFieldLineCalendarView, access27100Var3));
                    }
                } else {
                    string4 = getString(R.string.loan_refinancing_funnel_input___f432d8024a);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    tripleWriteTypedObject = extraCallback().writeTypedObject();
                    textFieldLineCalendarView.setOnValueChanged(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda21(this, textFieldLineCalendarView, access27100Var3));
                }
                String str2 = string4;
                textFieldLineCalendarView.setHint(str2);
                if (tripleWriteTypedObject != null && ((Number) tripleWriteTypedObject.getFirst()).intValue() != 0) {
                    i2 = IAuthTabCallbackStubProxy + 3;
                    access100 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i16 = 59 / 0;
                        if (((Number) tripleWriteTypedObject.getSecond()).intValue() != 0) {
                            if (((Number) tripleWriteTypedObject.getThird()).intValue() != 0) {
                                EditText editText6 = textFieldLineCalendarView.getEditText();
                                if (editText6 != null) {
                                    Object first = tripleWriteTypedObject.getFirst();
                                    String str3 = String.format("%02d", Arrays.copyOf(new Object[]{tripleWriteTypedObject.getSecond()}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str3, "");
                                    String str4 = String.format("%02d", Arrays.copyOf(new Object[]{tripleWriteTypedObject.getThird()}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str4, "");
                                    editText6.setText(first + "년 " + str3 + "월 " + str4 + "일");
                                }
                                IAuthTabCallback(onpreviewreleased, tripleWriteTypedObject);
                                access27100Var3.onWarmupCompleted(Boolean.TRUE);
                            }
                        }
                    } else if (((Number) tripleWriteTypedObject.getSecond()).intValue() != 0) {
                    }
                }
                textFieldLineCalendarView.setType(UST_CRYPT_VerifySignatureValue.YEAR_MONTH_DAY);
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(1, 1920);
                calendar2.set(2, 0);
                calendar2.set(5, 0);
                editText = textFieldLineCalendarView.getEditText();
                if (editText != null) {
                    editText.setOnTouchListener(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda24(textFieldLineCalendarView, calendar2, calendar, this, onpreviewreleased));
                }
                textFieldLineCalendarView.setOnTouchListener(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda25(textFieldLineCalendarView, calendar2, calendar, this, onpreviewreleased));
                editTextExtraCallbackWithResult2 = textFieldLineCalendarView.extraCallbackWithResult();
                if (editTextExtraCallbackWithResult2 != null) {
                    setProtocolsokhttp.onExtraCallbackWithResult(editTextExtraCallbackWithResult2, new onWarmupCompleted(str2, textFieldLineCalendarView, this));
                }
                TextFieldLineTextOverlayView textFieldLineTextOverlayView = toggletracedebugpanelstatus.IAuthTabCallbackStub;
                TextFieldLine textFieldLineIAuthTabCallback = textFieldLineTextOverlayView.IAuthTabCallback();
                textFieldLineIAuthTabCallback.setHint(getString(R.string.loan_ui_income));
                EditText editText7 = textFieldLineIAuthTabCallback.getEditText();
                Intrinsics.checkNotNull(editText7);
                deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback3 = RxTextView.IAuthTabCallback(editText7).IAuthTabCallback(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda27(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda26(textFieldLineIAuthTabCallback, access27100Var4, this)));
                Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback3, "");
                autoDisposable(deserializeurinullablecollectionIAuthTabCallback3);
                editText2 = textFieldLineIAuthTabCallback.getEditText();
                if (editText2 != null) {
                    editText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(6)});
                    if (onpreviewreleased != onPreviewReleased.ETC || !extraCallback().getInterfaceDescriptor()) {
                        editText2.setText(extraCallback().ICustomTabsCallback());
                    }
                    editText2.setImeOptions(6);
                }
                editText3 = textFieldLineIAuthTabCallback.getEditText();
                if (editText3 != null) {
                    setProtocolsokhttp.onExtraCallbackWithResult(editText3, new IAuthTabCallback(textFieldLineIAuthTabCallback));
                }
                String string5 = getString(R.string.loan_string_money_unit_10000);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                textFieldLineTextOverlayView.setLabel(string5);
            }
            strOnExtraCallbackWithResult = extraCallback().onExtraCallbackWithResult();
            EditText editText8 = textFieldLineDropDownView.getEditText();
            Intrinsics.checkNotNull(editText8);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback4 = RxTextView.IAuthTabCallback(editText8).onExtraCallbackWithResult().asInterface(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda35(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda34())).IAuthTabCallback(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda19(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda36(this, textFieldLineDropDownView, access27100Var2)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback4, "");
            autoDisposable(deserializeurinullablecollectionIAuthTabCallback4);
            string2 = getString(R.string.loan_refinancing_funnel_input___0fb1a92d85);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            string3 = getString(R.string.loan_refinancing_funnel_input___9f7eafb4c6);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            List<TarConstants> list2 = this.getInterfaceDescriptor;
            ListIterator<TarConstants> listIterator3 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    tarConstantsPrevious2 = null;
                    break;
                } else {
                    tarConstantsPrevious2 = listIterator3.previous();
                    if (Intrinsics.areEqual(tarConstantsPrevious2.onNavigationEvent(), "businessType")) {
                        break;
                    }
                }
            }
            tarConstants = tarConstantsPrevious2;
        }
        str = string3;
        if (tarConstants == null) {
        }
        if (listEmptyList == null) {
        }
        listIterator = listEmptyList.listIterator(listEmptyList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
            }
        }
        verifyWithStream verifywithstream2 = (verifyWithStream) objPrevious;
        if (tarConstants == null) {
        }
        autoDisposable(textFieldLineDropDownView.onNavigationEvent(str, "", listIAuthTabCallback != null ? CollectionsKt.emptyList() : listIAuthTabCallback, verifywithstream2, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda20(this)));
        textFieldLineDropDownView.setHint(string2);
        editTextExtraCallbackWithResult = textFieldLineDropDownView.extraCallbackWithResult();
        if (editTextExtraCallbackWithResult != null) {
        }
        TextFieldLineCalendarView textFieldLineCalendarView2 = toggletracedebugpanelstatus.IAuthTabCallback;
        i = onNavigationEvent.onExtraCallback[onpreviewreleased.ordinal()];
        if (i == 2) {
        }
        String str22 = string4;
        textFieldLineCalendarView2.setHint(str22);
        if (tripleWriteTypedObject != null) {
            i2 = IAuthTabCallbackStubProxy + 3;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
            }
        }
        textFieldLineCalendarView2.setType(UST_CRYPT_VerifySignatureValue.YEAR_MONTH_DAY);
        Calendar calendar3 = Calendar.getInstance();
        Calendar calendar22 = Calendar.getInstance();
        calendar22.set(1, 1920);
        calendar22.set(2, 0);
        calendar22.set(5, 0);
        editText = textFieldLineCalendarView2.getEditText();
        if (editText != null) {
        }
        textFieldLineCalendarView2.setOnTouchListener(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda25(textFieldLineCalendarView2, calendar22, calendar3, this, onpreviewreleased));
        editTextExtraCallbackWithResult2 = textFieldLineCalendarView2.extraCallbackWithResult();
        if (editTextExtraCallbackWithResult2 != null) {
        }
        TextFieldLineTextOverlayView textFieldLineTextOverlayView2 = toggletracedebugpanelstatus.IAuthTabCallbackStub;
        TextFieldLine textFieldLineIAuthTabCallback2 = textFieldLineTextOverlayView2.IAuthTabCallback();
        textFieldLineIAuthTabCallback2.setHint(getString(R.string.loan_ui_income));
        EditText editText72 = textFieldLineIAuthTabCallback2.getEditText();
        Intrinsics.checkNotNull(editText72);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback32 = RxTextView.IAuthTabCallback(editText72).IAuthTabCallback(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda27(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda26(textFieldLineIAuthTabCallback2, access27100Var4, this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback32, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback32);
        editText2 = textFieldLineIAuthTabCallback2.getEditText();
        if (editText2 != null) {
        }
        editText3 = textFieldLineIAuthTabCallback2.getEditText();
        if (editText3 != null) {
        }
        String string52 = getString(R.string.loan_string_money_unit_10000);
        Intrinsics.checkNotNullExpressionValue(string52, "");
        textFieldLineTextOverlayView2.setLabel(string52);
    }

    private final void onNavigationEvent(List<access27100<Boolean>> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        deserializeUriCollection deserializeuricollection = this.asBinder;
        if (deserializeuricollection != null) {
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onWarmupCompleted(list, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda38(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda37()));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            deserializeuricollection.onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, (Function1) null, (Function0) null, new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda39(this), 3, (Object) null));
        }
        int i3 = access100 + 107;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
    }

    private static final Boolean writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = access100 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = {loanRefinancingJobDetailFragment.extraCallback()};
            if (!Intrinsics.areEqual((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr2), onPreviewReleased.ETC.getCode()) || !loanRefinancingJobDetailFragment.extraCallback().getInterfaceDescriptor()) {
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                KeyboardBottomCta keyboardBottomCta = ((toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment}, iOnNavigationEvent2, iOnNavigationEvent3)).IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
                Intrinsics.checkNotNull(bool);
                getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, bool.booleanValue());
            } else {
                int i3 = access100 + 117;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                KeyboardBottomCta keyboardBottomCta2 = ((toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent4, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment}, iOnNavigationEvent5, iOnNavigationEvent6)).IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(keyboardBottomCta2, "");
                getLongOctalBytes.onWarmupCompleted(keyboardBottomCta2, true);
            }
            return Unit.INSTANCE;
        }
        Object[] objArr3 = {loanRefinancingJobDetailFragment.extraCallback()};
        Intrinsics.areEqual((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr3), onPreviewReleased.ETC.getCode());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(onPreviewReleased onpreviewreleased, Triple<Integer, Integer, Integer> triple) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (onpreviewreleased == onPreviewReleased.SELF_BUSINESS) {
            int i4 = access100 + 13;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {extraCallback(), triple};
            SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(345925429, -345925428, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr);
            return;
        }
        extraCallback().onExtraCallback(triple);
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment = (LoanRefinancingJobDetailFragment) objArr[0];
        access27100 access27100Var = (access27100) objArr[1];
        access27100 access27100Var2 = (access27100) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            deserializeUriCollection deserializeuricollection = loanRefinancingJobDetailFragment.asBinder;
            throw null;
        }
        deserializeUriCollection deserializeuricollection2 = loanRefinancingJobDetailFragment.asBinder;
        if (deserializeuricollection2 != null) {
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = clearMessage.onWarmupCompleted.IAuthTabCallback(access27100Var, access27100Var2).onWarmupCompleted(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda11(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda10())).onExtraCallbackWithResult(1L);
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallbackWithResult, "");
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            deserializeuricollection2.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda13(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda12(function0)), new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda15(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda14())));
        }
        int i3 = IAuthTabCallbackStubProxy + 71;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return null;
    }

    private static final boolean IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = 66 / 0;
        return zBooleanValue;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = access100 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 93;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TdsCheckBoxV1View tdsCheckBoxV1View, TextFieldLineCalendarView textFieldLineCalendarView, TextFieldLineTextOverlayView textFieldLineTextOverlayView, access27100 access27100Var, access27100 access27100Var2, TdsCheckBoxV1View tdsCheckBoxV1View2, boolean z) {
        String string;
        String string2;
        int iOnPostMessage;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsCheckBoxV1View2, "");
        boolean z2 = !z;
        Object obj = null;
        if (z) {
            string = loanRefinancingJobDetailFragment.getString(R.string.loan_refinancing_funnel_input___d58fa73adc);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else {
            int i2 = access100 + 15;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            string = "";
        }
        if (z) {
            string2 = "";
        } else {
            int i3 = IAuthTabCallbackStubProxy + 3;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            string2 = loanRefinancingJobDetailFragment.getString(R.string.loan_refinancing_funnel_input___39029d6abb);
        }
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNull(tdsCheckBoxV1View);
        if (z) {
            Context context = tdsCheckBoxV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iOnPostMessage = new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onPostMessage();
            int i5 = access100 + 5;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        } else {
            Context context2 = tdsCheckBoxV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnPostMessage = new getUrlokhttp(new IAuthTabCallbackStub(configuration2)).onRelationshipValidationResult();
        }
        textFieldLineCalendarView.setArrow(z2);
        EditText editText = textFieldLineCalendarView.getEditText();
        if (editText != null) {
            int i7 = access100 + 45;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            editText.setEnabled(z2);
            editText.setText(string);
            editText.setTextColor(iOnPostMessage);
        }
        textFieldLineTextOverlayView.setLabel(string2);
        EditText editTextOnWarmupCompleted = textFieldLineTextOverlayView.onWarmupCompleted();
        if (editTextOnWarmupCompleted != null) {
            int i9 = access100 + 67;
            IAuthTabCallbackStubProxy = i9 % 128;
            if (i9 % 2 != 0) {
                editTextOnWarmupCompleted.setEnabled(z2);
                editTextOnWarmupCompleted.setText(string);
                editTextOnWarmupCompleted.setTextColor(iOnPostMessage);
                obj.hashCode();
                throw null;
            }
            editTextOnWarmupCompleted.setEnabled(z2);
            editTextOnWarmupCompleted.setText(string);
            editTextOnWarmupCompleted.setTextColor(iOnPostMessage);
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        access27100Var2.onWarmupCompleted(Boolean.valueOf(z));
        SubsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallbackWithResult(loanRefinancingJobDetailFragment.extraCallback(), z, false, 2, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        toggletracedebugpanelstatus.onExtraCallbackWithResult.toggle();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onTransact extends AccessibilityDelegateCompat {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ LoanRefinancingJobDetailFragment onExtraCallbackWithResult;
        final /* synthetic */ toggleTraceDebugPanelStatus onNavigationEvent;

        onTransact(toggleTraceDebugPanelStatus toggletracedebugpanelstatus, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment) {
            this.onNavigationEvent = toggletracedebugpanelstatus;
            this.onExtraCallbackWithResult = loanRefinancingJobDetailFragment;
        }

        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 89;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
                this.onNavigationEvent.onExtraCallbackWithResult.isChecked();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            if (!(!this.onNavigationEvent.onExtraCallbackWithResult.isChecked())) {
                loanRefinancingJobDetailFragment = this.onExtraCallbackWithResult;
                i = R.string.loan_talkback_checkbox_checked;
            } else {
                loanRefinancingJobDetailFragment = this.onExtraCallbackWithResult;
                i = R.string.loan_talkback_checkbox_unchecked;
            }
            String string = loanRefinancingJobDetailFragment.getString(i);
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNull(string);
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(this.onExtraCallbackWithResult.getString(R.string.loan_talkback_checkbox) + ", " + string);
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
        }
    }

    private final void IAuthTabCallback(TextFieldLineCalendarView textFieldLineCalendarView, TextFieldLineTextOverlayView textFieldLineTextOverlayView, access27100<Boolean> access27100Var, access27100<Boolean> access27100Var2) {
        int i = 2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        toggleTraceDebugPanelStatus toggletracedebugpanelstatus = (toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
        LinearLayout linearLayout = toggletracedebugpanelstatus.asBinder;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        TdsCheckBoxV1View tdsCheckBoxV1View = toggletracedebugpanelstatus.onExtraCallbackWithResult;
        tdsCheckBoxV1View.setOnCheckedChangeListener(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda1(this, tdsCheckBoxV1View, textFieldLineCalendarView, textFieldLineTextOverlayView, access27100Var, access27100Var2));
        tdsCheckBoxV1View.setChecked(extraCallback().getInterfaceDescriptor());
        toggletracedebugpanelstatus.asBinder.setOnClickListener(new LoanRefinancingJobDetailFragment$.ExternalSyntheticLambda2(toggletracedebugpanelstatus));
        LinearLayout linearLayout2 = toggletracedebugpanelstatus.asBinder;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        setProtocolsokhttp.onExtraCallbackWithResult(linearLayout2, new onTransact(toggletracedebugpanelstatus, this));
        int i2 = access100 + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
    }

    private final Triple<Integer, Integer, Integer> IAuthTabCallback(onPreviewReleased onpreviewreleased) {
        Triple tripleWriteTypedObject;
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent.onExtraCallback[onpreviewreleased.ordinal()];
        Object obj = null;
        if (i4 == 2) {
            tripleWriteTypedObject = extraCallback().writeTypedObject();
        } else {
            int i5 = access100 + 53;
            int i6 = i5 % 128;
            IAuthTabCallbackStubProxy = i6;
            int i7 = i5 % 2;
            if (i4 != 4) {
                int i8 = i6 + 117;
                access100 = i8 % 128;
                if (i8 % 2 == 0) {
                    extraCallback().access000();
                    throw null;
                }
                tripleWriteTypedObject = extraCallback().access000();
            } else {
                tripleWriteTypedObject = extraCallback().access000();
            }
        }
        if (tripleWriteTypedObject != null) {
            int i9 = IAuthTabCallbackStubProxy + 107;
            access100 = i9 % 128;
            if (i9 % 2 != 0) {
                if (((Number) tripleWriteTypedObject.getFirst()).intValue() >= 0 && ((Number) tripleWriteTypedObject.getSecond()).intValue() >= 0 && ((Number) tripleWriteTypedObject.getThird()).intValue() >= 0) {
                    return new Triple<>(tripleWriteTypedObject.getFirst(), Integer.valueOf(Math.max(((Number) tripleWriteTypedObject.getSecond()).intValue() - 1, 0)), Integer.valueOf(Math.max(((Number) tripleWriteTypedObject.getThird()).intValue() - 1, 0)));
                }
            } else {
                ((Number) tripleWriteTypedObject.getFirst()).intValue();
                obj.hashCode();
                throw null;
            }
        }
        Calendar calendar = Calendar.getInstance();
        return new Triple<>(Integer.valueOf(calendar.get(1)), Integer.valueOf(Math.max(calendar.get(2), 0)), Integer.valueOf(Math.max(calendar.get(5) - 1, 0)));
    }

    private final void onExtraCallbackWithResult(TextFieldLineTextOverlayView textFieldLineTextOverlayView) {
        int i = 2 % 2;
        int i2 = access100 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            M_.onWarmupCompleted(M_.onExtraCallback, textFieldLineTextOverlayView.onWarmupCompleted(), 0L, 3, (Object) null);
        } else {
            M_.onWarmupCompleted(M_.onExtraCallback, textFieldLineTextOverlayView.onWarmupCompleted(), 0L, 2, (Object) null);
        }
        int i3 = access100 + 29;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onDestroyView();
        deserializeUriCollection deserializeuricollection = this.asBinder;
        if (deserializeuricollection != null) {
            int i4 = access100 + 3;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                deserializeuricollection.dispose();
                int i5 = 24 / 0;
            } else {
                deserializeuricollection.dispose();
            }
        }
        this.asBinder = null;
        int i6 = IAuthTabCallbackStubProxy + 99;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onRenderReady.onNavigationEvent(this, "KEY_FUNNEL_BACK", Boolean.TRUE, false, 4, (Object) null);
        int i4 = access100 + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Boolean onExtraCallback(Object[] objArr) {
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
                i2 += 110;
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
        Object next = it.next();
        while (it.hasNext()) {
            boolean zBooleanValue = ((Boolean) it.next()).booleanValue();
            boolean z = true;
            if (!((Boolean) next).booleanValue() || !zBooleanValue) {
                z = false;
            }
            next = Boolean.valueOf(z);
            int i4 = access100 + 57;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        return (Boolean) next;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, Boolean bool) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(1766919079, iOnNavigationEvent, -1766919072, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, bool}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ void IAuthTabCallback(TextFieldLine textFieldLine, String str) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(-1894484118, iOnNavigationEvent, 1894484127, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{textFieldLine, str}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TextFieldLine textFieldLine, access27100 access27100Var, LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, CharSequence charSequence) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(841634492, iOnNavigationEvent, -841634476, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{textFieldLine, access27100Var, loanRefinancingJobDetailFragment, charSequence}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Intent IAuthTabCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Intent) onNavigationEvent(-1540762416, iOnNavigationEvent, 1540762421, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Boolean onWarmupCompleted(Object[] objArr) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Boolean) onNavigationEvent(-1468854178, iOnNavigationEvent, 1468854191, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{objArr}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ void IAuthTabCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, View view) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(-1327825061, iOnNavigationEvent, 1327825076, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, view}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ String onWarmupCompleted(CharSequence charSequence) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (String) onNavigationEvent(-1942197156, iOnNavigationEvent, 1942197167, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{charSequence}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(1727742482, iOnNavigationEvent, -1727742481, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, textFieldLineCalendarView, access27100Var, triple}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ boolean onWarmupCompleted(Pair pair) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((Boolean) onNavigationEvent(658907595, iOnNavigationEvent, -658907578, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{pair}, iOnNavigationEvent2, iOnNavigationEvent3)).booleanValue();
    }

    private final void onExtraCallbackWithResult(access27100<Boolean> access27100Var, access27100<Boolean> access27100Var2, Function0<Unit> function0) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(-615291330, iOnNavigationEvent, 615291344, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this, access27100Var, access27100Var2, function0}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final boolean onNavigationEvent(Pair pair) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((Boolean) onNavigationEvent(-740218766, iOnNavigationEvent, 740218774, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{pair}, iOnNavigationEvent2, iOnNavigationEvent3)).booleanValue();
    }

    private static final Unit IAuthTabCallback(Function0 function0, Pair pair) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(1312579992, iOnNavigationEvent, -1312579974, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function0, pair}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final toggleTraceDebugPanelStatus asInterface() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (toggleTraceDebugPanelStatus) onNavigationEvent(-582194170, iOnNavigationEvent, 582194182, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final void isEngagementSignalsApiAvailable() throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(-1583052678, iOnNavigationEvent, 1583052680, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit onExtraCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(37280790, iOnNavigationEvent, -37280780, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, setDetectableSize}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, Boolean bool) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(-242230723, iOnNavigationEvent, 242230723, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, bool}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final void readTypedObject(Function1 function1, Object obj) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(994941577, iOnNavigationEvent, -994941571, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit onWarmupCompleted(toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(854837464, iOnNavigationEvent, -854837461, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{toggletracedebugpanelstatus}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, toggleTraceDebugPanelStatus toggletracedebugpanelstatus) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(-1699780038, iOnNavigationEvent, 1699780042, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, toggletracedebugpanelstatus}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit onExtraCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, Boolean bool) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(1262221831, iOnNavigationEvent, -1262221811, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, bool}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit IAuthTabCallback(LoanRefinancingJobDetailFragment loanRefinancingJobDetailFragment, TextFieldLineCalendarView textFieldLineCalendarView, access27100 access27100Var, Triple triple) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onNavigationEvent(-1726951063, iOnNavigationEvent, 1726951082, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{loanRefinancingJobDetailFragment, textFieldLineCalendarView, access27100Var, triple}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    static void onTransact() {
        IAuthTabCallback_Parcel = new char[]{27261, 27179, 27173, 27196, 27173, 27173, 27196, 27173};
    }
}
