package o;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getIconPaddingRight;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class getIconPaddingRight<T> {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;
    private final setTimestampBytes<T> onExtraCallback;
    private boolean onNavigationEvent;
    private final AppSetIdAndScope1 onWarmupCompleted;

    static {
        int i = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(getIconPaddingRight geticonpaddingright, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(geticonpaddingright, obj);
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public getIconPaddingRight(@Nullable String str, @NotNull setTimestampBytes<T> settimestampbytes) {
        Intrinsics.checkNotNullParameter(settimestampbytes, "");
        this.onExtraCallback = settimestampbytes;
        this.onNavigationEvent = true;
        this.onWarmupCompleted = ea10.onExtraCallbackWithResult("EventBus");
    }

    public final JsonReaderUnknownNumberParsing<T> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.IAuthTabCallback(wasNull.BUFFER), "");
            throw null;
        }
        JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsingIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(wasNull.BUFFER);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingIAuthTabCallback, "");
        int i3 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return jsonReaderUnknownNumberParsingIAuthTabCallback;
    }

    public final void onExtraCallbackWithResult(@NotNull T t) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(t, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(t, "");
        if (this.onNavigationEvent) {
            this.onExtraCallback.onExtraCallback(t);
            return;
        }
        int i3 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onExtraCallback(getIconPaddingRight geticonpaddingright, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(!geticonpaddingright.onNavigationEvent)) {
            int i5 = i2 + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            geticonpaddingright.onExtraCallback.onExtraCallback(obj);
            if (i6 != 0) {
                throw null;
            }
        }
        int i7 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void IAuthTabCallback(@NotNull final T t, long j, @NotNull TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            int i3 = 93 / 0;
            if (!this.onNavigationEvent) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            if (!this.onNavigationEvent) {
                return;
            }
        }
        Intrinsics.checkNotNull(clearTid.onNavigationEvent().onExtraCallbackWithResult().onNavigationEvent(new Runnable() { // from class: im.toss.core.common.EventBus$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 111;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                getIconPaddingRight geticonpaddingright = this.f$0;
                if (i6 == 0) {
                    getIconPaddingRight.onNavigationEvent(geticonpaddingright, t);
                } else {
                    getIconPaddingRight.onNavigationEvent(geticonpaddingright, t);
                    throw null;
                }
            }
        }, j, timeUnit));
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.onExtraCallback();
        this.onNavigationEvent = false;
        int i4 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final <T> getIconPaddingRight<T> onExtraCallbackWithResult(@Nullable String str, @Nullable T t) {
            setTid settidOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 109;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (t != null) {
                int i5 = i2 + 101;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                settidOnNavigationEvent = setTid.IAuthTabCallbackDefault(t);
            } else {
                settidOnNavigationEvent = setTid.onNavigationEvent();
            }
            Intrinsics.checkNotNull(settidOnNavigationEvent);
            return new getIconPaddingRight<>(str, settidOnNavigationEvent);
        }

        public final <T> getIconPaddingRight<T> onExtraCallbackWithResult(@Nullable String str) {
            int i = 2 % 2;
            getTimestampBytes gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
            getIconPaddingRight<T> geticonpaddingright = new getIconPaddingRight<>(str, gettimestampbytesIAuthTabCallback);
            int i2 = onNavigationEvent + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return geticonpaddingright;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
