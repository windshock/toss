package im.toss.features.loan.refinancing.biz.account;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.loan.refinancing.biz.account.BizRefinancingAccountSelectFragment$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsNestedScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17;
import o.PageRenderReadyListener;
import o.ParamImpl;
import o.PriorityThreadFactoryExternalSyntheticLambda0;
import o.ResourceLoadExtension;
import o.RippleNode;
import o.SetDetectingInterval;
import o.TemplateExtLoader1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.accessgetProtocolp;
import o.addAllCommandLine;
import o.clearWrite;
import o.deserializeUriNullableCollection;
import o.enableTabBarByAppId;
import o.extractDeviceStatFileForCpuLine;
import o.findResAndMsg;
import o.getAdService;
import o.getLongName;
import o.getSocketSession;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getUserData;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logAndOpenStore;
import o.logInvite;
import o.logVerbose;
import o.movePluginRefreshTimeToSp;
import o.nSetPosition;
import o.preFillDefault;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0;
import o.readIntokhttp;
import o.response;
import o.setBaseTime;
import o.setBodyokhttp;
import o.setProxySelectorokhttp;
import o.setRubIn;
import o.startNativePerfMonitor;
import o.varyMatches;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.BusinessRefinanceAccount;
import viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BizRefinancingAccountSelectFragment extends Hilt_BizRefinancingAccountSelectFragment implements SetDetectingInterval {
    public static final int IAuthTabCallback;
    private static int access100;
    private static long asBinder;
    private static char getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    private static int readTypedObject;
    private static final byte[] $$a = {15, -112, -70, -94};
    private static final int $$b = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private final Lazy IAuthTabCallbackDefault = isStopUpload.onExtraCallback(this, 1971120, (Function1) null, new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda0(this), 2, (Object) null);
    private int onTransact = R.layout.activity_loan_recycler_cta;
    private final PageRenderReadyListener onNavigationEvent = preFillDefault.IAuthTabCallback(this, onWarmupCompleted.onExtraCallbackWithResult);
    private final extractDeviceStatFileForCpuLine onExtraCallbackWithResult = new extractDeviceStatFileForCpuLine();
    private boolean onWarmupCompleted = true;

    static final /* synthetic */ class onExtraCallbackWithResult implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final /* synthetic */ Function1 onWarmupCompleted;

        onExtraCallbackWithResult(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof TextLinkScopeExternalSyntheticLambda0;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            int i4 = i3 + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.invoke(obj);
            int i4 = onExtraCallback + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 4 - (s * 3);
        int i5 = i2 + 109;
        int i6 = i * 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i6;
            i5 = (-i5) + i9;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            int i10 = bArr[i4];
            int i11 = i4;
            i9 = i5;
            i5 = i10;
            i7 = i11;
            i5 = (-i5) + i9;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    static {
        readTypedObject = 1;
        asInterface();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(BizRefinancingAccountSelectFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/ActivityLoanRecyclerCtaBinding;", 0)};
        IAuthTabCallback = 8;
        int i = access000 + 63;
        readTypedObject = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i;
        int i11 = (~i10) | i9;
        int i12 = ~i;
        int i13 = (~(i6 | i10)) | (~(i8 | i12)) | (~(i12 | i2));
        int i14 = i2 + i + i5 + ((-1017789379) * i3) + (461141949 * i4);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i2) + 431816704 + ((-1613042074) * i) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i5) + ((-1727660032) * i3) + (1912995840 * i4) + ((-1005256704) * i15);
        int i17 = ((i2 * (-1063000396)) - 360994079) + (i * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i5 * (-1063000885)) + (i3 * (-90181537)) + (i4 * (-1548859681)) + (i15 * 816250880);
        switch (i16 + (i17 * i17 * 1493368832)) {
            case 1:
                Function0 function0 = (Function0) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i18 = 2 % 2;
                int i19 = IAuthTabCallbackStubProxy + 65;
                IAuthTabCallback_Parcel = i19 % 128;
                int i20 = i19 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(function0, th);
                int i21 = IAuthTabCallback_Parcel + 63;
                IAuthTabCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                return unitIAuthTabCallback;
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccount businessRefinanceAccount, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-889691604, 889691608, nSetPosition.onExtraCallbackWithResult(), new Object[]{bizRefinancingAccountSelectFragment, businessRefinanceAccount, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallbackStubProxy + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment = (BizRefinancingAccountSelectFragment) objArr[0];
        BusinessRefinanceAccountsResponse businessRefinanceAccountsResponse = (BusinessRefinanceAccountsResponse) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(bizRefinancingAccountSelectFragment, businessRefinanceAccountsResponse);
        }
        onNavigationEvent(bizRefinancingAccountSelectFragment, businessRefinanceAccountsResponse);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(bizRefinancingAccountSelectFragment, view);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(bizRefinancingAccountSelectFragment, view);
        int i3 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(bizRefinancingAccountSelectFragment, unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(bizRefinancingAccountSelectFragment, unit);
        int i3 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccount businessRefinanceAccount, Function0 function0, PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-2032510, 2032513, nSetPosition.onExtraCallbackWithResult(), new Object[]{bizRefinancingAccountSelectFragment, businessRefinanceAccount, function0, priorityThreadFactoryExternalSyntheticLambda0}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment = (BizRefinancingAccountSelectFragment) objArr[0];
        initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(bizRefinancingAccountSelectFragment, onwarmupcompleted);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(bizRefinancingAccountSelectFragment, onwarmupcompleted);
        }
        onNavigationEvent(bizRefinancingAccountSelectFragment, onwarmupcompleted);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(gettypedexportedconstants, view);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(gettypedexportedconstants, view);
        int i3 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccount businessRefinanceAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(-1259713738, 1259713744, nSetPosition.onExtraCallbackWithResult(), new Object[]{bizRefinancingAccountSelectFragment, businessRefinanceAccount}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(bizRefinancingAccountSelectFragment, list);
        }
        onExtraCallback(bizRefinancingAccountSelectFragment, list);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccount businessRefinanceAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(bizRefinancingAccountSelectFragment, businessRefinanceAccount);
        int i4 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return -1L;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 57;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.access200();
        }
        super/*o.openJavaCrashMonitor*/.access200();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = IAuthTabCallbackStubProxy + 17;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return mapAr_;
        }
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return findresandmsgAs_;
        }
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub();
        }
        IAuthTabCallbackStub();
        throw null;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        setRubIn<Boolean> setrubinValidateRelationship;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
            int i3 = 17 / 0;
        } else {
            setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        }
        int i4 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
    }

    public hasCrashWhenJavaCrash IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackDefault.getValue();
        int i3 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return hascrashwhenjavacrash;
    }

    private static final Unit onWarmupCompleted(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a((char) KeyEvent.normalizeMetaState(0), KeyEvent.getMaxKeyCode() >> 16, new char[]{37774, 30987, 4764, 62868, 5798, 42688, 21191, 46864}, new char[]{0, 0, 0, 0}, new char[]{46980, 51194, 50107, 10389}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = {bizRefinancingAccountSelectFragment.access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onwarmupcompleted.onExtraCallback(strIntern, (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr2));
        Object[] objArr3 = {bizRefinancingAccountSelectFragment.access100()};
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onwarmupcompleted.onExtraCallbackWithResult("refinanceable_account_cnt", Integer.valueOf(((List) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1416609323, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1416609315, iOnNavigationEvent4, objArr3)).size()));
        onwarmupcompleted.onExtraCallbackWithResult("unrefinanceable_account_cnt", Integer.valueOf(bizRefinancingAccountSelectFragment.access100().IAuthTabCallbackStubProxy().size()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = this.onTransact;
        int i6 = i3 + 113;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, startNativePerfMonitor> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 53;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        onWarmupCompleted() {
            super(1, startNativePerfMonitor.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/ActivityLoanRecyclerCtaBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            startNativePerfMonitor startnativeperfmonitorOnNavigationEvent = onNavigationEvent((View) obj);
            int i4 = onWarmupCompleted + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return startnativeperfmonitorOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final startNativePerfMonitor onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            startNativePerfMonitor startnativeperfmonitorOnExtraCallback = startNativePerfMonitor.onExtraCallback(view);
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            return startnativeperfmonitorOnExtraCallback;
        }
    }

    private final startNativePerfMonitor asBinder() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            pageRenderReadyListener = this.onNavigationEvent;
            addallcommandline = onExtraCallback[0];
        } else {
            pageRenderReadyListener = this.onNavigationEvent;
            addallcommandline = onExtraCallback[0];
        }
        return pageRenderReadyListener.onNavigationEvent(this, addallcommandline);
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onWarmupCompleted + 1;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BusinessRefinanceAccount onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Long lOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
        BusinessRefinanceAccount businessRefinanceAccount = null;
        if (lOnWarmupCompleted != null) {
            long jLongValue = lOnWarmupCompleted.longValue();
            Object[] objArr = {access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            Iterator it = ((List) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1416609323, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1416609315, iOnNavigationEvent2, objArr)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i4 = IAuthTabCallbackStubProxy + 117;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                Object next = it.next();
                if (((BusinessRefinanceAccount) next).onNavigationEvent() == jLongValue) {
                    businessRefinanceAccount = next;
                    break;
                }
            }
            businessRefinanceAccount = businessRefinanceAccount;
        }
        int i6 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return businessRefinanceAccount;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            newAuthTabSession();
            isEngagementSignalsApiAvailable();
            newSessionWithExtras();
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        newAuthTabSession();
        isEngagementSignalsApiAvailable();
        newSessionWithExtras();
        throw null;
    }

    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        startNativePerfMonitor startnativeperfmonitorAsBinder = asBinder();
        if (startnativeperfmonitorAsBinder != null) {
            int i2 = IAuthTabCallback_Parcel + 11;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            TdsBottomCtaV1View tdsBottomCtaV1View = startnativeperfmonitorAsBinder.onExtraCallback;
            if (tdsBottomCtaV1View != null) {
                int i4 = IAuthTabCallbackStubProxy + 57;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
                if (tdsButtonV1ViewAsInterface != null) {
                    tdsButtonV1ViewAsInterface.setLoading(false);
                }
            }
        }
    }

    private final Unit newAuthTabSession() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        startNativePerfMonitor startnativeperfmonitorAsBinder = asBinder();
        if (startnativeperfmonitorAsBinder == null) {
            int i4 = IAuthTabCallbackStubProxy + 109;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = startnativeperfmonitorAsBinder.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        RecyclerView recyclerView = startnativeperfmonitorAsBinder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, recyclerView, false, 0, 6, (Object) null);
        RecyclerView recyclerView2 = startnativeperfmonitorAsBinder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), 0);
        startnativeperfmonitorAsBinder.onNavigationEvent.setLayoutManager(new LinearLayoutManager(requireContext()));
        startnativeperfmonitorAsBinder.onNavigationEvent.setAdapter(this.onExtraCallbackWithResult);
        startnativeperfmonitorAsBinder.onExtraCallbackWithResult.setBackgroundColor(accessgetProtocolp.onNavigationEvent(this).onWarmupCompleted());
        FrameLayout frameLayout = startnativeperfmonitorAsBinder.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccountsResponse businessRefinanceAccountsResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(businessRefinanceAccountsResponse);
        bizRefinancingAccountSelectFragment.IAuthTabCallback(businessRefinanceAccountsResponse);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        access100().onMinimized().observe(getViewLifecycleOwner(), new onExtraCallbackWithResult(new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda10(this)));
        access100().onUnminimized().observe(getViewLifecycleOwner(), new onExtraCallbackWithResult(new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda11(this)));
        int i2 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, Unit unit) {
        Unit unit2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            RippleNode.onNavigationEvent(bizRefinancingAccountSelectFragment).onNavigationEvent(R.id.loanRefinancingPollingFragment);
            unit2 = Unit.INSTANCE;
            int i3 = 32 / 0;
        } else {
            RippleNode.onNavigationEvent(bizRefinancingAccountSelectFragment).onNavigationEvent(R.id.loanRefinancingPollingFragment);
            unit2 = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    private final void newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object[] objArr = {access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            onWarmupCompleted((List<BusinessRefinanceAccount>) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1416609323, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1416609315, iOnNavigationEvent2, objArr), access100().IAuthTabCallbackStubProxy());
            int i3 = IAuthTabCallback_Parcel + 57;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {access100()};
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted((List<BusinessRefinanceAccount>) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1416609323, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1416609315, iOnNavigationEvent4, objArr2), access100().IAuthTabCallbackStubProxy());
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(BusinessRefinanceAccountsResponse businessRefinanceAccountsResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(businessRefinanceAccountsResponse.onNavigationEvent(), businessRefinanceAccountsResponse.IAuthTabCallbackDefault());
        int i4 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $10 + 101;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), Gravity.getAbsoluteGravity(0, 0) + 43, TextUtils.indexOf("", "", 0, 0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122), 44 - View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 23972), 50 - TextUtils.indexOf("", ""), 22939 - (ViewConfiguration.getScrollBarSize() >> 8), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getLongPressTimeout() >> 16)), 29 - TextUtils.indexOf("", ""), 12577 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asBinder ^ 7798559133331975163L)) ^ ((int) (access100 ^ 7798559133331975163L))) ^ ((char) (getInterfaceDescriptor ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 23;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private final void onWarmupCompleted(List<BusinessRefinanceAccount> list, List<BusinessRefinanceAccount> list2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.onWarmupCompleted && this.onExtraCallbackWithResult.onWarmupCompleted() == null) {
            int i3 = IAuthTabCallbackStubProxy + 95;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                list.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!list.isEmpty()) {
                int i4 = IAuthTabCallback_Parcel + 105;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                this.onExtraCallbackWithResult.onNavigationEvent(Long.valueOf(((BusinessRefinanceAccount) CollectionsKt.first(list)).onNavigationEvent()));
                this.onWarmupCompleted = false;
            }
        }
        extractDeviceStatFileForCpuLine extractdevicestatfileforcpuline = this.onExtraCallbackWithResult;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        extractdevicestatfileforcpuline.onExtraCallbackWithResult((List) IAuthTabCallback(-295564733, 295564740, nSetPosition.onExtraCallbackWithResult(), new Object[]{this, list, list2}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult));
        prefetch();
    }

    private static final Unit onExtraCallbackWithResult(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccount businessRefinanceAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        bizRefinancingAccountSelectFragment.onExtraCallbackWithResult(businessRefinanceAccount);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        bizRefinancingAccountSelectFragment.onExtraCallbackWithResult((List<BusinessRefinanceAccount>) list);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        String strAsInterface;
        BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment = (BizRefinancingAccountSelectFragment) objArr[0];
        List<BusinessRefinanceAccount> list = (List) objArr[1];
        List list2 = (List) objArr[2];
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        String string = bizRefinancingAccountSelectFragment.getString(R.string.loan_refinancing_select_loan_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        arrayList.add(new setBaseTime.extraCommand(string, (String) null, (TdsTopV1View.onExtraCallbackWithResult) null, (response) null, (response) null, (TdsTopV1View.onNavigationEvent) null, 0.0f, 126, (DefaultConstructorMarker) null));
        if (!list.isEmpty()) {
            int i2 = IAuthTabCallback_Parcel + 13;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (!list2.isEmpty()) {
                arrayList.add(new setBaseTime.onExtraCallback(bizRefinancingAccountSelectFragment.getString(R.string.loan_refinancing_available_loans) + " " + list.size() + "개", setBodyokhttp.onExtraCallback(bizRefinancingAccountSelectFragment).onRelationshipValidationResult()));
            }
            for (BusinessRefinanceAccount businessRefinanceAccount : list) {
                arrayList.add(new TemplateExtLoader1(businessRefinanceAccount, false, false, new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda3(bizRefinancingAccountSelectFragment, businessRefinanceAccount), 6, (DefaultConstructorMarker) null));
            }
        }
        if (!list2.isEmpty()) {
            arrayList.add(new setBaseTime.newSessionWithExtras(8.0f));
            arrayList.add(setBaseTime.IAuthTabCallback.onExtraCallbackWithResult);
            arrayList.add(new setBaseTime.onExtraCallback(bizRefinancingAccountSelectFragment.getString(R.string.loan_refinancing_unavailable_loans) + " " + list2.size() + "개", setBodyokhttp.onExtraCallback(bizRefinancingAccountSelectFragment).onPostMessage()));
            if (list2.size() == 1) {
                int i4 = IAuthTabCallbackStubProxy + 19;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 != 0) {
                    ((BusinessRefinanceAccount) CollectionsKt.first(list2)).asInterface();
                    throw null;
                }
                strAsInterface = ((BusinessRefinanceAccount) CollectionsKt.first(list2)).asInterface();
            } else {
                strAsInterface = ((BusinessRefinanceAccount) CollectionsKt.first(list2)).asInterface() + " 외 " + (list2.size() - 1) + "개";
            }
            arrayList.add(new setBaseTime.onNavigationEvent(strAsInterface, new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda4(bizRefinancingAccountSelectFragment, list2)));
        }
        arrayList.add(new setBaseTime.newSessionWithExtras(40.0f));
        return arrayList;
    }

    private final void onExtraCallbackWithResult(BusinessRefinanceAccount businessRefinanceAccount) {
        Long lValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        extractDeviceStatFileForCpuLine extractdevicestatfileforcpuline = this.onExtraCallbackWithResult;
        Long lOnWarmupCompleted = extractdevicestatfileforcpuline.onWarmupCompleted();
        long jOnNavigationEvent = businessRefinanceAccount.onNavigationEvent();
        if (lOnWarmupCompleted == null || lOnWarmupCompleted.longValue() != jOnNavigationEvent) {
            lValueOf = Long.valueOf(businessRefinanceAccount.onNavigationEvent());
        } else {
            int i4 = IAuthTabCallback_Parcel + 37;
            int i5 = i4 % 128;
            IAuthTabCallbackStubProxy = i5;
            lValueOf = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i6 = i5 + 97;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        extractdevicestatfileforcpuline.onNavigationEvent(lValueOf);
        postMessage();
    }

    private final void postMessage() {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        boolean z;
        int i = 2 % 2;
        startNativePerfMonitor startnativeperfmonitorAsBinder = asBinder();
        if (startnativeperfmonitorAsBinder == null || (tdsBottomCtaV1View = startnativeperfmonitorAsBinder.onExtraCallback) == null) {
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
        if (tdsButtonV1ViewAsInterface != null) {
            if (onTransact() != null) {
                int i4 = IAuthTabCallback_Parcel + 65;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            tdsButtonV1ViewAsInterface.setEnabled(z);
        }
    }

    private final Unit prefetch() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder();
            throw null;
        }
        startNativePerfMonitor startnativeperfmonitorAsBinder = asBinder();
        if (startnativeperfmonitorAsBinder == null) {
            int i3 = IAuthTabCallback_Parcel + 15;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = startnativeperfmonitorAsBinder.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        tdsBottomCtaV1View.setVisibility(0);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = startnativeperfmonitorAsBinder.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        logInvite.onNavigationEvent(tdsBottomCtaV1View2, viva.republica.toss.R.string.next, 0L, (TdsButtonV1View.asInterface) null, false, new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda13(this), 14, (Object) null);
        startnativeperfmonitorAsBinder.onExtraCallback.asInterface().setEnabled(onTransact() != null);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, View view) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        BusinessRefinanceAccount businessRefinanceAccountOnTransact = bizRefinancingAccountSelectFragment.onTransact();
        if (businessRefinanceAccountOnTransact != null) {
            int i4 = IAuthTabCallback_Parcel + 53;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251679L, true, (String) null, (Map) null, (Function1) null, 112, (Object) null);
                z = false;
            } else {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1251679L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                z = true;
            }
            bizRefinancingAccountSelectFragment.onNavigationEvent(z);
            bizRefinancingAccountSelectFragment.IAuthTabCallback(businessRefinanceAccountOnTransact);
            int i5 = IAuthTabCallback_Parcel + 9;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(boolean z) {
        startNativePerfMonitor startnativeperfmonitorAsBinder;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            startnativeperfmonitorAsBinder = asBinder();
            int i3 = 25 / 0;
            if (startnativeperfmonitorAsBinder == null) {
                return;
            }
        } else {
            startnativeperfmonitorAsBinder = asBinder();
            if (startnativeperfmonitorAsBinder == null) {
                return;
            }
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = startnativeperfmonitorAsBinder.onExtraCallback;
        if (tdsBottomCtaV1View != null) {
            int i4 = IAuthTabCallback_Parcel + 91;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
            if (tdsButtonV1ViewAsInterface != null) {
                tdsButtonV1ViewAsInterface.setLoading(z);
                int i6 = IAuthTabCallback_Parcel + 31;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        LoanRefinancingViewModel loanRefinancingViewModelAccess100;
        long jOnNavigationEvent;
        BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment = (BizRefinancingAccountSelectFragment) objArr[0];
        BusinessRefinanceAccount businessRefinanceAccount = (BusinessRefinanceAccount) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            movePluginRefreshTimeToSp.onNavigationEvent.onExtraCallback(false);
            loanRefinancingViewModelAccess100 = bizRefinancingAccountSelectFragment.access100();
            jOnNavigationEvent = businessRefinanceAccount.onNavigationEvent();
        } else {
            movePluginRefreshTimeToSp.onNavigationEvent.onExtraCallback(false);
            loanRefinancingViewModelAccess100 = bizRefinancingAccountSelectFragment.access100();
            jOnNavigationEvent = businessRefinanceAccount.onNavigationEvent();
        }
        loanRefinancingViewModelAccess100.onNavigationEvent(jOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment = (BizRefinancingAccountSelectFragment) objArr[0];
        BusinessRefinanceAccount businessRefinanceAccount = (BusinessRefinanceAccount) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int i = 2 % 2;
        if (!ResourceLoadExtension.Companion.onExtraCallback(((PriorityThreadFactoryExternalSyntheticLambda0) objArr[3]).IAuthTabCallback(ImagePipelineExperimentsBuilderExternalSyntheticLambda17.CREDIT)).isInactive()) {
            function0.invoke();
        } else {
            int i2 = IAuthTabCallback_Parcel + 11;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            bizRefinancingAccountSelectFragment.onExtraCallback(businessRefinanceAccount);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(Function0 function0, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback_Parcel + 63;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private final void IAuthTabCallback(BusinessRefinanceAccount businessRefinanceAccount) {
        int i = 2 % 2;
        BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda5(this, businessRefinanceAccount);
        writeRaw writerawIAuthTabCallback = enableTabBarByAppId.onNavigationEvent(enableTabBarByAppId.onWarmupCompleted, false, 1, (Object) null).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda7(new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda6(this, businessRefinanceAccount, externalSyntheticLambda5)), new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda9(new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda8(externalSyntheticLambda5)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onExtraCallback(BusinessRefinanceAccount businessRefinanceAccount) {
        int i = 2 % 2;
        getSocketSession getsocketsession = new getSocketSession();
        Object[] objArr = {access100()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, "STD_129_FIND_MY_LOAN_BRIDGE_FULLPAGE", 69L, getsocketsession, (String) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr), "refinancing_business", (Function0) null, new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda12(this, businessRefinanceAccount), 32, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment = (BizRefinancingAccountSelectFragment) objArr[0];
        BusinessRefinanceAccount businessRefinanceAccount = (BusinessRefinanceAccount) objArr[1];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        bizRefinancingAccountSelectFragment.onNavigationEvent(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, businessRefinanceAccount);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse, BusinessRefinanceAccount businessRefinanceAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult() == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_USERCANCELLED_MESSAGE) {
            onNavigationEvent(false);
            int i4 = IAuthTabCallbackStubProxy + 85;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
                return;
            }
            return;
        }
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            Object[] objArr = {access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 166103053, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -166103053, iOnNavigationEvent2, objArr);
        }
        movePluginRefreshTimeToSp.onNavigationEvent.onExtraCallback(r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed());
        access100().onNavigationEvent(businessRefinanceAccount.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        String strIntern;
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Object[] objArr = new Object[1];
            a((char) View.resolveSizeAndState(1, 1, 1), ViewConfiguration.getWindowTouchSlop() >>> 75, new char[]{37774, 30987, 4764, 62868, 5798, 42688, 21191, 46864}, new char[]{0, 0, 0, 0}, new char[]{46980, 51194, 50107, 10389}, objArr);
            strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = {bizRefinancingAccountSelectFragment.access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr2);
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Object[] objArr3 = new Object[1];
            a((char) View.resolveSizeAndState(0, 0, 0), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{37774, 30987, 4764, 62868, 5798, 42688, 21191, 46864}, new char[]{0, 0, 0, 0}, new char[]{46980, 51194, 50107, 10389}, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = {bizRefinancingAccountSelectFragment.access100()};
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent4, objArr4);
        }
        onwarmupcompleted.onExtraCallback(strIntern, (String) objOnExtraCallback);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            gettypedexportedconstants.dismiss();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private final void onExtraCallbackWithResult(List<BusinessRefinanceAccount> list) {
        int i = 2 % 2;
        Integer num = 12;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda1(this);
        logAndOpenStore.IAuthTabCallback(contextRequireContext, 1971236L);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(contextRequireContext, 0, false, false, 1971236L, externalSyntheticLambda1, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(getString(R.string.loan_refinancing_unrefinanceable_bottomsheet_title));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsNestedScrollView tdsNestedScrollView = new TdsNestedScrollView(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsNestedScrollView.setLayoutParams(layoutParams);
        Context context4 = tdsNestedScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout2 = new LinearLayout(context4);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), varyMatches.IAuthTabCallback(linearLayout2, 24));
        for (BusinessRefinanceAccount businessRefinanceAccount : list) {
            Context context5 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context5, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
            tdsListRowV1View.setPaddingTop(varyMatches.IAuthTabCallback(tdsListRowV1View, num));
            tdsListRowV1View.setPaddingBottom(varyMatches.IAuthTabCallback(tdsListRowV1View, num));
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View.setLeftImageSize(TdsListRowV1View.IAuthTabCallback.onWarmupCompleted.IAuthTabCallback.onWarmupCompleted);
            tdsListRowV1View.setLeftImage(businessRefinanceAccount.IAuthTabCallback());
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2D);
            tdsListRowV1View.setCenterText1(businessRefinanceAccount.onExtraCallbackWithResult() + " " + businessRefinanceAccount.asInterface());
            Integer num2 = num;
            tdsListRowV1View.setCenterText2(businessRefinanceAccount.onExtraCallback() + "% ・ " + getLongName.onNavigationEvent(businessRefinanceAccount.onTransact(), (ParamImpl) null, 1, (Object) null));
            Context context6 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View.setCenterText2Color(new getUrlokhttp(new onNavigationEvent(configuration)).onPostMessage());
            linearLayout2.addView(tdsListRowV1View);
            int i2 = IAuthTabCallbackStubProxy + 73;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 3;
            }
            num = num2;
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsNestedScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsNestedScrollView);
        Context context7 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context7);
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, tdsNestedScrollView, false, 0, 6, (Object) null);
        String string = tdsBottomCtaV1View.getContext().getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new BizRefinancingAccountSelectFragment$.ExternalSyntheticLambda2(gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        IAuthTabCallback(-700932499, 700932504, nSetPosition.onExtraCallbackWithResult(), new Object[]{function1, obj}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onWarmupCompleted(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccountsResponse businessRefinanceAccountsResponse) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1216086776, 1216086776, nSetPosition.onExtraCallbackWithResult(), new Object[]{bizRefinancingAccountSelectFragment, businessRefinanceAccountsResponse}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit IAuthTabCallback(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1907093523, -1907093521, nSetPosition.onExtraCallbackWithResult(), new Object[]{bizRefinancingAccountSelectFragment, onwarmupcompleted}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, Throwable th) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(863586934, -863586933, nSetPosition.onExtraCallbackWithResult(), new Object[]{function0, th}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccount businessRefinanceAccount) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1259713738, 1259713744, nSetPosition.onExtraCallbackWithResult(), new Object[]{bizRefinancingAccountSelectFragment, businessRefinanceAccount}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccount businessRefinanceAccount, Function0 function0, PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-2032510, 2032513, nSetPosition.onExtraCallbackWithResult(), new Object[]{bizRefinancingAccountSelectFragment, businessRefinanceAccount, function0, priorityThreadFactoryExternalSyntheticLambda0}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private final List<Object> onExtraCallback(List<BusinessRefinanceAccount> list, List<BusinessRefinanceAccount> list2) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (List) IAuthTabCallback(-295564733, 295564740, nSetPosition.onExtraCallbackWithResult(), new Object[]{this, list, list2}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(BizRefinancingAccountSelectFragment bizRefinancingAccountSelectFragment, BusinessRefinanceAccount businessRefinanceAccount, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-889691604, 889691608, nSetPosition.onExtraCallbackWithResult(), new Object[]{bizRefinancingAccountSelectFragment, businessRefinanceAccount, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    static void asInterface() {
        asBinder = 7798559133331975163L;
        access100 = 1080064977;
        getInterfaceDescriptor = (char) 27643;
    }
}
