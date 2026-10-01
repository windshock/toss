package o;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawSecondaryProgress extends TextRoundCornerProgressBar2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final BaseRoundCornerProgressBar onExtraCallback;
    private final setOnProgressChangedListener onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drawSecondaryProgress(@NotNull BaseRoundCornerProgressBar baseRoundCornerProgressBar, @NotNull setOnProgressChangedListener setonprogresschangedlistener) {
        super(baseRoundCornerProgressBar, setonprogresschangedlistener);
        Intrinsics.checkNotNullParameter(baseRoundCornerProgressBar, "");
        Intrinsics.checkNotNullParameter(setonprogresschangedlistener, "");
        this.onExtraCallback = baseRoundCornerProgressBar;
        this.onExtraCallbackWithResult = setonprogresschangedlistener;
    }

    @Override // o.TextRoundCornerProgressBar2
    public /* synthetic */ Collection onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            throw null;
        }
        List<String> listIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = IAuthTabCallback + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return listIAuthTabCallbackStub;
        }
        throw null;
    }

    @Override // o.TextRoundCornerProgressBar2, o.TextRoundCornerProgressBarSavedState1
    public SharedPreferences onExtraCallback() {
        BaseRoundCornerProgressBar baseRoundCornerProgressBar;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            baseRoundCornerProgressBar = this.onExtraCallback;
            int i4 = 6 / 0;
        } else {
            baseRoundCornerProgressBar = this.onExtraCallback;
        }
        int i5 = i3 + 31;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return baseRoundCornerProgressBar;
    }

    public List<String> IAuthTabCallbackStub() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List<String> listIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
        int i4 = onNavigationEvent + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return listIAuthTabCallback;
    }
}
