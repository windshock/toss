package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class loop {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final onNavigationEvent onExtraCallback;
    private final IAuthTabCallback onExtraCallbackWithResult;

    public /* synthetic */ loop(IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent, DefaultConstructorMarker defaultConstructorMarker) {
        this(iAuthTabCallback, onnavigationevent);
    }

    private loop(IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent) {
        this.onExtraCallbackWithResult = iAuthTabCallback;
        this.onExtraCallback = onnavigationevent;
    }

    public final IAuthTabCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onNavigationEvent onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onNavigationEvent onnavigationevent = this.onExtraCallback;
        int i4 = i3 + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationevent;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallback Top = new IAuthTabCallback("Top", 0);
        public static final IAuthTabCallback Bottom = new IAuthTabCallback("Bottom", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 17;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {Top, Bottom};
            int i5 = i2 + 65;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 121;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 != 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            throw null;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onWarmupCompleted + 93;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallback(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent Left = new onNavigationEvent("Left", 0);
        public static final onNavigationEvent Right = new onNavigationEvent("Right", 1);
        public static final onNavigationEvent Center = new onNavigationEvent("Center", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {Left, Right, Center};
            int i5 = i2 + 95;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onWarmupCompleted + 41;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 != 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            int i4 = 12 / 0;
            return (onNavigationEvent[]) onnavigationeventArr.clone();
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallback + 19;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private onNavigationEvent(String str, int i) {
        }
    }

    public static final class onExtraCallbackWithResult extends loop {
        private static int onExtraCallback = 0;
        public static final int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final float IAuthTabCallback;

        public /* synthetic */ onExtraCallbackWithResult(float f, IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, iAuthTabCallback, onnavigationevent);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private onExtraCallbackWithResult(float f, IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent) {
            super(iAuthTabCallback, onnavigationevent, null);
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.IAuthTabCallback = f;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i2 + 9;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(float f, IAuthTabCallback iAuthTabCallback, onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                int i2 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i3 = onWarmupCompleted + 51;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    iAuthTabCallback = IAuthTabCallback.Bottom;
                    int i4 = 43 / 0;
                } else {
                    iAuthTabCallback = IAuthTabCallback.Bottom;
                }
            }
            if ((i & 4) != 0) {
                int i5 = onExtraCallback + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                onnavigationevent = onNavigationEvent.Center;
                int i7 = 2 % 2;
            }
            this(f, iAuthTabCallback, onnavigationevent, null);
        }
    }

    public static final class onExtraCallback extends loop {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        public onExtraCallback() {
            IAuthTabCallback iAuthTabCallback = null;
            this(iAuthTabCallback, 1, iAuthTabCallback);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iAuthTabCallback = IAuthTabCallback.Bottom;
                int i4 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(iAuthTabCallback);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull IAuthTabCallback iAuthTabCallback) {
            super(iAuthTabCallback, onNavigationEvent.Center, null);
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        }
    }
}
