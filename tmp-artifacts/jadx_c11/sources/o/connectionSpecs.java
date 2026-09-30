package o;

import android.os.Handler;
import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class connectionSpecs {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final ScrollView onExtraCallbackWithResult;
    private final RecyclerView onNavigationEvent;

    public final RecyclerView onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        ScrollView scrollView = this.onExtraCallbackWithResult;
        if (scrollView != null) {
            int i2 = onExtraCallback + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return scrollView.getScrollY();
            }
            scrollView.getScrollY();
            throw null;
        }
        RecyclerView recyclerView = this.onNavigationEvent;
        if (recyclerView == null) {
            return 0;
        }
        int i3 = onExtraCallback + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(recyclerView);
        int i5 = IAuthTabCallback + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iOnExtraCallbackWithResult;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        ScrollView scrollView = this.onExtraCallbackWithResult;
        if (scrollView != null) {
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return scrollView.getTop();
        }
        RecyclerView recyclerView = this.onNavigationEvent;
        if (recyclerView != null) {
            int i4 = onExtraCallback + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return recyclerView.getTop();
        }
        int i6 = IAuthTabCallback + 17;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
        return 0;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        ScrollView scrollView = this.onExtraCallbackWithResult;
        if (scrollView != null) {
            int i5 = i4 + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return scrollView.getBottom();
        }
        RecyclerView recyclerView = this.onNavigationEvent;
        if (recyclerView == null) {
            return 0;
        }
        int i7 = i2 + 81;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        int bottom = recyclerView.getBottom();
        if (i8 == 0) {
            int i9 = 4 / 0;
        }
        return bottom;
    }

    public final Handler onNavigationEvent() {
        Handler handler;
        int i = 2 % 2;
        ScrollView scrollView = this.onExtraCallbackWithResult;
        if (scrollView == null || (handler = scrollView.getHandler()) == null) {
            RecyclerView recyclerView = this.onNavigationEvent;
            if (recyclerView != null) {
                return recyclerView.getHandler();
            }
            return null;
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = i2 + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    private final int onExtraCallbackWithResult(RecyclerView recyclerView) {
        equalsNonHostokhttp equalsnonhostokhttp;
        int i = 2 % 2;
        Object obj = null;
        if (!(!(recyclerView instanceof equalsNonHostokhttp))) {
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            equalsnonhostokhttp = (equalsNonHostokhttp) recyclerView;
        } else {
            equalsnonhostokhttp = null;
        }
        if (equalsnonhostokhttp == null) {
            int i4 = onExtraCallback + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        int iIAuthTabCallbackStub = equalsnonhostokhttp.IAuthTabCallbackStub();
        int i6 = IAuthTabCallback + 61;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return iIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public connectionSpecs(@NotNull ScrollView scrollView) {
        this(scrollView, null);
        Intrinsics.checkNotNullParameter(scrollView, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public connectionSpecs(@NotNull RecyclerView recyclerView) {
        this(null, recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "");
    }

    private connectionSpecs(ScrollView scrollView, RecyclerView recyclerView) {
        this.onExtraCallbackWithResult = scrollView;
        this.onNavigationEvent = recyclerView;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.onExtraCallbackWithResult != null) {
            return true;
        }
        int i4 = i3 + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final View IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ScrollView scrollView = this.onExtraCallbackWithResult;
        if (scrollView != null) {
            int i4 = i3 + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return scrollView;
            }
            obj.hashCode();
            throw null;
        }
        RecyclerView recyclerView = this.onNavigationEvent;
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return recyclerView;
    }
}
