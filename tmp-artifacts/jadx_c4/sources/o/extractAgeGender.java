package o;

import java.util.ArrayDeque;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class extractAgeGender {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ void onExtraCallback(ArrayDeque arrayDeque, Object obj, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(arrayDeque, obj, i);
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
    }

    private static final <T> void IAuthTabCallback(ArrayDeque<T> arrayDeque, T t, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            if (arrayDeque.size() >= i) {
                arrayDeque.removeFirst();
                int i4 = IAuthTabCallback + 43;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            arrayDeque.addLast(t);
            int i6 = IAuthTabCallback + 67;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        arrayDeque.size();
        throw null;
    }
}
