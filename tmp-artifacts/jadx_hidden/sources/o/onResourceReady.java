package o;

import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.s3;
import o.s5a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class onResourceReady {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback;
    private static final byte[] asBinder;
    private static long asInterface;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static final int onTransact;
    private static int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:152:0x0582 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x058f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0385 A[Catch: all -> 0x03bb, TryCatch #19 {all -> 0x03bb, blocks: (B:38:0x0367, B:51:0x037f, B:53:0x0385, B:54:0x0386, B:55:0x0387), top: B:197:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0386 A[Catch: all -> 0x03bb, TryCatch #19 {all -> 0x03bb, blocks: (B:38:0x0367, B:51:0x037f, B:53:0x0385, B:54:0x0386, B:55:0x0387), top: B:197:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x043c A[Catch: all -> 0x04ce, TryCatch #6 {all -> 0x04ce, blocks: (B:75:0x0412, B:93:0x0436, B:95:0x043c, B:96:0x043d, B:101:0x0459, B:103:0x046a, B:111:0x04c4, B:104:0x0478, B:105:0x0491, B:110:0x04b7), top: B:172:0x0412 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x043d A[Catch: all -> 0x04ce, TryCatch #6 {all -> 0x04ce, blocks: (B:75:0x0412, B:93:0x0436, B:95:0x043c, B:96:0x043d, B:101:0x0459, B:103:0x046a, B:111:0x04c4, B:104:0x0478, B:105:0x0491, B:110:0x04b7), top: B:172:0x0412 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String IAuthTabCallback() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onResourceReady.IAuthTabCallback():java.lang.String");
    }

    public static final Pair<String, String> IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        int i3;
        Object obj;
        String pair;
        int i4;
        Object objPadEnd;
        Object obj2;
        Object[] objArr;
        Method method;
        int iIntValue;
        Object obj3;
        Integer num;
        char c;
        int i5;
        XPermissionHelper1 xPermissionHelper1 = new XPermissionHelper1(str, str2, str3, str4, str5, str6);
        try {
            byte[] bArr = asBinder;
            byte b = bArr[103];
            short s = (short) 406;
            Object[] objArr2 = new Object[1];
            a(b, b, s, objArr2);
            char c2 = 0;
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b2 = bArr[774];
            byte b3 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, b3, (short) (b3 | 421), objArr3);
            int iIntValue2 = 1053 - (((Integer) cls.getMethod((String) objArr3[0], null).invoke(null, null)).intValue() >> 22);
            Object[] objArr4 = new Object[1];
            a(bArr[103], bArr[6], bArr[9], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a(bArr[279], bArr[149], (short) 427, objArr5);
            String str7 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            a(bArr[13], bArr[6], bArr[346], objArr6);
            char cIntValue = (char) (47325 - ((Integer) cls2.getMethod(str7, Class.forName((String) objArr6[0])).invoke(null, "")).intValue());
            Object[] objArr7 = new Object[1];
            a(bArr[103], bArr[279], (short) 442, objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr[279], bArr[54], (short) 465, objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue2, cIntValue, 583 - (((Float) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1)), objArr9);
            String str8 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(bArr[103], bArr[774], (short) (bArr[402] - 1), objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            byte b4 = bArr[279];
            byte b5 = bArr[123];
            Object[] objArr11 = new Object[1];
            a(b4, b5, (short) (b5 | 460), objArr11);
            int iIntValue3 = 1 - (((Integer) cls4.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr12 = new Object[1];
            a(bArr[103], bArr[774], (short) (bArr[402] - 1), objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[279], bArr[26], (short) 138, objArr13);
            char cIntValue2 = (char) (((Integer) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr14 = {0, 0, 0};
            Object[] objArr15 = new Object[1];
            a(bArr[103], bArr[6], (short) (onTransact | 264), objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            byte b6 = bArr[206];
            byte b7 = bArr[9];
            Object[] objArr16 = new Object[1];
            a(b6, b7, (short) (b7 | 515), objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue3, cIntValue2, ((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14)).intValue() + 16777797, objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s2 = (short) 174;
            Object[] objArr19 = new Object[1];
            a(bArr[13], bArr[149], s2, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            a(bArr[324], bArr[7], (short) 189, objArr20);
            String str9 = (String) objArr20[0];
            Object[] objArr21 = new Object[1];
            a(bArr[13], bArr[149], s2, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str9, Class.forName((String) objArr21[0])).invoke(str8, objArr18);
            int[] iArr2 = new int[objArr22.length];
            int i6 = 0;
            while (i6 < objArr22.length) {
                Object[] objArr23 = {objArr22[i6]};
                byte[] bArr2 = asBinder;
                short s3 = (short) 193;
                Object[] objArr24 = new Object[1];
                a(bArr2[13], bArr2[56], s3, objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[c2]);
                Object[] objArr25 = new Object[1];
                a(bArr2[21], bArr2[77], (short) 209, objArr25);
                String str10 = (String) objArr25[c2];
                Object[] objArr26 = new Object[1];
                a(bArr2[13], bArr2[149], s2, objArr26);
                Object objInvoke = cls8.getMethod(str10, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a(bArr2[13], bArr2[56], s3, objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                byte b8 = bArr2[52];
                byte b9 = bArr2[29];
                Object[] objArr28 = new Object[1];
                a(b8, b9, (short) (b9 | 210), objArr28);
                iArr2[i6] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i6++;
                c2 = 0;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                switch (xPermissionHelper1.onNavigationEvent(iArr2[i7])) {
                    case -70:
                        iArr = iArr2;
                        i8 = 308;
                        i7 = i8;
                        iArr2 = iArr;
                    case -69:
                        iArr = iArr2;
                        xPermissionHelper1.onNavigationEvent(56);
                        int i9 = xPermissionHelper1.onWarmupCompleted;
                        i8 = (i9 == 0 || i9 != 1) ? 270 : 98;
                        i7 = i8;
                        iArr2 = iArr;
                    case -68:
                        iArr = iArr2;
                        i8 = 303;
                        i7 = i8;
                        iArr2 = iArr;
                    case -67:
                        iArr = iArr2;
                        xPermissionHelper1.onNavigationEvent(56);
                        i8 = xPermissionHelper1.onWarmupCompleted != 0 ? 69 : 72;
                        i7 = i8;
                        iArr2 = iArr;
                    case -66:
                        iArr = iArr2;
                        i8 = 95;
                        i7 = i8;
                        iArr2 = iArr;
                    case -65:
                        iArr = iArr2;
                        i8 = 302;
                        i7 = i8;
                        iArr2 = iArr;
                    case -64:
                        iArr = iArr2;
                        xPermissionHelper1.onNavigationEvent(31);
                        if (xPermissionHelper1.onWarmupCompleted == 0) {
                            i8 = 301;
                        }
                        i7 = i8;
                        iArr2 = iArr;
                    case -63:
                        iArr = iArr2;
                        i8 = 54;
                        i7 = i8;
                        iArr2 = iArr;
                    case -62:
                        iArr = iArr2;
                        i8 = 291;
                        i7 = i8;
                        iArr2 = iArr;
                    case -61:
                        iArr = iArr2;
                        xPermissionHelper1.onNavigationEvent(31);
                        if (xPermissionHelper1.onWarmupCompleted == 0) {
                            i8 = 290;
                        }
                        i7 = i8;
                        iArr2 = iArr;
                    case -60:
                        iArr = iArr2;
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(29);
                        onWarmupCompleted = xPermissionHelper1.onWarmupCompleted;
                        i7 = i8;
                        iArr2 = iArr;
                    case -59:
                        iArr = iArr2;
                        i = onExtraCallbackWithResult;
                        xPermissionHelper1.onExtraCallback = i;
                        xPermissionHelper1.onNavigationEvent(10);
                        i7 = i8;
                        iArr2 = iArr;
                    case -58:
                        iArr = iArr2;
                        i8 = 81;
                        i7 = i8;
                        iArr2 = iArr;
                    case -57:
                        i7 = 279;
                    case -56:
                        iArr = iArr2;
                        xPermissionHelper1.onNavigationEvent(107);
                        if (xPermissionHelper1.onWarmupCompleted == 0) {
                            i8 = 278;
                        }
                        i7 = i8;
                        iArr2 = iArr;
                    case -55:
                        i7 = 1;
                    case -54:
                        iArr = iArr2;
                        i8 = 269;
                        i7 = i8;
                        iArr2 = iArr;
                    case -53:
                        iArr = iArr2;
                        xPermissionHelper1.onNavigationEvent(107);
                        if (xPermissionHelper1.onWarmupCompleted == 0) {
                            i8 = 268;
                        }
                        i7 = i8;
                        iArr2 = iArr;
                    case -52:
                        iArr = iArr2;
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(29);
                        onExtraCallbackWithResult = xPermissionHelper1.onWarmupCompleted;
                        i7 = i8;
                        iArr2 = iArr;
                    case -51:
                        iArr = iArr2;
                        i = onWarmupCompleted;
                        xPermissionHelper1.onExtraCallback = i;
                        xPermissionHelper1.onNavigationEvent(10);
                        i7 = i8;
                        iArr2 = iArr;
                    case -50:
                        xPermissionHelper1.onNavigationEvent(41);
                        return (Pair) xPermissionHelper1.onTransact;
                    case -49:
                        iArr = iArr2;
                        i2 = 258;
                        i7 = i2;
                        iArr2 = iArr;
                    case -48:
                        iArr = iArr2;
                        i2 = 256;
                        i7 = i2;
                        iArr2 = iArr;
                    case -47:
                        iArr = iArr2;
                        i3 = 2;
                        obj = null;
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        Object obj4 = xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(4);
                        pair = new Pair(obj4, xPermissionHelper1.onTransact);
                        xPermissionHelper1.IAuthTabCallbackStub = pair;
                        xPermissionHelper1.onNavigationEvent(i3);
                        i7 = i8;
                        iArr2 = iArr;
                    case -46:
                        iArr = iArr2;
                        i3 = 2;
                        obj = null;
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        CharSequence charSequence = (CharSequence) xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        pair = StringsKt.repeat(charSequence, xPermissionHelper1.onWarmupCompleted);
                        xPermissionHelper1.IAuthTabCallbackStub = pair;
                        xPermissionHelper1.onNavigationEvent(i3);
                        i7 = i8;
                        iArr2 = iArr;
                    case -45:
                        byte[] bArr3 = asBinder;
                        Object[] objArr29 = new Object[1];
                        a(bArr3[103], bArr3[774], (short) (bArr3[402] - 1), objArr29);
                        Class<?> cls10 = Class.forName((String) objArr29[0]);
                        byte b10 = bArr3[279];
                        byte b11 = bArr3[17];
                        Object[] objArr30 = new Object[1];
                        a(b10, b11, (short) (b11 | 553), objArr30);
                        iArr = iArr2;
                        xPermissionHelper1.onExtraCallbackWithResult = ((Long) cls10.getMethod((String) objArr30[0], null).invoke(null, null)).longValue();
                        xPermissionHelper1.onNavigationEvent(34);
                        i7 = i8;
                        iArr2 = iArr;
                    case -44:
                        xPermissionHelper1.IAuthTabCallbackStub = new char[]{12868, 12920, 47392, 5929, 60654};
                        xPermissionHelper1.onNavigationEvent(2);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -43:
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        Object obj5 = xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        Object[] objArr31 = {Integer.valueOf(xPermissionHelper1.onWarmupCompleted)};
                        byte[] bArr4 = asBinder;
                        Object[] objArr32 = new Object[1];
                        a(bArr4[13], bArr4[149], s2, objArr32);
                        Class<?> cls11 = Class.forName((String) objArr32[0]);
                        byte b12 = bArr4[324];
                        byte b13 = bArr4[174];
                        Object[] objArr33 = new Object[1];
                        a(b12, b13, (short) (b13 | 561), objArr33);
                        xPermissionHelper1.IAuthTabCallbackStub = cls11.getMethod((String) objArr33[0], Integer.TYPE).invoke(obj5, objArr31);
                        xPermissionHelper1.onNavigationEvent(2);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -42:
                        xPermissionHelper1.onExtraCallback = 4;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        Object obj6 = xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        char c3 = (char) xPermissionHelper1.onWarmupCompleted;
                        xPermissionHelper1.onNavigationEvent(29);
                        int i10 = xPermissionHelper1.onWarmupCompleted;
                        xPermissionHelper1.onNavigationEvent(29);
                        Object[] objArr34 = {obj6, Character.valueOf(c3), Integer.valueOf(i10), Integer.valueOf(xPermissionHelper1.onWarmupCompleted)};
                        byte[] bArr5 = asBinder;
                        Object[] objArr35 = new Object[1];
                        a(bArr5[103], bArr5[6], bArr5[9], objArr35);
                        Class<?> cls12 = Class.forName((String) objArr35[0]);
                        byte b14 = bArr5[39];
                        byte b15 = bArr5[23];
                        Object[] objArr36 = new Object[1];
                        a(b14, b15, (short) (b15 | 549), objArr36);
                        String str11 = (String) objArr36[0];
                        Object[] objArr37 = new Object[1];
                        a(bArr5[13], bArr5[6], bArr5[346], objArr37);
                        xPermissionHelper1.onExtraCallback = ((Integer) cls12.getMethod(str11, Class.forName((String) objArr37[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr34)).intValue();
                        xPermissionHelper1.onNavigationEvent(10);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -41:
                        i4 = 2;
                        xPermissionHelper1.IAuthTabCallbackStub = new char[]{22520, 17189};
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -40:
                        i4 = 2;
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        String str12 = (String) xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        xPermissionHelper1.IAuthTabCallbackStub = StringsKt.take(str12, xPermissionHelper1.onWarmupCompleted);
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -39:
                        xPermissionHelper1.onExtraCallback = 3;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        String str13 = (String) xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        int i11 = xPermissionHelper1.onWarmupCompleted;
                        xPermissionHelper1.onNavigationEvent(29);
                        objPadEnd = StringsKt.padEnd(str13, i11, (char) xPermissionHelper1.onWarmupCompleted);
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -38:
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        obj2 = xPermissionHelper1.onTransact;
                        byte[] bArr6 = asBinder;
                        Object[] objArr38 = new Object[1];
                        a(bArr6[13], bArr6[26], (short) 521, objArr38);
                        Class<?> cls13 = Class.forName((String) objArr38[0]);
                        Object[] objArr39 = new Object[1];
                        a(bArr6[346], bArr6[29], (short) 550, objArr39);
                        objArr = null;
                        method = cls13.getMethod((String) objArr39[0], null);
                        objPadEnd = method.invoke(obj2, objArr);
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -37:
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(29);
                        Object[] objArr40 = {Integer.valueOf(xPermissionHelper1.onWarmupCompleted)};
                        byte[] bArr7 = asBinder;
                        Object[] objArr41 = new Object[1];
                        a(bArr7[103], bArr7[6], (short) (onTransact | 264), objArr41);
                        Class<?> cls14 = Class.forName((String) objArr41[0]);
                        byte b16 = bArr7[206];
                        byte b17 = bArr7[9];
                        Object[] objArr42 = new Object[1];
                        a(b16, b17, (short) (b17 | 548), objArr42);
                        iIntValue = ((Integer) cls14.getMethod((String) objArr42[0], Integer.TYPE).invoke(null, objArr40)).intValue();
                        xPermissionHelper1.onExtraCallback = iIntValue;
                        xPermissionHelper1.onNavigationEvent(10);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -36:
                        i4 = 2;
                        xPermissionHelper1.IAuthTabCallbackStub = new char[]{22420, 7461};
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -35:
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        obj2 = xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(4);
                        objArr = new Object[]{xPermissionHelper1.onTransact};
                        byte[] bArr8 = asBinder;
                        Object[] objArr43 = new Object[1];
                        a(bArr8[13], bArr8[26], (short) 521, objArr43);
                        Class<?> cls15 = Class.forName((String) objArr43[0]);
                        byte b18 = bArr8[103];
                        byte b19 = bArr8[25];
                        Object[] objArr44 = new Object[1];
                        a(b18, b19, (short) (b19 | 540), objArr44);
                        String str14 = (String) objArr44[0];
                        Object[] objArr45 = new Object[1];
                        a(bArr8[13], bArr8[149], s2, objArr45);
                        method = cls15.getMethod(str14, Class.forName((String) objArr45[0]));
                        objPadEnd = method.invoke(obj2, objArr);
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -34:
                        byte[] bArr9 = asBinder;
                        Object[] objArr46 = new Object[1];
                        a(bArr9[13], bArr9[26], (short) 521, objArr46);
                        objPadEnd = Class.forName((String) objArr46[0]).getDeclaredConstructor(null).newInstance(null);
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -33:
                        i7 = 253;
                    case -32:
                        i7 = 98;
                    case -31:
                        i7 = 292;
                    case -30:
                        xPermissionHelper1.onNavigationEvent(79);
                        i7 = xPermissionHelper1.onWarmupCompleted == 0 ? 94 : i8;
                    case -29:
                        i7 = 309;
                    case -28:
                        i7 = 311;
                    case -27:
                        xPermissionHelper1.onNavigationEvent(76);
                        if (xPermissionHelper1.onWarmupCompleted == 0) {
                            i7 = 80;
                        }
                    case -26:
                        i7 = 72;
                    case -25:
                        i7 = 304;
                    case -24:
                        i7 = 306;
                    case -23:
                        xPermissionHelper1.onNavigationEvent(79);
                        if (xPermissionHelper1.onWarmupCompleted == 0) {
                            i7 = 68;
                        }
                    case -22:
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        Object obj7 = xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(4);
                        Object[] objArr47 = {xPermissionHelper1.onTransact};
                        byte[] bArr10 = asBinder;
                        Object[] objArr48 = new Object[1];
                        a(bArr10[13], bArr10[149], s2, objArr48);
                        Class<?> cls16 = Class.forName((String) objArr48[0]);
                        Object[] objArr49 = new Object[1];
                        a(bArr10[346], bArr10[23], (short) 240, objArr49);
                        String str15 = (String) objArr49[0];
                        Object[] objArr50 = new Object[1];
                        a(bArr10[13], bArr10[149], (short) 222, objArr50);
                        objPadEnd = cls16.getMethod(str15, Class.forName((String) objArr50[0])).invoke(obj7, objArr47);
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -21:
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        Object obj8 = xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(4);
                        Intrinsics.checkNotNullExpressionValue(obj8, (String) xPermissionHelper1.onTransact);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -20:
                        byte[] bArr11 = asBinder;
                        Object[] objArr51 = new Object[1];
                        a(bArr11[13], bArr11[149], (short) 222, objArr51);
                        Class<?> cls17 = Class.forName((String) objArr51[0]);
                        byte b20 = bArr11[9];
                        byte b21 = bArr11[14];
                        Object[] objArr52 = new Object[1];
                        a(b20, b21, (short) (b21 | 236), objArr52);
                        objPadEnd = cls17.getField((String) objArr52[0]).get(null);
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -19:
                        i7 = 69;
                    case -18:
                        i7 = 280;
                    case -17:
                        xPermissionHelper1.onNavigationEvent(76);
                        if (xPermissionHelper1.onWarmupCompleted == 0) {
                            i7 = 53;
                        }
                    case -16:
                        i4 = 2;
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        xPermissionHelper1.IAuthTabCallbackStub = xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -15:
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        List list = (List) xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        xPermissionHelper1.IAuthTabCallbackStub = CollectionsKt.getOrNull(list, xPermissionHelper1.onWarmupCompleted);
                        xPermissionHelper1.onNavigationEvent(2);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -14:
                        xPermissionHelper1.onExtraCallback = 6;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        CharSequence charSequence2 = (CharSequence) xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(4);
                        String[] strArr = (String[]) xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        boolean z = xPermissionHelper1.onWarmupCompleted != 0;
                        xPermissionHelper1.onNavigationEvent(29);
                        int i12 = xPermissionHelper1.onWarmupCompleted;
                        xPermissionHelper1.onNavigationEvent(29);
                        int i13 = xPermissionHelper1.onWarmupCompleted;
                        xPermissionHelper1.onNavigationEvent(4);
                        xPermissionHelper1.IAuthTabCallbackStub = StringsKt.split$default(charSequence2, strArr, z, i12, i13, xPermissionHelper1.onTransact);
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -13:
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        char[] cArr = (char[]) xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        Object[] objArr53 = new Object[1];
                        c(cArr, xPermissionHelper1.onWarmupCompleted, objArr53);
                        obj3 = objArr53[0];
                        xPermissionHelper1.IAuthTabCallbackStub = (String) obj3;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -12:
                        byte[] bArr12 = asBinder;
                        Object[] objArr54 = new Object[1];
                        a(bArr12[103], bArr12[4], (short) 330, objArr54);
                        Class<?> cls18 = Class.forName((String) objArr54[0]);
                        byte b22 = bArr12[279];
                        Object[] objArr55 = new Object[1];
                        a(b22, b22, (short) 350, objArr55);
                        num = (Integer) cls18.getMethod((String) objArr55[0], null).invoke(null, null);
                        iIntValue = num.intValue();
                        xPermissionHelper1.onExtraCallback = iIntValue;
                        xPermissionHelper1.onNavigationEvent(10);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -11:
                        i4 = 2;
                        xPermissionHelper1.IAuthTabCallbackStub = new char[]{27689, 27657, 31551, 52519, 15735};
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -10:
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(29);
                        int i14 = xPermissionHelper1.onWarmupCompleted;
                        byte[] bArr13 = asBinder;
                        Object[] objArr56 = new Object[1];
                        a(bArr13[13], bArr13[149], s2, objArr56);
                        objPadEnd = Array.newInstance(Class.forName((String) objArr56[0]), i14);
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -9:
                        c = 3;
                        i5 = 2;
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        xPermissionHelper1.IAuthTabCallbackStub = xPermissionHelper1.onTransact.toString();
                        xPermissionHelper1.onNavigationEvent(i5);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -8:
                        c = 3;
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        xPermissionHelper1.IAuthTabCallbackStub = StringsKt.trim((CharSequence) xPermissionHelper1.onTransact);
                        i5 = 2;
                        xPermissionHelper1.onNavigationEvent(i5);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -7:
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        Object obj9 = xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(4);
                        Intrinsics.checkNotNullParameter(obj9, (String) xPermissionHelper1.onTransact);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -6:
                        objPadEnd = "";
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -5:
                        xPermissionHelper1.onExtraCallback = 1;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        Object obj10 = xPermissionHelper1.onTransact;
                        byte[] bArr14 = asBinder;
                        Object[] objArr57 = new Object[1];
                        a(bArr14[13], bArr14[149], s2, objArr57);
                        Class<?> cls19 = Class.forName((String) objArr57[0]);
                        Object[] objArr58 = new Object[1];
                        a(bArr14[52], bArr14[25], (short) 325, objArr58);
                        objPadEnd = cls19.getMethod((String) objArr58[0], null).invoke(obj10, null);
                        xPermissionHelper1.IAuthTabCallbackStub = objPadEnd;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -4:
                        xPermissionHelper1.onExtraCallback = 2;
                        xPermissionHelper1.onNavigationEvent(3);
                        xPermissionHelper1.onNavigationEvent(4);
                        char[] cArr2 = (char[]) xPermissionHelper1.onTransact;
                        xPermissionHelper1.onNavigationEvent(29);
                        Object[] objArr59 = new Object[1];
                        d(cArr2, xPermissionHelper1.onWarmupCompleted, objArr59);
                        obj3 = objArr59[0];
                        xPermissionHelper1.IAuthTabCallbackStub = (String) obj3;
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -3:
                        byte b23 = asBinder[103];
                        Object[] objArr60 = new Object[1];
                        a(b23, b23, s, objArr60);
                        Class<?> cls20 = Class.forName((String) objArr60[0]);
                        Object[] objArr61 = new Object[1];
                        a(r1[774], r1[7], (short) 517, objArr61);
                        num = (Integer) cls20.getMethod((String) objArr61[0], null).invoke(null, null);
                        iIntValue = num.intValue();
                        xPermissionHelper1.onExtraCallback = iIntValue;
                        xPermissionHelper1.onNavigationEvent(10);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -2:
                        xPermissionHelper1.IAuthTabCallbackStub = new char[]{22424};
                        i4 = 2;
                        xPermissionHelper1.onNavigationEvent(i4);
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                    case -1:
                        i7 = 250;
                    default:
                        iArr = iArr2;
                        i7 = i8;
                        iArr2 = iArr;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x0b29 A[PHI: r3 r19
      0x0b29: PHI (r3v55 int) = 
      (r3v21 int)
      (r3v24 int)
      (r3v25 int)
      (r3v16 int)
      (r3v27 int)
      (r3v16 int)
      (r3v28 int)
      (r3v16 int)
      (r3v29 int)
      (r3v16 int)
      (r3v30 int)
      (r3v16 int)
      (r3v33 int)
      (r3v16 int)
      (r3v16 int)
      (r3v16 int)
      (r3v16 int)
      (r3v16 int)
      (r3v16 int)
     binds: [B:274:0x0b12, B:264:0x0ae0, B:263:0x0add, B:250:0x0a74, B:251:0x0a76, B:245:0x0a3a, B:246:0x0a3c, B:240:0x0a0e, B:241:0x0a10, B:235:0x09d4, B:236:0x09d6, B:228:0x0985, B:229:0x0987, B:218:0x0947, B:176:0x0858, B:121:0x06d7, B:83:0x0595, B:68:0x051e, B:22:0x0375] A[DONT_GENERATE, DONT_INLINE]
      0x0b29: PHI (r19v80 java.lang.String) = 
      (r19v5 java.lang.String)
      (r19v7 java.lang.String)
      (r19v7 java.lang.String)
      (r19v11 java.lang.String)
      (r19v11 java.lang.String)
      (r19v14 java.lang.String)
      (r19v14 java.lang.String)
      (r19v16 java.lang.String)
      (r19v16 java.lang.String)
      (r19v19 java.lang.String)
      (r19v19 java.lang.String)
      (r19v23 java.lang.String)
      (r19v23 java.lang.String)
      (r19v29 java.lang.String)
      (r19v33 java.lang.String)
      (r19v45 java.lang.String)
      (r19v52 java.lang.String)
      (r19v54 java.lang.String)
      (r19v81 java.lang.String)
     binds: [B:274:0x0b12, B:264:0x0ae0, B:263:0x0add, B:250:0x0a74, B:251:0x0a76, B:245:0x0a3a, B:246:0x0a3c, B:240:0x0a0e, B:241:0x0a10, B:235:0x09d4, B:236:0x09d6, B:228:0x0985, B:229:0x0987, B:218:0x0947, B:176:0x0858, B:121:0x06d7, B:83:0x0595, B:68:0x051e, B:22:0x0375] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0ba9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0bbd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String onExtraCallback(@org.jetbrains.annotations.NotNull java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onResourceReady.onExtraCallback(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x06cb A[Catch: all -> 0x0824, TryCatch #0 {all -> 0x0824, blocks: (B:120:0x06a1, B:134:0x06c4, B:136:0x06cb, B:137:0x06cc, B:143:0x06f7, B:144:0x06fe, B:147:0x0707, B:148:0x0716, B:149:0x07dc, B:150:0x07ec, B:151:0x07fa, B:152:0x07fe, B:153:0x080d), top: B:251:0x06a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06cc A[Catch: all -> 0x0824, TRY_LEAVE, TryCatch #0 {all -> 0x0824, blocks: (B:120:0x06a1, B:134:0x06c4, B:136:0x06cb, B:137:0x06cc, B:143:0x06f7, B:144:0x06fe, B:147:0x0707, B:148:0x0716, B:149:0x07dc, B:150:0x07ec, B:151:0x07fa, B:152:0x07fe, B:153:0x080d), top: B:251:0x06a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a23 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o.PermissionHelper onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull java.lang.String r39, @org.jetbrains.annotations.NotNull java.lang.String r40, @org.jetbrains.annotations.NotNull java.lang.String r41, @org.jetbrains.annotations.NotNull java.lang.String r42, @org.jetbrains.annotations.NotNull java.lang.String r43, @org.jetbrains.annotations.NotNull java.lang.String r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onResourceReady.onExtraCallbackWithResult(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):o.PermissionHelper");
    }

    private static void c(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onExtraCallback);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i5 = $11 + 99;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void b(int i, char c, int i2, Object[] objArr) {
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i3 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i3] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i2 + i3]), i3, asInterface, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr);
    }

    private static void d(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 89;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (IAuthTabCallback ^ 5407414049857832247L);
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            int i5 = $11 + 97;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        String str = new String(cArr2);
        int i7 = $10 + 29;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static {
        byte[] bArr = new byte[799];
        System.arraycopy("^Õ\u0097}\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿+\u0016\u0018\u0001æ$ú\b\f\u0003\u0014à\u001c\u0005\u0012÷\u0014Ò*\u0013ö\u0012ü\u001aðÒCú\u0012þÌ\u001a*þ\u0016æ\u0017\u0011\tõ\u000eú\u0007\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Ñ1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0003\u0014Ý(\u0004þî'ø\u0013\u0005æ\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼\u001e0ô\u001aø\u0010\n\u0003\u0014Ò&\u0016\u0001\u0002\u000e\u0004öç0ô\u001aø\u0010\n\u0003\u0014Þ\u0019\u001cö\t\rýÞ+\u0002\nþô\u0014\f\bù\u000b\u0010\n\u0003\u0014à\u001c\u0005\u0012÷\u0014Ó(\u0006\u000e\bøü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõü\u001aðÒL\u0004ú\bÇ#(ù\u0003\u0010þ\u0002\u0005\n\u0000ë \u0005ú\u0012Ö#\u0017÷þ\u000eþ\u0012ù\u0003\u0014Ú\u000f\u0001ù1\u000bþ\u000b\u0003ü\u0001\u0013\u0003\u0014Ú\u000f\u0001é\u00151\u000bþ\u000b\u0003\f\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ*+ÿ\u0006ö\rÛ.\bù\r\u0017\u0002\u0005ø\u000e\u000bå\u0019\u000fø\u0001\bõ\u001a\týí!\b\u0005\u0002\u000f\n\u000bö\u0012\u0001\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼\"\u001f\u0019Ñ6ô\u000e\u000b\u0003\u0014Þ'ú\n\u0002\b\u0001\u0012à\u001d\u0014ò÷&ò\u0018öí\u0019\u0017ýü\u001aðÒL\u0004ú\bÇ$!\u000f\u0005û\nþð\u0018\u0013\u0001\u000b\u0002ö\u0007å8ð\u0007\u0010\tú\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ''\u0002ù\u0007\u0013\u0005\u0011Ü\u001e\u0000\u0003\u0014å#ü\t\u0005ý\u0004í\u001e\u000eþ\u0012ù\u0012û\u0013\u0002ÿ\u0000ÏDý\u0004\nýÒ\u00189ô\n\u000bê#ô\u0007\r\u0003\u0014Þ\u0019\u001cã\u001e\u0002\u000eýý\u0003\u0014Õ0\u000bò\u000fþô\u0012\u0014é\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À\u001a1\u0002\b\bú\u0000\u0011à\u001a\u0000ü\u001aðÒCú\u0012þÌ*&\u0003ü\nþà8ù\bý\u0006\u0012\u0014\u0005ú\u000eûø\u0004\u0000é&\u0003ü\nþú\u0017\u0006Ú*û\u0006\u0018Ü\u001c\u0007ò\u0016\u0006\u0003ü\nþ\u0003\u0014Ø*\bø\u0004\u0010Ú'\u0016ú\u000b\u0004â\u001f\u0019à\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏN÷\u0000\b\u0003\u0014¿\u001c8ýö\u0012û\u0002\u0006\u000fþì\"\u000f\u0006ç\u0018\u0001\u0017\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ý.\bÖ*\u0006\bý\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005Ý&\u0006\u0000\u0019ü\rÕ&\fú\u001d\u0003\u0014Þ!\ní\u001e\u0002\u000eýý\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017\u0011\u0003ú\f\nüí\u001d\u0001\u0017\u0007\u0002ø\u0004ô&ò\u0018ö\u0013\u0003\u0014è\u0017\nû\u0010\râ \u000bó\nð\u001e\b\u0006\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0003\u0014ä\u001b\u0016ð\u0010ø\u0005\u000e\u0003\u0014Þ\u0019\u001cØ\u001f\u0019Ï1ú\u0006\nû\u0006\u0018Ü\u001c".getBytes("ISO-8859-1"), 0, bArr, 0, 799);
        asBinder = bArr;
        onTransact = 230;
        onNavigationEvent();
        onWarmupCompleted = 0;
        onExtraCallbackWithResult = 1;
        onExtraCallback = 4740319646991290861L;
        IAuthTabCallback = 6115251000894149279L;
    }

    static void onNavigationEvent() {
        char[] cArr = new char[2310];
        ByteBuffer.wrap("íùÉ£¥t\u00817|àX§4B\u0010\u0012ÏÉ«\u0091\u0087Dbç^°:w\u00164Íâ©\u0099\u0085Ga\u0014\\Ó8\u0080\u0014Góæ¯²\u008brg.Bÿ>\u009a\u001aQö\b\u00adÌ\u0089\u0083e#@þ<©\u0018jô4Óæ\u008f\u009dkFG\b\"Û\u001e\u0084ú;Ñî\u008d¶imE9 Ø\u001c\u008aøTÔ\u000b³Õo\u0086K!&ï\u0002¨þsÚ:±Úm\u008dIN%\f\u0000ÃüeØ\"·ô\u0093«O}+;\u0006Üâ\u0093ÞUº\u0010\u0091ÄMg))\u0004öà\u00adÜ\u007f¸\u0007\u0097Þs\u0095/W\u000b\u0018æÆÂa¾(\u0095èq¯-z\t\u001aäÑÀ\u008d¼L\u0098\u001fw£S~\u000f)êþÆ ¢{\u009e\u0001uÒQ\u0089\rSé\u001dÄº m\u009c#{ìW¼3Dï\u001eÊÕ¦\u0097\u0082Z~\u0006U½1oí3Èî¤¥\u0080G|\u0004[Ö7\u0092\u0013\\Îøª \u0086kb*Yá5¸\u0011\\Í\f¨Ð\u0084\u008e`E_ç;¥\u0017vó2®ø\u008a\u0098f_B\n9Ö\u0015\u0080ñX¬ç\u0088²dv@4?ä\u001b\u008e÷PÓ\b\u008eØj\u0082F9=à\u0019©õjÑ?\u008cúh\u009cDM \u0016\u001fÎû\u0085×$²în¶Jm&<\u001dÇù\u009eÕU±\u0014lØH\u0086$\"\u0003êÿ¨Ûo·:\u0092ÃN\u0090*I\u0006\u0013ýÂÙyµ#\u0090íLª(t\u0004&ãÝß\u008c»R\u0097\u000erÅ.d\n+áöÝ\u00ad¹|\u0095\fpÞ,\u008b\bSä\u0000ÃÇ¿b\u009b'vèR¯\u000e{ê\u0006ÁÐ½\u0097\u0099Su\u001fP¸\f\u007fè+Çô£ \u009fg{\u0003VÍ2\u0088îOÊ\u001b¡¢\u009dpy7Tó0»ìXÈ\u001f§Ë\u0083\u0090\u007f@[\u00196¦\u0012rÎ7¥õ\u0081¤}[Y\u000e4Ã\u0010\u008cÌC«ç\u0087¢ct_3:à\u0016§òC®\n\u0085Èa\u0093]D8û\u0014¯ðm¬,\u008býg\u008cC^?\u0015\u001aÔö\u0098ÒF\u0089ãe§Ah=1\u0018ðô\u009aÐQ\u008c\tkØG\u0082# \u001eâú´Ök²?ióE\u009c!J\u001d\u0014øÎÔ\u0085°%oåK¶'t\u0003>þØÚ\u009f¶K\u0092\u001fIÀ%\u0087\u0001$üîØ¨´v\u0090:OÚ+\u0088\u0007Iã\fÞÚº`\u0096>Mì)³\u0005`á'ÜÄ¸\u008f\u0094Hp\u0016/Þ\u000bzç1Âî¾²\u009abv\u0019-Æ\t\u008båJÁ\u0001¼Þ\u0098dt2Sé\u000f¶ë}Ç\u001a¢È\u009e\u008azLV\u001f\r¡é~Å, ñ\u009c xgT\u00033Çï\u0088ËO§\u001c\u0082¦~pZ.1øí¢É@¥\u000b\u0080Ô|\u0093X\\4\u0006\u0013¤Ïk«(\u0086ïb¼^G:\u0010\u0011ÏÍ\u0091©B\u0084à`§\\t8+\u0017øó¼¯\\\u008b\u0013fÐB\u0095>D\u0015ûñ¨\u00adb\u0089,dã@\u0080<J\u0018\u0014÷ËÓ\u0098\u008fZjüF«\"v\u001e.õýÑ\u0085\u008dPi\u000fDÐ \u0082\u001c ûç×´³ko8Jû&\u009c\u0002Jþ\u0012ÕÎ±\u0085m\"Hå$¶\u0000mü;ÛÄ·\u009e\u0093UO\u0013*Ý\u0006\u0086â=Ùëµµ\u0091nM%(Â\u0004\u008càVÜ\u0015»Ú\u0097xs&.ë\nªæxÂ3¹Ü\u0095\u008bqT-\u000e\bÜäcÀ0¿÷\u009b´w\u007fS\u0018\u000eÇê\u0089ÆJ¢\u0018\u0099ßu|Q3\fñè°Äd \u001b\u009fÉ{\u0089WL3\u0003î¡Êf¦4\u009dëy¹U~1\u001cìÓÈ\u0090¤R\u0080\u0004\u007f£[i76\u0012ôÎ½ªX\u0086\u0006}ÌY\u008a5X\u0011\u001fÌ¼¨s\u00840có_¤;C\u0017\ròÖ®\u0094\u008a[aø]¿9m\u00153ðà¬§\u0088Ed\bCÈ?\u008f\u001b]öáÒ°\u008ewj4Aû=\u0098\u0019Cõ\rÐÊ\u008c\u009dh_Gü#³\u001fqû:Öä²\u0085nDJ\u0016!Í\u001d\u009fù'Ôþ°µlsH5'æ\u0003\u0082ÿFÛ\b¶Ï\u0092\u009eN&%ð\u0001¯ýwÙ\"´Ù\u0090\u0084LH(\n\u0007Áã\u009cß!ºò\u0096±rz.$\u0005Ûá\u008aÝH¹\f\u0094Ûpm,>\u000bõç°Ã~íøU$q~\u001d©9öÄ#à{\u008c\u009b¨Òw\u0015\u0013R?\u0086Ú'æw\u0082µ®ñu%\u0011Z=\u0083ÙÈä\u000f\u0080]¬\u009aK8\u0017o3¯ßëú9\u0086F¢\u0097NË\u0015\u00101DÝåø9\u0084p ·Lük!7AÓ\u008eÿÎ\u009a\u0013¦CBýi-5jÑ«ýÿ\u0098\u0004¤X@\u0089lÉ\u000b\u0007×[óà\u009e5ºuF²bâ\t\u0007ÕYñ\u008b\u009dÐ¸\u0005D¥`â\u000f2+w÷§\u0093à¾\u0001ZNf\u008f\u0002Ó)\u0018õ¼\u0091í¼1Xkd¿\u0000Ä/\u0017ËI\u0097\u0096³È^\u001bz»\u0006û-5Ér\u0095¤±Û\\\rxQ\u0004\u0084 ßÏ|ë¸·éR6~`\u001a¦&ÁÍ\u000eéHµ\u008dQÙ||\u0018±$ëÃ0ïb\u008b\u009aWÃr\b\u001eN:\u009dÆÀí|\u0089¯Uëp+\u001cy8\u009cÄÓã\u000b\u008fJ«\u0080v%\u0012b>´Úïá=\u008da©\u0081uÔ\u0010\r<SØ\u0087ç3\u0083m¯ªKì\u0016&2EÞ\u0082úÔ\u0081\r\u00ad]I\u0080\u001480oÜ´øé\u00879£\\O\u0096kË6\u0010ÒBþþ\u0085#¡hMªié4;Ð@ü\u0092\u0098À§\u0013CXoù\n1Ökò«\u009eê¥\u0005ABm\u0093\t×Ô\u001cðE\u009cü»/Goc©\u000fù*\u0019öU\u0092\u008b¾ÐE\u0001a»\rã(3ôw\u0090£¼ä[\u0001gN\u0003\u008f/ÓÊ\u0018\u0096¹²ðY+ej\u0001«-ÅÈ\u0002\u0094W°\u0088\\Ý{\u001a\u0007¿#÷Î5êr¶§RÞy\r\u0005J!\u008bÍßè~´ºPé\u007f6\u001bc'¡ÃÁî\u001b\u008aIV\u0093rÀ\u0019|%\u00adÁêì,\u0088fT\u0085pÂ\u001f\u0014;MÇ\u009dãÀ\u008eyª¯vá\u001d.9yÅ\u0086áÓ\u008c\u0010¨Qt\u009e\u0013;?wÛ©çö\u0082#®nJ\u0081\u0016Î=\u000bÙOå\u0099\u0080=¬xH«\u0014ð3%ßEû\u0082\u0087×¢\nN]j\u008f1?Ýoù´\u0085í 'LGh\u00974ËÓ\u000fÿ@\u009bå¦\"Bsn·\nüÑ%ý\\\u0099\u008f¥Ë@\u000blY\bæ×2ów\u009f±»þF\u001ab^\u000e\u0089*Öñ\u0002\u009dE¹áD;`j\f³(ç÷\u0018\u0093M¿\u008a[Îf\u0000\u0002¥.âõ6\u0091o½½Yïd\u0019\u0000O,\u008fÈÉ\u0097\u0019³¦_òz2\u0006q\" ÎÑ\u0095\u0003±]]\u0088yÝ\u0004\u001a ¾Ìõë5·gS \u007fÇ\u001a\f&TÂ\u008aîßµ}Q¼}é\u00186$eÀ»ìÀ\u008b\u0016WUs\u0092\u001fÆ:~Æ\u00adâÿ\u0089+U\u007fq\u009b\u001dÛ8\tÄVà\u0082\u008cÂ«aw»\u0013ï>3Úxæ\u0098\u0082Ù©\u000buE\u0011\u0084<%Øbä¶\u0080â¯=Ko\u0017\u00953ÏÞ\u0014úK\u0086\u0085\u00ad'Iv\u0015²1ñÜ>øZ\u0084\u009b ÉO\rk]7\u0085Ò>þo\u009a´¦ëM$iG5\u0099ÑÞü\u0011\u0098^¤ÿC#o|\u000b«×ýò\"\u009eZº\u008fFÔm\u000b\tGÕçð5\u009ct¸±Dþc\u001d\u000fC+\u0088÷Î\u0092\u001d¾ZZþa6\ru)¬õí\u0090\u0007¼XX\u0096dÑ\u0003\u001e/ºËú\u0096)²h^©zû\u0001\u001f-WÉ\u0095\u0095É°\u0003\\§xì\u00074#hÏ¿ëÚ¶\u0017RI~\u0089\u001aÅ!\u001bÍ éð´!Ps|¢\u0018Þ'\rÃ^ï\u008f\u008bßVdr¼\u001eü%7Ádí»\u0089ÀT\u0010pM\u001c\u00938ÃÇgã³\u008fôª1vb\u0012\u0085>ÂÅ\u0016áN\u008d\u009d©Ätu\u0010¯<àÛ,çy\u0083\u0086¯ÒJ\u0012\u0016Q2\u0080Ù1åc\u0081·\u00adïH=\u0014z0\u009eÜÛû\u0015\u0087J£\u0099N9jw6«Òèù\"\u0085E¡\u0082MÑh\b4]Ð\u008eÿ9\u009bo§´Cén9\nFÖ\u0093òÖ\u0099\u0011¥^Aúl;\biÔ\u00adðý\u009f%»^G\u008fcË\u000e\t*Yöæ\u009d2¹rE±aê\f\u001c(Cô\u009c\u0090Í¿\u001d[Zgþ\u00026.uÊ¬\u0096í½\u0007YSe\u0093\u0001Ñ,\u001eÈº\u0094÷³)_i{¦\u0007û\"\u001bÎTê\u0095¶Ê]\u0004y§\u0005ì 3Ìnè¿´ßS\u0003\u007f\\\u001b\u008c'ÝÂ\u001aî»\u008aïQ4}m\u0019¤%ÇÀ\fìT\u0088\u0089Tßs\u007f\u001f¶;éÆ-âf\u008e»ªÀq\u0010\u001dL9\u0093ÅÆàs\u008c\u00ad¨þw.\u0013\u007f?\u0084ÛÜæ\u0010\u0082W®\u0088JÂ\u0011a=®Ùêä'\u0080y¬\u0092HÖ\u0017\u000b3Pß\u0087ú=\u0086c¢¨Nï\u0015$1{Ý\u0094ùÛ\u0084\u0015 RL\u0084k87mÓªÿè\u009a?¦PB\u0096nÉ5\u0016ÑEý\u0081\u0098!¤q@ªló\u000b8×Xó\u0095\u009fËº\u000bF_bø\t?Õuñ·\u009dã¸#DA`\u008e\fÊ+\n÷Y\u0093ø¾9Zkf¥\u0002à)\u0005õV\u0091\u0093½×X\u001cdD\u0000ø//Ëa\u0097©³ù^\u0006zR\u0006\u009f\"ÑÉ\u0001\u0095º±ã\\(xh\u0004¥ ûÏ\u001bëO·\u0088SÏ~\u0004\u001a§&ìÍ4éhµ¿QÚ|\u0017\u0018I$\u0083ÀÂï\u001b\u008b»Wör5\u001er:¦ÆÞí\r\u0089TU\u0085qß\u001cq8¼Äéã)\u008fg«»wÀ\u0012\u0010>LÚ\u0093æÆ\u008ds©\u00aduÿ\u0010.<\u007fØ\u0091äÃ\u0083\b¯HK\u0084\u0017Û2uÞµúõ\u0081)\u00adbI\u0087\u0015Ì0\u0014ÜHø\u009f\u00871£yO©ké6%Ò{þ\u0080\u009aÐ¡\fMSi\u008d4=Ðmü¾\u0098ë§?CDo\u009c\u000bÐÖ\u0017òI\u009e\u0081¥!Anmª\tçÔ9ðZ\u009c\u0091¸ÕG\u0011cB\u000fù*<öi\u0092¶¾âE.aA\r\u0092)Õô\u000e\u0090E¼ø[-gj\u0003®/êÊ\u0005\u0096B²\u0091^Ìe\u001d\u0001Z-ùÈ;\u0094u°¬\\ì{\u0007\u0007R#\u009fÏÑê\u001e¶½Röy)\u0005j!¡Íãè\u0001´RP\u0089|Ê\u001b\u0019'¦Ãòî5\u008aqV§rÙ\u0019\u0003%HÁ\u008eíÁ\u0088\u001bT pö\u001f(;sÇ¤ãÛ\u008e\u0017ªKv\u0089\u0012Ê9eÅºáõ\u008c7¨et¢\u0010Á?\u000eÛLç\u008d\u0083Ù®~J°\u0016ë=)Ùfå\u0085\u0081Â¬\u0010HH\u0014\u009d0Úßxû·\u0087õ¢2N`j\u009e6ÍÝ\nùH\u0085\u0086 %Lbh°4êÓ=ÿf\u009b\u009d§ÛB\u0015nJ\n\u0085Ñ'ýu\u0099²¥ñ@>l\\\b\u009dÔÉó\u000f\u009fG»\u009bF bv\u000e¯*óñ8\u009d^¹\u0096EË`\u0010\fF(ñ÷#\u0093h¿®[éf;\u0002@.\u0096ÊÀ\u0091\u0013½DYûd8\u0000k,¨Èà\u0097\u0005³Z_\u0095{×\u0006\u0005\"BÎá\u0095.±o]¯yù\u0004\u001e PÌ\u008bèÉ·\u0006S¥\u007fâ\u001a3&jÂ½îúµ\u001bQQ}\u0095\u0019Ò$\u0003À¸ìí\u008b*Wks \u001fÅ:\u0002ÆPâ\u0082\u008eÝU\u0006q¼\u001dó85Äjà¦\u008cÇ«\u0010wV\u0013\u008c?ßÚdæ¹\u0082õ©7ud\u0011¦=ÁØ\u0017äL\u0080\u0093¬ØK}\u0017µ3ëÞ0úe\u0086\u009c¢ÃI\b\u0015M1\u0087ÝÛø`\u0084µ ïO3kx7\u009dÓÖþ\u000b\u009aH¦\u0084M%ib5³Ñãü=\u0098e¤\u0095@Ïo\u0014\u000bI×\u008dò'\u009elº±Fäm?\t[Õ\u0097ñÉ\u009c\u0016¸FD\u0087c!\u000fv+®÷ó\u00928¾\\Z\u0091\u0082Å¦\u009fÊHî\u0017\u0013Â7\u009a[}\u007f3 êÄ²èy\rÙ1\u008cUWy\r¢ÆÆ¤ê\u007f\u000e53ïW¼{g\u009cÝÀ\u0094äT\b\u0013-ÀQ¦um\u00993Âðæ¿\n\u001e/ÂS\u0091wK\u009b\u001c¼Ãà½\u0004n(,Mëq¸\u0095\u0019¾Øâ\u008a\u0006Q*\u0005Oäsº\u0097t»6Üý\u0000®$\u0000IÏm\u0081\u0091Rµ\u0005Þû\u0002·&jJ)oá\u0093D·\u001fØÕü\u008b \\D\u001biý\u008d²±tÕ*þâ\"FF\rk×\u008f\u008d³^×%øÿ\u001c¶@vd=\u0089ç\u00ad_Ñ\u000eúÕ\u001e\u008fBGf&\u008bí¯·Óh÷>\u0018\u0099<_`\u001c\u0085Ö©\u0085ÍEñ \u001a÷>¨br\u0086 «\u009fÏLó\u000b\u0014Í8\u0087\\d\u0080:¥òÉ¶í}\u0011':\u009a^N\u0082\u0015§ÏË\u0083ïf\u0013-4÷X¤|~¡ÅÅ\u009fé]\r\u00166ÄZ\u0086~`¢3Çíë²\u000fe0ÛT\u0099xJ\u009c\u000fÁÊå¤\tc-<Vöz½\u009edÃÜç\u008e\u000bM/\tPØt§\u0098r¼7áð\u0005 )\u0010RÂv\u0089\u009aH¾\u0001íùÉ£¥t\u00817|àX§4B\u0010\u0012ÏÉ«\u0091\u0087Dbà^©:v\u0016-Íü©\u0098\u0085_a\u000b\\Ê8\u009a\u0014\\óü¯³\u008bvg.Bå>\u0085\u001aPö\b\u00adÖ\u0089\u0082e9@à<´\u0018kô?Óæ\u008f\u0088kRG\t\"Ð\u001e\u0084ú;Ñï\u008d¶ivE9 Ø\u001c\u009føJÔ\n³Áo\u0099K<&ó\u0002°þnÚ9±Äm\u008cIV%\r\u0000ÛüxØ#·ê\u0093·O`+'\u0006Æâ\u0092ÞIº\u0015\u0091ÄM{)$\u0004öà±Ü|¸\u0006\u0097Þs\u0095/_\u000b\u0000æÇÂa¾.\u0095èq¯-y\t\u0007äÐÀ\u0088¼T\u0098\u0002w¹Sc\u000f*êêÆ½¢x\u009e\u0004uÒQ\u0089\rSé\u001bÄº j\u009c6{ñW¾3Dï\u001eÊÊ¦\u0095\u0082@~\u0012U£1rí)Èó¤¼\u0080Z|\u0011[Ë7\u0095\u0013BÎùª£\u0086nb*Yý5¸\u0011EÍ\u0012¨É\u0084\u0093`__ú;®\u0017ió,®ã\u008a\u0085fJB\u00149Þ\u0015\u009cñF¬ý\u0088¯d}@.?ð\u001b\u009a÷JÓ\u000f\u008eÌj\u009fF&=ä\u0019´õ~Ñ<\u008cæh\u009dDL \u0014\u001fÎû\u009e×:²ínªJp&\"\u001dÙù\u0080ÕI±\nlÁH\u0098$\"\u0003òÿµÛp·?\u0092ÚN\u0084*I\u0006\fýÃÙfµ!\u0090ôL«(~\u00048ãÜß\u008f»V\u0097\u001arÄ.{\n.áîÝ¬¹\u007f\u0095\u0004pÂ,\u0094\bWä\u001eÃÓ¿|\u009b3vöR·\u000edê\u0004ÁÄ½\u0096\u0099Mu\u001cP¸\f\u007fè*Çê£¹\u009f}{\u001cVÓ2\u0096îTÊ\u0004¡¢\u009doy6Tí0¼ìCÈ\u001e§Õ\u0083\u0091\u007f@[\u001b6£\u0012nÎ(¥ó\u0081»}GY\u00104Ë\u0010\u0093Ì\\«ø\u0087£ck_5:à\u0016»òC®\n\u0085Èa\u0093][8ã\u0014°ðw¬2\u008bög\u0098CC?\r\u001aÊö\u0081ÒX\u0089ée²Aq=.\u0018åô\u0085ÐL\u008c\u0016kÑG\u009d#\"\u001eþúµÖu²<iæE\u0081!M\u001d\u0013øÎÔ\u0085°%oíK¶'m\u0003=þÆÚ\u009e¶@\u0092\u0015IÀ%\u009b\u0001#üçØ¨´w\u0090?OÚ+\u0089\u0007Mã\fÞÜºb\u0096>Mõ)´\u0005`á<ÜÆ¸\u0092\u0094Ip\u0011/Û\u000bzç1Âé¾´\u009abv\u0019-Á\t\u008dåJÁ\u0019¼Û\u0098|t+Sõ\u000f®ë|Ç\u0003¢Ð\u009e\u0089zXV\u0002\r¹éaÅ. ê\u009c½xzT\u00043Òï\u0095ËR§\u001d\u0082º~qZ)1÷í¢É@¥\u0002\u0080Ô|\u008bX_4\u0012\u0013¼Ïs«7\u0086ûb¤^G:\b\u0011ËÍ\u008c©Z\u0084í`¾\\m86\u0017àó¾¯E\u008b\u0012fÉB\u0096>X\u0015úñ¨\u00adl\u0089,dã@\u0080<C\u0018\u0014÷ËÓ\u0098\u008fXjüF³\"p\u001e1õäÑ\u009b\u008dHi\tDÌ \u0083\u001c ûæ×´³wo8Jø&\u009c\u0002Oþ\u0015ÕÓ±\u0084m;Hè$¯\u0000lü;ÛÅ·\u009e\u0093LO\u0013*À\u0006\u0087â$Ùèµ¨\u0091oM<(Á\u0004\u0090àWÜ\u0014»Ö\u0097xs?.ì\n¿æ`Â>¹À\u0095\u0092qU-\u0016\bÛäzÀ-¿î\u009b´wbS\u0007\u000eÊê\u0094ÆK¢\u001f\u0099Òu|Q3\fñè²Äd \u0007\u009fÈ{\u008fWL3\u0003î¡Êc¦4\u009d÷y¸U|1\u001cìÓÈ\u0091¤S\u0080\u0004\u007f»[i7(\u0012ìÎ¿ª@\u0086\u0005}ÔY\u008b5Y\u0011\u0019Ì¼¨o\u00840cú_¤;[\u0017\tòÉ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2310);
        onNavigationEvent = cArr;
        asInterface = -6435088822484219502L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 82
            byte[] r0 = o.onResourceReady.asBinder
            int r7 = r7 + 4
            int r6 = r6 + 3
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r6
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r0[r7]
        L22:
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            int r7 = r7 + 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onResourceReady.a(short, int, int, java.lang.Object[]):void");
    }
}
