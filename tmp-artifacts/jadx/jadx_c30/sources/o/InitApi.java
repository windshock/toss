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
public final class InitApi implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<InitApi> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("cardVendorTermsInfos")
    private final List<NativeAdApi> cardVendorTermsInfos;

    @SerializedName("messages")
    private final List<String> messages;

    public static final class onNavigationEvent implements Parcelable.Creator<InitApi> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final InitApi[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            InitApi[] initApiArr = new InitApi[i];
            int i6 = i3 + 121;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return initApiArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ InitApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            InitApi initApiOnExtraCallback = onExtraCallback(parcel);
            int i4 = IAuthTabCallback + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return initApiOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ InitApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            InitApi[] initApiArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = IAuthTabCallback + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return initApiArrIAuthTabCallback;
        }

        public final InitApi onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ArrayList arrayList = null;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            if (i3 != 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 57;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = parcel.readInt();
                arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    int i8 = IAuthTabCallback + 101;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList.add(NativeAdApi.CREATOR.createFromParcel(parcel));
                }
            }
            return new InitApi(arrayList, parcel.createStringArrayList());
        }
    }

    static {
        int i = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InitApi() {
        List list = null;
        this(list, list, 3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof InitApi)) {
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        InitApi initApi = (InitApi) obj;
        if (!Intrinsics.areEqual(this.cardVendorTermsInfos, initApi.cardVendorTermsInfos)) {
            int i6 = onNavigationEvent + 15;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.messages, initApi.messages)) {
            return true;
        }
        int i7 = onWarmupCompleted + 95;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<NativeAdApi> list = this.cardVendorTermsInfos;
        int iHashCode2 = 0;
        if (list == null) {
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        List<String> list2 = this.messages;
        if (list2 != null) {
            int i4 = onNavigationEvent + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = list2.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationTermsResp(cardVendorTermsInfos=" + this.cardVendorTermsInfos + ", messages=" + this.messages + ")";
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        List<NativeAdApi> list = this.cardVendorTermsInfos;
        if (list == null) {
            parcel.writeInt(0);
            int i5 = onWarmupCompleted + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<NativeAdApi> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.messages);
    }

    public InitApi(@Nullable List<NativeAdApi> list, @Nullable List<String> list2) {
        this.cardVendorTermsInfos = list;
        this.messages = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InitApi(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 95;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            list2 = null;
        }
        this(list, list2);
    }
}
