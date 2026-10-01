package im.toss.devtool.action.quickaction;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: classes.dex */
final /* synthetic */ class QuickActionBottomSheetActivity$onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<String, Unit> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted = {32547, 32552, 32560, 32555, 32562, 32527, 32566, 32553, 32541, 32550, 32534, 32563, 32759, 32523, 32565, 32574, 32545, 32744, 32524, 32557, 32740, 32758, 32513};
    private static int onNavigationEvent = -1184333857;
    private static boolean IAuthTabCallback = true;
    private static boolean onExtraCallback = true;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionBottomSheetActivity$onExtraCallbackWithResult(Object obj) {
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-116, -117, -118, -119, -120, -121, -122, -123, -124, -125, -125, -126, -127}, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-105, -106, -107, -125, -120, -121, -108, -127, -109, -110, -125, -120, -112, -124, -110, -112, -111, -112, -113, -114, -115, -116, -117, -118, -119, -120, -121, -122, -123, -124, -125, -125, -126, -127}, 127 - Drawable.resolveOpacity(0, 0), objArr2);
        super(1, obj, DevToolActionListViewModel.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((String) obj);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return unit;
    }

    public final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ((DevToolActionListViewModel) ((CallableReference) this).receiver).asInterface(str);
        int i4 = onExtraCallbackWithResult + 75;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $10 + 19;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < length; i6++) {
                cArr3[i6] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i6]);
            }
            cArr2 = cArr3;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onNavigationEvent);
        if (onExtraCallback) {
            int i7 = $10 + 107;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 21;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] << iY);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                }
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i10 = $10 + 49;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $10 + 119;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                int i14 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                cArr6[i13] = (char) (cArr2[iArr[0 - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] + iY);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            int i15 = $11 + 75;
            $10 = i15 % 128;
            int i16 = i15 % 2;
        }
        objArr[0] = new String(cArr6);
    }
}
