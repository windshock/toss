package com.skt.usp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.skt.usp.telco.UCPUtility;
import com.skt.usp.tools.UCPLibraryFeatures;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.USPIllegarAidPermissionException;
import com.skt.usp.tools.common.USPIllegarCompPermissionException;
import com.skt.usp.tools.common.USPIllegarPartnerPermissionException;
import com.skt.usp.tools.common.USPSubscriptionManager;
import com.skt.usp.tools.dao.UCPAppInfo;
import com.skt.usp.tools.dao.URMSApplets;
import com.skt.usp.tools.dao.URMSComponents;
import com.skt.usp.tools.dao.URMSCredits;
import com.skt.usp.tools.dao.URMSPartners;
import com.skt.usp.tools.dao.URMSTcses;
import com.skt.usp.tools.dao.protocol.urms.IGetPackageAllRight;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.tools.network.WorkerPoolExecutor;
import com.skt.usp.tools.network.urms.UrmsManager;
import com.skt.usp.tools.network.usp.USPManager;
import com.skt.usp.ucp.auth.UCPAuth;
import com.skt.usp.utils.UCPLog;
import com.tmoney.LiveCheckConstants;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.RecyclerViewItemAnimator;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class GlobalRepository implements AbstractWorker.OnWorkerListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static final String a = "com.skp.seio";
    private static GlobalRepository b = null;
    private static Context c = null;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private SharedPreferences.Editor u;
    private HashMap<String, UCPAppInfo> d = null;
    private List<USPObserver> e = null;
    private List<USPObserver> f = null;
    private UrmsManager g = null;
    private USPManager h = null;
    private List<URMSComponents> i = null;
    private List<URMSApplets> j = null;
    private List<URMSPartners> k = null;
    private List<URMSCredits> l = null;
    private List<URMSTcses> m = null;
    private boolean n = true;

    /* renamed from: o, reason: collision with root package name */
    private int f1o = -1;
    private String p = null;
    private String q = UCPAuth.COMPONENT_ID;
    private RecyclerViewItemAnimator r = null;
    private USPSubscriptionManager s = null;
    private SharedPreferences t = null;
    private String v = null;
    private boolean w = false;
    private ServiceConnection x = new ServiceConnection() { // from class: com.skt.usp.GlobalRepository.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Exception {
            UCPLog.info(">> ServiceConnection :: onServiceConnected() : m_onServiceConnectionOfCPService");
            try {
                if (GlobalRepository.a() == null) {
                    throw new Exception("instance is null !!");
                }
                GlobalRepository.a(GlobalRepository.this, RecyclerViewItemAnimator.onNavigationEvent.onExtraCallback(iBinder));
                GlobalRepository.a(GlobalRepository.this);
            } catch (Exception e) {
                UCPLog.error(e.getMessage());
                GlobalRepository.a(GlobalRepository.this, -99);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) throws Exception {
            UCPLog.error(">> m_onServiceConnectionOfCPService ServiceConnection :: onServiceDisconnected()");
            GlobalRepository.b(GlobalRepository.this);
        }
    };

    static {
        onExtraCallback();
        int i = onExtraCallbackWithResult + 11;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    static /* synthetic */ GlobalRepository a() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        GlobalRepository globalRepository = b;
        int i4 = i2 + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return globalRepository;
    }

    static /* synthetic */ RecyclerViewItemAnimator a(GlobalRepository globalRepository, RecyclerViewItemAnimator recyclerViewItemAnimator) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 19;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        globalRepository.r = recyclerViewItemAnimator;
        int i5 = i2 + 3;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return recyclerViewItemAnimator;
    }

    static /* synthetic */ void a(GlobalRepository globalRepository) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        globalRepository.c();
        int i4 = onWarmupCompleted + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void a(GlobalRepository globalRepository, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 79;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        globalRepository.a(i);
        int i5 = onWarmupCompleted + 29;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
    }

    static /* synthetic */ void b(GlobalRepository globalRepository) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        globalRepository.g();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRightCheck(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.n = z;
        if (i3 == 0) {
            throw null;
        }
    }

    private GlobalRepository(Context context) {
        UCPLog.info(">> GlobalRepository()");
        UCPLog.debug("++ context : [%s]", context);
        c = context;
    }

    public static GlobalRepository getInstance(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> getInstance()");
        UCPLog.debug("++ context : [%s]", context);
        if (b == null) {
            b = new GlobalRepository(context);
            int i4 = onWarmupCompleted + 115;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return b;
    }

    public USPSubscriptionManager uspSubsManagerInitialize(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> uspSubsManagerInitialize()");
        UCPLog.debug("++ context : [%s]", context);
        if (this.s == null) {
            this.s = new USPSubscriptionManager(context);
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!(!this.s.setUcpSubscriptionIdInit())) {
            int i6 = IAuthTabCallbackStub + 99;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                h();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            h();
        }
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[EXC_TOP_SPLITTER, PHI: r3
      0x0049: PHI (r3v2 int) = (r3v1 int), (r3v5 int) binds: [B:8:0x0047, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private RecyclerViewItemAnimator b() {
        int ucpSubscriptionId;
        RecyclerViewItemAnimator recyclerViewItemAnimatorIAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 73;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[0];
            objArr[0] = ">> createForSubscriptionIdAgent()";
            UCPLog.info(objArr);
            ucpSubscriptionId = UCPLibraryFeatures.getUcpSubscriptionId();
            Object[] objArr2 = new Object[4];
            objArr2[0] = "++ _subId : [%s]";
            objArr2[1] = Integer.valueOf(ucpSubscriptionId);
            UCPLog.info(objArr2);
            if (ucpSubscriptionId > 0) {
                try {
                    recyclerViewItemAnimatorIAuthTabCallback = this.r.IAuthTabCallback(ucpSubscriptionId);
                    if (recyclerViewItemAnimatorIAuthTabCallback == null) {
                        return recyclerViewItemAnimatorIAuthTabCallback;
                    }
                    try {
                        this.r = recyclerViewItemAnimatorIAuthTabCallback;
                        int i4 = IAuthTabCallbackStub + 103;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            return recyclerViewItemAnimatorIAuthTabCallback;
                        }
                        throw null;
                    } catch (RemoteException e) {
                        e = e;
                        UCPLog.error(e.getMessage());
                        i = onWarmupCompleted + 105;
                        IAuthTabCallbackStub = i % 128;
                        if (i % 2 == 0) {
                        }
                    }
                } catch (RemoteException e2) {
                    e = e2;
                    recyclerViewItemAnimatorIAuthTabCallback = null;
                }
            } else {
                recyclerViewItemAnimatorIAuthTabCallback = null;
            }
        } else {
            UCPLog.info(">> createForSubscriptionIdAgent()");
            ucpSubscriptionId = UCPLibraryFeatures.getUcpSubscriptionId();
            UCPLog.info("++ _subId : [%s]", Integer.valueOf(ucpSubscriptionId));
            if (ucpSubscriptionId > 0) {
            }
        }
        i = onWarmupCompleted + 105;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return recyclerViewItemAnimatorIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[PHI: r6
      0x0070: PHI (r6v15 java.lang.String) = (r6v10 java.lang.String), (r6v18 java.lang.String) binds: [B:14:0x006e, B:11:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void finalize(AbstractUCP abstractUCP) {
        String compID;
        int size;
        int i = 2 % 2;
        UCPLog.info(">> finalize()");
        UCPLog.debug("++ comp : [%s]", abstractUCP);
        if (b == null) {
            UCPLog.error("-- returned");
            return;
        }
        HashMap<String, UCPAppInfo> map = this.d;
        if (map != null) {
            int i2 = IAuthTabCallbackStub + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int size2 = map.size();
                Object[] objArr = new Object[2];
                objArr[1] = "++ m_mapOfAppInfo.size() : [%s]";
                objArr[1] = Integer.valueOf(size2);
                UCPLog.debug(objArr);
                compID = abstractUCP.getCompID();
                if (!(!this.d.containsKey(compID))) {
                    UCPLog.debug("++ m_mapOfAppInfo : [%s]", this.d.toString());
                    UCPAppInfo uCPAppInfo = this.d.get(compID);
                    UCPLog.debug("++ ucpAppMapInfo before: [%s]", uCPAppInfo.toString());
                    uCPAppInfo.minusStrCnt();
                    UCPLog.debug("++ ucpAppMapInfo after: [%s]", uCPAppInfo.toString());
                    if (uCPAppInfo.getM_strCnt() <= 0) {
                        int i3 = onWarmupCompleted + 9;
                        IAuthTabCallbackStub = i3 % 128;
                        if (i3 % 2 == 0) {
                            this.d.remove(compID);
                            UCPLog.warning(compID, "++ removed application map [%s]");
                        } else {
                            this.d.remove(compID);
                            UCPLog.warning("++ removed application map [%s]", compID);
                        }
                    }
                }
                size = this.d.size();
                if (size > 0) {
                    UCPLog.debug("-- returned :  GlobalRepository keep alive... [%s]", Integer.valueOf(size));
                    return;
                }
            } else {
                UCPLog.debug("++ m_mapOfAppInfo.size() : [%s]", Integer.valueOf(map.size()));
                compID = abstractUCP.getCompID();
                if (this.d.containsKey(compID)) {
                }
                size = this.d.size();
                if (size > 0) {
                }
            }
        }
        UCPLog.warning("############ [S] GlobalRepository release ############");
        h();
        List<USPObserver> list = this.e;
        if (list != null) {
            list.clear();
            this.e = null;
        }
        HashMap<String, UCPAppInfo> map2 = this.d;
        if (map2 != null) {
            map2.clear();
            this.d = null;
        }
        WorkerPoolExecutor workerPoolExecutor = WorkerPoolExecutor.getInstance();
        try {
            workerPoolExecutor.cancelAll();
            workerPoolExecutor.shutdown();
            WorkerPoolExecutor.release();
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
        }
        b = null;
        UCPLog.warning("############ [E] GlobalRepository release ############");
    }

    public void removeMapOfAppInfo(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.d.remove(str);
            throw null;
        }
        this.d.remove(str);
        int i3 = onWarmupCompleted + 93;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void y(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        Object obj2 = null;
        char c3 = '0';
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 27 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), 23138 - TextUtils.lastIndexOf("", '0', 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.blue(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i5 = $10 + 27;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i7 = $10 + 19;
                        $11 = i7 % 128;
                        if (i7 % 2 == 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback >> b2);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent >> 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback / b2);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b2);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b2);
                        }
                        c2 = c3;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getLongPressTimeout() >> 16)), 75 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), 8088 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                c2 = '0';
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 30 - View.getDefaultSize(0, 0), Process.getGidForName("") + 19489, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c2 = '0';
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                        } else {
                            obj = null;
                            c2 = '0';
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                                int i11 = $11 + 35;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                    c3 = c2;
                    j = 0;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = $10 + 95;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.skt.usp.tools.network.AbstractWorker.OnWorkerListener
    public void onTerminateFromWorker(APITypeCode aPITypeCode, APIResultCode aPIResultCode, Object obj) throws Exception {
        int i = 2 % 2;
        UCPLog.info(">> onTerminateFromWorker()");
        UCPLog.debug("++ api : [%s]", aPITypeCode);
        UCPLog.debug("++ result : [%s]", aPIResultCode);
        UCPLog.debug("++ resultData : [%s]", obj);
        try {
            if (b == null) {
                throw new Exception("instance is null !!");
            }
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallbackStub = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                APITypeCode.MGR_PUSH_APPLET_SET_ACCESS_RULE_ARAM.equals(aPITypeCode);
                obj2.hashCode();
                throw null;
            }
            if (APITypeCode.MGR_PUSH_APPLET_SET_ACCESS_RULE_ARAM.equals(aPITypeCode)) {
                if (APIResultCode.SUCCESS.equals(aPIResultCode)) {
                    this.f1o = 50;
                } else if (APIResultCode.SUCCESS_NEED_REBOOT.equals(aPIResultCode)) {
                    this.f1o = 80;
                } else {
                    String str = (String) obj;
                    if (UCPApiConstants.ERR_ACCESS_RULE_ALREADY_SET.equalsIgnoreCase(str)) {
                        this.f1o = -83;
                    } else if (str.startsWith(UCPApiConstants.ERR_CARD_DEVICES_RES_FAIL)) {
                        this.f1o = -86;
                    } else {
                        this.f1o = -84;
                        int i3 = onWarmupCompleted + 73;
                        IAuthTabCallbackStub = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
                a(this.f1o);
            }
            if (!(!APITypeCode.URMS_GET_PACKAGE_ALL_RIGHT.equals(aPITypeCode))) {
                if (APIResultCode.SUCCESS.equals(aPIResultCode)) {
                    IGetPackageAllRight.ResBodyOfIGetPackageAllRight resBodyOfIGetPackageAllRight = (IGetPackageAllRight.ResBodyOfIGetPackageAllRight) obj;
                    this.u.putString("nrmsResult", new Gson().toJson(resBodyOfIGetPackageAllRight));
                    this.u.apply();
                    this.u.commit();
                    this.w = false;
                    urmsResSetComponentRight(resBodyOfIGetPackageAllRight);
                } else {
                    a(-10);
                    HashMap<String, UCPAppInfo> map = this.d;
                    if (map != null) {
                        int i5 = onWarmupCompleted + 37;
                        IAuthTabCallbackStub = i5 % 128;
                        if (i5 % 2 == 0) {
                            map.clear();
                            throw null;
                        }
                        map.clear();
                    }
                    List<USPObserver> list = this.e;
                    if (list != null) {
                        int i6 = onWarmupCompleted + 53;
                        IAuthTabCallbackStub = i6 % 128;
                        int i7 = i6 % 2;
                        list.clear();
                    }
                }
            }
            if (APITypeCode.URMS_GET_PACKAGE_ALL_RIGHT_PREF.equals(aPITypeCode)) {
                String string = this.t.getString("nrmsResult", null);
                this.v = string;
                UCPLog.info("++ Urms pref has data : [%s]", Boolean.valueOf(Objects.nonNull(string)));
                UCPLog.debug("++ NRMS_GET_PACKAGE_ALL_RIGHT_PREF : [%s]", this.v);
                urmsResSetComponentRight((IGetPackageAllRight.ResBodyOfIGetPackageAllRight) new Gson().fromJson(this.v, IGetPackageAllRight.ResBodyOfIGetPackageAllRight.class));
            }
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            a(-99);
            HashMap<String, UCPAppInfo> map2 = this.d;
            if (map2 != null) {
                map2.clear();
            }
            List<USPObserver> list2 = this.e;
            if (list2 != null) {
                list2.clear();
            }
        }
    }

    public void urmsResSetComponentRight(IGetPackageAllRight.ResBodyOfIGetPackageAllRight resBodyOfIGetPackageAllRight) {
        UCPAppInfo uCPAppInfo;
        int i = 2 % 2;
        UCPLog.info(">> urmsResSetComponentRight");
        UCPLog.debug("++ ResBodyOfIGetPackageAllRight : [%s]", resBodyOfIGetPackageAllRight);
        if (resBodyOfIGetPackageAllRight != null) {
            int i2 = IAuthTabCallbackStub + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.i = resBodyOfIGetPackageAllRight.getComponents();
            this.j = resBodyOfIGetPackageAllRight.getApplets();
            this.k = resBodyOfIGetPackageAllRight.getPartners();
            this.l = resBodyOfIGetPackageAllRight.getCredits();
            this.m = resBodyOfIGetPackageAllRight.getTcses();
        }
        if (this.i == null) {
            this.i = new ArrayList();
        }
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (this.l == null) {
            this.l = new ArrayList();
        }
        if (this.m == null) {
            this.m = new ArrayList();
        }
        Iterator<String> it = this.d.keySet().iterator();
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 41;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                String next = it.next();
                uCPAppInfo = this.d.get(next);
                try {
                    try {
                        checkPermissionComponents(next);
                        uCPAppInfo.setCheckedRightment(false);
                    } catch (Exception e) {
                        UCPLog.error(e.getMessage());
                        uCPAppInfo.setCheckedRightment(false);
                    }
                } finally {
                    uCPAppInfo.setCheckedRightment(true);
                }
            } else {
                String next2 = it.next();
                uCPAppInfo = this.d.get(next2);
                checkPermissionComponents(next2);
            }
        }
        c();
    }

    public void requestRightCheck(AbstractUCP abstractUCP, String str, UCPManagerConnection uCPManagerConnection) {
        int i = 2 % 2;
        UCPLog.info(">> requestRightCheck()");
        UCPLog.debug("++ sem : [%s]", abstractUCP);
        UCPLog.debug("++ stId : [%s]", str);
        UCPLog.debug("++ connectionh : [%s]", uCPManagerConnection);
        this.n = true;
        this.p = abstractUCP.getCompID();
        UCPLog.info("++ m_isRightCheck : [" + this.n + "]");
        a(abstractUCP, str, uCPManagerConnection);
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public void requestBindWithoutRight(AbstractUCP abstractUCP, String str, UCPManagerConnection uCPManagerConnection) {
        int i = 2 % 2;
        UCPLog.info(">> requestBindWithoutRight()");
        UCPLog.debug("++ sem : [%s]", abstractUCP);
        UCPLog.debug("++ stId : [%s]", str);
        UCPLog.debug("++ connectionh : [%s]", uCPManagerConnection);
        this.p = abstractUCP.getCompID();
        this.n = false;
        UCPLog.debug("++ m_isRightCheck : [" + this.n + "]");
        try {
            if (b == null) {
                throw new Exception("instance is null !!");
            }
            String strI = i();
            HashMap<String, UCPAppInfo> map = this.d;
            if (map == null) {
                int i2 = IAuthTabCallbackStub + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                a(abstractUCP.getCompID(), strI, str, uCPManagerConnection);
            } else if (map.get(abstractUCP.getCompID()) == null) {
                int i4 = onWarmupCompleted + 91;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                a(abstractUCP.getCompID(), strI, str, uCPManagerConnection);
            }
            a(abstractUCP);
            e();
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            a(-99);
        }
    }

    public UCPAppInfo getAppInfo(String str) {
        UCPAppInfo uCPAppInfo;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            uCPAppInfo = this.d.get(str);
            int i3 = 40 / 0;
        } else {
            uCPAppInfo = this.d.get(str);
        }
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return uCPAppInfo;
    }

    public RecyclerViewItemAnimator getCPService() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.debug(">> getCPService()");
        RecyclerViewItemAnimator recyclerViewItemAnimator = this.r;
        int i4 = onWarmupCompleted + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return recyclerViewItemAnimator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIsUsimRefresh(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.w = z;
        if (i3 == 0) {
            throw null;
        }
    }

    private void c() {
        int i = 2 % 2;
        UCPLog.info(">> setAccessRuleNotifyObserver()");
        UCPLog.debug("++ m_CompId : " + this.p);
        try {
            if (!skipPermissionCheck("urms")) {
                int i2 = onWarmupCompleted + 67;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    getAppInfo(this.p).getCheckedRightment();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!getAppInfo(this.p).getCheckedRightment()) {
                    a(-20);
                    return;
                }
            }
            if (this.r == null) {
                UCPLog.debug("++ request bindToCpService");
                g();
                int i3 = IAuthTabCallbackStub + 63;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 88 / 0;
                    return;
                }
                return;
            }
            b();
            if (!this.q.contains(this.p)) {
                int i5 = IAuthTabCallbackStub + 57;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (!checkAndBindCpSvcObserver()) {
                    return;
                }
                if (!this.r.onExtraCallbackWithResult()) {
                    int i7 = onWarmupCompleted + 21;
                    IAuthTabCallbackStub = i7 % 128;
                    if (i7 % 2 == 0) {
                        Object[] objArr = new Object[0];
                        objArr[1] = "++ m_IUCPService hasSeioCarrierPrivileges false!!";
                        UCPLog.info(objArr);
                    } else {
                        UCPLog.info("++ m_IUCPService hasSeioCarrierPrivileges false!!");
                    }
                    d();
                    return;
                }
            }
            f();
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            a(-99);
        }
    }

    private boolean d() throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> setAccessRuleAram()");
        USPManager uSPManager = USPManager.getInstance(c);
        this.h = uSPManager;
        uSPManager.setAccessRuleAram(c, i(), this);
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return true;
    }

    public boolean checkAndBindCpSvcObserver() {
        boolean z;
        int i = 2 % 2;
        UCPLog.info(">> checkBindCpSvcObserver()");
        int applicationVersionCode = UCPUtility.getApplicationVersionCode(c, "com.skp.seio");
        UCPLog.debug(">> seioVer [%s]", Integer.valueOf(applicationVersionCode));
        if (applicationVersionCode < 14) {
            int i2 = onWarmupCompleted + 51;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                a(91);
                z = true;
            } else {
                a(-85);
                z = false;
            }
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = onWarmupCompleted + 97;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            a(-82);
            z = false;
        }
        if (this.s.availableMultiUiccCd() < 0) {
            int i5 = onWarmupCompleted + 79;
            IAuthTabCallbackStub = i5 % 128;
            a(i5 % 2 == 0 ? 92 : -87);
            return false;
        }
        int i6 = onWarmupCompleted + 1;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void checkPermissionComponents(String str) throws Exception {
        Iterator<URMSComponents> it;
        int i = 2 % 2;
        UCPLog.info(">> checkPermissionComponents()");
        UCPLog.debug("++ compId : [%s]", str);
        UCPLog.debug("++ m_isRightCheck : [" + this.n + "]");
        boolean z = false;
        if (this.n) {
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (!skipPermissionCheck("Components")) {
                if (str == null) {
                    throw new USPIllegarCompPermissionException("You do not have persmissioin");
                }
                List<URMSComponents> list = this.i;
                if (list == null || list.size() <= 0) {
                    throw new USPIllegarCompPermissionException("You do not have persmissioin [" + str + "]");
                }
                int i4 = onWarmupCompleted + 115;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    it = this.i.iterator();
                    int i5 = 71 / 0;
                } else {
                    it = this.i.iterator();
                }
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().getCompId().equalsIgnoreCase(str)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new USPIllegarCompPermissionException("You do not have persmissioin [" + str + "]");
                }
                UCPLog.debug("-- returned - hasPermission is " + z);
                int i6 = onWarmupCompleted + 33;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i7 = onWarmupCompleted + 69;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 6 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skt.usp.tools.common.USPIllegarAidPermissionException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[PHI: r2
      0x00ad: PHI (r2v10 com.skt.usp.tools.dao.URMSApplets) = (r2v15 com.skt.usp.tools.dao.URMSApplets), (r2v16 com.skt.usp.tools.dao.URMSApplets) binds: [B:28:0x00ab, B:25:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkPermissionApplets(String str) throws Exception {
        URMSApplets uRMSApplets;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[0] = ">> checkPermissionApplets()";
            UCPLog.info(objArr);
            Object[] objArr2 = new Object[5];
            objArr2[0] = "++ aid : [%s]";
            objArr2[1] = str;
            UCPLog.debug(objArr2);
            if (skipPermissionCheck("Applets")) {
                return;
            }
        } else {
            UCPLog.info(">> checkPermissionApplets()");
            UCPLog.debug("++ aid : [%s]", str);
            if (skipPermissionCheck("Applets")) {
                return;
            }
        }
        if (str == null) {
            throw new USPIllegarAidPermissionException("You do not have persmissioin");
        }
        int i3 = onWarmupCompleted + 49;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<URMSApplets> list = this.j;
        if (list == null || list.size() <= 0) {
            throw new USPIllegarAidPermissionException("You do not have persmissioin [" + str + "]");
        }
        int i4 = IAuthTabCallbackStub + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            this.j.iterator();
            throw null;
        }
        Iterator<URMSApplets> it = this.j.iterator();
        while (it.hasNext()) {
            int i5 = onWarmupCompleted + 77;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                URMSApplets next = it.next();
                next.dump(next);
                boolean zEqualsIgnoreCase = next.getInstAid().equalsIgnoreCase(str);
                int i6 = 26 / 0;
                uRMSApplets = next;
                if (!zEqualsIgnoreCase) {
                    if (uRMSApplets.getSdAid().equals(str)) {
                        int i7 = onWarmupCompleted + 77;
                        IAuthTabCallbackStub = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            } else {
                URMSApplets next2 = it.next();
                next2.dump(next2);
                boolean zEqualsIgnoreCase2 = next2.getInstAid().equalsIgnoreCase(str);
                uRMSApplets = next2;
                if (!zEqualsIgnoreCase2) {
                }
            }
            UCPLog.debug("-- returned - hasPermission is true");
            return;
        }
        throw new USPIllegarAidPermissionException("You do not have persmissioin [" + str + "]");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skt.usp.tools.common.USPIllegarPartnerPermissionException */
    public void checkPermissionPartners(String str, String str2) throws Exception {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> checkPermissionPartners()");
        UCPLog.debug("++ partnerType : [%s]", str);
        UCPLog.debug("++ partnerCd : [%s]", str2);
        if (skipPermissionCheck("Partners")) {
            return;
        }
        if (str == null) {
            throw new USPIllegarPartnerPermissionException("You do not have persmissioin");
        }
        List<URMSPartners> list = this.k;
        if (list == null || list.size() <= 0) {
            throw new USPIllegarPartnerPermissionException("You do not have persmissioin [" + str + "]");
        }
        int i4 = IAuthTabCallbackStub + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        for (URMSPartners uRMSPartners : this.k) {
            uRMSPartners.dump(uRMSPartners);
            if (uRMSPartners.getPartnerType().equalsIgnoreCase(str)) {
                int i6 = IAuthTabCallbackStub + 115;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (uRMSPartners.getPartnerCd().equalsIgnoreCase(str2)) {
                    int i8 = IAuthTabCallbackStub + 91;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        UCPLog.error("-- equals");
                        return;
                    }
                    Object[] objArr = new Object[1];
                    objArr[1] = "-- equals";
                    UCPLog.error(objArr);
                    return;
                }
            }
            UCPLog.error("-- not equals");
        }
        throw new USPIllegarPartnerPermissionException("You do not have persmissioin [" + str + "]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (putPref() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (putPref() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r2 = com.skt.usp.GlobalRepository.IAuthTabCallbackStub + 13;
        com.skt.usp.GlobalRepository.onWarmupCompleted = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        a(r5.getCompID(), r1, r6, r7);
        a(r5);
        r7 = com.skt.usp.tools.network.urms.UrmsManager.getInstance(com.skt.usp.GlobalRepository.c);
        r4.g = r7;
        r7.requestGetPackageAllRight(r6, r1, r5.getCompID(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        a(r5.getCompID(), r1, r6, r7);
        a(r5);
        onTerminateFromWorker(com.skt.usp.tools.common.APITypeCode.URMS_GET_PACKAGE_ALL_RIGHT_PREF, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(AbstractUCP abstractUCP, String str, UCPManagerConnection uCPManagerConnection) throws Exception {
        int i = 2 % 2;
        UCPLog.info(">> doRequestRightCheck()");
        UCPLog.debug("++ sem : [%s]", abstractUCP);
        UCPLog.debug("++ stId : [%s]", str);
        UCPLog.debug("++connectionh : [%s]", uCPManagerConnection);
        String strI = i();
        try {
            if (b == null) {
                throw new Exception("instance is null !!");
            }
            int i2 = onWarmupCompleted + 67;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 7 / 0;
            }
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            a(-99);
            int i4 = onWarmupCompleted + 87;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
        }
    }

    public boolean putPref() throws Throwable {
        int i = 2 % 2;
        UCPLog.info(">> putPref()");
        Locale locale = Locale.KOREA;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", locale);
        Object[] objArr = new Object[1];
        y(new char[]{22, '\t', 20, 7, '\r', 11, '\b', 16, 2, 18}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17), 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        long timeInMillis = new GregorianCalendar(DesugarTimeZone.getTimeZone(((String) objArr[0]).intern()), locale).getTimeInMillis();
        String str = simpleDateFormat.format(Long.valueOf(timeInMillis));
        UCPLog.debug("++ nowYmd : [%s]", str);
        long jElapsedRealtime = timeInMillis - SystemClock.elapsedRealtime();
        UCPLog.debug("++ bootTimeLong : [%s]", Long.valueOf(jElapsedRealtime));
        SharedPreferences sharedPreferences = c.getSharedPreferences("UrmsGetPackageAllRight", 0);
        this.t = sharedPreferences;
        this.u = sharedPreferences.edit();
        Object obj = null;
        String string = this.t.getString("reqUrmsDate", null);
        long j = this.t.getLong("bootTime", 0L);
        if (string == null) {
            UCPLog.debug("++ reqUrmsDate is null");
            this.u.putString("reqUrmsDate", str);
            return true;
        }
        long j2 = jElapsedRealtime - j;
        if (Math.abs(j2) > 10) {
            UCPLog.debug("++ bootTimeGap" + Math.abs(j2));
            this.u.putLong("bootTime", jElapsedRealtime);
            return true;
        }
        if (this.w) {
            UCPLog.debug("++ m_isUsimRefresh [%s]" + this.w);
            int i2 = onWarmupCompleted + 67;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        UCPLog.debug("++ reqUrmsDate is [%s]", string);
        int i3 = Integer.parseInt(str) - Integer.parseInt(string);
        UCPLog.debug("++ nowDate and reqUrmsDate gap [%s]", Integer.valueOf(i3));
        if (i3 <= 0) {
            UCPLog.debug("++ return false! : [%s]", this.t.getString("reqUrmsDate", null));
            return false;
        }
        int i4 = onWarmupCompleted + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        this.u.putString("reqUrmsDate", str);
        return true;
    }

    private void e() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            objArr[1] = ">> checkBind()";
            UCPLog.info(objArr);
            RecyclerViewItemAnimator recyclerViewItemAnimator = this.r;
            Object[] objArr2 = new Object[5];
            objArr2[0] = "++ m_IUCPService : [%s]";
            objArr2[0] = recyclerViewItemAnimator;
            UCPLog.debug(objArr2);
        } else {
            UCPLog.info(">> checkBind()");
            UCPLog.debug("++ m_IUCPService : [%s]", this.r);
        }
        c();
        int i3 = IAuthTabCallbackStub + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    private void a(String str, String str2, String str3, UCPManagerConnection uCPManagerConnection) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> addAppInfo()");
        UCPLog.debug("++ compId : [%s]", str);
        UCPLog.debug("++ pn : [%s]", str2);
        UCPLog.debug("++ stId : [%s]", str3);
        UCPLog.debug("++ connection : [%s]", uCPManagerConnection);
        if (b != null) {
            if (this.d == null) {
                UCPLog.debug("++ m_mapOfAppInfo is create !!");
                this.d = new HashMap<>();
            }
            UCPAppInfo uCPAppInfo = this.d.get(str);
            if (uCPAppInfo == null) {
                this.d.put(str, new UCPAppInfo(str2, str3, uCPManagerConnection));
                UCPLog.debug(" ++ put mapOfAppInfo : [%s]", uCPAppInfo);
            } else {
                uCPAppInfo.plusStrCnt();
                UCPLog.debug("++ already put this compId , plusStrCnt : [%s]", uCPAppInfo);
            }
            UCPLog.debug("++ m_mapOfAppInfo : [%s]", this.d.toString());
            return;
        }
        int i4 = IAuthTabCallbackStub + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = new Object[1];
            objArr[1] = "-- returned : s_instance is null !!";
            UCPLog.error(objArr);
        } else {
            UCPLog.error("-- returned : s_instance is null !!");
        }
        int i5 = onWarmupCompleted + 43;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void a(USPObserver uSPObserver) {
        int i = 2 % 2;
        UCPLog.info(">> addObserver()");
        UCPLog.debug("++ o : [%s]", uSPObserver);
        if (b != null) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            Iterator<USPObserver> it = this.e.iterator();
            while (!(!it.hasNext())) {
                if (it.next().equals(uSPObserver)) {
                    return;
                }
            }
            this.e.add(uSPObserver);
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = onWarmupCompleted + 45;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        UCPLog.error("-- returned : s_instance is null !!");
    }

    private void f() {
        USPObserver uSPObserver;
        int i = 2 % 2;
        UCPLog.info(">> notifyObserver()");
        if (b != null) {
            List<USPObserver> list = this.e;
            if (list == null || list.size() <= 0) {
                UCPLog.debug("-- returned : observer size is 0");
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<USPObserver> it = this.e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i2 = onWarmupCompleted + 57;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = 50;
                if (i2 % 2 != 0) {
                    uSPObserver = (USPObserver) it2.next();
                    checkPermissionComponents(((AbstractUCP) uSPObserver).getCompID());
                } else {
                    uSPObserver = (USPObserver) it2.next();
                    try {
                        try {
                            checkPermissionComponents(((AbstractUCP) uSPObserver).getCompID());
                            i3 = 121;
                        } catch (Exception e) {
                            UCPLog.error(e.getMessage());
                            uSPObserver.update(-20);
                        }
                    } finally {
                        uSPObserver.update(50);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                this.e.remove((USPObserver) it3.next());
            }
            return;
        }
        int i4 = onWarmupCompleted + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            UCPLog.error("-- returned : s_instance is null !!");
            return;
        }
        Object[] objArr = new Object[0];
        objArr[0] = "-- returned : s_instance is null !!";
        UCPLog.error(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r2.size() > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r2 = new java.util.ArrayList();
        r4 = r7.e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r4.hasNext() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r5 = com.skt.usp.GlobalRepository.onWarmupCompleted + 121;
        com.skt.usp.GlobalRepository.IAuthTabCallbackStub = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if ((r5 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r2.add(r4.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r2.add(r4.next());
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        r3 = r2.iterator();
        r4 = com.skt.usp.GlobalRepository.onWarmupCompleted + 67;
        com.skt.usp.GlobalRepository.IAuthTabCallbackStub = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if ((!r3.hasNext()) == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        ((com.skt.usp.USPObserver) r3.next()).update(r8);
        r4 = com.skt.usp.GlobalRepository.IAuthTabCallbackStub + 71;
        com.skt.usp.GlobalRepository.onWarmupCompleted = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        r8 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r8.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        r7.e.remove((com.skt.usp.USPObserver) r8.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r2.size() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i) {
        int i2 = 2 % 2;
        UCPLog.info(">> notifyObserver()");
        UCPLog.debug("++ state : [%s]", Integer.valueOf(i));
        List<USPObserver> list = this.e;
        Object obj = null;
        if (list != null) {
            int i3 = onWarmupCompleted + 113;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 74 / 0;
            }
        }
        UCPLog.debug("-- returned : observer size is 0");
        int i5 = onWarmupCompleted + 11;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void g() throws Exception {
        int i = 2 % 2;
        UCPLog.info(">> bindToUcpService()");
        UCPLog.debug(">> bindToUcpService[" + this.x + "]");
        try {
            if (b == null) {
                UCPLog.error("-- returned : s_instance is null !!");
                return;
            }
            Intent className = new Intent().setClassName("com.skp.seio", UCPApiConstants.UCPSERVICE_CLASS_NM);
            className.putExtra("myPid", Process.myPid());
            if (!c.bindService(className, this.x, 1)) {
                throw new Exception("UCPService bind failed !!");
            }
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            y(new char[]{13780, 13780, 1, 3, 21, 17, 14, 1, 19, '\b', 3, 11, 11, 5, '\n', 24, 21, 2, 11, 1, 15, 4, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 13799, 20, 3, 13787}, (byte) (48 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41, objArr);
            UCPLog.info(((String) objArr[0]).intern());
            int i4 = IAuthTabCallbackStub + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            if (this.q.contains(this.p)) {
                f();
                return;
            }
            if (!checkAndBindCpSvcObserver()) {
                int i6 = onWarmupCompleted + 89;
                IAuthTabCallbackStub = i6 % 128;
                a(i6 % 2 != 0 ? -30 : 0);
            }
            int i7 = IAuthTabCallbackStub + 5;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private void h() {
        int i = 2 % 2;
        UCPLog.info(">> unBindToSEIOAgent()");
        if (b == null) {
            int i2 = IAuthTabCallbackStub + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                UCPLog.error("-- returned : s_instance is null !!");
                return;
            } else {
                UCPLog.error("-- returned : s_instance is null !!");
                return;
            }
        }
        if (this.r == null) {
            UCPLog.debug("-- returned");
            int i3 = IAuthTabCallbackStub + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        try {
            c.unbindService(this.x);
            this.r = null;
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
        }
    }

    private String i() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        int i = 2 % 2;
        UCPLog.debug(">> getPackageName()");
        Object obj = null;
        try {
            packageInfo = c.getPackageManager().getPackageInfo(c.getPackageName(), 0);
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 4;
            }
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            packageInfo = null;
        }
        String str = packageInfo.packageName;
        int i4 = IAuthTabCallbackStub + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r1
      0x0038: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean skipPermissionCheck(String str) throws PackageManager.NameNotFoundException {
        String strI;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            UCPLog.debug(">> skipPermissionCheck()");
            strI = i();
            if (!strI.equalsIgnoreCase("com.skp.nop.tc")) {
                if (!strI.equalsIgnoreCase("com.sktelecom.tauth")) {
                    int i3 = onWarmupCompleted + 67;
                    IAuthTabCallbackStub = i3 % 128;
                    return i3 % 2 == 0;
                }
            }
        } else {
            UCPLog.debug(">> skipPermissionCheck()");
            strI = i();
            if (!strI.equalsIgnoreCase("com.skp.nop.tc")) {
            }
        }
        UCPLog.debug("-- returned - [" + strI + "] checkPermission[" + str + "] skip");
        return true;
    }

    static void onExtraCallback() {
        onExtraCallback = new char[]{64915, 64976, 64977, 64966, 64999, 64978, 64982, 64960, 64898, 64998, 64992, 64983, 64924, 64963, 64961, 64909, 64989, 64991, 64988, 64922, 64965, 64923, 64986, 64926, 65010};
        IAuthTabCallback = (char) 51244;
    }
}
