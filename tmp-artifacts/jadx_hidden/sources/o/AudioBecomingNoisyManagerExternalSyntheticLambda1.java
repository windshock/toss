package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class AudioBecomingNoisyManagerExternalSyntheticLambda1 {
    public static BigInteger IAuthTabCallback = null;
    private static BigInteger IAuthTabCallbackDefault = null;
    private static BigInteger IAuthTabCallbackStub = null;
    private static final String[] IAuthTabCallbackStubProxy;
    private static Set<BigInteger> IAuthTabCallback_Parcel = null;
    private static char[] ICustomTabsCallback = null;
    private static BigInteger access000 = null;
    private static long access100 = 0;
    private static BigInteger asBinder = null;
    private static BigInteger asInterface = null;
    private static long extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static BigInteger getInterfaceDescriptor = null;
    private static int onActivityLayout = 0;
    private static int onActivityResized = 1;
    private static BigInteger onExtraCallback = null;
    private static BigInteger onExtraCallbackWithResult = null;
    private static int onMessageChannelReady = 1;
    private static int onMinimized = 0;
    private static BigInteger onNavigationEvent = null;
    private static int onPostMessage = 1;
    private static BigInteger onTransact;
    public static BigInteger onWarmupCompleted;
    private static int readTypedObject;
    private static char writeTypedObject;

    static {
        IAuthTabCallback();
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        onExtraCallbackWithResult(new int[]{4, 32, 165, 6}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr);
        onExtraCallbackWithResult = new BigInteger((String) objArr[0], 16);
        Object[] objArr2 = new Object[1];
        onExtraCallback("쫮ઽ朹ﱕ漎ꐫ܌\u03a2椶ಽㄅ\ue53b큵桶\ue545\uf11aᤜ\ude72쳦呩쀴녣幎\ue8a2聴\uf288⫦Ɇ끤닠넡ꈛ", (char) (6623 - MotionEvent.axisFromString("")), "짥䥽\ue0e6礙", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, "\u0000\u0000\u0000\u0000", objArr2);
        onExtraCallback = new BigInteger((String) objArr2[0], 16);
        Object[] objArr3 = new Object[1];
        onExtraCallbackWithResult(new int[]{36, 32, 0, 23}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001", true, objArr3);
        onNavigationEvent = new BigInteger((String) objArr3[0], 16);
        Object[] objArr4 = new Object[1];
        onExtraCallback("븼ཞ悖䊋ῡ쏠\udd53垡缕草ጚႯ༬⅛ㅆ検䜗ꫩ踜ᒯ戴\uf1ff莹\u0b8cﶓ뻋薒菩︍톈鱧\ue4bb", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 59122), "쌶ᢺ\uf3d6雦", Process.myPid() >> 22, "\u0000\u0000\u0000\u0000", objArr4);
        IAuthTabCallbackDefault = new BigInteger((String) objArr4[0], 16);
        Object[] objArr5 = new Object[1];
        onExtraCallback("哦眂㙫㸙僷\uee14ɹ⠡池纓\uef18\ue7c2\ue468뉦⺣\u0ee7ꇫ촘푨掊ꞬԿ䰲뜳歷汧己₆㛜唏館않", (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 63183), "壄㖬콱럶", Color.alpha(0), "\u0000\u0000\u0000\u0000", objArr5);
        IAuthTabCallbackStub = new BigInteger((String) objArr5[0], 16);
        Object[] objArr6 = new Object[1];
        onExtraCallback("\ueffd憮Ậߟභ쭡灛ꙸ敖筞\uf184̒\uddf9楼쎻\ue9ea擸㭑䐥ჩ쉜㎥Ǧ쉲䰙뮎㸯⽚坹튱髱斤", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 1770), "͗빵\ueafc茆", View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", objArr6);
        asBinder = new BigInteger((String) objArr6[0], 16);
        Object[] objArr7 = new Object[1];
        onExtraCallback("暻鐕æ\uf1e5躥륽ヺ춏擁\uf40e揆흃枎᧠銂턦뵩ͨ둊踣\uf26a췘퀪➯\ud993\ue088\ued71鎾혷嵩ᢨㇳ", (char) (21099 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "˽쌯檒걒", KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000", objArr7);
        onTransact = new BigInteger((String) objArr7[0], 16);
        Object[] objArr8 = new Object[1];
        onExtraCallback("랚飔⧮ꞥ렆ẜ葤뽅㦽痔퉥泄䝀镳茥팼Ồ𥳐꿤괊뾂汍쓵韀㡇\uf005Ხ嵿\u0e74\udec6ㄿ\u10cb", (char) (View.MeasureSpec.getSize(0) + 27737), "袶旳奷陬", (-1) - TextUtils.lastIndexOf("", '0', 0), "\u0000\u0000\u0000\u0000", objArr8);
        asInterface = new BigInteger((String) objArr8[0], 16);
        Object[] objArr9 = new Object[1];
        onExtraCallback("늲廮፦鐪求읧∄糡窨㕶ᖆᨐ郭샦섮챫\uf8c4⻙㻤闩⾭\u2d7c햸㢤壃筯嶇҂補椥頏蓙", (char) (21564 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\ude62牙㰼\ude54", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, "\u0000\u0000\u0000\u0000", objArr9);
        access000 = new BigInteger((String) objArr9[0], 16);
        Object[] objArr10 = new Object[1];
        onExtraCallbackWithResult(new int[]{68, 32, 161, 7}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000", true, objArr10);
        getInterfaceDescriptor = new BigInteger((String) objArr10[0], 16);
        Object[] objArr11 = new Object[1];
        onExtraCallback("璃ꨱꇖ㕿\ue5efᆛ쪙ᄶ溢̼\uebf2屲鈱\uea1d讔\ude35⚐鬞䁶议㶽䚯鱕豖\ud8c8ꏎ廃⡬仾\uebba퐂맿", (char) (48559 - ExpandableListView.getPackedPositionType(0L)), "蒥蹏꽼喽", ViewConfiguration.getWindowTouchSlop() >> 8, "\u0000\u0000\u0000\u0000", objArr11);
        IAuthTabCallback = new BigInteger((String) objArr11[0], 16);
        Object[] objArr12 = new Object[1];
        onExtraCallbackWithResult(new int[]{100, 32, 0, 22}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001", false, objArr12);
        onWarmupCompleted = new BigInteger((String) objArr12[0], 16);
        Object[] objArr13 = new Object[1];
        onExtraCallbackWithResult(new int[]{132, 13, 88, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, objArr13);
        String str = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        onExtraCallbackWithResult(new int[]{145, 16, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", true, objArr14);
        String str2 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        onExtraCallback("\ue82c颖倝왞ꇁ⧰둜ጊ鈶䴜\u0ba0똨\ue153\ude12Ὠ∷㳟", (char) (Color.alpha(0) + 44131), "陸旵揚鞬", (ViewConfiguration.getPressedStateDuration() >> 16) - 630852103, "\u0000\u0000\u0000\u0000", objArr15);
        String str3 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        onExtraCallbackWithResult(new int[]{161, 23, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", true, objArr16);
        String str4 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        onExtraCallback("騣⢊霶剛늑읲\ued1f榽毡\udce2ꈂ洚화蚱ᦳ\u2029峃ꅶꅌ\ufaf3苴⊀⡹䷅\ue352운\uebef哨\uec11₸", (char) (49725 - TextUtils.indexOf((CharSequence) "", '0', 0)), "雟棥㹞\udac2", View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", objArr17);
        IAuthTabCallbackStubProxy = new String[]{str, str2, str3, str4, (String) objArr17[0]};
        IAuthTabCallback_Parcel = null;
        int i = onActivityLayout + 99;
        onActivityResized = i % 128;
        int i2 = i % 2;
    }

    private static void IAuthTabCallback(String str, int i, Object[] objArr) {
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda4 utilExternalSyntheticLambda4 = new UtilExternalSyntheticLambda4();
        utilExternalSyntheticLambda4.onExtraCallbackWithResult = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            jArr[utilExternalSyntheticLambda4.IAuthTabCallback] = (cArr[utilExternalSyntheticLambda4.IAuthTabCallback] ^ (utilExternalSyntheticLambda4.IAuthTabCallback * utilExternalSyntheticLambda4.onExtraCallbackWithResult)) ^ (extraCallback - (-916733648318839497L));
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        char[] cArr2 = new char[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            cArr2[utilExternalSyntheticLambda4.IAuthTabCallback] = (char) jArr[utilExternalSyntheticLambda4.IAuthTabCallback];
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        objArr[0] = new String(cArr2);
    }

    private static void onExtraCallback(String str, char c, String str2, int i, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        int i2 = 2 % 2;
        int i3 = onMinimized + 61;
        int i4 = i3 % 128;
        onPostMessage = i4;
        int i5 = i3 % 2;
        if (str3 == null) {
            charArray = str3;
        } else {
            int i6 = i4 + 55;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
            charArray = str3.toCharArray();
            int i8 = onMinimized + 113;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
        }
        char[] cArr = charArray;
        if (str2 == null) {
            charArray2 = str2;
        } else {
            int i10 = onPostMessage + 33;
            onMinimized = i10 % 128;
            if (i10 % 2 != 0) {
                throw new NullPointerException();
            }
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        NetworkTypeObserverReceiverExternalSyntheticLambda0 networkTypeObserverReceiverExternalSyntheticLambda0 = new NetworkTypeObserverReceiverExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr5 = new char[length3];
        networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent = 0;
        while (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent < length3) {
            int i11 = onMinimized + 37;
            onPostMessage = i11 % 128;
            int i12 = i11 % 2;
            int i13 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 2) % 4;
            int i14 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 3) % 4;
            networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted = (char) (((cArr3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent % 4] * 32718) + cArr4[i13]) % 65535);
            cArr4[i14] = (char) (((cArr3[i14] * 32718) + cArr4[i13]) / 65535);
            cArr3[i14] = networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted;
            cArr5[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent] = (char) ((((cArr3[i14] ^ charArray3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent]) ^ (access100 ^ 5161337353776785399L)) ^ ((int) (readTypedObject ^ 5161337353776785399L))) ^ ((char) (writeTypedObject ^ 5161337353776785399L)));
            networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent++;
        }
        objArr[0] = new String(cArr5);
    }

    public static synchronized Set<BigInteger> onExtraCallbackWithResult() {
        Object[] objArr;
        BufferedReader bufferedReader;
        int i = 2 % 2;
        if (IAuthTabCallback_Parcel == null) {
            IAuthTabCallback_Parcel = new HashSet();
            try {
                objArr = new Object[1];
                onExtraCallback("ጟ횘絜苝圯㳩候聎탚\ud896硑薜ᇉ\uf2b6䢛趶诓돉", (char) (TextUtils.indexOf("", "", 0) + 12247), "ㆰꁪ휻뼯", TextUtils.getTrimmedLength(""), "\u0000\u0000\u0000\u0000", objArr);
            } catch (IOException | Exception unused) {
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(new File((String) objArr[0])));
                while (true) {
                    try {
                        byte[] bArrOnExtraCallback = onExtraCallback(bufferedReader.readLine());
                        if (bArrOnExtraCallback == null) {
                            break;
                        }
                        IAuthTabCallback_Parcel.add(new BigInteger(1, bArrOnExtraCallback));
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                int i2 = extraCallbackWithResult + 123;
                onMessageChannelReady = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                if (IAuthTabCallback_Parcel.isEmpty()) {
                    String[] strArr = IAuthTabCallbackStubProxy;
                    int length = strArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        String str = strArr[i5];
                        String strRun = ResolvingDataSource.run(str);
                        if (!TextUtils.isEmpty(strRun)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            Object[] objArr2 = new Object[1];
                            onExtraCallbackWithResult(new int[]{0, 1, 149, 1}, null, true, objArr2);
                            sb.append((String) objArr2[0]);
                            sb.append(strRun);
                            IAuthTabCallback_Parcel.add(new BigInteger(1, onExtraCallback(sb.toString())));
                        }
                        i5++;
                        int i6 = extraCallbackWithResult + 93;
                        onMessageChannelReady = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 2 % 2;
                        }
                    }
                }
                IAuthTabCallback_Parcel.retainAll(Arrays.asList(onExtraCallbackWithResult, onExtraCallback, asBinder, IAuthTabCallback, onWarmupCompleted, onNavigationEvent, IAuthTabCallbackDefault, IAuthTabCallbackStub, onTransact, access000, asInterface, getInterfaceDescriptor));
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        }
        return IAuthTabCallback_Parcel;
    }

    private static byte[] onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 45;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = new Object[1];
            onExtraCallbackWithResult(new int[]{1, 3, 154, 3}, null, true, objArr);
            String str2 = (String) objArr[0];
            int i4 = onMessageChannelReady + 123;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = new Object[1];
                IAuthTabCallback("蔭罝燇橗沅慓寀屹囪䭦䷠䙺㣺㵖㞰⠗⊄✟ᦀሁᒾऔμЭﺪ\uf337\uf54d", 64123 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                IAuthTabCallback("蔠믵\uf89d㦋繵뼇ﰹ㋇玑낫\uf144", 16087 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
                MessageDigest messageDigest = (MessageDigest) cls.getMethod((String) objArr3[0], String.class).invoke(null, str2);
                messageDigest.update(str.getBytes());
                int i6 = onMessageChannelReady + 17;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr4 = new Object[1];
                    IAuthTabCallback("蔭罝燇橗沅慓寀屹囪䭦䷠䙺㣺㵖㞰⠗⊄✟ᦀሁᒾऔμЭﺪ\uf337\uf54d", 64123 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    IAuthTabCallback("蔣沗噒㠉⏐ᖮ", ((byte) KeyEvent.getModifierMetaStateMask()) + 59834, objArr5);
                    return (byte[]) cls2.getMethod((String) objArr5[0], null).invoke(messageDigest, null);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    private static void onExtraCallbackWithResult(int[] iArr, String str, boolean z, Object[] objArr) throws UnsupportedEncodingException {
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda0;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda02;
        char[] cArr;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda03;
        String str2 = str;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onPostMessage + 57;
        int i4 = i3 % 128;
        onMinimized = i4;
        byte[] bytes = str2;
        if (i3 % 2 != 0) {
            throw new ArithmeticException();
        }
        if (str2 != null) {
            int i5 = i4 + 83;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda04 = new UtilExternalSyntheticLambda0();
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr2 = ICustomTabsCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = onPostMessage + 41;
                onMinimized = i12 % 128;
                if (i12 % i == 0) {
                    utilExternalSyntheticLambda03 = utilExternalSyntheticLambda04;
                    cArr3[i11] = (char) (cArr2[i11] - 4301814714517170301L);
                    i11++;
                } else {
                    utilExternalSyntheticLambda03 = utilExternalSyntheticLambda04;
                    cArr3[i11] = (char) (cArr2[i11] * 4301814714517170301L);
                }
                utilExternalSyntheticLambda04 = utilExternalSyntheticLambda03;
                i = 2;
            }
            utilExternalSyntheticLambda0 = utilExternalSyntheticLambda04;
            cArr2 = cArr3;
        } else {
            utilExternalSyntheticLambda0 = utilExternalSyntheticLambda04;
        }
        char[] cArr4 = new char[i8];
        System.arraycopy(cArr2, i7, cArr4, 0, i8);
        if (bArr == null) {
            utilExternalSyntheticLambda02 = utilExternalSyntheticLambda0;
            cArr = cArr4;
        } else {
            char[] cArr5 = new char[i8];
            utilExternalSyntheticLambda02 = utilExternalSyntheticLambda0;
            utilExternalSyntheticLambda02.onNavigationEvent = 0;
            char c = 0;
            while (utilExternalSyntheticLambda02.onNavigationEvent < i8) {
                int i13 = onMinimized + 29;
                onPostMessage = i13 % 128;
                int i14 = i13 % 2;
                if (bArr[utilExternalSyntheticLambda02.onNavigationEvent] == 1) {
                    cArr5[utilExternalSyntheticLambda02.onNavigationEvent] = (char) (((cArr4[utilExternalSyntheticLambda02.onNavigationEvent] << 1) + 1) - c);
                } else {
                    cArr5[utilExternalSyntheticLambda02.onNavigationEvent] = (char) ((cArr4[utilExternalSyntheticLambda02.onNavigationEvent] << 1) - c);
                }
                c = cArr5[utilExternalSyntheticLambda02.onNavigationEvent];
                utilExternalSyntheticLambda02.onNavigationEvent++;
                int i15 = onMinimized + 75;
                onPostMessage = i15 % 128;
                int i16 = i15 % 2;
            }
            cArr = cArr5;
        }
        if (i10 > 0) {
            char[] cArr6 = new char[i8];
            System.arraycopy(cArr, 0, cArr6, 0, i8);
            int i17 = i8 - i10;
            System.arraycopy(cArr6, 0, cArr, i17, i10);
            System.arraycopy(cArr6, i10, cArr, 0, i17);
        }
        if (z) {
            int i18 = onPostMessage + 43;
            onMinimized = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr7 = new char[i8];
            utilExternalSyntheticLambda02.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda02.onNavigationEvent < i8) {
                cArr7[utilExternalSyntheticLambda02.onNavigationEvent] = cArr[(i8 - utilExternalSyntheticLambda02.onNavigationEvent) - 1];
                utilExternalSyntheticLambda02.onNavigationEvent++;
            }
            cArr = cArr7;
        }
        if (i9 > 0) {
            utilExternalSyntheticLambda02.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda02.onNavigationEvent < i8) {
                int i20 = onPostMessage + 13;
                onMinimized = i20 % 128;
                int i21 = i20 % 2;
                cArr[utilExternalSyntheticLambda02.onNavigationEvent] = (char) (cArr[utilExternalSyntheticLambda02.onNavigationEvent] - iArr[2]);
                utilExternalSyntheticLambda02.onNavigationEvent++;
                int i22 = onMinimized + 61;
                onPostMessage = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onWarmupCompleted() {
        access100 = 5161337353776785399L;
        readTypedObject = 835839991;
        writeTypedObject = (char) 27592;
        ICustomTabsCallback = new char[]{10575, 10572, 10587, 10596, 10497, 10604, 10578, 10581, 10584, 10585, 10608, 10630, 10630, 10630, 10628, 10627, 10629, 10631, 10631, 10605, 10580, 10580, 10584, 10585, 10606, 10629, 10605, 10583, 10607, 10608, 10585, 10606, 10607, 10584, 10585, 10607, 10389, 10418, 10442, 10440, 10441, 10442, 10418, 10416, 10416, 10415, 10417, 10443, 10440, 10418, 10442, 10465, 10442, 10420, 10420, 10442, 10463, 10439, 10416, 10418, 10421, 10420, 10417, 10440, 10464, 10463, 10463, 10440, 10473, 10603, 10600, 10579, 10582, 10605, 10601, 10575, 10575, 10599, 10601, 10602, 10599, 10577, 10579, 10578, 10579, 10579, 10601, 10600, 10577, 10600, 10601, 10576, 10576, 10603, 10603, 10577, 10575, 10576, 10576, 10578, 10416, 10464, 10440, 10441, 10441, 10416, 10416, 10416, 10440, 10441, 10418, 10440, 10440, 10417, 10417, 10419, 10420, 10442, 10441, 10439, 10464, 10440, 10416, 10419, 10442, 10463, 10443, 10420, 10420, 10420, 10442, 10442, 10467, 10568, 10566, 10560, 10528, 10526, 10557, 10559, 10564, 10560, 10525, 10531, 10565, 10419, 10469, 10465, 10470, 10475, 10442, 10446, 10472, 10473, 10473, 10470, 10477, 10478, 10444, 10443, 10477, 10422, 10472, 10472, 10480, 10481, 10472, 10463, 10464, 10474, 10478, 10468, 10468, 10442, 10446, 10472, 10473, 10473, 10470, 10477, 10478, 10444, 10443, 10477};
    }

    static void IAuthTabCallback() {
        extraCallback = -1382954995265418626L;
    }
}
