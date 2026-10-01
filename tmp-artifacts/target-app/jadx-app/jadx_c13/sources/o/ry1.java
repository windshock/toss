package o;

import o.wwx1;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ry1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Object, Type> wwx1 IAuthTabCallback(removePauseListener<? super Object, Type> removepauselistener, Object object, Type type) {
        Type typeOnWarmupCompleted = removepauselistener.onWarmupCompleted(object, type);
        if (typeOnWarmupCompleted == null) {
            return null;
        }
        return new wwx1.IAuthTabCallback(typeOnWarmupCompleted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onExtraCallback(CharSequence charSequence, int i, int i2) {
        int iOnWarmupCompleted = 0;
        while (i < i2) {
            iOnWarmupCompleted = (iOnWarmupCompleted * 10) + jw10.onWarmupCompleted(charSequence.charAt(i));
            i++;
        }
        return iOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer IAuthTabCallback(CharSequence charSequence, int i, int i2) {
        int iOnWarmupCompleted = 0;
        while (i < i2) {
            iOnWarmupCompleted = (iOnWarmupCompleted * 10) + jw10.onWarmupCompleted(charSequence.charAt(i));
            if (iOnWarmupCompleted < 0) {
                return null;
            }
            i++;
        }
        return Integer.valueOf(iOnWarmupCompleted);
    }
}
