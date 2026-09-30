package im.toss.define;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class TossAffiliate$IAuthTabCallback {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public /* synthetic */ TossAffiliate$IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TossAffiliate$IAuthTabCallback() {
    }

    public final TossAffiliate onExtraCallback(@NotNull String str) {
        Object next;
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator it = TossAffiliate.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.equals(((TossAffiliate) next).name(), str, true)) {
                int i4 = onExtraCallback + 63;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 18 / 0;
                }
            }
        }
        return (TossAffiliate) next;
    }
}
