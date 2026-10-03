package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSizeInByteForBitmap {
    public static final int $stable = 8;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("name")
    private final String name;

    @SerializedName("savingBox")
    private final BitmapUtilWhenMappings savingBox;

    @SerializedName("seedMoney")
    private final Long seedMoney;

    public getSizeInByteForBitmap() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSizeInByteForBitmap)) {
            return false;
        }
        getSizeInByteForBitmap getsizeinbyteforbitmap = (getSizeInByteForBitmap) obj;
        if (!Intrinsics.areEqual(this.savingBox, getsizeinbyteforbitmap.savingBox)) {
            int i4 = onExtraCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.seedMoney, getsizeinbyteforbitmap.seedMoney)) {
            return false;
        }
        if (Intrinsics.areEqual(this.name, getsizeinbyteforbitmap.name)) {
            return true;
        }
        int i5 = onExtraCallback + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getSizeInByteForBitmap.onNavigationEvent
            int r1 = r1 + 37
            int r2 = r1 % 128
            o.getSizeInByteForBitmap.onExtraCallback = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            o.BitmapUtilWhenMappings r1 = r7.savingBox
            if (r1 != 0) goto L28
            r1 = r3
            goto L1b
        L16:
            o.BitmapUtilWhenMappings r1 = r7.savingBox
            if (r1 != 0) goto L27
            r1 = r4
        L1b:
            int r2 = r2 + 41
            int r5 = r2 % 128
            o.getSizeInByteForBitmap.onNavigationEvent = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L25
            goto L2f
        L25:
            r3 = r4
            goto L2f
        L27:
            r3 = r4
        L28:
            int r1 = r1.hashCode()
            r6 = r3
            r3 = r1
            r1 = r6
        L2f:
            java.lang.Long r2 = r7.seedMoney
            if (r2 != 0) goto L3d
            int r2 = o.getSizeInByteForBitmap.onNavigationEvent
            int r2 = r2 + 31
            int r5 = r2 % 128
            o.getSizeInByteForBitmap.onExtraCallback = r5
            int r2 = r2 % r0
            goto L41
        L3d:
            int r4 = r2.hashCode()
        L41:
            java.lang.String r2 = r7.name
            if (r2 == 0) goto L52
            int r1 = o.getSizeInByteForBitmap.onNavigationEvent
            int r1 = r1 + 101
            int r5 = r1 % 128
            o.getSizeInByteForBitmap.onExtraCallback = r5
            int r1 = r1 % r0
            int r1 = r2.hashCode()
        L52:
            int r3 = r3 * 31
            int r3 = r3 + r4
            int r3 = r3 * 31
            int r3 = r3 + r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSizeInByteForBitmap.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutoSavingboxReq(savingBox=" + this.savingBox + ", seedMoney=" + this.seedMoney + ", name=" + this.name + ")";
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return str;
    }

    public getSizeInByteForBitmap(@Nullable BitmapUtilWhenMappings bitmapUtilWhenMappings, @Nullable Long l, @Nullable String str) {
        this.savingBox = bitmapUtilWhenMappings;
        this.seedMoney = l;
        this.name = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getSizeInByteForBitmap(BitmapUtilWhenMappings bitmapUtilWhenMappings, Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            bitmapUtilWhenMappings = null;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            l = null;
        }
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
            str = null;
        }
        this(bitmapUtilWhenMappings, l, str);
    }
}
