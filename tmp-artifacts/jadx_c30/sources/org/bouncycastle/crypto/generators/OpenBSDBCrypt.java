package org.bouncycastle.crypto.generators;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class OpenBSDBCrypt {
    private static final Set<String> allowedVersions;
    private static final byte[] decodingTable;
    private static final String defaultVersion = "2y";
    private static final byte[] encodingTable;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {64, -61, 76, -90};
    private static final int $$b = Primes.SMALL_FACTOR_LIMIT;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4 = i2 + 4;
        int i5 = i + 109;
        byte[] bArr = $$a;
        int i6 = s * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            i5 = i6;
            int i7 = i4;
            int i8 = 0;
            i5 += -i4;
            i4 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            int i9 = i4 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            int i10 = i3 + 1;
            i7 = i9;
            i4 = bArr[i9];
            i8 = i10;
            i5 += -i4;
            i4 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            int i92 = i4 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            int i922 = i4 + 1;
            if (i3 == i6) {
            }
        }
    }

    static {
        onExtraCallback = 0;
        onExtraCallback();
        encodingTable = new byte[]{46, 47, 65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57};
        decodingTable = new byte[128];
        HashSet hashSet = new HashSet();
        allowedVersions = hashSet;
        Object[] objArr = new Object[1];
        a((char) (14972 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) - 1293846870, new char[]{1601}, new char[]{0, 0, 0, 0}, new char[]{43703, 57718, 31666, 38970}, objArr);
        hashSet.add(((String) objArr[0]).intern());
        hashSet.add("2x");
        hashSet.add("2a");
        hashSet.add(defaultVersion);
        hashSet.add("2b");
        int i = 0;
        while (true) {
            byte[] bArr = decodingTable;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = -1;
            i++;
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr2 = encodingTable;
            if (i5 >= bArr2.length) {
                break;
            }
            decodingTable[bArr2[i5]] = (byte) i5;
            i5++;
            int i6 = 2 % 2;
        }
        int i7 = IAuthTabCallback + 95;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 57 / 0;
        }
    }

    private OpenBSDBCrypt() {
    }

    public static boolean checkPassword(String str, byte[] bArr) throws NumberFormatException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (bArr == null) {
            throw new IllegalArgumentException("Missing password.");
        }
        int i5 = i2 + 49;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArrClone = Arrays.clone(bArr);
        if (i6 == 0) {
            return doCheckPassword(str, bArrClone);
        }
        boolean zDoCheckPassword = doCheckPassword(str, bArrClone);
        int i7 = 64 / 0;
        return zDoCheckPassword;
    }

    public static boolean checkPassword(String str, char[] cArr) throws NumberFormatException {
        int i = 2 % 2;
        if (cArr == null) {
            throw new IllegalArgumentException("Missing password.");
        }
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        if (i3 == 0) {
            doCheckPassword(str, uTF8ByteArray);
            throw null;
        }
        boolean zDoCheckPassword = doCheckPassword(str, uTF8ByteArray);
        int i4 = asInterface + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return zDoCheckPassword;
    }

    private static String createBcryptString(String str, byte[] bArr, byte[] bArr2, int i) throws Throwable {
        String string;
        int i2 = 2 % 2;
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append('$');
        sb.append(str);
        sb.append('$');
        if (i < 10) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getTapTimeout() >> 16) + 14972), 211662505 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{42591}, new char[]{0, 0, 0, 0}, new char[]{43201, 40374, 31756, 20026}, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(i);
            string = sb2.toString();
        } else {
            string = Integer.toString(i);
            int i3 = IAuthTabCallbackStub + 83;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        sb.append(string);
        sb.append('$');
        encodeData(sb, bArr2);
        encodeData(sb, BCrypt.generate(bArr, bArr2, i));
        String string2 = sb.toString();
        int i5 = IAuthTabCallbackStub + 79;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return string2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] decodeSaltString(String str) {
        int i = 2 % 2;
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length != 22) {
            throw new DataLengthException("Invalid base64 salt length: " + charArray.length + " , 22 required.");
        }
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        for (char c : charArray) {
            if (c <= 'z' && c >= '.') {
                int i4 = asInterface + 105;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    if (c <= 'E') {
                        continue;
                    } else if (c >= 'A') {
                    }
                } else {
                    if (c <= '9') {
                        continue;
                    }
                }
            }
            throw new IllegalArgumentException("Salt string contains invalid character: " + ((int) c));
        }
        char[] cArr = new char[24];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        for (int i5 = 0; i5 < 24; i5 += 4) {
            byte[] bArr = decodingTable;
            byte b = bArr[cArr[i5]];
            byte b2 = bArr[cArr[i5 + 1]];
            byte b3 = bArr[cArr[i5 + 2]];
            byte b4 = bArr[cArr[i5 + 3]];
            byteArrayOutputStream.write((b << 2) | (b2 >> 4));
            byteArrayOutputStream.write((b2 << 4) | (b3 >> 2));
            byteArrayOutputStream.write(b4 | (b3 << 6));
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr2, 0, 16);
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r10.charAt(6) == '$') goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean doCheckPassword(String str, byte[] bArr) throws NumberFormatException {
        String strSubstring;
        int i = 2 % 2;
        if (str == null) {
            throw new IllegalArgumentException("Missing bcryptString.");
        }
        int i2 = IAuthTabCallbackStub + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (str.charAt(1) != '2') {
            throw new IllegalArgumentException("not a Bcrypt string");
        }
        int length = str.length();
        if (length != 60) {
            int i4 = IAuthTabCallbackStub + 87;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (length != 59 || str.charAt(2) != '$') {
                throw new DataLengthException("Bcrypt String length: " + length + ", 60 required.");
            }
        }
        int i6 = 3;
        if (str.charAt(2) != '$') {
            if (str.charAt(0) == '$') {
                int i7 = asInterface + 105;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0 ? str.charAt(3) == '$' : str.charAt(2) == '\\') {
                }
            }
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
        if (str.charAt(0) != '$' || str.charAt(5) != '$') {
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
        if (str.charAt(2) == '$') {
            int i8 = asInterface + 7;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            strSubstring = str.substring(1, 2);
        } else {
            strSubstring = str.substring(1, 3);
            i6 = 4;
        }
        if (!allowedVersions.contains(strSubstring)) {
            throw new IllegalArgumentException("Bcrypt version '" + strSubstring + "' is not supported by this implementation");
        }
        String strSubstring2 = str.substring(i6, i6 + 2);
        try {
            int i10 = Integer.parseInt(strSubstring2);
            if (i10 >= 4) {
                int i11 = IAuthTabCallbackStub;
                int i12 = i11 + 47;
                asInterface = i12 % 128;
                if (i12 % 2 == 0 ? i10 <= 31 : i10 <= 114) {
                    int i13 = i11 + 57;
                    asInterface = i13 % 128;
                    int i14 = i13 % 2;
                    return Strings.constantTimeAreEqual(str, doGenerate(strSubstring, bArr, decodeSaltString(str.substring(str.lastIndexOf(36) + 1, length - 31)), i10));
                }
            }
            throw new IllegalArgumentException("Invalid cost factor: " + i10 + ", 4 < cost < 31 expected.");
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("Invalid cost factor: " + strSubstring2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r2 = r1 + 115;
        org.bouncycastle.crypto.generators.OpenBSDBCrypt.IAuthTabCallbackStub = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r2 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r8.length != 81) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r8.length != 16) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r2 = r1 + 53;
        org.bouncycastle.crypto.generators.OpenBSDBCrypt.IAuthTabCallbackStub = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if ((r2 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r9 < 5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r9 < 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r9 > 31) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        r5 = 72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r7.length >= 72) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        r5 = r7.length + 1;
        r1 = r1 + 79;
        org.bouncycastle.crypto.generators.OpenBSDBCrypt.IAuthTabCallbackStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if ((r1 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r1 = 2 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r1 = new byte[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r5 <= r7.length) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r2 = org.bouncycastle.crypto.generators.OpenBSDBCrypt.IAuthTabCallbackStub + 27;
        org.bouncycastle.crypto.generators.OpenBSDBCrypt.asInterface = r2 % 128;
        r2 = r2 % 2;
        r5 = r7.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        java.lang.System.arraycopy(r7, 0, r1, 0, r5);
        org.bouncycastle.util.Arrays.fill(r7, (byte) 0);
        r6 = createBcryptString(r6, r1, r8, r9);
        org.bouncycastle.util.Arrays.fill(r1, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid cost factor.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        throw new org.bouncycastle.crypto.DataLengthException("16 byte salt required: " + r8.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        throw new java.lang.IllegalArgumentException("Salt required.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r8 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String doGenerate(String str, byte[] bArr, byte[] bArr2, int i) throws Throwable {
        int i2 = 2 % 2;
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        }
        int i3 = asInterface;
        int i4 = i3 + 5;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
    }

    private static void encodeData(StringBuilder sb, byte[] bArr) {
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new DataLengthException("Invalid length: " + bArr.length + ", 24 for key or 16 for salt expected");
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z = false;
        }
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int i5 = asInterface + 59;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = bArr[i4] & 255;
            int i8 = bArr[i4 + 1] & 255;
            byte b = bArr[i4 + 2];
            byte[] bArr3 = encodingTable;
            sb.append((char) bArr3[(i7 >>> 2) & 63]);
            sb.append((char) bArr3[((i7 << 4) | (i8 >>> 4)) & 63]);
            sb.append((char) bArr3[((i8 << 2) | ((b & 255) >>> 6)) & 63]);
            sb.append((char) bArr3[b & 63]);
        }
        int length2 = sb.length();
        sb.setLength(z ? length2 - 2 : length2 - 1);
    }

    public static String generate(String str, byte[] bArr, byte[] bArr2, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 3;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Password required.");
        }
        String strDoGenerate = doGenerate(str, Arrays.clone(bArr), bArr2, i);
        int i4 = IAuthTabCallbackStub + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strDoGenerate;
    }

    public static String generate(String str, char[] cArr, byte[] bArr, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if (cArr == null) {
            throw new IllegalArgumentException("Password required.");
        }
        int i6 = i3 + 23;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        if (i7 != 0) {
            return doGenerate(str, uTF8ByteArray, bArr, i);
        }
        doGenerate(str, uTF8ByteArray, bArr, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String generate(byte[] bArr, byte[] bArr2, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 111;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String strGenerate = generate(defaultVersion, bArr, bArr2, i);
        int i5 = asInterface + 91;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return strGenerate;
    }

    public static String generate(char[] cArr, byte[] bArr, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String strGenerate = generate(defaultVersion, cArr, bArr, i);
        int i5 = IAuthTabCallbackStub + 19;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return strGenerate;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1));
                    int iMyTid = (Process.myTid() >> 22) + 43;
                    int edgeSlop = 1451 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b = (byte) ($$b & 5);
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iMyTid, edgeSlop, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(i4, i4) + 49123), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, 1494 - (ViewConfiguration.getTouchSlop() >> 8), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23972), 50 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 45848), 29 - View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 43;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onWarmupCompleted = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        onNavigationEvent = (char) 6804;
    }
}
