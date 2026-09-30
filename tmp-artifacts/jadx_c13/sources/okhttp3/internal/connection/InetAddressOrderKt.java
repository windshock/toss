package okhttp3.internal.connection;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class InetAddressOrderKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<InetAddress> reorderForHappyEyeballs(@NotNull List<? extends InetAddress> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.onExtraCallbackWithResult();
        List list3 = (List) pair.IAuthTabCallback();
        return (list2.isEmpty() || list3.isEmpty()) ? list : _UtilCommonKt.interleave(list2, list3);
    }
}
