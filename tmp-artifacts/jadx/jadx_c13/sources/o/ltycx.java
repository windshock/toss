package o;

import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class ltycx extends getMaxCornerRadius<Integer> implements setRubIn<Integer> {
    public ltycx(int i) {
        super(1, IntCompanionObject.MAX_VALUE, CloseableUtils.DROP_OLDEST);
        onNavigationEvent((ltycx) Integer.valueOf(i));
    }

    @Override // o.setRubIn
    /* renamed from: getInterfaceDescriptor, reason: merged with bridge method [inline-methods] */
    public Integer IAuthTabCallback() {
        int iIntValue;
        synchronized (this) {
            iIntValue = asInterface().intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public final boolean onWarmupCompleted(int i) {
        boolean zOnNavigationEvent;
        synchronized (this) {
            zOnNavigationEvent = onNavigationEvent((ltycx) Integer.valueOf(asInterface().intValue() + i));
        }
        return zOnNavigationEvent;
    }
}
