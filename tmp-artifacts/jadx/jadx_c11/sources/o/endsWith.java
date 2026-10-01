package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class endsWith {
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent;
    private final Object IAuthTabCallback;
    private final int onExtraCallback;
    private final getBacktraceNote<createSpannedString, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private final JsonUtils onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ endsWith onWarmupCompleted(endsWith endswith, Object obj, getBacktraceNote getbacktracenote, int i, JsonUtils jsonUtils, int i2, Object obj2) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = onNavigationEvent + 41;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            obj = endswith.IAuthTabCallback;
        }
        if ((i2 & 2) != 0) {
            int i6 = IAuthTabCallbackDefault + 1;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                getbacktracenote = endswith.onExtraCallbackWithResult;
                int i7 = 86 / 0;
            } else {
                getbacktracenote = endswith.onExtraCallbackWithResult;
            }
        }
        if ((i2 & 4) != 0) {
            i = endswith.onExtraCallback;
        }
        if ((i2 & 8) != 0) {
            jsonUtils = endswith.onWarmupCompleted;
        }
        return endswith.onExtraCallbackWithResult(obj, getbacktracenote, i, jsonUtils);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof endsWith)) {
            int i7 = i3 + 79;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        endsWith endswith = (endsWith) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, endswith.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, endswith.onExtraCallbackWithResult)) {
            int i9 = IAuthTabCallbackDefault + 91;
            onNavigationEvent = i9 % 128;
            return i9 % 2 != 0;
        }
        if (this.onExtraCallback == endswith.onExtraCallback) {
            return Intrinsics.areEqual(this.onWarmupCompleted, endswith.onWarmupCompleted);
        }
        int i10 = onNavigationEvent + 25;
        IAuthTabCallbackDefault = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Object obj = this.IAuthTabCallback;
        int iHashCode2 = 0;
        if (obj == null) {
            int i2 = onNavigationEvent + 13;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        getBacktraceNote<createSpannedString, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.onExtraCallbackWithResult;
        int iHashCode3 = getbacktracenote == null ? 0 : getbacktracenote.hashCode();
        int iHashCode4 = Integer.hashCode(this.onExtraCallback);
        JsonUtils jsonUtils = this.onWarmupCompleted;
        if (jsonUtils != null) {
            int i4 = IAuthTabCallbackDefault + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                jsonUtils.hashCode();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            iHashCode2 = jsonUtils.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final endsWith onExtraCallbackWithResult(@Nullable Object obj, @Nullable getBacktraceNote<? super createSpannedString, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, int i, @Nullable JsonUtils jsonUtils) {
        int i2 = 2 % 2;
        endsWith endswith = new endsWith(obj, getbacktracenote, i, jsonUtils);
        int i3 = IAuthTabCallbackDefault + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return endswith;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsAgreementV4TopAssetState(id=" + this.IAuthTabCallback + ", preset=" + this.onExtraCallbackWithResult + ", delay=" + this.onExtraCallback + ", slideMotion=" + this.onWarmupCompleted + ")";
        int i2 = onNavigationEvent + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public endsWith(@Nullable Object obj, @Nullable getBacktraceNote<? super createSpannedString, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, int i, @Nullable JsonUtils jsonUtils) {
        this.IAuthTabCallback = obj;
        this.onExtraCallbackWithResult = getbacktracenote;
        this.onExtraCallback = i;
        this.onWarmupCompleted = jsonUtils;
    }

    public final getBacktraceNote<createSpannedString, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<createSpannedString, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.onExtraCallbackWithResult;
        int i5 = i2 + 117;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onExtraCallback;
        if (i3 == 0) {
            int i5 = 69 / 0;
        }
        return i4;
    }

    public final JsonUtils onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 1;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        JsonUtils jsonUtils = this.onWarmupCompleted;
        int i5 = i2 + 53;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return jsonUtils;
    }
}
