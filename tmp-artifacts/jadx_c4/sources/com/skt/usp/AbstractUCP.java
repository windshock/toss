package com.skt.usp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.skt.usp.tools.UCPLibraryFeatures;
import com.skt.usp.tools.common.USPSubscriptionManager;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AbstractUCP implements USPObserver {
    BroadcastReceiver a;
    private String b;
    public Context m_oContext;
    public GlobalRepository m_oGlobalRepository;
    public UCPManagerConnection m_onSEManagerConnection = null;
    public String m_strStId = null;
    public Handler m_oHandler = new Handler(Looper.getMainLooper()) { // from class: com.skt.usp.AbstractUCP.1
    };
    private USPSubscriptionManager c = null;
    private int d = 0;

    public AbstractUCP(Context context, String str) {
        this.m_oContext = null;
        this.m_oGlobalRepository = null;
        this.b = null;
        this.m_oContext = context;
        this.b = str;
        this.m_oGlobalRepository = GlobalRepository.getInstance(context);
    }

    public void initialize(String str, UCPManagerConnection uCPManagerConnection) {
        UCPLog.info(">> initialize()");
        UCPLog.debug("++ stId : [%s]", str);
        UCPLog.debug("++ connection : [%s]", uCPManagerConnection);
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.m_strStId = str;
                    this.d = 0;
                    this.m_onSEManagerConnection = uCPManagerConnection;
                    if (this.m_oGlobalRepository == null) {
                        this.m_oGlobalRepository = GlobalRepository.getInstance(this.m_oContext);
                    }
                    this.c = this.m_oGlobalRepository.uspSubsManagerInitialize(this.m_oContext);
                    if (this.m_oGlobalRepository.skipPermissionCheck("urms")) {
                        this.m_oGlobalRepository.requestBindWithoutRight(this, this.m_strStId, uCPManagerConnection);
                    } else {
                        this.m_oGlobalRepository.requestRightCheck(this, this.m_strStId, uCPManagerConnection);
                    }
                    b(this);
                    return;
                }
            } catch (IllegalArgumentException e) {
                UCPLog.error(e.getMessage());
                if (str == null) {
                    this.d = -2;
                } else {
                    this.d = -99;
                }
                uCPManagerConnection.onServiceDisconnected(getCompID(), this.d);
                return;
            } catch (Exception e2) {
                UCPLog.error(e2.getMessage());
                this.d = -99;
                uCPManagerConnection.onServiceDisconnected(getCompID(), this.d);
                return;
            }
        }
        throw new IllegalArgumentException("***** stId is invalid !!");
    }

    public void finalize() {
        UCPLog.info(">> finalize()");
        this.d = 0;
        GlobalRepository globalRepository = this.m_oGlobalRepository;
        if (globalRepository != null) {
            try {
                globalRepository.finalize(this);
                this.m_oGlobalRepository = null;
            } catch (Exception e) {
                UCPLog.error(e.getMessage());
            }
        }
        try {
            this.m_onSEManagerConnection.onServiceDisconnected(getCompID(), this.d);
        } catch (Exception e2) {
            UCPLog.error(e2.getMessage());
        }
    }

    public String getCompID() {
        UCPLog.debug(">> getCompID()");
        return this.b;
    }

    public int getState() {
        UCPLog.debug(">> getState()");
        return this.d;
    }

    protected void setState(int i) {
        UCPLog.debug(">> setState : " + i);
        this.d = i;
    }

    @Override // com.skt.usp.USPObserver
    public void update(int i) {
        UCPLog.info(">> update()");
        UCPLog.info("++ state : [%s]", Integer.valueOf(i));
        this.d = i;
        if (this.m_onSEManagerConnection == null) {
            return;
        }
        UCPLog.debug("++ getMainLooper : [%s]", Looper.getMainLooper());
        UCPLog.debug("++ myLooper : [%s]", Looper.myLooper());
        this.m_oHandler.post(new Runnable() { // from class: com.skt.usp.AbstractUCP.2
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractUCP.this.d == 50) {
                    AbstractUCP abstractUCP = AbstractUCP.this;
                    abstractUCP.m_onSEManagerConnection.onServiceConnected(abstractUCP.getCompID());
                } else {
                    AbstractUCP abstractUCP2 = AbstractUCP.this;
                    abstractUCP2.m_onSEManagerConnection.onServiceDisconnected(abstractUCP2.getCompID(), AbstractUCP.this.d);
                }
            }
        });
    }

    private void b(final AbstractUCP abstractUCP) {
        UCPLog.info(">> actionDefaultSubscriptionChange ");
        if (UCPLibraryFeatures.isMultiUiccAvailableYn() && this.c.checkActiveCnt()) {
            UCPLog.info("++ action CompId :[%s]", abstractUCP.getCompID());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED");
            final int getDefaultSubscriptionId = this.c.getGetDefaultSubscriptionId();
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.skt.usp.AbstractUCP.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    AbstractUCP abstractUCP2;
                    String action = intent.getAction();
                    UCPLog.info("++ onReceive name :[%s]", action);
                    if (!action.equals("android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED") || AbstractUCP.this.m_oGlobalRepository == null) {
                        return;
                    }
                    int i = intent.getExtras().getInt("android.telephony.extra.SUBSCRIPTION_INDEX");
                    UCPLog.debug("getExtras [%s], getDefaultSubscriptionId [%s] ", Integer.valueOf(i), Integer.valueOf(getDefaultSubscriptionId));
                    int i2 = getDefaultSubscriptionId;
                    if (i2 <= 0 || i == i2 || (abstractUCP2 = abstractUCP) == null || abstractUCP2.getState() != 50) {
                        return;
                    }
                    UCPLog.debug("++ finalize Comp :[%s]", abstractUCP.getCompID());
                    AbstractUCP abstractUCP3 = AbstractUCP.this;
                    Context context2 = abstractUCP3.m_oContext;
                    if (context2 != null) {
                        context2.unregisterReceiver(abstractUCP3.a);
                    }
                    AbstractUCP abstractUCP4 = AbstractUCP.this;
                    GlobalRepository globalRepository = abstractUCP4.m_oGlobalRepository;
                    if (globalRepository != null) {
                        globalRepository.removeMapOfAppInfo(abstractUCP4.getCompID());
                    }
                    abstractUCP.a(-88);
                }
            };
            this.a = broadcastReceiver;
            this.m_oContext.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        UCPLog.info(">> finalizeState()");
        GlobalRepository globalRepository = this.m_oGlobalRepository;
        if (globalRepository != null) {
            try {
                globalRepository.finalize(this);
                this.m_oGlobalRepository = null;
            } catch (Exception e) {
                UCPLog.error(e.getMessage());
            }
        }
        try {
            this.m_onSEManagerConnection.onServiceDisconnected(getCompID(), i);
        } catch (Exception e2) {
            UCPLog.error(e2.getMessage());
        }
    }
}
