package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createDefaultMediaViewVideoRendererApi implements Parcelable {
    public static final Parcelable.Creator<createDefaultMediaViewVideoRendererApi> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final onWarmupCompleted style;
    private final String text;
    private final String url;

    public static final class onNavigationEvent implements Parcelable.Creator<createDefaultMediaViewVideoRendererApi> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createDefaultMediaViewVideoRendererApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapiOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return createdefaultmediaviewvideorendererapiOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createDefaultMediaViewVideoRendererApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            createDefaultMediaViewVideoRendererApi[] createdefaultmediaviewvideorendererapiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallback + 81;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return createdefaultmediaviewvideorendererapiArrOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final createDefaultMediaViewVideoRendererApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 63;
            onNavigationEvent = i3 % 128;
            createDefaultMediaViewVideoRendererApi[] createdefaultmediaviewvideorendererapiArr = new createDefaultMediaViewVideoRendererApi[i];
            if (i3 % 2 == 0) {
                int i4 = 75 / 0;
            }
            return createdefaultmediaviewvideorendererapiArr;
        }

        public final createDefaultMediaViewVideoRendererApi onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi = new createDefaultMediaViewVideoRendererApi(parcel.readString(), parcel.readString(), onWarmupCompleted.CREATOR.createFromParcel(parcel));
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return createdefaultmediaviewvideorendererapi;
        }
    }

    static {
        int i = onWarmupCompleted + 47;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createDefaultMediaViewVideoRendererApi)) {
            return false;
        }
        createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi = (createDefaultMediaViewVideoRendererApi) obj;
        if (Intrinsics.areEqual(this.text, createdefaultmediaviewvideorendererapi.text)) {
            return Intrinsics.areEqual(this.url, createdefaultmediaviewvideorendererapi.url) && Intrinsics.areEqual(this.style, createdefaultmediaviewvideorendererapi.style);
        }
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.text.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.text.hashCode();
        String str = this.url;
        if (str == null) {
            int i3 = IAuthTabCallback + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.style.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueButton(text=" + this.text + ", url=" + this.url + ", style=" + this.style + ")";
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.text);
            parcel.writeString(this.url);
            this.style.writeToParcel(parcel, i);
            int i5 = 81 / 0;
        } else {
            parcel.writeString(this.text);
            parcel.writeString(this.url);
            this.style.writeToParcel(parcel, i);
        }
        int i6 = IAuthTabCallback + 3;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public createDefaultMediaViewVideoRendererApi(@NotNull String str, @Nullable String str2, @NotNull onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.text = str;
        this.url = str2;
        this.style = onwarmupcompleted;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.text;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onWarmupCompleted onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted onwarmupcompleted = this.style;
        int i5 = i2 + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return onwarmupcompleted;
    }

    public static final class onWarmupCompleted implements Parcelable {
        public static final Parcelable.Creator<onWarmupCompleted> CREATOR = new C0008onWarmupCompleted();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final onExtraCallback theme;
        private final onExtraCallbackWithResult type;

        /* renamed from: o.createDefaultMediaViewVideoRendererApi$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0008onWarmupCompleted implements Parcelable.Creator<onWarmupCompleted> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onWarmupCompleted createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onWarmupCompleted = onWarmupCompleted(parcel);
                int i4 = onExtraCallback + 19;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return onWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onWarmupCompleted[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 7;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return onExtraCallback(i);
                }
                onExtraCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onWarmupCompleted[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 3;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[i];
                int i6 = i3 + 83;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return onwarmupcompletedArr;
            }

            public final onWarmupCompleted onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(onExtraCallbackWithResult.valueOf(parcel.readString()), onExtraCallback.valueOf(parcel.readString()));
                int i2 = onExtraCallbackWithResult + 43;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }
        }

        static {
            int i = onExtraCallback + 123;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
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
                int i2 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (this.type != onwarmupcompleted.type) {
                return false;
            }
            if (this.theme != onwarmupcompleted.theme) {
                int i3 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int iHashCode;
            onExtraCallback onextracallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.type.hashCode() * 89;
                onextracallback = this.theme;
            } else {
                iHashCode = this.type.hashCode() * 31;
                onextracallback = this.theme;
            }
            int iHashCode2 = iHashCode + onextracallback.hashCode();
            int i3 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 51 / 0;
            }
            return iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ButtonStyle(type=" + this.type + ", theme=" + this.theme + ")";
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeString(this.type.name());
                parcel.writeString(this.theme.name());
                int i5 = 66 / 0;
            } else {
                parcel.writeString(this.type.name());
                parcel.writeString(this.theme.name());
            }
            int i6 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }

        public onWarmupCompleted(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull onExtraCallback onextracallback) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.type = onextracallbackwithresult;
            this.theme = onextracallback;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, onExtraCallback onextracallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onextracallbackwithresult = onExtraCallbackWithResult.WEAK;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    onExtraCallback onextracallback2 = onExtraCallback.PRIMARY;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onextracallback = onExtraCallback.PRIMARY;
            }
            this(onextracallbackwithresult, onextracallback);
        }

        public final onExtraCallbackWithResult onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.type;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onExtraCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback onextracallback = this.theme;
            int i5 = i2 + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult FILL = new onExtraCallbackWithResult("FILL", 0);
        public static final onExtraCallbackWithResult WEAK = new onExtraCallbackWithResult("WEAK", 1);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {FILL, WEAK};
            int i5 = i3 + 59;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            EnumEntries<onExtraCallbackWithResult> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 20 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 88 / 0;
            }
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallback + 61;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback PRIMARY = new onExtraCallback("PRIMARY", 0);
        public static final onExtraCallback DARK = new onExtraCallback("DARK", 1);
        public static final onExtraCallback DANGER = new onExtraCallback("DANGER", 2);
        public static final onExtraCallback LIGHT = new onExtraCallback("LIGHT", 3);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return new onExtraCallback[]{PRIMARY, DARK, DANGER, LIGHT};
            }
            onExtraCallback onextracallback = PRIMARY;
            onExtraCallback onextracallback2 = DARK;
            onExtraCallback onextracallback3 = DANGER;
            onExtraCallback onextracallback4 = LIGHT;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[4];
            onextracallbackArr[1] = onextracallback;
            onextracallbackArr[0] = onextracallback2;
            onextracallbackArr[5] = onextracallback3;
            onextracallbackArr[2] = onextracallback4;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 51;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 70 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            int i4 = 36 / 0;
            return (onExtraCallback[]) onextracallbackArr.clone();
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 119;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 81 / 0;
            }
        }
    }
}
