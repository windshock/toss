package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Benchmark implements Parcelable {
    public static final Parcelable.Creator<Benchmark> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final onExtraCallbackWithResult badge;
    private final String id;
    private final List<onExtraCallback> options;
    private final int selectOptionCount;
    private final String subtitle;
    private final String title;

    public static final class IAuthTabCallback implements Parcelable.Creator<Benchmark> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Benchmark createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Benchmark benchmarkOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            int i5 = IAuthTabCallback + 85;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return benchmarkOnNavigationEvent;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Benchmark[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 121;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            Benchmark[] benchmarkArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = IAuthTabCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return benchmarkArrOnExtraCallbackWithResult;
        }

        public final Benchmark[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 61;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            Benchmark[] benchmarkArr = new Benchmark[i];
            int i6 = i4 + 113;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return benchmarkArr;
        }

        public final Benchmark onNavigationEvent(Parcel parcel) {
            onExtraCallbackWithResult onextracallbackwithresult;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                int i5 = onNavigationEvent + 91;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    arrayList.add(onExtraCallback.CREATOR.createFromParcel(parcel));
                    i4 += 89;
                } else {
                    arrayList.add(onExtraCallback.CREATOR.createFromParcel(parcel));
                    i4++;
                }
            }
            if (parcel.readInt() == 0) {
                int i6 = onNavigationEvent + 61;
                IAuthTabCallback = i6 % 128;
                onextracallbackwithresult = null;
                if (i6 % 2 != 0) {
                    throw null;
                }
            } else {
                onExtraCallbackWithResult onextracallbackwithresultCreateFromParcel = onExtraCallbackWithResult.CREATOR.createFromParcel(parcel);
                int i7 = IAuthTabCallback + 65;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                onextracallbackwithresult = onextracallbackwithresultCreateFromParcel;
            }
            return new Benchmark(string, string2, string3, i2, arrayList, onextracallbackwithresult);
        }
    }

    static {
        int i = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public Benchmark() {
        this(null, null, null, 0, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Benchmark)) {
            return false;
        }
        Benchmark benchmark = (Benchmark) obj;
        if (!Intrinsics.areEqual(this.id, benchmark.id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.title, benchmark.title)) {
            int i3 = onExtraCallback + 29;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 5;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subtitle, benchmark.subtitle)) {
            int i8 = onExtraCallback + 101;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.selectOptionCount == benchmark.selectOptionCount) {
            return Intrinsics.areEqual(this.options, benchmark.options) && Intrinsics.areEqual(this.badge, benchmark.badge);
        }
        int i10 = onNavigationEvent + 123;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int iHashCode4 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.id.hashCode();
            iHashCode2 = this.title.hashCode();
            str = this.subtitle;
            iHashCode3 = 1;
            if (str != null) {
                iHashCode4 = 1;
                iHashCode3 = iHashCode4;
                iHashCode4 = str.hashCode();
            }
        } else {
            iHashCode = this.id.hashCode();
            iHashCode2 = this.title.hashCode();
            str = this.subtitle;
            if (str == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = iHashCode4;
                iHashCode4 = str.hashCode();
            }
        }
        int iHashCode5 = Integer.hashCode(this.selectOptionCount);
        int iHashCode6 = this.options.hashCode();
        onExtraCallbackWithResult onextracallbackwithresult = this.badge;
        if (onextracallbackwithresult != null) {
            int i3 = onExtraCallback + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode3 = onextracallbackwithresult.hashCode();
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueStep(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", selectOptionCount=" + this.selectOptionCount + ", options=" + this.options + ", badge=" + this.badge + ")";
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.selectOptionCount);
        List<onExtraCallback> list = this.options;
        parcel.writeInt(list.size());
        Iterator<onExtraCallback> it = list.iterator();
        while (it.hasNext()) {
            int i3 = onNavigationEvent + 39;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                throw null;
            }
            it.next().writeToParcel(parcel, i);
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.badge;
        if (onextracallbackwithresult != null) {
            parcel.writeInt(1);
            onextracallbackwithresult.writeToParcel(parcel, i);
            return;
        }
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public Benchmark(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, @NotNull List<onExtraCallback> list, @Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.selectOptionCount = i;
        this.options = list;
        this.badge = onextracallbackwithresult;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Benchmark(String str, String str2, String str3, int i, List list, onExtraCallbackWithResult onextracallbackwithresult, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = 2 % 2;
            str = "";
        }
        String str4 = (i2 & 2) == 0 ? str2 : "";
        onExtraCallbackWithResult onextracallbackwithresult2 = null;
        String str5 = (i2 & 4) != 0 ? null : str3;
        if ((i2 & 8) != 0) {
            int i4 = onNavigationEvent + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = 1;
        }
        int i6 = i;
        if ((i2 & 16) != 0) {
            int i7 = onExtraCallback + 77;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        if ((i2 & 32) != 0) {
            int i9 = onNavigationEvent + 13;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        this(str, str4, str5, i6, list2, onextracallbackwithresult2);
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            str = this.id;
            int i4 = 11 / 0;
        } else {
            str = this.id;
        }
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subtitle;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectOptionCount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<onExtraCallback> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<onExtraCallback> list = this.options;
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return list;
    }

    public final onExtraCallbackWithResult onWarmupCompleted() {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            onextracallbackwithresult = this.badge;
            int i4 = 6 / 0;
        } else {
            onextracallbackwithresult = this.badge;
        }
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    public static final class onExtraCallback implements Parcelable {
        public static final Parcelable.Creator<onExtraCallback> CREATOR = new onNavigationEvent();
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private onExtraCallbackWithResult badgeOption;
        private final onNavigationEvent bottomSheetContents;
        private final String iconUrl;
        private final String id;
        private boolean isCheckOption;
        private final String subtitle;
        private final String title;

        public static final class onNavigationEvent implements Parcelable.Creator<onExtraCallback> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallback createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 61;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallbackOnWarmupCompleted = onWarmupCompleted(parcel);
                if (i3 == 0) {
                    int i4 = 25 / 0;
                }
                int i5 = onNavigationEvent + 47;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackOnWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallback[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 39;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return onExtraCallbackWithResult(i);
                }
                onExtraCallbackWithResult(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallback[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 9;
                onNavigationEvent = i3 % 128;
                onExtraCallback[] onextracallbackArr = new onExtraCallback[i];
                if (i3 % 2 != 0) {
                    return onextracallbackArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallback onWarmupCompleted(Parcel parcel) {
                onNavigationEvent onnavigationeventCreateFromParcel;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 61;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i4 = onWarmupCompleted + 7;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    onnavigationeventCreateFromParcel = null;
                } else {
                    onnavigationeventCreateFromParcel = onNavigationEvent.CREATOR.createFromParcel(parcel);
                }
                return new onExtraCallback(string, string2, string3, string4, onnavigationeventCreateFromParcel);
            }
        }

        static {
            int i = onNavigationEvent + 61;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public onExtraCallback() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~((~i5) | i7);
            int i9 = (~i) | (~(i7 | i5));
            int i10 = i5 | i | i7;
            int i11 = i + i3 + i4 + (1635157569 * i6) + ((-1141649966) * i2);
            int i12 = i11 * i11;
            int i13 = (((-1186836012) * i) - 711983104) + (488484398 * i3) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i4) + (1462763520 * i6) + (1566572544 * i2) + (1631846400 * i12);
            int i14 = (i * 1521345644) + 2088555610 + (i3 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i4 * 1521345871) + (i6 * (-1382509809)) + (i2 * 37969358) + (i12 * (-671350784));
            return i13 + ((i14 * i14) * (-1069809664)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2 != 0 ? 1 : 0;
            int i5 = i2 + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 27;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.id, onextracallback.id)) {
                int i7 = onWarmupCompleted + 61;
                IAuthTabCallback = i7 % 128;
                return i7 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.title, onextracallback.title)) {
                int i8 = onWarmupCompleted + 41;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.subtitle, onextracallback.subtitle)) {
                int i10 = IAuthTabCallback + 45;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.iconUrl, onextracallback.iconUrl)) {
                return false;
            }
            if (Intrinsics.areEqual(this.bottomSheetContents, onextracallback.bottomSheetContents)) {
                return true;
            }
            int i12 = IAuthTabCallback + 69;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.id.hashCode();
            int iHashCode3 = this.title.hashCode();
            String str = this.subtitle;
            if (str == null) {
                int i2 = IAuthTabCallback + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = onWarmupCompleted + 45;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            int iHashCode4 = this.iconUrl.hashCode();
            onNavigationEvent onnavigationevent = this.bottomSheetContents;
            return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + (onnavigationevent != null ? onnavigationevent.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Option(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", iconUrl=" + this.iconUrl + ", bottomSheetContents=" + this.bottomSheetContents + ")";
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 19;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeString(this.iconUrl);
                throw null;
            }
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.iconUrl);
            onNavigationEvent onnavigationevent = this.bottomSheetContents;
            if (onnavigationevent != null) {
                parcel.writeInt(1);
                onnavigationevent.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
            int i4 = IAuthTabCallback + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
        }

        public onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @Nullable onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.id = str;
            this.title = str2;
            this.subtitle = str3;
            this.iconUrl = str4;
            this.bottomSheetContents = onnavigationevent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(String str, String str2, String str3, String str4, onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str5;
            String str6;
            onNavigationEvent onnavigationevent2 = null;
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 101;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    onnavigationevent2.hashCode();
                    throw null;
                }
                str = "";
            }
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallback + 31;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    onnavigationevent2.hashCode();
                    throw null;
                }
                int i4 = 2 % 2;
                str5 = "";
            } else {
                str5 = str2;
            }
            if ((i & 4) != 0) {
                int i5 = onWarmupCompleted + 65;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str6 = null;
            } else {
                str6 = str3;
            }
            String str7 = (i & 8) == 0 ? str4 : "";
            if ((i & 16) != 0) {
                int i8 = onWarmupCompleted + 21;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    onnavigationevent2.hashCode();
                    throw null;
                }
            } else {
                onnavigationevent2 = onnavigationevent;
            }
            this(str, str5, str6, str7, onnavigationevent2);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.id;
            int i4 = i3 + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String asBinder() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.title;
                int i4 = 77 / 0;
            } else {
                str = this.title;
            }
            int i5 = i2 + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.subtitle;
            int i5 = i2 + 15;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.iconUrl;
            if (i3 != 0) {
                int i4 = 22 / 0;
            }
            return str;
        }

        public final onNavigationEvent IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            onNavigationEvent onnavigationevent = this.bottomSheetContents;
            int i5 = i3 + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationevent;
        }

        public final boolean IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            boolean z = this.isCheckOption;
            int i4 = i3 + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.isCheckOption = z;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 69;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onextracallback.badgeOption = onextracallbackwithresult;
            int i5 = i2 + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = onextracallback.badgeOption;
            int i5 = i3 + 23;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public final onExtraCallbackWithResult onExtraCallbackWithResult() {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return (onExtraCallbackWithResult) onExtraCallbackWithResult(1610830963, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1610830963, new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
        }

        public final void onExtraCallbackWithResult(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onExtraCallbackWithResult(-363900303, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 363900304, new Object[]{this, onextracallbackwithresult}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
        }
    }

    public static final class onExtraCallbackWithResult implements Parcelable {
        public static final Parcelable.Creator<onExtraCallbackWithResult> CREATOR = new C0000onExtraCallbackWithResult();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final IAuthTabCallback color;
        private final String title;

        /* renamed from: o.Benchmark$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0000onExtraCallbackWithResult implements Parcelable.Creator<onExtraCallbackWithResult> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 99;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return onNavigationEvent(parcel);
                }
                onNavigationEvent(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 47;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArrOnExtraCallback = onExtraCallback(i);
                int i5 = onNavigationEvent + 71;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackwithresultArrOnExtraCallback;
            }

            public final onExtraCallbackWithResult[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback;
                int i4 = i3 + 25;
                onNavigationEvent = i4 % 128;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[i];
                if (i4 % 2 != 0) {
                    int i5 = 62 / 0;
                }
                int i6 = i3 + 89;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return onextracallbackwithresultArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallbackWithResult onNavigationEvent(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(parcel.readString(), IAuthTabCallback.valueOf(parcel.readString()));
                int i2 = onNavigationEvent + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }
        }

        static {
            int i = onExtraCallback + 105;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallbackWithResult() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 21;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i3 = IAuthTabCallback + 119;
                onWarmupCompleted = i3 % 128;
                return i3 % 2 == 0;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.title, onextracallbackwithresult.title)) {
                return false;
            }
            if (this.color == onextracallbackwithresult.color) {
                return true;
            }
            int i4 = IAuthTabCallback + 99;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.title.hashCode();
            return i3 == 0 ? (iHashCode % 68) << this.color.hashCode() : (iHashCode * 31) + this.color.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Badge(title=" + this.title + ", color=" + this.color + ")";
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 15 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.title);
            parcel.writeString(this.color.name());
            int i5 = onWarmupCompleted + 9;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull IAuthTabCallback iAuthTabCallback) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.title = str;
            this.color = iAuthTabCallback;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(String str, IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 85;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                str = "";
            }
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallback + 19;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback.BLUE;
                    obj.hashCode();
                    throw null;
                }
                iAuthTabCallback = IAuthTabCallback.BLUE;
                int i4 = 2 % 2;
            }
            this(str, iAuthTabCallback);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.title;
            }
            throw null;
        }

        public final IAuthTabCallback IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = this.color;
            int i5 = i2 + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class IAuthTabCallback {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IAuthTabCallback[] $VALUES;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            public static final IAuthTabCallback BLUE = new IAuthTabCallback("BLUE", 0);
            public static final IAuthTabCallback TEAL = new IAuthTabCallback("TEAL", 1);
            public static final IAuthTabCallback GREEN = new IAuthTabCallback("GREEN", 2);
            public static final IAuthTabCallback RED = new IAuthTabCallback("RED", 3);
            public static final IAuthTabCallback YELLOW = new IAuthTabCallback("YELLOW", 4);
            public static final IAuthTabCallback ELEPHANT = new IAuthTabCallback("ELEPHANT", 5);

            private static final /* synthetic */ IAuthTabCallback[] $values() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 11;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = {BLUE, TEAL, GREEN, RED, YELLOW, ELEPHANT};
                int i5 = i3 + 69;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallbackArr;
            }

            public static EnumEntries<IAuthTabCallback> getEntries() {
                EnumEntries<IAuthTabCallback> enumEntries;
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 9;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    enumEntries = $ENTRIES;
                    int i4 = 47 / 0;
                } else {
                    enumEntries = $ENTRIES;
                }
                int i5 = i2 + 5;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 68 / 0;
                }
                return enumEntries;
            }

            public static IAuthTabCallback valueOf(String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                if (i3 != 0) {
                    throw null;
                }
                int i4 = onWarmupCompleted + 83;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallback;
            }

            public static IAuthTabCallback[] values() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 63;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i4 = IAuthTabCallback + 47;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallbackArr;
            }

            private IAuthTabCallback(String str, int i) {
            }

            static {
                IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                $VALUES = iAuthTabCallbackArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                int i = onNavigationEvent + 115;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }
        }
    }

    public static final class onNavigationEvent implements Parcelable {
        public static final Parcelable.Creator<onNavigationEvent> CREATOR = new C0001onNavigationEvent();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final List<doCallInitialize> contents;
        private final String title;

        /* renamed from: o.Benchmark$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0001onNavigationEvent implements Parcelable.Creator<onNavigationEvent> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onNavigationEvent = onNavigationEvent(parcel);
                int i4 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return onNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    onExtraCallbackWithResult(i);
                    obj.hashCode();
                    throw null;
                }
                onNavigationEvent[] onnavigationeventArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return onnavigationeventArrOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }

            public final onNavigationEvent[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 85;
                IAuthTabCallback = i4 % 128;
                onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[i];
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventArr;
            }

            public final onNavigationEvent onNavigationEvent(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int i3 = 0;
                while (i3 != i2) {
                    int i4 = IAuthTabCallback + 113;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList.add(parcel.readParcelable(onNavigationEvent.class.getClassLoader()));
                        i3 += 69;
                    } else {
                        arrayList.add(parcel.readParcelable(onNavigationEvent.class.getClassLoader()));
                        i3++;
                    }
                }
                onNavigationEvent onnavigationevent = new onNavigationEvent(string, arrayList);
                int i5 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return onnavigationevent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = IAuthTabCallback + 105;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 89 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.title, onnavigationevent.title)) {
                return false;
            }
            if (Intrinsics.areEqual(this.contents, onnavigationevent.contents)) {
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 32 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.title.hashCode() * 31) + this.contents.hashCode();
            int i4 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BottomSheetContents(title=" + this.title + ", contents=" + this.contents + ")";
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.title);
            List<doCallInitialize> list = this.contents;
            parcel.writeInt(list.size());
            Iterator<doCallInitialize> it = list.iterator();
            int i5 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
                int i7 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@NotNull String str, @NotNull List<? extends doCallInitialize> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.title = str;
            this.contents = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                str = "";
                int i3 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i4 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                list = CollectionsKt.emptyList();
            }
            this(str, list);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 5;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<doCallInitialize> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            List<doCallInitialize> list = this.contents;
            int i5 = i2 + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }
    }
}
