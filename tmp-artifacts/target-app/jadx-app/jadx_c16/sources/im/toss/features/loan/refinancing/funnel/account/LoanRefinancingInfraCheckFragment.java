package im.toss.features.loan.refinancing.funnel.account;

import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.define.MobileCarrier;
import im.toss.features.loan.refinancing.data.RefinancingAccountState;
import im.toss.features.loan.refinancing.funnel.account.LoanRefinancingInfraCheckFragment$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.ACPayResult;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17;
import o.PageRenderReadyListener;
import o.PlayerErrorCode;
import o.PriorityThreadFactoryExternalSyntheticLambda0;
import o.RecomposerawaitIdle2;
import o.ResourceLoadExtension;
import o.RippleNode;
import o.RotationProvider1;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.accessgetProtocolp;
import o.addAllCommandLine;
import o.addExtra;
import o.checkDeviceBrand;
import o.clearWrite;
import o.deserializeUriNullableCollection;
import o.enableTabBarByAppId;
import o.extractDeviceStatFileForCpuLine;
import o.getDevNetworkType;
import o.getKekid;
import o.getSocketSession;
import o.getWrite;
import o.mergeParams;
import o.movePluginRefreshTimeToSp;
import o.onPageExit;
import o.onRenderReady;
import o.overrideEventDispatcher;
import o.preFillDefault;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0;
import o.response;
import o.setBaseTime;
import o.setBodyokhttp;
import o.startNativePerfMonitor;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.network.model.loan.LoanProductBadge;
import viva.republica.toss.network.model.loan.RefinancingAvailableTimeRange;
import viva.republica.toss.network.model.verify.SessionKnownType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingInfraCheckFragment extends Hilt_LoanRefinancingInfraCheckFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static long access000 = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallback;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private final Lazy asBinder;
    private final extractDeviceStatFileForCpuLine onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact;
    private int IAuthTabCallbackDefault = R.layout.activity_loan_recycler_cta;
    private final PageRenderReadyListener IAuthTabCallback = preFillDefault.IAuthTabCallback(this, onExtraCallback.onExtraCallback);

    static final /* synthetic */ class IAuthTabCallbackStub implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        IAuthTabCallbackStub(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                throw null;
            }
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i4 = i3 + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i6 = onExtraCallbackWithResult + 55;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i2 + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = getFunctionDelegate().hashCode();
                int i3 = 86 / 0;
            } else {
                iHashCode = getFunctionDelegate().hashCode();
            }
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onExtraCallbackWithResult + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
        }
    }

    static {
        IAuthTabCallbackStub();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingInfraCheckFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/ActivityLoanRecyclerCtaBinding;", 0)};
        onExtraCallback = 8;
        int i = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(getDevNetworkType getdevnetworktype) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = onExtraCallback(getdevnetworktype);
        int i4 = access100 + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallback;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = ~(i9 | i5);
        int i11 = ~((~i2) | i4);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i4 + i5 + i3 + ((-1232316077) * i) + ((-263306238) * i6);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i4) - 1785593856) + (933837065 * i5) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i3) + (1319895040 * i) + (1514668032 * i6) + (1334968320 * i15);
        int i17 = ((i4 * (-2046307327)) - 1888090795) + (i5 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i3 * (-2046307883)) + (i * 1526207759) + (i6 * (-1095616598)) + (i15 * 1719271424);
        switch (i16 + (i17 * i17 * 2111700992)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
                int i18 = 2 % 2;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "loan_comparison_verification_complete", false, (String) null, (List) null, (Map) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda14(), 30, (Object) null);
                loanRefinancingInfraCheckFragment.extraCallback().onExtraCallback("");
                loanRefinancingInfraCheckFragment.extraCallback().onNavigationEvent(Long.valueOf(loanRefinancingInfraCheckFragment.onPostMessage().IAuthTabCallbackDefault()));
                loanRefinancingInfraCheckFragment.access100().onTransact(true);
                RippleNode.onNavigationEvent(loanRefinancingInfraCheckFragment).onNavigationEvent(R.id.loanRefinancingRrnFragment);
                int i19 = IAuthTabCallback_Parcel + 63;
                access100 = i19 % 128;
                int i20 = i19 % 2;
                return null;
            case 10:
                return onTransact(objArr);
            case 11:
                return access000(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment2 = (LoanRefinancingInfraCheckFragment) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i21 = 2 % 2;
                int i22 = access100 + 21;
                IAuthTabCallback_Parcel = i22 % 128;
                int i23 = i22 % 2;
                startNativePerfMonitor startnativeperfmonitorPostMessage = loanRefinancingInfraCheckFragment2.postMessage();
                if (startnativeperfmonitorPostMessage == null) {
                    return null;
                }
                if (loanRefinancingInfraCheckFragment2.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                    int i24 = access100 + 51;
                    IAuthTabCallback_Parcel = i24 % 128;
                    int i25 = i24 % 2;
                    startnativeperfmonitorPostMessage.onExtraCallback.asInterface().setLoading(zBooleanValue);
                }
                return Unit.INSTANCE;
            case 14:
                return access100(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, setDetectableSize}, -1229420840, 1229420852, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = IAuthTabCallback_Parcel + 69;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(setDetectableSize);
            throw null;
        }
        Unit unitAsInterface = asInterface(setDetectableSize);
        int i3 = IAuthTabCallback_Parcel + 47;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        RefinancingAccountState refinancingAccountState = (RefinancingAccountState) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {loanRefinancingInfraCheckFragment, refinancingAccountState};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, objArr2, -51361996, 51362000, iIAuthTabCallback4);
        int i4 = access100 + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access100 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitReceiveFile = receiveFile();
        int i4 = access100 + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitReceiveFile;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setDetectableSize);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return requestPostMessageChannel();
        }
        requestPostMessageChannel();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onTransact(loanRefinancingInfraCheckFragment);
            throw null;
        }
        Unit unitOnTransact = onTransact(loanRefinancingInfraCheckFragment);
        int i3 = IAuthTabCallback_Parcel + 37;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback();
        int i4 = IAuthTabCallback_Parcel + 9;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return engagementSignalsCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(loanRefinancingInfraCheckFragment);
        int i4 = IAuthTabCallback_Parcel + 31;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, list, setDetectableSize}, 1896214426, -1896214411, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = access100 + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, Function0 function0, PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(loanRefinancingInfraCheckFragment, function0, priorityThreadFactoryExternalSyntheticLambda0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingInfraCheckFragment, function0, priorityThreadFactoryExternalSyntheticLambda0);
        int i3 = IAuthTabCallback_Parcel + 25;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 33 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingInfraCheckFragment, setDetectableSize);
        int i4 = access100 + 57;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setDetectableSize);
        int i4 = access100 + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingInfraCheckFragment, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallback_Parcel + 85;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(loanRefinancingInfraCheckFragment);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(loanRefinancingInfraCheckFragment);
        int i3 = IAuthTabCallback_Parcel + 71;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingInfraCheckFragment, view);
        int i4 = IAuthTabCallback_Parcel + 15;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingInfraCheckFragment, list);
        int i4 = access100 + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingInfraCheckFragment, list, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, th);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 61 / 0;
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(loanRefinancingInfraCheckFragment, setDetectableSize);
        int i4 = access100 + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, 1667886402, -1667886397, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i4 = IAuthTabCallback_Parcel + 7;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSession = newSession();
        int i4 = IAuthTabCallback_Parcel + 33;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitNewSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(loanRefinancingInfraCheckFragment);
        int i4 = IAuthTabCallback_Parcel + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingInfraCheckFragment, list);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 81;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public LoanRefinancingInfraCheckFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asBinder(new IAuthTabCallbackDefault(this)));
        this.asBinder = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanRefinancingAccountViewModel.class), new onTransact(lazyOnNavigationEvent), new asInterface(null, lazyOnNavigationEvent), new IAuthTabCallback_Parcel(this, lazyOnNavigationEvent));
        this.onExtraCallbackWithResult = new extractDeviceStatFileForCpuLine();
        this.onTransact = onPageExit.onNavigationEvent(this, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda0(this));
    }

    public static final /* synthetic */ void asBinder(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        loanRefinancingInfraCheckFragment.warmup();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingInfraCheckFragment.prefetchWithMultipleUrls();
        int i4 = IAuthTabCallback_Parcel + 11;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 15;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.IAuthTabCallbackDefault;
        int i5 = i2 + 85;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return i4;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, startNativePerfMonitor> {
        private static int IAuthTabCallback = 1;
        public static final onExtraCallback onExtraCallback = new onExtraCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        onExtraCallback() {
            super(1, startNativePerfMonitor.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/ActivityLoanRecyclerCtaBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            startNativePerfMonitor startnativeperfmonitorOnWarmupCompleted = onWarmupCompleted((View) obj);
            if (i3 != 0) {
                int i4 = 84 / 0;
            }
            int i5 = IAuthTabCallback + 9;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return startnativeperfmonitorOnWarmupCompleted;
        }

        public final startNativePerfMonitor onWarmupCompleted(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            startNativePerfMonitor startnativeperfmonitorOnExtraCallback = startNativePerfMonitor.onExtraCallback(view);
            int i4 = IAuthTabCallback + 41;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return startnativeperfmonitorOnExtraCallback;
        }
    }

    private final startNativePerfMonitor postMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        startNativePerfMonitor startnativeperfmonitorOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(this, onWarmupCompleted[0]);
        int i4 = access100 + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return startnativeperfmonitorOnNavigationEvent;
    }

    private final LoanRefinancingAccountViewModel newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingAccountViewModel loanRefinancingAccountViewModel = (LoanRefinancingAccountViewModel) this.asBinder.getValue();
        int i4 = access100 + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return loanRefinancingAccountViewModel;
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access100 + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            loanRefinancingInfraCheckFragment.onWarmupCompleted(iEngagementSignalsCallbackDefault);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        loanRefinancingInfraCheckFragment.onWarmupCompleted(iEngagementSignalsCallbackDefault);
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 113;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            newSessionWithExtras().onExtraCallback(access100());
            prefetch();
            newAuthTabSession();
            int i3 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            newSessionWithExtras().onExtraCallback(access100());
            prefetch();
            newAuthTabSession();
        }
        int i4 = IAuthTabCallback_Parcel + 81;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 25;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, TextUtils.getOffsetAfter("", 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (access000 ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59, 6384 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 119;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 59 - Drawable.resolveOpacity(0, 0), 6383 - (ViewConfiguration.getScrollBarSize() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public void onResume() {
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        startNativePerfMonitor startnativeperfmonitorPostMessage = postMessage();
        if (startnativeperfmonitorPostMessage != null) {
            int i4 = IAuthTabCallback_Parcel + 15;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            TdsBottomCtaV1View tdsBottomCtaV1View = startnativeperfmonitorPostMessage.onExtraCallback;
            if (i5 == 0) {
                throw null;
            }
            if (tdsBottomCtaV1View == null || (tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface()) == null) {
                return;
            }
            tdsButtonV1ViewAsInterface.setLoading(false);
        }
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.onNavigationEvent) {
            LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, false, (Intent) null, 3, (Object) null);
            int i3 = IAuthTabCallback_Parcel + 33;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 81 / 0;
                return;
            }
            return;
        }
        super.onExtraCallbackWithResult();
    }

    public void aZ_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        newSessionWithExtras().IAuthTabCallback();
        int i4 = access100 + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Unit prefetch() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        startNativePerfMonitor startnativeperfmonitorPostMessage = postMessage();
        if (startnativeperfmonitorPostMessage == null) {
            return null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = startnativeperfmonitorPostMessage.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        RecyclerView recyclerView = startnativeperfmonitorPostMessage.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, recyclerView, false, 0, 6, (Object) null);
        RecyclerView recyclerView2 = startnativeperfmonitorPostMessage.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), 0);
        startnativeperfmonitorPostMessage.onNavigationEvent.setLayoutManager(new LinearLayoutManager(requireContext()));
        startnativeperfmonitorPostMessage.onNavigationEvent.setAdapter(this.onExtraCallbackWithResult);
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(onWarmupCompleted(this, null, 1, null));
        this.onExtraCallbackWithResult.notifyDataSetChanged();
        startnativeperfmonitorPostMessage.onExtraCallbackWithResult.setBackgroundColor(accessgetProtocolp.onNavigationEvent(this).onWarmupCompleted());
        FrameLayout frameLayout = startnativeperfmonitorPostMessage.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<Fragment> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnNavigationEvent = onNavigationEvent();
            if (i3 == 0) {
                int i4 = 15 / 0;
            }
            return fragmentOnNavigationEvent;
        }

        public final Fragment onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Fragment fragment = this.$this_viewModels;
            int i4 = i3 + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return fragment;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        RefinancingAccountState refinancingAccountState = (RefinancingAccountState) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(refinancingAccountState);
        if (i3 == 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, refinancingAccountState}, 1945020437, -1945020427, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            return Unit.INSTANCE;
        }
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback4, new Object[]{loanRefinancingInfraCheckFragment, refinancingAccountState}, 1945020437, -1945020427, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void newAuthTabSession() {
        int i = 2 % 2;
        newSessionWithExtras().onExtraCallback().observe(getViewLifecycleOwner(), new IAuthTabCallbackStub(new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda10(this)));
        int i2 = access100 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class asBinder extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallback + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List onWarmupCompleted(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = access100 + 125;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                RefinancingAccountState refinancingAccountStateWriteTypedObject = loanRefinancingInfraCheckFragment.access100().writeTypedObject();
                if (refinancingAccountStateWriteTypedObject == null || (list = refinancingAccountStateWriteTypedObject.onExtraCallbackWithResult()) == null) {
                    list = CollectionsKt.emptyList();
                    int i4 = IAuthTabCallback_Parcel + 7;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                loanRefinancingInfraCheckFragment.access100().writeTypedObject();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        return loanRefinancingInfraCheckFragment.IAuthTabCallback((List<getDevNetworkType>) list);
    }

    public static final class IAuthTabCallback_Parcel extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback_Parcel(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate) instanceof TextFieldKeyInputExternalSyntheticLambda6;
                throw null;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            if (textFieldKeyInputExternalSyntheticLambda6 == null || (defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory()) == null) {
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                int i3 = onExtraCallback + 77;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return defaultViewModelProviderFactory2;
                }
                throw null;
            }
            int i4 = onExtraCallback + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return defaultViewModelProviderFactory;
            }
            throw null;
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback();
            }
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                int i4 = IAuthTabCallback + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            }
            return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public static final class onTransact extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (i3 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent.getViewModelStore();
            }
            int i4 = 55 / 0;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent.getViewModelStore();
        }
    }

    private static final Unit onWarmupCompleted(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, SetDetectableSize setDetectableSize) throws Throwable {
        String strIntern;
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{35830, 14616, 60944, 37642, 16402, 62763, 47671, 28473}, (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)) * 45816, objArr);
            strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = {loanRefinancingInfraCheckFragment.access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr2);
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr3 = new Object[1];
            a(new char[]{35830, 14616, 60944, 37642, 16402, 62763, 47671, 28473}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 45816, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = {loanRefinancingInfraCheckFragment.access100()};
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent4, objArr4);
        }
        setDetectableSize.onExtraCallback(strIntern, (String) objOnExtraCallback);
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 1;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        String strIntern;
        Object objOnExtraCallback;
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{35830, 14616, 60944, 37642, 16402, 62763, 47671, 28473}, (ViewConfiguration.getMaximumFlingVelocity() / 71) * 45817, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = {loanRefinancingInfraCheckFragment.access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr3);
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr4 = new Object[1];
            a(new char[]{35830, 14616, 60944, 37642, 16402, 62763, 47671, 28473}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45817, objArr4);
            strIntern = ((String) objArr4[0]).intern();
            Object[] objArr5 = {loanRefinancingInfraCheckFragment.access100()};
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent4, objArr5);
        }
        setDetectableSize.onExtraCallback(strIntern, (String) objOnExtraCallback);
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return unit;
    }

    private final List<Object> IAuthTabCallback(List<getDevNetworkType> list) throws Throwable {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                List<getDevNetworkType> listEmptyList = (List) linkedHashMap.get("refinancables");
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List<getDevNetworkType> listEmptyList2 = (List) linkedHashMap.get("timeouts");
                if (listEmptyList2 == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                List<getDevNetworkType> listEmptyList3 = (List) linkedHashMap.get("others");
                if (listEmptyList3 == null) {
                    listEmptyList3 = CollectionsKt.emptyList();
                }
                this.onNavigationEvent = listEmptyList.isEmpty();
                if (listEmptyList.isEmpty()) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251651L, false, (String) null, (Map) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda4(this), 14, (Object) null);
                    onNavigationEvent(arrayList, listEmptyList2, listEmptyList3);
                    validateRelationship();
                } else {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251673L, false, (String) null, (Map) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda3(this), 14, (Object) null);
                    onExtraCallback(arrayList, listEmptyList, listEmptyList2, listEmptyList3);
                    ICustomTabsServiceStub();
                }
                arrayList.add(new setBaseTime.newSessionWithExtras(40.0f));
                return arrayList;
            }
            int i2 = IAuthTabCallback_Parcel + 27;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                ((getDevNetworkType) it.next()).access000();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            getDevNetworkType getdevnetworktype = (getDevNetworkType) next;
            String str = !(getdevnetworktype.access000() ^ true) ? onNavigationEvent(getdevnetworktype) ? "timeouts" : "refinancables" : "others";
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
                int i3 = access100 + 71;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 2;
                }
            }
            ((List) arrayList2).add(next);
        }
    }

    private final Unit ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            postMessage();
            throw null;
        }
        startNativePerfMonitor startnativeperfmonitorPostMessage = postMessage();
        if (startnativeperfmonitorPostMessage == null) {
            return null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = startnativeperfmonitorPostMessage.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        tdsBottomCtaV1View.setVisibility(0);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = startnativeperfmonitorPostMessage.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, viva.republica.toss.R.string.next, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda20(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        BaseTextView baseTextViewExtraCallbackWithResult = startnativeperfmonitorPostMessage.onExtraCallback.extraCallbackWithResult();
        if (baseTextViewExtraCallbackWithResult != null) {
            int i3 = IAuthTabCallback_Parcel + 97;
            access100 = i3 % 128;
            baseTextViewExtraCallbackWithResult.setVisibility(i3 % 2 == 0 ? 100 : 8);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 61;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, View view) {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251679L, false, (String) null, (Map) null, (Function1) null, 117, (Object) null);
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            objIAuthTabCallback = IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, false}, 491985985, -491985972, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251679L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            objIAuthTabCallback = IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback4, new Object[]{loanRefinancingInfraCheckFragment, true}, 491985985, -491985972, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        }
        loanRefinancingInfraCheckFragment.isEngagementSignalsApiAvailable();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r1 = im.toss.features.loan.refinancing.funnel.account.LoanRefinancingInfraCheckFragment.IAuthTabCallback_Parcel + 79;
        im.toss.features.loan.refinancing.funnel.account.LoanRefinancingInfraCheckFragment.access100 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = r1.onExtraCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0.setVisibility(8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Unit validateRelationship() {
        startNativePerfMonitor startnativeperfmonitorPostMessage;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            startnativeperfmonitorPostMessage = postMessage();
            int i3 = 3 / 0;
        } else {
            startnativeperfmonitorPostMessage = postMessage();
        }
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        startNativePerfMonitor startnativeperfmonitorPostMessage = postMessage();
        if (startnativeperfmonitorPostMessage != null) {
            int i2 = access100 + 83;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            FrameLayout frameLayout = startnativeperfmonitorPostMessage.onExtraCallbackWithResult;
            if (frameLayout != null) {
                int i4 = IAuthTabCallback_Parcel + 29;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                frameLayout.setVisibility(0);
                int i6 = access100 + 45;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (access100().prefetchWithMultipleUrls()) {
            int i8 = IAuthTabCallback_Parcel + 41;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingJobInputFragment);
            return;
        }
        if (!(!access100().requestPostMessageChannel())) {
            RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingRrnFragment);
            return;
        }
        IAuthTabCallbackDefault();
        int i10 = IAuthTabCallback_Parcel + 109;
        access100 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 53 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        RefinancingAccountState refinancingAccountState = (RefinancingAccountState) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingInfraCheckFragment.onExtraCallbackWithResult.onExtraCallbackWithResult(loanRefinancingInfraCheckFragment.IAuthTabCallback(refinancingAccountState.onExtraCallbackWithResult()));
        loanRefinancingInfraCheckFragment.onExtraCallbackWithResult.notifyDataSetChanged();
        int i4 = IAuthTabCallback_Parcel + 111;
        access100 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("list_type", "minus");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 83;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void warmup() {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1256977L, false, (String) null, (Map) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda2(), 14, (Object) null);
        RippleNode.onNavigationEvent(this).onWarmupCompleted(R.id.loanRefinancingInvalidAccountsFragment, RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("otherLoans", Boolean.FALSE)}));
        int i2 = IAuthTabCallback_Parcel + 37;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("list_type", "another");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("list_type", "another");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void prefetchWithMultipleUrls() {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1256977L, false, (String) null, (Map) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda24(), 14, (Object) null);
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingInvalidAccountsFragment);
        int i2 = IAuthTabCallback_Parcel + 87;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(List<getDevNetworkType> list) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251977L, false, (String) null, (Map) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda21(this, list), 14, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 45;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
    }

    private static final Unit onWarmupCompleted(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list, SetDetectableSize setDetectableSize) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i2 = R.string.loan_comparison_banner_subtitle_1;
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingInfraCheckFragment.getString(i2, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingInfraCheckFragment.getString(R.string.loan_comparison_banner_title_1));
        if (list.isEmpty()) {
            int i3 = access100 + 17;
            IAuthTabCallback_Parcel = i3 % 128;
            str = "no-loans";
            if (i3 % 2 != 0) {
                int i4 = 59 / 0;
            }
        } else {
            str = "non-refinancable";
            int i5 = IAuthTabCallback_Parcel + 107;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        setDetectableSize.onExtraCallback("case", str);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        String str;
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        List list = (List) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingInfraCheckFragment.getString(R.string.loan_comparison_banner_subtitle_1, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, new Object[]{DERSet.onExtraCallback}, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).intValue())}));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingInfraCheckFragment.getString(R.string.loan_comparison_banner_title_1));
        if (!list.isEmpty()) {
            int i4 = access100 + 43;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 3;
            }
            str = "non-refinancable";
        } else {
            str = "no-loans";
        }
        setDetectableSize.onExtraCallback("case", str);
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(List<getDevNetworkType> list) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251653L, false, (String) null, (Map) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda1(this, list), 14, (Object) null);
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(iOnWarmupCompleted2, -1113360422, 1113360436, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted3, new Object[]{this, "refinancing_loan__unable_check_my_loan"});
        int i2 = access100 + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onTransact(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("case", "refinancable");
            setDetectableSize.onExtraCallback("banner_title", loanRefinancingInfraCheckFragment.getString(R.string.loan_connect_my_loan));
            setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingInfraCheckFragment.getString(R.string.loan_question_has_other_loan));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("case", "refinancable");
        setDetectableSize.onExtraCallback("banner_title", loanRefinancingInfraCheckFragment.getString(R.string.loan_connect_my_loan));
        setDetectableSize.onExtraCallback("banner_subtitle", loanRefinancingInfraCheckFragment.getString(R.string.loan_question_has_other_loan));
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 73;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        List listOnNavigationEvent;
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251675L, false, (String) null, (Map) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda25(loanRefinancingInfraCheckFragment), 14, (Object) null);
        RefinancingAccountState refinancingAccountStateWriteTypedObject = loanRefinancingInfraCheckFragment.access100().writeTypedObject();
        if (refinancingAccountStateWriteTypedObject != null) {
            int i2 = IAuthTabCallback_Parcel + 125;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                listOnNavigationEvent = refinancingAccountStateWriteTypedObject.onNavigationEvent();
                int i3 = 34 / 0;
            } else {
                listOnNavigationEvent = refinancingAccountStateWriteTypedObject.onNavigationEvent();
            }
        } else {
            listOnNavigationEvent = null;
        }
        List list = listOnNavigationEvent;
        if (list != null) {
            int i4 = IAuthTabCallback_Parcel + 115;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            if (!list.isEmpty()) {
                Object[] objArr2 = {loanRefinancingInfraCheckFragment, CollectionsKt.joinToString$default(listOnNavigationEvent, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda26(), 30, (Object) null), str, false, 4, null};
                LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1046567755, 1046567768, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr2);
                return null;
            }
        }
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1046567755, 1046567768, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{loanRefinancingInfraCheckFragment, null, str, false, 5, null});
        return null;
    }

    private static final CharSequence onExtraCallback(getDevNetworkType getdevnetworktype) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getdevnetworktype, "");
        String strIAuthTabCallback_Parcel = getdevnetworktype.IAuthTabCallback_Parcel();
        int i4 = access100 + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback_Parcel;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        onExtraCallbackWithResult(Object obj) {
            super(0, obj, LoanRefinancingInfraCheckFragment.class, "onTimeoutLoanBannerClick", "onTimeoutLoanBannerClick()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingInfraCheckFragment.asBinder((LoanRefinancingInfraCheckFragment) ((CallableReference) this).receiver);
            int i4 = onWarmupCompleted + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 115;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        IAuthTabCallback(Object obj) {
            super(0, obj, LoanRefinancingInfraCheckFragment.class, "onOtherLoanBannerClick", "onOtherLoanBannerClick()V", 0);
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingInfraCheckFragment.onNavigationEvent((LoanRefinancingInfraCheckFragment) ((CallableReference) this).receiver);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit receiveFile() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 1;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return unit2;
    }

    private final void onExtraCallback(List<Object> list, List<getDevNetworkType> list2, List<getDevNetworkType> list3, List<getDevNetworkType> list4) throws Throwable {
        int i = 2 % 2;
        String string = getString(R.string.loan_refinancing_will_find_better_result);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        list.add(new setBaseTime.extraCommand(mergeParams.IAuthTabCallback(string, contextRequireContext), getString(R.string.loan_refinancing_available_loans_subtitle), (TdsTopV1View.onExtraCallbackWithResult) null, (response) null, (response) null, (TdsTopV1View.onNavigationEvent) null, 16.0f, 60, (DefaultConstructorMarker) null));
        String string2 = getString(R.string.loan_refinancing_user_credit_loan, new Object[]{PlayerErrorCode.onPostMessage()});
        Intrinsics.checkNotNullExpressionValue(string2, "");
        list.add(new setBaseTime.extraCallbackWithResult(string2, (TdsTopV1View.onExtraCallbackWithResult) null, (String) null, 0, 0L, (String) null, (Function0) null, (Function0) null, 254, (DefaultConstructorMarker) null));
        for (getDevNetworkType getdevnetworktype : list2) {
            String strOnTransact = getdevnetworktype.onTransact();
            String strOnNavigationEvent = getdevnetworktype.onNavigationEvent();
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            list.add(new setBaseTime.onMinimized(strOnTransact, strOnNavigationEvent, (String) getDevNetworkType.IAuthTabCallback(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), iOnWarmupCompleted, -1613899008, 1613899009, new Object[]{getdevnetworktype}), 0, 0, false, (LoanProductBadge) null, 0.0f, (String) null, (TdsListRowV1View.asBinder) null, 0, (Function0) null, (Function0) null, 8184, (DefaultConstructorMarker) null));
            int i2 = IAuthTabCallback_Parcel + 19;
            access100 = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!list3.isEmpty()) {
            TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW2C;
            String string3 = getString(R.string.loan_refinancing_timeout_loan_count, new Object[]{Integer.valueOf(list3.size())});
            int i4 = R.string.loan_refinancing_timeout_time;
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            String string4 = getString(i4, new Object[]{Integer.valueOf(((Integer) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this, list3}, 1099717574, -1099717560, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue())});
            int iICustomTabsCallbackStubProxy = setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy();
            int iOnPostMessage = setBodyokhttp.onExtraCallback(this).onPostMessage();
            onExtraCallbackWithResult onextracallbackwithresult2 = new onExtraCallbackWithResult(this);
            Object[] objArr = new Object[1];
            a(new char[]{35820, 12441, 64802, 47567, 26195, 8883, 61405, 38004, 20671, 7489, 55807, 34419, 17153, 4018, 46100, 28887, 15739, 64014, 42645, 25441, 12249, 54388, 37037, 23938, 6719, 50858, 33600, 20452, 62679, 45329, 32164, 14932, 59019, 41785, 26638, 5360, 53545, 40394, 23165, 1813, 50113, 34868, 13533, 61764, 48615, 31364, 10036, 58295, 43033, 21756, 4458, 56842, 39586, 18253, 908, 51323, 29970, 12674}, 47976 - ImageFormat.getBitsPerPixel(0), objArr);
            list.add(new setBaseTime.writeTypedObject(onextracallbackwithresult, ((String) objArr[0]).intern(), 0, (RecomposerawaitIdle2.onNavigationEvent) null, string3, iICustomTabsCallbackStubProxy, string4, iOnPostMessage, true, (TdsListRowV1View.asBinder) null, (String) null, 0, 0, 0.0f, false, (TdsButtonV1View.asInterface) null, (TdsBadgeV1View.onExtraCallbackWithResult) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda11(), (Function0) null, false, (Function0) null, onextracallbackwithresult2, 1965580, (DefaultConstructorMarker) null));
        }
        if (!list4.isEmpty()) {
            TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult3 = TdsListRowV1View.onExtraCallbackWithResult.ROW1C;
            String string5 = getString(R.string.loan_refinancing_not_credit_loan, new Object[]{Integer.valueOf(list4.size())});
            TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.ROW1A;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this);
            Object[] objArr2 = new Object[1];
            a(new char[]{35820, 12441, 64802, 47567, 26195, 8883, 61405, 38004, 20671, 7489, 55807, 34419, 17153, 4018, 46100, 28887, 15739, 64014, 42645, 25441, 12249, 54388, 37037, 23938, 6719, 50858, 33600, 20452, 62679, 45329, 32164, 14932, 59019, 41785, 26638, 5360, 53545, 40394, 23165, 1813, 50113, 34868, 13533, 61764, 48615, 31364, 10036, 58295, 43033, 21756, 4458, 56842, 39586, 18253, 908, 51323, 29970, 12674}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47977, objArr2);
            list.add(new setBaseTime.writeTypedObject(onextracallbackwithresult3, ((String) objArr2[0]).intern(), 0, (RecomposerawaitIdle2.onNavigationEvent) null, string5, 0, (String) null, 0, true, asbinder, (String) null, 0, 0, 0.0f, false, (TdsButtonV1View.asInterface) null, (TdsBadgeV1View.onExtraCallbackWithResult) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda12(), (Function0) null, false, (Function0) null, iAuthTabCallback, 1965292, (DefaultConstructorMarker) null));
        }
        list.add(new setBaseTime.newSessionWithExtras(8.0f));
        list.add(new setBaseTime.onWarmupCompleted(1.0f));
        String string6 = getString(R.string.loan_question_has_other_loan);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        String string7 = getString(R.string.loan_connect_my_loan);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda13(this);
        Object[] objArr3 = new Object[1];
        a(new char[]{35820, 4609, 47122, 17959, 60467, 35339, 4109, 48700, 17535, 57993, 34959, 5803, 48289, 23258, 57476, 36591, 5371, 45814, 22789, 59209, 36153, 11052, 45341, 24394, 58751, 33634, 10640, 47004, 24055, 64441, 33236, 12236, 46475, 21409, 63998, 32856, 11785, 46130, 21037, 63581, 34305, 11373, 51810, 20618, 65179, 34039, 8890, 51413, 22227}, View.combineMeasuredStates(0, 0) + 39409, objArr3);
        list.add(new setBaseTime.onMinimized(((String) objArr3[0]).intern(), string6, string7, 0, 0, false, (LoanProductBadge) null, 16.0f, (String) null, (TdsListRowV1View.asBinder) null, 0, (Function0) null, externalSyntheticLambda13, 3960, (DefaultConstructorMarker) null));
        int i5 = access100 + 19;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
    }

    private static final Unit IAuthTabCallbackStub(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {loanRefinancingInfraCheckFragment, "refinancing_loan__check_my_loan"};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            IAuthTabCallback(iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, objArr, -213526199, 213526210, iIAuthTabCallback4);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        IAuthTabCallback(iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, objArr, -213526199, 213526210, iIAuthTabCallback4);
        Unit unit2 = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 5;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        onNavigationEvent(Object obj) {
            super(0, obj, LoanRefinancingInfraCheckFragment.class, "onTimeoutLoanBannerClick", "onTimeoutLoanBannerClick()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 121;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) ((CallableReference) this).receiver;
            if (i3 == 0) {
                LoanRefinancingInfraCheckFragment.asBinder(loanRefinancingInfraCheckFragment);
            } else {
                LoanRefinancingInfraCheckFragment.asBinder(loanRefinancingInfraCheckFragment);
                throw null;
            }
        }
    }

    private static final Unit newSession() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return unit;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onWarmupCompleted(Object obj) {
            super(0, obj, LoanRefinancingInfraCheckFragment.class, "onOtherLoanBannerClick", "onOtherLoanBannerClick()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingInfraCheckFragment.onNavigationEvent((LoanRefinancingInfraCheckFragment) ((CallableReference) this).receiver);
            int i4 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 73;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, "refinancing_loan__unable_check_my_loan"}, -213526199, 213526210, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 67;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void onNavigationEvent(List<Object> list, List<getDevNetworkType> list2, List<getDevNetworkType> list3) throws Throwable {
        int i = 2 % 2;
        String string = getString(R.string.loan_no_credit_loan_to_refinance);
        Intrinsics.checkNotNullExpressionValue(string, "");
        list.add(new setBaseTime.extraCommand(string, getString(R.string.loan_refinancing_available_loans_subtitle), (TdsTopV1View.onExtraCallbackWithResult) null, (response) null, (response) null, (TdsTopV1View.onNavigationEvent) null, 0.0f, 124, (DefaultConstructorMarker) null));
        if (!list2.isEmpty()) {
            TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW2C;
            String string2 = getString(R.string.loan_refinancing_timeout_loan_count, new Object[]{Integer.valueOf(list2.size())});
            int i2 = R.string.loan_refinancing_timeout_time;
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            String string3 = getString(i2, new Object[]{Integer.valueOf(((Integer) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this, list2}, 1099717574, -1099717560, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue())});
            int iICustomTabsCallbackStubProxy = setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy();
            int iOnPostMessage = setBodyokhttp.onExtraCallback(this).onPostMessage();
            onNavigationEvent onnavigationevent = new onNavigationEvent(this);
            Object[] objArr = new Object[1];
            a(new char[]{35820, 12441, 64802, 47567, 26195, 8883, 61405, 38004, 20671, 7489, 55807, 34419, 17153, 4018, 46100, 28887, 15739, 64014, 42645, 25441, 12249, 54388, 37037, 23938, 6719, 50858, 33600, 20452, 62679, 45329, 32164, 14932, 59019, 41785, 26638, 5360, 53545, 40394, 23165, 1813, 50113, 34868, 13533, 61764, 48615, 31364, 10036, 58295, 43033, 21756, 4458, 56842, 39586, 18253, 908, 51323, 29970, 12674}, View.MeasureSpec.makeMeasureSpec(0, 0) + 47977, objArr);
            list.add(new setBaseTime.writeTypedObject(onextracallbackwithresult, ((String) objArr[0]).intern(), 0, (RecomposerawaitIdle2.onNavigationEvent) null, string2, iICustomTabsCallbackStubProxy, string3, iOnPostMessage, true, (TdsListRowV1View.asBinder) null, (String) null, 0, 0, 0.0f, false, (TdsButtonV1View.asInterface) null, (TdsBadgeV1View.onExtraCallbackWithResult) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda5(), (Function0) null, false, (Function0) null, onnavigationevent, 1965580, (DefaultConstructorMarker) null));
            int i3 = access100 + 81;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!list3.isEmpty()) {
            TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult2 = TdsListRowV1View.onExtraCallbackWithResult.ROW1C;
            String string4 = getString(R.string.loan_refinancing_not_credit_loan, new Object[]{Integer.valueOf(list3.size())});
            TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.ROW1A;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this);
            Object[] objArr2 = new Object[1];
            a(new char[]{35820, 12441, 64802, 47567, 26195, 8883, 61405, 38004, 20671, 7489, 55807, 34419, 17153, 4018, 46100, 28887, 15739, 64014, 42645, 25441, 12249, 54388, 37037, 23938, 6719, 50858, 33600, 20452, 62679, 45329, 32164, 14932, 59019, 41785, 26638, 5360, 53545, 40394, 23165, 1813, 50113, 34868, 13533, 61764, 48615, 31364, 10036, 58295, 43033, 21756, 4458, 56842, 39586, 18253, 908, 51323, 29970, 12674}, 47977 - (Process.myTid() >> 22), objArr2);
            list.add(new setBaseTime.writeTypedObject(onextracallbackwithresult2, ((String) objArr2[0]).intern(), 0, (RecomposerawaitIdle2.onNavigationEvent) null, string4, 0, (String) null, 0, true, asbinder, (String) null, 0, 0, 0.0f, false, (TdsButtonV1View.asInterface) null, (TdsBadgeV1View.onExtraCallbackWithResult) null, new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda6(), (Function0) null, false, (Function0) null, onwarmupcompleted, 1965292, (DefaultConstructorMarker) null));
        }
        list.add(new setBaseTime.newSessionWithExtras(8.0f));
        list.add(setBaseTime.IAuthTabCallback.onExtraCallbackWithResult);
        String string5 = getString(R.string.loan_question_has_other_loan);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = getString(R.string.loan_connect_my_loan);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda7(this);
        Object[] objArr3 = new Object[1];
        a(new char[]{35820, 4609, 47122, 17959, 60467, 35339, 4109, 48700, 17535, 57993, 34959, 5803, 48289, 23258, 57476, 36591, 5371, 45814, 22789, 59209, 36153, 11052, 45341, 24394, 58751, 33634, 10640, 47004, 24055, 64441, 33236, 12236, 46475, 21409, 63998, 32856, 11785, 46130, 21037, 63581, 34305, 11373, 51810, 20618, 65179, 34039, 8890, 51413, 22227}, 39409 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        list.add(new setBaseTime.onMinimized(((String) objArr3[0]).intern(), string5, string6, 0, 0, false, (LoanProductBadge) null, 16.0f, (String) null, (TdsListRowV1View.asBinder) null, 0, (Function0) null, externalSyntheticLambda7, 3960, (DefaultConstructorMarker) null));
        list.add(new setBaseTime.newSessionWithExtras(4.0f));
        list.add(new setBaseTime.onWarmupCompleted(16.0f));
        String string7 = getString(R.string.loan_comparison_banner_title_1);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        int i5 = R.string.loan_comparison_banner_subtitle_1;
        Object[] objArr4 = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        String string8 = getString(i5, new Object[]{Integer.valueOf(((Integer) DERSet.onExtraCallback(-322008132, objArr4, 322008172, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).intValue())});
        Intrinsics.checkNotNullExpressionValue(string8, "");
        LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda8(this, list3);
        LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda9(this, list3);
        Object[] objArr5 = new Object[1];
        a(new char[]{35820, 30051, 30422, 28749, 29115, 29537, 31961, 32174, 32623, 30939, 31323, 31649, 25865, 26256, 26528, 24941, 25307, 27700, 28065, 28483, 26769, 27110, 27401, 21720, 22063, 22448, 20740, 21110, 21439, 23891, 24272, 22574, 22987, 23363, 17530, 17842, 18241, 16600, 16953, 17295, 19793, 20066, 20469, 18779, 19109, 13354, 13763, 14107, 12405, 12736, 13087, 15530, 15914, 16270, 14563, 14975, 15233, 9565, 9891, 8194, 8670, 8947, 11376, 11726}, AndroidCharacter.getMirror('0') + 65123, objArr5);
        list.add(new setBaseTime.onMinimized(((String) objArr5[0]).intern(), string7, string8, 0, 0, true, (LoanProductBadge) null, 16.0f, (String) null, (TdsListRowV1View.asBinder) null, 0, externalSyntheticLambda8, externalSyntheticLambda9, 1880, (DefaultConstructorMarker) null));
    }

    private static final Unit onNavigationEvent(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list) {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingInfraCheckFragment.onNavigationEvent((List<getDevNetworkType>) list);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 29;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingInfraCheckFragment.onWarmupCompleted((List<getDevNetworkType>) list);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[PHI: r1 r4 r5 r6 r7 r8
      0x0060: PHI (r1v9 o.overrideEventDispatcher) = (r1v4 o.overrideEventDispatcher), (r1v10 o.overrideEventDispatcher) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r4v4 android.content.Context) = (r4v0 android.content.Context), (r4v5 android.content.Context) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r5v5 java.lang.String) = (r5v1 java.lang.String), (r5v7 java.lang.String) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r7v4 o.PlayerErrorCode) = (r7v0 o.PlayerErrorCode), (r7v5 o.PlayerErrorCode) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r8v6 java.lang.String) = (r8v0 java.lang.String), (r8v8 java.lang.String) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[PHI: r1 r4 r5 r6 r7
      0x004b: PHI (r1v5 o.overrideEventDispatcher) = (r1v4 o.overrideEventDispatcher), (r1v10 o.overrideEventDispatcher) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r4v1 android.content.Context) = (r4v0 android.content.Context), (r4v5 android.content.Context) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v7 java.lang.String) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r7v1 o.PlayerErrorCode) = (r7v0 o.PlayerErrorCode), (r7v5 o.PlayerErrorCode) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallbackDefault() {
        overrideEventDispatcher overrideeventdispatcher;
        Context contextRequireContext;
        String strName;
        String strOnPostMessage;
        PlayerErrorCode playerErrorCode;
        String strICustomTabsCallback;
        overrideEventDispatcher overrideeventdispatcher2;
        String str;
        Context context;
        String str2;
        String str3;
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
            contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            strName = SessionKnownType.CHANGE_USER_CERTIFICATION_OWN_PHONE_ONLY.name();
            strOnPostMessage = PlayerErrorCode.onPostMessage();
            playerErrorCode = PlayerErrorCode.onWarmupCompleted;
            strICustomTabsCallback = addExtra.ICustomTabsCallback(playerErrorCode);
            int i3 = 61 / 0;
            if (strICustomTabsCallback == null) {
                int i4 = access100 + 19;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 93 / 0;
                }
                overrideeventdispatcher2 = overrideeventdispatcher;
                str = "";
                context = contextRequireContext;
                str2 = strName;
                str3 = strOnPostMessage;
            } else {
                context = contextRequireContext;
                str2 = strName;
                str3 = strOnPostMessage;
                str = strICustomTabsCallback;
                overrideeventdispatcher2 = overrideeventdispatcher;
            }
        } else {
            overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
            contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            strName = SessionKnownType.CHANGE_USER_CERTIFICATION_OWN_PHONE_ONLY.name();
            strOnPostMessage = PlayerErrorCode.onPostMessage();
            playerErrorCode = PlayerErrorCode.onWarmupCompleted;
            strICustomTabsCallback = addExtra.ICustomTabsCallback(playerErrorCode);
            if (strICustomTabsCallback == null) {
            }
        }
        String strOnMessageChannelReady = addExtra.onMessageChannelReady(playerErrorCode);
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        String str4 = (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent4 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        MobileCarrier mobileCarrier = (MobileCarrier) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1620982563, iOnNavigationEvent4, iOnNavigationEvent3, 1620982568, new Object[]{playerErrorCode}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        Object[] objArr = {access100()};
        int iOnNavigationEvent5 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent6 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        this.onTransact.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher2, context, str2, "SV-REL", (checkDeviceBrand) null, (String) null, true, str3, str4, mobileCarrier, str, strOnMessageChannelReady, true, true, false, (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent5, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent6, objArr), "refinancing_loan_comparison", (String) null, false, (Boolean) null, false, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, false, updateRuntimeShadowNodeReferencesOnCommit.TOP, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -604037096, 127, (Object) null));
    }

    private final void onWarmupCompleted(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        FrameLayout frameLayout;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            startNativePerfMonitor startnativeperfmonitorPostMessage = postMessage();
            if (startnativeperfmonitorPostMessage != null && (frameLayout = startnativeperfmonitorPostMessage.onExtraCallbackWithResult) != null) {
                frameLayout.setVisibility(8);
            }
            if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
                int i3 = IAuthTabCallback_Parcel + 45;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this}, -2016376587, 2016376596, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            } else {
                IAuthTabCallback(iEngagementSignalsCallbackDefault);
            }
            return;
        }
        postMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("category", "loan_comparison_examine");
            unit = Unit.INSTANCE;
            int i3 = 8 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("category", "loan_comparison_examine");
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback_Parcel + 117;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IAuthTabCallback(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        String stringExtra;
        int i = 2 % 2;
        Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
        String str = null;
        if (intentOnExtraCallbackWithResult != null) {
            int i2 = access100 + 35;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                stringExtra = intentOnExtraCallbackWithResult.getStringExtra("extra_toast_message");
                int i3 = 63 / 0;
            } else {
                stringExtra = intentOnExtraCallbackWithResult.getStringExtra("extra_toast_message");
            }
        } else {
            stringExtra = null;
        }
        if (stringExtra == null) {
            int i4 = access100 + 45;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            int i5 = access100 + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str = stringExtra;
        }
        if (str != null) {
            int i6 = IAuthTabCallback_Parcel + 23;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            onRenderReady.onExtraCallbackWithResult(this, str);
            if (i7 == 0) {
                int i8 = 47 / 0;
            }
        }
        int i9 = IAuthTabCallback_Parcel + 113;
        access100 = i9 % 128;
        int i10 = i9 % 2;
    }

    private final boolean onNavigationEvent(getDevNetworkType getdevnetworktype) {
        int i = 2 % 2;
        Calendar calendarIAuthTabCallback = null;
        if (access100().newAuthTabSession()) {
            int i2 = access100 + 23;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            calendarIAuthTabCallback.hashCode();
            throw null;
        }
        RefinancingAvailableTimeRange interfaceDescriptor = getdevnetworktype.getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            int i3 = IAuthTabCallback_Parcel + 125;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                interfaceDescriptor.IAuthTabCallback(onPostMessage().onNavigationEvent());
                throw null;
            }
            calendarIAuthTabCallback = interfaceDescriptor.IAuthTabCallback(onPostMessage().onNavigationEvent());
        }
        if (calendarIAuthTabCallback == null) {
            return false;
        }
        int i4 = IAuthTabCallback_Parcel + 7;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        if (calendarIAuthTabCallback.getTimeInMillis() >= onPostMessage().IAuthTabCallbackDefault()) {
            return false;
        }
        int i6 = access100 + 67;
        IAuthTabCallback_Parcel = i6 % 128;
        return i6 % 2 == 0;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        RefinancingAvailableTimeRange interfaceDescriptor;
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        int i = 2 % 2;
        getDevNetworkType getdevnetworktype = (getDevNetworkType) CollectionsKt.firstOrNull((List) objArr[1]);
        if (getdevnetworktype != null && (interfaceDescriptor = getdevnetworktype.getInterfaceDescriptor()) != null) {
            int i2 = IAuthTabCallback_Parcel + 121;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                interfaceDescriptor.IAuthTabCallback(loanRefinancingInfraCheckFragment.onPostMessage().onNavigationEvent());
                throw null;
            }
            Calendar calendarIAuthTabCallback = interfaceDescriptor.IAuthTabCallback(loanRefinancingInfraCheckFragment.onPostMessage().onNavigationEvent());
            if (calendarIAuthTabCallback != null) {
                int i3 = IAuthTabCallback_Parcel + 37;
                access100 = i3 % 128;
                return Integer.valueOf(calendarIAuthTabCallback.get(i3 % 2 == 0 ? 38 : 11));
            }
        }
        return 16;
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        getSocketSession getsocketsession = new getSocketSession();
        Object[] objArr = {access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted("STD_129_FIND_MY_LOAN_BRIDGE_FULLPAGE", 69L, getsocketsession, (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr), "refinancing_loan_comparison", new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda22(this), new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda23(this));
        int i2 = access100 + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingViewModel.IAuthTabCallback(loanRefinancingInfraCheckFragment.access100(), (Function0) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, -789342590, 789342593, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 77;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment = (LoanRefinancingInfraCheckFragment) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult() == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_USERCANCELLED_MESSAGE) {
                return null;
            }
            if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
                Object[] objArr2 = {loanRefinancingInfraCheckFragment.access100()};
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 166103053, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -166103053, iOnNavigationEvent2, objArr2);
                int i3 = access100 + 39;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
            }
            movePluginRefreshTimeToSp.onNavigationEvent.onExtraCallback(r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed());
            loanRefinancingInfraCheckFragment.ICustomTabsServiceDefault();
            return null;
        }
        r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult();
        r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d0 = r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_USERCANCELLED_MESSAGE;
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        movePluginRefreshTimeToSp.onNavigationEvent.onExtraCallback(false);
        loanRefinancingInfraCheckFragment.ICustomTabsServiceDefault();
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 11;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, Function0 function0, PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0) {
        int i = 2 % 2;
        if (ResourceLoadExtension.Companion.onExtraCallback(priorityThreadFactoryExternalSyntheticLambda0.IAuthTabCallback(ImagePipelineExperimentsBuilderExternalSyntheticLambda17.CREDIT)).isInactive()) {
            int i2 = access100 + 43;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (!loanRefinancingInfraCheckFragment.access100().newAuthTabSession()) {
                loanRefinancingInfraCheckFragment.updateVisuals();
            } else {
                function0.invoke();
                int i4 = access100 + 57;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(Function0 function0, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda15(this);
        writeRaw writerawIAuthTabCallback = enableTabBarByAppId.onNavigationEvent(enableTabBarByAppId.onWarmupCompleted, false, 1, (Object) null).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda17(new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda16(this, externalSyntheticLambda15)), new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda19(new LoanRefinancingInfraCheckFragment$.ExternalSyntheticLambda18(externalSyntheticLambda15)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = IAuthTabCallback_Parcel + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{setDetectableSize}, -2092772268, 2092772275, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, iEngagementSignalsCallbackDefault}, 479002551, -479002549, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment}, -1725478941, 1725478941, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, RefinancingAccountState refinancingAccountState) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, refinancingAccountState}, -1781292500, 1781292508, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{function1, obj}, -383661094, 383661095, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static /* synthetic */ Unit asBinder() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[0], -2082877383, 2082877389, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private final int onExtraCallbackWithResult(List<getDevNetworkType> list) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Integer) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this, list}, 1099717574, -1099717560, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue();
    }

    private static final Unit onWarmupCompleted(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, RefinancingAccountState refinancingAccountState) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, refinancingAccountState}, -51361996, 51362000, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, setDetectableSize}, -1229420840, 1229420852, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private final void onExtraCallbackWithResult(String str) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this, str}, -213526199, 213526210, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private final void onExtraCallback(RefinancingAccountState refinancingAccountState) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this, refinancingAccountState}, 1945020437, -1945020427, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, List list, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, list, setDetectableSize}, 1896214426, -1896214411, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private final void requestPostMessageChannelWithExtras() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this}, -2016376587, 2016376596, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private final void onExtraCallbackWithResult(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{this, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, -789342590, 789342593, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private final Unit onExtraCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, 491985985, -491985972, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(LoanRefinancingInfraCheckFragment loanRefinancingInfraCheckFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) IAuthTabCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, new Object[]{loanRefinancingInfraCheckFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, 1667886402, -1667886397, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    static void IAuthTabCallbackStub() {
        access000 = -8576874930259423565L;
    }
}
