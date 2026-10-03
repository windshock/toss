package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.inventory_sdk.model.InventoryAdDto;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.API_GetLastError;
import o.CERT_DecryptPrikey;
import o.CERT_GetAuthorityInformationAccess;
import o.CERT_GetAuthorityKeyIdentifierInfo;
import o.SetDetectableSize;
import o.UST_GET_APPLICENSEINFO;
import o.UST_SET_ANDROIDINFO;
import o.access;
import o.androidustk;
import o.getKeyB;
import o.getKeyF;
import o.packageName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_GET_APPLICENSEINFO {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int[] ICustomTabsCallbackStubProxy = null;
    private static int ICustomTabsCallback_Parcel = 0;
    private static int ICustomTabsService = 1;
    private static int extraCommand = 1;
    public static final int onNavigationEvent;
    private static int onRelationshipValidationResult;
    private final HashMap<String, captureComplete> IAuthTabCallback;
    private final InventoryAdManager IAuthTabCallbackDefault;
    private final getIv6 IAuthTabCallbackStub;
    private final List<enableInteropViewManagerClassLookUpOptimizationIOS> IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private Date ICustomTabsCallback;
    private getNativeModuleIteratorReactAndroid_release ICustomTabsCallbackDefault;
    private handleCxxError ICustomTabsCallbackStub;
    private boolean access000;
    private UST_SET_ANDROIDINFO access100;
    private final CERT_DecryptPrikey asBinder;
    private swapLeftAndRightInRTL asInterface;
    private final int extraCallback;
    private Date extraCallbackWithResult;
    private final IAuthTabCallback getInterfaceDescriptor;
    private packageName onActivityLayout;
    private CERT_GetAuthorityInformationAccess onActivityResized;
    private final ResultUtil[] onExtraCallback;
    private final List<captureComplete> onExtraCallbackWithResult;
    private final API_GetLastError onMessageChannelReady;
    private onDisclaimerClick onMinimized;
    private CERT_GetAuthorityKeyIdentifierInfo onPostMessage;
    private ResultUtil onTransact;
    private dumpSampledTraceToFile onUnminimized;
    private final Context onWarmupCompleted;
    private final getKeyF readTypedObject;
    private OperationHelperV3 writeTypedObject;

    public interface IAuthTabCallback extends CERT_DecryptPrikey.onWarmupCompleted, getKeyF.onExtraCallback, API_GetLastError.onExtraCallback, getKeyB.onWarmupCompleted, packageName.onNavigationEvent, CERT_GetAuthorityKeyIdentifierInfo.onExtraCallbackWithResult, CERT_GetAuthorityInformationAccess.onNavigationEvent, androidustk.onExtraCallbackWithResult {
        void IEngagementSignalsCallbackStub();

        void onExtraCallbackWithResult(@NotNull ResultUtil resultUtil);

        void onGreatestScrollPercentageIncreased();
    }

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[ResultUtil.values().length];
            try {
                iArr[ResultUtil.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultUtil.DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResultUtil.WITHDRAWAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
        }
    }

    static {
        IAuthTabCallbackStubProxy();
        Companion = new onWarmupCompleted(null);
        onNavigationEvent = 8;
        int i = ICustomTabsCallback_Parcel + 121;
        extraCommand = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback onextracallback, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 29;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(onextracallback, setDetectableSize);
        }
        onWarmupCompleted(onextracallback, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i) | i7);
        int i9 = i6 | i8 | (~(i5 | i));
        int i10 = (~(i | i6)) | (~(i7 | i)) | (~(i7 | i6));
        int i11 = i6 + i5 + i4 + (1351532378 * i2) + (1237199896 * i3);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i6) + 1314914304 + ((-491389116) * i5) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i4) + ((-1818230784) * i2) + ((-914358272) * i3) + ((-2051670016) * i12);
        int i14 = ((i6 * 406040238) - 634933780) + (i5 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i4 * 406039561) + (i2 * 1283666474) + (i3 * 1712827608) + (i12 * (-77201408));
        switch (i13 + (i14 * i14 * 1831469056)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                UST_GET_APPLICENSEINFO ust_get_applicenseinfo = (UST_GET_APPLICENSEINFO) objArr[0];
                final CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback onextracallback = (CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback) objArr[1];
                int i15 = 2 % 2;
                Intrinsics.checkNotNullParameter(onextracallback, "");
                ust_get_applicenseinfo.onPostMessage = new CERT_GetAuthorityKeyIdentifierInfo(ust_get_applicenseinfo.onWarmupCompleted, ust_get_applicenseinfo.getInterfaceDescriptor, onextracallback);
                ConvertByteArrayToFloatArray.onExtraCallback(1246677L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.viewmodel.TossAccountViewModel$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return UST_GET_APPLICENSEINFO.onExtraCallback(onextracallback, (SetDetectableSize) obj);
                    }
                }, 14, (Object) null);
                int i16 = ICustomTabsService + 99;
                onRelationshipValidationResult = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 51;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(list);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(list);
        int i3 = ICustomTabsService + 61;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    public static /* synthetic */ boolean onNavigationEvent(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 25;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(list);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(list);
        int i3 = ICustomTabsService + 71;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    public UST_GET_APPLICENSEINFO(@NotNull onDisclaimerClick ondisclaimerclick, @Nullable getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release, @NotNull Context context, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull InventoryAdManager inventoryAdManager) {
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(inventoryAdManager, "");
        this.onMinimized = ondisclaimerclick;
        this.ICustomTabsCallbackDefault = getnativemoduleiteratorreactandroid_release;
        this.onWarmupCompleted = context;
        this.getInterfaceDescriptor = iAuthTabCallback;
        this.IAuthTabCallbackDefault = inventoryAdManager;
        this.asBinder = new CERT_DecryptPrikey(context, iAuthTabCallback, this.onMinimized, this.ICustomTabsCallbackDefault);
        this.readTypedObject = new getKeyF(iAuthTabCallback, this.onMinimized);
        this.onMessageChannelReady = new API_GetLastError(iAuthTabCallback, this.onMinimized);
        this.IAuthTabCallbackStub = new getIv6(context, iAuthTabCallback, false, 4, null);
        this.writeTypedObject = OperationHelperV3.DONE;
        this.extraCallback = 1;
        this.extraCallbackWithResult = getInterfaceDescriptor();
        this.ICustomTabsCallback = zzaj.onWarmupCompleted().asBinder();
        this.onExtraCallback = ResultUtil.Companion.onNavigationEvent();
        this.onTransact = ResultUtil.ALL;
        this.IAuthTabCallbackStubProxy = new ArrayList();
        this.IAuthTabCallback = new HashMap<>();
        this.onExtraCallbackWithResult = new ArrayList();
    }

    public final void onExtraCallbackWithResult(@NotNull OperationHelperV3 operationHelperV3) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 17;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(operationHelperV3, "");
        this.writeTypedObject = operationHelperV3;
        int i4 = ICustomTabsService + 3;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Date asInterface() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 21;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        UST_GET_APPLICENSEINFO ust_get_applicenseinfo = (UST_GET_APPLICENSEINFO) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 77;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        ResultUtil[] resultUtilArr = ust_get_applicenseinfo.onExtraCallback;
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
        int i6 = i3 + 19;
        ICustomTabsService = i6 % 128;
        int i7 = i6 % 2;
        return resultUtilArr;
    }

    public final ResultUtil onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 65;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ResultUtil resultUtil = this.onTransact;
        int i4 = i2 + 119;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return resultUtil;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onExtraCallback(@NotNull ResultUtil resultUtil) throws NoWhenBranchMatchedException {
        String string;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resultUtil, "");
        if (this.onTransact != resultUtil) {
            this.onTransact = resultUtil;
            getIv6 getiv6 = this.IAuthTabCallbackStub;
            if (!(!this.onMinimized.ICustomTabsCallbackStubProxy())) {
                int i2 = onExtraCallback.onNavigationEvent[resultUtil.ordinal()];
                if (i2 != 1) {
                    int i3 = ICustomTabsService;
                    int i4 = i3 + 99;
                    onRelationshipValidationResult = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 == 2) {
                        string = this.onWarmupCompleted.getString(R.string.filter_teens_savingbox_deposit);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i6 = i3 + 67;
                        onRelationshipValidationResult = i6 % 128;
                        int i7 = i6 % 2;
                        string = this.onWarmupCompleted.getString(R.string.filter_teens_savingbox_withdrawal);
                    }
                } else {
                    string = this.onWarmupCompleted.getString(R.string.transfer_history);
                }
                Intrinsics.checkNotNull(string);
            } else {
                string = this.onWarmupCompleted.getString(resultUtil.getTypeTextResId());
                Intrinsics.checkNotNull(string);
                int i8 = ICustomTabsService + 103;
                onRelationshipValidationResult = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 4;
                }
            }
            getiv6.onWarmupCompleted(string);
            this.getInterfaceDescriptor.onExtraCallbackWithResult(resultUtil);
            onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, lt.40.onExtraCallbackWithResult(), -2062011571, 2062011574);
            int i10 = ICustomTabsService + 79;
            onRelationshipValidationResult = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public final void onExtraCallback(@Nullable dumpSampledTraceToFile dumpsampledtracetofile) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 53;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onUnminimized = dumpsampledtracetofile;
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, -2062011571, 2062011574);
            int i3 = 61 / 0;
        } else {
            this.onUnminimized = dumpsampledtracetofile;
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
            onExtraCallbackWithResult(iOnExtraCallbackWithResult3, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult4, -2062011571, 2062011574);
        }
        int i4 = onRelationshipValidationResult + 7;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 81;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return this.access000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<enableInteropViewManagerClassLookUpOptimizationIOS> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 105;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        List<enableInteropViewManagerClassLookUpOptimizationIOS> list = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 87;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull Date date, @NotNull captureComplete capturecomplete, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(capturecomplete, "");
        if (z) {
            int i2 = ICustomTabsService + 23;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallback.clear();
                int i3 = 43 / 0;
            } else {
                this.IAuthTabCallback.clear();
            }
        }
        this.IAuthTabCallback.put(CommonModule_closeView.onWarmupCompleted.writeTypedObject().format(date), capturecomplete);
        this.onExtraCallbackWithResult.clear();
        List<captureComplete> list = this.onExtraCallbackWithResult;
        SortedMap sortedMapOnTransact = access8100.onTransact(this.IAuthTabCallback);
        ArrayList arrayList = new ArrayList(sortedMapOnTransact.size());
        Iterator it = sortedMapOnTransact.entrySet().iterator();
        int i4 = onRelationshipValidationResult + 101;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = onRelationshipValidationResult + 109;
            ICustomTabsService = i6 % 128;
            if (i6 % 2 == 0) {
                arrayList.add((captureComplete) ((Map.Entry) it.next()).getValue());
                int i7 = 83 / 0;
            } else {
                arrayList.add((captureComplete) ((Map.Entry) it.next()).getValue());
            }
        }
        list.addAll(CollectionsKt.reversed(arrayList));
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, -2062011571, 2062011574);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        UST_GET_APPLICENSEINFO ust_get_applicenseinfo = (UST_GET_APPLICENSEINFO) objArr[0];
        if (ust_get_applicenseinfo.onMinimized.access000() && ust_get_applicenseinfo.onUnminimized == null) {
            return null;
        }
        if (ust_get_applicenseinfo.onMinimized.IAuthTabCallbackStubProxy().after(ust_get_applicenseinfo.extraCallbackWithResult)) {
            ust_get_applicenseinfo.IAuthTabCallback_Parcel = true;
        }
        synchronized (ust_get_applicenseinfo.IAuthTabCallbackStubProxy) {
            ust_get_applicenseinfo.IAuthTabCallbackStubProxy.clear();
            ust_get_applicenseinfo.IAuthTabCallbackStubProxy.addAll(ust_get_applicenseinfo.access100());
            List<enableInteropViewManagerClassLookUpOptimizationIOS> listExtraCallbackWithResult = ust_get_applicenseinfo.extraCallbackWithResult();
            Iterator<T> it = listExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                ust_get_applicenseinfo.IAuthTabCallbackStubProxy.add((enableInteropViewManagerClassLookUpOptimizationIOS) it.next());
            }
            if (ust_get_applicenseinfo.IAuthTabCallback_Parcel) {
                if (listExtraCallbackWithResult.isEmpty()) {
                    ust_get_applicenseinfo.IAuthTabCallbackStubProxy.add(new ZLog(ust_get_applicenseinfo.onWarmupCompleted, !ust_get_applicenseinfo.onExtraCallbackWithResult.isEmpty() ? ust_get_applicenseinfo.onTransact : null));
                } else {
                    ust_get_applicenseinfo.IAuthTabCallbackStubProxy.add(new setMaxLength());
                }
            } else if (listExtraCallbackWithResult.isEmpty()) {
                ust_get_applicenseinfo.IAuthTabCallbackStubProxy.add(new runSystemCommand(null, 1, null));
            }
            Unit unit = Unit.INSTANCE;
        }
        ust_get_applicenseinfo.writeTypedObject = OperationHelperV3.DONE;
        ust_get_applicenseinfo.getInterfaceDescriptor.IEngagementSignalsCallbackStub();
        return null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ICustomTabsCallbackStubProxy;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = $11 + 5;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getEdgeSlop() >> 16) + 72, 8847 - TextUtils.lastIndexOf("", '0', 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ICustomTabsCallbackStubProxy;
        if (iArr5 != null) {
            int i10 = $11 + 37;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(i4), 72 - KeyEvent.normalizeMetaState(i4), TextUtils.getTrimmedLength("") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i12++;
                    i4 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i13 = i4;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i13] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $11 + 63;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16799468), Drawable.resolveOpacity(0, 0) + 39, 10301 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14 += 75;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22251), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 39, View.MeasureSpec.getMode(0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i14++;
                }
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 3985), 78 - (Process.myPid() >> 22), TextUtils.getCapsMode("", 0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final boolean onWarmupCompleted(List list) {
        int i = 2 % 2;
        boolean zAdd = list.add(new line(1001, false, false, 6, null));
        int i2 = ICustomTabsService + 99;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        return zAdd;
    }

    private static final boolean IAuthTabCallback(List list) {
        int i = 2 % 2;
        boolean zAdd = list.add(new line(1001, false, true, 2, null));
        int i2 = onRelationshipValidationResult + 45;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        return zAdd;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<o.enableInteropViewManagerClassLookUpOptimizationIOS> access100() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_GET_APPLICENSEINFO.access100():java.util.List");
    }

    private final List<enableInteropViewManagerClassLookUpOptimizationIOS> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = zzaj.onWarmupCompleted().onNavigationEvent().get(1);
        ArrayList<NativeShareModuleSpec> arrayList = new ArrayList();
        Iterator<T> it = this.onExtraCallbackWithResult.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                String strIAuthTabCallback = "";
                for (NativeShareModuleSpec nativeShareModuleSpec : arrayList) {
                    ArrayList<NativeJSCHeapCaptureSpec> arrayListOnNavigationEvent = nativeShareModuleSpec.onNavigationEvent();
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = onRelationshipValidationResult + 117;
                    ICustomTabsService = i3 % 128;
                    int i4 = i3 % 2;
                    for (Object obj2 : arrayListOnNavigationEvent) {
                        NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec = (NativeJSCHeapCaptureSpec) obj2;
                        int i5 = onExtraCallback.onNavigationEvent[this.onTransact.ordinal()];
                        if (i5 != 2) {
                            if (i5 != 3 || nativeJSCHeapCaptureSpec.asBinder() == getFormatWidth.EXPENSE) {
                                arrayList3.add(obj2);
                            }
                        } else if (nativeJSCHeapCaptureSpec.asBinder() == getFormatWidth.INCOME) {
                            arrayList3.add(obj2);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if ((!Intrinsics.areEqual(strIAuthTabCallback, nativeShareModuleSpec.IAuthTabCallback())) && !StringsKt.startsWith$default(nativeShareModuleSpec.IAuthTabCallback(), String.valueOf(i2), false, 2, (Object) null)) {
                            arrayList2.add(new androidId(nativeShareModuleSpec.IAuthTabCallback(), nativeShareModuleSpec.onWarmupCompleted()));
                            strIAuthTabCallback = nativeShareModuleSpec.IAuthTabCallback();
                        }
                        arrayList2.add(new setTimeVisible(nativeShareModuleSpec.IAuthTabCallback(), nativeShareModuleSpec.onWarmupCompleted()));
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        int i6 = ICustomTabsService + 123;
                        onRelationshipValidationResult = i6 % 128;
                        int i7 = i6 % 2;
                        while (it2.hasNext()) {
                            arrayList4.add(new UST_CHECK_UNISIGN((NativeJSCHeapCaptureSpec) it2.next()));
                        }
                        arrayList2.addAll(arrayList4);
                    }
                }
                return arrayList2;
            }
            int i8 = ICustomTabsService + 75;
            onRelationshipValidationResult = i8 % 128;
            if (i8 % 2 != 0) {
                arrayList.addAll(((captureComplete) it.next()).onWarmupCompleted());
                obj.hashCode();
                throw null;
            }
            arrayList.addAll(((captureComplete) it.next()).onWarmupCompleted());
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ArrayList arrayList;
        UST_GET_APPLICENSEINFO ust_get_applicenseinfo = (UST_GET_APPLICENSEINFO) objArr[0];
        synchronized (ust_get_applicenseinfo.onExtraCallbackWithResult) {
            List<captureComplete> list = ust_get_applicenseinfo.onExtraCallbackWithResult;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((captureComplete) it.next()).onWarmupCompleted());
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList3, ((NativeShareModuleSpec) it2.next()).onNavigationEvent());
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList3) {
                NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec = (NativeJSCHeapCaptureSpec) obj;
                int i = onExtraCallback.onNavigationEvent[ust_get_applicenseinfo.onTransact.ordinal()];
                if (i == 2) {
                    if (nativeJSCHeapCaptureSpec.asBinder() == getFormatWidth.INCOME) {
                        arrayList.add(obj);
                    }
                } else if (i != 3 || nativeJSCHeapCaptureSpec.asBinder() == getFormatWidth.EXPENSE) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        if (((java.util.List) onExtraCallbackWithResult(r6, com.bytedance.sdk.openadsdk.wwx.lt.40.onExtraCallbackWithResult(), com.bytedance.sdk.openadsdk.wwx.lt.40.onExtraCallbackWithResult(), new java.lang.Object[]{r1}, r10, 755733084, -755733084)).size() < 5) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackDefault(java.lang.Object[] r13) {
        /*
            r0 = 0
            r1 = r13[r0]
            o.UST_GET_APPLICENSEINFO r1 = (o.UST_GET_APPLICENSEINFO) r1
            r2 = 1
            r13 = r13[r2]
            o.captureComplete r13 = (o.captureComplete) r13
            r3 = 2
            int r4 = r3 % r3
            int r4 = o.UST_GET_APPLICENSEINFO.onRelationshipValidationResult
            int r4 = r4 + 25
            int r5 = r4 % 128
            o.UST_GET_APPLICENSEINFO.ICustomTabsService = r5
            int r4 = r4 % r3
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            boolean r4 = r1.onExtraCallbackWithResult()
            if (r4 == 0) goto L73
            int r4 = o.UST_GET_APPLICENSEINFO.ICustomTabsService
            int r4 = r4 + 71
            int r5 = r4 % 128
            o.UST_GET_APPLICENSEINFO.onRelationshipValidationResult = r5
            int r4 = r4 % r3
            r5 = 0
            java.util.ArrayList r13 = r13.onWarmupCompleted()
            if (r4 != 0) goto L6f
            boolean r13 = r13.isEmpty()
            if (r13 == r2) goto L5e
            java.lang.Object[] r9 = new java.lang.Object[]{r1}
            int r6 = com.bytedance.sdk.openadsdk.wwx.lt.40.onExtraCallbackWithResult()
            int r10 = com.bytedance.sdk.openadsdk.wwx.lt.40.onExtraCallbackWithResult()
            int r7 = com.bytedance.sdk.openadsdk.wwx.lt.40.onExtraCallbackWithResult()
            int r8 = com.bytedance.sdk.openadsdk.wwx.lt.40.onExtraCallbackWithResult()
            r12 = -755733084(0xffffffffd2f46da4, float:-5.2490574E11)
            r11 = 755733084(0x2d0b925c, float:7.9337335E-12)
            java.lang.Object r13 = onExtraCallbackWithResult(r6, r7, r8, r9, r10, r11, r12)
            java.util.List r13 = (java.util.List) r13
            int r13 = r13.size()
            r1 = 5
            if (r13 >= r1) goto L73
        L5e:
            int r13 = o.UST_GET_APPLICENSEINFO.ICustomTabsService
            int r13 = r13 + 3
            int r0 = r13 % 128
            o.UST_GET_APPLICENSEINFO.onRelationshipValidationResult = r0
            int r13 = r13 % r3
            if (r13 != 0) goto L6e
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            return r13
        L6e:
            throw r5
        L6f:
            r13.isEmpty()
            throw r5
        L73:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_GET_APPLICENSEINFO.IAuthTabCallbackDefault(java.lang.Object[]):java.lang.Object");
    }

    public final void onNavigationEvent(@NotNull UST_SET_ANDROIDINFO.onExtraCallback onextracallback, @Nullable InventoryAdDto inventoryAdDto) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.access100 = new UST_SET_ANDROIDINFO(onextracallback, inventoryAdDto);
        int i2 = ICustomTabsService + 97;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onNavigationEvent(@Nullable InventoryAdDto inventoryAdDto) {
        UST_SET_ANDROIDINFO ust_set_androidinfo;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 121;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        if (i2 % 2 != 0) {
            ust_set_androidinfo = this.access100;
            int i4 = 20 / 0;
            if (ust_set_androidinfo == null) {
                return;
            }
        } else {
            ust_set_androidinfo = this.access100;
            if (ust_set_androidinfo == null) {
                return;
            }
        }
        int i5 = i3 + 77;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        ust_set_androidinfo.onExtraCallback(inventoryAdDto);
    }

    public static /* synthetic */ void onExtraCallback(UST_GET_APPLICENSEINFO ust_get_applicenseinfo, Long l, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 67;
        int i4 = i3 % 128;
        onRelationshipValidationResult = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 39;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i4 + 93;
            ICustomTabsService = i8 % 128;
            int i9 = i8 % 2;
            l = null;
        }
        ust_get_applicenseinfo.onExtraCallbackWithResult(l);
    }

    public final void onExtraCallbackWithResult(@Nullable Long l) {
        int i = 2 % 2;
        this.onActivityLayout = new packageName(this.onWarmupCompleted, this.getInterfaceDescriptor, l);
        int i2 = ICustomTabsService + 19;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback onextracallback, SetDetectableSize setDetectableSize) throws Throwable {
        String lowerCase;
        Object obj;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 125;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            lowerCase = onextracallback.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            Object[] objArr = new Object[1];
            a(new int[]{1997636597, -430651691}, 2 - Color.green(0), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            lowerCase = onextracallback.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            Object[] objArr2 = new Object[1];
            a(new int[]{1997636597, -430651691}, Color.green(0) + 4, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), lowerCase);
        return Unit.INSTANCE;
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onActivityResized = new CERT_GetAuthorityInformationAccess(this.getInterfaceDescriptor, str, str2);
        int i2 = onRelationshipValidationResult + 123;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onWarmupCompleted(@NotNull onDisclaimerClick ondisclaimerclick) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 125;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
        this.onMinimized = ondisclaimerclick;
        this.asBinder.onNavigationEvent(ondisclaimerclick);
        int i4 = ICustomTabsService + 57;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull handleCxxError handlecxxerror) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 35;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(handlecxxerror, "");
        this.ICustomTabsCallbackStub = handlecxxerror;
        this.asBinder.onNavigationEvent(handlecxxerror);
        int i4 = ICustomTabsService + 51;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@Nullable getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 53;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.ICustomTabsCallbackDefault = getnativemoduleiteratorreactandroid_release;
            this.asBinder.IAuthTabCallback(getnativemoduleiteratorreactandroid_release);
            int i3 = ICustomTabsService + 29;
            onRelationshipValidationResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.ICustomTabsCallbackDefault = getnativemoduleiteratorreactandroid_release;
        this.asBinder.IAuthTabCallback(getnativemoduleiteratorreactandroid_release);
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        UST_GET_APPLICENSEINFO ust_get_applicenseinfo = (UST_GET_APPLICENSEINFO) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = ICustomTabsService + 3;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ust_get_applicenseinfo.asBinder.onWarmupCompleted(iIntValue);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsService + 63;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void IAuthTabCallback(@NotNull swapLeftAndRightInRTL swapleftandrightinrtl) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 89;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(swapleftandrightinrtl, "");
        this.asInterface = swapleftandrightinrtl;
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, -2062011571, 2062011574);
        int i4 = onRelationshipValidationResult + 73;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 55;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onTransact();
        UST_SET_ANDROIDINFO ust_set_androidinfo = this.access100;
        zzdt spaceId = null;
        if (ust_set_androidinfo != null) {
            int i4 = onRelationshipValidationResult + 75;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 != 0) {
                UST_SET_ANDROIDINFO.onExtraCallback onextracallbackOnNavigationEvent = ust_set_androidinfo.onNavigationEvent();
                if (onextracallbackOnNavigationEvent != null) {
                    spaceId = onextracallbackOnNavigationEvent.getSpaceId();
                }
            } else {
                ust_set_androidinfo.onNavigationEvent();
                throw null;
            }
        }
        if (spaceId != null) {
            int i5 = ICustomTabsService + 9;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            this.IAuthTabCallbackDefault.asBinder();
            if (i6 != 0) {
                int i7 = 86 / 0;
            }
        }
    }

    public final void onTransact() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 101;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallback();
            this.getInterfaceDescriptor.onGreatestScrollPercentageIncreased();
            int i3 = 23 / 0;
        } else {
            ICustomTabsCallback();
            this.getInterfaceDescriptor.onGreatestScrollPercentageIncreased();
        }
        int i4 = onRelationshipValidationResult + 101;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    private final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 23;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
            if (!this.onMinimized.access000()) {
                return true;
            }
        } else if (!this.onMinimized.access000()) {
            return true;
        }
        int i4 = ICustomTabsService + 5;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return !writeTypedObject();
        }
        writeTypedObject();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 1;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEmpty = this.onExtraCallbackWithResult.isEmpty();
        int i4 = ICustomTabsService + 5;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsEmpty;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onNavigationEvent() {
        int size;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 113;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            size = this.IAuthTabCallbackStubProxy.size();
            int i3 = 59 / 0;
        } else {
            size = this.IAuthTabCallbackStubProxy.size();
        }
        int i4 = onRelationshipValidationResult + 37;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return size;
        }
        throw null;
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 63;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStubProxy.clear();
        this.extraCallbackWithResult = getInterfaceDescriptor();
        this.ICustomTabsCallback = zzaj.onWarmupCompleted().asBinder();
        this.IAuthTabCallback_Parcel = false;
        int i4 = ICustomTabsService + 47;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final Date getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 87;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        commonTestFlag commontestflag = commonTestFlag.onExtraCallback;
        Calendar calendarOnWarmupCompleted = zzaj.onWarmupCompleted().onWarmupCompleted(commontestflag.IAuthTabCallbackDefault(zzaj.onWarmupCompleted().asBinder()));
        calendarOnWarmupCompleted.add(2, -(this.extraCallback - 1));
        Date time = calendarOnWarmupCompleted.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        Date dateIAuthTabCallbackDefault = commontestflag.IAuthTabCallbackDefault(time);
        int i4 = onRelationshipValidationResult + 61;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return dateIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UST_GET_APPLICENSEINFO ust_get_applicenseinfo = (UST_GET_APPLICENSEINFO) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 15;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        commonTestFlag commontestflag = commonTestFlag.onExtraCallback;
        Calendar calendarOnWarmupCompleted = zzaj.onWarmupCompleted().onWarmupCompleted(commontestflag.IAuthTabCallbackDefault(ust_get_applicenseinfo.extraCallbackWithResult));
        calendarOnWarmupCompleted.add(14, -1);
        Unit unit = Unit.INSTANCE;
        Date time = calendarOnWarmupCompleted.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        ust_get_applicenseinfo.ICustomTabsCallback = (Date) commonTestFlag.onExtraCallback(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -1110069513, new Object[]{commontestflag, time}, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1110069513, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        Calendar calendarOnWarmupCompleted2 = zzaj.onWarmupCompleted().onWarmupCompleted(commontestflag.IAuthTabCallbackDefault(ust_get_applicenseinfo.extraCallbackWithResult));
        calendarOnWarmupCompleted2.add(2, -ust_get_applicenseinfo.extraCallback);
        Date time2 = calendarOnWarmupCompleted2.getTime();
        Intrinsics.checkNotNullExpressionValue(time2, "");
        ust_get_applicenseinfo.extraCallbackWithResult = commontestflag.IAuthTabCallbackDefault(time2);
        if (!(!ust_get_applicenseinfo.ICustomTabsCallback.after(zzaj.onWarmupCompleted().asBinder()))) {
            ust_get_applicenseinfo.ICustomTabsCallback = zzaj.onWarmupCompleted().asBinder();
        }
        int i4 = ICustomTabsService + 39;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 33;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.writeTypedObject.isFetching() || this.IAuthTabCallback_Parcel) {
            return false;
        }
        int i4 = ICustomTabsService + 61;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ boolean onExtraCallback(List list) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{list}, iOnExtraCallbackWithResult2, -2132456232, 2132456233)).booleanValue();
    }

    private final List<NativeJSCHeapCaptureSpec> access000() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (List) onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, 755733084, -755733084);
    }

    public final ResultUtil[] onExtraCallback() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (ResultUtil[]) onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, 647286213, -647286209);
    }

    public final void asBinder() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, -1928380341, 1928380346);
    }

    public final void onExtraCallbackWithResult(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult(), -521236882, 521236888);
    }

    public final void IAuthTabCallback(@NotNull CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback onextracallback) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this, onextracallback}, iOnExtraCallbackWithResult2, -1254628075, 1254628077);
    }

    public final boolean onExtraCallbackWithResult(@NotNull captureComplete capturecomplete) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this, capturecomplete}, iOnExtraCallbackWithResult2, -416831501, 416831508)).booleanValue();
    }

    public final void IAuthTabCallback_Parcel() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, -2062011571, 2062011574);
    }

    static void IAuthTabCallbackStubProxy() {
        ICustomTabsCallbackStubProxy = new int[]{1788875721, 2061619553, -2005504497, 546715587, 190807551, -728216410, -380707439, 1533323354, 916167141, 455097965, -486274888, 974419685, -942712322, -1607260645, -1148701091, -194420099, -1503432391, 28385854};
    }
}
