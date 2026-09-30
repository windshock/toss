package o;

import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class EventPayload implements trimMetadataStringsTo {
    private static final trimMetadataStringsTo onNavigationEvent = new EventPayload(new Object[0]);
    private final Object[] IAuthTabCallback;

    static trimMetadataStringsTo onNavigationEvent() {
        return onNavigationEvent;
    }

    private EventPayload(Object[] objArr) {
        this.IAuthTabCallback = objArr;
    }

    @Override // o.trimMetadataStringsTo
    @Nullable
    public <V> V IAuthTabCallback(decodedEvent<V> decodedevent) {
        int i = 0;
        while (true) {
            Object[] objArr = this.IAuthTabCallback;
            if (i >= objArr.length) {
                return null;
            }
            if (objArr[i] == decodedevent) {
                return (V) objArr[i + 1];
            }
            i += 2;
        }
    }

    @Override // o.trimMetadataStringsTo
    public <V> trimMetadataStringsTo onExtraCallbackWithResult(decodedEvent<V> decodedevent, V v) {
        int i = 0;
        while (true) {
            Object[] objArr = this.IAuthTabCallback;
            if (i < objArr.length) {
                if (objArr[i] == decodedevent) {
                    int i2 = i + 1;
                    if (objArr[i2] == v) {
                        return this;
                    }
                    Object[] objArr2 = (Object[]) objArr.clone();
                    objArr2[i2] = v;
                    return new EventPayload(objArr2);
                }
                i += 2;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 2);
                objArrCopyOf[objArrCopyOf.length - 2] = decodedevent;
                objArrCopyOf[objArrCopyOf.length - 1] = v;
                return new EventPayload(objArrCopyOf);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.IAuthTabCallback;
            if (i >= objArr.length) {
                break;
            }
            sb.append(objArr[i]);
            sb.append('=');
            sb.append(this.IAuthTabCallback[i + 1]);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
