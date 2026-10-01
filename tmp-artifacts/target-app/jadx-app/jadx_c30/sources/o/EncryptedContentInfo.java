package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class EncryptedContentInfo implements Serializable, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EncryptedContentInfo> CREATOR = new IAuthTabCallback();
    private final setMessageHandler field;
    private String value;

    public static final class IAuthTabCallback implements Parcelable.Creator<EncryptedContentInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final EncryptedContentInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            return new EncryptedContentInfo(setMessageHandler.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final EncryptedContentInfo[] newArray(int i) {
            return new EncryptedContentInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.field.name());
        parcel.writeString(this.value);
    }

    public EncryptedContentInfo(@NotNull setMessageHandler setmessagehandler, @NotNull String str) {
        Intrinsics.checkNotNullParameter(setmessagehandler, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.field = setmessagehandler;
        this.value = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(EncryptedContentInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, BuildConfig.FLAVOR);
        return this.field == ((EncryptedContentInfo) obj).field;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    public String toString() {
        return "field: " + this.field + ", value: " + this.value;
    }
}
