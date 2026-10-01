package o;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealWeakMemoryCacheCompanion implements RealWeakMemoryCacheInternalValue {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final Map<String, Boolean> IAuthTabCallback = new LinkedHashMap();

    @Override // o.RealWeakMemoryCacheInternalValue
    public boolean onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        Boolean bool = this.IAuthTabCallback.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            return false;
        }
        if (!onNavigationEvent(th)) {
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[" + onWarmupCompleted() + "] " + str, th, (Map) null, 8, (Object) null);
        this.IAuthTabCallback.put(str, bool2);
        context.deleteSharedPreferences(str);
        int i4 = onNavigationEvent + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return true;
    }

    private final boolean onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = th instanceof UtilsKtExternalSyntheticLambda1;
        int i5 = i3 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "CryptoOperationExceptionWorkaround";
    }
}
