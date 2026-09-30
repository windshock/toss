package o;

import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.model.NativeExtension;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface getPageWidth {
    public static final onExtraCallback Companion = onExtraCallback.onWarmupCompleted;

    String IAuthTabCallback();

    String onExtraCallback(@Nullable NativeAdsEventLogType nativeAdsEventLogType, @Nullable String str);

    String onExtraCallbackWithResult();

    String onWarmupCompleted();

    static /* synthetic */ String onWarmupCompleted(getPageWidth getpagewidth, NativeAdsEventLogType nativeAdsEventLogType, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: key");
        }
        if ((i & 1) != 0) {
            nativeAdsEventLogType = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return getpagewidth.onExtraCallback(nativeAdsEventLogType, str);
    }

    public static final class onWarmupCompleted implements getPageWidth {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final String IAuthTabCallback;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 117;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 113;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return true;
            }
            int i6 = onExtraCallback + 3;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.IAuthTabCallback.hashCode() >> 3) << this.onNavigationEvent.hashCode() : (this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
            int i3 = onWarmupCompleted + 23;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "V1(requestId=" + this.IAuthTabCallback + ", creativeId=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return str;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.IAuthTabCallback = str;
            this.onNavigationEvent = str2;
        }

        @Override // o.getPageWidth
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.getPageWidth
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.getPageWidth
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }

        @Override // o.getPageWidth
        public String onExtraCallback(@Nullable NativeAdsEventLogType nativeAdsEventLogType, @Nullable String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = recomputeScrollPosition.onWarmupCompleted(onWarmupCompleted(), onExtraCallbackWithResult(), nativeAdsEventLogType != null ? nativeAdsEventLogType.toString() : null, str);
            int i4 = onWarmupCompleted + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        }
    }

    public static final class onNavigationEvent implements getPageWidth {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 11;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                int i4 = onNavigationEvent + 121;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                int i6 = IAuthTabCallback + 33;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback))) {
                return true;
            }
            int i8 = IAuthTabCallback + 1;
            int i9 = i8 % 128;
            onNavigationEvent = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 13;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode();
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "V2(requestId=" + this.onExtraCallbackWithResult + ", slotId=" + this.onWarmupCompleted + ", creativeId=" + this.onExtraCallback + ")";
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 93 / 0;
            }
            return str;
        }

        public onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = str2;
            this.onExtraCallback = str3;
        }

        @Override // o.getPageWidth
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // o.getPageWidth
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return str;
        }

        @Override // o.getPageWidth
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 105;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.getPageWidth
        public String onExtraCallback(@Nullable NativeAdsEventLogType nativeAdsEventLogType, @Nullable String str) {
            String string;
            int i = 2 % 2;
            String strOnWarmupCompleted = onWarmupCompleted();
            String strIAuthTabCallback = IAuthTabCallback();
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (nativeAdsEventLogType != null) {
                int i2 = onNavigationEvent + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                string = nativeAdsEventLogType.toString();
                int i4 = IAuthTabCallback + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                string = null;
            }
            return recomputeScrollPosition.onExtraCallbackWithResult(strOnWarmupCompleted, strIAuthTabCallback, strOnExtraCallbackWithResult, string, str);
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        static final /* synthetic */ onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onExtraCallbackWithResult + 123;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallback() {
        }

        public final getPageWidth onExtraCallback(@NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(adAsset, "");
                adAsset.IAuthTabCallbackStub();
                adAsset.onExtraCallbackWithResult();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(adAsset, "");
            NativeExtension nativeExtensionIAuthTabCallbackStub = adAsset.IAuthTabCallbackStub();
            NativeAdsDto.Creative creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
            if (nativeExtensionIAuthTabCallbackStub != null && (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.None)) {
                return new onNavigationEvent(str, nativeExtensionIAuthTabCallbackStub.onExtraCallback(), ((NativeAdsDto.Creative.None) creativeOnExtraCallbackWithResult).IAuthTabCallback());
            }
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(str, creativeOnExtraCallbackWithResult.IAuthTabCallback());
            int i3 = IAuthTabCallback + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return onwarmupcompleted;
        }
    }
}
