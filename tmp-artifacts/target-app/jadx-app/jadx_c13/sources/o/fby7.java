package o;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fby7 {
    public static final fby7 onNavigationEvent = new fby7();
    private static final lt2<fby4, Integer> onExtraCallback = new lt2<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.fby7.onExtraCallback
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((fby4) obj).onActivityLayout();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((fby4) obj).IAuthTabCallback_Parcel((Integer) obj2);
        }
    }, null, 2, null), null, null, null, 14, null);
    private static final ltlt<fby4> onWarmupCompleted = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.fby7.onWarmupCompleted
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((fby4) obj).access100();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((fby4) obj).IAuthTabCallbackStub((Integer) obj2);
        }
    }, null, 2, null), 1, 12, null, null, null, 56, null);

    private fby7() {
    }

    public final lt2<fby4, Integer> onExtraCallback() {
        return onExtraCallback;
    }

    public final ltlt<fby4> onNavigationEvent() {
        return onWarmupCompleted;
    }
}
