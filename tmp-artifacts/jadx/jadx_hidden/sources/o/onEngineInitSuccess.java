package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.s5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class onEngineInitSuccess {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final List<tryTriggerOnStart> onWarmupCompleted;
    private static char[] onNavigationEvent = {60816, 58776, 65008, 62971, 52511, 50550, 56654, 54424, 44281, 42182, 48186, 46206, 35927, 34735, 40895, 38874, 28524, 26374, 32595, 30374, 20189, 60920, 58845, 65010, 62918, 52484, 50549, 56647, 54518, 60920, 58845, 65012, 62912, 52487, 50538, 56607, 12048};
    private static long onExtraCallbackWithResult = -1617158830221498883L;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ onEngineInitSuccess IAuthTabCallback(onEngineInitSuccess onengineinitsuccess, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 119;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = onengineinitsuccess.IAuthTabCallback;
            int i6 = i3 + 7;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            str2 = onengineinitsuccess.onExtraCallback;
        }
        if ((i & 4) != 0) {
            int i8 = i3 + 111;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            list = onengineinitsuccess.onWarmupCompleted;
        }
        onEngineInitSuccess onengineinitsuccessOnExtraCallback = onengineinitsuccess.onExtraCallback(str, str2, list);
        int i10 = asBinder + 91;
        IAuthTabCallbackDefault = i10 % 128;
        int i11 = i10 % 2;
        return onengineinitsuccessOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 75;
            IAuthTabCallbackDefault = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof onEngineInitSuccess)) {
            int i3 = asBinder + 9;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        onEngineInitSuccess onengineinitsuccess = (onEngineInitSuccess) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, onengineinitsuccess.IAuthTabCallback) || !Intrinsics.areEqual(this.onExtraCallback, onengineinitsuccess.onExtraCallback)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onWarmupCompleted, onengineinitsuccess.onWarmupCompleted))) {
            return true;
        }
        int i5 = IAuthTabCallbackDefault + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? ((this.IAuthTabCallback.hashCode() * 13) / this.onExtraCallback.hashCode()) % 113 : ((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
        int i3 = asBinder + 41;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final onEngineInitSuccess onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull List<tryTriggerOnStart> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        onEngineInitSuccess onengineinitsuccess = new onEngineInitSuccess(str, str2, list);
        int i2 = IAuthTabCallbackDefault + 119;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onengineinitsuccess;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.IAuthTabCallback;
        String str2 = this.onExtraCallback;
        List<tryTriggerOnStart> list = this.onWarmupCompleted;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((-16777216) - Color.rgb(0, 0, 0), (-16777195) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.alpha(0) + 8, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 29, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8, (char) TextUtils.getTrimmedLength(""), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(list);
        Object[] objArr4 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 36, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (char) (49901 - TextUtils.getCapsMode("", 0, 0)), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackDefault + 115;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public onEngineInitSuccess(@NotNull String str, @NotNull String str2, @NotNull List<tryTriggerOnStart> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
        this.onWarmupCompleted = list;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            str = this.IAuthTabCallback;
            int i4 = 21 / 0;
        } else {
            str = this.IAuthTabCallback;
        }
        int i5 = i3 + 19;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public final List<tryTriggerOnStart> onNavigationEvent() {
        List<tryTriggerOnStart> list;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            list = this.onWarmupCompleted;
            int i4 = 65 / 0;
        } else {
            list = this.onWarmupCompleted;
        }
        int i5 = i3 + 81;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i4] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i + i4]), i4, onExtraCallbackWithResult, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 75;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 25;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        String str = new String(cArr);
        int i9 = $10 + 15;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }
}
