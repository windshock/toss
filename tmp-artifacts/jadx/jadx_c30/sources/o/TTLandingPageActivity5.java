package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTLandingPageActivity5 {

    public enum onWarmupCompleted {
        ZLIB(0),
        BZLIB(1),
        LZO(2);

        final int code;

        public static onWarmupCompleted find(int i) {
            for (onWarmupCompleted onwarmupcompleted : values()) {
                if (onwarmupcompleted.code == i) {
                    return onwarmupcompleted;
                }
            }
            return null;
        }

        onWarmupCompleted(int i) {
            this.code = i;
        }
    }

    public enum onNavigationEvent {
        TAPE(1),
        INODE(2),
        BITS(3),
        ADDR(4),
        END(5),
        CLRI(6);

        final int code;

        public static onNavigationEvent find(int i) {
            for (onNavigationEvent onnavigationevent : values()) {
                if (onnavigationevent.code == i) {
                    return onnavigationevent;
                }
            }
            return null;
        }

        onNavigationEvent(int i) {
            this.code = i;
        }
    }
}
