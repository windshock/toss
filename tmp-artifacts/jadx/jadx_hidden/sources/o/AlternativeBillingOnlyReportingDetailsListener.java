package o;

import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;
import o.makePFX_WINS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public interface AlternativeBillingOnlyReportingDetailsListener {

    public static final class IAuthTabCallback implements AlternativeBillingOnlyReportingDetailsListener {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final IAuthTabCallback IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface;
        private static char onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static long onWarmupCompleted;

        static {
            onExtraCallback();
            IAuthTabCallback = new IAuthTabCallback();
            int i = IAuthTabCallbackStub + 11;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackDefault + 37;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof IAuthTabCallback) {
                return true;
            }
            int i4 = IAuthTabCallbackDefault + 15;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 35;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 19;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return -288698207;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 97;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getEdgeSlop() >> 16), (-1281756915) + (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{10188, 39114, 41198, 22279, 18487, 14242, 31189}, new char[]{0, 0, 0, 0}, new char[]{3731, 39409, 34995, 51760}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i4 = asInterface + 97;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        private IAuthTabCallback() {
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $11 + 75;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
                cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 59;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }
            objArr[0] = new String(cArr6);
        }

        static void onExtraCallback() {
            onWarmupCompleted = 7798559133331975163L;
            onExtraCallbackWithResult = -1776194565;
            onExtraCallback = (char) 54244;
        }
    }

    public static final class onWarmupCompleted implements AlternativeBillingOnlyReportingDetailsListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int asInterface;
        private final GetBillingConfigParamsBuilder onWarmupCompleted;
        private static char[] onExtraCallback = {32508, 32493, 32280, 32481, 32492, 32495, 32489, 32286, 32283, 32484, 32463, 32485, 32282, 32486, 32418, 32285, 32494, 32511, 32287, 32469, 32417};
        private static int IAuthTabCallback = -1184334198;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onNavigationEvent = true;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 117;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = i2 + 19;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, ((onWarmupCompleted) obj).onWarmupCompleted)) {
                return true;
            }
            int i7 = asInterface + 95;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 17;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            GetBillingConfigParamsBuilder getBillingConfigParamsBuilder = this.onWarmupCompleted;
            if (i3 != 0) {
                return getBillingConfigParamsBuilder.hashCode();
            }
            getBillingConfigParamsBuilder.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            GetBillingConfigParamsBuilder getBillingConfigParamsBuilder = this.onWarmupCompleted;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-108, -109, -118, -119, -124, -109, -109, -126, -110, -111, -126, -124, -123, -124, -118, -112, -113, -126, -120, -126, -114, -115, -116, -119, -117, -118, -119, -124, -120, -121, -122, -124, -123, -124, -125, -126, -127}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(getBillingConfigParamsBuilder);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-107}, Process.getGidForName("") + 128, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = asBinder + 5;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public onWarmupCompleted(@NotNull GetBillingConfigParamsBuilder getBillingConfigParamsBuilder) {
            Intrinsics.checkNotNullParameter(getBillingConfigParamsBuilder, "");
            this.onWarmupCompleted = getBillingConfigParamsBuilder;
        }

        public final GetBillingConfigParamsBuilder onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 45;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            GetBillingConfigParamsBuilder getBillingConfigParamsBuilder = this.onWarmupCompleted;
            int i5 = i2 + 15;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return getBillingConfigParamsBuilder;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallback;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = $10 + 77;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr3[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i3]);
                }
                cArr2 = cArr3;
            }
            int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(IAuthTabCallback);
            if (onNavigationEvent) {
                int i6 = $11 + 47;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 49;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr6);
        }
    }
}
