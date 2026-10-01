package o;

import com.google.android.gms.internal.firebase-auth-api.zzmr;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Credentials;
import o.deprecated_path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Credentials {
    private static final setUseCaseAttached[] IAuthTabCallback;
    private static int access100 = 0;
    private static final long asBinder;
    private static int extraCallbackWithResult = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int readTypedObject = 1;
    private static int writeTypedObject;
    private float IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private setUseCaseAttached[] IAuthTabCallbackStubProxy;
    private setTlsokhttp IAuthTabCallback_Parcel;
    private final Lazy access000;
    private final deprecated_persistent asInterface;
    private final Lazy getInterfaceDescriptor;
    private final getSupportsTlsExtensionsokhttp onTransact;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onWarmupCompleted = 8;

    public static /* synthetic */ deprecated_path onNavigationEvent(deprecated_hostOnly deprecated_hostonly) throws IOException {
        int i = 2 % 2;
        int i2 = access100 + 81;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(deprecated_hostonly);
        }
        IAuthTabCallback(deprecated_hostonly);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i3 | i2 | i5);
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = ~i5;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i3 + i2 + i6 + (105149790 * i) + ((-719480883) * i4);
        int i15 = i14 * i14;
        int i16 = (i3 * (-424837635)) + 281018368 + ((-424837635) * i2) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i6) + ((-654311424) * i) + (1702887424 * i4) + ((-155189248) * i15);
        int i17 = (i3 * 910058005) + 1460508013 + (i2 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i6 * 910058489) + (i * (-759332242)) + (i4 * (-1121784475)) + (i15 * 1086324736);
        int i18 = i16 + (i17 * i17 * (-1925185536));
        return i18 != 1 ? i18 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ FloatBuffer onWarmupCompleted(Credentials credentials) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        FloatBuffer floatBufferOnNavigationEvent = onNavigationEvent(credentials);
        int i4 = extraCallbackWithResult + 95;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return floatBufferOnNavigationEvent;
        }
        throw null;
    }

    public Credentials(@NotNull final deprecated_hostOnly deprecated_hostonly, @NotNull getSupportsTlsExtensionsokhttp getsupportstlsextensionsokhttp, @NotNull deprecated_persistent deprecated_persistentVar) {
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(getsupportstlsextensionsokhttp, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        this.onTransact = getsupportstlsextensionsokhttp;
        this.asInterface = deprecated_persistentVar;
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.NONE;
        this.getInterfaceDescriptor = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tds.graphics.gl.processing.SimpleQuadRenderer$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws IOException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                deprecated_path deprecated_pathVarOnNavigationEvent = Credentials.onNavigationEvent(deprecated_hostonly);
                if (i3 != 0) {
                    int i4 = 29 / 0;
                }
                return deprecated_pathVarOnNavigationEvent;
            }
        });
        this.access000 = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tds.graphics.gl.processing.SimpleQuadRenderer$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 73;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                FloatBuffer floatBufferOnWarmupCompleted = Credentials.onWarmupCompleted(this.f$0);
                int i4 = onNavigationEvent + 17;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return floatBufferOnWarmupCompleted;
            }
        });
        setUseCaseAttached[] setusecaseattachedArr = new setUseCaseAttached[4];
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < 4) {
            int i3 = extraCallbackWithResult + 25;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                setusecaseattachedArr[i2] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.onNavigationEvent());
                i2 += 105;
            } else {
                setusecaseattachedArr[i2] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.onNavigationEvent());
                i2++;
            }
        }
        this.IAuthTabCallbackStubProxy = setusecaseattachedArr;
        this.IAuthTabCallbackDefault = -1.0f;
        int i4 = access100 + 49;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    private final deprecated_path IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 7;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        deprecated_path deprecated_pathVar = (deprecated_path) this.getInterfaceDescriptor.getValue();
        int i3 = extraCallbackWithResult + 103;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return deprecated_pathVar;
        }
        obj.hashCode();
        throw null;
    }

    private static final deprecated_path IAuthTabCallback(deprecated_hostOnly deprecated_hostonly) throws IOException {
        int i = 2 % 2;
        int i2 = access100 + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        deprecated_path deprecated_pathVarIAuthTabCallback = deprecated_hostonly.IAuthTabCallback("simple_quad", "simple_quad");
        deprecated_pathVarIAuthTabCallback.onExtraCallbackWithResult("TextureDataUBO", 0);
        int i4 = extraCallbackWithResult + 33;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_pathVarIAuthTabCallback;
    }

    private final FloatBuffer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        FloatBuffer floatBuffer = (FloatBuffer) this.access000.getValue();
        int i4 = extraCallbackWithResult + 9;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return floatBuffer;
    }

    private static final FloatBuffer onNavigationEvent(Credentials credentials) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        FloatBuffer floatBufferIAuthTabCallback = supportsTlsExtensions.IAuthTabCallback(new float[credentials.onTransact.onWarmupCompleted().onExtraCallback().onNavigationEvent()]);
        int i4 = access100 + 17;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return floatBufferIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Credentials credentials = (Credentials) objArr[0];
        deprecated_path deprecated_pathVarIAuthTabCallback = (deprecated_path) objArr[1];
        setCipherSuitesokhttp setciphersuitesokhttp = (setCipherSuitesokhttp) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            int i2 = access100 + 17;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            deprecated_pathVarIAuthTabCallback = credentials.IAuthTabCallback();
            int i4 = access100 + 111;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((iIntValue & 2) != 0) {
            int i6 = extraCallbackWithResult + 7;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 93 / 0;
            }
            setciphersuitesokhttp = null;
        }
        if ((iIntValue & 4) != 0) {
            fFloatValue = 1.0f;
        }
        credentials.onNavigationEvent(deprecated_pathVarIAuthTabCallback, setciphersuitesokhttp, fFloatValue);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1
      0x003d: PHI (r1v8 o.setTlsokhttp) = (r1v7 o.setTlsokhttp), (r1v15 o.setTlsokhttp) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull deprecated_path deprecated_pathVar, @Nullable setCipherSuitesokhttp setciphersuitesokhttp, float f) {
        setTlsokhttp settlsokhttp;
        int i = 2 % 2;
        int i2 = access100 + 55;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deprecated_pathVar, "");
            this.onTransact.onWarmupCompleted().onNavigationEvent().onNavigationEvent();
            settlsokhttp = this.IAuthTabCallback_Parcel;
            int i3 = 42 / 0;
            if (settlsokhttp != null) {
                settlsokhttp.onExtraCallbackWithResult();
            }
        } else {
            Intrinsics.checkNotNullParameter(deprecated_pathVar, "");
            this.onTransact.onWarmupCompleted().onNavigationEvent().onNavigationEvent();
            settlsokhttp = this.IAuthTabCallback_Parcel;
            if (settlsokhttp != null) {
            }
        }
        deprecated_pathVar.onExtraCallbackWithResult(this.asInterface);
        if (setciphersuitesokhttp != null) {
            setCipherSuitesokhttp.onExtraCallbackWithResult(setciphersuitesokhttp, 0, 1, null);
            boolean zOnExtraCallback = setciphersuitesokhttp.onExtraCallback();
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            onNavigationEvent(f, zOnExtraCallback, (setUseCaseAttached[]) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), new Object[]{this, setciphersuitesokhttp}, -808704570, 808704572, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2));
        }
        this.onTransact.onExtraCallbackWithResult();
        int i4 = extraCallbackWithResult + 29;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(Credentials credentials, deprecated_path deprecated_pathVar, getTlsVersionsokhttp gettlsversionsokhttp, setUseCaseAttached[] setusecaseattachedArr, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult;
        int i4 = i3 + 47;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 111;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            deprecated_pathVar = credentials.IAuthTabCallback();
        }
        if ((i & 2) != 0) {
            gettlsversionsokhttp = null;
        }
        if ((i & 4) != 0) {
            int i8 = extraCallbackWithResult + 9;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            setusecaseattachedArr = null;
        }
        if ((i & 8) != 0) {
            int i10 = extraCallbackWithResult + 31;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            f = 1.0f;
        }
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), new Object[]{credentials, deprecated_pathVar, gettlsversionsokhttp, setusecaseattachedArr, Float.valueOf(f)}, -1774221526, 1774221526, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Credentials credentials = (Credentials) objArr[0];
        deprecated_path deprecated_pathVar = (deprecated_path) objArr[1];
        getTlsVersionsokhttp gettlsversionsokhttp = (getTlsVersionsokhttp) objArr[2];
        setUseCaseAttached[] setusecaseattachedArr = (setUseCaseAttached[]) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_pathVar, "");
        credentials.onTransact.onWarmupCompleted().onNavigationEvent().onNavigationEvent();
        setTlsokhttp settlsokhttp = credentials.IAuthTabCallback_Parcel;
        if (settlsokhttp != null) {
            int i2 = extraCallbackWithResult + 7;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            settlsokhttp.onExtraCallbackWithResult();
            int i4 = extraCallbackWithResult + 61;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        deprecated_pathVar.onExtraCallbackWithResult(credentials.asInterface);
        if (gettlsversionsokhttp != null) {
            setCipherSuitesokhttp.onExtraCallbackWithResult(gettlsversionsokhttp, 0, 1, null);
            boolean zOnExtraCallback = gettlsversionsokhttp.onExtraCallback();
            if (setusecaseattachedArr == null) {
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
                setusecaseattachedArr = (setUseCaseAttached[]) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), new Object[]{credentials, gettlsversionsokhttp}, -808704570, 808704572, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
            }
            credentials.onNavigationEvent(fFloatValue, zOnExtraCallback, setusecaseattachedArr);
        }
        credentials.onTransact.onExtraCallbackWithResult();
        return null;
    }

    private final void onNavigationEvent(float f, boolean z, setUseCaseAttached[] setusecaseattachedArr) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean zOnExtraCallback = onExtraCallback(setusecaseattachedArr);
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(z);
            boolean zOnExtraCallback2 = onExtraCallback(f);
            if (!zOnExtraCallback) {
                int i3 = access100 + 23;
                extraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if ((!zOnExtraCallbackWithResult) && !zOnExtraCallback2) {
                    return;
                }
            }
            onWarmupCompleted().rewind();
            onWarmupCompleted().put(Float.intBitsToFloat((int) (setusecaseattachedArr[0].onExtraCallback() >> 32)));
            onWarmupCompleted().put(Float.intBitsToFloat((int) setusecaseattachedArr[0].onExtraCallback()));
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(Float.intBitsToFloat((int) (setusecaseattachedArr[1].onExtraCallback() >> 32)));
            onWarmupCompleted().put(Float.intBitsToFloat((int) setusecaseattachedArr[1].onExtraCallback()));
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(Float.intBitsToFloat((int) (setusecaseattachedArr[2].onExtraCallback() >> 32)));
            onWarmupCompleted().put(Float.intBitsToFloat((int) setusecaseattachedArr[2].onExtraCallback()));
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(Float.intBitsToFloat((int) (setusecaseattachedArr[3].onExtraCallback() >> 32)));
            onWarmupCompleted().put(Float.intBitsToFloat((int) setusecaseattachedArr[3].onExtraCallback()));
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(z ? 1.0f : 0.0f);
            onWarmupCompleted().put(f);
            onWarmupCompleted().put(0.0f);
            onWarmupCompleted().put(0.0f);
            getTlsokhttp gettlsokhttpOnExtraCallback = this.onTransact.onWarmupCompleted().onExtraCallback();
            Buffer bufferPosition = onWarmupCompleted().position(0);
            Intrinsics.checkNotNullExpressionValue(bufferPosition, "");
            gettlsokhttpOnExtraCallback.onExtraCallback(bufferPosition);
            this.IAuthTabCallbackStubProxy = setusecaseattachedArr;
            this.IAuthTabCallbackStub = z;
            this.IAuthTabCallbackDefault = f;
            return;
        }
        onExtraCallback(setusecaseattachedArr);
        onExtraCallbackWithResult(z);
        onExtraCallback(f);
        throw null;
    }

    private final boolean onExtraCallback(float f) {
        boolean z;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 49;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        if (this.IAuthTabCallbackDefault == f) {
            int i6 = i2 + 85;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = i4 + 43;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        boolean z2 = !z;
        int i10 = access100 + 7;
        extraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return z2;
    }

    private final boolean onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallbackStub == z) {
            return false;
        }
        int i5 = i3 + 73;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private final boolean onExtraCallback(setUseCaseAttached[] setusecaseattachedArr) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (setUseCaseAttached.onWarmupCompleted(this.IAuthTabCallbackStubProxy[0].onExtraCallback(), setusecaseattachedArr[0].onExtraCallback()) && setUseCaseAttached.onWarmupCompleted(this.IAuthTabCallbackStubProxy[1].onExtraCallback(), setusecaseattachedArr[1].onExtraCallback())) {
            int i4 = extraCallbackWithResult + 21;
            access100 = i4 % 128;
            if (i4 % 2 == 0 ? setUseCaseAttached.onWarmupCompleted(this.IAuthTabCallbackStubProxy[2].onExtraCallback(), setusecaseattachedArr[2].onExtraCallback()) : setUseCaseAttached.onWarmupCompleted(this.IAuthTabCallbackStubProxy[2].onExtraCallback(), setusecaseattachedArr[3].onExtraCallback())) {
                int i5 = extraCallbackWithResult + 121;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                setUseCaseAttached[] setusecaseattachedArr2 = this.IAuthTabCallbackStubProxy;
                if (i6 == 0 ? setUseCaseAttached.onWarmupCompleted(setusecaseattachedArr2[3].onExtraCallback(), setusecaseattachedArr[3].onExtraCallback()) : setUseCaseAttached.onWarmupCompleted(setusecaseattachedArr2[4].onExtraCallback(), setusecaseattachedArr[5].onExtraCallback())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return o.Credentials.IAuthTabCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if ((r5 instanceof o.ConnectionSpecBuilder) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return ((o.ConnectionSpecBuilder) r5).asBinder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return o.Credentials.IAuthTabCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if ((r5 instanceof o.getTlsVersionsokhttp) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r5 instanceof o.getTlsVersionsokhttp) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r2 = r2 + 89;
        o.Credentials.access100 = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setCipherSuitesokhttp setciphersuitesokhttp = (setCipherSuitesokhttp) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 3;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        onExtraCallback = jIAuthTabCallback;
        long jIAuthTabCallback2 = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        onExtraCallbackWithResult = jIAuthTabCallback2;
        long jIAuthTabCallback3 = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
        asBinder = jIAuthTabCallback3;
        long jIAuthTabCallback4 = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
        onNavigationEvent = jIAuthTabCallback4;
        IAuthTabCallback = new setUseCaseAttached[]{setUseCaseAttached.onNavigationEvent(jIAuthTabCallback), setUseCaseAttached.onNavigationEvent(jIAuthTabCallback2), setUseCaseAttached.onNavigationEvent(jIAuthTabCallback3), setUseCaseAttached.onNavigationEvent(jIAuthTabCallback4)};
        int i = writeTypedObject + 3;
        readTypedObject = i % 128;
        int i2 = i % 2;
    }

    private final setUseCaseAttached[] onNavigationEvent(setCipherSuitesokhttp setciphersuitesokhttp) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        return (setUseCaseAttached[]) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), new Object[]{this, setciphersuitesokhttp}, -808704570, 808704572, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    public final void IAuthTabCallback(@NotNull deprecated_path deprecated_pathVar, @Nullable getTlsVersionsokhttp gettlsversionsokhttp, @Nullable setUseCaseAttached[] setusecaseattachedArr, float f) {
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), new Object[]{this, deprecated_pathVar, gettlsversionsokhttp, setusecaseattachedArr, Float.valueOf(f)}, -1774221526, 1774221526, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
    }
}
