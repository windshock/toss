package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignForPKCS7AppCertAndVIDR {
    private static Function0<? extends getSignForPKCS7NoContents> IAuthTabCallback;
    private static String onExtraCallback;
    private static getSignForPKCS7NoContents onNavigationEvent;
    public static final getSignForPKCS7AppCertAndVIDR onExtraCallbackWithResult = new getSignForPKCS7AppCertAndVIDR();
    private static final Map<String, Function0<getSignForPKCS7NoContents>> onWarmupCompleted = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final getSignForPKCS7NoContents onWarmupCompleted(getSignForPKCS7NoContents getsignforpkcs7nocontents) {
        return getsignforpkcs7nocontents;
    }

    private getSignForPKCS7AppCertAndVIDR() {
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull Function0<? extends getSignForPKCS7NoContents> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        onWarmupCompleted.put(str, function0);
    }

    public final void onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback = str;
    }

    public final List<String> onExtraCallbackWithResult() {
        return CollectionsKt___CollectionsKt.toList(onWarmupCompleted.keySet());
    }

    public final getSignForPKCS7NoContents onNavigationEvent() {
        String str = onExtraCallback;
        if (str != null) {
            Function0<getSignForPKCS7NoContents> function0 = onWarmupCompleted.get(str);
            if (function0 != null) {
                return function0.invoke();
            }
            return null;
        }
        Function0<? extends getSignForPKCS7NoContents> function02 = IAuthTabCallback;
        if (function02 != null) {
            return function02.invoke();
        }
        getSignForPKCS7NoContents getsignforpkcs7nocontents = onNavigationEvent;
        if (getsignforpkcs7nocontents != null) {
            return getsignforpkcs7nocontents;
        }
        Function0 function03 = (Function0) CollectionsKt___CollectionsKt.firstOrNull(onWarmupCompleted.values());
        if (function03 != null) {
            return (getSignForPKCS7NoContents) function03.invoke();
        }
        return null;
    }
}
