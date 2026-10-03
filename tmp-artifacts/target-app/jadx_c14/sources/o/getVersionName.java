package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getVersionName implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<getVersionName> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("termsMap")
    private final Map<Integer, String> termsMap;

    public static final class onWarmupCompleted implements Parcelable.Creator<getVersionName> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getVersionName createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getVersionName getversionnameOnExtraCallback = onExtraCallback(parcel);
            int i3 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return getversionnameOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getVersionName[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            getVersionName[] getversionnameArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return getversionnameArrOnExtraCallbackWithResult;
        }

        public final getVersionName onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LinkedHashMap linkedHashMap = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() != 0) {
                int i4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
                }
                int i6 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            return new getVersionName(linkedHashMap);
        }

        public final getVersionName[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getVersionName[] getversionnameArr = new getVersionName[i];
            int i6 = i3 + 47;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 1 / 0;
            }
            return getversionnameArr;
        }
    }

    static {
        int i = onNavigationEvent + 45;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getVersionName() {
        Map map = null;
        this(map, 1, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getVersionName)) {
            int i3 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.termsMap, ((getVersionName) obj).termsMap)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Map<Integer, String> map = this.termsMap;
        if (map == null) {
            return 0;
        }
        int iHashCode = map.hashCode();
        int i3 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationStandardTermsResp(termsMap=" + this.termsMap + ")";
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        Map<Integer, String> map = this.termsMap;
        if (map == null) {
            int i3 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(0);
                return;
            } else {
                parcel.writeInt(0);
                return;
            }
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int i4 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            parcel.writeInt(entry.getKey().intValue());
            parcel.writeString(entry.getValue());
            int i6 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 5;
            }
        }
    }

    public getVersionName(@Nullable Map<Integer, String> map) {
        this.termsMap = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getVersionName(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 93;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 45 / 0;
            }
            int i5 = i2 + 41;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            map = null;
        }
        this(map);
    }

    public final Map<Integer, String> onNavigationEvent() {
        Map<Integer, String> map;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            map = this.termsMap;
            int i4 = 81 / 0;
        } else {
            map = this.termsMap;
        }
        int i5 = i3 + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }
}
