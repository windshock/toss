package o;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import o.getMinimumMaxLifecycleState;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum getMinimumMaxLifecycleState$onExtraCallbackWithResult {
    ANY,
    NON_PRIVATE,
    PROTECTED_AND_PUBLIC,
    PUBLIC_ONLY,
    NONE,
    DEFAULT;

    public boolean isVisible(Member member) {
        int i2 = getMinimumMaxLifecycleState.4.onExtraCallbackWithResult[ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 3) {
            return !Modifier.isPrivate(member.getModifiers());
        }
        if (i2 != 4) {
            if (i2 != 5) {
                return false;
            }
        } else if (Modifier.isProtected(member.getModifiers())) {
            return true;
        }
        return Modifier.isPublic(member.getModifiers());
    }
}
