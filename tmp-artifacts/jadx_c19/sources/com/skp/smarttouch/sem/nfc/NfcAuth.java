package com.skp.smarttouch.sem.nfc;

import android.content.Context;
import android.os.Handler;
import com.skp.smarttouch.sem.AbstractSEM;
import com.skp.smarttouch.sem.GlobalRepository;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STIllegarCarrierApiException;
import com.skp.smarttouch.sem.tools.common.STIllegarCompPermissionException;
import com.skp.smarttouch.sem.tools.common.STIllegarSmartCardException;
import com.skp.smarttouch.sem.tools.common.STIllegarStIdException;
import com.skp.smarttouch.sem.tools.common.STIllegarStateException;
import com.skp.smarttouch.sem.tools.dao.SEMDispatchData;
import com.skp.smarttouch.sem.tools.dao.SEMResultData;
import com.skp.smarttouch.sem.tools.dao.STAuthInfo;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import com.skp.smarttouch.sem.tools.network.WorkerPoolExecutor;
import com.skp.smarttouch.sem.tools.network.usp.WorkerToAuthNfcYn;
import com.skp.smarttouch.sem.tools.network.usp.WorkerToCarrierApiNfcYn;
import com.skp.smarttouch.sem.tools.network.usp.WorkerToCarrierApiYn;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class NfcAuth extends AbstractSEM implements AbstractWorker.OnWorkerListener {
    public static final String COMPONENT_ID = "NFC_AUTH";
    private static NfcAuth b;
    private static String c;

    private NfcAuth(Context context, String str) {
        super(context, str);
        xkzzb.onExtraCallback(new Object[]{">> USIM()"});
        xkzzb.onExtraCallback(new Object[]{"++ context : [%s]", context});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str});
    }

    public static NfcAuth getInstance(Context context) {
        xkzzb.onExtraCallback(new Object[]{">> getInstance()"});
        xkzzb.onExtraCallback(new Object[]{"++ context : [%s]"});
        if (b == null) {
            b = new NfcAuth(context, COMPONENT_ID);
        }
        return b;
    }

    public void finalize() {
        xkzzb.onExtraCallback(new Object[]{">> finalize()"});
        super.finalize();
    }

    public void onTerminateFromWorker(final APITypeCode aPITypeCode, final APIResultCode aPIResultCode, final Object obj) {
        xkzzb.onExtraCallback(new Object[]{">> onTerminateFromWorker()"});
        xkzzb.onExtraCallback(new Object[]{"++ api : [%s]", aPITypeCode});
        xkzzb.onExtraCallback(new Object[]{"++ result : [%s]", aPIResultCode});
        xkzzb.onExtraCallback(new Object[]{"++ resultData : [%s]", obj});
        try {
            try {
                if (APITypeCode.NFC_AUTH_AUTH_NFC_YN.equals(aPITypeCode)) {
                    STAuthInfo sTAuthInfo = (STAuthInfo) obj;
                    sTAuthInfo.dump(sTAuthInfo);
                }
                if (APITypeCode.NFC_AUTH_CARRIER_API_YN.equals(aPITypeCode)) {
                    STAuthInfo sTAuthInfo2 = (STAuthInfo) obj;
                    sTAuthInfo2.dump(sTAuthInfo2);
                }
                if (APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN.equals(aPITypeCode)) {
                    STAuthInfo sTAuthInfo3 = (STAuthInfo) obj;
                    sTAuthInfo3.dump(sTAuthInfo3);
                }
                if (((AbstractSEM) this).m_onSEManagerConnection != null) {
                    ((AbstractSEM) this).m_oHandler.post(new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SEMResultData sEMResultData = SEMResultData.getInstance();
                            sEMResultData.setType(aPITypeCode);
                            sEMResultData.setResultCode(aPIResultCode);
                            sEMResultData.setData(obj);
                            ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData);
                        }
                    });
                }
            } catch (Exception e) {
                xkzzb.onNavigationEvent(e);
                if (((AbstractSEM) this).m_onSEManagerConnection != null) {
                    ((AbstractSEM) this).m_oHandler.post(new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SEMResultData sEMResultData = SEMResultData.getInstance();
                            sEMResultData.setType(aPITypeCode);
                            sEMResultData.setResultCode(aPIResultCode);
                            sEMResultData.setData(obj);
                            ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            if (((AbstractSEM) this).m_onSEManagerConnection != null) {
                ((AbstractSEM) this).m_oHandler.post(new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SEMResultData sEMResultData = SEMResultData.getInstance();
                        sEMResultData.setType(aPITypeCode);
                        sEMResultData.setResultCode(aPIResultCode);
                        sEMResultData.setData(obj);
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData);
                    }
                });
            }
            throw th;
        }
    }

    public void onDispatchFromWorker(final APITypeCode aPITypeCode, final String str, final String str2) {
        xkzzb.onExtraCallback(new Object[]{">> onDispatchFromWorker()"});
        xkzzb.onExtraCallback(new Object[]{"++ api : [%s]", aPITypeCode});
        xkzzb.onExtraCallback(new Object[]{"++ status : [%s]", str});
        xkzzb.onExtraCallback(new Object[]{"++ message : [%s]", str2});
        if (((AbstractSEM) this).m_onSEManagerConnection != null) {
            ((AbstractSEM) this).m_oHandler.post(new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.2
                @Override // java.lang.Runnable
                public void run() {
                    SEMDispatchData sEMDispatchData = SEMDispatchData.getInstance();
                    sEMDispatchData.setType(aPITypeCode);
                    sEMDispatchData.setStatus(str);
                    sEMDispatchData.setMessage(str2);
                    ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onDispatchAPI(sEMDispatchData);
                }
            });
        }
    }

    public void authNfcYn() {
        Handler handler;
        Runnable runnable;
        xkzzb.onExtraCallback(new Object[]{">> authNfcYn()"});
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    try {
                        String str = ((AbstractSEM) this).m_strStId;
                        if (str == null || str.length() <= 0) {
                            throw new STIllegarStIdException("***** invalid stId");
                        }
                        c = ((AbstractSEM) this).m_oGlobalRepository.getDescriptor();
                        a();
                        WorkerPoolExecutor.getInstance().execute(new WorkerToAuthNfcYn(((AbstractSEM) this).m_oContext, ((AbstractSEM) this).m_strStId, generateIccid(), ((AbstractSEM) this).m_oGlobalRepository.getAppInfo(COMPONENT_ID).getPkgName(), COMPONENT_ID, this));
                    } catch (STIllegarCompPermissionException e) {
                        xkzzb.onNavigationEvent(e);
                        APIResultCode aPIResultCode2 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                        if (APIResultCode.SUCCESS.equals(aPIResultCode2)) {
                            return;
                        }
                        final SEMResultData sEMResultData = SEMResultData.getInstance(APITypeCode.NFC_AUTH_AUTH_NFC_YN, aPIResultCode2, Boolean.FALSE);
                        handler = ((AbstractSEM) this).m_oHandler;
                        runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.3
                            @Override // java.lang.Runnable
                            public void run() {
                                ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData);
                            }
                        };
                        handler.post(runnable);
                    }
                } catch (STIllegarStateException e2) {
                    xkzzb.onNavigationEvent(e2);
                    APIResultCode aPIResultCode3 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode3)) {
                        return;
                    }
                    final SEMResultData sEMResultData2 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_AUTH_NFC_YN, aPIResultCode3, Boolean.FALSE);
                    handler = ((AbstractSEM) this).m_oHandler;
                    runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData2);
                        }
                    };
                    handler.post(runnable);
                } catch (Exception e3) {
                    xkzzb.onNavigationEvent(e3);
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_UNKNOWN;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode4)) {
                        return;
                    }
                    final SEMResultData sEMResultData3 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_AUTH_NFC_YN, aPIResultCode4, Boolean.FALSE);
                    handler = ((AbstractSEM) this).m_oHandler;
                    runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData3);
                        }
                    };
                    handler.post(runnable);
                }
            } catch (STIllegarSmartCardException e4) {
                xkzzb.onNavigationEvent(e4);
                APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_SMARTCARD;
                if (APIResultCode.SUCCESS.equals(aPIResultCode5)) {
                    return;
                }
                final SEMResultData sEMResultData4 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_AUTH_NFC_YN, aPIResultCode5, Boolean.FALSE);
                handler = ((AbstractSEM) this).m_oHandler;
                runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData4);
                    }
                };
                handler.post(runnable);
            } catch (STIllegarStIdException e5) {
                xkzzb.onNavigationEvent(e5);
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_INVALID_STID;
                if (APIResultCode.SUCCESS.equals(aPIResultCode6)) {
                    return;
                }
                final SEMResultData sEMResultData5 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_AUTH_NFC_YN, aPIResultCode6, Boolean.FALSE);
                handler = ((AbstractSEM) this).m_oHandler;
                runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData5);
                    }
                };
                handler.post(runnable);
            }
        } catch (Throwable th) {
            if (!APIResultCode.SUCCESS.equals(aPIResultCode)) {
                final SEMResultData sEMResultData6 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_AUTH_NFC_YN, aPIResultCode, Boolean.FALSE);
                ((AbstractSEM) this).m_oHandler.post(new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData6);
                    }
                });
            }
            throw th;
        }
    }

    public void carrierApiNfcYn() {
        Handler handler;
        Runnable runnable;
        xkzzb.onExtraCallback(new Object[]{">> carrierApiNfcYn()"});
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    try {
                        String str = ((AbstractSEM) this).m_strStId;
                        if (str == null || str.length() <= 0) {
                            throw new STIllegarStIdException("***** invalid stId");
                        }
                        c = ((AbstractSEM) this).m_oGlobalRepository.getDescriptor();
                        a();
                        WorkerPoolExecutor.getInstance().execute(new WorkerToCarrierApiNfcYn(((AbstractSEM) this).m_oContext, ((AbstractSEM) this).m_strStId, generateIccid(), ((AbstractSEM) this).m_oGlobalRepository.getAppInfo(COMPONENT_ID).getPkgName(), COMPONENT_ID, c, this));
                    } catch (STIllegarCompPermissionException e) {
                        xkzzb.onNavigationEvent(e);
                        APIResultCode aPIResultCode2 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                        if (APIResultCode.SUCCESS.equals(aPIResultCode2)) {
                            return;
                        }
                        final SEMResultData sEMResultData = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN, aPIResultCode2, Boolean.FALSE);
                        handler = ((AbstractSEM) this).m_oHandler;
                        runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.4
                            @Override // java.lang.Runnable
                            public void run() {
                                ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData);
                            }
                        };
                        handler.post(runnable);
                    }
                } catch (Exception e2) {
                    xkzzb.onNavigationEvent(e2);
                    APIResultCode aPIResultCode3 = APIResultCode.ERROR_UNKNOWN;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode3)) {
                        return;
                    }
                    final SEMResultData sEMResultData2 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN, aPIResultCode3, Boolean.FALSE);
                    handler = ((AbstractSEM) this).m_oHandler;
                    runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData2);
                        }
                    };
                    handler.post(runnable);
                } catch (STIllegarStateException e3) {
                    xkzzb.onNavigationEvent(e3);
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode4)) {
                        return;
                    }
                    final SEMResultData sEMResultData3 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN, aPIResultCode4, Boolean.FALSE);
                    handler = ((AbstractSEM) this).m_oHandler;
                    runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData3);
                        }
                    };
                    handler.post(runnable);
                }
            } catch (STIllegarSmartCardException e4) {
                xkzzb.onNavigationEvent(e4);
                APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_SMARTCARD;
                if (APIResultCode.SUCCESS.equals(aPIResultCode5)) {
                    return;
                }
                final SEMResultData sEMResultData4 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN, aPIResultCode5, Boolean.FALSE);
                handler = ((AbstractSEM) this).m_oHandler;
                runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData4);
                    }
                };
                handler.post(runnable);
            } catch (STIllegarStIdException e5) {
                xkzzb.onNavigationEvent(e5);
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_INVALID_STID;
                if (APIResultCode.SUCCESS.equals(aPIResultCode6)) {
                    return;
                }
                final SEMResultData sEMResultData5 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN, aPIResultCode6, Boolean.FALSE);
                handler = ((AbstractSEM) this).m_oHandler;
                runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData5);
                    }
                };
                handler.post(runnable);
            }
        } catch (Throwable th) {
            if (!APIResultCode.SUCCESS.equals(aPIResultCode)) {
                final SEMResultData sEMResultData6 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_NFC_YN, aPIResultCode, Boolean.FALSE);
                ((AbstractSEM) this).m_oHandler.post(new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData6);
                    }
                });
            }
            throw th;
        }
    }

    public void carrierApiYn() {
        Handler handler;
        Runnable runnable;
        xkzzb.onExtraCallback(new Object[]{">> carrierApiYn()"});
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        try {
            try {
                try {
                    try {
                        String str = ((AbstractSEM) this).m_strStId;
                        if (str == null || str.length() <= 0) {
                            throw new STIllegarStIdException("***** invalid stId");
                        }
                        c = ((AbstractSEM) this).m_oGlobalRepository.getDescriptor();
                        a();
                        WorkerPoolExecutor.getInstance().execute(new WorkerToCarrierApiYn(((AbstractSEM) this).m_oContext, ((AbstractSEM) this).m_strStId, generateIccid(), ((AbstractSEM) this).m_oGlobalRepository.getAppInfo(COMPONENT_ID).getPkgName(), COMPONENT_ID, c, this));
                    } catch (Exception e) {
                        xkzzb.onNavigationEvent(e);
                        APIResultCode aPIResultCode2 = APIResultCode.ERROR_UNKNOWN;
                        if (APIResultCode.SUCCESS.equals(aPIResultCode2)) {
                            return;
                        }
                        final SEMResultData sEMResultData = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_YN, aPIResultCode2, Boolean.FALSE);
                        handler = ((AbstractSEM) this).m_oHandler;
                        runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.5
                            @Override // java.lang.Runnable
                            public void run() {
                                ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData);
                            }
                        };
                        handler.post(runnable);
                    } catch (STIllegarCompPermissionException e2) {
                        xkzzb.onNavigationEvent(e2);
                        APIResultCode aPIResultCode3 = APIResultCode.ERROR_COMPONENT_PERMISSION_FAIL;
                        if (APIResultCode.SUCCESS.equals(aPIResultCode3)) {
                            return;
                        }
                        final SEMResultData sEMResultData2 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_YN, aPIResultCode3, Boolean.FALSE);
                        handler = ((AbstractSEM) this).m_oHandler;
                        runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.5
                            @Override // java.lang.Runnable
                            public void run() {
                                ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData2);
                            }
                        };
                        handler.post(runnable);
                    }
                } catch (STIllegarCarrierApiException e3) {
                    xkzzb.onNavigationEvent(e3);
                    APIResultCode aPIResultCode4 = APIResultCode.ERROR_UNSUPPORTED_CARRIER_API_STATE;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode4)) {
                        return;
                    }
                    final SEMResultData sEMResultData3 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_YN, aPIResultCode4, Boolean.FALSE);
                    handler = ((AbstractSEM) this).m_oHandler;
                    runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.5
                        @Override // java.lang.Runnable
                        public void run() {
                            ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData3);
                        }
                    };
                    handler.post(runnable);
                } catch (STIllegarSmartCardException e4) {
                    xkzzb.onNavigationEvent(e4);
                    APIResultCode aPIResultCode5 = APIResultCode.ERROR_INVALID_SMARTCARD;
                    if (APIResultCode.SUCCESS.equals(aPIResultCode5)) {
                        return;
                    }
                    final SEMResultData sEMResultData4 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_YN, aPIResultCode5, Boolean.FALSE);
                    handler = ((AbstractSEM) this).m_oHandler;
                    runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.5
                        @Override // java.lang.Runnable
                        public void run() {
                            ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData4);
                        }
                    };
                    handler.post(runnable);
                }
            } catch (STIllegarStIdException e5) {
                xkzzb.onNavigationEvent(e5);
                APIResultCode aPIResultCode6 = APIResultCode.ERROR_INVALID_STID;
                if (APIResultCode.SUCCESS.equals(aPIResultCode6)) {
                    return;
                }
                final SEMResultData sEMResultData5 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_YN, aPIResultCode6, Boolean.FALSE);
                handler = ((AbstractSEM) this).m_oHandler;
                runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData5);
                    }
                };
                handler.post(runnable);
            } catch (STIllegarStateException e6) {
                xkzzb.onNavigationEvent(e6);
                APIResultCode aPIResultCode7 = APIResultCode.ERROR_INVALID_COMPONENT_STATE;
                if (APIResultCode.SUCCESS.equals(aPIResultCode7)) {
                    return;
                }
                final SEMResultData sEMResultData6 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_YN, aPIResultCode7, Boolean.FALSE);
                handler = ((AbstractSEM) this).m_oHandler;
                runnable = new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData6);
                    }
                };
                handler.post(runnable);
            }
        } catch (Throwable th) {
            if (!APIResultCode.SUCCESS.equals(aPIResultCode)) {
                final SEMResultData sEMResultData7 = SEMResultData.getInstance(APITypeCode.NFC_AUTH_CARRIER_API_YN, aPIResultCode, Boolean.FALSE);
                ((AbstractSEM) this).m_oHandler.post(new Runnable() { // from class: com.skp.smarttouch.sem.nfc.NfcAuth.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractSEM) NfcAuth.this).m_onSEManagerConnection.onResultAPI(sEMResultData7);
                    }
                });
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STIllegarSmartCardException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STIllegarStateException */
    private void a() throws Exception {
        xkzzb.onExtraCallback(new Object[]{">> beforeExecute()"});
        GlobalRepository globalRepository = ((AbstractSEM) this).m_oGlobalRepository;
        if (globalRepository == null) {
            throw new STIllegarStateException("***** component state is not connected !!");
        }
        ((AbstractSEM) this).m_oSmartcard = globalRepository.getISmartcard();
        if (getState() != 50) {
            throw new STIllegarStateException("***** component state is not connected !!");
        }
        if (((AbstractSEM) this).m_oSmartcard == null || c == null) {
            throw new STIllegarSmartCardException("***** smartcard is not available !!");
        }
        ((AbstractSEM) this).m_oGlobalRepository.checkPermissionComponents(getCompID());
    }
}
