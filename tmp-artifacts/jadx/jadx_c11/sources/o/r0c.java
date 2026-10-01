package o;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r0c {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final r0c onWarmupCompleted = new r0c();
    private static final List<Float> onExtraCallback = CollectionsKt.listOf(new Float[]{Float.valueOf(0.6f), Float.valueOf(0.4f), Float.valueOf(0.2f)});

    private r0c() {
    }

    static {
        int i = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[PHI: r1
      0x0026: PHI (r1v9 java.util.List<java.lang.Float>) = (r1v4 java.util.List<java.lang.Float>), (r1v5 java.util.List<java.lang.Float>), (r1v10 java.util.List<java.lang.Float>) binds: [B:8:0x0019, B:10:0x001f, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 java.util.List<java.lang.Float>) = (r1v4 java.util.List<java.lang.Float>), (r1v10 java.util.List<java.lang.Float>) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float onWarmupCompleted(int i) {
        List<Float> list;
        Float fValueOf;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            list = onExtraCallback;
            int i4 = 74 / 0;
            if (i >= 0) {
                fValueOf = i < list.size() ? list.get(i) : Float.valueOf(((Number) CollectionsKt.last(list)).floatValue());
            }
        } else {
            list = onExtraCallback;
            if (i >= 0) {
            }
        }
        float fFloatValue = fValueOf.floatValue();
        int i5 = onNavigationEvent + 121;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return fFloatValue;
    }
}
