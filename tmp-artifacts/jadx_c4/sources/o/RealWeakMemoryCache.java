package o;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealWeakMemoryCache implements RealWeakMemoryCacheInternalValue {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Map<String, Boolean> onWarmupCompleted = new LinkedHashMap();

    @Override // o.RealWeakMemoryCacheInternalValue
    public boolean onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        Boolean bool = this.onWarmupCompleted.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 97;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 50 / 0;
            }
            return false;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[" + onWarmupCompleted() + "] - " + str, th, (Map) null, 8, (Object) null);
        this.onWarmupCompleted.put(str, bool2);
        context.deleteSharedPreferences(str);
        return true;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return "ForceResetWorkaround";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
