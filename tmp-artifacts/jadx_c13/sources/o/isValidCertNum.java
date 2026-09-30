package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isValidCertNum {
    private static transV2ExportCert onNavigationEvent;
    private static String onWarmupCompleted;
    public static final isValidCertNum onExtraCallbackWithResult = new isValidCertNum();
    private static final Map<String, Function0<transV2ExportCert>> onExtraCallback = new LinkedHashMap();

    private isValidCertNum() {
    }

    public final void onExtraCallback(@NotNull String str, @NotNull Function0<? extends transV2ExportCert> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        onExtraCallback.put(str, function0);
    }

    public final transV2ExportCert onNavigationEvent() {
        String str = onWarmupCompleted;
        if (str != null) {
            Function0<transV2ExportCert> function0 = onExtraCallback.get(str);
            if (function0 != null) {
                return function0.invoke();
            }
            return null;
        }
        transV2ExportCert transv2exportcert = onNavigationEvent;
        if (transv2exportcert != null) {
            return transv2exportcert;
        }
        Function0 function02 = (Function0) CollectionsKt___CollectionsKt.firstOrNull(onExtraCallback.values());
        if (function02 != null) {
            return (transV2ExportCert) function02.invoke();
        }
        return null;
    }

    public final void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted = str;
    }

    public final List<String> onExtraCallback() {
        return CollectionsKt___CollectionsKt.toList(onExtraCallback.keySet());
    }
}
