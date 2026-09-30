package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import im.toss.security.impl.malware.PackageSnapshotKt$;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.getBooleanFromAdObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s5e {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = -1973448949;
    private static int asBinder = 0;
    private static int onExtraCallback = -1579610419;
    private static byte[] onExtraCallbackWithResult = {-7, -7};
    private static int onNavigationEvent = -1538795496;
    private static int onTransact = 1;
    private static short[] onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(List list, MessageDigest messageDigest) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, messageDigest);
        int i4 = onTransact + 71;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String onExtraCallbackWithResult(@NotNull List<s5d> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String strOnNavigationEvent = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onNavigationEvent(new PackageSnapshotKt$.ExternalSyntheticLambda0(list));
        int i2 = onTransact + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(List list, MessageDigest messageDigest) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(messageDigest, "");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s5d s5dVar = (s5d) it.next();
            String strIAuthTabCallback = s5dVar.IAuthTabCallback();
            long jOnExtraCallback = s5dVar.onExtraCallback();
            long jOnExtraCallbackWithResult = s5dVar.onExtraCallbackWithResult();
            StringBuilder sb = new StringBuilder();
            sb.append(strIAuthTabCallback);
            Object[] objArr = new Object[1];
            a((short) (96 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.getMode(0) - 94295749, (Process.myTid() >> 22) - 773346951, (ViewConfiguration.getTapTimeout() >> 16) - 17, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(jOnExtraCallback);
            Object[] objArr2 = new Object[1];
            a((short) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 95), (byte) (ViewConfiguration.getTouchSlop() >> 8), AndroidCharacter.getMirror('0') - 55029, (-773346951) - ((Process.getThreadPriority(0) + 20) >> 6), (-16777233) - Color.rgb(0, 0, 0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(jOnExtraCallbackWithResult);
            Object[] objArr3 = new Object[1];
            a((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 94295749, (-773347031) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-18) - ImageFormat.getBitsPerPixel(0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            byte[] bytes = sb.toString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            messageDigest.update(bytes);
            int i4 = asBinder + 109;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final List<s5d> onExtraCallback(@NotNull List<s5d> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = onTransact + 113;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (hashSet.add(((s5d) obj).IAuthTabCallback())) {
                int i4 = onTransact + 15;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(obj);
                    int i5 = 59 / 0;
                } else {
                    arrayList.add(obj);
                }
            }
        }
        return CollectionsKt.sortedWith(arrayList, new onWarmupCompleted());
    }

    public static final class onWarmupCompleted<T> implements Comparator {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onWarmupCompleted.class);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3656);
            String strIAuthTabCallback = ((s5d) t).IAuthTabCallback();
            String strIAuthTabCallback2 = ((s5d) t2).IAuthTabCallback();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(strIAuthTabCallback, strIAuthTabCallback2);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
            return iIAuthTabCallback;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, onNavigationEvent);
        boolean z2 = iO == -1;
        if (!(!z2)) {
            byte[] bArr2 = onExtraCallbackWithResult;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr3[i7] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr2[i7]);
                }
                bArr2 = bArr3;
            }
            iO = bArr2 != null ? (byte) (((byte) (onExtraCallbackWithResult[getBooleanFromAdObject.onWarmupCompleted.o(i, onExtraCallback)] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L)))) : (short) (((short) (onWarmupCompleted[((int) (onExtraCallback ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
        }
        if (iO > 0) {
            int i8 = ((i + iO) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
            if (z2) {
                int i9 = $11 + 27;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i8 + i4;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, IAuthTabCallback, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr4 = onExtraCallbackWithResult;
            if (bArr4 != null) {
                int i11 = $11 + 93;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    int i12 = $11 + 21;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    bArr[i5] = (byte) (bArr4[i5] ^ (-4629411779493505016L));
                    i5++;
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                int i14 = $11 + 57;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                z = true;
            } else {
                z = false;
            }
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                if (z) {
                    int i16 = $10 + 75;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    byte[] bArr5 = onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    short[] sArr = onWarmupCompleted;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                int i18 = $10 + 13;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 5 / 4;
                }
            }
        }
        objArr[0] = sb.toString();
    }
}
