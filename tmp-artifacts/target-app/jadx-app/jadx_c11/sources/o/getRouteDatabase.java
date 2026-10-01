package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getRouteDatabase {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, im.toss.tds.view.compat.component.compound.top.TdsTopV2View, java.lang.Object] */
    public static final TdsTopV2View IAuthTabCallback(@NotNull ViewGroup viewGroup, @NotNull Function1<? super TdsTopV2View, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ?? tdsTopV2View = new TdsTopV2View(context, null, 0, 6, null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        layoutParams.width = -1;
        tdsTopV2View.setLayoutParams(layoutParams);
        function1.invoke((Object) tdsTopV2View);
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, (View) tdsTopV2View);
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return tdsTopV2View;
    }
}
