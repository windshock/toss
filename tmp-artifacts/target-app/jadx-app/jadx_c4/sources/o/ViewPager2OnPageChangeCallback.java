package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ViewPager2OnPageChangeCallback {
    private static int IAuthTabCallbackDefault = 0;
    private static int onExtraCallback = 0;
    private static volatile IAuthTabCallback onNavigationEvent = null;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    public static final ViewPager2OnPageChangeCallback onExtraCallbackWithResult = new ViewPager2OnPageChangeCallback();
    public static final int IAuthTabCallback = 8;

    public interface IAuthTabCallback {
        Function0<Unit> IAuthTabCallback(@NotNull ViewGroup viewGroup, @NotNull Map<View, String> map);

        QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3);

        QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull ViewPager2RecyclerViewImpl viewPager2RecyclerViewImpl, @NotNull String str, @NotNull String str2, @Nullable String str3);
    }

    static {
        int i = onExtraCallback + 103;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ViewPager2OnPageChangeCallback() {
    }

    public final IAuthTabCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = onNavigationEvent;
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }
}
