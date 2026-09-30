package com.initech.inibase.logger.spi;

import com.initech.inibase.logger.Layout;
import com.initech.inibase.logger.helpers.LogLog;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class LocationInfo implements Serializable {
    public static final String NA = "?";
    private static StringWriter e = new StringWriter();
    private static PrintWriter f = new PrintWriter(e);
    private static boolean g = false;
    static final long serialVersionUID = -1325822038990805636L;
    private transient String a;
    private transient String b;
    private transient String c;
    private transient String d;
    public String fullInfo;

    static {
        g = false;
        try {
            Class.forName("com.ibm.uvm.tools.DebugSupport");
            g = true;
            LogLog.debug("Detected IBM VisualAge environment.");
        } catch (Throwable unused) {
        }
    }

    public LocationInfo(Throwable th, String str) {
        String string;
        String str2;
        int iIndexOf;
        int i;
        int iIndexOf2;
        if (th != null) {
            synchronized (e) {
                string = e.toString();
                e.getBuffer().setLength(0);
            }
            int iLastIndexOf = string.lastIndexOf(str);
            if (iLastIndexOf == -1 || (iIndexOf = string.indexOf((str2 = Layout.LINE_SEP), iLastIndexOf)) == -1 || (iIndexOf2 = string.indexOf(str2, (i = iIndexOf + Layout.LINE_SEP_LEN))) == -1) {
                return;
            }
            if (!g) {
                int iLastIndexOf2 = string.lastIndexOf("at ", iIndexOf2);
                if (iLastIndexOf2 == -1) {
                    return;
                } else {
                    i = iLastIndexOf2 + 3;
                }
            }
            this.fullInfo = string.substring(i, iIndexOf2);
        }
    }

    public void close() throws IOException {
        try {
            StringWriter stringWriter = e;
            if (stringWriter != null) {
                stringWriter.close();
            }
        } catch (Exception unused) {
        }
        try {
            PrintWriter printWriter = f;
            if (printWriter != null) {
                printWriter.close();
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getClassName() {
        String str = this.fullInfo;
        if (str == null) {
            return NA;
        }
        if (this.c == null) {
            int iLastIndexOf = str.lastIndexOf(40);
            if (iLastIndexOf == -1) {
                this.c = NA;
            } else {
                int iLastIndexOf2 = this.fullInfo.lastIndexOf(46, iLastIndexOf);
                int iLastIndexOf3 = g ? this.fullInfo.lastIndexOf(32, iLastIndexOf2) + 1 : 0;
                if (iLastIndexOf2 != -1) {
                    this.c = this.fullInfo.substring(iLastIndexOf3, iLastIndexOf2);
                }
            }
        }
        return this.c;
    }

    public String getFileName() {
        String str = this.fullInfo;
        if (str == null) {
            return NA;
        }
        if (this.b == null) {
            int iLastIndexOf = str.lastIndexOf(58);
            if (iLastIndexOf == -1) {
                this.b = NA;
            } else {
                this.b = this.fullInfo.substring(this.fullInfo.lastIndexOf(40, iLastIndexOf - 1) + 1, iLastIndexOf);
            }
        }
        return this.b;
    }

    public String getLineNumber() {
        String str = this.fullInfo;
        if (str == null) {
            return NA;
        }
        if (this.a == null) {
            int iLastIndexOf = str.lastIndexOf(41);
            int iLastIndexOf2 = this.fullInfo.lastIndexOf(58, iLastIndexOf - 1);
            if (iLastIndexOf2 == -1) {
                this.a = NA;
            } else {
                this.a = this.fullInfo.substring(iLastIndexOf2 + 1, iLastIndexOf);
            }
        }
        return this.a;
    }

    public String getMethodName() {
        String str = this.fullInfo;
        if (str == null) {
            return NA;
        }
        if (this.d == null) {
            int iLastIndexOf = str.lastIndexOf(40);
            int iLastIndexOf2 = this.fullInfo.lastIndexOf(46, iLastIndexOf);
            if (iLastIndexOf2 == -1) {
                this.d = NA;
            } else {
                this.d = this.fullInfo.substring(iLastIndexOf2 + 1, iLastIndexOf);
            }
        }
        return this.d;
    }
}
