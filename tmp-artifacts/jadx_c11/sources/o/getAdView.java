package o;

import android.animation.ArgbEvaluator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setByteOrder;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAdView extends getConfiguration<setByteOrder> {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static final getAdView onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final int onExtraCallback;
    private final int onNavigationEvent;

    public /* synthetic */ getAdView(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public static final /* synthetic */ getAdView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        getAdView getadview = onExtraCallbackWithResult;
        int i5 = i3 + 15;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return getadview;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getAdView(long j, long j2) {
        super(setByteOrder.onNavigationEvent(j), setByteOrder.onNavigationEvent(j2));
        this.onExtraCallback = ByteOrderedDataOutputStream.onNavigationEvent(j);
        this.onNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(j2);
    }

    public long onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        Object objEvaluate = new ArgbEvaluator().evaluate(f, Integer.valueOf(this.onExtraCallback), Integer.valueOf(this.onNavigationEvent));
        Intrinsics.checkNotNull(objEvaluate, "");
        long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(((Integer) objEvaluate).intValue());
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return jOnExtraCallback;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final getAdView onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getAdView getadviewIAuthTabCallback = getAdView.IAuthTabCallback();
            int i4 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getadviewIAuthTabCallback;
        }
    }

    static {
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        onExtraCallbackWithResult = new getAdView(onextracallbackwithresult.onTransact(), onextracallbackwithresult.onTransact(), null);
        int i = onWarmupCompleted + 31;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
