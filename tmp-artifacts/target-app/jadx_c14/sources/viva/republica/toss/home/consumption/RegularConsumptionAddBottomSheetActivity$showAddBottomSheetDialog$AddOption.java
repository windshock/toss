package viva.republica.toss.home.consumption;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import viva.republica.toss.home.consumption.RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption {
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    final /* synthetic */ RegularConsumptionAddBottomSheetActivity onNavigationEvent;
    private final String onWarmupCompleted;
    private static final byte[] $$a = {120, 11, 65, 93};
    private static final int $$b = 60;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 478308887;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, byte r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 105
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = viva.republica.toss.home.consumption.RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.$$c(int, int, byte):java.lang.String");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption, setDetectableSize);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption)) {
            return false;
        }
        RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption = (RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onWarmupCompleted, regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.onExtraCallback)) {
            return Intrinsics.areEqual(this.IAuthTabCallback, regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.IAuthTabCallback);
        }
        int i4 = asBinder + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((this.onExtraCallbackWithResult.hashCode() % 124) % this.onWarmupCompleted.hashCode()) - 45) - this.onExtraCallback.hashCode()) * 96) >> this.IAuthTabCallback.hashCode() : (((((this.onExtraCallbackWithResult.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i3 = asBinder + 83;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddOption(type=" + this.onExtraCallbackWithResult + ", image=" + this.onWarmupCompleted + ", title=" + this.onExtraCallback + ", scheme=" + this.IAuthTabCallback + ")";
        int i2 = onTransact + 107;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return str;
    }

    public RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption(RegularConsumptionAddBottomSheetActivity regularConsumptionAddBottomSheetActivity, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onNavigationEvent = regularConsumptionAddBottomSheetActivity;
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallback = str3;
        this.IAuthTabCallback = str4;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i3 + 99;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    private static final Unit onWarmupCompleted(RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(4 - TextUtils.getCapsMode("", 0, 0), 1 - Color.alpha(0), new char[]{65525, 4, '\t', 0}, false, 174 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.onExtraCallbackWithResult);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, 3 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{7, 65535, 65528, 7, 65532}, false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 171, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), regularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption.onExtraCallback);
        setDetectableSize.onExtraCallback("sheet_type", "ADD");
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 95;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return unit;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1216983L, false, (String) null, (Map) null, new RegularConsumptionAddBottomSheetActivity$showAddBottomSheetDialog$AddOption$.ExternalSyntheticLambda0(this), 14, (Object) null);
        Intent intentOnExtraCallback = this.onNavigationEvent.onNavigationEvent().onExtraCallback(this.onNavigationEvent, this.IAuthTabCallback);
        if (intentOnExtraCallback != null) {
            int i2 = asBinder + 37;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            intentOnExtraCallback.setFlags(33554432);
            this.onNavigationEvent.startActivity(intentOnExtraCallback);
        }
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            int i5 = $10 + 3;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35125), 23 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.resolveSizeAndState(0, 0, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 55, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i8 = $10 + 69;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i10 = $10 + 5;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i12 = $11 + 63;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i14 = $10 + 27;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i >>> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 55 - (Process.myPid() >> 22), 2167 - TextUtils.indexOf("", ""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getTrimmedLength("")), TextUtils.getCapsMode("", 0, 0) + 55, 2167 - Color.green(0), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
