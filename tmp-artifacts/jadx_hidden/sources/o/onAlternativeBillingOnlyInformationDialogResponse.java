package o;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import o.bindContext;
import o.s3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public interface onAlternativeBillingOnlyInformationDialogResponse {

    public static final class onNavigationEvent implements onAlternativeBillingOnlyInformationDialogResponse {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onWarmupCompleted = 6657707029751490410L;
        private final String IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 125;
                onExtraCallbackWithResult = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i5 = i3 + 119;
                onExtraCallbackWithResult = i5 % 128;
                return i5 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, ((onNavigationEvent) obj).IAuthTabCallback)) {
                return true;
            }
            int i6 = onExtraCallback + 55;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = this.IAuthTabCallback;
            if (i3 != 0) {
                return str.hashCode();
            }
            str.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = this.IAuthTabCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{57870, 3920, 14542, 10820, 22477, 16726, 29422, 40032, 35324, 47994, 42126, 54797, 50064, 60684, 7850, 2085, 13731, 10108, 20652, 32195, 28506, 39107, 35410, 47085, 41323, 53976, 64622, 59886, 6916, 1237}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 60792, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(new char[]{57972}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21557, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.IAuthTabCallback;
            if (i3 != 0) {
                int i4 = 66 / 0;
            }
            return str;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 117;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onWarmupCompleted ^ 5407414049857832247L);
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = $10 + 59;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                int i6 = $11 + 35;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr2);
        }
    }

    public static final class onWarmupCompleted implements onAlternativeBillingOnlyInformationDialogResponse {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onWarmupCompleted onWarmupCompleted;

        static {
            onExtraCallback();
            onWarmupCompleted = new onWarmupCompleted();
            int i = onExtraCallback + 33;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            int i5 = i3 + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return 1866570433;
            }
            int i3 = 55 / 0;
            return 1866570433;
        }

        public String toString() {
            Object obj;
            int i = 2 % 2;
            int i2 = asBinder + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            double dConvertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(0);
            if (i3 != 0) {
                Object[] objArr = new Object[1];
                a(31 << (dConvertQuartSecToDecDegrees > 1.0d ? 1 : (dConvertQuartSecToDecDegrees == 1.0d ? 0 : -1)), 10 % (ViewConfiguration.getScrollBarSize() >> 41), new char[]{16, 3, 1, 65531, 14, 65535, 65518, '\t', 65501, '\f', 65535, 65531, 14, 65535, 65514, 65531, '\r', '\r', 17, '\t', '\f', 65534, 65512, 65531}, true, 10245 >> TextUtils.getTrimmedLength(""), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a((dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 24, 22 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{16, 3, 1, 65531, 14, 65535, 65518, '\t', 65501, '\f', 65535, 65531, 14, 65535, 65514, 65531, '\r', '\r', 17, '\t', '\f', 65534, 65512, 65531}, false, 301 - TextUtils.getTrimmedLength(""), objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        private onWarmupCompleted() {
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i5] = bindContext.access000.g(cArr2[i5], onNavigationEvent);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                int i6 = $11 + 81;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            if (i2 > 0) {
                int i8 = $11 + 43;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i10 = $11 + 11;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                }
                cArr2 = cArr4;
            }
            String str = new String(cArr2);
            int i12 = $11 + 15;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str;
        }

        static void onExtraCallback() {
            onNavigationEvent = 478309102;
        }
    }

    public static final class IAuthTabCallback implements onAlternativeBillingOnlyInformationDialogResponse {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final IAuthTabCallback IAuthTabCallback;
        private static long onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onTransact = 1;
        private static int onWarmupCompleted = 1;

        static {
            onWarmupCompleted();
            IAuthTabCallback = new IAuthTabCallback();
            int i = onNavigationEvent + 57;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 27;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof IAuthTabCallback) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 67;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 41;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 125;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return 116724394;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onTransact + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{25827, 23569, 5470, 52870, 34752}, 14532 - TextUtils.lastIndexOf("", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i4 = onExtraCallbackWithResult + 77;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        private IAuthTabCallback() {
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $10 + 17;
            $11 = i3 % 128;
            while (true) {
                int i4 = i3 % 2;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    break;
                }
                int i5 = $10 + 75;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallback ^ 5407414049857832247L);
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                i3 = $11 + 45;
                $10 = i3 % 128;
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            objArr[0] = new String(cArr2);
        }

        static void onWarmupCompleted() {
            onExtraCallback = 1694006432701604241L;
        }
    }
}
