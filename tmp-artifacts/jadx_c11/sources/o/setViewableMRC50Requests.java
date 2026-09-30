package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setViewableMRC50Requests {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final setViewableMRC50Requests onExtraCallbackWithResult = new setViewableMRC50Requests();

    static {
        int i = IAuthTabCallback + 15;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private setViewableMRC50Requests() {
    }

    public static final class onWarmupCompleted {
        public static final IAuthTabCallback Companion;
        private static final onWarmupCompleted IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int access000 = 1;
        private static int asInterface;
        private static final onWarmupCompleted onExtraCallback;
        private static final onWarmupCompleted onExtraCallbackWithResult;
        private static final onWarmupCompleted onWarmupCompleted;
        private final float asBinder;
        private final float onNavigationEvent;
        private final float onTransact;

        public /* synthetic */ onWarmupCompleted(float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3);
        }

        public static /* synthetic */ onWarmupCompleted IAuthTabCallback(onWarmupCompleted onwarmupcompleted, float f, float f2, float f3, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = asInterface + 109;
            int i4 = i3 % 128;
            access000 = i4;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                f = onwarmupcompleted.onTransact;
            }
            if ((i & 2) != 0) {
                int i5 = i4 + 111;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                f2 = onwarmupcompleted.asBinder;
                int i7 = i4 + 105;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
            if ((i & 4) != 0) {
                int i9 = i4 + 111;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                f3 = onwarmupcompleted.onNavigationEvent;
                if (i10 != 0) {
                    int i11 = 51 / 0;
                }
            }
            return onwarmupcompleted.IAuthTabCallback(f, f2, f3);
        }

        public final onWarmupCompleted IAuthTabCallback(float f, float f2, float f3) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(f, f2, f3, null);
            int i2 = asInterface + 7;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i2 = asInterface + 73;
                access000 = i2 % 128;
                return i2 % 2 == 0;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onTransact, onwarmupcompleted.onTransact)) {
                return false;
            }
            if (!(!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asBinder, onwarmupcompleted.asBinder))) {
                return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent);
            }
            int i3 = asInterface + 111;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = access000 + 25;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = (((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onTransact) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asBinder)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent);
            int i4 = asInterface + 59;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                return iOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Size(radius=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onTransact) + ", assetSize=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder) + ", assetPadding=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ")";
            int i2 = asInterface + 15;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        private onWarmupCompleted(float f, float f2, float f3) {
            this.onTransact = f;
            this.asBinder = f2;
            this.onNavigationEvent = f3;
        }

        public static final /* synthetic */ onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 39;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = onWarmupCompleted;
            int i5 = i2 + 107;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 31;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = onExtraCallback;
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            return onwarmupcompleted;
        }

        public static final /* synthetic */ onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = access000 + 63;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = IAuthTabCallback;
            int i5 = i3 + 47;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access000 + 25;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onWarmupCompleted onwarmupcompleted = onExtraCallbackWithResult;
            int i4 = i3 + 1;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public final float IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = access000 + 1;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onTransact;
            if (i3 != 0) {
                int i4 = 41 / 0;
            }
            return f;
        }

        public final float onTransact() {
            int i = 2 % 2;
            int i2 = asInterface + 85;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            float f = this.asBinder;
            int i5 = i3 + 65;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = access000 + 71;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f = this.onNavigationEvent;
            int i4 = i3 + 43;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            return f;
        }

        public static final class IAuthTabCallback {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final onWarmupCompleted IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted.onNavigationEvent();
                }
                onWarmupCompleted.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onWarmupCompleted onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onWarmupCompleted2 = onWarmupCompleted.onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onWarmupCompleted2;
            }

            public final onWarmupCompleted onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onWarmupCompleted.onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return onwarmupcompletedOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final onWarmupCompleted onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedIAuthTabCallback = onWarmupCompleted.IAuthTabCallback();
                int i4 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 39 / 0;
                }
                return onwarmupcompletedIAuthTabCallback;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new IAuthTabCallback(defaultConstructorMarker);
            AppLovinAdSize appLovinAdSize = AppLovinAdSize.onWarmupCompleted;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(appLovinAdSize.onExtraCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), defaultConstructorMarker);
            IAuthTabCallback = onwarmupcompleted;
            onExtraCallbackWithResult = new onWarmupCompleted(appLovinAdSize.IAuthTabCallbackStub(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), defaultConstructorMarker);
            onExtraCallback = new onWarmupCompleted(appLovinAdSize.asBinder(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), defaultConstructorMarker);
            onWarmupCompleted = onwarmupcompleted;
            int i = IAuthTabCallbackStub + 19;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent Border;
        public static final onNavigationEvent Clear;
        public static final onWarmupCompleted Companion;
        private static final onNavigationEvent Default;
        public static final onNavigationEvent Fill;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {Clear, Fill, Border};
            int i5 = i2 + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 103;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i2 + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                int i4 = 14 / 0;
            }
            int i5 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
            }
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        public static final /* synthetic */ onNavigationEvent access$getDefault$cp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return Default;
            }
            throw null;
        }

        static {
            onNavigationEvent onnavigationevent = new onNavigationEvent("Clear", 0);
            Clear = onnavigationevent;
            Fill = new onNavigationEvent("Fill", 1);
            Border = new onNavigationEvent("Border", 2);
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            Companion = new onWarmupCompleted(null);
            Default = onnavigationevent;
            int i = onExtraCallback + 35;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onNavigationEvent onExtraCallback() {
                onNavigationEvent onnavigationeventAccess$getDefault$cp;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    onnavigationeventAccess$getDefault$cp = onNavigationEvent.access$getDefault$cp();
                    int i3 = 95 / 0;
                } else {
                    onnavigationeventAccess$getDefault$cp = onNavigationEvent.access$getDefault$cp();
                }
                int i4 = IAuthTabCallback + 5;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationeventAccess$getDefault$cp;
            }
        }
    }
}
