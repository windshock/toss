package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class notifyTaskFinished {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("groups")
    private final List<notifyTaskRetry> groups;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r5 instanceof o.notifyTaskFinished) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.groups, ((o.notifyTaskFinished) r5).groups) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r5 = o.notifyTaskFinished.onExtraCallback + 5;
        o.notifyTaskFinished.onNavigationEvent = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.notifyTaskFinished.onExtraCallback
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            o.notifyTaskFinished.onNavigationEvent = r3
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L15
            r1 = 75
            int r1 = r1 / r3
            if (r4 != r5) goto L18
            goto L17
        L15:
            if (r4 != r5) goto L18
        L17:
            return r2
        L18:
            boolean r1 = r5 instanceof o.notifyTaskFinished
            if (r1 == 0) goto L33
            o.notifyTaskFinished r5 = (o.notifyTaskFinished) r5
            java.util.List<o.notifyTaskRetry> r1 = r4.groups
            java.util.List<o.notifyTaskRetry> r5 = r5.groups
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L29
            return r3
        L29:
            int r5 = o.notifyTaskFinished.onExtraCallback
            int r5 = r5 + 5
            int r1 = r5 % 128
            o.notifyTaskFinished.onNavigationEvent = r1
            int r5 = r5 % r0
            return r2
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.notifyTaskFinished.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.groups.hashCode();
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FangirlSavingBoxGroups(groups=" + this.groups + ")";
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<notifyTaskRetry> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<notifyTaskRetry> list = this.groups;
        int i4 = i3 + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }
}
