package com.initech.license.crypto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
abstract class a extends SecureRandom {
    private static Class a;
    private static Class b;

    static {
        Class clsA = a;
        if (clsA == null) {
            clsA = a("com.initech.license.crypto.SHA1Random");
            a = clsA;
        }
        b = clsA;
    }

    public static final SecureRandom a() {
        return a(b);
    }

    private static SecureRandom a(Class cls) throws RuntimeException {
        try {
            return (SecureRandom) cls.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("SecureRandom 인스턴스 생성 중 내부 오류 발생: " + e.getMessage());
        }
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override // com.initech.license.crypto.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
        }
    }

    @Override // com.initech.license.crypto.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i > 0; i--) {
            bArr[i] = (byte) j;
            j >>>= 8;
        }
        setSeed(bArr);
    }

    @Override // com.initech.license.crypto.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
        }
    }
}
