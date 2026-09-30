package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.InternalCameraPresenceListener;
import o.x2ExternalSyntheticLambda19;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda19 {
    public static final x2ExternalSyntheticLambda19 onExtraCallback = new x2ExternalSyntheticLambda19();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 69;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private x2ExternalSyntheticLambda19() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent Fixed = new onNavigationEvent("Fixed", 0);
        public static final onNavigationEvent Fluid = new onNavigationEvent("Fluid", 1);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = Fixed;
            if (i3 != 0) {
                return new onNavigationEvent[]{onnavigationevent, Fluid};
            }
            onNavigationEvent onnavigationevent2 = Fluid;
            onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[3];
            onnavigationeventArr[0] = onnavigationevent;
            onnavigationeventArr[1] = onnavigationevent2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i2 + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
                int i3 = 60 / 0;
            } else {
                onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            }
            int i4 = onExtraCallback + 101;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onExtraCallback Intrinsic = new onExtraCallback("Intrinsic", 0);
        public static final onExtraCallback Uniform = new onExtraCallback("Uniform", 1);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = Intrinsic;
            if (i3 == 0) {
                return new onExtraCallback[]{onextracallback, Uniform};
            }
            onExtraCallback onextracallback2 = Uniform;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[4];
            onextracallbackArr[1] = onextracallback;
            onextracallbackArr[0] = onextracallback2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 11;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                int i4 = 93 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                int i3 = 49 / 0;
            } else {
                onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            }
            int i4 = onExtraCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onWarmupCompleted + 119;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public interface asBinder {
        public static final onWarmupCompleted Companion = onWarmupCompleted.IAuthTabCallback;

        public interface IAuthTabCallback extends asBinder {
            getHumanReadableName IAuthTabCallback();

            toMetersPerSecond onExtraCallback();

            toMetersPerSecond onExtraCallbackWithResult();

            DeviceQuirksExternalSyntheticLambda0 onNavigationEvent();

            DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted();
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallbackDefault = 0;
            private static int access100 = 1;
            private static int asInterface = 0;
            private static final IAuthTabCallback onExtraCallback;
            private static final onExtraCallbackWithResult onExtraCallbackWithResult;
            private static final onExtraCallbackWithResult onNavigationEvent;
            private static int onTransact = 1;
            private static final IAuthTabCallback onWarmupCompleted;
            static final /* synthetic */ onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
            private static final asBinder IAuthTabCallbackStub = new IAuthTabCallback();
            private static final asBinder asBinder = new onNavigationEvent();

            private onWarmupCompleted() {
            }

            public static final class IAuthTabCallback implements asBinder {
                IAuthTabCallback() {
                }
            }

            static {
                AppLovinAdSize appLovinAdSize = AppLovinAdSize.onWarmupCompleted;
                AppLovinAdClickListener appLovinAdClickListener = new AppLovinAdClickListener(appLovinAdSize.onExtraCallback(), null);
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
                AppLovinAdClickListener appLovinAdClickListener2 = new AppLovinAdClickListener(appLovinAdSize.IAuthTabCallbackStub(), null);
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                onExtraCallbackWithResult = new onExtraCallbackWithResult(appLovinAdClickListener, deviceQuirksExternalSyntheticLambda0OnExtraCallback, appLovinAdClickListener2, deviceQuirksExternalSyntheticLambda0OnExtraCallback2, appLovinPostbackService.getInterfaceDescriptor());
                onNavigationEvent = new onExtraCallbackWithResult(new AppLovinAdClickListener(appLovinAdSize.IAuthTabCallbackStub(), null), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)), new AppLovinAdClickListener(appLovinAdSize.asBinder(), null), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f)), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
                onWarmupCompleted = new IAuthTabCallback(new AppLovinAdClickListener(appLovinAdSize.onExtraCallback(), null), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), false, null, new AppLovinAdClickListener(appLovinAdSize.IAuthTabCallbackStub(), null), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), appLovinPostbackService.getInterfaceDescriptor(), 12, null);
                boolean z = false;
                onExtraCallback onextracallback = null;
                onExtraCallback = new IAuthTabCallback(new AppLovinAdClickListener(appLovinAdSize.IAuthTabCallbackStub(), null), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)), z, onextracallback, new AppLovinAdClickListener(appLovinAdSize.asBinder(), null), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f)), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), 12, null);
                int i = onTransact + 5;
                IAuthTabCallbackDefault = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 / 0;
                }
            }

            public final asBinder onExtraCallback() {
                asBinder asbinder;
                int i = 2 % 2;
                int i2 = access100 + 85;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 != 0) {
                    asbinder = IAuthTabCallbackStub;
                    int i4 = 46 / 0;
                } else {
                    asbinder = IAuthTabCallbackStub;
                }
                int i5 = i3 + 89;
                access100 = i5 % 128;
                if (i5 % 2 != 0) {
                    return asbinder;
                }
                throw null;
            }

            public static final class onNavigationEvent implements asBinder {
                onNavigationEvent() {
                }
            }

            public final asBinder IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = asInterface + 25;
                access100 = i2 % 128;
                if (i2 % 2 != 0) {
                    return asBinder;
                }
                throw null;
            }

            public final onExtraCallbackWithResult onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = access100 + 75;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult;
                if (i3 != 0) {
                    int i4 = 55 / 0;
                }
                return onextracallbackwithresult;
            }

            public final onExtraCallbackWithResult onWarmupCompleted() {
                onExtraCallbackWithResult onextracallbackwithresult;
                int i = 2 % 2;
                int i2 = access100;
                int i3 = i2 + 107;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    onextracallbackwithresult = onNavigationEvent;
                    int i4 = 70 / 0;
                } else {
                    onextracallbackwithresult = onNavigationEvent;
                }
                int i5 = i2 + 67;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final IAuthTabCallback onNavigationEvent() {
                IAuthTabCallback iAuthTabCallback;
                int i = 2 % 2;
                int i2 = access100;
                int i3 = i2 + 67;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    iAuthTabCallback = onWarmupCompleted;
                    int i4 = 3 / 0;
                } else {
                    iAuthTabCallback = onWarmupCompleted;
                }
                int i5 = i2 + 39;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallback;
            }

            public final IAuthTabCallback IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = access100;
                int i3 = i2 + 55;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                IAuthTabCallback iAuthTabCallback = onExtraCallback;
                int i4 = i2 + 37;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    return iAuthTabCallback;
                }
                throw null;
            }
        }
    }

    public static final class onExtraCallbackWithResult implements asBinder.IAuthTabCallback {
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback;
        private final toMetersPerSecond onExtraCallback;
        private final getHumanReadableName onExtraCallbackWithResult;
        private final DeviceQuirksExternalSyntheticLambda0 onNavigationEvent;
        private final toMetersPerSecond onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull toMetersPerSecond tometerspersecond, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull toMetersPerSecond tometerspersecond2, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, @NotNull getHumanReadableName gethumanreadablename) {
            Intrinsics.checkNotNullParameter(tometerspersecond, "");
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(tometerspersecond2, "");
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
            Intrinsics.checkNotNullParameter(gethumanreadablename, "");
            this.onExtraCallback = tometerspersecond;
            this.IAuthTabCallback = deviceQuirksExternalSyntheticLambda0;
            this.onWarmupCompleted = tometerspersecond2;
            this.onNavigationEvent = deviceQuirksExternalSyntheticLambda02;
            this.onExtraCallbackWithResult = gethumanreadablename;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public toMetersPerSecond onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 121;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public DeviceQuirksExternalSyntheticLambda0 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 61;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.IAuthTabCallback;
            int i5 = i3 + 89;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return deviceQuirksExternalSyntheticLambda0;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public toMetersPerSecond onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 105;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            toMetersPerSecond tometerspersecond = this.onWarmupCompleted;
            int i4 = i3 + 27;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return tometerspersecond;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 23;
            onTransact = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.onNavigationEvent;
            int i4 = i2 + 49;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return deviceQuirksExternalSyntheticLambda0;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public getHumanReadableName IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 97;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            getHumanReadableName gethumanreadablename = this.onExtraCallbackWithResult;
            int i5 = i2 + 45;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return gethumanreadablename;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            Class<?> cls;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 51;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                int i4 = i2 + 13;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                cls = null;
            }
            if (!Intrinsics.areEqual(onExtraCallbackWithResult.class, cls)) {
                int i6 = onTransact;
                int i7 = i6 + 1;
                IAuthTabCallbackStub = i7 % 128;
                boolean z = !(i7 % 2 == 0);
                int i8 = i6 + 75;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 == 0) {
                    return z;
                }
                throw null;
            }
            Intrinsics.checkNotNull(obj, "");
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(onExtraCallback(), onextracallbackwithresult.onExtraCallback())) {
                return false;
            }
            if (!Intrinsics.areEqual(onNavigationEvent(), onextracallbackwithresult.onNavigationEvent())) {
                int i9 = onTransact + 109;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(onExtraCallbackWithResult(), onextracallbackwithresult.onExtraCallbackWithResult())) {
                return false;
            }
            if (Intrinsics.areEqual(onWarmupCompleted(), onextracallbackwithresult.onWarmupCompleted())) {
                return Intrinsics.areEqual(IAuthTabCallback(), onextracallbackwithresult.IAuthTabCallback());
            }
            int i11 = IAuthTabCallbackStub + 43;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 57;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = onExtraCallback().hashCode();
            int iHashCode2 = onNavigationEvent().hashCode();
            int iHashCode3 = (((((((iHashCode * 31) + iHashCode2) * 31) + onExtraCallbackWithResult().hashCode()) * 31) + onWarmupCompleted().hashCode()) * 31) + IAuthTabCallback().hashCode();
            int i4 = IAuthTabCallbackStub + 9;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode3;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback implements asBinder.IAuthTabCallback {
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        private final boolean IAuthTabCallback;
        private final getHumanReadableName IAuthTabCallbackStub;
        private final onExtraCallback asInterface;
        private final toMetersPerSecond onExtraCallback;
        private final toMetersPerSecond onExtraCallbackWithResult;
        private final DeviceQuirksExternalSyntheticLambda0 onNavigationEvent;
        private final DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted;

        public IAuthTabCallback(@NotNull toMetersPerSecond tometerspersecond, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, @NotNull onExtraCallback onextracallback, @NotNull toMetersPerSecond tometerspersecond2, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, @NotNull getHumanReadableName gethumanreadablename) {
            Intrinsics.checkNotNullParameter(tometerspersecond, "");
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(tometerspersecond2, "");
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
            Intrinsics.checkNotNullParameter(gethumanreadablename, "");
            this.onExtraCallback = tometerspersecond;
            this.onWarmupCompleted = deviceQuirksExternalSyntheticLambda0;
            this.IAuthTabCallback = z;
            this.asInterface = onextracallback;
            this.onExtraCallbackWithResult = tometerspersecond2;
            this.onNavigationEvent = deviceQuirksExternalSyntheticLambda02;
            this.IAuthTabCallbackStub = gethumanreadablename;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(toMetersPerSecond tometerspersecond, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, onExtraCallback onextracallback, toMetersPerSecond tometerspersecond2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, getHumanReadableName gethumanreadablename, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z2;
            onExtraCallback onextracallback2;
            if ((i & 4) != 0) {
                int i2 = IAuthTabCallbackDefault + 21;
                onTransact = i2 % 128;
                z2 = i2 % 2 != 0;
            } else {
                z2 = z;
            }
            if ((i & 8) != 0) {
                int i3 = onTransact + 49;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                onextracallback2 = onExtraCallback.Intrinsic;
            } else {
                onextracallback2 = onextracallback;
            }
            this(tometerspersecond, deviceQuirksExternalSyntheticLambda0, z2, onextracallback2, tometerspersecond2, deviceQuirksExternalSyntheticLambda02, gethumanreadablename);
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public toMetersPerSecond onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 33;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            toMetersPerSecond tometerspersecond = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
            return tometerspersecond;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public DeviceQuirksExternalSyntheticLambda0 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 81;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.onWarmupCompleted;
            int i5 = i2 + 21;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return deviceQuirksExternalSyntheticLambda0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 77;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            boolean z = this.IAuthTabCallback;
            int i4 = i2 + 45;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final onExtraCallback onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 5;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.asInterface;
            }
            throw null;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public toMetersPerSecond onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 7;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 115;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.onNavigationEvent;
            int i5 = i3 + 9;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return deviceQuirksExternalSyntheticLambda0;
        }

        @Override // o.x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback
        public getHumanReadableName IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 23;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallbackStub;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            Class<?> cls;
            int i = 2 % 2;
            int i2 = onTransact + 17;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 117;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                int i5 = i3 + 85;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                cls = null;
            }
            if (!Intrinsics.areEqual(IAuthTabCallback.class, cls)) {
                int i7 = onTransact + 115;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            Intrinsics.checkNotNull(obj, "");
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.IAuthTabCallback != iAuthTabCallback.IAuthTabCallback || this.asInterface != iAuthTabCallback.asInterface || !Intrinsics.areEqual(onExtraCallback(), iAuthTabCallback.onExtraCallback())) {
                return false;
            }
            if (!Intrinsics.areEqual(onNavigationEvent(), iAuthTabCallback.onNavigationEvent())) {
                int i9 = onTransact + 73;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Intrinsics.areEqual(onExtraCallbackWithResult(), iAuthTabCallback.onExtraCallbackWithResult())) {
                return Intrinsics.areEqual(onWarmupCompleted(), iAuthTabCallback.onWarmupCompleted()) && Intrinsics.areEqual(IAuthTabCallback(), iAuthTabCallback.IAuthTabCallback());
            }
            int i11 = IAuthTabCallbackDefault + 59;
            onTransact = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 31;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.IAuthTabCallback);
            int iHashCode2 = this.asInterface.hashCode();
            int iHashCode3 = onExtraCallback().hashCode();
            int iHashCode4 = onNavigationEvent().hashCode();
            int iHashCode5 = (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + onExtraCallbackWithResult().hashCode()) * 31) + onWarmupCompleted().hashCode()) * 31) + IAuthTabCallback().hashCode();
            int i4 = onTransact + 75;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return iHashCode5;
        }
    }

    public static final class onWarmupCompleted {
        private static int asBinder = 0;
        private static int onExtraCallback = 1;
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        private final setContentInsetsRelative IAuthTabCallback;
        private Integer onNavigationEvent;
        public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
        private static final getCaptureIds<onWarmupCompleted, Object> onExtraCallbackWithResult = ImmediateSurface.onWarmupCompleted(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1$FluidState$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = x2ExternalSyntheticLambda19.onWarmupCompleted.onNavigationEvent((InternalCameraPresenceListener) obj, (x2ExternalSyntheticLambda19.onWarmupCompleted) obj2);
                int i4 = onExtraCallback + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }
        }, new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1$FluidState$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = x2ExternalSyntheticLambda19.onWarmupCompleted.onExtraCallbackWithResult(obj);
                if (i3 != 0) {
                    int i4 = 74 / 0;
                }
                return onwarmupcompletedOnExtraCallbackWithResult;
            }
        });

        public static /* synthetic */ onWarmupCompleted onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback(obj);
            int i4 = onExtraCallback + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onNavigationEvent(InternalCameraPresenceListener internalCameraPresenceListener, onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(internalCameraPresenceListener, onwarmupcompleted);
            if (i3 == 0) {
                int i4 = 49 / 0;
            }
            return objIAuthTabCallback;
        }

        public onWarmupCompleted(@NotNull setContentInsetsRelative setcontentinsetsrelative) {
            Intrinsics.checkNotNullParameter(setcontentinsetsrelative, "");
            this.IAuthTabCallback = setcontentinsetsrelative;
        }

        public static final /* synthetic */ getCaptureIds onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            getCaptureIds<onWarmupCompleted, Object> getcaptureids = onExtraCallbackWithResult;
            int i5 = i3 + 63;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return getcaptureids;
            }
            throw null;
        }

        public final setContentInsetsRelative onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            setContentInsetsRelative setcontentinsetsrelative = this.IAuthTabCallback;
            int i5 = i3 + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return setcontentinsetsrelative;
        }

        private onWarmupCompleted(setContentInsetsRelative setcontentinsetsrelative, Integer num) {
            this(setcontentinsetsrelative);
            this.onNavigationEvent = num;
        }

        public final Integer onExtraCallback(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, int i, @NotNull List<x2ExternalSyntheticLambda2> list, int i2) {
            boolean z;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Integer num = this.onNavigationEvent;
            if (num == null) {
                int i4 = onExtraCallback + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                int i6 = onWarmupCompleted + 125;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            if (num == null || num.intValue() != i2) {
                this.onNavigationEvent = Integer.valueOf(i2);
                x2ExternalSyntheticLambda2 x2externalsyntheticlambda2 = (x2ExternalSyntheticLambda2) CollectionsKt.getOrNull(list, i2);
                if (x2externalsyntheticlambda2 != null) {
                    int i8 = onWarmupCompleted + 125;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    int iOnNavigationEvent = onNavigationEvent(x2externalsyntheticlambda2, r8lambdanm9dm2eewl4vrptnjmesfjqky4, i, list);
                    if (this.IAuthTabCallback.IAuthTabCallbackStub() != iOnNavigationEvent) {
                        int i10 = onExtraCallback + 55;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        if (!z) {
                            return Integer.valueOf(iOnNavigationEvent);
                        }
                        this.IAuthTabCallback.onExtraCallback(iOnNavigationEvent - r8.IAuthTabCallbackStub());
                        int i11 = onExtraCallback + 73;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
            }
            int i13 = onWarmupCompleted + 9;
            onExtraCallback = i13 % 128;
            if (i13 % 2 != 0) {
                return null;
            }
            throw null;
        }

        private final int onNavigationEvent(x2ExternalSyntheticLambda2 x2externalsyntheticlambda2, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, int i, List<x2ExternalSyntheticLambda2> list) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iOnExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(((x2ExternalSyntheticLambda2) CollectionsKt.last(list)).onExtraCallbackWithResult()) + i;
            int iIAuthTabCallback = iOnExtraCallbackWithResult - this.IAuthTabCallback.IAuthTabCallback();
            int iCoerceIn = RangesKt.coerceIn(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(x2externalsyntheticlambda2.IAuthTabCallback()) - ((iIAuthTabCallback / 2) - (r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(x2externalsyntheticlambda2.onExtraCallback()) / 2)), 0, RangesKt.coerceAtLeast(iOnExtraCallbackWithResult - iIAuthTabCallback, 0));
            int i5 = onExtraCallback + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return iCoerceIn;
        }

        public static final class onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }

            public final getCaptureIds<onWarmupCompleted, Object> onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted.onExtraCallbackWithResult();
                }
                onWarmupCompleted.onExtraCallbackWithResult();
                throw null;
            }
        }

        static {
            int i = onTransact + 81;
            asBinder = i % 128;
            int i2 = i % 2;
        }

        private static final Object IAuthTabCallback(InternalCameraPresenceListener internalCameraPresenceListener, onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            int iIAuthTabCallbackStub = onwarmupcompleted.IAuthTabCallback.IAuthTabCallbackStub();
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new Integer[]{Integer.valueOf(iIAuthTabCallbackStub), onwarmupcompleted.onNavigationEvent});
            int i4 = onWarmupCompleted + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            return arrayListArrayListOf;
        }

        private static final onWarmupCompleted IAuthTabCallback(Object obj) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(obj, "");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "");
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(new setContentInsetsRelative(((Integer) obj2).intValue()), (Integer) list.get(1));
            int i2 = onExtraCallback + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallbackDefault implements onPostbackSuccess {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallbackDefault[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallbackDefault Item = new IAuthTabCallbackDefault("Item", 0);
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        private static final /* synthetic */ IAuthTabCallbackDefault[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = {Item};
            int i5 = i2 + 71;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallbackDefaultArr;
            }
            throw null;
        }

        public static EnumEntries<IAuthTabCallbackDefault> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<IAuthTabCallbackDefault> enumEntries = $ENTRIES;
            int i5 = i2 + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallbackDefault valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) Enum.valueOf(IAuthTabCallbackDefault.class, str);
            int i4 = onNavigationEvent + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        public static IAuthTabCallbackDefault[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = (IAuthTabCallbackDefault[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
            return iAuthTabCallbackDefaultArr;
        }

        private IAuthTabCallbackDefault(String str, int i) {
        }

        static {
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr$values = $values();
            $VALUES = iAuthTabCallbackDefaultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackDefaultArr$values);
            int i = onWarmupCompleted + 109;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
