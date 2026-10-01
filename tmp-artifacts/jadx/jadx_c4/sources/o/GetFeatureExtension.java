package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.skt.usp.UCPApiConstants;
import com.tmoney.LiveCheckConstants;
import im.toss.core.tracker.LogFlushScheduler;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.RemoteProcessAppLog;
import im.toss.core.tracker.RemoteProcessEventLogOptions;
import im.toss.core.tracker.RemoteProcessLogDrainCoordinator;
import im.toss.core.tracker.RemoteProcessLogEnvelope;
import im.toss.core.tracker.RemoteProcessLogIdentity;
import im.toss.core.tracker.RemoteProcessLogIngressStore;
import im.toss.core.tracker.RemoteProcessLogJson;
import im.toss.core.tracker.RemoteProcessLogKind;
import im.toss.core.tracker.TossReferrerTemplate;
import im.toss.core.tracker.entry.CustomizableLog;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import im.toss.core.tracker.payload.AppEventPayloadV2;
import im.toss.core.tracker.payload.AppEventPayloadV3;
import im.toss.core.tracker.payload.DomainLogPayload;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.serialization.json.JsonObject;
import o.GetFeatureExtension;
import o.GetInputImageFromPathAsUnchanged;
import o.Threshold;
import o.setApTextSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetFeatureExtension implements checkValidFaceSize {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Set<String> IAuthTabCallback;
    private static Context IAuthTabCallbackDefault = null;
    private static final LogFlushScheduler IAuthTabCallbackStub;
    private static RetrofitService IAuthTabCallbackStubProxy = null;
    private static Function0<? extends GetInputImageFromPathAsGrayScale> IAuthTabCallback_Parcel = null;
    private static final AppSetIdAndScope1 ICustomTabsCallback;
    private static int ICustomTabsCallbackDefault = 1;
    private static final GetInputImageFromPathAsUnchanged access000;
    private static GetDetectingInterval access100 = null;
    private static final CoroutineExceptionHandler asBinder;
    private static volatile boolean asInterface = false;
    private static DetectFaceInSingleImage extraCallback = null;
    private static char[] extraCallbackWithResult = null;
    private static final Lazy getInterfaceDescriptor;
    private static int[] onActivityLayout = null;
    private static int onActivityResized = 0;
    private static final String onExtraCallback;
    private static String onExtraCallbackWithResult = null;
    private static int onMessageChannelReady = 0;
    private static char onMinimized = 0;
    private static volatile List<? extends ComputeDistance> onNavigationEvent = null;
    private static int onPostMessage = 1;
    private static volatile List<? extends Function1<? super InterfaceC0059deInitialize, Unit>> onTransact;
    public static final GetFeatureExtension onWarmupCompleted;
    private static volatile RemoteProcessLogIngressStore readTypedObject;
    private static final findResAndMsg writeTypedObject;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallback = GetFeatureExtension.onExtraCallback(GetFeatureExtension.this, (downloadZip) null, (RemoteProcessLogIdentity) null, false, (access13800) this);
            int i4 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = GetFeatureExtension.onExtraCallbackWithResult(GetFeatureExtension.this, (downloadZip) null, false, (access13800) this);
            int i4 = onExtraCallback + 97;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 83;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCommand = extraCommand();
        int i4 = onPostMessage + 99;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitExtraCommand;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ GetInputImageFromPathAsGrayScale onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onPostMessage + 5;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallback_Parcel();
            throw null;
        }
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        int i3 = onActivityResized + 95;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return getInputImageFromPathAsGrayScaleICustomTabsCallback_Parcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0111, code lost:
    
        if (kotlin.text.StringsKt.endsWith(r8, ((java.lang.String) r12[0]).intern(), true) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~((~i4) | i3);
        int i8 = ~i2;
        int i9 = i7 | (~(i8 | i3));
        int i10 = ~i3;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i4);
        int i13 = (~(i8 | i4)) | i11 | i12;
        int i14 = (~(i2 | i10)) | i12;
        int i15 = i4 + i3 + i + (1039959776 * i5) + ((-2046201414) * i6);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i4) - 8388608) + ((-1785926397) * i3) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i) + ((-201326592) * i5) + ((-406847488) * i6) + (529399808 * i16);
        int i18 = ((i4 * 868240256) - 1765242424) + (i3 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i * 868239597) + (i5 * 817356128) + (i6 * 406493490) + (i16 * 645267456);
        switch (i17 + (i18 * i18 * 681705472)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                GetFeatureExtension getFeatureExtension = (GetFeatureExtension) objArr[0];
                downloadZip downloadzip = (downloadZip) objArr[1];
                int i19 = 2 % 2;
                GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable = getFeatureExtension.isEngagementSignalsApiAvailable();
                if (getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable != null) {
                    boolean zOnExtraCallback = getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable.onExtraCallback(downloadzip);
                    int i20 = onPostMessage + 3;
                    onActivityResized = i20 % 128;
                    if (i20 % 2 != 0) {
                        int i21 = 4 / 4;
                    }
                    if (!zOnExtraCallback) {
                    }
                    return true;
                }
                int i22 = onPostMessage + 33;
                onActivityResized = i22 % 128;
                int i23 = i22 % 2;
                if (downloadzip instanceof CustomizableLog) {
                    String strIAuthTabCallback_Parcel = ((CustomizableLog) downloadzip).IAuthTabCallback_Parcel();
                    Object[] objArr2 = new Object[1];
                    b(new int[]{1985175588, -1823019609, -1085646812, -910092347}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 5, objArr2);
                    break;
                }
                return false;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onPostMessage + 1;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {str, Integer.valueOf(iIntValue)};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 == 0) {
            return (Unit) onWarmupCompleted(iOnWarmupCompleted2, iOnWarmupCompleted, 1381282645, objArr2, -1381282640, iOnWarmupCompleted3, iOnWarmupCompleted4);
        }
        int i4 = 87 / 0;
        return (Unit) onWarmupCompleted(iOnWarmupCompleted2, iOnWarmupCompleted, 1381282645, objArr2, -1381282640, iOnWarmupCompleted3, iOnWarmupCompleted4);
    }

    public static final class IAuthTabCallbackStubProxy extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int[] IAuthTabCallback = {-1992584559, -459850348, 1053946013, -1917985897, -1624449585, 1033770325, 954471271, -441670374, -2053006646, -1913642827, 797384442, -570885863, 446454150, 1223826703, 868071304, -1177524108, -1149501049, -591259615};
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public IAuthTabCallbackStubProxy(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidCharacter.getMirror('0');
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
        }
    }

    private GetFeatureExtension() {
    }

    public static final /* synthetic */ Object onExtraCallback(GetFeatureExtension getFeatureExtension, downloadZip downloadzip, RemoteProcessLogIdentity remoteProcessLogIdentity, boolean z, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 79;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return getFeatureExtension.onExtraCallback(downloadzip, remoteProcessLogIdentity, z, access13800Var);
        }
        getFeatureExtension.onExtraCallback(downloadzip, remoteProcessLogIdentity, z, access13800Var);
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(GetFeatureExtension getFeatureExtension, downloadZip downloadzip, boolean z, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = getFeatureExtension.onExtraCallback(downloadzip, z, access13800Var);
        int i4 = onPostMessage + 85;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public static final /* synthetic */ List onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 89;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onActivityResized + 75;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub;
        }
        throw null;
    }

    @Override // o.checkValidFaceSize
    public /* bridge */ String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 11;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsCallback = super.ICustomTabsCallback();
        int i4 = onActivityResized + 29;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsCallback;
    }

    public final Set<String> onMinimized() {
        Set<String> set;
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 31;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            set = IAuthTabCallback;
            int i4 = 54 / 0;
        } else {
            set = IAuthTabCallback;
        }
        int i5 = i2 + 17;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ICustomTabsCallbackStubProxy();
        Object[] objArr = new Object[1];
        a(new char[]{20, 15, 13906, 13906, 18, 3, 5, 26, 6, '\"', 13905}, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 104), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        onWarmupCompleted = new GetFeatureExtension();
        Object[] objArr2 = new Object[1];
        a(new char[]{26, 20, 13851, 13851, 26, 0, '\n', 16, 13815, 13815, 29, 14, '\f', 21, ' ', 18, 6, '\b', 15, '\t', 5, 15, 29, 21, 6, 0, 13851, 13851, '\f', 15, 5, '\n', '\b', 29, '\f', 16, 24, 0, 13856}, (byte) (ExpandableListView.getPackedPositionType(0L) + 50), TextUtils.lastIndexOf("", '0') + 40, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(new int[]{1146443235, -114617189, -104097664, 326768779, 1345044803, 1267001627, 756976199, -297085131, 507694817, 866269947, -532061559, -1304133457, 1339622539, -37201600, 434740733, -76673414, -835850339, -1784272496}, TextUtils.indexOf("", "", 0, 0) + 34, objArr3);
        IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{strIntern, ((String) objArr3[0]).intern()});
        Object[] objArr4 = new Object[1];
        a(new char[]{20, 15, 13906, 13906, 18, 3, 5, 26, 6, '\"', 13905}, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 105), (ViewConfiguration.getEdgeSlop() >> 16) + 11, objArr4);
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult(((String) objArr4[0]).intern());
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        ICustomTabsCallback = appSetIdAndScope1OnExtraCallbackWithResult;
        Object[] objArr5 = new Object[1];
        b(new int[]{1852512780, -1935225712}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, objArr5);
        onExtraCallbackWithResult = ((String) objArr5[0]).intern();
        IAuthTabCallbackStubProxy = new getAssetInfo();
        IAuthTabCallbackStub = new LogFlushScheduler();
        onTransact = CollectionsKt.emptyList();
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(CoroutineExceptionHandler.extraCallbackWithResult);
        asBinder = iAuthTabCallbackStubProxy;
        GetInputImageFromPathAsUnchanged.IAuthTabCallback iAuthTabCallback = null;
        writeTypedObject = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()).plus(iAuthTabCallbackStubProxy));
        access000 = new GetInputImageFromPathAsUnchanged(iAuthTabCallback, new Function2() { // from class: im.toss.core.tracker.TossTracker$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr6 = {(String) obj, Integer.valueOf(((Integer) obj2).intValue())};
                Unit unit = (Unit) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 2053003334, objArr6, -2053003333, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i4 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }, 1, iAuthTabCallback);
        onNavigationEvent = CollectionsKt.emptyList();
        getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tracker.TossTracker$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 93;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return GetFeatureExtension.onNavigationEvent();
                }
                GetFeatureExtension.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        extraCallback = GetInputImageFromNV21Buffer.onExtraCallback;
        int i = onMessageChannelReady + 13;
        ICustomTabsCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        iAuthTabCallback.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onActivityResized + 13;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String str = onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27144, 27341, 27186};
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $count;
        final /* synthetic */ String $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(String str, int i, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$key = str;
            this.$count = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$key, this.$count, access13800Var);
            int i2 = onWarmupCompleted + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackStub;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            try {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a(new int[]{0, 3, 20, 0}, true, new byte[]{1, 0, 0}, objArr);
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "log_circuit_breaker_tripped", null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.$key), getWrite.IAuthTabCallback("count", access14000.onNavigationEvent(this.$count))}), null, false, null, 58, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int length;
            char[] cArr;
            int i2;
            int i3 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = IAuthTabCallback;
            char c = '0';
            if (cArr2 != null) {
                int i8 = $10 + 99;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i2 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    int i9 = $10 + 49;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.resolveSizeAndState(0, 0, 0) + 35, 14238 - TextUtils.lastIndexOf("", c), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i2])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.getTrimmedLength("") + 35, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i2++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    c = '0';
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr2, i4, cArr3, 0, i5);
            if (bArr != null) {
                char[] cArr4 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c2 = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i10 = $10 + 123;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i12 = $10 + 83;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 10935), 65 - (ViewConfiguration.getLongPressTimeout() >> 16), 16718 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                            int i14 = 64 / 0;
                        } else {
                            int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10935), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 64, Drawable.resolveOpacity(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i15] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        }
                    } else {
                        int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr6 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17658 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objOnExtraCallback5).invoke(null, objArr6)).charValue();
                    }
                    c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    try {
                        Object[] objArr7 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback6 == null) {
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 69 - TextUtils.lastIndexOf("", '0', 0), 12486 - KeyEvent.normalizeMetaState(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i17 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i17, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i17);
            }
            if (z) {
                char[] cArr6 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i18 = $11 + 83;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i5 / trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
                    } else {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i19 = $11 + 13;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        auth authVar = auth.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b(new int[]{1749395429, -1377773846}, 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a(new char[]{14, '\"', 26, 17, '\"', 5, 19, ' '}, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 112), Gravity.getAbsoluteGravity(0, 0) + 8, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(iIntValue);
        Object[] objArr4 = new Object[1];
        a(new char[]{'#', 14, 2, '\"', 29, 14, 3, 16, 20, ' '}, (byte) (Color.rgb(0, 0, 0) + 16777259), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        Object[] objArr5 = new Object[1];
        a(new char[]{6, '\"', 13814}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 20), 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), str);
        Object[] objArr6 = new Object[1];
        b(new int[]{-1323683168, 941087026, -741664896, -1414020773}, 4 - ImageFormat.getBitsPerPixel(0), objArr6);
        Map<String, ? extends Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), Integer.valueOf(iIntValue))});
        Object[] objArr7 = new Object[1];
        a(new char[]{2, 17, 23, 6, '#', 23, 5, 24, 5, 23, 23, '\b', 30, 6, ' ', 0, 6, '\"', 5, 6, 18, 2, 23, 29, 18, '#', 13922}, (byte) (100 - TextUtils.getOffsetAfter("", 0)), 27 - Color.green(0), objArr7);
        authVar.onExtraCallback(((String) objArr7[0]).intern(), string, mapOnWarmupCompleted);
        maybeUpdateAnimatable.onNavigationEvent(writeTypedObject, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(str, iIntValue, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityResized + 109;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onActivityLayout;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 19;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), TextUtils.getOffsetAfter("", 0) + 72, View.getDefaultSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = 2;
                    i5 = -1469660336;
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
        int[] iArr5 = onActivityLayout;
        if (iArr5 != null) {
            int i10 = $11 + 77;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 27;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 73, TextUtils.lastIndexOf("", '0', i6, i6) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 72 - View.combineMeasuredStates(0, 0), 8848 - View.getDefaultSize(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12++;
                }
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i14 = $10 + 65;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i16 = $10 + 121;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (i18 < 16) {
                int i19 = $10 + 59;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i18];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 22252), Gravity.getAbsoluteGravity(0, 0) + 39, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i18 += UCPApiConstants.ARAM_TIME_OUT;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i18];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 22252), 39 - (ViewConfiguration.getLongPressTimeout() >> 16), 10301 - TextUtils.getOffsetBefore("", 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i18++;
                }
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (KeyEvent.getMaxKeyCode() >> 16)), 79 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 7398 - TextUtils.indexOf("", ""), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final void onExtraCallbackWithResult(@NotNull ComputeDistance computeDistance) {
        Intrinsics.checkNotNullParameter(computeDistance, "");
        synchronized (this) {
            onNavigationEvent = CollectionsKt.plus(CollectionsKt.listOf(computeDistance), onNavigationEvent);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent(@NotNull GetInputImageFromPathAsUnchanged.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onActivityResized + 5;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        access000.onWarmupCompleted(iAuthTabCallback);
        int i4 = onPostMessage + 121;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(GetFeatureExtension getFeatureExtension, String str, Function1 function1, GetInputImageFromPathAsUnchanged.IAuthTabCallback iAuthTabCallback, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onActivityResized + 53;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            iAuthTabCallback = null;
        }
        getFeatureExtension.onNavigationEvent(str, function1, iAuthTabCallback);
        int i5 = onActivityResized + 47;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull Function1<? super InterfaceC0059deInitialize, String> function1, @Nullable GetInputImageFromPathAsUnchanged.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onActivityResized + 15;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            access000.IAuthTabCallback(str, function1, iAuthTabCallback);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            access000.IAuthTabCallback(str, function1, iAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ checkPosition $appLogPayload;
        final /* synthetic */ List<ComputeDistance> $eligibleRouters;
        final /* synthetic */ boolean $immediate;
        final /* synthetic */ GetDetectingInterval $logStoreManager;
        final /* synthetic */ InterfaceC0059deInitialize $payload;
        final /* synthetic */ boolean $shouldWriteAfterBreaker;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onTransact(checkPosition checkposition, List<? extends ComputeDistance> list, boolean z, boolean z2, GetDetectingInterval getDetectingInterval, InterfaceC0059deInitialize interfaceC0059deInitialize, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$appLogPayload = checkposition;
            this.$eligibleRouters = list;
            this.$shouldWriteAfterBreaker = z;
            this.$immediate = z2;
            this.$logStoreManager = getDetectingInterval;
            this.$payload = interfaceC0059deInitialize;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$appLogPayload, this.$eligibleRouters, this.$shouldWriteAfterBreaker, this.$immediate, this.$logStoreManager, this.$payload, access13800Var);
            ontransact.L$0 = obj;
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 72 / 0;
            }
            int i5 = onNavigationEvent + 23;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.GetFeatureExtension$onTransact$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ boolean $immediate;
            final /* synthetic */ GetDetectingInterval $logStoreManager;
            final /* synthetic */ InterfaceC0059deInitialize $payload;
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;
            private static char[] onWarmupCompleted = {32435, 32432, 32440, 32384, 32433, 32390, 32434, 32442, 32388, 32437};
            private static int onExtraCallback = -1184334041;
            private static boolean onNavigationEvent = true;
            private static boolean IAuthTabCallback = true;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(GetDetectingInterval getDetectingInterval, InterfaceC0059deInitialize interfaceC0059deInitialize, boolean z, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$logStoreManager = getDetectingInterval;
                this.$payload = interfaceC0059deInitialize;
                this.$immediate = z;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$logStoreManager, this.$payload, this.$immediate, access13800Var);
                int i2 = IAuthTabCallbackDefault + 117;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 29 / 0;
                }
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 53;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallbackDefault + 19;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                char[] cArr2 = onWarmupCompleted;
                char c = '0';
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = $10 + 63;
                        $11 = i6 % 128;
                        if (i6 % i3 == 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), TextUtils.lastIndexOf("", c, 0) + 78, 20951 - TextUtils.lastIndexOf("", c, 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                                }
                                cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 77, 20952 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        }
                        i5++;
                        i3 = 2;
                        c = '0';
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarSize() >> 8) + 75, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                if (IAuthTabCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 63, View.resolveSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        int i7 = $11 + 63;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onNavigationEvent) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i9 = $11 + 77;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] >> iIntValue);
                            i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted >>> 1;
                        } else {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                            i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                        }
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i10 = $10 + 87;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i12 = $11 + 57;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 63, 12214 - ((Process.getThreadPriority(0) + 20) >> 6), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr6);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
            
                if (r15.onWarmupCompleted(r2, (o.access13800<? super kotlin.Unit>) r14) != r1) goto L24;
             */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0148  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x01a3 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Set set;
                Iterable iterable;
                InterfaceC0059deInitialize interfaceC0059deInitialize;
                Iterator it;
                int i;
                Object next;
                String str;
                GetFeatureExtension getFeatureExtension;
                int i2 = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.$logStoreManager.onExtraCallback(this.$payload);
                    if (Intrinsics.areEqual(this.$payload.onPostMessage(), "bank-logs") && GetFeatureExtension.onWarmupCompleted.onMinimized().contains(this.$payload.IAuthTabCallbackStubProxy())) {
                        int i4 = onExtraCallbackWithResult + 55;
                        IAuthTabCallbackDefault = i4 % 128;
                        int i5 = i4 % 2;
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("log_id", this.$payload.access100());
                        Object[] objArr = new Object[1];
                        a(null, null, new byte[]{-120, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getTouchSlop() >> 8) + 127, objArr);
                        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.$payload.IAuthTabCallbackStubProxy()), getWrite.IAuthTabCallback("store_name", checkValidPitchUnder.IAuthTabCallback(this.$payload))});
                        Object[] objArr2 = new Object[1];
                        a(null, null, new byte[]{-120, -118, -126, -119}, Color.rgb(0, 0, 0) + 16777343, objArr2);
                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "bank_widget_log_diagnostics", "bank_store_written", mapOnWarmupCompleted, "widget", false, ((String) objArr2[0]).intern(), 16, (Object) null);
                    }
                    if (this.$immediate) {
                        GetFeatureExtension getFeatureExtension2 = GetFeatureExtension.onWarmupCompleted;
                        String strIAuthTabCallback = checkValidPitchUnder.IAuthTabCallback(this.$payload);
                        this.label = 1;
                    }
                    return Unit.INSTANCE;
                }
                int i6 = onExtraCallbackWithResult + 67;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    it = (Iterator) this.L$3;
                    interfaceC0059deInitialize = (InterfaceC0059deInitialize) this.L$2;
                    Iterable iterable2 = (Iterable) this.L$1;
                    set = (Set) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    iterable = iterable2;
                    while (it.hasNext()) {
                        int i7 = onExtraCallbackWithResult + 65;
                        IAuthTabCallbackDefault = i7 % 128;
                        if (i7 % 2 == 0) {
                            next = it.next();
                            str = (String) next;
                            int i8 = 65 / 0;
                            if (Intrinsics.areEqual(str, checkValidPitchUnder.IAuthTabCallback(interfaceC0059deInitialize))) {
                                continue;
                            } else {
                                getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
                                this.L$0 = access15400.onNavigationEvent(set);
                                this.L$1 = access15400.onNavigationEvent(iterable);
                                this.L$2 = interfaceC0059deInitialize;
                                this.L$3 = it;
                                this.L$4 = access15400.onNavigationEvent(next);
                                this.L$5 = access15400.onNavigationEvent(str);
                                this.I$0 = i;
                                this.I$1 = 0;
                                this.label = 2;
                                if (getFeatureExtension.onWarmupCompleted(str, (access13800<? super Unit>) this) != objOnWarmupCompleted) {
                                    return objOnWarmupCompleted;
                                }
                            }
                        } else {
                            next = it.next();
                            str = (String) next;
                            if (Intrinsics.areEqual(str, checkValidPitchUnder.IAuthTabCallback(interfaceC0059deInitialize))) {
                                continue;
                            } else {
                                getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
                                this.L$0 = access15400.onNavigationEvent(set);
                                this.L$1 = access15400.onNavigationEvent(iterable);
                                this.L$2 = interfaceC0059deInitialize;
                                this.L$3 = it;
                                this.L$4 = access15400.onNavigationEvent(next);
                                this.L$5 = access15400.onNavigationEvent(str);
                                this.I$0 = i;
                                this.I$1 = 0;
                                this.label = 2;
                                if (getFeatureExtension.onWarmupCompleted(str, (access13800<? super Unit>) this) != objOnWarmupCompleted) {
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                if (Intrinsics.areEqual(this.$payload.onPostMessage(), "logitems")) {
                    List listOnExtraCallbackWithResult = GetFeatureExtension.onExtraCallbackWithResult();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = listOnExtraCallbackWithResult.iterator();
                    while (it2.hasNext()) {
                        CollectionsKt.addAll(linkedHashSet, ((ComputeDistance) it2.next()).onWarmupCompleted());
                    }
                    interfaceC0059deInitialize = this.$payload;
                    it = linkedHashSet.iterator();
                    i = 0;
                    set = linkedHashSet;
                    iterable = linkedHashSet;
                    while (it.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 == 0) {
                throw null;
            }
            checkPosition checkposition = this.$appLogPayload;
            if (checkposition != null) {
                List<ComputeDistance> list = this.$eligibleRouters;
                boolean z = this.$immediate;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback((ComputeDistance) it.next(), checkposition, z, null), 3, (Object) null);
                    int i4 = onExtraCallback + 85;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            if (this.$shouldWriteAfterBreaker) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass3(this.$logStoreManager, this.$payload, this.$immediate, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ checkPosition $appLogPayload;
            final /* synthetic */ boolean $immediate;
            final /* synthetic */ ComputeDistance $router;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(ComputeDistance computeDistance, checkPosition checkposition, boolean z, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.$router = computeDistance;
                this.$appLogPayload = checkposition;
                this.$immediate = z;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$router, this.$appLogPayload, this.$immediate, access13800Var);
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return iAuthTabCallback;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(findresandmsg, access13800Var);
                }
                Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = 26 / 0;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i2 % 128;
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
                    ComputeDistance computeDistance = this.$router;
                    checkPosition checkposition = this.$appLogPayload;
                    boolean z = this.$immediate;
                    this.label = 1;
                    if (computeDistance.onWarmupCompleted(checkposition, z, this) == objOnWarmupCompleted) {
                        int i4 = onExtraCallbackWithResult + 67;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onNavigationEvent + 71;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i6 != 0) {
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void onExtraCallback(@NotNull Function1<? super InterfaceC0059deInitialize, String> function1, @Nullable GetInputImageFromPathAsUnchanged.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onPostMessage + 109;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            access000.IAuthTabCallback(function1, iAuthTabCallback);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            access000.IAuthTabCallback(function1, iAuthTabCallback);
            int i3 = 73 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
            if (access100 == null) {
                if (!asInterface) {
                    int i4 = onPostMessage + 59;
                    onActivityResized = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
            }
        } else if (access100 == null) {
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = 91 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r5 = new java.lang.Object[1];
        a(new char[]{20, 15, 13901, 13901, 18, 3, 5, 26, 6, '\"', 2, 30, '\f', 14, '\"', 2, 20, 26, '#', 14, 5, 16, 23, 14, 3, 0, '\f', 11, '!', '\f'}, (byte) (100 - android.text.TextUtils.indexOf("", "")), 30 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        throw new java.lang.IllegalStateException(((java.lang.String) r5[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 69;
        o.GetFeatureExtension.onPostMessage = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GetDetectingInterval access100() throws Throwable {
        GetDetectingInterval getDetectingInterval;
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 67;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            getDetectingInterval = access100;
            int i4 = 69 / 0;
        } else {
            getDetectingInterval = access100;
        }
    }

    public static /* synthetic */ void onNavigationEvent(GetFeatureExtension getFeatureExtension, Context context, String str, RetrofitService retrofitService, DetectFaceInSingleImage detectFaceInSingleImage, Map map, int i, File file, RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator, ExtractFeature extractFeature, FeatureExtension featureExtension, int i2, Object obj) throws Throwable {
        String strIntern;
        int i3;
        File file2;
        RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator2;
        int i4 = 2 % 2;
        int i5 = onActivityResized + 23;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            Object[] objArr = new Object[1];
            b(new int[]{1852512780, -1935225712}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str;
        }
        Map mapOnNavigationEvent = (i2 & 16) != 0 ? access8100.onNavigationEvent() : map;
        if ((i2 & 32) != 0) {
            int i7 = onPostMessage + 123;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
            i3 = 10000;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            File fileOnExtraCallback = ComputeLandmarkConfidence.Companion.onExtraCallback(context);
            int i9 = onActivityResized + 39;
            onPostMessage = i9 % 128;
            int i10 = i9 % 2;
            file2 = fileOnExtraCallback;
        } else {
            file2 = file;
        }
        if ((i2 & 128) != 0) {
            int i11 = onPostMessage + 73;
            onActivityResized = i11 % 128;
            int i12 = i11 % 2;
            remoteProcessLogDrainCoordinator2 = null;
        } else {
            remoteProcessLogDrainCoordinator2 = remoteProcessLogDrainCoordinator;
        }
        getFeatureExtension.onWarmupCompleted(context, strIntern, retrofitService, detectFaceInSingleImage, mapOnNavigationEvent, i3, file2, remoteProcessLogDrainCoordinator2, (i2 & 256) != 0 ? null : extractFeature, (i2 & 512) != 0 ? FeatureExtension.Companion.onExtraCallback() : featureExtension);
    }

    public final void onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull RetrofitService retrofitService, @NotNull DetectFaceInSingleImage detectFaceInSingleImage, @NotNull Map<String, ComputeDistances> map, int i, @NotNull File file, @Nullable RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator, @Nullable ExtractFeature extractFeature, @NotNull FeatureExtension featureExtension) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(retrofitService, "");
        Intrinsics.checkNotNullParameter(detectFaceInSingleImage, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(featureExtension, "");
        IAuthTabCallbackDefault = context;
        onExtraCallbackWithResult = str;
        IAuthTabCallbackStubProxy = retrofitService;
        asInterface = false;
        Object obj = null;
        readTypedObject = null;
        onExtraCallbackWithResult(map);
        GetDetectingInterval getDetectingInterval = new GetDetectingInterval(context, file, i, null, false, extractFeature, 24, null);
        access100 = getDetectingInterval;
        extraCallback = detectFaceInSingleImage;
        LogFlushScheduler logFlushScheduler = IAuthTabCallbackStub;
        Intrinsics.checkNotNull(getDetectingInterval);
        logFlushScheduler.onNavigationEvent(context, retrofitService, getDetectingInterval, access000, new asInterface(remoteProcessLogDrainCoordinator, null), featureExtension);
        int i3 = onActivityResized + 75;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class asInterface extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ RemoteProcessLogDrainCoordinator $remoteLogDrainCoordinator;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator, access13800<? super asInterface> access13800Var) {
            super(1, access13800Var);
            this.$remoteLogDrainCoordinator = remoteProcessLogDrainCoordinator;
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(access13800Var);
            if (i3 == 0) {
                asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$remoteLogDrainCoordinator, access13800Var);
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r6.onExtraCallbackWithResult(r5) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r6.onExtraCallbackWithResult(r5) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator = this.$remoteLogDrainCoordinator;
                if (remoteProcessLogDrainCoordinator != null) {
                    int i4 = onExtraCallback + 83;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.label = 1;
                    } else {
                        this.label = 1;
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 91;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i6 != 0) {
                    int i7 = 31 / 0;
                }
                int i8 = onNavigationEvent + 35;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(GetFeatureExtension getFeatureExtension, Context context, String str, RetrofitService retrofitService, DetectFaceInSingleImage detectFaceInSingleImage, RemoteProcessLogIngressStore remoteProcessLogIngressStore, int i, Object obj) throws Throwable {
        Object obj2;
        int i2 = 2 % 2;
        int i3 = onPostMessage;
        int i4 = i3 + 91;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 1;
            onActivityResized = i6 % 128;
            if (i6 % 2 != 0) {
                Object[] objArr = new Object[1];
                b(new int[]{1852512780, -1935225712}, (ViewConfiguration.getDoubleTapTimeout() << 105) + 4, objArr);
                obj2 = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                b(new int[]{1852512780, -1935225712}, 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
                obj2 = objArr2[0];
            }
            str = ((String) obj2).intern();
        }
        String str2 = str;
        if ((i & 4) != 0) {
            retrofitService = new getAssetInfo();
            int i7 = onPostMessage + 91;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
        }
        getFeatureExtension.onExtraCallback(context, str2, retrofitService, detectFaceInSingleImage, remoteProcessLogIngressStore);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = extraCallbackWithResult;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 23139 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(onMinimized)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, 23138 - TextUtils.lastIndexOf("", '0'), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $11 + 33;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 38;
                cArr4[i2] = (char) (cArr[i2] * b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $10 + 119;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i8 = $10 + 89;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 24824), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 73, 8089 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i10 = $11 + 3;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 30, 19488 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            int i13 = $10 + 45;
                            $11 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i14 = 5 / 5;
                            }
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            } else {
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
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
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            int i20 = $11 + 25;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final void onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull RetrofitService retrofitService, @NotNull DetectFaceInSingleImage detectFaceInSingleImage, @NotNull RemoteProcessLogIngressStore remoteProcessLogIngressStore) {
        int i = 2 % 2;
        int i2 = onPostMessage + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(retrofitService, "");
        Intrinsics.checkNotNullParameter(detectFaceInSingleImage, "");
        Intrinsics.checkNotNullParameter(remoteProcessLogIngressStore, "");
        IAuthTabCallbackDefault = context;
        onExtraCallbackWithResult = str;
        IAuthTabCallbackStubProxy = retrofitService;
        extraCallback = detectFaceInSingleImage;
        readTypedObject = remoteProcessLogIngressStore;
        asInterface = true;
        access100 = null;
        int i4 = onActivityResized + 53;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(Map<String, ComputeDistances> map) {
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        EstimateFaceQuality.onWarmupCompleted.IAuthTabCallback(map);
        int i4 = onActivityResized + 23;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        o.GetFeatureExtension.IAuthTabCallbackStub.onWarmupCompleted(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (o.GetFeatureExtension.asInterface != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (o.GetFeatureExtension.asInterface != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4 = o.GetFeatureExtension.onActivityResized + 87;
        o.GetFeatureExtension.onPostMessage = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull Context context, @Nullable TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onActivityResized + 37;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            int i3 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
    }

    public final void onNavigationEvent(@NotNull Function1<? super InterfaceC0059deInitialize, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        synchronized (this) {
            onTransact = CollectionsKt.plus(onTransact, function1);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(GetFeatureExtension getFeatureExtension, deserializeDecimalCollection deserializedecimalcollection, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 61;
        int i4 = i3 % 128;
        onPostMessage = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 5;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            deserializedecimalcollection = null;
        }
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, -1946083434, new Object[]{getFeatureExtension, deserializedecimalcollection}, 1946083434, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        deserializeDecimalCollection deserializedecimalcollection = (deserializeDecimalCollection) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (asInterface) {
            int i2 = onPostMessage + 53;
            onActivityResized = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (deserializedecimalcollection != null) {
                deserializedecimalcollection.run();
            }
            return null;
        }
        Object[] objArr2 = {IAuthTabCallbackStub, deserializedecimalcollection};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        LogFlushScheduler.onExtraCallback(445653917, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -445653910, iOnNavigationEvent);
        int i3 = onActivityResized + 95;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r4 = o.GetFeatureExtension.IAuthTabCallbackStub.onExtraCallbackWithResult(r4, (o.access13800<? super java.lang.Integer>) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r4 != o.access14300.onWarmupCompleted()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r5 = o.GetFeatureExtension.onPostMessage + 49;
        o.GetFeatureExtension.onActivityResized = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (o.GetFeatureExtension.asInterface != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (o.GetFeatureExtension.asInterface != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r4 = kotlin.Unit.INSTANCE;
        r5 = o.GetFeatureExtension.onActivityResized + 45;
        o.GetFeatureExtension.onPostMessage = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
    }

    public final Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        if (asInterface) {
            int i2 = onActivityResized + 53;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            return Unit.INSTANCE;
        }
        Object objOnWarmupCompleted = IAuthTabCallbackStub.onWarmupCompleted(access13800Var);
        if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i4 = onActivityResized + 75;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return objOnWarmupCompleted;
    }

    public final wasLastName onUnminimized() {
        int i = 2 % 2;
        if (asInterface) {
            int i2 = onPostMessage + 13;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            wasLastName waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback, "");
            int i4 = onActivityResized + 73;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return waslastnameIAuthTabCallback;
        }
        wasLastName waslastnameOnNavigationEvent = wasLastName.onNavigationEvent(new Callable() { // from class: im.toss.core.tracker.TossTracker$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 25;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnExtraCallback = GetFeatureExtension.onExtraCallback();
                if (i8 == 0) {
                    int i9 = 41 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
        return waslastnameOnNavigationEvent;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(access13800Var);
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 9 / 0;
            }
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 77 / 0;
            }
            int i5 = onExtraCallbackWithResult + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
                LogFlushScheduler logFlushScheduler = (LogFlushScheduler) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, 804079932, new Object[0], -804079929, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                this.label = 1;
                if (logFlushScheduler.onWarmupCompleted((access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 87;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
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

    private static final Unit extraCommand() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onWarmupCompleted((CoroutineContext) null, new asBinder(null), 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityResized + 123;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(downloadZip downloadzip, boolean z, access13800<? super checkPosition> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        Referrer referrerOnExtraCallback;
        Object objOnExtraCallbackWithResult;
        Object objOnExtraCallback;
        downloadZip downloadzip2 = downloadzip;
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
                int i5 = onActivityResized + 75;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallback.label;
        if (i7 != 0) {
            int i8 = onActivityResized + 41;
            onPostMessage = i8 % 128;
            if (i8 % 2 != 0 ? i7 != 1 : i7 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{26, 5, 13933, 13933, 2, 26, 20, 2, 6, 2, 31, '\f', '!', 29, ' ', 6, 30, 26, 31, 6, '\f', 2, 31, '!', 11, 14, 1, 28, 16, '\b', ' ', 6, 2, ' ', 14, 23, 26, '\"', 26, 17, 2, '\f', ' ', 23, 16, 5, 13942}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + UCPApiConstants.ARAM_TIME_OUT), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            Referrer referrer = (Referrer) onextracallback.L$1;
            downloadZip downloadzip3 = (downloadZip) onextracallback.L$0;
            ResultKt.onNavigationEvent(obj);
            referrerOnExtraCallback = referrer;
            downloadzip2 = downloadzip3;
            objOnExtraCallbackWithResult = obj;
        } else {
            ResultKt.onNavigationEvent(obj);
            AFj1nSDK5 aFj1nSDK5 = AFj1nSDK5.onNavigationEvent;
            if (aFj1nSDK5.onExtraCallbackWithResult(downloadzip2)) {
                int i9 = onActivityResized + 39;
                onPostMessage = i9 % 128;
                if (i9 % 2 == 0) {
                    aFj1nSDK5.onWarmupCompleted(downloadzip2);
                    throw null;
                }
                referrerOnExtraCallback = aFj1nSDK5.onWarmupCompleted(downloadzip2);
            } else {
                referrerOnExtraCallback = aFj1nSDK5.onExtraCallback();
            }
            onextracallback.L$0 = downloadzip2;
            onextracallback.L$1 = referrerOnExtraCallback;
            onextracallback.Z$0 = z;
            onextracallback.label = 1;
            objOnExtraCallbackWithResult = downloadzip2.onExtraCallbackWithResult(z, onextracallback);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                int i10 = onActivityResized + 5;
                onPostMessage = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 71 / 0;
                }
                return objOnWarmupCompleted;
            }
        }
        InterfaceC0059deInitialize interfaceC0059deInitialize = (InterfaceC0059deInitialize) objOnExtraCallbackWithResult;
        if (interfaceC0059deInitialize instanceof AppEventPayloadV1) {
            AppEventPayloadV1 appEventPayloadV1 = (AppEventPayloadV1) interfaceC0059deInitialize;
            objOnExtraCallback = AppEventPayloadV1.onExtraCallback(appEventPayloadV1, null, null, null, checkValidYaw.onExtraCallback(appEventPayloadV1.extraCallbackWithResult(), appEventPayloadV1.onActivityLayout()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, referrerOnExtraCallback, null, null, 1834999, null);
        } else if (interfaceC0059deInitialize instanceof AppEventPayloadV2) {
            int i12 = onPostMessage + 49;
            onActivityResized = i12 % 128;
            int i13 = i12 % 2;
            AppEventPayloadV2 appEventPayloadV2 = (AppEventPayloadV2) interfaceC0059deInitialize;
            objOnExtraCallback = (AppEventPayloadV2) AppEventPayloadV2.onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), new Object[]{appEventPayloadV2, 0L, checkValidYaw.onExtraCallback(appEventPayloadV2.extraCallbackWithResult(), appEventPayloadV2.onActivityLayout()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, referrerOnExtraCallback, null, 196605, null}, forceDomainCheck.IAuthTabCallback(), -1217172885, forceDomainCheck.IAuthTabCallback(), 1217172887, forceDomainCheck.IAuthTabCallback());
        } else {
            if (!(interfaceC0059deInitialize instanceof AppEventPayloadV3)) {
                Object[] objArr2 = new Object[1];
                b(new int[]{1156164041, 822686014, 595297598, -678080153, -714998199, -480633845, 1450571268, 1627961004, -269806419, -1048584208, 576482287, 1558383877, -907262736, -1388350982, -1766045090, 1980583176, 902123875, 2037807358, -241637998, -1203397227, 856570818, 2052859144}, 40 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
                ((String) objArr2[0]).intern();
                Objects.toString(interfaceC0059deInitialize);
                ViewConfiguration.getEdgeSlop();
                Drawable.resolveOpacity(0, 0);
                return null;
            }
            int i14 = onActivityResized + 105;
            onPostMessage = i14 % 128;
            int i15 = i14 % 2;
            AppEventPayloadV3 appEventPayloadV3 = (AppEventPayloadV3) interfaceC0059deInitialize;
            objOnExtraCallback = AppEventPayloadV3.onExtraCallback(appEventPayloadV3, null, null, null, null, checkValidYaw.onExtraCallback(appEventPayloadV3.extraCallbackWithResult(), appEventPayloadV3.ICustomTabsCallbackStub()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, referrerOnExtraCallback, null, null, 3669999, null);
            int i16 = onActivityResized + 83;
            onPostMessage = i16 % 128;
            int i17 = i16 % 2;
        }
        AFj1nSDK5 aFj1nSDK52 = AFj1nSDK5.onNavigationEvent;
        if (aFj1nSDK52.onExtraCallbackWithResult(downloadzip2)) {
            aFj1nSDK52.onExtraCallback(downloadzip2);
            aFj1nSDK52.onNavigationEvent(downloadzip2);
        }
        return objOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(GetFeatureExtension getFeatureExtension, downloadZip downloadzip, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onPostMessage;
        int i4 = i3 + 9;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i3 + 1;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        Object[] objArr = {getFeatureExtension, downloadzip, Boolean.valueOf(z)};
        return ((Boolean) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -77609466, objArr, 77609475, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $immediate;
        final /* synthetic */ downloadZip $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(downloadZip downloadzip, boolean z, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$item = downloadzip;
            this.$immediate = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$item, this.$immediate, access13800Var);
            int i2 = onWarmupCompleted + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
                downloadZip downloadzip = this.$item;
                boolean z = this.$immediate;
                this.label = 1;
                obj = GetFeatureExtension.onExtraCallbackWithResult(getFeatureExtension, downloadzip, z, (access13800) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 97;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            checkPosition checkposition = (checkPosition) obj;
            if (checkposition == null) {
                int i6 = onNavigationEvent + 37;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return Unit.INSTANCE;
            }
            GetFeatureExtension.onWarmupCompleted.onWarmupCompleted(checkposition, this.$immediate);
            Unit unit = Unit.INSTANCE;
            int i8 = onNavigationEvent + 107;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 60 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ALCFaceSDK aLCFaceSDK;
        downloadZip downloadzip = (downloadZip) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(downloadzip, "");
        if (asInterface) {
            return Boolean.valueOf(IAuthTabCallbackStubProxy.onExtraCallbackWithResult(downloadzip));
        }
        Object obj = null;
        if (downloadzip instanceof ALCFaceSDK) {
            int i4 = onActivityResized + 99;
            onPostMessage = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            aLCFaceSDK = (ALCFaceSDK) downloadzip;
        } else {
            aLCFaceSDK = null;
        }
        if (aLCFaceSDK == null || aLCFaceSDK.access100()) {
            maybeUpdateAnimatable.onNavigationEvent(writeTypedObject, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(downloadzip, zBooleanValue, null), 3, (Object) null);
        }
        return Boolean.valueOf(IAuthTabCallbackStubProxy.onExtraCallbackWithResult(downloadzip));
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ boolean $immediate;
        final /* synthetic */ aq $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(aq aqVar, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$item = aqVar;
            this.$immediate = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$item, this.$immediate, access13800Var);
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                aq aqVar = this.$item;
                boolean z = this.$immediate;
                this.label = 1;
                obj = aqVar.onExtraCallbackWithResult(z, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            GetFeatureExtension.onWarmupCompleted.onWarmupCompleted((InterfaceC0059deInitialize) obj, this.$immediate);
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        GetFeatureExtension getFeatureExtension = (GetFeatureExtension) objArr[0];
        aq aqVar = (aq) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aqVar, "");
        Object obj = null;
        if (asInterface) {
            int i2 = onActivityResized + 79;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                return Boolean.valueOf(IAuthTabCallbackStubProxy.onExtraCallbackWithResult(aqVar));
            }
            IAuthTabCallbackStubProxy.onExtraCallbackWithResult(aqVar);
            throw null;
        }
        if (!(aqVar instanceof downloadZip)) {
            maybeUpdateAnimatable.onNavigationEvent(writeTypedObject, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(aqVar, zBooleanValue, null), 3, (Object) null);
            return Boolean.valueOf(IAuthTabCallbackStubProxy.onExtraCallbackWithResult(aqVar));
        }
        Object[] objArr2 = {getFeatureExtension, (downloadZip) aqVar, Boolean.valueOf(zBooleanValue)};
        boolean zBooleanValue2 = ((Boolean) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -77609466, objArr2, 77609475, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
        int i3 = onPostMessage + 11;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue2);
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull InterfaceC0059deInitialize interfaceC0059deInitialize, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        Object obj = null;
        if (!asInterface) {
            if (access100 == null) {
                return;
            }
            maybeUpdateAnimatable.onNavigationEvent(writeTypedObject, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(interfaceC0059deInitialize, z, null), 3, (Object) null);
        } else {
            int i4 = onPostMessage + 19;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $immediate;
        final /* synthetic */ InterfaceC0059deInitialize $payload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(InterfaceC0059deInitialize interfaceC0059deInitialize, boolean z, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$payload = interfaceC0059deInitialize;
            this.$immediate = z;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$payload, this.$immediate, access13800Var);
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
                InterfaceC0059deInitialize interfaceC0059deInitialize = this.$payload;
                boolean z = this.$immediate;
                this.label = 1;
                if (getFeatureExtension.IAuthTabCallback(interfaceC0059deInitialize, z, this) == objOnWarmupCompleted) {
                    int i5 = onWarmupCompleted + 47;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull InterfaceC0059deInitialize interfaceC0059deInitialize, boolean z, @NotNull access13800<? super Unit> access13800Var) throws IllegalArgumentException {
        List listEmptyList;
        boolean z2;
        int i = 2 % 2;
        if (!(!asInterface)) {
            return Unit.INSTANCE;
        }
        GetDetectingInterval getDetectingInterval = access100;
        if (getDetectingInterval == null) {
            int i2 = onPostMessage + 109;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            return Unit.INSTANCE;
        }
        Iterator<T> it = onTransact.iterator();
        int i4 = onActivityResized + 83;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                checkPosition checkposition = interfaceC0059deInitialize instanceof checkPosition ? (checkPosition) interfaceC0059deInitialize : null;
                if (checkposition != null) {
                    List<? extends ComputeDistance> list = onNavigationEvent;
                    listEmptyList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((ComputeDistance) obj2).onExtraCallbackWithResult(checkposition)) {
                            listEmptyList.add(obj2);
                        }
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (checkposition != null) {
                    int i6 = onPostMessage + 53;
                    onActivityResized = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 73 / 0;
                        if (!listEmptyList.isEmpty()) {
                            int i8 = onActivityResized + 39;
                            onPostMessage = i8 % 128;
                            int i9 = i8 % 2;
                            List list2 = listEmptyList;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (((ComputeDistance) it2.next()).onWarmupCompleted(checkposition)) {
                                        z2 = access000.onWarmupCompleted(interfaceC0059deInitialize);
                                    }
                                }
                            }
                        } else if (access000.onWarmupCompleted(interfaceC0059deInitialize)) {
                        }
                    } else if (!listEmptyList.isEmpty()) {
                    }
                }
                Object objOnWarmupCompleted = isNeedUnzip.onWarmupCompleted(new onTransact(checkposition, listEmptyList, z2, z, getDetectingInterval, interfaceC0059deInitialize, null), access13800Var);
                if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                    return Unit.INSTANCE;
                }
                int i10 = onPostMessage + 25;
                onActivityResized = i10 % 128;
                if (i10 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                obj.hashCode();
                throw null;
            }
            int i11 = onActivityResized + 77;
            onPostMessage = i11 % 128;
            if (i11 % 2 == 0) {
                ((Function1) it.next()).invoke(interfaceC0059deInitialize);
                obj.hashCode();
                throw null;
            }
            try {
                ((Function1) it.next()).invoke(interfaceC0059deInitialize);
            } catch (Exception unused) {
                Process.getThreadPriority(0);
                Process.getThreadPriority(0);
                View.getDefaultSize(0, 0);
            }
            Process.getThreadPriority(0);
            Process.getThreadPriority(0);
            View.getDefaultSize(0, 0);
        }
    }

    public final boolean onExtraCallbackWithResult(@NotNull Map<String, ? extends Object> map, @NotNull CreateInputImageFromJPEGBinary createInputImageFromJPEGBinary) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(createInputImageFromJPEGBinary, "");
        if (!asInterface) {
            return false;
        }
        String strICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        String strAsInterface = asInterface();
        RemoteProcessLogKind remoteProcessLogKind = RemoteProcessLogKind.EVENT;
        RemoteProcessLogJson remoteProcessLogJson = RemoteProcessLogJson.onNavigationEvent;
        if (!onExtraCallback(new RemoteProcessLogEnvelope(0, strICustomTabsCallbackDefault, strAsInterface, remoteProcessLogKind, false, remoteProcessLogJson.onExtraCallbackWithResult(map), new RemoteProcessEventLogOptions(createInputImageFromJPEGBinary.onWarmupCompleted(), createInputImageFromJPEGBinary.onExtraCallbackWithResult(), remoteProcessLogJson.onExtraCallbackWithResult(createInputImageFromJPEGBinary.onExtraCallback())), (RemoteProcessAppLog) null, 145, (DefaultConstructorMarker) null))) {
            createInputImageFromJPEGBinary.onWarmupCompleted();
            Object[] objArr = new Object[1];
            b(new int[]{-165994136, -693997187, 25928541, -971624512, -966421920, 1485943650, 758903267, -2002993570, 453667305, 40981592}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20, objArr);
            ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{13808}, (byte) (61 - Color.red(0)), TextUtils.getTrimmedLength("") + 1, objArr2);
            ((String) objArr2[0]).intern();
            int i2 = onPostMessage + 31;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onPostMessage + 89;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        GetFeatureExtension getFeatureExtension = (GetFeatureExtension) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        Throwable th = (Throwable) objArr[4];
        Map map = (Map) objArr[5];
        String str4 = (String) objArr[6];
        String str5 = (String) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (!asInterface) {
            int i2 = onActivityResized + 109;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.putAll(map);
        Object[] objArr2 = new Object[1];
        a(new char[]{6, 0, 26, 15, 18, ' ', 17, 29, 2, '\f', 24, '#', 13898, 13898}, (byte) (97 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Color.blue(0) + 14, objArr2);
        mapOnExtraCallback.put(((String) objArr2[0]).intern(), Boolean.TRUE);
        if (th != null) {
            int i3 = onPostMessage + 69;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr3 = new Object[1];
            a(new char[]{14, 19, 5, 26, '\b', 22, 1, 3, 24, '#'}, (byte) (9 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, objArr3);
            mapOnExtraCallback.put(((String) objArr3[0]).intern(), StringsKt.take(setRead.onExtraCallback(th), 8000));
            Object[] objArr4 = new Object[1];
            b(new int[]{-233912137, 669612738, 2061628812, -1243878071, -905054912, -1589103316}, TextUtils.indexOf((CharSequence) "", '0', 0) + 11, objArr4);
            mapOnExtraCallback.put(((String) objArr4[0]).intern(), th.getClass().getName());
            if (!Intrinsics.areEqual(th.getMessage(), str3)) {
                Object[] objArr5 = new Object[1];
                a(new char[]{0, 6, 2, '\f', 5, 6, 24, '!', 13807, 13807, 0, 20, 13829}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5), MotionEvent.axisFromString("") + 14, objArr5);
                mapOnExtraCallback.put(((String) objArr5[0]).intern(), th.getMessage());
            }
        }
        if (!getFeatureExtension.onExtraCallback(new RemoteProcessLogEnvelope(0, getFeatureExtension.ICustomTabsCallbackDefault(), getFeatureExtension.asInterface(), RemoteProcessLogKind.APP_LOG, zBooleanValue, RemoteProcessLogJson.onNavigationEvent.onExtraCallbackWithResult(access8100.onExtraCallbackWithResult(mapOnExtraCallback)), (RemoteProcessEventLogOptions) null, new RemoteProcessAppLog(str, str2, str3, str4, str5), 65, (DefaultConstructorMarker) null))) {
            Object[] objArr6 = new Object[1];
            b(new int[]{-336689616, 1467162588, -1049451205, -422456115, -160602516, -37241921, -1868853240, 388807948}, 13 - Color.red(0), objArr6);
            ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            a(new char[]{14, '\"', 26, '\b', 19, 30}, (byte) (78 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Drawable.resolveOpacity(0, 0) + 6, objArr7);
            ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a(new char[]{13808}, (byte) (61 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Color.green(0) + 1, objArr8);
            ((String) objArr8[0]).intern();
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object onExtraCallback(@NotNull RemoteProcessLogEnvelope remoteProcessLogEnvelope, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        if (asInterface) {
            return Unit.INSTANCE;
        }
        if (remoteProcessLogEnvelope.asBinder() != 1) {
            return Unit.INSTANCE;
        }
        int i2 = IAuthTabCallback.onExtraCallback[remoteProcessLogEnvelope.onTransact().ordinal()];
        if (i2 == 1) {
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(remoteProcessLogEnvelope, access13800Var);
            return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
        }
        int i3 = onActivityResized + 11;
        int i4 = i3 % 128;
        onPostMessage = i4;
        int i5 = i3 % 2;
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i4 + 81;
        onActivityResized = i6 % 128;
        int i7 = i6 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(remoteProcessLogEnvelope, access13800Var);
        if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i8 = onActivityResized + 19;
        onPostMessage = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 39 / 0;
        }
        return objIAuthTabCallback;
    }

    private final Object onExtraCallbackWithResult(RemoteProcessLogEnvelope remoteProcessLogEnvelope, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        RemoteProcessEventLogOptions remoteProcessEventLogOptionsOnExtraCallbackWithResult = remoteProcessLogEnvelope.onExtraCallbackWithResult();
        Object obj = null;
        if (remoteProcessEventLogOptionsOnExtraCallbackWithResult == null) {
            Unit unit = Unit.INSTANCE;
            int i2 = onActivityResized + 79;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        RemoteProcessLogJson remoteProcessLogJson = RemoteProcessLogJson.onNavigationEvent;
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        downloadZip downloadzipOnExtraCallbackWithResult = Threshold.onWarmupCompleted.onExtraCallbackWithResult(remoteProcessLogJson.IAuthTabCallback((JsonObject) RemoteProcessLogEnvelope.onExtraCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{remoteProcessLogEnvelope}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1465023755, 1465023755, iOnExtraCallback)), new Threshold.onWarmupCompleted(remoteProcessEventLogOptionsOnExtraCallbackWithResult.onWarmupCompleted(), remoteProcessEventLogOptionsOnExtraCallbackWithResult.onExtraCallbackWithResult(), (String) null, remoteProcessLogJson.IAuthTabCallback(remoteProcessEventLogOptionsOnExtraCallbackWithResult.IAuthTabCallback()), 4, (DefaultConstructorMarker) null));
        if (downloadzipOnExtraCallbackWithResult == null) {
            int i3 = onActivityResized + 117;
            onPostMessage = i3 % 128;
            if (i3 % 2 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(downloadzipOnExtraCallbackWithResult, onWarmupCompleted(remoteProcessLogEnvelope), remoteProcessLogEnvelope.IAuthTabCallbackDefault(), access13800Var);
        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i4 = onActivityResized + 103;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    private final Object IAuthTabCallback(RemoteProcessLogEnvelope remoteProcessLogEnvelope, access13800<? super Unit> access13800Var) throws Throwable {
        downloadZip result;
        int i = 2 % 2;
        int i2 = onPostMessage + 89;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessAppLog remoteProcessAppLogIAuthTabCallback = remoteProcessLogEnvelope.IAuthTabCallback();
        if (remoteProcessAppLogIAuthTabCallback == null) {
            int i4 = onPostMessage + 65;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> mapIAuthTabCallback = RemoteProcessLogJson.onNavigationEvent.IAuthTabCallback((JsonObject) RemoteProcessLogEnvelope.onExtraCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{remoteProcessLogEnvelope}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1465023755, 1465023755, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()));
        String strOnWarmupCompleted = remoteProcessAppLogIAuthTabCallback.onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{0, 6, 2, '\f', 13850}, (byte) (51 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 5 - (Process.myPid() >> 22), objArr);
        if (Intrinsics.areEqual(strOnWarmupCompleted, ((String) objArr[0]).intern())) {
            String strOnExtraCallbackWithResult = remoteProcessAppLogIAuthTabCallback.onExtraCallbackWithResult();
            String str = strOnExtraCallbackWithResult == null ? "" : strOnExtraCallbackWithResult;
            String strIAuthTabCallback = remoteProcessAppLogIAuthTabCallback.IAuthTabCallback();
            String strOnExtraCallback = remoteProcessAppLogIAuthTabCallback.onExtraCallback();
            String strOnNavigationEvent = remoteProcessAppLogIAuthTabCallback.onNavigationEvent();
            if (strOnNavigationEvent == null) {
                int i5 = onPostMessage + 37;
                onActivityResized = i5 % 128;
                int i6 = i5 % 2;
                strOnNavigationEvent = onExtraCallbackWithResult;
            }
            result = new l(str, strIAuthTabCallback, null, strOnExtraCallback, mapIAuthTabCallback, strOnNavigationEvent);
        } else {
            Object[] objArr2 = new Object[1];
            b(new int[]{-476418255, 1641095703, 1293214564, 458185868}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, objArr2);
            if (!Intrinsics.areEqual(strOnWarmupCompleted, ((String) objArr2[0]).intern())) {
                return Unit.INSTANCE;
            }
            String strOnExtraCallbackWithResult2 = remoteProcessAppLogIAuthTabCallback.onExtraCallbackWithResult();
            String str2 = strOnExtraCallbackWithResult2 == null ? "" : strOnExtraCallbackWithResult2;
            String strIAuthTabCallback2 = remoteProcessAppLogIAuthTabCallback.IAuthTabCallback();
            String strOnExtraCallback2 = remoteProcessAppLogIAuthTabCallback.onExtraCallback();
            String strOnNavigationEvent2 = remoteProcessAppLogIAuthTabCallback.onNavigationEvent();
            if (strOnNavigationEvent2 == null) {
                strOnNavigationEvent2 = onExtraCallbackWithResult;
            }
            result = new Result(str2, strIAuthTabCallback2, strOnExtraCallback2, mapIAuthTabCallback, strOnNavigationEvent2);
        }
        Object objOnExtraCallback = onExtraCallback(result, onWarmupCompleted(remoteProcessLogEnvelope), remoteProcessLogEnvelope.IAuthTabCallbackDefault(), access13800Var);
        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i7 = onActivityResized + 45;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
        return objOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0125, code lost:
    
        if (IAuthTabCallback(r12, r11, r1) == r3) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(downloadZip downloadzip, RemoteProcessLogIdentity remoteProcessLogIdentity, boolean z, access13800<? super Unit> access13800Var) throws Throwable {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        downloadZip downloadzip2;
        InterfaceC0059deInitialize interfaceC0059deInitializeOnExtraCallback;
        int i = 2 % 2;
        int i2 = onPostMessage + 25;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i4 = iAuthTabCallbackDefault.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onPostMessage + 47;
                onActivityResized = i5 % 128;
                if (i5 % 2 != 0) {
                    iAuthTabCallbackDefault.label = i4 - Integer.MIN_VALUE;
                } else {
                    iAuthTabCallbackDefault.label = i4 - 2147483648;
                }
            } else {
                iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallbackDefault.label;
        ALCFaceSDK aLCFaceSDK = null;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            IAuthTabCallbackStubProxy.onExtraCallbackWithResult(downloadzip);
            if (downloadzip instanceof ALCFaceSDK) {
                int i7 = onActivityResized + 93;
                onPostMessage = i7 % 128;
                if (i7 % 2 == 0) {
                    aLCFaceSDK = (ALCFaceSDK) downloadzip;
                    int i8 = 64 / 0;
                } else {
                    aLCFaceSDK = (ALCFaceSDK) downloadzip;
                }
            }
            if (aLCFaceSDK != null) {
                int i9 = onPostMessage + 41;
                onActivityResized = i9 % 128;
                int i10 = i9 % 2;
                if (!aLCFaceSDK.access100()) {
                    return Unit.INSTANCE;
                }
            }
            iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(downloadzip);
            iAuthTabCallbackDefault.L$1 = remoteProcessLogIdentity;
            iAuthTabCallbackDefault.Z$0 = z;
            iAuthTabCallbackDefault.label = 1;
            objOnExtraCallback = onExtraCallback(downloadzip, z, iAuthTabCallbackDefault);
            downloadzip2 = downloadzip;
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        int i11 = onPostMessage + 77;
        int i12 = i11 % 128;
        onActivityResized = i12;
        if (i11 % 2 == 0 ? i6 != 1 : i6 != 1) {
            int i13 = i12 + 11;
            onPostMessage = i13 % 128;
            int i14 = i13 % 2;
            if (i6 != 2) {
                Object[] objArr = new Object[1];
                a(new char[]{26, 5, 13933, 13933, 2, 26, 20, 2, 6, 2, 31, '\f', '!', 29, ' ', 6, 30, 26, 31, 6, '\f', 2, 31, '!', 11, 14, 1, 28, 16, '\b', ' ', 6, 2, ' ', 14, 23, 26, '\"', 26, 17, 2, '\f', ' ', 23, 16, 5, 13942}, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 119), ImageFormat.getBitsPerPixel(0) + 48, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i15 = i12 + 13;
            onPostMessage = i15 % 128;
            if (i15 % 2 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                throw null;
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i16 = onPostMessage + 41;
            onActivityResized = i16 % 128;
            int i17 = i16 % 2;
            return unit;
        }
        z = iAuthTabCallbackDefault.Z$0;
        remoteProcessLogIdentity = (RemoteProcessLogIdentity) iAuthTabCallbackDefault.L$1;
        downloadZip downloadzip3 = (downloadZip) iAuthTabCallbackDefault.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        downloadzip2 = downloadzip3;
        checkPosition checkposition = (checkPosition) objOnExtraCallback;
        if (checkposition == null || (interfaceC0059deInitializeOnExtraCallback = onExtraCallback(checkposition, remoteProcessLogIdentity)) == null) {
            return Unit.INSTANCE;
        }
        iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(downloadzip2);
        iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(remoteProcessLogIdentity);
        iAuthTabCallbackDefault.L$2 = access15400.onNavigationEvent(interfaceC0059deInitializeOnExtraCallback);
        iAuthTabCallbackDefault.Z$0 = z;
        iAuthTabCallbackDefault.label = 2;
    }

    private final boolean onExtraCallback(RemoteProcessLogEnvelope remoteProcessLogEnvelope) {
        int i = 2 % 2;
        RemoteProcessLogIngressStore remoteProcessLogIngressStore = readTypedObject;
        if (remoteProcessLogIngressStore != null && remoteProcessLogIngressStore.onExtraCallback(remoteProcessLogEnvelope)) {
            int i2 = onActivityResized + 111;
            onPostMessage = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = onPostMessage + 103;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private final RemoteProcessLogIdentity onWarmupCompleted(RemoteProcessLogEnvelope remoteProcessLogEnvelope) {
        int i = 2 % 2;
        RemoteProcessLogIdentity remoteProcessLogIdentity = new RemoteProcessLogIdentity(remoteProcessLogEnvelope.IAuthTabCallbackStub(), remoteProcessLogEnvelope.onNavigationEvent());
        int i2 = onActivityResized + 39;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return remoteProcessLogIdentity;
        }
        throw null;
    }

    private final InterfaceC0059deInitialize onExtraCallback(InterfaceC0059deInitialize interfaceC0059deInitialize, RemoteProcessLogIdentity remoteProcessLogIdentity) {
        int i = 2 % 2;
        Object obj = null;
        if (interfaceC0059deInitialize instanceof AppEventPayloadV1) {
            int i2 = onPostMessage + 47;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                return AppEventPayloadV1.onExtraCallback((AppEventPayloadV1) interfaceC0059deInitialize, null, null, null, null, remoteProcessLogIdentity.onWarmupCompleted(), remoteProcessLogIdentity.onExtraCallback(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097103, null);
            }
            AppEventPayloadV1.onExtraCallback((AppEventPayloadV1) interfaceC0059deInitialize, null, null, null, null, remoteProcessLogIdentity.onWarmupCompleted(), remoteProcessLogIdentity.onExtraCallback(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097103, null);
            throw null;
        }
        if (interfaceC0059deInitialize instanceof AppEventPayloadV2) {
            AppEventPayloadV2 appEventPayloadV2 = (AppEventPayloadV2) AppEventPayloadV2.onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), new Object[]{(AppEventPayloadV2) interfaceC0059deInitialize, 0L, null, remoteProcessLogIdentity.onWarmupCompleted(), remoteProcessLogIdentity.onExtraCallback(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262131, null}, forceDomainCheck.IAuthTabCallback(), -1217172885, forceDomainCheck.IAuthTabCallback(), 1217172887, forceDomainCheck.IAuthTabCallback());
            int i3 = onActivityResized + 41;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            return appEventPayloadV2;
        }
        if (!(interfaceC0059deInitialize instanceof AppEventPayloadV3)) {
            return !((interfaceC0059deInitialize instanceof DomainLogPayload) ^ true) ? DomainLogPayload.onNavigationEvent((DomainLogPayload) interfaceC0059deInitialize, null, null, remoteProcessLogIdentity.onWarmupCompleted(), remoteProcessLogIdentity.onExtraCallback(), 3, null) : interfaceC0059deInitialize;
        }
        int i5 = onPostMessage + 83;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            AppEventPayloadV3.onExtraCallback((AppEventPayloadV3) interfaceC0059deInitialize, null, null, null, null, null, remoteProcessLogIdentity.onWarmupCompleted(), remoteProcessLogIdentity.onExtraCallback(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194207, null);
            obj.hashCode();
            throw null;
        }
        AppEventPayloadV3 appEventPayloadV3OnExtraCallback = AppEventPayloadV3.onExtraCallback((AppEventPayloadV3) interfaceC0059deInitialize, null, null, null, null, null, remoteProcessLogIdentity.onWarmupCompleted(), remoteProcessLogIdentity.onExtraCallback(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194207, null);
        int i6 = onActivityResized + 83;
        onPostMessage = i6 % 128;
        if (i6 % 2 != 0) {
            return appEventPayloadV3OnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final GetInputImageFromPathAsGrayScale isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScale = (GetInputImageFromPathAsGrayScale) getInterfaceDescriptor.getValue();
        int i4 = onActivityResized + 21;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return getInputImageFromPathAsGrayScale;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r3 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r1 = r1 + 5;
        o.GetFeatureExtension.onActivityResized = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r0 = 50 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r3 = r3 + 91;
        o.GetFeatureExtension.onPostMessage = r3 % 128;
        r3 = r3 % 2;
        r0 = (o.GetInputImageFromPathAsGrayScale) r2.invoke();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final GetInputImageFromPathAsGrayScale ICustomTabsCallback_Parcel() {
        Function0<? extends GetInputImageFromPathAsGrayScale> function0;
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 31;
        int i4 = i3 % 128;
        onActivityResized = i4;
        if (i3 % 2 != 0) {
            function0 = IAuthTabCallback_Parcel;
            int i5 = 31 / 0;
        } else {
            function0 = IAuthTabCallback_Parcel;
        }
    }

    public final DetectFaceInSingleImage readTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityResized + 83;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        DetectFaceInSingleImage detectFaceInSingleImage = extraCallback;
        int i5 = i3 + 79;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return detectFaceInSingleImage;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NotNull Function0<? extends GetInputImageFromPathAsGrayScale> function0) {
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            IAuthTabCallback_Parcel = function0;
            int i3 = 97 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            IAuthTabCallback_Parcel = function0;
        }
        int i4 = onActivityResized + 19;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1
      0x0029: PHI (r1v3 o.GetInputImageFromPathAsGrayScale) = (r1v2 o.GetInputImageFromPathAsGrayScale), (r1v16 o.GetInputImageFromPathAsGrayScale) binds: [B:8:0x0027, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable;
        GetFeatureExtension getFeatureExtension = (GetFeatureExtension) objArr[0];
        downloadZip downloadzip = (downloadZip) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable = getFeatureExtension.isEngagementSignalsApiAvailable();
            int i3 = 93 / 0;
            if (getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable != null) {
                int i4 = onActivityResized + 123;
                onPostMessage = i4 % 128;
                if (i4 % 2 == 0) {
                    getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable.onExtraCallbackWithResult(downloadzip);
                    throw null;
                }
                if (!getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable.onExtraCallbackWithResult(downloadzip)) {
                    if (downloadzip != null) {
                        int i5 = onActivityResized + 17;
                        onPostMessage = i5 % 128;
                        int i6 = i5 % 2;
                        Map<String, Object> mapOnNavigationEvent = downloadzip.onNavigationEvent();
                        if (mapOnNavigationEvent != null) {
                            Object[] objArr2 = new Object[1];
                            a(new char[]{5, 26, 23, 14, 16, 2, '\b', 23, 23, 18, 13917}, (byte) (94 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                            obj = mapOnNavigationEvent.get(((String) objArr2[0]).intern());
                            int i7 = onPostMessage + 117;
                            onActivityResized = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                    Object[] objArr3 = new Object[1];
                    a(new char[]{17, 25, 6, 0, '\"', 0}, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 39), 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
                    if (!Intrinsics.areEqual(obj, ((String) objArr3[0]).intern())) {
                        int i9 = onActivityResized + 25;
                        onPostMessage = i9 % 128;
                        int i10 = i9 % 2;
                        return false;
                    }
                }
            }
        } else {
            getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable = getFeatureExtension.isEngagementSignalsApiAvailable();
            if (getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable != null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return r1.IAuthTabCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r4 = o.GetFeatureExtension.onActivityResized + 39;
        o.GetFeatureExtension.onPostMessage = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r4 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onExtraCallbackWithResult(@Nullable downloadZip downloadzip) {
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable;
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
            int i3 = 51 / 0;
        } else {
            getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        GetFeatureExtension getFeatureExtension = (GetFeatureExtension) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getFeatureExtension.isEngagementSignalsApiAvailable();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable = getFeatureExtension.isEngagementSignalsApiAvailable();
        if (getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable != null) {
            return getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable.onWarmupCompleted(str);
        }
        int i3 = onActivityResized + 35;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final List<Regex> extraCallbackWithResult() {
        List<Regex> listOnExtraCallbackWithResult;
        int i = 2 % 2;
        GetInputImageFromPathAsGrayScale getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        if (getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable != null && (listOnExtraCallbackWithResult = getInputImageFromPathAsGrayScaleIsEngagementSignalsApiAvailable.onExtraCallbackWithResult()) != null) {
            int i2 = onActivityResized + 109;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            return listOnExtraCallbackWithResult;
        }
        List<Regex> listEmptyList = CollectionsKt.emptyList();
        int i4 = onPostMessage + 3;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }

    public boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityResized + 29;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy.IAuthTabCallbackStub();
            throw null;
        }
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStubProxy.IAuthTabCallbackStub();
        int i3 = onPostMessage + 37;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallbackStub;
    }

    public boolean onPostMessage() {
        int i = 2 % 2;
        int i2 = onPostMessage + 67;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy.IAuthTabCallback_Parcel();
            throw null;
        }
        boolean zIAuthTabCallback_Parcel = IAuthTabCallbackStubProxy.IAuthTabCallback_Parcel();
        int i3 = onActivityResized + 73;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback_Parcel;
    }

    public boolean onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = onActivityResized + 87;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy.writeTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zWriteTypedObject = IAuthTabCallbackStubProxy.writeTypedObject();
        int i3 = onActivityResized + 19;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return zWriteTypedObject;
    }

    public boolean onActivityResized() {
        int i = 2 % 2;
        int i2 = onPostMessage + 89;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy.IAuthTabCallbackStubProxy();
        int i4 = onActivityResized + 91;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackStubProxy;
    }

    public String onActivityLayout() {
        int i = 2 % 2;
        int i2 = onPostMessage + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strAccess000 = IAuthTabCallbackStubProxy.access000();
        int i4 = onActivityResized + 15;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return strAccess000;
        }
        throw null;
    }

    @Override // o.checkValidFaceSize
    public String bx_() {
        int i = 2 % 2;
        int i2 = onPostMessage + 75;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strBx_ = IAuthTabCallbackStubProxy.bx_();
        int i4 = onActivityResized + 11;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return strBx_;
        }
        throw null;
    }

    public String ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onPostMessage + 103;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strExtraCallback = IAuthTabCallbackStubProxy.extraCallback();
        int i4 = onPostMessage + 111;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return strExtraCallback;
        }
        throw null;
    }

    public String writeTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityResized + 19;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String strAccess100 = IAuthTabCallbackStubProxy.access100();
        int i4 = onActivityResized + 9;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return strAccess100;
    }

    public String extraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 31;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String interfaceDescriptor = IAuthTabCallbackStubProxy.getInterfaceDescriptor();
        int i4 = onPostMessage + 19;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = onPostMessage + 69;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = IAuthTabCallbackStubProxy.onNavigationEvent();
        int i4 = onActivityResized + 51;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public String IAuthTabCallbackDefault() {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onPostMessage + 97;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            strIAuthTabCallback = IAuthTabCallbackStubProxy.IAuthTabCallback();
            int i3 = 75 / 0;
        } else {
            strIAuthTabCallback = IAuthTabCallbackStubProxy.IAuthTabCallback();
        }
        int i4 = onActivityResized + 71;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    public String onMessageChannelReady() {
        String typedObject;
        int i = 2 % 2;
        int i2 = onPostMessage + 5;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            typedObject = IAuthTabCallbackStubProxy.readTypedObject();
            int i3 = 25 / 0;
        } else {
            typedObject = IAuthTabCallbackStubProxy.readTypedObject();
        }
        int i4 = onPostMessage + 113;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onPostMessage + 61;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strOnTransact = IAuthTabCallbackStubProxy.onTransact();
        int i4 = onActivityResized + 95;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnTransact;
        }
        throw null;
    }

    public Long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityResized + 89;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long lAsBinder = IAuthTabCallbackStubProxy.asBinder();
        int i3 = onActivityResized + 5;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return lAsBinder;
    }

    public String onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onActivityResized + 113;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strIAuthTabCallback = IAuthTabCallbackStubProxy.IAuthTabCallback(str);
        int i4 = onPostMessage + 11;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onPostMessage + 31;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = IAuthTabCallbackStubProxy.onExtraCallback();
        int i4 = onActivityResized + 105;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallback;
        }
        throw null;
    }

    public String access000() {
        int i = 2 % 2;
        int i2 = onActivityResized + 103;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        RetrofitService retrofitService = IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            return retrofitService.asInterface();
        }
        retrofitService.asInterface();
        throw null;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onPostMessage + 49;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackStubProxy.IAuthTabCallbackDefault();
        int i4 = onActivityResized + 41;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return strIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 2053003334, objArr, -2053003333, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static final /* synthetic */ LogFlushScheduler IAuthTabCallback() {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (LogFlushScheduler) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, 804079932, new Object[0], -804079929, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1381282645, objArr, -1381282640, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final boolean onWarmupCompleted(@NotNull downloadZip downloadzip, boolean z) {
        Object[] objArr = {this, downloadzip, Boolean.valueOf(z)};
        return ((Boolean) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -77609466, objArr, 77609475, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    public final boolean onExtraCallback(@NotNull aq aqVar, boolean z) {
        Object[] objArr = {this, aqVar, Boolean.valueOf(z)};
        return ((Boolean) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1622468404, objArr, -1622468400, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    public final TossReferrerTemplate IAuthTabCallback(@NotNull String str) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (TossReferrerTemplate) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, -932621748, new Object[]{this, str}, 932621754, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final boolean onWarmupCompleted(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th, @NotNull Map<String, ? extends Object> map, @Nullable String str4, @NotNull String str5, boolean z) {
        Object[] objArr = {this, str, str2, str3, th, map, str4, str5, Boolean.valueOf(z)};
        return ((Boolean) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1792942755, objArr, 1792942763, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    public final boolean onExtraCallback(@Nullable downloadZip downloadzip) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, 1319548726, new Object[]{this, downloadzip}, -1319548724, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    public final boolean onNavigationEvent(@Nullable downloadZip downloadzip) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, 1045380358, new Object[]{this, downloadzip}, -1045380351, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    public final void onExtraCallback(@Nullable deserializeDecimalCollection deserializedecimalcollection) throws Throwable {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, -1946083434, new Object[]{this, deserializedecimalcollection}, 1946083434, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    static void ICustomTabsCallbackStubProxy() {
        extraCallbackWithResult = new char[]{64961, 64962, 64978, 64905, 64989, 64991, 64969, 64981, 64916, 64971, 64984, 65004, 64979, 64960, 64988, 64983, 64927, 64986, 64980, 64922, 64967, 64999, 64970, 64963, 64977, 64965, 64964, 64990, 64987, 64976, 64982, 64910, 64915, 64985, 65065, 64966};
        onMinimized = (char) 51247;
        onActivityLayout = new int[]{-1359011523, 2146747457, -278682558, -577969636, 1597016163, 1842740767, -747880557, 217974608, 1863406096, 1532113541, -957519974, 503295292, 915318499, -233715870, 861972189, 1125208147, 999311665, -1228919595};
    }
}
