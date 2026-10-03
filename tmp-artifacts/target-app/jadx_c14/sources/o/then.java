package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class then implements Parcelable {
    public static final Parcelable.Creator<then> CREATOR = new IAuthTabCallback();
    public static final onWarmupCompleted Companion;
    public static final String DATE_YEAR = "YEAR";
    public static final String DATE_YEAR_MONTH = "MONTH";
    public static final String DATE_YEAR_MONTH_DATE = "DAY";
    public static final String DROPDOWN = "DROPDOWN";
    public static final String FULL_SELECTOR = "FULL_SELECTOR";
    private static int IAuthTabCallback = 0;
    public static final String MONEY = "MONEY";
    public static final String NUMBER = "NUMBER";
    public static final String RADIO = "RADIO";
    public static final String SEARCH_COMPANY = "SEARCH_COMPANY";
    public static final String STRING = "STRING";
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    @SerializedName("dataType")
    private final String dataType;

    @SerializedName("displayName")
    private final String displayName;

    @SerializedName("key")
    private final String key;

    @SerializedName("options")
    private final List<LoanComparisonAdditionalFieldOption> options;

    public static final class IAuthTabCallback implements Parcelable.Creator<then> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ then createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            then thenVarOnExtraCallback = onExtraCallback(parcel);
            int i4 = IAuthTabCallback + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return thenVarOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ then[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            then[] thenVarArrOnExtraCallback = onExtraCallback(i);
            if (i4 == 0) {
                int i5 = 89 / 0;
            }
            int i6 = IAuthTabCallback + 121;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return thenVarArrOnExtraCallback;
        }

        public final then onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onWarmupCompleted + 79;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(LoanComparisonAdditionalFieldOption.CREATOR.createFromParcel(parcel));
                    i3 += 40;
                } else {
                    arrayList.add(LoanComparisonAdditionalFieldOption.CREATOR.createFromParcel(parcel));
                    i3++;
                }
                int i5 = IAuthTabCallback + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            return new then(string, string2, string3, arrayList);
        }

        public final then[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 69;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            then[] thenVarArr = new then[i];
            int i6 = i4 + 121;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return thenVarArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof then)) {
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        then thenVar = (then) obj;
        if (Intrinsics.areEqual(this.key, thenVar.key)) {
            if (!Intrinsics.areEqual(this.displayName, thenVar.displayName)) {
                int i4 = onNavigationEvent + 71;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.dataType, thenVar.dataType))) {
                if (!Intrinsics.areEqual(this.options, thenVar.options)) {
                    return false;
                }
                int i6 = onNavigationEvent + 79;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            int i8 = onNavigationEvent + 95;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((this.key.hashCode() * 27) >>> this.displayName.hashCode()) + 94) * this.dataType.hashCode()) >> 87) >>> this.options.hashCode() : (((((this.key.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.dataType.hashCode()) * 31) + this.options.hashCode();
        int i3 = onNavigationEvent + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonAdditionalField(key=" + this.key + ", displayName=" + this.displayName + ", dataType=" + this.dataType + ", options=" + this.options + ")";
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.displayName);
        parcel.writeString(this.dataType);
        List<LoanComparisonAdditionalFieldOption> list = this.options;
        parcel.writeInt(list.size());
        Iterator<LoanComparisonAdditionalFieldOption> it = list.iterator();
        int i3 = onNavigationEvent + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = onNavigationEvent + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
        }
    }

    public then(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<LoanComparisonAdditionalFieldOption> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.displayName = str2;
        this.dataType = str3;
        this.options = list;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.key;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.displayName;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dataType;
        int i5 = i2 + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final List<LoanComparisonAdditionalFieldOption> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<LoanComparisonAdditionalFieldOption> list = this.options;
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
