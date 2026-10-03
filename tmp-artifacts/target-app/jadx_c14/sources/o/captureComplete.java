package o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class captureComplete {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final openURL account;
    private final ArrayList<NativeSettingsManagerSpec> doneList;

    @SerializedName("lastUpdated")
    private final String lastUpdatedString;
    private final ArrayList<NativeShareModuleSpec> transactions;

    public captureComplete() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof captureComplete)) {
            return false;
        }
        captureComplete capturecomplete = (captureComplete) obj;
        if (!Intrinsics.areEqual(this.doneList, capturecomplete.doneList)) {
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.transactions, capturecomplete.transactions)) {
            return false;
        }
        if (Intrinsics.areEqual(this.lastUpdatedString, capturecomplete.lastUpdatedString)) {
            return Intrinsics.areEqual(this.account, capturecomplete.account);
        }
        int i3 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[PHI: r1 r3 r4 r5
      0x0048: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r5v4 o.openURL) = (r5v0 o.openURL), (r5v5 o.openURL) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1 r3 r4
      0x003e: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003c, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.captureComplete.onExtraCallbackWithResult
            int r1 = r1 + 21
            int r2 = r1 % 128
            o.captureComplete.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L28
            java.util.ArrayList<o.NativeSettingsManagerSpec> r1 = r7.doneList
            int r1 = r1.hashCode()
            java.util.ArrayList<o.NativeShareModuleSpec> r3 = r7.transactions
            int r3 = r3.hashCode()
            java.lang.String r4 = r7.lastUpdatedString
            int r4 = r4.hashCode()
            o.openURL r5 = r7.account
            r6 = 2
            int r6 = r6 / r2
            if (r5 != 0) goto L48
            goto L3e
        L28:
            java.util.ArrayList<o.NativeSettingsManagerSpec> r1 = r7.doneList
            int r1 = r1.hashCode()
            java.util.ArrayList<o.NativeShareModuleSpec> r3 = r7.transactions
            int r3 = r3.hashCode()
            java.lang.String r4 = r7.lastUpdatedString
            int r4 = r4.hashCode()
            o.openURL r5 = r7.account
            if (r5 != 0) goto L48
        L3e:
            int r5 = o.captureComplete.onExtraCallbackWithResult
            int r5 = r5 + 113
            int r6 = r5 % 128
            o.captureComplete.onNavigationEvent = r6
            int r5 = r5 % r0
            goto L4c
        L48:
            int r2 = r5.hashCode()
        L4c:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.captureComplete.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTransactionOverview(doneList=" + this.doneList + ", transactions=" + this.transactions + ", lastUpdatedString=" + this.lastUpdatedString + ", account=" + this.account + ")";
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public captureComplete(@NotNull ArrayList<NativeSettingsManagerSpec> arrayList, @NotNull ArrayList<NativeShareModuleSpec> arrayList2, @NotNull String str, @Nullable openURL openurl) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.doneList = arrayList;
        this.transactions = arrayList2;
        this.lastUpdatedString = str;
        this.account = openurl;
    }

    public /* synthetic */ captureComplete(ArrayList arrayList, ArrayList arrayList2, String str, openURL openurl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            arrayList2 = new ArrayList();
            int i3 = 2 % 2;
        }
        str = (i & 4) != 0 ? "" : str;
        if ((i & 8) != 0) {
            int i4 = onNavigationEvent + 117;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 57;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            openurl = null;
        }
        this(arrayList, arrayList2, str, openurl);
    }

    public final ArrayList<NativeShareModuleSpec> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<NativeShareModuleSpec> arrayList = this.transactions;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return arrayList;
    }
}
