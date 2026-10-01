package o;

import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class D_ {
    public static final D_ IAuthTabCallback = new D_();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 37;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private D_() {
    }

    public final Integer[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Integer[] numArr = {Integer.valueOf(R.drawable.right_diagonal_pattern_thumbnail), Integer.valueOf(R.drawable.left_diagonal_grid_pattern_01_thumbnail), Integer.valueOf(R.drawable.vertical_pattern_thumbnail), Integer.valueOf(R.drawable.left_diagonal_grid_pattern_02_thumbnail), Integer.valueOf(R.drawable.grid_pattern_thumbnail), Integer.valueOf(R.drawable.left_diagonal_pattern_thumbnail), Integer.valueOf(R.drawable.right_diagonal_grid_pattern_01_thumbnail), Integer.valueOf(R.drawable.horizontal_pattern_thumbnail), Integer.valueOf(R.drawable.right_diagonal_grid_pattern_02_thumbnail)};
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return numArr;
    }

    public final Integer[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Integer[] numArr = {Integer.valueOf(R.drawable.right_diagonal_pattern), Integer.valueOf(R.drawable.left_diagonal_grid_pattern_01), Integer.valueOf(R.drawable.vertical_pattern), Integer.valueOf(R.drawable.left_diagonal_grid_pattern_02), Integer.valueOf(R.drawable.grid_pattern), Integer.valueOf(R.drawable.left_diagonal_pattern), Integer.valueOf(R.drawable.right_diagonal_grid_pattern_01), Integer.valueOf(R.drawable.horizontal_pattern), Integer.valueOf(R.drawable.right_diagonal_grid_pattern_02)};
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return numArr;
        }
        throw null;
    }
}
