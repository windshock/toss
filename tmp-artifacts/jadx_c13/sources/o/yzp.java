package o;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class yzp {
    public static final yzp onExtraCallback = new yzp();
    private static final ltlt<yi> onWarmupCompleted = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.yzp.IAuthTabCallback
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((yi) obj).onTransact();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((yi) obj).IAuthTabCallback((Integer) obj2);
        }
    }, null, 2, null), 0, 23, null, null, null, 56, null);
    private static final ltlt<yi> asInterface = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.yzp.onExtraCallbackWithResult
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((yi) obj).IAuthTabCallback_Parcel();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((yi) obj).onTransact((Integer) obj2);
        }
    }, null, 2, null), 0, 59, null, null, null, 56, null);
    private static final ltlt<yi> IAuthTabCallbackDefault = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.yzp.asInterface
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((yi) obj).extraCallbackWithResult();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((yi) obj).getInterfaceDescriptor((Integer) obj2);
        }
    }, null, 2, null), 0, 59, null, 0, null, 40, null);
    private static final lt2<yi, invalidateSelf> onNavigationEvent = new lt2<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.yzp.onExtraCallback
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((yi) obj).asBinder();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((yi) obj).IAuthTabCallback((invalidateSelf) obj2);
        }
    }, "nanosecond"), null, new invalidateSelf(0, 9), null, 10, null);
    private static final lt2<yi, jni_YGNodeStyleSetMinHeightPercentJNI> IAuthTabCallback = new lt2<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.yzp.onWarmupCompleted
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((yi) obj).IAuthTabCallbackDefault();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((yi) obj).onExtraCallback((jni_YGNodeStyleSetMinHeightPercentJNI) obj2);
        }
    }, null, 2, null), null, null, null, 14, null);
    private static final ltlt<yi> onExtraCallbackWithResult = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.yzp.onNavigationEvent
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((yi) obj).IAuthTabCallbackStub();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((yi) obj).onWarmupCompleted((Integer) obj2);
        }
    }, null, 2, null), 1, 12, null, null, null, 56, null);

    private yzp() {
    }

    public final ltlt<yi> onExtraCallback() {
        return onWarmupCompleted;
    }

    public final ltlt<yi> onWarmupCompleted() {
        return asInterface;
    }

    public final ltlt<yi> onExtraCallbackWithResult() {
        return IAuthTabCallbackDefault;
    }

    public final lt2<yi, invalidateSelf> IAuthTabCallback() {
        return onNavigationEvent;
    }
}
