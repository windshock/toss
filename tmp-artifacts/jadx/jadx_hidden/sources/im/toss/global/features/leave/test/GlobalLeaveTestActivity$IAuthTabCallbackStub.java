package im.toss.global.features.leave.test;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.getBooleanFromAdObject;

/* loaded from: classes.dex */
final /* synthetic */ class GlobalLeaveTestActivity$IAuthTabCallbackStub extends FunctionReferenceImpl implements Function0<Unit> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] IAuthTabCallback = {25, -55, -68, -60, -68, -62, -42, -123, -74, -19, -82, -68, -39, -43, -107, -79, -63, -69, 28, 20, -8, -70, -7, -20, -12, -20, -14, 6, -75, -26, 29, -34, -20, 9, 5, -59, -31, -15, -21};
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = -1538795511;
    private static int onExtraCallbackWithResult = -1544005686;
    private static short[] onNavigationEvent = null;
    private static int onWarmupCompleted = -168785443;

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalLeaveTestActivity$IAuthTabCallbackStub(Object obj) {
        Object[] objArr = new Object[1];
        a((short) (KeyEvent.keyCodeFromString("") + 65), (byte) (Color.rgb(0, 0, 0) + 16777216), (-1370968533) + (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-129994581) - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 17), (byte) ((-16777216) - Color.rgb(0, 0, 0)), TextUtils.getOffsetAfter("", 0) - 1370968515, (ViewConfiguration.getFadingEdgeLength() >> 16) - 129994581, (-3) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        super(0, obj, GlobalLeaveTestActivity.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            GlobalLeaveTestActivity.onExtraCallback((GlobalLeaveTestActivity) ((CallableReference) this).receiver);
            throw null;
        }
        GlobalLeaveTestActivity.onExtraCallback((GlobalLeaveTestActivity) ((CallableReference) this).receiver);
        int i3 = IAuthTabCallbackDefault + 57;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        boolean z;
        char c;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, onExtraCallback);
        int i5 = iO == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = IAuthTabCallback;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i6]);
                }
                int i7 = $10 + 11;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                bArr = bArr2;
            }
            iO = bArr != null ? (byte) (((byte) (IAuthTabCallback[getBooleanFromAdObject.onWarmupCompleted.o(i, onWarmupCompleted)] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L)))) : (short) (((short) (onNavigationEvent[((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
        }
        if (iO > 0) {
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iO) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i5;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, onExtraCallbackWithResult, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = IAuthTabCallback;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i9 = 0; i9 < length2; i9++) {
                    bArr4[i9] = (byte) (bArr3[i9] ^ (-4629411779493505016L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i10 = $11 + 79;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                z = false;
            }
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                if (z) {
                    int i12 = $10 + 111;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        byte[] bArr5 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent + 1;
                        c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback << (((byte) (((byte) (bArr5[r10] * (-4629411779493505016L))) << s)) ^ b));
                    } else {
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                } else {
                    short[] sArr = onNavigationEvent;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }
}
