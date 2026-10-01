package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;
import o.jp;
import o.py;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface KSerializer<T> extends py<T>, jp<T> {
    @Override // o.py, o.jp
    SerialDescriptor getDescriptor();
}
