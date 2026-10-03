package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getRuntimeExecutor {

    @SerializedName("networkType")
    private final String networkType;

    @SerializedName("usimCount")
    private final int usimCount;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private static long onExtraCallbackWithResult = -257016732964098838L;
    private static int IAuthTabCallback = -1776194565;
    private static char onNavigationEvent = 27643;

    private static String $$c(byte b, byte b2, int i) {
        int i2 = b2 * 3;
        byte[] bArr = $$a;
        int i3 = 110 - b;
        int i4 = 4 - (i * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 = (-i3) + i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i4];
            i4++;
            i3 = (-b3) + i3;
            i6 = i7;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getRuntimeExecutor() {
        String str = null;
        this(0, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRuntimeExecutor)) {
            int i5 = i3 + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 85 / 0;
            }
            return false;
        }
        getRuntimeExecutor getruntimeexecutor = (getRuntimeExecutor) obj;
        if (this.usimCount != getruntimeexecutor.usimCount) {
            return false;
        }
        if (!Intrinsics.areEqual(this.networkType, getruntimeexecutor.networkType)) {
            int i7 = onExtraCallback + 45;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = onWarmupCompleted + 77;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.usimCount) * 31) + this.networkType.hashCode();
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SessionIdRequest(usimCount=" + this.usimCount + ", networkType=" + this.networkType + ")";
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getRuntimeExecutor(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.usimCount = i;
        this.networkType = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getRuntimeExecutor(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i2 & 1) != 0) {
            int i3 = onExtraCallback + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        }
        if ((i2 & 2) != 0) {
            Object[] objArr = new Object[1];
            a((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 651045848, new char[]{47447, 17096, 59480, 24938, 12494, 12098, 55398}, new char[]{34577, 13430, 59538, 36948}, new char[]{55390, 52779, 55590, 17981}, objArr);
            str = ((String) objArr[0]).intern();
            int i5 = onWarmupCompleted + 117;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(i, str);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i3 = $11 + 19;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int offsetBefore = 43 - TextUtils.getOffsetBefore("", 0);
                    int iLastIndexOf = 1450 - TextUtils.lastIndexOf("", '0', 0);
                    byte b = (byte) ($$a[1] - 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAlpha, offsetBefore, iLastIndexOf, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49123);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 44;
                    int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1493;
                    byte b3 = $$a[1];
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(doubleTapTimeout, trimmedLength, i5, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 23972), 50 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 22940 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.getTrimmedLength("")), View.MeasureSpec.getSize(0) + 29, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 19;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
