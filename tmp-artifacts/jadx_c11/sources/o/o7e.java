package o;

import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class o7e extends SupportedOutputSizesSorterLegacy<o8> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final Map<String, Object> onExtraCallback;
    private final readBomAsCharset onNavigationEvent;
    private final Function0<Unit> onWarmupCompleted;

    public o7e(@NotNull readBomAsCharset readbomascharset, @NotNull Map<String, ? extends Object> map, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = readbomascharset;
        this.onExtraCallback = map;
        this.onWarmupCompleted = function0;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        o8 o8VarIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            o8VarIAuthTabCallback = IAuthTabCallback();
            int i3 = 52 / 0;
        } else {
            o8VarIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return o8VarIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((o8) onwarmupcompleted);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        int i5 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public o8 IAuthTabCallback() {
        int i = 2 % 2;
        o8 o8Var = new o8(this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted);
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return o8Var;
    }

    public void IAuthTabCallback(@NotNull o8 o8Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(o8Var, "");
            o8Var.onExtraCallback(this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted);
            int i3 = 61 / 0;
        } else {
            Intrinsics.checkNotNullParameter(o8Var, "");
            o8Var.onExtraCallback(this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted);
        }
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            if (obj instanceof o7e) {
                o7e o7eVar = (o7e) obj;
                if (!Intrinsics.areEqual(this.onNavigationEvent, o7eVar.onNavigationEvent) || !Intrinsics.areEqual(this.onExtraCallback, o7eVar.onExtraCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, o7eVar.onWarmupCompleted)) {
                    return false;
                }
                int i4 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = i3 + 89;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 15;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        boolean z = obj instanceof o7e;
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHash = Objects.hash(this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted);
        int i4 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return iHash;
    }
}
