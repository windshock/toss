package o;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import o.DetectFaceInSingleImage;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdasB_LrbIgfHXljyqs4eATzyvOzGA {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final r8lambdasB_LrbIgfHXljyqs4eATzyvOzGA onWarmupCompleted = new r8lambdasB_LrbIgfHXljyqs4eATzyvOzGA();
    private static final AtomicInteger onExtraCallback = new AtomicInteger(0);

    public static /* synthetic */ CharSequence onExtraCallback(loadNextAdForAdToken loadnextadforadtoken) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(loadnextadforadtoken);
        int i4 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return charSequenceOnExtraCallbackWithResult;
    }

    public final void onExtraCallbackWithResult(@NotNull Map<String, ? extends Object> map, @NotNull Map<String, ? extends Set<? extends loadNextAdForAdToken>> map2, @NotNull DetectFaceInSingleImage.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int i4 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private r8lambdasB_LrbIgfHXljyqs4eATzyvOzGA() {
    }

    static {
        int i = onNavigationEvent + 95;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private static final CharSequence onExtraCallbackWithResult(loadNextAdForAdToken loadnextadforadtoken) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(loadnextadforadtoken, "");
            loadnextadforadtoken.getLabel();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(loadnextadforadtoken, "");
        String label = loadnextadforadtoken.getLabel();
        int i3 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return label;
        }
        throw null;
    }
}
