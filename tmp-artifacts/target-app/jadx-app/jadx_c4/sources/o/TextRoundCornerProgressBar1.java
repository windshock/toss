package o;

import android.media.AudioTrack;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TextRoundCornerProgressBar1<T> implements AutoCloseable {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int[] onWarmupCompleted;
    private final setProgressText<T> IAuthTabCallback;
    private final String onExtraCallback;
    private final Queue<setTextProgressMargin<T>> onExtraCallbackWithResult;

    static {
        onWarmupCompleted();
        Companion = new onExtraCallbackWithResult(null);
        int i = onNavigationEvent + 65;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 97 / 0;
        }
    }

    public TextRoundCornerProgressBar1(@NotNull String str, @NotNull setProgressText<T> setprogresstext, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(setprogresstext, "");
        this.onExtraCallback = str;
        this.IAuthTabCallback = setprogresstext;
        this.onExtraCallbackWithResult = new ConcurrentLinkedQueue();
        onExtraCallbackWithResult(i);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TextRoundCornerProgressBar1 textRoundCornerProgressBar1, setTextProgressMargin settextprogressmargin) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        textRoundCornerProgressBar1.onExtraCallback(settextprogressmargin);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(TextRoundCornerProgressBar1 textRoundCornerProgressBar1, setTextProgressMargin settextprogressmargin) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        textRoundCornerProgressBar1.onWarmupCompleted(settextprogressmargin);
        int i4 = onTransact + 53;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 89;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = IAuthTabCallbackDefault + 113;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                try {
                    this.onExtraCallbackWithResult.offer(onExtraCallbackWithResult());
                } catch (Exception e) {
                    e.getMessage();
                    ViewConfiguration.getJumpTapTimeout();
                }
            } else {
                this.onExtraCallbackWithResult.offer(onExtraCallbackWithResult());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            e.getMessage();
            ViewConfiguration.getJumpTapTimeout();
        }
    }

    private final TextRoundCornerProgressBar1<T>.onWarmupCompleted onExtraCallbackWithResult() throws Exception {
        int i = 2 % 2;
        this.onExtraCallbackWithResult.size();
        MotionEvent.axisFromString("");
        TextRoundCornerProgressBar1<T>.onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.IAuthTabCallback.onNavigationEvent());
        int i2 = onTransact + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    public final setTextProgressMargin<T> onNavigationEvent() throws Exception {
        int i = 2 % 2;
        setTextProgressMargin<T> settextprogressmarginPoll = this.onExtraCallbackWithResult.poll();
        if (settextprogressmarginPoll == null) {
            int i2 = IAuthTabCallbackDefault + 119;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            settextprogressmarginPoll = onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallbackDefault + 33;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return settextprogressmarginPoll;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i = 2 % 2;
        ViewConfiguration.getKeyRepeatDelay();
        int i2 = IAuthTabCallbackDefault + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            setTextProgressMargin<T> settextprogressmarginPoll = this.onExtraCallbackWithResult.poll();
            if (settextprogressmarginPoll != null) {
                settextprogressmarginPoll.onExtraCallback();
            } else {
                AudioTrack.getMinVolume();
                return;
            }
        }
    }

    private final void onWarmupCompleted(setTextProgressMargin<T> settextprogressmargin) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (settextprogressmargin == null) {
            return;
        }
        this.IAuthTabCallback.onExtraCallbackWithResult(settextprogressmargin.onWarmupCompleted());
        this.onExtraCallbackWithResult.offer(settextprogressmargin);
        int i4 = onTransact + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallback(setTextProgressMargin<T> settextprogressmargin) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (settextprogressmargin == null) {
            return;
        }
        this.IAuthTabCallback.IAuthTabCallback(settextprogressmargin.onWarmupCompleted());
        int i4 = onTransact + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new int[]{-1540416983, -538193554, -960117579, -746484056, 2129738819, -1539368987, -819805456, -797688382, 371378847, 764232508, 1803157361, 1045316031, -1564921312, 1754327566, 1933755051, -1024716197, 1703647377, 1590342888};
    }

    final class onWarmupCompleted implements setTextProgressMargin<T> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final T onWarmupCompleted;

        public onWarmupCompleted(T t) {
            this.onWarmupCompleted = t;
        }

        @Override // o.setTextProgressMargin
        public T onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            T t = this.onWarmupCompleted;
            int i4 = i3 + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 58 / 0;
            }
            return t;
        }

        @Override // o.setTextProgressMargin, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TextRoundCornerProgressBar1.onWarmupCompleted(TextRoundCornerProgressBar1.this, this);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.setTextProgressMargin
        public void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TextRoundCornerProgressBar1.onExtraCallbackWithResult(TextRoundCornerProgressBar1.this, this);
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
        }
    }
}
