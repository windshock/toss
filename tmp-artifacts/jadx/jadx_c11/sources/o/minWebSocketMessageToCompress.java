package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class minWebSocketMessageToCompress {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View, java.lang.Object] */
    public static final TdsListHeaderV3View onNavigationEvent(@NotNull ViewGroup viewGroup, @NotNull Function1<? super TdsListHeaderV3View, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ?? tdsListHeaderV3View = new TdsListHeaderV3View(context, null, 0, 6, null);
        function1.invoke((Object) tdsListHeaderV3View);
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, (View) tdsListHeaderV3View);
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return tdsListHeaderV3View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
