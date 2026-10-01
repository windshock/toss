package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.impl.a4;
import com.applovin.impl.b5;
import com.applovin.impl.c5;
import com.applovin.impl.d3;
import com.applovin.impl.d4;
import com.applovin.impl.d5;
import com.applovin.impl.e5;
import com.applovin.impl.f;
import com.applovin.impl.f1;
import com.applovin.impl.f5;
import com.applovin.impl.f7;
import com.applovin.impl.g1;
import com.applovin.impl.h2;
import com.applovin.impl.h4;
import com.applovin.impl.h6;
import com.applovin.impl.i6;
import com.applovin.impl.j;
import com.applovin.impl.k1;
import com.applovin.impl.l7;
import com.applovin.impl.m8;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.e;
import com.applovin.impl.mediation.g;
import com.applovin.impl.n5;
import com.applovin.impl.o2;
import com.applovin.impl.o3;
import com.applovin.impl.o4;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q8;
import com.applovin.impl.r0;
import com.applovin.impl.r7;
import com.applovin.impl.s0;
import com.applovin.impl.s1;
import com.applovin.impl.s2;
import com.applovin.impl.s7;
import com.applovin.impl.sdk.l$;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.t7;
import com.applovin.impl.v0;
import com.applovin.impl.v1;
import com.applovin.impl.v3;
import com.applovin.impl.x2;
import com.applovin.impl.x6;
import com.applovin.impl.y3;
import com.applovin.impl.y5;
import com.applovin.impl.z3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class l {
    private static int $10 = 0;
    private static int $11 = 1;
    public static l E0 = null;
    protected static Context F0 = null;
    private static boolean G0 = false;
    private static final long H0;
    private static final boolean I0;
    private static int IAuthTabCallback = 0;
    private static volatile com.applovin.impl.c J0 = null;
    private static final Object K0;
    private static int onExtraCallback = 0;
    private static int[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private AppLovinSdk.SdkInitializationListener A0;
    private AppLovinSdk.SdkInitializationListener B0;
    private String a;
    private String b;
    private WeakReference c;
    private final long d;
    private long e;
    private long f;
    private Long g;
    private long h;
    private final AppLovinSdkSettings j;
    private e j0;
    private MaxSegmentCollection k;
    private String l;
    private List m0;
    private volatile AppLovinSdk q;
    private boolean r0;
    private String w0;
    private AppLovinSdkInitializationConfiguration x0;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f5i = new AtomicBoolean();
    private final AtomicReference m = new AtomicReference();
    private final AtomicReference n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f6o = new AtomicReference();
    private final AtomicReference p = new AtomicReference();
    private final p r = new p(this);
    private final f s = new f(this);
    private final d3 t = new d3(this);
    private final s1 u = new s1(this);
    private final r7 v = new r7(this);
    private final AtomicReference w = new AtomicReference();
    private final AtomicReference x = new AtomicReference();
    private final AtomicReference y = new AtomicReference();
    private final AtomicReference z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();
    private final AtomicReference a0 = new AtomicReference();
    private final AtomicReference b0 = new AtomicReference();
    private final AtomicReference c0 = new AtomicReference();
    private final AtomicReference d0 = new AtomicReference();
    private final AtomicReference e0 = new AtomicReference();
    private final AtomicReference f0 = new AtomicReference();
    private final AtomicReference g0 = new AtomicReference();
    private final AtomicReference h0 = new AtomicReference();
    private final AtomicReference i0 = new AtomicReference();
    private final AtomicReference k0 = new AtomicReference();
    private final AtomicReference l0 = new AtomicReference();
    private final Object n0 = new Object();
    private final AtomicBoolean o0 = new AtomicBoolean(true);
    private final AtomicBoolean p0 = new AtomicBoolean();
    private final AtomicBoolean q0 = new AtomicBoolean();
    private boolean s0 = false;
    private boolean t0 = false;
    private boolean u0 = false;
    private int v0 = 0;
    private final Object y0 = new Object();
    private SdkConfigurationImpl z0 = new SdkConfigurationImpl(this);
    private final n5 C0 = new x6(this, true, "scheduleAdLoadIntegrationError", new l$.ExternalSyntheticLambda4(this));
    private final n5 D0 = new x6(this, true, "sdkInit", new l$.ExternalSyntheticLambda5(this));

    class a implements y5.b {
        a() {
        }

        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            l.a(l.this, jSONObject);
            if (((Boolean) l.this.a(v3.q8)).booleanValue()) {
                l lVar = l.this;
                l.a(lVar, new e(lVar));
            }
            l.this.n().a();
            s0.a(jSONObject, zIsValid, l.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            l.this.W().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            l.this.E().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(m.K()));
            JsonUtils.putBoolean(jSONObject2, "init_success", zIsValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(l.F0).getAll().size());
            l.this.x0().d(h2.g, CollectionUtils.map("details", jSONObject2.toString()));
            l lVar2 = l.this;
            l.a(lVar2, l.b(lVar2, jSONObject));
            if (zIsValid) {
                l.d(l.this).setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            l.this.u0().a(jSONObject);
            l.c(l.this, jSONObject);
            x2.b(((Boolean) l.this.a(c5.D6)).booleanValue());
            x2.a(((Boolean) l.this.a(c5.E6)).booleanValue());
            l.e(l.this);
            if (!((Boolean) l.this.a(c5.l3)).booleanValue() || zIsValid || !s0.a(l.p())) {
                l.g(l.this);
                return;
            }
            l.this.Q();
            if (p.a()) {
                l.this.Q().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            l.f(l.this);
        }
    }

    class b implements v0.c {
        b() {
        }

        public void a(v0.b bVar) {
            l.this.Q();
            if (p.a()) {
                l.this.Q().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            l.h(l.this).set(bVar.b());
            if (!bVar.a()) {
                l.a(l.this, "Initializing SDK in MAX environment...");
                return;
            }
            l.this.Q();
            if (p.a()) {
                l.this.Q().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            l.this.T0();
            l.this.S0();
        }
    }

    class c implements y5.b {
        c() {
        }

        public void a(JSONObject jSONObject) {
            l.a(l.this, jSONObject);
            l.c(l.this).set(false);
            l.g(l.this);
        }
    }

    class d implements d4.a {
        final /* synthetic */ d4 a;

        d(d4 d4Var) {
            this.a = d4Var;
        }

        public void a() {
            l.this.Q();
            if (p.a()) {
                l.this.Q().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (l.a(l.this)) {
                if (!l.b(l.this)) {
                    l.this.T0();
                }
            }
            this.a.b(this);
        }

        public void b() {
        }
    }

    /* renamed from: $r8$lambda$38G_Egj1ONEXinb8-0ZpHRSE35s, reason: not valid java name */
    public static /* synthetic */ void m9$r8$lambda$38G_Egj1ONEXinb80ZpHRSE35s(l lVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lVar.b(sdkInitializationListener);
        int i5 = onWarmupCompleted + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$3Lim_XwN5uyyQLrClba_GtFumhM(l lVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        lVar.a(sdkInitializationListener);
        int i5 = IAuthTabCallback + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$FhMDyMgWKKGTW4KvNSyM6l9TjEI(l lVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        lVar.L0();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onWarmupCompleted + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$I4XbiLIAnlhhHW60sC2_lyCTncM(l lVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lVar.M0();
        int i5 = onWarmupCompleted + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: $r8$lambda$J9_SFr6O1SC-SgN8CalwUP9GgZw, reason: not valid java name */
    public static /* synthetic */ void m10$r8$lambda$J9_SFr6O1SCSgN8CalwUP9GgZw(l lVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        lVar.K0();
        int i5 = IAuthTabCallback + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$JRHwJaDT5L9TP0VpMK7LUgzVwog(l lVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lVar.N0();
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$Xwd13T63EBu9OBtTqaV7FJQdJMw(l lVar, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lVar.b(str);
        int i5 = IAuthTabCallback + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$aaW7q4e7M6FXEn0dhXQ28rxyMzQ(l lVar, AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        lVar.a(appLovinSdkInitializationConfiguration);
        if (i4 != 0) {
            int i5 = 8 / 0;
        }
        int i6 = IAuthTabCallback + 11;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        K0 = new Object();
        H0 = System.currentTimeMillis();
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    t7.c();
                }
            });
            I0 = true;
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
            I0 = false;
        }
    }

    public l(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.r0 = false;
        E0 = this;
        this.j = appLovinSdkSettings;
        this.d = System.currentTimeMillis();
        this.r0 = true;
        if (!H0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        F0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.c = new WeakReference((Activity) context);
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean H0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = I0;
        int i5 = i4 + 35;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void L0() {
        int i2 = 2 % 2;
        i6 i6VarS0 = s0();
        int i3 = this.v0 + 1;
        this.v0 = i3;
        i6VarS0.a(new y5(i3, this, new c()), i6.b.a);
        int i4 = IAuthTabCallback + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private /* synthetic */ void N0() {
        synchronized (this.n0) {
            boolean zA = s0.a(p());
            if (!I0()) {
                Q();
                if (p.a()) {
                    Q().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + X());
                }
            }
            if (!((Boolean) a(c5.m3)).booleanValue() || zA) {
                T0();
            }
            if (((Boolean) a(c5.l3)).booleanValue() && !zA) {
                Q();
                if (p.a()) {
                    Q().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                U0();
            }
        }
    }

    static /* synthetic */ void a(l lVar, JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lVar.c(jSONObject);
        int i5 = IAuthTabCallback + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ boolean b(l lVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = lVar.r0;
        if (i4 == 0) {
            int i5 = 32 / 0;
        }
        return z;
    }

    static /* synthetic */ AtomicBoolean c(l lVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        AtomicBoolean atomicBoolean = lVar.f5i;
        int i6 = i3 + 19;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return atomicBoolean;
        }
        throw null;
    }

    static /* synthetic */ SdkConfigurationImpl d(l lVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        SdkConfigurationImpl sdkConfigurationImpl = lVar.z0;
        int i6 = i3 + 103;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 1 / 0;
        }
        return sdkConfigurationImpl;
    }

    static /* synthetic */ void e(l lVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        lVar.R0();
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = onWarmupCompleted + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void f(l lVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        lVar.U0();
        int i5 = IAuthTabCallback + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void g(l lVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        lVar.P0();
        int i5 = onWarmupCompleted + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ AtomicBoolean h(l lVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        Object obj = null;
        AtomicBoolean atomicBoolean = lVar.q0;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 63;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return atomicBoolean;
        }
        obj.hashCode();
        throw null;
    }

    public static long o() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        long j = H0;
        int i6 = i3 + 115;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public static Context p() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 27;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        Context context = F0;
        int i6 = i4 + 111;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return context;
    }

    public g1 A() {
        Object g1Var;
        Object obj = this.U.get();
        if (obj == null) {
            synchronized (this.U) {
                g1Var = this.U.get();
                if (g1Var == null) {
                    g1Var = new g1(this);
                    this.U.set(g1Var);
                }
            }
            obj = g1Var;
        }
        if (obj == this.U) {
            obj = null;
        }
        return (g1) obj;
    }

    public AppLovinSdk A0() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.q;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public m B() {
        Object mVar;
        Object obj = this.A.get();
        if (obj == null) {
            synchronized (this.A) {
                mVar = this.A.get();
                if (mVar == null) {
                    mVar = new m(this);
                    this.A.set(mVar);
                }
            }
            obj = mVar;
        }
        if (obj == this.A) {
            obj = null;
        }
        return (m) obj;
    }

    public boolean B0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        boolean z = this.u0;
        int i6 = i4 + 47;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public k1 C() {
        Object k1Var;
        Object obj = this.D.get();
        if (obj == null) {
            synchronized (this.D) {
                k1Var = this.D.get();
                if (k1Var == null) {
                    k1Var = new k1(this);
                    this.D.set(k1Var);
                }
            }
            obj = k1Var;
        }
        if (obj == this.D) {
            obj = null;
        }
        return (k1) obj;
    }

    public String D() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        String str = this.w0;
        int i6 = i4 + 39;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public boolean D0() {
        boolean z;
        synchronized (this.n0) {
            z = this.s0;
        }
        return z;
    }

    public s1 E() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        s1 s1Var = this.u;
        int i6 = i4 + 67;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return s1Var;
    }

    public boolean E0() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.t0;
        int i5 = i4 + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return z;
    }

    public String F() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            y0().d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strD = y0().d();
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return strD;
    }

    public boolean F0() {
        boolean z;
        synchronized (this.y0) {
            z = this.x0 != null;
        }
        return z;
    }

    public EventServiceImpl G() {
        Object eventServiceImpl;
        Object obj = this.f6o.get();
        if (obj == null) {
            synchronized (this.f6o) {
                eventServiceImpl = this.f6o.get();
                if (eventServiceImpl == null) {
                    eventServiceImpl = new EventServiceImpl(this);
                    this.f6o.set(eventServiceImpl);
                }
            }
            obj = eventServiceImpl;
        }
        if (obj == this.f6o) {
            obj = null;
        }
        return (EventServiceImpl) obj;
    }

    public boolean G0() {
        boolean z;
        synchronized (this.n0) {
            z = this.r0;
        }
        return z;
    }

    public v1 H() {
        Object v1Var;
        Object obj = this.k0.get();
        if (obj == null) {
            synchronized (this.k0) {
                v1Var = this.k0.get();
                if (v1Var == null) {
                    v1Var = new v1(this);
                    this.k0.set(v1Var);
                }
            }
            obj = v1Var;
        }
        if (obj == this.k0) {
            obj = null;
        }
        return (v1) obj;
    }

    public n I() {
        Object nVar;
        Object obj = this.G.get();
        if (obj == null) {
            synchronized (this.G) {
                nVar = this.G.get();
                if (nVar == null) {
                    nVar = new n(this);
                    this.G.set(nVar);
                }
            }
            obj = nVar;
        }
        if (obj == this.G) {
            obj = null;
        }
        return (n) obj;
    }

    public boolean I0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return StringUtils.containsIgnoreCase(X(), "max");
        }
        StringUtils.containsIgnoreCase(X(), "max");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public o J() {
        Object oVar;
        Object obj = this.I.get();
        if (obj == null) {
            synchronized (this.I) {
                oVar = this.I.get();
                if (oVar == null) {
                    oVar = new o(this);
                    this.I.set(oVar);
                }
            }
            obj = oVar;
        }
        if (obj == this.I) {
            obj = null;
        }
        return (o) obj;
    }

    public boolean J0() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zA = t7.a("com.unity3d.player.UnityPlayerActivity");
        int i5 = IAuthTabCallback + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zA;
    }

    public AppLovinSdkInitializationConfiguration L() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration = this.x0;
        int i5 = i3 + 87;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return appLovinSdkInitializationConfiguration;
    }

    public long M() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 21;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.d;
        int i5 = i4 + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return j;
    }

    public Long N() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.g;
        int i5 = i3 + 83;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public long O() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        long j = this.f;
        int i6 = i4 + 83;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void O0() throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 29;
        onWarmupCompleted = i3 % 128;
        b(i3 % 2 == 0);
    }

    public s2 P() {
        Object s2Var;
        Object obj = this.Y.get();
        if (obj == null) {
            synchronized (this.Y) {
                s2Var = this.Y.get();
                if (s2Var == null) {
                    s2Var = new s2(this);
                    this.Y.set(s2Var);
                }
            }
            obj = s2Var;
        }
        if (obj == this.Y) {
            obj = null;
        }
        return (s2) obj;
    }

    public p Q() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.r;
        }
        throw null;
    }

    public d3 R() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public com.applovin.impl.mediation.d S() {
        Object dVar;
        Object obj = this.i0.get();
        if (obj == null) {
            synchronized (this.i0) {
                dVar = this.i0.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.mediation.d(this);
                    this.i0.set(dVar);
                }
            }
            obj = dVar;
        }
        if (obj == this.i0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.d) obj;
    }

    public void S0() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        u().a();
        int i5 = onWarmupCompleted + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public e T() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        e eVar = this.j0;
        int i6 = i3 + 31;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return eVar;
    }

    public void T0() {
        synchronized (this.n0) {
            this.r0 = true;
            s0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f U() {
        Object fVar;
        Object obj = this.d0.get();
        if (obj == null) {
            synchronized (this.d0) {
                fVar = this.d0.get();
                if (fVar == null) {
                    fVar = new com.applovin.impl.mediation.f(this);
                    this.d0.set(fVar);
                }
            }
            obj = fVar;
        }
        if (obj == this.d0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.f) obj;
    }

    public g V() {
        Object gVar;
        Object obj = this.c0.get();
        if (obj == null) {
            synchronized (this.c0) {
                gVar = this.c0.get();
                if (gVar == null) {
                    gVar = new g(this);
                    this.c0.set(gVar);
                }
            }
            obj = gVar;
        }
        if (obj == this.c0) {
            obj = null;
        }
        return (g) obj;
    }

    public t3 W() {
        Object t3Var;
        Object obj = this.g0.get();
        if (obj == null) {
            synchronized (this.g0) {
                t3Var = this.g0.get();
                if (t3Var == null) {
                    t3Var = new t3(this);
                    this.g0.set(t3Var);
                }
            }
            obj = t3Var;
        }
        if (obj == this.g0) {
            obj = null;
        }
        return (t3) obj;
    }

    public String X() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String str = this.l;
        int i6 = i3 + 51;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void X0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        z().n();
        if (i4 != 0) {
            int i5 = 84 / 0;
        }
    }

    public void Y0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        a((Map) null);
        int i5 = onWarmupCompleted + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public MediationServiceImpl Z() {
        Object mediationServiceImpl;
        Object obj = this.e0.get();
        if (obj == null) {
            synchronized (this.e0) {
                mediationServiceImpl = this.e0.get();
                if (mediationServiceImpl == null) {
                    mediationServiceImpl = new MediationServiceImpl(this);
                    this.e0.set(mediationServiceImpl);
                }
            }
            obj = mediationServiceImpl;
        }
        if (obj == this.e0) {
            obj = null;
        }
        return (MediationServiceImpl) obj;
    }

    public y3 a0() {
        Object y3Var;
        Object obj = this.z.get();
        if (obj == null) {
            synchronized (this.z) {
                y3Var = this.z.get();
                if (y3Var == null) {
                    y3Var = new y3(this);
                    this.z.set(y3Var);
                }
            }
            obj = y3Var;
        }
        if (obj == this.z) {
            obj = null;
        }
        return (y3) obj;
    }

    public z3 b0() {
        Object z3Var;
        Object obj = this.f0.get();
        if (obj == null) {
            synchronized (this.f0) {
                z3Var = this.f0.get();
                if (z3Var == null) {
                    z3Var = new z3();
                    this.f0.set(z3Var);
                }
            }
            obj = z3Var;
        }
        if (obj == this.f0) {
            obj = null;
        }
        return (z3) obj;
    }

    public q c0() {
        Object qVar;
        Object obj = this.h0.get();
        if (obj == null) {
            synchronized (this.h0) {
                qVar = this.h0.get();
                if (qVar == null) {
                    qVar = new q(this);
                    this.h0.set(qVar);
                }
            }
            obj = qVar;
        }
        if (obj == this.h0) {
            obj = null;
        }
        return (q) obj;
    }

    public AppLovinNativeAdService d0() {
        Object appLovinNativeAdService;
        Object obj = this.n.get();
        if (obj == null) {
            synchronized (this.n) {
                appLovinNativeAdService = this.n.get();
                if (appLovinNativeAdService == null) {
                    appLovinNativeAdService = new AppLovinNativeAdService(this);
                    this.n.set(appLovinNativeAdService);
                }
            }
            obj = appLovinNativeAdService;
        }
        if (obj == this.n) {
            obj = null;
        }
        return (AppLovinNativeAdService) obj;
    }

    public d4 e0() {
        Object d4Var;
        Object obj = this.M.get();
        if (obj == null) {
            synchronized (this.M) {
                d4Var = this.M.get();
                if (d4Var == null) {
                    d4Var = new d4(p());
                    this.M.set(d4Var);
                }
            }
            obj = d4Var;
        }
        if (obj == this.M) {
            obj = null;
        }
        return (d4) obj;
    }

    public h4 f0() {
        Object h4Var;
        Object obj = this.X.get();
        if (obj == null) {
            synchronized (this.X) {
                h4Var = this.X.get();
                if (h4Var == null) {
                    h4Var = new h4(this);
                    this.X.set(h4Var);
                }
            }
            obj = h4Var;
        }
        if (obj == this.X) {
            obj = null;
        }
        return (h4) obj;
    }

    public o4 g0() {
        Object o4Var;
        Object obj = this.T.get();
        if (obj == null) {
            synchronized (this.T) {
                o4Var = this.T.get();
                if (o4Var == null) {
                    o4Var = new o4(this);
                    this.T.set(o4Var);
                }
            }
            obj = o4Var;
        }
        if (obj == this.T) {
            obj = null;
        }
        return (o4) obj;
    }

    public com.applovin.impl.sdk.network.b h0() {
        Object bVar;
        Object obj = this.a0.get();
        if (obj == null) {
            synchronized (this.a0) {
                bVar = this.a0.get();
                if (bVar == null) {
                    bVar = new com.applovin.impl.sdk.network.b(this);
                    this.a0.set(bVar);
                }
            }
            obj = bVar;
        }
        if (obj == this.a0) {
            obj = null;
        }
        return (com.applovin.impl.sdk.network.b) obj;
    }

    public e i() {
        Object eVar;
        Object obj = this.V.get();
        if (obj == null) {
            synchronized (this.V) {
                eVar = this.V.get();
                if (eVar == null) {
                    eVar = new e(this);
                    this.V.set(eVar);
                }
            }
            obj = eVar;
        }
        if (obj == this.V) {
            obj = null;
        }
        return (e) obj;
    }

    public PostbackServiceImpl i0() {
        Object postbackServiceImpl;
        Object obj = this.Z.get();
        if (obj == null) {
            synchronized (this.Z) {
                postbackServiceImpl = this.Z.get();
                if (postbackServiceImpl == null) {
                    postbackServiceImpl = new PostbackServiceImpl(this);
                    this.Z.set(postbackServiceImpl);
                }
            }
            obj = postbackServiceImpl;
        }
        if (obj == this.Z) {
            obj = null;
        }
        return (PostbackServiceImpl) obj;
    }

    public f j() {
        Object fVar;
        Object obj = this.E.get();
        if (obj == null) {
            synchronized (this.E) {
                fVar = this.E.get();
                if (fVar == null) {
                    fVar = new f(this);
                    this.E.set(fVar);
                }
            }
            obj = fVar;
        }
        if (obj == this.E) {
            obj = null;
        }
        return (f) obj;
    }

    public String j0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String strA = y0().a();
        int i5 = onWarmupCompleted + 57;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return strA;
        }
        throw null;
    }

    public j k() {
        Object jVar;
        Object obj = this.b0.get();
        if (obj == null) {
            synchronized (this.b0) {
                jVar = this.b0.get();
                if (jVar == null) {
                    jVar = new j(this);
                    this.b0.set(jVar);
                }
            }
            obj = jVar;
        }
        if (obj == this.b0) {
            obj = null;
        }
        return (j) obj;
    }

    public String k0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.a;
        int i5 = i3 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public AppLovinAdServiceImpl l() {
        Object appLovinAdServiceImpl;
        Object obj = this.m.get();
        if (obj == null) {
            synchronized (this.m) {
                appLovinAdServiceImpl = this.m.get();
                if (appLovinAdServiceImpl == null) {
                    appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                    this.m.set(appLovinAdServiceImpl);
                }
            }
            obj = appLovinAdServiceImpl;
        }
        if (obj == this.m) {
            obj = null;
        }
        return (AppLovinAdServiceImpl) obj;
    }

    public MaxSegmentCollectionImpl l0() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        MaxSegmentCollectionImpl maxSegmentCollectionImpl = this.k;
        int i6 = i3 + 69;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return maxSegmentCollectionImpl;
    }

    public h m() {
        Object hVar;
        Object obj = this.J.get();
        if (obj == null) {
            synchronized (this.J) {
                hVar = this.J.get();
                if (hVar == null) {
                    hVar = new h();
                    this.J.set(hVar);
                }
            }
            obj = hVar;
        }
        if (obj == this.J) {
            obj = null;
        }
        return (h) obj;
    }

    public i n() {
        Object iVar;
        Object obj = this.W.get();
        if (obj == null) {
            synchronized (this.W) {
                iVar = this.W.get();
                if (iVar == null) {
                    iVar = new i(this);
                    this.W.set(iVar);
                }
            }
            obj = iVar;
        }
        if (obj == this.W) {
            obj = null;
        }
        return (i) obj;
    }

    public b5 n0() {
        Object b5Var;
        Object obj = this.O.get();
        if (obj == null) {
            synchronized (this.O) {
                b5Var = this.O.get();
                if (b5Var == null) {
                    b5Var = new b5(this);
                    this.O.set(b5Var);
                }
            }
            obj = b5Var;
        }
        if (obj == this.O) {
            obj = null;
        }
        return (b5) obj;
    }

    public SessionTracker o0() {
        Object sessionTracker;
        Object obj = this.H.get();
        if (obj == null) {
            synchronized (this.H) {
                sessionTracker = this.H.get();
                if (sessionTracker == null) {
                    sessionTracker = new SessionTracker(this);
                    this.H.set(sessionTracker);
                }
            }
            obj = sessionTracker;
        }
        if (obj == this.H) {
            obj = null;
        }
        return (SessionTracker) obj;
    }

    public AppLovinSdkSettings p0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public j q() {
        Object jVar;
        Object obj = this.P.get();
        if (obj == null) {
            synchronized (this.P) {
                jVar = this.P.get();
                if (jVar == null) {
                    jVar = new j(this);
                    this.P.set(jVar);
                }
            }
            obj = jVar;
        }
        if (obj == this.P) {
            obj = null;
        }
        return (j) obj;
    }

    public d5 q0() {
        Object d5Var;
        Object obj = this.x.get();
        if (obj == null) {
            synchronized (this.x) {
                d5Var = this.x.get();
                if (d5Var == null) {
                    d5Var = new d5(this);
                    this.x.set(d5Var);
                }
            }
            obj = d5Var;
        }
        if (obj == this.x) {
            obj = null;
        }
        return (d5) obj;
    }

    public String r() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.b;
        if (i4 == 0) {
            int i5 = 83 / 0;
        }
        return str;
    }

    public f5 r0() {
        Object f5Var;
        Object obj = this.B.get();
        if (obj == null) {
            synchronized (this.B) {
                f5Var = this.B.get();
                if (f5Var == null) {
                    f5Var = new f5(this);
                    this.B.set(f5Var);
                }
            }
            obj = f5Var;
        }
        if (obj == this.B) {
            obj = null;
        }
        return (f5) obj;
    }

    public String s() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strB = y0().b();
        int i5 = onWarmupCompleted + 47;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return strB;
        }
        throw null;
    }

    public i6 s0() {
        Object i6Var;
        Object obj = this.w.get();
        if (obj == null) {
            synchronized (this.w) {
                i6Var = this.w.get();
                if (i6Var == null) {
                    i6Var = new i6(this);
                    this.w.set(i6Var);
                }
            }
            obj = i6Var;
        }
        if (obj == this.w) {
            obj = null;
        }
        return (i6) obj;
    }

    public CmpServiceImpl t() {
        Object cmpServiceImpl;
        Object obj = this.p.get();
        if (obj == null) {
            synchronized (this.p) {
                cmpServiceImpl = this.p.get();
                if (cmpServiceImpl == null) {
                    cmpServiceImpl = new CmpServiceImpl(this);
                    this.p.set(cmpServiceImpl);
                }
            }
            obj = cmpServiceImpl;
        }
        if (obj == this.p) {
            obj = null;
        }
        return (CmpServiceImpl) obj;
    }

    public f7 t0() {
        Object f7Var;
        Object obj = this.R.get();
        if (obj == null) {
            synchronized (this.R) {
                f7Var = this.R.get();
                if (f7Var == null) {
                    f7Var = new f7(this);
                    this.R.set(f7Var);
                }
            }
            obj = f7Var;
        }
        if (obj == this.R) {
            obj = null;
        }
        return (f7) obj;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "CoreSdk{sdkKey='" + this.a + "', enabled=" + this.s0 + ", isFirstSession=" + this.t0 + '}';
        int i3 = onWarmupCompleted + 27;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return str;
    }

    public k u() {
        Object kVar;
        Object obj = this.N.get();
        if (obj == null) {
            synchronized (this.N) {
                kVar = this.N.get();
                if (kVar == null) {
                    kVar = new k(this);
                    this.N.set(kVar);
                }
            }
            obj = kVar;
        }
        if (obj == this.N) {
            obj = null;
        }
        return (k) obj;
    }

    public l7 u0() {
        Object l7Var;
        Object obj = this.l0.get();
        if (obj == null) {
            synchronized (this.l0) {
                l7Var = this.l0.get();
                if (l7Var == null) {
                    l7Var = new l7(this);
                    this.l0.set(l7Var);
                }
            }
            obj = l7Var;
        }
        if (obj == this.l0) {
            obj = null;
        }
        return (l7) obj;
    }

    public String v() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            y0().c();
            throw null;
        }
        String strC = y0().c();
        int i4 = onWarmupCompleted + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return strC;
    }

    public SdkConfigurationImpl w() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SdkConfigurationImpl sdkConfigurationImpl = this.z0;
        if (i4 != 0) {
            int i5 = 12 / 0;
        }
        return sdkConfigurationImpl;
    }

    public r0 x() {
        Object r0Var;
        Object obj = this.y.get();
        if (obj == null) {
            synchronized (this.y) {
                r0Var = this.y.get();
                if (r0Var == null) {
                    r0Var = new r0(this);
                    this.y.set(r0Var);
                }
            }
            obj = r0Var;
        }
        if (obj == this.y) {
            obj = null;
        }
        return (r0) obj;
    }

    public r7 x0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        r7 r7Var = this.v;
        int i6 = i3 + 109;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return r7Var;
    }

    public v0 y() {
        Object v0Var;
        Object obj = this.Q.get();
        if (obj == null) {
            synchronized (this.Q) {
                v0Var = this.Q.get();
                if (v0Var == null) {
                    v0Var = new v0(this);
                    this.Q.set(v0Var);
                }
            }
            obj = v0Var;
        }
        if (obj == this.Q) {
            obj = null;
        }
        return (v0) obj;
    }

    public s7 y0() {
        Object s7Var;
        Object obj = this.C.get();
        if (obj == null) {
            synchronized (this.C) {
                s7Var = this.C.get();
                if (s7Var == null) {
                    s7Var = new s7(this);
                    this.C.set(s7Var);
                }
            }
            obj = s7Var;
        }
        if (obj == this.C) {
            obj = null;
        }
        return (s7) obj;
    }

    public f1 z() {
        Object f1Var;
        Object obj = this.S.get();
        if (obj == null) {
            synchronized (this.S) {
                f1Var = this.S.get();
                if (f1Var == null) {
                    f1Var = new f1(this);
                    this.S.set(f1Var);
                }
            }
            obj = f1Var;
        }
        if (obj == this.S) {
            obj = null;
        }
        return (f1) obj;
    }

    public q8 z0() {
        Object q8Var;
        Object obj = this.L.get();
        if (obj == null) {
            synchronized (this.L) {
                q8Var = this.L.get();
                if (q8Var == null) {
                    q8Var = new q8(this);
                    this.L.set(q8Var);
                }
            }
            obj = q8Var;
        }
        if (obj == this.L) {
            obj = null;
        }
        return (q8) obj;
    }

    private void U0() {
        int i2 = 2 % 2;
        d4 d4VarE0 = e0();
        d4VarE0.a(new d(d4VarE0));
        int i3 = onWarmupCompleted + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ void a(l lVar, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lVar.c(str);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ List b(l lVar, JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List listA = lVar.a(jSONObject);
        int i5 = onWarmupCompleted + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return listA;
    }

    static /* synthetic */ void c(l lVar, JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        lVar.b(jSONObject);
        if (i4 != 0) {
            int i5 = 69 / 0;
        }
        int i6 = IAuthTabCallback + 1;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    private void d() {
        int i2 = 2 % 2;
        i6 i6VarS0 = s0();
        int i3 = this.v0 + 1;
        this.v0 = i3;
        i6VarS0.a(new y5(i3, this, new a()), i6.b.a);
        int i4 = IAuthTabCallback + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public com.applovin.impl.c e() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        com.applovin.impl.c cVarA = a(F0);
        int i5 = IAuthTabCallback + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return cVarA;
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar;
        Object obj = this.F.get();
        if (obj == null) {
            synchronized (this.F) {
                aVar = this.F.get();
                if (aVar == null) {
                    aVar = new com.applovin.impl.sdk.a(this);
                    this.F.set(aVar);
                }
            }
            obj = aVar;
        }
        if (obj == this.F) {
            obj = null;
        }
        return (com.applovin.impl.sdk.a) obj;
    }

    public f g() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.s;
        }
        throw null;
    }

    public com.applovin.impl.sdk.c h() {
        Object cVar;
        Object obj = this.K.get();
        if (obj == null) {
            synchronized (this.K) {
                cVar = this.K.get();
                if (cVar == null) {
                    cVar = new com.applovin.impl.sdk.c(this);
                    this.K.set(cVar);
                }
            }
            obj = cVar;
        }
        if (obj == this.K) {
            obj = null;
        }
        return (com.applovin.impl.sdk.c) obj;
    }

    public long v0() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 ? this.h != 0 : this.h != 0) {
            return System.currentTimeMillis() - this.h;
        }
        int i5 = i3 + 71;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    private /* synthetic */ void M0() {
        int i2 = 2 % 2;
        if (I0()) {
            o2.b(this);
            int i3 = onWarmupCompleted + 69;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = onWarmupCompleted + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ e a(l lVar, e eVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lVar.j0 = eVar;
        if (i4 == 0) {
            int i5 = 10 / 0;
        }
        return eVar;
    }

    public Activity K() {
        WeakReference weakReference;
        int i2 = 2 % 2;
        if (!((Boolean) a(c5.G4)).booleanValue() || (weakReference = this.c) == null) {
            int i3 = onWarmupCompleted + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = onWarmupCompleted + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return (Activity) weakReference.get();
    }

    public void Q0() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (StringUtils.isValidString(this.l)) {
            int i5 = IAuthTabCallback + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 79 / 0;
                return;
            }
            return;
        }
        this.l = "max";
        int i7 = IAuthTabCallback + 109;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ Object a(l lVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object obj = lVar.n0;
        if (i4 == 0) {
            int i5 = 2 / 0;
        }
        return obj;
    }

    public static void b(Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (context == null) {
            return;
        }
        F0 = context.getApplicationContext();
        G0 = true;
        int i5 = onWarmupCompleted + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public void W0() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!StringUtils.isValidString(this.w0)) {
            int i5 = IAuthTabCallback + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.w0 = "max";
            Q();
            if (!p.a()) {
                return;
            }
            Q().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public Map m0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        MaxSegmentCollectionImpl maxSegmentCollectionImplL0 = l0();
        Object obj = null;
        if (maxSegmentCollectionImplL0 == null) {
            return null;
        }
        Map jsonData = maxSegmentCollectionImplL0.getJsonData();
        int i5 = onWarmupCompleted + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return jsonData;
        }
        obj.hashCode();
        throw null;
    }

    public Activity w0() {
        int i2 = 2 % 2;
        Activity activityB = a(p()).b();
        if (activityB != null) {
            int i3 = IAuthTabCallback + 49;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 30 / 0;
            }
            return activityB;
        }
        Activity activityK = K();
        int i5 = onWarmupCompleted + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return activityK;
    }

    static /* synthetic */ List a(l lVar, List list) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        lVar.m0 = list;
        int i6 = i4 + 111;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    private /* synthetic */ void K0() throws Throwable {
        int i2 = 2 % 2;
        if (s0().f()) {
            return;
        }
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Timing out adapters init...");
            int i3 = IAuthTabCallback + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        s0().g();
        b(true);
        int i5 = IAuthTabCallback + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private Map Y() {
        int i2 = 2 % 2;
        try {
            Map stringMap = JsonUtils.toStringMap(new JSONObject((String) a(c5.r4)));
            int i3 = onWarmupCompleted + 25;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return stringMap;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public void a(AppLovinSdk appLovinSdk) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.q = appLovinSdk;
        int i5 = onWarmupCompleted + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
    }

    public static String a(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return a(str, (List) null);
        }
        a(str, (List) null);
        obj.hashCode();
        throw null;
    }

    private void P0() {
        Long l;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            l = (Long) a(c5.u3);
            if (l.longValue() < 1) {
                return;
            }
        } else {
            l = (Long) a(c5.u3);
            if (l.longValue() < 0) {
                return;
            }
        }
        if (this.f5i.compareAndSet(false, true)) {
            m8.a(l.longValue(), false, this, new l$.ExternalSyntheticLambda8(this));
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static String a(int i2) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        String strA = a(i2, (List) null);
        int i6 = onWarmupCompleted + 97;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return strA;
        }
        throw null;
    }

    public void Z0() {
        int i2 = 2 % 2;
        if ("admob".equalsIgnoreCase(this.l)) {
            int i3 = onWarmupCompleted + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(!((Boolean) a(c5.U3)).booleanValue())) {
                int i5 = IAuthTabCallback + 65;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                String str = (String) a(c5.T3);
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = AppLovinSdk.VERSION;
                    sb.append(str2);
                    sb.append(".");
                    if (!str.startsWith(sb.toString())) {
                        String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
                        p.h("AppLovinSdk", str3);
                        AppLovinSdkUtils.runOnUiThread(true, new l$.ExternalSyntheticLambda1(this, str3));
                        int i7 = IAuthTabCallback + 23;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        int i8 = IAuthTabCallback + 109;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
    }

    public static String a(String str, List list) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!TextUtils.isEmpty(str)) {
            Context contextP = p();
            return a(contextP.getResources().getIdentifier(str, "string", contextP.getPackageName()), list);
        }
        int i5 = onWarmupCompleted + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        T0();
        r0 = 46 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        T0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        r6.o0.set(true);
        r1 = com.applovin.impl.sdk.l.onWarmupCompleted + 103;
        com.applovin.impl.sdk.l.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r6.o0.compareAndSet(true, true) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r6.o0.compareAndSet(true, false) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        r1 = com.applovin.impl.sdk.l.IAuthTabCallback + 15;
        com.applovin.impl.sdk.l.onWarmupCompleted = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void V0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            p.h("AppLovinSdk", "Resetting SDK state...");
            q0().a();
            q0().e();
        } else {
            p.h("AppLovinSdk", "Resetting SDK state...");
            q0().a();
            q0().e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r3
      0x002f: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(int i2, List list) throws Resources.NotFoundException {
        String string;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            string = p().getResources().getString(i2);
            int i5 = 82 / 0;
            if (list != null) {
                string = String.format(string, list.toArray());
                int i6 = IAuthTabCallback + 61;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            string = p().getResources().getString(i2);
            if (list != null) {
            }
        }
        int i8 = onWarmupCompleted + 27;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    public static com.applovin.impl.c a(Context context) {
        if (J0 == null) {
            synchronized (K0) {
                if (J0 == null) {
                    J0 = new com.applovin.impl.c(context);
                }
            }
        }
        return J0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r3.h = java.lang.System.currentTimeMillis();
        com.applovin.impl.s0.c(r4, r3);
        com.applovin.impl.s0.b(r4, r3);
        com.applovin.impl.s0.a(r4, r3);
        com.applovin.impl.p3.f(r4, r3);
        com.applovin.impl.p3.d(r4, r3);
        com.applovin.impl.p3.e(r4, r3);
        com.applovin.impl.p3.g(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (com.applovin.impl.sdk.utils.JsonUtils.isValid(r4) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (com.applovin.impl.sdk.utils.JsonUtils.isValid(r4) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r4 = com.applovin.impl.sdk.l.onWarmupCompleted + 85;
        com.applovin.impl.sdk.l.IAuthTabCallback = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 73 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r5.p0.compareAndSet(false, true) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        c("Consent flow is already shown. Initializing SDK in MAX environment...");
        r1 = com.applovin.impl.sdk.l.IAuthTabCallback + 37;
        com.applovin.impl.sdk.l.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (y().j() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r1 = com.applovin.impl.sdk.l.IAuthTabCallback + 89;
        com.applovin.impl.sdk.l.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
        c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        r1 = com.applovin.impl.sdk.l.onWarmupCompleted + 87;
        com.applovin.impl.sdk.l.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if ((r1 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        y().a(w0(), new com.applovin.impl.sdk.l.b(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        c("Initializing SDK in non-MAX environment...");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (I0() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ((!I0()) != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void R0() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
    }

    private void c(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", str);
        }
        s0().a(new h6(this));
        int i5 = IAuthTabCallback + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public void c() {
        synchronized (this.n0) {
            if (!this.r0 && !this.s0) {
                T0();
            }
        }
    }

    private void b(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        int i2 = 2 % 2;
        C0();
        this.j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            p.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            q0().a(c5.T3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(c5.s)).booleanValue()) {
            int i3 = IAuthTabCallback + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
            int i5 = IAuthTabCallback + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        i6 i6VarS0 = s0();
        n5 n5Var = this.C0;
        i6.b bVar = i6.b.a;
        i6VarS0.a(n5Var, bVar);
        s0().a(this.D0, bVar);
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        String strIntern;
        synchronized (this.y0) {
            if (this.x0 != null) {
                p.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.x0 + ". Ignoring the provided initialization configuration.");
                if (!D0() || sdkInitializationListener == null) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new l$.ExternalSyntheticLambda2(this, sdkInitializationListener));
                return;
            }
            this.e = System.currentTimeMillis();
            this.x0 = appLovinSdkInitializationConfiguration;
            this.A0 = sdkInitializationListener;
            if (p.a()) {
                p pVar = this.r;
                StringBuilder sb = new StringBuilder();
                sb.append("Initializing with configuration: ");
                sb.append(this.x0);
                sb.append(", listener: ");
                if (this.A0 != null) {
                    strIntern = "configured";
                } else {
                    Object[] objArr = new Object[1];
                    aa(new int[]{-1980080617, 586289410}, ((byte) KeyEvent.getModifierMetaStateMask()) + 5, objArr);
                    strIntern = ((String) objArr[0]).intern();
                }
                sb.append(strIntern);
                pVar.a("AppLovinSdk", sb.toString());
            }
            this.a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.b = appLovinSdkInitializationConfiguration.getAxonEventKey();
            this.l = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.k = appLovinSdkInitializationConfiguration.getSegmentCollection();
            t7.a((Runnable) new l$.ExternalSyntheticLambda3(this, appLovinSdkInitializationConfiguration));
        }
    }

    public List c(c5 c5Var) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List listC = q0().c(c5Var);
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        return listC;
    }

    public void c(e5 e5Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        r0().b(e5Var);
        int i5 = onWarmupCompleted + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private void b(JSONObject jSONObject) {
        Iterator it;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
            int i4 = 53 / 0;
        } else {
            it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        }
        while (it.hasNext()) {
            int i5 = IAuthTabCallback + 113;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            p.h("AppLovinSdk", (String) it.next());
        }
    }

    private /* synthetic */ void b(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            if (!t7.c(this)) {
                HashMap map = new HashMap();
                map.put("details", "admob");
                map.put("error_message", str);
                E().a(h2.e1, "adapterVersionMismatch", map);
                int i4 = IAuthTabCallback + 61;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 80 / 0;
                    return;
                }
                return;
            }
            throw new IllegalStateException(str);
        }
        t7.c(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            sdkInitializationListener.onSdkInitialized(this.z0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sdkInitializationListener.onSdkInitialized(this.z0);
        int i4 = IAuthTabCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private /* synthetic */ void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        b(appLovinSdkInitializationConfiguration);
        int i5 = IAuthTabCallback + 75;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
    }

    private List a(JSONObject jSONObject) {
        int i2 = 2 % 2;
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                int i3 = onWarmupCompleted + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(fromString);
                if (i4 != 0) {
                    int i5 = 72 / 0;
                }
            }
        }
        int i6 = onWarmupCompleted + 103;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public void a(boolean z) throws Throwable {
        synchronized (this.n0) {
            this.r0 = false;
            this.s0 = z;
        }
        if (z) {
            List listA = a4.a(this);
            if (listA.isEmpty()) {
                s0().g();
                O0();
                return;
            }
            Long l = (Long) a(v3.A7);
            x6 x6Var = new x6(this, true, "timeoutInitAdapters", new l$.ExternalSyntheticLambda6(this));
            Q();
            if (p.a()) {
                Q().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l + "ms...");
            }
            s0().a(x6Var, i6.b.d, l.longValue(), true);
        }
    }

    protected void b(boolean z) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!y().i()) {
            int i5 = IAuthTabCallback + 35;
            onWarmupCompleted = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.A0;
                if (sdkInitializationListener != null) {
                    if (D0()) {
                        this.A0 = null;
                        this.B0 = null;
                        U().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
                    } else {
                        if (this.B0 == sdkInitializationListener) {
                            return;
                        }
                        U().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                        if (((Boolean) a(c5.p)).booleanValue()) {
                            int i6 = IAuthTabCallback + 69;
                            onWarmupCompleted = i6 % 128;
                            if (i6 % 2 == 0) {
                                this.A0 = null;
                                obj.hashCode();
                                throw null;
                            }
                            this.A0 = null;
                        } else {
                            this.B0 = sdkInitializationListener;
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putBoolean(jSONObject, "enabled", D0());
                    Object[] objArr = new Object[1];
                    aa(new int[]{1110157066, 1111439346, 696968650, -242837369}, ExpandableListView.getPackedPositionGroup(0L) + 7, objArr);
                    JsonUtils.putBoolean(jSONObject, ((String) objArr[0]).intern(), z);
                    JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.q0.get());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.e;
                    HashMap map = new HashMap();
                    map.put("duration_ms", String.valueOf(jCurrentTimeMillis - j));
                    map.put("details", jSONObject.toString());
                    this.v.d(h2.l, map);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new l$.ExternalSyntheticLambda7(this, sdkInitializationListener), Math.max(0L, ((Long) a(c5.q)).longValue()));
                    return;
                }
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.z0);
        int i5 = onWarmupCompleted + 23;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public List b(c5 c5Var) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        d5 d5VarQ0 = q0();
        if (i4 == 0) {
            return d5VarQ0.b(c5Var);
        }
        d5VarQ0.b(c5Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void b(e5 e5Var, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        r0().b(e5Var, obj);
        if (i4 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public Object b(e5 e5Var) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objA = r0().a(e5Var);
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
        return objA;
    }

    public void a(o3 o3Var) throws Throwable {
        int i2 = 2 % 2;
        if (s0().f()) {
            return;
        }
        List listA = a4.a(this);
        if (listA.size() <= 0 || !U().a().containsAll(listA)) {
            return;
        }
        Q();
        if (!(!p.a())) {
            int i3 = IAuthTabCallback + 75;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Q().a("AppLovinSdk", "All required adapters initialized");
                throw null;
            }
            Q().a("AppLovinSdk", "All required adapters initialized");
        }
        s0().g();
        O0();
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        int i2 = 2 % 2;
        List list = this.m0;
        if (list != null && list.size() > 0) {
            int i3 = IAuthTabCallback + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (!this.m0.contains(maxAdFormat)) {
                int i5 = IAuthTabCallback + 7;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 != 0;
            }
        }
        int i6 = IAuthTabCallback + 55;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public void a() {
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            str = (String) r0().a(e5.g, (Object) null);
            int i4 = 60 / 0;
            if (!StringUtils.isValidString(str)) {
                return;
            }
        } else {
            str = (String) r0().a(e5.g, (Object) null);
            if (!StringUtils.isValidString(str)) {
                return;
            }
        }
        if (AppLovinSdk.VERSION_CODE < t7.g(str)) {
            p.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            int i5 = onWarmupCompleted + 69;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 3;
            }
        }
    }

    public Object a(c5 c5Var) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objA = q0().a(c5Var);
        int i5 = onWarmupCompleted + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return objA;
    }

    public boolean a(c5 c5Var, MaxAdFormat maxAdFormat) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean zContains = b(c5Var).contains(maxAdFormat);
        int i5 = IAuthTabCallback + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zContains;
    }

    public void a(Map map) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        W().a(map);
        int i5 = IAuthTabCallback + 45;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void a(Uri uri) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        C().a(uri);
        int i5 = IAuthTabCallback + 43;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            r0().a(str, obj, editor);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        r0().a(str, obj, editor);
        int i4 = onWarmupCompleted + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public Object a(e5 e5Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objA = a(e5Var, (Object) null);
        int i5 = IAuthTabCallback + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return objA;
    }

    public Object a(e5 e5Var, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objA = r0().a(e5Var, obj);
        int i5 = IAuthTabCallback + 93;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return objA;
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            f5.a(str, obj, cls, sharedPreferences);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object objA = f5.a(str, obj, cls, sharedPreferences);
        int i4 = onWarmupCompleted + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objA;
    }

    public void a(SharedPreferences sharedPreferences) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            r0().a(sharedPreferences);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r0().a(sharedPreferences);
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void aa(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 83;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 71 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i9++;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        float f = 0.0f;
        if (iArr5 != null) {
            int i10 = $10 + 73;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 21;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(iArr5[i12]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 72 - ((Process.getThreadPriority(i6) + 20) >> 6), 8848 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        f = 0.0f;
                        i6 = 0;
                        i12 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 72, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i12++;
                        f = 0.0f;
                        i6 = 0;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
            }
            i3 = i6;
            iArr5 = iArr6;
        } else {
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i3] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22252), 40 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
                int i16 = $11 + 81;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.indexOf("", "") + 78, (ViewConfiguration.getLongPressTimeout() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i3 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i21 = $11 + 33;
        $10 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void C0() {
        int i2 = 2 % 2;
        Context context = F0;
        p pVarQ = Q();
        f5 f5VarR0 = r0();
        v0 v0VarY = y();
        a(context);
        o0();
        k();
        e0();
        U().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.a;
        if (str == null || str.length() != 86) {
            p.h("AppLovinSdk", "SDK key provided is invalid (" + this.a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        Object obj = null;
        if (StringUtils.isValidString(this.b) && this.b.length() != 36) {
            String str2 = "Axon event key length " + this.b + " is invalid - expected 36";
            if (!(!t7.c(this))) {
                throw new IllegalArgumentException(str2);
            }
            int i3 = IAuthTabCallback + 87;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                p.h("AppLovinSdk", str2);
                throw null;
            }
            p.h("AppLovinSdk", str2);
        }
        if (v0VarY.l()) {
            String str3 = "Terms Flow has been replaced. " + v0VarY.g();
            if (t7.c(this)) {
                throw new IllegalStateException(str3);
            }
            p.h("AppLovinSdk", str3);
        }
        if (!(!t7.j())) {
            int i4 = onWarmupCompleted + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                p.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
                obj.hashCode();
                throw null;
            }
            p.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!t7.b(this)) {
            p.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (t7.m(context)) {
            this.j.setVerboseLogging(true);
        }
        q0().a(c5.k, Boolean.valueOf(this.j.isVerboseLoggingEnabled()));
        a4.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        e5 e5Var = e5.c;
        if (TextUtils.isEmpty((String) f5VarR0.a(e5Var, (Object) null, defaultSharedPreferences))) {
            this.t0 = true;
            f5VarR0.b(e5Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            f5VarR0.b(e5Var, Boolean.toString(false), defaultSharedPreferences);
        }
        e5 e5Var2 = e5.d;
        if (((Boolean) f5VarR0.a(e5Var2, Boolean.FALSE)).booleanValue()) {
            if (p.a()) {
                int i5 = IAuthTabCallback + 3;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                pVarQ.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
                int i7 = onWarmupCompleted + 119;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            this.u0 = true;
        } else {
            if (p.a()) {
                pVarQ.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            f5VarR0.b(e5Var2, Boolean.TRUE);
            f5VarR0.b(e5.t, Boolean.valueOf(v0VarY.j()));
        }
        e5 e5Var3 = e5.e;
        this.f = ((Long) f5VarR0.a(e5Var3, 0L)).longValue() + 1;
        r0().b(e5Var3, Long.valueOf(this.f));
        e5 e5Var4 = e5.f;
        this.g = (Long) f5VarR0.a(e5Var4, (Object) null);
        r0().b(e5Var4, Long.valueOf(H0));
        e5 e5Var5 = e5.g;
        String str4 = (String) f5VarR0.a(e5Var5, (Object) null);
        if (StringUtils.isValidString(str4)) {
            int i9 = onWarmupCompleted + 35;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                t7.g(str4);
                int i10 = AppLovinSdk.VERSION_CODE;
                throw null;
            }
            if (AppLovinSdk.VERSION_CODE > t7.g(str4)) {
                f5VarR0.b(e5Var5, AppLovinSdk.VERSION);
            }
        }
        x0().d(h2.e, CollectionUtils.map("details", "isInitProviderContextSet=" + G0));
    }

    public String b() throws Throwable {
        int i2 = 2 % 2;
        if (StringUtils.isValidString(this.w0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map mapY = Y();
        List listC = c(c5.t4);
        Boolean bool = (Boolean) a(c5.u4);
        if (mapY.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        boolean z = true;
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Integer numValueOf = (Integer) a(c5.s4);
            int length = stackTrace.length;
            int i3 = 0;
            while (i3 < length) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (numValueOf.intValue() <= 0) {
                    break;
                }
                String className = stackTraceElement.getClassName();
                Iterator it = listC.iterator();
                int i4 = IAuthTabCallback + 43;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                while (true) {
                    if (it.hasNext() ^ z) {
                        for (Map.Entry entry : mapY.entrySet()) {
                            if (className.startsWith((String) entry.getKey())) {
                                int i6 = onWarmupCompleted + 81;
                                IAuthTabCallback = i6 % 128;
                                if (i6 % 2 != 0) {
                                    this.w0 = (String) entry.getValue();
                                    Q();
                                    p.a();
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                this.w0 = (String) entry.getValue();
                                Q();
                                if (!p.a()) {
                                    return null;
                                }
                                Q().a("AppLovinSdk", "Detected mediation provider: " + this.w0);
                                return null;
                            }
                        }
                        if (bool.booleanValue()) {
                            int i7 = onWarmupCompleted + 51;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                arrayList.add(className);
                                int i8 = 59 / 0;
                            } else {
                                arrayList.add(className);
                            }
                        }
                        numValueOf = Integer.valueOf(numValueOf.intValue() - 1);
                    } else {
                        int i9 = onWarmupCompleted + 123;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            className.startsWith((String) it.next());
                            throw null;
                        }
                        if (className.startsWith((String) it.next())) {
                            break;
                        }
                        z = true;
                    }
                }
                i3++;
                z = true;
            }
        } catch (Throwable th) {
            E().c("AppLovinSdk", "detectMediationProvider", th);
        }
        Object[] objArr = new Object[1];
        aa(new int[]{-1277358466, 394463770, 2025298906, -126870096}, 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        this.w0 = ((String) objArr[0]).intern();
        Q();
        if (p.a()) {
            Q().k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String strJoin = StringUtils.join(",", arrayList);
        if (!((Boolean) a(c5.v4)).booleanValue()) {
            return strJoin;
        }
        int i10 = onWarmupCompleted + 107;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        E().a(h2.d, "detectMediationProvider", CollectionUtils.hashMap("details", strJoin));
        return null;
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new int[]{432094187, -679277970, -1039587120, 1091077129, 1551507158, 1059449481, -1679696930, 555200497, -1173623976, -683584174, 434071862, -1131580424, -1210883823, 1800391081, -10243176, -1026837840, 584198146, -2063499525};
    }
}
