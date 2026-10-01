package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextPaint;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isBackgroundWorkRestricted {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final void onExtraCallbackWithResult(@NotNull BaseTextView baseTextView) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(baseTextView, "");
            Context context = baseTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            readIntokhttp.onExtraCallback(configuration);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(baseTextView, "");
        Context context2 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources2 = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (readIntokhttp.onExtraCallback(configuration2)) {
            TextPaint paint = baseTextView.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "");
            y1ExternalSyntheticLambda9.onNavigationEvent(paint, baseTextView.getWidth(), baseTextView.getHeight(), 315.0d, new int[]{Color.argb(255, 169, 236, 250), Color.argb(255, 157, 207, 254)}, new float[]{0.0f, 1.0f}, 0.0f, 0.0f, 96, (Object) null);
            return;
        }
        TextPaint paint2 = baseTextView.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint2, "");
        y1ExternalSyntheticLambda9.onNavigationEvent(paint2, baseTextView.getWidth(), baseTextView.getHeight(), 315.0d, new int[]{Color.argb(255, 21, 110, Imgproc.COLOR_RGB2YUV_YV12), Color.argb(255, 28, 103, 171)}, new float[]{0.0f, 1.0f}, 0.0f, 0.0f, 96, (Object) null);
        int i3 = onNavigationEvent + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
    }
}
