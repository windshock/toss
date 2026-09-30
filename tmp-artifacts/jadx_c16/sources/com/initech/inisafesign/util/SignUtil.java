package com.initech.inisafesign.util;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.initech.core.INISAFECore;
import com.initech.core.util.LogUtil;
import com.initech.core.util.TimeDateUtil;
import com.initech.inibase.logger.Logger;
import com.initech.pki.util.Base64Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.Vector;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class SignUtil {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static Logger a = null;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        a = Logger.getLogger("com.initech.inisafesign.util.SignUtil");
        int i = asInterface + 41;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 42 / 0;
        }
    }

    public static String checkData(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0 ? str.length() == 1 : str.length() == 1) {
            Object[] objArr = new Object[1];
            b(new char[]{6145, 6352}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
            str = ((String) objArr[0]).intern() + str;
        }
        int i3 = asBinder + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static String checkData(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 41;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            if (i >= 36) {
                return "";
            }
        } else if (i >= 10) {
            return "";
        }
        Object[] objArr = new Object[1];
        b(new char[]{6145, 6352}, View.getDefaultSize(0, 0) + 1, objArr);
        String str = ((String) objArr[0]).intern() + i;
        int i4 = asBinder + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static String getLocalDateTime(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String localDateTime = TimeDateUtil.getLocalDateTime(str, System.currentTimeMillis());
        int i4 = onTransact + 89;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return localDateTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String getLocalDateTime(String str, long j) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            TimeDateUtil.getLocalDateTime(str, j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String localDateTime = TimeDateUtil.getLocalDateTime(str, j);
        int i3 = onTransact + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return localDateTime;
    }

    public static String makeDateType(String str) {
        int i = 2 % 2;
        if (str.length() == 0) {
            return "";
        }
        Object obj = null;
        if (str.length() != 8) {
            int i2 = onTransact + 77;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return "invalid length";
            }
            obj.hashCode();
            throw null;
        }
        String str2 = str.substring(0, 4) + "-" + str.substring(4, 6) + "-" + str.substring(6, 8);
        int i3 = asBinder + 41;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 107;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = i5;
                int i9 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char mode = (char) View.MeasureSpec.getMode(i3);
                        int iIndexOf = 10 - TextUtils.indexOf("", "");
                        int minimumFlingVelocity = 12434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, iIndexOf, minimumFlingVelocity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 10 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i8 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 19949 - AndroidCharacter.getMirror('0'), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $11 + 97;
        $10 = i11 % 128;
        if (i11 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static String convertDateTimeType(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (str.length() != 0) {
                return str.substring(0, 4) + "-" + str.substring(4, 6) + "-" + str.substring(6, 8) + " " + str.substring(8, 10) + ":" + str.substring(10, 12) + ":" + str.substring(12, 14);
            }
            int i3 = onTransact + 5;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                return "";
            }
            obj.hashCode();
            throw null;
        }
        str.length();
        throw null;
    }

    public static String getDatewithSpan(String str, int i, String str2) {
        int i2 = 2 % 2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2);
            Date date = simpleDateFormat.parse(str, new ParsePosition(0));
            Calendar calendar = Calendar.getInstance(Locale.KOREA);
            calendar.clear();
            calendar.setTime(date);
            calendar.add(5, i);
            String str3 = simpleDateFormat2.format(calendar.getTime());
            int i3 = asBinder + 93;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 46 / 0;
            }
            return str3;
        } catch (Exception e) {
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
            return str;
        }
    }

    public static int getString2Int(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        int i4 = i3 + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return 0;
    }

    public static String getInt2String(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 43;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String string = Integer.valueOf(i).toString();
        int i5 = asBinder + 39;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public static String getGetMethodName(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (str != null) {
            int i5 = i3 + 63;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                if (str.length() > 0) {
                    return "get" + str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
                }
            } else {
                str.length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        a.error("getGetMethodName Parameter is NULL");
        throw new IllegalArgumentException("getGetMethodName Parameter is NULL");
    }

    public static String getSetMethodName(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (str != null) {
            int i5 = i3 + 125;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                str.length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str.length() > 0) {
                String str2 = "set" + str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
                int i6 = onTransact + 121;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                return str2;
            }
        }
        a.error("getGetMethodName Parameter is NULL");
        throw new IllegalArgumentException("getSetMethodName Parameter is NULL");
    }

    public static Properties loadProperties(String str) throws Throwable {
        FileInputStream fileInputStream;
        int i = 2 % 2;
        Properties properties = new Properties();
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            properties.load(fileInputStream);
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
            int i2 = asBinder + 81;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return properties;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                int i4 = asBinder + 55;
                onTransact = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        fileInputStream.close();
                        throw null;
                    }
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public static String covertP7SignedDataToPem(byte[] bArr) throws IOException {
        int i = 2 % 2;
        String str = "-----BEGIN PKCS7-----\n" + new String(Base64Util.encode(bArr)) + "-----END PKCS7-----";
        int i2 = onTransact + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static byte[] getBytesFromFile(String str) throws Throwable {
        FileNotFoundException e;
        FileInputStream fileInputStream;
        int i = 2 % 2;
        try {
            try {
                File file = new File(str);
                if (file.exists()) {
                    int i2 = onTransact + 71;
                    asBinder = i2 % 128;
                    if (i2 % 2 == 0) {
                        file.canRead();
                        throw null;
                    }
                    if (file.canRead()) {
                        fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[fileInputStream.available()];
                            fileInputStream.read(bArr);
                            try {
                                fileInputStream.close();
                            } catch (Exception unused) {
                            }
                            int i3 = onTransact + 57;
                            asBinder = i3 % 128;
                            if (i3 % 2 != 0) {
                                return bArr;
                            }
                            throw null;
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            a.error("filePath: " + str);
                            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e);
                            throw e;
                        } catch (IOException e3) {
                            throw e3;
                        } catch (Throwable th) {
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                }
                a.error("Can't File Open [" + str + "]");
                throw new FileNotFoundException("Can't File Open [" + str + "]");
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
        } catch (IOException e5) {
            throw e5;
        }
    }

    public static String[] split(String str, char c) {
        int i = 2 % 2;
        Vector vector = new Vector();
        if (str == null || str.equals("")) {
            a.error("source is null");
            int i2 = onTransact + 103;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onTransact + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        char[] charArray = str.toCharArray();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < charArray.length; i8++) {
            int i9 = asBinder + 69;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            if (charArray[i8] == c) {
                vector.addElement(new String(charArray, i6, i7));
                i6 = i8 + 1;
                i7 = 0;
            } else {
                i7++;
            }
        }
        if (i6 < charArray.length) {
            vector.addElement(str.substring(i6));
        }
        int size = vector.size();
        String[] strArr = new String[size];
        int i11 = onTransact + 71;
        asBinder = i11 % 128;
        int i12 = i11 % 2;
        for (int i13 = 0; i13 < size; i13++) {
            strArr[i13] = (String) vector.elementAt(i13);
        }
        return strArr;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = (char) 27309;
        onWarmupCompleted = (char) 28459;
        IAuthTabCallback = (char) 16891;
        onNavigationEvent = (char) 62271;
    }
}
