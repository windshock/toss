package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.text.ParsePosition;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getObjectAt extends Parcelable {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onExtraCallbackWithResult;

    public static final class IAuthTabCallback implements getObjectAt {
        public static final Parcelable.Creator<IAuthTabCallback> CREATOR = new onWarmupCompleted();
        private final Date onNavigationEvent;

        public static final class onWarmupCompleted implements Parcelable.Creator<IAuthTabCallback> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final IAuthTabCallback[] newArray(int i) {
                return new IAuthTabCallback[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final IAuthTabCallback createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new IAuthTabCallback((Date) parcel.readSerializable());
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
            return (obj instanceof IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, ((IAuthTabCallback) obj).onNavigationEvent);
        }

        public int hashCode() {
            return this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "RestrictedOrWillBe(releaseDate=" + this.onNavigationEvent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.onNavigationEvent);
        }

        public IAuthTabCallback(@NotNull Date date) {
            Intrinsics.checkNotNullParameter(date, "");
            this.onNavigationEvent = date;
        }
    }

    public static final class onExtraCallback implements getObjectAt {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();
        public static final Parcelable.Creator<onExtraCallback> CREATOR = new C0011onExtraCallback();

        /* renamed from: o.getObjectAt$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0011onExtraCallback implements Parcelable.Creator<onExtraCallback> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final onExtraCallback createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return onExtraCallback.onWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final onExtraCallback[] newArray(int i) {
                return new onExtraCallback[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private onExtraCallback() {
        }
    }

    public static final class onExtraCallbackWithResult {
        static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        private onExtraCallbackWithResult() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final getObjectAt onNavigationEvent(@NotNull getButtonColor getbuttoncolor) {
            Date date;
            Intrinsics.checkNotNullParameter(getbuttoncolor, "");
            String strOnExtraCallback = getbuttoncolor.onExtraCallback();
            if (strOnExtraCallback != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    date = Result.constructor-impl(ISO8601Utils.parse(strOnExtraCallback, new ParsePosition(0)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    date = Result.constructor-impl(ResultKt.createFailure(th));
                }
                date = Result.onExtraCallback(date) ? null : date;
            }
            return date != null ? new IAuthTabCallback(date) : onExtraCallback.onWarmupCompleted;
        }
    }
}
