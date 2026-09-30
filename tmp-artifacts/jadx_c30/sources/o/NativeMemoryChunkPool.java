package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativeMemoryChunkPool {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativeMemoryChunkPool[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final NativeMemoryChunkPool IMAGE = new NativeMemoryChunkPool("IMAGE", 0);
    public static final NativeMemoryChunkPool LOTTIE = new NativeMemoryChunkPool("LOTTIE", 1);
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ NativeMemoryChunkPool[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeMemoryChunkPool nativeMemoryChunkPool = IMAGE;
        if (i3 != 0) {
            return new NativeMemoryChunkPool[]{nativeMemoryChunkPool, LOTTIE};
        }
        NativeMemoryChunkPool nativeMemoryChunkPool2 = LOTTIE;
        NativeMemoryChunkPool[] nativeMemoryChunkPoolArr = new NativeMemoryChunkPool[4];
        nativeMemoryChunkPoolArr[0] = nativeMemoryChunkPool;
        nativeMemoryChunkPoolArr[1] = nativeMemoryChunkPool2;
        return nativeMemoryChunkPoolArr;
    }

    public static EnumEntries<NativeMemoryChunkPool> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<NativeMemoryChunkPool> enumEntries = $ENTRIES;
        int i5 = i2 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static NativeMemoryChunkPool valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeMemoryChunkPool nativeMemoryChunkPool = (NativeMemoryChunkPool) Enum.valueOf(NativeMemoryChunkPool.class, str);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return nativeMemoryChunkPool;
    }

    public static NativeMemoryChunkPool[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeMemoryChunkPool[] nativeMemoryChunkPoolArr = (NativeMemoryChunkPool[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return nativeMemoryChunkPoolArr;
        }
        throw null;
    }

    private NativeMemoryChunkPool(String str, int i) {
    }

    static {
        NativeMemoryChunkPool[] nativeMemoryChunkPoolArr$values = $values();
        $VALUES = nativeMemoryChunkPoolArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativeMemoryChunkPoolArr$values);
        int i = onWarmupCompleted + 3;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
