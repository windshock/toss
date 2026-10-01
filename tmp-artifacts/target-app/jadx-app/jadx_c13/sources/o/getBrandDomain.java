package o;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getBrandDomain;
import o.performOneTimeSetup;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBrandDomain {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, i2);
        int i6 = IAuthTabCallback + 119;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(performOneTimeSetup performonetimesetup) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(performonetimesetup);
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ setUnwindFunction onWarmupCompleted(Context context, View view, List list, String str, int i, int i2, Function1 function1, int i3, Object obj) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 31;
        int i8 = i7 % 128;
        IAuthTabCallback = i8;
        if (i7 % 2 != 0 ? (i3 & 4) != 0 : (i3 & 3) != 0) {
            int i9 = i8 + 107;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            int i11 = onWarmupCompleted;
            int i12 = i11 + 61;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 16) != 0) {
            int i16 = onWarmupCompleted + 45;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i3 & 32) != 0) {
            function1 = new Function1() { // from class: im.toss.uikit.dsl.MenuPopupWindowDslKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i18 = 2 % 2;
                    int i19 = onExtraCallback + 59;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    Unit unitOnWarmupCompleted = getBrandDomain.onWarmupCompleted((performOneTimeSetup) obj2);
                    if (i20 == 0) {
                        int i21 = 92 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            };
            int i18 = IAuthTabCallback + 97;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
        }
        return onExtraCallback(context, view, list, str2, i4, i5, function1);
    }

    private static final Unit IAuthTabCallback(performOneTimeSetup performonetimesetup) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(performonetimesetup, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(performonetimesetup, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static final setUnwindFunction onExtraCallback(@NotNull Context context, @NotNull View view, @NotNull List<performOneTimeSetup> list, @NotNull String str, int i, int i2, @NotNull Function1<? super performOneTimeSetup, Unit> function1) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        setUnwindFunction setunwindfunctionOnWarmupCompleted = performOneTimeSetuplambda1.onWarmupCompleted(context);
        setunwindfunctionOnWarmupCompleted.IAuthTabCallback(str);
        setunwindfunctionOnWarmupCompleted.onWarmupCompleted(list, function1);
        setUnwindFunction.IAuthTabCallback(setunwindfunctionOnWarmupCompleted, view, i, i2, 0, 8, null);
        int i6 = onWarmupCompleted + 65;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return setunwindfunctionOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 23;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
