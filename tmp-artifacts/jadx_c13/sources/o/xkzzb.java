package o;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class xkzzb {
    private static boolean IAuthTabCallback = true;
    private static Object asBinder = new Object();
    private static boolean onExtraCallback = false;
    private static File onExtraCallbackWithResult = null;
    private static boolean onNavigationEvent = true;
    private static String onTransact = "NOP";
    private static FileOutputStream onWarmupCompleted;

    private xkzzb() {
    }

    public static void onNavigationEvent(Object... objArr) {
        if (onExtraCallback) {
            return;
        }
        synchronized (asBinder) {
            onExtraCallbackWithResult(0, objArr);
        }
    }

    public static void onNavigationEvent(Exception exc) {
        if (onExtraCallback) {
            return;
        }
        synchronized (asBinder) {
            onExtraCallbackWithResult(3, exc);
        }
    }

    public static void onExtraCallbackWithResult(Object... objArr) {
        if (onExtraCallback) {
            return;
        }
        synchronized (asBinder) {
            onExtraCallbackWithResult(3, objArr);
        }
    }

    public static void onExtraCallback(Object... objArr) {
        if (onExtraCallback) {
            return;
        }
        synchronized (asBinder) {
            onExtraCallbackWithResult(1, objArr);
        }
    }

    public static void onNavigationEvent(String str) {
        onTransact = str;
    }

    public static void onNavigationEvent(boolean z) {
        onExtraCallback = z;
    }

    public static void onWarmupCompleted(Object... objArr) {
        if (onExtraCallback) {
            return;
        }
        synchronized (asBinder) {
            onExtraCallbackWithResult(5, objArr);
        }
    }

    public static void IAuthTabCallback(Object... objArr) {
        if (onExtraCallback) {
            return;
        }
        synchronized (asBinder) {
            onExtraCallbackWithResult(2, objArr);
        }
    }

    private static void IAuthTabCallback() {
        synchronized (xkzzb.class) {
            try {
                FileOutputStream fileOutputStream = onWarmupCompleted;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException unused) {
            }
            onWarmupCompleted = null;
            onExtraCallbackWithResult = null;
        }
    }

    private static void onExtraCallbackWithResult(int i, Object[] objArr) {
        String str;
        Thread threadCurrentThread = Thread.currentThread();
        if (IAuthTabCallback) {
            threadCurrentThread.getName();
        }
        String fileName = threadCurrentThread.getStackTrace()[4].getFileName();
        int lineNumber = threadCurrentThread.getStackTrace()[4].getLineNumber();
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (fileName == null) {
            fileName = _UrlKt.FRAGMENT_ENCODE_SET;
        } else if (fileName.length() > 20) {
            fileName = fileName.substring(0, 20);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(objArr[0]);
        String strReplaceAll = sb.toString().replaceAll("%d", "%s").replaceAll("%f", "%s").replaceAll("%c", "%s").replaceAll("%b", "%s").replaceAll("%x", "%s").replaceAll("%l", "%s");
        switch (objArr.length - 1) {
            case 0:
                str2 = strReplaceAll;
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(objArr[1]);
                str2 = String.format(strReplaceAll, sb2.toString());
                break;
            case 2:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(objArr[1]);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(objArr[2]);
                str2 = String.format(strReplaceAll, string, sb4.toString());
                break;
            case 3:
                StringBuilder sb5 = new StringBuilder();
                sb5.append(objArr[1]);
                String string2 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(objArr[2]);
                String string3 = sb6.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(objArr[3]);
                str2 = String.format(strReplaceAll, string2, string3, sb7.toString());
                break;
            case 4:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(objArr[1]);
                String string4 = sb8.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(objArr[2]);
                String string5 = sb9.toString();
                StringBuilder sb10 = new StringBuilder();
                sb10.append(objArr[3]);
                String string6 = sb10.toString();
                StringBuilder sb11 = new StringBuilder();
                sb11.append(objArr[4]);
                str2 = String.format(strReplaceAll, string4, string5, string6, sb11.toString());
                break;
            case 5:
                StringBuilder sb12 = new StringBuilder();
                sb12.append(objArr[1]);
                String string7 = sb12.toString();
                StringBuilder sb13 = new StringBuilder();
                sb13.append(objArr[2]);
                String string8 = sb13.toString();
                StringBuilder sb14 = new StringBuilder();
                sb14.append(objArr[3]);
                String string9 = sb14.toString();
                StringBuilder sb15 = new StringBuilder();
                sb15.append(objArr[4]);
                String string10 = sb15.toString();
                StringBuilder sb16 = new StringBuilder();
                sb16.append(objArr[5]);
                str2 = String.format(strReplaceAll, string7, string8, string9, string10, sb16.toString());
                break;
            case 6:
                StringBuilder sb17 = new StringBuilder();
                sb17.append(objArr[1]);
                String string11 = sb17.toString();
                StringBuilder sb18 = new StringBuilder();
                sb18.append(objArr[2]);
                String string12 = sb18.toString();
                StringBuilder sb19 = new StringBuilder();
                sb19.append(objArr[3]);
                String string13 = sb19.toString();
                StringBuilder sb20 = new StringBuilder();
                sb20.append(objArr[4]);
                String string14 = sb20.toString();
                StringBuilder sb21 = new StringBuilder();
                sb21.append(objArr[5]);
                String string15 = sb21.toString();
                StringBuilder sb22 = new StringBuilder();
                sb22.append(objArr[6]);
                str2 = String.format(strReplaceAll, string11, string12, string13, string14, string15, sb22.toString());
                break;
            case 7:
                StringBuilder sb23 = new StringBuilder();
                sb23.append(objArr[1]);
                String string16 = sb23.toString();
                StringBuilder sb24 = new StringBuilder();
                sb24.append(objArr[2]);
                String string17 = sb24.toString();
                StringBuilder sb25 = new StringBuilder();
                sb25.append(objArr[3]);
                String string18 = sb25.toString();
                StringBuilder sb26 = new StringBuilder();
                sb26.append(objArr[4]);
                String string19 = sb26.toString();
                StringBuilder sb27 = new StringBuilder();
                sb27.append(objArr[5]);
                String string20 = sb27.toString();
                StringBuilder sb28 = new StringBuilder();
                sb28.append(objArr[6]);
                String string21 = sb28.toString();
                StringBuilder sb29 = new StringBuilder();
                sb29.append(objArr[7]);
                str2 = String.format(strReplaceAll, string16, string17, string18, string19, string20, string21, sb29.toString());
                break;
            case 8:
                StringBuilder sb30 = new StringBuilder();
                sb30.append(objArr[1]);
                String string22 = sb30.toString();
                StringBuilder sb31 = new StringBuilder();
                sb31.append(objArr[2]);
                String string23 = sb31.toString();
                StringBuilder sb32 = new StringBuilder();
                sb32.append(objArr[3]);
                String string24 = sb32.toString();
                StringBuilder sb33 = new StringBuilder();
                sb33.append(objArr[4]);
                String string25 = sb33.toString();
                StringBuilder sb34 = new StringBuilder();
                sb34.append(objArr[5]);
                String string26 = sb34.toString();
                StringBuilder sb35 = new StringBuilder();
                sb35.append(objArr[6]);
                String string27 = sb35.toString();
                StringBuilder sb36 = new StringBuilder();
                sb36.append(objArr[7]);
                String string28 = sb36.toString();
                StringBuilder sb37 = new StringBuilder();
                sb37.append(objArr[8]);
                str2 = String.format(strReplaceAll, string22, string23, string24, string25, string26, string27, string28, sb37.toString());
                break;
            case 9:
                StringBuilder sb38 = new StringBuilder();
                sb38.append(objArr[1]);
                String string29 = sb38.toString();
                StringBuilder sb39 = new StringBuilder();
                sb39.append(objArr[2]);
                String string30 = sb39.toString();
                StringBuilder sb40 = new StringBuilder();
                sb40.append(objArr[3]);
                String string31 = sb40.toString();
                StringBuilder sb41 = new StringBuilder();
                sb41.append(objArr[4]);
                String string32 = sb41.toString();
                StringBuilder sb42 = new StringBuilder();
                sb42.append(objArr[5]);
                String string33 = sb42.toString();
                StringBuilder sb43 = new StringBuilder();
                sb43.append(objArr[6]);
                String string34 = sb43.toString();
                StringBuilder sb44 = new StringBuilder();
                sb44.append(objArr[7]);
                String string35 = sb44.toString();
                StringBuilder sb45 = new StringBuilder();
                sb45.append(objArr[8]);
                String string36 = sb45.toString();
                StringBuilder sb46 = new StringBuilder();
                sb46.append(objArr[9]);
                str2 = String.format(strReplaceAll, string29, string30, string31, string32, string33, string34, string35, string36, sb46.toString());
                break;
            case 10:
                StringBuilder sb47 = new StringBuilder();
                sb47.append(objArr[1]);
                String string37 = sb47.toString();
                StringBuilder sb48 = new StringBuilder();
                sb48.append(objArr[2]);
                String string38 = sb48.toString();
                StringBuilder sb49 = new StringBuilder();
                sb49.append(objArr[3]);
                String string39 = sb49.toString();
                StringBuilder sb50 = new StringBuilder();
                sb50.append(objArr[4]);
                String string40 = sb50.toString();
                StringBuilder sb51 = new StringBuilder();
                sb51.append(objArr[5]);
                String string41 = sb51.toString();
                StringBuilder sb52 = new StringBuilder();
                sb52.append(objArr[6]);
                String string42 = sb52.toString();
                StringBuilder sb53 = new StringBuilder();
                sb53.append(objArr[7]);
                String string43 = sb53.toString();
                StringBuilder sb54 = new StringBuilder();
                sb54.append(objArr[8]);
                String string44 = sb54.toString();
                StringBuilder sb55 = new StringBuilder();
                sb55.append(objArr[9]);
                String string45 = sb55.toString();
                StringBuilder sb56 = new StringBuilder();
                sb56.append(objArr[10]);
                str2 = String.format(strReplaceAll, string37, string38, string39, string40, string41, string42, string43, string44, string45, sb56.toString());
                break;
        }
        if (onNavigationEvent) {
            str = String.format("%s:[%-20s:%5d] %s\n", onTransact, fileName, Integer.valueOf(lineNumber), str2);
        } else {
            str = String.format("[%-20s:%5d] %s\n", fileName, Integer.valueOf(lineNumber), str2);
        }
        if (onWarmupCompleted != null) {
            onWarmupCompleted(str);
        }
    }

    private static void onExtraCallbackWithResult(int i, Exception exc) {
        String str;
        if (onExtraCallback) {
            return;
        }
        StackTraceElement[] stackTrace = exc.getStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        if (IAuthTabCallback) {
            threadCurrentThread.getName();
        }
        String fileName = threadCurrentThread.getStackTrace()[4].getFileName();
        int lineNumber = threadCurrentThread.getStackTrace()[4].getLineNumber();
        if (fileName == null) {
            fileName = _UrlKt.FRAGMENT_ENCODE_SET;
        } else if (fileName.length() > 20) {
            fileName = fileName.substring(0, 20);
        }
        int length = stackTrace.length;
        if (i == 3) {
            str = String.format("%s:[%-20s:%5d] %s: %s", onTransact, fileName, Integer.valueOf(lineNumber), exc.getClass().getName(), exc.getMessage());
        } else {
            str = String.format("%s:[%-20s:%5d] %s", onTransact, fileName, Integer.valueOf(lineNumber), "== PRINT CALL STACK ==");
        }
        if (onWarmupCompleted != null) {
            onWarmupCompleted(str);
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0 || i == 3) {
                String str2 = fileName;
                String str3 = String.format("%s:[%-20s:%5d]    at %s %s (%s:%d)", onTransact, str2, Integer.valueOf(lineNumber), stackTrace[i2].getClassName(), stackTrace[i2].getMethodName(), stackTrace[i2].getFileName(), Integer.valueOf(stackTrace[i2].getLineNumber()));
                if (onWarmupCompleted != null) {
                    onWarmupCompleted(str3);
                }
            }
        }
    }

    private static void onWarmupCompleted(String str) {
        synchronized (xkzzb.class) {
            if (onExtraCallback) {
                return;
            }
            File file = onExtraCallbackWithResult;
            if (file == null || onWarmupCompleted == null) {
                IAuthTabCallback();
                return;
            }
            try {
            } catch (IOException unused) {
                IAuthTabCallback();
            }
            if (file.canWrite()) {
                onWarmupCompleted.write(str.getBytes());
            }
        }
    }
}
