package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.facepay.log.model.ExternalLogItem;
import im.toss.facepay.log.model.LogAction;
import im.toss.facepay.log.model.LogData;
import im.toss.facepay.log.model.LogFeature;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class manualParseJson {
    public static final onExtraCallback Companion;
    private static boolean IAuthTabCallbackStub;
    private static int asBinder;
    private static final JsonObject onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static boolean onWarmupCompleted;
    private final String IAuthTabCallback;
    private static final byte[] $$a = {73, 121, -48, -56};
    private static final int $$b = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asInterface = 1;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        long J$0;
        long J$1;
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

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = manualParseJson.onExtraCallback(manualParseJson.this, null, null, null, null, null, null, 0L, 0L, null, null, null, this);
            int i4 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = 3 - (i * 2);
        int i6 = 105 - (i2 * 3);
        byte[] bArr = $$a;
        int i7 = i3 * 3;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 += i8;
            i5++;
            bArr2[i4] = (byte) i6;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i4++;
            i8 = bArr[i5];
            i6 += i8;
            i5++;
            bArr2[i4] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            i5++;
            bArr2[i4] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    public static final JsonObject onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        JsonObject jsonObjectOnWarmupCompleted = Companion.onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return jsonObjectOnWarmupCompleted;
    }

    public manualParseJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
    }

    public static final /* synthetic */ Object onExtraCallback(manualParseJson manualparsejson, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, LogData logData, JsonObject jsonObject, getPages getpages, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = manualparsejson.IAuthTabCallback(str, str2, str3, str4, str5, str6, j, j2, logData, jsonObject, getpages, access13800Var);
        int i4 = IAuthTabCallbackDefault + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return objIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ JsonObject onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        JsonObject jsonObject = onExtraCallback;
        int i5 = i3 + 41;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return jsonObject;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 55;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.IAuthTabCallback;
            int i4 = 72 / 0;
        } else {
            str = this.IAuthTabCallback;
        }
        int i5 = i2 + 123;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    protected final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {AppConfigModel.onNavigationEvent};
        long jProvide = ((getPermission) AppConfigModel.IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -324282146, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 324282149)).provide();
        int i4 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return jProvide;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull LogData logData) {
        String strIAuthTabCallback;
        String value;
        String value2;
        String strIAuthTabCallbackDefault;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(logData, "");
        AppConfigModel appConfigModel = AppConfigModel.onNavigationEvent;
        getAppLaunchParams interfaceDescriptor = appConfigModel.getInterfaceDescriptor();
        long jIAuthTabCallback = IAuthTabCallback();
        long andIncrement = appConfigModel.asBinder().getAndIncrement();
        if (interfaceDescriptor == null || (strIAuthTabCallback = interfaceDescriptor.IAuthTabCallback()) == null) {
            strIAuthTabCallback = "";
        }
        if (interfaceDescriptor != null) {
            int i2 = IAuthTabCallbackDefault + 47;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            LogFeature logFeatureOnExtraCallback = interfaceDescriptor.onExtraCallback();
            if (logFeatureOnExtraCallback == null || (value = logFeatureOnExtraCallback.getValue()) == null) {
                value = "";
            }
        }
        if (interfaceDescriptor != null) {
            int i4 = IAuthTabCallbackDefault + 9;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            LogAction logActionOnExtraCallbackWithResult = interfaceDescriptor.onExtraCallbackWithResult();
            if (logActionOnExtraCallbackWithResult != null) {
                int i6 = IAuthTabCallback_Parcel + 49;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                value2 = logActionOnExtraCallbackWithResult.getValue();
                if (value2 == null) {
                    value2 = "";
                }
            }
        }
        if (interfaceDescriptor != null) {
            int i8 = IAuthTabCallbackDefault + 81;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            strIAuthTabCallbackDefault = interfaceDescriptor.IAuthTabCallbackDefault();
            if (strIAuthTabCallbackDefault == null) {
                int i10 = IAuthTabCallback_Parcel + 83;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                strIAuthTabCallbackDefault = "";
            }
        }
        maybeUpdateAnimatable.onNavigationEvent(appConfigModel.IAuthTabCallbackDefault(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(strIAuthTabCallback, value, value2, strIAuthTabCallbackDefault, interfaceDescriptor != null ? interfaceDescriptor.onWarmupCompleted() : null, interfaceDescriptor != null ? interfaceDescriptor.onNavigationEvent() : null, jIAuthTabCallback, andIncrement, logData, appConfigModel.onWarmupCompleted().onExtraCallback(), null), 3, (Object) null);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onWarmupCompleted;
        final /* synthetic */ String $action;
        final /* synthetic */ JsonObject $callerMetadata;
        final /* synthetic */ long $currentTimeMillis;
        final /* synthetic */ String $feature;
        final /* synthetic */ LogData $logData;
        final /* synthetic */ long $newSequence;
        final /* synthetic */ String $offPayPartnerCode;
        final /* synthetic */ String $service;
        final /* synthetic */ String $subTransactionId;
        final /* synthetic */ String $transactionId;
        int label;
        private static final byte[] $$a = {5, -4, -80, 1};
        private static final int $$b = 217;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback = -161518010;
        private static int onNavigationEvent = -1538795447;
        private static int onExtraCallbackWithResult = -1825770015;
        private static byte[] IAuthTabCallback = {-26, 98, 112, 96, 122, 113, 120, 126, 119, -66, 35, 111, 118, 109, -62, 100, 61, 101, 103, 100, 115, 112, -67, 114, 38, 110, 126, 116, 124, 126, -67, 100, 61, 99, 99, 125, -119, 110, -74, 114, 44, 102, -49, 47, 123, 118, 121};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, short s, byte b2) {
            int i;
            int i2;
            int i3 = 3 - (b * 4);
            int i4 = (s * 2) + 1;
            int i5 = 115 - (b2 * 3);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i6 = i4;
                i2 = 0;
                i5 += -i6;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i5;
                i3++;
                if (i2 == i4) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i3];
                i5 += -i6;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i5;
                i3++;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i5;
                i3++;
                if (i2 == i4) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, LogData logData, JsonObject jsonObject, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$service = str;
            this.$feature = str2;
            this.$action = str3;
            this.$transactionId = str4;
            this.$subTransactionId = str5;
            this.$offPayPartnerCode = str6;
            this.$currentTimeMillis = j;
            this.$newSequence = j2;
            this.$logData = logData;
            this.$callerMetadata = jsonObject;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 31;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallbackDefault + 107;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = manualParseJson.this.new onExtraCallbackWithResult(this.$service, this.$feature, this.$action, this.$transactionId, this.$subTransactionId, this.$offPayPartnerCode, this.$currentTimeMillis, this.$newSequence, this.$logData, this.$callerMetadata, access13800Var);
            int i2 = asBinder + 105;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 89;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = asBinder + 121;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                manualParseJson manualparsejson = manualParseJson.this;
                String str = this.$service;
                String str2 = this.$feature;
                String str3 = this.$action;
                String str4 = this.$transactionId;
                String str5 = this.$subTransactionId;
                String str6 = this.$offPayPartnerCode;
                long j = this.$currentTimeMillis;
                long j2 = this.$newSequence;
                LogData logData = this.$logData;
                JsonObject jsonObject = this.$callerMetadata;
                getPages getpages = (getPages) AppConfigModel.IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{AppConfigModel.onNavigationEvent}, 1463811278, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1463811278);
                this.label = 1;
                objOnExtraCallback = manualParseJson.onExtraCallback(manualparsejson, str, str2, str3, str4, str5, str6, j, j2, logData, jsonObject, getpages, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((short) ((-115) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) Color.blue(0), (-1377351246) - View.MeasureSpec.makeMeasureSpec(0, 0), (-929770886) - TextUtils.getCapsMode("", 0, 0), (-66) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i3 = IAuthTabCallbackDefault + 83;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            ExternalLogItem externalLogItemOnNavigationEvent = (ExternalLogItem) objOnExtraCallback;
            Iterator<T> it = AppConfigModel.onNavigationEvent.onNavigationEvent().iterator();
            while (!(!it.hasNext())) {
                int i4 = IAuthTabCallbackDefault + 121;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    externalLogItemOnNavigationEvent = ((parseFromJSON) it.next()).onNavigationEvent(externalLogItemOnNavigationEvent);
                    int i5 = 83 / 0;
                } else {
                    externalLogItemOnNavigationEvent = ((parseFromJSON) it.next()).onNavigationEvent(externalLogItemOnNavigationEvent);
                }
            }
            AppConfigModel.onNavigationEvent.IAuthTabCallbackStub().onWarmupCompleted(externalLogItemOnNavigationEvent);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0242 A[Catch: all -> 0x0316, TryCatch #0 {all -> 0x0316, blocks: (B:3:0x000f, B:6:0x002c, B:7:0x005a, B:21:0x0095, B:23:0x00a3, B:24:0x00de, B:28:0x00fa, B:30:0x0108, B:31:0x0143, B:56:0x0225, B:58:0x0242, B:59:0x027a), top: B:83:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            Object objOnExtraCallback;
            byte[] bArr;
            boolean z2;
            int i5 = 2;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16733792) - Color.rgb(0, 0, 0)), 42 - TextUtils.indexOf("", ""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $11 + 55;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                char c = 3;
                if (!(!z)) {
                    byte[] bArr2 = IAuthTabCallback;
                    if (bArr2 != null) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = $11 + 25;
                            $10 = i10 % 128;
                            if (i10 % i5 != 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b2 = (byte) ($$a[c] - 1);
                                    byte b3 = b2;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 12843), 55 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2167 - (ViewConfiguration.getWindowTouchSlop() >> 8), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr3[i9] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr3)).byteValue();
                                i9 >>= 1;
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i9])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback4 == null) {
                                    char maxKeyCode = (char) (12843 - (KeyEvent.getMaxKeyCode() >> 16));
                                    int gidForName = 54 - Process.getGidForName("");
                                    int i11 = 2167 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    byte b4 = (byte) ($$a[3] - 1);
                                    byte b5 = b4;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode, gidForName, i11, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr3[i9] = ((Byte) ((Method) objOnExtraCallback4).invoke(null, objArr4)).byteValue();
                                i9++;
                            }
                            i5 = 2;
                            c = 3;
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = IAuthTabCallback;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43425), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, (KeyEvent.getMaxKeyCode() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i12 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                    if (z) {
                        int i13 = $11 + 27;
                        $10 = i13 % 128;
                        if (i13 % 2 == 0) {
                            i4 = 1;
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                        Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 86 - KeyEvent.keyCodeFromString(""), 9567 - View.MeasureSpec.makeMeasureSpec(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        bArr = IAuthTabCallback;
                        if (bArr != null) {
                            int length2 = bArr.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i14 = 0; i14 < length2; i14++) {
                                bArr5[i14] = (byte) (bArr[i14] ^ (-4629411779493505016L));
                            }
                            bArr = bArr5;
                        }
                        if (bArr == null) {
                            int i15 = $10 + 101;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            if (z2) {
                                byte[] bArr6 = IAuthTabCallback;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = onWarmupCompleted;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    } else {
                        int i17 = $10 + 95;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    i4 = 0;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                    Object[] objArr62 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback == null) {
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback).invoke(null, objArr62)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    bArr = IAuthTabCallback;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, LogData logData, JsonObject jsonObject, getPages getpages, access13800<? super ExternalLogItem> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        manualParseJson manualparsejson;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        LogData logData2;
        JsonObject jsonObject2;
        long j3;
        long j4;
        String value;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 53;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = access13800Var instanceof onWarmupCompleted;
            throw null;
        }
        if (access13800Var instanceof onWarmupCompleted) {
            int i4 = i2 + 107;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = ((onWarmupCompleted) access13800Var).label;
                throw null;
            }
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i6 = onwarmupcompleted.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i6 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onwarmupcompleted.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(obj);
            onwarmupcompleted.L$0 = this;
            onwarmupcompleted.L$1 = str;
            onwarmupcompleted.L$2 = str2;
            onwarmupcompleted.L$3 = str3;
            onwarmupcompleted.L$4 = str4;
            onwarmupcompleted.L$5 = str5;
            onwarmupcompleted.L$6 = str6;
            onwarmupcompleted.L$7 = logData;
            onwarmupcompleted.L$8 = jsonObject;
            onwarmupcompleted.J$0 = j;
            onwarmupcompleted.J$1 = j2;
            onwarmupcompleted.label = 1;
            Object objOnWarmupCompleted2 = getpages.onWarmupCompleted(onwarmupcompleted);
            if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            int i8 = IAuthTabCallback_Parcel + 9;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            manualparsejson = this;
            str7 = str;
            str8 = str2;
            str9 = str3;
            str10 = str4;
            str11 = str5;
            str12 = str6;
            logData2 = logData;
            jsonObject2 = jsonObject;
            j3 = j;
            j4 = j2;
            obj = objOnWarmupCompleted2;
        } else {
            if (i7 != 1) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, 126 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            long j5 = onwarmupcompleted.J$1;
            long j6 = onwarmupcompleted.J$0;
            jsonObject2 = (JsonObject) onwarmupcompleted.L$8;
            logData2 = (LogData) onwarmupcompleted.L$7;
            String str13 = (String) onwarmupcompleted.L$6;
            String str14 = (String) onwarmupcompleted.L$5;
            String str15 = (String) onwarmupcompleted.L$4;
            String str16 = (String) onwarmupcompleted.L$3;
            String str17 = (String) onwarmupcompleted.L$2;
            String str18 = (String) onwarmupcompleted.L$1;
            manualParseJson manualparsejson2 = (manualParseJson) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            int i10 = IAuthTabCallbackDefault + 25;
            IAuthTabCallback_Parcel = i10 % 128;
            int i11 = i10 % 2;
            str7 = str18;
            manualparsejson = manualparsejson2;
            str9 = str16;
            str11 = str14;
            str8 = str17;
            str10 = str15;
            j4 = j5;
            j3 = j6;
            str12 = str13;
        }
        getUseDynamicPlugins getusedynamicplugins = (getUseDynamicPlugins) obj;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-118, -118, -119, -112, -123, -108, -107, -113, -120, -115}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr2);
        dynamicTrack.onNavigationEvent(pangleEncryptManager, ((String) objArr2[0]).intern(), access14000.onExtraCallbackWithResult(getusedynamicplugins.onWarmupCompleted()));
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-118, -113, -125, -125, -113, -116, -105, -119, -116, -113, -123, -106, -117}, 127 - TextUtils.getCapsMode("", 0, 0), objArr3);
        dynamicTrack.onNavigationEvent(pangleEncryptManager, ((String) objArr3[0]).intern(), access14000.onExtraCallback(getusedynamicplugins.IAuthTabCallback_Parcel()));
        Object[] objArr4 = new Object[1];
        b(TextUtils.getCapsMode("", 0, 0) + 1, 9 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{65525, 65531, 7, 2, 2, 7, 65528, '\b', 65535}, 150 - View.resolveSize(0, 0), true, objArr4);
        dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, ((String) objArr4[0]).intern(), access14000.onNavigationEvent(getusedynamicplugins.IAuthTabCallbackStubProxy()));
        JsonObject jsonObject3 = new JsonObject(access8100.onWarmupCompleted(getusedynamicplugins.onNavigationEvent(), pangleEncryptManager.onExtraCallbackWithResult()));
        JsonObject jsonObject4 = !jsonObject2.isEmpty() ? new JsonObject(access8100.onWarmupCompleted(jsonObject2, logData2.onNavigationEvent())) : logData2.onNavigationEvent();
        String str19 = (String) getUseDynamicPlugins.onNavigationEvent(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{getusedynamicplugins}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1980299177, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1980299177);
        long jAsInterface = getusedynamicplugins.asInterface();
        String str20 = manualparsejson.IAuthTabCallback;
        String value2 = logData2.onTransact().getValue();
        LogData.SuccessYn successYnIAuthTabCallbackDefault = logData2.IAuthTabCallbackDefault();
        if (successYnIAuthTabCallbackDefault != null) {
            int i12 = IAuthTabCallback_Parcel + 59;
            IAuthTabCallbackDefault = i12 % 128;
            int i13 = i12 % 2;
            value = successYnIAuthTabCallbackDefault.getValue();
        } else {
            value = null;
        }
        String strOnWarmupCompleted = logData2.onWarmupCompleted();
        String strAsInterface = logData2.asInterface();
        JsonObject jsonObjectIAuthTabCallback = logData2.IAuthTabCallback();
        JsonObject jsonObjectOnExtraCallback = logData2.onExtraCallback();
        String strOnTransact = getusedynamicplugins.onTransact();
        String strIAuthTabCallbackDefault = getusedynamicplugins.IAuthTabCallbackDefault();
        String str21 = (String) getUseDynamicPlugins.onNavigationEvent(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{getusedynamicplugins}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 835988058, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -835988057);
        String strOnExtraCallback = getusedynamicplugins.onExtraCallback();
        String strOnExtraCallbackWithResult = getusedynamicplugins.onExtraCallbackWithResult();
        String strAsBinder = getusedynamicplugins.asBinder();
        Object[] objArr5 = new Object[1];
        b(1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.normalizeMetaState(0) + 6, new char[]{65529, '\n', 4, 65531, 65535, 2}, TextUtils.getOffsetAfter("", 0) + 147, true, objArr5);
        return new ExternalLogItem(str19, jAsInterface, j3, j4, str10, str11, str7, str12, str8, str9, str20, value2, value, strOnWarmupCompleted, strAsInterface, jsonObject4, jsonObjectIAuthTabCallback, jsonObjectOnExtraCallback, strOnTransact, ((String) objArr5[0]).intern(), strIAuthTabCallbackDefault, str21, strOnExtraCallback, strOnExtraCallbackWithResult, jsonObject3, strAsBinder);
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.MeasureSpec.makeMeasureSpec(0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, 10277 - TextUtils.indexOf((CharSequence) "", '0', 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (KeyEvent.getMaxKeyCode() >> 16)), 55 - (KeyEvent.getMaxKeyCode() >> 16), 2168 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i7 = $11 + 69;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i9 = $11 + 71;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 12843), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 54, Drawable.resolveOpacity(0, 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i11 = $10 + 89;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    public final void onWarmupCompleted(@NotNull PangleEncryptManager pangleEncryptManager, @NotNull String str, @Nullable Number number) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (number != null) {
            dynamicTrack.onNavigationEvent(pangleEncryptManager, str, number);
            int i2 = IAuthTabCallback_Parcel + 93;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallbackDefault + 55;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(@NotNull PangleEncryptManager pangleEncryptManager, @NotNull String str, @NotNull Function1<? super PangleEncryptManager, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        PangleEncryptManager pangleEncryptManager2 = new PangleEncryptManager();
        function1.invoke(pangleEncryptManager2);
        JsonObject jsonObjectOnExtraCallbackWithResult = pangleEncryptManager2.onExtraCallbackWithResult();
        if (!jsonObjectOnExtraCallbackWithResult.isEmpty()) {
            int i2 = IAuthTabCallback_Parcel + 11;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            pangleEncryptManager.onExtraCallbackWithResult(str, jsonObjectOnExtraCallbackWithResult);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        protected final JsonObject onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            JsonObject jsonObjectOnExtraCallbackWithResult = manualParseJson.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return jsonObjectOnExtraCallbackWithResult;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 77 - Drawable.resolveOpacity(0, 0), 20952 - (ViewConfiguration.getTouchSlop() >> 8), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        float f = 0.0f;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 74, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16036, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallbackStub) {
            int i5 = $10 + 19;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
            }
            char[] cArr4 = new char[i2];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 63 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                f = 0.0f;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr5);
            int i6 = $11 + 75;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                obj.hashCode();
                throw null;
            }
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i7 = $10 + 57;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 63, (ViewConfiguration.getEdgeSlop() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static {
        asBinder = 0;
        onWarmupCompleted();
        Companion = new onExtraCallback(null);
        onExtraCallback = new PangleEncryptManager().onExtraCallbackWithResult();
        int i = asInterface + 105;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{32576, 32578, 32639, 32515, 32631, 32636, 32516, 32625, 32582, 32624, 32630, 32638, 32577, 32581, 32634, 32637, 32629, 32632, 32628, 32635, 32580, 32627, 32588};
        onExtraCallbackWithResult = -1184333853;
        onWarmupCompleted = true;
        IAuthTabCallbackStub = true;
        onTransact = 478308864;
    }
}
