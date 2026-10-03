package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class FileUtilsParentDirNotFoundException implements Parcelable {
    public static final Parcelable.Creator<FileUtilsParentDirNotFoundException> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final RemoteServiceWrapperRemoteServiceConnection cta;
    private final String icon;
    private final String subTitle;
    private final String title;

    public static final class onNavigationEvent implements Parcelable.Creator<FileUtilsParentDirNotFoundException> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FileUtilsParentDirNotFoundException createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            FileUtilsParentDirNotFoundException fileUtilsParentDirNotFoundExceptionOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return fileUtilsParentDirNotFoundExceptionOnExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FileUtilsParentDirNotFoundException[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            FileUtilsParentDirNotFoundException[] fileUtilsParentDirNotFoundExceptionArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 79 / 0;
            }
            return fileUtilsParentDirNotFoundExceptionArrOnWarmupCompleted;
        }

        public final FileUtilsParentDirNotFoundException onExtraCallbackWithResult(Parcel parcel) {
            RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnectionCreateFromParcel;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 49;
                int i5 = i4 % 128;
                onExtraCallbackWithResult = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 121;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                remoteServiceWrapperRemoteServiceConnectionCreateFromParcel = null;
            } else {
                remoteServiceWrapperRemoteServiceConnectionCreateFromParcel = RemoteServiceWrapperRemoteServiceConnection.CREATOR.createFromParcel(parcel);
            }
            return new FileUtilsParentDirNotFoundException(string, string2, string3, remoteServiceWrapperRemoteServiceConnectionCreateFromParcel);
        }

        public final FileUtilsParentDirNotFoundException[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 93;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            FileUtilsParentDirNotFoundException[] fileUtilsParentDirNotFoundExceptionArr = new FileUtilsParentDirNotFoundException[i];
            int i6 = i4 + 91;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return fileUtilsParentDirNotFoundExceptionArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 71;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof FileUtilsParentDirNotFoundException)) {
            return false;
        }
        FileUtilsParentDirNotFoundException fileUtilsParentDirNotFoundException = (FileUtilsParentDirNotFoundException) obj;
        if (Intrinsics.areEqual(this.title, fileUtilsParentDirNotFoundException.title)) {
            return Intrinsics.areEqual(this.subTitle, fileUtilsParentDirNotFoundException.subTitle) && Intrinsics.areEqual(this.icon, fileUtilsParentDirNotFoundException.icon) && Intrinsics.areEqual(this.cta, fileUtilsParentDirNotFoundException.cta);
        }
        int i6 = onExtraCallback + 89;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.subTitle.hashCode();
        int iHashCode3 = this.icon.hashCode();
        RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnection = this.cta;
        if (remoteServiceWrapperRemoteServiceConnection == null) {
            int i3 = onWarmupCompleted + 55;
            onExtraCallback = i3 % 128;
            i = i3 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode4 = remoteServiceWrapperRemoteServiceConnection.hashCode();
            int i4 = onExtraCallback + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LayoutListItem(title=" + this.title + ", subTitle=" + this.subTitle + ", icon=" + this.icon + ", cta=" + this.cta + ")";
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.icon);
        RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnection = this.cta;
        if (remoteServiceWrapperRemoteServiceConnection != null) {
            parcel.writeInt(1);
            remoteServiceWrapperRemoteServiceConnection.writeToParcel(parcel, i);
            int i3 = onWarmupCompleted + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = onWarmupCompleted + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(0);
        }
    }

    public FileUtilsParentDirNotFoundException(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnection) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.subTitle = str2;
        this.icon = str3;
        this.cta = remoteServiceWrapperRemoteServiceConnection;
    }

    public final RemoteServiceWrapperRemoteServiceConnection onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnection = this.cta;
        int i5 = i2 + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return remoteServiceWrapperRemoteServiceConnection;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.icon;
        int i5 = i3 + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 91;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
