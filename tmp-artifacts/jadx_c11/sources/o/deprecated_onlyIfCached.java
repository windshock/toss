package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_onlyIfCached {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final deprecated_minFreshSeconds onWarmupCompleted(@NotNull Context context, float f) {
        int iIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorControlHighlight});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateListOnNavigationEvent = ResourcesCompat.onNavigationEvent(context.getResources(), resourceId, context.getTheme());
        if (colorStateListOnNavigationEvent == null) {
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                iIAuthTabCallback = charset.onExtraCallbackWithResult.ICustomTabsService().onExtraCallbackWithResult();
                int i4 = onExtraCallbackWithResult + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iIAuthTabCallback = charset.onExtraCallbackWithResult.ICustomTabsService().IAuthTabCallback();
            }
            colorStateListOnNavigationEvent = ColorStateList.valueOf(iIAuthTabCallback);
            Intrinsics.checkNotNullExpressionValue(colorStateListOnNavigationEvent, "");
        }
        return new deprecated_minFreshSeconds(colorStateListOnNavigationEvent, f);
    }
}
