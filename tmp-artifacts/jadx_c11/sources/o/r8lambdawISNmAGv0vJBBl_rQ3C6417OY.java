package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class r8lambdawISNmAGv0vJBBl_rQ3C6417OY {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final setOnQueryTextListener onExtraCallback;
    private final Integer onNavigationEvent;
    private final Integer onWarmupCompleted;

    public /* synthetic */ r8lambdawISNmAGv0vJBBl_rQ3C6417OY(Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, setonquerytextlistener);
    }

    private r8lambdawISNmAGv0vJBBl_rQ3C6417OY(Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener) {
        this.onWarmupCompleted = num;
        this.onNavigationEvent = num2;
        this.onExtraCallback = setonquerytextlistener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdawISNmAGv0vJBBl_rQ3C6417OY(Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        num = (i & 1) != 0 ? null : num;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 55;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            num2 = null;
        }
        if ((i & 4) != 0) {
            int i8 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 22 / 0;
            }
            int i10 = 2 % 2;
            setonquerytextlistener = null;
        }
        this(num, num2, setonquerytextlistener, defaultConstructorMarker2);
    }

    public Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.onWarmupCompleted;
        int i5 = i2 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.onNavigationEvent;
        int i4 = i3 + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public setOnQueryTextListener onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setOnQueryTextListener setonquerytextlistener = this.onExtraCallback;
        int i4 = i2 + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setonquerytextlistener;
    }
}
