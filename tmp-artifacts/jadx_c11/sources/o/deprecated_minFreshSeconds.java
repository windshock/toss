package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_minFreshSeconds extends RippleDrawable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deprecated_minFreshSeconds(@NotNull ColorStateList colorStateList, float f) {
        super(colorStateList, null, deprecated_noTransform.onExtraCallback(f));
        Intrinsics.checkNotNullParameter(colorStateList, "");
    }
}
