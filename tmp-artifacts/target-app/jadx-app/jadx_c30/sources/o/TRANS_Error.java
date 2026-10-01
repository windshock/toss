package o;

import j$.time.Instant;
import java.security.PublicKey;
import java.security.Security;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;
import o.HookTool;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.RRSIGRecord;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;
import org.xbill.DNS.dnssec.R;
import org.xbill.DNS.dnssec.ResponseClassification;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TRANS_Error {
    private static final AppSetIdAndScope1 IAuthTabCallback = ea10.onWarmupCompleted(TRANS_Error.class);
    private static final yzp2 onExtraCallback = yzp2.onWarmupCompleted("*");
    private boolean IAuthTabCallbackStub;
    private final UST_TRANS_SetCRSID IAuthTabCallback_Parcel;
    private boolean asBinder;
    private boolean onTransact;
    private int[] onExtraCallbackWithResult = null;
    private Properties onWarmupCompleted = null;
    private boolean onNavigationEvent = true;
    private int IAuthTabCallbackDefault = 1024;
    private int asInterface = 4;

    public static class onExtraCallbackWithResult {
        boolean onExtraCallback;
        yzp2 onWarmupCompleted;
    }

    public TRANS_Error() {
        this.onTransact = Security.getProviders("MessageDigest.GOST3411") != null;
        this.asBinder = Security.getProviders("KeyFactory.Ed25519") != null;
        this.IAuthTabCallbackStub = Security.getProviders("KeyFactory.Ed448") != null;
        this.IAuthTabCallback_Parcel = new UST_TRANS_SetCRSID(this);
    }

    public static void onNavigationEvent(GetKMCert getKMCert, RRSIGRecord rRSIGRecord) {
        if (getKMCert.onExtraCallback() != 47) {
            return;
        }
        Record recordOnWarmupCompleted = getKMCert.onWarmupCompleted();
        int iIAuthTabCallback = recordOnWarmupCompleted.access000().IAuthTabCallback();
        int i = iIAuthTabCallback - 1;
        if (recordOnWarmupCompleted.access000().onWarmupCompleted()) {
            i = iIAuthTabCallback - 2;
        }
        if (rRSIGRecord.IAuthTabCallbackDefault() == i) {
            getKMCert.onExtraCallbackWithResult(recordOnWarmupCompleted.access000());
        } else {
            if (rRSIGRecord.IAuthTabCallbackDefault() < i) {
                getKMCert.onExtraCallbackWithResult(recordOnWarmupCompleted.access000().onExtraCallback(rRSIGRecord.asBinder().IAuthTabCallback() - rRSIGRecord.IAuthTabCallbackDefault()));
                return;
            }
            throw new IllegalArgumentException("invalid nsec record");
        }
    }

    public static ResponseClassification onExtraCallbackWithResult(onChildViewAdded onchildviewadded, GetKMPrikey getKMPrikey) {
        if (getKMPrikey.IAuthTabCallbackStub() == 3 && getKMPrikey.onWarmupCompleted(1) == 0) {
            return ResponseClassification.NAMEERROR;
        }
        boolean z = false;
        if (!onchildviewadded.IAuthTabCallback().onExtraCallback(7) && getKMPrikey.onWarmupCompleted(1) == 0 && getKMPrikey.IAuthTabCallbackStub() != 0) {
            for (GetKMCert getKMCert : getKMPrikey.onExtraCallback(2)) {
                if (getKMCert.onExtraCallback() == 6) {
                    return ResponseClassification.NODATA;
                }
                if (getKMCert.onExtraCallback() == 43) {
                    return ResponseClassification.REFERRAL;
                }
                if (getKMCert.onExtraCallback() == 2) {
                    z = true;
                }
            }
            return z ? ResponseClassification.REFERRAL : ResponseClassification.NODATA;
        }
        if (getKMPrikey.onExtraCallback(2).isEmpty() && getKMPrikey.onExtraCallback(1).size() == 1 && getKMPrikey.IAuthTabCallbackStub() == 0 && getKMPrikey.onExtraCallback(1).get(0).onExtraCallback() == 2 && !getKMPrikey.onExtraCallback(1).get(0).asInterface().equals(onchildviewadded.onNavigationEvent().access000())) {
            return ResponseClassification.REFERRAL;
        }
        if (getKMPrikey.IAuthTabCallbackStub() != 0 && getKMPrikey.IAuthTabCallbackStub() != 3) {
            return ResponseClassification.UNKNOWN;
        }
        if (getKMPrikey.IAuthTabCallbackStub() == 0 && getKMPrikey.onWarmupCompleted(1) == 0) {
            return ResponseClassification.NODATA;
        }
        int iExtraCallback = getKMPrikey.onExtraCallbackWithResult().extraCallback();
        if (iExtraCallback == 255) {
            return ResponseClassification.ANY;
        }
        for (GetKMCert getKMCert2 : getKMPrikey.onExtraCallback(1)) {
            if (getKMCert2.onExtraCallback() == iExtraCallback) {
                return ResponseClassification.POSITIVE;
            }
            if (getKMCert2.onExtraCallback() == 5 || getKMCert2.onExtraCallback() == 39) {
                if (iExtraCallback == 43) {
                    return ResponseClassification.CNAME;
                }
                z = true;
            }
        }
        if (z) {
            if (getKMPrikey.IAuthTabCallbackStub() == 3) {
                return ResponseClassification.CNAME_NAMEERROR;
            }
            return ResponseClassification.CNAME_NODATA;
        }
        return ResponseClassification.UNKNOWN;
    }

    public JCertTransfer onExtraCallbackWithResult(GetKMCert getKMCert, GetKMCert getKMCert2, long j, Instant instant) {
        int iOnExtraCallbackWithResult;
        SaveCertAndEncPrikey saveCertAndEncPrikey;
        List<Integer> listOnNavigationEvent;
        int iOnExtraCallback;
        TRANS_Error tRANS_Error = this;
        boolean z = false;
        if (!getKMCert.asInterface().equals(getKMCert2.asInterface())) {
            JCertTransfer jCertTransferOnWarmupCompleted = JCertTransfer.onWarmupCompleted(getKMCert2.asInterface(), getKMCert2.onTransact(), j);
            jCertTransferOnWarmupCompleted.onNavigationEvent(6, R.onExtraCallbackWithResult("dnskey.no_name_match", new Object[0]));
            return jCertTransferOnWarmupCompleted;
        }
        if (tRANS_Error.onNavigationEvent) {
            iOnExtraCallbackWithResult = tRANS_Error.onExtraCallbackWithResult(getKMCert2);
            saveCertAndEncPrikey = new SaveCertAndEncPrikey(tRANS_Error);
            listOnNavigationEvent = saveCertAndEncPrikey.onNavigationEvent(getKMCert2, iOnExtraCallbackWithResult);
            new Object[]{getKMCert.asInterface(), Integer.valueOf(iOnExtraCallbackWithResult), HookTool.IAuthTabCallback.onNavigationEvent(iOnExtraCallbackWithResult)};
        } else {
            iOnExtraCallbackWithResult = -1;
            saveCertAndEncPrikey = null;
            listOnNavigationEvent = null;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator it = getKMCert2.onWarmupCompleted(false).iterator();
        boolean z2 = false;
        GetCertNum getCertNumOnExtraCallbackWithResult = null;
        boolean z3 = false;
        while (it.hasNext()) {
            getColumnName getcolumnname = (getColumnName) ((Record) it.next());
            if (!tRANS_Error.onExtraCallback(getcolumnname.onExtraCallback())) {
                getcolumnname.onExtraCallback();
                HookTool.IAuthTabCallback.onNavigationEvent(getcolumnname.onExtraCallback());
            } else if (!tRANS_Error.onWarmupCompleted(getcolumnname.onExtraCallbackWithResult())) {
                getcolumnname.onExtraCallbackWithResult();
                HookTool.onExtraCallback.IAuthTabCallback(getcolumnname.onExtraCallbackWithResult());
            } else if (saveCertAndEncPrikey != null && getcolumnname.onExtraCallback() != iOnExtraCallbackWithResult) {
                getcolumnname.onExtraCallback();
                HookTool.IAuthTabCallback.onNavigationEvent(getcolumnname.onExtraCallback());
            } else {
                getCertNumOnExtraCallbackWithResult = tRANS_Error.onExtraCallbackWithResult(getKMCert, getcolumnname, instant, atomicInteger);
                if (getCertNumOnExtraCallbackWithResult.onExtraCallback == GetPassword.INSECURE) {
                    getcolumnname.onExtraCallbackWithResult();
                    HookTool.onExtraCallback.IAuthTabCallback(getcolumnname.onExtraCallbackWithResult());
                    tRANS_Error = this;
                    z = true;
                } else {
                    if (atomicInteger.get() > 0) {
                        atomicInteger.get();
                        z3 = true;
                    }
                    GetPassword getPassword = getCertNumOnExtraCallbackWithResult.onExtraCallback;
                    GetPassword getPassword2 = GetPassword.SECURE;
                    if (getPassword == getPassword2) {
                        if (saveCertAndEncPrikey == null || saveCertAndEncPrikey.onExtraCallback(getcolumnname.onExtraCallbackWithResult())) {
                            if (!onWarmupCompleted(getKMCert)) {
                                new Object[]{getcolumnname.access000(), Integer.valueOf(getcolumnname.onWarmupCompleted()), Integer.valueOf(getcolumnname.onExtraCallback()), Integer.valueOf(getcolumnname.onExtraCallbackWithResult())};
                                return JCertTransfer.IAuthTabCallback(getKMCert2.asInterface(), getKMCert2.onTransact(), j);
                            }
                            getKMCert.onExtraCallback(getPassword2);
                            return JCertTransfer.onExtraCallbackWithResult(getKMCert, listOnNavigationEvent);
                        }
                    } else if (saveCertAndEncPrikey != null && getPassword == GetPassword.BOGUS) {
                        saveCertAndEncPrikey.IAuthTabCallback(getcolumnname.onExtraCallbackWithResult());
                    }
                    tRANS_Error = this;
                    z2 = true;
                }
            }
        }
        if (z && !z3) {
            JCertTransfer jCertTransferIAuthTabCallback = JCertTransfer.IAuthTabCallback(getKMCert2.asInterface(), getKMCert2.onTransact(), j);
            jCertTransferIAuthTabCallback.onNavigationEvent(2, R.onExtraCallbackWithResult("failed.ds.nodigest", getKMCert2.asInterface()));
            return jCertTransferIAuthTabCallback;
        }
        if (!z2) {
            JCertTransfer jCertTransferIAuthTabCallback2 = JCertTransfer.IAuthTabCallback(getKMCert2.asInterface(), getKMCert2.onTransact(), j);
            jCertTransferIAuthTabCallback2.onNavigationEvent(2, R.onExtraCallbackWithResult("failed.ds.no_usable_digest", getKMCert2.asInterface()));
            return jCertTransferIAuthTabCallback2;
        }
        if (saveCertAndEncPrikey != null && (iOnExtraCallback = saveCertAndEncPrikey.onExtraCallback()) != 0) {
            HookTool.onExtraCallback.IAuthTabCallback(iOnExtraCallback);
        }
        JCertTransfer jCertTransferOnWarmupCompleted2 = JCertTransfer.onWarmupCompleted(getKMCert2.asInterface(), getKMCert2.onTransact(), j);
        jCertTransferOnWarmupCompleted2.onNavigationEvent(getCertNumOnExtraCallbackWithResult.onWarmupCompleted, getCertNumOnExtraCallbackWithResult.onNavigationEvent);
        return jCertTransferOnWarmupCompleted2;
    }

    private GetCertNum onExtraCallbackWithResult(GetKMCert getKMCert, getColumnName getcolumnname, Instant instant, AtomicInteger atomicInteger) {
        Iterator it = getKMCert.onWarmupCompleted(false).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            copyStringToBuffer copystringtobuffer = (copyStringToBuffer) ((Record) it.next());
            new Object[]{copystringtobuffer.access000(), Integer.valueOf(copystringtobuffer.onExtraCallbackWithResult()), Integer.valueOf(copystringtobuffer.onExtraCallback()), getcolumnname.access000(), Integer.valueOf(getcolumnname.onWarmupCompleted()), Integer.valueOf(getcolumnname.onExtraCallback()), Integer.valueOf(getcolumnname.onExtraCallbackWithResult())};
            if (getcolumnname.onWarmupCompleted() == copystringtobuffer.onExtraCallbackWithResult() && getcolumnname.onExtraCallbackWithResult() == copystringtobuffer.onExtraCallback()) {
                atomicInteger.getAndIncrement();
                if (!onWarmupCompleted(getcolumnname, copystringtobuffer)) {
                    if (atomicInteger.get() > this.asInterface + i2) {
                        return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("dnskey.ds_max_match", new Object[0]));
                    }
                } else {
                    i2++;
                    if (onExtraCallback(copystringtobuffer)) {
                        GetCertNum getCertNumOnWarmupCompleted = this.IAuthTabCallback_Parcel.onWarmupCompleted(getKMCert, copystringtobuffer, instant);
                        if (getCertNumOnWarmupCompleted.onExtraCallback == GetPassword.SECURE) {
                            return getCertNumOnWarmupCompleted;
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        if (i > 0) {
            return new GetCertNum(GetPassword.INSECURE, -1, null);
        }
        if (atomicInteger.get() == 0) {
            return new GetCertNum(GetPassword.BOGUS, 9, R.onExtraCallbackWithResult("dnskey.no_ds_alg_match", getKMCert.asInterface(), HookTool.onExtraCallback.IAuthTabCallback(getcolumnname.onExtraCallbackWithResult())));
        }
        if (i2 == 0) {
            return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("dnskey.no_ds_match", new Object[0]));
        }
        return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("dnskey.ds_match_mismatch", new Object[0]));
    }

    private boolean onWarmupCompleted(getColumnName getcolumnname, copyStringToBuffer copystringtobuffer) {
        try {
            return Arrays.equals(new getColumnName(yzp2.IAuthTabCallback, getcolumnname.getInterfaceDescriptor(), 0L, getcolumnname.onExtraCallback(), copystringtobuffer).onNavigationEvent(), getcolumnname.onNavigationEvent());
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    int onExtraCallbackWithResult(GetKMCert getKMCert) {
        int[] iArr = this.onExtraCallbackWithResult;
        int iOnExtraCallback = 0;
        if (iArr == null) {
            for (getColumnName getcolumnname : getKMCert.onWarmupCompleted(false)) {
                if (getcolumnname.onExtraCallback() > iOnExtraCallback && onExtraCallback(getcolumnname.onExtraCallback()) && onWarmupCompleted(getcolumnname.onExtraCallbackWithResult())) {
                    iOnExtraCallback = getcolumnname.onExtraCallback();
                }
            }
            return iOnExtraCallback;
        }
        for (int i : iArr) {
            for (getColumnName getcolumnname2 : getKMCert.onWarmupCompleted(false)) {
                if (getcolumnname2.onExtraCallback() == i) {
                    return getcolumnname2.onExtraCallback();
                }
            }
        }
        return 0;
    }

    public GetCertNum onWarmupCompleted(GetKMCert getKMCert, JCertTransfer jCertTransfer, Instant instant) {
        GetPassword getPasswordIAuthTabCallback_Parcel = getKMCert.IAuthTabCallback_Parcel();
        GetPassword getPassword = GetPassword.SECURE;
        if (getPasswordIAuthTabCallback_Parcel == getPassword) {
            new Object[]{getKMCert.asInterface(), lt54.onNavigationEvent(getKMCert.onExtraCallback()), ryzbycx.onWarmupCompleted(getKMCert.onTransact())};
            return new GetCertNum(getPassword, -1, null);
        }
        GetCertNum getCertNumOnWarmupCompleted = this.IAuthTabCallback_Parcel.onWarmupCompleted(getKMCert, jCertTransfer, instant);
        getKMCert.onExtraCallback(getCertNumOnWarmupCompleted.onExtraCallback);
        return getCertNumOnWarmupCompleted;
    }

    public static yzp2 IAuthTabCallback(RRset rRset) {
        List listIAuthTabCallbackStubProxy = rRset.IAuthTabCallbackStubProxy();
        RRSIGRecord rRSIGRecord = (RRSIGRecord) listIAuthTabCallbackStubProxy.get(0);
        for (int i = 1; i < listIAuthTabCallbackStubProxy.size(); i++) {
            if (((RRSIGRecord) listIAuthTabCallbackStubProxy.get(i)).IAuthTabCallbackDefault() != rRSIGRecord.IAuthTabCallbackDefault()) {
                throw new IllegalArgumentException("failed.wildcard.label_count_mismatch");
            }
        }
        yzp2 yzp2VarAsInterface = rRset.asInterface();
        if (rRset.asInterface().onWarmupCompleted()) {
            yzp2VarAsInterface = new yzp2(yzp2VarAsInterface, 1);
        }
        int iIAuthTabCallback = (yzp2VarAsInterface.IAuthTabCallback() - 1) - rRSIGRecord.IAuthTabCallbackDefault();
        if (iIAuthTabCallback > 0) {
            return yzp2VarAsInterface.onExtraCallback(iIAuthTabCallback);
        }
        return null;
    }

    public static yzp2 onExtraCallback(yzp2 yzp2Var, yzp2 yzp2Var2) {
        int iMin = Math.min(yzp2Var.IAuthTabCallback(), yzp2Var2.IAuthTabCallback());
        yzp2 yzp2Var3 = new yzp2(yzp2Var, yzp2Var.IAuthTabCallback() - iMin);
        yzp2 yzp2Var4 = new yzp2(yzp2Var2, yzp2Var2.IAuthTabCallback() - iMin);
        for (int i = 0; i < iMin - 1; i++) {
            yzp2 yzp2Var5 = new yzp2(yzp2Var3, i);
            if (yzp2Var5.equals(new yzp2(yzp2Var4, i))) {
                return yzp2Var5;
            }
        }
        return yzp2.IAuthTabCallback;
    }

    public static boolean IAuthTabCallback(yzp2 yzp2Var, yzp2 yzp2Var2) {
        if (yzp2Var.IAuthTabCallback() <= yzp2Var2.IAuthTabCallback()) {
            return false;
        }
        return new yzp2(yzp2Var, yzp2Var.IAuthTabCallback() - yzp2Var2.IAuthTabCallback()).equals(yzp2Var2);
    }

    public static yzp2 onNavigationEvent(yzp2 yzp2Var, yzp2 yzp2Var2, yzp2 yzp2Var3) {
        yzp2 yzp2VarOnExtraCallback = onExtraCallback(yzp2Var, yzp2Var2);
        yzp2 yzp2VarOnExtraCallback2 = onExtraCallback(yzp2Var, yzp2Var3);
        return yzp2VarOnExtraCallback.IAuthTabCallback() > yzp2VarOnExtraCallback2.IAuthTabCallback() ? yzp2VarOnExtraCallback : yzp2VarOnExtraCallback2;
    }

    public static yzp2 IAuthTabCallback(yzp2 yzp2Var, GetKMCert getKMCert, szzb szzbVar) throws NameTooLongException {
        return yzp2.onWarmupCompleted(onExtraCallback, onNavigationEvent(yzp2Var, getKMCert.asInterface(), szzbVar.onExtraCallback()));
    }

    public static boolean onExtraCallback(GetKMCert getKMCert, szzb szzbVar, yzp2 yzp2Var) {
        yzp2 yzp2VarAsInterface = getKMCert.asInterface();
        yzp2 yzp2VarOnExtraCallback = szzbVar.onExtraCallback();
        if (yzp2Var.equals(yzp2VarAsInterface) || !yzp2VarOnExtraCallback.IAuthTabCallback(getKMCert.ICustomTabsCallback())) {
            return false;
        }
        if (yzp2Var.IAuthTabCallback(yzp2VarAsInterface)) {
            if (szzbVar.onExtraCallbackWithResult(39)) {
                return false;
            }
            if (szzbVar.onExtraCallbackWithResult(2) && !szzbVar.onExtraCallbackWithResult(6)) {
                return false;
            }
        }
        if (yzp2VarAsInterface.equals(yzp2VarOnExtraCallback)) {
            return IAuthTabCallback(yzp2Var, yzp2VarOnExtraCallback);
        }
        return yzp2VarAsInterface.onExtraCallbackWithResult(yzp2VarOnExtraCallback) > 0 ? yzp2VarAsInterface.onExtraCallbackWithResult(yzp2Var) < 0 && IAuthTabCallback(yzp2Var, yzp2VarOnExtraCallback) : yzp2VarAsInterface.onExtraCallbackWithResult(yzp2Var) < 0 && yzp2Var.onExtraCallbackWithResult(yzp2VarOnExtraCallback) < 0;
    }

    public static boolean onNavigationEvent(GetKMCert getKMCert, szzb szzbVar, yzp2 yzp2Var) {
        int iIAuthTabCallback = yzp2Var.IAuthTabCallback() - onNavigationEvent(yzp2Var, getKMCert.asInterface(), szzbVar.onExtraCallback()).IAuthTabCallback();
        if (iIAuthTabCallback > 0) {
            return onExtraCallback(getKMCert, szzbVar, yzp2Var.onExtraCallback(iIAuthTabCallback));
        }
        return false;
    }

    public static onExtraCallbackWithResult onWarmupCompleted(GetKMCert getKMCert, szzb szzbVar, yzp2 yzp2Var, int i) {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        if (!getKMCert.asInterface().equals(yzp2Var)) {
            if (IAuthTabCallback(szzbVar.onExtraCallback(), yzp2Var) && getKMCert.asInterface().onExtraCallbackWithResult(yzp2Var) < 0) {
                onextracallbackwithresult.onExtraCallback = true;
                return onextracallbackwithresult;
            }
            if (getKMCert.asInterface().onWarmupCompleted()) {
                yzp2 yzp2Var2 = new yzp2(getKMCert.asInterface(), 1);
                if (IAuthTabCallback(yzp2Var, yzp2Var2)) {
                    if (szzbVar.onExtraCallbackWithResult(5)) {
                        onextracallbackwithresult.onExtraCallback = false;
                        return onextracallbackwithresult;
                    }
                    if (szzbVar.onExtraCallbackWithResult(2) && !szzbVar.onExtraCallbackWithResult(6)) {
                        onextracallbackwithresult.onExtraCallback = false;
                        return onextracallbackwithresult;
                    }
                    if (szzbVar.onExtraCallbackWithResult(i)) {
                        lt54.onNavigationEvent(i);
                        onextracallbackwithresult.onExtraCallback = false;
                        return onextracallbackwithresult;
                    }
                }
                onextracallbackwithresult.onWarmupCompleted = yzp2Var2;
                onextracallbackwithresult.onExtraCallback = true;
                return onextracallbackwithresult;
            }
            onextracallbackwithresult.onExtraCallback = false;
            return onextracallbackwithresult;
        }
        if (szzbVar.onExtraCallbackWithResult(i)) {
            lt54.onNavigationEvent(i);
            onextracallbackwithresult.onExtraCallback = false;
            return onextracallbackwithresult;
        }
        if (szzbVar.onExtraCallbackWithResult(5)) {
            onextracallbackwithresult.onExtraCallback = false;
            return onextracallbackwithresult;
        }
        if (i != 43 && szzbVar.onExtraCallbackWithResult(2) && !szzbVar.onExtraCallbackWithResult(6)) {
            onextracallbackwithresult.onExtraCallback = false;
            return onextracallbackwithresult;
        }
        if (i == 43 && szzbVar.onExtraCallbackWithResult(6) && !yzp2.IAuthTabCallback.equals(yzp2Var)) {
            onextracallbackwithresult.onExtraCallback = false;
            return onextracallbackwithresult;
        }
        onextracallbackwithresult.onExtraCallback = true;
        return onextracallbackwithresult;
    }

    public GetCertNum onExtraCallbackWithResult(onChildViewAdded onchildviewadded, GetKMPrikey getKMPrikey, JCertTransfer jCertTransfer, Instant instant) {
        yzp2 yzp2VarAccess000 = onchildviewadded.onNavigationEvent().access000();
        GetKMCert getKMCertOnWarmupCompleted = getKMPrikey.onWarmupCompleted(yzp2VarAccess000, 47, onchildviewadded.onNavigationEvent().getInterfaceDescriptor(), 2);
        if (getKMCertOnWarmupCompleted != null) {
            GetCertNum getCertNumOnWarmupCompleted = onWarmupCompleted(getKMCertOnWarmupCompleted, jCertTransfer, instant);
            if (getCertNumOnWarmupCompleted.onExtraCallback != GetPassword.SECURE) {
                return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("failed.ds.nsec", getCertNumOnWarmupCompleted.onNavigationEvent));
            }
            GetPassword getPasswordIAuthTabCallback = IAuthTabCallback(getKMCertOnWarmupCompleted.onWarmupCompleted(), yzp2VarAccess000);
            int i = AnonymousClass4.onNavigationEvent[getPasswordIAuthTabCallback.ordinal()];
            if (i == 1) {
                return new GetCertNum(getPasswordIAuthTabCallback, -1, R.onExtraCallbackWithResult("failed.ds.nodelegation", new Object[0]));
            }
            if (i == 2) {
                return new GetCertNum(getPasswordIAuthTabCallback, -1, R.onExtraCallbackWithResult("insecure.ds.nsec", new Object[0]));
            }
            return new GetCertNum(getPasswordIAuthTabCallback, 6, R.onExtraCallbackWithResult("failed.ds.nsec.hasdata", new Object[0]));
        }
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        yzp2 yzp2VarOnNavigationEvent = null;
        szzb szzbVar = null;
        boolean z = false;
        for (GetKMCert getKMCert : getKMPrikey.onExtraCallbackWithResult(2, 47)) {
            GetCertNum getCertNumOnWarmupCompleted2 = onWarmupCompleted(getKMCert, jCertTransfer, instant);
            GetPassword getPassword = getCertNumOnWarmupCompleted2.onExtraCallback;
            if (getPassword != GetPassword.SECURE) {
                return new GetCertNum(getPassword, getCertNumOnWarmupCompleted2.onWarmupCompleted, R.onExtraCallbackWithResult("failed.ds.nsec.ent", new Object[0]));
            }
            szzb szzbVar2 = (szzb) getKMCert.onWarmupCompleted(false).get(0);
            onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted(getKMCert, szzbVar2, yzp2VarAccess000, 43);
            if (onextracallbackwithresultOnWarmupCompleted.onExtraCallback) {
                if (onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted == null || !szzbVar2.access000().onWarmupCompleted()) {
                    z = true;
                } else {
                    z = true;
                    szzbVar = szzbVar2;
                }
            }
            if (onExtraCallback(getKMCert, szzbVar2, yzp2VarAccess000)) {
                yzp2VarOnNavigationEvent = onNavigationEvent(yzp2VarAccess000, getKMCert.asInterface(), szzbVar2.onExtraCallback());
            }
            onextracallbackwithresult = onextracallbackwithresultOnWarmupCompleted;
        }
        yzp2 yzp2Var = onextracallbackwithresult.onWarmupCompleted;
        if ((yzp2Var == null || (yzp2VarOnNavigationEvent != null && yzp2VarOnNavigationEvent.equals(yzp2Var))) && z) {
            if (onextracallbackwithresult.onWarmupCompleted != null) {
                return new GetCertNum(IAuthTabCallback(szzbVar, yzp2VarAccess000), 12, R.onExtraCallbackWithResult("failed.ds.nowildcardproof", new Object[0]));
            }
            return new GetCertNum(GetPassword.INSECURE, -1, R.onExtraCallbackWithResult("insecure.ds.nsec.ent", new Object[0]));
        }
        return new GetCertNum(GetPassword.UNCHECKED, 5, R.onExtraCallbackWithResult("failed.ds.nonconclusive", new Object[0]));
    }

    /* renamed from: o.TRANS_Error$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[GetPassword.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[GetPassword.INSECURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[GetPassword.SECURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public boolean onExtraCallback(GetKMPrikey getKMPrikey) {
        for (GetKMCert getKMCert : getKMPrikey.onExtraCallback(2)) {
            if (getKMCert.onExtraCallback() == 47 || getKMCert.onExtraCallback() == 50) {
                if (!getKMCert.IAuthTabCallbackStubProxy().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static GetPassword IAuthTabCallback(szzb szzbVar, yzp2 yzp2Var) {
        if ((szzbVar.onExtraCallbackWithResult(6) && !yzp2.IAuthTabCallback.equals(yzp2Var)) || szzbVar.onExtraCallbackWithResult(43)) {
            return GetPassword.BOGUS;
        }
        if (!szzbVar.onExtraCallbackWithResult(2)) {
            return GetPassword.INSECURE;
        }
        return GetPassword.SECURE;
    }

    boolean onExtraCallbackWithResult(RRset rRset) {
        Iterator it = rRset.onWarmupCompleted(false).iterator();
        while (it.hasNext()) {
            if (onWarmupCompleted(((Record) it.next()).onExtraCallbackWithResult())) {
                return true;
            }
        }
        return false;
    }

    boolean onWarmupCompleted(int i) {
        String str = "dnsjava.dnssec.algorithm." + i;
        switch (i) {
            case 3:
            case 6:
                Properties properties = this.onWarmupCompleted;
                if (properties == null) {
                    return false;
                }
                return Boolean.parseBoolean(properties.getProperty(str, Boolean.FALSE.toString()));
            case 4:
            case 9:
            case 11:
            default:
                return false;
            case 5:
            case 7:
            case 8:
            case 10:
            case 13:
            case 14:
                return onExtraCallback(str, true);
            case 12:
                return onExtraCallback(str, this.onTransact);
            case 15:
                return onExtraCallback(str, this.asBinder);
            case 16:
                return onExtraCallback(str, this.IAuthTabCallbackStub);
        }
    }

    private boolean onWarmupCompleted(RRset rRset) {
        Iterator it = rRset.onWarmupCompleted(false).iterator();
        while (it.hasNext()) {
            if (!onExtraCallback((copyStringToBuffer) ((Record) it.next()))) {
                return false;
            }
        }
        return true;
    }

    private boolean onExtraCallback(copyStringToBuffer copystringtobuffer) {
        try {
            PublicKey publicKeyIAuthTabCallbackDefault = copystringtobuffer.IAuthTabCallbackDefault();
            int iOnExtraCallback = copystringtobuffer.onExtraCallback();
            boolean z = true;
            if (iOnExtraCallback != 1 && iOnExtraCallback != 5 && iOnExtraCallback != 10 && iOnExtraCallback != 7 && iOnExtraCallback != 8) {
                return true;
            }
            int iBitLength = ((RSAPublicKey) publicKeyIAuthTabCallbackDefault).getModulus().bitLength();
            if (iBitLength < this.IAuthTabCallbackDefault) {
                z = false;
            }
            if (!z) {
                copystringtobuffer.access000();
                ryzbycx.onWarmupCompleted(copystringtobuffer.getInterfaceDescriptor());
                HookTool.onExtraCallback.IAuthTabCallback(copystringtobuffer.onExtraCallback());
                int iOnExtraCallbackWithResult = copystringtobuffer.onExtraCallbackWithResult();
                int i = this.IAuthTabCallbackDefault;
                Integer.valueOf(iBitLength);
                Integer.valueOf(iOnExtraCallbackWithResult);
                Integer.valueOf(i);
            }
            return z;
        } catch (HookTool.onWarmupCompleted unused) {
            return false;
        }
    }

    boolean onExtraCallback(int i) {
        String str = "dnsjava.dnssec.digest." + i;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return onExtraCallback(str, this.onTransact);
            }
            if (i != 4) {
                return false;
            }
        }
        Properties properties = this.onWarmupCompleted;
        if (properties == null) {
            return true;
        }
        return Boolean.parseBoolean(properties.getProperty(str, Boolean.TRUE.toString()));
    }

    private boolean onExtraCallback(String str, boolean z) {
        if (!z) {
            return false;
        }
        Properties properties = this.onWarmupCompleted;
        if (properties == null) {
            return true;
        }
        return Boolean.parseBoolean(properties.getProperty(str, Boolean.TRUE.toString()));
    }
}
