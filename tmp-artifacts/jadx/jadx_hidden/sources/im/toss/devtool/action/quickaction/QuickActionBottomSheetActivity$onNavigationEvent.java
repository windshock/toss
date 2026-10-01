package im.toss.devtool.action.quickaction;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final /* synthetic */ class QuickActionBottomSheetActivity$onNavigationEvent extends FunctionReferenceImpl implements Function1<String, Unit> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] IAuthTabCallback = {-74, 81, -102, 125, -105, -77, 79, 74, -78, -79, -37, 58, -7, -61, -18, 18, -32, -23, 54, 51, -33, -18, 26, -30, 42, -39, -4, 2, -32, 9, 51, -45, 12, -57, 32, -54, -18, 18, 23, -17, -20};
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 832143614;
    private static int onExtraCallbackWithResult = 1905831432;
    private static short[] onNavigationEvent = null;
    private static int onTransact = 0;
    private static int onWarmupCompleted = -1538795452;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionBottomSheetActivity$onNavigationEvent(Object obj) {
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (ImageFormat.getBitsPerPixel(0) + 67), 1780590346 + (Process.myPid() >> 22), Color.green(0) + 706775668, (-76) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) (Process.myPid() >> 22), (byte) (31 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1780590356 - (ViewConfiguration.getTapTimeout() >> 16), 706775668 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0, 0) - 77, objArr2);
        super(1, obj, DevToolActionListViewModel.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ((DevToolActionListViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult(str);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        ((DevToolActionListViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult(str);
        int i3 = IAuthTabCallbackDefault + 87;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((String) obj);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 1;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[PHI: r4
      0x0046: PHI (r4v7 byte[] A[IMMUTABLE_TYPE]) = (r4v6 byte[]), (r4v22 byte[]) binds: [B:14:0x0044, B:11:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r15, byte r16, int r17, int r18, int r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$onNavigationEvent.a(short, byte, int, int, int, java.lang.Object[]):void");
    }
}
