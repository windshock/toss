package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class MaxNativeAdListener<T> extends r8lambdawISNmAGv0vJBBl_rQ3C6417OY {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final Integer onExtraCallback;
    private final setOnQueryTextListener onNavigationEvent;
    private final Integer onWarmupCompleted;

    public /* synthetic */ MaxNativeAdListener(Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, setonquerytextlistener);
    }

    public abstract T onWarmupCompleted();

    private MaxNativeAdListener(Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener) {
        super(null, null, null, 7, null);
        this.onWarmupCompleted = num;
        this.onExtraCallback = num2;
        this.onNavigationEvent = setonquerytextlistener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MaxNativeAdListener(Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                defaultConstructorMarker2.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            num2 = null;
        }
        this(num, num2, (i & 4) != 0 ? null : setonquerytextlistener, defaultConstructorMarker2);
    }

    @Override // o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Integer num = this.onWarmupCompleted;
        int i5 = i3 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    @Override // o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallback;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return num;
    }

    @Override // o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public setOnQueryTextListener onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        setOnQueryTextListener setonquerytextlistener = this.onNavigationEvent;
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return setonquerytextlistener;
    }
}
