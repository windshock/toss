package org.bouncycastle.crypto.generators;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import net.sf.scuba.smartcards.ISO7816;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, CertificateBody.profileType, 131, 137, 139, 149, ISO7816.TAG_SM_EXPECTED_LENGTH, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, HttpStatusCodesKt.HTTP_TEMP_REDIRECT, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i2]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i, i2, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i);
        return bigIntegerCreateRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i) {
        int iNextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((i * (secureRandom.nextInt() & Integer.MAX_VALUE)) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i2 = iNextInt % i;
        } while ((iNextInt - i2) + (i - 1) < 0);
        return i2;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        int i;
        SecureRandom secureRandom;
        int i2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigIntegerGeneratePrime2;
        BigInteger bigInteger3;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigInteger6;
        BigInteger bigIntegerMod;
        BigInteger bigInteger7;
        BigInteger bigInteger8;
        int i3;
        PrintStream printStream;
        StringBuilder sb;
        String str;
        PrintStream printStream2;
        StringBuilder sb2;
        String str2;
        long j2;
        BigInteger bigIntegerCreateRandomPrime;
        int i4;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply = ONE;
        BigInteger bigIntegerMultiply2 = bigIntegerMultiply;
        for (int i5 = 0; i5 < vectorPermuteList.size() / 2; i5++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(i5));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply = bigIntegerMultiply.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2.multiply(bigIntegerMultiply);
        int iBitLength = (((strength - bigIntegerMultiply3.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply2).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply).shiftLeft(1);
        long j3 = 0;
        while (true) {
            j = j3 + 1;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply4 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    bigInteger = bigIntegerShiftLeft2;
                    bigInteger3 = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply4.add(bigInteger3);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    bigIntegerShiftLeft2 = bigInteger;
                }
                bigInteger2 = bigIntegerShiftLeft;
                if (bigIntegerMultiply3.gcd(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2)).equals(bigInteger3)) {
                    if (bigIntegerAdd.multiply(bigIntegerAdd2).bitLength() >= strength) {
                        break;
                    }
                    if (zIsDebug) {
                        System.out.println("key size too small. Should be " + strength + " but is actually " + bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                    }
                }
                i = strength;
                secureRandom = random;
                i2 = certainty;
            } else {
                i = strength;
                secureRandom = random;
                i2 = certainty;
                bigInteger = bigIntegerShiftLeft2;
                bigInteger2 = bigIntegerShiftLeft;
            }
            bigIntegerGeneratePrime3 = bigIntegerGeneratePrime3;
            bigIntegerGeneratePrime4 = bigIntegerGeneratePrime4;
            j3 = j;
            bigIntegerShiftLeft2 = bigInteger;
            bigIntegerShiftLeft = bigInteger2;
            certainty = i2;
            strength = i;
            random = secureRandom;
        }
        BigInteger bigInteger9 = bigIntegerGeneratePrime4;
        if (zIsDebug) {
            bigInteger4 = bigIntegerGeneratePrime3;
            System.out.println("needed " + j + " tries to generate p and q.");
        } else {
            bigInteger4 = bigIntegerGeneratePrime3;
        }
        BigInteger bigIntegerMultiply5 = bigIntegerAdd.multiply(bigIntegerAdd2);
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger3).multiply(bigIntegerAdd2.subtract(bigInteger3));
        if (zIsDebug) {
            System.out.println("generating g");
        }
        long j4 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger5 = bigIntegerAdd;
            bigInteger6 = bigIntegerAdd2;
            int i6 = 0;
            while (i6 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i6));
                while (true) {
                    j2 = j4 + 1;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    i4 = strength;
                    if (!bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply5).equals(ONE)) {
                        break;
                    }
                    j4 = j2;
                    strength = i4;
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i6++;
                j4 = j2;
                strength = i4;
            }
            int i7 = strength;
            bigIntegerMod = ONE;
            int i8 = 0;
            while (i8 < vectorPermuteList.size()) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i8)).modPow(bigIntegerMultiply3.divide((BigInteger) vectorPermuteList.elementAt(i8)), bigIntegerMultiply5)).mod(bigIntegerMultiply5);
                i8++;
                random = random;
            }
            SecureRandom secureRandom2 = random;
            int i9 = 0;
            while (true) {
                if (i9 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply5);
                    BigInteger bigInteger10 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger10)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply5).equals(bigInteger10)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply5).equals(bigInteger10)) {
                                bigInteger7 = bigInteger4;
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger7), bigIntegerMultiply5).equals(bigInteger10)) {
                                    bigInteger8 = bigInteger9;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger8), bigIntegerMultiply5).equals(bigInteger10)) {
                                        break;
                                    }
                                    if (zIsDebug) {
                                        PrintStream printStream3 = System.out;
                                        StringBuilder sb3 = new StringBuilder();
                                        i3 = certainty;
                                        sb3.append("g has order phi(n)/b\n g: ");
                                        sb3.append(bigIntegerMod);
                                        printStream3.println(sb3.toString());
                                    }
                                } else if (zIsDebug) {
                                    printStream = System.out;
                                    sb = new StringBuilder();
                                    str = "g has order phi(n)/a\n g: ";
                                    sb.append(str);
                                    sb.append(bigIntegerMod);
                                    printStream.println(sb.toString());
                                }
                            } else if (zIsDebug) {
                                printStream2 = System.out;
                                sb2 = new StringBuilder();
                                str2 = "g has order phi(n)/q'\n g: ";
                                str = str2;
                                sb = sb2;
                                printStream = printStream2;
                                bigInteger7 = bigInteger4;
                                sb.append(str);
                                sb.append(bigIntegerMod);
                                printStream.println(sb.toString());
                            }
                        } else if (zIsDebug) {
                            printStream2 = System.out;
                            sb2 = new StringBuilder();
                            str2 = "g has order phi(n)/p'\n g: ";
                            str = str2;
                            sb = sb2;
                            printStream = printStream2;
                            bigInteger7 = bigInteger4;
                            sb.append(str);
                            sb.append(bigIntegerMod);
                            printStream.println(sb.toString());
                        }
                    } else if (zIsDebug) {
                        printStream2 = System.out;
                        sb2 = new StringBuilder();
                        str2 = "g has order phi(n)/4\n g:";
                        str = str2;
                        sb = sb2;
                        printStream = printStream2;
                        bigInteger7 = bigInteger4;
                        sb.append(str);
                        sb.append(bigIntegerMod);
                        printStream.println(sb.toString());
                    }
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i9)), bigIntegerMultiply5).equals(ONE)) {
                    i9++;
                } else if (zIsDebug) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i9) + "\n g: " + bigIntegerMod);
                }
            }
            bigInteger7 = bigInteger4;
            bigInteger8 = bigInteger9;
            i3 = certainty;
            bigInteger4 = bigInteger7;
            certainty = i3;
            bigIntegerAdd = bigInteger5;
            strength = i7;
            random = secureRandom2;
            bigInteger9 = bigInteger8;
            bigIntegerAdd2 = bigInteger6;
        }
        if (zIsDebug) {
            System.out.println("needed " + j4 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply3 + " (" + bigIntegerMultiply3.bitLength() + " bits)");
            PrintStream printStream4 = System.out;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("a:.......... ");
            sb4.append(bigInteger7);
            printStream4.println(sb4.toString());
            System.out.println("b:.......... " + bigInteger8);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigInteger5);
            System.out.println("q:.......... " + bigInteger6);
            System.out.println("n:.......... " + bigIntegerMultiply5);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair(new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength()), new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
    }
}
