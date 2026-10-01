package o;

import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryActivity2 {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public TTHistoryActivity2 next;
    public boolean owner;
    public int pos;
    public TTHistoryActivity2 prev;
    public boolean shared;

    public TTHistoryActivity2() {
        this.data = new byte[SIZE];
        this.owner = true;
        this.shared = false;
    }

    public TTHistoryActivity2(@NotNull byte[] bArr, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }

    public final TTHistoryActivity2 IAuthTabCallback() {
        this.shared = true;
        return new TTHistoryActivity2(this.data, this.pos, this.limit, true, false);
    }

    public final TTHistoryActivity2 onNavigationEvent() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return new TTHistoryActivity2(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final TTHistoryActivity2 onExtraCallback() {
        TTHistoryActivity2 tTHistoryActivity2 = this.next;
        if (tTHistoryActivity2 == this) {
            tTHistoryActivity2 = null;
        }
        TTHistoryActivity2 tTHistoryActivity22 = this.prev;
        Intrinsics.checkNotNull(tTHistoryActivity22);
        tTHistoryActivity22.next = this.next;
        TTHistoryActivity2 tTHistoryActivity23 = this.next;
        Intrinsics.checkNotNull(tTHistoryActivity23);
        tTHistoryActivity23.prev = this.prev;
        this.next = null;
        this.prev = null;
        return tTHistoryActivity2;
    }

    public final TTHistoryActivity2 onNavigationEvent(@NotNull TTHistoryActivity2 tTHistoryActivity2) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity2, "");
        tTHistoryActivity2.prev = this;
        tTHistoryActivity2.next = this.next;
        TTHistoryActivity2 tTHistoryActivity22 = this.next;
        Intrinsics.checkNotNull(tTHistoryActivity22);
        tTHistoryActivity22.prev = tTHistoryActivity2;
        this.next = tTHistoryActivity2;
        return tTHistoryActivity2;
    }

    public final TTHistoryActivity2 onNavigationEvent(int i) {
        TTHistoryActivity2 tTHistoryActivity2OnWarmupCompleted;
        if (i <= 0 || i > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i >= 1024) {
            tTHistoryActivity2OnWarmupCompleted = IAuthTabCallback();
        } else {
            tTHistoryActivity2OnWarmupCompleted = TTHistoryActivity.onWarmupCompleted();
            byte[] bArr = this.data;
            byte[] bArr2 = tTHistoryActivity2OnWarmupCompleted.data;
            int i2 = this.pos;
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
        }
        tTHistoryActivity2OnWarmupCompleted.limit = tTHistoryActivity2OnWarmupCompleted.pos + i;
        this.pos += i;
        TTHistoryActivity2 tTHistoryActivity2 = this.prev;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        tTHistoryActivity2.onNavigationEvent(tTHistoryActivity2OnWarmupCompleted);
        return tTHistoryActivity2OnWarmupCompleted;
    }

    public final void onWarmupCompleted() {
        int i;
        TTHistoryActivity2 tTHistoryActivity2 = this.prev;
        if (tTHistoryActivity2 == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(tTHistoryActivity2);
        if (tTHistoryActivity2.owner) {
            int i2 = this.limit - this.pos;
            TTHistoryActivity2 tTHistoryActivity22 = this.prev;
            Intrinsics.checkNotNull(tTHistoryActivity22);
            int i3 = tTHistoryActivity22.limit;
            TTHistoryActivity2 tTHistoryActivity23 = this.prev;
            Intrinsics.checkNotNull(tTHistoryActivity23);
            if (tTHistoryActivity23.shared) {
                i = 0;
            } else {
                TTHistoryActivity2 tTHistoryActivity24 = this.prev;
                Intrinsics.checkNotNull(tTHistoryActivity24);
                i = tTHistoryActivity24.pos;
            }
            if (i2 > (8192 - i3) + i) {
                return;
            }
            TTHistoryActivity2 tTHistoryActivity25 = this.prev;
            Intrinsics.checkNotNull(tTHistoryActivity25);
            onWarmupCompleted(tTHistoryActivity25, i2);
            onExtraCallback();
            TTHistoryActivity.onExtraCallback(this);
        }
    }

    public final void onWarmupCompleted(@NotNull TTHistoryActivity2 tTHistoryActivity2, int i) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity2, "");
        if (!tTHistoryActivity2.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = tTHistoryActivity2.limit;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (tTHistoryActivity2.shared) {
                throw new IllegalArgumentException();
            }
            int i4 = tTHistoryActivity2.pos;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = tTHistoryActivity2.data;
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (Object) null);
            tTHistoryActivity2.limit -= tTHistoryActivity2.pos;
            tTHistoryActivity2.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = tTHistoryActivity2.data;
        int i5 = tTHistoryActivity2.limit;
        int i6 = this.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr3, i5, i6, i6 + i);
        tTHistoryActivity2.limit += i;
        this.pos += i;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
