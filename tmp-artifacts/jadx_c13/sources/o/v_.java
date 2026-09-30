package o;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.setTopGuideFontStyle;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class v_ {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((!r4) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r3 = java.lang.Math.round(r3 / r5);
        r4 = o.v_.onExtraCallback + 123;
        o.v_.onExtraCallbackWithResult = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int onExtraCallback(int i, boolean z, float f) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
    }

    public static final List<setTopGuideFontStyle> onNavigationEvent(int i, boolean z) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 61;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i6 = i5 + 35;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i2 = 67;
        } else {
            i2 = 0;
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new setTopGuideFontStyle[]{new setTopGuideFontStyle.IAuthTabCallbackDefault(0, i, 0, i2, 5, (DefaultConstructorMarker) null), new setTopGuideFontStyle.onTransact(0, i, 1, (DefaultConstructorMarker) null)});
    }
}
