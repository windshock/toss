package o;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public interface getMsgHandler {
    Activity IAuthTabCallback();

    default Context onExtraCallback() {
        int i = 2 % 2;
        return IAuthTabCallback();
    }
}
