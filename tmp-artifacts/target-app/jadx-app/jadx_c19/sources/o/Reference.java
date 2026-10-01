package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Reference {
    private static volatile boolean onWarmupCompleted = true;

    public static Drawable onNavigationEvent(Context context, Context context2, int i2) {
        return onExtraCallbackWithResult(context, context2, i2, null);
    }

    public static Drawable onWarmupCompleted(Context context, int i2, @Nullable Resources.Theme theme) {
        return onExtraCallbackWithResult(context, context, i2, theme);
    }

    private static Drawable onExtraCallbackWithResult(Context context, Context context2, int i2, @Nullable Resources.Theme theme) {
        try {
            if (onWarmupCompleted) {
                return onExtraCallback(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return ContextCompat.getDrawable(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            onWarmupCompleted = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return onExtraCallbackWithResult(context2, i2, theme);
    }

    private static Drawable onExtraCallback(Context context, int i2, @Nullable Resources.Theme theme) {
        if (theme != null) {
            context = new MediaMetadataCompat(context, theme);
        }
        return ITrustedWebActivityServiceStub.onExtraCallbackWithResult(context, i2);
    }

    private static Drawable onExtraCallbackWithResult(Context context, int i2, @Nullable Resources.Theme theme) {
        return ResourcesCompat.onExtraCallback(context.getResources(), i2, theme);
    }
}
