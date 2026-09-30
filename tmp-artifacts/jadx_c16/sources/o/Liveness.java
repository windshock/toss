package o;

import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DetectFaceInSingleImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class Liveness extends downloadZip {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Map<String, Object> IAuthTabCallback;
    private final String onExtraCallbackWithResult;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = Liveness.this.onExtraCallbackWithResult(false, this);
            int i4 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 95;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Liveness() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Liveness(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Map map = null;
        this(str, map, 2, map);
    }

    public Liveness(@NotNull String str, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = map;
    }

    public /* synthetic */ Liveness(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = "";
            int i2 = asBinder + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            map = new LinkedHashMap();
            int i4 = onWarmupCompleted + 51;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this(str, map);
    }

    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.IAuthTabCallback;
        int i5 = i3 + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Liveness onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, long j, long j2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6, @Nullable Long l7, @Nullable Long l8, @Nullable Long l9, @Nullable Long l10, boolean z, boolean z2) {
            long j3;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("start_time", str);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("end_time", str2);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("upload_traffic_bytes", Long.valueOf(j));
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("download_traffic_bytes", Long.valueOf(j2));
            long j4 = -1;
            if (j >= 0) {
                j3 = j / 1048576;
                int i4 = IAuthTabCallback + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                j3 = -1;
            }
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("upload_traffic_mb", Long.valueOf(j3));
            if (j2 >= 0) {
                int i6 = onWarmupCompleted + 53;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                j4 = j2 / 1048576;
            }
            return new Liveness("metric_network", access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback("download_traffic_mb", Long.valueOf(j4)), getWrite.IAuthTabCallback("netstats_start_time", str3), getWrite.IAuthTabCallback("netstats_end_time", str4), getWrite.IAuthTabCallback("netstats_wifi_upload_mb", l), getWrite.IAuthTabCallback("netstats_wifi_download_mb", l2), getWrite.IAuthTabCallback("netstats_mobile_upload_mb", l3), getWrite.IAuthTabCallback("netstats_mobile_download_mb", l4), getWrite.IAuthTabCallback("netstats_webview_wifi_upload_mb", l5), getWrite.IAuthTabCallback("netstats_webview_wifi_download_mb", l6), getWrite.IAuthTabCallback("netstats_webview_mobile_upload_mb", l7), getWrite.IAuthTabCallback("netstats_webview_mobile_download_mb", l8), getWrite.IAuthTabCallback("netstats_upload_mb", l9), getWrite.IAuthTabCallback("netstats_download_mb", l10), getWrite.IAuthTabCallback("webview_tag_supported", Boolean.valueOf(z)), getWrite.IAuthTabCallback("reboot_detected", Boolean.valueOf(z2))}));
        }

        public final Liveness onExtraCallback(@NotNull String str, @NotNull String str2, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Liveness liveness = new Liveness("metric_disk", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("start_time", str), getWrite.IAuthTabCallback("end_time", str2), getWrite.IAuthTabCallback("usage_size_bytes", Long.valueOf(j))}));
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return liveness;
        }
    }

    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        downloadZip.onExtraCallback(this, "metric", this.onExtraCallbackWithResult, (Long) null, (String) null, (Throwable) null, 28, (Object) null);
        int i4 = onWarmupCompleted + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super deInitialize> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
            if (access13800Var instanceof onWarmupCompleted) {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i4 = onwarmupcompleted.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i4 - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(access13800Var);
                }
            }
        } else if (!(!(access13800Var instanceof onWarmupCompleted))) {
        }
        onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        Object objIAuthTabCallback = onwarmupcompleted2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted2.label;
        if (i5 != 0) {
            int i6 = asBinder;
            int i7 = i6 + 27;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = i6 + 15;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                int i10 = 43 / 0;
            } else {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
            }
        } else {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent((Long) null, this.onExtraCallbackWithResult, "metric", 1, (DefaultConstructorMarker) null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            onwarmupcompleted2.Z$0 = z;
            onwarmupcompleted2.label = 1;
            objIAuthTabCallback = downloadZip.IAuthTabCallback(this, onnavigationevent, mapOnNavigationEvent, false, (String) null, z, onwarmupcompleted2, 8, (Object) null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return new AppEventPayloadV1(this.onExtraCallbackWithResult, "metric", "common", (Map) objIAuthTabCallback, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, (String) null, 2097104, (DefaultConstructorMarker) null);
    }
}
