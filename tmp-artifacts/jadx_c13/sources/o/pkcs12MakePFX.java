package o;

import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class pkcs12MakePFX<T> implements ScrollingPagerIndicator.IAuthTabCallback<T> {
    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(ScrollingPagerIndicator scrollingPagerIndicator, int i, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
            }
        }
        scrollingPagerIndicator.onExtraCallback(i, f);
    }
}
