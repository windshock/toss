package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface EventStore {
    r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4 onWarmupCompleted();

    static EventStore onExtraCallback(r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4 r8lambdag_opjn6phscxza7nfhnxwbb0x4) {
        Objects.requireNonNull(r8lambdag_opjn6phscxza7nfhnxwbb0x4, "textPropagator");
        return new r8lambda35ARABux2T2jK6nOB1k1NCNQZV0(r8lambdag_opjn6phscxza7nfhnxwbb0x4);
    }

    static EventStore onNavigationEvent() {
        return r8lambda35ARABux2T2jK6nOB1k1NCNQZV0.IAuthTabCallback();
    }
}
