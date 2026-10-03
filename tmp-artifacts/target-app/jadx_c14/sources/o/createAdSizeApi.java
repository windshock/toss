package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import im.toss.network.serialization.PolymorphicTypeDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonAdapter(PolymorphicTypeDeserializer.class)
@ga(onExtraCallback = {@gb(IAuthTabCallback = "NEXT", onExtraCallback = onWarmupCompleted.class), @gb(IAuthTabCallback = "END", onExtraCallback = onExtraCallbackWithResult.class), @gb(IAuthTabCallback = "NONE", onExtraCallback = IAuthTabCallback.class), @gb(IAuthTabCallback = "REDIRECT", onExtraCallback = onNavigationEvent.class), @gb(IAuthTabCallback = "RESTART", onExtraCallback = onExtraCallback.class)}, onNavigationEvent = "type")
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface createAdSizeApi extends Parcelable {
    String IAuthTabCallback();

    String onNavigationEvent();

    public static final class onWarmupCompleted implements createAdSizeApi {
        public static final Parcelable.Creator<onWarmupCompleted> CREATOR = new onExtraCallbackWithResult();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        @SerializedName("layout")
        private final List<RCTCodelessLoggingEventListener> layoutList;
        private final String logName;
        private final String type;

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<onWarmupCompleted> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final onWarmupCompleted[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 113;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[i];
                int i6 = i4 + 35;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return onwarmupcompletedArr;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onWarmupCompleted createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(parcel);
                }
                onWarmupCompleted(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onWarmupCompleted[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 101;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return IAuthTabCallback(i);
                }
                IAuthTabCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onWarmupCompleted onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int i3 = onExtraCallback + 9;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 != i2; i5++) {
                    int i6 = onWarmupCompleted + 107;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add(parcel.readParcelable(onWarmupCompleted.class.getClassLoader()));
                }
                return new onWarmupCompleted(string, string2, arrayList);
            }
        }

        static {
            int i = onNavigationEvent + 1;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 125;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.logName);
            parcel.writeString(this.type);
            List<RCTCodelessLoggingEventListener> list = this.layoutList;
            parcel.writeInt(list.size());
            Iterator<RCTCodelessLoggingEventListener> it = list.iterator();
            int i3 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                int i5 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    parcel.writeParcelable(it.next(), i);
                    throw null;
                }
                parcel.writeParcelable(it.next(), i);
            }
            int i6 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted(@Nullable String str, @NotNull String str2, @NotNull List<? extends RCTCodelessLoggingEventListener> list) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.logName = str;
            this.type = str2;
            this.layoutList = list;
        }

        @Override // o.createAdSizeApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.logName;
            int i5 = i3 + 117;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.createAdSizeApi
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.type;
            int i5 = i3 + 77;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
            return str;
        }

        public final List<RCTCodelessLoggingEventListener> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            List<RCTCodelessLoggingEventListener> list = this.layoutList;
            int i5 = i2 + 105;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return list;
        }
    }

    public static final class onExtraCallbackWithResult implements createAdSizeApi {
        public static final Parcelable.Creator<onExtraCallbackWithResult> CREATOR = new onWarmupCompleted();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String link;
        private final String logName;
        private final String type;

        public static final class onWarmupCompleted implements Parcelable.Creator<onExtraCallbackWithResult> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted(parcel);
                int i4 = onNavigationEvent + 13;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return onextracallbackwithresultOnWarmupCompleted;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArrOnWarmupCompleted = onWarmupCompleted(i);
                int i5 = onNavigationEvent + 55;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackwithresultArrOnWarmupCompleted;
            }

            public final onExtraCallbackWithResult onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(parcel.readString(), parcel.readString(), parcel.readString());
                int i2 = onWarmupCompleted + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallbackWithResult[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 75;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[i];
                int i6 = i4 + 81;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return onextracallbackwithresultArr;
                }
                throw null;
            }
        }

        static {
            int i = onWarmupCompleted + 119;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 5;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeString(this.logName);
                parcel.writeString(this.type);
                parcel.writeString(this.link);
                throw null;
            }
            parcel.writeString(this.logName);
            parcel.writeString(this.type);
            parcel.writeString(this.link);
            int i5 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public onExtraCallbackWithResult(@Nullable String str, @NotNull String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.logName = str;
            this.type = str2;
            this.link = str3;
        }

        @Override // o.createAdSizeApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 5;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.logName;
            int i5 = i2 + 107;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.createAdSizeApi
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.type;
            int i5 = i3 + 45;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.link;
            int i5 = i3 + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static final class onNavigationEvent implements createAdSizeApi {
        public static final Parcelable.Creator<onNavigationEvent> CREATOR = new IAuthTabCallback();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final String link;
        private final String logName;
        private final String type;

        public static final class IAuthTabCallback implements Parcelable.Creator<onNavigationEvent> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final onNavigationEvent IAuthTabCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onNavigationEvent onnavigationevent = new onNavigationEvent(parcel.readString(), parcel.readString(), parcel.readString());
                int i2 = onNavigationEvent + 107;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return onnavigationevent;
                }
                throw null;
            }

            public final onNavigationEvent[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 29;
                onWarmupCompleted = i3 % 128;
                onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[i];
                if (i3 % 2 != 0) {
                    return onnavigationeventArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(parcel);
                if (i3 == 0) {
                    int i4 = 50 / 0;
                }
                int i5 = onNavigationEvent + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 113;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onNavigationEvent[] onnavigationeventArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onWarmupCompleted + 75;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventArrIAuthTabCallback;
            }
        }

        static {
            int i = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 46 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 5;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 69;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 67 / 0;
            }
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.logName);
            parcel.writeString(this.type);
            parcel.writeString(this.link);
            int i5 = onExtraCallback + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }

        public onNavigationEvent(@Nullable String str, @NotNull String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.logName = str;
            this.type = str2;
            this.link = str3;
        }

        @Override // o.createAdSizeApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 99;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.logName;
            int i5 = i2 + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.createAdSizeApi
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.type;
            int i5 = i3 + 69;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.link;
            }
            throw null;
        }
    }

    public static final class onExtraCallback implements createAdSizeApi {
        public static final Parcelable.Creator<onExtraCallback> CREATOR = new onNavigationEvent();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String logName;
        private final String type;

        public static final class onNavigationEvent implements Parcelable.Creator<onExtraCallback> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallback createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(parcel);
                }
                onWarmupCompleted(parcel);
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallback[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 55;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback[] onextracallbackArrOnWarmupCompleted = onWarmupCompleted(i);
                int i5 = IAuthTabCallback + 89;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return onextracallbackArrOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallback onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onExtraCallback onextracallback = new onExtraCallback(parcel.readString(), parcel.readString());
                int i2 = IAuthTabCallback + 27;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallback[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 41;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                onExtraCallback[] onextracallbackArr = new onExtraCallback[i];
                int i6 = i4 + 55;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 86 / 0;
                }
                return onextracallbackArr;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 45;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 103;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.logName);
            parcel.writeString(this.type);
            int i5 = onExtraCallback + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public onExtraCallback(@Nullable String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.logName = str;
            this.type = str2;
        }

        @Override // o.createAdSizeApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.logName;
            int i5 = i3 + 11;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.createAdSizeApi
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.type;
            if (i3 == 0) {
                int i4 = 78 / 0;
            }
            return str;
        }
    }
}
