package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import kotlin.jvm.internal.Intrinsics;
import o.getBooleanFromAdObject;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AppNode6 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = -58327209;
    private static int IAuthTabCallbackStub = 0;
    private static short[] asBinder = null;
    private static int asInterface = 1;
    private static int onExtraCallback = -1538795442;
    private static byte[] onTransact = {-50, -48, -16, 4, -5, 78, -53, -16, 0, -11, 13, 24, -53, -48, -16, 0, -11, 13, -8, 91, -4, -77};
    private static int onWarmupCompleted = -2127765052;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppNode6)) {
            int i2 = IAuthTabCallbackStub + 111;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        AppNode6 appNode6 = (AppNode6) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, appNode6.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onNavigationEvent, appNode6.onNavigationEvent)) {
            return false;
        }
        int i3 = IAuthTabCallbackStub + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        return i3 == 0 ? (iHashCode << 116) * this.onNavigationEvent.hashCode() : (iHashCode * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.onExtraCallbackWithResult;
        String str2 = this.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) TextUtils.getCapsMode("", 0, 0), (byte) View.MeasureSpec.getMode(0), TextUtils.indexOf("", "") - 1489119071, (-627784057) - View.getDefaultSize(0, 0), (Process.myTid() >> 22) - 71, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) ((-1) - Process.getGidForName("")), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-1489119059) - View.MeasureSpec.getMode(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 627784096, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 72, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1489119050) - Color.red(0), Color.green(0) - 627784099, (ViewConfiguration.getLongPressTimeout() >> 16) - 71, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStub + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 5;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i2 + 61;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 41;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 79;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, onExtraCallback);
        int i5 = iO == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = onTransact;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = $10 + 45;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    bArr2[i6] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i6]);
                }
                bArr = bArr2;
            }
            iO = bArr != null ? (byte) (((byte) (onTransact[getBooleanFromAdObject.onWarmupCompleted.o(i, IAuthTabCallback)] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L)))) : (short) (((short) (asBinder[((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
        }
        if (iO > 0) {
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iO) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i5;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, onWarmupCompleted, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = onTransact;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = $10 + 47;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        bArr4[i9] = (byte) (bArr3[i9] - (-4629411779493505016L));
                        i9 >>>= 1;
                    } else {
                        bArr4[i9] = (byte) (bArr3[i9] ^ (-4629411779493505016L));
                        i9++;
                    }
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i11 = $11 + 79;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                z = false;
            }
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                if (z) {
                    byte[] bArr5 = onTransact;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r5] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    short[] sArr = asBinder;
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
