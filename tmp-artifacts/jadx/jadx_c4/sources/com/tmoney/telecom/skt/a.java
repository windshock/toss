package com.tmoney.telecom.skt;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.skt.usp.telco.UCPUtility;
import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.NumberUtil;
import com.tmoney.utils.PackageHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class a {
    public static final int ASSET_STATUS_ERROR = -1;
    public static final int ASSET_STATUS_EXIST = 0;
    public static final int ASSET_STATUS_INSTALL_START = 1;
    public static final int ASSET_STATUS_NEED_INSTALL = 2;
    public static final int ASSET_STATUS_NEED_UPDATE = 3;
    public static final String SESERVICE_PACKAGE = "com.skp.seio";
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private boolean i;

    public a() {
    }

    public a(byte[] bArr) {
        byte[] bArr2 = new byte[1];
        this.a = bArr2;
        this.b = new byte[1];
        this.c = new byte[4];
        this.d = new byte[1];
        this.e = new byte[8];
        this.f = new byte[4];
        this.g = new byte[4];
        byte[] bArr3 = new byte[2];
        this.h = bArr3;
        this.i = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 25) {
                System.arraycopy(bArr, 0, bArr2, 0, 1);
                System.arraycopy(bArr, 1, this.b, 0, 1);
                System.arraycopy(bArr, 2, this.c, 0, 4);
                System.arraycopy(bArr, 6, this.d, 0, 1);
                System.arraycopy(bArr, 7, this.e, 0, 8);
                System.arraycopy(bArr, 15, this.f, 0, 4);
                System.arraycopy(bArr, 19, this.g, 0, 4);
                System.arraycopy(bArr, 23, this.h, 0, 2);
                byte[] bArr4 = this.h;
                if (bArr4[0] == -112 && bArr4[1] == 0) {
                    this.i = true;
                }
            }
        }
    }

    public static int checkSESFramework(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        if (!PackageHelper.isExistApp(context, "com.skp.seio")) {
            return 2;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.skp.seio", 128);
            LogHelper.d("SEIOAgent", "version[1] pInfo.versionCode[" + packageInfo.versionCode + "]");
            return packageInfo.versionCode <= 0 ? 2 : 0;
        } catch (PackageManager.NameNotFoundException e) {
            LogHelper.exception("SEIOAgent", e);
            return -1;
        }
    }

    public static boolean isSetMultiUicc(Context context) {
        if (!DeviceInfoHelper.hasEmbeddedUsim(context)) {
            return false;
        }
        int applicationVersionCode = UCPUtility.getApplicationVersionCode(context, "com.skp.seio");
        LogHelper.d("SEIOAgent", "seio agent version code = " + applicationVersionCode);
        return applicationVersionCode >= 18;
    }

    public int getBalance() {
        try {
            if (this.i) {
                return NumberUtil.parseInt(this.c);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public String getSW() {
        byte[] bArr = this.h;
        return (bArr == null || bArr.length != 2) ? "NONE" : BinaryUtil.toBinaryStringtoUp(bArr);
    }

    public boolean isbResData() {
        return this.i;
    }
}
