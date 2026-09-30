package o;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class varyFields {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r5
      0x002c: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v7 java.lang.Object) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onWarmupCompleted(@NotNull Context context) {
        Object systemService;
        AccessibilityManager accessibilityManager;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            systemService = context.getSystemService("accessibility");
            int i3 = 6 / 0;
            if (systemService instanceof AccessibilityManager) {
                accessibilityManager = (AccessibilityManager) systemService;
                int i4 = IAuthTabCallback + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                accessibilityManager = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            systemService = context.getSystemService("accessibility");
            if (systemService instanceof AccessibilityManager) {
            }
        }
        return (accessibilityManager == null || (accessibilityManager.isEnabled() ^ true) || !accessibilityManager.isTouchExplorationEnabled()) ? false : true;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, float f, Float f2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 4) != 0) {
            f2 = null;
        }
        float fOnWarmupCompleted = onWarmupCompleted(accessgettlsversionsasstringp, f, f2);
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return fOnWarmupCompleted;
    }

    public static final float onWarmupCompleted(@NotNull accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, float f, @Nullable Float f2) {
        float fIntValue;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
        if (f2 != null) {
            fIntValue = f2.floatValue();
            int i3 = IAuthTabCallback + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            fIntValue = CipherSuiteCompanionORDER_BY_NAME1.onExtraCallback().onExtraCallback(accessgettlsversionsasstringp.getSize()).intValue();
        }
        return RangesKt.coerceAtMost(getTcfVendorConsentStatus.Companion.asBinder().onNavigationEvent(f).onNavigationEvent(accessgettlsversionsasstringp.getSize()), fIntValue) / accessgettlsversionsasstringp.getSize();
    }
}
