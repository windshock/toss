package im.toss.core.cache;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.JsonEncodingException;
import o.MapConverter;
import o.NetConverter3;
import o.clearTid;
import o.deserializeFloat;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.getByteBuffer;
import o.getColorIconBackground;
import o.serializeRaw;
import o.setApTextSize;
import o.setLogBuffers;
import o.writeQuoted;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RxSharedApiCall<T> {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static final boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private final Lazy IAuthTabCallback;
    private getColorIconBackground<T> onExtraCallback;
    private JsonEncodingException<T> onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    static {
        int i = IAuthTabCallbackDefault + 91;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ RxSharedApiCall(writeRaw writeraw, Object obj, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(writeraw, obj, str);
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(MapConverter mapConverter, writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(mapConverter, writeraw);
        }
        onWarmupCompleted(mapConverter, writeraw);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getByteBuffer IAuthTabCallback(writeRaw writeraw, RxSharedApiCall rxSharedApiCall) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getByteBuffer getbytebufferOnNavigationEvent = onNavigationEvent(writeraw, rxSharedApiCall);
        int i4 = onTransact + 47;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return getbytebufferOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = (~((~i4) | i5)) | (~(i5 | i3));
        int i8 = (~i5) | (~i3);
        int i9 = i7 | (~(i8 | i4));
        int i10 = (~i8) | i4;
        int i11 = ~(i3 | i4);
        int i12 = i4 + i5 + i + ((-417414852) * i6) + (1247522396 * i2);
        int i13 = i12 * i12;
        int i14 = (i4 * (-1219797419)) + 1526988800 + ((-1219797419) * i5) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i) + ((-2135949312) * i6) + ((-953155584) * i2) + ((-430374912) * i13);
        int i15 = ((i4 * 184508743) - 476012450) + (i5 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i * 184509739) + (i6 * (-953474796)) + (i2 * (-288057996)) + (i13 * (-839712768));
        int i16 = i14 + (i15 * i15 * 1709113344);
        if (i16 == 1) {
            RxSharedApiCall rxSharedApiCall = (RxSharedApiCall) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int i17 = 2 % 2;
            int i18 = asInterface + 119;
            onTransact = i18 % 128;
            int i19 = i18 % 2;
            writeRaw<T> writerawIAuthTabCallback = rxSharedApiCall.IAuthTabCallback(clearTid.onExtraCallback(), NetConverter3.onExtraCallback(), zBooleanValue);
            int i20 = onTransact + 41;
            asInterface = i20 % 128;
            int i21 = i20 % 2;
            return writerawIAuthTabCallback;
        }
        if (i16 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 3) {
            return onExtraCallback(objArr);
        }
        if (i16 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i16 != 5) {
            return onExtraCallbackWithResult(objArr);
        }
        RxSharedApiCall rxSharedApiCall2 = (RxSharedApiCall) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i22 = 2 % 2;
        int i23 = onTransact + 73;
        int i24 = i23 % 128;
        asInterface = i24;
        int i25 = i23 % 2;
        if ((1 & iIntValue) != 0) {
            int i26 = i24 + 119;
            onTransact = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 2 / 3;
            }
            str = "";
        }
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 237696428, -237696426, new Object[]{rxSharedApiCall2, str}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RxSharedApiCall rxSharedApiCall = (RxSharedApiCall) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rxSharedApiCall, deserializeurinullablecollection);
        int i4 = onTransact + 47;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(boolean z, RxSharedApiCall rxSharedApiCall, writeQuoted writequoted) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(z, rxSharedApiCall, writequoted);
        int i4 = onTransact + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RxSharedApiCall rxSharedApiCall, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rxSharedApiCall, obj);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(Function1 function1, writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnExtraCallback = onExtraCallback(function1, writeraw);
        int i4 = asInterface + 73;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return deserializeipOnExtraCallback;
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(MapConverter mapConverter, writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(mapConverter, writeraw);
        }
        onExtraCallback(mapConverter, writeraw);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(Function1 function1, writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(function1, writeraw);
        }
        IAuthTabCallback(function1, writeraw);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = onTransact + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    private RxSharedApiCall(final writeRaw<T> writeraw, T t, String str) {
        StringBuilder sb;
        getColorIconBackground<T> getcoloriconbackground = new getColorIconBackground<>();
        this.onExtraCallback = getcoloriconbackground;
        this.onExtraCallbackWithResult = getcoloriconbackground;
        if (str != null) {
            sb = new StringBuilder();
            sb.append("RxSharedApiCall@");
            sb.append(str);
        } else {
            int iHashCode = hashCode();
            sb = new StringBuilder();
            sb.append("RxSharedApiCall@");
            sb.append(iHashCode);
            int i = asInterface + 15;
            onTransact = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        this.onWarmupCompleted = sb.toString();
        onExtraCallback((RxSharedApiCall<T>) t);
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 3;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    RxSharedApiCall.IAuthTabCallback(writeraw, this);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getByteBuffer getbytebufferIAuthTabCallback = RxSharedApiCall.IAuthTabCallback(writeraw, this);
                int i5 = IAuthTabCallback + 97;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return getbytebufferIAuthTabCallback;
            }
        });
        int i3 = onTransact + 15;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RxSharedApiCall onWarmupCompleted(Companion companion, String str, writeRaw writeraw, Object obj, setLogBuffers setlogbuffers, int i, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 81;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if ((i & 4) != 0) {
                obj = null;
            }
            if ((i & 8) != 0) {
                int i6 = i4 + 113;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                setlogbuffers = null;
            }
            return companion.IAuthTabCallback(str, writeraw, obj, setlogbuffers);
        }

        @Deprecated
        public final <T> RxSharedApiCall<T> IAuthTabCallback(@NotNull String str, @NotNull writeRaw<T> writeraw, @Nullable T t, @Nullable setLogBuffers setlogbuffers) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(writeraw, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            RxSharedApiCall<T> rxSharedApiCall = new RxSharedApiCall<>(writeraw, t, str, defaultConstructorMarker);
            if (setlogbuffers != null) {
                int i2 = onExtraCallback + 99;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    rxSharedApiCall.onWarmupCompleted(setLogBuffers.asBinder(setlogbuffers.onExtraCallback()), TimeUnit.MILLISECONDS);
                    defaultConstructorMarker.hashCode();
                    throw null;
                }
                rxSharedApiCall.onWarmupCompleted(setLogBuffers.asBinder(setlogbuffers.onExtraCallback()), TimeUnit.MILLISECONDS);
            }
            return rxSharedApiCall;
        }
    }

    private final getByteBuffer<T> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getByteBuffer<T> getbytebuffer = (getByteBuffer) this.IAuthTabCallback.getValue();
        int i4 = asInterface + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return getbytebuffer;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    private static final Unit onNavigationEvent(RxSharedApiCall rxSharedApiCall, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!(!onNavigationEvent)) {
            String str = rxSharedApiCall.onWarmupCompleted;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 117;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asInterface + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(RxSharedApiCall rxSharedApiCall, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        rxSharedApiCall.onExtraCallback((RxSharedApiCall) obj);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final getByteBuffer onNavigationEvent(writeRaw writeraw, final RxSharedApiCall rxSharedApiCall) {
        int i = 2 % 2;
        final Function1 function1 = new Function1() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, (deserializeUriNullableCollection) obj};
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                if (i4 == 0) {
                    return (Unit) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 1582292963, -1582292960, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                }
                int i5 = 0 / 0;
                return (Unit) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 1582292963, -1582292960, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            }
        };
        writeRaw writerawOnExtraCallback = writeraw.onExtraCallback(new deserializeFloat() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                RxSharedApiCall.onWarmupCompleted(function1, obj);
                if (i4 == 0) {
                    int i5 = 29 / 0;
                }
            }
        });
        final Function1 function12 = new Function1() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                RxSharedApiCall rxSharedApiCall2 = this.f$0;
                if (i4 != 0) {
                    return RxSharedApiCall.onExtraCallbackWithResult(rxSharedApiCall2, obj);
                }
                RxSharedApiCall.onExtraCallbackWithResult(rxSharedApiCall2, obj);
                throw null;
            }
        };
        getByteBuffer getbytebufferIAuthTabCallbackStubProxy = writerawOnExtraCallback.onNavigationEvent(new deserializeFloat() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                RxSharedApiCall.IAuthTabCallback(function12, obj);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }).IAuthTabCallbackStub().IAuthTabCallbackStubProxy();
        int i2 = asInterface + 89;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return getbytebufferIAuthTabCallbackStubProxy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        throw new java.lang.IllegalArgumentException("Expiration time must be non-negative");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r4 >= 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r3.onExtraCallbackWithResult.onExtraCallbackWithResult(r6.toMillis(r4));
        r4 = im.toss.core.cache.RxSharedApiCall.asInterface + 73;
        im.toss.core.cache.RxSharedApiCall.onTransact = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(long j, @NotNull TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(timeUnit, "");
        } else {
            Intrinsics.checkNotNullParameter(timeUnit, "");
        }
    }

    public final void onExtraCallback(@Nullable T t) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.onExtraCallback(t);
            int i3 = 78 / 0;
            if (!onNavigationEvent) {
                return;
            }
        } else {
            this.onExtraCallbackWithResult.onExtraCallback(t);
            if (!onNavigationEvent) {
                return;
            }
        }
        Objects.toString(t);
        int i4 = asInterface + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RxSharedApiCall rxSharedApiCall = (RxSharedApiCall) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        JsonEncodingException<T> jsonEncodingException = rxSharedApiCall.onExtraCallbackWithResult;
        if (i3 == 0) {
            jsonEncodingException.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        T tOnNavigationEvent = jsonEncodingException.onNavigationEvent();
        int i4 = onTransact + 83;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return tOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RxSharedApiCall rxSharedApiCall = (RxSharedApiCall) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            if (rxSharedApiCall.onExtraCallbackWithResult.onNavigationEvent() != null) {
                rxSharedApiCall.onExtraCallbackWithResult.onWarmupCompleted();
                if (onNavigationEvent) {
                    String str = rxSharedApiCall.onWarmupCompleted;
                    int i3 = asInterface + 93;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            return null;
        }
        rxSharedApiCall.onExtraCallbackWithResult.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ writeRaw onExtraCallback(RxSharedApiCall rxSharedApiCall, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        asInterface = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            z = false;
        }
        Object[] objArr = {rxSharedApiCall, Boolean.valueOf(z)};
        writeRaw writeraw = (writeRaw) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1464062815, -1464062814, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int i4 = asInterface + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return writeraw;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z = false;
        RxSharedApiCall rxSharedApiCall = (RxSharedApiCall) objArr[0];
        MapConverter mapConverterOnExtraCallback = (MapConverter) objArr[1];
        MapConverter mapConverter = (MapConverter) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            mapConverterOnExtraCallback = clearTid.onExtraCallback();
        }
        if ((iIntValue & 2) != 0) {
            int i4 = asInterface + 63;
            onTransact = i4 % 128;
            mapConverter = null;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
        if ((iIntValue & 4) != 0) {
            int i5 = asInterface + 51;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z = zBooleanValue;
        }
        return rxSharedApiCall.IAuthTabCallback(mapConverterOnExtraCallback, mapConverter, z);
    }

    private static final void onWarmupCompleted(boolean z, RxSharedApiCall rxSharedApiCall, writeQuoted writequoted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(writequoted, "");
        if (z) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onExtraCallback(iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 237696428, -237696426, new Object[]{rxSharedApiCall, "connect-without-cache"}, iOnNavigationEvent3);
        }
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent5 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent6 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Object objOnExtraCallback = onExtraCallback(iOnNavigationEvent5, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent4, -144346571, 144346571, new Object[]{rxSharedApiCall}, iOnNavigationEvent6);
        if (objOnExtraCallback == null) {
            writequoted.onExtraCallback();
            int i2 = asInterface + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = onTransact + 7;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (onNavigationEvent) {
            String str = rxSharedApiCall.onWarmupCompleted;
            Objects.toString(objOnExtraCallback);
        }
        writequoted.onExtraCallback(objOnExtraCallback);
        writequoted.onExtraCallback();
    }

    private static final deserializeIp onExtraCallback(Function1 function1, writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            return (deserializeIp) function1.invoke(writeraw);
        }
        Intrinsics.checkNotNullParameter(writeraw, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r4 = 55 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3 = r4.onNavigationEvent(r3);
        r4 = im.toss.core.cache.RxSharedApiCall.asInterface + 3;
        im.toss.core.cache.RxSharedApiCall.onTransact = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final deserializeIp onExtraCallback(MapConverter mapConverter, writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            int i3 = 43 / 0;
        } else {
            Intrinsics.checkNotNullParameter(writeraw, "");
        }
    }

    private static final deserializeIp IAuthTabCallback(Function1 function1, writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(writeraw, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(writeraw);
        int i3 = asInterface + 13;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return deserializeip;
    }

    public final writeRaw<T> IAuthTabCallback(@Nullable final MapConverter mapConverter, @Nullable final MapConverter mapConverter2, final boolean z) {
        int i = 2 % 2;
        writeRaw writerawAccess100 = onWarmupCompleted().IAuthTabCallbackDefault(new serializeRaw() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final void subscribe(writeQuoted writequoted) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 19;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    RxSharedApiCall.onExtraCallback(z, this, writequoted);
                    int i4 = 2 / 0;
                } else {
                    RxSharedApiCall.onExtraCallback(z, this, writequoted);
                }
                int i5 = onExtraCallback + 47;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 79 / 0;
                }
            }
        }).access100();
        final Function1 function1 = new Function1() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    RxSharedApiCall.onNavigationEvent(mapConverter, (writeRaw) obj);
                    obj2.hashCode();
                    throw null;
                }
                deserializeIp deserializeipOnNavigationEvent = RxSharedApiCall.onNavigationEvent(mapConverter, (writeRaw) obj);
                int i4 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return deserializeipOnNavigationEvent;
                }
                obj2.hashCode();
                throw null;
            }
        };
        writeRaw writerawIAuthTabCallback = writerawAccess100.IAuthTabCallback(new deserializeUri() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final deserializeIp apply(writeRaw writeraw) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 13;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    RxSharedApiCall.onExtraCallbackWithResult(function1, writeraw);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                deserializeIp deserializeipOnExtraCallbackWithResult = RxSharedApiCall.onExtraCallbackWithResult(function1, writeraw);
                int i4 = onExtraCallbackWithResult + 19;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return deserializeipOnExtraCallbackWithResult;
            }
        });
        final Function1 function12 = new Function1() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                deserializeIp deserializeipIAuthTabCallback = RxSharedApiCall.IAuthTabCallback(mapConverter2, (writeRaw) obj);
                int i5 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return deserializeipIAuthTabCallback;
            }
        };
        writeRaw<T> writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new deserializeUri() { // from class: im.toss.core.cache.RxSharedApiCall$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final deserializeIp apply(writeRaw writeraw) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 111;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Function1 function13 = function12;
                if (i4 == 0) {
                    return RxSharedApiCall.onWarmupCompleted(function13, writeraw);
                }
                RxSharedApiCall.onWarmupCompleted(function13, writeraw);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        int i2 = onTransact + 55;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return writerawIAuthTabCallback2;
    }

    private static final deserializeIp onWarmupCompleted(MapConverter mapConverter, writeRaw writeraw) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(writeraw, "");
        if (mapConverter != null) {
            return writeraw.IAuthTabCallback(mapConverter);
        }
        int i4 = onTransact + 57;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return writeraw;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RxSharedApiCall rxSharedApiCall, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (Unit) onExtraCallback(iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 1582292963, -1582292960, new Object[]{rxSharedApiCall, deserializeurinullablecollection}, iOnNavigationEvent3);
    }

    public static /* synthetic */ void onExtraCallback(RxSharedApiCall rxSharedApiCall, String str, int i, Object obj) {
        Object[] objArr = {rxSharedApiCall, str, Integer.valueOf(i), obj};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -1489152561, 1489152566, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    public static /* synthetic */ writeRaw onNavigationEvent(RxSharedApiCall rxSharedApiCall, MapConverter mapConverter, MapConverter mapConverter2, boolean z, int i, Object obj) {
        Object[] objArr = {rxSharedApiCall, mapConverter, mapConverter2, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (writeRaw) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -939077752, 939077756, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 237696428, -237696426, new Object[]{this, str}, iOnNavigationEvent3);
    }

    public final writeRaw<T> onExtraCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (writeRaw) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 1464062815, -1464062814, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    public final T IAuthTabCallback() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (T) onExtraCallback(iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -144346571, 144346571, new Object[]{this}, iOnNavigationEvent3);
    }
}
