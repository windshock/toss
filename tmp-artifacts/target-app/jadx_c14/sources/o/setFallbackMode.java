package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setFallbackMode implements makeLoaderUnsafe, Parcelable {
    public static final Parcelable.Creator<setFallbackMode> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<makeLoader> contents;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<setFallbackMode> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final setFallbackMode IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = onExtraCallback + 91;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 3;
            }
            int i5 = 0;
            while (i5 != i2) {
                int i6 = onExtraCallback + 83;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    arrayList.add(makeLoader.CREATOR.createFromParcel(parcel));
                    i5 += 51;
                } else {
                    arrayList.add(makeLoader.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            setFallbackMode setfallbackmode = new setFallbackMode(string, arrayList);
            int i7 = onWarmupCompleted + 1;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return setfallbackmode;
        }

        public final setFallbackMode[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 105;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            setFallbackMode[] setfallbackmodeArr = new setFallbackMode[i];
            int i6 = i4 + 103;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return setfallbackmodeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setFallbackMode createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setFallbackMode setfallbackmodeIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 24 / 0;
            }
            int i5 = onExtraCallback + 123;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 20 / 0;
            }
            return setfallbackmodeIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setFallbackMode[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            setFallbackMode[] setfallbackmodeArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return setfallbackmodeArrIAuthTabCallback;
        }
    }

    static {
        int i = onNavigationEvent + 91;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 15 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFallbackMode)) {
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        setFallbackMode setfallbackmode = (setFallbackMode) obj;
        if (Intrinsics.areEqual(this.type, setfallbackmode.type)) {
            return Intrinsics.areEqual(this.contents, setfallbackmode.contents);
        }
        int i4 = IAuthTabCallback + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.type.hashCode();
        return i3 != 0 ? (iHashCode << 47) / this.contents.hashCode() : (iHashCode * 31) + this.contents.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnOrderTypeModel(type=" + this.type + ", contents=" + this.contents + ")";
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.type);
            List<makeLoader> list = this.contents;
            parcel.writeInt(list.size());
            list.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.type);
        List<makeLoader> list2 = this.contents;
        parcel.writeInt(list2.size());
        Iterator<makeLoader> it = list2.iterator();
        while (it.hasNext()) {
            int i5 = onExtraCallback + 121;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                it.next().writeToParcel(parcel, i);
                int i6 = 6 / 0;
            } else {
                it.next().writeToParcel(parcel, i);
            }
        }
    }

    public setFallbackMode(@NotNull String str, @NotNull List<makeLoader> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.contents = list;
    }

    public final List<makeLoader> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<makeLoader> list = this.contents;
        int i5 = i2 + 83;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
