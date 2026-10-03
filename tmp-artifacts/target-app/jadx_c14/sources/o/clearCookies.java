package o;

import com.google.gson.annotations.SerializedName;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class clearCookies {
    public static final int $stable = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String link;
    private final onWarmupCompleted size;
    private final onExtraCallback style;
    private final onExtraCallbackWithResult theme;
    private final String title;

    public clearCookies() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearCookies)) {
            return false;
        }
        clearCookies clearcookies = (clearCookies) obj;
        if (!Intrinsics.areEqual(this.title, clearcookies.title)) {
            int i4 = onExtraCallbackWithResult + 7;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 103;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.theme != clearcookies.theme) {
            return false;
        }
        if (this.style != clearcookies.style) {
            int i9 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i9 % 128;
            return i9 % 2 != 0;
        }
        if (this.size != clearcookies.size) {
            return false;
        }
        if (Intrinsics.areEqual(this.link, clearcookies.link)) {
            return true;
        }
        int i10 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        if (str == null) {
            int i5 = i2 + 41;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.theme;
        int iHashCode3 = onextracallbackwithresult == null ? 0 : onextracallbackwithresult.hashCode();
        onExtraCallback onextracallback = this.style;
        if (onextracallback == null) {
            int i9 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = onextracallback.hashCode();
        }
        onWarmupCompleted onwarmupcompleted = this.size;
        return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + (onwarmupcompleted != null ? onwarmupcompleted.hashCode() : 0)) * 31) + this.link.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ButtonAttribute(title=" + this.title + ", theme=" + this.theme + ", style=" + this.style + ", size=" + this.size + ", link=" + this.link + ")";
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public clearCookies(@Nullable String str, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onExtraCallback onextracallback, @Nullable onWarmupCompleted onwarmupcompleted, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.theme = onextracallbackwithresult;
        this.style = onextracallback;
        this.size = onwarmupcompleted;
        this.link = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ clearCookies(String str, onExtraCallbackWithResult onextracallbackwithresult, onExtraCallback onextracallback, onWarmupCompleted onwarmupcompleted, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        onExtraCallbackWithResult onextracallbackwithresult2;
        onExtraCallback onextracallback2;
        String str3 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult2 = null;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        if ((i & 4) != 0) {
            int i4 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            onextracallback2 = null;
        } else {
            onextracallback2 = onextracallback;
        }
        this(str3, onextracallbackwithresult2, onextracallback2, (i & 8) == 0 ? onwarmupcompleted : null, (i & 16) != 0 ? "" : str2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted = 1;

        @SerializedName("primary")
        public static final onExtraCallbackWithResult PRIMARY = new onExtraCallbackWithResult("PRIMARY", 0);

        @SerializedName("dark")
        public static final onExtraCallbackWithResult DARK = new onExtraCallbackWithResult("DARK", 1);

        @SerializedName("danger")
        public static final onExtraCallbackWithResult DANGER = new onExtraCallbackWithResult("DANGER", 2);

        @SerializedName("light")
        public static final onExtraCallbackWithResult LIGHT = new onExtraCallbackWithResult("LIGHT", 3);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {PRIMARY, DARK, DANGER, LIGHT};
            int i5 = i3 + 7;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i2 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onExtraCallback + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            int i4 = 85 / 0;
            return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onWarmupCompleted + 3;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 67 / 0;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final TdsButtonV1View.IAuthTabCallbackStub toTds() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                return TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
            }
            if (i2 == 2) {
                return TdsButtonV1View.IAuthTabCallbackStub.DARK;
            }
            if (i2 == 3) {
                return TdsButtonV1View.IAuthTabCallbackStub.DANGER;
            }
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0 ? i2 != 4 : i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = i3 + 31;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return TdsButtonV1View.IAuthTabCallbackStub.LIGHT;
            }
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.LIGHT;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        @SerializedName("fill")
        public static final onExtraCallback FILL = new onExtraCallback("FILL", 0);

        @SerializedName("weak")
        public static final onExtraCallback WEAK = new onExtraCallback("WEAK", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 87;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback onextracallback = FILL;
                onExtraCallback onextracallback2 = WEAK;
                onextracallbackArr = new onExtraCallback[3];
                onextracallbackArr[0] = onextracallback;
                onextracallbackArr[1] = onextracallback2;
            } else {
                onextracallbackArr = new onExtraCallback[]{FILL, WEAK};
            }
            int i4 = i2 + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallback + 55;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 58 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final TdsButtonV1View.IAuthTabCallbackDefault toTds() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted.$EnumSwitchMapping$0[ordinal()];
            if (i2 != 1) {
                int i3 = onExtraCallback + 91;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return TdsButtonV1View.IAuthTabCallbackDefault.WEAK;
            }
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
            int i5 = onExtraCallback + 25;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackDefault;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @SerializedName("big")
        public static final onWarmupCompleted BIG = new onWarmupCompleted("BIG", 0);

        @SerializedName("large")
        public static final onWarmupCompleted LARGE = new onWarmupCompleted("LARGE", 1);

        @SerializedName("medium")
        public static final onWarmupCompleted MEDIUM = new onWarmupCompleted("MEDIUM", 2);

        @SerializedName("tiny")
        public static final onWarmupCompleted TINY = new onWarmupCompleted("TINY", 3);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                onWarmupCompleted onwarmupcompleted = BIG;
                onWarmupCompleted onwarmupcompleted2 = LARGE;
                onWarmupCompleted onwarmupcompleted3 = MEDIUM;
                onWarmupCompleted onwarmupcompleted4 = TINY;
                onwarmupcompletedArr = new onWarmupCompleted[4];
                onwarmupcompletedArr[0] = onwarmupcompleted;
                onwarmupcompletedArr[0] = onwarmupcompleted2;
                onwarmupcompletedArr[2] = onwarmupcompleted3;
                onwarmupcompletedArr[2] = onwarmupcompleted4;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{BIG, LARGE, MEDIUM, TINY};
            }
            int i4 = i3 + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 49;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = IAuthTabCallback + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 22 / 0;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final TdsButtonV1View.onWarmupCompleted toTds() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                return TdsButtonV1View.onWarmupCompleted.XLARGE;
            }
            if (i2 == 2) {
                return TdsButtonV1View.onWarmupCompleted.LARGE;
            }
            int i3 = onExtraCallback + 53;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if (i2 == 3) {
                TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.MEDIUM;
                int i6 = onExtraCallback + 23;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return onwarmupcompleted;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = i4 + 21;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                TdsButtonV1View.onWarmupCompleted onwarmupcompleted2 = TdsButtonV1View.onWarmupCompleted.SMALL;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TdsButtonV1View.onWarmupCompleted onwarmupcompleted3 = TdsButtonV1View.onWarmupCompleted.SMALL;
            int i9 = onExtraCallback + 65;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 98 / 0;
            }
            return onwarmupcompleted3;
        }
    }
}
