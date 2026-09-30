package o;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetYEAR_PATTERNcp implements setSupportsTlsExtensionsokhttp {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private int IAuthTabCallback;
    private allEnabledCipherSuites onNavigationEvent;
    private final List<setTlsokhttp> onWarmupCompleted = new ArrayList();

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[allEnabledTlsVersions.values().length];
            try {
                iArr[allEnabledTlsVersions.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[allEnabledTlsVersions.Float.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[allEnabledTlsVersions.Float2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[allEnabledTlsVersions.Float3.ordinal()] = 4;
                int i = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[allEnabledTlsVersions.Float4.ordinal()] = 5;
                int i3 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[allEnabledTlsVersions.Int.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[allEnabledTlsVersions.Int2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[allEnabledTlsVersions.Int3.ordinal()] = 8;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[allEnabledTlsVersions.Int4.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[allEnabledTlsVersions.Bool.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[allEnabledTlsVersions.Mat3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[allEnabledTlsVersions.Mat4.ordinal()] = 12;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            onExtraCallback = iArr;
        }
    }

    public accessgetYEAR_PATTERNcp() {
        int[] iArr = new int[1];
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES30.glGenVertexArrays(1, iArr, 0);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        this.IAuthTabCallback = iArr[0];
    }

    @Override // o.setSupportsTlsExtensionsokhttp
    public allEnabledCipherSuites onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        allEnabledCipherSuites allenabledciphersuites = this.onNavigationEvent;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return allenabledciphersuites;
    }

    @Override // o.setSupportsTlsExtensionsokhttp
    public void IAuthTabCallback(@Nullable allEnabledCipherSuites allenabledciphersuites) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent = allenabledciphersuites;
            applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
            GLES30.glBindVertexArray(this.IAuthTabCallback);
            onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
            if (allenabledciphersuites != null) {
                allenabledciphersuites.onExtraCallbackWithResult();
                int i3 = onExtraCallback + 95;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = onExtraCallbackWithResult + 85;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.onNavigationEvent = allenabledciphersuites;
        applyokhttp.onWarmupCompleted onwarmupcompleted2 = applyokhttp.Companion;
        GLES30.glBindVertexArray(this.IAuthTabCallback);
        onwarmupcompleted2.IAuthTabCallback(Unit.INSTANCE);
        throw null;
    }

    @Override // o.setSupportsTlsExtensionsokhttp
    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        if (i3 != 0) {
            GLES30.glBindVertexArray(this.IAuthTabCallback);
            onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        } else {
            GLES30.glBindVertexArray(this.IAuthTabCallback);
            onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.setSupportsTlsExtensionsokhttp
    public void onWarmupCompleted(@NotNull setTlsokhttp settlsokhttp) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(settlsokhttp, "");
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES30.glBindVertexArray(this.IAuthTabCallback);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        settlsokhttp.onExtraCallbackWithResult();
        isCompatible iscompatibleIAuthTabCallback = settlsokhttp.IAuthTabCallback();
        if (iscompatibleIAuthTabCallback != null) {
            int i4 = 0;
            for (cipherSuites ciphersuites : iscompatibleIAuthTabCallback) {
                int i5 = onExtraCallbackWithResult + 119;
                onExtraCallback = i5 % 128;
                int i6 = i5 % i2;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                cipherSuites ciphersuites2 = ciphersuites;
                switch (onNavigationEvent.onExtraCallback[ciphersuites2.IAuthTabCallback().ordinal()]) {
                    case 1:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        i = i2;
                        applyokhttp.onWarmupCompleted onwarmupcompleted2 = applyokhttp.Companion;
                        GLES20.glEnableVertexAttribArray(i4);
                        Unit unit = Unit.INSTANCE;
                        onwarmupcompleted2.IAuthTabCallback(unit);
                        GLES20.glVertexAttribPointer(i4, ciphersuites2.IAuthTabCallback().getComponents(), onExtraCallback(ciphersuites2.IAuthTabCallback()), ciphersuites2.onNavigationEvent(), iscompatibleIAuthTabCallback.IAuthTabCallback(), ciphersuites2.onWarmupCompleted());
                        onwarmupcompleted2.IAuthTabCallback(unit);
                        continue;
                        i4++;
                        i2 = i;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i = i2;
                        applyokhttp.onWarmupCompleted onwarmupcompleted3 = applyokhttp.Companion;
                        GLES20.glEnableVertexAttribArray(i4);
                        Unit unit2 = Unit.INSTANCE;
                        onwarmupcompleted3.IAuthTabCallback(unit2);
                        GLES30.glVertexAttribIPointer(i4, ciphersuites2.IAuthTabCallback().getComponents(), onExtraCallback(ciphersuites2.IAuthTabCallback()), iscompatibleIAuthTabCallback.IAuthTabCallback(), ciphersuites2.onWarmupCompleted());
                        onwarmupcompleted3.IAuthTabCallback(unit2);
                        continue;
                        i4++;
                        i2 = i;
                    case 11:
                    case 12:
                        int components = ciphersuites2.IAuthTabCallback().getComponents();
                        int i7 = onExtraCallback + 63;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % i2;
                        int i9 = 0;
                        while (i9 < components) {
                            int i10 = onExtraCallbackWithResult + 49;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % i2;
                            applyokhttp.onWarmupCompleted onwarmupcompleted4 = applyokhttp.Companion;
                            GLES20.glEnableVertexAttribArray(i4);
                            Unit unit3 = Unit.INSTANCE;
                            onwarmupcompleted4.IAuthTabCallback(unit3);
                            GLES20.glVertexAttribPointer(i4, components, onExtraCallback(ciphersuites2.IAuthTabCallback()), ciphersuites2.onNavigationEvent(), iscompatibleIAuthTabCallback.IAuthTabCallback(), ciphersuites2.onWarmupCompleted() + ((components << 2) * i9));
                            onwarmupcompleted4.IAuthTabCallback(unit3);
                            GLES30.glVertexAttribDivisor(i4, 1);
                            onwarmupcompleted4.IAuthTabCallback(unit3);
                            i9++;
                            int i12 = onExtraCallbackWithResult + 39;
                            onExtraCallback = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 2 / 4;
                            }
                            i2 = 2;
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                i = i2;
                i4++;
                i2 = i;
            }
        }
        this.onWarmupCompleted.add(settlsokhttp);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final int onExtraCallback(allEnabledTlsVersions allenabledtlsversions) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        switch (onNavigationEvent.onExtraCallback[allenabledtlsversions.ordinal()]) {
            case 1:
                throw new IllegalStateException(("Unconvertable shader data type: " + allenabledtlsversions.name()).toString());
            case 2:
            case 3:
            case 4:
            case 5:
                int i4 = onExtraCallback + 75;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 54 / 0;
                }
                return 5126;
            case 6:
            case 7:
            case 8:
            case 9:
                return 5124;
            case 10:
                int i6 = onExtraCallbackWithResult + 81;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return 35670;
            case 11:
            case 12:
                int i8 = onExtraCallback + 61;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    return 5126;
                }
                throw null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
