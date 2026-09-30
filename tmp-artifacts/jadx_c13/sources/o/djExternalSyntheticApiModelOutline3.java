package o;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class djExternalSyntheticApiModelOutline3 {
    public static final boolean onNavigationEvent(@NotNull String str, boolean z) {
        String strOnNavigationEvent = djExternalSyntheticApiModelOutline2.onNavigationEvent(str);
        return strOnNavigationEvent != null ? Boolean.parseBoolean(strOnNavigationEvent) : z;
    }

    public static /* synthetic */ int onExtraCallbackWithResult(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = IntCompanionObject.MAX_VALUE;
        }
        return djExternalSyntheticApiModelOutline2.onExtraCallback(str, i, i2, i3);
    }

    public static final int onExtraCallback(@NotNull String str, int i, int i2, int i3) {
        return (int) djExternalSyntheticApiModelOutline2.onExtraCallback(str, i, i2, i3);
    }

    public static /* synthetic */ long onExtraCallback(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = LongCompanionObject.MAX_VALUE;
        }
        return djExternalSyntheticApiModelOutline2.onExtraCallback(str, j, j4, j3);
    }

    public static final long onNavigationEvent(@NotNull String str, long j, long j2, long j3) {
        String strOnNavigationEvent = djExternalSyntheticApiModelOutline2.onNavigationEvent(str);
        if (strOnNavigationEvent == null) {
            return j;
        }
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(strOnNavigationEvent);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strOnNavigationEvent + '\'').toString());
        }
        long jLongValue = longOrNull.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String onExtraCallback(@NotNull String str, @NotNull String str2) {
        String strOnNavigationEvent = djExternalSyntheticApiModelOutline2.onNavigationEvent(str);
        return strOnNavigationEvent == null ? str2 : strOnNavigationEvent;
    }
}
