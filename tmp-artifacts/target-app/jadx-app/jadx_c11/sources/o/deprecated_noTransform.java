package o;

import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_noTransform {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static final Drawable onExtraCallback(float f) {
        int i = 2 % 2;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder().setAllCorners(new deprecated_noCache()).setAllCornerSizes(f).build());
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return materialShapeDrawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
