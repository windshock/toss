package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 implements Parcelable {
    public static final Parcelable.Creator<OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0> CREATOR = new onNavigationEvent();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("htmlText")
    private final String htmlText;

    @SerializedName("iconUrl")
    private final String iconUrl;

    public static final class onNavigationEvent implements Parcelable.Creator<OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = IAuthTabCallback + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0OnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0[] okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0ArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 != 0) {
                int i5 = 67 / 0;
            }
            int i6 = IAuthTabCallback + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0ArrOnNavigationEvent;
        }

        public final OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 75;
            IAuthTabCallback = i4 % 128;
            Object obj = null;
            OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0[] okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0Arr = new OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0[i];
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 109;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0Arr;
            }
            obj.hashCode();
            throw null;
        }

        public final OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 = new OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0(parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0;
        }
    }

    static {
        int i = onNavigationEvent + 89;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0() {
        String str = null;
        this(str, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0)) {
            int i6 = i2 + 53;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 != 0;
        }
        OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0 = (OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0) obj;
        if (!Intrinsics.areEqual(this.iconUrl, okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0.iconUrl)) {
            int i7 = onExtraCallback + 81;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.htmlText, okHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0.htmlText)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 5;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.iconUrl.hashCode() * 31) + this.htmlText.hashCode();
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdditionalInformationBox(iconUrl=" + this.iconUrl + ", htmlText=" + this.htmlText + ")";
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.htmlText);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.iconUrl = str;
        this.htmlText = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OkHttpNetworkFetcherfetchWithRequest1ExternalSyntheticLambda0(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            str = this.iconUrl;
            int i4 = 15 / 0;
        } else {
            str = this.iconUrl;
        }
        int i5 = i3 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.htmlText;
        int i5 = i3 + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
