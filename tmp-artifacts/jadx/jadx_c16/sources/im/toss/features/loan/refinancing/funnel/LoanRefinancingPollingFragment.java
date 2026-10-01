package im.toss.features.loan.refinancing.funnel;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import im.toss.features.loan.refinancing.data.RefinancingInquiryResult;
import im.toss.features.loan.refinancing.funnel.LoanRefinancingPollingFragment$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.common.RefinancingLoanType;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda8;
import o.ConvertByteArrayToFloatArray;
import o.DERSet;
import o.EncodedDataImplExternalSyntheticLambda0;
import o.N_;
import o.NetConverter3;
import o.PageContext;
import o.PlayerErrorCode;
import o.Plugin;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.RecomposerrecompositionRunner2;
import o.RecomposerrecompositionRunner2ExternalSyntheticLambda0;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access13800;
import o.addAllCommandLine;
import o.clearWrite;
import o.deserializeUriNullableCollection;
import o.getAdService;
import o.getAdditionalParams;
import o.getByteBuffer;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.initMiniApp;
import o.isSupportTraceDebug;
import o.logAndOpenStore;
import o.logCrossPromoteImpression;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.readIntokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setVisitUrl;
import o.trackCheckout;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanRefinancingStatus;
import viva.republica.toss.network.model.loan.RefinancingStatus;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingPollingFragment extends Hilt_LoanRefinancingPollingFragment {
    public static final int IAuthTabCallback;
    private static int onActivityLayout;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult;
    private static char[] readTypedObject;
    private static long writeTypedObject;
    private float IAuthTabCallback_Parcel;
    private boolean access000;
    private deserializeUriNullableCollection access100;

    @Inject
    public trackCheckout notificationHelper;
    private boolean onExtraCallback;
    private boolean onTransact;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onMessageChannelReady = 1;
    private static int ICustomTabsCallback = 0;
    private static int onMinimized = 1;
    private int onWarmupCompleted = R.layout.fragment_loan_refinancing_polling;
    private long IAuthTabCallbackStubProxy = -1;
    private float extraCallbackWithResult = 1.0f / (DERSet.onExtraCallback.RatingCompatApi19Impl() * 40.0f);
    private float getInterfaceDescriptor = -1.0f;
    private int extraCallback = 100;
    private final PageContext onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onExtraCallbackWithResult);
    private final List<String> IAuthTabCallbackDefault = new ArrayList();
    private final List<String> asBinder = new ArrayList();

    static final /* synthetic */ class onNavigationEvent implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ Function1 onExtraCallback;

        onNavigationEvent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                int i4 = 0 / 0;
                if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                    if (obj instanceof FunctionAdapter) {
                        int i5 = i3 + 117;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                        int i7 = IAuthTabCallback + 67;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 43 / 0;
                        }
                        return zAreEqual;
                    }
                }
            } else if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onExtraCallback;
            int i5 = i2 + 105;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke(obj);
            int i4 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = 4 - (s2 * 4);
        int i4 = i * 2;
        byte[] bArr = $$a;
        int i5 = (s * 2) + 97;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            int i9 = i6;
            i5 = (-i5) + i9;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i3];
            int i10 = i3;
            i9 = i5;
            i5 = b;
            i8 = i2 + 1;
            i7 = i10;
            i5 = (-i5) + i9;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    static {
        onActivityLayout = 0;
        onNavigationEvent();
        onExtraCallbackWithResult = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingPollingFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingPollingBinding;", 0)};
        IAuthTabCallback = 8;
        int i = onMessageChannelReady + 9;
        onActivityLayout = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(loanRefinancingPollingFragment, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(loanRefinancingPollingFragment, setDetectableSize);
        int i3 = onMinimized + 7;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingPollingFragment loanRefinancingPollingFragment, TdsBottomCtaV1View tdsBottomCtaV1View, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingPollingFragment, tdsBottomCtaV1View, gettypedexportedconstants, view);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = onMinimized + 105;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(loanRefinancingPollingFragment, setDetectableSize);
        int i4 = onMinimized + 15;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i);
        int i11 = i9 | i10 | (~(i8 | i));
        int i12 = i10 | i6;
        int i13 = ~i;
        int i14 = (~(i6 | i13 | i5)) | (~(i7 | i13 | i8)) | (~(i8 | i5 | i));
        int i15 = i5 + i + i2 + ((-1329026341) * i4) + ((-1277752516) * i3);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i5) - 1912602624) + ((-659060787) * i) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i2) + (494927872 * i4) + (1577058304 * i3) + ((-1783103488) * i16);
        int i18 = (i5 * 595972471) + 129777640 + (i * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i2 * 595972219) + (i4 * (-1341978823)) + (i3 * 731850196) + (i16 * 1869086720);
        int i19 = i17 + (i18 * i18 * (-846725120));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? i19 != 5 ? onNavigationEvent(objArr) : IAuthTabCallbackStub(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingPollingFragment loanRefinancingPollingFragment, RefinancingInquiryResult refinancingInquiryResult) {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingPollingFragment, refinancingInquiryResult);
        int i4 = onMinimized + 43;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 59;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(loanRefinancingPollingFragment, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(loanRefinancingPollingFragment, setDetectableSize);
        int i3 = onMinimized + 55;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingPollingFragment loanRefinancingPollingFragment = (LoanRefinancingPollingFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingPollingFragment, view);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = onMinimized + 1;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingPollingFragment loanRefinancingPollingFragment, Long l) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingPollingFragment, l);
        int i4 = onMinimized + 51;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(loanRefinancingPollingFragment, setDetectableSize);
        int i4 = ICustomTabsCallback + 51;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(602940887, new Object[]{loanRefinancingPollingFragment, setDetectableSize}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -602940882, iOnExtraCallbackWithResult);
        int i4 = onMinimized + 99;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(-1086670117, new Object[]{gettypedexportedconstants, view}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1086670118, iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onMinimized + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return 1251889L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asBinder implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        public static final asBinder onExtraCallbackWithResult = new asBinder();
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 63;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 40 / 0;
            }
            return unit;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanRefinancingPollingFragment loanRefinancingPollingFragment = (LoanRefinancingPollingFragment) objArr[0];
        LoanRefinancingStatus loanRefinancingStatus = (LoanRefinancingStatus) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            onExtraCallbackWithResult(1212388013, new Object[]{loanRefinancingPollingFragment, loanRefinancingStatus}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1212388009, iOnExtraCallbackWithResult);
            return null;
        }
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        onExtraCallbackWithResult(1212388013, new Object[]{loanRefinancingPollingFragment, loanRefinancingStatus}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1212388009, iOnExtraCallbackWithResult2);
        int i3 = 11 / 0;
        return null;
    }

    public static final /* synthetic */ LoanRefinancingViewModel onWarmupCompleted(LoanRefinancingPollingFragment loanRefinancingPollingFragment) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            loanRefinancingPollingFragment.access100();
            throw null;
        }
        LoanRefinancingViewModel loanRefinancingViewModelAccess100 = loanRefinancingPollingFragment.access100();
        int i3 = onMinimized + 5;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return loanRefinancingViewModelAccess100;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 33;
        int i3 = i2 % 128;
        onMinimized = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.onWarmupCompleted;
        int i5 = i3 + 31;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final trackCheckout onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 33;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        trackCheckout trackcheckout = this.notificationHelper;
        Object obj = null;
        if (trackcheckout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 47;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return trackcheckout;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                int i2 = onExtraCallbackWithResult + 87;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 73 / 0;
                    }
                    return getspecialfeatureoptinstatus;
                }
                int i5 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                if (i6 != 0) {
                    int i7 = 62 / 0;
                }
                return getspecialfeatureoptinstatus2;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                int i2 = onExtraCallback + 45;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, isSupportTraceDebug> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 19;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        IAuthTabCallback() {
            super(1, isSupportTraceDebug.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingPollingBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            isSupportTraceDebug issupporttracedebugOnWarmupCompleted = onWarmupCompleted((View) obj);
            int i4 = IAuthTabCallback + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return issupporttracedebugOnWarmupCompleted;
        }

        public final isSupportTraceDebug onWarmupCompleted(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            isSupportTraceDebug issupporttracedebugOnExtraCallbackWithResult = isSupportTraceDebug.onExtraCallbackWithResult(view);
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return issupporttracedebugOnExtraCallbackWithResult;
        }
    }

    private final isSupportTraceDebug asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        onMinimized = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 == 0 ? this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]) : this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        isSupportTraceDebug issupporttracedebug = (isSupportTraceDebug) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i3 = onMinimized + 75;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return issupporttracedebug;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.access000 = false;
        List<String> list = this.IAuthTabCallbackDefault;
        String[] stringArray = getResources().getStringArray(R.array.loan_refinancing_polling_text);
        Intrinsics.checkNotNullExpressionValue(stringArray, "");
        CollectionsKt.addAll(list, stringArray);
        List<String> list2 = this.asBinder;
        String[] stringArray2 = getResources().getStringArray(R.array.loan_refinancing_polling_text_sub);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "");
        CollectionsKt.addAll(list2, stringArray2);
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        asBinder();
        IAuthTabCallbackStub();
        int i4 = ICustomTabsCallback + 45;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        access100().extraCallbackWithResult().observe(getViewLifecycleOwner(), new onNavigationEvent(new LoanRefinancingPollingFragment$.ExternalSyntheticLambda0(this)));
        int i2 = onMinimized + 73;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 91;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(readTypedObject[i / i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.lastIndexOf("", '0', 0)), 17 - TextUtils.indexOf("", "", 0), 10973 - View.combineMeasuredStates(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(writeTypedObject), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 46135), TextUtils.indexOf("", "") + 31, ExpandableListView.getPackedPositionGroup(0L) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.indexOf((CharSequence) "", '0', 0)), Gravity.getAbsoluteGravity(0, 0) + 44, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(readTypedObject[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.combineMeasuredStates(0, 0)), 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(writeTypedObject), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.indexOf((CharSequence) "", '0', 0)), 30 - TextUtils.indexOf((CharSequence) "", '0', 0), 20220 - View.resolveSize(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf("", "", 0) + 44, 1494 - TextUtils.indexOf("", ""), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 44 - (ViewConfiguration.getScrollBarSize() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i7 = $11 + 7;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static final Unit onNavigationEvent(LoanRefinancingPollingFragment loanRefinancingPollingFragment, RefinancingInquiryResult refinancingInquiryResult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingPollingFragment.dismissLoadingIndicator();
        long jOnExtraCallback = refinancingInquiryResult.onExtraCallback() / 1000;
        if (loanRefinancingPollingFragment.IAuthTabCallbackStubProxy >= 0 || jOnExtraCallback <= 10) {
            loanRefinancingPollingFragment.IAuthTabCallbackStubProxy = 0L;
        } else {
            int i4 = ICustomTabsCallback + 23;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            long jOnExtraCallback2 = refinancingInquiryResult.onExtraCallback() / 1000;
            loanRefinancingPollingFragment.IAuthTabCallbackStubProxy = jOnExtraCallback2;
            loanRefinancingPollingFragment.getInterfaceDescriptor = (jOnExtraCallback2 / DERSet.onExtraCallback.RatingCompatApi19Impl()) + loanRefinancingPollingFragment.IAuthTabCallback_Parcel;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ICustomTabsCallback + 59;
        onMinimized = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private final void asBinder() {
        int i = 2 % 2;
        this.access100 = getByteBuffer.onExtraCallback(0L, 25L, TimeUnit.MILLISECONDS, NetConverter3.onExtraCallback()).IAuthTabCallback(new LoanRefinancingPollingFragment$.ExternalSyntheticLambda2(new LoanRefinancingPollingFragment$.ExternalSyntheticLambda1(this)));
        int i2 = ICustomTabsCallback + 115;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onMinimized + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r0.isDisposed() != true) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r0
      0x001b: PHI (r0v5 o.deserializeUriNullableCollection) = (r0v4 o.deserializeUriNullableCollection), (r0v20 o.deserializeUriNullableCollection) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(LoanRefinancingPollingFragment loanRefinancingPollingFragment, Long l) {
        deserializeUriNullableCollection deserializeurinullablecollection;
        float fMin;
        int i = 2 % 2;
        int i2 = onMinimized + 61;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            deserializeurinullablecollection = loanRefinancingPollingFragment.access100;
            int i4 = 34 / 0;
            if (deserializeurinullablecollection != null) {
                if (deserializeurinullablecollection != null) {
                    int i5 = i3 + 5;
                    onMinimized = i5 % 128;
                    int i6 = i5 % 2;
                }
                float f = loanRefinancingPollingFragment.IAuthTabCallback_Parcel;
                float f2 = loanRefinancingPollingFragment.getInterfaceDescriptor;
                if (f2 <= 0.0f || f > f2) {
                    fMin = loanRefinancingPollingFragment.extraCallbackWithResult;
                    int i7 = onMinimized + 109;
                    ICustomTabsCallback = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    fMin = loanRefinancingPollingFragment.extraCallbackWithResult + Math.min(f2 - f, 0.01f);
                }
                loanRefinancingPollingFragment.IAuthTabCallback_Parcel = f + fMin;
                loanRefinancingPollingFragment.asInterface().IAuthTabCallbackStub.setPercent(loanRefinancingPollingFragment.IAuthTabCallback_Parcel);
                int i9 = loanRefinancingPollingFragment.extraCallback;
                loanRefinancingPollingFragment.extraCallback = i9 + 1;
                if (i9 > 120) {
                    loanRefinancingPollingFragment.extraCallback = 0;
                    int i10 = ICustomTabsCallback + 85;
                    onMinimized = i10 % 128;
                    int i11 = i10 % 2;
                }
                if (loanRefinancingPollingFragment.extraCallback == 0) {
                    int i12 = onMinimized + 119;
                    ICustomTabsCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        loanRefinancingPollingFragment.prefetch();
                        loanRefinancingPollingFragment.postMessage();
                        throw null;
                    }
                    loanRefinancingPollingFragment.prefetch();
                    loanRefinancingPollingFragment.postMessage();
                }
                if (loanRefinancingPollingFragment.extraCallbackWithResult >= 0.01f && loanRefinancingPollingFragment.IAuthTabCallback_Parcel >= 1.0f) {
                    loanRefinancingPollingFragment.onTransact();
                }
                return Unit.INSTANCE;
            }
        } else {
            deserializeurinullablecollection = loanRefinancingPollingFragment.access100;
            if (deserializeurinullablecollection != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069 A[PHI: r2
      0x0069: PHI (r2v12 float) = (r2v2 float), (r2v3 float), (r2v16 float) binds: [B:8:0x001f, B:10:0x0023, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r2
      0x0021: PHI (r2v3 float) = (r2v2 float), (r2v16 float) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void prefetch() {
        float f;
        Pair pair;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 83;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            f = this.IAuthTabCallback_Parcel;
            if (1.0f <= f) {
                if (f <= 0.1f) {
                    String str = PlayerErrorCode.onPostMessage() + ((Object) this.IAuthTabCallbackDefault.get(0));
                    int iRatingCompatApi19Impl = DERSet.onExtraCallback.RatingCompatApi19Impl();
                    String str2 = this.asBinder.get(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(iRatingCompatApi19Impl);
                    sb.append((Object) str2);
                    pair = new Pair(str, sb.toString());
                    int i4 = onMinimized + 121;
                    ICustomTabsCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else if (0.1f <= f && f <= 0.25f) {
                    pair = new Pair(this.IAuthTabCallbackDefault.get(1), this.asBinder.get(1));
                } else if (0.25f <= f) {
                    int i6 = i2 + 59;
                    onMinimized = i6 % 128;
                    if (i6 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    pair = f <= 0.65f ? new Pair(this.IAuthTabCallbackDefault.get(2), this.asBinder.get(1)) : new Pair(this.IAuthTabCallbackDefault.get(3), this.asBinder.get(1));
                }
            }
        } else {
            f = this.IAuthTabCallback_Parcel;
            if (0.0f <= f) {
            }
        }
        String str3 = (String) pair.onExtraCallbackWithResult();
        String str4 = (String) pair.IAuthTabCallback();
        asInterface().asBinder.setUpperText(str3);
        asInterface().asBinder.setLowerText(str4);
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!this.onExtraCallback) {
                int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                RefinancingInquiryResult refinancingInquiryResult = (RefinancingInquiryResult) LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(iOnWarmupCompleted2, 703437430, -703437429, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted3, new Object[]{this});
                if (!refinancingInquiryResult.onNavigationEvent().isEmpty()) {
                    this.onExtraCallback = true;
                    onNavigationEvent(refinancingInquiryResult);
                    return;
                }
            }
            int i3 = ICustomTabsCallback + 57;
            onMinimized = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    private final void postMessage() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new asInterface(this, (access13800) null), 3, (Object) null);
        int i2 = onMinimized + 113;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        LoanRefinancingPollingFragment loanRefinancingPollingFragment = (LoanRefinancingPollingFragment) objArr[0];
        LoanRefinancingStatus loanRefinancingStatus = (LoanRefinancingStatus) objArr[1];
        int i = 2 % 2;
        loanRefinancingPollingFragment.access100().onExtraCallbackWithResult(loanRefinancingStatus.onNavigationEvent());
        if (!loanRefinancingPollingFragment.access000) {
            int i2 = ICustomTabsCallback + 67;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = {loanRefinancingPollingFragment.access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            if (((Long) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 888700290, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -888700272, iOnNavigationEvent2, objArr2)).longValue() > 0) {
                int i4 = onMinimized + 7;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr3 = {loanRefinancingPollingFragment.access100()};
                int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int i6 = onWarmupCompleted.IAuthTabCallback[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, iOnNavigationEvent4, objArr3)).ordinal()];
                if (i6 == 1) {
                    loanRefinancingPollingFragment.access100().IAuthTabCallback();
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    loanRefinancingPollingFragment.access100().onExtraCallbackWithResult();
                }
                loanRefinancingPollingFragment.access000 = true;
            }
        }
        if (loanRefinancingStatus.onExtraCallback() == RefinancingStatus.REFINANCING_PRE_SCREEN_DONE) {
            loanRefinancingPollingFragment.extraCallbackWithResult = 0.012f;
            Object[] objArr4 = {loanRefinancingPollingFragment.access100()};
            int iOnNavigationEvent5 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent6 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int i7 = onWarmupCompleted.IAuthTabCallback[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent5, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, iOnNavigationEvent6, objArr4)).ordinal()];
            if (i7 != 1) {
                int i8 = ICustomTabsCallback + 119;
                int i9 = i8 % 128;
                onMinimized = i9;
                int i10 = i8 % 2;
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i11 = i9 + 17;
                ICustomTabsCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    loanRefinancingPollingFragment.access100().onExtraCallback(String.valueOf(loanRefinancingStatus.onNavigationEvent()));
                    throw null;
                }
                loanRefinancingPollingFragment.access100().onExtraCallback(String.valueOf(loanRefinancingStatus.onNavigationEvent()));
                int i12 = onMinimized + 107;
                ICustomTabsCallback = i12 % 128;
                int i13 = i12 % 2;
                return null;
            }
            LoanRefinancingViewModel.onExtraCallbackWithResult(loanRefinancingPollingFragment.access100(), 0L, 1, (Object) null);
        }
        return null;
    }

    private static final Unit IAuthTabCallbackDefault(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingPollingFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 15;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(LoanRefinancingPollingFragment loanRefinancingPollingFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        loanRefinancingPollingFragment.newAuthTabSession();
        ConvertByteArrayToFloatArray.onExtraCallback(1251895L, false, (String) null, (Map) null, new LoanRefinancingPollingFragment$.ExternalSyntheticLambda10(loanRefinancingPollingFragment), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 97;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingPollingFragment.writeTypedObject());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 27;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        TdsListRowV1View tdsListRowV1View = asInterface().IAuthTabCallback;
        if (EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(requireContext()).onWarmupCompleted()) {
            RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext());
            Object[] objArr = new Object[1];
            a(51 - Color.red(0), 55 - Color.blue(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr);
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = onnavigationevent.onExtraCallback(((String) objArr[0]).intern());
            SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 logcrosspromoteimpression = new logCrossPromoteImpression(24.0f, 24.0f);
            Intrinsics.checkNotNull(tdsListRowV1View);
            Context context = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{logcrosspromoteimpression, getAdditionalParams.onExtraCallbackWithResult(40.0f, 40.0f, new getUrlokhttp(new onExtraCallbackWithResult(configuration)).ITrustedWebActivityCallbackStub()), new Plugin(40.0f, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null)}));
            tdsListRowV1View.setCenterText1(getString(R.string.loan_refinancing_after_inquiry_alarm));
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.NONE);
            int i4 = onMinimized + 85;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent2 = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext());
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 106, 59 - KeyEvent.getDeadChar(0, 0), (char) (23326 - ImageFormat.getBitsPerPixel(0)), objArr2);
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback2 = onnavigationevent2.onExtraCallback(((String) objArr2[0]).intern());
        SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 logcrosspromoteimpression2 = new logCrossPromoteImpression(24.0f, 24.0f);
        Intrinsics.checkNotNull(tdsListRowV1View);
        Context context2 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback2, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{logcrosspromoteimpression2, getAdditionalParams.onExtraCallbackWithResult(40.0f, 40.0f, new getUrlokhttp(new onExtraCallback(configuration2)).extraCallback()), new Plugin(40.0f, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null)}));
        tdsListRowV1View.setCenterText1(getString(R.string.loan_question_alarm_on));
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.BUTTON);
        tdsListRowV1View.setRightButtonLabel(getString(R.string.loan_get_alarm));
        tdsListRowV1View.setRightButtonTheme(new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.SMALL, (TdsButtonV1View.IAuthTabCallback) null, 8, (DefaultConstructorMarker) null));
        tdsListRowV1View.setRightOnButtonClickListener(new LoanRefinancingPollingFragment$.ExternalSyntheticLambda8(this));
        ConvertByteArrayToFloatArray.onExtraCallback(1251893L, false, (String) null, (Map) null, new LoanRefinancingPollingFragment$.ExternalSyntheticLambda9(this), 14, (Object) null);
    }

    private static final Unit IAuthTabCallbackStub(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 89;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("business_yn", loanRefinancingPollingFragment.writeTypedObject());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingPollingFragment.writeTypedObject());
        int i3 = 94 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 41;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("business_yn", loanRefinancingPollingFragment.writeTypedObject());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("business_yn", loanRefinancingPollingFragment.writeTypedObject());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMinimized + 103;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 61 / 0;
        }
        return unit2;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingPollingFragment loanRefinancingPollingFragment, TdsBottomCtaV1View tdsBottomCtaV1View, getTypedExportedConstants gettypedexportedconstants, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            trackCheckout trackcheckoutOnExtraCallback = loanRefinancingPollingFragment.onExtraCallback();
            Context context = tdsBottomCtaV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            trackcheckoutOnExtraCallback.asBinder(context);
            gettypedexportedconstants.dismiss();
            unit = Unit.INSTANCE;
            int i3 = 56 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            trackCheckout trackcheckoutOnExtraCallback2 = loanRefinancingPollingFragment.onExtraCallback();
            Context context2 = tdsBottomCtaV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            trackcheckoutOnExtraCallback2.asBinder(context2);
            gettypedexportedconstants.dismiss();
            unit = Unit.INSTANCE;
        }
        int i4 = onMinimized + 115;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 71;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void newAuthTabSession() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1251891L, false, (String) null, (Map) null, new LoanRefinancingPollingFragment$.ExternalSyntheticLambda4(this), 14, (Object) null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        asBinder asbinder = asBinder.onExtraCallbackWithResult;
        logAndOpenStore.IAuthTabCallback(contextRequireContext, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(contextRequireContext, 0, false, false, -1L, asbinder, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(getString(R.string.loan_want_to_set_toss_alarm_on));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(varyMatches.IAuthTabCallback(baseTextView, 24));
        layoutParams2.setMarginEnd(varyMatches.IAuthTabCallback(baseTextView, Float.valueOf(24.0f)));
        baseTextView.setLayoutParams(layoutParams);
        baseTextView.setText(getString(R.string.loan_set_toss_alarm_on_message));
        Context context3 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextView.setTextColor(new getUrlokhttp(new IAuthTabCallbackStub(configuration)).ICustomTabsCallbackStubProxy());
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        ConvertByteArrayToFloatArray.onExtraCallback(1251897L, false, (String) null, (Map) null, new LoanRefinancingPollingFragment$.ExternalSyntheticLambda5(this), 14, (Object) null);
        int i2 = R.string.loan_turn_on_now;
        LoanRefinancingPollingFragment$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new LoanRefinancingPollingFragment$.ExternalSyntheticLambda6(this, tdsBottomCtaV1View, gettypedexportedconstants);
        TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
        TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
        TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.XLARGE;
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.BLOCK;
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, i2, externalSyntheticLambda6, new TdsButtonV1View.asInterface(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback), false, 8, (Object) null);
        tdsBottomCtaV1View.setSecondary(viva.republica.toss.R.string.close, new LoanRefinancingPollingFragment$.ExternalSyntheticLambda7(gettypedexportedconstants), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, onwarmupcompleted, iAuthTabCallback));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        trackCheckout trackcheckoutOnExtraCallback = onExtraCallback();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        trackcheckoutOnExtraCallback.asBinder(contextRequireContext2);
        int i3 = onMinimized + 117;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Unit unit;
        LoanRefinancingPollingFragment loanRefinancingPollingFragment = (LoanRefinancingPollingFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("business_yn", loanRefinancingPollingFragment.writeTypedObject());
            unit = Unit.INSTANCE;
            int i3 = 40 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("business_yn", loanRefinancingPollingFragment.writeTypedObject());
            unit = Unit.INSTANCE;
        }
        int i4 = onMinimized + 103;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1251899L, false, (String) null, (Map) null, new LoanRefinancingPollingFragment$.ExternalSyntheticLambda3(this), 14, (Object) null);
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, false, (Intent) null, 3, (Object) null);
        int i2 = onMinimized + 115;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onDestroyView();
        deserializeUriNullableCollection deserializeurinullablecollection = this.access100;
        if (deserializeurinullablecollection != null) {
            int i4 = onMinimized + 59;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                deserializeurinullablecollection.dispose();
                int i5 = 27 / 0;
            } else {
                deserializeurinullablecollection.dispose();
            }
        }
        this.access100 = null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        LoanRefinancingPollingFragment loanRefinancingPollingFragment = (LoanRefinancingPollingFragment) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        isSupportTraceDebug issupporttracedebugAsInterface = loanRefinancingPollingFragment.asInterface();
        loanRefinancingPollingFragment.IAuthTabCallback_Parcel = 0.0f;
        loanRefinancingPollingFragment.extraCallbackWithResult = 1.0f / (DERSet.onExtraCallback.RatingCompatApi19Impl() * 40.0f);
        loanRefinancingPollingFragment.onTransact = false;
        BaseTextView typedObject = issupporttracedebugAsInterface.asBinder.readTypedObject();
        if (typedObject != null) {
            typedObject.setTextSize(1, 22.0f);
        }
        BaseTextView baseTextViewAsInterface = issupporttracedebugAsInterface.asBinder.asInterface();
        if (baseTextViewAsInterface != null) {
            int i4 = ICustomTabsCallback + 63;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                baseTextViewAsInterface.setTextSize(0, 17.0f);
            } else {
                baseTextViewAsInterface.setTextSize(1, 17.0f);
            }
        }
        BaseTextView baseTextViewICustomTabsCallbackDefault = issupporttracedebugAsInterface.IAuthTabCallback.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            baseTextViewICustomTabsCallbackDefault.setTextSize(1, 17.0f);
        }
        TdsImageView tdsImageView = issupporttracedebugAsInterface.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(tdsImageView.getContext());
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(tdsImageView.getContext());
        Object[] objArr2 = new Object[1];
        a(Color.green(0), 51 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = Recomposerjoin2.onExtraCallback(onnavigationevent.onExtraCallback(((String) objArr2[0]).intern()), tdsImageView);
        RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, true);
        N_.onExtraCallback(onnavigationeventOnExtraCallback, 0);
        RecomposerrecompositionRunner2ExternalSyntheticLambda0 recomposerrecompositionRunner2ExternalSyntheticLambda0OnWarmupCompleted = carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallbackWithResult());
        int i5 = ICustomTabsCallback + 25;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return recomposerrecompositionRunner2ExternalSyntheticLambda0OnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingPollingFragment loanRefinancingPollingFragment, View view) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(460863992, new Object[]{loanRefinancingPollingFragment, view}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -460863992, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingPollingFragment loanRefinancingPollingFragment, LoanRefinancingStatus loanRefinancingStatus) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-1782857927, new Object[]{loanRefinancingPollingFragment, loanRefinancingStatus}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1782857930, iOnExtraCallbackWithResult);
    }

    private final void onExtraCallback(LoanRefinancingStatus loanRefinancingStatus) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        onExtraCallbackWithResult(1212388013, new Object[]{this, loanRefinancingStatus}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1212388009, iOnExtraCallbackWithResult);
    }

    private final RecomposerrecompositionRunner2ExternalSyntheticLambda0 isEngagementSignalsApiAvailable() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (RecomposerrecompositionRunner2ExternalSyntheticLambda0) onExtraCallbackWithResult(-1918024334, new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1918024336, iOnExtraCallbackWithResult);
    }

    private static final Unit asBinder(LoanRefinancingPollingFragment loanRefinancingPollingFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(602940887, new Object[]{loanRefinancingPollingFragment, setDetectableSize}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -602940882, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-1086670117, new Object[]{gettypedexportedconstants, view}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1086670118, iOnExtraCallbackWithResult);
    }

    static void onNavigationEvent() {
        readTypedObject = new char[]{60860, 59401, 59122, 64863, 64259, 61859, 52237, 51812, 49391, 57169, 54575, 54243, 44625, 42018, 41668, 47431, 46891, 36254, 34885, 34417, 40073, 39780, 37245, 28616, 27240, 24698, 32403, 30056, 29638, 18836, 17507, 17089, 22677, 22394, 11659, 11171, 9855, 15576, 15014, 12546, 4050, 1442, 'C', 7894, 5288, 4879, 59885, 59389, 57876, 63715, 63153, 60860, 59401, 59122, 64863, 64259, 61859, 52237, 51812, 49391, 57169, 54575, 54243, 44625, 42018, 41668, 47431, 46891, 36254, 34885, 34417, 40073, 39780, 37245, 28562, 27247, 24634, 32400, 30068, 29575, 18817, 17524, 17092, 22747, 22313, 11742, 11232, 9849, 15578, 15021, 12549, 3985, 1444, 2, 7894, 5290, 4876, 59815, 59317, 57869, 63713, 63162, 52561, 52208, 50759, 56341, 46755, 45846, 48621, 42560, 40988, 43708, 38674, 37243, 39920, 33870, 36400, 35068, 62798, 65341, 63963, 57944, 60468, 54913, 54106, 56686, 51094, 49275, 51810, 13453, 12656, 15141, 9615, 11883, 10392, 4766, 8043, 6619, 964, 3126, 30401, 28927, 32102, 26565, 25010, 27162, 21646, 24251, 23325, 17865, 20405, 18451, 45752, 48291, 47381, 41919, 44474, 38413, 37118, 40282, 34561, 33194, 35395, 62468, 65254};
        writeTypedObject = -93423551537616771L;
    }
}
