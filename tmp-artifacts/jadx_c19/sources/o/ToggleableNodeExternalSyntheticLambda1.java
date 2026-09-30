package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ToggleableNodeExternalSyntheticLambda1 {
    public static final onNavigationEvent Companion;
    public static final int IAuthTabCallback = 0;
    private static final int IAuthTabCallbackDefault;
    private static final ToggleableNodeExternalSyntheticLambda1 IAuthTabCallbackStub;
    private static final ToggleableNodeExternalSyntheticLambda1 IAuthTabCallbackStubProxy;
    private static final int IAuthTabCallback_Parcel;
    private static final ToggleableNodeExternalSyntheticLambda1 ICustomTabsCallback;
    private static final int access000;
    private static final int access100;
    private static final int asBinder;
    private static final ToggleableNodeExternalSyntheticLambda1 asInterface;
    private static final ToggleableNodeExternalSyntheticLambda1 getInterfaceDescriptor;
    private static final ToggleableNodeExternalSyntheticLambda1 onExtraCallback;
    private static final ToggleableNodeExternalSyntheticLambda1 onExtraCallbackWithResult;
    private static final ToggleableNodeExternalSyntheticLambda1 onNavigationEvent;
    private static final ToggleableNodeExternalSyntheticLambda1 onTransact;
    private static final int onWarmupCompleted;
    private final int extraCallbackWithResult;
    private final int writeTypedObject;

    public /* synthetic */ ToggleableNodeExternalSyntheticLambda1(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    private ToggleableNodeExternalSyntheticLambda1(int i2, int i3) {
        this.writeTypedObject = i2;
        this.extraCallbackWithResult = i3;
    }

    public final int IAuthTabCallbackDefault() {
        return this.extraCallbackWithResult;
    }

    public final int asInterface() {
        return this.writeTypedObject;
    }

    @JvmInline
    public static final class onWarmupCompleted {
        private final int onExtraCallback;
        public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
        private static final int onExtraCallbackWithResult = onWarmupCompleted(0);
        private static final int onWarmupCompleted = onWarmupCompleted(1);
        private static final int onNavigationEvent = onWarmupCompleted(2);

        public static String IAuthTabCallback(int i2) {
            return "Horizontal(value=" + i2 + ')';
        }

        public static int onExtraCallback(int i2) {
            return Integer.hashCode(i2);
        }

        public static final boolean onExtraCallback(int i2, int i3) {
            return i2 == i3;
        }

        public static boolean onExtraCallback(int i2, Object obj) {
            return (obj instanceof onWarmupCompleted) && i2 == ((onWarmupCompleted) obj).onNavigationEvent();
        }

        public static final /* synthetic */ onWarmupCompleted onNavigationEvent(int i2) {
            return new onWarmupCompleted(i2);
        }

        private static int onWarmupCompleted(int i2) {
            return i2;
        }

        public boolean equals(Object obj) {
            return onExtraCallback(this.onExtraCallback, obj);
        }

        public int hashCode() {
            return onExtraCallback(this.onExtraCallback);
        }

        public final /* synthetic */ int onNavigationEvent() {
            return this.onExtraCallback;
        }

        public String toString() {
            return IAuthTabCallback(this.onExtraCallback);
        }

        public static final class IAuthTabCallback {
            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final int IAuthTabCallback() {
                return onWarmupCompleted.onExtraCallbackWithResult;
            }

            public final int onExtraCallback() {
                return onWarmupCompleted.onWarmupCompleted;
            }

            public final int onNavigationEvent() {
                return onWarmupCompleted.onNavigationEvent;
            }
        }

        private /* synthetic */ onWarmupCompleted(int i2) {
            this.onExtraCallback = i2;
        }
    }

    @JvmInline
    public static final class IAuthTabCallback {
        private final int IAuthTabCallback;
        public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
        private static final int onExtraCallback = IAuthTabCallback(0);
        private static final int onWarmupCompleted = IAuthTabCallback(1);
        private static final int onNavigationEvent = IAuthTabCallback(2);

        private static int IAuthTabCallback(int i2) {
            return i2;
        }

        public static final boolean IAuthTabCallback(int i2, int i3) {
            return i2 == i3;
        }

        public static final /* synthetic */ IAuthTabCallback onExtraCallback(int i2) {
            return new IAuthTabCallback(i2);
        }

        public static int onExtraCallbackWithResult(int i2) {
            return Integer.hashCode(i2);
        }

        public static boolean onExtraCallbackWithResult(int i2, Object obj) {
            return (obj instanceof IAuthTabCallback) && i2 == ((IAuthTabCallback) obj).onWarmupCompleted();
        }

        public static String onWarmupCompleted(int i2) {
            return "Vertical(value=" + i2 + ')';
        }

        public boolean equals(Object obj) {
            return onExtraCallbackWithResult(this.IAuthTabCallback, obj);
        }

        public int hashCode() {
            return onExtraCallbackWithResult(this.IAuthTabCallback);
        }

        public final /* synthetic */ int onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public String toString() {
            return onWarmupCompleted(this.IAuthTabCallback);
        }

        public static final class onExtraCallbackWithResult {
            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }

            public final int onExtraCallbackWithResult() {
                return IAuthTabCallback.onExtraCallback;
            }

            public final int IAuthTabCallback() {
                return IAuthTabCallback.onWarmupCompleted;
            }

            public final int onExtraCallback() {
                return IAuthTabCallback.onNavigationEvent;
            }
        }

        private /* synthetic */ IAuthTabCallback(int i2) {
            this.IAuthTabCallback = i2;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final ToggleableNodeExternalSyntheticLambda1 asInterface() {
            return ToggleableNodeExternalSyntheticLambda1.ICustomTabsCallback;
        }

        public final ToggleableNodeExternalSyntheticLambda1 onExtraCallback() {
            return ToggleableNodeExternalSyntheticLambda1.IAuthTabCallbackStub;
        }

        public final ToggleableNodeExternalSyntheticLambda1 onWarmupCompleted() {
            return ToggleableNodeExternalSyntheticLambda1.asInterface;
        }

        public final ToggleableNodeExternalSyntheticLambda1 onNavigationEvent() {
            return ToggleableNodeExternalSyntheticLambda1.onTransact;
        }

        public final ToggleableNodeExternalSyntheticLambda1 onExtraCallbackWithResult() {
            return ToggleableNodeExternalSyntheticLambda1.onExtraCallbackWithResult;
        }

        public final int asBinder() {
            return ToggleableNodeExternalSyntheticLambda1.access000;
        }

        public final int IAuthTabCallback() {
            return ToggleableNodeExternalSyntheticLambda1.asBinder;
        }

        public final int IAuthTabCallbackDefault() {
            return ToggleableNodeExternalSyntheticLambda1.IAuthTabCallback_Parcel;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        onWarmupCompleted.IAuthTabCallback iAuthTabCallback = onWarmupCompleted.Companion;
        int iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
        IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = IAuthTabCallback.Companion;
        ICustomTabsCallback = new ToggleableNodeExternalSyntheticLambda1(iIAuthTabCallback, onextracallbackwithresult.onExtraCallbackWithResult(), defaultConstructorMarker);
        IAuthTabCallbackStubProxy = new ToggleableNodeExternalSyntheticLambda1(iAuthTabCallback.onExtraCallback(), onextracallbackwithresult.onExtraCallbackWithResult(), defaultConstructorMarker);
        getInterfaceDescriptor = new ToggleableNodeExternalSyntheticLambda1(iAuthTabCallback.onNavigationEvent(), onextracallbackwithresult.onExtraCallbackWithResult(), defaultConstructorMarker);
        IAuthTabCallbackStub = new ToggleableNodeExternalSyntheticLambda1(iAuthTabCallback.IAuthTabCallback(), onextracallbackwithresult.IAuthTabCallback(), defaultConstructorMarker);
        asInterface = new ToggleableNodeExternalSyntheticLambda1(iAuthTabCallback.onExtraCallback(), onextracallbackwithresult.IAuthTabCallback(), defaultConstructorMarker);
        onTransact = new ToggleableNodeExternalSyntheticLambda1(iAuthTabCallback.onNavigationEvent(), onextracallbackwithresult.IAuthTabCallback(), defaultConstructorMarker);
        onExtraCallback = new ToggleableNodeExternalSyntheticLambda1(iAuthTabCallback.IAuthTabCallback(), onextracallbackwithresult.onExtraCallback(), defaultConstructorMarker);
        onNavigationEvent = new ToggleableNodeExternalSyntheticLambda1(iAuthTabCallback.onExtraCallback(), onextracallbackwithresult.onExtraCallback(), defaultConstructorMarker);
        onExtraCallbackWithResult = new ToggleableNodeExternalSyntheticLambda1(iAuthTabCallback.onNavigationEvent(), onextracallbackwithresult.onExtraCallback(), defaultConstructorMarker);
        access000 = onextracallbackwithresult.onExtraCallbackWithResult();
        asBinder = onextracallbackwithresult.IAuthTabCallback();
        onWarmupCompleted = onextracallbackwithresult.onExtraCallback();
        IAuthTabCallback_Parcel = iAuthTabCallback.IAuthTabCallback();
        IAuthTabCallbackDefault = iAuthTabCallback.onExtraCallback();
        access100 = iAuthTabCallback.onNavigationEvent();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(ToggleableNodeExternalSyntheticLambda1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        ToggleableNodeExternalSyntheticLambda1 toggleableNodeExternalSyntheticLambda1 = (ToggleableNodeExternalSyntheticLambda1) obj;
        return onWarmupCompleted.onExtraCallback(this.writeTypedObject, toggleableNodeExternalSyntheticLambda1.writeTypedObject) && IAuthTabCallback.IAuthTabCallback(this.extraCallbackWithResult, toggleableNodeExternalSyntheticLambda1.extraCallbackWithResult);
    }

    public int hashCode() {
        return (onWarmupCompleted.onExtraCallback(this.writeTypedObject) * 31) + IAuthTabCallback.onExtraCallbackWithResult(this.extraCallbackWithResult);
    }

    public String toString() {
        return "Alignment(horizontal=" + ((Object) onWarmupCompleted.IAuthTabCallback(this.writeTypedObject)) + ", vertical=" + ((Object) IAuthTabCallback.onWarmupCompleted(this.extraCallbackWithResult)) + ')';
    }
}
