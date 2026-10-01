package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerKtExternalSyntheticLambda5 {
    static final boolean IAuthTabCallback;
    private static final int IAuthTabCallbackDefault;
    private static final long IAuthTabCallbackStub;
    private static final long access000;
    private static final long access100;
    private static final long asBinder;
    private static final long asInterface;
    private static final long extraCallbackWithResult;
    private static final long onActivityLayout;
    static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onMinimized;
    private static final long onNavigationEvent;
    private static final long onTransact;
    private static final long onWarmupCompleted;
    private static final long readTypedObject;
    private static final Unsafe onMessageChannelReady = onExtraCallbackWithResult();
    private static final Class<?> writeTypedObject = LazyLayoutKtExternalSyntheticLambda1.onExtraCallbackWithResult();
    private static final boolean extraCallback = onNavigationEvent(Long.TYPE);
    private static final boolean IAuthTabCallback_Parcel = onNavigationEvent(Integer.TYPE);
    private static final IAuthTabCallback ICustomTabsCallback = IAuthTabCallbackStub();
    private static final boolean getInterfaceDescriptor = IAuthTabCallbackDefault();
    private static final boolean IAuthTabCallbackStubProxy = onTransact();

    static {
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult((Class<?>) byte[].class);
        onExtraCallback = jOnExtraCallbackWithResult;
        onNavigationEvent = onExtraCallbackWithResult((Class<?>) boolean[].class);
        onExtraCallbackWithResult = onExtraCallback(boolean[].class);
        access000 = onExtraCallbackWithResult((Class<?>) int[].class);
        access100 = onExtraCallback(int[].class);
        readTypedObject = onExtraCallbackWithResult((Class<?>) long[].class);
        extraCallbackWithResult = onExtraCallback(long[].class);
        onTransact = onExtraCallbackWithResult((Class<?>) float[].class);
        IAuthTabCallbackStub = onExtraCallback(float[].class);
        asBinder = onExtraCallbackWithResult((Class<?>) double[].class);
        asInterface = onExtraCallback(double[].class);
        onMinimized = onExtraCallbackWithResult((Class<?>) Object[].class);
        onActivityLayout = onExtraCallback(Object[].class);
        onWarmupCompleted = onExtraCallbackWithResult(onWarmupCompleted());
        IAuthTabCallbackDefault = (int) (jOnExtraCallbackWithResult & 7);
        IAuthTabCallback = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private PagerKtExternalSyntheticLambda5() {
    }

    public static boolean onExtraCallback() {
        return IAuthTabCallbackStubProxy;
    }

    static boolean onNavigationEvent() {
        return getInterfaceDescriptor;
    }

    static <T> T IAuthTabCallback(Class<T> cls) {
        try {
            return (T) onMessageChannelReady.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static long onWarmupCompleted(Field field) {
        return ICustomTabsCallback.onNavigationEvent(field);
    }

    private static int onExtraCallbackWithResult(Class<?> cls) {
        if (IAuthTabCallbackStubProxy) {
            return ICustomTabsCallback.onNavigationEvent(cls);
        }
        return -1;
    }

    private static int onExtraCallback(Class<?> cls) {
        if (IAuthTabCallbackStubProxy) {
            return ICustomTabsCallback.IAuthTabCallback(cls);
        }
        return -1;
    }

    static int IAuthTabCallbackDefault(Object obj, long j) {
        return ICustomTabsCallback.onExtraCallbackWithResult(obj, j);
    }

    static void onExtraCallbackWithResult(Object obj, long j, int i2) {
        ICustomTabsCallback.onWarmupCompleted(obj, j, i2);
    }

    static long asInterface(Object obj, long j) {
        return ICustomTabsCallback.onExtraCallback(obj, j);
    }

    static void IAuthTabCallback(Object obj, long j, long j2) {
        ICustomTabsCallback.onNavigationEvent(obj, j, j2);
    }

    static boolean onExtraCallbackWithResult(Object obj, long j) {
        return ICustomTabsCallback.onWarmupCompleted(obj, j);
    }

    static void onExtraCallback(Object obj, long j, boolean z) {
        ICustomTabsCallback.onNavigationEvent(obj, j, z);
    }

    static float IAuthTabCallback(Object obj, long j) {
        return ICustomTabsCallback.IAuthTabCallback(obj, j);
    }

    static void onExtraCallbackWithResult(Object obj, long j, float f) {
        ICustomTabsCallback.IAuthTabCallback(obj, j, f);
    }

    static double onExtraCallback(Object obj, long j) {
        return ICustomTabsCallback.onNavigationEvent(obj, j);
    }

    static void onExtraCallback(Object obj, long j, double d) {
        ICustomTabsCallback.onWarmupCompleted(obj, j, d);
    }

    static Object asBinder(Object obj, long j) {
        return ICustomTabsCallback.IAuthTabCallbackStub(obj, j);
    }

    static void onExtraCallbackWithResult(Object obj, long j, Object obj2) {
        ICustomTabsCallback.onNavigationEvent(obj, j, obj2);
    }

    public static void onExtraCallback(byte[] bArr, long j, byte b) {
        ICustomTabsCallback.IAuthTabCallback((Object) bArr, onExtraCallback + j, b);
    }

    static void onNavigationEvent(long j, byte[] bArr, long j2, long j3) {
        ICustomTabsCallback.onExtraCallbackWithResult(j, bArr, j2, j3);
    }

    static byte onExtraCallbackWithResult(long j) {
        return ICustomTabsCallback.onWarmupCompleted(j);
    }

    static long IAuthTabCallback(ByteBuffer byteBuffer) {
        return ICustomTabsCallback.onExtraCallback(byteBuffer, onWarmupCompleted);
    }

    static Unsafe onExtraCallbackWithResult() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.PagerKtExternalSyntheticLambda5.3
                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    private static IAuthTabCallback IAuthTabCallbackStub() {
        Unsafe unsafe = onMessageChannelReady;
        if (unsafe == null) {
            return null;
        }
        if (LazyLayoutKtExternalSyntheticLambda1.onWarmupCompleted()) {
            if (extraCallback) {
                return new onExtraCallbackWithResult(unsafe);
            }
            if (IAuthTabCallback_Parcel) {
                return new onExtraCallback(unsafe);
            }
            return null;
        }
        return new onWarmupCompleted(unsafe);
    }

    private static boolean onTransact() {
        IAuthTabCallback iAuthTabCallback = ICustomTabsCallback;
        if (iAuthTabCallback == null) {
            return false;
        }
        return iAuthTabCallback.onExtraCallbackWithResult();
    }

    private static boolean IAuthTabCallbackDefault() {
        IAuthTabCallback iAuthTabCallback = ICustomTabsCallback;
        if (iAuthTabCallback == null) {
            return false;
        }
        return iAuthTabCallback.onWarmupCompleted();
    }

    static boolean onNavigationEvent(Class<?> cls) {
        if (!LazyLayoutKtExternalSyntheticLambda1.onWarmupCompleted()) {
            return false;
        }
        try {
            Class<?> cls2 = writeTypedObject;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field onWarmupCompleted() {
        Field fieldOnNavigationEvent;
        if (LazyLayoutKtExternalSyntheticLambda1.onWarmupCompleted() && (fieldOnNavigationEvent = onNavigationEvent((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldOnNavigationEvent;
        }
        Field fieldOnNavigationEvent2 = onNavigationEvent((Class<?>) Buffer.class, "address");
        if (fieldOnNavigationEvent2 == null || fieldOnNavigationEvent2.getType() != Long.TYPE) {
            return null;
        }
        return fieldOnNavigationEvent2;
    }

    private static long onExtraCallbackWithResult(Field field) {
        IAuthTabCallback iAuthTabCallback;
        if (field == null || (iAuthTabCallback = ICustomTabsCallback) == null) {
            return -1L;
        }
        return iAuthTabCallback.onNavigationEvent(field);
    }

    private static Field onNavigationEvent(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static abstract class IAuthTabCallback {
        Unsafe onNavigationEvent;

        public abstract float IAuthTabCallback(Object obj, long j);

        public abstract void IAuthTabCallback(Object obj, long j, byte b);

        public abstract void IAuthTabCallback(Object obj, long j, float f);

        public abstract void onExtraCallbackWithResult(long j, byte[] bArr, long j2, long j3);

        public abstract double onNavigationEvent(Object obj, long j);

        public abstract void onNavigationEvent(Object obj, long j, boolean z);

        public abstract byte onWarmupCompleted(long j);

        public abstract void onWarmupCompleted(Object obj, long j, double d);

        public abstract boolean onWarmupCompleted(Object obj, long j);

        IAuthTabCallback(Unsafe unsafe) {
            this.onNavigationEvent = unsafe;
        }

        public final long onNavigationEvent(Field field) {
            return this.onNavigationEvent.objectFieldOffset(field);
        }

        public final int onNavigationEvent(Class<?> cls) {
            return this.onNavigationEvent.arrayBaseOffset(cls);
        }

        public final int IAuthTabCallback(Class<?> cls) {
            return this.onNavigationEvent.arrayIndexScale(cls);
        }

        public boolean onExtraCallbackWithResult() {
            Unsafe unsafe = this.onNavigationEvent;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                PagerKtExternalSyntheticLambda5.onWarmupCompleted(th);
                return false;
            }
        }

        public final int onExtraCallbackWithResult(Object obj, long j) {
            return this.onNavigationEvent.getInt(obj, j);
        }

        public final void onWarmupCompleted(Object obj, long j, int i2) {
            this.onNavigationEvent.putInt(obj, j, i2);
        }

        public final long onExtraCallback(Object obj, long j) {
            return this.onNavigationEvent.getLong(obj, j);
        }

        public final void onNavigationEvent(Object obj, long j, long j2) {
            this.onNavigationEvent.putLong(obj, j, j2);
        }

        public final Object IAuthTabCallbackStub(Object obj, long j) {
            return this.onNavigationEvent.getObject(obj, j);
        }

        public final void onNavigationEvent(Object obj, long j, Object obj2) {
            this.onNavigationEvent.putObject(obj, j, obj2);
        }

        public boolean onWarmupCompleted() {
            Unsafe unsafe = this.onNavigationEvent;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return PagerKtExternalSyntheticLambda5.onWarmupCompleted() != null;
            } catch (Throwable th) {
                PagerKtExternalSyntheticLambda5.onWarmupCompleted(th);
                return false;
            }
        }
    }

    static final class onWarmupCompleted extends IAuthTabCallback {
        onWarmupCompleted(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public boolean onExtraCallbackWithResult() {
            if (!super.onExtraCallbackWithResult()) {
                return false;
            }
            try {
                Class<?> cls = this.onNavigationEvent.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                PagerKtExternalSyntheticLambda5.onWarmupCompleted(th);
                return false;
            }
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void IAuthTabCallback(Object obj, long j, byte b) {
            this.onNavigationEvent.putByte(obj, j, b);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public boolean onWarmupCompleted(Object obj, long j) {
            return this.onNavigationEvent.getBoolean(obj, j);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onNavigationEvent(Object obj, long j, boolean z) {
            this.onNavigationEvent.putBoolean(obj, j, z);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public float IAuthTabCallback(Object obj, long j) {
            return this.onNavigationEvent.getFloat(obj, j);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void IAuthTabCallback(Object obj, long j, float f) {
            this.onNavigationEvent.putFloat(obj, j, f);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public double onNavigationEvent(Object obj, long j) {
            return this.onNavigationEvent.getDouble(obj, j);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onWarmupCompleted(Object obj, long j, double d) {
            this.onNavigationEvent.putDouble(obj, j, d);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public boolean onWarmupCompleted() {
            if (!super.onWarmupCompleted()) {
                return false;
            }
            try {
                Class<?> cls = this.onNavigationEvent.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                PagerKtExternalSyntheticLambda5.onWarmupCompleted(th);
                return false;
            }
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public byte onWarmupCompleted(long j) {
            return this.onNavigationEvent.getByte(j);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onExtraCallbackWithResult(long j, byte[] bArr, long j2, long j3) {
            this.onNavigationEvent.copyMemory((Object) null, j, bArr, PagerKtExternalSyntheticLambda5.onExtraCallback + j2, j3);
        }
    }

    static final class onExtraCallbackWithResult extends IAuthTabCallback {
        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public boolean onWarmupCompleted() {
            return false;
        }

        onExtraCallbackWithResult(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void IAuthTabCallback(Object obj, long j, byte b) {
            if (PagerKtExternalSyntheticLambda5.IAuthTabCallback) {
                PagerKtExternalSyntheticLambda5.onWarmupCompleted(obj, j, b);
            } else {
                PagerKtExternalSyntheticLambda5.onExtraCallback(obj, j, b);
            }
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public boolean onWarmupCompleted(Object obj, long j) {
            return PagerKtExternalSyntheticLambda5.IAuthTabCallback ? PagerKtExternalSyntheticLambda5.IAuthTabCallbackStub(obj, j) : PagerKtExternalSyntheticLambda5.onTransact(obj, j);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onNavigationEvent(Object obj, long j, boolean z) {
            if (PagerKtExternalSyntheticLambda5.IAuthTabCallback) {
                PagerKtExternalSyntheticLambda5.onWarmupCompleted(obj, j, z);
            } else {
                PagerKtExternalSyntheticLambda5.IAuthTabCallback(obj, j, z);
            }
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public float IAuthTabCallback(Object obj, long j) {
            return Float.intBitsToFloat(onExtraCallbackWithResult(obj, j));
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void IAuthTabCallback(Object obj, long j, float f) {
            onWarmupCompleted(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public double onNavigationEvent(Object obj, long j) {
            return Double.longBitsToDouble(onExtraCallback(obj, j));
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onWarmupCompleted(Object obj, long j, double d) {
            onNavigationEvent(obj, j, Double.doubleToLongBits(d));
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public byte onWarmupCompleted(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onExtraCallbackWithResult(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    static final class onExtraCallback extends IAuthTabCallback {
        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public boolean onWarmupCompleted() {
            return false;
        }

        onExtraCallback(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void IAuthTabCallback(Object obj, long j, byte b) {
            if (PagerKtExternalSyntheticLambda5.IAuthTabCallback) {
                PagerKtExternalSyntheticLambda5.onWarmupCompleted(obj, j, b);
            } else {
                PagerKtExternalSyntheticLambda5.onExtraCallback(obj, j, b);
            }
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public boolean onWarmupCompleted(Object obj, long j) {
            return PagerKtExternalSyntheticLambda5.IAuthTabCallback ? PagerKtExternalSyntheticLambda5.IAuthTabCallbackStub(obj, j) : PagerKtExternalSyntheticLambda5.onTransact(obj, j);
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onNavigationEvent(Object obj, long j, boolean z) {
            if (PagerKtExternalSyntheticLambda5.IAuthTabCallback) {
                PagerKtExternalSyntheticLambda5.onWarmupCompleted(obj, j, z);
            } else {
                PagerKtExternalSyntheticLambda5.IAuthTabCallback(obj, j, z);
            }
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public float IAuthTabCallback(Object obj, long j) {
            return Float.intBitsToFloat(onExtraCallbackWithResult(obj, j));
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void IAuthTabCallback(Object obj, long j, float f) {
            onWarmupCompleted(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public double onNavigationEvent(Object obj, long j) {
            return Double.longBitsToDouble(onExtraCallback(obj, j));
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onWarmupCompleted(Object obj, long j, double d) {
            onNavigationEvent(obj, j, Double.doubleToLongBits(d));
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public byte onWarmupCompleted(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // o.PagerKtExternalSyntheticLambda5.IAuthTabCallback
        public void onExtraCallbackWithResult(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    private static byte access100(Object obj, long j) {
        return (byte) (IAuthTabCallbackDefault(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    private static byte IAuthTabCallback_Parcel(Object obj, long j) {
        return (byte) (IAuthTabCallbackDefault(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onWarmupCompleted(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        onExtraCallbackWithResult(obj, j2, ((~(OggPageHeader.MAX_SEGMENT_COUNT << i2)) & iIAuthTabCallbackDefault) | ((b & 255) << i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onExtraCallback(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i2 = (((int) j) & 3) << 3;
        int i3 = (b & 255) << i2;
        onExtraCallbackWithResult(obj, j2, ((~(OggPageHeader.MAX_SEGMENT_COUNT << i2)) & IAuthTabCallbackDefault(obj, j2)) | i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IAuthTabCallbackStub(Object obj, long j) {
        return access100(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean onTransact(Object obj, long j) {
        return IAuthTabCallback_Parcel(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onWarmupCompleted(Object obj, long j, boolean z) {
        onWarmupCompleted(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IAuthTabCallback(Object obj, long j, boolean z) {
        onExtraCallback(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onWarmupCompleted(Throwable th) {
        Logger.getLogger(PagerKtExternalSyntheticLambda5.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
