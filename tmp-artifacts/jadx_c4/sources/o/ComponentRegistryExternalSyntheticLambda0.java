package o;

import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ComponentRegistryExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final ComponentRegistryExternalSyntheticLambda0 onNavigationEvent = new ComponentRegistryExternalSyntheticLambda0();
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 11;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ComponentRegistryExternalSyntheticLambda0() {
    }

    public setByteOrder onExtraCallback(@NotNull Parcel parcel) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        Object obj = null;
        if (parcel.readByte() == 0) {
            return null;
        }
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = parcel.readInt();
        if (i5 != 0) {
            return setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(i6));
        }
        setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(i6));
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r4 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r4 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r5.writeByte((byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r5.writeByte((byte) 1);
        r5.writeInt(o.ByteOrderedDataOutputStream.onNavigationEvent(r4.access100()));
        r4 = o.ComponentRegistryExternalSyntheticLambda0.onExtraCallbackWithResult + 101;
        o.ComponentRegistryExternalSyntheticLambda0.IAuthTabCallback = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@Nullable setByteOrder setbyteorder, @NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i4 = 5 / 0;
        } else {
            Intrinsics.checkNotNullParameter(parcel, "");
        }
    }
}
