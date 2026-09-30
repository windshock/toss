package o;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionStateKtExternalSyntheticLambda0 implements TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2 {
    public static final TextFieldSelectionStateKtExternalSyntheticLambda0 onExtraCallbackWithResult = new TextFieldSelectionStateKtExternalSyntheticLambda0(Collections.EMPTY_MAP);
    private final Map<String, byte[]> onNavigationEvent;
    private int onWarmupCompleted;

    public TextFieldSelectionStateKtExternalSyntheticLambda0() {
        this(Collections.EMPTY_MAP);
    }

    public TextFieldSelectionStateKtExternalSyntheticLambda0(Map<String, byte[]> map) {
        this.onNavigationEvent = Collections.unmodifiableMap(map);
    }

    public TextFieldSelectionStateKtExternalSyntheticLambda0 onNavigationEvent(TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1) {
        Map<String, byte[]> mapIAuthTabCallback = IAuthTabCallback(this.onNavigationEvent, textFieldSelectionState_androidKtExternalSyntheticLambda1);
        return onExtraCallbackWithResult(this.onNavigationEvent, mapIAuthTabCallback) ? this : new TextFieldSelectionStateKtExternalSyntheticLambda0(mapIAuthTabCallback);
    }

    public Set<Map.Entry<String, byte[]>> IAuthTabCallback() {
        return this.onNavigationEvent.entrySet();
    }

    @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2
    public final String IAuthTabCallback(String str, @Nullable String str2) {
        byte[] bArr = this.onNavigationEvent.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2
    public final long onWarmupCompleted(String str, long j) {
        byte[] bArr = this.onNavigationEvent.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldSelectionStateKtExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        return onExtraCallbackWithResult(this.onNavigationEvent, ((TextFieldSelectionStateKtExternalSyntheticLambda0) obj).onNavigationEvent);
    }

    public int hashCode() {
        if (this.onWarmupCompleted == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.onNavigationEvent.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.onWarmupCompleted = iHashCode;
        }
        return this.onWarmupCompleted;
    }

    private static boolean onExtraCallbackWithResult(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, byte[]> IAuthTabCallback(Map<String, byte[]> map, TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1) {
        HashMap map2 = new HashMap(map);
        onExtraCallbackWithResult((HashMap<String, byte[]>) map2, textFieldSelectionState_androidKtExternalSyntheticLambda1.onNavigationEvent());
        IAuthTabCallback((HashMap<String, byte[]>) map2, textFieldSelectionState_androidKtExternalSyntheticLambda1.onWarmupCompleted());
        return map2;
    }

    private static void onExtraCallbackWithResult(HashMap<String, byte[]> map, List<String> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            map.remove(list.get(i2));
        }
    }

    private static void IAuthTabCallback(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), IAuthTabCallback(entry.getValue()));
        }
    }

    private static byte[] IAuthTabCallback(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }
}
