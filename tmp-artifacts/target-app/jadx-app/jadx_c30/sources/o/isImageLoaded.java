package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isImageLoaded {
    public static /* synthetic */ AUPop onNavigationEvent(String str, long j, startScroll startscroll, getCurrY getcurry, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return onNavigationEvent(str, j, startscroll, getcurry, z);
    }

    public static final AUPop onNavigationEvent(@NotNull String str, long j, @Nullable startScroll startscroll, @NotNull getCurrY getcurry, boolean z) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(getcurry, BuildConfig.FLAVOR);
        String strAsBinder = getcurry.asBinder();
        String strOnNavigationEvent = getcurry.onNavigationEvent();
        Integer intOrNull = StringsKt.toIntOrNull(getcurry.onTransact());
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        if (z) {
            startscroll = null;
        }
        return new AUPop(str, j, strAsBinder, strOnNavigationEvent, iIntValue, startscroll, getcurry.IAuthTabCallback());
    }
}
