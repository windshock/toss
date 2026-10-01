package o;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CookieBuilder {
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface;
    private final deprecated_path onExtraCallback;
    private final deprecated_persistent onExtraCallbackWithResult;
    private final deprecated_path onNavigationEvent;
    private final deprecated_path onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = ~((~i6) | i8);
        int i10 = i6 | i8;
        int i11 = i + i2 + i4 + ((-189913888) * i5) + ((-1809372279) * i3);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i) - 1671495680) + (10634006 * i2) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i4) + (952107008 * i5) + (1092222976 * i3) + ((-70844416) * i12);
        int i14 = (i * 986545540) + 223666697 + (i2 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i4 * 986544659) + (i5 * 1843362976) + (i3 * (-1872984789)) + (i12 * (-2050686976));
        return i13 + ((i14 * i14) * 1179713536) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public CookieBuilder(@NotNull deprecated_hostOnly deprecated_hostonly, @NotNull deprecated_persistent deprecated_persistentVar) throws IOException {
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        this.onExtraCallbackWithResult = deprecated_persistentVar;
        deprecated_path deprecated_pathVarIAuthTabCallback = deprecated_hostonly.IAuthTabCallback("simple_quad", "blur_down");
        deprecated_pathVarIAuthTabCallback.onExtraCallbackWithResult(deprecated_persistentVar);
        deprecated_pathVarIAuthTabCallback.onWarmupCompleted("u_Texture", 0);
        deprecated_pathVarIAuthTabCallback.onExtraCallbackWithResult("TextureDataUBO", 0);
        this.onNavigationEvent = deprecated_pathVarIAuthTabCallback;
        deprecated_path deprecated_pathVarIAuthTabCallback2 = deprecated_hostonly.IAuthTabCallback("simple_quad", "blur_up");
        deprecated_pathVarIAuthTabCallback2.onExtraCallbackWithResult(deprecated_persistentVar);
        deprecated_pathVarIAuthTabCallback2.onWarmupCompleted("u_Texture", 0);
        deprecated_pathVarIAuthTabCallback2.onExtraCallbackWithResult("TextureDataUBO", 0);
        this.onExtraCallback = deprecated_pathVarIAuthTabCallback2;
        deprecated_path deprecated_pathVarIAuthTabCallback3 = deprecated_hostonly.IAuthTabCallback("simple_quad", "progressive_composite");
        deprecated_pathVarIAuthTabCallback3.onExtraCallbackWithResult(deprecated_persistentVar);
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < 10) {
            deprecated_pathVarIAuthTabCallback3.onWarmupCompleted("u_Layers[" + i2 + "]", i2);
            i2++;
            int i3 = asInterface + 25;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        deprecated_pathVarIAuthTabCallback3.onExtraCallbackWithResult("TextureDataUBO", 0);
        this.onWarmupCompleted = deprecated_pathVarIAuthTabCallback3;
        int i5 = asInterface + 83;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CookieBuilder cookieBuilder = (CookieBuilder) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 29;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        deprecated_path deprecated_pathVar = cookieBuilder.onNavigationEvent;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_pathVar;
    }

    public final deprecated_path onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        deprecated_path deprecated_pathVar = this.onExtraCallback;
        int i5 = i2 + 71;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return deprecated_pathVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deprecated_path onNavigationEvent() {
        deprecated_path deprecated_pathVar;
        int i = 2 % 2;
        int i2 = asBinder + 83;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            deprecated_pathVar = this.onWarmupCompleted;
            int i4 = 64 / 0;
        } else {
            deprecated_pathVar = this.onWarmupCompleted;
        }
        int i5 = i3 + 85;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return deprecated_pathVar;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CookieBuilder cookieBuilder = (CookieBuilder) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        excludeChildren excludechildren = new excludeChildren(Float.intBitsToFloat((int) (jLongValue >> 32)), Float.intBitsToFloat((int) jLongValue));
        Object obj = null;
        if (zBooleanValue) {
            int i2 = asInterface + 93;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                cookieBuilder.onNavigationEvent.onExtraCallbackWithResult(cookieBuilder.onExtraCallbackWithResult);
                cookieBuilder.onNavigationEvent.onWarmupCompleted("u_Texel", excludechildren);
                obj.hashCode();
                throw null;
            }
            cookieBuilder.onNavigationEvent.onExtraCallbackWithResult(cookieBuilder.onExtraCallbackWithResult);
            cookieBuilder.onNavigationEvent.onWarmupCompleted("u_Texel", excludechildren);
            return null;
        }
        cookieBuilder.onExtraCallback.onExtraCallbackWithResult(cookieBuilder.onExtraCallbackWithResult);
        cookieBuilder.onExtraCallback.onWarmupCompleted("u_Texel", excludechildren);
        int i3 = asInterface + 55;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        this.onWarmupCompleted.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        this.onWarmupCompleted.onExtraCallbackWithResult("u_Tint", new createSeekController(setByteOrder.asInterface(j), setByteOrder.asBinder(j), setByteOrder.onExtraCallback(j), setByteOrder.onWarmupCompleted(j)));
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull List<? extends getTlsVersionsokhttp> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.onWarmupCompleted.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        this.onWarmupCompleted.onWarmupCompleted("u_LevelCount", Math.min(list.size(), 10));
        Iterator<T> it = list.iterator();
        int i2 = asInterface + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = asBinder + 95;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                it.next();
                throw null;
            }
            Object next = it.next();
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            getTlsVersionsokhttp gettlsversionsokhttp = (getTlsVersionsokhttp) next;
            if (i4 < 10) {
                gettlsversionsokhttp.onWarmupCompleted(i4);
            }
            i4++;
        }
    }

    private static final void IAuthTabCallback(CookieBuilder cookieBuilder, int i, float f, float f2, float f3, float f4, deprecated_path deprecated_pathVar) {
        int i2 = 2 % 2;
        deprecated_pathVar.onExtraCallbackWithResult(cookieBuilder.onExtraCallbackWithResult);
        deprecated_pathVar.onWarmupCompleted("u_MaskType", i);
        deprecated_pathVar.onWarmupCompleted("u_TargetSizePx", new excludeChildren(f, f2));
        deprecated_pathVar.IAuthTabCallback("u_MaskFeatherUv", Math.max(1.0f / f3, f4 / f3));
        int i3 = asInterface + 57;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069 A[PHI: r17
      0x0069: PHI (r17v2 o.deprecated_path) = (r17v1 o.deprecated_path), (r17v8 o.deprecated_path) binds: [B:12:0x0083, B:8:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066 A[PHI: r17
      0x0066: PHI (r17v6 o.deprecated_path) = (r17v1 o.deprecated_path), (r17v8 o.deprecated_path) binds: [B:12:0x0083, B:8:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        deprecated_path deprecated_pathVar;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = asBinder + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        float fMax = Math.max(1.0f, f);
        float fMax2 = Math.max(1.0f, f2);
        float fMax3 = Math.max(fMax, fMax2);
        Iterator it = CollectionsKt.listOf(new deprecated_path[]{this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted}).iterator();
        while (!(!it.hasNext())) {
            int i6 = asInterface + 63;
            asBinder = i6 % 128;
            if (i6 % i2 == 0) {
                deprecated_pathVar = (deprecated_path) it.next();
                IAuthTabCallback(this, i, fMax, fMax2, fMax3, f7, deprecated_pathVar);
                if (i != 1) {
                    deprecated_path deprecated_pathVar2 = deprecated_pathVar;
                    if (i == i2) {
                        deprecated_pathVar2.onWarmupCompleted("u_MaskCenterUv", new excludeChildren(f3 / fMax, f4 / fMax2));
                        deprecated_pathVar2.IAuthTabCallback("u_MaskRadiusUv", f5 / fMax3);
                    }
                } else {
                    deprecated_path deprecated_pathVar3 = deprecated_pathVar;
                    float fCoerceAtLeast = RangesKt.coerceAtLeast(fMax - (f3 * 2.0f), 1.0f);
                    float fCoerceAtLeast2 = RangesKt.coerceAtLeast(fMax2 - (f4 * 2.0f), 1.0f);
                    float fCoerceIn = RangesKt.coerceIn(f6, 0.0f, (fCoerceAtLeast * 0.5f) - 0.5f);
                    float fCoerceIn2 = RangesKt.coerceIn(f6, 0.0f, (fCoerceAtLeast2 * 0.5f) - 0.5f);
                    deprecated_pathVar3.onWarmupCompleted("u_RRectMinUv", new excludeChildren((f3 + fCoerceIn) / fMax, (f4 + fCoerceIn2) / fMax2));
                    deprecated_pathVar3.onWarmupCompleted("u_RRectMaxUv", new excludeChildren(((fMax - f3) - fCoerceIn) / fMax, ((fMax2 - f4) - fCoerceIn2) / fMax2));
                    deprecated_pathVar3.IAuthTabCallback("u_RRectRadiusUv", RangesKt.coerceAtMost(f5, RangesKt.coerceAtLeast(Math.min(fCoerceAtLeast - (fCoerceIn * 2.0f), fCoerceAtLeast2 - (fCoerceIn2 * 2.0f)), 0.5f) * 0.5f) / fMax3);
                }
                int i7 = asInterface + 95;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
            } else {
                deprecated_pathVar = (deprecated_path) it.next();
                IAuthTabCallback(this, i, fMax, fMax2, fMax3, f7, deprecated_pathVar);
                if (i != 1) {
                }
                int i72 = asInterface + 95;
                asBinder = i72 % 128;
                int i82 = i72 % 2;
                i2 = 2;
            }
        }
    }

    public final void onExtraCallback(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, @Nullable float[] fArr) {
        int i2 = 2 % 2;
        int i3 = asBinder + 59;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = 0;
        if (fArr == null || fArr.length < 64) {
            fArr = new float[64];
            for (int i5 = 0; i5 < 64; i5++) {
                fArr[i5] = i5 / 63.0f;
            }
        }
        deprecated_path deprecated_pathVar = this.onWarmupCompleted;
        deprecated_pathVar.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        deprecated_pathVar.onWarmupCompleted("u_ProgType", i);
        deprecated_pathVar.onWarmupCompleted("u_ProgStartPx", new excludeChildren(f, f2));
        deprecated_pathVar.onWarmupCompleted("u_ProgEndPx", new excludeChildren(f3, f4));
        deprecated_pathVar.onWarmupCompleted("u_ProgCenterPx", new excludeChildren(f5, f6));
        deprecated_pathVar.IAuthTabCallback("u_ProgRadiusPx", f7);
        while (i4 < 16) {
            int i6 = i4 << 2;
            deprecated_pathVar.onExtraCallbackWithResult("u_ProgLut" + i4, new createSeekController(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3]));
            i4++;
            int i7 = asInterface + 19;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.IAuthTabCallback();
        this.onExtraCallback.IAuthTabCallback();
        this.onWarmupCompleted.IAuthTabCallback();
        int i4 = asInterface + 93;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    public final deprecated_path onExtraCallback() {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        return (deprecated_path) onExtraCallback(1038141928, -1038141928, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this});
    }

    public final void onWarmupCompleted(long j, boolean z) {
        Object[] objArr = {this, Long.valueOf(j), Boolean.valueOf(z)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallback(1295620808, -1295620807, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, objArr);
    }
}
