package o;

import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r2ExternalSyntheticLambda5 extends setAnimationText<OverviewItemInfo> {
    private static int IAuthTabCallback = 0;
    public static final r2ExternalSyntheticLambda5 onExtraCallback = new r2ExternalSyntheticLambda5();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 29;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private r2ExternalSyntheticLambda5() {
        super(Reflection.getOrCreateKotlinClass(OverviewItemInfo.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r6.equals("us") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r6.equals("kr") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        return im.toss.securities.widget.data.model.overview.OverviewItemInfo.Stock.Companion.serializer();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[PHI: r2
      0x0056: PHI (r2v5 int) = (r2v4 int), (r2v7 int) binds: [B:15:0x0054, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jp<OverviewItemInfo> onWarmupCompleted(@NotNull JsonElement jsonElement) {
        String strOnWarmupCompleted;
        int iHashCode;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonElement jsonElement2 = (JsonElement) initRenderFinish.onExtraCallbackWithResult(jsonElement).get("shareHoldingsType");
        if (jsonElement2 != null) {
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            JsonPrimitive jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement2);
            if (jsonPrimitiveOnNavigationEvent != null) {
                strOnWarmupCompleted = jsonPrimitiveOnNavigationEvent.onWarmupCompleted();
            } else {
                int i4 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                strOnWarmupCompleted = null;
            }
        }
        if (strOnWarmupCompleted != null) {
            int i6 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                iHashCode = strOnWarmupCompleted.hashCode();
                int i7 = 32 / 0;
                if (iHashCode != -1010136971) {
                    int i8 = onExtraCallbackWithResult + 55;
                    int i9 = i8 % 128;
                    onNavigationEvent = i9;
                    int i10 = i8 % 2;
                    if (iHashCode != 3431) {
                        if (iHashCode != 3742) {
                            int i11 = i9 + 1;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 == 0) {
                                throw null;
                            }
                            if (iHashCode == 3029699 && strOnWarmupCompleted.equals("bond")) {
                                int i12 = onExtraCallbackWithResult + 23;
                                onNavigationEvent = i12 % 128;
                                int i13 = i12 % 2;
                                jp<OverviewItemInfo> jpVarSerializer = OverviewItemInfo.Bond.Companion.serializer();
                                int i14 = onExtraCallbackWithResult + 35;
                                onNavigationEvent = i14 % 128;
                                int i15 = i14 % 2;
                                return jpVarSerializer;
                            }
                        }
                    }
                } else if (strOnWarmupCompleted.equals("option")) {
                    return OverviewItemInfo.Option.Companion.serializer();
                }
            } else {
                iHashCode = strOnWarmupCompleted.hashCode();
                if (iHashCode != -1010136971) {
                }
            }
        }
        throw new IllegalArgumentException("Unknown shareHoldingsType: " + strOnWarmupCompleted);
    }
}
