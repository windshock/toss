package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class deepClone implements Parcelable {
    public static final Parcelable.Creator<deepClone> CREATOR = new IAuthTabCallback();
    private final onNavigationEvent IAuthTabCallback;
    private final String onWarmupCompleted;

    public static final class IAuthTabCallback implements Parcelable.Creator<deepClone> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final deepClone[] newArray(int i) {
            return new deepClone[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final deepClone createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new deepClone(parcel.readInt() == 0 ? null : onNavigationEvent.CREATOR.createFromParcel(parcel), parcel.readString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public deepClone() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deepClone)) {
            return false;
        }
        deepClone deepclone = (deepClone) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, deepclone.IAuthTabCallback) && Intrinsics.areEqual(this.onWarmupCompleted, deepclone.onWarmupCompleted);
    }

    public int hashCode() {
        onNavigationEvent onnavigationevent = this.IAuthTabCallback;
        int iHashCode = onnavigationevent == null ? 0 : onnavigationevent.hashCode();
        String str = this.onWarmupCompleted;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PhotoTransferDetection(account=" + this.IAuthTabCallback + ", schemeFromQR=" + this.onWarmupCompleted + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        onNavigationEvent onnavigationevent = this.IAuthTabCallback;
        if (onnavigationevent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onnavigationevent.writeToParcel(parcel, i);
        }
        parcel.writeString(this.onWarmupCompleted);
    }

    public deepClone(@Nullable onNavigationEvent onnavigationevent, @Nullable String str) {
        this.IAuthTabCallback = onnavigationevent;
        this.onWarmupCompleted = str;
    }

    public /* synthetic */ deepClone(onNavigationEvent onnavigationevent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onnavigationevent, (i & 2) != 0 ? null : str);
    }

    public final onNavigationEvent onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final String onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public static final class onNavigationEvent implements Parcelable {
        public static final Parcelable.Creator<onNavigationEvent> CREATOR = new C0009onNavigationEvent();
        private final String IAuthTabCallback;
        private final int onExtraCallbackWithResult;

        /* renamed from: o.deepClone$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0009onNavigationEvent implements Parcelable.Creator<onNavigationEvent> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final onNavigationEvent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new onNavigationEvent(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final onNavigationEvent[] newArray(int i) {
                return new onNavigationEvent[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return this.onExtraCallbackWithResult == onnavigationevent.onExtraCallbackWithResult && Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback);
        }

        public int hashCode() {
            return (Integer.hashCode(this.onExtraCallbackWithResult) * 31) + this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            return "Account(bankCode=" + this.onExtraCallbackWithResult + ", accountNumber=" + this.IAuthTabCallback + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.onExtraCallbackWithResult);
            parcel.writeString(this.IAuthTabCallback);
        }

        public onNavigationEvent(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback = str;
        }

        public final int onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public final String onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }
    }
}
