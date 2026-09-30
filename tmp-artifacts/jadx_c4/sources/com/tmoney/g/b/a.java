package com.tmoney.g.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.skp.smarttouch.sem.telco.SEUtility;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skt.usp.tools.UCPLibraryFeatures;
import com.tmoney.TmoneyConstants;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class a {
    private static volatile a a;
    private final String b = "pref.usim";
    private final String c = "UsimType";
    private SharedPreferences d;
    private int e;
    private TmoneyData f;
    private boolean g;

    /* renamed from: com.tmoney.g.b.a$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TmoneyConstants.TelecomType.values().length];
            a = iArr;
            try {
                iArr[TmoneyConstants.TelecomType.SktSeio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TmoneyConstants.TelecomType.Kt.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TmoneyConstants.TelecomType.Lgu.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private a(Context context) {
        int i;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.usim", 0);
        this.d = sharedPreferences;
        this.e = sharedPreferences.getInt("UsimType", 0);
        TmoneyData tmoneyData = TmoneyData.getInstance(context);
        this.f = tmoneyData;
        this.g = tmoneyData.isTelecomTestServer();
        boolean z = TmoneyData.getInstance().getTmoneyDebug() == TmoneyConstants.TmoneySdkDebugType.Debug;
        if (this.f.isBluetooth().booleanValue()) {
            i = 6;
        } else {
            int i2 = AnonymousClass1.a[this.f.getTelecomType().ordinal()];
            if (i2 == 1) {
                if (DeviceInfoHelper.SET_ESIM) {
                    SEUtility.setServerType(context, true);
                }
                LibraryFeatures.setREAL_SERVER(true);
                boolean z2 = !z;
                LibraryFeatures.setRELEASE(z2);
                xkzzb.onNavigationEvent(z2);
                if (com.tmoney.g.a.isGetTelecomUiccOS()) {
                    UCPLibraryFeatures.setUcpLogLevel(context, z ? 3 : 7);
                }
                if (com.tmoney.telecom.skt.a.isSetMultiUicc(context)) {
                    int usimSubscriptionId = DeviceInfoHelper.getUsimSubscriptionId(context);
                    UCPLibraryFeatures.setMultiUiccAvailableYn(true);
                    UCPLibraryFeatures.setUcpSubscriptionId(usimSubscriptionId);
                    LibraryFeatures.setMultiUiccAvailableYn(true);
                    LibraryFeatures.setSemSubscriptionId(usimSubscriptionId);
                    LogHelper.d("UsimUtility", "setMultiUiccAvailableYn(true)");
                    LogHelper.d("UsimUtility", "setUcpSubscriptionId(" + usimSubscriptionId + ")");
                } else {
                    UCPLibraryFeatures.setMultiUiccAvailableYn(false);
                    LibraryFeatures.setMultiUiccAvailableYn(false);
                }
                if (DeviceInfoHelper.SET_ESIM) {
                    LibraryFeatures.setRELEASE(false);
                    UCPLibraryFeatures.setRELEASE(false);
                }
                setUsimType(2);
                return;
            }
            if (i2 == 2) {
                setUsimType(3);
                return;
            } else if (i2 != 3) {
                return;
            } else {
                i = 4;
            }
        }
        setUsimType(i);
    }

    public static a getInstance(Context context) {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a(context);
                }
            }
        }
        return a;
    }

    public String getKtAppKey() {
        return com.tmoney.d.a.getInstance().getKtAppKey();
    }

    public String getKtUfinKey() {
        return this.f.getKtUfinKey();
    }

    public String getLguAppKey() {
        return this.f.getAppKey();
    }

    public String getLguClientId() {
        return this.f.getLgClientId();
    }

    public String getLguCommonApikey() {
        return this.f.getLguCommonApikey();
    }

    public String getLguUiccIdEncKey() {
        return this.f.getLgUiccIDKey();
    }

    public String getSkStId() {
        return this.f.getSkStId();
    }

    public int getUsimType() {
        return this.e;
    }

    public void setUsimType(int i) {
        this.e = i;
        SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.putInt("UsimType", this.e);
        editorEdit.apply();
    }
}
