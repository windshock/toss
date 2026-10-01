package im.toss.features.loan.refinancing.funnel.input;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.features.loan.refinancing.funnel.input.LoanRefinancingAdditionalInputFragment$;
import im.toss.features.loan.ui.R;
import im.toss.featurescommon.companysearch.model.CompanyInfo;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.TdsSegmentedControlV1View;
import im.toss.uikit.widget.textField.TextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.FpsCollector1;
import o.GriverLoadingDialog;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.ImagePipelineExternalSyntheticLambda2;
import o.JsErrorExtension;
import o.JsonReaderUnknownNumberParsing;
import o.PageContext;
import o.RsaUtil;
import o.SetDetectableSize;
import o.SubsamplingScaleImageViewDefaultOnStateChangedListener;
import o.TextKtExternalSyntheticLambda7;
import o.access27100;
import o.addAllCommandLine;
import o.deserializeUriNullableCollection;
import o.getLongOctalBytes;
import o.getResourceFromGlobalPackagePool;
import o.onCenterChanged;
import o.onPageExit;
import o.onRenderReady;
import o.preFillDefault;
import o.setMessageBytes;
import o.then;
import o.zzbr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption;
import viva.republica.toss.widget.LoanTextFieldLineDropDownView;
import viva.republica.toss.widget.TextFieldLineCompanyView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingAdditionalInputFragment extends Hilt_LoanRefinancingAdditionalInputFragment {
    private static int ICustomTabsCallback = 1;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new PropertyReference1Impl<>(LoanRefinancingAdditionalInputFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingFunnelAdditionalInfoBinding;", 0)};
    public static final int onExtraCallbackWithResult = 8;
    private static int readTypedObject;
    private deserializeUriNullableCollection IAuthTabCallback_Parcel;
    private TextFieldLineCompanyView access000;

    @Inject
    public GriverLoadingDialog companySearchIntentProvider;
    private boolean getInterfaceDescriptor;
    private final TextKtExternalSyntheticLambda7 onWarmupCompleted = new TextKtExternalSyntheticLambda7(Reflection.getOrCreateKotlinClass(FpsCollector1.class), new IAuthTabCallback(this));
    private int IAuthTabCallbackStubProxy = R.layout.fragment_loan_refinancing_funnel_additional_info;
    private final PageContext onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.onExtraCallbackWithResult);
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda18(this));
    private final IEngagementSignalsCallback_Parcel<Intent> access100 = onPageExit.onNavigationEvent(this, new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda19(this));
    private String IAuthTabCallbackDefault = "";
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda20(this));
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda21(this));

    static {
        int i = ICustomTabsCallback + 1;
        readTypedObject = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(loanRefinancingAdditionalInputFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(loanRefinancingAdditionalInputFragment);
        int i3 = extraCallback + 107;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(access27100 access27100Var, LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, TextFieldLineCompanyView textFieldLineCompanyView, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(access27100Var, loanRefinancingAdditionalInputFragment, textFieldLineCompanyView, charSequence);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(access27100Var, loanRefinancingAdditionalInputFragment, textFieldLineCompanyView, charSequence);
        int i3 = extraCallbackWithResult + 37;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy(function1, obj);
            throw null;
        }
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i3 = extraCallbackWithResult + 37;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return strIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        LoanTextFieldLineDropDownView loanTextFieldLineDropDownView = (LoanTextFieldLineDropDownView) objArr[0];
        access27100 access27100Var = (access27100) objArr[1];
        LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment = (LoanRefinancingAdditionalInputFragment) objArr[2];
        then thenVar = (then) objArr[3];
        String str = (String) objArr[4];
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(loanTextFieldLineDropDownView, access27100Var, loanRefinancingAdditionalInputFragment, thenVar, str);
        }
        onNavigationEvent(loanTextFieldLineDropDownView, access27100Var, loanRefinancingAdditionalInputFragment, thenVar, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        LoanComparisonAdditionalFieldOption loanComparisonAdditionalFieldOption = (LoanComparisonAdditionalFieldOption) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(loanComparisonAdditionalFieldOption);
        int i4 = extraCallbackWithResult + 77;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment = (LoanRefinancingAdditionalInputFragment) objArr[0];
        TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) objArr[1];
        View view = (View) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = extraCallback + 47;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(loanRefinancingAdditionalInputFragment, tdsSegmentedControlV1View, view, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingAdditionalInputFragment, tdsSegmentedControlV1View, view, iIntValue);
        int i3 = extraCallback + 29;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TdsSegmentedControlV1View onExtraCallback(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(loanRefinancingAdditionalInputFragment);
            throw null;
        }
        TdsSegmentedControlV1View tdsSegmentedControlV1ViewAsInterface = asInterface(loanRefinancingAdditionalInputFragment);
        int i3 = extraCallbackWithResult + 97;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return tdsSegmentedControlV1ViewAsInterface;
    }

    public static /* synthetic */ Boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean interfaceDescriptor = getInterfaceDescriptor(function1, obj);
        int i4 = extraCallback + 59;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingAdditionalInputFragment, setDetectableSize);
        int i4 = extraCallbackWithResult + 89;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextField onExtraCallbackWithResult(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextField textFieldOnTransact = onTransact(loanRefinancingAdditionalInputFragment);
        int i4 = extraCallback + 51;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return textFieldOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment, charSequence}, 1129906498, -1129906492, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
        int i4 = extraCallback + 95;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{function1, obj}, -293338512, 293338519, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
        int i4 = extraCallback + 5;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Intent onNavigationEvent(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {loanRefinancingAdditionalInputFragment};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intent intent = (Intent) onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, -1314046848, 1314046857, C40Encoder.onExtraCallback(), iOnExtraCallback, C40Encoder.onExtraCallback());
        int i4 = extraCallbackWithResult + 71;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    public static /* synthetic */ String onNavigationEvent(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(charSequence);
        }
        onWarmupCompleted(charSequence);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(JsErrorExtension jsErrorExtension, LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(jsErrorExtension, loanRefinancingAdditionalInputFragment, z);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, JsErrorExtension jsErrorExtension, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(loanRefinancingAdditionalInputFragment, jsErrorExtension, view);
        int i4 = extraCallbackWithResult + 41;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = extraCallbackWithResult + 85;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Object[] objArr2 = (Object[]) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolIAuthTabCallback = IAuthTabCallback(objArr2);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return boolIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i3)) | (~(i8 | i3));
        int i10 = ~(i5 | i7);
        int i11 = i3 | i10 | (~(i8 | i2));
        int i12 = i3 + i2 + i4 + ((-393945980) * i6) + (1728320405 * i);
        int i13 = i12 * i12;
        int i14 = ((-1552544754) * i3) + 1566572544 + ((-1100352524) * i2) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i4) + (2076180480 * i6) + ((-877658112) * i) + (214302720 * i13);
        int i15 = ((i3 * (-252835662)) - 192251156) + (i2 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + (i4 * (-252835169)) + (i6 * 1574575612) + (i * 147979147) + (i13 * (-1426456576));
        switch (i14 + (i15 * i15 * 2075787264)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onTransact(objArr);
            case 4:
                return IAuthTabCallbackStub(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return access100(objArr);
            case 9:
                return IAuthTabCallback_Parcel(objArr);
            case 10:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        JsErrorExtension jsErrorExtension = (JsErrorExtension) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(jsErrorExtension, view);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(loanRefinancingAdditionalInputFragment, iEngagementSignalsCallbackDefault);
        }
        IAuthTabCallback(loanRefinancingAdditionalInputFragment, iEngagementSignalsCallbackDefault);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(JsErrorExtension jsErrorExtension, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(jsErrorExtension, bool);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(LinearLayout linearLayout, LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(linearLayout, loanRefinancingAdditionalInputFragment);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 121;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(loanRefinancingAdditionalInputFragment);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = extraCallback + 23;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 103;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 1251749L;
    }

    public static final class IAuthTabCallback implements Function0<Bundle> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Fragment onExtraCallbackWithResult;

        public IAuthTabCallback(Fragment fragment) {
            this.onExtraCallbackWithResult = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }

        public final Bundle onExtraCallbackWithResult() {
            int i = 2 % 2;
            Bundle arguments = this.onExtraCallbackWithResult.getArguments();
            if (arguments == null) {
                throw new IllegalStateException("Fragment " + this.onExtraCallbackWithResult + " has null arguments");
            }
            int i2 = onExtraCallback;
            int i3 = i2 + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return arguments;
        }
    }

    private final FpsCollector1 onTransact() {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FpsCollector1 fpsCollector1 = (FpsCollector1) this.onWarmupCompleted.getValue();
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return fpsCollector1;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, JsErrorExtension> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 3;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 43 / 0;
            }
        }

        onNavigationEvent() {
            super(1, JsErrorExtension.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingFunnelAdditionalInfoBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            JsErrorExtension jsErrorExtensionOnExtraCallback = onExtraCallback((View) obj);
            int i4 = onExtraCallback + 19;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return jsErrorExtensionOnExtraCallback;
            }
            throw null;
        }

        public final JsErrorExtension onExtraCallback(View view) {
            JsErrorExtension jsErrorExtensionIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                jsErrorExtensionIAuthTabCallback = JsErrorExtension.IAuthTabCallback(view);
                int i3 = 97 / 0;
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                jsErrorExtensionIAuthTabCallback = JsErrorExtension.IAuthTabCallback(view);
            }
            int i4 = IAuthTabCallback + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return jsErrorExtensionIAuthTabCallback;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment = (LoanRefinancingAdditionalInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JsErrorExtension jsErrorExtensionOnExtraCallbackWithResult = loanRefinancingAdditionalInputFragment.onNavigationEvent.onExtraCallbackWithResult(loanRefinancingAdditionalInputFragment, onExtraCallback[0]);
        int i4 = extraCallback + 43;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return jsErrorExtensionOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final GriverLoadingDialog onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        GriverLoadingDialog griverLoadingDialog = this.companySearchIntentProvider;
        if (griverLoadingDialog != null) {
            return griverLoadingDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = extraCallbackWithResult + 13;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final Intent newAuthTabSession() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = (Intent) this.onTransact.getValue();
        if (i3 != 0) {
            return intent;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment = (LoanRefinancingAdditionalInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            GriverLoadingDialog griverLoadingDialogOnExtraCallback = loanRefinancingAdditionalInputFragment.onExtraCallback();
            Context contextRequireContext = loanRefinancingAdditionalInputFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            return getResourceFromGlobalPackagePool.onExtraCallbackWithResult(griverLoadingDialogOnExtraCallback, contextRequireContext, "refinancing_loan_comparison");
        }
        GriverLoadingDialog griverLoadingDialogOnExtraCallback2 = loanRefinancingAdditionalInputFragment.onExtraCallback();
        Context contextRequireContext2 = loanRefinancingAdditionalInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        getResourceFromGlobalPackagePool.onExtraCallbackWithResult(griverLoadingDialogOnExtraCallback2, contextRequireContext2, "refinancing_loan_comparison");
        throw null;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        CompanyInfo companyInfo;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = extraCallback + 19;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            iEngagementSignalsCallbackDefault.onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            if (intentOnExtraCallbackWithResult != null) {
                int i5 = extraCallbackWithResult + 83;
                extraCallback = i5 % 128;
                if (i5 % 2 != 0 ? Build.VERSION.SDK_INT < 33 : Build.VERSION.SDK_INT < 78) {
                    CompanyInfo parcelableExtra = intentOnExtraCallbackWithResult.getParcelableExtra("EXTRA_COMPANY_INFO_RESULT");
                    companyInfo = parcelableExtra instanceof CompanyInfo ? parcelableExtra : null;
                    i = extraCallbackWithResult + 79;
                    i2 = i % 128;
                } else {
                    int i6 = extraCallback + 25;
                    extraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    companyInfo = (Parcelable) intentOnExtraCallbackWithResult.getParcelableExtra("EXTRA_COMPANY_INFO_RESULT", CompanyInfo.class);
                    i = extraCallbackWithResult + 45;
                    i2 = i % 128;
                }
                extraCallback = i2;
                int i8 = i % 2;
                companyInfo = companyInfo;
            }
            TextFieldLineCompanyView textFieldLineCompanyView = loanRefinancingAdditionalInputFragment.access000;
            if (textFieldLineCompanyView != null) {
                textFieldLineCompanyView.IAuthTabCallback(companyInfo);
            }
        }
        return Unit.INSTANCE;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onCenterChanged oncenterchanged = onCenterChanged.IAuthTabCallback;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        this.getInterfaceDescriptor = ((Boolean) onCenterChanged.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -194589186, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 194589194, new Object[]{oncenterchanged})).booleanValue();
        this.IAuthTabCallbackDefault = oncenterchanged.onTransact();
        prefetch();
        int i4 = extraCallbackWithResult + 79;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return "loan_comparison_additional_info";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(JsErrorExtension jsErrorExtension, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutIAuthTabCallback = jsErrorExtension.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutIAuthTabCallback, "");
        getLongOctalBytes.onWarmupCompleted(constraintLayoutIAuthTabCallback);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
    }

    private static final Unit onExtraCallback(JsErrorExtension jsErrorExtension, LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, boolean z) {
        int i = 2 % 2;
        if (z) {
            KeyboardBottomCta keyboardBottomCta = jsErrorExtension.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            KeyboardBottomCta.setCta$default(keyboardBottomCta, im.toss.uikit.R.string.uikit_confirm, new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda2(jsErrorExtension), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        } else {
            loanRefinancingAdditionalInputFragment.newSession();
            int i2 = extraCallback + 87;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 101;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 121;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 99;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }

    private static final Unit onNavigationEvent(access27100 access27100Var, LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, TextFieldLineCompanyView textFieldLineCompanyView, CharSequence charSequence) {
        boolean z;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(charSequence);
        if (charSequence.length() > 0) {
            int i4 = extraCallbackWithResult;
            int i5 = i4 + 83;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 99;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = extraCallbackWithResult + 101;
            extraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 / 5;
            }
            z = false;
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        loanRefinancingAdditionalInputFragment.extraCallback().IAuthTabCallback(textFieldLineCompanyView.writeTypedObject(), textFieldLineCompanyView.readTypedObject());
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 121;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingAdditionalInputFragment.access100.onNavigationEvent(loanRefinancingAdditionalInputFragment.newAuthTabSession());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 31;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final String onWarmupCompleted(LoanComparisonAdditionalFieldOption loanComparisonAdditionalFieldOption) {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = null;
        if (loanComparisonAdditionalFieldOption != null) {
            int i2 = extraCallback + 117;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                loanComparisonAdditionalFieldOption.onExtraCallbackWithResult();
                strOnExtraCallbackWithResult.hashCode();
                throw null;
            }
            strOnExtraCallbackWithResult = loanComparisonAdditionalFieldOption.onExtraCallbackWithResult();
            int i3 = extraCallbackWithResult + 81;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return strOnExtraCallbackWithResult == null ? "" : strOnExtraCallbackWithResult;
    }

    private static final String IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i4 = extraCallbackWithResult + 89;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onWarmupCompleted(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCallback + 9;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            return charSequence.toString();
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        charSequence.toString();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(LoanTextFieldLineDropDownView loanTextFieldLineDropDownView, access27100 access27100Var, LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, then thenVar, String str) {
        boolean z;
        String strIAuthTabCallback;
        int i = 2 % 2;
        LoanComparisonAdditionalFieldOption loanComparisonAdditionalFieldOption = (LoanComparisonAdditionalFieldOption) loanTextFieldLineDropDownView.writeTypedObject();
        if (loanComparisonAdditionalFieldOption != null) {
            int i2 = extraCallback + 95;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        access27100Var.onWarmupCompleted(Boolean.valueOf(z));
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback = loanRefinancingAdditionalInputFragment.extraCallback();
        String strOnWarmupCompleted = thenVar.onWarmupCompleted();
        if (loanComparisonAdditionalFieldOption != null) {
            int i4 = extraCallback + 15;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            strIAuthTabCallback = loanComparisonAdditionalFieldOption.IAuthTabCallback();
        } else {
            strIAuthTabCallback = null;
        }
        if (strIAuthTabCallback == null) {
            int i6 = extraCallback + 3;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            strIAuthTabCallback = "";
        }
        subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback.onExtraCallbackWithResult(strOnWarmupCompleted, strIAuthTabCallback);
        return Unit.INSTANCE;
    }

    private static final Boolean getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i3 = extraCallback + 93;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    private static final Unit onExtraCallback(JsErrorExtension jsErrorExtension, Boolean bool) {
        Unit unit;
        int i = 2 % 2;
        int i2 = extraCallback + 73;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            KeyboardBottomCta keyboardBottomCta = jsErrorExtension.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            Intrinsics.checkNotNull(bool);
            getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, bool.booleanValue());
            unit = Unit.INSTANCE;
            int i3 = 97 / 0;
        } else {
            KeyboardBottomCta keyboardBottomCta2 = jsErrorExtension.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta2, "");
            Intrinsics.checkNotNull(bool);
            getLongOctalBytes.onWarmupCompleted(keyboardBottomCta2, bool.booleanValue());
            unit = Unit.INSTANCE;
        }
        int i4 = extraCallbackWithResult + 57;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void prefetch() {
        int i = 2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        JsErrorExtension jsErrorExtension = (JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{this}, 105910793, -105910793, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
        jsErrorExtension.onExtraCallbackWithResult.setOnKeyboardVisibilityListener(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda3(jsErrorExtension, this));
        KeyboardBottomCta keyboardBottomCta = jsErrorExtension.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, false);
        ImagePipelineExternalSyntheticLambda2 imagePipelineExternalSyntheticLambda2OnWarmupCompleted = onTransact().onWarmupCompleted();
        if (imagePipelineExternalSyntheticLambda2OnWarmupCompleted == null || imagePipelineExternalSyntheticLambda2OnWarmupCompleted.onNavigationEvent().isEmpty()) {
            onExtraCallbackWithResult();
        } else {
            deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallback_Parcel;
            if (deserializeurinullablecollection != null) {
                int i2 = extraCallbackWithResult + 109;
                extraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    zzbr.onWarmupCompleted(deserializeurinullablecollection);
                    throw null;
                }
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
            }
            List<then> listOnNavigationEvent = imagePipelineExternalSyntheticLambda2OnWarmupCompleted.onNavigationEvent();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent, 10));
            for (then thenVar : listOnNavigationEvent) {
                access27100 access27100VarIAuthTabCallback = access27100.IAuthTabCallback(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
                String strOnExtraCallback = thenVar.onExtraCallback();
                int iHashCode = strOnExtraCallback.hashCode();
                if (iHashCode != -1139826490) {
                    if (iHashCode != 77732827) {
                        int i3 = extraCallbackWithResult + 55;
                        extraCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 41 / 0;
                            if (iHashCode == 350565393) {
                                if (strOnExtraCallback.equals("DROPDOWN")) {
                                    Context contextRequireContext = requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                                    View viewOnExtraCallbackWithResult = getLongOctalBytes.onExtraCallbackWithResult(thenVar, contextRequireContext);
                                    autoDisposable(viewOnExtraCallbackWithResult.onNavigationEvent(thenVar.onExtraCallbackWithResult(), "", thenVar.onNavigationEvent(), CollectionsKt.firstOrNull(thenVar.onNavigationEvent()), new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda9()));
                                    EditText editText = viewOnExtraCallbackWithResult.getEditText();
                                    Intrinsics.checkNotNull(editText);
                                    deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(editText).onExtraCallbackWithResult().asInterface(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda11(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda10())).IAuthTabCallback(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda13(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda12(viewOnExtraCallbackWithResult, access27100VarIAuthTabCallback, this, thenVar)));
                                    Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
                                    autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
                                    jsErrorExtension.IAuthTabCallback.addView(viewOnExtraCallbackWithResult);
                                }
                            }
                        } else if (iHashCode == 350565393) {
                        }
                    } else if (strOnExtraCallback.equals("RADIO")) {
                        Context contextRequireContext2 = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        jsErrorExtension.IAuthTabCallback.addView(getLongOctalBytes.onWarmupCompleted(thenVar, contextRequireContext2, access27100VarIAuthTabCallback, extraCallback(), false, 8, (Object) null));
                    }
                } else if (strOnExtraCallback.equals("SEARCH_COMPANY")) {
                    int i5 = extraCallbackWithResult + 79;
                    extraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Context contextRequireContext3 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    View view = (TextFieldLineCompanyView) getLongOctalBytes.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), new Object[]{thenVar, contextRequireContext3}, -75883555, 75883560, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult());
                    EditText editText2 = view.getEditText();
                    if (editText2 != null) {
                        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = RxTextView.IAuthTabCallback(editText2).onExtraCallbackWithResult().IAuthTabCallback(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda7(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda6(access27100VarIAuthTabCallback, this, view)));
                        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
                        autoDisposable(deserializeurinullablecollectionIAuthTabCallback2);
                        editText2.setSaveEnabled(false);
                    }
                    autoDisposable(TextFieldLineCompanyView.onNavigationEvent(view, false, new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda8(this), 1, (Object) null));
                    jsErrorExtension.IAuthTabCallback.addView(view);
                    this.access000 = view;
                    int i7 = extraCallback + 111;
                    extraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                }
                arrayList.add(access27100VarIAuthTabCallback);
            }
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onWarmupCompleted(arrayList, new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda4(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda14()));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, (Function1) null, (Function0) null, new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda5(jsErrorExtension), 3, (Object) null);
            this.IAuthTabCallback_Parcel = deserializeurinullablecollectionOnNavigationEvent;
            if (deserializeurinullablecollectionOnNavigationEvent != null) {
                int i9 = extraCallback + 35;
                extraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
                    throw null;
                }
                autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
            }
        }
        if (DERSet.onExtraCallback.AudioAttributesImplBaseParcelizer() > 0) {
            int i10 = extraCallbackWithResult + 55;
            extraCallback = i10 % 128;
            int i11 = i10 % 2;
            asInterface();
        }
    }

    private final void newSession() {
        int i = 2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        JsErrorExtension jsErrorExtension = (JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{this}, 105910793, -105910793, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
        KeyboardBottomCta keyboardBottomCta = jsErrorExtension.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        KeyboardBottomCta.setCta$default(keyboardBottomCta, viva.republica.toss.R.string.next, new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda1(this, jsErrorExtension), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        int i2 = extraCallbackWithResult + 115;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
    }

    private static final Unit onNavigationEvent(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, SetDetectableSize setDetectableSize) {
        String str;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        RsaUtil rsaUtil = RsaUtil.onNavigationEvent;
        setDetectableSize.onExtraCallback("healthpayer_type", loanRefinancingAdditionalInputFragment.getString(rsaUtil.onWarmupCompleted(loanRefinancingAdditionalInputFragment.extraCallback().IAuthTabCallbackStub())));
        setDetectableSize.onExtraCallback("householder_type", loanRefinancingAdditionalInputFragment.getString(rsaUtil.onExtraCallback(loanRefinancingAdditionalInputFragment.extraCallback().IAuthTabCallback_Parcel())));
        if (loanRefinancingAdditionalInputFragment.getInterfaceDescriptor) {
            int i4 = extraCallbackWithResult + 55;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            str = "Y";
        } else {
            str = "N";
        }
        setDetectableSize.onExtraCallback("automobile_yn", str);
        setDetectableSize.onExtraCallback("save_yn", "Y");
        Unit unit = Unit.INSTANCE;
        int i6 = extraCallbackWithResult + 69;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final void onExtraCallback(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, JsErrorExtension jsErrorExtension, View view) {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 39;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!loanRefinancingAdditionalInputFragment.getInterfaceDescriptor || loanRefinancingAdditionalInputFragment.extraCallback().onExtraCallbackWithResult(loanRefinancingAdditionalInputFragment.IAuthTabCallbackDefault)) {
            loanRefinancingAdditionalInputFragment.extraCallback().IAuthTabCallback(loanRefinancingAdditionalInputFragment.getInterfaceDescriptor);
            SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback = loanRefinancingAdditionalInputFragment.extraCallback();
            String str = loanRefinancingAdditionalInputFragment.getInterfaceDescriptor ? loanRefinancingAdditionalInputFragment.IAuthTabCallbackDefault : "";
            SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(-1924183993, 1924183997, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListenerExtraCallback, str});
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251751L, false, (String) null, (Map) null, new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda15(loanRefinancingAdditionalInputFragment), 14, (Object) null);
            loanRefinancingAdditionalInputFragment.ICustomTabsCallbackDefault();
            return;
        }
        int i5 = extraCallback + 99;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            KeyboardBottomCta keyboardBottomCta = jsErrorExtension.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, true);
            i = R.string.loan_wrong_car_no_message;
        } else {
            KeyboardBottomCta keyboardBottomCta2 = jsErrorExtension.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta2, "");
            getLongOctalBytes.onWarmupCompleted(keyboardBottomCta2, false);
            i = R.string.loan_wrong_car_no_message;
        }
        onRenderReady.onExtraCallbackWithResult(loanRefinancingAdditionalInputFragment, loanRefinancingAdditionalInputFragment.getString(i));
    }

    private final TextField postMessage() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextField textField = (TextField) this.asBinder.getValue();
        int i4 = extraCallback + 35;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return textField;
        }
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        String strReplace$default;
        LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment = (LoanRefinancingAdditionalInputFragment) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            int iOnExtraCallback3 = C40Encoder.onExtraCallback();
            KeyboardBottomCta keyboardBottomCta = ((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, 105910793, -105910793, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, true);
            strReplace$default = StringsKt.replace$default(charSequence.toString(), " ", "", true, 4, (Object) null);
        } else {
            int iOnExtraCallback4 = C40Encoder.onExtraCallback();
            int iOnExtraCallback5 = C40Encoder.onExtraCallback();
            int iOnExtraCallback6 = C40Encoder.onExtraCallback();
            KeyboardBottomCta keyboardBottomCta2 = ((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, 105910793, -105910793, iOnExtraCallback5, iOnExtraCallback4, iOnExtraCallback6)).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta2, "");
            getLongOctalBytes.onWarmupCompleted(keyboardBottomCta2, true);
            strReplace$default = StringsKt.replace$default(charSequence.toString(), " ", "", false, 4, (Object) null);
        }
        loanRefinancingAdditionalInputFragment.IAuthTabCallbackDefault = strReplace$default;
        Unit unit = Unit.INSTANCE;
        int i3 = extraCallback + 103;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final TextField onTransact(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        Context contextRequireContext = loanRefinancingAdditionalInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TextField textField = new TextField(contextRequireContext);
        getLongOctalBytes.onExtraCallbackWithResult(textField);
        textField.setTextFieldType(TextField.onWarmupCompleted.MEDIUM);
        textField.setText(onCenterChanged.IAuthTabCallback.onTransact());
        textField.setHint(loanRefinancingAdditionalInputFragment.getString(R.string.loan_car_no));
        textField.setLabel(" ");
        textField.setUseMessage(true);
        textField.setMessage(loanRefinancingAdditionalInputFragment.getString(R.string.loan_car_no_input_message));
        textField.setClearable(false);
        textField.IAuthTabCallback().setSingleLine();
        textField.setImeOptions(6);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(textField.IAuthTabCallback()).IAuthTabCallback(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda17(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda16(loanRefinancingAdditionalInputFragment)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        loanRefinancingAdditionalInputFragment.autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        textField.IAuthTabCallback().setSaveEnabled(false);
        int i2 = extraCallback + 69;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return textField;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsSegmentedControlV1View isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) this.IAuthTabCallback.getValue();
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return tdsSegmentedControlV1View;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, TdsSegmentedControlV1View tdsSegmentedControlV1View, View view, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        KeyboardBottomCta keyboardBottomCta = ((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, 105910793, -105910793, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        getLongOctalBytes.onWarmupCompleted(keyboardBottomCta, true);
        Object obj = null;
        if (i == 0) {
            int i3 = extraCallback + 97;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (loanRefinancingAdditionalInputFragment.getInterfaceDescriptor) {
                loanRefinancingAdditionalInputFragment.getInterfaceDescriptor = false;
                int iOnExtraCallback4 = C40Encoder.onExtraCallback();
                int iOnExtraCallback5 = C40Encoder.onExtraCallback();
                int iOnExtraCallback6 = C40Encoder.onExtraCallback();
                int childCount = ((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, 105910793, -105910793, iOnExtraCallback5, iOnExtraCallback4, iOnExtraCallback6)).IAuthTabCallback.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    int iOnExtraCallback7 = C40Encoder.onExtraCallback();
                    int iOnExtraCallback8 = C40Encoder.onExtraCallback();
                    int iOnExtraCallback9 = C40Encoder.onExtraCallback();
                    if (((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, 105910793, -105910793, iOnExtraCallback8, iOnExtraCallback7, iOnExtraCallback9)).IAuthTabCallback.getChildAt(i5) instanceof TextField) {
                        int iOnExtraCallback10 = C40Encoder.onExtraCallback();
                        int iOnExtraCallback11 = C40Encoder.onExtraCallback();
                        int iOnExtraCallback12 = C40Encoder.onExtraCallback();
                        ((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, 105910793, -105910793, iOnExtraCallback11, iOnExtraCallback10, iOnExtraCallback12)).IAuthTabCallback.removeViewAt(i5);
                    }
                }
                tdsSegmentedControlV1View.setMessage(loanRefinancingAdditionalInputFragment.getString(R.string.loan_car_mortgage_guide));
                Unit unit = Unit.INSTANCE;
                int i6 = extraCallbackWithResult + 21;
                extraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (i == 1 && !loanRefinancingAdditionalInputFragment.getInterfaceDescriptor) {
            int i7 = extraCallbackWithResult + 31;
            extraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                loanRefinancingAdditionalInputFragment.getInterfaceDescriptor = true;
                tdsSegmentedControlV1View.setMessage((CharSequence) null);
                int iOnExtraCallback13 = C40Encoder.onExtraCallback();
                int iOnExtraCallback14 = C40Encoder.onExtraCallback();
                int iOnExtraCallback15 = C40Encoder.onExtraCallback();
                onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, -592609337, 592609338, iOnExtraCallback14, iOnExtraCallback13, iOnExtraCallback15);
            } else {
                loanRefinancingAdditionalInputFragment.getInterfaceDescriptor = true;
                tdsSegmentedControlV1View.setMessage((CharSequence) null);
                int iOnExtraCallback16 = C40Encoder.onExtraCallback();
                int iOnExtraCallback17 = C40Encoder.onExtraCallback();
                int iOnExtraCallback18 = C40Encoder.onExtraCallback();
                onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, -592609337, 592609338, iOnExtraCallback17, iOnExtraCallback16, iOnExtraCallback18);
            }
        }
        return Unit.INSTANCE;
    }

    private static final TdsSegmentedControlV1View asInterface(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        Context contextRequireContext = loanRefinancingAdditionalInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TdsSegmentedControlV1View tdsSegmentedControlV1View = new TdsSegmentedControlV1View(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsSegmentedControlV1View.setLabel(loanRefinancingAdditionalInputFragment.getString(R.string.loan_car_mortgage_name));
        tdsSegmentedControlV1View.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        String string = loanRefinancingAdditionalInputFragment.getString(R.string.loan_has_it);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsSegmentedControlV1View.onWarmupCompleted(string);
        String string2 = loanRefinancingAdditionalInputFragment.getString(R.string.loan_does_not_have_it);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsSegmentedControlV1View.onWarmupCompleted(string2);
        tdsSegmentedControlV1View.IAuthTabCallback(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda22(loanRefinancingAdditionalInputFragment, tdsSegmentedControlV1View));
        tdsSegmentedControlV1View.setMessage(loanRefinancingAdditionalInputFragment.getString(R.string.loan_car_mortgage_guide));
        int i2 = extraCallback + 13;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return tdsSegmentedControlV1View;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment = (LoanRefinancingAdditionalInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        LinearLayout linearLayout = ((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, 105910793, -105910793, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).IAuthTabCallback;
        if (loanRefinancingAdditionalInputFragment.newSessionWithExtras()) {
            return null;
        }
        linearLayout.post(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda23(linearLayout, loanRefinancingAdditionalInputFragment));
        int i4 = extraCallback + 125;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void onExtraCallbackWithResult(LinearLayout linearLayout, LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        linearLayout.addView(loanRefinancingAdditionalInputFragment.postMessage());
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 107;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final boolean newSessionWithExtras() {
        int i = 2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        LinearLayout linearLayout = ((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{this}, 105910793, -105910793, C40Encoder.onExtraCallback(), iOnExtraCallback, C40Encoder.onExtraCallback())).IAuthTabCallback;
        int childCount = linearLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            if (linearLayout.getChildAt(i2) instanceof TextField) {
                int i3 = extraCallback + 49;
                extraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            i2++;
            int i4 = extraCallback + 41;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return false;
    }

    private final boolean asInterface() {
        int i = 2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        JsErrorExtension jsErrorExtension = (JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{this}, 105910793, -105910793, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
        if (this.getInterfaceDescriptor) {
            int i2 = extraCallbackWithResult + 101;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            LinearLayout linearLayout = jsErrorExtension.IAuthTabCallback;
            TdsSegmentedControlV1View tdsSegmentedControlV1ViewIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
            tdsSegmentedControlV1ViewIsEngagementSignalsApiAvailable.setMessage((CharSequence) null);
            linearLayout.addView(tdsSegmentedControlV1ViewIsEngagementSignalsApiAvailable);
            int iOnExtraCallback4 = C40Encoder.onExtraCallback();
            int iOnExtraCallback5 = C40Encoder.onExtraCallback();
            int iOnExtraCallback6 = C40Encoder.onExtraCallback();
            onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{this}, -592609337, 592609338, iOnExtraCallback5, iOnExtraCallback4, iOnExtraCallback6);
        } else {
            jsErrorExtension.IAuthTabCallback.addView(isEngagementSignalsApiAvailable());
            int i4 = extraCallback + 75;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return jsErrorExtension.IAuthTabCallback.post(new LoanRefinancingAdditionalInputFragment$.ExternalSyntheticLambda0(this));
    }

    private static final void IAuthTabCallbackStub(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 99;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TdsSegmentedControlV1View.onExtraCallback(loanRefinancingAdditionalInputFragment.isEngagementSignalsApiAvailable(), loanRefinancingAdditionalInputFragment.getInterfaceDescriptor ? 1 : 0, false, false, 6, (Object) null);
        int i4 = extraCallbackWithResult + 83;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = extraCallback + 117;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        ((JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{this}, 105910793, -105910793, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3)).IAuthTabCallback.removeAllViews();
        super/*im.toss.base.BaseFragment*/.onDestroyView();
        int i4 = extraCallback + 81;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Boolean IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(objArr, "");
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = extraCallbackWithResult + 105;
            extraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = objArr[i2];
                Intrinsics.checkNotNull(obj, "");
                arrayList.add((Boolean) obj);
                i2 += 38;
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
        int i4 = extraCallback + 5;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object next = it.next();
        while (it.hasNext()) {
            next = Boolean.valueOf(((Boolean) next).booleanValue() && ((Boolean) it.next()).booleanValue());
        }
        return (Boolean) next;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(LoanComparisonAdditionalFieldOption loanComparisonAdditionalFieldOption) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (String) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanComparisonAdditionalFieldOption}, 736068646, -736068638, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanTextFieldLineDropDownView loanTextFieldLineDropDownView, access27100 access27100Var, LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, then thenVar, String str) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanTextFieldLineDropDownView, access27100Var, loanRefinancingAdditionalInputFragment, thenVar, str}, 168977954, -168977944, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ String IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (String) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{function1, obj}, -379028982, 379028986, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ void onWarmupCompleted(JsErrorExtension jsErrorExtension, View view) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{jsErrorExtension, view}, 485721680, -485721678, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ Boolean onNavigationEvent(Object[] objArr) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Boolean) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{objArr}, 1199659921, -1199659918, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, TdsSegmentedControlV1View tdsSegmentedControlV1View, View view, int i) {
        Object[] objArr = {loanRefinancingAdditionalInputFragment, tdsSegmentedControlV1View, view, Integer.valueOf(i)};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), objArr, -1855762042, 1855762047, C40Encoder.onExtraCallback(), iOnExtraCallback, C40Encoder.onExtraCallback());
    }

    private final void asBinder() {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{this}, -592609337, 592609338, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    private static final Unit onNavigationEvent(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment, CharSequence charSequence) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment, charSequence}, 1129906498, -1129906492, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    private static final Intent IAuthTabCallbackDefault(LoanRefinancingAdditionalInputFragment loanRefinancingAdditionalInputFragment) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Intent) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{loanRefinancingAdditionalInputFragment}, -1314046848, 1314046857, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    private final JsErrorExtension IAuthTabCallbackStub() {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (JsErrorExtension) onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{this}, 105910793, -105910793, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }

    private static final void access000(Function1 function1, Object obj) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        onWarmupCompleted(C40Encoder.onExtraCallback(), new Object[]{function1, obj}, -293338512, 293338519, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3);
    }
}
