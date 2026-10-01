package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class lExternalSyntheticLambda6 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final Triple<Integer, Integer, List<getStreamSharingChildren>> IAuthTabCallback(@Nullable List<? extends component7> list, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (list != null) {
            int i4 = onExtraCallback + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback(list, j);
                obj.hashCode();
                throw null;
            }
            Triple<Integer, Integer, List<getStreamSharingChildren>> tripleOnExtraCallback = onExtraCallback(list, j);
            if (tripleOnExtraCallback != null) {
                int i5 = onExtraCallback + 23;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                if (i5 % 2 == 0) {
                    int i7 = 91 / 0;
                }
                int i8 = i6 + 95;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    return tripleOnExtraCallback;
                }
                obj.hashCode();
                throw null;
            }
        }
        return new Triple<>(0, 0, (Object) null);
    }

    public static final Triple<Integer, Integer, List<getStreamSharingChildren>> onExtraCallback(@NotNull List<? extends component7> list, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int interfaceDescriptor = 0;
        int iT_ = 0;
        for (int i4 = 0; i4 < size; i4++) {
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = list.get(i4).onExtraCallback(j);
            if (getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor() > interfaceDescriptor) {
                int i5 = IAuthTabCallback + 77;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    interfaceDescriptor = getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
                    int i6 = 82 / 0;
                } else {
                    interfaceDescriptor = getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
                }
            }
            if (getstreamsharingchildrenOnExtraCallback.T_() > iT_) {
                int i7 = onExtraCallback + 69;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                iT_ = getstreamsharingchildrenOnExtraCallback.T_();
            }
            arrayList.add(getstreamsharingchildrenOnExtraCallback);
        }
        return new Triple<>(Integer.valueOf(interfaceDescriptor), Integer.valueOf(iT_), arrayList);
    }
}
