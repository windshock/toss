package o;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setDetectCallBack {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final setDetectCallBack onExtraCallbackWithResult = new setDetectCallBack();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 27;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 98 / 0;
        }
    }

    private setDetectCallBack() {
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallback(Context context, String str, getProgressColor getprogresscolor, getMax getmax, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onNavigationEvent + 117;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 60 / 0;
            }
            getprogresscolor = null;
        }
        if ((i & 8) != 0) {
            int i5 = onExtraCallback + 15;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            getmax = null;
        }
        return onExtraCallback(context, str, getprogresscolor, getmax);
    }

    @JvmStatic
    public static final TextRoundCornerProgressBarSavedState1 onExtraCallback(@NotNull Context context, @NotNull String str, @Nullable getProgressColor getprogresscolor, @Nullable getMax getmax) {
        int i = 2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        BaseRoundCornerProgressBar baseRoundCornerProgressBar = new BaseRoundCornerProgressBar(context, str, 0);
        setOnProgressChangedListener setonprogresschangedlistener = null;
        if (getprogresscolor != null) {
            int i3 = onNavigationEvent + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            BaseRoundCornerProgressBar.onExtraCallbackWithResult(baseRoundCornerProgressBar, getprogresscolor, null, 2, null);
            int i5 = onNavigationEvent + 113;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if (getmax != null) {
            int i7 = onNavigationEvent + 87;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            BaseRoundCornerProgressBar.IAuthTabCallback(baseRoundCornerProgressBar, getmax, null, 2, null);
        }
        return new TextRoundCornerProgressBar2(baseRoundCornerProgressBar, setonprogresschangedlistener, i, setonprogresschangedlistener);
    }
}
