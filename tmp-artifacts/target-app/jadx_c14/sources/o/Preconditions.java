package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Preconditions {
    private static int IAuthTabCallback = 0;
    public static final Preconditions INSTANCE = new Preconditions();
    private static final int KEY_BOOLEAN = 4;
    private static final int KEY_DOUBLE = 3;
    private static final int KEY_INT = 2;
    private static final int KEY_PARCELABLE = 5;
    private static final int KEY_STRING = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 73;
        IAuthTabCallback = i % 128;
        if (i % KEY_INT != 0) {
            throw null;
        }
    }

    private Preconditions() {
    }

    public Map<String, Object> onNavigationEvent(@NotNull Parcel parcel) {
        Object string;
        int i = KEY_INT % KEY_INT;
        Intrinsics.checkNotNullParameter(parcel, "");
        int i2 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String string2 = parcel.readString();
            int i4 = parcel.readInt();
            if (i4 == 1) {
                string = parcel.readString();
            } else if (i4 != KEY_INT) {
                int i5 = onNavigationEvent + 105;
                int i6 = i5 % 128;
                onWarmupCompleted = i6;
                int i7 = i5 % KEY_INT;
                if (i4 != KEY_DOUBLE) {
                    int i8 = i6 + 39;
                    int i9 = i8 % 128;
                    onNavigationEvent = i9;
                    if (i8 % KEY_INT == 0 ? i4 == KEY_BOOLEAN : i4 == KEY_BOOLEAN) {
                        string = Boolean.valueOf(parcel.readByte() != 0);
                    } else if (i4 != KEY_PARCELABLE) {
                        int i10 = i9 + 69;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % KEY_INT;
                        string = null;
                    } else {
                        string = parcel.readParcelable(Parcelable.class.getClassLoader());
                    }
                } else {
                    string = Double.valueOf(parcel.readDouble());
                }
            } else {
                string = Integer.valueOf(parcel.readInt());
            }
            if (string2 != null) {
                linkedHashMap.put(string2, string);
            }
        }
        return linkedHashMap;
    }

    public void onExtraCallbackWithResult(@Nullable Map<String, ? extends Object> map, @NotNull Parcel parcel, int i) {
        int i2 = KEY_INT % KEY_INT;
        int i3 = onWarmupCompleted + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % KEY_INT;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(map != null ? map.size() : 0);
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                parcel.writeString(key);
                if (value instanceof String) {
                    parcel.writeInt(1);
                    parcel.writeString((String) value);
                } else if (value instanceof Integer) {
                    parcel.writeInt(KEY_INT);
                    parcel.writeInt(((Number) value).intValue());
                } else if (value instanceof Double) {
                    parcel.writeInt(KEY_DOUBLE);
                    parcel.writeDouble(((Number) value).doubleValue());
                } else if (value instanceof Boolean) {
                    parcel.writeInt(KEY_BOOLEAN);
                    parcel.writeByte(((Boolean) value).booleanValue() ? (byte) 1 : (byte) 0);
                } else if (value instanceof Parcelable) {
                    parcel.writeInt(KEY_PARCELABLE);
                    parcel.writeParcelable((Parcelable) value, i);
                } else {
                    parcel.writeInt(0);
                    int i5 = onNavigationEvent + 99;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % KEY_INT;
                }
            }
        }
    }
}
