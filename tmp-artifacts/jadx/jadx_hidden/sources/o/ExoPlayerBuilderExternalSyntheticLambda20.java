package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda20 {
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static long IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private static int asBinder;
    private static char[] asInterface;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    private static void onExtraCallbackWithResult(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        char[] cArr = str;
        if (str != null) {
            int i3 = asBinder + 121;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            char[] charArray = str.toCharArray();
            int i5 = access000 + 51;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            cArr = charArray;
        }
        RepeatModeUtil repeatModeUtil = new RepeatModeUtil();
        char[] cArrOnExtraCallback = RepeatModeUtil.onExtraCallback(onNavigationEvent ^ 8686948009763778008L, cArr, i);
        repeatModeUtil.IAuthTabCallback = 4;
        while (repeatModeUtil.IAuthTabCallback < cArrOnExtraCallback.length) {
            repeatModeUtil.onNavigationEvent = repeatModeUtil.IAuthTabCallback - 4;
            cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback] = (char) ((cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback] ^ cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback % 4]) ^ (repeatModeUtil.onNavigationEvent * (onNavigationEvent ^ 8686948009763778008L)));
            repeatModeUtil.IAuthTabCallback++;
        }
        String str2 = new String(cArrOnExtraCallback, 4, cArrOnExtraCallback.length - 4);
        int i7 = access000 + 3;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            throw new NullPointerException();
        }
        objArr[0] = str2;
    }

    private static void IAuthTabCallback(int i, char c, int i2, Object[] objArr) {
        ListenerSetExternalSyntheticLambda0 listenerSetExternalSyntheticLambda0 = new ListenerSetExternalSyntheticLambda0();
        long[] jArr = new long[i2];
        listenerSetExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (listenerSetExternalSyntheticLambda0.IAuthTabCallback < i2) {
            int i3 = listenerSetExternalSyntheticLambda0.IAuthTabCallback;
            int i4 = asInterface[i + i3] & 65535;
            long j = IAuthTabCallbackStub;
            jArr[i3] = (((char) ((i4 << 13) | (i4 >>> 3))) ^ (i3 * ((j << 45) | (j >>> 19)))) ^ c;
            listenerSetExternalSyntheticLambda0.IAuthTabCallback++;
        }
        char[] cArr = new char[i2];
        listenerSetExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (listenerSetExternalSyntheticLambda0.IAuthTabCallback < i2) {
            cArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback];
            listenerSetExternalSyntheticLambda0.IAuthTabCallback++;
        }
        objArr[0] = new String(cArr);
    }

    private static void onNavigationEvent(String str, int i, Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        AssetDataSourceAssetDataSourceException assetDataSourceAssetDataSourceException = new AssetDataSourceAssetDataSourceException();
        char[] cArr = new char[charArray.length];
        assetDataSourceAssetDataSourceException.onExtraCallback = 0;
        char[] cArr2 = new char[2];
        while (assetDataSourceAssetDataSourceException.onExtraCallback < charArray.length) {
            cArr2[0] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback];
            cArr2[1] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (onWarmupCompleted - 3974139103868117988L)))) ^ ((c2 >>> 5) + ((char) (onExtraCallbackWithResult - 3974139103868117988L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - (((c3 >>> 5) + ((char) (onExtraCallback - 3974139103868117988L))) ^ ((c3 + i2) ^ ((c3 << 4) + ((char) (IAuthTabCallback - 3974139103868117988L))))));
                i2 -= 40503;
            }
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback] = cArr2[0];
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback + 1] = cArr2[1];
            assetDataSourceAssetDataSourceException.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr, 0, i);
    }

    public static int IAuthTabCallback() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        int i;
        int i2 = 2 % 2;
        int i3 = 1;
        Object[] objArr = new Object[1];
        onNavigationEvent("㳞ェ祜관䍟ⴭ℟銫욙䂑㈾蛿ᜟ\uda07尓桗ᅯ\uf518", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, objArr);
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        IAuthTabCallback((ViewConfiguration.getJumpTapTimeout() >> 16) + 68, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 8 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        String str2 = (String) objArr2[0];
        try {
            Object[] objArr3 = new Object[1];
            onExtraCallbackWithResult("⭚⬻Ⱃ\ue85b檐㎂日\ue737め仛䆱쏗᱓制\u2d69㾃砇뙹ࣙᐈ䗼駇ᒅ灬ꆊﴊ\uf077沬贃셒", (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            onExtraCallbackWithResult("묲뭑ꆯ㔡\ue737\ue132뢉㖇ꃣ썠鳛ᄈ谪\udf8a\uf00f\ued74\ue84d㯇햣울햍ᑼ", (ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr4);
            objInvoke = cls.getMethod((String) objArr4[0], new Class[0]).invoke(null, null);
        } catch (Exception unused) {
            objInvoke = null;
        }
        if (objInvoke == null) {
            int i4 = IAuthTabCallbackDefault + 69;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            int i6 = IAuthTabCallbackDefault + 87;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            i = 3;
        } else {
            i = 1;
        }
        try {
            Object[] objArr5 = new Object[1];
            onExtraCallbackWithResult("ᕇᔦ\udf4f둭駁ᕌ㧔쇮\u0e80붝ᶊ\ue555≆ꅶ煆ᤗ䘢", View.MeasureSpec.getSize(0) + 1, objArr5);
            try {
                Object[] objArr6 = {(String) objArr5[0]};
                Object[] objArr7 = new Object[1];
                onNavigationEvent("㳞ェ祜관䍟ⴭ℟銫實퉵鱴\uf660̌敌퉻\uda05袼ᴗ鱴\uf660\ue74cﮝຜ뽵", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                onNavigationEvent("ᘙ悦鞖㾀龽좉\ud835呎㝹\u0b4a؇㲴ை鐝尓桗", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, objArr8);
                Object objInvoke2 = cls2.getMethod((String) objArr8[0], String.class).invoke(objInvoke, objArr6);
                Class<?> cls3 = objInvoke2.getClass();
                Object[] objArr9 = new Object[1];
                onExtraCallbackWithResult("᧸ᦕ珫⒐㕕\u2d75꤯燎Ⱥᄣ赽\udd6b", 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
                Field declaredField = cls3.getDeclaredField((String) objArr9[0]);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke2);
                Class<?> cls4 = obj.getClass();
                Object[] objArr10 = new Object[1];
                onExtraCallbackWithResult("㓆㒧\ue0cd긪ꙓ鳁⎲䡯⼜興߁泈", Color.alpha(0) + 1, objArr10);
                IBinder iBinder = (IBinder) cls4.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(obj, new Object[0]);
                try {
                    Class<?> cls5 = Class.forName(str);
                    Object[] objArr11 = new Object[1];
                    IAuthTabCallback((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 6, objArr11);
                    Parcel parcel = (Parcel) cls5.getMethod((String) objArr11[0], null).invoke(null, null);
                    try {
                        Class<?> cls6 = Class.forName(str);
                        Object[] objArr12 = new Object[1];
                        IAuthTabCallback((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, objArr12);
                        Object objInvoke3 = cls6.getMethod((String) objArr12[0], null).invoke(null, null);
                        int i8 = IAuthTabCallbackDefault + 37;
                        onTransact = i8 % 128;
                        int i9 = i8 % 2;
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objArr13 = new Object[1];
                                        IAuthTabCallback(TextUtils.indexOf("", "", 0) + 6, (char) KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0') + 19, objArr13);
                                        Class<?> cls7 = Class.forName((String) objArr13[0]);
                                        Object[] objArr14 = new Object[1];
                                        onNavigationEvent("ᘙ悦៎᠒鱴\uf660؇㲴嬋螻尓桗ᇬ㜫\u2fde눈쮶紌㿡\uf204ꙛ⁇", 21 - TextUtils.lastIndexOf("", '0', 0), objArr14);
                                        try {
                                            Object[] objArr15 = {cls7.getMethod((String) objArr14[0], null).invoke(iBinder, null)};
                                            Class<?> cls8 = Class.forName(str);
                                            Object[] objArr16 = new Object[1];
                                            IAuthTabCallback(24 - View.MeasureSpec.getSize(0), (char) (39902 - (ViewConfiguration.getJumpTapTimeout() >> 16)), ExpandableListView.getPackedPositionChild(0L) + 20, objArr16);
                                            cls8.getMethod((String) objArr16[0], String.class).invoke(parcel, objArr15);
                                            parcel.writeStrongBinder(iBinder);
                                            parcel.writeInt(-1);
                                            int i10 = onTransact + 65;
                                            IAuthTabCallbackDefault = i10 % 128;
                                            int i11 = i10 % 2;
                                            try {
                                                Object[] objArr17 = {Integer.valueOf(i), parcel, objInvoke3, 0};
                                                Object[] objArr18 = new Object[1];
                                                IAuthTabCallback(View.MeasureSpec.makeMeasureSpec(0, 0) + 6, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, objArr18);
                                                Class<?> cls9 = Class.forName((String) objArr18[0]);
                                                Object[] objArr19 = new Object[1];
                                                onNavigationEvent("完綾㳞ェ璟既ഓ㾭", 8 - Color.blue(0), objArr19);
                                                try {
                                                    Class<?> cls10 = Class.forName(str);
                                                    Object[] objArr20 = new Object[1];
                                                    IAuthTabCallback(43 - View.MeasureSpec.getSize(0), (char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 8, objArr20);
                                                    if (((Integer) cls10.getMethod((String) objArr20[0], null).invoke(objInvoke3, null)).intValue() < 0) {
                                                        int i12 = IAuthTabCallbackDefault + 111;
                                                        int i13 = i12 % 128;
                                                        onTransact = i13;
                                                        int i14 = i12 % 2;
                                                        int i15 = i13 + 81;
                                                        IAuthTabCallbackDefault = i15 % 128;
                                                        int i16 = i15 % 2;
                                                        try {
                                                            try {
                                                                Class<?> cls11 = Class.forName(str);
                                                                Object[] objArr21 = new Object[1];
                                                                onNavigationEvent("齃슩嘉્\ude0b쯾\uebd5㛫욙䂑赪饄\ude7f톏닰厞", TextUtils.indexOf("", "", 0, 0) + 15, objArr21);
                                                                cls11.getMethod((String) objArr21[0], Integer.TYPE).invoke(objInvoke3, 0);
                                                                try {
                                                                    Class<?> cls12 = Class.forName(str);
                                                                    Object[] objArr22 = new Object[1];
                                                                    onNavigationEvent("熺걂춹䅬멸粍尓桗㿡\uf204\ude7f톏닰厞", '=' - AndroidCharacter.getMirror('0'), objArr22);
                                                                    cls12.getMethod((String) objArr22[0], null).invoke(objInvoke3, null);
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
                                                        } catch (Exception e) {
                                                            try {
                                                                Object[] objArr23 = new Object[1];
                                                                onNavigationEvent("ｉ挷ìฅ֡䥛㳞ェ\ud90eᏚꝔꄫ鮒똯鮗⚋\ue86e\ue6a0픒폘", TextUtils.indexOf("", "", 0) + 19, objArr23);
                                                                Class<?> cls13 = Class.forName((String) objArr23[0]);
                                                                Object[] objArr24 = new Object[1];
                                                                IAuthTabCallback(50 - TextUtils.getCapsMode("", 0, 0), (char) Color.alpha(0), 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr24);
                                                                Object objInvoke4 = cls13.getMethod((String) objArr24[0], null).invoke(e, null);
                                                                if (objInvoke4 != null) {
                                                                    try {
                                                                        Object[] objArr25 = new Object[1];
                                                                        onNavigationEvent("ｉ挷ìฅ֡䥛㳞ェ\ud90eᏚꝔꄫ鮒똯鮗⚋\ue86e\ue6a0픒폘", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, objArr25);
                                                                        Class<?> cls14 = Class.forName((String) objArr25[0]);
                                                                        Object[] objArr26 = new Object[1];
                                                                        IAuthTabCallback((Process.myPid() >> 22) + 58, (char) Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0') + 11, objArr26);
                                                                        if (cls14.getMethod((String) objArr26[0], null).invoke(objInvoke4, null) != null) {
                                                                            int i17 = onTransact + 39;
                                                                            int i18 = i17 % 128;
                                                                            IAuthTabCallbackDefault = i18;
                                                                            if (i17 % 2 == 0) {
                                                                                throw new NullPointerException();
                                                                            }
                                                                            int i19 = i18 + 107;
                                                                            onTransact = i19 % 128;
                                                                            int i20 = i19 % 2;
                                                                            try {
                                                                                Object[] objArr27 = new Object[1];
                                                                                onNavigationEvent("ｉ挷ìฅ֡䥛㳞ェ\ud90eᏚꝔꄫ鮒똯鮗⚋\ue86e\ue6a0픒폘", 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr27);
                                                                                Class<?> cls15 = Class.forName((String) objArr27[0]);
                                                                                Object[] objArr28 = new Object[1];
                                                                                IAuthTabCallback(58 - TextUtils.indexOf("", "", 0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 10 - ((Process.getThreadPriority(0) + 20) >> 6), objArr28);
                                                                                String str3 = (String) cls15.getMethod((String) objArr28[0], null).invoke(objInvoke4, null);
                                                                                onExtraCallbackWithResult("鿭龥꿞夿\ue95c暺풊눖萛촍\uf0d8隥꣢퇮", -TextUtils.lastIndexOf("", '0'), new Object[1]);
                                                                                if (!str3.contains((String) r3[0])) {
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                Throwable cause3 = th3.getCause();
                                                                                if (cause3 != null) {
                                                                                    throw cause3;
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        Throwable cause4 = th4.getCause();
                                                                        if (cause4 != null) {
                                                                            throw cause4;
                                                                        }
                                                                        throw th4;
                                                                    }
                                                                }
                                                            } catch (Throwable th5) {
                                                                Throwable cause5 = th5.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th5;
                                                            }
                                                        }
                                                        i3 = 0;
                                                    }
                                                    try {
                                                        try {
                                                            Class.forName(str).getMethod(str2, null).invoke(parcel, null);
                                                        } catch (Throwable th6) {
                                                            Throwable cause6 = th6.getCause();
                                                            if (cause6 != null) {
                                                                throw cause6;
                                                            }
                                                            throw th6;
                                                        }
                                                    } catch (Throwable unused2) {
                                                    }
                                                    try {
                                                        Class.forName(str).getMethod(str2, null).invoke(objInvoke3, null);
                                                        return i3;
                                                    } catch (Throwable th7) {
                                                        Throwable cause7 = th7.getCause();
                                                        if (cause7 != null) {
                                                            throw cause7;
                                                        }
                                                        throw th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    Throwable cause8 = th8.getCause();
                                                    if (cause8 != null) {
                                                        throw cause8;
                                                    }
                                                    throw th8;
                                                }
                                            } catch (Throwable th9) {
                                                Throwable cause9 = th9.getCause();
                                                if (cause9 != null) {
                                                    throw cause9;
                                                }
                                                throw th9;
                                            }
                                        } catch (Throwable th10) {
                                            Throwable cause10 = th10.getCause();
                                            if (cause10 != null) {
                                                throw cause10;
                                            }
                                            throw th10;
                                        }
                                    } catch (Exception unused3) {
                                        Class.forName(str).getMethod(str2, null).invoke(parcel, null);
                                        int i21 = IAuthTabCallbackDefault + 91;
                                        onTransact = i21 % 128;
                                        int i22 = i21 % 2;
                                        try {
                                            Class.forName(str).getMethod(str2, null).invoke(objInvoke3, null);
                                            return 0;
                                        } catch (Throwable th11) {
                                            Throwable cause11 = th11.getCause();
                                            if (cause11 != null) {
                                                throw cause11;
                                            }
                                            throw th11;
                                        }
                                    }
                                } catch (Throwable th12) {
                                    Throwable cause12 = th12.getCause();
                                    if (cause12 != null) {
                                        throw cause12;
                                    }
                                    throw th12;
                                }
                            } catch (Throwable th13) {
                                Throwable cause13 = th13.getCause();
                                if (cause13 != null) {
                                    throw cause13;
                                }
                                throw th13;
                            }
                        } catch (Throwable th14) {
                            try {
                                Class.forName(str).getMethod(str2, null).invoke(parcel, null);
                                int i23 = IAuthTabCallbackDefault + 121;
                                onTransact = i23 % 128;
                                int i24 = i23 % 2;
                                try {
                                    Class.forName(str).getMethod(str2, null).invoke(objInvoke3, null);
                                    throw th14;
                                } catch (Throwable th15) {
                                    Throwable cause14 = th15.getCause();
                                    if (cause14 != null) {
                                        throw cause14;
                                    }
                                    throw th15;
                                }
                            } catch (Throwable th16) {
                                Throwable cause15 = th16.getCause();
                                if (cause15 != null) {
                                    throw cause15;
                                }
                                throw th16;
                            }
                        }
                    } catch (Throwable th17) {
                        Throwable cause16 = th17.getCause();
                        if (cause16 != null) {
                            throw cause16;
                        }
                        throw th17;
                    }
                } catch (Throwable th18) {
                    Throwable cause17 = th18.getCause();
                    if (cause17 != null) {
                        throw cause17;
                    }
                    throw th18;
                }
            } catch (Throwable th19) {
                Throwable cause18 = th19.getCause();
                if (cause18 != null) {
                    throw cause18;
                }
                throw th19;
            }
        } catch (Throwable unused4) {
            return 0;
        }
    }

    static {
        onExtraCallbackWithResult();
        onNavigationEvent = 3088196076319337269L;
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = (char) 3062;
        onExtraCallback = (char) 60657;
        onWarmupCompleted = (char) 7577;
        onExtraCallbackWithResult = (char) 3538;
        asInterface = new char[]{888, 28474, 56308, 18295, 46057, 8124, 776, 28506, 56180, 18415, 46041, 8068, 35798, 62568, 25147, 52981, 14560, 42994, 5109, 32071, 59713, 21884, 49582, 11577, 56652, 45390, 1512, 39211, 28029, 49264, 21874, 10316, 48287, 4105, 58452, 30790, 52233, 41939, 13925, 35792, 7978, 62325, 18263, 912, 28418, 56156, 18271, 45801, 8124, 35670, 824, 28418, 56308, 18023, 45993, 8036, 35694, 63024, 824, 28418, 56308, 17943, 45961, 8020, 35694, 62992, 25211, 52805, 912, 28418, 56140, 18359, 46009, 8108, 35806};
        IAuthTabCallbackStub = 2635827315474971998L;
    }
}
