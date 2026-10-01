package com.tmoney.g.a;

import android.content.Context;
import com.tmoney.TmoneyMsg;
import com.tmoney.a.e;
import com.tmoney.a.g;
import com.tmoney.a.i;
import com.tmoney.kscc.sslio.a.U;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class a extends BaseTmoneyCallback {
    public String TAG;
    private com.tmoney.g.d a;
    private com.tmoney.f.a.a b;
    private TmoneyData c;
    private String d;
    private String e;
    private int f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;

    /* renamed from: o, reason: collision with root package name */
    private String f7o;
    private String p;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.c = TmoneyData.getInstance(context);
        this.b = new com.tmoney.f.a.a();
        this.TAG = getClass().getSimpleName();
        LogHelper.d("Executer", "### Executer ### [" + this.TAG + "]");
    }

    public final boolean a(int i) {
        byte[] bArrA = a(this.b.getApduInitPurchase(i));
        this.h = bArrA;
        com.tmoney.telecom.skt.a aVar = new com.tmoney.telecom.skt.a(bArrA);
        this.f7o = aVar.getSW();
        return aVar.isbResData();
    }

    public final boolean a(String str) {
        byte[] bArrA = a(com.tmoney.e.a.a.hexStringToByteArray(str));
        this.l = bArrA;
        i iVar = new i(bArrA);
        this.f7o = iVar.getSW();
        if (!iVar.isbResData()) {
            return false;
        }
        int balance = iVar.getBalance();
        this.f = balance;
        this.c.setLastBalance(balance);
        return true;
    }

    public final byte[] a() {
        return this.g;
    }

    public final byte[] a(byte[] bArr) {
        return this.a.transmitAPDU(bArr);
    }

    public final String b() {
        return com.tmoney.e.a.a.bytesToHexString(this.g);
    }

    public final boolean b(int i) {
        byte[] bArrA = a(this.b.getApduInitLoad(i));
        this.j = bArrA;
        com.tmoney.a.b bVar = new com.tmoney.a.b(bArrA);
        this.f7o = bVar.getSW();
        if (!bVar.isbResData()) {
            return false;
        }
        this.f = bVar.getBalance();
        return true;
    }

    public final boolean b(String str) {
        byte[] bArrA = a(com.tmoney.e.a.a.hexStringToByteArray(str));
        this.k = bArrA;
        com.tmoney.a.d dVar = new com.tmoney.a.d(bArrA);
        this.f7o = dVar.getSW();
        if (!dVar.isbResData()) {
            return false;
        }
        int balance = dVar.getBalance();
        this.f = balance;
        this.c.setLastBalance(balance);
        return true;
    }

    public final String c() {
        return com.tmoney.e.a.a.bytesToHexString(this.j);
    }

    public final boolean c(String str) {
        byte[] bArrA = a(com.tmoney.e.a.a.hexStringToByteArray(str));
        this.i = bArrA;
        e eVar = new e(bArrA);
        this.f7o = eVar.getSW();
        return eVar.isbResData();
    }

    public final String d() {
        return com.tmoney.e.a.a.bytesToHexString(this.h);
    }

    public final String e() {
        return com.tmoney.e.a.a.bytesToHexString(this.i);
    }

    public int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        return execute(dVar, resultType, false);
    }

    public int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType, boolean z) {
        this.a = dVar;
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            this.d = resultType.getData()[0].toString();
            this.f = ((Integer) resultType.getData()[1]).intValue();
            this.e = resultType.getData()[2].toString();
            this.g = (byte[]) resultType.getData()[3];
            this.p = resultType.getData()[5].toString();
            if (!z) {
                this.c.setCardNumber(this.d);
            }
        }
        return this.f;
    }

    public final String f() {
        return com.tmoney.e.a.a.bytesToHexString(this.k);
    }

    public final String g() {
        return com.tmoney.e.a.a.bytesToHexString(this.m);
    }

    @Override // com.tmoney.listener.BaseTmoneyCallback
    public Context getContext() {
        return this.mContext;
    }

    public final String h() {
        return ByteHelper.byteArrayToHexString(a(com.tmoney.a.a.getApduCmd(10)));
    }

    public final String i() {
        return com.tmoney.e.a.a.bytesToHexString(this.l);
    }

    public final String j() {
        return com.tmoney.e.a.a.bytesToHexString(this.n);
    }

    public final boolean k() {
        byte[] bArrA = a(this.b.getApduInitUnLoad());
        this.m = bArrA;
        com.tmoney.a.c cVar = new com.tmoney.a.c(bArrA);
        this.f7o = cVar.getSW();
        return cVar.isbResData();
    }

    public final boolean l() {
        byte[] bArrA = a(this.b.getApduInitParamUp());
        this.n = bArrA;
        U u = new U(bArrA);
        this.f7o = u.getSW();
        return u.isbResData();
    }

    public final boolean m() {
        TmoneyMsg tmoneyMsg = new TmoneyMsg(this.a.transmitAPDU(this.b.getApduBalance()));
        if (!tmoneyMsg.isbResData()) {
            return false;
        }
        this.f = tmoneyMsg.getBalance();
        TmoneyData.getInstance().setLastBalance(this.f);
        return true;
    }

    public final String n() {
        return this.d;
    }

    public final String o() {
        return this.e;
    }

    @Override // com.tmoney.listener.BaseTmoneyCallback
    public void onResult(TmoneyCallback.ResultType resultType) {
        t();
        super.onResult(resultType);
    }

    public final int p() {
        return this.f;
    }

    public final String q() {
        return this.f7o;
    }

    public final String r() {
        return this.p;
    }

    public final boolean s() {
        g gVar = new g(this.a.transmitAPDU(this.b.getApduSelect()));
        this.f7o = gVar.getSW();
        if (!gVar.isbResData()) {
            return false;
        }
        this.d = gVar.getIDep();
        this.e = gVar.getUSERCODE();
        return true;
    }

    public final void t() {
        try {
            com.tmoney.g.d dVar = this.a;
            if (dVar != null) {
                dVar.close();
            }
        } catch (Exception unused) {
        }
    }
}
