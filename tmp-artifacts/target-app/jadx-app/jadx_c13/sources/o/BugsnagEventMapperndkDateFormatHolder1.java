package o;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BugsnagEventMapperndkDateFormatHolder1 {
    private static final boolean IAuthTabCallback = Build.MODEL.equals("DROID2");

    public static Rect onExtraCallbackWithResult(Point point, int i, int i2) {
        int i3 = point.x;
        int i4 = i / 2;
        int i5 = point.y;
        int i6 = i2 / 2;
        return new Rect(i3 - i4, i5 - i6, i3 + i4, i5 + i6);
    }

    public static void onExtraCallbackWithResult(Paint paint) {
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setAntiAlias(true);
        paint.setShadowLayer(1.5f, 0.5f, 0.0f, Color.HSVToColor(200, new float[]{0.0f, 0.0f, 0.0f}));
    }
}
