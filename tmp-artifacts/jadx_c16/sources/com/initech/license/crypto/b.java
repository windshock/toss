package com.initech.license.crypto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class b {
    private char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".toCharArray();
    private char[] b = new char[94];

    b(int i) {
        a(i);
    }

    private void a(int i) {
        E2ERandom e2ERandom = new E2ERandom();
        e2ERandom.init(i);
        int[] iArr = {10, 26, 26, 32};
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[i3];
            int i5 = 0;
            while (i5 < i4) {
                int next = e2ERandom.next() % iArr[i3];
                this.b[i2] = str.charAt(next);
                iArr[i3] = iArr[i3] - 1;
                str = str.substring(0, next) + str.substring(next + 1);
                i5++;
                i2++;
            }
        }
    }

    final String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int i2 = 0;
            while (true) {
                char[] cArr = this.b;
                if (i2 >= cArr.length) {
                    break;
                }
                if (cArr[i2] == str.charAt(i)) {
                    stringBuffer.append(this.a[i2]);
                    break;
                }
                i2++;
            }
            if (i2 == this.b.length) {
                stringBuffer.append((char) 0);
            }
        }
        return stringBuffer.toString();
    }
}
