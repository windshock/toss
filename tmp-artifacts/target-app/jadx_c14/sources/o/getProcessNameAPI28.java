package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getProcessNameAPI28 implements Parcelable {
    public static final Parcelable.Creator<getProcessNameAPI28> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final List<FileUtilsFileDeleteException> additionalField;
    private final createAdSizeApi confirmAction;
    private final CardRecommendCardImage image;
    private final String subTitle;
    private final String title;
    private final String value;

    public static final class onExtraCallback implements Parcelable.Creator<getProcessNameAPI28> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getProcessNameAPI28 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getProcessNameAPI28 getprocessnameapi28OnExtraCallback = onExtraCallback(parcel);
            if (i3 != 0) {
                int i4 = 53 / 0;
            }
            int i5 = onWarmupCompleted + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return getprocessnameapi28OnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getProcessNameAPI28[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getProcessNameAPI28[] getprocessnameapi28ArrOnWarmupCompleted = onWarmupCompleted(i);
            if (i4 == 0) {
                int i5 = 79 / 0;
            }
            int i6 = onWarmupCompleted + 67;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 79 / 0;
            }
            return getprocessnameapi28ArrOnWarmupCompleted;
        }

        public final getProcessNameAPI28 onExtraCallback(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            CardRecommendCardImage cardRecommendCardImageCreateFromParcel = CardRecommendCardImage.CREATOR.createFromParcel(parcel);
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(getProcessNameAPI28.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 71;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 16 / 0;
                }
                arrayList = null;
            } else {
                int i6 = parcel.readInt();
                arrayList = new ArrayList(i6);
                int i7 = onWarmupCompleted + 31;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                for (int i9 = 0; i9 != i6; i9++) {
                    int i10 = onWarmupCompleted + 117;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    arrayList.add(FileUtilsFileDeleteException.CREATOR.createFromParcel(parcel));
                }
            }
            return new getProcessNameAPI28(string, string2, string3, cardRecommendCardImageCreateFromParcel, createadsizeapi, arrayList);
        }

        public final getProcessNameAPI28[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getProcessNameAPI28[] getprocessnameapi28Arr = new getProcessNameAPI28[i];
            int i6 = i3 + 63;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return getprocessnameapi28Arr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 91;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getProcessNameAPI28)) {
            return false;
        }
        getProcessNameAPI28 getprocessnameapi28 = (getProcessNameAPI28) obj;
        if (!Intrinsics.areEqual(this.value, getprocessnameapi28.value)) {
            int i3 = onWarmupCompleted + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, getprocessnameapi28.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitle, getprocessnameapi28.subTitle)) {
            int i5 = onWarmupCompleted + 19;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.image, getprocessnameapi28.image)) {
            return false;
        }
        if (Intrinsics.areEqual(this.confirmAction, getprocessnameapi28.confirmAction)) {
            return Intrinsics.areEqual(this.additionalField, getprocessnameapi28.additionalField);
        }
        int i7 = IAuthTabCallback + 105;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = this.title.hashCode();
        String str = this.subTitle;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.image.hashCode();
        createAdSizeApi createadsizeapi = this.confirmAction;
        if (createadsizeapi == null) {
            int i2 = IAuthTabCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = createadsizeapi.hashCode();
        }
        List<FileUtilsFileDeleteException> list = this.additionalField;
        if (list != null) {
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = list.hashCode();
            int i6 = onWarmupCompleted + 51;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardDesignOption(value=" + this.value + ", title=" + this.title + ", subTitle=" + this.subTitle + ", image=" + this.image + ", confirmAction=" + this.confirmAction + ", additionalField=" + this.additionalField + ")";
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        this.image.writeToParcel(parcel, i);
        parcel.writeParcelable(this.confirmAction, i);
        List<FileUtilsFileDeleteException> list = this.additionalField;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<FileUtilsFileDeleteException> it = list.iterator();
        while (it.hasNext()) {
            int i5 = IAuthTabCallback + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                int i6 = 3 / 0;
            } else {
                it.next().writeToParcel(parcel, i);
            }
            int i7 = onWarmupCompleted + 37;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public getProcessNameAPI28(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull CardRecommendCardImage cardRecommendCardImage, @Nullable createAdSizeApi createadsizeapi, @Nullable List<FileUtilsFileDeleteException> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(cardRecommendCardImage, "");
        this.value = str;
        this.title = str2;
        this.subTitle = str3;
        this.image = cardRecommendCardImage;
        this.confirmAction = createadsizeapi;
        this.additionalField = list;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            str = this.value;
            int i4 = 19 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 45;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return str;
    }

    public final CardRecommendCardImage onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.image;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
