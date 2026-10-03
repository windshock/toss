package o;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeShareModuleSpec {
    public static final int $stable = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String date;
    private final ArrayList<NativeJSCHeapCaptureSpec> transactions;
    private final String year;

    public NativeShareModuleSpec() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 29;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!(obj instanceof NativeShareModuleSpec)) {
            int i7 = i2 + 43;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        NativeShareModuleSpec nativeShareModuleSpec = (NativeShareModuleSpec) obj;
        if (!Intrinsics.areEqual(this.year, nativeShareModuleSpec.year)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.date, nativeShareModuleSpec.date)) {
            int i9 = onWarmupCompleted + 119;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.transactions, nativeShareModuleSpec.transactions)) {
            return false;
        }
        int i11 = onWarmupCompleted + 63;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.year.hashCode() * 31) + this.date.hashCode()) * 31) + this.transactions.hashCode();
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DailyTransactionOverview(year=" + this.year + ", date=" + this.date + ", transactions=" + this.transactions + ")";
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public NativeShareModuleSpec(@NotNull String str, @NotNull String str2, @NotNull ArrayList<NativeJSCHeapCaptureSpec> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.year = str;
        this.date = str2;
        this.transactions = arrayList;
    }

    public /* synthetic */ NativeShareModuleSpec(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i7 = onNavigationEvent + 23;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            arrayList = new ArrayList();
            int i10 = onNavigationEvent + 11;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        }
        this(str, str2, arrayList);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.year;
        int i5 = i2 + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.date;
        int i5 = i3 + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ArrayList<NativeJSCHeapCaptureSpec> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<NativeJSCHeapCaptureSpec> arrayList = this.transactions;
        int i5 = i2 + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }
}
