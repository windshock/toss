package o;

import im.toss.tds.compose.foundation.anim.rally.RallyKeyframesSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class setMainImage<T> extends r8lambdawISNmAGv0vJBBl_rQ3C6417OY {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Integer IAuthTabCallback;
    private final setOnQueryTextListener onExtraCallback;
    private final RallyKeyframesSpec<T> onExtraCallbackWithResult;

    public /* synthetic */ setMainImage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private setMainImage() {
        super(null, null, null, 7, null);
    }

    @Override // o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Integer num = this.IAuthTabCallback;
        int i5 = i3 + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    @Override // o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public setOnQueryTextListener onNavigationEvent() {
        setOnQueryTextListener setonquerytextlistener;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            setonquerytextlistener = this.onExtraCallback;
            int i4 = 33 / 0;
        } else {
            setonquerytextlistener = this.onExtraCallback;
        }
        int i5 = i3 + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return setonquerytextlistener;
    }

    public RallyKeyframesSpec<T> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 43;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        RallyKeyframesSpec<T> rallyKeyframesSpec = this.onExtraCallbackWithResult;
        int i4 = i2 + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return rallyKeyframesSpec;
    }
}
