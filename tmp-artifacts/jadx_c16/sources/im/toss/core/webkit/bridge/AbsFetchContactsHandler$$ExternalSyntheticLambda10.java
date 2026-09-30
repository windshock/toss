package im.toss.core.webkit.bridge;

import com.google.gson.JsonArray;
import java.util.List;
import kotlin.jvm.functions.Function1;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ surfaceDestroyed f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JsonArray jsonArrayOnExtraCallback = surfaceDestroyed.onExtraCallback(this.f$0, (List) obj);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return jsonArrayOnExtraCallback;
    }
}
