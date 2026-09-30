package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GraniteModule_closeView {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static final GraniteBrownfieldModule_closeView onExtraCallback(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = new GraniteBrownfieldModule_closeView(charSequence);
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return graniteBrownfieldModule_closeView;
    }
}
