package o;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q5a {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static int onWarmupCompleted = 1;
    public static final q5a onNavigationEvent = new q5a();
    private static final Set<String> onExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"slo_source", "proxy", "diagnostic", "data_quality_gate"});
    private static final Set<String> onExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"page_allowed", "observation_only"});

    private q5a() {
    }

    public final Set<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Set<String> set = onExtraCallbackWithResult;
        int i5 = i3 + 71;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    static {
        int i = onWarmupCompleted + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final Set<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Set<String> set = onExtraCallback;
        int i5 = i3 + 45;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return set;
    }

    public final Map<String, String> onExtraCallback() {
        Map<String, String> mapOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            mapOnWarmupCompleted = onWarmupCompleted("slo_source", "page_allowed");
            int i3 = 33 / 0;
        } else {
            mapOnWarmupCompleted = onWarmupCompleted("slo_source", "page_allowed");
        }
        int i4 = asBinder + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return mapOnWarmupCompleted;
    }

    public final Map<String, String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapOnWarmupCompleted = onWarmupCompleted("diagnostic", "observation_only");
        int i4 = asBinder + 19;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapOnWarmupCompleted = onWarmupCompleted("data_quality_gate", "observation_only");
        int i4 = asBinder + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return mapOnWarmupCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r4.equals("data_quality_gate") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r4.equals("diagnostic") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r4 = kotlin.jvm.internal.Intrinsics.areEqual(r5, "observation_only");
        r5 = o.q5a.asBinder + 37;
        o.q5a.asInterface = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if ((r5 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r4.equals("proxy") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (str.hashCode()) {
            case -1547904089:
                break;
            case -1075131776:
                break;
            case -1065386172:
                if (str.equals("slo_source")) {
                    boolean zAreEqual = Intrinsics.areEqual(str2, "page_allowed");
                    int i4 = asInterface + 71;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 8 / 0;
                    }
                    return zAreEqual;
                }
                return false;
            case 106941038:
                break;
            default:
                int i6 = asInterface + 7;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 2;
                }
                return false;
        }
    }

    private final Map<String, String> onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("sli_signal_type", str), getWrite.IAuthTabCallback("alert_policy", str2)});
        int i4 = asInterface + 89;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }
}
