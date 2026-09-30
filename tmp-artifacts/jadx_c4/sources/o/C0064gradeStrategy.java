package o;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.gradeStrategy, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0064gradeStrategy {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<onWarmupCompleted> onNavigationEvent;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r5 instanceof o.C0064gradeStrategy) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.onNavigationEvent, ((o.C0064gradeStrategy) r5).onNavigationEvent) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r5 = o.C0064gradeStrategy.onExtraCallbackWithResult + 29;
        o.C0064gradeStrategy.onWarmupCompleted = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if ((r5 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r5 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.onNavigationEvent.hashCode();
            int i3 = 77 / 0;
        } else {
            iHashCode = this.onNavigationEvent.hashCode();
        }
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditDescriptions(items=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public C0064gradeStrategy(@NotNull List<onWarmupCompleted> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    public final List<onWarmupCompleted> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0064gradeStrategy(@NotNull onWarmupCompleted... onwarmupcompletedArr) {
        this((List<onWarmupCompleted>) ArraysKt.toList(onwarmupcompletedArr));
        Intrinsics.checkNotNullParameter(onwarmupcompletedArr, "");
    }

    /* renamed from: o.gradeStrategy$onWarmupCompleted */
    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final String IAuthTabCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                return false;
            }
            int i4 = onExtraCallbackWithResult + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onExtraCallback = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.IAuthTabCallback.hashCode() >>> 24) * this.onWarmupCompleted.hashCode() : (this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode();
            int i3 = onExtraCallbackWithResult + 31;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ContentItem(text=" + this.IAuthTabCallback + ", iconUrl=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = str2;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
