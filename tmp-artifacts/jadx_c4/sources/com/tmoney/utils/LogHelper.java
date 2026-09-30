package com.tmoney.utils;

import android.content.Context;
import com.tmoney.Tmoney;
import com.tmoney.TmoneyConstants;
import com.tmoney.TmoneyInfo;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.ah;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LogHelper {
    private static final String TAG = "TMONEY_SDK";
    private static TmoneyConstants.TmoneySdkDebugType debugType = TmoneyConstants.TmoneySdkDebugType.None;

    public static int d(String str, String str2) {
        if (debugType == TmoneyConstants.TmoneySdkDebugType.None) {
            return 0;
        }
        try {
            return logD(TAG, "TMONEY_SDK[" + str + "] " + str2);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int dw(String str, String str2) {
        if (debugType == TmoneyConstants.TmoneySdkDebugType.None) {
            return 0;
        }
        try {
            StringBuilder sb = new StringBuilder("TMONEY_SDK[");
            sb.append(str);
            sb.append("] ");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            return logD(TAG, sb.toString());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int dw(String str, String str2, CodeConstants.E_SAVEAPPLOG e_saveapplog) {
        sendAppLog(str, str2, e_saveapplog);
        return dw(str, str2);
    }

    public static int dw(String str, String str2, String str3) {
        String str4;
        if (debugType == TmoneyConstants.TmoneySdkDebugType.None) {
            return 0;
        }
        try {
            StringBuilder sb = new StringBuilder("TMONEY_SDK[");
            sb.append(str);
            sb.append("] ");
            String str5 = "";
            if (str2 == null) {
                str4 = "";
            } else {
                str4 = str2 + " ";
            }
            sb.append(str4);
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            if (str3 != null && debugType == TmoneyConstants.TmoneySdkDebugType.Debug) {
                str5 = "[" + str3 + "]";
            }
            sb2.append(str5);
            return logD(TAG, sb2.toString());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int e(String str, String str2) {
        if (debugType == TmoneyConstants.TmoneySdkDebugType.None) {
            return 0;
        }
        try {
            return logE(TAG, "TMONEY_SDK[" + str + "] " + str2);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int ew(String str, String str2) {
        String str3;
        if (debugType == TmoneyConstants.TmoneySdkDebugType.None) {
            return 0;
        }
        try {
            StringBuilder sb = new StringBuilder("TMONEY_SDK[");
            sb.append(str);
            sb.append("] ");
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2 + " ";
            }
            sb.append(str3);
            return logE(TAG, sb.toString());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int ew(String str, String str2, CodeConstants.E_SAVEAPPLOG e_saveapplog) {
        sendAppLog(str, str2, e_saveapplog);
        return ew(str, str2);
    }

    public static int exception(String str, Exception exc) {
        if (debugType == TmoneyConstants.TmoneySdkDebugType.None) {
            return 0;
        }
        return logE(TAG, "[" + str + "]  Exception : " + printStackTraceToString(exc));
    }

    public static int exception(String str, String str2, Exception exc) {
        if (debugType == TmoneyConstants.TmoneySdkDebugType.None) {
            return 0;
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("] ");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(" Exception ");
        sb.append(printStackTraceToString(exc));
        return logE(TAG, sb.toString());
    }

    public static int exception(String str, String str2, Exception exc, CodeConstants.E_SAVEAPPLOG e_saveapplog) {
        sendAppLog(str, str2, e_saveapplog);
        return exception(str, str2, exc);
    }

    public static String getString(Object obj) {
        return obj != null ? obj instanceof Integer ? Integer.toString(((Integer) obj).intValue()) : obj instanceof Long ? Long.toString(((Long) obj).longValue()) : obj instanceof Float ? Float.toString(((Float) obj).floatValue()) : obj instanceof Double ? Double.toString(((Double) obj).doubleValue()) : obj instanceof Character ? Character.toString(((Character) obj).charValue()) : "" : "";
    }

    private static int logD(String str, String str2) {
        if (Tmoney.getSdkLogger() == null) {
            return 1;
        }
        Tmoney.getSdkLogger().debug(str, str2);
        return 2;
    }

    private static int logE(String str, String str2) {
        if (Tmoney.getSdkLogger() == null) {
            return 1;
        }
        Tmoney.getSdkLogger().error(str, str2, null);
        return 2;
    }

    public static String printStackTraceToString(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.toString());
            stringBuffer.append('\n');
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                stringBuffer.append("\tat ");
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append('\n');
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return th.toString();
        }
    }

    public static void sendAppLog(final String str, String str2, CodeConstants.E_SAVEAPPLOG e_saveapplog) {
        if (TmoneyInfo.getInstance() == null) {
            return;
        }
        Context context = TmoneyInfo.getInstance().getContext();
        e_saveapplog.setUsimClassName(str);
        new ah(context, new AbstractC0045f.a() { // from class: com.tmoney.utils.LogHelper.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str3, String str4) {
                LogHelper.dw(str, "[SaveappLog] onConnectionError");
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.dw(str, "[SaveappLog] onConnectionSuccess");
            }
        }).execute(e_saveapplog.getCode(), e_saveapplog.toString(), str2);
    }

    public static void sendAppLog(final String str, String str2, String str3, CodeConstants.E_SAVEAPPLOG e_saveapplog) {
        if (TmoneyInfo.getInstance() == null) {
            return;
        }
        Context context = TmoneyInfo.getInstance().getContext();
        e_saveapplog.setUsimClassName(str);
        new ah(context, new AbstractC0045f.a() { // from class: com.tmoney.utils.LogHelper.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str4, String str5) {
                LogHelper.dw(str, "[SaveappLog] onConnectionError");
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.dw(str, "[SaveappLog] onConnectionSuccess");
            }
        }).execute(e_saveapplog.getCode(), str2, str3);
    }

    public static void setLogHelperDebug() {
        debugType = TmoneyData.getInstance().getTmoneyDebug();
    }
}
