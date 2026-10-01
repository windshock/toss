package o;

import android.graphics.Rect;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class isAccessibilityEnabled {
    public static Rect onWarmupCompleted(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull removeItemDecoration removeitemdecoration) {
        int iRound;
        int iOnExtraCallback = removeonchildattachstatechangelistener.onExtraCallback();
        int iOnExtraCallbackWithResult = removeonchildattachstatechangelistener.onExtraCallbackWithResult();
        int i2 = 0;
        if (removeitemdecoration.onWarmupCompleted(removeonchildattachstatechangelistener, 5.0E-4f)) {
            return new Rect(0, 0, iOnExtraCallback, iOnExtraCallbackWithResult);
        }
        if (removeItemDecoration.onExtraCallback(iOnExtraCallback, iOnExtraCallbackWithResult).onWarmupCompleted() > removeitemdecoration.onWarmupCompleted()) {
            int iRound2 = Math.round(iOnExtraCallbackWithResult * removeitemdecoration.onWarmupCompleted());
            int iRound3 = Math.round((iOnExtraCallback - iRound2) / 2.0f);
            iOnExtraCallback = iRound2;
            i2 = iRound3;
            iRound = 0;
        } else {
            int iRound4 = Math.round(iOnExtraCallback / removeitemdecoration.onWarmupCompleted());
            iRound = Math.round((iOnExtraCallbackWithResult - iRound4) / 2.0f);
            iOnExtraCallbackWithResult = iRound4;
        }
        return new Rect(i2, iRound, iOnExtraCallback + i2, iOnExtraCallbackWithResult + iRound);
    }
}
