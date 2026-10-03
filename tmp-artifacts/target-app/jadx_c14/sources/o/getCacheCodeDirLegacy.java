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
public final class getCacheCodeDirLegacy implements doCallInitialize {
    public static final Parcelable.Creator<getCacheCodeDirLegacy> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String backgroundColor;
    private final List<makeLoaderUnsafe> contents;
    private final boolean opened;
    private final doMakeLoader title;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<getCacheCodeDirLegacy> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final getCacheCodeDirLegacy[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 59;
            onExtraCallback = i3 % 128;
            getCacheCodeDirLegacy[] getcachecodedirlegacyArr = new getCacheCodeDirLegacy[i];
            if (i3 % 2 != 0) {
                return getcachecodedirlegacyArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getCacheCodeDirLegacy createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getCacheCodeDirLegacy getcachecodedirlegacyOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            int i5 = onNavigationEvent + 49;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return getcachecodedirlegacyOnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getCacheCodeDirLegacy[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            getCacheCodeDirLegacy[] getcachecodedirlegacyArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallback + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return getcachecodedirlegacyArrIAuthTabCallback;
            }
            throw null;
        }

        public final getCacheCodeDirLegacy onWarmupCompleted(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            doMakeLoader domakeloaderCreateFromParcel = doMakeLoader.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onExtraCallback + 11;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(parcel.readParcelable(getCacheCodeDirLegacy.class.getClassLoader()));
                i3++;
                int i6 = onExtraCallback + 13;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            if (parcel.readInt() != 0) {
                int i8 = onNavigationEvent + 33;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            return new getCacheCodeDirLegacy(string, domakeloaderCreateFromParcel, arrayList, z, parcel.readString());
        }
    }

    static {
        int i = onExtraCallbackWithResult + 49;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCacheCodeDirLegacy)) {
            return false;
        }
        getCacheCodeDirLegacy getcachecodedirlegacy = (getCacheCodeDirLegacy) obj;
        if (!Intrinsics.areEqual(this.type, getcachecodedirlegacy.type) || !Intrinsics.areEqual(this.title, getcachecodedirlegacy.title) || !Intrinsics.areEqual(this.contents, getcachecodedirlegacy.contents)) {
            return false;
        }
        if (this.opened != getcachecodedirlegacy.opened) {
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.backgroundColor, getcachecodedirlegacy.backgroundColor)) {
            return true;
        }
        int i4 = IAuthTabCallback + 111;
        onExtraCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.contents.hashCode()) * 31) + Boolean.hashCode(this.opened)) * 31) + this.backgroundColor.hashCode();
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FaqFolderContent(type=" + this.type + ", title=" + this.title + ", contents=" + this.contents + ", opened=" + this.opened + ", backgroundColor=" + this.backgroundColor + ")";
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        this.title.writeToParcel(parcel, i);
        List<makeLoaderUnsafe> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<makeLoaderUnsafe> it = list.iterator();
        while (!(!it.hasNext())) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.opened ? 1 : 0);
        parcel.writeString(this.backgroundColor);
        int i5 = onExtraCallback + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCacheCodeDirLegacy(@NotNull String str, @NotNull doMakeLoader domakeloader, @NotNull List<? extends makeLoaderUnsafe> list, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(domakeloader, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.title = domakeloader;
        this.contents = list;
        this.opened = z;
        this.backgroundColor = str2;
    }

    public final doMakeLoader onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<makeLoaderUnsafe> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.contents;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.opened;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.backgroundColor;
        int i4 = i3 + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
