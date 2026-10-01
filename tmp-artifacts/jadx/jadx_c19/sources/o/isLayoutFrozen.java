package o;

import android.media.CamcorderProfile;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class isLayoutFrozen {
    private static final addFocusables IAuthTabCallback = addFocusables.onExtraCallback(isLayoutFrozen.class.getSimpleName());
    private static Map<removeOnChildAttachStateChangeListener, Integer> onExtraCallbackWithResult;

    static {
        HashMap map = new HashMap();
        onExtraCallbackWithResult = map;
        map.put(new removeOnChildAttachStateChangeListener(176, 144), 2);
        onExtraCallbackWithResult.put(new removeOnChildAttachStateChangeListener(320, 240), 7);
        onExtraCallbackWithResult.put(new removeOnChildAttachStateChangeListener(352, 288), 3);
        onExtraCallbackWithResult.put(new removeOnChildAttachStateChangeListener(720, 480), 4);
        onExtraCallbackWithResult.put(new removeOnChildAttachStateChangeListener(1280, 720), 5);
        onExtraCallbackWithResult.put(new removeOnChildAttachStateChangeListener(1920, 1080), 6);
        onExtraCallbackWithResult.put(new removeOnChildAttachStateChangeListener(3840, 2160), 8);
    }

    public static CamcorderProfile onExtraCallback(@NonNull String str, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
        try {
            return onExtraCallbackWithResult(Integer.parseInt(str), removeonchildattachstatechangelistener);
        } catch (NumberFormatException unused) {
            IAuthTabCallback.onWarmupCompleted(new Object[]{"NumberFormatException for Camera2 id:", str});
            return CamcorderProfile.get(0);
        }
    }

    public static CamcorderProfile onExtraCallbackWithResult(int i2, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
        long jOnExtraCallback = removeonchildattachstatechangelistener.onExtraCallback();
        long jOnExtraCallbackWithResult = removeonchildattachstatechangelistener.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList(onExtraCallbackWithResult.keySet());
        final long j = jOnExtraCallback * jOnExtraCallbackWithResult;
        Collections.sort(arrayList, new Comparator<removeOnChildAttachStateChangeListener>() { // from class: o.isLayoutFrozen.5
            @Override // java.util.Comparator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public int compare(removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener2, removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener3) {
                long jAbs = Math.abs((removeonchildattachstatechangelistener2.onExtraCallback() * removeonchildattachstatechangelistener2.onExtraCallbackWithResult()) - j);
                long jAbs2 = Math.abs((removeonchildattachstatechangelistener3.onExtraCallback() * removeonchildattachstatechangelistener3.onExtraCallbackWithResult()) - j);
                if (jAbs < jAbs2) {
                    return -1;
                }
                return jAbs == jAbs2 ? 0 : 1;
            }
        });
        while (arrayList.size() > 0) {
            int iIntValue = onExtraCallbackWithResult.get((removeOnChildAttachStateChangeListener) arrayList.remove(0)).intValue();
            if (CamcorderProfile.hasProfile(i2, iIntValue)) {
                return CamcorderProfile.get(i2, iIntValue);
            }
        }
        return CamcorderProfile.get(i2, 0);
    }
}
