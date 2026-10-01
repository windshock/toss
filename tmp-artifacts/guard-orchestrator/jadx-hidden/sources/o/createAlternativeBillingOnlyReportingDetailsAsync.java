package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import im.toss.global.features.useronboarding.model.GlobalOnboardingEventId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.EngineConfig1;
import o.getBooleanFromAdObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class createAlternativeBillingOnlyReportingDetailsAsync {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static char[] onExtraCallback = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long onExtraCallbackWithResult;

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        int i = onWarmupCompleted + 103;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ createAlternativeBillingOnlyReportingDetailsAsync(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createAlternativeBillingOnlyReportingDetailsAsync)) {
            int i2 = IAuthTabCallback + 51;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (GlobalOnboardingEventId.IAuthTabCallback(this.onExtraCallbackWithResult, ((createAlternativeBillingOnlyReportingDetailsAsync) obj).onExtraCallbackWithResult)) {
            return true;
        }
        int i4 = asBinder + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GlobalOnboardingEventId.IAuthTabCallback(this.onExtraCallbackWithResult);
        int i4 = IAuthTabCallback + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallback;
    }

    public String toString() {
        int i = 2 % 2;
        String strOnWarmupCompleted = GlobalOnboardingEventId.onWarmupCompleted(this.onExtraCallbackWithResult);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 42, 157, 40}, false, new byte[]{0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnWarmupCompleted);
        Object[] objArr2 = new Object[1];
        a(new int[]{42, 1, 0, 0}, false, new byte[]{1}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallback + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private createAlternativeBillingOnlyReportingDetailsAsync(long j) {
        this.onExtraCallbackWithResult = j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        int i6 = i3 + 101;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = -749468722;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;
        private static byte[] onExtraCallback = {4, 21, -18, 0, -7, 9, -1, -15, 13, 11, -12, -2, -15, 15, -15, 23, -31, 16, 1, 3, -20, -99, 95, -88, 88, 17, -14, 77, -75, 8, -28, -81, 86, 84, -76, 9, -29, -96, -84, 86, -85, 91, 83, 76, 8, 8};
        private static int onExtraCallbackWithResult = -1538795422;
        private static int onNavigationEvent = -479104574;
        private static short[] onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final createAlternativeBillingOnlyReportingDetailsAsync IAuthTabCallback(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((-10) - Process.getGidForName("")), View.resolveSize(0, 0) - 1194764746, (-1997790080) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-84) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            Object objOnExtraCallback = textLinkScopeExternalSyntheticLambda7.onExtraCallback(((String) objArr[0]).intern());
            if (objOnExtraCallback != null) {
                createAlternativeBillingOnlyReportingDetailsAsync createalternativebillingonlyreportingdetailsasync = new createAlternativeBillingOnlyReportingDetailsAsync(GlobalOnboardingEventId.onExtraCallbackWithResult(((Number) objOnExtraCallback).longValue()), null);
                int i4 = asBinder + 11;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                }
                return createalternativebillingonlyreportingdetailsasync;
            }
            Object[] objArr2 = new Object[1];
            a((short) (Process.getGidForName("") + 1), (byte) (87 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1194764725, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1997790068, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 82, objArr2);
            throw new IllegalStateException(((String) objArr2[0]).intern());
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
            boolean z;
            int i4 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, onExtraCallbackWithResult);
            int i5 = iO == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $11 + 43;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        bArr2[i7] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i7]);
                        i7++;
                        int i8 = $10 + 15;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $11 + 55;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    iO = (byte) (((byte) (onExtraCallback[getBooleanFromAdObject.onWarmupCompleted.o(i, onNavigationEvent)] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                } else {
                    iO = (short) (((short) (onWarmupCompleted[((int) (onNavigationEvent ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iO > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iO) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L))) + i5;
                ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, IAuthTabCallback, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr3 = onExtraCallback;
                if (bArr3 != null) {
                    int i12 = $11 + 21;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        int i15 = $10 + 63;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        bArr4[i14] = (byte) (bArr3[i14] ^ (-4629411779493505016L));
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    int i17 = $10 + 89;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                    if (z) {
                        byte[] bArr5 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r5] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r5] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                int i8 = $11 + 25;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr[i] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i]);
                i++;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 81;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i12 = $10 + 77;
                $11 = i12 % 128;
                if (i12 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                    int i13 = $11 + 121;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                int i15 = $10 + 65;
                $11 = i15 % 128;
                int i16 = i15 % 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i17 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i17, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i17);
        }
        if (z) {
            int i18 = $11 + 59;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{27336, 27467, 27312, 27469, 27316, 27317, 27467, 27467, 27467, 27464, 27462, 27469, 27462, 27465, 27319, 27318, 27463, 27463, 27463, 27313, 27323, 27465, 27486, 27484, 27486, 27459, 27462, 27297, 27320, 27463, 27460, 27300, 27309, 27460, 27460, 27464, 27456, 27317, 27325, 27299, 27281, 27320, 27226};
    }
}
