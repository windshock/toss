package o;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.WebResourceResponseModel;
import o.createFileLoader;
import o.setAdUnitIds;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.DailySyncReq;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createFileLoader {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy IAuthTabCallback;
    private static final Lazy IAuthTabCallbackDefault;
    private static final Lazy IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char[] IAuthTabCallback_Parcel = null;
    private static char access000 = 0;
    private static int access100 = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 0;
    public static final int onExtraCallback;
    public static final createFileLoader onExtraCallbackWithResult;
    private static final findResAndMsg onNavigationEvent;
    private static String onTransact = null;
    private static final Lazy onWarmupCompleted;
    private static int writeTypedObject = 1;

    static final class onExtraCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = createFileLoader.onExtraCallback(createFileLoader.this, null, null, null, this);
            return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Result.IAuthTabCallback(objOnExtraCallback);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return createFileLoader.this.onExtraCallback(0, this);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th, JSBundleLoaderCompanion jSBundleLoaderCompanion) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(th, jSBundleLoaderCompanion);
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ setAdUnitIds IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        setAdUnitIds setadunitids = (setAdUnitIds) onExtraCallbackWithResult(1925097626, -1925097622, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[0]);
        int i4 = IAuthTabCallbackStubProxy + 41;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return setadunitids;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ JSBundleLoaderDelegate onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            writeTypedObject();
            throw null;
        }
        JSBundleLoaderDelegate jSBundleLoaderDelegateWriteTypedObject = writeTypedObject();
        int i3 = access100 + 65;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return jSBundleLoaderDelegateWriteTypedObject;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~(i | i2 | i4);
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = ~i4;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i + i2 + i5 + (105149790 * i3) + ((-719480883) * i6);
        int i15 = i14 * i14;
        int i16 = (i * (-424837635)) + 281018368 + ((-424837635) * i2) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i5) + ((-654311424) * i3) + (1702887424 * i6) + ((-155189248) * i15);
        int i17 = (i * 910058005) + 1460508013 + (i2 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i5 * 910058489) + (i3 * (-759332242)) + (i6 * (-1121784475)) + (i15 * 1086324736);
        int i18 = i16 + (i17 * i17 * (-1925185536));
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        if (i18 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 5) {
            return onExtraCallbackWithResult(objArr);
        }
        final String str = (String) objArr[1];
        int i19 = 2 % 2;
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        final long jOnWarmupCompleted = setCommandLine.onWarmupCompleted(2, setRevision.MINUTES);
        JSBundleLoaderDelegate jSBundleLoaderDelegate = new JSBundleLoaderDelegate(onNavigationEvent, null, jOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.pedometer.PedometerSyncHelper$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                String str2 = str;
                Long lValueOf = Long.valueOf(jOnWarmupCompleted);
                int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                return (Unit) createFileLoader.onExtraCallbackWithResult(-615826683, 615826688, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{str2, lValueOf, (WebResourceResponseModel) obj});
            }
        }, 2, null);
        int i20 = access100 + 107;
        IAuthTabCallbackStubProxy = i20 % 128;
        int i21 = i20 % 2;
        return jSBundleLoaderDelegate;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        WebResourceResponseModel webResourceResponseModel = (WebResourceResponseModel) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(str, jLongValue, webResourceResponseModel);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, jLongValue, webResourceResponseModel);
        int i3 = access100 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ JSBundleLoaderDelegate onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        JSBundleLoaderDelegate interfaceDescriptor = getInterfaceDescriptor();
        int i4 = access100 + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ AppState onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        AppState appState = (AppState) onExtraCallbackWithResult(-1138582786, 1138582789, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[0]);
        int i3 = IAuthTabCallbackStubProxy + 23;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return appState;
    }

    private createFileLoader() {
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 1;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        asBinder = iIntValue;
        int i5 = i2 + 47;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallback(createFileLoader createfileloader, JSInstance jSInstance, Context context, DailySyncReq dailySyncReq, access13800 access13800Var) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = createfileloader.IAuthTabCallback(jSInstance, context, dailySyncReq, access13800Var);
        int i4 = access100 + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ setAdUnitIds onExtraCallback(createFileLoader createfileloader) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        setAdUnitIds setadunitidsIAuthTabCallbackStubProxy = createfileloader.IAuthTabCallbackStubProxy();
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = access100 + 105;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return setadunitidsIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 105;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        onTransact = str;
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        int i6 = i2 + 3;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 75;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        asInterface = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 99;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ AppState onNavigationEvent(createFileLoader createfileloader) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            return (AppState) onExtraCallbackWithResult(-103945901, 103945902, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{createfileloader});
        }
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int i3 = 67 / 0;
        return (AppState) onExtraCallbackWithResult(-103945901, 103945902, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{createfileloader});
    }

    static {
        asInterface();
        onExtraCallbackWithResult = new createFileLoader();
        onNavigationEvent = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback()));
        IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerSyncHelper$$ExternalSyntheticLambda2
            public final Object invoke() {
                return createFileLoader.onExtraCallback();
            }
        });
        onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerSyncHelper$$ExternalSyntheticLambda3
            public final Object invoke() {
                return createFileLoader.onExtraCallbackWithResult();
            }
        });
        IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerSyncHelper$$ExternalSyntheticLambda4
            public final Object invoke() {
                return createFileLoader.IAuthTabCallback();
            }
        });
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerSyncHelper$$ExternalSyntheticLambda5
            public final Object invoke() {
                return createFileLoader.onNavigationEvent();
            }
        });
        onTransact = "";
        onExtraCallback = 8;
        int i = writeTypedObject + 37;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    private final JSBundleLoaderDelegate ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        JSBundleLoaderDelegate jSBundleLoaderDelegate = (JSBundleLoaderDelegate) IAuthTabCallbackDefault.getValue();
        int i4 = access100 + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return jSBundleLoaderDelegate;
        }
        throw null;
    }

    private static final JSBundleLoaderDelegate writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onExtraCallbackWithResult, "step"};
        JSBundleLoaderDelegate jSBundleLoaderDelegate = (JSBundleLoaderDelegate) onExtraCallbackWithResult(806959523, -806959523, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
        int i4 = access100 + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jSBundleLoaderDelegate;
    }

    private final JSBundleLoaderDelegate access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        JSBundleLoaderDelegate jSBundleLoaderDelegate = (JSBundleLoaderDelegate) onWarmupCompleted.getValue();
        int i3 = IAuthTabCallbackStubProxy + 93;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return jSBundleLoaderDelegate;
    }

    private static final JSBundleLoaderDelegate getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onExtraCallbackWithResult, "enablement"};
        JSBundleLoaderDelegate jSBundleLoaderDelegate = (JSBundleLoaderDelegate) onExtraCallbackWithResult(806959523, -806959523, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
        int i4 = access100 + 65;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jSBundleLoaderDelegate;
    }

    private final setAdUnitIds IAuthTabCallbackStubProxy() {
        setAdUnitIds setadunitids;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            setadunitids = (setAdUnitIds) IAuthTabCallbackStub.getValue();
            int i3 = 78 / 0;
        } else {
            setadunitids = (setAdUnitIds) IAuthTabCallbackStub.getValue();
        }
        int i4 = access100 + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return setadunitids;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            return ((setAdUnitIds.onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAdUnitIds.onExtraCallbackWithResult.class)).Rcolor();
        }
        Response response2 = Response.onNavigationEvent;
        ((setAdUnitIds.onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAdUnitIds.onExtraCallbackWithResult.class)).Rcolor();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        AppState appState = (AppState) IAuthTabCallback.getValue();
        int i4 = access100 + 65;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return appState;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        AppState appStateReportDrawnCompositioncheckReporter1 = ((AppState.onWarmupCompleted) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), AppState.onWarmupCompleted.class)).ReportDrawnCompositioncheckReporter1();
        int i4 = IAuthTabCallbackStubProxy + 107;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return appStateReportDrawnCompositioncheckReporter1;
        }
        throw null;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = asBinder;
        int i6 = i3 + 65;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 8 / 0;
        }
        return i5;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = onTransact;
        int i5 = i3 + 95;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iExtraCallback = DERSet.onExtraCallback.extraCallback();
        if (Math.abs((((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{GuardedAsyncTask.IAuthTabCallback, null, 1, null}, -339510300)).intValue() / iExtraCallback) - (asInterface / iExtraCallback)) <= 0) {
            return false;
        }
        int i4 = access100 + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final Unit onWarmupCompleted(String str, long j, WebResourceResponseModel webResourceResponseModel) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webResourceResponseModel, "");
        Object[] objArr = new Object[1];
        a(new char[]{3, 7, 5, 6, 5, '\b', 13815}, (byte) (10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 7, objArr);
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "PedometerSyncHelper.Executor: timeout (" + str + ")", access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), setLogBuffers.onPostMessage(j))), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ GeckoHubImp1 onExtraCallbackWithResult(createFileLoader createfileloader, Context context, int i, String str, JSInstance jSInstance, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = access100;
        int i5 = i4 + 47;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 8) != 0) {
            int i7 = i4 + 59;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            jSInstance = null;
        }
        GeckoHubImp1<Result<Object>> geckoHubImp1OnWarmupCompleted = createfileloader.onWarmupCompleted(context, i, str, jSInstance);
        int i9 = IAuthTabCallbackStubProxy + 19;
        access100 = i9 % 128;
        if (i9 % 2 != 0) {
            return geckoHubImp1OnWarmupCompleted;
        }
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Object>>, Object> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ int $count;
        final /* synthetic */ JSInstance $recordingData;
        final /* synthetic */ String $yyyyMMdd;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(int i, String str, JSInstance jSInstance, Context context, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$count = i;
            this.$yyyyMMdd = str;
            this.$recordingData = jSInstance;
            this.$appContext = context;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends Object>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$count, this.$yyyyMMdd, this.$recordingData, this.$appContext, access13800Var);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00cb, code lost:
        
            if (r3 == r0) goto L65;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 515
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.createFileLoader.IAuthTabCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final GeckoHubImp1<Result<Object>> onWarmupCompleted(@NotNull Context context, int i, @NotNull String str, @Nullable JSInstance jSInstance) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        GeckoHubImp1<Result<Object>> geckoHubImp1OnWarmupCompleted = ICustomTabsCallback().onWarmupCompleted(new IAuthTabCallback(i, str, jSInstance, context.getApplicationContext(), null));
        int i3 = IAuthTabCallbackStubProxy + 47;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return geckoHubImp1OnWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|90|(1:(1:(5:12|91|13|37|(3:39|89|(2:41|(7:43|58|72|(2:74|(1:76))|77|(2:79|(2:81|(1:85))(2:86|87))|88)(2:44|45))(2:48|49))(2:59|(2:61|62)(1:94)))(2:19|20))(1:21))(2:22|(3:24|(1:26)|35)(6:31|32|92|33|(3:36|37|(0)(0))|35))|27|(2:29|30)|32|92|33|(0)|35|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0198, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183 A[Catch: Exception -> 0x006f, WebResourceResponseModel -> 0x0072, CancellationException -> 0x01a4, TryCatch #5 {CancellationException -> 0x01a4, blocks: (B:13:0x006a, B:37:0x0111, B:41:0x0144, B:58:0x017e, B:44:0x014b, B:45:0x0152, B:48:0x0155, B:50:0x0159, B:52:0x0163, B:55:0x016e, B:56:0x017b, B:57:0x017c, B:59:0x0183, B:61:0x0189, B:62:0x018f, B:33:0x00cc), top: B:90:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.JSInstance r29, android.content.Context r30, viva.republica.toss.network.model.pedometer.DailySyncReq r31, o.access13800<? super kotlin.Result<? extends java.lang.Object>> r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createFileLoader.IAuthTabCallback(o.JSInstance, android.content.Context, viva.republica.toss.network.model.pedometer.DailySyncReq, o.access13800):java.lang.Object");
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ca A[Catch: Exception -> 0x0015, CancellationException -> 0x0018, WebResourceResponseModel -> 0x001b, TryCatch #3 {CancellationException -> 0x0018, blocks: (B:6:0x0011, B:24:0x0068, B:26:0x0090, B:40:0x00c5, B:29:0x0097, B:30:0x009e, B:41:0x00ca, B:43:0x00d0, B:44:0x00d6, B:32:0x00a0, B:34:0x00aa, B:37:0x00b5, B:38:0x00c2, B:39:0x00c3, B:20:0x0049), top: B:62:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.createFileLoader.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final getPackageType IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Object obj = null;
        getPackageType getpackagetypeOnExtraCallback = access100().onExtraCallback(new onNavigationEvent(null));
        int i2 = access100 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return getpackagetypeOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final void asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        asBinder = 0;
        asInterface = 0;
        int i5 = i3 + 109;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onWarmupCompleted(Throwable th, JSBundleLoaderCompanion jSBundleLoaderCompanion) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("pedometer_debug", "syncPreviousSteps failed", th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("yyyyMMdd", jSBundleLoaderCompanion.onWarmupCompleted()), getWrite.IAuthTabCallback("count", Integer.valueOf(jSBundleLoaderCompanion.onNavigationEvent()))}));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 87;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0186 A[Catch: Exception -> 0x007a, CancellationException -> 0x007d, WebResourceResponseModel -> 0x0080, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x007d, blocks: (B:17:0x006c, B:44:0x011b, B:47:0x014c, B:61:0x0181, B:50:0x0153, B:51:0x015a, B:53:0x015c, B:55:0x0166, B:58:0x0171, B:59:0x017e, B:60:0x017f, B:62:0x0186, B:66:0x0197, B:67:0x019c, B:71:0x01a0, B:72:0x01a6, B:40:0x00ea), top: B:91:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(int r19, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createFileLoader.onExtraCallback(int, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r31, byte r32, int r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createFileLoader.a(char[], byte, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, long j, WebResourceResponseModel webResourceResponseModel) {
        Object[] objArr = {str, Long.valueOf(j), webResourceResponseModel};
        return (Unit) onExtraCallbackWithResult(-615826683, 615826688, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
    }

    public static final /* synthetic */ void onNavigationEvent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        onExtraCallbackWithResult(2135062996, -2135062994, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
    }

    private static final AppState access000() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (AppState) onExtraCallbackWithResult(-1138582786, 1138582789, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[0]);
    }

    private final AppState IAuthTabCallback_Parcel() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (AppState) onExtraCallbackWithResult(-103945901, 103945902, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this});
    }

    private static final setAdUnitIds readTypedObject() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (setAdUnitIds) onExtraCallbackWithResult(1925097626, -1925097622, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[0]);
    }

    private final JSBundleLoaderDelegate onExtraCallbackWithResult(String str) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (JSBundleLoaderDelegate) onExtraCallbackWithResult(806959523, -806959523, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{this, str});
    }

    static void asInterface() {
        IAuthTabCallback_Parcel = new char[]{51240, 51242, 64988, 64990, 64967, 64966, 64986, 51243, 64982};
        access000 = (char) 51242;
    }
}
