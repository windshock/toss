package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectableKtExternalSyntheticLambda0 {
    private static final int[] onExtraCallbackWithResult = {R.attr.state_checked};
    private static final int[] IAuthTabCallback = {-16842912};

    public static /* synthetic */ setByteOrder IAuthTabCallback(Context context, int i2, boolean z, Boolean bool, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            bool = null;
        }
        return IAuthTabCallback(context, i2, z, bool);
    }

    public static final setByteOrder IAuthTabCallback(@NotNull Context context, int i2, boolean z, @Nullable Boolean bool) {
        if (i2 == 0) {
            return null;
        }
        if (bool != null) {
            Configuration configuration = new Configuration();
            configuration.uiMode = bool.booleanValue() ? 32 : 16;
            context = context.createConfigurationContext(configuration);
        }
        try {
            ColorStateList colorStateList = ContextCompat.getColorStateList(context, i2);
            if (colorStateList == null) {
                return null;
            }
            return setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(colorStateList.getColorForState(z ? onExtraCallbackWithResult : IAuthTabCallback, colorStateList.getDefaultColor())));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final int[] onExtraCallback() {
        return onExtraCallbackWithResult;
    }
}
