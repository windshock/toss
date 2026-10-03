package o;

import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class bringChildToFront implements Serializable {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private String displayName;
    private String icon;
    private long id;
    private String key;
    private String name;
    private onExtraCallbackWithResult type;

    public String toString() {
        int i = 2 % 2;
        String str = "Link(id=" + this.id + ", key=" + this.key + ", type=" + this.type + ", name=" + this.name + ", icon=" + this.icon + ")";
        int i2 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public bringChildToFront(long j, @NotNull String str, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = j;
        this.key = str;
        this.type = onextracallbackwithresult;
        this.name = str2;
        this.icon = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bringChildToFront(long j, String str, onExtraCallbackWithResult onextracallbackwithresult, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        String str5;
        String str6;
        long j2 = (i & 1) != 0 ? 0L : j;
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i & 8) != 0) {
            int i5 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 16) != 0) {
            int i6 = 2 % 2;
            str6 = "";
        } else {
            str6 = str3;
        }
        this(j2, str4, onextracallbackwithresult, str5, str6);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i2 + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final onExtraCallbackWithResult onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.icon;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.displayName;
        int i5 = i2 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;

        @SerializedName("ACCOUNT")
        public static final onExtraCallbackWithResult ACCOUNT;
        private static char[] IAuthTabCallback;

        @SerializedName("PHONE")
        public static final onExtraCallbackWithResult PHONE;
        public static final onExtraCallbackWithResult UNKNOWN;

        @SerializedName("USER")
        public static final onExtraCallbackWithResult USER;
        private static int onExtraCallbackWithResult;
        private static long onNavigationEvent;
        private static final byte[] $$a = {121, -58, 81, 67};
        private static final int $$b = 132;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, short r8) {
            /*
                byte[] r0 = o.bringChildToFront.onExtraCallbackWithResult.$$a
                int r6 = r6 * 3
                int r6 = 97 - r6
                int r8 = r8 * 3
                int r8 = 1 - r8
                int r7 = r7 * 3
                int r7 = 3 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r5 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r3 = r0[r7]
            L28:
                int r6 = r6 + r3
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bringChildToFront.onExtraCallbackWithResult.$$c(int, int, short):java.lang.String");
        }

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return new onExtraCallbackWithResult[]{USER, PHONE, ACCOUNT, UNKNOWN};
            }
            onExtraCallbackWithResult onextracallbackwithresult = USER;
            onExtraCallbackWithResult onextracallbackwithresult2 = PHONE;
            onExtraCallbackWithResult onextracallbackwithresult3 = ACCOUNT;
            onExtraCallbackWithResult onextracallbackwithresult4 = UNKNOWN;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[3];
            onextracallbackwithresultArr[1] = onextracallbackwithresult;
            onextracallbackwithresultArr[1] = onextracallbackwithresult2;
            onextracallbackwithresultArr[2] = onextracallbackwithresult3;
            onextracallbackwithresultArr[3] = onextracallbackwithresult4;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 67;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i4 = i2 + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult = 0;
            onNavigationEvent();
            USER = new onExtraCallbackWithResult("USER", 0);
            PHONE = new onExtraCallbackWithResult("PHONE", 1);
            ACCOUNT = new onExtraCallbackWithResult("ACCOUNT", 2);
            Object[] objArr = new Object[1];
            a(Color.alpha(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr);
            UNKNOWN = new onExtraCallbackWithResult(((String) objArr[0]).intern(), 3);
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallbackStub + 113;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x0343  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0344  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r38, int r39, char r40, java.lang.Object[] r41) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 845
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bringChildToFront.onExtraCallbackWithResult.a(int, int, char, java.lang.Object[]):void");
        }

        static void onNavigationEvent() {
            IAuthTabCallback = new char[]{60801, 52480, 44203, 35924, 28659, 20097, 11782};
            onNavigationEvent = -1353075488442561202L;
        }
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.type != onExtraCallbackWithResult.USER || !Intrinsics.areEqual(this.key, PlayerErrorCode.onMinimized())) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int iHashCode = (this.id + this.key).hashCode();
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 109;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj != null) {
            int i7 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                cls = obj.getClass();
                int i8 = 35 / 0;
            } else {
                cls = obj.getClass();
            }
        } else {
            int i9 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 5;
            }
            cls = null;
        }
        if (!Intrinsics.areEqual(bringChildToFront.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        bringChildToFront bringchildtofront = (bringChildToFront) obj;
        if (this.id != bringchildtofront.id || !Intrinsics.areEqual(this.key, bringchildtofront.key)) {
            return false;
        }
        int i11 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 44 / 0;
        }
        return true;
    }
}
