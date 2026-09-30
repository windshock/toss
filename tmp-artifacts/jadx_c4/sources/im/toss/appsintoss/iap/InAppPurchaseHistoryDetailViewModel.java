package im.toss.appsintoss.iap;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.appsintoss.iap.model.AppsInTossCashReceipt;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedDetailItem;
import im.toss.appsintoss.iap.model.AppsInTossRefundRequestResult;
import im.toss.appsintoss.iap.usecase.RequestRefundIAPPurchasedItemUseCase;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CloseableUtils;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.IAnimation;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.RuleController;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda26;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda45;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7;
import o.SplitControllersplitInfoList1ExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TrackGroupExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getShine;
import o.getTileModeX;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InAppPurchaseHistoryDetailViewModel extends ViewModel {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final IAuthTabCallback Companion;
    private static char[] onActivityLayout = null;
    private static int onActivityResized = 0;
    public static final int onExtraCallback;
    private static int onMessageChannelReady = 1;
    private static int onMinimized = 0;
    private static int onPostMessage = 1;
    private final getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12> IAuthTabCallback;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private final IAnimation<Boolean> IAuthTabCallback_Parcel;
    private final setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12> ICustomTabsCallback;
    private SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult access000;
    private final getTileModeX<Boolean> access100;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7 asBinder;
    private final setRubIn<RuleController> asInterface;
    private final RequestRefundIAPPurchasedItemUseCase extraCallback;
    private final getTileModeX<Boolean> extraCallbackWithResult;
    private final String getInterfaceDescriptor;
    private final getCornerRadius<RuleController> onExtraCallbackWithResult;
    private final getBorderRadius<Boolean> onNavigationEvent;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 onTransact;
    private final getBorderRadius<Boolean> onWarmupCompleted;
    private final String readTypedObject;
    private final SplitControllersplitInfoList1ExternalSyntheticLambda0 writeTypedObject;

    static {
        IAuthTabCallbackStub();
        Companion = new IAuthTabCallback(null);
        onExtraCallback = 8;
        int i = onMessageChannelReady + 9;
        onActivityResized = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i7 | i4)) | (~(i8 | i4));
        int i10 = ~(i3 | i7);
        int i11 = i4 | i10 | (~(i8 | i5));
        int i12 = i4 + i5 + i6 + ((-393945980) * i2) + (1728320405 * i);
        int i13 = i12 * i12;
        int i14 = ((-1552544754) * i4) + 1566572544 + ((-1100352524) * i5) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i6) + (2076180480 * i2) + ((-877658112) * i) + (214302720 * i13);
        int i15 = ((i4 * (-252835662)) - 192251156) + (i5 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + (i6 * (-252835169)) + (i2 * 1574575612) + (i * 147979147) + (i13 * (-1426456576));
        int i16 = i14 + (i15 * i15 * 2075787264);
        if (i16 != 1) {
            return i16 != 2 ? i16 != 3 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) objArr[0];
        int i17 = 2 % 2;
        int i18 = onMinimized;
        int i19 = i18 + 107;
        onPostMessage = i19 % 128;
        int i20 = i19 % 2;
        getTileModeX<Boolean> gettilemodex = inAppPurchaseHistoryDetailViewModel.access100;
        int i21 = i18 + 93;
        onPostMessage = i21 % 128;
        int i22 = i21 % 2;
        return gettilemodex;
    }

    @Inject
    public InAppPurchaseHistoryDetailViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 safeActivityEmbeddingComponentProviderExternalSyntheticLambda62, @NotNull RequestRefundIAPPurchasedItemUseCase requestRefundIAPPurchasedItemUseCase, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7 safeActivityEmbeddingComponentProviderExternalSyntheticLambda7, @NotNull SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20) throws Throwable {
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda62, "");
        Intrinsics.checkNotNullParameter(requestRefundIAPPurchasedItemUseCase, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(splitControllersplitInfoList1ExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda20, "");
        this.IAuthTabCallbackDefault = safeActivityEmbeddingComponentProviderExternalSyntheticLambda62;
        this.extraCallback = requestRefundIAPPurchasedItemUseCase;
        this.asBinder = safeActivityEmbeddingComponentProviderExternalSyntheticLambda7;
        this.writeTypedObject = splitControllersplitInfoList1ExternalSyntheticLambda0;
        this.onTransact = safeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
        getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12(true, null, null, 6, null));
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent;
        setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12> setrubinOnExtraCallback = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        this.ICustomTabsCallback = setrubinOnExtraCallback;
        getCornerRadius<RuleController> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent(new RuleController(true, null, null, 6, null));
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent2;
        setRubIn<RuleController> setrubinOnExtraCallback2 = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2);
        this.asInterface = setrubinOnExtraCallback2;
        getBorderRadius<Boolean> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onWarmupCompleted = getborderradiusOnWarmupCompleted;
        this.extraCallbackWithResult = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        getBorderRadius<Boolean> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onNavigationEvent = getborderradiusOnWarmupCompleted2;
        this.access100 = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted2);
        this.IAuthTabCallback_Parcel = ycxycx.onWarmupCompleted(setrubinOnExtraCallback, setrubinOnExtraCallback2, new onWarmupCompleted(null));
        String str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("orderId");
        this.readTypedObject = str;
        String str2 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("miniAppName");
        this.IAuthTabCallbackStubProxy = str2;
        String str3 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("deploymentId");
        this.IAuthTabCallbackStub = str3;
        Object[] objArr = new Object[1];
        a(new int[]{0, 6, 0, 3}, false, new byte[]{1, 1, 0, 0, 1, 0}, objArr);
        String str4 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback(((String) objArr[0]).intern());
        if (str4 == null) {
            int i = onPostMessage + 63;
            onMinimized = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            str4 = "requested";
        }
        this.getInterfaceDescriptor = str4;
        onExtraCallbackWithResult("init", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", str), getWrite.IAuthTabCallback("mini_app_name", str2), getWrite.IAuthTabCallback("deployment_id", str3), getWrite.IAuthTabCallback("init_result", str4)}));
        IAuthTabCallback();
        int i4 = onPostMessage + 67;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 IAuthTabCallback(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 43;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20 = inAppPurchaseHistoryDetailViewModel.onTransact;
        int i5 = i2 + 69;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
    }

    public static final /* synthetic */ RequestRefundIAPPurchasedItemUseCase IAuthTabCallbackDefault(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        RequestRefundIAPPurchasedItemUseCase requestRefundIAPPurchasedItemUseCase = inAppPurchaseHistoryDetailViewModel.extraCallback;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 111;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return requestRefundIAPPurchasedItemUseCase;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallbackStub(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized + 43;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        getCornerRadius<RuleController> getcornerradius = inAppPurchaseHistoryDetailViewModel.onExtraCallbackWithResult;
        int i5 = i3 + 87;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius asBinder(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onPostMessage + 119;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12> getcornerradius = inAppPurchaseHistoryDetailViewModel.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return getcornerradius;
    }

    public static final /* synthetic */ getBorderRadius asInterface(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<Boolean> getborderradius = inAppPurchaseHistoryDetailViewModel.onNavigationEvent;
        if (i3 != 0) {
            return getborderradius;
        }
        throw null;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onExtraCallback(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 117;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult = inAppPurchaseHistoryDetailViewModel.access000;
        int i5 = i2 + 91;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 onExtraCallbackWithResult(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onPostMessage + 47;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 safeActivityEmbeddingComponentProviderExternalSyntheticLambda62 = inAppPurchaseHistoryDetailViewModel.IAuthTabCallbackDefault;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda62;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7 safeActivityEmbeddingComponentProviderExternalSyntheticLambda7 = inAppPurchaseHistoryDetailViewModel.asBinder;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda7;
    }

    public static final /* synthetic */ void onNavigationEvent(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, String str, Map map) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 109;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryDetailViewModel.onExtraCallbackWithResult(str, map);
        int i4 = onPostMessage + 1;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ getBorderRadius onTransact(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 1;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<Boolean> getborderradius = inAppPurchaseHistoryDetailViewModel.onWarmupCompleted;
        int i5 = i2 + 117;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ SplitControllersplitInfoList1ExternalSyntheticLambda0 onWarmupCompleted(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized + 59;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0 = inAppPurchaseHistoryDetailViewModel.writeTypedObject;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 53;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return splitControllersplitInfoList1ExternalSyntheticLambda0;
    }

    public final setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12> onTransact() {
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12> setrubin = this.ICustomTabsCallback;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return setrubin;
    }

    public final setRubIn<RuleController> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMinimized + 101;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        setRubIn<RuleController> setrubin = this.asInterface;
        int i5 = i3 + 63;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return setrubin;
    }

    public final getTileModeX<Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage + 103;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        getTileModeX<Boolean> gettilemodex = this.extraCallbackWithResult;
        int i5 = i3 + 63;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    static final class onWarmupCompleted extends SuspendLambda implements getBacktraceNote<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12, RuleController, access13800<? super Boolean>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(3, access13800Var);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12) obj, (RuleController) obj2, (access13800) obj3);
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12 safeActivityEmbeddingComponentProviderExternalSyntheticLambda12, RuleController ruleController, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda12;
            onwarmupcompleted.L$1 = ruleController;
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(Unit.INSTANCE);
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            if (r1.IAuthTabCallback() != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            r7 = im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel.onWarmupCompleted.IAuthTabCallback + 1;
            im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel.onWarmupCompleted.onNavigationEvent = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if ((r7 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r3.onNavigationEvent() != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            r3.onNavigationEvent();
            r7 = null;
            r7.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            return o.access14000.onNavigationEvent(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r7);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12 safeActivityEmbeddingComponentProviderExternalSyntheticLambda12;
            RuleController ruleController;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            boolean z = false;
            if (i2 % 2 != 0) {
                safeActivityEmbeddingComponentProviderExternalSyntheticLambda12 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12) this.L$0;
                ruleController = (RuleController) this.L$1;
                int i3 = 27 / 0;
            } else {
                safeActivityEmbeddingComponentProviderExternalSyntheticLambda12 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12) this.L$0;
                ruleController = (RuleController) this.L$1;
            }
        }
    }

    public final IAnimation<Boolean> asInterface() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 7;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        IAnimation<Boolean> iAnimation = this.IAuthTabCallback_Parcel;
        int i4 = i2 + 49;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return iAnimation;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 73;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return this.readTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 111;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        String str = inAppPurchaseHistoryDetailViewModel.getInterfaceDescriptor;
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        int i6 = i3 + 75;
        onPostMessage = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onTransact = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        private static char[] onNavigationEvent = {32630, 32617, 32626, 32581};
        private static int onExtraCallback = -1184333854;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onWarmupCompleted = true;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 26 / 0;
            }
            int i5 = onTransact + 49;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = InAppPurchaseHistoryDetailViewModel.this.new onNavigationEvent(access13800Var);
            int i2 = onTransact + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onTransact + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object objOnWarmupCompleted;
            AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem;
            int i = 2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = IAuthTabCallback;
                    int i4 = i3 + 83;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 87;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i7 = 85 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                    int i8 = IAuthTabCallback + 51;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    objOnWarmupCompleted = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = InAppPurchaseHistoryDetailViewModel.this;
                    Result.Companion companion = Result.Companion;
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 safeActivityEmbeddingComponentProviderExternalSyntheticLambda62OnExtraCallbackWithResult = InAppPurchaseHistoryDetailViewModel.onExtraCallbackWithResult(inAppPurchaseHistoryDetailViewModel);
                    String strOnExtraCallbackWithResult = inAppPurchaseHistoryDetailViewModel.onExtraCallbackWithResult();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objOnWarmupCompleted = safeActivityEmbeddingComponentProviderExternalSyntheticLambda62OnExtraCallbackWithResult.onWarmupCompleted(strOnExtraCallbackWithResult, this);
                    if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                        return objOnWarmupCompleted2;
                    }
                }
                appsInTossPurchasedDetailItem = (AppsInTossPurchasedDetailItem) objOnWarmupCompleted;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                int i10 = onTransact + 73;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (appsInTossPurchasedDetailItem == null) {
                throw SafeActivityEmbeddingComponentProviderExternalSyntheticLambda26.onExtraCallbackWithResult;
            }
            obj2 = Result.constructor-impl(appsInTossPurchasedDetailItem);
            InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel2 = InAppPurchaseHistoryDetailViewModel.this;
            if (Result.onNavigationEvent(obj2)) {
                AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem2 = (AppsInTossPurchasedDetailItem) obj2;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("order_id", inAppPurchaseHistoryDetailViewModel2.onExtraCallbackWithResult());
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("status", (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1510801612, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem2}, 1510801614, C40Encoder.onExtraCallback()));
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-124, -125, -126, -127}, 126 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
                InAppPurchaseHistoryDetailViewModel.onNavigationEvent(inAppPurchaseHistoryDetailViewModel2, "fetch_purchase_history_success", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), appsInTossPurchasedDetailItem2.extraCallback()), getWrite.IAuthTabCallback("sku", appsInTossPurchasedDetailItem2.IAuthTabCallback_Parcel())}));
                InAppPurchaseHistoryDetailViewModel.asBinder(inAppPurchaseHistoryDetailViewModel2).onWarmupCompleted(new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12(false, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda45.onExtraCallback(appsInTossPurchasedDetailItem2), null));
            }
            InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel3 = InAppPurchaseHistoryDetailViewModel.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                InAppPurchaseHistoryDetailViewModel.onNavigationEvent(inAppPurchaseHistoryDetailViewModel3, "fetch_purchase_history_failure", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", inAppPurchaseHistoryDetailViewModel3.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("error", th.toString()), getWrite.IAuthTabCallback("error_message", th.getMessage())}));
                getCornerRadius getcornerradiusAsBinder = InAppPurchaseHistoryDetailViewModel.asBinder(inAppPurchaseHistoryDetailViewModel3);
                do {
                } while (!getcornerradiusAsBinder.onWarmupCompleted(r3, new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12(false, null, th, 3, null)));
            }
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onNavigationEvent;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $10 + 21;
                    $11 = i5 % 128;
                    if (i5 % i2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 77, (ViewConfiguration.getJumpTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i4 %= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 77, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                    }
                    i2 = 2;
                    j = 0;
                }
                int i6 = $11 + 1;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 75, 16037 - ExpandableListView.getPackedPositionType(0L), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (onWarmupCompleted) {
                int i8 = $11 + 79;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i10 = $11 + 115;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] << iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 63 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 63 - View.resolveSizeAndState(0, 0, 0), 12214 - Drawable.resolveOpacity(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
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
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                try {
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 63, Gravity.getAbsoluteGravity(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr6);
        }
    }

    public final void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 115;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String str = this.readTypedObject;
        if (str == null) {
            onExtraCallbackWithResult("fetch_skipped_order_id_null", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("mini_app_name", this.IAuthTabCallbackStubProxy), getWrite.IAuthTabCallback("deployment_id", this.IAuthTabCallbackStub)}));
            this.IAuthTabCallback.onWarmupCompleted(new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12(false, null, new IllegalArgumentException("orderId is null"), 3, null));
            return;
        }
        onExtraCallbackWithResult("fetch_start", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", str), getWrite.IAuthTabCallback("mini_app_name", this.IAuthTabCallbackStubProxy), getWrite.IAuthTabCallback("deployment_id", this.IAuthTabCallbackStub), getWrite.IAuthTabCallback("init_result", this.getInterfaceDescriptor)}));
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        int i4 = onMinimized + 123;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = InAppPurchaseHistoryDetailViewModel.this.new onExtraCallback(access13800Var);
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {InAppPurchaseHistoryDetailViewModel.this};
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7 safeActivityEmbeddingComponentProviderExternalSyntheticLambda7 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7) InAppPurchaseHistoryDetailViewModel.onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1465268021, objArr, 1465268021, access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                String strOnExtraCallbackWithResult = InAppPurchaseHistoryDetailViewModel.this.onExtraCallbackWithResult();
                this.label = 1;
                objOnNavigationEvent = safeActivityEmbeddingComponentProviderExternalSyntheticLambda7.onNavigationEvent(strOnExtraCallbackWithResult, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 7;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = InAppPurchaseHistoryDetailViewModel.this;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                InAppPurchaseHistoryDetailViewModel.onNavigationEvent(inAppPurchaseHistoryDetailViewModel, "fetch_cash_receipt_success", access8100.onNavigationEvent(getWrite.IAuthTabCallback("order_id", inAppPurchaseHistoryDetailViewModel.onExtraCallbackWithResult())));
                InAppPurchaseHistoryDetailViewModel.IAuthTabCallbackStub(inAppPurchaseHistoryDetailViewModel).onWarmupCompleted(new RuleController(false, (AppsInTossCashReceipt) objOnNavigationEvent, null, 4, null));
            }
            InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel2 = InAppPurchaseHistoryDetailViewModel.this;
            Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
            if (th != null) {
                InAppPurchaseHistoryDetailViewModel.onNavigationEvent(inAppPurchaseHistoryDetailViewModel2, "fetch_cash_receipt_failure", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", inAppPurchaseHistoryDetailViewModel2.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("error", th.toString()), getWrite.IAuthTabCallback("error_message", th.getMessage())}));
                InAppPurchaseHistoryDetailViewModel.IAuthTabCallbackStub(inAppPurchaseHistoryDetailViewModel2).onWarmupCompleted(new RuleController(false, null, th, 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onWarmupCompleted(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = this.readTypedObject;
        if (str2 == null) {
            int i2 = onPostMessage + 29;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("order_id", str2);
        Object[] objArr = new Object[1];
        a(new int[]{6, 6, 195, 5}, true, new byte[]{0, 0, 0, 0, 1, 0}, objArr);
        onExtraCallbackWithResult("request_refund_start", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)}));
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(str2, str, null), 3, (Object) null);
        int i4 = onPostMessage + 41;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $orderId;
        final /* synthetic */ String $reason;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, String str2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$orderId = str;
            this.$reason = str2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = InAppPurchaseHistoryDetailViewModel.this.new onExtraCallbackWithResult(this.$orderId, this.$reason, access13800Var);
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 58 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
        
            if (r14 != r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0156, code lost:
        
            if (r14.emit(r0, r13) == r1) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object obj3;
            String strOnExtraCallbackWithResult;
            Throwable th;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
            } catch (Exception e) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = InAppPurchaseHistoryDetailViewModel.this;
                String str = this.$orderId;
                String str2 = this.$reason;
                Result.Companion companion3 = Result.Companion;
                RequestRefundIAPPurchasedItemUseCase requestRefundIAPPurchasedItemUseCaseIAuthTabCallbackDefault = InAppPurchaseHistoryDetailViewModel.IAuthTabCallbackDefault(inAppPurchaseHistoryDetailViewModel);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = requestRefundIAPPurchasedItemUseCaseIAuthTabCallbackDefault.onExtraCallback(str, str2, this);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        int i3 = IAuthTabCallback + 79;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        return Unit.INSTANCE;
                    }
                    obj3 = this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel2 = InAppPurchaseHistoryDetailViewModel.this;
                    String str3 = this.$orderId;
                    th = Result.exceptionOrNull-impl(obj3);
                    if (th != null) {
                        int i7 = onExtraCallbackWithResult + 77;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        InAppPurchaseHistoryDetailViewModel.onNavigationEvent(inAppPurchaseHistoryDetailViewModel2, "request_refund_failure", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", str3), getWrite.IAuthTabCallback("error", th.toString()), getWrite.IAuthTabCallback("error_message", th.getMessage())}));
                        getBorderRadius getborderradiusOnTransact = InAppPurchaseHistoryDetailViewModel.onTransact(inAppPurchaseHistoryDetailViewModel2);
                        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                        this.L$0 = obj3;
                        this.L$1 = access15400.onNavigationEvent(th);
                        this.I$0 = 0;
                        this.label = 3;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
            }
            obj2 = Result.constructor-impl(obj);
            obj3 = obj2;
            InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel3 = InAppPurchaseHistoryDetailViewModel.this;
            String str4 = this.$orderId;
            if (!(!Result.onNavigationEvent(obj3))) {
                AppsInTossRefundRequestResult appsInTossRefundRequestResult = (AppsInTossRefundRequestResult) obj3;
                if (appsInTossRefundRequestResult != null) {
                    int i9 = onExtraCallbackWithResult + 113;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    strOnExtraCallbackWithResult = appsInTossRefundRequestResult.onExtraCallbackWithResult();
                    int i11 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    strOnExtraCallbackWithResult = null;
                }
                boolean zAreEqual = Intrinsics.areEqual(strOnExtraCallbackWithResult, "REQUESTED");
                InAppPurchaseHistoryDetailViewModel.onNavigationEvent(inAppPurchaseHistoryDetailViewModel3, "request_refund_success", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("order_id", str4), getWrite.IAuthTabCallback("response_status", appsInTossRefundRequestResult != null ? appsInTossRefundRequestResult.onExtraCallbackWithResult() : null), getWrite.IAuthTabCallback("emit_result", access14000.onNavigationEvent(zAreEqual))}));
                getBorderRadius getborderradiusOnTransact2 = InAppPurchaseHistoryDetailViewModel.onTransact(inAppPurchaseHistoryDetailViewModel3);
                Boolean boolOnNavigationEvent2 = access14000.onNavigationEvent(zAreEqual);
                this.L$0 = obj3;
                this.L$1 = access15400.onNavigationEvent(appsInTossRefundRequestResult);
                this.I$0 = 0;
                this.Z$0 = zAreEqual;
                this.label = 2;
                if (getborderradiusOnTransact2.emit(boolOnNavigationEvent2, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel22 = InAppPurchaseHistoryDetailViewModel.this;
            String str32 = this.$orderId;
            th = Result.exceptionOrNull-impl(obj3);
            if (th != null) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onExtraCallbackWithResult("set_resubscribe_item", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("app_name", onextracallbackwithresult.IAuthTabCallback_Parcel()), getWrite.IAuthTabCallback("deployment_id", onextracallbackwithresult.access000()), getWrite.IAuthTabCallback("sku", onextracallbackwithresult.getInterfaceDescriptor())}));
        this.access000 = onextracallbackwithresult;
        int i4 = onPostMessage + 117;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, -1612552418, new Object[]{this, "start_listening_for_product_grant", null, 2, null}, 1612552420, iIAuthTabCallback2);
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new asBinder(this, (access13800) null), 3, (Object) null);
        int i2 = onMinimized + 93;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onActivityLayout;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.getDefaultSize(0, 0)), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 34, 14239 - Color.green(0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i8 = $10 + 125;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $11 + 11;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), TextUtils.lastIndexOf("", '0', 0, 0) + 30, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = $10 + 45;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10934), 65 - TextUtils.indexOf("", "", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 49467), Drawable.resolveOpacity(0, 0) + 70, View.getDefaultSize(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i15 = $11 + 49;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 % i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 >> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i16 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i16, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i16);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $11 + 81;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 >> trackGroupExternalSyntheticLambda0.onNavigationEvent) >>> 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent / 0;
                } else {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i18 = $11 + 21;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i20 = $10 + 95;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) objArr[0];
        String str = (String) objArr[1];
        Map<String, ? extends Object> mapOnNavigationEvent = (Map) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        if ((iIntValue & 2) != 0) {
            mapOnNavigationEvent = access8100.onNavigationEvent();
            int i2 = onPostMessage + 71;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
        }
        inAppPurchaseHistoryDetailViewModel.onExtraCallbackWithResult(str, mapOnNavigationEvent);
        int i4 = onMinimized + 109;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onExtraCallbackWithResult(String str, Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "apps_in_toss_purchase_history_detail", (String) null, access8100.onWarmupCompleted(access8100.onNavigationEvent(getWrite.IAuthTabCallback("event", str)), map), (String) null, false, (String) null, 58, (Object) null);
        int i4 = onMinimized + 37;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7 onNavigationEvent(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7) onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, -1465268021, new Object[]{inAppPurchaseHistoryDetailViewModel}, 1465268021, iIAuthTabCallback2);
    }

    static /* synthetic */ void onExtraCallback(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, String str, Map map, int i, Object obj) {
        Object[] objArr = {inAppPurchaseHistoryDetailViewModel, str, map, Integer.valueOf(i), obj};
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, -1612552418, objArr, 1612552420, iIAuthTabCallback2);
    }

    public final String onWarmupCompleted() {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (String) onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, 25361969, new Object[]{this}, -25361966, iIAuthTabCallback2);
    }

    public final getTileModeX<Boolean> onExtraCallback() {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return (getTileModeX) onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, 691326277, new Object[]{this}, -691326276, iIAuthTabCallback2);
    }

    static void IAuthTabCallbackStub() {
        onActivityLayout = new char[]{27252, 27198, 27198, 27197, 27173, 27170, 27351, 27514, 27491, 27496, 27488, 27517};
    }
}
