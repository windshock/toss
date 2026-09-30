package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import o.pmi10;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ObjectId implements Comparable<ObjectId>, Serializable {
    private static final int onExtraCallback;
    private static final short onExtraCallbackWithResult;
    private static final AtomicInteger onNavigationEvent = new AtomicInteger(new SecureRandom().nextInt());
    private static final char[] onWarmupCompleted = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final long serialVersionUID = 3670079982654483072L;
    private final int counter;
    private final int randomValue1;
    private final short randomValue2;
    private final int timestamp;

    private static byte IAuthTabCallback(int i) {
        return (byte) i;
    }

    private static byte IAuthTabCallback(short s) {
        return (byte) (s >> 8);
    }

    private static int IAuthTabCallback(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    private static byte onExtraCallback(int i) {
        return (byte) (i >> 16);
    }

    private static short onExtraCallback(byte b, byte b2) {
        return (short) (((b & 255) << 8) | (b2 & 255));
    }

    private static byte onNavigationEvent(int i) {
        return (byte) (i >> 24);
    }

    private static byte onNavigationEvent(short s) {
        return (byte) s;
    }

    private static byte onWarmupCompleted(int i) {
        return (byte) (i >> 8);
    }

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            onExtraCallback = secureRandom.nextInt(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            onExtraCallbackWithResult = (short) secureRandom.nextInt(32768);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean onNavigationEvent(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        int length = str.length();
        if (length != 24) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'f') && (cCharAt < 'A' || cCharAt > 'F'))) {
                return false;
            }
        }
        return true;
    }

    public ObjectId() {
        this(new Date());
    }

    public ObjectId(Date date) {
        this(IAuthTabCallback(date), onNavigationEvent.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i) {
        this(IAuthTabCallback(date), i, true);
    }

    @Deprecated
    public ObjectId(Date date, int i, short s, int i2) {
        this(IAuthTabCallback(date), i, s, i2);
    }

    @Deprecated
    public ObjectId(int i, int i2, short s, int i3) {
        this(i, i2, s, i3, true);
    }

    public ObjectId(int i, int i2) {
        this(i, i2, true);
    }

    private ObjectId(int i, int i2, boolean z) {
        this(i, onExtraCallback, onExtraCallbackWithResult, i2, z);
    }

    private ObjectId(int i, int i2, short s, int i3, boolean z) {
        if ((i2 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (z && (i3 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.timestamp = i;
        this.counter = 16777215 & i3;
        this.randomValue1 = i2;
        this.randomValue2 = s;
    }

    public ObjectId(String str) {
        this(onWarmupCompleted(str));
    }

    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap((byte[]) pmi10.onExtraCallbackWithResult("bytes has length of 12", bArr, ((byte[]) pmi10.onExtraCallbackWithResult("bytes", bArr)).length == 12)));
    }

    ObjectId(int i, int i2, int i3) {
        this(onNavigationEvent(i, i2, i3));
    }

    public ObjectId(ByteBuffer byteBuffer) {
        pmi10.onExtraCallbackWithResult("buffer", byteBuffer);
        pmi10.onExtraCallbackWithResult("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.timestamp = IAuthTabCallback(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.randomValue1 = IAuthTabCallback((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.randomValue2 = onExtraCallback(byteBuffer.get(), byteBuffer.get());
        this.counter = IAuthTabCallback((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
    }

    private static byte[] onNavigationEvent(int i, int i2, int i3) {
        return new byte[]{onNavigationEvent(i), onExtraCallback(i), onWarmupCompleted(i), IAuthTabCallback(i), onNavigationEvent(i2), onExtraCallback(i2), onWarmupCompleted(i2), IAuthTabCallback(i2), onNavigationEvent(i3), onExtraCallback(i3), onWarmupCompleted(i3), IAuthTabCallback(i3)};
    }

    public byte[] onNavigationEvent() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        onWarmupCompleted(byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    public void onWarmupCompleted(ByteBuffer byteBuffer) {
        pmi10.onExtraCallbackWithResult("buffer", byteBuffer);
        pmi10.onExtraCallbackWithResult("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        byteBuffer.put(onNavigationEvent(this.timestamp));
        byteBuffer.put(onExtraCallback(this.timestamp));
        byteBuffer.put(onWarmupCompleted(this.timestamp));
        byteBuffer.put(IAuthTabCallback(this.timestamp));
        byteBuffer.put(onExtraCallback(this.randomValue1));
        byteBuffer.put(onWarmupCompleted(this.randomValue1));
        byteBuffer.put(IAuthTabCallback(this.randomValue1));
        byteBuffer.put(IAuthTabCallback(this.randomValue2));
        byteBuffer.put(onNavigationEvent(this.randomValue2));
        byteBuffer.put(onExtraCallback(this.counter));
        byteBuffer.put(onWarmupCompleted(this.counter));
        byteBuffer.put(IAuthTabCallback(this.counter));
    }

    public String onExtraCallbackWithResult() {
        char[] cArr = new char[24];
        byte[] bArrOnNavigationEvent = onNavigationEvent();
        int length = bArrOnNavigationEvent.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArrOnNavigationEvent[i2];
            char[] cArr2 = onWarmupCompleted;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i2++;
            i += 2;
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ObjectId.class != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        return this.counter == objectId.counter && this.timestamp == objectId.timestamp && this.randomValue1 == objectId.randomValue1 && this.randomValue2 == objectId.randomValue2;
    }

    public int hashCode() {
        int i = this.timestamp;
        return (((((i * 31) + this.counter) * 31) + this.randomValue1) * 31) + this.randomValue2;
    }

    @Override // java.lang.Comparable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int compareTo(ObjectId objectId) {
        byte[] bArrOnNavigationEvent = onNavigationEvent();
        byte[] bArrOnNavigationEvent2 = objectId.onNavigationEvent();
        for (int i = 0; i < 12; i++) {
            byte b = bArrOnNavigationEvent[i];
            byte b2 = bArrOnNavigationEvent2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public String toString() {
        return onExtraCallbackWithResult();
    }

    private static byte[] onWarmupCompleted(String str) {
        if (!onNavigationEvent(str)) {
            throw new IllegalArgumentException("invalid hexadecimal representation of an ObjectId: [" + str + "]");
        }
        byte[] bArr = new byte[12];
        for (int i = 0; i < 12; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    private static int IAuthTabCallback(Date date) {
        return (int) (date.getTime() / 1000);
    }
}
