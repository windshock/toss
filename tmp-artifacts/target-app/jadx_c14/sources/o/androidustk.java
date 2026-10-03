package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class androidustk extends toRealPath {
    private final dumpSampledTraceToFile onExtraCallback;
    private final onExtraCallbackWithResult onNavigationEvent;
    private final MutableLiveData<onExtraCallback> onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        void IAuthTabCallback(@NotNull String str);

        void onExtraCallbackWithResult(@NotNull String str);

        void onNavigationEvent(@NotNull String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public androidustk(@NotNull dumpSampledTraceToFile dumpsampledtracetofile, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        NativeVibrationSpec nativeVibrationSpecIAuthTabCallback;
        NativeVibrationSpec nativeVibrationSpecIAuthTabCallback2;
        String strOnExtraCallback;
        String strIAuthTabCallbackDefault;
        String strIAuthTabCallbackDefault2;
        super(toRealPath.onNavigationEvent.TOSS_MONEY_GUIDE);
        Intrinsics.checkNotNullParameter(dumpsampledtracetofile, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallback = dumpsampledtracetofile;
        this.onNavigationEvent = onextracallbackwithresult;
        NativeVibrationSpec nativeVibrationSpecOnNavigationEvent = dumpsampledtracetofile.onNavigationEvent();
        if (nativeVibrationSpecOnNavigationEvent != null && (strIAuthTabCallbackDefault2 = nativeVibrationSpecOnNavigationEvent.IAuthTabCallbackDefault()) != null) {
            onextracallbackwithresult.IAuthTabCallback(strIAuthTabCallbackDefault2);
        }
        NativeVibrationSpec nativeVibrationSpecOnNavigationEvent2 = dumpsampledtracetofile.onNavigationEvent();
        String str = (nativeVibrationSpecOnNavigationEvent2 == null || (strIAuthTabCallbackDefault = nativeVibrationSpecOnNavigationEvent2.IAuthTabCallbackDefault()) == null) ? "" : strIAuthTabCallbackDefault;
        NativeVibrationSpec nativeVibrationSpecOnNavigationEvent3 = dumpsampledtracetofile.onNavigationEvent();
        String str2 = (nativeVibrationSpecOnNavigationEvent3 == null || (strOnExtraCallback = nativeVibrationSpecOnNavigationEvent3.onExtraCallback()) == null) ? "" : strOnExtraCallback;
        HermesSamplingProfiler hermesSamplingProfilerOnExtraCallback = dumpsampledtracetofile.onExtraCallback();
        String strOnNavigationEvent = hermesSamplingProfilerOnExtraCallback != null ? hermesSamplingProfilerOnExtraCallback.onNavigationEvent() : null;
        HermesSamplingProfiler hermesSamplingProfilerOnExtraCallback2 = dumpsampledtracetofile.onExtraCallback();
        String strIAuthTabCallbackDefault3 = (hermesSamplingProfilerOnExtraCallback2 == null || (nativeVibrationSpecIAuthTabCallback2 = hermesSamplingProfilerOnExtraCallback2.IAuthTabCallback()) == null) ? null : nativeVibrationSpecIAuthTabCallback2.IAuthTabCallbackDefault();
        HermesSamplingProfiler hermesSamplingProfilerOnExtraCallback3 = dumpsampledtracetofile.onExtraCallback();
        this.onWarmupCompleted = new MutableLiveData<>(new onExtraCallback(str, str2, strOnNavigationEvent, strIAuthTabCallbackDefault3, (hermesSamplingProfilerOnExtraCallback3 == null || (nativeVibrationSpecIAuthTabCallback = hermesSamplingProfilerOnExtraCallback3.IAuthTabCallback()) == null) ? null : nativeVibrationSpecIAuthTabCallback.onExtraCallback()));
    }

    public static final class onExtraCallback {
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback);
        }

        public int hashCode() {
            int iHashCode = this.onWarmupCompleted.hashCode();
            int iHashCode2 = this.onExtraCallback.hashCode();
            String str = this.onExtraCallbackWithResult;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.onNavigationEvent;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.IAuthTabCallback;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Status(cta=" + this.onWarmupCompleted + ", ctaLink=" + this.onExtraCallback + ", description=" + this.onExtraCallbackWithResult + ", descriptionLinkTitle=" + this.onNavigationEvent + ", descriptionLink=" + this.IAuthTabCallback + ")";
        }

        public onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = str;
            this.onExtraCallback = str2;
            this.onExtraCallbackWithResult = str3;
            this.onNavigationEvent = str4;
            this.IAuthTabCallback = str5;
        }

        public final String onWarmupCompleted() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public final String onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final String onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final String IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public final boolean asInterface() {
            return this.onExtraCallbackWithResult != null;
        }

        public final boolean IAuthTabCallbackStub() {
            return (this.onNavigationEvent == null || this.IAuthTabCallback == null) ? false : true;
        }
    }

    public long onWarmupCompleted() {
        return this.onExtraCallback.hashCode();
    }

    public final LiveData<onExtraCallback> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final void onWarmupCompleted(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.onNavigationEvent.onExtraCallbackWithResult(str);
    }

    public final void onExtraCallback(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.onNavigationEvent.onNavigationEvent(str);
    }
}
