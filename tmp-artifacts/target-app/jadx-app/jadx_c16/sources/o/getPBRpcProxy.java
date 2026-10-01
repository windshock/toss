package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface getPBRpcProxy {

    public static final class onWarmupCompleted implements getPBRpcProxy {
        private static int IAuthTabCallback = 1;
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 107;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            Object obj2 = null;
            if (!(obj instanceof onWarmupCompleted)) {
                int i2 = onWarmupCompleted + 13;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i3 = onWarmupCompleted + 7;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return -1798334581;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return "Success";
        }

        private onWarmupCompleted() {
        }
    }

    public static final class onExtraCallbackWithResult implements getPBRpcProxy {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static char IAuthTabCallbackStub = 32952;
        private static char asBinder = 9082;
        private static char asInterface = 2307;
        private static char onNavigationEvent = 43133;
        private static int onTransact;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    return false;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                return Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback);
            }
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 73;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 121;
            IAuthTabCallbackDefault = i2 % 128;
            int iHashCode = (i2 % 2 == 0 ? ((this.IAuthTabCallback.hashCode() << 38) + this.onExtraCallbackWithResult.hashCode()) - 34 : ((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onExtraCallback.hashCode();
            int i3 = onTransact + 7;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MydataDelete(orgCode=" + this.IAuthTabCallback + ", assetId=" + this.onExtraCallbackWithResult + ", scope=" + this.onExtraCallback + ")";
            int i2 = onTransact + 119;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Throwable {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.IAuthTabCallback = str;
            this.onExtraCallbackWithResult = str2;
            this.onExtraCallback = str3;
            Object[] objArr = new Object[1];
            a(new char[]{38632, 15017, 37762, 35860, 54845, 24806, 64877, 27501, 6952, 53200, 59433, 24354, 37581, 52580, 50914, 12625, 10191, 26991, 54528, 10433, 10312, 45847, 44863, 30886, 35059, 28987, 57694, 37053, 38283, 55502, 5494, 63314}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32, objArr);
            Uri uri = Uri.parse(((String) objArr[0]).intern());
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("orgCode", str);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("assetId", str2);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("scope", str3);
            Object[] objArr2 = new Object[1];
            a(new char[]{32331, 26553, 3652, 32806, 25122, 33651, 15218, 62268}, ImageFormat.getBitsPerPixel(0) + 9, objArr2);
            this.onWarmupCompleted = filterCreatePageParams.onNavigationEvent(uri, new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "ASSET_EDIT")});
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 89;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 51;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 113;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 7;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $10 + 87;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $11 + 103;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(asInterface);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int i12 = (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                            int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12433;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, i12, i13, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackStub)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 10 - Color.red(0), View.MeasureSpec.getMode(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 19902 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i14 = $11 + 29;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public static final class onNavigationEvent implements getPBRpcProxy {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final String onExtraCallback;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof onNavigationEvent) {
                onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                return Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback);
            }
            int i5 = i3 + 115;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.onNavigationEvent.hashCode() - 66;
                str = this.onExtraCallback;
            } else {
                iHashCode = this.onNavigationEvent.hashCode() * 31;
                str = this.onExtraCallback;
            }
            int iHashCode2 = iHashCode + str.hashCode();
            int i3 = IAuthTabCallback + 39;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode2;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Alert(title=" + this.onNavigationEvent + ", description=" + this.onExtraCallback + ")";
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onNavigationEvent = str;
            this.onExtraCallback = str2;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 105;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.onExtraCallback;
            int i4 = i2 + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    @JvmInline
    public static final class onExtraCallback implements getPBRpcProxy {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final Throwable IAuthTabCallback;

        public static String onExtraCallback(Throwable th) {
            int i = 2 % 2;
            String str = "Failure(throwable=" + th + ")";
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static final /* synthetic */ onExtraCallback onExtraCallbackWithResult(Throwable th) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(th);
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static int onNavigationEvent(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (th != null) {
                return th.hashCode();
            }
            int i5 = i3 + 109;
            onNavigationEvent = i5 % 128;
            return i5 % 2 == 0 ? 1 : 0;
        }

        public static Throwable onWarmupCompleted(@Nullable Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return th;
        }

        public static boolean onWarmupCompleted(Throwable th, Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(th, ((onExtraCallback) obj).onExtraCallback())) {
                int i4 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnWarmupCompleted = onWarmupCompleted(this.IAuthTabCallback, obj);
            int i4 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return zOnWarmupCompleted;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = onNavigationEvent(this.IAuthTabCallback);
            int i4 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 18 / 0;
            }
            return iOnNavigationEvent;
        }

        public final /* synthetic */ Throwable onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Throwable th = this.IAuthTabCallback;
            int i5 = i3 + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return th;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = onExtraCallback(this.IAuthTabCallback);
            int i4 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallback;
        }

        private /* synthetic */ onExtraCallback(Throwable th) {
            this.IAuthTabCallback = th;
        }

        public static /* synthetic */ Throwable onExtraCallback(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 % 2;
                }
                th = null;
            }
            Throwable thOnWarmupCompleted = onWarmupCompleted(th);
            int i5 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return thOnWarmupCompleted;
        }
    }
}
