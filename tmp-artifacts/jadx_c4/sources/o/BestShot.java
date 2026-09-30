package o;

import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DetectFaceInSingleImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BestShot extends downloadZip {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BestShot.this.onExtraCallbackWithResult(false, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BestShot() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BestShot(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Map map = null;
        this(str, map, 2, map);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 41;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
            return z;
        }
        if (!(obj instanceof BestShot)) {
            int i6 = onNavigationEvent + 49;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 43;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        BestShot bestShot = (BestShot) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, bestShot.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, bestShot.onExtraCallbackWithResult)) {
            return true;
        }
        int i11 = onNavigationEvent + 3;
        onExtraCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onNavigationEvent + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackAppsflyer(logName=" + this.onWarmupCompleted + ", params=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public BestShot(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BestShot(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 115;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                access8100.onNavigationEvent();
                throw null;
            }
            map = access8100.onNavigationEvent();
        }
        this(str, map);
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.onExtraCallbackWithResult;
        int i5 = i2 + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        downloadZip.onExtraCallback(this, "appsflyer", this.onWarmupCompleted, null, null, null, i2 % 2 == 0 ? 68 : 28, null);
        int i3 = onExtraCallback + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
                int i5 = onNavigationEvent + 123;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object objIAuthTabCallback = iAuthTabCallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallback2.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.onWarmupCompleted, "appsflyer", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            iAuthTabCallback2.Z$0 = z;
            iAuthTabCallback2.label = 1;
            objIAuthTabCallback = downloadZip.IAuthTabCallback(this, onnavigationevent, mapOnNavigationEvent, false, null, z, iAuthTabCallback2, 8, null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            int i8 = onExtraCallback + 79;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        AppEventPayloadV1 appEventPayloadV1 = new AppEventPayloadV1(this.onWarmupCompleted, "appsflyer_s2s", "common", (Map) objIAuthTabCallback, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, (String) null, 2097104, (DefaultConstructorMarker) null);
        int i10 = onNavigationEvent + 17;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return appEventPayloadV1;
    }
}
