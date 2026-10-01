package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import o.UST_TRANS_Finalize;
import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCACert {
    private static final Map<String, String> onWarmupCompleted;
    protected final getCertCPS IAuthTabCallback;
    private final getRootCACert<getBSignPriKeyForRecovery> IAuthTabCallbackDefault;
    private getBSignPriKeyForRecovery asBinder;
    private Cert onExtraCallback;
    private final getRootCACert<UST_TRANS_V2_SendReceiverInfo> onExtraCallbackWithResult;
    private getBSignPriKeyCCFPH onNavigationEvent;

    static {
        HashMap map = new HashMap();
        onWarmupCompleted = map;
        map.put("!", "!");
        map.put("!!", "tag:yaml.org,2002:");
    }

    public getCACert(getBSignPriKeyPH getbsignprikeyph, UST_TRANS_Init uST_TRANS_Init) {
        this(new getCertType(getbsignprikeyph, uST_TRANS_Init));
    }

    public getCACert(getCertCPS getcertcps) {
        this.IAuthTabCallback = getcertcps;
        this.onExtraCallback = null;
        this.onNavigationEvent = new getBSignPriKeyCCFPH(null, new HashMap(onWarmupCompleted));
        this.IAuthTabCallbackDefault = new getRootCACert<>(100);
        this.onExtraCallbackWithResult = new getRootCACert<>(10);
        this.asBinder = new ICustomTabsCallbackStubProxy();
    }

    public Cert onExtraCallback() {
        getBSignPriKeyForRecovery getbsignprikeyforrecovery;
        if (this.onExtraCallback == null && (getbsignprikeyforrecovery = this.asBinder) != null) {
            this.onExtraCallback = getbsignprikeyforrecovery.onWarmupCompleted();
        }
        return this.onExtraCallback;
    }

    public Cert onWarmupCompleted() {
        onExtraCallback();
        Cert cert = this.onExtraCallback;
        this.onExtraCallback = null;
        return cert;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UST_TRNAS_Password_GenOut onExtraCallbackWithResult(getDateOfSignPrikey getdateofsignprikey) {
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoAsBinder = getdateofsignprikey.asBinder();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub = getdateofsignprikey.IAuthTabCallbackStub();
        return new UST_TRNAS_Password_GenOut(getdateofsignprikey.onExtraCallback(), getdateofsignprikey.IAuthTabCallback(), uST_TRANS_V2_SendReceiverInfoAsBinder, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub);
    }

    class ICustomTabsCallbackStubProxy implements getBSignPriKeyForRecovery {
        private ICustomTabsCallbackStubProxy() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getPublicKeyAlgorithm getpublickeyalgorithm = (getPublicKeyAlgorithm) getCACert.this.IAuthTabCallback.onExtraCallback();
            getAuthorityKeyIdentifierInfo getauthoritykeyidentifierinfo = new getAuthorityKeyIdentifierInfo(getpublickeyalgorithm.asBinder(), getpublickeyalgorithm.IAuthTabCallbackStub());
            getCACert getcacert = getCACert.this;
            getcacert.asBinder = new onPostMessage();
            return getauthoritykeyidentifierinfo;
        }
    }

    class onPostMessage implements getBSignPriKeyForRecovery {
        private onPostMessage() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new onPostMessage();
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Directive, getOCSPAddress.onWarmupCompleted.DocumentStart, getOCSPAddress.onWarmupCompleted.StreamEnd)) {
                UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoAsBinder = getCACert.this.IAuthTabCallback.onWarmupCompleted().asBinder();
                getM_nDeviceOS getm_ndeviceos = new getM_nDeviceOS(uST_TRANS_V2_SendReceiverInfoAsBinder, uST_TRANS_V2_SendReceiverInfoAsBinder, false, null, null);
                getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new IAuthTabCallbackStubProxy());
                getCACert getcacert3 = getCACert.this;
                getcacert3.asBinder = new IAuthTabCallbackDefault();
                return getm_ndeviceos;
            }
            return new getInterfaceDescriptor().onWarmupCompleted();
        }
    }

    class getInterfaceDescriptor implements getBSignPriKeyForRecovery {
        private getInterfaceDescriptor() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            while (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.DocumentEnd)) {
                getCACert.this.IAuthTabCallback.onExtraCallback();
            }
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.StreamEnd)) {
                getCACert.this.IAuthTabCallback.IAuthTabCallback();
                UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoAsBinder = getCACert.this.IAuthTabCallback.onWarmupCompleted().asBinder();
                getBSignPriKeyCCFPH getbsignprikeyccfphIAuthTabCallback = getCACert.this.IAuthTabCallback();
                while (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                    getCACert.this.IAuthTabCallback.onExtraCallback();
                }
                if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.StreamEnd)) {
                    if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.DocumentStart)) {
                        throw new getBSignPriKeyCCFBPH(null, null, "expected '<document start>', but found '" + getCACert.this.IAuthTabCallback.onWarmupCompleted().onWarmupCompleted() + "'", getCACert.this.IAuthTabCallback.onWarmupCompleted().asBinder());
                    }
                    getM_nDeviceOS getm_ndeviceos = new getM_nDeviceOS(uST_TRANS_V2_SendReceiverInfoAsBinder, getCACert.this.IAuthTabCallback.onExtraCallback().IAuthTabCallbackStub(), true, getbsignprikeyccfphIAuthTabCallback.onWarmupCompleted(), getbsignprikeyccfphIAuthTabCallback.onNavigationEvent());
                    getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new IAuthTabCallbackStubProxy());
                    getCACert getcacert = getCACert.this;
                    getcacert.asBinder = new asBinder();
                    return getm_ndeviceos;
                }
            }
            getPublicKeyInfo getpublickeyinfo = (getPublicKeyInfo) getCACert.this.IAuthTabCallback.onExtraCallback();
            getBKMCert getbkmcert = new getBKMCert(getpublickeyinfo.asBinder(), getpublickeyinfo.IAuthTabCallbackStub());
            if (getCACert.this.IAuthTabCallbackDefault.onNavigationEvent()) {
                if (getCACert.this.onExtraCallbackWithResult.onNavigationEvent()) {
                    getCACert.this.asBinder = null;
                    return getbkmcert;
                }
                throw new UST_TRANS_V2_Init("Unexpected end of stream. Marks left: " + getCACert.this.onExtraCallbackWithResult);
            }
            throw new UST_TRANS_V2_Init("Unexpected end of stream. States left: " + getCACert.this.IAuthTabCallbackDefault);
        }
    }

    class IAuthTabCallbackStubProxy implements getBSignPriKeyForRecovery {
        private IAuthTabCallbackStubProxy() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            boolean z;
            UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub;
            UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoAsBinder = getCACert.this.IAuthTabCallback.onWarmupCompleted().asBinder();
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.DocumentEnd)) {
                uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub = getCACert.this.IAuthTabCallback.onExtraCallback().IAuthTabCallbackStub();
                z = true;
            } else {
                z = false;
                uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub = uST_TRANS_V2_SendReceiverInfoAsBinder;
            }
            getM_deviceName getm_devicename = new getM_deviceName(uST_TRANS_V2_SendReceiverInfoAsBinder, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub, z);
            getCACert getcacert = getCACert.this;
            getcacert.asBinder = new getInterfaceDescriptor();
            return getm_devicename;
        }
    }

    class asBinder implements getBSignPriKeyForRecovery {
        private asBinder() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new asBinder();
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Directive, getOCSPAddress.onWarmupCompleted.DocumentStart, getOCSPAddress.onWarmupCompleted.DocumentEnd, getOCSPAddress.onWarmupCompleted.StreamEnd)) {
                getCACert getcacert3 = getCACert.this;
                Cert certOnExtraCallbackWithResult = getcacert3.onExtraCallbackWithResult(getcacert3.IAuthTabCallback.onWarmupCompleted().asBinder());
                getCACert getcacert4 = getCACert.this;
                getcacert4.asBinder = (getBSignPriKeyForRecovery) getcacert4.IAuthTabCallbackDefault.onWarmupCompleted();
                return certOnExtraCallbackWithResult;
            }
            return new IAuthTabCallbackDefault().onWarmupCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getBSignPriKeyCCFPH IAuthTabCallback() {
        HashMap map = new HashMap(this.onNavigationEvent.onNavigationEvent());
        Iterator<String> it = onWarmupCompleted.keySet().iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        this.onNavigationEvent = new getBSignPriKeyCCFPH(null, map);
        while (this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Directive)) {
            getKMPrikeyCCFFHFilename getkmprikeyccffhfilename = (getKMPrikeyCCFFHFilename) this.IAuthTabCallback.onExtraCallback();
            if (getkmprikeyccffhfilename.onNavigationEvent().equals("YAML")) {
                if (this.onNavigationEvent.onWarmupCompleted() != null) {
                    throw new getBSignPriKeyCCFBPH(null, null, "found duplicate YAML directive", getkmprikeyccffhfilename.asBinder());
                }
                List listOnExtraCallbackWithResult = getkmprikeyccffhfilename.onExtraCallbackWithResult();
                if (((Integer) listOnExtraCallbackWithResult.get(0)).intValue() != 1) {
                    throw new getBSignPriKeyCCFBPH(null, null, "found incompatible YAML document (version 1.* is required)", getkmprikeyccffhfilename.asBinder());
                }
                if (((Integer) listOnExtraCallbackWithResult.get(1)).intValue() == 0) {
                    this.onNavigationEvent = new getBSignPriKeyCCFPH(UST_TRANS_Finalize.onWarmupCompleted.V1_0, map);
                } else {
                    this.onNavigationEvent = new getBSignPriKeyCCFPH(UST_TRANS_Finalize.onWarmupCompleted.V1_1, map);
                }
            } else if (getkmprikeyccffhfilename.onNavigationEvent().equals("TAG")) {
                List listOnExtraCallbackWithResult2 = getkmprikeyccffhfilename.onExtraCallbackWithResult();
                String str = (String) listOnExtraCallbackWithResult2.get(0);
                String str2 = (String) listOnExtraCallbackWithResult2.get(1);
                if (map.containsKey(str)) {
                    throw new getBSignPriKeyCCFBPH(null, null, "duplicate tag handle " + str, getkmprikeyccffhfilename.asBinder());
                }
                map.put(str, str2);
            } else {
                continue;
            }
        }
        HashMap map2 = new HashMap();
        if (!map.isEmpty()) {
            map2 = new HashMap(map);
        }
        for (String str3 : onWarmupCompleted.keySet()) {
            if (!map.containsKey(str3)) {
                map.put(str3, onWarmupCompleted.get(str3));
            }
        }
        return new getBSignPriKeyCCFPH(this.onNavigationEvent.onWarmupCompleted(), map2);
    }

    class IAuthTabCallbackDefault implements getBSignPriKeyForRecovery {
        private IAuthTabCallbackDefault() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            return getCACert.this.onExtraCallback(true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Cert onNavigationEvent() {
        return onExtraCallback(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Cert onExtraCallbackWithResult() {
        return onExtraCallback(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Cert onExtraCallback(boolean z, boolean z2) {
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoAsBinder;
        getPublicKeyAlgorithmType getpublickeyalgorithmtypeOnNavigationEvent;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub;
        String str;
        String strOnNavigationEvent;
        String str2;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoAsBinder2;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2;
        getM_nTransType getm_ntranstype;
        if (this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Alias)) {
            getDateOfFile getdateoffile = (getDateOfFile) this.IAuthTabCallback.onExtraCallback();
            UST_TRANS_V2_IsReceiverConnected uST_TRANS_V2_IsReceiverConnected = new UST_TRANS_V2_IsReceiverConnected(getdateoffile.onExtraCallback(), getdateoffile.asBinder(), getdateoffile.IAuthTabCallbackStub());
            this.asBinder = this.IAuthTabCallbackDefault.onWarmupCompleted();
            return uST_TRANS_V2_IsReceiverConnected;
        }
        getCertCPS getcertcps = this.IAuthTabCallback;
        getOCSPAddress.onWarmupCompleted onwarmupcompleted = getOCSPAddress.onWarmupCompleted.Anchor;
        if (getcertcps.onNavigationEvent(onwarmupcompleted)) {
            getDateOfKMPrikey getdateofkmprikey = (getDateOfKMPrikey) this.IAuthTabCallback.onExtraCallback();
            uST_TRANS_V2_SendReceiverInfoAsBinder = getdateofkmprikey.asBinder();
            UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub2 = getdateofkmprikey.IAuthTabCallbackStub();
            String strOnNavigationEvent2 = getdateofkmprikey.onNavigationEvent();
            if (this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Tag)) {
                getKeyUsage getkeyusage = (getKeyUsage) this.IAuthTabCallback.onExtraCallback();
                UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoAsBinder3 = getkeyusage.asBinder();
                UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub3 = getkeyusage.IAuthTabCallbackStub();
                getpublickeyalgorithmtypeOnNavigationEvent = getkeyusage.onNavigationEvent();
                str = strOnNavigationEvent2;
                uST_TRANS_V2_SendReceiverInfo = uST_TRANS_V2_SendReceiverInfoAsBinder3;
                uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub = uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub3;
            } else {
                str = strOnNavigationEvent2;
                uST_TRANS_V2_SendReceiverInfo = null;
                uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub = uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub2;
                getpublickeyalgorithmtypeOnNavigationEvent = null;
            }
        } else if (this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Tag)) {
            getKeyUsage getkeyusage2 = (getKeyUsage) this.IAuthTabCallback.onExtraCallback();
            UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoAsBinder4 = getkeyusage2.asBinder();
            uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub = getkeyusage2.IAuthTabCallbackStub();
            getPublicKeyAlgorithmType getpublickeyalgorithmtypeOnNavigationEvent2 = getkeyusage2.onNavigationEvent();
            if (this.IAuthTabCallback.onNavigationEvent(onwarmupcompleted)) {
                getDateOfKMPrikey getdateofkmprikey2 = (getDateOfKMPrikey) this.IAuthTabCallback.onExtraCallback();
                uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub = getdateofkmprikey2.IAuthTabCallbackStub();
                strOnNavigationEvent = getdateofkmprikey2.onNavigationEvent();
            } else {
                strOnNavigationEvent = null;
            }
            str = strOnNavigationEvent;
            uST_TRANS_V2_SendReceiverInfoAsBinder = uST_TRANS_V2_SendReceiverInfoAsBinder4;
            getpublickeyalgorithmtypeOnNavigationEvent = getpublickeyalgorithmtypeOnNavigationEvent2;
            uST_TRANS_V2_SendReceiverInfo = uST_TRANS_V2_SendReceiverInfoAsBinder;
        } else {
            uST_TRANS_V2_SendReceiverInfo = null;
            uST_TRANS_V2_SendReceiverInfoAsBinder = null;
            getpublickeyalgorithmtypeOnNavigationEvent = null;
            uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub = null;
            str = null;
        }
        if (getpublickeyalgorithmtypeOnNavigationEvent != null) {
            String strOnExtraCallback = getpublickeyalgorithmtypeOnNavigationEvent.onExtraCallback();
            String strIAuthTabCallback = getpublickeyalgorithmtypeOnNavigationEvent.IAuthTabCallback();
            if (strOnExtraCallback != null) {
                if (!this.onNavigationEvent.onNavigationEvent().containsKey(strOnExtraCallback)) {
                    throw new getBSignPriKeyCCFBPH("while parsing a node", uST_TRANS_V2_SendReceiverInfoAsBinder, "found undefined tag handle " + strOnExtraCallback, uST_TRANS_V2_SendReceiverInfo);
                }
                strIAuthTabCallback = this.onNavigationEvent.onNavigationEvent().get(strOnExtraCallback) + strIAuthTabCallback;
            }
            str2 = strIAuthTabCallback;
        } else {
            str2 = null;
        }
        if (uST_TRANS_V2_SendReceiverInfoAsBinder == null) {
            uST_TRANS_V2_SendReceiverInfoAsBinder2 = this.IAuthTabCallback.onWarmupCompleted().asBinder();
            uST_TRANS_V2_SendReceiverInfo2 = uST_TRANS_V2_SendReceiverInfoAsBinder2;
        } else {
            uST_TRANS_V2_SendReceiverInfoAsBinder2 = uST_TRANS_V2_SendReceiverInfoAsBinder;
            uST_TRANS_V2_SendReceiverInfo2 = uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub;
        }
        boolean z3 = str2 == null || str2.equals("!");
        if (z2 && this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockEntry)) {
            getBKMPriKeyCCFBFH getbkmprikeyccfbfh = new getBKMPriKeyCCFBFH(str, str2, z3, uST_TRANS_V2_SendReceiverInfoAsBinder2, this.IAuthTabCallback.onWarmupCompleted().IAuthTabCallbackStub(), UST_TRANS_Finalize.onExtraCallbackWithResult.BLOCK);
            this.asBinder = new onMessageChannelReady();
            return getbkmprikeyccfbfh;
        }
        if (this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Scalar)) {
            getKMPrikeyCCFPHFilename getkmprikeyccfphfilename = (getKMPrikeyCCFPHFilename) this.IAuthTabCallback.onExtraCallback();
            UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub4 = getkmprikeyccfphfilename.IAuthTabCallbackStub();
            if ((getkmprikeyccfphfilename.IAuthTabCallback() && str2 == null) || "!".equals(str2)) {
                getm_ntranstype = new getM_nTransType(true, false);
            } else if (str2 == null) {
                getm_ntranstype = new getM_nTransType(false, true);
            } else {
                getm_ntranstype = new getM_nTransType(false, false);
            }
            getBKMPriKeyCCFBPH getbkmprikeyccfbph = new getBKMPriKeyCCFBPH(str, str2, getm_ntranstype, getkmprikeyccfphfilename.onExtraCallbackWithResult(), uST_TRANS_V2_SendReceiverInfoAsBinder2, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackStub4, getkmprikeyccfphfilename.onNavigationEvent());
            this.asBinder = this.IAuthTabCallbackDefault.onWarmupCompleted();
            return getbkmprikeyccfbph;
        }
        if (this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.FlowSequenceStart)) {
            getBKMPriKeyCCFBFH getbkmprikeyccfbfh2 = new getBKMPriKeyCCFBFH(str, str2, z3, uST_TRANS_V2_SendReceiverInfoAsBinder2, this.IAuthTabCallback.onWarmupCompleted().IAuthTabCallbackStub(), UST_TRANS_Finalize.onExtraCallbackWithResult.FLOW);
            this.asBinder = new onActivityLayout();
            return getbkmprikeyccfbfh2;
        }
        if (this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.FlowMappingStart)) {
            getAuthorityKeyIdentifier getauthoritykeyidentifier = new getAuthorityKeyIdentifier(str, str2, z3, uST_TRANS_V2_SendReceiverInfoAsBinder2, this.IAuthTabCallback.onWarmupCompleted().IAuthTabCallbackStub(), UST_TRANS_Finalize.onExtraCallbackWithResult.FLOW);
            this.asBinder = new IAuthTabCallback_Parcel();
            return getauthoritykeyidentifier;
        }
        if (z && this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockSequenceStart)) {
            getBKMPriKeyCCFBFH getbkmprikeyccfbfh3 = new getBKMPriKeyCCFBFH(str, str2, z3, uST_TRANS_V2_SendReceiverInfoAsBinder2, this.IAuthTabCallback.onWarmupCompleted().asBinder(), UST_TRANS_Finalize.onExtraCallbackWithResult.BLOCK);
            this.asBinder = new onTransact();
            return getbkmprikeyccfbfh3;
        }
        if (z && this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockMappingStart)) {
            getAuthorityKeyIdentifier getauthoritykeyidentifier2 = new getAuthorityKeyIdentifier(str, str2, z3, uST_TRANS_V2_SendReceiverInfoAsBinder2, this.IAuthTabCallback.onWarmupCompleted().asBinder(), UST_TRANS_Finalize.onExtraCallbackWithResult.BLOCK);
            this.asBinder = new IAuthTabCallback();
            return getauthoritykeyidentifier2;
        }
        if (str != null || str2 != null) {
            getBKMPriKeyCCFBPH getbkmprikeyccfbph2 = new getBKMPriKeyCCFBPH(str, str2, new getM_nTransType(z3, false), BuildConfig.FLAVOR, uST_TRANS_V2_SendReceiverInfoAsBinder2, uST_TRANS_V2_SendReceiverInfo2, UST_TRANS_Finalize.onExtraCallback.PLAIN);
            this.asBinder = this.IAuthTabCallbackDefault.onWarmupCompleted();
            return getbkmprikeyccfbph2;
        }
        getOCSPAddress getocspaddressOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
        StringBuilder sb = new StringBuilder();
        sb.append("while parsing a ");
        sb.append(z ? "block" : "flow");
        sb.append(" node");
        throw new getBSignPriKeyCCFBPH(sb.toString(), uST_TRANS_V2_SendReceiverInfoAsBinder2, "expected the node content, but found '" + getocspaddressOnWarmupCompleted.onWarmupCompleted() + "'", getocspaddressOnWarmupCompleted.asBinder());
    }

    class onTransact implements getBSignPriKeyForRecovery {
        private onTransact() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCACert.this.onExtraCallbackWithResult.onWarmupCompleted(getCACert.this.IAuthTabCallback.onExtraCallback().asBinder());
            return new IAuthTabCallbackStub().onWarmupCompleted();
        }
    }

    class IAuthTabCallbackStub implements getBSignPriKeyForRecovery {
        private IAuthTabCallbackStub() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new IAuthTabCallbackStub();
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockEntry)) {
                return getCACert.this.new asInterface((getEncType) getCACert.this.IAuthTabCallback.onExtraCallback()).onWarmupCompleted();
            }
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockEnd)) {
                getOCSPAddress getocspaddressOnWarmupCompleted = getCACert.this.IAuthTabCallback.onWarmupCompleted();
                throw new getBSignPriKeyCCFBPH("while parsing a block collection", (UST_TRANS_V2_SendReceiverInfo) getCACert.this.onExtraCallbackWithResult.onWarmupCompleted(), "expected <block end>, but found '" + getocspaddressOnWarmupCompleted.onWarmupCompleted() + "'", getocspaddressOnWarmupCompleted.asBinder());
            }
            getOCSPAddress getocspaddressOnExtraCallback = getCACert.this.IAuthTabCallback.onExtraCallback();
            getBKMPriKey getbkmprikey = new getBKMPriKey(getocspaddressOnExtraCallback.asBinder(), getocspaddressOnExtraCallback.IAuthTabCallbackStub());
            getCACert getcacert3 = getCACert.this;
            getcacert3.asBinder = (getBSignPriKeyForRecovery) getcacert3.IAuthTabCallbackDefault.onWarmupCompleted();
            getCACert.this.onExtraCallbackWithResult.onWarmupCompleted();
            return getbkmprikey;
        }
    }

    class asInterface implements getBSignPriKeyForRecovery {
        getEncType IAuthTabCallback;

        public asInterface(getEncType getenctype) {
            this.IAuthTabCallback = getenctype;
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new asInterface(this.IAuthTabCallback);
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockEntry, getOCSPAddress.onWarmupCompleted.BlockEnd)) {
                getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new IAuthTabCallbackStub());
                return new IAuthTabCallbackDefault().onWarmupCompleted();
            }
            getCACert getcacert3 = getCACert.this;
            getcacert3.asBinder = new IAuthTabCallbackStub();
            return getCACert.this.onExtraCallbackWithResult(this.IAuthTabCallback.IAuthTabCallbackStub());
        }
    }

    class onMessageChannelReady implements getBSignPriKeyForRecovery {
        private onMessageChannelReady() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new onMessageChannelReady();
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockEntry)) {
                return getCACert.this.new onMinimized((getEncType) getCACert.this.IAuthTabCallback.onExtraCallback()).onWarmupCompleted();
            }
            getOCSPAddress getocspaddressOnWarmupCompleted = getCACert.this.IAuthTabCallback.onWarmupCompleted();
            getBKMPriKey getbkmprikey = new getBKMPriKey(getocspaddressOnWarmupCompleted.asBinder(), getocspaddressOnWarmupCompleted.IAuthTabCallbackStub());
            getCACert getcacert3 = getCACert.this;
            getcacert3.asBinder = (getBSignPriKeyForRecovery) getcacert3.IAuthTabCallbackDefault.onWarmupCompleted();
            return getbkmprikey;
        }
    }

    class onMinimized implements getBSignPriKeyForRecovery {
        getEncType onWarmupCompleted;

        public onMinimized(getEncType getenctype) {
            this.onWarmupCompleted = getenctype;
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new onMinimized(this.onWarmupCompleted);
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockEntry, getOCSPAddress.onWarmupCompleted.Key, getOCSPAddress.onWarmupCompleted.Value, getOCSPAddress.onWarmupCompleted.BlockEnd)) {
                getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new onMessageChannelReady());
                return new IAuthTabCallbackDefault().onWarmupCompleted();
            }
            getCACert getcacert3 = getCACert.this;
            getcacert3.asBinder = new onMessageChannelReady();
            return getCACert.this.onExtraCallbackWithResult(this.onWarmupCompleted.IAuthTabCallbackStub());
        }
    }

    class IAuthTabCallback implements getBSignPriKeyForRecovery {
        private IAuthTabCallback() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCACert.this.onExtraCallbackWithResult.onWarmupCompleted(getCACert.this.IAuthTabCallback.onExtraCallback().asBinder());
            return new onNavigationEvent().onWarmupCompleted();
        }
    }

    class onNavigationEvent implements getBSignPriKeyForRecovery {
        private onNavigationEvent() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new onNavigationEvent();
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            getCertCPS getcertcps = getCACert.this.IAuthTabCallback;
            getOCSPAddress.onWarmupCompleted onwarmupcompleted = getOCSPAddress.onWarmupCompleted.Key;
            if (getcertcps.onNavigationEvent(onwarmupcompleted)) {
                getOCSPAddress getocspaddressOnExtraCallback = getCACert.this.IAuthTabCallback.onExtraCallback();
                if (!getCACert.this.IAuthTabCallback.onNavigationEvent(onwarmupcompleted, getOCSPAddress.onWarmupCompleted.Value, getOCSPAddress.onWarmupCompleted.BlockEnd)) {
                    getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new onExtraCallback());
                    return getCACert.this.onExtraCallbackWithResult();
                }
                getCACert getcacert3 = getCACert.this;
                getcacert3.asBinder = new onExtraCallback();
                return getCACert.this.onExtraCallbackWithResult(getocspaddressOnExtraCallback.IAuthTabCallbackStub());
            }
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.BlockEnd)) {
                getOCSPAddress getocspaddressOnWarmupCompleted = getCACert.this.IAuthTabCallback.onWarmupCompleted();
                throw new getBSignPriKeyCCFBPH("while parsing a block mapping", (UST_TRANS_V2_SendReceiverInfo) getCACert.this.onExtraCallbackWithResult.onWarmupCompleted(), "expected <block end>, but found '" + getocspaddressOnWarmupCompleted.onWarmupCompleted() + "'", getocspaddressOnWarmupCompleted.asBinder());
            }
            getOCSPAddress getocspaddressOnExtraCallback2 = getCACert.this.IAuthTabCallback.onExtraCallback();
            finalizeCert finalizecert = new finalizeCert(getocspaddressOnExtraCallback2.asBinder(), getocspaddressOnExtraCallback2.IAuthTabCallbackStub());
            getCACert getcacert4 = getCACert.this;
            getcacert4.asBinder = (getBSignPriKeyForRecovery) getcacert4.IAuthTabCallbackDefault.onWarmupCompleted();
            getCACert.this.onExtraCallbackWithResult.onWarmupCompleted();
            return finalizecert;
        }
    }

    class onExtraCallback implements getBSignPriKeyForRecovery {
        private onExtraCallback() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCertCPS getcertcps = getCACert.this.IAuthTabCallback;
            getOCSPAddress.onWarmupCompleted onwarmupcompleted = getOCSPAddress.onWarmupCompleted.Value;
            if (getcertcps.onNavigationEvent(onwarmupcompleted)) {
                getOCSPAddress getocspaddressOnExtraCallback = getCACert.this.IAuthTabCallback.onExtraCallback();
                if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                    getCACert getcacert = getCACert.this;
                    getcacert.asBinder = new onWarmupCompleted();
                    return getCACert.this.asBinder.onWarmupCompleted();
                }
                if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Key, onwarmupcompleted, getOCSPAddress.onWarmupCompleted.BlockEnd)) {
                    getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new onNavigationEvent());
                    return getCACert.this.onExtraCallbackWithResult();
                }
                getCACert getcacert2 = getCACert.this;
                getcacert2.asBinder = new onNavigationEvent();
                return getCACert.this.onExtraCallbackWithResult(getocspaddressOnExtraCallback.IAuthTabCallbackStub());
            }
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Scalar)) {
                getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new onNavigationEvent());
                return getCACert.this.onExtraCallbackWithResult();
            }
            getCACert getcacert3 = getCACert.this;
            getcacert3.asBinder = new onNavigationEvent();
            return getCACert.this.onExtraCallbackWithResult(getCACert.this.IAuthTabCallback.onWarmupCompleted().asBinder());
        }
    }

    class onWarmupCompleted implements getBSignPriKeyForRecovery {
        List<getDateOfSignPrikey> IAuthTabCallback;

        private onWarmupCompleted() {
            this.IAuthTabCallback = new LinkedList();
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                this.IAuthTabCallback.add((getDateOfSignPrikey) getCACert.this.IAuthTabCallback.onExtraCallback());
                return onWarmupCompleted();
            }
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Key, getOCSPAddress.onWarmupCompleted.Value, getOCSPAddress.onWarmupCompleted.BlockEnd)) {
                if (!this.IAuthTabCallback.isEmpty()) {
                    return getCACert.this.onExtraCallbackWithResult(this.IAuthTabCallback.remove(0));
                }
                getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new onNavigationEvent());
                return getCACert.this.onExtraCallbackWithResult();
            }
            getCACert getcacert = getCACert.this;
            getcacert.asBinder = getcacert.new onExtraCallbackWithResult(this.IAuthTabCallback);
            getCACert getcacert2 = getCACert.this;
            return getcacert2.onExtraCallbackWithResult(getcacert2.IAuthTabCallback.onWarmupCompleted().asBinder());
        }
    }

    class onExtraCallbackWithResult implements getBSignPriKeyForRecovery {
        List<getDateOfSignPrikey> onExtraCallback;

        public onExtraCallbackWithResult(List<getDateOfSignPrikey> list) {
            this.onExtraCallback = list;
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (!this.onExtraCallback.isEmpty()) {
                return getCACert.this.onExtraCallbackWithResult(this.onExtraCallback.remove(0));
            }
            return new onNavigationEvent().onWarmupCompleted();
        }
    }

    class onActivityLayout implements getBSignPriKeyForRecovery {
        private onActivityLayout() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCACert.this.onExtraCallbackWithResult.onWarmupCompleted(getCACert.this.IAuthTabCallback.onExtraCallback().asBinder());
            return getCACert.this.new extraCallback(true).onWarmupCompleted();
        }
    }

    class extraCallback implements getBSignPriKeyForRecovery {
        private final boolean IAuthTabCallback;

        public extraCallback(boolean z) {
            this.IAuthTabCallback = z;
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCertCPS getcertcps = getCACert.this.IAuthTabCallback;
            getOCSPAddress.onWarmupCompleted onwarmupcompleted = getOCSPAddress.onWarmupCompleted.Comment;
            if (getcertcps.onNavigationEvent(onwarmupcompleted)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new extraCallback(this.IAuthTabCallback);
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            getCertCPS getcertcps2 = getCACert.this.IAuthTabCallback;
            getOCSPAddress.onWarmupCompleted onwarmupcompleted2 = getOCSPAddress.onWarmupCompleted.FlowSequenceEnd;
            if (!getcertcps2.onNavigationEvent(onwarmupcompleted2)) {
                if (!this.IAuthTabCallback) {
                    if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.FlowEntry)) {
                        getCACert.this.IAuthTabCallback.onExtraCallback();
                        if (getCACert.this.IAuthTabCallback.onNavigationEvent(onwarmupcompleted)) {
                            getCACert getcacert3 = getCACert.this;
                            getcacert3.asBinder = getcacert3.new extraCallback(true);
                            getCACert getcacert4 = getCACert.this;
                            return getcacert4.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert4.IAuthTabCallback.onExtraCallback());
                        }
                    } else {
                        getOCSPAddress getocspaddressOnWarmupCompleted = getCACert.this.IAuthTabCallback.onWarmupCompleted();
                        throw new getBSignPriKeyCCFBPH("while parsing a flow sequence", (UST_TRANS_V2_SendReceiverInfo) getCACert.this.onExtraCallbackWithResult.onWarmupCompleted(), "expected ',' or ']', but got " + getocspaddressOnWarmupCompleted.onWarmupCompleted(), getocspaddressOnWarmupCompleted.asBinder());
                    }
                }
                if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Key)) {
                    getOCSPAddress getocspaddressOnWarmupCompleted2 = getCACert.this.IAuthTabCallback.onWarmupCompleted();
                    getAuthorityKeyIdentifier getauthoritykeyidentifier = new getAuthorityKeyIdentifier(null, null, true, getocspaddressOnWarmupCompleted2.asBinder(), getocspaddressOnWarmupCompleted2.IAuthTabCallbackStub(), UST_TRANS_Finalize.onExtraCallbackWithResult.FLOW);
                    getCACert getcacert5 = getCACert.this;
                    getcacert5.asBinder = new ICustomTabsCallback();
                    return getauthoritykeyidentifier;
                }
                if (!getCACert.this.IAuthTabCallback.onNavigationEvent(onwarmupcompleted2)) {
                    getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(getCACert.this.new extraCallback(false));
                    return getCACert.this.onNavigationEvent();
                }
            }
            getOCSPAddress getocspaddressOnExtraCallback = getCACert.this.IAuthTabCallback.onExtraCallback();
            getBKMPriKey getbkmprikey = new getBKMPriKey(getocspaddressOnExtraCallback.asBinder(), getocspaddressOnExtraCallback.IAuthTabCallbackStub());
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(onwarmupcompleted)) {
                getCACert getcacert6 = getCACert.this;
                getcacert6.asBinder = (getBSignPriKeyForRecovery) getcacert6.IAuthTabCallbackDefault.onWarmupCompleted();
            } else {
                getCACert getcacert7 = getCACert.this;
                getcacert7.asBinder = new access000();
            }
            getCACert.this.onExtraCallbackWithResult.onWarmupCompleted();
            return getbkmprikey;
        }
    }

    class access000 implements getBSignPriKeyForRecovery {
        private access000() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCACert getcacert = getCACert.this;
            UST_TRNAS_Password_GenOut uST_TRNAS_Password_GenOutOnExtraCallbackWithResult = getcacert.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert.IAuthTabCallback.onExtraCallback());
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Comment)) {
                getCACert getcacert2 = getCACert.this;
                getcacert2.asBinder = (getBSignPriKeyForRecovery) getcacert2.IAuthTabCallbackDefault.onWarmupCompleted();
            }
            return uST_TRNAS_Password_GenOutOnExtraCallbackWithResult;
        }
    }

    class ICustomTabsCallback implements getBSignPriKeyForRecovery {
        private ICustomTabsCallback() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getOCSPAddress getocspaddressOnExtraCallback = getCACert.this.IAuthTabCallback.onExtraCallback();
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Value, getOCSPAddress.onWarmupCompleted.FlowEntry, getOCSPAddress.onWarmupCompleted.FlowSequenceEnd)) {
                getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new onActivityResized());
                return getCACert.this.onNavigationEvent();
            }
            getCACert getcacert = getCACert.this;
            getcacert.asBinder = new onActivityResized();
            return getCACert.this.onExtraCallbackWithResult(getocspaddressOnExtraCallback.IAuthTabCallbackStub());
        }
    }

    class onActivityResized implements getBSignPriKeyForRecovery {
        private onActivityResized() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Value)) {
                getOCSPAddress getocspaddressOnExtraCallback = getCACert.this.IAuthTabCallback.onExtraCallback();
                if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.FlowEntry, getOCSPAddress.onWarmupCompleted.FlowSequenceEnd)) {
                    getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new readTypedObject());
                    return getCACert.this.onNavigationEvent();
                }
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = new readTypedObject();
                return getCACert.this.onExtraCallbackWithResult(getocspaddressOnExtraCallback.IAuthTabCallbackStub());
            }
            getCACert getcacert2 = getCACert.this;
            getcacert2.asBinder = new readTypedObject();
            return getCACert.this.onExtraCallbackWithResult(getCACert.this.IAuthTabCallback.onWarmupCompleted().asBinder());
        }
    }

    class readTypedObject implements getBSignPriKeyForRecovery {
        private readTypedObject() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCACert getcacert = getCACert.this;
            getcacert.asBinder = getcacert.new extraCallback(false);
            getOCSPAddress getocspaddressOnWarmupCompleted = getCACert.this.IAuthTabCallback.onWarmupCompleted();
            return new finalizeCert(getocspaddressOnWarmupCompleted.asBinder(), getocspaddressOnWarmupCompleted.IAuthTabCallbackStub());
        }
    }

    class IAuthTabCallback_Parcel implements getBSignPriKeyForRecovery {
        private IAuthTabCallback_Parcel() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCACert.this.onExtraCallbackWithResult.onWarmupCompleted(getCACert.this.IAuthTabCallback.onExtraCallback().asBinder());
            return getCACert.this.new writeTypedObject(true).onWarmupCompleted();
        }
    }

    class writeTypedObject implements getBSignPriKeyForRecovery {
        private final boolean onExtraCallback;

        public writeTypedObject(boolean z) {
            this.onExtraCallback = z;
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCertCPS getcertcps = getCACert.this.IAuthTabCallback;
            getOCSPAddress.onWarmupCompleted onwarmupcompleted = getOCSPAddress.onWarmupCompleted.Comment;
            if (getcertcps.onNavigationEvent(onwarmupcompleted)) {
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new writeTypedObject(this.onExtraCallback);
                getCACert getcacert2 = getCACert.this;
                return getcacert2.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert2.IAuthTabCallback.onExtraCallback());
            }
            getCertCPS getcertcps2 = getCACert.this.IAuthTabCallback;
            getOCSPAddress.onWarmupCompleted onwarmupcompleted2 = getOCSPAddress.onWarmupCompleted.FlowMappingEnd;
            if (!getcertcps2.onNavigationEvent(onwarmupcompleted2)) {
                if (!this.onExtraCallback) {
                    if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.FlowEntry)) {
                        getCACert.this.IAuthTabCallback.onExtraCallback();
                        if (getCACert.this.IAuthTabCallback.onNavigationEvent(onwarmupcompleted)) {
                            getCACert getcacert3 = getCACert.this;
                            getcacert3.asBinder = getcacert3.new writeTypedObject(true);
                            getCACert getcacert4 = getCACert.this;
                            return getcacert4.onExtraCallbackWithResult((getDateOfSignPrikey) getcacert4.IAuthTabCallback.onExtraCallback());
                        }
                    } else {
                        getOCSPAddress getocspaddressOnWarmupCompleted = getCACert.this.IAuthTabCallback.onWarmupCompleted();
                        throw new getBSignPriKeyCCFBPH("while parsing a flow mapping", (UST_TRANS_V2_SendReceiverInfo) getCACert.this.onExtraCallbackWithResult.onWarmupCompleted(), "expected ',' or '}', but got " + getocspaddressOnWarmupCompleted.onWarmupCompleted(), getocspaddressOnWarmupCompleted.asBinder());
                    }
                }
                if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Key)) {
                    getOCSPAddress getocspaddressOnExtraCallback = getCACert.this.IAuthTabCallback.onExtraCallback();
                    if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Value, getOCSPAddress.onWarmupCompleted.FlowEntry, onwarmupcompleted2)) {
                        getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new extraCallbackWithResult());
                        return getCACert.this.onNavigationEvent();
                    }
                    getCACert getcacert5 = getCACert.this;
                    getcacert5.asBinder = new extraCallbackWithResult();
                    return getCACert.this.onExtraCallbackWithResult(getocspaddressOnExtraCallback.IAuthTabCallbackStub());
                }
                if (!getCACert.this.IAuthTabCallback.onNavigationEvent(onwarmupcompleted2)) {
                    getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(new access100());
                    return getCACert.this.onNavigationEvent();
                }
            }
            getOCSPAddress getocspaddressOnExtraCallback2 = getCACert.this.IAuthTabCallback.onExtraCallback();
            finalizeCert finalizecert = new finalizeCert(getocspaddressOnExtraCallback2.asBinder(), getocspaddressOnExtraCallback2.IAuthTabCallbackStub());
            getCACert.this.onExtraCallbackWithResult.onWarmupCompleted();
            if (!getCACert.this.IAuthTabCallback.onNavigationEvent(onwarmupcompleted)) {
                getCACert getcacert6 = getCACert.this;
                getcacert6.asBinder = (getBSignPriKeyForRecovery) getcacert6.IAuthTabCallbackDefault.onWarmupCompleted();
                return finalizecert;
            }
            getCACert getcacert7 = getCACert.this;
            getcacert7.asBinder = new access000();
            return finalizecert;
        }
    }

    class extraCallbackWithResult implements getBSignPriKeyForRecovery {
        private extraCallbackWithResult() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            if (getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.Value)) {
                getOCSPAddress getocspaddressOnExtraCallback = getCACert.this.IAuthTabCallback.onExtraCallback();
                if (!getCACert.this.IAuthTabCallback.onNavigationEvent(getOCSPAddress.onWarmupCompleted.FlowEntry, getOCSPAddress.onWarmupCompleted.FlowMappingEnd)) {
                    getCACert.this.IAuthTabCallbackDefault.onWarmupCompleted(getCACert.this.new writeTypedObject(false));
                    return getCACert.this.onNavigationEvent();
                }
                getCACert getcacert = getCACert.this;
                getcacert.asBinder = getcacert.new writeTypedObject(false);
                return getCACert.this.onExtraCallbackWithResult(getocspaddressOnExtraCallback.IAuthTabCallbackStub());
            }
            getCACert getcacert2 = getCACert.this;
            getcacert2.asBinder = getcacert2.new writeTypedObject(false);
            return getCACert.this.onExtraCallbackWithResult(getCACert.this.IAuthTabCallback.onWarmupCompleted().asBinder());
        }
    }

    class access100 implements getBSignPriKeyForRecovery {
        private access100() {
        }

        @Override // o.getBSignPriKeyForRecovery
        public Cert onWarmupCompleted() {
            getCACert getcacert = getCACert.this;
            getcacert.asBinder = getcacert.new writeTypedObject(false);
            getCACert getcacert2 = getCACert.this;
            return getcacert2.onExtraCallbackWithResult(getcacert2.IAuthTabCallback.onWarmupCompleted().asBinder());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Cert onExtraCallbackWithResult(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        return new getBKMPriKeyCCFBPH(null, null, new getM_nTransType(true, false), BuildConfig.FLAVOR, uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo, UST_TRANS_Finalize.onExtraCallback.PLAIN);
    }
}
