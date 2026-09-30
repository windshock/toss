package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class oby {
    private static final onWarmupCompleted IAuthTabCallback;
    public static final oby onExtraCallback = new oby();
    private static final ltlt<sya5> onExtraCallbackWithResult;
    private static final ltlt<sya5> onNavigationEvent;
    private static final ltlt<sya5> onWarmupCompleted;

    public static final class onWarmupCompleted implements getGlobalEvent<sya5> {
        private final lt4<sya5, Boolean> onWarmupCompleted = new lt4<>(new MutablePropertyReference1Impl() { // from class: o.oby.onWarmupCompleted.IAuthTabCallback
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
            public Object get(Object obj) {
                return ((sya5) obj).ICustomTabsCallback();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
            public void set(Object obj, Object obj2) {
                ((sya5) obj).onExtraCallbackWithResult((Boolean) obj2);
            }
        }, null, 2, null);

        onWarmupCompleted() {
        }

        @Override // o.getGlobalEvent
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public lt4<sya5, Boolean> onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        @Override // o.getGlobalEvent
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public boolean IAuthTabCallback(sya5 sya5Var) {
            Intrinsics.checkNotNullParameter(sya5Var, "");
            Integer numAccess000 = sya5Var.access000();
            if (numAccess000 != null && numAccess000.intValue() != 0) {
                return false;
            }
            Integer numWriteTypedObject = sya5Var.writeTypedObject();
            if (numWriteTypedObject != null && numWriteTypedObject.intValue() != 0) {
                return false;
            }
            Integer typedObject = sya5Var.readTypedObject();
            return typedObject == null || typedObject.intValue() == 0;
        }
    }

    private oby() {
    }

    static {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        IAuthTabCallback = onwarmupcompleted;
        onWarmupCompleted = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.oby.onExtraCallbackWithResult
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
            public Object get(Object obj) {
                return ((sya5) obj).access000();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
            public void set(Object obj, Object obj2) {
                ((sya5) obj).asBinder((Integer) obj2);
            }
        }, null, 2, null), 0, 18, null, 0, onwarmupcompleted, 8, null);
        onNavigationEvent = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.oby.onNavigationEvent
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
            public Object get(Object obj) {
                return ((sya5) obj).writeTypedObject();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
            public void set(Object obj, Object obj2) {
                ((sya5) obj).IAuthTabCallbackDefault((Integer) obj2);
            }
        }, null, 2, null), 0, 59, null, 0, onwarmupcompleted, 8, null);
        onExtraCallbackWithResult = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.oby.IAuthTabCallback
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
            public Object get(Object obj) {
                return ((sya5) obj).readTypedObject();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
            public void set(Object obj, Object obj2) {
                ((sya5) obj).IAuthTabCallbackStubProxy((Integer) obj2);
            }
        }, null, 2, null), 0, 59, null, 0, onwarmupcompleted, 8, null);
    }

    public final ltlt<sya5> onNavigationEvent() {
        return onWarmupCompleted;
    }

    public final ltlt<sya5> onWarmupCompleted() {
        return onNavigationEvent;
    }

    public final ltlt<sya5> onExtraCallbackWithResult() {
        return onExtraCallbackWithResult;
    }
}
