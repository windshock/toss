package im.toss.core.webkit.bridge;

import com.google.gson.JsonArray;
import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda11 implements deserializeIntNullableCollection {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        JsonArray jsonArrayIAuthTabCallback = surfaceDestroyed.IAuthTabCallback(this.f$0, obj);
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return jsonArrayIAuthTabCallback;
    }
}
