package o;

import android.graphics.RuntimeShader;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class setImageAssetDelegate {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ RuntimeShader qz_(String str) {
        int i = 2 % 2;
        RuntimeShader runtimeShader = new RuntimeShader(str);
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return runtimeShader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
