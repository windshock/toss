package im.toss.devtool.runtime.data.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.bindContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class DevToolActionActivity$IAuthTabCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int[] onNavigationEvent = {-1637627097, 389471437, 1219950925, 192993323, -1384210767, -2031327796, -1942412898, 1595851385, 1279086316, -141638089, -77059612, -1709844717, -215493402, -619521664, 1363040237, 1228199295, 165765585, -1407760366};
    private static int onWarmupCompleted = 1;

    public /* synthetic */ DevToolActionActivity$IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        if (iArr3 != null) {
            int i3 = $10 + 105;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                iArr2[i4] = Hilt_QuickActionBottomSheetActivity$4.h(iArr3[i4]);
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                iArr6[i5] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i5]);
            }
            int i6 = $10 + 89;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 69;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i8];
                    int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                    i8 += 110;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i8];
                    int iJ2 = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ2;
                    i8++;
                }
            }
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i10;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private DevToolActionActivity$IAuthTabCallback() {
    }

    public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull Bundle bundle) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intent intent = new Intent(context, (Class<?>) DevToolActionActivity.class);
        Object[] objArr = new Object[1];
        a(new int[]{-286056793, -1106919019, 326717018, -1071886494}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, objArr);
        Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
        if (!bundle.isEmpty()) {
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a(new int[]{664540719, -1818167994, 51948433, -47448751, -1682184836, -891323316, 33457975, 1984967534}, 87 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                a(new int[]{664540719, -1818167994, 51948433, -47448751, -1682184836, -891323316, 33457975, 1984967534}, 13 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
                obj = objArr3[0];
            }
            intentPutExtra.putExtra(((String) obj).intern(), bundle);
        }
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
        return intentPutExtra;
    }
}
