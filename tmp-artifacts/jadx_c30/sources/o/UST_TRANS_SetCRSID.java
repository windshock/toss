package o;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.HookTool;
import org.xbill.DNS.RRSIGRecord;
import org.xbill.DNS.RRset;
import org.xbill.DNS.dnssec.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class UST_TRANS_SetCRSID {
    private static final AppSetIdAndScope1 IAuthTabCallback = ea10.onWarmupCompleted(UST_TRANS_SetCRSID.class);
    private final TRANS_Error onExtraCallbackWithResult;
    private int onWarmupCompleted;

    public UST_TRANS_SetCRSID(TRANS_Error tRANS_Error) {
        this.onExtraCallbackWithResult = tRANS_Error;
    }

    private List<copyStringToBuffer> onWarmupCompleted(RRset rRset, RRSIGRecord rRSIGRecord) {
        if (!rRSIGRecord.asBinder().equals(rRset.asInterface())) {
            rRSIGRecord.asBinder();
            rRset.asInterface();
            return Collections.EMPTY_LIST;
        }
        int iOnNavigationEvent = rRSIGRecord.onNavigationEvent();
        int iOnExtraCallbackWithResult = rRSIGRecord.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList(rRset.access100());
        for (copyStringToBuffer copystringtobuffer : rRset.onWarmupCompleted(false)) {
            if (copystringtobuffer.onExtraCallback() == iOnExtraCallbackWithResult && copystringtobuffer.onExtraCallbackWithResult() == iOnNavigationEvent) {
                arrayList.add(copystringtobuffer);
            }
        }
        return arrayList;
    }

    private GetCertNum onWarmupCompleted(GetKMCert getKMCert, RRSIGRecord rRSIGRecord, JCertTransfer jCertTransfer, Instant instant) {
        if (!getKMCert.asInterface().IAuthTabCallback(rRSIGRecord.asBinder())) {
            rRSIGRecord.asBinder();
            getKMCert.asInterface();
            return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("dnskey.key_offtree", rRSIGRecord.asBinder(), getKMCert.asInterface()));
        }
        Iterator<copyStringToBuffer> it = onWarmupCompleted(jCertTransfer, rRSIGRecord).iterator();
        if (it.hasNext()) {
            try {
                HookTool.IAuthTabCallback(getKMCert, rRSIGRecord, it.next(), instant);
                TRANS_Error.onNavigationEvent(getKMCert, rRSIGRecord);
                return new GetCertNum(GetPassword.SECURE, -1, null);
            } catch (HookTool.onExtraCallbackWithResult e) {
                return new GetCertNum(GetPassword.BOGUS, e.onExtraCallback(), R.onExtraCallbackWithResult("dnskey.invalid", new Object[0]));
            } catch (HookTool.asBinder unused) {
                return new GetCertNum(GetPassword.BOGUS, 7, R.onExtraCallbackWithResult("dnskey.expired", new Object[0]));
            } catch (HookTool.IAuthTabCallbackDefault unused2) {
                return new GetCertNum(GetPassword.BOGUS, 8, R.onExtraCallbackWithResult("dnskey.not_yet_valid", new Object[0]));
            } catch (HookTool.onWarmupCompleted e2) {
                new Object[]{getKMCert.asInterface(), ryzbycx.onWarmupCompleted(getKMCert.onTransact()), lt54.onNavigationEvent(getKMCert.onExtraCallback()), e2};
                return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("dnskey.invalid", new Object[0]));
            } catch (HookTool.IAuthTabCallbackStub unused3) {
                return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("dnskey.no_match", new Object[0]));
            }
        }
        return new GetCertNum(GetPassword.UNCHECKED, 9, R.onExtraCallbackWithResult("dnskey.no_key", rRSIGRecord.asBinder()));
    }

    public GetCertNum onWarmupCompleted(GetKMCert getKMCert, JCertTransfer jCertTransfer, Instant instant) {
        SaveCertAndEncPrikey saveCertAndEncPrikey;
        List<RRSIGRecord> listIAuthTabCallbackStubProxy = getKMCert.IAuthTabCallbackStubProxy();
        if (listIAuthTabCallbackStubProxy.isEmpty()) {
            new Object[]{getKMCert.asInterface(), ryzbycx.onWarmupCompleted(getKMCert.onTransact()), lt54.onNavigationEvent(getKMCert.onExtraCallback())};
            return new GetCertNum(GetPassword.BOGUS, 10, R.onExtraCallbackWithResult("validate.bogus.missingsig_named", getKMCert.asInterface(), lt54.onNavigationEvent(getKMCert.onExtraCallback())));
        }
        GetCertNum getCertNum = null;
        if (jCertTransfer.onExtraCallbackWithResult() != null) {
            saveCertAndEncPrikey = new SaveCertAndEncPrikey(this.onExtraCallbackWithResult);
            saveCertAndEncPrikey.onExtraCallbackWithResult(jCertTransfer.onExtraCallbackWithResult());
            if (saveCertAndEncPrikey.onWarmupCompleted() == 0) {
                getKMCert.asInterface();
                return new GetCertNum(GetPassword.INSECURE, 1, R.onExtraCallbackWithResult("validate.insecure.noalg", getKMCert.asInterface()));
            }
        } else {
            saveCertAndEncPrikey = null;
        }
        int i = 0;
        for (RRSIGRecord rRSIGRecord : listIAuthTabCallbackStubProxy) {
            GetCertNum getCertNumOnWarmupCompleted = onWarmupCompleted(getKMCert, rRSIGRecord, jCertTransfer, instant);
            GetPassword getPassword = getCertNumOnWarmupCompleted.onExtraCallback;
            if (getPassword == GetPassword.SECURE) {
                if (saveCertAndEncPrikey == null || saveCertAndEncPrikey.onExtraCallback(rRSIGRecord.onExtraCallbackWithResult())) {
                    return getCertNumOnWarmupCompleted;
                }
            } else if (saveCertAndEncPrikey != null && getPassword == GetPassword.BOGUS) {
                saveCertAndEncPrikey.IAuthTabCallback(rRSIGRecord.onExtraCallbackWithResult());
            }
            i++;
            if (i > this.onWarmupCompleted) {
                new Object[]{getKMCert.asInterface(), ryzbycx.onWarmupCompleted(getKMCert.onTransact()), lt54.onNavigationEvent(getKMCert.onExtraCallback())};
                return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("validate.bogus.rrsigtoomany", getKMCert.asInterface(), lt54.onNavigationEvent(getKMCert.onExtraCallback())));
            }
            getCertNum = getCertNumOnWarmupCompleted;
        }
        new Object[]{getKMCert.asInterface(), ryzbycx.onWarmupCompleted(getKMCert.onTransact()), lt54.onNavigationEvent(getKMCert.onExtraCallback())};
        return getCertNum;
    }

    public GetCertNum onWarmupCompleted(RRset rRset, copyStringToBuffer copystringtobuffer, Instant instant) {
        String str;
        List listIAuthTabCallbackStubProxy = rRset.IAuthTabCallbackStubProxy();
        if (listIAuthTabCallbackStubProxy.isEmpty()) {
            new Object[]{rRset.asInterface(), ryzbycx.onWarmupCompleted(rRset.onTransact()), lt54.onNavigationEvent(rRset.onExtraCallback())};
            return new GetCertNum(GetPassword.BOGUS, 10, R.onExtraCallbackWithResult("validate.bogus.missingsig_named", rRset.asInterface(), lt54.onNavigationEvent(rRset.onExtraCallback())));
        }
        Iterator it = listIAuthTabCallbackStubProxy.iterator();
        HookTool.onWarmupCompleted e = null;
        int i = 0;
        while (true) {
            int i2 = 6;
            if (it.hasNext()) {
                RRSIGRecord rRSIGRecord = (RRSIGRecord) it.next();
                if (rRSIGRecord.onNavigationEvent() == copystringtobuffer.onExtraCallbackWithResult()) {
                    i++;
                    try {
                        HookTool.IAuthTabCallback(rRset, rRSIGRecord, copystringtobuffer, instant);
                        return new GetCertNum(GetPassword.SECURE, -1, null);
                    } catch (HookTool.onWarmupCompleted e2) {
                        e = e2;
                        new Object[]{rRset.asInterface(), ryzbycx.onWarmupCompleted(rRset.onTransact()), lt54.onNavigationEvent(rRset.onExtraCallback()), Integer.valueOf(rRSIGRecord.onNavigationEvent()), e};
                        if (i > this.onWarmupCompleted) {
                            new Object[]{rRset.asInterface(), ryzbycx.onWarmupCompleted(rRset.onTransact()), lt54.onNavigationEvent(rRset.onExtraCallback())};
                            return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("validate.bogus.rrsigtoomany", rRset.asInterface(), lt54.onNavigationEvent(rRset.onExtraCallback())));
                        }
                    }
                }
            } else {
                new Object[]{rRset.asInterface(), ryzbycx.onWarmupCompleted(rRset.onTransact()), lt54.onNavigationEvent(rRset.onExtraCallback())};
                if (i == 0) {
                    i2 = 9;
                    str = "dnskey.no_ds_match";
                } else if (e instanceof HookTool.asBinder) {
                    i2 = 7;
                    str = "dnskey.expired";
                } else if (!(e instanceof HookTool.IAuthTabCallbackDefault)) {
                    str = "dnskey.invalid";
                } else {
                    i2 = 8;
                    str = "dnskey.not_yet_valid";
                }
                return new GetCertNum(GetPassword.BOGUS, i2, R.onExtraCallbackWithResult(str, new Object[0]));
            }
        }
    }
}
