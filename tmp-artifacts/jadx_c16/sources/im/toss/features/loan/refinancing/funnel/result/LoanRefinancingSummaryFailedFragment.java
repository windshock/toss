package im.toss.features.loan.refinancing.funnel.result;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.loan.comparison.common.LoanApplyBasicInfoView;
import im.toss.features.loan.refinancing.data.RefinancingInquiryResultAccount;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.result.LoanRefinancingSummaryFailedFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.logo.AnimateLogoSlideView;
import im.toss.tds.view.component.anim.logo.SlidingRecyclerView;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17;
import o.NetConverter3;
import o.PageContext;
import o.ParamUtils;
import o.PlayerErrorCode;
import o.PluginInfo;
import o.PriorityThreadFactoryExternalSyntheticLambda0;
import o.ResourceLoadExtension;
import o.SetDetectableSize;
import o.SpannedDataExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TraceDebugBridgeExtension;
import o.access13800;
import o.access14000;
import o.access14300;
import o.accessgetProtocolp;
import o.addAllCommandLine;
import o.deprecated_certificatePinner;
import o.deserializeUriNullableCollection;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.enableTabBarByAppId;
import o.findResAndMsg;
import o.generateLink;
import o.getByteBuffer;
import o.getExtraParameters;
import o.getKekid;
import o.getLongOctalBytes;
import o.getPackageType;
import o.getProxyokhttp;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.matches;
import o.maybeUpdateAnimatable;
import o.movePluginRefreshTimeToSp;
import o.onRenderReady;
import o.preFillDefault;
import o.pxToDp;
import o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE;
import o.response;
import o.runOnUiThreadDelayed;
import o.setBaseDeeplink;
import o.setBodyokhttp;
import o.setHeadersokhttp;
import o.setRandomHost;
import o.setVisitUrl;
import o.varyMatches;
import o.writeRaw;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanProductStatus;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingSummaryFailedFragment extends Hilt_LoanRefinancingSummaryFailedFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackDefault = 1;
    private static char extraCallback = 0;
    private static char[] extraCallbackWithResult = null;
    private static boolean onActivityLayout = false;
    private static int onActivityResized = 1;
    public static final int onExtraCallback;
    private static int onMessageChannelReady;
    private static int onMinimized;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static boolean onPostMessage;
    private static char[] readTypedObject;
    private static int writeTypedObject;
    private ResourceLoadExtension IAuthTabCallback;
    private deserializeUriNullableCollection IAuthTabCallbackStubProxy;
    private runOnUiThreadDelayed IAuthTabCallback_Parcel;
    private getPackageType ICustomTabsCallback;
    private boolean access000;
    private long access100;
    private final List<String> asBinder;
    private onExtraCallback getInterfaceDescriptor;
    private runOnUiThreadDelayed onExtraCallbackWithResult;
    private long onTransact;
    private int IAuthTabCallbackDefault = R.layout.fragment_loan_refinancing_summary_failed;
    private final PageContext onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onWarmupCompleted);

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = LoanRefinancingSummaryFailedFragment.onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 55216433, new Object[]{LoanRefinancingSummaryFailedFragment.this, this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -55216415, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            int i4 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = LoanRefinancingSummaryFailedFragment.onWarmupCompleted(LoanRefinancingSummaryFailedFragment.this, (access13800) this);
            if (i3 == 0) {
                int i4 = 35 / 0;
            }
            int i5 = IAuthTabCallback + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    static {
        asInterface();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingSummaryFailedFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingSummaryFailedBinding;", 0)};
        onExtraCallback = 8;
        int i = ICustomTabsCallbackDefault + 51;
        onMessageChannelReady = i % 128;
        if (i % 2 != 0) {
            int i2 = 33 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 11;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallback_Parcel(function1, obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, ResourceLoadExtension resourceLoadExtension, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingSummaryFailedFragment, resourceLoadExtension, view);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = onActivityResized + 63;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 51;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(str, str2, str3, loanRefinancingSummaryFailedFragment, setDetectableSize);
        }
        onNavigationEvent(str, str2, str3, loanRefinancingSummaryFailedFragment, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 67;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(loanRefinancingSummaryFailedFragment, z, resourceLoadExtension, view);
        int i4 = onMinimized + 33;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 97;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr = {function1, obj};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 == 0) {
            onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -625343384, objArr, iIAuthTabCallback, 625343396, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            obj2.hashCode();
            throw null;
        }
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -625343384, objArr, iIAuthTabCallback, 625343396, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = onMinimized + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        ResourceLoadExtension resourceLoadExtension = (ResourceLoadExtension) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingSummaryFailedFragment, resourceLoadExtension, setDetectableSize);
        int i4 = onMinimized + 89;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingSummaryFailedFragment, setDetectableSize);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        ResourceLoadExtension resourceLoadExtension = (ResourceLoadExtension) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = onMinimized + 117;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        asBinder(loanRefinancingSummaryFailedFragment, zBooleanValue, resourceLoadExtension, view);
        int i4 = onActivityResized + 51;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        String str = (String) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(loanRefinancingSummaryFailedFragment, str, view);
        }
        onExtraCallback(loanRefinancingSummaryFailedFragment, str, view);
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 89;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 328285397, new Object[]{th}, iIAuthTabCallback, -328285383, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(loanRefinancingSummaryFailedFragment, view);
        int i4 = onMinimized + 115;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = i9 | i10 | (~(i8 | i2));
        int i12 = i10 | i3;
        int i13 = ~i2;
        int i14 = (~(i3 | i13 | i4)) | (~(i7 | i13 | i8)) | (~(i8 | i4 | i2));
        int i15 = i4 + i2 + i + ((-1329026341) * i5) + ((-1277752516) * i6);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i4) - 1912602624) + ((-659060787) * i2) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i) + (494927872 * i5) + (1577058304 * i6) + ((-1783103488) * i16);
        int i18 = (i4 * 595972471) + 129777640 + (i2 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i * 595972219) + (i5 * (-1341978823)) + (i6 * 731850196) + (i16 * 1869086720);
        switch (i17 + (i18 * i18 * (-846725120))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallback_Parcel(objArr);
            case 11:
                return access100(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return extraCallbackWithResult(objArr);
            case 16:
                return extraCallback(objArr);
            case 17:
                LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
                int i19 = 2 % 2;
                String string = loanRefinancingSummaryFailedFragment.getString(R.string.loan_refinancing_better_result_alarm_title_front);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = loanRefinancingSummaryFailedFragment.getString(R.string.loan_refinancing_question_take_alarm);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                loanRefinancingSummaryFailedFragment.onNavigationEvent(string + " " + string2, "banner");
                loanRefinancingSummaryFailedFragment.ICustomTabsService();
                int i20 = onMinimized + 23;
                onActivityResized = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 18:
                return readTypedObject(objArr);
            case 19:
                return ICustomTabsCallback(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 33;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = onActivityResized + 71;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 113;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(view);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        int i5 = onMinimized + 85;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, TdsListRowV1View tdsListRowV1View, TdsButtonV1View tdsButtonV1View) {
        int i = 2 % 2;
        int i2 = onMinimized + 97;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingSummaryFailedFragment, tdsListRowV1View, tdsButtonV1View);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingSummaryFailedFragment, setDetectableSize);
        int i4 = onMinimized + 79;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 115;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, loanRefinancingSummaryFailedFragment, setDetectableSize);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment) {
        int i = 2 % 2;
        int i2 = onActivityResized + 31;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 253685383, new Object[]{loanRefinancingSummaryFailedFragment}, iIAuthTabCallback, -253685374, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 253685383, new Object[]{loanRefinancingSummaryFailedFragment}, iIAuthTabCallback2, -253685374, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        int i3 = onActivityResized + 85;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 11;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        asBinder(loanRefinancingSummaryFailedFragment, view);
        int i4 = onMinimized + 87;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, Long l) {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingSummaryFailedFragment, l);
        int i4 = onMinimized + 61;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 103;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingSummaryFailedFragment, z, resourceLoadExtension, setDetectableSize);
        int i4 = onActivityResized + 85;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment) {
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(loanRefinancingSummaryFailedFragment);
        int i4 = onMinimized + 23;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 97;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1551867162, new Object[]{loanRefinancingSummaryFailedFragment, view}, iIAuthTabCallback, -1551867154, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = onMinimized + 7;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(loanRefinancingSummaryFailedFragment, z, resourceLoadExtension, view);
        int i4 = onActivityResized + 55;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, String str, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 45;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(loanRefinancingSummaryFailedFragment, str, resourceLoadExtension, setDetectableSize);
        }
        IAuthTabCallback(loanRefinancingSummaryFailedFragment, str, resourceLoadExtension, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(loanRefinancingSummaryFailedFragment, z, resourceLoadExtension, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingSummaryFailedFragment, z, resourceLoadExtension, setDetectableSize);
        int i3 = onMinimized + 65;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 75;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, loanRefinancingSummaryFailedFragment, setDetectableSize);
        int i4 = onMinimized + 5;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 729576646, new Object[]{loanRefinancingSummaryFailedFragment, view}, iIAuthTabCallback, -729576629, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = onMinimized + 33;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = onActivityResized + 5;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(view);
        }
        IAuthTabCallback(view);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(view);
        int i4 = onMinimized + 57;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, Long l) {
        int i = 2 % 2;
        int i2 = onMinimized + 13;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1029269379, new Object[]{loanRefinancingSummaryFailedFragment, l}, iIAuthTabCallback, 1029269395, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1969166082, new Object[]{loanRefinancingSummaryFailedFragment, priorityThreadFactoryExternalSyntheticLambda0}, iIAuthTabCallback, -1969166082, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = onMinimized + 119;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, ResourceLoadExtension resourceLoadExtension, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 31;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(loanRefinancingSummaryFailedFragment, resourceLoadExtension, view);
        }
        onNavigationEvent(loanRefinancingSummaryFailedFragment, resourceLoadExtension, view);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {loanRefinancingSummaryFailedFragment, resourceLoadExtension, setDetectableSize};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback2, 900922663, objArr, iIAuthTabCallback, -900922658, iIAuthTabCallback3, iIAuthTabCallback4);
        int i4 = onActivityResized + 21;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, TdsListRowV1View tdsListRowV1View, TdsButtonV1View tdsButtonV1View) {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, loanRefinancingSummaryFailedFragment, tdsListRowV1View, tdsButtonV1View);
        int i4 = onActivityResized + 5;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return 1251907L;
        }
        throw null;
    }

    public LoanRefinancingSummaryFailedFragment() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{25, '\r', '\r', 1, '\f', 31, 13814, 13814, 19, '\r', 6, '\b', 17, 30, '\r', 11, 25, '\f', 14, '\f', 16, 30, 0, 15, 30, 29, 19, 14, 1, '!', 22, 14, 1, 27, '\t', 2, 17, 30, 26, '\b', 5, '\n', 19, 2, 3, '\b', 18, 6, 1, 3, 19, 25, 14, 18, 23, 7, 23, 14, ' ', 19, 13886}, (byte) (65 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 62 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{25, '\r', '\r', 1, '\f', 31, 13838, 13838, 19, '\r', 6, '\b', 17, 30, '\r', 11, 25, '\f', 14, '\f', 16, 30, 0, 15, 30, 29, 19, 14, 1, '!', 22, 14, 1, 27, '\t', 2, 17, 30, 26, '\b', 5, '\n', 19, 2, 3, '\b', 18, 6, 1, 3, 6, 25, 13890, 13890, '\r', '#', 22, 14}, (byte) (Color.argb(0, 0, 0, 0) + 89), 59 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{25, '\r', '\r', 1, '\f', 31, 13866, 13866, 19, '\r', 6, '\b', 17, 30, '\r', 11, 25, '\f', 14, '\f', 16, 30, 0, 15, 30, 29, 19, 14, 1, '!', 22, 14, 1, 27, '\t', 2, 17, 30, 26, '\b', 5, '\n', 19, 2, 3, '\b', 18, 6, 1, 3, 23, 7, 23, '\b', '\r', '#', 22, 14}, (byte) (117 - TextUtils.indexOf("", "", 0)), TextUtils.indexOf("", "") + 58, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{25, '\r', '\r', 1, '\f', 31, 13806, 13806, 19, '\r', 6, '\b', 17, 30, '\r', 11, 25, '\f', 14, '\f', 16, 30, 0, 15, 30, 29, 19, 14, 1, '!', 22, 14, 1, 27, '\t', 2, 17, 30, 26, '\b', 5, '\n', 19, 2, 3, '\b', 18, 6, 1, 3, 2, 5, '\b', 23, 5, '\r', ' ', 19, 13878}, (byte) (57 - View.resolveSizeAndState(0, 0, 0)), TextUtils.indexOf("", "", 0) + 59, objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new char[]{25, '\r', '\r', 1, '\f', 31, 13807, 13807, 19, '\r', 6, '\b', 17, 30, '\r', 11, 25, '\f', 14, '\f', 16, 30, 0, 15, 30, 29, 19, 14, 1, '!', 22, 14, 1, 27, '\t', 2, 17, 30, 26, '\b', 5, '\n', 19, 2, 3, '\b', 18, 6, 1, 3, 27, 25, 26, 30, '\r', '\f', ' ', 19, 13879}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58), TextUtils.lastIndexOf("", '0') + 60, objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{25, '\r', '\r', 1, '\f', 31, 13765, 13765, 19, '\r', 6, '\b', 17, 30, '\r', 11, 25, '\f', 14, '\f', 16, 30, 0, 15, 30, 29, 19, 14, 1, '!', 22, 14, 1, 27, '\t', 2, 17, 30, 26, '\b', 5, '\n', 19, 2, 3, '\b', 18, 6, 1, 3, 22, 5, '\r', '#', 22, 14}, (byte) (Color.red(0) + 16), 56 - Color.blue(0), objArr6);
        String strIntern6 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        c(new byte[]{-114, -115, -125, -118, -110, -114, -106, -111, -107, -107, -120, -108, -111, -109, -115, -121, -110, -111, -115, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr7);
        this.asBinder = CollectionsKt.listOf(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, ((String) objArr7[0]).intern()});
        this.getInterfaceDescriptor = onExtraCallback.UNKNOWN;
        this.IAuthTabCallback = ResourceLoadExtension.INIT;
    }

    public static final /* synthetic */ Object onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onMinimized + 75;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = loanRefinancingSummaryFailedFragment.onNavigationEvent((access13800<? super Unit>) access13800Var);
        int i4 = onMinimized + 91;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        access13800<? super Unit> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 75;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = loanRefinancingSummaryFailedFragment.IAuthTabCallback(access13800Var);
        int i4 = onActivityResized + 33;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    public int onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = onMinimized;
        int i4 = i3 + 97;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.IAuthTabCallbackDefault;
            int i5 = 24 / 0;
        } else {
            i = this.IAuthTabCallbackDefault;
        }
        int i6 = i3 + 117;
        onActivityResized = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
        return i;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        screenParams.put("business_yn", writeTypedObject());
        int i4 = onActivityResized + 45;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return screenParams;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, TraceDebugBridgeExtension> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        IAuthTabCallback() {
            super(1, TraceDebugBridgeExtension.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingSummaryFailedBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TraceDebugBridgeExtension traceDebugBridgeExtensionOnWarmupCompleted = onWarmupCompleted((View) obj);
            int i4 = onExtraCallback + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return traceDebugBridgeExtensionOnWarmupCompleted;
            }
            throw null;
        }

        public final TraceDebugBridgeExtension onWarmupCompleted(View view) {
            TraceDebugBridgeExtension traceDebugBridgeExtensionOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                traceDebugBridgeExtensionOnNavigationEvent = TraceDebugBridgeExtension.onNavigationEvent(view);
                int i3 = 94 / 0;
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                traceDebugBridgeExtensionOnNavigationEvent = TraceDebugBridgeExtension.onNavigationEvent(view);
            }
            int i4 = onNavigationEvent + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return traceDebugBridgeExtensionOnNavigationEvent;
        }
    }

    private final TraceDebugBridgeExtension onTransact() {
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TraceDebugBridgeExtension traceDebugBridgeExtensionOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult(this, onNavigationEvent[0]);
        Intrinsics.checkNotNullExpressionValue(traceDebugBridgeExtensionOnExtraCallbackWithResult, "");
        TraceDebugBridgeExtension traceDebugBridgeExtension = traceDebugBridgeExtensionOnExtraCallbackWithResult;
        int i4 = onMinimized + 83;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return traceDebugBridgeExtension;
        }
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onMinimized + 103;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isEngagementSignalsApiAvailable();
        newSession();
        Object[] objArr = {setBodyokhttp.onExtraCallback(this)};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        onExtraCallbackWithResult(((Integer) getUrlokhttp.onNavigationEvent(objArr, -880609169, 880609173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
        int i4 = onMinimized + 95;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void isEngagementSignalsApiAvailable() {
        int iOnWarmupCompleted;
        int color;
        int i = 2 % 2;
        TraceDebugBridgeExtension traceDebugBridgeExtensionOnTransact = onTransact();
        AnimateLogoSlideView animateLogoSlideView = traceDebugBridgeExtensionOnTransact.onMinimized;
        animateLogoSlideView.setSpeed(SlidingRecyclerView.onNavigationEvent.SLOW);
        animateLogoSlideView.setFadingEdgeLength(varyMatches.IAuthTabCallback(animateLogoSlideView, 10));
        animateLogoSlideView.setResourceSize(varyMatches.IAuthTabCallback(animateLogoSlideView, 56));
        animateLogoSlideView.setOffset(varyMatches.IAuthTabCallback(animateLogoSlideView, 32));
        List<String> list = this.asBinder;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new getProxyokhttp((String) it.next(), new PluginInfo(56.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 56, (DefaultConstructorMarker) null)));
        }
        animateLogoSlideView.onExtraCallbackWithResult(arrayList);
        AnimateLogoSlideView animateLogoSlideView2 = traceDebugBridgeExtensionOnTransact.onUnminimized;
        animateLogoSlideView2.setSpeed(SlidingRecyclerView.onNavigationEvent.SLOW);
        animateLogoSlideView2.setFadingEdgeLength(varyMatches.IAuthTabCallback(animateLogoSlideView2, 10));
        animateLogoSlideView2.setResourceSize(varyMatches.IAuthTabCallback(animateLogoSlideView2, 56));
        animateLogoSlideView2.setOffset(16);
        List<String> list2 = this.asBinder;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new getProxyokhttp((String) it2.next(), new PluginInfo(56.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 56, (DefaultConstructorMarker) null)));
            int i2 = onActivityResized + 55;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 3;
            }
        }
        animateLogoSlideView2.onExtraCallbackWithResult(arrayList2);
        traceDebugBridgeExtensionOnTransact.extraCallbackWithResult.setOnClickListener(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda13(this));
        for (CardView cardView : CollectionsKt.listOf(new CardView[]{traceDebugBridgeExtensionOnTransact.IAuthTabCallbackStub, traceDebugBridgeExtensionOnTransact.getInterfaceDescriptor, traceDebugBridgeExtensionOnTransact.access000})) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            if (generateLink.IAuthTabCallback(resources)) {
                int i4 = onActivityResized + 43;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                iOnWarmupCompleted = Color.parseColor("#17171C");
            } else {
                iOnWarmupCompleted = accessgetProtocolp.onNavigationEvent(this).onWarmupCompleted();
            }
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            if (generateLink.IAuthTabCallback(resources2)) {
                int i6 = onMinimized + 111;
                onActivityResized = i6 % 128;
                int i7 = i6 % 2;
                color = 0;
            } else {
                color = Color.parseColor("#1817171C");
                int i8 = onMinimized + 69;
                onActivityResized = i8 % 128;
                int i9 = i8 % 2;
            }
            cardView.setCardBackgroundColor(iOnWarmupCompleted);
            if (Build.VERSION.SDK_INT >= 28) {
                cardView.setOutlineAmbientShadowColor(color);
                cardView.setOutlineSpotShadowColor(color);
            }
        }
        newAuthTabSession();
    }

    private static void c(byte[] bArr, char[] cArr, int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = extraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 33;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 77 - Drawable.resolveOpacity(0, 0), 20952 - View.resolveSizeAndState(0, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
        Object[] objArr3 = {Integer.valueOf(writeTypedObject)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 75 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i7 = 1052772399;
        if (onActivityLayout) {
            int i8 = $10 + 61;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), View.MeasureSpec.getSize(0) + 63, 12215 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i7 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onPostMessage) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $10 + 25;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 63 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onNavigationEvent(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, ResourceLoadExtension resourceLoadExtension, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 67;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            loanRefinancingSummaryFailedFragment.postMessage();
            loanRefinancingSummaryFailedFragment.access100().writeTypedList();
            movePluginRefreshTimeToSp.onNavigationEvent.asBinder(true);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            loanRefinancingSummaryFailedFragment.postMessage();
            loanRefinancingSummaryFailedFragment.access100().writeTypedList();
            movePluginRefreshTimeToSp.onNavigationEvent.asBinder(true);
        }
        loanRefinancingSummaryFailedFragment.onWarmupCompleted(resourceLoadExtension);
        Unit unit = Unit.INSTANCE;
        int i3 = onMinimized + 97;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onTransact(View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 77;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, String str, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 113;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        loanRefinancingSummaryFailedFragment.onNavigationEvent(str, "cta");
        loanRefinancingSummaryFailedFragment.ICustomTabsService();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 67;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = loanRefinancingSummaryFailedFragment.getActivity();
        if (activity != null) {
            int i2 = onActivityResized + 117;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0) {
                activity.finish();
                throw null;
            }
            activity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onMinimized + 89;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
        return unit;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = readTypedObject;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 105;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(extraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        char c2 = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0') + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i7 = $10 + 17;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i9 = $10 + 53;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    c = c2;
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - Process.getGidForName("")), 74 - TextUtils.indexOf("", "", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i11 = $10 + 49;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                c = '0';
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, 19488 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '0';
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            obj = null;
                            c = '0';
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            } else {
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                c2 = c;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[PHI: r4
      0x006c: PHI (r4v12 im.toss.uikit.widget.textView.top.TdsTopV1View) = (r4v9 im.toss.uikit.widget.textView.top.TdsTopV1View), (r4v14 im.toss.uikit.widget.textView.top.TdsTopV1View) binds: [B:17:0x006a, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[PHI: r4
      0x009f: PHI (r4v10 im.toss.uikit.widget.textView.top.TdsTopV1View) = (r4v9 im.toss.uikit.widget.textView.top.TdsTopV1View), (r4v14 im.toss.uikit.widget.textView.top.TdsTopV1View) binds: [B:17:0x006a, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, ResourceLoadExtension resourceLoadExtension) {
        TdsTopV1View tdsTopV1View;
        TdsTopV1View tdsTopV1View2;
        int i = 2 % 2;
        List listOnNavigationEvent = access000().onNavigationEvent();
        if (listOnNavigationEvent instanceof Collection) {
            int i2 = onActivityResized + 93;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            if (listOnNavigationEvent.isEmpty()) {
                tdsTopV1View2 = onTransact().ICustomTabsCallbackStubProxy;
                if (resourceLoadExtension.isDrop()) {
                    this.access000 = true;
                    tdsTopV1View2.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
                    tdsTopV1View2.setLowerType(TdsTopV1View.onNavigationEvent.TOP6);
                    tdsTopV1View2.setUpperText(getString(R.string.loan_comparison_result_title_user_name, new Object[]{PlayerErrorCode.onPostMessage()}));
                    TdsBottomCtaV1View tdsBottomCtaV1View = onTransact().onTransact;
                    Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
                    tdsBottomCtaV1View.setVisibility(8);
                    if (!access100().updateVisuals()) {
                    }
                    prefetch();
                    onExtraCallback(resourceLoadExtension, onwarmupcompleted, false);
                }
            } else {
                Iterator it = listOnNavigationEvent.iterator();
                while (it.hasNext()) {
                    if (((RefinancingInquiryResultAccount) it.next()).IAuthTabCallback_Parcel()) {
                        int i4 = onActivityResized + 91;
                        onMinimized = i4 % 128;
                        if (i4 % 2 != 0) {
                            tdsTopV1View = onTransact().ICustomTabsCallbackStubProxy;
                            int i5 = 92 / 0;
                            if (!resourceLoadExtension.isFailure()) {
                                this.access000 = true;
                                tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
                                tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP6);
                                tdsTopV1View.setUpperText(getString(R.string.loan_comparison_result_title_user_name, new Object[]{PlayerErrorCode.onPostMessage()}));
                            } else {
                                this.access000 = false;
                                tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
                                tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
                                BaseTextView baseTextViewAsInterface = tdsTopV1View.asInterface();
                                if (baseTextViewAsInterface != null) {
                                    int i6 = onMinimized + 79;
                                    onActivityResized = i6 % 128;
                                    int i7 = i6 % 2;
                                    baseTextViewAsInterface.onNavigationEvent(response.Medium);
                                }
                                tdsTopV1View.setUpperText(getString(R.string.loan_refinancing_summary_title_failed));
                                tdsTopV1View.setLowerText(getString(R.string.loan_refinancing_summary_subtitle_failed));
                            }
                        } else {
                            tdsTopV1View = onTransact().ICustomTabsCallbackStubProxy;
                            if (resourceLoadExtension.isFailure()) {
                            }
                        }
                        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -959047135, new Object[]{this, Boolean.valueOf(!resourceLoadExtension.isFailure())}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 959047136, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                        onExtraCallback(resourceLoadExtension, onwarmupcompleted, true);
                        if (resourceLoadExtension.isFailure()) {
                            onExtraCallbackWithResult(resourceLoadExtension);
                            TdsBottomCtaV1View tdsBottomCtaV1View2 = onTransact().onTransact;
                            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
                            tdsBottomCtaV1View2.setVisibility(0);
                            TdsBottomCtaV1View tdsBottomCtaV1View3 = onTransact().onTransact;
                            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View3, "");
                            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View3, R.string.loan_string_re_inquiry, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda32(this, resourceLoadExtension), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK), false, 8, (Object) null);
                        } else {
                            TdsBottomCtaV1View tdsBottomCtaV1View4 = onTransact().onTransact;
                            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View4, "");
                            tdsBottomCtaV1View4.setVisibility(8);
                        }
                    }
                }
                tdsTopV1View2 = onTransact().ICustomTabsCallbackStubProxy;
                if (resourceLoadExtension.isDrop() || resourceLoadExtension.isDone()) {
                    this.access000 = false;
                    tdsTopV1View2.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP5);
                    tdsTopV1View2.setLowerType(TdsTopV1View.onNavigationEvent.TOP3);
                    BaseTextView baseTextViewAsInterface2 = tdsTopV1View2.asInterface();
                    if (baseTextViewAsInterface2 != null) {
                        baseTextViewAsInterface2.onNavigationEvent(response.Medium);
                        int i8 = onActivityResized + 17;
                        onMinimized = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    tdsTopV1View2.setUpperText(getString(R.string.loan_refinancing_dual_failed_title));
                    tdsTopV1View2.setLowerText(access100().updateVisuals() ^ true ? getString(R.string.loan_refinancing_wanna_alarm_on_better_condition) : getString(R.string.loan_refinancing_will_alarm_on_better_condition));
                    TdsBottomCtaV1View tdsBottomCtaV1View5 = onTransact().onTransact;
                    Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View5, "");
                    tdsBottomCtaV1View5.setVisibility(0);
                    if (access100().updateVisuals()) {
                        String string = getString(R.string.loan_refinancing_marketing_alarm_is_on);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 776204591, new Object[]{this, string, "cta", "Y"}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -776204587, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                        TdsBottomCtaV1View tdsBottomCtaV1View6 = onTransact().onTransact;
                        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View6, "");
                        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View6, string, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda33(), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK), false, 8, (Object) null);
                        TdsButtonV1View tdsButtonV1ViewAsInterface = onTransact().onTransact.asInterface();
                        tdsButtonV1ViewAsInterface.setOnClickListener(null);
                        tdsButtonV1ViewAsInterface.setFocusable(false);
                        tdsButtonV1ViewAsInterface.setClickable(false);
                        tdsButtonV1ViewAsInterface.setForeground(null);
                    } else {
                        String string2 = getString(R.string.loan_marketing_terms_banner_cta_title);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 776204591, new Object[]{this, string2, "cta", "N"}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -776204587, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                        TdsBottomCtaV1View tdsBottomCtaV1View7 = onTransact().onTransact;
                        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View7, "");
                        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View7, string2, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda34(this, string2), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                    }
                    onTransact().onTransact.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
                    onTransact().onTransact.setBottomButton(viva.republica.toss.R.string.close, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda35(this));
                } else {
                    this.access000 = true;
                    tdsTopV1View2.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
                    tdsTopV1View2.setLowerType(TdsTopV1View.onNavigationEvent.TOP6);
                    tdsTopV1View2.setUpperText(getString(R.string.loan_comparison_result_title_user_name, new Object[]{PlayerErrorCode.onPostMessage()}));
                    TdsBottomCtaV1View tdsBottomCtaV1View8 = onTransact().onTransact;
                    Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View8, "");
                    tdsBottomCtaV1View8.setVisibility(8);
                    if (!access100().updateVisuals()) {
                        int i10 = onMinimized + 105;
                        onActivityResized = i10 % 128;
                        int i11 = i10 % 2;
                        if (resourceLoadExtension.isApproved()) {
                            String string3 = getString(R.string.loan_refinancing_better_result_alarm_title_front);
                            Intrinsics.checkNotNullExpressionValue(string3, "");
                            String string4 = getString(R.string.loan_refinancing_question_take_alarm);
                            Intrinsics.checkNotNullExpressionValue(string4, "");
                            onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 776204591, new Object[]{this, string3 + " " + string4, "banner", "N"}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -776204587, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                            CardView cardView = onTransact().IAuthTabCallbackStub;
                            Intrinsics.checkNotNullExpressionValue(cardView, "");
                            enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(cardView, 0L, 0L, (Interpolator) null, false, false, (Function1) null, (Function1) null, 111, (Object) null);
                        }
                    }
                }
                prefetch();
                onExtraCallback(resourceLoadExtension, onwarmupcompleted, false);
            }
        }
        newSessionWithExtras();
    }

    private static final Unit onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void ICustomTabsCallbackStub() throws Throwable {
        CardView cardView;
        long j;
        long j2;
        Interpolator interpolator;
        boolean z;
        boolean z2;
        Function1 function1;
        Function1 function12;
        int i;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 85;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(this.IAuthTabCallback);
        CardView cardView2 = onTransact().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        if (cardView2.getVisibility() == 0) {
            int i5 = onMinimized + 73;
            onActivityResized = i5 % 128;
            if (i5 % 2 == 0) {
                cardView = onTransact().IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                j = 0;
                j2 = 1;
                interpolator = null;
                z = true;
                z2 = true;
                function1 = null;
                function12 = null;
                i = 109;
            } else {
                cardView = onTransact().IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                j = 0;
                j2 = 0;
                interpolator = null;
                z = false;
                z2 = false;
                function1 = null;
                function12 = null;
                i = 111;
            }
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(cardView, j, j2, interpolator, z, z2, function1, function12, i, (Object) null);
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = onTransact().onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        if (tdsBottomCtaV1View.getVisibility() == 0) {
            String string = getString(R.string.loan_refinancing_marketing_alarm_is_on);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 776204591, new Object[]{this, string, "cta", "Y"}, iIAuthTabCallback, -776204587, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            TdsBottomCtaV1View tdsBottomCtaV1View2 = onTransact().onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, string, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda4(), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK), false, 8, (Object) null);
            TdsButtonV1View tdsButtonV1ViewAsInterface = onTransact().onTransact.asInterface();
            tdsButtonV1ViewAsInterface.setOnClickListener(null);
            tdsButtonV1ViewAsInterface.setFocusable(false);
            tdsButtonV1ViewAsInterface.setClickable(false);
            tdsButtonV1ViewAsInterface.setForeground(null);
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 61;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            loanRefinancingSummaryFailedFragment.onWarmupCompleted(loanRefinancingSummaryFailedFragment.IAuthTabCallback);
            loanRefinancingSummaryFailedFragment.access100().writeTypedList();
            int i3 = 16 / 0;
        } else {
            loanRefinancingSummaryFailedFragment.onWarmupCompleted(loanRefinancingSummaryFailedFragment.IAuthTabCallback);
            loanRefinancingSummaryFailedFragment.access100().writeTypedList();
        }
        int i4 = onActivityResized + 61;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallback(boolean z, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, TdsListRowV1View tdsListRowV1View, TdsButtonV1View tdsButtonV1View) {
        int i = 2 % 2;
        int i2 = onMinimized + 75;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
            Intrinsics.checkNotNullParameter(tdsButtonV1View, "");
            onNavigationEvent(z, loanRefinancingSummaryFailedFragment, tdsListRowV1View, tdsButtonV1View);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        Intrinsics.checkNotNullParameter(tdsButtonV1View, "");
        onNavigationEvent(z, loanRefinancingSummaryFailedFragment, tdsListRowV1View, tdsButtonV1View);
        int i3 = 98 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        onExtraCallback onextracallback;
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        int i3 = i2 % 128;
        onMinimized = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!zBooleanValue) {
            onextracallback = onExtraCallback.FAILED;
        } else {
            int i4 = i3 + 21;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback onextracallback2 = onExtraCallback.FAILED_BUTTON;
                obj.hashCode();
                throw null;
            }
            onextracallback = onExtraCallback.FAILED_BUTTON;
        }
        if (loanRefinancingSummaryFailedFragment.getInterfaceDescriptor == onextracallback) {
            return null;
        }
        loanRefinancingSummaryFailedFragment.getInterfaceDescriptor = onextracallback;
        loanRefinancingSummaryFailedFragment.onNavigationEvent((Function2<? super TdsListRowV1View, ? super TdsButtonV1View, Unit>) new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda31(zBooleanValue, loanRefinancingSummaryFailedFragment));
        Object[] objArr2 = new Object[1];
        a(new char[]{'\t', 28, 4, 23}, (byte) (78 - (ViewConfiguration.getEdgeSlop() >> 16)), 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 892973697, new Object[]{loanRefinancingSummaryFailedFragment, ((String) objArr2[0]).intern()}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -892973682, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        return null;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("case", "DROP");
        Object[] objArr = new Object[1];
        Object obj = null;
        c(new byte[]{-104, -125, -105, -126}, null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "REFINANCING");
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 49;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void asBinder(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, View view) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1272187L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda25(loanRefinancingSummaryFailedFragment), 14, (Object) null);
        loanRefinancingSummaryFailedFragment.onWarmupCompleted(loanRefinancingSummaryFailedFragment.access000(), false);
        int i2 = onActivityResized + 57;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, TdsListRowV1View tdsListRowV1View, TdsButtonV1View tdsButtonV1View) {
        int i = 2 % 2;
        int i2 = onMinimized + 91;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
            Intrinsics.checkNotNullParameter(tdsButtonV1View, "");
            onExtraCallbackWithResult(loanRefinancingSummaryFailedFragment, tdsListRowV1View, tdsButtonV1View);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        Intrinsics.checkNotNullParameter(tdsButtonV1View, "");
        onExtraCallbackWithResult(loanRefinancingSummaryFailedFragment, tdsListRowV1View, tdsButtonV1View);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void prefetch() {
        int i = 2 % 2;
        int i2 = onMinimized + 103;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (this.getInterfaceDescriptor == onExtraCallback.DROP) {
                return;
            }
            onNavigationEvent((Function2<? super TdsListRowV1View, ? super TdsButtonV1View, Unit>) new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda11(this));
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 892973697, new Object[]{this, "DROP"}, iIAuthTabCallback, -892973682, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            int i3 = onMinimized + 13;
            onActivityResized = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        onExtraCallback onextracallback = onExtraCallback.DROP;
        throw null;
    }

    private final void onNavigationEvent(Function2<? super TdsListRowV1View, ? super TdsButtonV1View, Unit> function2) {
        ConstraintLayout constraintLayout;
        long j;
        long j2;
        Interpolator interpolator;
        boolean z;
        boolean z2;
        Function1 function1;
        Function1 function12;
        int i;
        int i2 = 2 % 2;
        ConstraintLayout constraintLayout2 = onTransact().IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        if (constraintLayout2.getVisibility() == 0) {
            int i3 = onActivityResized + 125;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            if (onTransact().IAuthTabCallbackStubProxy.getAlpha() > 0.0f) {
                int i5 = onActivityResized + 81;
                onMinimized = i5 % 128;
                if (i5 % 2 != 0) {
                    constraintLayout = onTransact().IAuthTabCallbackStubProxy;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    j = 1;
                    j2 = 0;
                    interpolator = null;
                    z = true;
                    z2 = true;
                    function1 = null;
                    function12 = null;
                    i = 24;
                } else {
                    constraintLayout = onTransact().IAuthTabCallbackStubProxy;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    j = 0;
                    j2 = 0;
                    interpolator = null;
                    z = false;
                    z2 = false;
                    function1 = null;
                    function12 = null;
                    i = 127;
                }
                enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(constraintLayout, j, j2, interpolator, z, z2, function1, function12, i, (Object) null);
                int i6 = onActivityResized + 3;
                onMinimized = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        ConstraintLayout constraintLayout3 = onTransact().writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(4);
        TdsListRowV1View tdsListRowV1View = onTransact().extraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        TdsButtonV1View tdsButtonV1View = onTransact().asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        function2.invoke(tdsListRowV1View, tdsButtonV1View);
        TdsListRowV1View tdsListRowV1View2 = onTransact().onMessageChannelReady;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View2, "");
        TdsButtonV1View tdsButtonV1View2 = onTransact().asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View2, "");
        function2.invoke(tdsListRowV1View2, tdsButtonV1View2);
        onTransact().writeTypedObject.post(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda29(this));
    }

    private static final void onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment) {
        int i = 2 % 2;
        int i2 = onActivityResized + 111;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            loanRefinancingSummaryFailedFragment.getContext();
            obj.hashCode();
            throw null;
        }
        if (loanRefinancingSummaryFailedFragment.getContext() == null) {
            return;
        }
        runOnUiThreadDelayed runonuithreaddelayed = loanRefinancingSummaryFailedFragment.IAuthTabCallback_Parcel;
        if (runonuithreaddelayed != null) {
            int i3 = onMinimized + 55;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0) {
                runonuithreaddelayed.onNavigationEvent();
                throw null;
            }
            runonuithreaddelayed.onNavigationEvent();
        }
        ConstraintLayout constraintLayout = loanRefinancingSummaryFailedFragment.onTransact().writeTypedObject;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        CardView cardView = loanRefinancingSummaryFailedFragment.onTransact().getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        ConstraintLayout constraintLayout2 = loanRefinancingSummaryFailedFragment.onTransact().IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        loanRefinancingSummaryFailedFragment.IAuthTabCallback_Parcel = loanRefinancingSummaryFailedFragment.onExtraCallback((View) constraintLayout, (View) cardView, (View) constraintLayout2);
    }

    private static final void onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, View view) {
        String str;
        int i = 2 % 2;
        int i2 = onActivityResized + 95;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            loanRefinancingSummaryFailedFragment.onWarmupCompleted(z, resourceLoadExtension);
            if (loanRefinancingSummaryFailedFragment.onActivityResized()) {
                str = "refinancing_business_summary_result";
            } else {
                int i3 = onMinimized + 7;
                onActivityResized = i3 % 128;
                int i4 = i3 % 2;
                str = "refinancing_loan__summary_result";
            }
            loanRefinancingSummaryFailedFragment.onWarmupCompleted(str);
            return;
        }
        loanRefinancingSummaryFailedFragment.onWarmupCompleted(z, resourceLoadExtension);
        loanRefinancingSummaryFailedFragment.onActivityResized();
        throw null;
    }

    private static final void onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, View view) {
        String str;
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingSummaryFailedFragment.onWarmupCompleted(z, resourceLoadExtension);
        if (loanRefinancingSummaryFailedFragment.onActivityResized()) {
            int i4 = onMinimized + 81;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            str = "refinancing_business_summary_result";
        } else {
            str = "refinancing_loan__summary_result";
        }
        loanRefinancingSummaryFailedFragment.onWarmupCompleted(str);
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, ResourceLoadExtension resourceLoadExtension, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        loanRefinancingSummaryFailedFragment.onWarmupCompleted(false, resourceLoadExtension);
        loanRefinancingSummaryFailedFragment.onExtraCallbackWithResult(false, loanRefinancingSummaryFailedFragment.onActivityResized() ? "refinancing_business_failed" : "refinancing_loan__summary_result");
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 119;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asBinder(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, View view) {
        String str;
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingSummaryFailedFragment.onWarmupCompleted(z, resourceLoadExtension);
        if (loanRefinancingSummaryFailedFragment.onActivityResized()) {
            int i4 = onMinimized + 85;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            str = "refinancing_business_failed";
        } else {
            str = "refinancing_loan__summary_result";
        }
        loanRefinancingSummaryFailedFragment.onWarmupCompleted(str);
    }

    private final void onExtraCallback(ResourceLoadExtension resourceLoadExtension, PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, boolean z) {
        ConstraintLayout constraintLayout;
        long j;
        long j2;
        Interpolator interpolator;
        boolean z2;
        boolean z3;
        Function1 function1;
        Function1 function12;
        int i;
        int i2 = 2 % 2;
        onExtraCallback(z, resourceLoadExtension);
        ConstraintLayout constraintLayout2 = onTransact().access100;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        if (constraintLayout2.getVisibility() == 0) {
            int i3 = onMinimized + 29;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            if (onTransact().access100.getAlpha() > 0.0f) {
                int i5 = onActivityResized + 87;
                onMinimized = i5 % 128;
                if (i5 % 2 != 0) {
                    constraintLayout = onTransact().access100;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    j = 1;
                    j2 = 1;
                    interpolator = null;
                    z2 = false;
                    z3 = true;
                    function1 = null;
                    function12 = null;
                    i = 44;
                } else {
                    constraintLayout = onTransact().access100;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    j = 0;
                    j2 = 0;
                    interpolator = null;
                    z2 = false;
                    z3 = false;
                    function1 = null;
                    function12 = null;
                    i = 127;
                }
                enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(constraintLayout, j, j2, interpolator, z2, z3, function1, function12, i, (Object) null);
            }
        }
        ConstraintLayout constraintLayout3 = onTransact().IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(4);
        TdsListRowV1View tdsListRowV1View = onTransact().readTypedObject;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        TdsButtonV1View tdsButtonV1View = onTransact().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        AnimateLogoSlideView animateLogoSlideView = onTransact().onMinimized;
        Intrinsics.checkNotNullExpressionValue(animateLogoSlideView, "");
        LoanApplyBasicInfoView loanApplyBasicInfoView = onTransact().onPostMessage;
        Intrinsics.checkNotNullExpressionValue(loanApplyBasicInfoView, "");
        onExtraCallbackWithResult(resourceLoadExtension, onwarmupcompleted, this, z, tdsListRowV1View, tdsButtonV1View, animateLogoSlideView, loanApplyBasicInfoView);
        TdsListRowV1View tdsListRowV1View2 = onTransact().ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View2, "");
        TdsButtonV1View tdsButtonV1View2 = onTransact().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View2, "");
        AnimateLogoSlideView animateLogoSlideView2 = onTransact().onUnminimized;
        Intrinsics.checkNotNullExpressionValue(animateLogoSlideView2, "");
        LoanApplyBasicInfoView loanApplyBasicInfoView2 = onTransact().onActivityLayout;
        Intrinsics.checkNotNullExpressionValue(loanApplyBasicInfoView2, "");
        onExtraCallbackWithResult(resourceLoadExtension, onwarmupcompleted, this, z, tdsListRowV1View2, tdsButtonV1View2, animateLogoSlideView2, loanApplyBasicInfoView2);
        onTransact().IAuthTabCallback_Parcel.post(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda28(this));
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (loanRefinancingSummaryFailedFragment.getContext() == null) {
            return null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = loanRefinancingSummaryFailedFragment.onExtraCallbackWithResult;
        if (runonuithreaddelayed != null) {
            int i4 = onMinimized + 91;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                runonuithreaddelayed.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            runonuithreaddelayed.onNavigationEvent();
        }
        ConstraintLayout constraintLayout = loanRefinancingSummaryFailedFragment.onTransact().IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        CardView cardView = loanRefinancingSummaryFailedFragment.onTransact().access000;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        ConstraintLayout constraintLayout2 = loanRefinancingSummaryFailedFragment.onTransact().access100;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        loanRefinancingSummaryFailedFragment.onExtraCallbackWithResult = loanRefinancingSummaryFailedFragment.onExtraCallback((View) constraintLayout, (View) cardView, (View) constraintLayout2);
        return null;
    }

    private static final Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onActivityResized + 47;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        view.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 91;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final runOnUiThreadDelayed onExtraCallback(View view, View view2, View view3) {
        int i = 2 % 2;
        view2.setVisibility(0);
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view2, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1685808947, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), null, Integer.valueOf(view.getHeight()), null, 5, null}, 1685808950, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 200}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
        Float fValueOf = Float.valueOf(1.0f);
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{view3, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), 300}, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda14(), 1, (Object) null), (Object) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda15(view), 1, (Object) null), false, 1, (Object) null);
        int i2 = onMinimized + 15;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return runonuithreaddelayedOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 57;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onMinimized + 29;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 101;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onMinimized + 103;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0 = (PriorityThreadFactoryExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = loanRefinancingSummaryFailedFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        if (!setBaseDeeplink.onWarmupCompleted(viewLifecycleOwner)) {
            return Unit.INSTANCE;
        }
        PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted onwarmupcompletedIAuthTabCallback = priorityThreadFactoryExternalSyntheticLambda0.IAuthTabCallback(ImagePipelineExperimentsBuilderExternalSyntheticLambda17.CREDIT);
        if (onwarmupcompletedIAuthTabCallback == null) {
            onwarmupcompletedIAuthTabCallback = new PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted((ImagePipelineExperimentsBuilderExternalSyntheticLambda17) null, (String) null, (LoanProductStatus) null, (String) null, 0.0f, 0L, 0, (PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted.onExtraCallback) null, (PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted.onExtraCallback) null, 0L, (String) null, 0, 4095, (DefaultConstructorMarker) null);
        }
        ResourceLoadExtension resourceLoadExtensionOnExtraCallback = ResourceLoadExtension.Companion.onExtraCallback(onwarmupcompletedIAuthTabCallback);
        if (resourceLoadExtensionOnExtraCallback.isInactive()) {
            int i2 = onActivityResized + 125;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            loanRefinancingSummaryFailedFragment.onWarmupCompleted(true);
            resourceLoadExtensionOnExtraCallback = ResourceLoadExtension.ON_POLLING;
        }
        movePluginRefreshTimeToSp movepluginrefreshtimetosp = movePluginRefreshTimeToSp.onNavigationEvent;
        if (movepluginrefreshtimetosp.asBinder()) {
            int i4 = onMinimized + 77;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            if (resourceLoadExtensionOnExtraCallback.isFailure()) {
                int i6 = onMinimized + 23;
                onActivityResized = i6 % 128;
                int i7 = i6 % 2;
                LoanRefinancingFunnelBaseFragment.onWarmupCompleted(loanRefinancingSummaryFailedFragment, true, (String) null, 2, (Object) null);
                resourceLoadExtensionOnExtraCallback = ResourceLoadExtension.ON_POLLING;
            }
        }
        movepluginrefreshtimetosp.asBinder(false);
        if (loanRefinancingSummaryFailedFragment.IAuthTabCallback != resourceLoadExtensionOnExtraCallback) {
            loanRefinancingSummaryFailedFragment.onNavigationEvent(resourceLoadExtensionOnExtraCallback);
            loanRefinancingSummaryFailedFragment.IAuthTabCallback = resourceLoadExtensionOnExtraCallback;
            loanRefinancingSummaryFailedFragment.onExtraCallbackWithResult(onwarmupcompletedIAuthTabCallback, resourceLoadExtensionOnExtraCallback);
            if (resourceLoadExtensionOnExtraCallback.isCompleted()) {
                loanRefinancingSummaryFailedFragment.asBinder();
            }
            return Unit.INSTANCE;
        }
        int i8 = onMinimized + 105;
        onActivityResized = i8 % 128;
        int i9 = i8 % 2;
        if (resourceLoadExtensionOnExtraCallback.isCompleted()) {
            int i10 = onActivityResized + 103;
            onMinimized = i10 % 128;
            if (i10 % 2 != 0) {
                loanRefinancingSummaryFailedFragment.asBinder();
                int i11 = 52 / 0;
            } else {
                loanRefinancingSummaryFailedFragment.asBinder();
            }
            int i12 = onMinimized + 45;
            onActivityResized = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (!(access13800Var instanceof onWarmupCompleted)) {
            onwarmupcompleted = new onWarmupCompleted(access13800Var);
        } else {
            int i2 = onActivityResized + 69;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onActivityResized + 43;
                onMinimized = i5 % 128;
                if (i5 % 2 != 0) {
                    onwarmupcompleted.label = i4 >> Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i4 - 2147483648;
                }
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onwarmupcompleted.label;
        if (i6 != 0) {
            int i7 = onActivityResized + 61;
            onMinimized = i7 % 128;
            int i8 = i7 % 2;
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            onwarmupcompleted.label = 1;
            if (IAuthTabCallback((access13800<? super Unit>) onwarmupcompleted) == objOnWarmupCompleted) {
                int i9 = onActivityResized + 15;
                onMinimized = i9 % 128;
                if (i9 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
        }
        writeRaw writerawIAuthTabCallback = enableTabBarByAppId.onNavigationEvent(enableTabBarByAppId.onWarmupCompleted, false, 1, (Object) null).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = writerawIAuthTabCallback.IAuthTabCallbackStub().onExtraCallback(1500L, TimeUnit.MILLISECONDS).onExtraCallbackWithResult(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda7(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda6(this)), new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda9(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda8()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        autoDisposable(deserializeurinullablecollectionOnExtraCallbackWithResult);
        return Unit.INSTANCE;
    }

    private final void newSession() {
        int i = 2 % 2;
        this.IAuthTabCallbackStubProxy = getByteBuffer.onExtraCallback(500L, 3000L, TimeUnit.MILLISECONDS, NetConverter3.onExtraCallback()).IAuthTabCallback(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda18(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda17(this)));
        int i2 = onActivityResized + 25;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 111;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = LoanRefinancingSummaryFailedFragment.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 36 / 0;
            } else {
                objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onWarmupCompleted + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = LoanRefinancingSummaryFailedFragment.this;
                this.label = 1;
                if (LoanRefinancingSummaryFailedFragment.onWarmupCompleted(loanRefinancingSummaryFailedFragment, (access13800) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, Long l) {
        int i = 2 % 2;
        int i2 = onActivityResized + 83;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
            if (loanRefinancingSummaryFailedFragment.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                int i4 = onActivityResized + 83;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                getPackageType getpackagetype = loanRefinancingSummaryFailedFragment.ICustomTabsCallback;
                if (getpackagetype != null) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
                loanRefinancingSummaryFailedFragment.ICustomTabsCallback = maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(loanRefinancingSummaryFailedFragment), (CoroutineContext) null, (setRandomHost) null, loanRefinancingSummaryFailedFragment.new onNavigationEvent(null), 3, (Object) null);
                int i6 = onActivityResized + 47;
                onMinimized = i6 % 128;
                int i7 = i6 % 2;
            }
        } else if (loanRefinancingSummaryFailedFragment.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
        }
        return Unit.INSTANCE;
    }

    private final void newAuthTabSession() {
        int i = 2 % 2;
        int i2 = onActivityResized + 67;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = onPostMessage().IAuthTabCallbackDefault();
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        this.access100 = (calendar.getTimeInMillis() + 86400000) - this.onTransact;
        int i4 = onMinimized + 109;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 49;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 65;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingSummaryFailedFragment.onTransact().ICustomTabsCallbackStubProxy.setLowerText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_remain_time, new Object[]{getLongOctalBytes.onExtraCallback(loanRefinancingSummaryFailedFragment.access100 - (loanRefinancingSummaryFailedFragment.onPostMessage().IAuthTabCallbackDefault() - loanRefinancingSummaryFailedFragment.onTransact))}));
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 93;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        if (this.access000) {
            getByteBuffer getbytebufferOnNavigationEvent = getByteBuffer.onNavigationEvent(500L, TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnNavigationEvent, "");
            getByteBuffer getbytebufferOnExtraCallback = getbytebufferOnNavigationEvent.onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnExtraCallback.IAuthTabCallback(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda23(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda22(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
            autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
            int i4 = onActivityResized + 17;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onStop() {
        int i = 2 % 2;
        super.onStop();
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallback_Parcel;
        if (runonuithreaddelayed != null) {
            int i2 = onMinimized + 11;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.onExtraCallbackWithResult;
        if (runonuithreaddelayed2 != null) {
            int i4 = onActivityResized + 3;
            onMinimized = i4 % 128;
            if (i4 % 2 != 0) {
                runonuithreaddelayed2.onNavigationEvent();
                int i5 = 57 / 0;
            } else {
                runonuithreaddelayed2.onNavigationEvent();
            }
        }
        asBinder();
        int i6 = onMinimized + 109;
        onActivityResized = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder();
            super/*im.toss.base.BaseFragment*/.onDestroyView();
        } else {
            asBinder();
            super/*im.toss.base.BaseFragment*/.onDestroyView();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void asBinder() {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStubProxy;
        if (deserializeurinullablecollection != null) {
            int i2 = onActivityResized + 53;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            deserializeurinullablecollection.dispose();
        }
        this.IAuthTabCallbackStubProxy = null;
        int i4 = onActivityResized + 27;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(ResourceLoadExtension resourceLoadExtension) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251913L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda26(this, resourceLoadExtension), 14, (Object) null);
        int i2 = onMinimized + 37;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{'\t', 28, 4, 23}, (byte) (78 - Color.blue(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, objArr);
        setDetectableSize.onExtraCallback("case", ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new char[]{3, 22, 13850, 13850, 26, 18, 31, '\t', '\r', 6, 2, '\f'}, (byte) (44 - (ViewConfiguration.getLongPressTimeout() >> 16)), 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_string_re_inquiry));
        setDetectableSize.onExtraCallback("loan_comparison_status", resourceLoadExtension.getComparisonStateForRefinancingLog());
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 51;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void onWarmupCompleted(ResourceLoadExtension resourceLoadExtension) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251915L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda12(this, resourceLoadExtension), 14, (Object) null);
        int i2 = onActivityResized + 45;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        ResourceLoadExtension resourceLoadExtension = (ResourceLoadExtension) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onMinimized + 29;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{'\t', 28, 4, 23}, (byte) (78 - Color.blue(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 4, objArr2);
        setDetectableSize.onExtraCallback("case", ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{3, 22, 13850, 13850, 26, 18, 31, '\t', '\r', 6, 2, '\f'}, (byte) (44 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_string_re_inquiry));
        setDetectableSize.onExtraCallback("loan_comparison_status", resourceLoadExtension.getComparisonStateForRefinancingLog());
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 41;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1268769L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda20((String) objArr[1], (String) objArr[2], (String) objArr[3], loanRefinancingSummaryFailedFragment), 14, (Object) null);
        int i2 = onMinimized + 73;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 29;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("case", "DROP");
        Object[] objArr = new Object[1];
        a(new char[]{6, '\r', 6, 1, 13942}, (byte) (119 - Color.blue(0)), 5 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        c(new byte[]{-104, -125, -105, -126}, null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        setDetectableSize.onExtraCallback("alarm_yn", str3);
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 7;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1268771L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda19(str, str2, this), 14, (Object) null);
        int i2 = onMinimized + 123;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 101;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("case", "DROP");
        Object[] objArr = new Object[1];
        a(new char[]{6, '\r', 6, 1, 13942}, (byte) (118 - TextUtils.lastIndexOf("", '0', 0)), ExpandableListView.getPackedPositionChild(0L) + 6, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        c(new byte[]{-104, -125, -105, -126}, null, null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        setDetectableSize.onExtraCallback("alarm_yn", "N");
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 67;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment = (LoanRefinancingSummaryFailedFragment) objArr[0];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1272189L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda30((String) objArr[1], loanRefinancingSummaryFailedFragment), 14, (Object) null);
        int i2 = onMinimized + 33;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(String str, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("case", str);
        Object[] objArr = new Object[1];
        c(new byte[]{-104, -125, -105, -126}, null, null, 127 - Drawable.resolveOpacity(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "REFINANCING");
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 29;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(ResourceLoadExtension resourceLoadExtension) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = onMinimized + 23;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        List listOnNavigationEvent = access000().onNavigationEvent();
        if (listOnNavigationEvent instanceof Collection) {
            int i4 = onActivityResized + 19;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            if (listOnNavigationEvent.isEmpty()) {
                strIntern = "DROP";
            } else {
                Iterator it = listOnNavigationEvent.iterator();
                while (!(!it.hasNext())) {
                    int i6 = onActivityResized + 79;
                    onMinimized = i6 % 128;
                    int i7 = i6 % 2;
                    if (((RefinancingInquiryResultAccount) it.next()).IAuthTabCallback_Parcel()) {
                        Object[] objArr = new Object[1];
                        a(new char[]{'\t', 28, 4, 23}, (byte) (77 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getOffsetBefore("", 0) + 4, objArr);
                        strIntern = ((String) objArr[0]).intern();
                        break;
                    }
                }
                strIntern = "DROP";
            }
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1284133L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda24(this, strIntern, resourceLoadExtension), 14, (Object) null);
    }

    private static final Unit IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, String str, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 67;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        c(new byte[]{-103, -104, -103, -103, -104, -108, -104, -103}, null, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = {loanRefinancingSummaryFailedFragment.access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        setDetectableSize.onExtraCallback(strIntern, (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr2));
        setDetectableSize.onExtraCallback("refinancing_status", str);
        setDetectableSize.onExtraCallback("loan_comparison_status", resourceLoadExtension.getComparisonStateForRefinancingLog());
        setDetectableSize.onExtraCallback("alarm_yn", zzaz.onExtraCallbackWithResult(loanRefinancingSummaryFailedFragment.access100().updateVisuals()));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 87;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallback(boolean z, ResourceLoadExtension resourceLoadExtension) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1284135L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda16(this, z, resourceLoadExtension), 14, (Object) null);
        int i2 = onActivityResized + 89;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        c(new byte[]{-103, -104, -103, -103, -104, -108, -104, -103}, null, null, 127 - TextUtils.indexOf("", ""), objArr);
        String strIntern2 = ((String) objArr[0]).intern();
        Object[] objArr2 = {loanRefinancingSummaryFailedFragment.access100()};
        setDetectableSize.onExtraCallback(strIntern2, (String) LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2));
        if (!z) {
            strIntern = "DROP";
        } else {
            Object[] objArr3 = new Object[1];
            a(new char[]{'\t', 28, 4, 23}, (byte) (78 - View.resolveSize(0, 0)), 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            strIntern = ((String) objArr3[0]).intern();
            int i2 = onMinimized + 15;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
        }
        setDetectableSize.onExtraCallback("refinancing_status", strIntern);
        setDetectableSize.onExtraCallback("loan_comparison_status", resourceLoadExtension.getComparisonStateForRefinancingLog());
        setDetectableSize.onExtraCallback("alarm_yn", zzaz.onExtraCallbackWithResult(loanRefinancingSummaryFailedFragment.access100().updateVisuals()));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 65;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void onWarmupCompleted(boolean z, ResourceLoadExtension resourceLoadExtension) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1284137L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda5(this, z, resourceLoadExtension), 14, (Object) null);
        int i2 = onMinimized + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        c(new byte[]{-103, -104, -103, -103, -104, -108, -104, -103}, null, null, 126 - TextUtils.lastIndexOf("", '0'), objArr);
        String strIntern2 = ((String) objArr[0]).intern();
        Object[] objArr2 = {loanRefinancingSummaryFailedFragment.access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        setDetectableSize.onExtraCallback(strIntern2, (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr2));
        if (z) {
            int i4 = onActivityResized + 71;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr3 = new Object[1];
            a(new char[]{'\t', 28, 4, 23}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 78), Gravity.getAbsoluteGravity(0, 0) + 4, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            int i6 = onMinimized + 19;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
        } else {
            strIntern = "DROP";
        }
        setDetectableSize.onExtraCallback("refinancing_status", strIntern);
        setDetectableSize.onExtraCallback("loan_comparison_status", resourceLoadExtension.getComparisonStateForRefinancingLog());
        setDetectableSize.onExtraCallback("alarm_yn", zzaz.onExtraCallbackWithResult(loanRefinancingSummaryFailedFragment.access100().updateVisuals()));
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        return Unit.INSTANCE;
    }

    private final void postMessage() {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1971654L, false, (String) null, (Map) null, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda27(this), 14, (Object) null);
        int i2 = onActivityResized + 5;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingSummaryFailedFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 115;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 57;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i5 = i2 + 85;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i7 = onextracallbackwithresult.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i7 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                int i8 = onMinimized + 51;
                onActivityResized = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        Object obj = onextracallbackwithresult2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = onextracallbackwithresult2.label;
        Object obj2 = null;
        if (i10 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (!(!access100().updateVisuals())) {
                return Unit.INSTANCE;
            }
            r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE interfaceDescriptor = getInterfaceDescriptor();
            onextracallbackwithresult2.label = 1;
            objOnNavigationEvent = r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(interfaceDescriptor, "STD_7172_REGULAR_REFINANCING_NOTIFICATION", false, onextracallbackwithresult2, 2, (Object) null);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i11 = onMinimized + 95;
                int i12 = i11 % 128;
                onActivityResized = i12;
                int i13 = i11 % 2;
                int i14 = i12 + 103;
                onMinimized = i14 % 128;
                if (i14 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = ((Result) obj).onNavigationEvent();
        }
        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
        if (Result.onExtraCallback(objOnNavigationEvent)) {
            int i15 = onActivityResized + 87;
            int i16 = i15 % 128;
            onMinimized = i16;
            if (i15 % 2 != 0) {
                throw null;
            }
            int i17 = i16 + 61;
            onActivityResized = i17 % 128;
            int i18 = i17 % 2;
            objOnNavigationEvent = boolOnNavigationEvent;
        }
        Object[] objArr = {access100(), Boolean.valueOf(((Boolean) objOnNavigationEvent).booleanValue())};
        LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 736083287, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -736083277, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr);
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(boolean z, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, TdsListRowV1View tdsListRowV1View, TdsButtonV1View tdsButtonV1View) {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        tdsListRowV1View.setCenterText1(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_dual_refinancing_title));
        if (z) {
            tdsListRowV1View.setCenterText1Color(setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).ICustomTabsCallbackStubProxy());
            tdsListRowV1View.setCenterText2(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_summary_title_failed));
        } else {
            tdsListRowV1View.setCenterText2((CharSequence) null);
        }
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.BADGE);
        tdsListRowV1View.setRightBadgeText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_inquiry_failed));
        tdsListRowV1View.setRightBadgeTheme(new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.YELLOW, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL));
        tdsListRowV1View.setOnClickListener((View.OnClickListener) null);
        tdsListRowV1View.setClickable(false);
        tdsListRowV1View.setRightArrow(false);
        if (!z) {
            tdsButtonV1View.setVisibility(8);
            return;
        }
        tdsButtonV1View.setVisibility(0);
        loanRefinancingSummaryFailedFragment.onExtraCallbackWithResult(loanRefinancingSummaryFailedFragment.IAuthTabCallback);
        tdsButtonV1View.setText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_string_re_inquiry));
        tdsButtonV1View.setButtonStyle(TdsButtonV1View.IAuthTabCallbackDefault.WEAK);
        tdsButtonV1View.setButtonSize(TdsButtonV1View.onWarmupCompleted.LARGE);
        tdsButtonV1View.setButtonDisplay(TdsButtonV1View.IAuthTabCallback.BLOCK);
        tdsButtonV1View.setOnClickListener(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda10(loanRefinancingSummaryFailedFragment));
        int i4 = onActivityResized + 5;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, TdsListRowV1View tdsListRowV1View, TdsButtonV1View tdsButtonV1View) {
        int i = 2 % 2;
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        tdsListRowV1View.setCenterText1(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_dual_refinancing_title));
        tdsListRowV1View.setCenterText1Color(setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).ICustomTabsCallbackStubProxy());
        tdsListRowV1View.setCenterText2(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_cannot_refinance_now));
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.BADGE);
        tdsListRowV1View.setRightBadgeText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_impossible));
        tdsListRowV1View.setRightBadgeTheme(new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.ELEPHANT, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL));
        tdsListRowV1View.setRightArrow(true);
        tdsListRowV1View.setOnClickListener(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda21(loanRefinancingSummaryFailedFragment));
        tdsButtonV1View.setVisibility(8);
        int i2 = onMinimized + 79;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onExtraCallbackWithResult(ResourceLoadExtension resourceLoadExtension, PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, boolean z, TdsListRowV1View tdsListRowV1View, TdsButtonV1View tdsButtonV1View, SlidingRecyclerView slidingRecyclerView, LoanApplyBasicInfoView loanApplyBasicInfoView) {
        int i = 2 % 2;
        if (resourceLoadExtension.isInPolling()) {
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
            tdsListRowV1View.setCenterText1(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_dual_comparison_title));
            tdsListRowV1View.setCenterText1Color(setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).ICustomTabsCallbackStubProxy());
            tdsListRowV1View.setCenterText2(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_checking_lowest_interest));
            tdsListRowV1View.setCenterText2Color(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.NONE);
            tdsListRowV1View.setOnClickListener((View.OnClickListener) null);
            tdsListRowV1View.setClickable(false);
            slidingRecyclerView.setVisibility(0);
            loanApplyBasicInfoView.setVisibility(8);
            tdsButtonV1View.setVisibility(0);
            tdsButtonV1View.setText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_check_out_polling_result));
            tdsButtonV1View.setButtonStyle(TdsButtonV1View.IAuthTabCallbackDefault.FILL);
            tdsButtonV1View.setButtonSize(TdsButtonV1View.onWarmupCompleted.LARGE);
            tdsButtonV1View.setButtonDisplay(TdsButtonV1View.IAuthTabCallback.BLOCK);
            tdsButtonV1View.setEnabled(true);
            tdsButtonV1View.setOnClickListener(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda0(loanRefinancingSummaryFailedFragment, z, resourceLoadExtension));
            return;
        }
        if (onwarmupcompleted.IAuthTabCallback() > 0) {
            String string = loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_able_conduct_from_number_of, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, new Object[]{DERSet.onExtraCallback}, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).intValue())});
            Intrinsics.checkNotNullExpressionValue(string, "");
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
            tdsListRowV1View.setCenterText1(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_dual_comparison_title));
            tdsListRowV1View.setCenterText1Color(setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).ICustomTabsCallbackStubProxy());
            tdsListRowV1View.setCenterText2(string);
            tdsListRowV1View.setCenterText2Color(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.NONE);
            tdsListRowV1View.setOnClickListener((View.OnClickListener) null);
            tdsListRowV1View.setClickable(false);
            slidingRecyclerView.setVisibility(8);
            loanApplyBasicInfoView.setVisibility(0);
            loanApplyBasicInfoView.setTextSettings(22.0f, setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).ICustomTabsCallbackStubProxy());
            float fOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
            long jOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
            String string2 = loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_string_min_interest);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_string_max_amount);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            loanApplyBasicInfoView.setByValues(fOnExtraCallbackWithResult, jOnWarmupCompleted, string2, string3, varyMatches.IAuthTabCallback(loanApplyBasicInfoView, 36), varyMatches.IAuthTabCallback(loanApplyBasicInfoView, 0));
            tdsButtonV1View.setVisibility(0);
            tdsButtonV1View.setText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_see_result));
            tdsButtonV1View.setButtonStyle(TdsButtonV1View.IAuthTabCallbackDefault.FILL);
            tdsButtonV1View.setButtonSize(TdsButtonV1View.onWarmupCompleted.LARGE);
            tdsButtonV1View.setButtonDisplay(TdsButtonV1View.IAuthTabCallback.BLOCK);
            tdsButtonV1View.setEnabled(true);
            tdsButtonV1View.setOnClickListener(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda1(loanRefinancingSummaryFailedFragment, z, resourceLoadExtension));
            return;
        }
        if (!(!resourceLoadExtension.isFailure())) {
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
            tdsListRowV1View.setCenterText1(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_dual_comparison_title));
            tdsListRowV1View.setCenterText1Color(setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).ICustomTabsCallbackStubProxy());
            if (!z) {
                tdsListRowV1View.setCenterText2(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_summary_title_failed));
                tdsListRowV1View.setCenterText2Color(setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).onPostMessage());
            } else {
                int i2 = onActivityResized + 119;
                onMinimized = i2 % 128;
                if (i2 % 2 != 0) {
                    tdsListRowV1View.setCenterText2((CharSequence) null);
                    int i3 = 88 / 0;
                } else {
                    tdsListRowV1View.setCenterText2((CharSequence) null);
                }
            }
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.BADGE);
            tdsListRowV1View.setRightBadgeText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_inquiry_failed));
            tdsListRowV1View.setRightBadgeTheme(new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.YELLOW, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL));
            tdsListRowV1View.setOnClickListener((View.OnClickListener) null);
            tdsListRowV1View.setClickable(false);
            tdsListRowV1View.setRightArrow(false);
            slidingRecyclerView.setVisibility(8);
            loanApplyBasicInfoView.setVisibility(8);
            if (!(!z)) {
                tdsButtonV1View.setVisibility(8);
                return;
            }
            tdsButtonV1View.setVisibility(0);
            tdsButtonV1View.setText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_string_re_inquiry));
            tdsButtonV1View.setButtonStyle(TdsButtonV1View.IAuthTabCallbackDefault.WEAK);
            tdsButtonV1View.setButtonSize(TdsButtonV1View.onWarmupCompleted.LARGE);
            tdsButtonV1View.setButtonDisplay(TdsButtonV1View.IAuthTabCallback.BLOCK);
            tdsButtonV1View.setEnabled(true);
            Object[] objArr = {tdsButtonV1View, ParamUtils.LONG, new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda2(loanRefinancingSummaryFailedFragment, resourceLoadExtension)};
            int i4 = onActivityResized + 9;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        tdsListRowV1View.setCenterText1(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinancing_dual_comparison_title));
        tdsListRowV1View.setCenterText1Color(setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).ICustomTabsCallbackStubProxy());
        tdsListRowV1View.setCenterText2(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_refinance_all_rejected));
        tdsListRowV1View.setCenterText2Color(setBodyokhttp.onExtraCallback(loanRefinancingSummaryFailedFragment).onPostMessage());
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.BADGE);
        tdsListRowV1View.setRightBadgeText(loanRefinancingSummaryFailedFragment.getString(im.toss.features.loan.ui.R.string.loan_impossible));
        tdsListRowV1View.setRightBadgeTheme(new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.ELEPHANT, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL));
        tdsListRowV1View.setOnClickListener(new LoanRefinancingSummaryFailedFragment$.ExternalSyntheticLambda3(loanRefinancingSummaryFailedFragment, z, resourceLoadExtension));
        tdsListRowV1View.setRightArrow(true);
        slidingRecyclerView.setVisibility(8);
        loanApplyBasicInfoView.setVisibility(8);
        tdsButtonV1View.setVisibility(8);
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -870513697, new Object[]{loanRefinancingSummaryFailedFragment, setDetectableSize}, iIAuthTabCallback, 870513710, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1750776908, new Object[]{loanRefinancingSummaryFailedFragment, resourceLoadExtension, setDetectableSize}, iIAuthTabCallback, -1750776902, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, String str, View view) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 865976532, new Object[]{loanRefinancingSummaryFailedFragment, str, view}, iIAuthTabCallback, -865976513, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, View view) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1275374519, new Object[]{loanRefinancingSummaryFailedFragment, view}, iIAuthTabCallback, -1275374512, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1425220927, new Object[]{view}, iIAuthTabCallback, -1425220925, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 2052309625, new Object[]{th}, iIAuthTabCallback, -2052309614, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1838112715, new Object[]{function1, obj}, iIAuthTabCallback, 1838112718, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static final /* synthetic */ Object IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, access13800 access13800Var) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 55216433, new Object[]{loanRefinancingSummaryFailedFragment, access13800Var}, iIAuthTabCallback, -55216415, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final void IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, View view) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 729576646, new Object[]{loanRefinancingSummaryFailedFragment, view}, iIAuthTabCallback, -729576629, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, ResourceLoadExtension resourceLoadExtension, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 900922663, new Object[]{loanRefinancingSummaryFailedFragment, resourceLoadExtension, setDetectableSize}, iIAuthTabCallback, -900922658, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void onNavigationEvent(String str, String str2, String str3) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 776204591, new Object[]{this, str, str2, str3}, iIAuthTabCallback, -776204587, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void onNavigationEvent(String str) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 892973697, new Object[]{this, str}, iIAuthTabCallback, -892973682, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, Long l) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1029269379, new Object[]{loanRefinancingSummaryFailedFragment, l}, iIAuthTabCallback, 1029269395, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final void onNavigationEvent(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 253685383, new Object[]{loanRefinancingSummaryFailedFragment}, iIAuthTabCallback, -253685374, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void onExtraCallbackWithResult(boolean z) {
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -959047135, new Object[]{this, Boolean.valueOf(z)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 959047136, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final void onTransact(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, View view) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1551867162, new Object[]{loanRefinancingSummaryFailedFragment, view}, iIAuthTabCallback, -1551867154, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(LoanRefinancingSummaryFailedFragment loanRefinancingSummaryFailedFragment, PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1969166082, new Object[]{loanRefinancingSummaryFailedFragment, priorityThreadFactoryExternalSyntheticLambda0}, iIAuthTabCallback, -1969166082, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -625343384, new Object[]{function1, obj}, iIAuthTabCallback, 625343396, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(Throwable th) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onExtraCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 328285397, new Object[]{th}, iIAuthTabCallback, -328285383, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    static void asInterface() {
        readTypedObject = new char[]{64991, 64984, 64926, 64924, 64977, 65018, 64979, 64967, 64971, 64981, 65013, 64978, 64986, 64960, 64982, 64983, 64980, 64925, 65064, 64987, 64989, 64966, 65023, 64985, 64988, 64903, 64964, 65010, 65065, 65067, 64905, 64963, 64961, 65004, 64990, 64976};
        extraCallback = (char) 51247;
        extraCallbackWithResult = new char[]{32538, 32534, 32530, 32535, 32712, 32723, 32737, 32537, 32743, 32732, 32531, 32541, 32540, 32539, 32726, 32522, 32733, 32736, 32543, 32740, 32542, 32742, 32521, 32741, 32528};
        writeTypedObject = -1184333950;
        onPostMessage = true;
        onActivityLayout = true;
    }
}
