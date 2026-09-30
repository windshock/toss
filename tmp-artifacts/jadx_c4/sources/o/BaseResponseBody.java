package o;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.payload.AppEventPayloadV2;
import im.toss.core.tracker.payload.DomainLogPayload;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DetectFaceInSingleImage;
import o.downloadZip;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseResponseBody implements aq {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private final String IAuthTabCallback;
    private final String asBinder;
    private final Long asInterface;
    private final Map<String, Object> onExtraCallback;
    private final Long onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = BaseResponseBody.onExtraCallback(BaseResponseBody.this, false, this);
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static {
        onExtraCallback();
        Companion = new onWarmupCompleted(null);
        int i = IAuthTabCallbackStub + 109;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStubProxy + 89;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof BaseResponseBody)) {
            int i4 = getInterfaceDescriptor + 57;
            int i5 = i4 % 128;
            IAuthTabCallbackStubProxy = i5;
            boolean z = i4 % 2 == 0;
            int i6 = i5 + 101;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 72 / 0;
            }
            return z;
        }
        BaseResponseBody baseResponseBody = (BaseResponseBody) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, baseResponseBody.onWarmupCompleted)) {
            int i8 = getInterfaceDescriptor;
            int i9 = i8 + 75;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 15;
            IAuthTabCallbackStubProxy = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 10 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, baseResponseBody.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, baseResponseBody.onExtraCallbackWithResult)) {
            int i13 = IAuthTabCallbackStubProxy + 101;
            getInterfaceDescriptor = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, baseResponseBody.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, baseResponseBody.IAuthTabCallback)) {
            return true;
        }
        int i15 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        Long l;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.onWarmupCompleted.hashCode();
            iHashCode2 = this.onExtraCallback.hashCode();
            l = this.onExtraCallbackWithResult;
            iHashCode3 = 1;
            if (l != null) {
                i3 = 1;
                int iHashCode4 = l.hashCode();
                int i4 = IAuthTabCallbackStubProxy + 123;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                iHashCode3 = i3;
                i3 = iHashCode4;
            }
        } else {
            iHashCode = this.onWarmupCompleted.hashCode();
            iHashCode2 = this.onExtraCallback.hashCode();
            l = this.onExtraCallbackWithResult;
            if (l == null) {
                iHashCode3 = 0;
            } else {
                int iHashCode42 = l.hashCode();
                int i42 = IAuthTabCallbackStubProxy + 123;
                getInterfaceDescriptor = i42 % 128;
                int i52 = i42 % 2;
                iHashCode3 = i3;
                i3 = iHashCode42;
            }
        }
        Object obj = this.onNavigationEvent;
        if (obj != null) {
            iHashCode3 = obj.hashCode();
            int i6 = IAuthTabCallbackStubProxy + 45;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + i3) * 31) + iHashCode3) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DomainLog(domain=" + this.onWarmupCompleted + ", data=" + this.onExtraCallback + ", schemaId=" + this.onExtraCallbackWithResult + ", extra=" + this.onNavigationEvent + ", company=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public BaseResponseBody(@NotNull String str, @NotNull Map<String, ? extends Object> map, @Nullable Long l, @Nullable Object obj, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted = str;
        this.onExtraCallback = map;
        this.onExtraCallbackWithResult = l;
        this.onNavigationEvent = obj;
        this.IAuthTabCallback = str2;
        GetMaxDetectableCount getMaxDetectableCount = GetMaxDetectableCount.onWarmupCompleted;
        this.asBinder = getMaxDetectableCount.onExtraCallbackWithResult();
        this.onTransact = getMaxDetectableCount.onWarmupCompleted();
        this.asInterface = getMaxDetectableCount.onExtraCallback();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseResponseBody(String str, Map map, Long l, Object obj, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l2;
        Object obj2;
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallbackStubProxy + 109;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallbackStubProxy + 25;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 4;
            } else {
                int i7 = 2 % 2;
            }
            obj2 = null;
        } else {
            obj2 = obj;
        }
        this(str, map, l2, obj2, (i & 16) != 0 ? GetFeatureExtension.onWarmupCompleted.asBinder() : str2);
    }

    public static final /* synthetic */ Object onExtraCallback(BaseResponseBody baseResponseBody, boolean z, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = baseResponseBody.onWarmupCompleted(z, access13800Var);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return objOnWarmupCompleted;
    }

    private final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(this.onExtraCallback.get("_immediate"), Boolean.TRUE);
            obj.hashCode();
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.onExtraCallback.get("_immediate"), Boolean.TRUE);
        int i3 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return zAreEqual;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.aq
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult != null) {
            Object objOnWarmupCompleted = onWarmupCompleted(z, access13800Var);
            int i4 = IAuthTabCallbackStubProxy + 97;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.putAll(this.onExtraCallback);
        if (z && !Intrinsics.areEqual(this.onExtraCallback.get("_immediate"), access14000.onNavigationEvent(true))) {
            int i6 = getInterfaceDescriptor + 47;
            IAuthTabCallbackStubProxy = i6 % 128;
            mapOnExtraCallback.put("_immediate", i6 % 2 == 0 ? access14000.onNavigationEvent(false) : access14000.onNavigationEvent(true));
        }
        String strIAuthTabCallbackStub = GetFeatureExtension.onWarmupCompleted.IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub != null) {
            mapOnExtraCallback.put("automation_session_id", strIAuthTabCallbackStub);
        }
        return new DomainLogPayload(this.onWarmupCompleted, access8100.onExtraCallbackWithResult(mapOnExtraCallback), null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(boolean z, access13800<? super checkValidPitchOver> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        String strIntern;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            boolean z2 = access13800Var instanceof IAuthTabCallback;
            str.hashCode();
            throw null;
        }
        if (!(access13800Var instanceof IAuthTabCallback)) {
            iAuthTabCallback = new IAuthTabCallback(access13800Var);
            int i3 = IAuthTabCallbackStubProxy + 67;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i5 = iAuthTabCallback.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i5 - 2147483648;
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object objOnExtraCallbackWithResult = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallback2.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(this.onExtraCallbackWithResult, null, "log", 2, null);
            Map<String, Object> map = this.onExtraCallback;
            String str2 = this.IAuthTabCallback;
            String str3 = this.asBinder;
            String str4 = this.onTransact;
            Long l = this.asInterface;
            iAuthTabCallback2.Z$0 = z;
            iAuthTabCallback2.label = 1;
            objOnExtraCallbackWithResult = getUpdatedDate.onExtraCallbackWithResult(onnavigationevent, map, false, str2, z, str3, str4, l, null, iAuthTabCallback2);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                int i7 = IAuthTabCallbackStubProxy + 55;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        }
        Map map2 = (Map) objOnExtraCallbackWithResult;
        Object objRemove = map2.remove("log_version");
        if (objRemove instanceof String) {
            int i9 = getInterfaceDescriptor + 43;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            str = (String) objRemove;
        }
        if (str == null) {
            Object[] objArr = new Object[1];
            a(new int[]{-212755567, 1954510948}, 1 - View.resolveSizeAndState(0, 0, 0), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str;
        }
        Long l2 = this.onExtraCallbackWithResult;
        return new checkValidPitchOver(this.onWarmupCompleted, new AppEventPayloadV2(l2 != null ? l2.longValue() : 0L, map2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.IAuthTabCallback, (String) null, (String) null, (Long) null, strIntern, (String) null, (Referrer) null, (String) null, 244732, (DefaultConstructorMarker) null), this.onNavigationEvent);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        getInterfaceDescriptor = i2 % 128;
        boolean zOnExtraCallback = onExtraCallback(i2 % 2 != 0);
        int i3 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallback;
    }

    public boolean onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            boolean z2 = false;
            if (!getFeatureExtension.ICustomTabsCallbackStub()) {
                return false;
            }
            if (downloadZip.Companion.onExtraCallback(onExtraCallbackWithResult())) {
                int i3 = IAuthTabCallbackStubProxy + 7;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback();
            }
            if (z) {
                z2 = true;
            } else {
                int i5 = IAuthTabCallbackStubProxy + 109;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 != 0) {
                    boolean z3 = !onWarmupCompleted();
                } else if (onWarmupCompleted()) {
                }
                z2 = true;
            }
            ((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1622468404, new Object[]{getFeatureExtension, this, Boolean.valueOf(z2)}, -1622468400, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
            return true;
        }
        GetFeatureExtension.onWarmupCompleted.ICustomTabsCallbackStub();
        throw null;
    }

    private final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (this.onExtraCallbackWithResult != null) {
            return "TossDomainLogV2";
        }
        int i5 = i2 + 61;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return "TossDomainLog";
        }
        throw null;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        downloadZip.IAuthTabCallback iAuthTabCallback = downloadZip.Companion;
        Object obj = this.onExtraCallback.get("from_web");
        Boolean bool = Boolean.TRUE;
        iAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback.onExtraCallback(Intrinsics.areEqual(obj, bool), Intrinsics.areEqual(this.onExtraCallback.get("from_rn"), bool)), "domain", this.onWarmupCompleted, this.onExtraCallbackWithResult, null, null, this.onExtraCallback, onExtraCallbackWithResult());
        int i4 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallbackDefault;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                int i8 = $10 + 105;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 72 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 8848 - View.MeasureSpec.getSize(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    int i10 = $11 + 85;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallbackDefault;
        char c = '0';
        if (iArr6 != null) {
            int i12 = $10 + 19;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr6[i3]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 72 - TextUtils.getTrimmedLength(""), TextUtils.indexOf("", c) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i3++;
                c = '0';
                i6 = 0;
            }
            i2 = i6;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $11 + 7;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 22252), View.getDefaultSize(0, 0) + 39, TextUtils.lastIndexOf("", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 4033), 77 - TextUtils.lastIndexOf("", '0', 0), 7398 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        IAuthTabCallbackDefault = new int[]{-1007281827, 1904389283, -334766075, -1717017625, -485156758, 665354987, 228813451, -813058087, -738859191, 422486687, -1017937282, 114962119, -165192831, 1559949883, 226528770, 421251335, -687211104, 647746061};
    }
}
