package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;
    private long[] kw;
    private long[] t;
    private static int[] MOD9 = new int[80];
    private static int[] MOD17 = new int[80];
    private static int[] MOD5 = new int[80];
    private static int[] MOD3 = new int[80];

    static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long jXorRotr = jArr[15];
            int i = 19;
            while (i > 0) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                int i4 = i2 + 1;
                long j16 = j - jArr3[i4];
                int i5 = i2 + 2;
                long j17 = jArr3[i5];
                int i6 = i2 + 3;
                long j18 = j3 - jArr3[i6];
                int i7 = i2 + 4;
                long j19 = jArr3[i7];
                int i8 = i2 + 5;
                long j20 = j5 - jArr3[i8];
                int i9 = i2 + 6;
                long j21 = jArr3[i9];
                int i10 = i2 + 7;
                long j22 = j7 - jArr3[i10];
                int i11 = i2 + 8;
                long j23 = jArr3[i11];
                int i12 = i2 + 9;
                int i13 = i;
                long j24 = j9 - jArr3[i12];
                int i14 = i2 + 10;
                long j25 = jArr3[i14];
                int i15 = i2 + 11;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j26 = j11 - jArr3[i15];
                int i16 = i2 + 12;
                long j27 = jArr3[i16];
                int i17 = i2 + 13;
                long j28 = j13 - jArr3[i17];
                int i18 = i2 + 14;
                long j29 = jArr3[i18];
                int i19 = i3 + 1;
                long j30 = jArr4[i19];
                int i20 = i2 + 15;
                long j31 = j15 - (jArr3[i20] + jArr4[i3 + 2]);
                long j32 = jArr3[i2 + 16];
                long[] jArr5 = jArr4;
                long[] jArr6 = jArr3;
                long j33 = i13;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((j32 + j33) + 1), 9, j16);
                long j34 = j16 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(j12 - j27, 48, j18);
                long j35 = j18 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j14 - (j29 + j30), 35, j22);
                long j36 = j22 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j10 - j25, 52, j20);
                long j37 = j20 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j2 - j17, 23, j31);
                long j38 = j31 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j6 - j21, 31, j24);
                long j39 = j24 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j4 - j19, 37, j26);
                long j40 = j26 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j8 - j23, 20, j28);
                long j41 = j28 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9, 31, j34);
                long j42 = j34 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 44, j35);
                long j43 = j35 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 47, j37);
                long j44 = j37 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr6, 46, j36);
                long j45 = j36 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr2, 19, j41);
                long j46 = j41 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr4, 42, j38);
                long j47 = j38 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr3, 44, j39);
                long j48 = j39 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr5, 25, j40);
                long j49 = j40 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr17, 16, j42);
                long j50 = j42 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 34, j43);
                long j51 = j43 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr16, 56, j45);
                long j52 = j45 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr14, 51, j44);
                long j53 = j44 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr10, 4, j49);
                long j54 = j49 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr12, 53, j46);
                long j55 = j46 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr11, 42, j47);
                long j56 = j47 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr13, 41, j48);
                long j57 = j48 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr25, 41, j50);
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 9, j51);
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 37, j53);
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr22, 31, j52);
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr18, 12, j57);
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr20, 47, j54);
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr19, 44, j55);
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr21, 30, j56);
                long j58 = (j50 - jXorRotr26) - jArr6[i2];
                long j59 = jArr6[i4];
                long j60 = (j51 - jXorRotr27) - jArr6[i5];
                long j61 = jArr6[i6];
                long j62 = (j53 - jXorRotr28) - jArr6[i7];
                long j63 = jArr6[i8];
                long j64 = (j52 - jXorRotr29) - jArr6[i9];
                long j65 = jArr6[i10];
                long j66 = (j57 - jXorRotr30) - jArr6[i11];
                long j67 = jArr6[i12];
                long j68 = (j54 - jXorRotr31) - jArr6[i14];
                long j69 = jArr6[i15];
                long j70 = (j55 - jXorRotr32) - jArr6[i16];
                long j71 = jArr6[i17];
                long j72 = jArr5[i3];
                long j73 = (j56 - jXorRotr33) - (jArr6[i18] + jArr5[i19]);
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr33 - (jArr6[i20] + j33), 5, j58);
                long j74 = j58 - jXorRotr34;
                long jXorRotr35 = ThreefishEngine.xorRotr(jXorRotr31 - j69, 20, j60);
                long j75 = j60 - jXorRotr35;
                long jXorRotr36 = ThreefishEngine.xorRotr(jXorRotr32 - (j71 + j72), 48, j64);
                long j76 = j64 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(jXorRotr30 - j67, 41, j62);
                long j77 = j62 - jXorRotr37;
                long jXorRotr38 = ThreefishEngine.xorRotr(jXorRotr26 - j59, 47, j73);
                long j78 = j73 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(jXorRotr28 - j63, 28, j66);
                long j79 = j66 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(jXorRotr27 - j61, 16, j68);
                long j80 = j68 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(jXorRotr29 - j65, 25, j70);
                long j81 = j70 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(jXorRotr41, 33, j74);
                long j82 = j74 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(jXorRotr39, 4, j75);
                long j83 = j75 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr40, 51, j77);
                long j84 = j77 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr38, 13, j76);
                long j85 = j76 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr34, 34, j81);
                long j86 = j81 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr36, 41, j78);
                long j87 = j78 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr35, 59, j79);
                long j88 = j79 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr37, 17, j80);
                long j89 = j80 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr49, 38, j82);
                long j90 = j82 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr47, 19, j83);
                long j91 = j83 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr48, 10, j85);
                long j92 = j85 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr46, 55, j84);
                long j93 = j84 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr42, 49, j89);
                long j94 = j89 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr44, 18, j86);
                long j95 = j86 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr43, 23, j87);
                long j96 = j87 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr45, 52, j88);
                long j97 = j88 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr57, 24, j90);
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr55, 13, j91);
                long j98 = j91 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr56, 8, j93);
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr54, 47, j92);
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr50, 8, j97);
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr52, 17, j94);
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr51, 22, j95);
                j13 = j95 - jXorRotr64;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr53, 37, j96);
                j15 = j96 - jXorRotr;
                j11 = j94 - jXorRotr63;
                long j99 = j93 - jXorRotr60;
                j9 = j97 - jXorRotr62;
                j7 = j92 - jXorRotr61;
                j12 = jXorRotr63;
                j8 = jXorRotr61;
                j3 = j98;
                jArr3 = jArr6;
                iArr2 = iArr4;
                j = j90 - jXorRotr58;
                i = i13 - 2;
                j5 = j99;
                j2 = jXorRotr58;
                iArr = iArr3;
                jArr4 = jArr5;
                j4 = jXorRotr59;
                j14 = jXorRotr64;
                j6 = jXorRotr60;
                j10 = jXorRotr62;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j100 = jArr7[0];
            long j101 = jArr7[1];
            long j102 = jArr7[2];
            long j103 = jArr7[3];
            long j104 = jArr7[4];
            long j105 = jArr7[5];
            long j106 = jArr7[6];
            long j107 = jArr7[7];
            long j108 = jArr7[8];
            long j109 = jArr7[9];
            long j110 = jArr7[10];
            long j111 = jArr7[11];
            long j112 = jArr7[12];
            long j113 = jArr7[13];
            long j114 = jArr8[0];
            long j115 = jArr7[14];
            long j116 = jArr8[1];
            long j117 = jArr7[15];
            jArr2[0] = j - j100;
            jArr2[1] = j2 - j101;
            jArr2[2] = j3 - j102;
            jArr2[3] = j4 - j103;
            jArr2[4] = j5 - j104;
            jArr2[5] = j6 - j105;
            jArr2[6] = j7 - j106;
            jArr2[7] = j8 - j107;
            jArr2[8] = j9 - j108;
            jArr2[9] = j10 - j109;
            jArr2[10] = j11 - j110;
            jArr2[11] = j12 - j111;
            jArr2[12] = j13 - j112;
            jArr2[13] = j14 - (j113 + j114);
            jArr2[14] = j15 - (j115 + j116);
            jArr2[15] = jXorRotr - j117;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            long j17 = jArr3[0];
            long j18 = j2 + jArr3[1];
            long j19 = j3 + jArr3[2];
            long j20 = jArr3[3];
            long j21 = jArr3[4];
            long j22 = jArr3[5];
            long j23 = j7 + jArr3[6];
            long j24 = jArr3[7];
            long j25 = j9 + jArr3[8];
            long j26 = jArr3[9];
            long j27 = j11 + jArr3[10];
            long j28 = jArr3[11];
            long j29 = j13 + jArr3[12];
            long j30 = jArr3[13];
            long j31 = jArr4[0];
            long j32 = j15 + jArr3[14] + jArr4[1];
            long j33 = j5 + j21;
            long j34 = j + j17;
            long j35 = j4 + j20;
            long j36 = j6 + j22;
            long j37 = j8 + j24;
            long j38 = j10 + j26;
            long j39 = j12 + j28;
            long j40 = j14 + j30 + j31;
            long j41 = j16 + jArr3[15];
            while (i < 20) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j42 = j34 + j18;
                long jRotlXor = ThreefishEngine.rotlXor(j18, 24, j42);
                long j43 = j19 + j35;
                long jRotlXor2 = ThreefishEngine.rotlXor(j35, 13, j43);
                long[] jArr5 = jArr3;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j44 = j36;
                long j45 = j33 + j44;
                long jRotlXor3 = ThreefishEngine.rotlXor(j44, 8, j45);
                int i4 = i;
                long j46 = j37;
                long j47 = j23 + j46;
                long jRotlXor4 = ThreefishEngine.rotlXor(j46, 47, j47);
                long[] jArr6 = jArr4;
                long j48 = j38;
                long j49 = j25 + j48;
                long jRotlXor5 = ThreefishEngine.rotlXor(j48, 8, j49);
                long j50 = j39;
                long j51 = j27 + j50;
                long jRotlXor6 = ThreefishEngine.rotlXor(j50, 17, j51);
                long j52 = j40;
                long j53 = j29 + j52;
                long jRotlXor7 = ThreefishEngine.rotlXor(j52, 22, j53);
                long j54 = j41;
                long j55 = j32 + j54;
                long jRotlXor8 = ThreefishEngine.rotlXor(j54, 37, j55);
                long j56 = j42 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 38, j56);
                long j57 = j43 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j57);
                long j58 = j47 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j58);
                long j59 = j45 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, 55, j59);
                long j60 = j51 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, 49, j60);
                long j61 = j53 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j61);
                long j62 = j55 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j62);
                long j63 = j49 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j63);
                long j64 = j56 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j64);
                long j65 = j57 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j65);
                long j66 = j59 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j66);
                long j67 = j58 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j67);
                long j68 = j61 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j68);
                long j69 = j62 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j69);
                long j70 = j63 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, 59, j70);
                long j71 = j60 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j71);
                long j72 = j64 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j72);
                long j73 = j65 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j73);
                long j74 = j67 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j74);
                long j75 = j66 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j75);
                long j76 = j69 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j76);
                long j77 = j70 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j77);
                long j78 = j71 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j78);
                long j79 = j68 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j79);
                long j80 = jArr5[i2];
                int i5 = i2 + 1;
                long j81 = jRotlXor29 + jArr5[i5];
                int i6 = i2 + 2;
                long j82 = jArr5[i6];
                int i7 = i2 + 3;
                long j83 = jRotlXor31 + jArr5[i7];
                int i8 = i2 + 4;
                long j84 = jArr5[i8];
                int i9 = i2 + 5;
                long j85 = jRotlXor30 + jArr5[i9];
                int i10 = i2 + 6;
                long j86 = jArr5[i10];
                int i11 = i2 + 7;
                long j87 = jRotlXor32 + jArr5[i11];
                int i12 = i2 + 8;
                long j88 = jArr5[i12];
                int i13 = i2 + 9;
                long j89 = jRotlXor28 + jArr5[i13];
                int i14 = i2 + 10;
                long j90 = jArr5[i14];
                int i15 = i2 + 11;
                long j91 = jRotlXor26 + jArr5[i15];
                int i16 = i2 + 12;
                long j92 = jArr5[i16];
                int i17 = i2 + 13;
                long j93 = jRotlXor27 + jArr5[i17] + jArr6[i3];
                int i18 = i2 + 14;
                long j94 = jArr5[i18];
                int i19 = i3 + 1;
                long j95 = jArr6[i19];
                int i20 = i2 + 15;
                long j96 = i4;
                long j97 = jRotlXor25 + jArr5[i20] + j96;
                long j98 = j72 + j80 + j81;
                long jRotlXor33 = ThreefishEngine.rotlXor(j81, 41, j98);
                long j99 = j73 + j82 + j83;
                long jRotlXor34 = ThreefishEngine.rotlXor(j83, 9, j99);
                long j100 = j75 + j84 + j85;
                long jRotlXor35 = ThreefishEngine.rotlXor(j85, 37, j100);
                long j101 = j74 + j86 + j87;
                long jRotlXor36 = ThreefishEngine.rotlXor(j87, 31, j101);
                long j102 = j77 + j88 + j89;
                long jRotlXor37 = ThreefishEngine.rotlXor(j89, 12, j102);
                long j103 = j78 + j90 + j91;
                long jRotlXor38 = ThreefishEngine.rotlXor(j91, 47, j103);
                long j104 = j79 + j92 + j93;
                long jRotlXor39 = ThreefishEngine.rotlXor(j93, 44, j104);
                long j105 = j76 + j94 + j95 + j97;
                long jRotlXor40 = ThreefishEngine.rotlXor(j97, 30, j105);
                long j106 = j98 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j106);
                long j107 = j99 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j107);
                long j108 = j101 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j108);
                long j109 = j100 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j109);
                long j110 = j103 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j110);
                long j111 = j104 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, 53, j111);
                long j112 = j105 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j112);
                long j113 = j102 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j113);
                long j114 = j106 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j114);
                long j115 = j107 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j115);
                long j116 = j109 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j116);
                long j117 = j108 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, 46, j117);
                long j118 = j111 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j118);
                long j119 = j112 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j119);
                long j120 = j113 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j120);
                long j121 = j110 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j121);
                long j122 = j114 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j122);
                long j123 = j115 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j123);
                long j124 = j117 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j124);
                long j125 = j116 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j125);
                long j126 = j119 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j126);
                long j127 = j120 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j127);
                long j128 = j121 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j128);
                long j129 = j118 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j129);
                long j130 = jArr5[i5];
                long j131 = jArr5[i6];
                long j132 = jArr5[i7];
                long j133 = jArr5[i8];
                long j134 = jArr5[i9];
                long j135 = jArr5[i10];
                long j136 = jArr5[i11];
                long j137 = jArr5[i12];
                long j138 = jArr5[i13];
                long j139 = jRotlXor60 + jArr5[i14];
                long j140 = jArr5[i15];
                long j141 = jArr5[i16];
                long j142 = j129 + jArr5[i17];
                long j143 = jRotlXor59 + jArr5[i18] + jArr6[i19];
                long j144 = jArr5[i20];
                long j145 = jArr6[i3 + 2];
                long j146 = jRotlXor57 + jArr5[i2 + 16] + j96 + 1;
                j23 = j124 + j136;
                long j147 = j125 + j134;
                long j148 = jRotlXor63 + j133;
                long j149 = j128 + j140;
                j39 = jRotlXor58 + j141;
                j36 = jRotlXor62 + j135;
                j37 = jRotlXor64 + j137;
                j32 = j126 + j144 + j145;
                j40 = j143;
                j41 = j146;
                j38 = j139;
                j33 = j147;
                j27 = j149;
                i = i4 + 2;
                jArr3 = jArr5;
                j34 = j130 + j122;
                j25 = j127 + j138;
                j18 = jRotlXor61 + j131;
                j19 = j123 + j132;
                iArr = iArr3;
                jArr4 = jArr6;
                iArr2 = iArr4;
                j35 = j148;
                j29 = j142;
            }
            jArr2[0] = j34;
            jArr2[1] = j18;
            jArr2[2] = j19;
            jArr2[3] = j35;
            jArr2[4] = j33;
            jArr2[5] = j36;
            jArr2[6] = j23;
            jArr2[7] = j37;
            jArr2[8] = j25;
            jArr2[9] = j38;
            jArr2[10] = j27;
            jArr2[11] = j39;
            jArr2[12] = j29;
            jArr2[13] = j40;
            jArr2[14] = j32;
            jArr2[15] = j41;
        }
    }

    static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            boolean z = false;
            long j = jArr[0];
            long jXorRotr = jArr[1];
            long j2 = jArr[2];
            long jXorRotr2 = jArr[3];
            int i = 17;
            while (i > 0) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                int i4 = i2 + 1;
                long j3 = j - jArr3[i4];
                int i5 = i2 + 2;
                long j4 = jArr3[i5];
                int i6 = i3 + 1;
                long j5 = jArr4[i6];
                int i7 = i2 + 3;
                long j6 = j2 - (jArr3[i7] + jArr4[i3 + 2]);
                long j7 = i;
                long jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr2 - ((jArr3[i2 + 4] + j7) + 1), 32, j3);
                long j8 = j3 - jXorRotr3;
                long j9 = jXorRotr - (j4 + j5);
                int[] iArr3 = iArr;
                long jXorRotr4 = ThreefishEngine.xorRotr(j9, 32, j6);
                long j10 = j6 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr4, 58, j8);
                long j11 = j8 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr3, 22, j10);
                long j12 = j10 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr6, 46, j11);
                long j13 = j11 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr5, 12, j12);
                long j14 = j12 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr8, 25, j13);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr7, 33, j14);
                long j15 = (j13 - jXorRotr9) - jArr3[i2];
                long j16 = jArr3[i4];
                long j17 = jArr4[i3];
                long j18 = (j14 - jXorRotr10) - (jArr3[i5] + jArr4[i6]);
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr10 - (jArr3[i7] + j7), 5, j15);
                long j19 = j15 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr9 - (j16 + j17), 37, j18);
                long j20 = j18 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr12, 23, j19);
                long j21 = j19 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr11, 40, j20);
                long j22 = j20 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr14, 52, j21);
                long j23 = j21 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr13, 57, j22);
                long j24 = j22 - jXorRotr16;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr16, 14, j23);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr15, 16, j24);
                j2 = j24 - jXorRotr2;
                i -= 2;
                j = j23 - jXorRotr;
                iArr = iArr3;
                iArr2 = iArr2;
                z = false;
            }
            boolean z2 = z;
            long j25 = jArr3[z2 ? 1 : 0];
            long j26 = jArr3[1];
            long j27 = jArr4[z2 ? 1 : 0];
            long j28 = jArr3[2];
            long j29 = jArr4[1];
            long j30 = jArr3[3];
            jArr2[z2 ? 1 : 0] = j - j25;
            jArr2[1] = jXorRotr - (j26 + j27);
            jArr2[2] = j2 - (j28 + j29);
            jArr2[3] = jXorRotr2 - j30;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = j + jArr3[0];
            long j6 = j2 + jArr3[1] + jArr4[0];
            long j7 = j3 + jArr3[2] + jArr4[1];
            int i = 1;
            long j8 = j4 + jArr3[3];
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j9 = j5 + j6;
                long jRotlXor = ThreefishEngine.rotlXor(j6, 14, j9);
                long j10 = j7 + j8;
                long jRotlXor2 = ThreefishEngine.rotlXor(j8, 16, j10);
                long j11 = j9 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, 52, j11);
                long j12 = j10 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j12);
                long j13 = j11 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j13);
                long j14 = j12 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j14);
                long j15 = j13 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j15);
                long j16 = j14 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, 37, j16);
                long j17 = jArr3[i2];
                int i4 = i2 + 1;
                long j18 = jRotlXor8 + jArr3[i4] + jArr4[i3];
                int i5 = i2 + 2;
                long j19 = jArr3[i5];
                int i6 = i3 + 1;
                long j20 = jArr4[i6];
                int i7 = i2 + 3;
                int[] iArr3 = iArr;
                long j21 = i;
                long j22 = jRotlXor7 + jArr3[i7] + j21;
                long j23 = j15 + j17 + j18;
                long jRotlXor9 = ThreefishEngine.rotlXor(j18, 25, j23);
                long j24 = j16 + j19 + j20 + j22;
                long jRotlXor10 = ThreefishEngine.rotlXor(j22, 33, j24);
                long j25 = j23 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, 46, j25);
                long j26 = j24 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j26);
                long j27 = j25 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, 58, j27);
                long j28 = j26 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j28);
                long j29 = j27 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j29);
                long j30 = j28 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j30);
                long j31 = jArr3[i4];
                long j32 = jArr3[i5];
                long j33 = jArr4[i6];
                j7 = j30 + jArr3[i7] + jArr4[i3 + 2];
                j8 = jRotlXor15 + jArr3[i2 + 4] + j21 + 1;
                i += 2;
                j6 = jRotlXor16 + j32 + j33;
                j5 = j29 + j31;
                iArr = iArr3;
                iArr2 = iArr2;
            }
            jArr2[0] = j5;
            jArr2[1] = j6;
            jArr2[2] = j7;
            jArr2[3] = j8;
        }
    }

    static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        protected Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            boolean z = false;
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long jXorRotr = jArr[5];
            long j6 = jArr[6];
            long jXorRotr2 = jArr[7];
            int i = 17;
            while (i > 0) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                int i4 = i2 + 1;
                long j7 = j - jArr3[i4];
                int i5 = i2 + 2;
                long j8 = jArr3[i5];
                int i6 = i2 + 3;
                long j9 = j3 - jArr3[i6];
                int i7 = i2 + 4;
                long j10 = jArr3[i7];
                int i8 = i2 + 5;
                long j11 = j5 - jArr3[i8];
                int i9 = i2 + 6;
                long j12 = jArr3[i9];
                int i10 = i3 + 1;
                long j13 = jArr4[i10];
                int i11 = i2 + 7;
                long j14 = j6 - (jArr3[i11] + jArr4[i3 + 2]);
                long j15 = jArr3[i2 + 8];
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j16 = i;
                long jXorRotr3 = ThreefishEngine.xorRotr(j2 - j8, 8, j14);
                long j17 = j14 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr2 - ((j15 + j16) + 1), 35, j7);
                long j18 = j7 - jXorRotr4;
                long[] jArr5 = jArr3;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr - (j12 + j13), 56, j9);
                long j19 = j9 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j4 - j10, 22, j11);
                long j20 = j11 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr3, 25, j20);
                long j21 = j20 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr6, 29, j17);
                long j22 = j17 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr5, 39, j18);
                long j23 = j18 - jXorRotr9;
                int i12 = i;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr4, 43, j19);
                long j24 = j19 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 13, j24);
                long j25 = j24 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr10, 50, j21);
                long j26 = j21 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr9, 10, j22);
                long j27 = j22 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr8, 17, j23);
                long j28 = j23 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr11, 39, j28);
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr14, 30, j25);
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr13, 34, j26);
                long[] jArr6 = jArr4;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr12, 24, j27);
                long j29 = (j28 - jXorRotr15) - jArr5[i2];
                long j30 = jArr5[i4];
                long j31 = (j25 - jXorRotr16) - jArr5[i5];
                long j32 = jArr5[i6];
                long j33 = (j26 - jXorRotr17) - jArr5[i7];
                long j34 = jArr5[i8];
                long j35 = jArr6[i3];
                long j36 = (j27 - jXorRotr18) - (jArr5[i9] + jArr6[i10]);
                long j37 = jArr5[i11];
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15 - j30, 44, j36);
                long j38 = j36 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr18 - (j37 + j16), 9, j29);
                long j39 = j29 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr17 - (j34 + j35), 54, j31);
                long j40 = j31 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr16 - j32, 56, j33);
                long j41 = j33 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr19, 17, j41);
                long j42 = j41 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr22, 49, j38);
                long j43 = j38 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr21, 36, j39);
                long j44 = j39 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr20, 39, j40);
                long j45 = j40 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 33, j45);
                long j46 = j45 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr26, 27, j42);
                long j47 = j42 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr25, 14, j43);
                long j48 = j43 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr24, 42, j44);
                long j49 = j44 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr27, 46, j49);
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr30, 36, j46);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr29, 19, j47);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr28, 37, j48);
                j6 = j48 - jXorRotr2;
                long j50 = j46 - jXorRotr32;
                i = i12 - 2;
                j = j49 - jXorRotr31;
                long j51 = j47 - jXorRotr;
                j3 = j50;
                j4 = jXorRotr32;
                j2 = jXorRotr31;
                jArr4 = jArr6;
                iArr = iArr3;
                iArr2 = iArr4;
                z = false;
                j5 = j51;
                jArr3 = jArr5;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            boolean z2 = z;
            long j52 = jArr7[z2 ? 1 : 0];
            long j53 = jArr7[1];
            long j54 = jArr7[2];
            long j55 = jArr7[3];
            long j56 = jArr7[4];
            long j57 = jArr7[5];
            long j58 = jArr8[z2 ? 1 : 0];
            long j59 = jArr7[6];
            long j60 = jArr8[1];
            long j61 = jArr7[7];
            jArr2[z2 ? 1 : 0] = j - j52;
            jArr2[1] = j2 - j53;
            jArr2[2] = j3 - j54;
            jArr2[3] = j4 - j55;
            jArr2[4] = j5 - j56;
            jArr2[5] = jXorRotr - (j57 + j58);
            jArr2[6] = j6 - (j59 + j60);
            jArr2[7] = jXorRotr2 - j61;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr3[0];
            long j10 = j2 + jArr3[1];
            long j11 = jArr3[2];
            long j12 = jArr3[3];
            long j13 = jArr3[4];
            long j14 = jArr3[5];
            long j15 = jArr4[0];
            long j16 = j + j9;
            long j17 = j7 + jArr3[6] + jArr4[1];
            long j18 = j3 + j11;
            long j19 = j5 + j13;
            int i = 1;
            long j20 = j4 + j12;
            long j21 = j6 + j14 + j15;
            long j22 = j8 + jArr3[7];
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j23 = j16 + j10;
                long jRotlXor = ThreefishEngine.rotlXor(j10, 46, j23);
                long j24 = j18 + j20;
                long jRotlXor2 = ThreefishEngine.rotlXor(j20, 36, j24);
                long j25 = j21;
                int[] iArr3 = iArr;
                long j26 = j19 + j25;
                long jRotlXor3 = ThreefishEngine.rotlXor(j25, 19, j26);
                long[] jArr5 = jArr3;
                long j27 = j22;
                long j28 = j17 + j27;
                long jRotlXor4 = ThreefishEngine.rotlXor(j27, 37, j28);
                int i4 = i;
                long j29 = j24 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j29);
                long j30 = j26 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j30);
                long j31 = j28 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j31);
                long j32 = j23 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, 42, j32);
                long j33 = j30 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j33);
                long j34 = j31 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, 49, j34);
                long j35 = j32 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j35);
                long j36 = j29 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j36);
                long j37 = j34 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, 44, j37);
                long j38 = j35 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j38);
                long j39 = j36 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, 54, j39);
                long j40 = j33 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j40);
                long j41 = jArr5[i2];
                int i5 = i2 + 1;
                long j42 = jRotlXor13 + jArr5[i5];
                int i6 = i2 + 2;
                long j43 = jArr5[i6];
                int i7 = i2 + 3;
                long j44 = jRotlXor16 + jArr5[i7];
                int i8 = i2 + 4;
                long j45 = jArr5[i8];
                int i9 = i2 + 5;
                long j46 = jRotlXor15 + jArr5[i9] + jArr4[i3];
                int i10 = i2 + 6;
                long j47 = jArr5[i10];
                int i11 = i3 + 1;
                long j48 = jArr4[i11];
                int i12 = i2 + 7;
                long j49 = i4;
                long j50 = jRotlXor14 + jArr5[i12] + j49;
                long j51 = j38 + j41 + j42;
                long jRotlXor17 = ThreefishEngine.rotlXor(j42, 39, j51);
                long j52 = j39 + j43 + j44;
                long jRotlXor18 = ThreefishEngine.rotlXor(j44, 30, j52);
                long j53 = j40 + j45 + j46;
                long jRotlXor19 = ThreefishEngine.rotlXor(j46, 34, j53);
                long j54 = j37 + j47 + j48 + j50;
                long jRotlXor20 = ThreefishEngine.rotlXor(j50, 24, j54);
                long j55 = j52 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j55);
                long j56 = j53 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j56);
                long j57 = j54 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j57);
                long j58 = j51 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j58);
                long j59 = j56 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j59);
                long j60 = j57 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j60);
                long j61 = j58 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j61);
                long j62 = j55 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, 43, j62);
                long j63 = j60 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j63);
                long j64 = j61 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j64);
                long j65 = j62 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j65);
                long j66 = j59 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j66);
                long j67 = jArr5[i5];
                long j68 = jArr5[i6];
                long j69 = jArr5[i7];
                long j70 = jArr5[i8];
                long j71 = jArr5[i9];
                long j72 = jArr5[i10];
                long j73 = jArr4[i11];
                long j74 = j63 + jArr5[i12] + jArr4[i3 + 2];
                long j75 = j66 + j71;
                j10 = jRotlXor29 + j68;
                j21 = jRotlXor31 + j72 + j73;
                j22 = jArr5[i2 + 8] + j49 + 1 + jRotlXor30;
                j19 = j75;
                j17 = j74;
                j18 = j65 + j69;
                j16 = j64 + j67;
                i = i4 + 2;
                iArr2 = iArr2;
                iArr = iArr3;
                j20 = jRotlXor32 + j70;
                jArr3 = jArr5;
            }
            jArr2[0] = j16;
            jArr2[1] = j10;
            jArr2[2] = j18;
            jArr2[3] = j20;
            jArr2[4] = j19;
            jArr2[5] = j21;
            jArr2[6] = j17;
            jArr2[7] = j22;
        }
    }

    static abstract class ThreefishCipher {
        protected final long[] kw;
        protected final long[] t;

        protected ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.t = jArr2;
        }

        abstract void decryptBlock(long[] jArr, long[] jArr2);

        abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int i = 0;
        while (true) {
            int[] iArr = MOD9;
            if (i >= iArr.length) {
                return;
            }
            MOD17[i] = i % 17;
            iArr[i] = i % 9;
            MOD5[i] = i % 5;
            MOD3[i] = i % 3;
            i++;
        }
    }

    public ThreefishEngine(int i) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.t = jArr;
        int i2 = i / 8;
        this.blocksizeBytes = i2;
        int i3 = i2 / 8;
        this.blocksizeWords = i3;
        this.currentBlock = new long[i3];
        long[] jArr2 = new long[(i3 << 1) + 1];
        this.kw = jArr2;
        if (i == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static long rotlXor(long j, int i, long j2) {
        return ((j << i) | (j >>> (-i))) ^ j2;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeWords + " words)");
        }
        long j = C_240;
        int i = 0;
        while (true) {
            int i2 = this.blocksizeWords;
            if (i >= i2) {
                long[] jArr2 = this.kw;
                jArr2[i2] = j;
                System.arraycopy(jArr2, 0, jArr2, i2 + 1, i2);
                return;
            } else {
                long[] jArr3 = this.kw;
                long j2 = jArr[i];
                jArr3[i] = j2;
                j ^= j2;
                i++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.t;
        long j = jArr[0];
        jArr2[0] = j;
        long j2 = jArr[1];
        jArr2[1] = j2;
        jArr2[2] = j ^ j2;
        jArr2[3] = j;
        jArr2[4] = j2;
    }

    public static void wordToBytes(long j, byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    static long xorRotr(long j, int i, long j2) {
        long j3 = j ^ j2;
        return (j3 >>> i) | (j3 << (-i));
    }

    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes << 3);
    }

    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + cipherParameters.getClass().getName());
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeBytes + " bytes)");
            }
            int i = this.blocksizeWords;
            jArr = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = bytesToWord(key, i2 << 3);
            }
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{bytesToWord(tweak, 0), bytesToWord(tweak, 8)};
        }
        init(z, jArr, jArr2);
    }

    public void init(boolean z, long[] jArr, long[] jArr2) {
        this.forEncryption = z;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.blocksizeBytes;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.blocksizeBytes; i5 += 8) {
            this.currentBlock[i5 >> 3] = bytesToWord(bArr, i + i5);
        }
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        while (true) {
            int i6 = this.blocksizeBytes;
            if (i4 >= i6) {
                return i6;
            }
            wordToBytes(this.currentBlock[i4 >> 3], bArr2, i2 + i4);
            i4 += 8;
        }
    }

    public int processBlock(long[] jArr, long[] jArr2) throws IllegalStateException, DataLengthException {
        long[] jArr3 = this.kw;
        int i = this.blocksizeWords;
        if (jArr3[i] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    public void reset() {
    }
}
