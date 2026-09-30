package o;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda5 {
    public static final DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1 IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault = null;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static char access100 = 0;
    private static int asBinder = 0;
    private static char[] asInterface = null;
    private static int getInterfaceDescriptor = 0;
    public static String onExtraCallback = null;
    public static String onExtraCallbackWithResult = null;
    public static final DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1 onNavigationEvent;
    private static long onTransact = 0;
    public static final Map<String, DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1> onWarmupCompleted;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;

    static {
        onNavigationEvent();
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        onNavigationEvent(new int[]{0, 14, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001", false, objArr);
        onExtraCallbackWithResult = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        onWarmupCompleted("ꆨᓱ퍟逼⥣݀麻뾗獸⍪謜髟麯\ue7d4䫏출錶糏绛䡘", (char) View.MeasureSpec.makeMeasureSpec(0, 0), "磕鏤ӄ愑", ViewConfiguration.getScrollDefaultDelay() >> 16, "\u0000\u0000\u0000\u0000", objArr2);
        onExtraCallback = (String) objArr2[0];
        Object[] objArr3 = new Object[1];
        onWarmupCompleted("䘙檟눭\ud98a䌝\ue736渡犴흹謏\uf216ꤞ\ue08f씾兙癝誱絟ⳗ赈쪜ﰓ됟鿐獵畒", (char) (56538 - View.MeasureSpec.getMode(0)), "ᥬ\uf472\uda36寜", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", objArr3);
        String str = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        onNavigationEvent(new int[]{14, 21, 0, 4}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true, objArr4);
        String str2 = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        onWarmupCompleted("ꭓ匔\ud8b9ำꈩ\ue263ꝱ䮅\uf7eb迃\ue159\uf745恔こ˓", (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37306), "䖩붪멸撚", 2025695813 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", objArr5);
        String str3 = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        onNavigationEvent(new int[]{35, 45, 0, 33}, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, objArr6);
        onNavigationEvent = new DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1(str, str2, str3, (String) objArr6[0], onWarmupCompleted());
        Object[] objArr7 = new Object[1];
        IAuthTabCallback("\u0007\t\n\u0005\u000f\u0002\r\u0005\u0006\u0002\b\u0007\u000f\b\u0005\u0000\u000e\u0002\b\u0007\u000f\u0004㘶", (byte) (KeyEvent.getDeadChar(0, 0) + 72), 23 - Color.argb(0, 0, 0, 0), objArr7);
        String name = Class.forName((String) objArr7[0]).getName();
        Object[] objArr8 = new Object[1];
        onWarmupCompleted("尼燪鐠⿳艮缬讓콶騂刽뷦ↄ㍊\ue5f8瘎腬", (char) (42222 - TextUtils.indexOf((CharSequence) "", '0')), "歧鮴\uef86Ფ", TextUtils.getOffsetAfter("", 0), "\u0000\u0000\u0000\u0000", objArr8);
        String str4 = (String) objArr8[0];
        Object[] objArr9 = new Object[1];
        onWarmupCompleted("釲鞙㾭\uda7e馐ዣ䇞냄", (char) Color.blue(0), "\ue858郎ⴔ藌", ViewConfiguration.getJumpTapTimeout() >> 16, "\u0000\u0000\u0000\u0000", objArr9);
        String str5 = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        onNavigationEvent(new int[]{80, 59, 0, 2}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", false, objArr10);
        IAuthTabCallback = new DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1(name, str4, str5, (String) objArr10[0], IAuthTabCallback());
        onWarmupCompleted = onExtraCallback();
        int i = access000 + 81;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1 onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        Map<String, DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1> map = onWarmupCompleted;
        if (!map.containsKey(str)) {
            int i2 = getInterfaceDescriptor + 9;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1 defaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1 = map.get(str);
        if (i5 != 0) {
            return defaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1;
        }
        throw new NullPointerException();
    }

    private static Map<String, DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6> onWarmupCompleted() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        onWarmupCompleted("\u2002梁鼴굾幬杮ﭽ䍭\uec39꿖쌊䇿넪킇", (char) (Color.alpha(0) + 56034), "磐竩\ue209忚", ViewConfiguration.getKeyRepeatDelay() >> 16, "\u0000\u0000\u0000\u0000", objArr);
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        onWarmupCompleted("\u2002梁鼴굾幬杮ﭽ䍭\uec39꿖쌊䇿넪킇", (char) (56034 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "磐竩\ue209忚", 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0000\u0000\u0000\u0000", objArr2);
        map.put(str, new DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6((String) objArr2[0], new Class[]{String.class, Integer.TYPE}));
        if (Build.VERSION.SDK_INT >= 29) {
            Object[] objArr3 = new Object[1];
            onWarmupCompleted("\uef9a囅压\u242d㪒\udf61锄ɸﾙ陂\u2d6d\uf23f鮷ଫⰰᄃ歊럝艙", (char) (41519 - View.resolveSize(0, 0)), "ꐋ喜⾐잢", ExpandableListView.getPackedPositionType(0L) - 1873437532, "\u0000\u0000\u0000\u0000", objArr3);
            String str2 = (String) objArr3[0];
            Object[] objArr4 = new Object[1];
            onWarmupCompleted("\uef9a囅压\u242d㪒\udf61锄ɸﾙ陂\u2d6d\uf23f鮷ଫⰰᄃ歊럝艙", (char) (((Process.getThreadPriority(0) + 20) >> 6) + 41519), "ꐋ喜⾐잢", TextUtils.indexOf((CharSequence) "", '0', 0) - 1873437531, "\u0000\u0000\u0000\u0000", objArr4);
            map.put(str2, new DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6((String) objArr4[0], new Class[]{Integer.TYPE}));
            int i2 = IAuthTabCallbackStubProxy + 115;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
        return map;
    }

    private static Map<String, DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6> IAuthTabCallback() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        onWarmupCompleted("툴勖좤뇭꼠蚝韀ꍍ̳", (char) (ExpandableListView.getPackedPositionChild(0L) + 1), "ᷜ븗詨✪", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1757288221, "\u0000\u0000\u0000\u0000", objArr);
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        onWarmupCompleted("툴勖좤뇭꼠蚝韀ꍍ̳", (char) TextUtils.indexOf("", "", 0, 0), "ᷜ븗詨✪", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1757288221, "\u0000\u0000\u0000\u0000", objArr2);
        map.put(str, new DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6((String) objArr2[0], new Class[0]));
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    private static Map<String, DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1> onExtraCallback() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(onExtraCallbackWithResult, onNavigationEvent);
        map.put(onExtraCallback, IAuthTabCallback);
        int i2 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    private static void onWarmupCompleted(String str, char c, String str2, int i, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        char[] charArray3;
        int i2 = 2 % 2;
        if (str3 == null) {
            charArray = str3;
        } else {
            int i3 = writeTypedObject + 83;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        if (str2 == null) {
            charArray2 = str2;
        } else {
            int i5 = writeTypedObject + 103;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                throw new ArithmeticException();
            }
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        if (str == null) {
            charArray3 = str;
        } else {
            int i6 = writeTypedObject + 87;
            readTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                throw new ArithmeticException();
            }
            charArray3 = str.toCharArray();
        }
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
            int i7 = writeTypedObject + 9;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            int i9 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 2) % 4;
            int i10 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 3) % 4;
            networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted = (char) (((cArr3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent % 4] * 32718) + cArr4[i9]) % 65535);
            cArr4[i10] = (char) (((cArr3[i10] * 32718) + cArr4[i9]) / 65535);
            cArr3[i10] = networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted;
            cArr5[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent] = (char) ((((cArr3[i10] ^ r3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent]) ^ (onTransact ^ 5161337353776785399L)) ^ ((int) (asBinder ^ 5161337353776785399L))) ^ ((char) (IAuthTabCallbackStub ^ 5161337353776785399L)));
            networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent++;
        }
        objArr[0] = new String(cArr5);
    }

    private static void IAuthTabCallback(String str, byte b, int i, Object[] objArr) {
        int i2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue();
        char[] cArr2 = asInterface;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (cArr2[i3] ^ 6292690160322140727L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (6292690160322140727L ^ access100);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            reorderingBufferQueue.onNavigationEvent = 0;
            while (reorderingBufferQueue.onNavigationEvent < i2) {
                reorderingBufferQueue.onExtraCallbackWithResult = cArr[reorderingBufferQueue.onNavigationEvent];
                reorderingBufferQueue.IAuthTabCallback = cArr[reorderingBufferQueue.onNavigationEvent + 1];
                if (reorderingBufferQueue.onExtraCallbackWithResult == reorderingBufferQueue.IAuthTabCallback) {
                    cArr4[reorderingBufferQueue.onNavigationEvent] = (char) (reorderingBufferQueue.onExtraCallbackWithResult - b);
                    cArr4[reorderingBufferQueue.onNavigationEvent + 1] = (char) (reorderingBufferQueue.IAuthTabCallback - b);
                } else {
                    reorderingBufferQueue.onWarmupCompleted = reorderingBufferQueue.onExtraCallbackWithResult / c;
                    reorderingBufferQueue.asBinder = reorderingBufferQueue.onExtraCallbackWithResult % c;
                    reorderingBufferQueue.onExtraCallback = reorderingBufferQueue.IAuthTabCallback / c;
                    reorderingBufferQueue.onTransact = reorderingBufferQueue.IAuthTabCallback % c;
                    if (reorderingBufferQueue.asBinder == reorderingBufferQueue.onTransact) {
                        reorderingBufferQueue.onWarmupCompleted = ((reorderingBufferQueue.onWarmupCompleted + c) - 1) % c;
                        reorderingBufferQueue.onExtraCallback = ((reorderingBufferQueue.onExtraCallback + c) - 1) % c;
                        int i4 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.asBinder;
                        int i5 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.onTransact;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i4];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i5];
                    } else if (reorderingBufferQueue.onWarmupCompleted == reorderingBufferQueue.onExtraCallback) {
                        reorderingBufferQueue.asBinder = ((reorderingBufferQueue.asBinder + c) - 1) % c;
                        reorderingBufferQueue.onTransact = ((reorderingBufferQueue.onTransact + c) - 1) % c;
                        int i6 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.asBinder;
                        int i7 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.onTransact;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i6];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i7];
                    } else {
                        int i8 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.onTransact;
                        int i9 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.asBinder;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i8];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i9];
                    }
                }
                reorderingBufferQueue.onNavigationEvent += 2;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void onNavigationEvent(int[] iArr, String str, boolean z, Object[] objArr) throws UnsupportedEncodingException {
        char[] cArr;
        String str2 = str;
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        writeTypedObject = i2 % 128;
        byte[] bytes = str2;
        if (i2 % 2 == 0) {
            throw new NullPointerException();
        }
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda0 = new UtilExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = IAuthTabCallbackDefault;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = readTypedObject + 7;
                writeTypedObject = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr3[i7] = (char) (cArr2[i7] % 4301814714517170301L);
                } else {
                    cArr3[i7] = (char) (cArr2[i7] - 4301814714517170301L);
                    i7++;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr == null) {
            cArr = cArr4;
        } else {
            char[] cArr5 = new char[i4];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[utilExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    cArr5[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (((cArr4[utilExternalSyntheticLambda0.onNavigationEvent] << 1) + 1) - c);
                } else {
                    cArr5[utilExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArr4[utilExternalSyntheticLambda0.onNavigationEvent] << 1) - c);
                }
                c = cArr5[utilExternalSyntheticLambda0.onNavigationEvent];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr, 0, cArr6, 0, i4);
            int i9 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr, i9, i6);
            System.arraycopy(cArr6, i6, cArr, 0, i9);
        }
        if (z) {
            char[] cArr7 = new char[i4];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = readTypedObject + 115;
                writeTypedObject = i10 % 128;
                int i11 = i10 % 2;
                cArr7[utilExternalSyntheticLambda0.onNavigationEvent] = cArr[(i4 - utilExternalSyntheticLambda0.onNavigationEvent) - 1];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr = cArr7;
        }
        if (i5 > 0) {
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr[utilExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                utilExternalSyntheticLambda0.onNavigationEvent++;
                int i12 = writeTypedObject + 73;
                readTypedObject = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallbackWithResult() {
        onTransact = 5161337353776785399L;
        asBinder = 835839991;
        IAuthTabCallbackStub = (char) 25767;
        IAuthTabCallbackDefault = new char[]{10405, 10453, 10463, 10468, 10467, 10465, 10467, 10454, 10452, 10468, 10468, 10465, 10467, 10472, 10422, 10479, 10480, 10473, 10464, 10463, 10464, 10472, 10474, 10459, 10467, 10483, 10475, 10476, 10476, 10475, 10472, 10447, 10455, 10478, 10470, 10415, 10470, 10478, 10446, 10444, 10475, 10442, 10424, 10441, 10453, 10463, 10468, 10467, 10465, 10467, 10454, 10452, 10468, 10468, 10465, 10467, 10472, 10440, 10424, 10464, 10481, 10472, 10432, 10423, 10462, 10477, 10480, 10485, 10474, 10468, 10470, 10472, 10477, 10473, 10467, 10438, 10437, 10470, 10475, 10478, 10425, 10485, 10474, 10468, 10470, 10472, 10477, 10473, 10467, 10438, 10447, 10476, 10468, 10475, 10447, 10436, 10463, 10464, 10465, 10473, 10480, 10475, 10466, 10466, 10471, 10471, 10475, 10483, 10448, 10424, 10434, 10447, 10464, 10465, 10473, 10480, 10475, 10466, 10466, 10471, 10471, 10475, 10483, 10464, 10452, 10468, 10468, 10465, 10467, 10472, 10440, 10424, 10464, 10481, 10472, 10432, 10423, 10462, 10477};
    }

    static void onNavigationEvent() {
        asInterface = new char[]{55859, 61315, 61390, 61380, 61401, 61388, 61407, 61397, 55860, 61385, 61422, 61379, 61384, 55861, 61378, 55862};
        access100 = (char) 55859;
    }
}
