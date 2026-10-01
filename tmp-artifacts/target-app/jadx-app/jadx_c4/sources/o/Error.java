package o;

import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DetectFaceInSingleImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Error extends downloadZip {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final long IAuthTabCallback;
    private final String onExtraCallback;
    private final Map<String, Object> onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = Error.this.onExtraCallbackWithResult(false, this);
            int i4 = onNavigationEvent + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static {
        int i = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public Error() {
        this(null, 0L, null, 7, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Error(@NotNull String str) {
        this(str, 0L, null, 6, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Error(@NotNull String str, long j) {
        this(str, j, null, 4, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            int i2 = asInterface + 67;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Error error = (Error) obj;
        if (Intrinsics.areEqual(this.onExtraCallback, error.onExtraCallback)) {
            if (this.IAuthTabCallback == error.IAuthTabCallback) {
                return Intrinsics.areEqual(this.onNavigationEvent, error.onNavigationEvent);
            }
            int i4 = asInterface + 121;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = asBinder + 29;
        int i7 = i6 % 128;
        asInterface = i7;
        boolean z = i6 % 2 != 0;
        int i8 = i7 + 63;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onExtraCallback.hashCode() * 31) + Long.hashCode(this.IAuthTabCallback)) * 31) + this.onNavigationEvent.hashCode();
        int i4 = asBinder + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackTiming(name=" + this.onExtraCallback + ", total=" + this.IAuthTabCallback + ", params=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Error(@NotNull String str, long j, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = str;
        this.IAuthTabCallback = j;
        this.onNavigationEvent = map;
    }

    public /* synthetic */ Error(String str, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = asBinder + 91;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = asBinder + 119;
            int i4 = i3 % 128;
            asInterface = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 25;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 4;
            } else {
                int i8 = 2 % 2;
            }
            j = 0;
        }
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
            int i9 = asBinder + 53;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        }
        this(str, j, map);
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.onNavigationEvent;
        int i5 = i2 + 19;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return map;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Error onNavigationEvent(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, boolean z, boolean z2, @NotNull Map<String, Object> map, @Nullable String str4, @Nullable Boolean bool, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str5, @Nullable Map<String, ? extends Object> map2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(map, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("category", str2);
            linkedHashMap.put("items", map.toString());
            linkedHashMap.put("screen", str3);
            linkedHashMap.put("total", Long.valueOf(j));
            linkedHashMap.put("cold_start", Boolean.valueOf(z));
            linkedHashMap.put("use_app_lock", Boolean.valueOf(z2));
            if (str4 != null) {
                linkedHashMap.put("trace_id", str4);
            }
            if (bool != null) {
                linkedHashMap.put("battery_mode", bool.booleanValue() ? "low" : "normal");
            }
            if (l != null) {
                int i2 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                linkedHashMap.put("available_memory_mb", l);
            }
            if (l2 != null) {
                linkedHashMap.put("disk_space_gb", l2);
                int i4 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            if (l3 != null) {
                int i6 = onExtraCallbackWithResult + 67;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    linkedHashMap.put("system_uptime_hours", l3);
                    int i7 = 93 / 0;
                } else {
                    linkedHashMap.put("system_uptime_hours", l3);
                }
                int i8 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
            if (str5 != null) {
                int i10 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                linkedHashMap.put("thermal_state", str5);
            }
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            return new Error(str, j, linkedHashMap);
        }
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        String str;
        String str2;
        Long l;
        String str3;
        Throwable th;
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 17;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            str = "timing";
            str2 = this.onExtraCallback;
            l = null;
            str3 = null;
            th = null;
            i = 24;
        } else {
            str = "timing";
            str2 = this.onExtraCallback;
            l = null;
            str3 = null;
            th = null;
            i = 28;
        }
        downloadZip.onExtraCallback(this, str, str2, l, str3, th, i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        String string;
        int i = 2 % 2;
        int i2 = asInterface + 75;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i5 = i3 + 5;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = ((IAuthTabCallback) access13800Var).label;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IAuthTabCallback iAuthTabCallback2 = (IAuthTabCallback) access13800Var;
            int i7 = iAuthTabCallback2.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback2.label = i7 - 2147483648;
                int i8 = asBinder + 43;
                asInterface = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 3;
                }
                iAuthTabCallback = iAuthTabCallback2;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objIAuthTabCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i10 = iAuthTabCallback.label;
        if (i10 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.onExtraCallback, "timing", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            iAuthTabCallback.Z$0 = z;
            iAuthTabCallback.label = 1;
            objIAuthTabCallback = downloadZip.IAuthTabCallback(this, onnavigationevent, mapOnNavigationEvent, true, null, z, iAuthTabCallback, 8, null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i11 = asBinder + 97;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = asBinder + 55;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            int i15 = asInterface + 37;
            asBinder = i15 % 128;
            int i16 = i15 % 2;
        }
        Map map = (Map) objIAuthTabCallback;
        Object obj2 = map.get("category");
        if (obj2 == null || (string = obj2.toString()) == null) {
            string = "common";
        }
        return new AppEventPayloadV1(this.onExtraCallback, "timing", string, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, String.valueOf(this.IAuthTabCallback), 1048528, (DefaultConstructorMarker) null);
    }
}
