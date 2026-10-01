package o;

import android.content.Context;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isOnline implements RealWeakMemoryCacheInternalValue {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Map<String, Boolean> onExtraCallback = new LinkedHashMap();

    @Override // o.RealWeakMemoryCacheInternalValue
    public boolean onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.areEqual(this.onExtraCallback.get(str), Boolean.TRUE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        Boolean bool = this.onExtraCallback.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            return false;
        }
        BlackholeDecoderFactoryExternalSyntheticLambda0 blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult = BlackholeDecoderFactoryExternalSyntheticLambda0.Companion.onExtraCallbackWithResult();
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[" + onNavigationEvent() + "] " + str, th, (Map) null, 8, (Object) null);
        BlackholeDecoderFactoryExternalSyntheticLambda0.onExtraCallback(PushInfo.Companion.onExtraCallback(), new Object[]{blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult}, -484938128, PushInfo.Companion.onExtraCallback(), 484938128, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        this.onExtraCallback.put(str, bool2);
        if (!onWarmupCompleted(th)) {
            int i3 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 94 / 0;
            }
            return false;
        }
        int i5 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult.onWarmupCompleted();
            context.getSharedPreferences(str, 0).edit().clear().apply();
            return false;
        }
        blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult.onWarmupCompleted();
        context.getSharedPreferences(str, 0).edit().clear().apply();
        return true;
    }

    private final boolean onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        boolean z = th instanceof BitmapFactoryDecoderExternalSyntheticLambda2;
        if (i2 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 113;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "KeyStoreUnsupportedWorkaround";
    }
}
