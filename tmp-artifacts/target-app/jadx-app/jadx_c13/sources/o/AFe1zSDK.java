package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1zSDK<T> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final T onExtraCallback;
    private final String onNavigationEvent;

    static {
        int i = IAuthTabCallback + 83;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ AFe1zSDK(Object obj, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str);
    }

    private AFe1zSDK(T t, String str) {
        this.onExtraCallback = t;
        this.onNavigationEvent = str;
    }

    public final T IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        T t = this.onExtraCallback;
        int i5 = i3 + 5;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final class IAuthTabCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final <T> AFe1zSDK<T> onNavigationEvent(T t, @NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            AFe1zSDK<T> aFe1zSDK = new AFe1zSDK<>(t, str, null);
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return aFe1zSDK;
        }
    }
}
