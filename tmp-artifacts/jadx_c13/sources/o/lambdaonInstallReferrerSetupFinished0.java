package o;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface lambdaonInstallReferrerSetupFinished0 {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onExtraCallbackWithResult;

    String IAuthTabCallback();

    int onExtraCallback();

    String onNavigationEvent();

    default String onExtraCallbackWithResult() {
        int i = 2 % 2;
        return "/warm-up";
    }

    public static final class onExtraCallback implements lambdaonInstallReferrerSetupFinished0 {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static final String asBinder = null;
        private static int asInterface = 0;
        private static int onTransact = 1;
        public static final int onWarmupCompleted = 0;
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
        private static final String onExtraCallback = "feed";
        private static final int onNavigationEvent = 1;
        private static final String onExtraCallbackWithResult = "/native/feed";

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 95;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (obj instanceof onExtraCallback) {
                return true;
            }
            int i7 = i3 + 65;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 69;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return 191558199;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 55;
            IAuthTabCallbackStub = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 11;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return "Feed";
            }
            throw null;
        }

        private onExtraCallback() {
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public /* bridge */ String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 83;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
            int i4 = IAuthTabCallbackDefault + 51;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        static {
            int i = onTransact + 123;
            asInterface = i % 128;
            int i2 = i % 2;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public String onNavigationEvent() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 23;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                str = asBinder;
                int i4 = 94 / 0;
            } else {
                str = asBinder;
            }
            int i5 = i3 + 115;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public int onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 45;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = onNavigationEvent;
            int i6 = i3 + 101;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 43 / 0;
            }
            return i5;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 65;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String str = onExtraCallbackWithResult;
            int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted implements lambdaonInstallReferrerSetupFinished0 {
        private static int IAuthTabCallbackDefault = 1;
        private static int onTransact;
        private final String IAuthTabCallback;
        private final String asBinder;
        private final String onExtraCallback;
        private final int onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onTransact + 3;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                return Intrinsics.areEqual(this.onExtraCallback, ((onWarmupCompleted) obj).onExtraCallback);
            }
            int i4 = IAuthTabCallbackDefault + 75;
            int i5 = i4 % 128;
            onTransact = i5;
            boolean z = i4 % 2 != 0;
            int i6 = i5 + 27;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 23;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Web(id=" + this.onExtraCallback + ")";
            int i2 = onTransact + 85;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.onWarmupCompleted = "web";
            this.onExtraCallbackWithResult = 1;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public /* bridge */ String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 61;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return super.onExtraCallbackWithResult();
            }
            super.onExtraCallbackWithResult();
            throw null;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 85;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String str = this.asBinder;
            if (i3 != 0) {
                int i4 = 55 / 0;
            }
            return str;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public int onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 77;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallbackWithResult;
            int i6 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 113;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.IAuthTabCallback;
                int i4 = 4 / 0;
            } else {
                str = this.IAuthTabCallback;
            }
            int i5 = i2 + 119;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 107;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 47;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements lambdaonInstallReferrerSetupFinished0 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;
        private static long asInterface = 0;
        private static final String onExtraCallback = null;
        private static final int onExtraCallbackWithResult;
        public static final onNavigationEvent onNavigationEvent;
        private static int onTransact = 1;
        private static final String onWarmupCompleted = null;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 105;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i4 = i2 + 27;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (obj instanceof onNavigationEvent) {
                return true;
            }
            int i6 = i2 + 39;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 66 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 123;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 != 0) {
                int i4 = 47 / 0;
            }
            int i5 = i3 + 81;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return 191806417;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asBinder + 5;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                int i4 = 86 / 0;
            }
            int i5 = i3 + 79;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return "None";
        }

        private onNavigationEvent() {
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public /* bridge */ String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return super.onExtraCallbackWithResult();
            }
            super.onExtraCallbackWithResult();
            throw null;
        }

        static {
            onWarmupCompleted();
            onNavigationEvent = new onNavigationEvent();
            Object[] objArr = new Object[1];
            a(new char[]{15203, 15117, 3344, 48710, 23526, 6273, 38356, 6777}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr);
            IAuthTabCallback = ((String) objArr[0]).intern();
            onExtraCallbackWithResult = 1;
            int i = IAuthTabCallbackDefault + 79;
            onTransact = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 113;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            String str = onExtraCallback;
            int i5 = i3 + 63;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public int onExtraCallback() {
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 17;
            int i4 = i3 % 128;
            asBinder = i4;
            if (i3 % 2 != 0) {
                i = onExtraCallbackWithResult;
                int i5 = 32 / 0;
            } else {
                i = onExtraCallbackWithResult;
            }
            int i6 = i4 + 65;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }

        @Override // o.lambdaonInstallReferrerSetupFinished0
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 67;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = onWarmupCompleted;
            int i5 = i3 + 57;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 12 / 0;
            }
            return str;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asInterface ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 97;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asInterface)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), 84 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16763031) - Color.rgb(0, 0, 0)), 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8808 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $10 + 39;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        static void onWarmupCompleted() {
            asInterface = 3996549039146233586L;
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        static final /* synthetic */ IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 39;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
        }

        public final List<onExtraCallback> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = onExtraCallback.IAuthTabCallback;
            if (i3 == 0) {
                return CollectionsKt__CollectionsJVMKt.listOf(onextracallback);
            }
            CollectionsKt__CollectionsJVMKt.listOf(onextracallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
