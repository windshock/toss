package im.toss.feature.credit.ui.main.consulting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import im.toss.feature.credit.ui.main.R;
import im.toss.features.credit.data.request.CreditConsultingCancelRequest;
import im.toss.features.credit.data.request.CreditConsultingReservationRequest;
import im.toss.features.credit.data.response.CreditConsultingCategory;
import im.toss.features.credit.data.response.CreditConsultingHistory;
import im.toss.features.credit.data.response.CreditConsultingReservationResponse;
import im.toss.features.credit.data.response.CreditConsultingResponse;
import im.toss.features.credit.data.response.CreditConsultingResult;
import im.toss.features.credit.data.response.CreditConsultingStatus;
import im.toss.features.credit.data.response.CreditConsultingTime;
import im.toss.features.credit.data.response.CreditConsultingTimetableResponse;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AFj1rSDK;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CloseableUtils;
import o.GeckoHubImp;
import o.ImageLoaderBuilderExternalSyntheticLambda6;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda7;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.enableReportDataOptimize;
import o.findResAndMsg;
import o.getAddPhoneContactDialog;
import o.getBoolean;
import o.getBorderRadius;
import o.getCodeNameBytes;
import o.getCornerRadius;
import o.getShine;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTileModeX;
import o.getWrite;
import o.matches;
import o.maybeUpdateAnimatable;
import o.priorityUploadRate;
import o.putChannelInfo;
import o.runtimeInfoAdd;
import o.setRandomHost;
import o.setShine;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditConsultingViewModel extends ViewModel {
    private static int ICustomTabsCallback = 0;
    private static int onMessageChannelReady = 1;
    private final getBorderRadius<Boolean> IAuthTabCallback;
    private final getBorderRadius<Pair<String, String>> IAuthTabCallbackDefault;
    private final getTileModeX<Boolean> IAuthTabCallbackStub;
    private enableReportDataOptimize IAuthTabCallbackStubProxy;
    private final LiveData<getBoolean> IAuthTabCallback_Parcel;
    private final LiveData<Throwable> access000;
    private final LiveData<Boolean> access100;
    private final getCornerRadius<SortedMap<priorityUploadRate, List<CreditConsultingTime>>> asBinder;
    private final getAddPhoneContactDialog asInterface;
    private final LiveData<Pair<String, String>> extraCallback;
    private final LiveData<Boolean> extraCallbackWithResult;
    private final CoroutineExceptionHandler getInterfaceDescriptor;
    private final getBorderRadius<getBoolean> onExtraCallback;
    private final getBorderRadius<Boolean> onExtraCallbackWithResult;
    private final getBorderRadius<Boolean> onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onTransact;
    private final MutableLiveData<Throwable> onWarmupCompleted;
    private final ImageLoaderBuilderExternalSyntheticLambda6 readTypedObject;
    private final LiveData<SortedMap<priorityUploadRate, List<CreditConsultingTime>>> writeTypedObject;

    public static /* synthetic */ int IAuthTabCallback(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = onExtraCallback(function2, obj, obj2);
        int i4 = onMessageChannelReady + 125;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i6)) | (~(i8 | i6));
        int i10 = ~(i5 | i7);
        int i11 = i6 | i10 | (~(i8 | i));
        int i12 = i6 + i + i2 + (1997535707 * i4) + (1930545336 * i3);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i6) + 1468203008 + ((-417352845) * i) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i2) + ((-1408630784) * i4) + ((-2070937600) * i3) + (392888320 * i13);
        int i15 = (i6 * (-2054695253)) + 138751921 + (i * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i2 * (-2054694363)) + (i4 * 1502648999) + (i3 * 931574424) + (i13 * (-2139684864));
        switch (i14 + (i15 * i15 * (-174260224))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        priorityUploadRate priorityuploadrate = (priorityUploadRate) objArr[0];
        priorityUploadRate priorityuploadrate2 = (priorityUploadRate) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = onExtraCallback(priorityuploadrate, priorityuploadrate2);
        int i4 = ICustomTabsCallback + 41;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iOnExtraCallback);
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditConsultingViewModel creditConsultingViewModel, CreditConsultingCategory creditConsultingCategory) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditConsultingViewModel, creditConsultingCategory);
        int i4 = ICustomTabsCallback + 5;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    @Inject
    public CreditConsultingViewModel(@NotNull getAddPhoneContactDialog getaddphonecontactdialog) {
        Intrinsics.checkNotNullParameter(getaddphonecontactdialog, "");
        this.asInterface = getaddphonecontactdialog;
        getBorderRadius<getBoolean> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted;
        this.IAuthTabCallback_Parcel = TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(getborderradiusOnWarmupCompleted, (CoroutineContext) null, 0L, 3, (Object) null);
        getBorderRadius<Boolean> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onNavigationEvent = getborderradiusOnWarmupCompleted2;
        this.access100 = TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(getborderradiusOnWarmupCompleted2, (CoroutineContext) null, 0L, 3, (Object) null);
        getBorderRadius<Boolean> getborderradiusOnWarmupCompleted3 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallbackWithResult = getborderradiusOnWarmupCompleted3;
        this.extraCallbackWithResult = TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(getborderradiusOnWarmupCompleted3, (CoroutineContext) null, 0L, 3, (Object) null);
        getBorderRadius<Pair<String, String>> getborderradiusOnWarmupCompleted4 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallbackDefault = getborderradiusOnWarmupCompleted4;
        this.extraCallback = TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(getborderradiusOnWarmupCompleted4, (CoroutineContext) null, 0L, 3, (Object) null);
        MutableLiveData<Throwable> mutableLiveData = new MutableLiveData<>();
        this.onWarmupCompleted = mutableLiveData;
        this.access000 = mutableLiveData;
        getCornerRadius<SortedMap<priorityUploadRate, List<CreditConsultingTime>>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(access8100.onNavigationEvent(new Pair[0]));
        this.asBinder = getcornerradiusOnNavigationEvent;
        this.writeTypedObject = TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(getcornerradiusOnNavigationEvent, (CoroutineContext) null, 0L, 3, (Object) null);
        getBorderRadius<Boolean> getborderradiusOnWarmupCompleted5 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted5;
        this.IAuthTabCallbackStub = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted5);
        this.getInterfaceDescriptor = new getInterfaceDescriptor(CoroutineExceptionHandler.extraCallbackWithResult, this);
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.readTypedObject = new ImageLoaderBuilderExternalSyntheticLambda6(0L, 1, null);
        this.IAuthTabCallbackStubProxy = new enableReportDataOptimize(null, null, null, null, null, null, null, null, null, 511, null);
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        onExtraCallbackWithResult(-1390001988, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 1390001993, new Object[]{this});
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallback(CreditConsultingViewModel creditConsultingViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<Boolean> getborderradius = creditConsultingViewModel.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditConsultingViewModel creditConsultingViewModel, enableReportDataOptimize enablereportdataoptimize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        creditConsultingViewModel.IAuthTabCallbackStubProxy = enablereportdataoptimize;
        int i5 = i3 + 123;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(CreditConsultingViewModel creditConsultingViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        onExtraCallbackWithResult(938131415, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -938131413, new Object[]{creditConsultingViewModel});
        int i4 = ICustomTabsCallback + 39;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallbackStub(CreditConsultingViewModel creditConsultingViewModel) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 75;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<Boolean> getborderradius = creditConsultingViewModel.onExtraCallbackWithResult;
        int i5 = i2 + 49;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return getborderradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 117;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        getBorderRadius<Pair<String, String>> getborderradius = creditConsultingViewModel.IAuthTabCallbackDefault;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 103;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return getborderradius;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void asInterface(CreditConsultingViewModel creditConsultingViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingViewModel.extraCallbackWithResult();
        int i4 = onMessageChannelReady + 87;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ MutableLiveData onExtraCallback(CreditConsultingViewModel creditConsultingViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        MutableLiveData<Throwable> mutableLiveData = creditConsultingViewModel.onWarmupCompleted;
        int i5 = i3 + 35;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return mutableLiveData;
    }

    public static final /* synthetic */ getBorderRadius onExtraCallbackWithResult(CreditConsultingViewModel creditConsultingViewModel) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<getBoolean> getborderradius = creditConsultingViewModel.onExtraCallback;
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ getAddPhoneContactDialog onNavigationEvent(CreditConsultingViewModel creditConsultingViewModel) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getAddPhoneContactDialog getaddphonecontactdialog = creditConsultingViewModel.asInterface;
        if (i3 == 0) {
            return getaddphonecontactdialog;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditConsultingViewModel creditConsultingViewModel, CreditConsultingTimetableResponse creditConsultingTimetableResponse) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingViewModel.onExtraCallbackWithResult(creditConsultingTimetableResponse);
        int i4 = ICustomTabsCallback + 63;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditConsultingViewModel creditConsultingViewModel, runtimeInfoAdd runtimeinfoadd) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingViewModel.onExtraCallbackWithResult(runtimeinfoadd);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 47;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    public static final /* synthetic */ getBorderRadius onWarmupCompleted(CreditConsultingViewModel creditConsultingViewModel) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 13;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<Boolean> getborderradius = creditConsultingViewModel.onNavigationEvent;
        int i5 = i2 + 107;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return getborderradius;
    }

    public final LiveData<getBoolean> access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        LiveData<getBoolean> liveData = this.IAuthTabCallback_Parcel;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return liveData;
    }

    public final LiveData<Boolean> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        LiveData<Boolean> liveData = this.access100;
        int i5 = i3 + 17;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return liveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LiveData<Boolean> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 83;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        LiveData<Boolean> liveData = this.extraCallbackWithResult;
        int i4 = i3 + 83;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return liveData;
    }

    public static final class getInterfaceDescriptor extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ CreditConsultingViewModel onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public getInterfaceDescriptor(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, CreditConsultingViewModel creditConsultingViewModel) {
            super(onwarmupcompleted);
            this.onExtraCallback = creditConsultingViewModel;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            MutableLiveData mutableLiveDataOnExtraCallback = CreditConsultingViewModel.onExtraCallback(this.onExtraCallback);
            if (i3 != 0) {
                mutableLiveDataOnExtraCallback.postValue(th);
            } else {
                mutableLiveDataOnExtraCallback.postValue(th);
                int i4 = 16 / 0;
            }
        }
    }

    public final LiveData<Pair<String, String>> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LiveData<Pair<String, String>> liveData = this.extraCallback;
        int i4 = i3 + 87;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return liveData;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        LiveData<Throwable> liveData = creditConsultingViewModel.access000;
        int i5 = i3 + 95;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return liveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 49;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        LiveData<SortedMap<priorityUploadRate, List<CreditConsultingTime>>> liveData = creditConsultingViewModel.writeTypedObject;
        int i5 = i3 + 63;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return liveData;
        }
        throw null;
    }

    public final getTileModeX<Boolean> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 81;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final enableReportDataOptimize onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        enableReportDataOptimize enablereportdataoptimize = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 71;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enablereportdataoptimize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(creditConsultingViewModel), creditConsultingViewModel.getInterfaceDescriptor, (setRandomHost) null, creditConsultingViewModel.new onTransact(null), 2, (Object) null);
        int i2 = onMessageChannelReady + 69;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = CreditConsultingViewModel.this.new onTransact(access13800Var);
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return ontransact;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 71 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a7 A[PHI: r2
          0x00a7: PHI (r2v8 im.toss.features.credit.data.response.CreditConsultingStatus) = 
          (r2v7 im.toss.features.credit.data.response.CreditConsultingStatus)
          (r2v15 im.toss.features.credit.data.response.CreditConsultingStatus)
         binds: [B:34:0x00a1, B:31:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CreditConsultingStatus creditConsultingStatus;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 != 0) {
                    int i5 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    CreditConsultingViewModel creditConsultingViewModel = CreditConsultingViewModel.this;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, creditConsultingViewModel);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                obj2 = Result.constructor-impl(obj);
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            CreditConsultingViewModel creditConsultingViewModel2 = CreditConsultingViewModel.this;
            if (Result.onNavigationEvent(obj2)) {
                int i6 = onExtraCallbackWithResult + 45;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    creditConsultingStatus = (CreditConsultingStatus) obj2;
                    int i7 = 31 / 0;
                    if (creditConsultingStatus.onNavigationEvent()) {
                        CreditConsultingViewModel.IAuthTabCallbackDefault(creditConsultingViewModel2);
                    } else if (!(!creditConsultingStatus.onWarmupCompleted())) {
                        int i8 = IAuthTabCallback + 79;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 == 0) {
                            CreditConsultingViewModel.onNavigationEvent(creditConsultingViewModel2, runtimeInfoAdd.LATEST_RESERVATION);
                            int i9 = 75 / 0;
                        } else {
                            CreditConsultingViewModel.onNavigationEvent(creditConsultingViewModel2, runtimeInfoAdd.LATEST_RESERVATION);
                        }
                    } else {
                        CreditConsultingViewModel.onNavigationEvent(creditConsultingViewModel2, runtimeInfoAdd.FINISHED_RESERVATION);
                    }
                } else {
                    creditConsultingStatus = (CreditConsultingStatus) obj2;
                    if (creditConsultingStatus.onNavigationEvent()) {
                    }
                }
            }
            CreditConsultingViewModel creditConsultingViewModel3 = CreditConsultingViewModel.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                CreditConsultingViewModel.onExtraCallback(creditConsultingViewModel3).setValue(th);
            }
            return Unit.INSTANCE;
        }

        public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditConsultingStatus>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CreditConsultingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(access13800 access13800Var, CreditConsultingViewModel creditConsultingViewModel) {
                super(2, access13800Var);
                this.this$0 = creditConsultingViewModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0);
                int i2 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super CreditConsultingStatus> access13800Var) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                }
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[PHI: r1
              0x0036: PHI (r1v20 java.lang.Object) = (r1v4 java.lang.Object), (r1v21 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
              0x0024: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted;
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 85 / 0;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        getAddPhoneContactDialog getaddphonecontactdialogOnNavigationEvent = CreditConsultingViewModel.onNavigationEvent(this.this$0);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = getaddphonecontactdialogOnNavigationEvent.onNavigationEvent(this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    if (i != 0) {
                    }
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult != null) {
                        throw apiErrorExtraCallbackWithResult;
                    }
                    int i5 = onExtraCallbackWithResult + 91;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (CreditConsultingStatus) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.CreditConsultingStatus");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(CreditConsultingStatus.class, Object.class) || Intrinsics.areEqual(CreditConsultingStatus.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    int i7 = onWarmupCompleted + 1;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                    TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e).onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(creditConsultingViewModel), creditConsultingViewModel.getInterfaceDescriptor, (setRandomHost) null, creditConsultingViewModel.new IAuthTabCallback_Parcel(null), 2, (Object) null);
        int i2 = onMessageChannelReady + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final class readTypedObject<T> implements Comparator {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            CreditConsultingTime creditConsultingTime = (CreditConsultingTime) t;
            if (i2 % 2 == 0) {
                return getCodeNameBytes.IAuthTabCallback(creditConsultingTime.onExtraCallback(), ((CreditConsultingTime) t2).onExtraCallback());
            }
            getCodeNameBytes.IAuthTabCallback(creditConsultingTime.onExtraCallback(), ((CreditConsultingTime) t2).onExtraCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = CreditConsultingViewModel.this.new IAuthTabCallback_Parcel(access13800Var);
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback_Parcel;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 15;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 12 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
        
            if (r0 != r3) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Throwable th;
            List list;
            enableReportDataOptimize enablereportdataoptimize;
            CreditConsultingResponse creditConsultingResponse;
            CreditConsultingViewModel creditConsultingViewModel;
            CreditConsultingViewModel creditConsultingViewModel2;
            Exception e;
            Object obj4;
            CreditConsultingViewModel creditConsultingViewModel3;
            CreditConsultingResponse creditConsultingResponse2;
            enableReportDataOptimize enablereportdataoptimize2;
            Object obj5;
            CreditConsultingViewModel creditConsultingViewModel4;
            List list2;
            enableReportDataOptimize enablereportdataoptimize3;
            CreditConsultingViewModel creditConsultingViewModel5;
            List list3;
            enableReportDataOptimize enablereportdataoptimizeOnTransact;
            CreditConsultingResponse creditConsultingResponse3;
            WebResourceResponseModel e2;
            Object obj6;
            List listEmptyList;
            getBorderRadius getborderradiusOnExtraCallbackWithResult;
            getBoolean.onTransact ontransact;
            Object objOnExtraCallback;
            Object objOnExtraCallback2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            int i3 = 0;
            Object obj7 = null;
            try {
                try {
                } catch (CancellationException e3) {
                    throw e3;
                }
            } catch (CancellationException e4) {
                throw e4;
            } catch (WebResourceResponseModel e5) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
            } catch (Exception e6) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e6));
            }
            if (i2 != 0) {
                int i4 = onExtraCallback + 27;
                int i5 = i4 % 128;
                onNavigationEvent = i5;
                if (i4 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = i5 + 77;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        obj6 = this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        obj3 = obj6;
                        CreditConsultingViewModel creditConsultingViewModel6 = CreditConsultingViewModel.this;
                        th = Result.exceptionOrNull-impl(obj3);
                        if (th != null) {
                            CreditConsultingViewModel.onExtraCallback(creditConsultingViewModel6).setValue(th);
                        }
                        return Unit.INSTANCE;
                    }
                    i3 = this.I$0;
                    creditConsultingViewModel5 = (CreditConsultingViewModel) this.L$6;
                    enablereportdataoptimize3 = (enableReportDataOptimize) this.L$5;
                    list2 = (List) this.L$4;
                    creditConsultingResponse = (CreditConsultingResponse) this.L$2;
                    creditConsultingViewModel4 = (CreditConsultingViewModel) this.L$1;
                    obj5 = this.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj);
                        objOnExtraCallback = obj;
                        obj4 = Result.constructor-impl(objOnExtraCallback);
                        creditConsultingResponse2 = creditConsultingResponse;
                        creditConsultingViewModel3 = creditConsultingViewModel4;
                        list3 = list2;
                        enablereportdataoptimize2 = enablereportdataoptimize3;
                        creditConsultingViewModel2 = creditConsultingViewModel5;
                        obj3 = obj5;
                    } catch (WebResourceResponseModel e7) {
                        e2 = e7;
                        enableReportDataOptimize enablereportdataoptimize4 = enablereportdataoptimize3;
                        creditConsultingViewModel2 = creditConsultingViewModel5;
                        obj3 = obj5;
                        list = list2;
                        creditConsultingResponse3 = creditConsultingResponse;
                        enablereportdataoptimizeOnTransact = enablereportdataoptimize4;
                        Result.Companion companion3 = Result.Companion;
                        obj4 = Result.constructor-impl(ResultKt.createFailure(e2));
                        creditConsultingResponse2 = creditConsultingResponse3;
                        enablereportdataoptimize2 = enablereportdataoptimizeOnTransact;
                        creditConsultingViewModel3 = creditConsultingViewModel4;
                        list3 = list;
                        if (Result.onExtraCallback(obj4)) {
                        }
                        listEmptyList = (List) obj4;
                        if (listEmptyList == null) {
                        }
                        CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel2, enableReportDataOptimize.onExtraCallback(enablereportdataoptimize2, list3, listEmptyList, null, null, null, null, null, null, null, 508, null));
                        getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(creditConsultingViewModel3);
                        ontransact = getBoolean.onTransact.onExtraCallbackWithResult;
                        this.L$0 = obj3;
                        this.L$1 = access15400.onNavigationEvent(creditConsultingResponse2);
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i3;
                        this.label = 3;
                        if (getborderradiusOnExtraCallbackWithResult.emit(ontransact, this) != objOnWarmupCompleted) {
                        }
                        return objOnWarmupCompleted;
                    } catch (Exception e8) {
                        e = e8;
                        List list4 = list2;
                        creditConsultingViewModel = creditConsultingViewModel5;
                        obj3 = obj5;
                        list = list4;
                        CreditConsultingViewModel creditConsultingViewModel7 = creditConsultingViewModel4;
                        enablereportdataoptimize = enablereportdataoptimize3;
                        creditConsultingViewModel2 = creditConsultingViewModel7;
                        Result.Companion companion4 = Result.Companion;
                        obj4 = Result.constructor-impl(ResultKt.createFailure(e));
                        creditConsultingViewModel3 = creditConsultingViewModel2;
                        creditConsultingViewModel2 = creditConsultingViewModel;
                        creditConsultingResponse2 = creditConsultingResponse;
                        enablereportdataoptimize2 = enablereportdataoptimize;
                        list3 = list;
                        if (Result.onExtraCallback(obj4)) {
                        }
                        listEmptyList = (List) obj4;
                        if (listEmptyList == null) {
                        }
                        CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel2, enableReportDataOptimize.onExtraCallback(enablereportdataoptimize2, list3, listEmptyList, null, null, null, null, null, null, null, 508, null));
                        getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(creditConsultingViewModel3);
                        ontransact = getBoolean.onTransact.onExtraCallbackWithResult;
                        this.L$0 = obj3;
                        this.L$1 = access15400.onNavigationEvent(creditConsultingResponse2);
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i3;
                        this.label = 3;
                        if (getborderradiusOnExtraCallbackWithResult.emit(ontransact, this) != objOnWarmupCompleted) {
                        }
                        return objOnWarmupCompleted;
                    }
                    if (Result.onExtraCallback(obj4)) {
                        obj4 = null;
                    }
                    listEmptyList = (List) obj4;
                    if (listEmptyList == null) {
                        int i8 = onExtraCallback + 45;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            CollectionsKt.emptyList();
                            obj7.hashCode();
                            throw null;
                        }
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel2, enableReportDataOptimize.onExtraCallback(enablereportdataoptimize2, list3, listEmptyList, null, null, null, null, null, null, null, 508, null));
                    getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(creditConsultingViewModel3);
                    ontransact = getBoolean.onTransact.onExtraCallbackWithResult;
                    this.L$0 = obj3;
                    this.L$1 = access15400.onNavigationEvent(creditConsultingResponse2);
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i3;
                    this.label = 3;
                    if (getborderradiusOnExtraCallbackWithResult.emit(ontransact, this) != objOnWarmupCompleted) {
                        obj6 = obj3;
                        obj3 = obj6;
                        CreditConsultingViewModel creditConsultingViewModel62 = CreditConsultingViewModel.this;
                        th = Result.exceptionOrNull-impl(obj3);
                        if (th != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return objOnWarmupCompleted;
                }
                ResultKt.onNavigationEvent(obj);
                int i9 = onExtraCallback + 125;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                objOnExtraCallback2 = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                CreditConsultingViewModel creditConsultingViewModel8 = CreditConsultingViewModel.this;
                Result.Companion companion5 = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null, creditConsultingViewModel8);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                objOnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onwarmupcompleted, this);
            }
            obj2 = Result.constructor-impl(objOnExtraCallback2);
            obj3 = obj2;
            creditConsultingViewModel2 = CreditConsultingViewModel.this;
            if (Result.onNavigationEvent(obj3)) {
                creditConsultingResponse3 = (CreditConsultingResponse) obj3;
                enablereportdataoptimizeOnTransact = creditConsultingViewModel2.onTransact();
                List listOnExtraCallback = creditConsultingResponse3.onExtraCallback();
                try {
                    Result.Companion companion6 = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback2 = putChannelInfo.IAuthTabCallback();
                    onExtraCallback onextracallback = new onExtraCallback(null, creditConsultingViewModel2);
                    this.L$0 = obj3;
                    this.L$1 = creditConsultingViewModel2;
                    this.L$2 = access15400.onNavigationEvent(creditConsultingResponse3);
                    this.L$3 = access15400.onNavigationEvent(this);
                    this.L$4 = listOnExtraCallback;
                    this.L$5 = enablereportdataoptimizeOnTransact;
                    this.L$6 = creditConsultingViewModel2;
                    this.L$7 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.I$3 = 0;
                    this.label = 2;
                    objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback2, onextracallback, this);
                } catch (Exception e9) {
                    e = e9;
                    list = listOnExtraCallback;
                    enablereportdataoptimize = enablereportdataoptimizeOnTransact;
                    creditConsultingResponse = creditConsultingResponse3;
                    creditConsultingViewModel = creditConsultingViewModel2;
                    Result.Companion companion42 = Result.Companion;
                    obj4 = Result.constructor-impl(ResultKt.createFailure(e));
                    creditConsultingViewModel3 = creditConsultingViewModel2;
                    creditConsultingViewModel2 = creditConsultingViewModel;
                    creditConsultingResponse2 = creditConsultingResponse;
                    enablereportdataoptimize2 = enablereportdataoptimize;
                    list3 = list;
                    if (Result.onExtraCallback(obj4)) {
                    }
                    listEmptyList = (List) obj4;
                    if (listEmptyList == null) {
                    }
                    CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel2, enableReportDataOptimize.onExtraCallback(enablereportdataoptimize2, list3, listEmptyList, null, null, null, null, null, null, null, 508, null));
                    getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(creditConsultingViewModel3);
                    ontransact = getBoolean.onTransact.onExtraCallbackWithResult;
                    this.L$0 = obj3;
                    this.L$1 = access15400.onNavigationEvent(creditConsultingResponse2);
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i3;
                    this.label = 3;
                    if (getborderradiusOnExtraCallbackWithResult.emit(ontransact, this) != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                } catch (WebResourceResponseModel e10) {
                    e2 = e10;
                    list = listOnExtraCallback;
                    creditConsultingViewModel4 = creditConsultingViewModel2;
                    Result.Companion companion32 = Result.Companion;
                    obj4 = Result.constructor-impl(ResultKt.createFailure(e2));
                    creditConsultingResponse2 = creditConsultingResponse3;
                    enablereportdataoptimize2 = enablereportdataoptimizeOnTransact;
                    creditConsultingViewModel3 = creditConsultingViewModel4;
                    list3 = list;
                    if (Result.onExtraCallback(obj4)) {
                    }
                    listEmptyList = (List) obj4;
                    if (listEmptyList == null) {
                    }
                    CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel2, enableReportDataOptimize.onExtraCallback(enablereportdataoptimize2, list3, listEmptyList, null, null, null, null, null, null, null, 508, null));
                    getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(creditConsultingViewModel3);
                    ontransact = getBoolean.onTransact.onExtraCallbackWithResult;
                    this.L$0 = obj3;
                    this.L$1 = access15400.onNavigationEvent(creditConsultingResponse2);
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i3;
                    this.label = 3;
                    if (getborderradiusOnExtraCallbackWithResult.emit(ontransact, this) != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    int i11 = onExtraCallback + 71;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    obj5 = obj3;
                    creditConsultingViewModel5 = creditConsultingViewModel2;
                    enablereportdataoptimize3 = enablereportdataoptimizeOnTransact;
                    creditConsultingResponse = creditConsultingResponse3;
                    list2 = listOnExtraCallback;
                    creditConsultingViewModel4 = creditConsultingViewModel5;
                    obj4 = Result.constructor-impl(objOnExtraCallback);
                    creditConsultingResponse2 = creditConsultingResponse;
                    creditConsultingViewModel3 = creditConsultingViewModel4;
                    list3 = list2;
                    enablereportdataoptimize2 = enablereportdataoptimize3;
                    creditConsultingViewModel2 = creditConsultingViewModel5;
                    obj3 = obj5;
                    if (Result.onExtraCallback(obj4)) {
                    }
                    listEmptyList = (List) obj4;
                    if (listEmptyList == null) {
                    }
                    CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel2, enableReportDataOptimize.onExtraCallback(enablereportdataoptimize2, list3, listEmptyList, null, null, null, null, null, null, null, 508, null));
                    getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(creditConsultingViewModel3);
                    ontransact = getBoolean.onTransact.onExtraCallbackWithResult;
                    this.L$0 = obj3;
                    this.L$1 = access15400.onNavigationEvent(creditConsultingResponse2);
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i3;
                    this.label = 3;
                    if (getborderradiusOnExtraCallbackWithResult.emit(ontransact, this) != objOnWarmupCompleted) {
                    }
                }
                return objOnWarmupCompleted;
            }
            CreditConsultingViewModel creditConsultingViewModel622 = CreditConsultingViewModel.this;
            th = Result.exceptionOrNull-impl(obj3);
            if (th != null) {
            }
            return Unit.INSTANCE;
        }

        public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends CreditConsultingHistory>>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CreditConsultingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(access13800 access13800Var, CreditConsultingViewModel creditConsultingViewModel) {
                super(2, access13800Var);
                this.this$0 = creditConsultingViewModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(access13800Var, this.this$0);
                int i2 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onextracallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 81 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<? extends CreditConsultingHistory>> access13800Var) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getAddPhoneContactDialog getaddphonecontactdialogOnNavigationEvent = CreditConsultingViewModel.onNavigationEvent(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getaddphonecontactdialogOnNavigationEvent.onExtraCallback(this);
                    if (obj == objOnWarmupCompleted) {
                        int i3 = onExtraCallbackWithResult + 33;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onWarmupCompleted + 119;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    throw apiErrorExtraCallbackWithResult;
                }
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (List) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<im.toss.features.credit.data.response.CreditConsultingHistory>");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(List.class, Object.class) || Intrinsics.areEqual(List.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    int i7 = onExtraCallbackWithResult + 99;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
        }

        public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditConsultingResponse>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CreditConsultingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(access13800 access13800Var, CreditConsultingViewModel creditConsultingViewModel) {
                super(2, access13800Var);
                this.this$0 = creditConsultingViewModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var, this.this$0);
                int i2 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                onExtraCallbackWithResult = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super CreditConsultingResponse> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                    int i3 = 64 / 0;
                } else {
                    objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                }
                int i4 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super CreditConsultingResponse> access13800Var) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return onwarmupcompletedCreate.invokeSuspend(unit);
                }
                onwarmupcompletedCreate.invokeSuspend(unit);
                throw null;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 != 0) {
                    access14300.onWarmupCompleted();
                    obj2.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getAddPhoneContactDialog getaddphonecontactdialogOnNavigationEvent = CreditConsultingViewModel.onNavigationEvent(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getaddphonecontactdialogOnNavigationEvent.onWarmupCompleted(this);
                    if (obj == objOnWarmupCompleted) {
                        int i4 = onExtraCallbackWithResult + 85;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult != null) {
                        throw apiErrorExtraCallbackWithResult;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    int i5 = onExtraCallbackWithResult + 15;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    throw apiErrorOnExtraCallbackWithResult;
                }
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.CreditConsultingResponse");
                    }
                    int i7 = onWarmupCompleted;
                    int i8 = i7 + 55;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    CreditConsultingResponse creditConsultingResponse = (CreditConsultingResponse) objOnTransact;
                    int i10 = i7 + 75;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 35 / 0;
                    }
                    return creditConsultingResponse;
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(CreditConsultingResponse.class, Object.class) && !Intrinsics.areEqual(CreditConsultingResponse.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult2 = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult2.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult2;
                    }
                    CreditConsultingResponse creditConsultingResponse2 = Unit.INSTANCE;
                    int i12 = onWarmupCompleted + 7;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return creditConsultingResponse2;
                }
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(creditConsultingViewModel), creditConsultingViewModel.getInterfaceDescriptor, (setRandomHost) null, creditConsultingViewModel.new IAuthTabCallbackStub(null), 2, (Object) null);
        int i2 = ICustomTabsCallback + 51;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $reservationNo;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CreditConsultingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(String str, CreditConsultingViewModel creditConsultingViewModel, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$reservationNo = str;
            this.this$0 = creditConsultingViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$reservationNo, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackCreate.invokeSuspend(unit);
            throw null;
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditConsultingResult>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ String $reservationNo$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CreditConsultingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, CreditConsultingViewModel creditConsultingViewModel, String str) {
                super(2, access13800Var);
                this.this$0 = creditConsultingViewModel;
                this.$reservationNo$inlined = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var, this.this$0, this.$reservationNo$inlined);
                int i2 = IAuthTabCallback + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 71;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super CreditConsultingResult> access13800Var) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 27;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getAddPhoneContactDialog getaddphonecontactdialogOnNavigationEvent = CreditConsultingViewModel.onNavigationEvent(this.this$0);
                    CreditConsultingCancelRequest creditConsultingCancelRequest = new CreditConsultingCancelRequest(this.$reservationNo$inlined);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getaddphonecontactdialogOnNavigationEvent.onExtraCallbackWithResult(creditConsultingCancelRequest, this);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = onNavigationEvent + 39;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    throw apiErrorExtraCallbackWithResult;
                }
                int i7 = IAuthTabCallback + 103;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (CreditConsultingResult) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.CreditConsultingResult");
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(CreditConsultingResult.class, Object.class)) {
                        int i9 = IAuthTabCallback + 39;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                            Intrinsics.areEqual(CreditConsultingResult.class, Unit.class);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (!Intrinsics.areEqual(CreditConsultingResult.class, Unit.class)) {
                            TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                            apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                            throw apiErrorOnExtraCallbackWithResult;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r10.emit(r2, r9) != r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
        
            if (r10 != r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
        
            if (r2.emit(r10, r9) == r1) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v3, types: [o.getBorderRadius] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, o.getBorderRadius] */
        /* JADX WARN: Type inference failed for: r2v9, types: [o.getBorderRadius] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            ?? r2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                r2 = i2;
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                r2 = i2;
            }
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$reservationNo == null) {
                    getBorderRadius getborderradiusIAuthTabCallback = CreditConsultingViewModel.IAuthTabCallback(this.this$0);
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                    this.label = 1;
                } else {
                    ?? IAuthTabCallback2 = CreditConsultingViewModel.IAuthTabCallback(this.this$0);
                    CreditConsultingViewModel creditConsultingViewModel = this.this$0;
                    String str = this.$reservationNo;
                    Result.Companion companion3 = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onNavigationEvent onnavigationevent = new onNavigationEvent(null, creditConsultingViewModel, str);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = IAuthTabCallback2;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 2;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
                    i2 = IAuthTabCallback2;
                }
                return objOnWarmupCompleted;
            }
            if (i2 == 1) {
                ResultKt.onNavigationEvent(obj);
                Unit unit = Unit.INSTANCE;
                int i3 = onWarmupCompleted + 75;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 117;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            ?? r22 = (getBorderRadius) this.L$1;
            ResultKt.onNavigationEvent(obj);
            int i7 = IAuthTabCallback + 57;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i2 = r22;
            obj2 = Result.constructor-impl(obj);
            r2 = i2;
            if (Result.onExtraCallback(obj2)) {
                obj2 = null;
            }
            CreditConsultingResult creditConsultingResult = (CreditConsultingResult) obj2;
            Boolean boolOnNavigationEvent2 = access14000.onNavigationEvent(creditConsultingResult != null ? creditConsultingResult.onExtraCallback() : false);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = CreditConsultingViewModel.this.new IAuthTabCallbackStub(access13800Var);
            int i2 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 0;
            }
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditConsultingReservationResponse>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ CreditConsultingReservationRequest $request$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CreditConsultingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, CreditConsultingViewModel creditConsultingViewModel, CreditConsultingReservationRequest creditConsultingReservationRequest) {
                super(2, access13800Var);
                this.this$0 = creditConsultingViewModel;
                this.$request$inlined = creditConsultingReservationRequest;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var, this.this$0, this.$request$inlined);
                int i2 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return onnavigationevent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnExtraCallbackWithResult;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super CreditConsultingReservationResponse> access13800Var) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 7 / 0;
                }
                return objInvokeSuspend;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallbackWithResult;
                    int i4 = i3 + 7;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 115;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    getAddPhoneContactDialog getaddphonecontactdialogOnNavigationEvent = CreditConsultingViewModel.onNavigationEvent(this.this$0);
                    CreditConsultingReservationRequest creditConsultingReservationRequestOnNavigationEvent = CreditConsultingReservationRequest.onNavigationEvent(this.$request$inlined, (String) null, this.this$0.asBinder(), (String) null, (String) null, 13, (Object) null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getaddphonecontactdialogOnNavigationEvent.IAuthTabCallback(creditConsultingReservationRequestOnNavigationEvent, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult != null) {
                        throw apiErrorExtraCallbackWithResult;
                    }
                    int i8 = onExtraCallbackWithResult + 61;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    TossApiCallException.ApiError.onExtraCallback onextracallback = TossApiCallException.ApiError.Companion;
                    if (i9 != 0) {
                        throw onextracallback.onExtraCallbackWithResult(baseApiResponse);
                    }
                    onextracallback.onExtraCallbackWithResult(baseApiResponse);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.CreditConsultingReservationResponse");
                    }
                    int i10 = onNavigationEvent + 107;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return (CreditConsultingReservationResponse) objOnTransact;
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(CreditConsultingReservationResponse.class, Object.class) || Intrinsics.areEqual(CreditConsultingReservationResponse.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
        
            if (r0.emit(r3, r25) != r9) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[PHI: r0
          0x009e: PHI (r0v57 java.lang.Object) = (r0v5 java.lang.Object), (r0v58 java.lang.Object) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r0 r9
          0x002a: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v58 java.lang.Object) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x002a: PHI (r9v1 int) = (r9v0 int), (r9v19 int) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            Object obj2;
            int i2;
            CreditConsultingReservationRequest creditConsultingReservationRequest;
            CreditConsultingViewModel creditConsultingViewModel;
            Object objOnExtraCallback;
            Object obj3;
            CreditConsultingViewModel creditConsultingViewModel2;
            Object obj4;
            getBorderRadius getborderradiusIAuthTabCallbackStub;
            Boolean boolOnNavigationEvent;
            CreditConsultingViewModel creditConsultingViewModel3;
            CreditConsultingReservationRequest creditConsultingReservationRequest2;
            Exception e;
            WebResourceResponseModel e2;
            Throwable th;
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i5 = 72 / 0;
                    if (i != 0) {
                        int i6 = i;
                        obj2 = objOnWarmupCompleted;
                        if (i6 != 1) {
                            int i7 = onExtraCallbackWithResult + 7;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 == 0 ? i6 == 2 : i6 == 3) {
                                ResultKt.onNavigationEvent(obj);
                                int i8 = onExtraCallbackWithResult + 121;
                                IAuthTabCallback = i8 % 128;
                                int i9 = i8 % 2;
                                return Unit.INSTANCE;
                            }
                            if (i6 == 3) {
                                i2 = this.I$0;
                                creditConsultingReservationRequest = (CreditConsultingReservationRequest) this.L$1;
                                creditConsultingViewModel = (CreditConsultingViewModel) this.L$0;
                                try {
                                    ResultKt.onNavigationEvent(obj);
                                    objOnExtraCallback = obj;
                                    obj3 = Result.constructor-impl(objOnExtraCallback);
                                    creditConsultingViewModel3 = creditConsultingViewModel;
                                } catch (WebResourceResponseModel e3) {
                                    e2 = e3;
                                    creditConsultingViewModel3 = creditConsultingViewModel;
                                    creditConsultingReservationRequest2 = creditConsultingReservationRequest;
                                    Result.Companion companion = Result.Companion;
                                    obj3 = Result.constructor-impl(ResultKt.createFailure(e2));
                                    creditConsultingReservationRequest = creditConsultingReservationRequest2;
                                    if (Result.onNavigationEvent(obj3)) {
                                    }
                                    th = Result.exceptionOrNull-impl(obj3);
                                    if (th != null) {
                                    }
                                    Result.IAuthTabCallback(obj3);
                                    obj4 = obj2;
                                    getborderradiusIAuthTabCallbackStub = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                                    boolOnNavigationEvent = access14000.onNavigationEvent(false);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 5;
                                    if (getborderradiusIAuthTabCallbackStub.emit(boolOnNavigationEvent, this) == obj4) {
                                    }
                                    return Unit.INSTANCE;
                                } catch (Exception e4) {
                                    e = e4;
                                    creditConsultingViewModel3 = creditConsultingViewModel;
                                    creditConsultingReservationRequest2 = creditConsultingReservationRequest;
                                    Result.Companion companion2 = Result.Companion;
                                    obj3 = Result.constructor-impl(ResultKt.createFailure(e));
                                    creditConsultingReservationRequest = creditConsultingReservationRequest2;
                                    if (Result.onNavigationEvent(obj3)) {
                                    }
                                    th = Result.exceptionOrNull-impl(obj3);
                                    if (th != null) {
                                    }
                                    Result.IAuthTabCallback(obj3);
                                    obj4 = obj2;
                                    getborderradiusIAuthTabCallbackStub = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                                    boolOnNavigationEvent = access14000.onNavigationEvent(false);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 5;
                                    if (getborderradiusIAuthTabCallbackStub.emit(boolOnNavigationEvent, this) == obj4) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (Result.onNavigationEvent(obj3)) {
                                    int i10 = onExtraCallbackWithResult + 97;
                                    IAuthTabCallback = i10 % 128;
                                    int i11 = i10 % 2;
                                    CreditConsultingReservationResponse creditConsultingReservationResponse = (CreditConsultingReservationResponse) obj3;
                                    if (creditConsultingReservationResponse.onNavigationEvent() == null) {
                                        getBorderRadius getborderradius = (getBorderRadius) CreditConsultingViewModel.onExtraCallbackWithResult(-1728175928, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), 1728175935, new Object[]{creditConsultingViewModel3});
                                        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(creditConsultingReservationResponse.onExtraCallbackWithResult(), creditConsultingReservationResponse.onWarmupCompleted());
                                        this.L$0 = creditConsultingViewModel3;
                                        this.L$1 = access15400.onNavigationEvent(creditConsultingReservationRequest);
                                        this.L$2 = obj3;
                                        this.L$3 = access15400.onNavigationEvent(creditConsultingReservationResponse);
                                        this.I$0 = i2;
                                        this.I$1 = 0;
                                        this.label = 4;
                                        if (getborderradius.emit(pairIAuthTabCallback, this) != obj2) {
                                            creditConsultingViewModel2 = creditConsultingViewModel3;
                                            int i12 = IAuthTabCallback + 47;
                                            onExtraCallbackWithResult = i12 % 128;
                                            int i13 = i12 % 2;
                                            creditConsultingViewModel3 = creditConsultingViewModel2;
                                        }
                                        return obj2;
                                    }
                                    int i14 = onExtraCallbackWithResult + 37;
                                    IAuthTabCallback = i14 % 128;
                                    int i15 = i14 % 2;
                                    CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel3, enableReportDataOptimize.onExtraCallback(creditConsultingViewModel3.onTransact(), null, null, null, null, null, null, creditConsultingReservationResponse, null, null, 191, null));
                                    CreditConsultingViewModel.onNavigationEvent(creditConsultingViewModel3, runtimeInfoAdd.AFTER_CONFIRM);
                                }
                                th = Result.exceptionOrNull-impl(obj3);
                                if (th != null) {
                                }
                                Result.IAuthTabCallback(obj3);
                                obj4 = obj2;
                                getborderradiusIAuthTabCallbackStub = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                                boolOnNavigationEvent = access14000.onNavigationEvent(false);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 5;
                                if (getborderradiusIAuthTabCallbackStub.emit(boolOnNavigationEvent, this) == obj4) {
                                }
                            } else if (i6 == 4) {
                                obj3 = this.L$2;
                                creditConsultingViewModel2 = (CreditConsultingViewModel) this.L$0;
                                ResultKt.onNavigationEvent(obj);
                                int i122 = IAuthTabCallback + 47;
                                onExtraCallbackWithResult = i122 % 128;
                                int i132 = i122 % 2;
                                creditConsultingViewModel3 = creditConsultingViewModel2;
                                th = Result.exceptionOrNull-impl(obj3);
                                if (th != null) {
                                    CreditConsultingViewModel.onExtraCallback(creditConsultingViewModel3).setValue(th);
                                }
                                Result.IAuthTabCallback(obj3);
                                obj4 = obj2;
                                getborderradiusIAuthTabCallbackStub = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                                boolOnNavigationEvent = access14000.onNavigationEvent(false);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 5;
                                if (getborderradiusIAuthTabCallbackStub.emit(boolOnNavigationEvent, this) == obj4) {
                                    return obj4;
                                }
                            } else {
                                if (i6 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.onNavigationEvent(obj);
                            }
                        } else {
                            ResultKt.onNavigationEvent(obj);
                        }
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        getBorderRadius getborderradiusIAuthTabCallbackStub2 = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                        Boolean boolOnNavigationEvent2 = access14000.onNavigationEvent(true);
                        this.label = 1;
                        if (getborderradiusIAuthTabCallbackStub2.emit(boolOnNavigationEvent2, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                        obj2 = objOnWarmupCompleted;
                    }
                    creditConsultingReservationRequest2 = (CreditConsultingReservationRequest) enableReportDataOptimize.onWarmupCompleted(new Object[]{CreditConsultingViewModel.this.onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 325556708, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -325556707);
                    if (creditConsultingReservationRequest2 != null) {
                        creditConsultingViewModel3 = CreditConsultingViewModel.this;
                        if (creditConsultingReservationRequest2.onExtraCallbackWithResult()) {
                            try {
                                Result.Companion companion3 = Result.Companion;
                                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                                onNavigationEvent onnavigationevent = new onNavigationEvent(null, creditConsultingViewModel3, creditConsultingReservationRequest2);
                                this.L$0 = creditConsultingViewModel3;
                                this.L$1 = access15400.onNavigationEvent(creditConsultingReservationRequest2);
                                this.L$2 = access15400.onNavigationEvent(this);
                                this.L$3 = access15400.onNavigationEvent(this);
                                this.I$0 = 0;
                                this.I$1 = 0;
                                this.I$2 = 0;
                                this.I$3 = 0;
                                this.label = 3;
                                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
                            } catch (WebResourceResponseModel e5) {
                                e2 = e5;
                                i2 = 0;
                                Result.Companion companion4 = Result.Companion;
                                obj3 = Result.constructor-impl(ResultKt.createFailure(e2));
                                creditConsultingReservationRequest = creditConsultingReservationRequest2;
                                if (Result.onNavigationEvent(obj3)) {
                                }
                                th = Result.exceptionOrNull-impl(obj3);
                                if (th != null) {
                                }
                                Result.IAuthTabCallback(obj3);
                                obj4 = obj2;
                                getborderradiusIAuthTabCallbackStub = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                                boolOnNavigationEvent = access14000.onNavigationEvent(false);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 5;
                                if (getborderradiusIAuthTabCallbackStub.emit(boolOnNavigationEvent, this) == obj4) {
                                }
                                return Unit.INSTANCE;
                            } catch (Exception e6) {
                                e = e6;
                                i2 = 0;
                                Result.Companion companion22 = Result.Companion;
                                obj3 = Result.constructor-impl(ResultKt.createFailure(e));
                                creditConsultingReservationRequest = creditConsultingReservationRequest2;
                                if (Result.onNavigationEvent(obj3)) {
                                }
                                th = Result.exceptionOrNull-impl(obj3);
                                if (th != null) {
                                }
                                Result.IAuthTabCallback(obj3);
                                obj4 = obj2;
                                getborderradiusIAuthTabCallbackStub = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                                boolOnNavigationEvent = access14000.onNavigationEvent(false);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 5;
                                if (getborderradiusIAuthTabCallbackStub.emit(boolOnNavigationEvent, this) == obj4) {
                                }
                                return Unit.INSTANCE;
                            }
                            if (objOnExtraCallback != obj2) {
                                int i16 = onExtraCallbackWithResult + 69;
                                IAuthTabCallback = i16 % 128;
                                i2 = i16 % 2 == 0 ? 0 : 1;
                                creditConsultingReservationRequest = creditConsultingReservationRequest2;
                                creditConsultingViewModel = creditConsultingViewModel3;
                                obj3 = Result.constructor-impl(objOnExtraCallback);
                                creditConsultingViewModel3 = creditConsultingViewModel;
                                if (Result.onNavigationEvent(obj3)) {
                                }
                                th = Result.exceptionOrNull-impl(obj3);
                                if (th != null) {
                                }
                                Result.IAuthTabCallback(obj3);
                            }
                        } else {
                            int i17 = IAuthTabCallback + 123;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            getBorderRadius getborderradius2 = (getBorderRadius) CreditConsultingViewModel.onExtraCallbackWithResult(-1728175928, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), 1728175935, new Object[]{creditConsultingViewModel3});
                            AFj1rSDK aFj1rSDK = AFj1rSDK.onExtraCallback;
                            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(aFj1rSDK.onExtraCallbackWithResult(R.string.credit_consulting_cancel_fail_toast), aFj1rSDK.onExtraCallbackWithResult(R.string.credit_consulting_fail_select_date_title));
                            this.L$0 = access15400.onNavigationEvent(creditConsultingReservationRequest2);
                            this.I$0 = 0;
                            this.label = 2;
                        }
                        return obj2;
                    }
                    obj4 = obj2;
                    getborderradiusIAuthTabCallbackStub = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                    boolOnNavigationEvent = access14000.onNavigationEvent(false);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 5;
                    if (getborderradiusIAuthTabCallbackStub.emit(boolOnNavigationEvent, this) == obj4) {
                    }
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    if (i != 0) {
                    }
                    creditConsultingReservationRequest2 = (CreditConsultingReservationRequest) enableReportDataOptimize.onWarmupCompleted(new Object[]{CreditConsultingViewModel.this.onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 325556708, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -325556707);
                    if (creditConsultingReservationRequest2 != null) {
                    }
                    obj4 = obj2;
                    getborderradiusIAuthTabCallbackStub = CreditConsultingViewModel.IAuthTabCallbackStub(CreditConsultingViewModel.this);
                    boolOnNavigationEvent = access14000.onNavigationEvent(false);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 5;
                    if (getborderradiusIAuthTabCallbackStub.emit(boolOnNavigationEvent, this) == obj4) {
                    }
                }
                return Unit.INSTANCE;
            } catch (CancellationException e7) {
                throw e7;
            }
        }
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ runtimeInfoAdd $historyDetailType;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(runtimeInfoAdd runtimeinfoadd, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$historyDetailType = runtimeinfoadd;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = CreditConsultingViewModel.this.new access000(this.$historyDetailType, access13800Var);
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 90 / 0;
            }
            return objInvokeSuspend;
        }

        public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditConsultingReservationResponse>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CreditConsultingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(access13800 access13800Var, CreditConsultingViewModel creditConsultingViewModel) {
                super(2, access13800Var);
                this.this$0 = creditConsultingViewModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(access13800Var, this.this$0);
                int i2 = onWarmupCompleted + 123;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 63 / 0;
                }
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                if (i3 != 0) {
                    int i4 = 96 / 0;
                }
                int i5 = onWarmupCompleted + 105;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super CreditConsultingReservationResponse> access13800Var) throws TossApiCallException.ApiError {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                    int i4 = 46 / 0;
                } else {
                    objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = IAuthTabCallback + 23;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj2 = null;
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 5;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    getAddPhoneContactDialog getaddphonecontactdialogOnNavigationEvent = CreditConsultingViewModel.onNavigationEvent(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getaddphonecontactdialogOnNavigationEvent.IAuthTabCallback(this);
                    if (obj == objOnWarmupCompleted) {
                        int i4 = IAuthTabCallback + 9;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    throw apiErrorExtraCallbackWithResult;
                }
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.CreditConsultingReservationResponse");
                    }
                    int i5 = IAuthTabCallback + 115;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return (CreditConsultingReservationResponse) objOnTransact;
                    }
                    obj2.hashCode();
                    throw null;
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(CreditConsultingReservationResponse.class, Object.class) || Intrinsics.areEqual(CreditConsultingReservationResponse.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    int i6 = onWarmupCompleted + 3;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e).onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        obj2.hashCode();
                        throw null;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        
            if (r0 != r4) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
        
            if (r3.emit(r7, r19) == r4) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
        
            r0 = im.toss.feature.credit.ui.main.consulting.CreditConsultingViewModel.access000.onNavigationEvent + 5;
            im.toss.feature.credit.ui.main.consulting.CreditConsultingViewModel.access000.onExtraCallback = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
        
            return r4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            Object obj3 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
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
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                CreditConsultingViewModel creditConsultingViewModel = CreditConsultingViewModel.this;
                Result.Companion companion3 = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(null, creditConsultingViewModel);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, this);
            } else {
                if (i3 != 1) {
                    int i4 = onExtraCallback + 17;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0 ? i3 != 2 : i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            obj2 = Result.constructor-impl(objOnExtraCallback);
            CreditConsultingViewModel creditConsultingViewModel2 = CreditConsultingViewModel.this;
            runtimeInfoAdd runtimeinfoadd = this.$historyDetailType;
            if (Result.onNavigationEvent(obj2)) {
                CreditConsultingReservationResponse creditConsultingReservationResponse = (CreditConsultingReservationResponse) obj2;
                CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel2, enableReportDataOptimize.onExtraCallback(creditConsultingViewModel2.onTransact(), null, null, null, null, null, null, creditConsultingReservationResponse, runtimeinfoadd, null, 319, null));
                getBorderRadius getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(creditConsultingViewModel2);
                getBoolean.asBinder asbinder = getBoolean.asBinder.onWarmupCompleted;
                this.L$0 = obj2;
                this.L$1 = access15400.onNavigationEvent(creditConsultingReservationResponse);
                this.I$0 = 0;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ CreditConsultingCategory $category;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(CreditConsultingCategory creditConsultingCategory, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$category = creditConsultingCategory;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = CreditConsultingViewModel.this.new onExtraCallbackWithResult(this.$category, access13800Var);
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditConsultingTimetableResponse>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ CreditConsultingCategory $category$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CreditConsultingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, CreditConsultingViewModel creditConsultingViewModel, CreditConsultingCategory creditConsultingCategory) {
                super(2, access13800Var);
                this.this$0 = creditConsultingViewModel;
                this.$category$inlined = creditConsultingCategory;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var, this.this$0, this.$category$inlined);
                int i2 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 86 / 0;
                }
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super CreditConsultingTimetableResponse> access13800Var) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnNavigationEvent;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    CreditConsultingViewModel creditConsultingViewModel = this.this$0;
                    CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel, enableReportDataOptimize.onExtraCallback(creditConsultingViewModel.onTransact(), null, null, null, null, null, null, null, null, new CreditConsultingReservationRequest(this.$category$inlined.onExtraCallbackWithResult(), (String) null, this.$category$inlined.IAuthTabCallback(), (String) null, 10, (DefaultConstructorMarker) null), 255, null));
                    getAddPhoneContactDialog getaddphonecontactdialogOnNavigationEvent = CreditConsultingViewModel.onNavigationEvent(this.this$0);
                    String strOnExtraCallbackWithResult = this.$category$inlined.onExtraCallbackWithResult();
                    String strIAuthTabCallback = this.$category$inlined.IAuthTabCallback();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    objOnNavigationEvent = getaddphonecontactdialogOnNavigationEvent.onNavigationEvent(strOnExtraCallbackWithResult, strIAuthTabCallback, this);
                    if (objOnNavigationEvent == objOnWarmupCompleted) {
                        int i5 = onNavigationEvent + 47;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) objOnNavigationEvent;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult != null) {
                        throw apiErrorExtraCallbackWithResult;
                    }
                    int i6 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    int i7 = 67 / 0;
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact == null) {
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.CreditConsultingTimetableResponse");
                    }
                    int i8 = onExtraCallbackWithResult + 41;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return (CreditConsultingTimetableResponse) objOnTransact;
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(CreditConsultingTimetableResponse.class, Object.class)) {
                        int i10 = onExtraCallbackWithResult + 83;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            Intrinsics.areEqual(CreditConsultingTimetableResponse.class, Unit.class);
                            throw null;
                        }
                        if (!Intrinsics.areEqual(CreditConsultingTimetableResponse.class, Unit.class)) {
                            TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                            apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                            throw apiErrorOnExtraCallbackWithResult;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj3 = null;
            try {
                if (i2 != 0) {
                    int i3 = onExtraCallbackWithResult + 55;
                    int i4 = i3 % 128;
                    IAuthTabCallback = i4;
                    int i5 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 15;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i7 = 43 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                    objOnExtraCallback = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    CreditConsultingViewModel creditConsultingViewModel = CreditConsultingViewModel.this;
                    CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel, enableReportDataOptimize.onExtraCallback(creditConsultingViewModel.onTransact(), null, null, this.$category, null, null, null, null, null, null, 507, null));
                    CreditConsultingViewModel creditConsultingViewModel2 = CreditConsultingViewModel.this;
                    CreditConsultingCategory creditConsultingCategory = this.$category;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onNavigationEvent onnavigationevent = new onNavigationEvent(null, creditConsultingViewModel2, creditConsultingCategory);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                obj2 = Result.constructor-impl(objOnExtraCallback);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            CreditConsultingViewModel creditConsultingViewModel3 = CreditConsultingViewModel.this;
            if (Result.onNavigationEvent(obj2)) {
                int i8 = IAuthTabCallback + 99;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    CreditConsultingViewModel.onNavigationEvent(creditConsultingViewModel3, (CreditConsultingTimetableResponse) obj2);
                    CreditConsultingViewModel.asInterface(creditConsultingViewModel3);
                    obj3.hashCode();
                    throw null;
                }
                CreditConsultingViewModel.onNavigationEvent(creditConsultingViewModel3, (CreditConsultingTimetableResponse) obj2);
                CreditConsultingViewModel.asInterface(creditConsultingViewModel3);
            }
            CreditConsultingViewModel creditConsultingViewModel4 = CreditConsultingViewModel.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                int i9 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CreditConsultingViewModel.onExtraCallback(creditConsultingViewModel4).setValue(th);
                    obj3.hashCode();
                    throw null;
                }
                CreditConsultingViewModel.onExtraCallback(creditConsultingViewModel4).setValue(th);
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(creditConsultingViewModel), creditConsultingViewModel.getInterfaceDescriptor, (setRandomHost) null, new IAuthTabCallback((String) objArr[1], creditConsultingViewModel, null), 2, (Object) null);
        int i2 = onMessageChannelReady + 91;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(runtimeInfoAdd runtimeinfoadd) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new access000(runtimeinfoadd, null), 2, (Object) null);
        int i2 = onMessageChannelReady + 85;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void access100() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new access100(null), 2, (Object) null);
        int i2 = ICustomTabsCallback + 97;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = CreditConsultingViewModel.this.new access100(access13800Var);
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 76 / 0;
            }
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                CreditConsultingViewModel creditConsultingViewModel = CreditConsultingViewModel.this;
                enableReportDataOptimize enablereportdataoptimizeOnTransact = creditConsultingViewModel.onTransact();
                CreditConsultingReservationRequest creditConsultingReservationRequest = (CreditConsultingReservationRequest) enableReportDataOptimize.onWarmupCompleted(new Object[]{CreditConsultingViewModel.this.onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 325556708, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -325556707);
                CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel, enableReportDataOptimize.onExtraCallback(enablereportdataoptimizeOnTransact, null, null, null, null, creditConsultingReservationRequest != null ? creditConsultingReservationRequest.onExtraCallback() : null, null, null, null, null, 495, null));
                getBorderRadius getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(CreditConsultingViewModel.this);
                getBoolean.IAuthTabCallback iAuthTabCallback = getBoolean.IAuthTabCallback.onExtraCallbackWithResult;
                this.label = 1;
                if (getborderradiusOnExtraCallbackWithResult.emit(iAuthTabCallback, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new IAuthTabCallbackStubProxy(null), 2, (Object) null);
        int i2 = ICustomTabsCallback + 95;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = CreditConsultingViewModel.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = onExtraCallbackWithResult + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 0;
            }
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 69 / 0;
            }
            int i5 = onExtraCallback + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxyCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                iAuthTabCallbackStubProxyCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackStubProxyCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onExtraCallback + 103;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(CreditConsultingViewModel.this);
                getBoolean.IAuthTabCallbackStub iAuthTabCallbackStub = getBoolean.IAuthTabCallbackStub.onExtraCallback;
                this.label = 1;
                if (getborderradiusOnExtraCallbackWithResult.emit(iAuthTabCallbackStub, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallbackWithResult + 11;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(@NotNull final CreditConsultingCategory creditConsultingCategory) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(creditConsultingCategory, "");
        this.readTypedObject.onWarmupCompleted(new Function0() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingViewModel$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                CreditConsultingViewModel creditConsultingViewModel = this.f$0;
                if (i4 == 0) {
                    return CreditConsultingViewModel.onNavigationEvent(creditConsultingViewModel, creditConsultingCategory);
                }
                int i5 = 48 / 0;
                return CreditConsultingViewModel.onNavigationEvent(creditConsultingViewModel, creditConsultingCategory);
            }
        });
        int i2 = onMessageChannelReady + 119;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(CreditConsultingViewModel creditConsultingViewModel, CreditConsultingCategory creditConsultingCategory) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(creditConsultingViewModel), creditConsultingViewModel.getInterfaceDescriptor, (setRandomHost) null, creditConsultingViewModel.new onExtraCallbackWithResult(creditConsultingCategory, null), 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 117;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new onNavigationEvent(null), 2, (Object) null);
        int i2 = ICustomTabsCallback + 43;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = CreditConsultingViewModel.this.new onNavigationEvent(access13800Var);
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallback + 37;
                int i6 = i5 % 128;
                onNavigationEvent = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 109;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                int i10 = onNavigationEvent + 115;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(CreditConsultingViewModel.this);
                getBoolean.onExtraCallbackWithResult onextracallbackwithresult = getBoolean.onExtraCallbackWithResult.onWarmupCompleted;
                this.label = 1;
                if (getborderradiusOnExtraCallbackWithResult.emit(onextracallbackwithresult, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent(@NotNull CreditConsultingHistory creditConsultingHistory) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(creditConsultingHistory, "");
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new onExtraCallback(creditConsultingHistory, null), 2, (Object) null);
        int i2 = ICustomTabsCallback + 5;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ CreditConsultingHistory $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(CreditConsultingHistory creditConsultingHistory, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$item = creditConsultingHistory;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = CreditConsultingViewModel.this.new onExtraCallback(this.$item, access13800Var);
            int i2 = onExtraCallback + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
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
                CreditConsultingViewModel creditConsultingViewModel = CreditConsultingViewModel.this;
                CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel, enableReportDataOptimize.onExtraCallback(creditConsultingViewModel.onTransact(), null, null, null, null, null, this.$item, null, null, null, 479, null));
                getBorderRadius getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(CreditConsultingViewModel.this);
                getBoolean.onNavigationEvent onnavigationevent = getBoolean.onNavigationEvent.IAuthTabCallback;
                this.label = 1;
                if (getborderradiusOnExtraCallbackWithResult.emit(onnavigationevent, this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 57;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    if (i4 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    int i6 = i5 + 13;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(int i, int i2, int i3) {
        int i4 = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new extraCallback(this, i2, i3, i, (access13800) null), 2, (Object) null);
        int i5 = onMessageChannelReady + 17;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(CreditConsultingTimetableResponse creditConsultingTimetableResponse) {
        int i = 2 % 2;
        getCornerRadius<SortedMap<priorityUploadRate, List<CreditConsultingTime>>> getcornerradius = this.asBinder;
        List listOnExtraCallbackWithResult = creditConsultingTimetableResponse.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            int i2 = onMessageChannelReady + 21;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                ((CreditConsultingTime) it.next()).onWarmupCompleted();
                throw null;
            }
            Object next = it.next();
            if (((CreditConsultingTime) next).onWarmupCompleted()) {
                arrayList.add(next);
                int i3 = ICustomTabsCallback + 51;
                onMessageChannelReady = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (!(!it2.hasNext())) {
            Object next2 = it2.next();
            priorityUploadRate priorityuploadrateOnExtraCallbackWithResult = priorityUploadRate.Companion.onExtraCallbackWithResult((CreditConsultingTime) next2);
            Object arrayList2 = linkedHashMap.get(priorityuploadrateOnExtraCallbackWithResult);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(priorityuploadrateOnExtraCallbackWithResult, arrayList2);
            }
            ((List) arrayList2).add(next2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(access8100.IAuthTabCallback(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), CollectionsKt.sortedWith((Iterable) entry.getValue(), new readTypedObject()));
        }
        final Function2 function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingViewModel$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 101;
                onExtraCallback = i6 % 128;
                priorityUploadRate priorityuploadrate = (priorityUploadRate) obj;
                priorityUploadRate priorityuploadrate2 = (priorityUploadRate) obj2;
                if (i6 % 2 != 0) {
                    int iOnExtraCallback = matches.onExtraCallback();
                    int iOnExtraCallback2 = matches.onExtraCallback();
                    int iOnExtraCallback3 = matches.onExtraCallback();
                    Integer.valueOf(((Integer) CreditConsultingViewModel.onExtraCallbackWithResult(-515032278, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 515032281, new Object[]{priorityuploadrate, priorityuploadrate2})).intValue());
                    throw null;
                }
                int iOnExtraCallback4 = matches.onExtraCallback();
                int iOnExtraCallback5 = matches.onExtraCallback();
                int iOnExtraCallback6 = matches.onExtraCallback();
                Integer numValueOf = Integer.valueOf(((Integer) CreditConsultingViewModel.onExtraCallbackWithResult(-515032278, iOnExtraCallback5, matches.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback4, 515032281, new Object[]{priorityuploadrate, priorityuploadrate2})).intValue());
                int i7 = onExtraCallback + 79;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return numValueOf;
            }
        };
        getcornerradius.onWarmupCompleted(access8100.onWarmupCompleted(linkedHashMap2, new Comparator() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingViewModel$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                Function2 function22 = function2;
                if (i7 != 0) {
                    return CreditConsultingViewModel.IAuthTabCallback(function22, obj, obj2);
                }
                CreditConsultingViewModel.IAuthTabCallback(function22, obj, obj2);
                throw null;
            }
        }));
    }

    private static final int onExtraCallback(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) function2.invoke(obj, obj2)).intValue();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return iIntValue;
    }

    private static final int onExtraCallback(priorityUploadRate priorityuploadrate, priorityUploadRate priorityuploadrate2) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 99;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOrdinal = priorityuploadrate.ordinal();
        int iOrdinal2 = priorityuploadrate2.ordinal();
        if (i3 == 0) {
            return Intrinsics.compare(iOrdinal, iOrdinal2);
        }
        int iCompare = Intrinsics.compare(iOrdinal, iOrdinal2);
        int i4 = 19 / 0;
        return iCompare;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ CreditConsultingTime $creditConsultingTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(CreditConsultingTime creditConsultingTime, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$creditConsultingTime = creditConsultingTime;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = CreditConsultingViewModel.this.new asInterface(this.$creditConsultingTime, access13800Var);
            int i2 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[PHI: r1 r2 r13
          0x0080: PHI (r1v7 o.enableReportDataOptimize) = (r1v6 o.enableReportDataOptimize), (r1v10 o.enableReportDataOptimize) binds: [B:12:0x007e, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
          0x0080: PHI (r2v7 im.toss.features.credit.data.request.CreditConsultingReservationRequest) = 
          (r2v6 im.toss.features.credit.data.request.CreditConsultingReservationRequest)
          (r2v12 im.toss.features.credit.data.request.CreditConsultingReservationRequest)
         binds: [B:12:0x007e, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
          0x0080: PHI (r13v3 im.toss.feature.credit.ui.main.consulting.CreditConsultingViewModel) = 
          (r13v2 im.toss.feature.credit.ui.main.consulting.CreditConsultingViewModel)
          (r13v6 im.toss.feature.credit.ui.main.consulting.CreditConsultingViewModel)
         binds: [B:12:0x007e, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CreditConsultingViewModel creditConsultingViewModel;
            enableReportDataOptimize enablereportdataoptimizeOnTransact;
            CreditConsultingReservationRequest creditConsultingReservationRequest;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            CreditConsultingReservationRequest creditConsultingReservationRequestOnNavigationEvent = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i3 + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i5 != 0) {
                creditConsultingViewModel = CreditConsultingViewModel.this;
                enablereportdataoptimizeOnTransact = creditConsultingViewModel.onTransact();
                creditConsultingReservationRequest = (CreditConsultingReservationRequest) enableReportDataOptimize.onWarmupCompleted(new Object[]{CreditConsultingViewModel.this.onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 325556708, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -325556707);
                int i6 = 73 / 0;
                if (creditConsultingReservationRequest != null) {
                    int i7 = onWarmupCompleted + 69;
                    onExtraCallbackWithResult = i7 % 128;
                    creditConsultingReservationRequestOnNavigationEvent = i7 % 2 != 0 ? CreditConsultingReservationRequest.onNavigationEvent(creditConsultingReservationRequest, (String) null, (String) null, (String) null, this.$creditConsultingTime.onExtraCallback(), 119, (Object) null) : CreditConsultingReservationRequest.onNavigationEvent(creditConsultingReservationRequest, (String) null, (String) null, (String) null, this.$creditConsultingTime.onExtraCallback(), 7, (Object) null);
                }
            } else {
                creditConsultingViewModel = CreditConsultingViewModel.this;
                enablereportdataoptimizeOnTransact = creditConsultingViewModel.onTransact();
                creditConsultingReservationRequest = (CreditConsultingReservationRequest) enableReportDataOptimize.onWarmupCompleted(new Object[]{CreditConsultingViewModel.this.onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 325556708, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -325556707);
                if (creditConsultingReservationRequest != null) {
                }
            }
            CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel, enableReportDataOptimize.onExtraCallback(enablereportdataoptimizeOnTransact, null, null, null, this.$creditConsultingTime, null, null, null, null, creditConsultingReservationRequestOnNavigationEvent, 247, null));
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull CreditConsultingTime creditConsultingTime) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(creditConsultingTime, "");
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new asInterface(creditConsultingTime, null), 2, (Object) null);
        int i2 = onMessageChannelReady + 61;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = CreditConsultingViewModel.this.new onWarmupCompleted(access13800Var);
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnExtraCallback;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            CreditConsultingViewModel creditConsultingViewModel = CreditConsultingViewModel.this;
            enableReportDataOptimize enablereportdataoptimizeOnTransact = creditConsultingViewModel.onTransact();
            CreditConsultingReservationRequest creditConsultingReservationRequest = (CreditConsultingReservationRequest) enableReportDataOptimize.onWarmupCompleted(new Object[]{CreditConsultingViewModel.this.onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 325556708, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -325556707);
            Object obj2 = null;
            CreditConsultingViewModel.IAuthTabCallback(creditConsultingViewModel, enableReportDataOptimize.onExtraCallback(enablereportdataoptimizeOnTransact, null, null, null, null, null, null, null, null, creditConsultingReservationRequest != null ? CreditConsultingReservationRequest.onNavigationEvent(creditConsultingReservationRequest, (String) null, (String) null, (String) null, "", 7, (Object) null) : null, 247, null));
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new onWarmupCompleted(null), 2, (Object) null);
        int i2 = ICustomTabsCallback + 21;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new asBinder(null), 2, (Object) null);
        int i2 = ICustomTabsCallback + 1;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = CreditConsultingViewModel.this.new asBinder(access13800Var);
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(CreditConsultingViewModel.this);
                getBoolean.onWarmupCompleted onwarmupcompleted = getBoolean.onWarmupCompleted.onExtraCallback;
                this.label = 1;
                if (getborderradiusOnExtraCallbackWithResult.emit(onwarmupcompleted, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 57 / 0;
            }
            return unit;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), this.getInterfaceDescriptor, (setRandomHost) null, new IAuthTabCallbackDefault(null), 2, (Object) null);
        int i2 = ICustomTabsCallback + 5;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = CreditConsultingViewModel.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = 95 / 0;
            } else {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusOnExtraCallbackWithResult = CreditConsultingViewModel.onExtraCallbackWithResult(CreditConsultingViewModel.this);
                getBoolean.onExtraCallback onextracallback = getBoolean.onExtraCallback.onNavigationEvent;
                this.label = 1;
                if (getborderradiusOnExtraCallbackWithResult.emit(onextracallback, this) == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 101;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 5 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            String str = (String) this.onTransact.onExtraCallbackWithResult();
            int i3 = onMessageChannelReady + 11;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 63;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onTransact.IAuthTabCallback(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact.IAuthTabCallback(str);
        int i3 = onMessageChannelReady + 1;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ int onNavigationEvent(priorityUploadRate priorityuploadrate, priorityUploadRate priorityuploadrate2) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return ((Integer) onExtraCallbackWithResult(-515032278, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 515032281, new Object[]{priorityuploadrate, priorityuploadrate2})).intValue();
    }

    public static final /* synthetic */ getBorderRadius asBinder(CreditConsultingViewModel creditConsultingViewModel) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (getBorderRadius) onExtraCallbackWithResult(-1728175928, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 1728175935, new Object[]{creditConsultingViewModel});
    }

    private final void ICustomTabsCallback() {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        onExtraCallbackWithResult(-1390001988, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 1390001993, new Object[]{this});
    }

    private final void readTypedObject() {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        onExtraCallbackWithResult(938131415, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -938131413, new Object[]{this});
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        onExtraCallbackWithResult(-1885559556, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 1885559556, new Object[]{this, str});
    }

    public final void onExtraCallbackWithResult() {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        onExtraCallbackWithResult(-269544681, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 269544685, new Object[]{this});
    }

    public final LiveData<Throwable> asInterface() {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (LiveData) onExtraCallbackWithResult(1480574795, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -1480574794, new Object[]{this});
    }

    public final LiveData<SortedMap<priorityUploadRate, List<CreditConsultingTime>>> IAuthTabCallbackStubProxy() {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iOnExtraCallback3 = matches.onExtraCallback();
        return (LiveData) onExtraCallbackWithResult(-1926502337, iOnExtraCallback2, matches.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 1926502343, new Object[]{this});
    }
}
