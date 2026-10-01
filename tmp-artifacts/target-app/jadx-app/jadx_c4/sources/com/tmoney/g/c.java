package com.tmoney.g;

import android.content.Context;
import com.garmin.android.lib.tmoneyseaccess.Channel;
import com.garmin.android.lib.tmoneyseaccess.GarminSEApi;
import com.garmin.android.lib.tmoneyseaccess.Reader;
import com.garmin.android.lib.tmoneyseaccess.SEService;
import com.garmin.android.lib.tmoneyseaccess.Session;
import com.tmoney.TmoneyMsg;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class c extends com.tmoney.g.a {
    public static final String TAG = "UsimGarmin";
    private static String b = "";
    private String c;
    private Reader d;
    private Session e;
    private Channel f;
    private boolean g;

    final class a implements SEService.Factory, SEService.OnSEServiceReadyCallback {
        a() {
        }

        public final void createSEService(SEService.OnSEServiceReadyCallback onSEServiceReadyCallback) {
            LogHelper.d(c.TAG, "createSEService");
        }

        public final void onReady(SEService sEService) {
        }
    }

    public c(Context context) {
        super(context);
        this.c = "D4100000030001";
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SEService sEService) {
        Reader[] readers = sEService.getReaders();
        if (readers != null && readers.length != 0) {
            try {
                Reader reader = readers[0];
                this.d = reader;
                String name = reader.getName();
                b = this.d.getModelName();
                a(com.tmoney.g.a.STR_UICC, name);
                LogHelper.d(TAG, ">>>getName=" + name + " getModelName=" + b);
                this.e = this.d.openSession();
                this.f = this.e.openBasicChannel(ByteHelper.hexStringToByteArray(this.c));
                this.g = true;
                a(true, TmoneyMsg.TmoneyResult.SUCCESS);
                return;
            } catch (Exception e) {
                LogHelper.d(TAG, "onSESericeReady()>>" + e.getMessage());
            }
        }
        a(false, TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT);
    }

    public static c getInstance(Context context) {
        c cVar;
        synchronized (c.class) {
            cVar = new c(context);
        }
        return cVar;
    }

    public static String getModelName() {
        return b;
    }

    @Override // com.tmoney.g.a
    void close() {
    }

    @Override // com.tmoney.g.a
    public void create(Map<String, Object> map) {
        new a();
        GarminSEApi.getSEService(this.a, new GarminSEApi.SEServiceReadyCallback() { // from class: com.tmoney.g.c$$ExternalSyntheticLambda0
            public final void onReady(SEService sEService) {
                this.f$0.a(sEService);
            }
        });
    }

    @Override // com.tmoney.g.a
    void destroy() {
        Session session = this.e;
        if (session != null) {
            session.close();
        }
        Channel channel = this.f;
        if (channel != null) {
            channel.close();
        }
        this.g = false;
        a(true);
    }

    @Override // com.tmoney.g.a
    int getChannel() {
        return 1;
    }

    @Override // com.tmoney.g.a
    boolean isCreated() {
        return false;
    }

    @Override // com.tmoney.g.a
    int open() {
        return 0;
    }

    @Override // com.tmoney.g.a
    byte[] transmit(byte[] bArr) {
        return this.f.transmit(bArr);
    }
}
