package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4 {
    Collection<String> IAuthTabCallback();

    <C> trimMetadataStringsTo IAuthTabCallback(trimMetadataStringsTo trimmetadatastringsto, @Nullable C c, r8lambdaapTHSUkV7HXbn_UM6IMVgWZe0e8<C> r8lambdaapthsukv7hxbn_um6imvgwze0e8);

    <C> void onWarmupCompleted(trimMetadataStringsTo trimmetadatastringsto, @Nullable C c, accessgetConfigp<C> accessgetconfigp);

    static r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4 onNavigationEvent(r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4... r8lambdag_opjn6phscxza7nfhnxwbb0x4Arr) {
        return onNavigationEvent(Arrays.asList(r8lambdag_opjn6phscxza7nfhnxwbb0x4Arr));
    }

    static r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4 onNavigationEvent(Iterable<r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (arrayList.isEmpty()) {
            return EventStorageModulespecialinlinedprovider2.onExtraCallback();
        }
        if (arrayList.size() == 1) {
            return (r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4) arrayList.get(0);
        }
        return new r8lambdaCp8in6yoJvizhPIAAXu3bnHtRPc(arrayList);
    }

    static r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4 onWarmupCompleted() {
        return EventStorageModulespecialinlinedprovider2.onExtraCallback();
    }
}
