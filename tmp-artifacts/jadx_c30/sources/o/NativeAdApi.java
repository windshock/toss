package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativeAdApi implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<NativeAdApi> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("cardCode")
    private final Integer cardCode;

    @SerializedName("cardVendorName")
    private final String cardVendorName;

    @SerializedName(PKCS12.KEY_TERMS)
    private final List<MediaViewVideoRendererApi> terms;

    public static final class onWarmupCompleted implements Parcelable.Creator<NativeAdApi> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            NativeAdApi nativeAdApiOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return nativeAdApiOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            NativeAdApi[] nativeAdApiArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 != 0) {
                int i5 = 53 / 0;
            }
            return nativeAdApiArrOnNavigationEvent;
        }

        public final NativeAdApi onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int i5 = 0;
                while (i5 != i4) {
                    int i6 = onExtraCallbackWithResult + 21;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        arrayList2.add(MediaViewVideoRendererApi.CREATOR.createFromParcel(parcel));
                        i5 += 15;
                    } else {
                        arrayList2.add(MediaViewVideoRendererApi.CREATOR.createFromParcel(parcel));
                        i5++;
                    }
                }
                int i7 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                arrayList = arrayList2;
            }
            NativeAdApi nativeAdApi = new NativeAdApi(numValueOf, string, arrayList);
            int i9 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return nativeAdApi;
        }

        public final NativeAdApi[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i3 % 128;
            NativeAdApi[] nativeAdApiArr = new NativeAdApi[i];
            if (i3 % 2 == 0) {
                return nativeAdApiArr;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 125;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public NativeAdApi() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof NativeAdApi)) {
            return false;
        }
        NativeAdApi nativeAdApi = (NativeAdApi) obj;
        if (Intrinsics.areEqual(this.cardCode, nativeAdApi.cardCode)) {
            if (Intrinsics.areEqual(this.cardVendorName, nativeAdApi.cardVendorName)) {
                return Intrinsics.areEqual(this.terms, nativeAdApi.terms);
            }
            int i6 = onExtraCallback + 27;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = onExtraCallback + 83;
        int i9 = i8 % 128;
        onNavigationEvent = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 63;
        onExtraCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.cardCode;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.cardVendorName.hashCode();
        List<MediaViewVideoRendererApi> list = this.terms;
        if (list != null) {
            iHashCode = list.hashCode();
            int i4 = onNavigationEvent + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardTerms(cardCode=" + this.cardCode + ", cardVendorName=" + this.cardVendorName + ", terms=" + this.terms + ")";
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        Integer num = this.cardCode;
        if (num == null) {
            parcel.writeInt(0);
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.cardVendorName);
        List<MediaViewVideoRendererApi> list = this.terms;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<MediaViewVideoRendererApi> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
            int i6 = onExtraCallback + 69;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public NativeAdApi(@Nullable Integer num, @NotNull String str, @Nullable List<MediaViewVideoRendererApi> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.cardCode = num;
        this.cardVendorName = str;
        this.terms = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdApi(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
            }
            int i4 = 2 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 103;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = i6 + 61;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            int i10 = onNavigationEvent + 63;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i11 = 2 % 2;
            list = null;
        }
        this(num, str, list);
    }
}
