package o;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NetworkFetcherFactoryExternalSyntheticLambda1 implements RealWeakMemoryCacheInternalValue {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final Map<String, Boolean> onExtraCallback = new LinkedHashMap();

    @Override // o.RealWeakMemoryCacheInternalValue
    public boolean onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        Boolean bool = this.onExtraCallback.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!IAuthTabCallback(th)) {
            return false;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[" + onExtraCallbackWithResult() + "] " + str, th, (Map) null, 8, (Object) null);
        this.onExtraCallback.put(str, bool2);
        context.deleteSharedPreferences(str);
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final boolean IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        boolean z = th instanceof ResourceIntMapper;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return "ForceUpgradePrefsCipherGenerationWorkaround";
    }
}
