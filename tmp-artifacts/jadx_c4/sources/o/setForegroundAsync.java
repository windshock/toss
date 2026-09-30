package o;

import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setForegroundAsync {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final setForegroundAsync onExtraCallback = new setForegroundAsync();
    private static final access6900<onExtraCallbackWithResult> onExtraCallbackWithResult = new access6900<>();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private setForegroundAsync() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted IDLE = new onWarmupCompleted("IDLE", 0);
        public static final onWarmupCompleted OPENING = new onWarmupCompleted("OPENING", 1);
        public static final onWarmupCompleted OPENED = new onWarmupCompleted("OPENED", 2);
        public static final onWarmupCompleted CLOSING = new onWarmupCompleted("CLOSING", 3);
        public static final onWarmupCompleted CLOSED = new onWarmupCompleted("CLOSED", 4);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 15;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {IDLE, OPENING, OPENED, CLOSING, CLOSED};
            int i5 = i2 + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 121;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i4 = i2 + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i3 = 96 / 0;
            } else {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            }
            int i4 = onNavigationEvent + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onWarmupCompleted + 93;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onWarmupCompleted(String str, int i) {
        }
    }

    static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final setOnOutOfMemeryErrorCallback IAuthTabCallback;
        private onWarmupCompleted onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 49;
                onNavigationEvent = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return false;
            }
            if (this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted) {
                return true;
            }
            int i3 = onExtraCallback + 75;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode();
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BridgeEntry(callbackProxy=" + this.IAuthTabCallback + ", state=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.IAuthTabCallback = setonoutofmemeryerrorcallback;
            this.onWarmupCompleted = onwarmupcompleted;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, onWarmupCompleted onwarmupcompleted, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onNavigationEvent + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    onwarmupcompleted = onWarmupCompleted.IDLE;
                    int i3 = 15 / 0;
                } else {
                    onwarmupcompleted = onWarmupCompleted.IDLE;
                }
                int i4 = 2 % 2;
            }
            this(setonoutofmemeryerrorcallback, onwarmupcompleted);
        }

        public final setOnOutOfMemeryErrorCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
            int i4 = i3 + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompleted;
            }
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallback(@NotNull onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                this.onWarmupCompleted = onwarmupcompleted;
            } else {
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                this.onWarmupCompleted = onwarmupcompleted;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    static {
        int i = IAuthTabCallback + 31;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final onExtraCallbackWithResult onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) onExtraCallbackWithResult.onExtraCallback();
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresult;
    }

    public final void onExtraCallback(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        onWarmupCompleted onwarmupcompleted = null;
        onExtraCallbackWithResult.addLast(new onExtraCallbackWithResult(setonoutofmemeryerrorcallback, onwarmupcompleted, 2, onwarmupcompleted));
        int i2 = IAuthTabCallbackStub + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        onwarmupcompleted.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultOnTransact = onTransact();
        if (onextracallbackwithresultOnTransact != null) {
            int i2 = IAuthTabCallbackStub + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (onextracallbackwithresultOnTransact.IAuthTabCallback() == onWarmupCompleted.IDLE) {
                onextracallbackwithresultOnTransact.onExtraCallback(onWarmupCompleted.OPENING);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(onextracallbackwithresultOnTransact.onNavigationEvent(), "onOpenStart", (Map) null, 2, (Object) null);
                setOnOutOfMemeryErrorCallback.onExtraCallback(onextracallbackwithresultOnTransact.onNavigationEvent(), "onOpenStart", null, 2, null);
                return;
            }
        }
        int i4 = IAuthTabCallbackStub + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultOnTransact = onTransact();
        if (onextracallbackwithresultOnTransact != null) {
            int i4 = onWarmupCompleted + 1;
            IAuthTabCallbackStub = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                onextracallbackwithresultOnTransact.IAuthTabCallback();
                onWarmupCompleted onwarmupcompleted = onWarmupCompleted.OPENING;
                obj.hashCode();
                throw null;
            }
            if (onextracallbackwithresultOnTransact.IAuthTabCallback() != onWarmupCompleted.OPENING) {
                return;
            }
            onextracallbackwithresultOnTransact.onExtraCallback(onWarmupCompleted.OPENED);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(onextracallbackwithresultOnTransact.onNavigationEvent(), "onOpenEnd", (Map) null, 2, (Object) null);
            setOnOutOfMemeryErrorCallback.onExtraCallback(onextracallbackwithresultOnTransact.onNavigationEvent(), "onOpenEnd", null, 2, null);
            int i5 = onWarmupCompleted + 109;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultOnTransact = onTransact();
        if (onextracallbackwithresultOnTransact != null) {
            int i4 = onWarmupCompleted + 31;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (onextracallbackwithresultOnTransact.IAuthTabCallback() == onWarmupCompleted.OPENED || onextracallbackwithresultOnTransact.IAuthTabCallback() == onWarmupCompleted.OPENING) {
                onextracallbackwithresultOnTransact.onExtraCallback(onWarmupCompleted.CLOSING);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(onextracallbackwithresultOnTransact.onNavigationEvent(), "onCloseStart", (Map) null, 2, (Object) null);
                setOnOutOfMemeryErrorCallback.onExtraCallback(onextracallbackwithresultOnTransact.onNavigationEvent(), "onCloseStart", null, 2, null);
            }
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultOnTransact = onTransact();
        if (onextracallbackwithresultOnTransact != null) {
            onextracallbackwithresultOnTransact.onExtraCallback(onWarmupCompleted.CLOSED);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(onextracallbackwithresultOnTransact.onNavigationEvent(), "onCloseEnd", (Map) null, 2, (Object) null);
            setOnOutOfMemeryErrorCallback.onExtraCallback(onextracallbackwithresultOnTransact.onNavigationEvent(), "onCloseEnd", null, 2, null);
            onExtraCallbackWithResult.IAuthTabCallbackDefault();
            return;
        }
        int i4 = onWarmupCompleted + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult.IAuthTabCallbackDefault();
        int i4 = IAuthTabCallbackStub + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
