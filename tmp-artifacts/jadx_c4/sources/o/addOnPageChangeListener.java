package o;

import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface addOnPageChangeListener {

    public static final class onWarmupCompleted implements addOnPageChangeListener {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private final NativeAdsManager.onNavigationEvent onExtraCallback;
        private final GetNativeAdsRequestBody.AdRequestOption onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final deleteProfile onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asInterface + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = asInterface + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult)) {
                return false;
            }
            if (this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted) {
                return this.onExtraCallback == onwarmupcompleted.onExtraCallback;
            }
            int i6 = IAuthTabCallback + 41;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            GetNativeAdsRequestBody.AdRequestOption adRequestOption = this.onExtraCallbackWithResult;
            if (adRequestOption == null) {
                int i3 = asInterface + 71;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode2 = adRequestOption.hashCode();
                int i5 = asInterface + 83;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode2;
            }
            return (((((iHashCode * 31) + i) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "V1(spaceUnitId=" + this.onNavigationEvent + ", adRequestOption=" + this.onExtraCallbackWithResult + ", preferredUiMode=" + this.onWarmupCompleted + ", fetchType=" + this.onExtraCallback + ")";
            int i2 = asInterface + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onWarmupCompleted(@NotNull String str, @Nullable GetNativeAdsRequestBody.AdRequestOption adRequestOption, @NotNull deleteProfile deleteprofile, @NotNull NativeAdsManager.onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.onNavigationEvent = str;
            this.onExtraCallbackWithResult = adRequestOption;
            this.onWarmupCompleted = deleteprofile;
            this.onExtraCallback = onnavigationevent;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final GetNativeAdsRequestBody.AdRequestOption onWarmupCompleted() {
            GetNativeAdsRequestBody.AdRequestOption adRequestOption;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 == 0) {
                adRequestOption = this.onExtraCallbackWithResult;
                int i4 = 80 / 0;
            } else {
                adRequestOption = this.onExtraCallbackWithResult;
            }
            int i5 = i3 + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return adRequestOption;
            }
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(String str, GetNativeAdsRequestBody.AdRequestOption adRequestOption, deleteProfile deleteprofile, NativeAdsManager.onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            adRequestOption = (i & 2) != 0 ? null : adRequestOption;
            if ((i & 4) != 0) {
                deleteprofile = deleteProfile.AUTO;
                int i2 = asInterface + 35;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 % 2;
                } else {
                    int i4 = 2 % 2;
                }
            }
            if ((i & 8) != 0) {
                int i5 = IAuthTabCallback + 87;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                onnavigationevent = NativeAdsManager.onNavigationEvent.MANUAL;
                int i7 = IAuthTabCallback + 93;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            }
            this(str, adRequestOption, deleteprofile, onnavigationevent);
        }

        public final deleteProfile IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 89;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            deleteProfile deleteprofile = this.onWarmupCompleted;
            int i5 = i2 + 49;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return deleteprofile;
        }

        public NativeAdsManager.onNavigationEvent onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements addOnPageChangeListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final NativeAdsManager.onNavigationEvent IAuthTabCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 121;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                if (!(!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent))) {
                    return this.IAuthTabCallback == onnavigationevent.IAuthTabCallback;
                }
                int i6 = onWarmupCompleted + 77;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = onExtraCallback;
            int i9 = i8 + 41;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 125;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onWarmupCompleted = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((this.onExtraCallbackWithResult.hashCode() + 108) / this.onNavigationEvent.hashCode()) << 87) * this.IAuthTabCallback.hashCode() : (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
            int i3 = onExtraCallback + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "V2(placementId=" + this.onExtraCallbackWithResult + ", slotId=" + this.onNavigationEvent + ", fetchType=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 35 / 0;
            }
            return str;
        }

        public onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull NativeAdsManager.onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.onExtraCallbackWithResult = str;
            this.onNavigationEvent = str2;
            this.IAuthTabCallback = onnavigationevent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, String str2, NativeAdsManager.onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                int i2 = onExtraCallback + 103;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onnavigationevent = NativeAdsManager.onNavigationEvent.MANUAL;
                int i4 = onWarmupCompleted + 13;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(str, str2, onnavigationevent);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i2 + 77;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i3 + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public NativeAdsManager.onNavigationEvent onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
