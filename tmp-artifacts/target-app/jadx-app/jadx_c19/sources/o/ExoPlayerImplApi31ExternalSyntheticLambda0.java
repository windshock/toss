package o;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExoPlayerImplApi31ExternalSyntheticLambda0 {
    private final ArrayList<Path> IAuthTabCallback;
    private final int[][] onExtraCallbackWithResult;
    private final Paint onWarmupCompleted;

    public ExoPlayerImplApi31ExternalSyntheticLambda0(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.IAuthTabCallback = arrayList;
        this.onExtraCallbackWithResult = new int[256][];
        this.onWarmupCompleted = paint;
        arrayList.add(new Path());
    }

    public Path onWarmupCompleted(char c, String str) {
        Path path;
        int iOnExtraCallback = onExtraCallback(c);
        if (iOnExtraCallback != 0) {
            path = this.IAuthTabCallback.get(iOnExtraCallback);
        } else {
            Path path2 = new Path();
            this.onWarmupCompleted.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.onExtraCallbackWithResult;
            int i2 = c >> '\b';
            int[] iArr2 = iArr[i2];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i2] = iArr2;
            }
            iArr2[c & 255] = this.IAuthTabCallback.size();
            this.IAuthTabCallback.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }

    private int onExtraCallback(char c) {
        int[] iArr = this.onExtraCallbackWithResult[c >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c & 255];
    }
}
