package com.tmoney.g;

import android.content.Context;
import android.nfc.tech.IsoDep;
import android.text.TextUtils;
import com.tmoney.TmoneyConstants;
import com.tmoney.TmoneyMsg;
import com.tmoney.g.a;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.CryptoHelper;
import com.tmoney.utils.LogHelper;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class d implements a.InterfaceC0003a, a.b, a.c {
    private static volatile d a;
    private com.tmoney.g.a b;
    private String c = null;
    private TmoneyConstants.TelecomType d;
    private a e;

    /* renamed from: com.tmoney.g.d$1, reason: invalid class name */
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

    public interface a {
        void finalizeUsim_CB();

        void onCreateResult(boolean z, TmoneyMsg.TmoneyResult tmoneyResult);

        void onDestroyResult(boolean z);
    }

    public d(Context context, IsoDep isoDep) {
        com.tmoney.g.a iVar;
        this.b = null;
        if (TmoneyData.getInstance().isGamin()) {
            iVar = c.getInstance(context);
        } else if (isoDep != null) {
            iVar = g.getInstance(context, isoDep);
        } else if (TmoneyData.getInstance().isNotUseUsimPartner()) {
            iVar = h.getInstance(context);
        } else {
            this.d = TmoneyData.getInstance().getTelecomType();
            LogHelper.dw("UsimInstance", "UsimInstance:" + this.d);
            int i = AnonymousClass1.a[this.d.ordinal()];
            if (i == 1) {
                iVar = i.getInstance(context);
            } else if (i == 2) {
                iVar = e.getInstance(context);
            } else {
                if (i != 3) {
                    this.b = null;
                    return;
                }
                iVar = f.getInstance(context);
            }
        }
        this.b = iVar;
    }

    public static void clearInstance() {
        a = null;
        i.clear();
        e.clear();
        f.clear();
    }

    public static d getInstance() {
        return a;
    }

    public static d getInstance(Context context, IsoDep isoDep) {
        if (a == null) {
            synchronized (d.class) {
                a = new d(context, isoDep);
            }
        } else {
            if (a.d != TmoneyData.getInstance().getTelecomType() || isoDep != null) {
                String str = isoDep != null ? a.c : "";
                clearInstance();
                a = new d(context, isoDep);
                if (isoDep != null) {
                    a.c = str;
                }
            }
        }
        return a;
    }

    public void close() {
        try {
            LogHelper.dw("UsimInstance", "close()");
            this.b.close();
        } catch (Exception e) {
            LogHelper.exception("UsimInstance", "iusim.close()", e);
        }
        a aVar = this.e;
        if (aVar != null) {
            aVar.finalizeUsim_CB();
        }
    }

    public void create(Map<String, Object> map) {
        LogHelper.dw("UsimInstance", "create() " + this.b);
        com.tmoney.g.a aVar = this.b;
        if (aVar == null) {
            onCreateResult(false, TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT);
            return;
        }
        if (aVar.isCreated() && this.b.isCheckTelecomUicc()) {
            onCreateResult(true, TmoneyMsg.TmoneyResult.SUCCESS);
            return;
        }
        this.b.setOnUsimCreateListener(this);
        this.b.setOnUsimDestroyListener(this);
        this.b.setOnUsimInfoListener(this);
        try {
            this.b.setIsEmptyUicc(TextUtils.isEmpty(this.c));
            this.b.create(map);
        } catch (Exception e) {
            LogHelper.exception("UsimInstance", "iusim.create()", e);
        }
    }

    public void destroy() {
        try {
            LogHelper.dw("UsimInstance", "iusim.destroy()");
            this.b.setOnUsimDestroyListener(this);
            this.b.destroy();
        } catch (Exception e) {
            LogHelper.exception("UsimInstance", "iusim.destroy()", e);
        }
    }

    public int getChannel() {
        try {
            return this.b.getChannel();
        } catch (Exception e) {
            LogHelper.exception("UsimInstance", "iusim.getChannel()", e);
            return -1;
        }
    }

    public String getICCID() {
        return TextUtils.isEmpty(this.c) ? "" : CryptoHelper.decode(this.c);
    }

    public com.tmoney.g.a getIusim() {
        return this.b;
    }

    public boolean isClose() {
        return this.b.getChannel() <= 0;
    }

    @Override // com.tmoney.g.a.InterfaceC0003a
    public void onCreateResult(boolean z, TmoneyMsg.TmoneyResult tmoneyResult) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.onCreateResult(z, tmoneyResult);
        }
    }

    @Override // com.tmoney.g.a.b
    public void onDestroyResult(boolean z) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.onDestroyResult(z);
        }
    }

    @Override // com.tmoney.g.a.c
    public void onUsimInfo(String str, String str2) {
        StringBuilder sb;
        if (TextUtils.equals(str, com.tmoney.g.a.STR_UICC)) {
            if (str2 != null) {
                if (str2.length() == 19) {
                    sb = new StringBuilder();
                } else if (str2.length() > 20) {
                    sb = new StringBuilder();
                    str2 = str2.substring(0, 19);
                }
                sb.append(str2);
                sb.append("f");
                str2 = sb.toString();
            } else {
                str2 = "";
            }
            this.c = CryptoHelper.encode(str2.toLowerCase());
        }
    }

    public void open() {
        LogHelper.dw("UsimInstance", "open() iusim " + this.b);
        this.b.open();
    }

    public void setOnUsimListener(a aVar) {
        this.e = aVar;
    }

    public byte[] transmitAPDU(byte[] bArr) {
        com.tmoney.a.getInstance().clearTagException();
        try {
            return this.b.transmit(bArr);
        } catch (Exception e) {
            LogHelper.exception("UsimInstance", e);
            return null;
        }
    }
}
