package o;

import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setCertificateChainCleanerokhttp {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int onExtraCallbackWithResult;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[TdsButtonV1View.IAuthTabCallbackDefault.values().length];
            try {
                iArr[TdsButtonV1View.IAuthTabCallbackDefault.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TdsButtonV1View.IAuthTabCallbackDefault.WEAK.ordinal()] = 2;
                int i = IAuthTabCallback + 13;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int i3 = IAuthTabCallback + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = i2 | i6;
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = ~i2;
        int i12 = i10 | (~(i11 | i3));
        int i13 = ~(i9 | i2);
        int i14 = i12 | i13;
        int i15 = (~(i3 | i11 | i6)) | i13;
        int i16 = i2 + i6 + i4 + (1881146393 * i5) + ((-1035018111) * i);
        int i17 = i16 * i16;
        int i18 = ((i2 * (-1924067824)) - 304087040) + ((-1924067824) * i6) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i4) + (1612709888 * i5) + ((-182452224) * i) + ((-1611137024) * i17);
        int i19 = (i2 * (-928100048)) + 945860906 + (i6 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * 189) + (i4 * (-928100237)) + (i5 * (-1331189957)) + (i * 1329932787) + (i17 * 1550319616);
        return i18 + ((i19 * i19) * 1690828800) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r7 instanceof o.setCertificateChainCleanerokhttp) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r1 = r1 + 11;
        o.setCertificateChainCleanerokhttp.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r6.onExtraCallbackWithResult == ((o.setCertificateChainCleanerokhttp) r7).onExtraCallbackWithResult) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r3 + 51;
        o.setCertificateChainCleanerokhttp.onWarmupCompleted = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            int i5 = 22 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CustomColorTheme(brandColor=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setCertificateChainCleanerokhttp(int i) {
        this.onExtraCallbackWithResult = i;
    }

    public final setCertificatePinnerokhttp IAuthTabCallback(@NotNull TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, @NotNull getUrlokhttp geturlokhttp) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        Intrinsics.checkNotNullParameter(geturlokhttp, "");
        int iOnNavigationEvent = setBodyokhttp.onNavigationEvent(this.onExtraCallbackWithResult, 1.0f);
        float fOnExtraCallback = writeAbortCount.onExtraCallback(iOnNavigationEvent);
        int i3 = onNavigationEvent.onExtraCallback[iAuthTabCallbackDefault.ordinal()];
        int iOnNavigationEvent2 = -16777216;
        if (i3 == 1) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnNavigationEvent, fOnExtraCallback, z);
            int iOnWarmupCompleted = onWarmupCompleted(iOnExtraCallbackWithResult, -0.134f);
            int iOnWarmupCompleted2 = onWarmupCompleted(fOnExtraCallback, z, geturlokhttp);
            int iIntValue = ((Integer) onNavigationEvent(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1389551234, new Object[]{this, Float.valueOf(fOnExtraCallback), geturlokhttp}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1389551233)).intValue();
            if (fOnExtraCallback >= 0.8f) {
                int i4 = onExtraCallback + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iOnNavigationEvent2 = setBodyokhttp.onNavigationEvent(-16777216, 0.5f);
                int i6 = onWarmupCompleted + 37;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            setCertificatePinnerokhttp setcertificatepinnerokhttp = new setCertificatePinnerokhttp(iOnExtraCallbackWithResult, iOnWarmupCompleted2, 0.0f, iOnWarmupCompleted, iOnWarmupCompleted, 0.7f, 0.2f, iIntValue, 0.0f, iOnNavigationEvent2, 0.0f, 0.0f, 0.26f, 3332, null);
            int i8 = onWarmupCompleted + 85;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return setcertificatepinnerokhttp;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = onExtraCallback + 13;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iOnNavigationEvent, fOnExtraCallback, z);
        int iOnNavigationEvent3 = onNavigationEvent(iOnNavigationEvent, fOnExtraCallback, z);
        int iIntValue2 = ((Integer) onNavigationEvent(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1239302973, new Object[]{this, Integer.valueOf(iOnNavigationEvent), Float.valueOf(fOnExtraCallback), Boolean.valueOf(z)}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1239302973)).intValue();
        int iIAuthTabCallback = IAuthTabCallback(iOnExtraCallbackWithResult2, fOnExtraCallback, z);
        int iOnNavigationEvent4 = onNavigationEvent(iOnExtraCallbackWithResult2, fOnExtraCallback, geturlokhttp);
        int iOnNavigationEvent5 = onNavigationEvent(iOnExtraCallbackWithResult2, fOnExtraCallback, geturlokhttp);
        if (z) {
            int i12 = onWarmupCompleted + 109;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            i = -16777216;
        } else {
            i = iIAuthTabCallback;
        }
        setCertificatePinnerokhttp setcertificatepinnerokhttp2 = new setCertificatePinnerokhttp(iOnNavigationEvent3, iIntValue2, 0.38f, iOnNavigationEvent4, iOnNavigationEvent5, 0.24f, 0.14f, iIAuthTabCallback, 0.38f, i, 0.0f, 0.0f, 1.0f, 3072, null);
        int i13 = onExtraCallback + 85;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 78 / 0;
        }
        return setcertificatepinnerokhttp2;
    }

    private final int onExtraCallbackWithResult(int i, float f, boolean z) {
        int i2 = 2 % 2;
        if (z && f < 0.5f) {
            int iOnWarmupCompleted = writeAbortCount.onWarmupCompleted(i, 0.5f);
            int i3 = onExtraCallback + 25;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return iOnWarmupCompleted;
            }
            throw null;
        }
        if (z || f <= 0.645f || f >= 0.8f) {
            return i;
        }
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return writeAbortCount.onWarmupCompleted(i, 0.645f);
        }
        writeAbortCount.onWarmupCompleted(i, 0.645f);
        throw null;
    }

    private final int onWarmupCompleted(float f, boolean z, getUrlokhttp geturlokhttp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (f < 0.8f) {
            if (z) {
                return -1;
            }
            return onExtraCallbackWithResult(authParams.TextOnFillBrand, z);
        }
        int i4 = i2 + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return geturlokhttp.requestPostMessageChannel().prefetch();
        }
        geturlokhttp.requestPostMessageChannel().prefetch();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        float fFloatValue = ((Number) objArr[1]).floatValue();
        getUrlokhttp geturlokhttp = (getUrlokhttp) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (fFloatValue < 0.8f) {
            return -1;
        }
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        int iNewSessionWithExtras = geturlokhttp.requestPostMessageChannel().newSessionWithExtras();
        if (i6 != 0) {
            int i7 = 6 / 0;
        }
        return Integer.valueOf(iNewSessionWithExtras);
    }

    private final int onNavigationEvent(int i, float f, boolean z) {
        int i2 = 2 % 2;
        if (z) {
            if (f >= 0.5f) {
                if (f <= 0.8f) {
                    return setBodyokhttp.onNavigationEvent(writeAbortCount.onWarmupCompleted(i, 0.7f), 0.17f);
                }
                return onExtraCallbackWithResult(authParams.FillNeutralWeak, z);
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(authParams.FillNeutralWeak, z);
            int i3 = onWarmupCompleted + 115;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 14 / 0;
            }
            return iOnExtraCallbackWithResult;
        }
        if (f < 0.4f) {
            return onExtraCallbackWithResult(authParams.FillNeutralWeak, z);
        }
        if (f <= 0.525f) {
            int i5 = onExtraCallback + 95;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return setBodyokhttp.onNavigationEvent(i, 0.08f);
            }
            int i6 = 13 / 0;
            return setBodyokhttp.onNavigationEvent(i, 0.08f);
        }
        if (f <= 0.645f) {
            return setBodyokhttp.onNavigationEvent(i, 0.09f);
        }
        if (f < 0.7f) {
            int i7 = onWarmupCompleted + 101;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return setBodyokhttp.onNavigationEvent(i, 0.11f);
        }
        if (f < 0.75f) {
            int i9 = onExtraCallback + 97;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                return setBodyokhttp.onNavigationEvent(i, 0.13f);
            }
            setBodyokhttp.onNavigationEvent(i, 0.13f);
            throw null;
        }
        if (f < 0.8f) {
            int i10 = onExtraCallback + 89;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return setBodyokhttp.onNavigationEvent(i, 0.15f);
        }
        return onExtraCallbackWithResult(authParams.FillNeutralWeak, z);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setCertificateChainCleanerokhttp setcertificatechaincleanerokhttp = (setCertificateChainCleanerokhttp) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!(!zBooleanValue)) {
            if (fFloatValue < 0.5f) {
                int iOnExtraCallbackWithResult = setcertificatechaincleanerokhttp.onExtraCallbackWithResult(authParams.TextSecondary, zBooleanValue);
                int i5 = onExtraCallback + 101;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return Integer.valueOf(iOnExtraCallbackWithResult);
                }
                throw null;
            }
            if (fFloatValue > 0.8f) {
                return Integer.valueOf(setcertificatechaincleanerokhttp.onExtraCallbackWithResult(authParams.TextSecondary, zBooleanValue));
            }
            int i6 = i2 + 49;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return Integer.valueOf(writeAbortCount.onWarmupCompleted(iIntValue, 0.7f));
        }
        if (fFloatValue < 0.4f) {
            int i8 = i4 + 7;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return Integer.valueOf(setcertificatechaincleanerokhttp.onExtraCallbackWithResult(authParams.TextSecondary, zBooleanValue));
            }
            setcertificatechaincleanerokhttp.onExtraCallbackWithResult(authParams.TextSecondary, zBooleanValue);
            obj.hashCode();
            throw null;
        }
        if (fFloatValue <= 0.525f) {
            return Integer.valueOf(iIntValue);
        }
        if (fFloatValue >= 0.8f) {
            return Integer.valueOf(setcertificatechaincleanerokhttp.onExtraCallbackWithResult(authParams.TextSecondary, zBooleanValue));
        }
        int i9 = i2 + 21;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return Integer.valueOf(writeAbortCount.onWarmupCompleted(iIntValue, 0.525f));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onNavigationEvent(int i, float f, getUrlokhttp geturlokhttp) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
            if (f >= 0.4f) {
                int i6 = i3 + 41;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                if (f < 0.8f) {
                    int i8 = i3 + 11;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return i;
                }
            }
        } else if (f >= 0.4f) {
        }
        int iICustomTabsCallbackStubProxy = geturlokhttp.requestPostMessageChannel().ICustomTabsCallbackStubProxy();
        int i10 = onWarmupCompleted + 27;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return iICustomTabsCallbackStubProxy;
    }

    private final int IAuthTabCallback(int i, float f, boolean z) {
        int i2 = 2 % 2;
        if (f < 0.4f || f >= 0.8f) {
            return onExtraCallbackWithResult(authParams.FillNeutral, z);
        }
        int i3 = onWarmupCompleted + 9;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!z) {
            return i;
        }
        int i5 = i4 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return writeAbortCount.onWarmupCompleted(i, 0.7f);
    }

    private final int onWarmupCompleted(int i, float f) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = writeAbortCount.onWarmupCompleted(i, RangesKt.coerceIn(writeAbortCount.onExtraCallback(i) + f, 0.0f, 1.0f));
        int i5 = onWarmupCompleted + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iOnWarmupCompleted;
    }

    private final int onExtraCallbackWithResult(authParams authparams, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!z) {
            return RequestBody.onExtraCallbackWithResult(authparams);
        }
        int iOnExtraCallback = RequestBody.onExtraCallback(authparams);
        int i3 = onWarmupCompleted + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iOnExtraCallback;
        }
        throw null;
    }

    private final int onWarmupCompleted(float f, getUrlokhttp geturlokhttp) {
        return ((Integer) onNavigationEvent(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1389551234, new Object[]{this, Float.valueOf(f), geturlokhttp}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1389551233)).intValue();
    }

    private final int onExtraCallback(int i, float f, boolean z) {
        return ((Integer) onNavigationEvent(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1239302973, new Object[]{this, Integer.valueOf(i), Float.valueOf(f), Boolean.valueOf(z)}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1239302973)).intValue();
    }
}
