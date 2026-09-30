package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.VirtualCameraControlExternalSyntheticLambda1;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplExternalSyntheticLambda7 {
    private static int IAuthTabCallback = 0;
    public static final AppLovinNativeAdImplExternalSyntheticLambda7 onExtraCallback = new AppLovinNativeAdImplExternalSyntheticLambda7();
    private static int onNavigationEvent = 1;

    static {
        int i = onNavigationEvent + 17;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AppLovinNativeAdImplExternalSyntheticLambda7() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback Default = new onExtraCallback("Default", 0);
        public static final onExtraCallback Thick = new onExtraCallback("Thick", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return new onExtraCallback[]{Default, Thick};
            }
            onExtraCallback onextracallback = Default;
            onExtraCallback onextracallback2 = Thick;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[2];
            onextracallbackArr[1] = onextracallback;
            onextracallbackArr[1] = onextracallback2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onNavigationEvent + 43;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 52 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted None = new onWarmupCompleted("None", 0);
        public static final onWarmupCompleted Leading = new onWarmupCompleted("Leading", 1);
        public static final onWarmupCompleted Side = new onWarmupCompleted("Side", 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 93;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {None, Leading, Side};
            int i5 = i2 + 23;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i4 = i3 + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onWarmupCompleted + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 97 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i3 = 6 / 0;
            } else {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            }
            int i4 = IAuthTabCallback + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onExtraCallbackWithResult + 113;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    public interface onNavigationEvent {
        float onExtraCallbackWithResult();

        /* renamed from: o.AppLovinNativeAdImplExternalSyntheticLambda7$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0005onNavigationEvent implements onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackStub = 1;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            public static final C0005onNavigationEvent onExtraCallbackWithResult = new C0005onNavigationEvent();
            private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 121;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0005onNavigationEvent)) {
                    return false;
                }
                int i4 = i3 + 97;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 103;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 33;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return 1473398491;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 123;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = i3 + 65;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return "Medium";
            }

            private C0005onNavigationEvent() {
            }

            @Override // o.AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent
            public float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 21;
                int i3 = i2 % 128;
                IAuthTabCallbackStub = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                float f = onWarmupCompleted;
                int i4 = i3 + 13;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return f;
            }

            static {
                int i = onNavigationEvent + 75;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        public static final C0004onExtraCallbackWithResult Companion;
        private static final onExtraCallbackWithResult IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 0;
        private static int asInterface = 1;
        private static final onExtraCallbackWithResult onExtraCallbackWithResult;
        private static int onTransact = 1;
        private static final onExtraCallbackWithResult onWarmupCompleted;
        private final float onExtraCallback;
        private final float onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i2 = asInterface + 23;
                asBinder = i2 % 128;
                return i2 % 2 != 0;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, onextracallbackwithresult.onExtraCallback);
            }
            int i3 = asBinder + 1;
            asInterface = i3 % 128;
            return i3 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 75;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent);
            return (i3 != 0 ? iOnWarmupCompleted << 114 : iOnWarmupCompleted * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Type(startIndent=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback) + ")";
            int i2 = asBinder + 33;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        private onExtraCallbackWithResult(float f, float f2) {
            this.onNavigationEvent = f;
            this.onExtraCallback = f2;
        }

        public static final /* synthetic */ onExtraCallbackWithResult onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 81;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = onWarmupCompleted;
            int i5 = i2 + 27;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 17 / 0;
            }
            return onextracallbackwithresult;
        }

        public static final /* synthetic */ onExtraCallbackWithResult onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 13;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = IAuthTabCallback;
            int i5 = i2 + 29;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }

        public static final /* synthetic */ onExtraCallbackWithResult onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 19;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult;
            int i5 = i3 + 119;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 107;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onNavigationEvent;
            int i5 = i2 + 55;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 37;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallback;
            int i5 = i2 + 33;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return f;
        }

        /* renamed from: o.AppLovinNativeAdImplExternalSyntheticLambda7$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0004onExtraCallbackWithResult {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ C0004onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0004onExtraCallbackWithResult() {
            }

            public final onExtraCallbackWithResult onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 17;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    onExtraCallbackWithResult.onNavigationEvent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onExtraCallbackWithResult.onNavigationEvent();
                int i3 = onNavigationEvent + 103;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return onextracallbackwithresultOnNavigationEvent;
            }

            public final onExtraCallbackWithResult onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallbackWithResult.onExtraCallback();
                if (i3 == 0) {
                    int i4 = 83 / 0;
                }
                return onextracallbackwithresultOnExtraCallback;
            }

            public final onExtraCallbackWithResult IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onExtraCallbackWithResult.onWarmupCompleted();
                int i4 = onNavigationEvent + 19;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackwithresultOnWarmupCompleted;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new C0004onExtraCallbackWithResult(defaultConstructorMarker);
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = VirtualCameraControlExternalSyntheticLambda1.Companion;
            IAuthTabCallback = new onExtraCallbackWithResult(fIAuthTabCallback, onextracallbackwithresult.onWarmupCompleted(), defaultConstructorMarker);
            onWarmupCompleted = new onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), onextracallbackwithresult.onWarmupCompleted(), defaultConstructorMarker);
            onExtraCallbackWithResult = new onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), MaxAdRequestListener.IAuthTabCallback.onNavigationEvent(), defaultConstructorMarker);
            int i = IAuthTabCallbackDefault + 35;
            onTransact = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
