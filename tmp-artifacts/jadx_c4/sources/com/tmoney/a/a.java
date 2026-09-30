package com.tmoney.a;

import com.tmoney.LiveCheckConstants;
import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.StringUtil;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class a {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private boolean d;
    private byte[] e;
    private byte[] f;

    public a() {
    }

    public a(byte[] bArr) {
        int length;
        byte[] bArr2;
        int i = 8;
        byte[] bArr3 = new byte[8];
        this.b = bArr3;
        byte[] bArr4 = new byte[4];
        this.a = bArr4;
        this.e = new byte[1];
        this.f = new byte[1];
        byte[] bArr5 = new byte[2];
        this.c = bArr5;
        this.d = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr5, 0, 2);
                return;
            }
            if (bArr.length == 6) {
                System.arraycopy(bArr, 0, bArr4, 0, 4);
                i = 4;
            } else {
                if (bArr.length != 10) {
                    if (bArr.length == 24) {
                        System.arraycopy(bArr, 0, bArr3, 0, 8);
                        System.arraycopy(bArr, 8, this.a, 0, 4);
                        System.arraycopy(bArr, 10, this.e, 0, 1);
                        length = 21;
                        System.arraycopy(bArr, 21, this.f, 0, 1);
                        i = 1;
                    } else {
                        length = bArr.length - 2;
                        i = 0;
                    }
                    System.arraycopy(bArr, length + i, this.c, 0, 2);
                    bArr2 = this.c;
                    if (bArr2[0] == -112 || bArr2[1] != 0) {
                    }
                    this.d = true;
                    return;
                }
                System.arraycopy(bArr, 0, bArr3, 0, 8);
            }
            length = 0;
            System.arraycopy(bArr, length + i, this.c, 0, 2);
            bArr2 = this.c;
            if (bArr2[0] == -112) {
            }
        }
    }

    private static byte[] a(byte b, byte b2, byte b3, byte b4, byte[] bArr, byte b5) {
        int i;
        int length;
        if (bArr != null) {
            length = bArr.length;
            i = length + 5;
        } else {
            i = 4;
            length = 0;
        }
        if (b5 != 0) {
            i++;
        }
        byte[] bArr2 = new byte[i];
        bArr2[0] = b;
        bArr2[1] = b2;
        bArr2[2] = b3;
        bArr2[3] = b4;
        if (length > 0) {
            bArr2[4] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
        }
        if (b5 != 0) {
            bArr2[i - 1] = b5;
        }
        return bArr2;
    }

    private static byte[] a(int i) {
        byte[] bArr = new byte[4];
        byte[] binary = BinaryUtil.parseBinary(i);
        LogHelper.d("TmoneyApduCmd", "amt[" + i + "]: 0x" + StringUtil.dump(binary, 0, binary.length));
        System.arraycopy(binary, 0, bArr, 0, binary.length);
        return bArr;
    }

    public static byte[] getApduCmd(int i) {
        byte[] bArr;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte[] bArr2;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte b10;
        byte b11;
        byte b12;
        byte b13 = 4;
        if (i != 0) {
            b3 = -112;
            b2 = 1;
            bArr = null;
            if (i != 1) {
                b = -78;
                if (i == 2) {
                    b9 = 52;
                    b10 = 28;
                } else {
                    if (i == 21) {
                        b4 = 4;
                        b6 = 1;
                        bArr2 = null;
                        b7 = -54;
                        b5 = 2;
                        b8 = 0;
                        return a(b8, b7, b6, b5, bArr2, b4);
                    }
                    switch (i) {
                        case 7:
                            b11 = 26;
                            b9 = b11;
                            b10 = 36;
                            break;
                        case 8:
                            b12 = 31;
                            b2 = 8;
                            b = 64;
                            b13 = b12;
                            break;
                        case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                            b11 = 46;
                            b9 = b11;
                            b10 = 36;
                            break;
                        case 10:
                            b12 = 30;
                            b = 64;
                            b13 = b12;
                            break;
                        default:
                            return null;
                    }
                }
                b5 = b10;
                b4 = b9;
                b8 = 0;
                b6 = b2;
                bArr2 = bArr;
                b7 = b;
                return a(b8, b7, b6, b5, bArr2, b4);
            }
            b = 76;
            b2 = 0;
        } else {
            bArr = new byte[]{-44, 16, 0, 0, 3, 0, 1};
            b = -92;
            b2 = 4;
            b13 = 0;
            b3 = 0;
        }
        b4 = b13;
        b5 = 0;
        b8 = b3;
        b6 = b2;
        bArr2 = bArr;
        b7 = b;
        return a(b8, b7, b6, b5, bArr2, b4);
    }

    public static byte[] getApduCmd(int i, byte b, byte b2, byte b3, int i2, byte b4) {
        byte[] bArrA;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte b10;
        byte b11;
        byte b12;
        if (i == 0) {
            bArrA = a((byte) 0, (byte) -92, (byte) 4, (byte) 0, new byte[]{-44, 16, 0, 0, 3, 0, 1}, (byte) 0);
        } else if (i == 1) {
            bArrA = a((byte) -112, (byte) 76, (byte) 0, (byte) 0, null, (byte) 4);
        } else if (i == 2) {
            bArrA = a((byte) 0, (byte) -78, b2, (byte) 28, null, (byte) 52);
        } else if (i == 3) {
            bArrA = a((byte) -112, (byte) 64, (byte) 0, (byte) 0, a(i2), (byte) 0);
        } else if (i == 5) {
            bArrA = a((byte) -112, (byte) 64, (byte) 3, (byte) 0, a(i2), (byte) 0);
        } else if (i != 100) {
            if (i != 20) {
                if (i != 21) {
                    b3 = 36;
                    b10 = -78;
                    switch (i) {
                        case 7:
                            b4 = 26;
                            break;
                        case 8:
                            b11 = 8;
                            b12 = 31;
                            b7 = -112;
                            b8 = b11;
                            b5 = 64;
                            b6 = b12;
                            b9 = 0;
                            break;
                        case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                            b4 = 46;
                            break;
                        case 10:
                            b12 = 30;
                            b11 = 1;
                            b7 = -112;
                            b8 = b11;
                            b5 = 64;
                            b6 = b12;
                            b9 = 0;
                            break;
                        default:
                            return null;
                    }
                } else {
                    b10 = -54;
                }
                b8 = b2;
                b9 = b3;
                b5 = b10;
                b6 = b4;
                b7 = 0;
            } else {
                b5 = -64;
                b6 = b4;
                b7 = 0;
                b8 = 0;
                b9 = 0;
            }
            bArrA = a(b7, b5, b8, b9, null, b6);
        } else {
            bArrA = a((byte) 0, (byte) -92, (byte) 4, (byte) 0, new byte[]{-44, 16, 0, 0, 3, 0, 1}, (byte) 0);
        }
        bArrA[0] = (byte) (b | bArrA[0]);
        return bArrA;
    }

    public static byte[] getApduCmd(int i, byte b, int i2) {
        byte[] bArrA;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte[] bArr;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte b10;
        byte b11 = 4;
        if (i != 0) {
            b4 = -112;
            bArrA = null;
            if (i != 1) {
                b2 = -78;
                if (i != 2) {
                    b9 = 64;
                    if (i != 3) {
                        if (i == 5) {
                            bArrA = a(i2);
                            b11 = 0;
                            b3 = 3;
                        } else {
                            if (i == 21) {
                                b2 = -54;
                                b5 = 4;
                                b8 = 0;
                                b7 = 1;
                                bArr = null;
                                b6 = 2;
                                return a(b8, b2, b7, b6, bArr, b5);
                            }
                            switch (i) {
                                case 7:
                                    b10 = 26;
                                    b7 = b;
                                    b6 = 36;
                                    break;
                                case 8:
                                    b3 = 8;
                                    b11 = 31;
                                    break;
                                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                                    b10 = 46;
                                    b7 = b;
                                    b6 = 36;
                                    break;
                                case 10:
                                    b11 = 30;
                                    b3 = 1;
                                    break;
                                default:
                                    return null;
                            }
                        }
                        b2 = b9;
                    } else {
                        bArrA = a(i2);
                        b11 = 0;
                    }
                } else {
                    b10 = 52;
                    b6 = 28;
                    b7 = b;
                }
                b5 = b10;
                b8 = 0;
                bArr = bArrA;
                return a(b8, b2, b7, b6, bArr, b5);
            }
            b9 = 76;
            b3 = 0;
            b2 = b9;
        } else {
            bArrA = new byte[]{-44, 16, 0, 0, 3, 0, 1};
            b2 = -92;
            b3 = 4;
            b11 = 0;
            b4 = 0;
        }
        b7 = b3;
        b5 = b11;
        b6 = 0;
        b8 = b4;
        bArr = bArrA;
        return a(b8, b2, b7, b6, bArr, b5);
    }

    public String getAppCode() {
        return BinaryUtil.toBinaryStringtoUp(this.a);
    }

    public int getAppVersion() {
        return Integer.parseInt(ByteHelper.toHexString(this.e));
    }

    public String getChipSerial() {
        return BinaryUtil.toBinaryStringtoUp(this.b);
    }

    public String getLifeCycle() {
        return BinaryUtil.toBinaryStringtoUp(this.f);
    }

    public String getSW() {
        byte[] bArr = this.c;
        return (bArr == null || bArr.length != 2) ? "NONE" : BinaryUtil.toBinaryStringtoUp(bArr);
    }

    public boolean isbResData() {
        return this.d;
    }
}
