package im.toss.core.tracker;

import android.content.Context;
import android.graphics.Color;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.internal.ads.zzgc;
import com.tmoney.LiveCheckConstants;
import im.toss.core.tracker.LogFlushScheduler;
import im.toss.core.tracker.LogFlushScheduler$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AppSetIdAndScope1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ComputeLandmarkConfidence;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.Deinitialize;
import o.DetectFaceInContinuousImage;
import o.EstimateFaceQuality;
import o.FeatureExtension;
import o.GeckoHubImp;
import o.GetDetectingInterval;
import o.GetFeatureExtension;
import o.GetInputImageFromPathAsUnchanged;
import o.Initialize;
import o.JsonReaderEmptyEOFException;
import o.JsonReaderUnknownNumberParsing;
import o.MapConverter;
import o.NetConverter3;
import o.ResetTrackState;
import o.RetrofitInstance;
import o.RetrofitService;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.auth;
import o.clearTid;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.doGet;
import o.downloadZip;
import o.ea10;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getByteBuffer;
import o.getPackageType;
import o.getTimestampBytes;
import o.getWrite;
import o.initRenderFinish;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.serializeRaw;
import o.setApTextSize;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LogFlushScheduler {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char[] IAuthTabCallback_Parcel = null;
    private static int ICustomTabsCallback = 1;
    private static char access000 = 0;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult;
    private static final AppSetIdAndScope1 onExtraCallback;
    private final ConcurrentHashMap<String, Integer> IAuthTabCallback;
    private final getTimestampBytes<DetectFaceInContinuousImage> IAuthTabCallbackDefault;
    private final Initialize<Integer> IAuthTabCallbackStub;
    private GetDetectingInterval access100;
    private RetrofitService asBinder;
    private FeatureExtension asInterface;
    private final getTimestampBytes<DetectFaceInContinuousImage> getInterfaceDescriptor;
    private final Lazy onExtraCallbackWithResult;
    private final ResetTrackState onNavigationEvent;
    private GetInputImageFromPathAsUnchanged onTransact;
    private Function1<? super access13800<? super Unit>, ? extends Object> onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = LogFlushScheduler.onNavigationEvent(LogFlushScheduler.this, (String) null, (access13800) this);
            int i4 = onExtraCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class IAuthTabCallback_Parcel extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = LogFlushScheduler.onExtraCallback(-1013777256, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{LogFlushScheduler.this, null, this}, 1013777256, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static final class getInterfaceDescriptor extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallback = LogFlushScheduler.onExtraCallback(1315167964, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{LogFlushScheduler.this, null, null, this}, -1315167963, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) objArr[0];
        LogFlushScheduler logFlushScheduler = (LogFlushScheduler) objArr[1];
        DetectFaceInContinuousImage detectFaceInContinuousImage = (DetectFaceInContinuousImage) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(coroutineExceptionHandler, logFlushScheduler, detectFaceInContinuousImage);
        int i4 = ICustomTabsCallback + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i6 | i)) | (~(i7 | i9));
        int i12 = ~(i9 | i5 | i);
        int i13 = i5 + i + i3 + ((-194346734) * i2) + (9035316 * i4);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i5) - 443744256) + ((-1492047866) * i) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i3) + (1190920192 * i2) + (1456996352 * i4) + ((-1774911488) * i14);
        int i16 = (i5 * 1174986172) + 1294669563 + (i * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i3 * 1174986385) + (i2 * (-1060063438)) + (i4 * 107475828) + (i14 * 168099840);
        switch (i15 + (i16 * i16 * 40566784)) {
            case 1:
                LogFlushScheduler logFlushScheduler = (LogFlushScheduler) objArr[0];
                RetrofitInstance retrofitInstance = (RetrofitInstance) objArr[1];
                List<JsonObject> list = (List) objArr[2];
                access13800<? super Unit> access13800Var = (access13800) objArr[3];
                int i17 = 2 % 2;
                int i18 = ICustomTabsCallback + 111;
                IAuthTabCallbackStubProxy = i18 % 128;
                int i19 = i18 % 2;
                Object objOnExtraCallback = logFlushScheduler.onExtraCallback(retrofitInstance, list, access13800Var);
                int i20 = ICustomTabsCallback + 39;
                IAuthTabCallbackStubProxy = i20 % 128;
                int i21 = i20 % 2;
                return objOnExtraCallback;
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                LogFlushScheduler logFlushScheduler2 = (LogFlushScheduler) objArr[0];
                String str = (String) objArr[1];
                List list2 = (List) objArr[2];
                String str2 = (String) objArr[3];
                String str3 = (String) objArr[4];
                int i22 = 2 % 2;
                int i23 = IAuthTabCallbackStubProxy + 9;
                ICustomTabsCallback = i23 % 128;
                int i24 = i23 % 2;
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                onExtraCallback(-357308579, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler2, str, list2, str2, str3}, 357308585, iOnNavigationEvent);
                int i25 = ICustomTabsCallback + 123;
                IAuthTabCallbackStubProxy = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                LogFlushScheduler logFlushScheduler3 = (LogFlushScheduler) objArr[0];
                final deserializeDecimalCollection deserializedecimalcollection = (deserializeDecimalCollection) objArr[1];
                int i27 = 2 % 2;
                logFlushScheduler3.IAuthTabCallbackDefault.onExtraCallback(new DetectFaceInContinuousImage(null, new Function0() { // from class: im.toss.core.tracker.LogFlushScheduler$$ExternalSyntheticLambda11
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i28 = 2 % 2;
                        int i29 = onWarmupCompleted + 23;
                        onNavigationEvent = i29 % 128;
                        int i30 = i29 % 2;
                        Unit unitOnNavigationEvent = LogFlushScheduler.onNavigationEvent(deserializedecimalcollection);
                        int i31 = onNavigationEvent + 69;
                        onWarmupCompleted = i31 % 128;
                        if (i31 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }, 1, null));
                int i28 = ICustomTabsCallback + 25;
                IAuthTabCallbackStubProxy = i28 % 128;
                int i29 = i28 % 2;
                return null;
            case 8:
                getPackageType getpackagetype = (getPackageType) objArr[0];
                int i30 = 2 % 2;
                int i31 = IAuthTabCallbackStubProxy + 45;
                ICustomTabsCallback = i31 % 128;
                int i32 = i31 % 2;
                onWarmupCompleted(getpackagetype);
                int i33 = ICustomTabsCallback + 59;
                IAuthTabCallbackStubProxy = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asInterface(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ serializeRaw onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawOnNavigationEvent = onNavigationEvent(th);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = ICustomTabsCallback + 25;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return serializerawOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LogFlushScheduler logFlushScheduler, Long l) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(logFlushScheduler, l);
        int i4 = ICustomTabsCallback + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LogFlushScheduler logFlushScheduler, String str, JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(logFlushScheduler, str, jsonReaderEmptyEOFException);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ComputeLandmarkConfidence computeLandmarkConfidence, LogFlushScheduler logFlushScheduler) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(computeLandmarkConfidence, logFlushScheduler);
        int i4 = IAuthTabCallbackStubProxy + 23;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallbackDefault(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 115;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(deserializeDecimalCollection deserializedecimalcollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(deserializedecimalcollection);
        int i4 = IAuthTabCallbackStubProxy + 41;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = ICustomTabsCallback + 97;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(th);
        int i4 = ICustomTabsCallback + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(deserializeDecimalCollection deserializedecimalcollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(deserializedecimalcollection);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(deserializedecimalcollection);
        int i3 = ICustomTabsCallback + 19;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ serializeRaw onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawOnExtraCallback = onExtraCallback(function1, obj);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 117;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return serializerawOnExtraCallback;
    }

    public static final class asInterface extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public asInterface(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                LogFlushScheduler.IAuthTabCallback();
                auth.onExtraCallback(auth.onNavigationEvent, "TossTracker-Flush-Uncaught", th.toString(), null, 2, null);
            } else {
                LogFlushScheduler.IAuthTabCallback();
                auth.onExtraCallback(auth.onNavigationEvent, "TossTracker-Flush-Uncaught", th.toString(), null, 4, null);
            }
            int i3 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 72 / 0;
            }
        }
    }

    public LogFlushScheduler() {
        getTimestampBytes<DetectFaceInContinuousImage> gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        this.getInterfaceDescriptor = gettimestampbytesIAuthTabCallback;
        this.asInterface = FeatureExtension.Companion.onExtraCallback();
        this.IAuthTabCallbackStub = new Initialize<>(null, 1, null);
        getTimestampBytes<DetectFaceInContinuousImage> gettimestampbytesIAuthTabCallback2 = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback2, "");
        this.IAuthTabCallbackDefault = gettimestampbytesIAuthTabCallback2;
        this.onWarmupCompleted = new onExtraCallback(null);
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tracker.LogFlushScheduler$$ExternalSyntheticLambda9
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                MapConverter.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = LogFlushScheduler.onExtraCallbackWithResult();
                int i4 = onExtraCallback + 9;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return onnavigationeventOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        this.IAuthTabCallback = new ConcurrentHashMap<>();
        this.onNavigationEvent = new ResetTrackState(0L, 0L, null, 7, null);
    }

    public static final /* synthetic */ AppSetIdAndScope1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ FeatureExtension IAuthTabCallback(LogFlushScheduler logFlushScheduler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 35;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        FeatureExtension featureExtension = logFlushScheduler.asInterface;
        int i5 = i2 + 61;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return featureExtension;
    }

    public static final /* synthetic */ getTimestampBytes asBinder(LogFlushScheduler logFlushScheduler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getTimestampBytes<DetectFaceInContinuousImage> gettimestampbytes = logFlushScheduler.getInterfaceDescriptor;
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return gettimestampbytes;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        LogFlushScheduler logFlushScheduler = (LogFlushScheduler) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        GetDetectingInterval getDetectingInterval = logFlushScheduler.access100;
        int i5 = i3 + 25;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return getDetectingInterval;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LogFlushScheduler logFlushScheduler = (LogFlushScheduler) objArr[0];
        String str = (String) objArr[1];
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            logFlushScheduler.onExtraCallback(str, access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = logFlushScheduler.onExtraCallback(str, access13800Var);
        int i3 = ICustomTabsCallback + 71;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LogFlushScheduler logFlushScheduler = (LogFlushScheduler) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        GetInputImageFromPathAsUnchanged getInputImageFromPathAsUnchanged = logFlushScheduler.onTransact;
        if (i3 == 0) {
            return getInputImageFromPathAsUnchanged;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getTimestampBytes onExtraCallbackWithResult(LogFlushScheduler logFlushScheduler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 95;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        getTimestampBytes<DetectFaceInContinuousImage> gettimestampbytes = logFlushScheduler.IAuthTabCallbackDefault;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 47;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return gettimestampbytes;
    }

    public static final /* synthetic */ Object onNavigationEvent(LogFlushScheduler logFlushScheduler, String str, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            logFlushScheduler.IAuthTabCallback(str, (access13800<? super Integer>) access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = logFlushScheduler.IAuthTabCallback(str, (access13800<? super Integer>) access13800Var);
        int i3 = ICustomTabsCallback + 19;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Function1 onNavigationEvent(LogFlushScheduler logFlushScheduler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Function1<? super access13800<? super Unit>, ? extends Object> function1 = logFlushScheduler.onWarmupCompleted;
        int i5 = i3 + 15;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public static final /* synthetic */ ConcurrentHashMap onWarmupCompleted(LogFlushScheduler logFlushScheduler) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        ConcurrentHashMap<String, Integer> concurrentHashMap = logFlushScheduler.IAuthTabCallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 93;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        onNavigationEvent();
        Companion = new onExtraCallbackWithResult(null);
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("LogFlushScheduler");
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        onExtraCallback = appSetIdAndScope1OnExtraCallbackWithResult;
        int i = extraCallback + 11;
        extraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var);
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            if (i6 != 0) {
                int i7 = 88 / 0;
            }
            return unit;
        }
    }

    private static final MapConverter.onNavigationEvent onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        if (i3 == 0) {
            return mapConverterOnExtraCallback.onExtraCallbackWithResult();
        }
        mapConverterOnExtraCallback.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final class LogLifecycleObserver implements DefaultLifecycleObserver {
        private static int onExtraCallback = 0;
        private static int onTransact = 1;
        private final Context IAuthTabCallback;
        private deserializeUriNullableCollection onExtraCallbackWithResult;
        private long onNavigationEvent;
        final /* synthetic */ LogFlushScheduler onWarmupCompleted;

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = onTransact + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(function1, obj);
            int i4 = onTransact + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public static /* synthetic */ Unit onNavigationEvent(LogFlushScheduler logFlushScheduler) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback(logFlushScheduler);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnExtraCallback = onExtraCallback(logFlushScheduler);
            int i3 = onExtraCallback + 87;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(function1, obj);
            int i4 = onExtraCallback + 21;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = ~i3;
            int i9 = ~(i7 | i8 | i5);
            int i10 = ~((~i5) | i8 | i2);
            int i11 = i9 | i10;
            int i12 = ~(i8 | i2);
            int i13 = (~(i5 | i7)) | (~(i7 | i3)) | i10;
            int i14 = i2 + i3 + i + (1787548100 * i4) + (1101416392 * i6);
            int i15 = i14 * i14;
            int i16 = (((-61410478) * i2) - 623378432) + (561581232 * i3) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i) + ((-778043392) * i4) + ((-46137344) * i6) + (324403200 * i15);
            int i17 = (i2 * (-930662234)) + 656878810 + (i3 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i * (-930661477)) + (i4 * 2052861356) + (i6 * 749768216) + (i15 * (-2028863488));
            if (i16 + (i17 * i17 * (-1850081280)) == 1) {
                return onNavigationEvent(objArr);
            }
            LogFlushScheduler logFlushScheduler = (LogFlushScheduler) objArr[0];
            int i18 = 2 % 2;
            LogFlushScheduler.asBinder(logFlushScheduler).onExtraCallback(new DetectFaceInContinuousImage(null, null, 3, null));
            Unit unit = Unit.INSTANCE;
            int i19 = onTransact + 119;
            onExtraCallback = i19 % 128;
            int i20 = i19 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onWarmupCompleted(LogFlushScheduler logFlushScheduler, Long l) {
            int i = 2 % 2;
            int i2 = onTransact + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                throw null;
            }
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{logFlushScheduler, l}, -1004167736, 1004167736, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
            int i3 = onExtraCallback + 21;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
            int i = 2 % 2;
            int i2 = onTransact + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(th);
            int i4 = onTransact + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public LogLifecycleObserver(@NotNull LogFlushScheduler logFlushScheduler, Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.onWarmupCompleted = logFlushScheduler;
            this.IAuthTabCallback = context;
        }

        public /* bridge */ void onCreate(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onTransact + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
            int i4 = onExtraCallback + 109;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onDestroy(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void IAuthTabCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            if (i3 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 35;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        private static final Unit onExtraCallbackWithResult(Throwable th) {
            int i = 2 % 2;
            int i2 = onTransact + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LogFlushScheduler.IAuthTabCallback();
            if (i3 != 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onExtraCallback + 95;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }

        private static final void onWarmupCompleted(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public void onStart(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            LogFlushScheduler.IAuthTabCallback();
            deserializeUriNullableCollection deserializeurinullablecollection = this.onExtraCallbackWithResult;
            if (deserializeurinullablecollection != null) {
                int i2 = onTransact + 13;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    deserializeurinullablecollection.dispose();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                deserializeurinullablecollection.dispose();
                int i3 = onTransact + 41;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onWarmupCompleted(0L, RangesKt.coerceAtLeast(LogFlushScheduler.IAuthTabCallback(this.onWarmupCompleted).onNavigationEvent(), 1000L), TimeUnit.MILLISECONDS);
            final LogFlushScheduler logFlushScheduler = this.onWarmupCompleted;
            final Function1 function1 = new Function1() { // from class: im.toss.core.tracker.LogFlushScheduler$LogLifecycleObserver$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnWarmupCompleted = LogFlushScheduler.LogLifecycleObserver.onWarmupCompleted(logFlushScheduler, (Long) obj2);
                    int i8 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.core.tracker.LogFlushScheduler$LogLifecycleObserver$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final void accept(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 19;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        LogFlushScheduler.LogLifecycleObserver.onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj2}, 535206935, -535206934, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    LogFlushScheduler.LogLifecycleObserver.onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj2}, 535206935, -535206934, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
                    int i7 = onNavigationEvent + 117;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                }
            };
            final Function1 function12 = new Function1() { // from class: im.toss.core.tracker.LogFlushScheduler$LogLifecycleObserver$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 93;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnWarmupCompleted = LogFlushScheduler.LogLifecycleObserver.onWarmupCompleted((Throwable) obj2);
                    int i8 = onExtraCallbackWithResult + 97;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            };
            this.onExtraCallbackWithResult = jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: im.toss.core.tracker.LogFlushScheduler$LogLifecycleObserver$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final void accept(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 37;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    LogFlushScheduler.LogLifecycleObserver.onNavigationEvent(function12, obj2);
                    int i8 = onExtraCallback + 75;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            });
            this.onNavigationEvent = System.currentTimeMillis();
            LogFlushWorker.Companion.IAuthTabCallback(this.IAuthTabCallback);
        }

        public void onResume(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            LogFlushScheduler.IAuthTabCallback();
            int i4 = onExtraCallback + 83;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
        }

        public void onPause(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            LogFlushScheduler.IAuthTabCallback();
            LogFlushScheduler.onExtraCallbackWithResult(this.onWarmupCompleted).onExtraCallback(new DetectFaceInContinuousImage(null, null, 3, null));
            int i2 = onExtraCallback + 11;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }

        public void onStop(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            LogFlushScheduler.IAuthTabCallback();
            deserializeUriNullableCollection deserializeurinullablecollection = this.onExtraCallbackWithResult;
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
                int i4 = onExtraCallback + 93;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            getTimestampBytes gettimestampbytesOnExtraCallbackWithResult = LogFlushScheduler.onExtraCallbackWithResult(this.onWarmupCompleted);
            final LogFlushScheduler logFlushScheduler = this.onWarmupCompleted;
            gettimestampbytesOnExtraCallbackWithResult.onExtraCallback(new DetectFaceInContinuousImage(null, new Function0() { // from class: im.toss.core.tracker.LogFlushScheduler$LogLifecycleObserver$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 109;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    LogFlushScheduler logFlushScheduler2 = logFlushScheduler;
                    if (i8 != 0) {
                        return LogFlushScheduler.LogLifecycleObserver.onNavigationEvent(logFlushScheduler2);
                    }
                    LogFlushScheduler.LogLifecycleObserver.onNavigationEvent(logFlushScheduler2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 1, null));
        }

        private static final Unit onExtraCallback(LogFlushScheduler logFlushScheduler) {
            int i = 2 % 2;
            int i2 = onTransact + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{function1, obj}, 535206935, -535206934, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        }

        private static final Unit onExtraCallback(LogFlushScheduler logFlushScheduler, Long l) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (Unit) onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{logFlushScheduler, l}, -1004167736, 1004167736, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        }
    }

    public final void onExtraCallbackWithResult(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 33;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            if (i <= 13203) {
                return;
            }
        } else if (i <= 5000) {
            return;
        }
        Map mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("count", Integer.valueOf(i)));
        Object[] objArr = new Object[1];
        a(new char[]{5, '\f', 13807, 13807, '\b', '\f', '\n', 1, 6, 4, 13806}, (byte) (5 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0', 0) + 12, objArr);
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, ((String) objArr[0]).intern(), "TossTracker-Store-Count-Warning: " + i, mapOnNavigationEvent, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackStubProxy + 19;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback(ComputeLandmarkConfidence computeLandmarkConfidence, LogFlushScheduler logFlushScheduler) throws Throwable {
        int i = 2 % 2;
        int iOnExtraCallback = computeLandmarkConfidence.onExtraCallback();
        if (iOnExtraCallback >= 500) {
            int i2 = ICustomTabsCallback + 11;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(logFlushScheduler, "logitems", null, 5, null);
            } else {
                onExtraCallbackWithResult(logFlushScheduler, "logitems", null, 2, null);
            }
        }
        logFlushScheduler.onExtraCallbackWithResult(iOnExtraCallback);
        int i3 = IAuthTabCallbackStubProxy + 25;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
    }

    private static final serializeRaw onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (serializeRaw) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static final serializeRaw onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Objects.toString(th);
        Object obj = null;
        getByteBuffer getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(new DetectFaceInContinuousImage(null, null, 3, null));
        int i2 = IAuthTabCallbackStubProxy + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return getbytebufferOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 59;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ DetectFaceInContinuousImage $flushRequest;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(DetectFaceInContinuousImage detectFaceInContinuousImage, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$flushRequest = detectFaceInContinuousImage;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = LogFlushScheduler.this.new IAuthTabCallbackStub(this.$flushRequest, access13800Var);
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        
            if (r7 == r1) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    LogFlushScheduler logFlushScheduler = LogFlushScheduler.this;
                    DetectFaceInContinuousImage detectFaceInContinuousImage = this.$flushRequest;
                    Result.Companion companion = Result.Companion;
                    if (detectFaceInContinuousImage.onExtraCallbackWithResult() == null) {
                        int i3 = onNavigationEvent + 57;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        this.L$0 = access15400.onNavigationEvent(logFlushScheduler);
                        this.L$1 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        if (logFlushScheduler.onWarmupCompleted((access13800<? super Unit>) this) == objOnWarmupCompleted) {
                        }
                        obj = Unit.INSTANCE;
                        obj2 = Result.constructor-impl(obj);
                    } else {
                        String strOnExtraCallbackWithResult = detectFaceInContinuousImage.onExtraCallbackWithResult();
                        this.L$0 = access15400.onNavigationEvent(logFlushScheduler);
                        this.L$1 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 2;
                        obj = logFlushScheduler.onExtraCallbackWithResult(strOnExtraCallbackWithResult, (access13800<? super Integer>) this);
                    }
                    return objOnWarmupCompleted;
                }
                if (i2 == 1) {
                    ResultKt.onNavigationEvent(obj);
                    obj = Unit.INSTANCE;
                    obj2 = Result.constructor-impl(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onNavigationEvent + 59;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    obj2 = Result.constructor-impl(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            Unit unit = null;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                int i7 = onExtraCallback + 73;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    LogFlushScheduler.IAuthTabCallback();
                    throw null;
                }
                LogFlushScheduler.IAuthTabCallback();
            }
            DetectFaceInContinuousImage detectFaceInContinuousImage2 = this.$flushRequest;
            if (Result.onNavigationEvent(obj2)) {
                try {
                    Result.Companion companion4 = Result.Companion;
                    Function0<Unit> function0OnWarmupCompleted = detectFaceInContinuousImage2.onWarmupCompleted();
                    if (function0OnWarmupCompleted != null) {
                        function0OnWarmupCompleted.invoke();
                        unit = Unit.INSTANCE;
                    }
                    Result.constructor-impl(unit);
                } catch (Throwable th) {
                    Result.Companion companion5 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(CoroutineExceptionHandler coroutineExceptionHandler, LogFlushScheduler logFlushScheduler, DetectFaceInContinuousImage detectFaceInContinuousImage) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(coroutineExceptionHandler)), (CoroutineContext) null, (setRandomHost) null, logFlushScheduler.new IAuthTabCallbackStub(detectFaceInContinuousImage, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 89;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return unit;
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull RetrofitService retrofitService, @NotNull GetDetectingInterval getDetectingInterval, @Nullable GetInputImageFromPathAsUnchanged getInputImageFromPathAsUnchanged, @NotNull Function1<? super access13800<? super Unit>, ? extends Object> function1, @NotNull FeatureExtension featureExtension) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(retrofitService, "");
        Intrinsics.checkNotNullParameter(getDetectingInterval, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(featureExtension, "");
        this.access100 = getDetectingInterval;
        this.onTransact = getInputImageFromPathAsUnchanged;
        this.asBinder = retrofitService;
        this.asInterface = featureExtension;
        this.onWarmupCompleted = function1;
        HandlerThread handlerThread = new HandlerThread("Scheduler-TossTracker-BackgroundThread", 10);
        handlerThread.start();
        MapConverter mapConverterIAuthTabCallback = NetConverter3.IAuthTabCallback(handlerThread.getLooper());
        mapConverterIAuthTabCallback.onExtraCallback(new LogFlushScheduler$.ExternalSyntheticLambda0(getDetectingInterval.onExtraCallbackWithResult(context, "logitems"), this));
        this.getInterfaceDescriptor.asBinder(this.IAuthTabCallbackDefault).onExtraCallbackWithResult(mapConverterIAuthTabCallback).onTransact(new LogFlushScheduler$.ExternalSyntheticLambda2(new LogFlushScheduler$.ExternalSyntheticLambda1())).onExtraCallbackWithResult(new LogFlushScheduler$.ExternalSyntheticLambda4(new LogFlushScheduler$.ExternalSyntheticLambda3(new asInterface(CoroutineExceptionHandler.extraCallbackWithResult), this)), new LogFlushScheduler$.ExternalSyntheticLambda6(new LogFlushScheduler$.ExternalSyntheticLambda5()));
        if (retrofitService.extraCallbackWithResult()) {
            int i2 = IAuthTabCallbackStubProxy + 3;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                downloadZip.Companion.onExtraCallbackWithResult();
                int i3 = 9 / 0;
            } else {
                downloadZip.Companion.onExtraCallbackWithResult();
            }
        }
        int i4 = IAuthTabCallbackStubProxy + 23;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 105;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted(@NotNull Context context, @Nullable TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (textFieldScrollKtExternalSyntheticLambda0 != null) {
            textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(new LogLifecycleObserver(this, context));
            return;
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onWarmupCompleted(0L, RangesKt.coerceAtLeast(this.asInterface.onNavigationEvent(), 1000L), TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: im.toss.core.tracker.LogFlushScheduler$$ExternalSyntheticLambda12
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 51;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                LogFlushScheduler logFlushScheduler = this.f$0;
                Long l = (Long) obj;
                if (i5 == 0) {
                    return LogFlushScheduler.onExtraCallbackWithResult(logFlushScheduler, l);
                }
                LogFlushScheduler.onExtraCallbackWithResult(logFlushScheduler, l);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.core.tracker.LogFlushScheduler$$ExternalSyntheticLambda13
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final void accept(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 73;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                LogFlushScheduler.onNavigationEvent(function1, obj);
                int i6 = onNavigationEvent + 125;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i3 = ICustomTabsCallback + 37;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(LogFlushScheduler logFlushScheduler, Long l) {
        int i = 2 % 2;
        logFlushScheduler.getInterfaceDescriptor.onExtraCallback(new DetectFaceInContinuousImage(null, null, 3, null));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(deserializeDecimalCollection deserializedecimalcollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (deserializedecimalcollection != null) {
            deserializedecimalcollection.run();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 39;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(LogFlushScheduler logFlushScheduler, String str, deserializeDecimalCollection deserializedecimalcollection, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 117;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i4 + 21;
            int i6 = i5 % 128;
            ICustomTabsCallback = i6;
            if (i5 % 2 == 0) {
                int i7 = 34 / 0;
            }
            int i8 = i6 + 9;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            deserializedecimalcollection = null;
        }
        logFlushScheduler.onNavigationEvent(str, deserializedecimalcollection);
        int i10 = IAuthTabCallbackStubProxy + 125;
        ICustomTabsCallback = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable deserializeDecimalCollection deserializedecimalcollection) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallbackDefault.onExtraCallback(new DetectFaceInContinuousImage(str, new LogFlushScheduler$.ExternalSyntheticLambda10(deserializedecimalcollection)));
        int i2 = ICustomTabsCallback + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(deserializeDecimalCollection deserializedecimalcollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (deserializedecimalcollection != null) {
            deserializedecimalcollection.run();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 79;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final Object onWarmupCompleted(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new IAuthTabCallbackDefault(null), access13800Var);
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 105;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = LogFlushScheduler.this.new IAuthTabCallbackDefault(access13800Var);
            iAuthTabCallbackDefault.L$0 = obj;
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 55 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        
            if (r4.invoke(r24) == r10) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01fa, code lost:
        
            if (o.ResourceCallback.onExtraCallbackWithResult(r6, r24) == r10) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator<ComputeLandmarkConfidence<? extends Deinitialize>> it;
            long j;
            Collection<ComputeLandmarkConfidence<? extends Deinitialize>> collection;
            Runtime runtime;
            long j2;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            access13800 access13800Var = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                LogFlushScheduler.IAuthTabCallback();
                int i4 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Function1 function1OnNavigationEvent = LogFlushScheduler.onNavigationEvent(LogFlushScheduler.this);
                this.L$0 = findresandmsg;
                this.label = 1;
            } else {
                if (i3 != 1) {
                    int i6 = onExtraCallbackWithResult + 27;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    if (i6 % 2 != 0 ? i3 != 2 : i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i8 = i7 + 17;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        ResultKt.onNavigationEvent(obj);
                        if (i9 != 0) {
                            throw null;
                        }
                        return Unit.INSTANCE;
                    }
                    j = this.J$1;
                    j2 = this.J$0;
                    it = (Iterator) this.L$3;
                    runtime = (Runtime) this.L$2;
                    collection = (Collection) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    while (it.hasNext()) {
                        int i10 = onExtraCallbackWithResult + 31;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        ComputeLandmarkConfidence<? extends Deinitialize> next = it.next();
                        LogFlushScheduler logFlushScheduler = LogFlushScheduler.this;
                        String strOnWarmupCompleted = next.onWarmupCompleted();
                        this.L$0 = access15400.onNavigationEvent(findresandmsg);
                        this.L$1 = access15400.onNavigationEvent(collection);
                        this.L$2 = access15400.onNavigationEvent(runtime);
                        this.L$3 = it;
                        this.L$4 = access15400.onNavigationEvent(next);
                        this.J$0 = j2;
                        this.J$1 = j;
                        this.label = 2;
                        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                        if (LogFlushScheduler.onExtraCallback(-1013777256, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler, strOnWarmupCompleted, this}, 1013777256, iOnNavigationEvent) == objOnWarmupCompleted) {
                            int i12 = onNavigationEvent + 3;
                            onExtraCallbackWithResult = i12 % 128;
                            if (i12 % 2 != 0) {
                                int i13 = 4 / 3;
                            }
                            return objOnWarmupCompleted;
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
            }
            GetInputImageFromPathAsUnchanged getInputImageFromPathAsUnchanged = (GetInputImageFromPathAsUnchanged) LogFlushScheduler.onExtraCallback(897085550, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{LogFlushScheduler.this}, -897085548, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            if (getInputImageFromPathAsUnchanged != null) {
                GetInputImageFromPathAsUnchanged.IAuthTabCallback(getInputImageFromPathAsUnchanged, 0L, 1, null);
            }
            GetDetectingInterval getDetectingInterval = (GetDetectingInterval) LogFlushScheduler.onExtraCallback(2078025729, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{LogFlushScheduler.this}, -2078025719, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            if (getDetectingInterval == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                getDetectingInterval = null;
            }
            Collection<ComputeLandmarkConfidence<? extends Deinitialize>> collectionOnWarmupCompleted = getDetectingInterval.onWarmupCompleted();
            Runtime runtime2 = Runtime.getRuntime();
            long jFreeMemory = runtime2.freeMemory() + (runtime2.maxMemory() - runtime2.totalMemory());
            long jMax = Math.max((long) (runtime2.maxMemory() * 0.06d), 31457280L);
            if (jFreeMemory < jMax) {
                LogFlushScheduler.IAuthTabCallback();
                long j3 = (jFreeMemory / 1024) / 1024;
                long j4 = (jMax / 1024) / 1024;
                it = collectionOnWarmupCompleted.iterator();
                j = jMax;
                collection = collectionOnWarmupCompleted;
                runtime = runtime2;
                j2 = jFreeMemory;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
            Collection<ComputeLandmarkConfidence<? extends Deinitialize>> collection2 = collectionOnWarmupCompleted;
            LogFlushScheduler logFlushScheduler2 = LogFlushScheduler.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(logFlushScheduler2, (ComputeLandmarkConfidence) it2.next(), access13800Var);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, iAuthTabCallback, 3, (Object) null));
                arrayList = arrayList2;
                logFlushScheduler2 = logFlushScheduler2;
                jMax = jMax;
                access13800Var = null;
            }
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(collectionOnWarmupCompleted);
            this.L$2 = access15400.onNavigationEvent(runtime2);
            this.J$0 = jFreeMemory;
            this.J$1 = jMax;
            this.label = 3;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            final /* synthetic */ ComputeLandmarkConfidence<? extends Deinitialize> $store;
            int label;
            final /* synthetic */ LogFlushScheduler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(LogFlushScheduler logFlushScheduler, ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = logFlushScheduler;
                this.$store = computeLandmarkConfidence;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$store, access13800Var);
                int i2 = IAuthTabCallback + 41;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 9;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                }
                int i4 = 96 / 0;
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 93;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallback + 1;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    LogFlushScheduler logFlushScheduler = this.this$0;
                    String strOnWarmupCompleted = this.$store.onWarmupCompleted();
                    this.label = 1;
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    if (LogFlushScheduler.onExtraCallback(-1013777256, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler, strOnWarmupCompleted, this}, 1013777256, iOnNavigationEvent) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallback_Parcel;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 17;
            int i5 = i4 % 128;
            $10 = i5;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = i5 + 119;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), KeyEvent.keyCodeFromString("") + 26, 23139 - Gravity.getAbsoluteGravity(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(access000)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 25 - Process.getGidForName(""), 23140 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i9 = $11 + 9;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    i2 = i + 11;
                    cArr4[i2] = (char) (cArr[i2] * b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 74, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 30 - ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i11 = $10 + 1;
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                            } else {
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i16];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(String str, access13800<? super Unit> access13800Var) {
        IAuthTabCallback_Parcel iAuthTabCallback_Parcel;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback_Parcel) {
            int i2 = ICustomTabsCallback + 29;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallback_Parcel = (IAuthTabCallback_Parcel) access13800Var;
            int i4 = iAuthTabCallback_Parcel.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IAuthTabCallbackStubProxy + 89;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    iAuthTabCallback_Parcel.label = i4 - 2147483648;
                } else {
                    iAuthTabCallback_Parcel.label = i4 - 2147483648;
                }
            } else {
                iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(access13800Var);
            }
        }
        Object obj = iAuthTabCallback_Parcel.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallback_Parcel.label;
        try {
            if (i6 != 0) {
                int i7 = ICustomTabsCallback + 77;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                iAuthTabCallback_Parcel.L$0 = str;
                iAuthTabCallback_Parcel.label = 1;
                if (onExtraCallbackWithResult(str, (access13800<? super Integer>) iAuthTabCallback_Parcel) == objOnWarmupCompleted) {
                    int i9 = ICustomTabsCallback + 115;
                    IAuthTabCallbackStubProxy = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 20 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final String IAuthTabCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                int i3 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                return true;
            }
            int i5 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode();
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NonRetryableFailure(errorType=" + this.onWarmupCompleted + ", errorMessage=" + this.IAuthTabCallback + ")";
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = str;
            this.IAuthTabCallback = str2;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 99;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 94 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 119;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    private final boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return zOnWarmupCompleted;
    }

    private final void onExtraCallbackWithResult(String str, int i, String str2, String str3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 105;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        ResetTrackState.IAuthTabCallback IAuthTabCallback2 = this.onNavigationEvent.IAuthTabCallback(str);
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "tracker_flush_cooldown", "flush cooldown entered", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("storeName", str), getWrite.IAuthTabCallback("errorType", str2), getWrite.IAuthTabCallback("errorMessage", str3), getWrite.IAuthTabCallback("pendingFileCount", Integer.valueOf(i)), getWrite.IAuthTabCallback("cooldownMs", Long.valueOf(IAuthTabCallback2.onNavigationEvent())), getWrite.IAuthTabCallback("consecutiveFailures", Integer.valueOf(IAuthTabCallback2.onExtraCallback()))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i5 = IAuthTabCallbackStubProxy + 15;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        Integer numOnExtraCallbackWithResult;
        LogFlushScheduler logFlushScheduler = (LogFlushScheduler) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            numOnExtraCallbackWithResult = logFlushScheduler.onNavigationEvent.onExtraCallbackWithResult(str);
            int i3 = 25 / 0;
            if (numOnExtraCallbackWithResult == null) {
                return null;
            }
        } else {
            numOnExtraCallbackWithResult = logFlushScheduler.onNavigationEvent.onExtraCallbackWithResult(str);
            if (numOnExtraCallbackWithResult == null) {
                return null;
            }
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "tracker_flush_cooldown", "flush cooldown cleared", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("storeName", str), getWrite.IAuthTabCallback("consecutiveFailures", numOnExtraCallbackWithResult)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i4 = ICustomTabsCallback + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static final class onTransact extends SuspendLambda implements Function1<access13800<? super Integer>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String $storeName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(String str, access13800<? super onTransact> access13800Var) {
            super(1, access13800Var);
            this.$storeName = str;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = LogFlushScheduler.this.new onTransact(this.$storeName, access13800Var);
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            if (i3 == 0) {
                int i4 = 12 / 0;
            }
            int i5 = onNavigationEvent + 123;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Integer> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 3;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            LogFlushScheduler logFlushScheduler = LogFlushScheduler.this;
            String str = this.$storeName;
            this.label = 1;
            Object objOnNavigationEvent = LogFlushScheduler.onNavigationEvent(logFlushScheduler, str, (access13800) this);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
                return objOnNavigationEvent;
            }
            int i7 = onNavigationEvent + 21;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return objOnWarmupCompleted;
        }
    }

    public final Object onExtraCallbackWithResult(@NotNull String str, @NotNull access13800<? super Integer> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult(str, new onTransact(str, null), access13800Var);
        int i2 = ICustomTabsCallback + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallbackWithResult;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Ref.IntRef $apiCount;
        final /* synthetic */ RetrofitInstance $logApi;
        final /* synthetic */ ComputeLandmarkConfidence<? extends Deinitialize> $logItemStore;
        final /* synthetic */ Ref.ObjectRef<onWarmupCompleted> $nonRetryableFailure;
        final /* synthetic */ Ref.IntRef $pendingFileCount;
        final /* synthetic */ Ref.IntRef $sentLogs;
        final /* synthetic */ String $storeName;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        long J$0;
        long J$1;
        long J$2;
        long J$3;
        long J$4;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ LogFlushScheduler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(RetrofitInstance retrofitInstance, String str, LogFlushScheduler logFlushScheduler, ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence, Ref.ObjectRef<onWarmupCompleted> objectRef, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$logApi = retrofitInstance;
            this.$storeName = str;
            this.this$0 = logFlushScheduler;
            this.$logItemStore = computeLandmarkConfidence;
            this.$nonRetryableFailure = objectRef;
            this.$pendingFileCount = intRef;
            this.$sentLogs = intRef2;
            this.$apiCount = intRef3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$logApi, this.$storeName, this.this$0, this.$logItemStore, this.$nonRetryableFailure, this.$pendingFileCount, this.$sentLogs, this.$apiCount, access13800Var);
            int i2 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:120|121|219|122) */
        /* JADX WARN: Can't wrap try/catch for region: R(52:13|23|186|24|25|78|(1:223)|83|84|211|85|86|225|87|88|204|89|90|190|91|92|196|93|94|217|95|96|194|97|98|213|99|100|207|101|102|188|103|104|192|105|106|221|107|108|227|109|110|215|111|112|(2:114|115)(11:116|200|117|(1:119)(4:120|121|219|122)|123|169|234|(6:54|55|(2:57|232)(6:58|(5:61|62|(3:64|65|236)(1:237)|66|59)|235|67|68|(49:230|(2:72|(3:74|75|(48:77|78|223|83|84|211|85|86|225|87|88|204|89|90|190|91|92|196|93|94|217|95|96|194|97|98|213|99|100|207|101|102|188|103|104|192|105|106|221|107|108|227|109|110|215|111|112|(0)(0))(2:79|239))(1:80))(1:81)|82|223|83|84|211|85|86|225|87|88|204|89|90|190|91|92|196|93|94|217|95|96|194|97|98|213|99|100|207|101|102|188|103|104|192|105|106|221|107|108|227|109|110|215|111|112|(0)(0))(1:233))|70|209|52)|231|173|174)) */
        /* JADX WARN: Can't wrap try/catch for region: R(52:13|23|186|24|25|78|223|83|84|211|85|86|225|87|88|204|89|90|190|91|92|196|93|94|217|95|96|194|97|98|213|99|100|207|101|102|188|103|104|192|105|106|221|107|108|227|109|110|215|111|112|(2:114|115)(11:116|200|117|(1:119)(4:120|121|219|122)|123|169|234|(6:54|55|(2:57|232)(6:58|(5:61|62|(3:64|65|236)(1:237)|66|59)|235|67|68|(49:230|(2:72|(3:74|75|(48:77|78|223|83|84|211|85|86|225|87|88|204|89|90|190|91|92|196|93|94|217|95|96|194|97|98|213|99|100|207|101|102|188|103|104|192|105|106|221|107|108|227|109|110|215|111|112|(0)(0))(2:79|239))(1:80))(1:81)|82|223|83|84|211|85|86|225|87|88|204|89|90|190|91|92|196|93|94|217|95|96|194|97|98|213|99|100|207|101|102|188|103|104|192|105|106|221|107|108|227|109|110|215|111|112|(0)(0))(1:233))|70|209|52)|231|173|174)) */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x0568, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x056d, code lost:
        
            r29 = r15;
            r24 = r31;
            r20 = r32;
            r32 = r35;
            r15 = r39;
            r30 = r41;
            r31 = r42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x057d, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x057e, code lost:
        
            r2 = r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x0582, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x0583, code lost:
        
            r17 = r3;
            r52 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x0588, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x0589, code lost:
        
            r27 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x058c, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x058d, code lost:
        
            r29 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x0590, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x0591, code lost:
        
            r33 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x0594, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x0595, code lost:
        
            r33 = r2;
            r52 = r15;
            r2 = r26;
            r17 = r34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x059f, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x05a0, code lost:
        
            r30 = r2;
            r52 = r15;
            r2 = r26;
            r17 = r34;
            r33 = r35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x05ac, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x05ad, code lost:
        
            r24 = r2;
            r52 = r15;
            r2 = r26;
            r17 = r34;
            r33 = r35;
            r30 = r36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:145:0x05bb, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x05bc, code lost:
        
            r22 = r2;
            r52 = r15;
            r2 = r26;
            r17 = r34;
            r33 = r35;
            r30 = r36;
            r24 = r39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x05cc, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x05cd, code lost:
        
            r8 = r52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x05d0, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x05d1, code lost:
        
            r22 = r2;
            r21 = r8;
            r2 = r26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x05d8, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x05d9, code lost:
        
            r22 = r2;
            r21 = r8;
            r20 = r9;
            r2 = r26;
            r9 = r30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x05e4, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x05e5, code lost:
        
            r22 = r2;
            r21 = r8;
            r19 = r9;
            r2 = r26;
            r9 = r30;
            r20 = r31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x05f2, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x05f3, code lost:
        
            r22 = r2;
            r21 = r8;
            r18 = r9;
            r2 = r26;
            r9 = r30;
            r20 = r31;
            r19 = r33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x0601, code lost:
        
            r17 = r34;
            r33 = r35;
            r30 = r36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:160:0x061f, code lost:
        
            r24 = r39;
            r8 = r52;
            r52 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x0625, code lost:
        
            r3 = im.toss.core.tracker.LogFlushScheduler.onNavigationEvent.onExtraCallbackWithResult + 69;
            im.toss.core.tracker.LogFlushScheduler.onNavigationEvent.IAuthTabCallback = r3 % 128;
            r3 = r3 % 2;
            r37 = r9;
            r44 = r13;
            r43 = r14;
            r9 = r17;
            r40 = r18;
            r15 = r19;
            r38 = r20;
            r36 = r21;
            r13 = r24;
            r34 = r28;
            r18 = 1;
            r17 = r52;
            r20 = r4;
            r24 = r8;
            r8 = r29;
            r4 = r2;
            r29 = r10;
            r2 = r22;
            r10 = r33;
            r33 = r7;
            r7 = r27;
            r45 = r30;
            r30 = r11;
            r31 = r12;
            r11 = r45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:164:0x0664, code lost:
        
            r1 = r0.getClass().getSimpleName();
            r41 = r2;
            r2 = r16;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2);
            r3 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:165:0x0677, code lost:
        
            if (r3 == null) goto L166;
         */
        /* JADX WARN: Code restructure failed: missing block: B:166:0x0679, code lost:
        
            r27 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:167:0x067c, code lost:
        
            r27 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x067e, code lost:
        
            onExtraCallback(r29, r20, r40, r30, r43, r24, r31, r1, r27, r15.IAuthTabCallback(r0));
            r25 = r8;
            r19 = r9;
            r20 = r10;
            r21 = r11;
            r23 = r13;
            r8 = r15;
            r28 = r17;
            r15 = r18;
            r9 = r31;
            r0 = r33;
            r10 = r34;
            r13 = r36;
            r3 = r40;
            r26 = r41;
            r14 = r43;
            r11 = r44;
            r34 = r4;
            r16 = r5;
            r18 = r7;
            r6 = r29;
            r7 = r32;
            r4 = r37;
            r5 = r38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:170:0x06ca, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:229:0x02b6, code lost:
        
            r1 = r51;
            r16 = r2;
            r2 = r30;
            r29 = r16;
         */
        /* JADX WARN: Path cross not found for [B:4:0x0014, B:7:0x0020], limit reached: 237 */
        /* JADX WARN: Removed duplicated region for block: B:114:0x04d6  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x04d9  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x050e A[Catch: Exception -> 0x056a, TryCatch #7 {Exception -> 0x056a, blocks: (B:117:0x050a, B:119:0x050e, B:120:0x052c), top: B:200:0x050a }] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x052c A[Catch: Exception -> 0x056a, TRY_LEAVE, TryCatch #7 {Exception -> 0x056a, blocks: (B:117:0x050a, B:119:0x050e, B:120:0x052c), top: B:200:0x050a }] */
        /* JADX WARN: Removed duplicated region for block: B:170:0x06ca A[Catch: Exception -> 0x06cb, TRY_LEAVE, TryCatch #6 {Exception -> 0x06cb, blocks: (B:164:0x0664, B:168:0x067e, B:170:0x06ca), top: B:198:0x0664 }] */
        /* JADX WARN: Removed duplicated region for block: B:182:0x06ec A[LOOP:2: B:180:0x06e6->B:182:0x06ec, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:198:0x0664 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0195 A[PHI: r0
          0x0195: PHI (r0v121 java.lang.Object) = (r0v4 java.lang.Object), (r0v138 java.lang.Object) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r0 r6
          0x0028: PHI (r0v5 java.lang.Object) = (r0v4 java.lang.Object), (r0v138 java.lang.Object) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x0028: PHI (r6v1 int) = (r6v0 int), (r6v14 int) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objOnWarmupCompleted;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            long j;
            long j2;
            String str;
            long j3;
            int i6;
            long j4;
            int i7;
            List<List<File>> list;
            ComputeLandmarkConfidence.onNavigationEvent onnavigationevent;
            Ref.IntRef intRef;
            Ref.IntRef intRef2;
            Ref.IntRef intRef3;
            String str2;
            ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence;
            Iterator<List<File>> it;
            ComputeLandmarkConfidence.onNavigationEvent onnavigationevent2;
            Object objOnWarmupCompleted2;
            ComputeLandmarkConfidence.onNavigationEvent onnavigationevent3;
            RetrofitInstance retrofitInstance;
            ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence2;
            Ref.ObjectRef<onWarmupCompleted> objectRef;
            LogFlushScheduler logFlushScheduler;
            List list2;
            List<File> list3;
            ComputeLandmarkConfidence.onNavigationEvent onnavigationevent4;
            ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence3;
            ComputeLandmarkConfidence.onNavigationEvent onnavigationevent5;
            String str3;
            Ref.IntRef intRef4;
            Ref.IntRef intRef5;
            ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence4;
            Iterator<T> it2;
            int i8;
            int i9;
            int i10;
            long j5;
            long j6;
            RetrofitInstance retrofitInstance2;
            int i11;
            int i12;
            LogFlushScheduler logFlushScheduler2;
            Iterator<List<File>> it3;
            List<List<File>> list4;
            Ref.IntRef intRef6;
            long j7;
            Object obj2;
            int i13;
            ComputeLandmarkConfidence.onNavigationEvent onNavigationEvent;
            Ref.ObjectRef<onWarmupCompleted> objectRef2;
            long j8;
            ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence5;
            long j9;
            ComputeLandmarkConfidence.onNavigationEvent onnavigationevent6;
            Ref.IntRef intRef7;
            Ref.IntRef intRef8;
            Ref.IntRef intRef9;
            RetrofitInstance retrofitInstance3;
            int i14;
            int i15;
            long j10;
            String str4;
            Iterator<List<File>> it4;
            Ref.IntRef intRef10;
            onNavigationEvent onnavigationevent7 = this;
            int i16 = 2 % 2;
            int i17 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i17 % 128;
            if (i17 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = onnavigationevent7.label;
                if (i != 0) {
                }
                it2 = onnavigationevent4.onWarmupCompleted().iterator();
                while (it2.hasNext()) {
                }
                throw e;
            }
            objOnWarmupCompleted = access14300.onWarmupCompleted();
            i = onnavigationevent7.label;
            int i18 = 89 / 0;
            if (i != 0) {
                Object obj3 = objOnWarmupCompleted;
                int i19 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i19 % 128;
                if (i19 % 2 == 0 ? i != 1 : i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i20 = onnavigationevent7.I$5;
                    i2 = onnavigationevent7.I$4;
                    i3 = onnavigationevent7.I$3;
                    i4 = onnavigationevent7.I$2;
                    i5 = onnavigationevent7.I$1;
                    j = onnavigationevent7.J$3;
                    j2 = onnavigationevent7.J$2;
                    str = "";
                    j3 = onnavigationevent7.J$1;
                    int i21 = onnavigationevent7.I$0;
                    i6 = i20;
                    j4 = onnavigationevent7.J$0;
                    List list5 = (List) onnavigationevent7.L$14;
                    List<File> list6 = (List) onnavigationevent7.L$13;
                    Iterator<List<File>> it5 = (Iterator) onnavigationevent7.L$12;
                    List<List<File>> list7 = (List) onnavigationevent7.L$11;
                    ComputeLandmarkConfidence.onNavigationEvent onnavigationevent8 = (ComputeLandmarkConfidence.onNavigationEvent) onnavigationevent7.L$10;
                    ComputeLandmarkConfidence.onNavigationEvent onnavigationevent9 = (ComputeLandmarkConfidence.onNavigationEvent) onnavigationevent7.L$9;
                    Ref.IntRef intRef11 = (Ref.IntRef) onnavigationevent7.L$8;
                    Ref.IntRef intRef12 = (Ref.IntRef) onnavigationevent7.L$7;
                    RetrofitInstance retrofitInstance4 = (RetrofitInstance) onnavigationevent7.L$6;
                    Ref.IntRef intRef13 = (Ref.IntRef) onnavigationevent7.L$5;
                    ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence6 = (ComputeLandmarkConfidence) onnavigationevent7.L$4;
                    Ref.ObjectRef<onWarmupCompleted> objectRef3 = (Ref.ObjectRef) onnavigationevent7.L$3;
                    LogFlushScheduler logFlushScheduler3 = (LogFlushScheduler) onnavigationevent7.L$2;
                    String str5 = (String) onnavigationevent7.L$1;
                    ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence7 = (ComputeLandmarkConfidence) onnavigationevent7.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj);
                        objOnWarmupCompleted2 = obj;
                        i7 = i21;
                        list = list7;
                        onnavigationevent3 = onnavigationevent8;
                        onnavigationevent = onnavigationevent9;
                        intRef = intRef11;
                        intRef2 = intRef12;
                        retrofitInstance = retrofitInstance4;
                        intRef3 = intRef13;
                        computeLandmarkConfidence2 = computeLandmarkConfidence6;
                        objectRef = objectRef3;
                        logFlushScheduler = logFlushScheduler3;
                        str2 = str5;
                        computeLandmarkConfidence = computeLandmarkConfidence7;
                        list2 = list5;
                        list3 = list6;
                        it = it5;
                    } catch (Exception e) {
                        e = e;
                        i7 = i21;
                        list = list7;
                        onnavigationevent = onnavigationevent9;
                        intRef = intRef11;
                        intRef2 = intRef12;
                        RetrofitInstance retrofitInstance5 = retrofitInstance4;
                        intRef3 = intRef13;
                        str2 = str5;
                        computeLandmarkConfidence = computeLandmarkConfidence7;
                        List list8 = list5;
                        it = it5;
                        onnavigationevent2 = onnavigationevent8;
                        if (e instanceof CancellationException) {
                        }
                        e = e;
                        onnavigationevent4 = onnavigationevent;
                        computeLandmarkConfidence3 = computeLandmarkConfidence;
                        it2 = onnavigationevent4.onWarmupCompleted().iterator();
                        while (it2.hasNext()) {
                        }
                        throw e;
                    }
                    if (((Boolean) objOnWarmupCompleted2) != null) {
                    }
                    j7 = j3;
                    i8 = i3;
                    i9 = i4;
                    i10 = i5;
                    j5 = j;
                    j6 = j2;
                    String str6 = str;
                    i11 = i7;
                    it3 = it;
                    list4 = list;
                    onnavigationevent5 = onnavigationevent;
                    retrofitInstance2 = retrofitInstance;
                    intRef6 = intRef3;
                    logFlushScheduler2 = logFlushScheduler;
                    str3 = str2;
                    computeLandmarkConfidence3 = computeLandmarkConfidence;
                    obj2 = obj3;
                    long j11 = j4;
                    computeLandmarkConfidence4 = computeLandmarkConfidence5;
                    i12 = i6;
                    intRef5 = intRef;
                    intRef4 = intRef2;
                    i13 = i2;
                    onNavigationEvent = onnavigationevent3;
                    onnavigationevent7 = this;
                    str = str6;
                    objectRef2 = objectRef;
                    j8 = j11;
                    while (it3.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                str = "";
                int i22 = onnavigationevent7.I$4;
                int i23 = onnavigationevent7.I$3;
                int i24 = onnavigationevent7.I$2;
                int i25 = onnavigationevent7.I$1;
                long j12 = onnavigationevent7.J$3;
                long j13 = onnavigationevent7.J$2;
                long j14 = onnavigationevent7.J$1;
                int i26 = onnavigationevent7.I$0;
                long j15 = onnavigationevent7.J$0;
                List list9 = (List) onnavigationevent7.L$14;
                int i27 = i22;
                List<File> list10 = (List) onnavigationevent7.L$13;
                Iterator<List<File>> it6 = (Iterator) onnavigationevent7.L$12;
                List<List<File>> list11 = (List) onnavigationevent7.L$11;
                ComputeLandmarkConfidence.onNavigationEvent onnavigationevent10 = (ComputeLandmarkConfidence.onNavigationEvent) onnavigationevent7.L$10;
                onnavigationevent4 = (ComputeLandmarkConfidence.onNavigationEvent) onnavigationevent7.L$9;
                Ref.IntRef intRef14 = (Ref.IntRef) onnavigationevent7.L$8;
                Ref.IntRef intRef15 = (Ref.IntRef) onnavigationevent7.L$7;
                RetrofitInstance retrofitInstance6 = (RetrofitInstance) onnavigationevent7.L$6;
                Ref.IntRef intRef16 = (Ref.IntRef) onnavigationevent7.L$5;
                ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence8 = (ComputeLandmarkConfidence) onnavigationevent7.L$4;
                Ref.ObjectRef<onWarmupCompleted> objectRef4 = (Ref.ObjectRef) onnavigationevent7.L$3;
                LogFlushScheduler logFlushScheduler4 = (LogFlushScheduler) onnavigationevent7.L$2;
                String str7 = (String) onnavigationevent7.L$1;
                ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence9 = (ComputeLandmarkConfidence) onnavigationevent7.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    long j16 = j15;
                    Iterator<List<File>> it7 = it6;
                    ComputeLandmarkConfidence.onNavigationEvent onnavigationevent11 = onnavigationevent10;
                    onnavigationevent5 = onnavigationevent4;
                    Ref.IntRef intRef17 = intRef16;
                    str3 = str7;
                    int i28 = i25;
                    intRef4 = intRef15;
                    Object obj4 = obj3;
                    intRef5 = intRef14;
                    long j17 = j13;
                    int i29 = i26;
                    computeLandmarkConfidence4 = computeLandmarkConfidence8;
                    RetrofitInstance retrofitInstance7 = retrofitInstance6;
                    long j18 = j12;
                    long j19 = j14;
                    int i30 = i24;
                    Ref.IntRef intRef18 = intRef4;
                    String str8 = str3;
                    List list12 = list9;
                    List<List<File>> list13 = list11;
                    long j20 = j17;
                    Ref.IntRef intRef19 = intRef17;
                    int i31 = i29;
                    int i32 = i28;
                    Iterator<List<File>> it8 = it7;
                    RetrofitInstance retrofitInstance8 = retrofitInstance7;
                    ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence10 = computeLandmarkConfidence4;
                    j4 = j16;
                    long j21 = j18;
                    Ref.ObjectRef<onWarmupCompleted> objectRef5 = objectRef4;
                    LogFlushScheduler logFlushScheduler5 = logFlushScheduler4;
                    int i33 = i23;
                    Ref.IntRef intRef20 = intRef5;
                    List<File> list14 = list10;
                    long j22 = j19;
                    Object obj5 = obj4;
                    ComputeLandmarkConfidence.onNavigationEvent onnavigationevent12 = onnavigationevent5;
                    int i34 = i27;
                    ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence11 = computeLandmarkConfidence9;
                    onnavigationevent2 = onnavigationevent11;
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        j9 = j22;
                        onnavigationevent6 = onnavigationevent12;
                        intRef7 = intRef19;
                        Object obj6 = obj5;
                        intRef8 = intRef20;
                        intRef9 = intRef18;
                        retrofitInstance3 = retrofitInstance8;
                        i14 = i30;
                        i15 = i32;
                        j10 = j21;
                        str4 = str8;
                    }
                    onExtraCallback onextracallback = new onExtraCallback(str8, list12, logFlushScheduler5, retrofitInstance8, intRef18, intRef20, null);
                    onnavigationevent7.L$0 = computeLandmarkConfidence11;
                    str4 = str8;
                    onnavigationevent7.L$1 = str4;
                    onnavigationevent7.L$2 = logFlushScheduler5;
                    onnavigationevent7.L$3 = objectRef5;
                    onnavigationevent7.L$4 = computeLandmarkConfidence10;
                    onnavigationevent7.L$5 = intRef19;
                    intRef7 = intRef19;
                    RetrofitInstance retrofitInstance9 = retrofitInstance8;
                    onnavigationevent7.L$6 = retrofitInstance9;
                    retrofitInstance3 = retrofitInstance9;
                    Ref.IntRef intRef21 = intRef18;
                    onnavigationevent7.L$7 = intRef21;
                    intRef9 = intRef21;
                    intRef8 = intRef20;
                    onnavigationevent7.L$8 = intRef8;
                    onnavigationevent7.L$9 = onnavigationevent12;
                    onnavigationevent6 = onnavigationevent12;
                    onnavigationevent7.L$10 = access15400.onNavigationEvent(onnavigationevent2);
                    onnavigationevent7.L$11 = access15400.onNavigationEvent(list13);
                    onnavigationevent7.L$12 = it8;
                    onnavigationevent7.L$13 = list14;
                    List list15 = list12;
                    onnavigationevent7.L$14 = list15;
                    onnavigationevent7.J$0 = j4;
                    onnavigationevent7.I$0 = i31;
                    onnavigationevent7.J$1 = j22;
                    j9 = j22;
                    long j23 = j20;
                    onnavigationevent7.J$2 = j23;
                    long j24 = j23;
                    long j25 = j21;
                    onnavigationevent7.J$3 = j25;
                    j10 = j25;
                    int i35 = i32;
                    onnavigationevent7.I$1 = i35;
                    int i36 = i30;
                    onnavigationevent7.I$2 = i36;
                    i15 = i35;
                    int i37 = i33;
                    onnavigationevent7.I$3 = i37;
                    i33 = i37;
                    int i38 = i34;
                    onnavigationevent7.I$4 = i38;
                    i34 = i38;
                    onnavigationevent7.I$5 = 1;
                    onnavigationevent7.label = 2;
                    int i39 = i31;
                    i14 = i36;
                    objOnWarmupCompleted2 = doGet.onWarmupCompleted(15000L, onextracallback, onnavigationevent7);
                    Object obj7 = obj5;
                    if (objOnWarmupCompleted2 == obj7) {
                        return obj7;
                    }
                    intRef = intRef8;
                    objectRef = objectRef5;
                    logFlushScheduler = logFlushScheduler5;
                    computeLandmarkConfidence = computeLandmarkConfidence11;
                    str2 = str4;
                    i4 = i14;
                    intRef3 = intRef7;
                    retrofitInstance = retrofitInstance3;
                    intRef2 = intRef9;
                    onnavigationevent = onnavigationevent6;
                    j2 = j24;
                    list = list13;
                    j = j10;
                    onnavigationevent3 = onnavigationevent2;
                    i6 = 1;
                    i7 = i39;
                    list3 = list14;
                    list2 = list15;
                    computeLandmarkConfidence2 = computeLandmarkConfidence10;
                    i3 = i33;
                    i5 = i15;
                    obj3 = obj7;
                    it = it8;
                    j3 = j9;
                    i2 = i34;
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        computeLandmarkConfidence5 = computeLandmarkConfidence2;
                    }
                    if (((Boolean) objOnWarmupCompleted2) != null) {
                        onExtraCallback(computeLandmarkConfidence2, list3, intRef3, objectRef, str2, list2, logFlushScheduler, "Timeout", "sendLogs timeout 15s", false, 512, null);
                        computeLandmarkConfidence5 = computeLandmarkConfidence2;
                    } else {
                        computeLandmarkConfidence5 = computeLandmarkConfidence2;
                        computeLandmarkConfidence5.IAuthTabCallback(list3);
                    }
                    j7 = j3;
                    i8 = i3;
                    i9 = i4;
                    i10 = i5;
                    j5 = j;
                    j6 = j2;
                    String str62 = str;
                    i11 = i7;
                    it3 = it;
                    list4 = list;
                    onnavigationevent5 = onnavigationevent;
                    retrofitInstance2 = retrofitInstance;
                    intRef6 = intRef3;
                    logFlushScheduler2 = logFlushScheduler;
                    str3 = str2;
                    computeLandmarkConfidence3 = computeLandmarkConfidence;
                    obj2 = obj3;
                    long j112 = j4;
                    computeLandmarkConfidence4 = computeLandmarkConfidence5;
                    i12 = i6;
                    intRef5 = intRef;
                    intRef4 = intRef2;
                    i13 = i2;
                    onNavigationEvent = onnavigationevent3;
                    onnavigationevent7 = this;
                    str = str62;
                    objectRef2 = objectRef;
                    j8 = j112;
                    while (it3.hasNext()) {
                        try {
                            int i40 = onExtraCallbackWithResult + 73;
                            List<List<File>> list16 = list4;
                            IAuthTabCallback = i40 % 128;
                            int i41 = i40 % 2;
                            List<File> next = it3.next();
                            if (objectRef2.element != null) {
                                computeLandmarkConfidence4.onWarmupCompleted(next);
                                intRef6.element += next.size();
                                it4 = it3;
                                onnavigationevent2 = onNavigationEvent;
                            } else {
                                List<File> list17 = next;
                                ArrayList arrayList = new ArrayList();
                                Iterator<T> it9 = list17.iterator();
                                while (it9.hasNext()) {
                                    Iterator<List<File>> it10 = it3;
                                    int i42 = onExtraCallbackWithResult + 107;
                                    ComputeLandmarkConfidence.onNavigationEvent onnavigationevent13 = onNavigationEvent;
                                    IAuthTabCallback = i42 % 128;
                                    int i43 = i42 % 2;
                                    JsonObject jsonObjectOnWarmupCompleted = computeLandmarkConfidence4.onWarmupCompleted((File) it9.next());
                                    if (jsonObjectOnWarmupCompleted != null) {
                                        arrayList.add(jsonObjectOnWarmupCompleted);
                                        int i44 = onExtraCallbackWithResult + 31;
                                        IAuthTabCallback = i44 % 128;
                                        int i45 = i44 % 2;
                                    }
                                    onNavigationEvent = onnavigationevent13;
                                    it3 = it10;
                                }
                                it4 = it3;
                                onnavigationevent2 = onNavigationEvent;
                                if (!arrayList.isEmpty()) {
                                    if (i12 != 0) {
                                        retrofitInstance7 = retrofitInstance2;
                                        long jOnExtraCallback = LogFlushScheduler.IAuthTabCallback(logFlushScheduler2).onExtraCallback();
                                        if (jOnExtraCallback > 0) {
                                            onnavigationevent7.L$0 = computeLandmarkConfidence3;
                                            onnavigationevent7.L$1 = str3;
                                            onnavigationevent7.L$2 = logFlushScheduler2;
                                            onnavigationevent7.L$3 = objectRef2;
                                            onnavigationevent7.L$4 = computeLandmarkConfidence4;
                                            onnavigationevent7.L$5 = intRef6;
                                            onnavigationevent7.L$6 = retrofitInstance7;
                                            onnavigationevent7.L$7 = intRef4;
                                            onnavigationevent7.L$8 = intRef5;
                                            onnavigationevent7.L$9 = onnavigationevent5;
                                            onnavigationevent7.L$10 = access15400.onNavigationEvent(onnavigationevent2);
                                            onnavigationevent7.L$11 = access15400.onNavigationEvent(list16);
                                            onnavigationevent7.L$12 = it4;
                                            it7 = it4;
                                            onnavigationevent7.L$13 = next;
                                            onnavigationevent7.L$14 = arrayList;
                                            Ref.ObjectRef<onWarmupCompleted> objectRef6 = objectRef2;
                                            intRef17 = intRef6;
                                            long j26 = j8;
                                            onnavigationevent7.J$0 = j26;
                                            int i46 = i11;
                                            onnavigationevent7.I$0 = i46;
                                            j16 = j26;
                                            long j27 = j7;
                                            onnavigationevent7.J$1 = j27;
                                            j19 = j27;
                                            long j28 = j6;
                                            onnavigationevent7.J$2 = j28;
                                            j17 = j28;
                                            long j29 = j5;
                                            onnavigationevent7.J$3 = j29;
                                            int i47 = i10;
                                            onnavigationevent7.I$1 = i47;
                                            i28 = i47;
                                            int i48 = i9;
                                            onnavigationevent7.I$2 = i48;
                                            int i49 = i8;
                                            onnavigationevent7.I$3 = i49;
                                            int i50 = i13;
                                            onnavigationevent7.I$4 = i50;
                                            onnavigationevent7.I$5 = i12;
                                            onnavigationevent7.J$4 = jOnExtraCallback;
                                            onnavigationevent7.label = 1;
                                            obj4 = obj2;
                                            if (formatMsgs.onWarmupCompleted(jOnExtraCallback, onnavigationevent7) == obj4) {
                                                return obj4;
                                            }
                                            i27 = i50;
                                            logFlushScheduler4 = logFlushScheduler2;
                                            list9 = arrayList;
                                            i29 = i46;
                                            onnavigationevent11 = onnavigationevent2;
                                            list11 = list16;
                                            computeLandmarkConfidence9 = computeLandmarkConfidence3;
                                            j18 = j29;
                                            i24 = i48;
                                            i23 = i49;
                                            list10 = next;
                                            objectRef4 = objectRef6;
                                            int i302 = i24;
                                            Ref.IntRef intRef182 = intRef4;
                                            String str82 = str3;
                                            List list122 = list9;
                                            List<List<File>> list132 = list11;
                                            long j202 = j17;
                                            Ref.IntRef intRef192 = intRef17;
                                            int i312 = i29;
                                            int i322 = i28;
                                            Iterator<List<File>> it82 = it7;
                                            RetrofitInstance retrofitInstance82 = retrofitInstance7;
                                            ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence102 = computeLandmarkConfidence4;
                                            j4 = j16;
                                            long j212 = j18;
                                            Ref.ObjectRef<onWarmupCompleted> objectRef52 = objectRef4;
                                            LogFlushScheduler logFlushScheduler52 = logFlushScheduler4;
                                            int i332 = i23;
                                            Ref.IntRef intRef202 = intRef5;
                                            List<File> list142 = list10;
                                            long j222 = j19;
                                            Object obj52 = obj4;
                                            ComputeLandmarkConfidence.onNavigationEvent onnavigationevent122 = onnavigationevent5;
                                            int i342 = i27;
                                            ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence112 = computeLandmarkConfidence9;
                                            onnavigationevent2 = onnavigationevent11;
                                            onExtraCallback onextracallback2 = new onExtraCallback(str82, list122, logFlushScheduler52, retrofitInstance82, intRef182, intRef202, null);
                                            onnavigationevent7.L$0 = computeLandmarkConfidence112;
                                            str4 = str82;
                                            onnavigationevent7.L$1 = str4;
                                            onnavigationevent7.L$2 = logFlushScheduler52;
                                            onnavigationevent7.L$3 = objectRef52;
                                            onnavigationevent7.L$4 = computeLandmarkConfidence102;
                                            onnavigationevent7.L$5 = intRef192;
                                            intRef7 = intRef192;
                                            RetrofitInstance retrofitInstance92 = retrofitInstance82;
                                            onnavigationevent7.L$6 = retrofitInstance92;
                                            retrofitInstance3 = retrofitInstance92;
                                            Ref.IntRef intRef212 = intRef182;
                                            onnavigationevent7.L$7 = intRef212;
                                            intRef9 = intRef212;
                                            intRef8 = intRef202;
                                            onnavigationevent7.L$8 = intRef8;
                                            onnavigationevent7.L$9 = onnavigationevent122;
                                            onnavigationevent6 = onnavigationevent122;
                                            onnavigationevent7.L$10 = access15400.onNavigationEvent(onnavigationevent2);
                                            onnavigationevent7.L$11 = access15400.onNavigationEvent(list132);
                                            onnavigationevent7.L$12 = it82;
                                            onnavigationevent7.L$13 = list142;
                                            List list152 = list122;
                                            onnavigationevent7.L$14 = list152;
                                            onnavigationevent7.J$0 = j4;
                                            onnavigationevent7.I$0 = i312;
                                            onnavigationevent7.J$1 = j222;
                                            j9 = j222;
                                            long j232 = j202;
                                            onnavigationevent7.J$2 = j232;
                                            long j242 = j232;
                                            long j252 = j212;
                                            onnavigationevent7.J$3 = j252;
                                            j10 = j252;
                                            int i352 = i322;
                                            onnavigationevent7.I$1 = i352;
                                            int i362 = i302;
                                            onnavigationevent7.I$2 = i362;
                                            i15 = i352;
                                            int i372 = i332;
                                            onnavigationevent7.I$3 = i372;
                                            i332 = i372;
                                            int i382 = i342;
                                            onnavigationevent7.I$4 = i382;
                                            i342 = i382;
                                            onnavigationevent7.I$5 = 1;
                                            onnavigationevent7.label = 2;
                                            int i392 = i312;
                                            i14 = i362;
                                            objOnWarmupCompleted2 = doGet.onWarmupCompleted(15000L, onextracallback2, onnavigationevent7);
                                            Object obj72 = obj52;
                                            if (objOnWarmupCompleted2 == obj72) {
                                            }
                                        } else {
                                            intRef10 = intRef6;
                                        }
                                    } else {
                                        intRef10 = intRef6;
                                        retrofitInstance7 = retrofitInstance2;
                                    }
                                    long j30 = j8;
                                    Object obj8 = obj2;
                                    Ref.ObjectRef<onWarmupCompleted> objectRef7 = objectRef2;
                                    long j31 = j5;
                                    int i51 = i11;
                                    list132 = list16;
                                    intRef202 = intRef5;
                                    list122 = arrayList;
                                    str82 = str3;
                                    i302 = i9;
                                    i312 = i51;
                                    j202 = j6;
                                    list142 = next;
                                    it82 = it4;
                                    logFlushScheduler52 = logFlushScheduler2;
                                    retrofitInstance82 = retrofitInstance7;
                                    i332 = i8;
                                    intRef192 = intRef10;
                                    computeLandmarkConfidence102 = computeLandmarkConfidence4;
                                    i322 = i10;
                                    long j32 = j7;
                                    i342 = i13;
                                    obj52 = obj8;
                                    onnavigationevent122 = onnavigationevent5;
                                    computeLandmarkConfidence112 = computeLandmarkConfidence3;
                                    objectRef52 = objectRef7;
                                    intRef182 = intRef4;
                                    j4 = j30;
                                    j212 = j31;
                                    j222 = j32;
                                    onExtraCallback onextracallback22 = new onExtraCallback(str82, list122, logFlushScheduler52, retrofitInstance82, intRef182, intRef202, null);
                                    onnavigationevent7.L$0 = computeLandmarkConfidence112;
                                    str4 = str82;
                                    onnavigationevent7.L$1 = str4;
                                    onnavigationevent7.L$2 = logFlushScheduler52;
                                    onnavigationevent7.L$3 = objectRef52;
                                    onnavigationevent7.L$4 = computeLandmarkConfidence102;
                                    onnavigationevent7.L$5 = intRef192;
                                    intRef7 = intRef192;
                                    RetrofitInstance retrofitInstance922 = retrofitInstance82;
                                    onnavigationevent7.L$6 = retrofitInstance922;
                                    retrofitInstance3 = retrofitInstance922;
                                    Ref.IntRef intRef2122 = intRef182;
                                    onnavigationevent7.L$7 = intRef2122;
                                    intRef9 = intRef2122;
                                    intRef8 = intRef202;
                                    onnavigationevent7.L$8 = intRef8;
                                    onnavigationevent7.L$9 = onnavigationevent122;
                                    onnavigationevent6 = onnavigationevent122;
                                    onnavigationevent7.L$10 = access15400.onNavigationEvent(onnavigationevent2);
                                    onnavigationevent7.L$11 = access15400.onNavigationEvent(list132);
                                    onnavigationevent7.L$12 = it82;
                                    onnavigationevent7.L$13 = list142;
                                    List list1522 = list122;
                                    onnavigationevent7.L$14 = list1522;
                                    onnavigationevent7.J$0 = j4;
                                    onnavigationevent7.I$0 = i312;
                                    onnavigationevent7.J$1 = j222;
                                    j9 = j222;
                                    long j2322 = j202;
                                    onnavigationevent7.J$2 = j2322;
                                    long j2422 = j2322;
                                    long j2522 = j212;
                                    onnavigationevent7.J$3 = j2522;
                                    j10 = j2522;
                                    int i3522 = i322;
                                    onnavigationevent7.I$1 = i3522;
                                    int i3622 = i302;
                                    onnavigationevent7.I$2 = i3622;
                                    i15 = i3522;
                                    int i3722 = i332;
                                    onnavigationevent7.I$3 = i3722;
                                    i332 = i3722;
                                    int i3822 = i342;
                                    onnavigationevent7.I$4 = i3822;
                                    i342 = i3822;
                                    onnavigationevent7.I$5 = 1;
                                    onnavigationevent7.label = 2;
                                    int i3922 = i312;
                                    i14 = i3622;
                                    objOnWarmupCompleted2 = doGet.onWarmupCompleted(15000L, onextracallback22, onnavigationevent7);
                                    Object obj722 = obj52;
                                    if (objOnWarmupCompleted2 == obj722) {
                                    }
                                }
                            }
                            list4 = list16;
                            onNavigationEvent = onnavigationevent2;
                            it3 = it4;
                        } catch (Exception e4) {
                            e = e4;
                            onnavigationevent4 = onnavigationevent5;
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Exception e5) {
                    e = e5;
                    computeLandmarkConfidence3 = computeLandmarkConfidence9;
                }
            } else {
                str = "";
                ResultKt.onNavigationEvent(obj);
                if (onnavigationevent7.$logApi == null) {
                    LogFlushScheduler.IAuthTabCallback();
                    return Unit.INSTANCE;
                }
                RetrofitService retrofitServiceOnExtraCallback = onnavigationevent7.this$0.onExtraCallback();
                if (retrofitServiceOnExtraCallback == null || !retrofitServiceOnExtraCallback.extraCallbackWithResult()) {
                    LogFlushScheduler.IAuthTabCallback();
                    return Unit.INSTANCE;
                }
                int i52 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i52 % 128;
                int i53 = i52 % 2;
                long jCoerceAtLeast = RangesKt.coerceAtLeast(LogFlushScheduler.IAuthTabCallback(onnavigationevent7.this$0).onExtraCallbackWithResult(), 1L);
                int iCoerceAtLeast = RangesKt.coerceAtLeast(LogFlushScheduler.IAuthTabCallback(onnavigationevent7.this$0).onWarmupCompleted(), 1);
                long jCoerceAtLeast2 = RangesKt.coerceAtLeast(LogFlushScheduler.IAuthTabCallback(onnavigationevent7.this$0).IAuthTabCallback(), jCoerceAtLeast);
                computeLandmarkConfidence4 = onnavigationevent7.$logItemStore;
                str3 = onnavigationevent7.$storeName;
                LogFlushScheduler logFlushScheduler6 = onnavigationevent7.this$0;
                Ref.ObjectRef<onWarmupCompleted> objectRef8 = onnavigationevent7.$nonRetryableFailure;
                Ref.IntRef intRef22 = onnavigationevent7.$pendingFileCount;
                RetrofitInstance retrofitInstance10 = onnavigationevent7.$logApi;
                Ref.IntRef intRef23 = onnavigationevent7.$sentLogs;
                Ref.IntRef intRef24 = onnavigationevent7.$apiCount;
                onNavigationEvent = computeLandmarkConfidence4.onNavigationEvent(jCoerceAtLeast, jCoerceAtLeast2, iCoerceAtLeast, true);
                try {
                    List<List<File>> listOnWarmupCompleted = onNavigationEvent.onWarmupCompleted();
                    if (listOnWarmupCompleted.isEmpty()) {
                        LogFlushScheduler.IAuthTabCallback();
                        Integer num = (Integer) LogFlushScheduler.onWarmupCompleted(logFlushScheduler6).get(str3);
                        int iIntValue = num != null ? num.intValue() : 0;
                        if (iIntValue > 3) {
                            int i54 = onExtraCallbackWithResult + 105;
                            IAuthTabCallback = i54 % 128;
                            int i55 = i54 % 2;
                            boolean zAreEqual = Intrinsics.areEqual(str3, "logitems");
                            GetDetectingInterval getDetectingInterval = (GetDetectingInterval) LogFlushScheduler.onExtraCallback(2078025729, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler6}, -2078025719, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                            if (getDetectingInterval == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                                getDetectingInterval = null;
                            }
                            getDetectingInterval.onWarmupCompleted(str3, !zAreEqual);
                            LogFlushScheduler.onWarmupCompleted(logFlushScheduler6).remove(str3);
                        } else {
                            LogFlushScheduler.onWarmupCompleted(logFlushScheduler6).put(str3, access14000.onNavigationEvent(iIntValue + 1));
                        }
                        return Unit.INSTANCE;
                    }
                    LogFlushScheduler.onWarmupCompleted(logFlushScheduler6).remove(str3);
                    obj2 = objOnWarmupCompleted;
                    j8 = jCoerceAtLeast;
                    i12 = 0;
                    i11 = iCoerceAtLeast;
                    computeLandmarkConfidence3 = computeLandmarkConfidence4;
                    onnavigationevent5 = onNavigationEvent;
                    list4 = listOnWarmupCompleted;
                    it3 = listOnWarmupCompleted.iterator();
                    j7 = jCoerceAtLeast2;
                    retrofitInstance2 = retrofitInstance10;
                    logFlushScheduler2 = logFlushScheduler6;
                    i8 = 0;
                    intRef6 = intRef22;
                    objectRef2 = objectRef8;
                    j6 = j8;
                    intRef5 = intRef24;
                    j5 = j7;
                    intRef4 = intRef23;
                    i9 = 1;
                    i13 = 0;
                    i10 = i11;
                    while (it3.hasNext()) {
                    }
                    return Unit.INSTANCE;
                } catch (Exception e6) {
                    e = e6;
                    computeLandmarkConfidence3 = computeLandmarkConfidence4;
                    onnavigationevent4 = onNavigationEvent;
                }
            }
            it2 = onnavigationevent4.onWarmupCompleted().iterator();
            while (it2.hasNext()) {
                computeLandmarkConfidence3.onWarmupCompleted((List) it2.next());
            }
            throw e;
        }

        static /* synthetic */ void onExtraCallback(ComputeLandmarkConfidence computeLandmarkConfidence, List list, Ref.IntRef intRef, Ref.ObjectRef objectRef, String str, List list2, LogFlushScheduler logFlushScheduler, String str2, String str3, boolean z, int i, Object obj) throws Throwable {
            boolean z2;
            int i2 = 2 % 2;
            if ((i & 512) != 0) {
                int i3 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                z2 = false;
            } else {
                z2 = z;
            }
            onExtraCallback(computeLandmarkConfidence, list, intRef, objectRef, str, list2, logFlushScheduler, str2, str3, z2);
            int i5 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void onExtraCallback(ComputeLandmarkConfidence<? extends Deinitialize> computeLandmarkConfidence, List<? extends File> list, Ref.IntRef intRef, Ref.ObjectRef<onWarmupCompleted> objectRef, String str, List<JsonObject> list2, LogFlushScheduler logFlushScheduler, String str2, String str3, boolean z) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                computeLandmarkConfidence.onWarmupCompleted(list);
                intRef.element -= list.size();
                if (z) {
                    if (objectRef.element == null) {
                        objectRef.element = new onWarmupCompleted(str2, str3);
                        int i3 = IAuthTabCallback + 39;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
            } else {
                computeLandmarkConfidence.onWarmupCompleted(list);
                intRef.element += list.size();
                if (z) {
                }
            }
            LogFlushScheduler.IAuthTabCallback();
            new Object[]{computeLandmarkConfidence.onWarmupCompleted(), str3, Boolean.valueOf(z)};
            auth.onNavigationEvent.onExtraCallbackWithResult("TossTracker-Flush-Failed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("storeName", str), getWrite.IAuthTabCallback("fileCount", Integer.valueOf(list.size())), getWrite.IAuthTabCallback("error", str2), getWrite.IAuthTabCallback("errorMessage", str3), getWrite.IAuthTabCallback("nonRetryable", Boolean.valueOf(z))}), auth.onExtraCallbackWithResult.ERROR);
            LogFlushScheduler.onExtraCallback(1803409289, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler, str, list2, str2, str3}, -1803409286, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            int i5 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ Ref.IntRef $apiCount;
            final /* synthetic */ RetrofitInstance $logApi;
            final /* synthetic */ List<JsonObject> $logItems;
            final /* synthetic */ Ref.IntRef $sentLogs;
            final /* synthetic */ String $storeName;
            int label;
            final /* synthetic */ LogFlushScheduler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(String str, List<JsonObject> list, LogFlushScheduler logFlushScheduler, RetrofitInstance retrofitInstance, Ref.IntRef intRef, Ref.IntRef intRef2, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$storeName = str;
                this.$logItems = list;
                this.this$0 = logFlushScheduler;
                this.$logApi = retrofitInstance;
                this.$sentLogs = intRef;
                this.$apiCount = intRef2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.$storeName, this.$logItems, this.this$0, this.$logApi, this.$sentLogs, this.$apiCount, access13800Var);
                int i2 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 99;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    LogFlushScheduler.IAuthTabCallback();
                    this.$logItems.size();
                    LogFlushScheduler logFlushScheduler = this.this$0;
                    RetrofitInstance retrofitInstance = this.$logApi;
                    List<JsonObject> list = this.$logItems;
                    this.label = 1;
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    if (LogFlushScheduler.onExtraCallback(1315167964, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler, retrofitInstance, list, this}, -1315167963, iOnNavigationEvent) == objOnWarmupCompleted) {
                        int i3 = IAuthTabCallback + 107;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                this.$sentLogs.element += this.$logItems.size();
                this.$apiCount.element++;
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(true);
                int i5 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return boolOnNavigationEvent;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(String str, access13800<? super Integer> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        Ref.ObjectRef objectRef;
        String str2;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Ref.IntRef intRef3;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object obj = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallback2.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            Ref.IntRef intRef4 = new Ref.IntRef();
            Ref.IntRef intRef5 = new Ref.IntRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.IntRef intRef6 = new Ref.IntRef();
            GetDetectingInterval getDetectingInterval = this.access100;
            if (getDetectingInterval == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = IAuthTabCallbackStubProxy + 75;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                getDetectingInterval = null;
            }
            ComputeLandmarkConfidence computeLandmarkConfidence = (ComputeLandmarkConfidence) GetDetectingInterval.onNavigationEvent(467059339, -467059338, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{getDetectingInterval, str}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
            if (computeLandmarkConfidence == null) {
                Integer numOnNavigationEvent = access14000.onNavigationEvent(0);
                int i6 = ICustomTabsCallback + 119;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                return numOnNavigationEvent;
            }
            if (onNavigationEvent(str)) {
                int i8 = ICustomTabsCallback + 105;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                computeLandmarkConfidence.IAuthTabCallback();
                return access14000.onNavigationEvent(0);
            }
            Pair<String, String> pairOnNavigationEvent = GetDetectingInterval.Companion.onNavigationEvent(str);
            String str3 = (String) pairOnNavigationEvent.onExtraCallbackWithResult();
            String str4 = (String) pairOnNavigationEvent.IAuthTabCallback();
            RetrofitInstance retrofitInstanceOnExtraCallback = EstimateFaceQuality.onWarmupCompleted.onExtraCallback(str3, str4);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onNavigationEvent onnavigationevent = new onNavigationEvent(retrofitInstanceOnExtraCallback, str, this, computeLandmarkConfidence, objectRef2, intRef6, intRef4, intRef5, null);
            iAuthTabCallback2.L$0 = str;
            iAuthTabCallback2.L$1 = intRef4;
            iAuthTabCallback2.L$2 = intRef5;
            iAuthTabCallback2.L$3 = objectRef2;
            iAuthTabCallback2.L$4 = intRef6;
            iAuthTabCallback2.L$5 = access15400.onNavigationEvent(computeLandmarkConfidence);
            iAuthTabCallback2.L$6 = access15400.onNavigationEvent(str3);
            iAuthTabCallback2.L$7 = access15400.onNavigationEvent(str4);
            iAuthTabCallback2.L$8 = access15400.onNavigationEvent(retrofitInstanceOnExtraCallback);
            iAuthTabCallback2.label = 1;
            if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, iAuthTabCallback2) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            objectRef = objectRef2;
            str2 = str;
            intRef = intRef5;
            intRef2 = intRef6;
            intRef3 = intRef4;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = ICustomTabsCallback + 49;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
            intRef2 = (Ref.IntRef) iAuthTabCallback2.L$4;
            objectRef = (Ref.ObjectRef) iAuthTabCallback2.L$3;
            intRef = (Ref.IntRef) iAuthTabCallback2.L$2;
            intRef3 = (Ref.IntRef) iAuthTabCallback2.L$1;
            str2 = (String) iAuthTabCallback2.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objectRef.element;
        if (onwarmupcompleted != null) {
            onExtraCallbackWithResult(str2, intRef2.element, onwarmupcompleted.onWarmupCompleted(), onwarmupcompleted.onNavigationEvent());
        } else {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onExtraCallback(-249249043, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this, str2}, 249249048, iOnNavigationEvent);
        }
        int i12 = intRef3.element;
        if (i12 > 0) {
            new Object[]{str2, access14000.onNavigationEvent(i12), access14000.onNavigationEvent(intRef.element)};
        }
        return access14000.onNavigationEvent(intRef3.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(RetrofitInstance retrofitInstance, List<JsonObject> list, access13800<? super Unit> access13800Var) throws Throwable {
        getInterfaceDescriptor getinterfacedescriptor;
        Object objOnWarmupCompleted;
        Throwable th;
        Result result;
        int i = 2 % 2;
        if (access13800Var instanceof getInterfaceDescriptor) {
            getinterfacedescriptor = (getInterfaceDescriptor) access13800Var;
            int i2 = getinterfacedescriptor.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getinterfacedescriptor.label = i2 - 2147483648;
            } else {
                getinterfacedescriptor = new getInterfaceDescriptor(access13800Var);
            }
        }
        Object objOnExtraCallback = getinterfacedescriptor.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i3 = getinterfacedescriptor.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            getinterfacedescriptor.L$0 = retrofitInstance;
            getinterfacedescriptor.L$1 = list;
            getinterfacedescriptor.label = 1;
            objOnWarmupCompleted = retrofitInstance.onWarmupCompleted(list, getinterfacedescriptor);
            if (objOnWarmupCompleted != objOnWarmupCompleted2) {
            }
            return objOnWarmupCompleted2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = IAuthTabCallbackStubProxy + 11;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                throw null;
            }
            th = (Throwable) getinterfacedescriptor.L$3;
            ResultKt.onNavigationEvent(objOnExtraCallback);
            result = (Result) objOnExtraCallback;
            if (result != null) {
                throw th;
            }
            ResultKt.onNavigationEvent(result.onNavigationEvent());
            return Unit.INSTANCE;
        }
        list = (List) getinterfacedescriptor.L$1;
        retrofitInstance = (RetrofitInstance) getinterfacedescriptor.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        objOnWarmupCompleted = ((Result) objOnExtraCallback).onNavigationEvent();
        Throwable th2 = Result.exceptionOrNull-impl(objOnWarmupCompleted);
        if (th2 != null) {
            int i5 = IAuthTabCallbackStubProxy + 87;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            getinterfacedescriptor.L$0 = access15400.onNavigationEvent(retrofitInstance);
            getinterfacedescriptor.L$1 = access15400.onNavigationEvent(list);
            getinterfacedescriptor.L$2 = objOnWarmupCompleted;
            getinterfacedescriptor.L$3 = th2;
            getinterfacedescriptor.I$0 = 0;
            getinterfacedescriptor.label = 2;
            objOnExtraCallback = retrofitInstance.onExtraCallback(th2, list, getinterfacedescriptor);
            if (objOnExtraCallback != objOnWarmupCompleted2) {
                th = th2;
                result = (Result) objOnExtraCallback;
                if (result != null) {
                }
            }
            return objOnWarmupCompleted2;
        }
        return Unit.INSTANCE;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ JsonReaderEmptyEOFException $emitter;
        final /* synthetic */ String $storeName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(String str, JsonReaderEmptyEOFException jsonReaderEmptyEOFException, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$storeName = str;
            this.$emitter = jsonReaderEmptyEOFException;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = LogFlushScheduler.this.new asBinder(this.$storeName, this.$emitter, access13800Var);
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 89 / 0;
            }
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    LogFlushScheduler logFlushScheduler = LogFlushScheduler.this;
                    String str = this.$storeName;
                    this.label = 1;
                    if (logFlushScheduler.onExtraCallbackWithResult(str, (access13800<? super Integer>) this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                if (!this.$emitter.isDisposed()) {
                    this.$emitter.onWarmupCompleted();
                }
            } catch (Throwable th) {
                if (!this.$emitter.isDisposed()) {
                    int i4 = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.$emitter.onWarmupCompleted(th);
                        obj2.hashCode();
                        throw null;
                    }
                    this.$emitter.onWarmupCompleted(th);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final void onExtraCallback(LogFlushScheduler logFlushScheduler, String str, JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderEmptyEOFException, "");
        jsonReaderEmptyEOFException.IAuthTabCallback(new LogFlushScheduler$.ExternalSyntheticLambda8(maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback()), (CoroutineContext) null, (setRandomHost) null, logFlushScheduler.new asBinder(str, jsonReaderEmptyEOFException, null), 3, (Object) null)));
        int i2 = IAuthTabCallbackStubProxy + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onWarmupCompleted(getPackageType getpackagetype) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        int i4 = IAuthTabCallbackStubProxy + 121;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final RetrofitService onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 33;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        RetrofitService retrofitService = this.asBinder;
        int i5 = i2 + 63;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return retrofitService;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        int i;
        Object obj;
        String str = (String) objArr[1];
        List list = (List) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        int i2 = 2 % 2;
        if (!StringsKt.startsWith$default(str, "bank-logs", false, 2, (Object) null)) {
            return null;
        }
        List<JsonObject> list2 = list;
        float f = 0.0f;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (JsonObject jsonObject : list2) {
                try {
                    Result.Companion companion = Result.Companion;
                    byte size = (byte) (View.MeasureSpec.getSize(0) + 41);
                    int i3 = (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 8;
                    Object[] objArr2 = new Object[1];
                    a(new char[]{'\r', 14, 2, '\b', 5, '\n', 3, 11}, size, i3, objArr2);
                    JsonElement jsonElement = (JsonElement) jsonObject.get(((String) objArr2[0]).intern());
                    if (jsonElement != null) {
                        int i4 = IAuthTabCallbackStubProxy + 51;
                        ICustomTabsCallback = i4 % 128;
                        int i5 = i4 % 2;
                        JsonPrimitive jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement);
                        String strOnNavigationEvent = jsonPrimitiveOnNavigationEvent != null ? initRenderFinish.onNavigationEvent(jsonPrimitiveOnNavigationEvent) : null;
                        obj = Result.constructor-impl(strOnNavigationEvent);
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.onExtraCallback(obj)) {
                    int i6 = IAuthTabCallbackStubProxy + 3;
                    ICustomTabsCallback = i6 % 128;
                    int i7 = i6 % 2;
                    obj = null;
                }
                if (CollectionsKt.contains(GetFeatureExtension.onWarmupCompleted.onMinimized(), (String) obj)) {
                    int i8 = ICustomTabsCallback + 13;
                    IAuthTabCallbackStubProxy = i8 % 128;
                    int i9 = i8 % 2;
                    i++;
                    if (i < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
                f = 0.0f;
            }
        }
        if (i > 0) {
            int i10 = IAuthTabCallbackStubProxy + 103;
            ICustomTabsCallback = i10 % 128;
            int i11 = i10 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("store_name", str), getWrite.IAuthTabCallback("widget_log_count", Integer.valueOf(i)), getWrite.IAuthTabCallback("total_log_count", Integer.valueOf(list.size())), getWrite.IAuthTabCallback("error_type", str2), getWrite.IAuthTabCallback("error_message", str3)});
            Object[] objArr3 = new Object[1];
            a(new char[]{1, 14, 11, 4}, (byte) (113 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 4, objArr3);
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "bank_widget_log_diagnostics", "bank_api_failure_with_widget_log", mapOnWarmupCompleted, "widget", false, ((String) objArr3[0]).intern(), 16, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(-916235253, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, 916235257, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CoroutineExceptionHandler coroutineExceptionHandler, LogFlushScheduler logFlushScheduler, DetectFaceInContinuousImage detectFaceInContinuousImage) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onExtraCallback(-1265835535, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{coroutineExceptionHandler, logFlushScheduler, detectFaceInContinuousImage}, 1265835544, iOnNavigationEvent);
    }

    public static /* synthetic */ void onExtraCallback(getPackageType getpackagetype) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(-380610704, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{getpackagetype}, 380610712, iOnNavigationEvent);
    }

    public static final /* synthetic */ void IAuthTabCallback(LogFlushScheduler logFlushScheduler, String str, List list, String str2, String str3) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(1803409289, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler, str, list, str2, str3}, -1803409286, iOnNavigationEvent);
    }

    public static final /* synthetic */ GetInputImageFromPathAsUnchanged onExtraCallback(LogFlushScheduler logFlushScheduler) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (GetInputImageFromPathAsUnchanged) onExtraCallback(897085550, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler}, -897085548, iOnNavigationEvent);
    }

    public static final /* synthetic */ GetDetectingInterval onTransact(LogFlushScheduler logFlushScheduler) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (GetDetectingInterval) onExtraCallback(2078025729, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler}, -2078025719, iOnNavigationEvent);
    }

    public static final /* synthetic */ Object onWarmupCompleted(LogFlushScheduler logFlushScheduler, String str, access13800 access13800Var) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return onExtraCallback(-1013777256, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler, str, access13800Var}, 1013777256, iOnNavigationEvent);
    }

    public static final /* synthetic */ Object onExtraCallback(LogFlushScheduler logFlushScheduler, RetrofitInstance retrofitInstance, List list, access13800 access13800Var) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return onExtraCallback(1315167964, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{logFlushScheduler, retrofitInstance, list, access13800Var}, -1315167963, iOnNavigationEvent);
    }

    private final void onExtraCallback(String str) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(-249249043, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this, str}, 249249048, iOnNavigationEvent);
    }

    private final void onExtraCallbackWithResult(String str, List<JsonObject> list, String str2, String str3) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(-357308579, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this, str, list, str2, str3}, 357308585, iOnNavigationEvent);
    }

    public final void onExtraCallback(@Nullable deserializeDecimalCollection deserializedecimalcollection) throws Throwable {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(445653917, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this, deserializedecimalcollection}, -445653910, iOnNavigationEvent);
    }

    static void onNavigationEvent() {
        IAuthTabCallback_Parcel = new char[]{64980, 64960, 64976, 65064, 64999, 64984, 64989, 64982, 64961, 64978, 65004, 64983, 64991, 64988, 65065, 64990};
        access000 = (char) 51245;
    }
}
