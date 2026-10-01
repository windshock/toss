package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.setByType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceValidationConfig implements setByType {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final String onExtraCallback;
    private final Map<String, String> onExtraCallbackWithResult;

    public ALCFaceValidationConfig(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = map;
    }

    @Override // o.setByType
    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i3 + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return str;
    }

    @Override // o.setByType
    public Map<String, String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setByType
    public setByType.onWarmupCompleted onExtraCallbackWithResult(@NotNull String str, @NotNull Map<String, String> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        setByType.onWarmupCompleted onwarmupcompleted = new setByType.onWarmupCompleted(str, map);
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }
}
