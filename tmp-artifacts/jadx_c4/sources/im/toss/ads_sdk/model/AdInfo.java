package im.toss.ads_sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.ads_sdk.model.AdInfo$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdInfo implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String creativeId;
    private final String requestId;
    private final String subTitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AdInfo> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<AdInfo> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final AdInfo[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 123;
            onExtraCallback = i4 % 128;
            Object obj = null;
            AdInfo[] adInfoArr = new AdInfo[i];
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 7;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return adInfoArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AdInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AdInfo adInfoOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            int i5 = onExtraCallback + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
            }
            return adInfoOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AdInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 37;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return IAuthTabCallback(i);
            }
            IAuthTabCallback(i);
            throw null;
        }

        public final AdInfo onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AdInfo adInfo = new AdInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return adInfo;
        }
    }

    static {
        int i = onNavigationEvent + 93;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AdInfo)) {
            int i4 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AdInfo adInfo = (AdInfo) obj;
        if (!Intrinsics.areEqual(this.title, adInfo.title)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.subTitle, adInfo.subTitle))) {
            return ((Intrinsics.areEqual(this.requestId, adInfo.requestId) ^ true) || (Intrinsics.areEqual(this.creativeId, adInfo.creativeId) ^ true)) ? false : true;
        }
        int i6 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 != 0 ? (((((r0 >> 72) + this.subTitle.hashCode()) / 5) * this.requestId.hashCode()) - 5) / this.creativeId.hashCode() : (((((this.title.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.creativeId.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdInfo(title=" + this.title + ", subTitle=" + this.subTitle + ", requestId=" + this.requestId + ", creativeId=" + this.creativeId + ")";
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.requestId);
        parcel.writeString(this.creativeId);
        int i5 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AdInfo$.serializer serializerVar = AdInfo$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ AdInfo(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, AdInfo$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.title = str;
        this.subTitle = str2;
        this.requestId = str3;
        this.creativeId = str4;
    }

    public AdInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.subTitle = str2;
        this.requestId = str3;
        this.creativeId = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AdInfo adInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, adInfo.title);
        vylVar.onExtraCallback(serialDescriptor, 1, adInfo.subTitle);
        vylVar.onExtraCallback(serialDescriptor, 2, adInfo.requestId);
        vylVar.onExtraCallback(serialDescriptor, 3, adInfo.creativeId);
        int i4 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 119;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.creativeId;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
