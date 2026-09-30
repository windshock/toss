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
public final class Content extends downloadZip {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final String onExtraCallbackWithResult;
    private final Map<String, Object> onWarmupCompleted;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = Content.this.onExtraCallbackWithResult(false, this);
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static {
        int i = onExtraCallback + 41;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, content.onExtraCallbackWithResult))) {
            return Intrinsics.areEqual(this.onWarmupCompleted, content.onWarmupCompleted);
        }
        int i4 = IAuthTabCallbackStub + 57;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 105;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        int i4 = IAuthTabCallbackStub + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackLoading(name=" + this.onExtraCallbackWithResult + ", params=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackStub + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public Content(@NotNull String str, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = map;
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 61;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.onWarmupCompleted;
        int i5 = i2 + 119;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return map;
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
        int i3 = IAuthTabCallbackStub + 27;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = "loading";
            str2 = this.onExtraCallbackWithResult;
            l = null;
            str3 = null;
            th = null;
            i = 68;
        } else {
            str = "loading";
            str2 = this.onExtraCallbackWithResult;
            l = null;
            str3 = null;
            th = null;
            i = 28;
        }
        downloadZip.onExtraCallback(this, str, str2, l, str3, th, i, null);
    }

    public static final class onExtraCallback {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Content IAuthTabCallback(@NotNull String str, long j, long j2, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("duration", Long.valueOf(j));
            if (j2 != -1) {
                linkedHashMap.put("screen_schema_id", Long.valueOf(j2));
                int i2 = onWarmupCompleted + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            if (str2.length() > 0) {
                linkedHashMap.put("screen_log_name", str2);
            }
            if (str3 != null) {
                int i4 = onNavigationEvent + 123;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    linkedHashMap.put("loader_screen", str3);
                    throw null;
                }
                linkedHashMap.put("loader_screen", str3);
            }
            if (str4 != null) {
                linkedHashMap.put("loader_name", str4);
            }
            return new Content(str, linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        onNavigationEvent onnavigationevent2 = onnavigationevent;
        Object objIAuthTabCallback = onnavigationevent2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onnavigationevent2.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent3 = new DetectFaceInSingleImage.onNavigationEvent(null, this.onExtraCallbackWithResult, "loading", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            onnavigationevent2.Z$0 = z;
            onnavigationevent2.label = 1;
            objIAuthTabCallback = downloadZip.IAuthTabCallback(this, onnavigationevent3, mapOnNavigationEvent, false, null, z, onnavigationevent2, 8, null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i4 = IAuthTabCallbackStub;
                int i5 = i4 + 45;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 37;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        return new AppEventPayloadV1(this.onExtraCallbackWithResult, "loading", "common", (Map) objIAuthTabCallback, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, (String) null, 2097104, (DefaultConstructorMarker) null);
    }
}
