package o;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NetworkFetcherFactoryExternalSyntheticLambda0 implements RealWeakMemoryCacheInternalValue {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final Map<String, Boolean> onWarmupCompleted = new LinkedHashMap();

    @Override // o.RealWeakMemoryCacheInternalValue
    public boolean onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        Boolean bool = this.onWarmupCompleted.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            int i4 = onExtraCallbackWithResult + 33;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            boolean z = i4 % 2 == 0;
            int i6 = i5 + 33;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }
        if (!onExtraCallback(th)) {
            int i8 = onExtraCallbackWithResult + 51;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[" + onExtraCallback() + "] " + str, th, (Map) null, 8, (Object) null);
        this.onWarmupCompleted.put(str, bool2);
        context.deleteSharedPreferences(str);
        return true;
    }

    private final boolean onExtraCallback(Throwable th) {
        int i = 2 % 2;
        String string = th.toString();
        if (!(th instanceof UtilsKtUseMinConstraintsMeasurePolicy1ExternalSyntheticLambda0)) {
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0 ? !StringsKt.contains$default(string, "Invalid data format", false, 2, (Object) null) : !StringsKt.contains$default(string, "Invalid data format", false, 4, (Object) null)) {
                int i3 = onExtraCallback + 119;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0 ? !StringsKt.contains$default(string, "Invalid encrypted data format", false, 2, (Object) null) : !StringsKt.contains$default(string, "Invalid encrypted data format", false, 4, (Object) null)) {
                    int i4 = onExtraCallback + 53;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 0;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return "InvalidDataFormatWorkaround";
    }
}
