package o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.sf.scuba.smartcards.BuildConfig;
import o.UST_TRANS_Finalize;
import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCertType implements getCertCPS {
    public static final Map<Character, Integer> IAuthTabCallback;
    public static final Map<Character, String> onExtraCallback;
    private static final Pattern onWarmupCompleted = Pattern.compile("[^0-9A-Fa-f]");
    private final UST_TRANS_Init IAuthTabCallbackStub;
    private final List<getOCSPAddress> IAuthTabCallbackStubProxy;
    private final boolean IAuthTabCallback_Parcel;
    private final getBSignPriKeyPH access000;
    private final Map<Integer, getDateOfKMCert> access100;
    private getOCSPAddress asBinder;
    private final getRootCACert<Integer> asInterface;
    private boolean onNavigationEvent = false;
    private int IAuthTabCallbackDefault = 0;
    private int getInterfaceDescriptor = 0;
    private int onTransact = -1;
    private boolean onExtraCallbackWithResult = true;

    static {
        HashMap map = new HashMap();
        onExtraCallback = map;
        HashMap map2 = new HashMap();
        IAuthTabCallback = map2;
        map.put('0', "\u0000");
        map.put('a', "\u0007");
        map.put('b', "\b");
        map.put('t', "\t");
        map.put('n', "\n");
        map.put('v', "\u000b");
        map.put('f', "\f");
        map.put('r', "\r");
        map.put('e', "\u001b");
        map.put(' ', " ");
        map.put('\"', "\"");
        map.put('\\', "\\");
        map.put('N', "\u0085");
        map.put('_', " ");
        map.put('L', "\u2028");
        map.put('P', "\u2029");
        map2.put('x', 2);
        map2.put('u', 4);
        map2.put('U', 8);
    }

    public getCertType(getBSignPriKeyPH getbsignprikeyph, UST_TRANS_Init uST_TRANS_Init) {
        if (uST_TRANS_Init == null) {
            throw new NullPointerException("LoaderOptions must be provided.");
        }
        this.IAuthTabCallback_Parcel = uST_TRANS_Init.onExtraCallback();
        this.access000 = getbsignprikeyph;
        this.IAuthTabCallbackStubProxy = new ArrayList(100);
        this.asInterface = new getRootCACert<>(10);
        this.access100 = new LinkedHashMap();
        this.IAuthTabCallbackStub = uST_TRANS_Init;
        extraCommand();
    }

    @Override // o.getCertCPS
    public boolean onNavigationEvent(getOCSPAddress.onWarmupCompleted... onwarmupcompletedArr) {
        while (isEngagementSignalsApiAvailable()) {
            onRelationshipValidationResult();
        }
        if (!this.IAuthTabCallbackStubProxy.isEmpty()) {
            if (onwarmupcompletedArr.length == 0) {
                return true;
            }
            getOCSPAddress.onWarmupCompleted onWarmupCompleted2 = this.IAuthTabCallbackStubProxy.get(0).onWarmupCompleted();
            for (getOCSPAddress.onWarmupCompleted onwarmupcompleted : onwarmupcompletedArr) {
                if (onWarmupCompleted2 == onwarmupcompleted) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.getCertCPS
    public getOCSPAddress onWarmupCompleted() {
        while (isEngagementSignalsApiAvailable()) {
            onRelationshipValidationResult();
        }
        return this.IAuthTabCallbackStubProxy.get(0);
    }

    @Override // o.getCertCPS
    public getOCSPAddress onExtraCallback() {
        this.getInterfaceDescriptor++;
        return this.IAuthTabCallbackStubProxy.remove(0);
    }

    private void onExtraCallbackWithResult(getOCSPAddress getocspaddress) {
        this.asBinder = getocspaddress;
        this.IAuthTabCallbackStubProxy.add(getocspaddress);
    }

    private void onExtraCallback(int i, getOCSPAddress getocspaddress) {
        if (i == this.IAuthTabCallbackStubProxy.size()) {
            this.asBinder = getocspaddress;
        }
        this.IAuthTabCallbackStubProxy.add(i, getocspaddress);
    }

    private void onWarmupCompleted(List<getOCSPAddress> list) {
        this.asBinder = list.get(list.size() - 1);
        this.IAuthTabCallbackStubProxy.addAll(list);
    }

    private boolean isEngagementSignalsApiAvailable() {
        if (this.onNavigationEvent) {
            return false;
        }
        if (this.IAuthTabCallbackStubProxy.isEmpty()) {
            return true;
        }
        setEngagementSignalsCallback();
        return mayLaunchUrl() == this.getInterfaceDescriptor;
    }

    private void onRelationshipValidationResult() {
        if (this.access000.onNavigationEvent() > this.IAuthTabCallbackStub.onWarmupCompleted()) {
            throw new UST_TRANS_V2_Init("The incoming YAML document exceeds the limit: " + this.IAuthTabCallbackStub.onWarmupCompleted() + " code points.");
        }
        requestPostMessageChannelWithExtras();
        setEngagementSignalsCallback();
        onWarmupCompleted(this.access000.onExtraCallbackWithResult());
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (iIAuthTabCallbackStub == 0) {
            onUnminimized();
            return;
        }
        if (iIAuthTabCallbackStub == 42) {
            getInterfaceDescriptor();
            return;
        }
        if (iIAuthTabCallbackStub != 58) {
            if (iIAuthTabCallbackStub == 91) {
                onMinimized();
                return;
            }
            if (iIAuthTabCallbackStub == 93) {
                onActivityLayout();
                return;
            }
            if (iIAuthTabCallbackStub == 33) {
                ICustomTabsCallback_Parcel();
                return;
            }
            if (iIAuthTabCallbackStub == 34) {
                ICustomTabsCallback();
                return;
            }
            if (iIAuthTabCallbackStub != 62) {
                if (iIAuthTabCallbackStub != 63) {
                    switch (iIAuthTabCallbackStub) {
                        case 37:
                            if (IAuthTabCallbackDefault()) {
                                access100();
                                return;
                            }
                            break;
                        case 38:
                            access000();
                            return;
                        case 39:
                            ICustomTabsCallbackDefault();
                            return;
                        default:
                            switch (iIAuthTabCallbackStub) {
                                case 44:
                                    readTypedObject();
                                    return;
                                case 45:
                                    if (IAuthTabCallbackStub()) {
                                        writeTypedObject();
                                        return;
                                    } else if (onExtraCallbackWithResult()) {
                                        IAuthTabCallback_Parcel();
                                        return;
                                    }
                                    break;
                                case 46:
                                    if (asInterface()) {
                                        extraCallbackWithResult();
                                        return;
                                    }
                                    break;
                                default:
                                    switch (iIAuthTabCallbackStub) {
                                        case 123:
                                            onPostMessage();
                                            return;
                                        case 124:
                                            if (this.IAuthTabCallbackDefault == 0) {
                                                ICustomTabsCallbackStub();
                                                return;
                                            }
                                            break;
                                        case 125:
                                            extraCallback();
                                            return;
                                    }
                            }
                    }
                } else if (asBinder()) {
                    onActivityResized();
                    return;
                }
            } else if (this.IAuthTabCallbackDefault == 0) {
                onMessageChannelReady();
                return;
            }
        } else if (IAuthTabCallbackStubProxy()) {
            ICustomTabsService();
            return;
        }
        if (onTransact()) {
            ICustomTabsCallbackStubProxy();
            return;
        }
        String strIAuthTabCallback = IAuthTabCallback(String.valueOf(Character.toChars(iIAuthTabCallbackStub)));
        if (iIAuthTabCallbackStub == 9) {
            strIAuthTabCallback = strIAuthTabCallback + "(TAB)";
        }
        throw new getCertPolicy("while scanning for the next token", null, String.format("found character '%s' that cannot start any token. (Do not use %s for indentation)", strIAuthTabCallback, strIAuthTabCallback), this.access000.IAuthTabCallbackDefault());
    }

    private String IAuthTabCallback(String str) {
        for (Character ch : onExtraCallback.keySet()) {
            if (onExtraCallback.get(ch).equals(str)) {
                return "\\" + ch;
            }
        }
        return str;
    }

    private int mayLaunchUrl() {
        if (this.access100.isEmpty()) {
            return -1;
        }
        return this.access100.values().iterator().next().onWarmupCompleted();
    }

    private void setEngagementSignalsCallback() {
        if (this.access100.isEmpty()) {
            return;
        }
        Iterator<getDateOfKMCert> it = this.access100.values().iterator();
        while (it.hasNext()) {
            getDateOfKMCert next = it.next();
            if (next.onExtraCallbackWithResult() != this.access000.IAuthTabCallback() || this.access000.onWarmupCompleted() - next.IAuthTabCallback() > 1024) {
                if (next.IAuthTabCallbackDefault()) {
                    throw new getCertPolicy("while scanning a simple key", next.onNavigationEvent(), "could not find expected ':'", this.access000.IAuthTabCallbackDefault());
                }
                it.remove();
            }
        }
    }

    private void newAuthTabSession() {
        boolean z = this.IAuthTabCallbackDefault == 0 && this.onTransact == this.access000.onExtraCallbackWithResult();
        boolean z2 = this.onExtraCallbackWithResult;
        if (!z2 && z) {
            throw new UST_TRANS_V2_Init("A simple key is required only if it is the first token in the current line");
        }
        if (z2) {
            newSession();
            this.access100.put(Integer.valueOf(this.IAuthTabCallbackDefault), new getDateOfKMCert(this.getInterfaceDescriptor + this.IAuthTabCallbackStubProxy.size(), z, this.access000.onWarmupCompleted(), this.access000.IAuthTabCallback(), this.access000.onExtraCallbackWithResult(), this.access000.IAuthTabCallbackDefault()));
        }
    }

    private void newSession() {
        getDateOfKMCert getdateofkmcertRemove = this.access100.remove(Integer.valueOf(this.IAuthTabCallbackDefault));
        if (getdateofkmcertRemove != null && getdateofkmcertRemove.IAuthTabCallbackDefault()) {
            throw new getCertPolicy("while scanning a simple key", getdateofkmcertRemove.onNavigationEvent(), "could not find expected ':'", this.access000.IAuthTabCallbackDefault());
        }
    }

    private void onWarmupCompleted(int i) {
        if (this.IAuthTabCallbackDefault == 0) {
            while (this.onTransact > i) {
                UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
                this.onTransact = this.asInterface.onWarmupCompleted().intValue();
                onExtraCallbackWithResult(new getIssuerDN(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
            }
        }
    }

    private boolean onExtraCallbackWithResult(int i) {
        int i2 = this.onTransact;
        if (i2 >= i) {
            return false;
        }
        this.asInterface.onWarmupCompleted(Integer.valueOf(i2));
        this.onTransact = i;
        return true;
    }

    private void extraCommand() {
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        onExtraCallbackWithResult(new getPublicKeyAlgorithm(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
    }

    private void onUnminimized() {
        onWarmupCompleted(-1);
        newSession();
        this.onExtraCallbackWithResult = false;
        this.access100.clear();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        onExtraCallbackWithResult(new getPublicKeyInfo(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
        this.onNavigationEvent = true;
    }

    private void access100() {
        onWarmupCompleted(-1);
        newSession();
        this.onExtraCallbackWithResult = false;
        onWarmupCompleted(newSessionWithExtras());
    }

    private void writeTypedObject() {
        onExtraCallbackWithResult(true);
    }

    private void extraCallbackWithResult() {
        onExtraCallbackWithResult(false);
    }

    private void onExtraCallbackWithResult(boolean z) {
        getOCSPAddress getkmcertfilename;
        onWarmupCompleted(-1);
        newSession();
        this.onExtraCallbackWithResult = false;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback(3);
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
        if (z) {
            getkmcertfilename = new getKMPrikeyCCFBPHFilename(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
        } else {
            getkmcertfilename = new getKMCertFilename(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
        }
        onExtraCallbackWithResult(getkmcertfilename);
    }

    private void onMinimized() {
        onNavigationEvent(false);
    }

    private void onPostMessage() {
        onNavigationEvent(true);
    }

    private void onNavigationEvent(boolean z) {
        getOCSPAddress getkmprikeyphfilename;
        newAuthTabSession();
        this.IAuthTabCallbackDefault++;
        this.onExtraCallbackWithResult = true;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback(1);
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
        if (z) {
            getkmprikeyphfilename = new getKMPrikeyFilename(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
        } else {
            getkmprikeyphfilename = new getKMPrikeyPHFilename(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
        }
        onExtraCallbackWithResult(getkmprikeyphfilename);
    }

    private void onActivityLayout() {
        onExtraCallback(false);
    }

    private void extraCallback() {
        onExtraCallback(true);
    }

    private void onExtraCallback(boolean z) {
        getOCSPAddress getkmprikeyfhfilename;
        newSession();
        this.IAuthTabCallbackDefault--;
        this.onExtraCallbackWithResult = false;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
        if (z) {
            getkmprikeyfhfilename = new getKMPriKeyIndexOfUUID(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
        } else {
            getkmprikeyfhfilename = new getKMPrikeyFHFilename(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
        }
        onExtraCallbackWithResult(getkmprikeyfhfilename);
    }

    private void readTypedObject() {
        this.onExtraCallbackWithResult = true;
        newSession();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback();
        onExtraCallbackWithResult(new getKMPrikeyCCFBFHFilename(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, this.access000.IAuthTabCallbackDefault()));
    }

    private void IAuthTabCallback_Parcel() {
        if (this.IAuthTabCallbackDefault == 0) {
            if (!this.onExtraCallbackWithResult) {
                throw new getCertPolicy(null, null, "sequence entries are not allowed here", this.access000.IAuthTabCallbackDefault());
            }
            if (onExtraCallbackWithResult(this.access000.onExtraCallbackWithResult())) {
                UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
                onExtraCallbackWithResult(new getDateOfSignCert(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
            }
        }
        this.onExtraCallbackWithResult = true;
        newSession();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback();
        onExtraCallbackWithResult(new getEncType(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2, this.access000.IAuthTabCallbackDefault()));
    }

    private void onActivityResized() {
        if (this.IAuthTabCallbackDefault == 0) {
            if (!this.onExtraCallbackWithResult) {
                throw new getCertPolicy(null, null, "mapping keys are not allowed here", this.access000.IAuthTabCallbackDefault());
            }
            if (onExtraCallbackWithResult(this.access000.onExtraCallbackWithResult())) {
                UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
                onExtraCallbackWithResult(new getHCertObj(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
            }
        }
        this.onExtraCallbackWithResult = this.IAuthTabCallbackDefault == 0;
        newSession();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback();
        onExtraCallbackWithResult(new getKMPrikeyRecoveryFilename(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2, this.access000.IAuthTabCallbackDefault()));
    }

    private void ICustomTabsService() {
        getDateOfKMCert getdateofkmcertRemove = this.access100.remove(Integer.valueOf(this.IAuthTabCallbackDefault));
        if (getdateofkmcertRemove != null) {
            onExtraCallback(getdateofkmcertRemove.onWarmupCompleted() - this.getInterfaceDescriptor, new getKMPrikeyRecoveryFilename(getdateofkmcertRemove.onNavigationEvent(), getdateofkmcertRemove.onNavigationEvent()));
            if (this.IAuthTabCallbackDefault == 0 && onExtraCallbackWithResult(getdateofkmcertRemove.onExtraCallback())) {
                onExtraCallback(getdateofkmcertRemove.onWarmupCompleted() - this.getInterfaceDescriptor, new getHCertObj(getdateofkmcertRemove.onNavigationEvent(), getdateofkmcertRemove.onNavigationEvent()));
            }
            this.onExtraCallbackWithResult = false;
        } else {
            int i = this.IAuthTabCallbackDefault;
            if (i == 0 && !this.onExtraCallbackWithResult) {
                throw new getCertPolicy(null, null, "mapping values are not allowed here", this.access000.IAuthTabCallbackDefault());
            }
            if (i == 0 && onExtraCallbackWithResult(this.access000.onExtraCallbackWithResult())) {
                UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
                onExtraCallbackWithResult(new getHCertObj(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
            }
            this.onExtraCallbackWithResult = this.IAuthTabCallbackDefault == 0;
            newSession();
        }
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback();
        onExtraCallbackWithResult(new getSerial(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2, this.access000.IAuthTabCallbackDefault()));
    }

    private void getInterfaceDescriptor() {
        newAuthTabSession();
        this.onExtraCallbackWithResult = false;
        onExtraCallbackWithResult(IAuthTabCallback(false));
    }

    private void access000() {
        newAuthTabSession();
        this.onExtraCallbackWithResult = false;
        onExtraCallbackWithResult(IAuthTabCallback(true));
    }

    private void ICustomTabsCallback_Parcel() {
        newAuthTabSession();
        this.onExtraCallbackWithResult = false;
        onExtraCallbackWithResult(receiveFile());
    }

    private void ICustomTabsCallbackStub() {
        onNavigationEvent('|');
    }

    private void onMessageChannelReady() {
        onNavigationEvent('>');
    }

    private void onNavigationEvent(char c) {
        this.onExtraCallbackWithResult = true;
        newSession();
        onWarmupCompleted(onExtraCallbackWithResult(c));
    }

    private void ICustomTabsCallbackDefault() {
        onWarmupCompleted('\'');
    }

    private void ICustomTabsCallback() {
        onWarmupCompleted('\"');
    }

    private void onWarmupCompleted(char c) {
        newAuthTabSession();
        this.onExtraCallbackWithResult = false;
        onExtraCallbackWithResult(IAuthTabCallback(c));
    }

    private void ICustomTabsCallbackStubProxy() {
        newAuthTabSession();
        this.onExtraCallbackWithResult = false;
        onExtraCallbackWithResult(requestPostMessageChannel());
    }

    private boolean IAuthTabCallbackDefault() {
        return this.access000.onExtraCallbackWithResult() == 0;
    }

    private boolean IAuthTabCallbackStub() {
        return this.access000.onExtraCallbackWithResult() == 0 && "---".equals(this.access000.onExtraCallbackWithResult(3)) && getCRLDP.onExtraCallback.onExtraCallback(this.access000.onNavigationEvent(3));
    }

    private boolean asInterface() {
        return this.access000.onExtraCallbackWithResult() == 0 && "...".equals(this.access000.onExtraCallbackWithResult(3)) && getCRLDP.onExtraCallback.onExtraCallback(this.access000.onNavigationEvent(3));
    }

    private boolean onExtraCallbackWithResult() {
        return getCRLDP.onExtraCallback.onExtraCallback(this.access000.onNavigationEvent(1));
    }

    private boolean asBinder() {
        if (this.IAuthTabCallbackDefault != 0) {
            return true;
        }
        return getCRLDP.onExtraCallback.onExtraCallback(this.access000.onNavigationEvent(1));
    }

    private boolean IAuthTabCallbackStubProxy() {
        if (this.IAuthTabCallbackDefault != 0) {
            return true;
        }
        return getCRLDP.onExtraCallback.onExtraCallback(this.access000.onNavigationEvent(1));
    }

    private boolean onTransact() {
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        getCRLDP getcrldp = getCRLDP.onExtraCallback;
        if (!getcrldp.onNavigationEvent(iIAuthTabCallbackStub, "-?:,[]{}#&*!|>'\"%@`")) {
            if (!getcrldp.onWarmupCompleted(this.access000.onNavigationEvent(1))) {
                return false;
            }
            if (iIAuthTabCallbackStub != 45 && (this.IAuthTabCallbackDefault != 0 || "?:".indexOf(iIAuthTabCallbackStub) == -1)) {
                return false;
            }
        }
        return true;
    }

    private void requestPostMessageChannelWithExtras() {
        boolean z;
        UST_TRANS_V2_ExportCert uST_TRANS_V2_ExportCert;
        int iOnExtraCallbackWithResult;
        getOCSPAddress getocspaddress;
        if (this.access000.onWarmupCompleted() == 0 && this.access000.IAuthTabCallbackStub() == 65279) {
            this.access000.onExtraCallback();
        }
        int i = -1;
        boolean z2 = false;
        while (!z2) {
            UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
            int iOnExtraCallbackWithResult2 = this.access000.onExtraCallbackWithResult();
            int i2 = 0;
            while (this.access000.onNavigationEvent(i2) == 32) {
                i2++;
            }
            if (i2 > 0) {
                this.access000.onExtraCallback(i2);
            }
            if (this.access000.IAuthTabCallbackStub() == 35) {
                if (iOnExtraCallbackWithResult2 != 0 && ((getocspaddress = this.asBinder) == null || getocspaddress.onWarmupCompleted() != getOCSPAddress.onWarmupCompleted.BlockEntry)) {
                    uST_TRANS_V2_ExportCert = UST_TRANS_V2_ExportCert.IN_LINE;
                    iOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
                } else if (i == this.access000.onExtraCallbackWithResult()) {
                    iOnExtraCallbackWithResult = i;
                    uST_TRANS_V2_ExportCert = UST_TRANS_V2_ExportCert.IN_LINE;
                } else {
                    uST_TRANS_V2_ExportCert = UST_TRANS_V2_ExportCert.BLOCK;
                    iOnExtraCallbackWithResult = -1;
                }
                getDateOfSignPrikey getdateofsignprikeyOnWarmupCompleted = onWarmupCompleted(uST_TRANS_V2_ExportCert);
                if (this.IAuthTabCallback_Parcel) {
                    onExtraCallbackWithResult(getdateofsignprikeyOnWarmupCompleted);
                }
                i = iOnExtraCallbackWithResult;
                z = true;
            } else {
                z = false;
            }
            String strPrefetch = prefetch();
            if (strPrefetch.isEmpty()) {
                z2 = true;
            } else {
                if (this.IAuthTabCallback_Parcel && !z && iOnExtraCallbackWithResult2 == 0) {
                    onExtraCallbackWithResult(new getDateOfSignPrikey(UST_TRANS_V2_ExportCert.BLANK_LINE, strPrefetch, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, this.access000.IAuthTabCallbackDefault()));
                }
                if (this.IAuthTabCallbackDefault == 0) {
                    this.onExtraCallbackWithResult = true;
                }
            }
        }
    }

    private getDateOfSignPrikey onWarmupCompleted(UST_TRANS_V2_ExportCert uST_TRANS_V2_ExportCert) {
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback();
        int i = 0;
        while (getCRLDP.onTransact.onWarmupCompleted(this.access000.onNavigationEvent(i))) {
            i++;
        }
        return new getDateOfSignPrikey(uST_TRANS_V2_ExportCert, this.access000.IAuthTabCallback(i), uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, this.access000.IAuthTabCallbackDefault());
    }

    private List<getOCSPAddress> newSessionWithExtras() {
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault;
        List listAsBinder;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback();
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
        if ("YAML".equals(strOnExtraCallbackWithResult)) {
            listAsBinder = IAuthTabCallbackStubProxy(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
            uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        } else if ("TAG".equals(strOnExtraCallbackWithResult)) {
            listAsBinder = asBinder(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
            uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        } else {
            uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
            int i = 0;
            while (getCRLDP.onTransact.onWarmupCompleted(this.access000.onNavigationEvent(i))) {
                i++;
            }
            if (i > 0) {
                this.access000.onExtraCallback(i);
            }
            listAsBinder = null;
        }
        return onNavigationEvent(new getKMPrikeyCCFFHFilename(strOnExtraCallbackWithResult, listAsBinder, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault), onNavigationEvent(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2));
    }

    private String onExtraCallbackWithResult(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        int i = 0;
        int iOnNavigationEvent = this.access000.onNavigationEvent(0);
        while (getCRLDP.onExtraCallbackWithResult.onExtraCallback(iOnNavigationEvent)) {
            i++;
            iOnNavigationEvent = this.access000.onNavigationEvent(i);
        }
        if (i == 0) {
            throw new getCertPolicy("while scanning a directive", uST_TRANS_V2_SendReceiverInfo, "expected alphabetic or numeric character, but found " + String.valueOf(Character.toChars(iOnNavigationEvent)) + "(" + iOnNavigationEvent + ")", this.access000.IAuthTabCallbackDefault());
        }
        String strIAuthTabCallback = this.access000.IAuthTabCallback(i);
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (!getCRLDP.onWarmupCompleted.onWarmupCompleted(iIAuthTabCallbackStub)) {
            return strIAuthTabCallback;
        }
        throw new getCertPolicy("while scanning a directive", uST_TRANS_V2_SendReceiverInfo, "expected alphabetic or numeric character, but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
    }

    private List<Integer> IAuthTabCallbackStubProxy(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        while (this.access000.IAuthTabCallbackStub() == 32) {
            this.access000.onExtraCallback();
        }
        Integer numAsInterface = asInterface(uST_TRANS_V2_SendReceiverInfo);
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (iIAuthTabCallbackStub != 46) {
            throw new getCertPolicy("while scanning a directive", uST_TRANS_V2_SendReceiverInfo, "expected a digit or '.', but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
        }
        this.access000.onExtraCallback();
        Integer numAsInterface2 = asInterface(uST_TRANS_V2_SendReceiverInfo);
        int iIAuthTabCallbackStub2 = this.access000.IAuthTabCallbackStub();
        if (getCRLDP.onWarmupCompleted.onWarmupCompleted(iIAuthTabCallbackStub2)) {
            throw new getCertPolicy("while scanning a directive", uST_TRANS_V2_SendReceiverInfo, "expected a digit or ' ', but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub2)) + "(" + iIAuthTabCallbackStub2 + ")", this.access000.IAuthTabCallbackDefault());
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(numAsInterface);
        arrayList.add(numAsInterface2);
        return arrayList;
    }

    private Integer asInterface(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (!Character.isDigit(iIAuthTabCallbackStub)) {
            throw new getCertPolicy("while scanning a directive", uST_TRANS_V2_SendReceiverInfo, "expected a digit, but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
        }
        int i = 0;
        while (Character.isDigit(this.access000.onNavigationEvent(i))) {
            i++;
        }
        String strIAuthTabCallback = this.access000.IAuthTabCallback(i);
        if (i > 3) {
            throw new getCertPolicy("while scanning a YAML directive", uST_TRANS_V2_SendReceiverInfo, "found a number which cannot represent a valid version: " + strIAuthTabCallback, this.access000.IAuthTabCallbackDefault());
        }
        return Integer.valueOf(Integer.parseInt(strIAuthTabCallback));
    }

    private List<String> asBinder(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        while (this.access000.IAuthTabCallbackStub() == 32) {
            this.access000.onExtraCallback();
        }
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(uST_TRANS_V2_SendReceiverInfo);
        while (this.access000.IAuthTabCallbackStub() == 32) {
            this.access000.onExtraCallback();
        }
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(uST_TRANS_V2_SendReceiverInfo);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(strIAuthTabCallbackDefault);
        arrayList.add(strIAuthTabCallbackStub);
        return arrayList;
    }

    private String IAuthTabCallbackDefault(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        String strOnExtraCallback = onExtraCallback("directive", uST_TRANS_V2_SendReceiverInfo);
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (iIAuthTabCallbackStub == 32) {
            return strOnExtraCallback;
        }
        throw new getCertPolicy("while scanning a directive", uST_TRANS_V2_SendReceiverInfo, "expected ' ', but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
    }

    private String IAuthTabCallbackStub(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult("directive", uST_TRANS_V2_SendReceiverInfo);
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (!getCRLDP.onWarmupCompleted.onWarmupCompleted(iIAuthTabCallbackStub)) {
            return strOnExtraCallbackWithResult;
        }
        throw new getCertPolicy("while scanning a directive", uST_TRANS_V2_SendReceiverInfo, "expected ' ', but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private getDateOfSignPrikey onNavigationEvent(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        getDateOfSignPrikey getdateofsignprikeyOnWarmupCompleted;
        while (this.access000.IAuthTabCallbackStub() == 32) {
            this.access000.onExtraCallback();
        }
        if (this.access000.IAuthTabCallbackStub() == 35) {
            getdateofsignprikeyOnWarmupCompleted = onWarmupCompleted(UST_TRANS_V2_ExportCert.IN_LINE);
            if (!this.IAuthTabCallback_Parcel) {
                getdateofsignprikeyOnWarmupCompleted = null;
            }
        }
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (!prefetch().isEmpty() || iIAuthTabCallbackStub == 0) {
            return getdateofsignprikeyOnWarmupCompleted;
        }
        throw new getCertPolicy("while scanning a directive", uST_TRANS_V2_SendReceiverInfo, "expected a comment or a line break, but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
    }

    private getOCSPAddress IAuthTabCallback(boolean z) {
        getCRLDP getcrldp;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        String str = this.access000.IAuthTabCallbackStub() == 42 ? "alias" : "anchor";
        this.access000.onExtraCallback();
        int i = 0;
        int iOnNavigationEvent = this.access000.onNavigationEvent(0);
        while (true) {
            getcrldp = getCRLDP.onExtraCallback;
            if (!getcrldp.onNavigationEvent(iOnNavigationEvent, ":,[]{}/.*&")) {
                break;
            }
            i++;
            iOnNavigationEvent = this.access000.onNavigationEvent(i);
        }
        if (i == 0) {
            throw new getCertPolicy("while scanning an " + str, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, "unexpected character found " + String.valueOf(Character.toChars(iOnNavigationEvent)) + "(" + iOnNavigationEvent + ")", this.access000.IAuthTabCallbackDefault());
        }
        String strIAuthTabCallback = this.access000.IAuthTabCallback(i);
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (getcrldp.onNavigationEvent(iIAuthTabCallbackStub, "?:,]}%@`")) {
            throw new getCertPolicy("while scanning an " + str, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, "unexpected character found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
        }
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
        if (z) {
            return new getDateOfKMPrikey(strIAuthTabCallback, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
        }
        return new getDateOfFile(strIAuthTabCallback, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2);
    }

    private getOCSPAddress receiveFile() {
        String strOnExtraCallbackWithResult;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        int iOnNavigationEvent = this.access000.onNavigationEvent(1);
        String strOnExtraCallback = null;
        if (iOnNavigationEvent == 60) {
            this.access000.onExtraCallback(2);
            strOnExtraCallbackWithResult = onExtraCallbackWithResult("tag", uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault);
            int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
            if (iIAuthTabCallbackStub != 62) {
                throw new getCertPolicy("while scanning a tag", uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, "expected '>', but found '" + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "' (" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
            }
            this.access000.onExtraCallback();
        } else if (getCRLDP.onExtraCallback.onExtraCallback(iOnNavigationEvent)) {
            this.access000.onExtraCallback();
            strOnExtraCallbackWithResult = "!";
        } else {
            int i = 1;
            while (true) {
                if (!getCRLDP.onWarmupCompleted.onWarmupCompleted(iOnNavigationEvent)) {
                    this.access000.onExtraCallback();
                    strOnExtraCallback = "!";
                    break;
                }
                if (iOnNavigationEvent != 33) {
                    i++;
                    iOnNavigationEvent = this.access000.onNavigationEvent(i);
                } else {
                    strOnExtraCallback = onExtraCallback("tag", uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault);
                    break;
                }
            }
            strOnExtraCallbackWithResult = onExtraCallbackWithResult("tag", uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault);
        }
        int iIAuthTabCallbackStub2 = this.access000.IAuthTabCallbackStub();
        if (getCRLDP.onWarmupCompleted.onWarmupCompleted(iIAuthTabCallbackStub2)) {
            throw new getCertPolicy("while scanning a tag", uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, "expected ' ', but found '" + String.valueOf(Character.toChars(iIAuthTabCallbackStub2)) + "' (" + iIAuthTabCallbackStub2 + ")", this.access000.IAuthTabCallbackDefault());
        }
        return new getKeyUsage(new getPublicKeyAlgorithmType(strOnExtraCallback, strOnExtraCallbackWithResult), uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, this.access000.IAuthTabCallbackDefault());
    }

    private List<getOCSPAddress> onExtraCallbackWithResult(char c) throws NumberFormatException {
        int iMax;
        String str;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2;
        char c2 = 1;
        boolean z = c == '>';
        StringBuilder sb = new StringBuilder();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        this.access000.onExtraCallback();
        onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault);
        int iOnWarmupCompleted = onnavigationeventOnWarmupCompleted.onWarmupCompleted();
        getDateOfSignPrikey getdateofsignprikeyIAuthTabCallback = IAuthTabCallback(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault);
        int i = this.onTransact + 1;
        if (i <= 0) {
            i = 1;
        }
        if (iOnWarmupCompleted == -1) {
            Object[] objArrPostMessage = postMessage();
            str = (String) objArrPostMessage[0];
            int iIntValue = ((Integer) objArrPostMessage[1]).intValue();
            uST_TRANS_V2_SendReceiverInfo = (UST_TRANS_V2_SendReceiverInfo) objArrPostMessage[2];
            iMax = Math.max(i, iIntValue);
        } else {
            iMax = (i + iOnWarmupCompleted) - 1;
            Object[] objArrIAuthTabCallback = IAuthTabCallback(iMax);
            str = (String) objArrIAuthTabCallback[0];
            uST_TRANS_V2_SendReceiverInfo = (UST_TRANS_V2_SendReceiverInfo) objArrIAuthTabCallback[1];
        }
        String strPrefetch = BuildConfig.FLAVOR;
        while (this.access000.onExtraCallbackWithResult() == iMax && this.access000.IAuthTabCallbackStub() != 0) {
            sb.append(str);
            char c3 = " \t".indexOf(this.access000.IAuthTabCallbackStub()) == -1 ? c2 : (char) 0;
            int i2 = 0;
            while (getCRLDP.onTransact.onWarmupCompleted(this.access000.onNavigationEvent(i2))) {
                i2++;
            }
            sb.append(this.access000.IAuthTabCallback(i2));
            strPrefetch = prefetch();
            Object[] objArrIAuthTabCallback2 = IAuthTabCallback(iMax);
            String str2 = (String) objArrIAuthTabCallback2[0];
            uST_TRANS_V2_SendReceiverInfo2 = (UST_TRANS_V2_SendReceiverInfo) objArrIAuthTabCallback2[c2];
            if (this.access000.onExtraCallbackWithResult() != iMax || this.access000.IAuthTabCallbackStub() == 0) {
                str = str2;
                break;
            }
            if (z && "\n".equals(strPrefetch) && c3 != 0 && " \t".indexOf(this.access000.IAuthTabCallbackStub()) == -1) {
                if (str2.isEmpty()) {
                    sb.append(" ");
                }
            } else {
                sb.append(strPrefetch);
            }
            uST_TRANS_V2_SendReceiverInfo = uST_TRANS_V2_SendReceiverInfo2;
            str = str2;
            c2 = 1;
        }
        uST_TRANS_V2_SendReceiverInfo2 = uST_TRANS_V2_SendReceiverInfo;
        if (onnavigationeventOnWarmupCompleted.onExtraCallbackWithResult()) {
            sb.append(strPrefetch);
        }
        if (onnavigationeventOnWarmupCompleted.IAuthTabCallback()) {
            sb.append(str);
        }
        return onNavigationEvent(getdateofsignprikeyIAuthTabCallback, new getKMPrikeyCCFPHFilename(sb.toString(), false, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfo2, UST_TRANS_Finalize.onExtraCallback.createStyle(Character.valueOf(c))));
    }

    private onNavigationEvent onWarmupCompleted(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) throws NumberFormatException {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        int i = -1;
        if (iIAuthTabCallbackStub == 45 || iIAuthTabCallbackStub == 43) {
            if (iIAuthTabCallbackStub == 43) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            bool2 = bool;
            this.access000.onExtraCallback();
            int iIAuthTabCallbackStub2 = this.access000.IAuthTabCallbackStub();
            if (Character.isDigit(iIAuthTabCallbackStub2)) {
                i = Integer.parseInt(String.valueOf(Character.toChars(iIAuthTabCallbackStub2)));
                if (i == 0) {
                    throw new getCertPolicy("while scanning a block scalar", uST_TRANS_V2_SendReceiverInfo, "expected indentation indicator in the range 1-9, but found 0", this.access000.IAuthTabCallbackDefault());
                }
                this.access000.onExtraCallback();
            }
        } else {
            bool2 = null;
            if (Character.isDigit(iIAuthTabCallbackStub)) {
                i = Integer.parseInt(String.valueOf(Character.toChars(iIAuthTabCallbackStub)));
                if (i == 0) {
                    throw new getCertPolicy("while scanning a block scalar", uST_TRANS_V2_SendReceiverInfo, "expected indentation indicator in the range 1-9, but found 0", this.access000.IAuthTabCallbackDefault());
                }
                this.access000.onExtraCallback();
                int iIAuthTabCallbackStub3 = this.access000.IAuthTabCallbackStub();
                if (iIAuthTabCallbackStub3 == 45 || iIAuthTabCallbackStub3 == 43) {
                    if (iIAuthTabCallbackStub3 == 43) {
                        bool3 = Boolean.TRUE;
                    } else {
                        bool3 = Boolean.FALSE;
                    }
                    bool2 = bool3;
                    this.access000.onExtraCallback();
                }
            }
        }
        int iIAuthTabCallbackStub4 = this.access000.IAuthTabCallbackStub();
        if (getCRLDP.onWarmupCompleted.onWarmupCompleted(iIAuthTabCallbackStub4)) {
            throw new getCertPolicy("while scanning a block scalar", uST_TRANS_V2_SendReceiverInfo, "expected chomping or indentation indicators, but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub4)) + "(" + iIAuthTabCallbackStub4 + ")", this.access000.IAuthTabCallbackDefault());
        }
        return new onNavigationEvent(bool2, i);
    }

    private getDateOfSignPrikey IAuthTabCallback(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        while (this.access000.IAuthTabCallbackStub() == 32) {
            this.access000.onExtraCallback();
        }
        getDateOfSignPrikey getdateofsignprikeyOnWarmupCompleted = this.access000.IAuthTabCallbackStub() == 35 ? onWarmupCompleted(UST_TRANS_V2_ExportCert.IN_LINE) : null;
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (!prefetch().isEmpty() || iIAuthTabCallbackStub == 0) {
            return getdateofsignprikeyOnWarmupCompleted;
        }
        throw new getCertPolicy("while scanning a block scalar", uST_TRANS_V2_SendReceiverInfo, "expected a comment or a line break, but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
    }

    private Object[] postMessage() {
        StringBuilder sb = new StringBuilder();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        int iOnExtraCallbackWithResult = 0;
        while (getCRLDP.IAuthTabCallback.onExtraCallbackWithResult(this.access000.IAuthTabCallbackStub(), " \r")) {
            if (this.access000.IAuthTabCallbackStub() != 32) {
                sb.append(prefetch());
                uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
            } else {
                this.access000.onExtraCallback();
                if (this.access000.onExtraCallbackWithResult() > iOnExtraCallbackWithResult) {
                    iOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
                }
            }
        }
        return new Object[]{sb.toString(), Integer.valueOf(iOnExtraCallbackWithResult), uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault};
    }

    private Object[] IAuthTabCallback(int i) {
        StringBuilder sb = new StringBuilder();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        for (int iOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult(); iOnExtraCallbackWithResult < i && this.access000.IAuthTabCallbackStub() == 32; iOnExtraCallbackWithResult++) {
            this.access000.onExtraCallback();
        }
        while (true) {
            String strPrefetch = prefetch();
            if (!strPrefetch.isEmpty()) {
                sb.append(strPrefetch);
                uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
                for (int iOnExtraCallbackWithResult2 = this.access000.onExtraCallbackWithResult(); iOnExtraCallbackWithResult2 < i && this.access000.IAuthTabCallbackStub() == 32; iOnExtraCallbackWithResult2++) {
                    this.access000.onExtraCallback();
                }
            } else {
                return new Object[]{sb.toString(), uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault};
            }
        }
    }

    private getOCSPAddress IAuthTabCallback(char c) {
        boolean z = c == '\"';
        StringBuilder sb = new StringBuilder();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        this.access000.onExtraCallback();
        sb.append(onNavigationEvent(z, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
        while (this.access000.IAuthTabCallbackStub() != iIAuthTabCallbackStub) {
            sb.append(onTransact(uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
            sb.append(onNavigationEvent(z, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault));
        }
        this.access000.onExtraCallback();
        return new getKMPrikeyCCFPHFilename(sb.toString(), false, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, this.access000.IAuthTabCallbackDefault(), UST_TRANS_Finalize.onExtraCallback.createStyle(Character.valueOf(c)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0171, code lost:
    
        return r0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String onNavigationEvent(boolean z, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = 0;
            while (getCRLDP.onExtraCallback.onNavigationEvent(this.access000.onNavigationEvent(i), "'\"\\")) {
                i++;
            }
            if (i != 0) {
                sb.append(this.access000.IAuthTabCallback(i));
            }
            int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
            if (!z && iIAuthTabCallbackStub == 39 && this.access000.onNavigationEvent(1) == 39) {
                sb.append("'");
                this.access000.onExtraCallback(2);
            } else if ((z && iIAuthTabCallbackStub == 39) || (!z && "\"\\".indexOf(iIAuthTabCallbackStub) != -1)) {
                sb.appendCodePoint(iIAuthTabCallbackStub);
                this.access000.onExtraCallback();
            } else {
                if (!z || iIAuthTabCallbackStub != 92) {
                    break;
                }
                this.access000.onExtraCallback();
                int iIAuthTabCallbackStub2 = this.access000.IAuthTabCallbackStub();
                if (!Character.isSupplementaryCodePoint(iIAuthTabCallbackStub2)) {
                    Map<Character, String> map = onExtraCallback;
                    char c = (char) iIAuthTabCallbackStub2;
                    if (map.containsKey(Character.valueOf(c))) {
                        sb.append(map.get(Character.valueOf(c)));
                        this.access000.onExtraCallback();
                    }
                }
                if (!Character.isSupplementaryCodePoint(iIAuthTabCallbackStub2)) {
                    Map<Character, Integer> map2 = IAuthTabCallback;
                    char c2 = (char) iIAuthTabCallbackStub2;
                    if (map2.containsKey(Character.valueOf(c2))) {
                        int iIntValue = map2.get(Character.valueOf(c2)).intValue();
                        this.access000.onExtraCallback();
                        String strOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult(iIntValue);
                        if (onWarmupCompleted.matcher(strOnExtraCallbackWithResult).find()) {
                            throw new getCertPolicy("while scanning a double-quoted scalar", uST_TRANS_V2_SendReceiverInfo, "expected escape sequence of " + iIntValue + " hexadecimal numbers, but found: " + strOnExtraCallbackWithResult, this.access000.IAuthTabCallbackDefault());
                        }
                        try {
                            sb.append(new String(Character.toChars(Integer.parseInt(strOnExtraCallbackWithResult, 16))));
                            this.access000.onExtraCallback(iIntValue);
                        } catch (IllegalArgumentException unused) {
                            throw new getCertPolicy("while scanning a double-quoted scalar", uST_TRANS_V2_SendReceiverInfo, "found unknown escape character " + strOnExtraCallbackWithResult, this.access000.IAuthTabCallbackDefault());
                        }
                    }
                }
                if (!prefetch().isEmpty()) {
                    sb.append(onExtraCallback(uST_TRANS_V2_SendReceiverInfo));
                } else {
                    throw new getCertPolicy("while scanning a double-quoted scalar", uST_TRANS_V2_SendReceiverInfo, "found unknown escape character " + String.valueOf(Character.toChars(iIAuthTabCallbackStub2)) + "(" + iIAuthTabCallbackStub2 + ")", this.access000.IAuthTabCallbackDefault());
                }
            }
        }
    }

    private String onTransact(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (" \t".indexOf(this.access000.onNavigationEvent(i)) != -1) {
            i++;
        }
        String strIAuthTabCallback = this.access000.IAuthTabCallback(i);
        if (this.access000.IAuthTabCallbackStub() == 0) {
            throw new getCertPolicy("while scanning a quoted scalar", uST_TRANS_V2_SendReceiverInfo, "found unexpected end of stream", this.access000.IAuthTabCallbackDefault());
        }
        String strPrefetch = prefetch();
        if (!strPrefetch.isEmpty()) {
            String strOnExtraCallback = onExtraCallback(uST_TRANS_V2_SendReceiverInfo);
            if (!"\n".equals(strPrefetch)) {
                sb.append(strPrefetch);
            } else if (strOnExtraCallback.isEmpty()) {
                sb.append(" ");
            }
            sb.append(strOnExtraCallback);
        } else {
            sb.append(strIAuthTabCallback);
        }
        return sb.toString();
    }

    private String onExtraCallback(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String strOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult(3);
            if (("---".equals(strOnExtraCallbackWithResult) || "...".equals(strOnExtraCallbackWithResult)) && getCRLDP.onExtraCallback.onExtraCallback(this.access000.onNavigationEvent(3))) {
                throw new getCertPolicy("while scanning a quoted scalar", uST_TRANS_V2_SendReceiverInfo, "found unexpected document separator", this.access000.IAuthTabCallbackDefault());
            }
            while (" \t".indexOf(this.access000.IAuthTabCallbackStub()) != -1) {
                this.access000.onExtraCallback();
            }
            String strPrefetch = prefetch();
            if (!strPrefetch.isEmpty()) {
                sb.append(strPrefetch);
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private getOCSPAddress requestPostMessageChannel() {
        StringBuilder sb = new StringBuilder();
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        int i = this.onTransact;
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault;
        String strPrefetchWithMultipleUrls = BuildConfig.FLAVOR;
        while (this.access000.IAuthTabCallbackStub() != 35) {
            int i2 = 0;
            while (true) {
                int iOnNavigationEvent = this.access000.onNavigationEvent(i2);
                getCRLDP getcrldp = getCRLDP.onExtraCallback;
                if (getcrldp.onExtraCallback(iOnNavigationEvent)) {
                    break;
                }
                if (iOnNavigationEvent == 58) {
                    if (!getcrldp.onExtraCallbackWithResult(this.access000.onNavigationEvent(i2 + 1), this.IAuthTabCallbackDefault != 0 ? ",[]{}" : BuildConfig.FLAVOR)) {
                        if (this.IAuthTabCallbackDefault != 0 && ",?[]{}".indexOf(iOnNavigationEvent) != -1) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            if (i2 == 0) {
                break;
            }
            this.onExtraCallbackWithResult = false;
            sb.append(strPrefetchWithMultipleUrls);
            sb.append(this.access000.IAuthTabCallback(i2));
            uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2 = this.access000.IAuthTabCallbackDefault();
            strPrefetchWithMultipleUrls = prefetchWithMultipleUrls();
            if (strPrefetchWithMultipleUrls.isEmpty() || this.access000.IAuthTabCallbackStub() == 35 || (this.IAuthTabCallbackDefault == 0 && this.access000.onExtraCallbackWithResult() < i + 1)) {
                break;
            }
        }
        return new getKMPrikeyCCFPHFilename(sb.toString(), uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault, uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault2, true);
    }

    private boolean onNavigationEvent() {
        int i;
        int iOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
        int i2 = 0;
        while (true) {
            int iOnNavigationEvent = this.access000.onNavigationEvent(i2);
            if (iOnNavigationEvent == 0 || !getCRLDP.onExtraCallback.onExtraCallback(iOnNavigationEvent)) {
                break;
            }
            iOnExtraCallbackWithResult = (getCRLDP.IAuthTabCallback.onExtraCallback(iOnNavigationEvent) || (iOnNavigationEvent == 13 && this.access000.onNavigationEvent(i2 + 2) == 10) || iOnNavigationEvent == 65279) ? 0 : iOnExtraCallbackWithResult + 1;
            i2++;
        }
        if (this.access000.onNavigationEvent(i2) == 35 || this.access000.onNavigationEvent(i2 + 1) == 0 || ((i = this.IAuthTabCallbackDefault) == 0 && iOnExtraCallbackWithResult < this.onTransact)) {
            return true;
        }
        if (i == 0) {
            int i3 = 1;
            while (true) {
                int i4 = i2 + i3;
                int iOnNavigationEvent2 = this.access000.onNavigationEvent(i4);
                if (iOnNavigationEvent2 == 0) {
                    break;
                }
                getCRLDP getcrldp = getCRLDP.onExtraCallback;
                if (getcrldp.onExtraCallback(iOnNavigationEvent2)) {
                    break;
                }
                if (iOnNavigationEvent2 == 58 && getcrldp.onExtraCallback(this.access000.onNavigationEvent(i4 + 1))) {
                    return true;
                }
                i3++;
            }
        }
        return false;
    }

    private String prefetchWithMultipleUrls() {
        int i = 0;
        while (true) {
            if (this.access000.onNavigationEvent(i) != 32 && this.access000.onNavigationEvent(i) != 9) {
                break;
            }
            i++;
        }
        String strIAuthTabCallback = this.access000.IAuthTabCallback(i);
        String strPrefetch = prefetch();
        if (strPrefetch.isEmpty()) {
            return strIAuthTabCallback;
        }
        this.onExtraCallbackWithResult = true;
        String strOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult(3);
        if ("---".equals(strOnExtraCallbackWithResult) || ("...".equals(strOnExtraCallbackWithResult) && getCRLDP.onExtraCallback.onExtraCallback(this.access000.onNavigationEvent(3)))) {
            return BuildConfig.FLAVOR;
        }
        if (this.IAuthTabCallback_Parcel && onNavigationEvent()) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (this.access000.IAuthTabCallbackStub() == 32) {
                this.access000.onExtraCallback();
            } else {
                String strPrefetch2 = prefetch();
                if (!strPrefetch2.isEmpty()) {
                    sb.append(strPrefetch2);
                    String strOnExtraCallbackWithResult2 = this.access000.onExtraCallbackWithResult(3);
                    if ("---".equals(strOnExtraCallbackWithResult2) || ("...".equals(strOnExtraCallbackWithResult2) && getCRLDP.onExtraCallback.onExtraCallback(this.access000.onNavigationEvent(3)))) {
                        break;
                    }
                } else {
                    if (!"\n".equals(strPrefetch)) {
                        return strPrefetch + ((Object) sb);
                    }
                    if (sb.length() == 0) {
                        return " ";
                    }
                    return sb.toString();
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    private String onExtraCallback(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (iIAuthTabCallbackStub != 33) {
            throw new getCertPolicy("while scanning a " + str, uST_TRANS_V2_SendReceiverInfo, "expected '!', but found " + String.valueOf(Character.toChars(iIAuthTabCallbackStub)) + "(" + iIAuthTabCallbackStub + ")", this.access000.IAuthTabCallbackDefault());
        }
        int i = 1;
        int iOnNavigationEvent = this.access000.onNavigationEvent(1);
        if (iOnNavigationEvent != 32) {
            int i2 = 1;
            while (getCRLDP.onExtraCallbackWithResult.onExtraCallback(iOnNavigationEvent)) {
                i2++;
                iOnNavigationEvent = this.access000.onNavigationEvent(i2);
            }
            if (iOnNavigationEvent != 33) {
                this.access000.onExtraCallback(i2);
                throw new getCertPolicy("while scanning a " + str, uST_TRANS_V2_SendReceiverInfo, "expected '!', but found " + String.valueOf(Character.toChars(iOnNavigationEvent)) + "(" + iOnNavigationEvent + ")", this.access000.IAuthTabCallbackDefault());
            }
            i = 1 + i2;
        }
        return this.access000.IAuthTabCallback(i);
    }

    private String onExtraCallbackWithResult(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        StringBuilder sb = new StringBuilder();
        int iOnNavigationEvent = this.access000.onNavigationEvent(0);
        int i = 0;
        while (getCRLDP.asInterface.onExtraCallback(iOnNavigationEvent)) {
            if (iOnNavigationEvent == 37) {
                sb.append(this.access000.IAuthTabCallback(i));
                sb.append(onNavigationEvent(str, uST_TRANS_V2_SendReceiverInfo));
                i = 0;
            } else {
                i++;
            }
            iOnNavigationEvent = this.access000.onNavigationEvent(i);
        }
        if (i != 0) {
            sb.append(this.access000.IAuthTabCallback(i));
        }
        if (sb.length() == 0) {
            throw new getCertPolicy("while scanning a " + str, uST_TRANS_V2_SendReceiverInfo, "expected URI, but found " + String.valueOf(Character.toChars(iOnNavigationEvent)) + "(" + iOnNavigationEvent + ")", this.access000.IAuthTabCallbackDefault());
        }
        return sb.toString();
    }

    private String onNavigationEvent(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        int i = 1;
        while (this.access000.onNavigationEvent(i * 3) == 37) {
            i++;
        }
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault = this.access000.IAuthTabCallbackDefault();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        while (this.access000.IAuthTabCallbackStub() == 37) {
            this.access000.onExtraCallback();
            try {
                byteBufferAllocate.put((byte) Integer.parseInt(this.access000.onExtraCallbackWithResult(2), 16));
                this.access000.onExtraCallback(2);
            } catch (NumberFormatException unused) {
                int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
                String strValueOf = String.valueOf(Character.toChars(iIAuthTabCallbackStub));
                int iOnNavigationEvent = this.access000.onNavigationEvent(1);
                throw new getCertPolicy("while scanning a " + str, uST_TRANS_V2_SendReceiverInfo, "expected URI escape sequence of 2 hexadecimal numbers, but found " + strValueOf + "(" + iIAuthTabCallbackStub + ") and " + String.valueOf(Character.toChars(iOnNavigationEvent)) + "(" + iOnNavigationEvent + ")", this.access000.IAuthTabCallbackDefault());
            }
        }
        byteBufferAllocate.flip();
        try {
            return getSignAlgType.onWarmupCompleted(byteBufferAllocate);
        } catch (CharacterCodingException e) {
            throw new getCertPolicy("while scanning a " + str, uST_TRANS_V2_SendReceiverInfo, "expected URI in UTF-8: " + e.getMessage(), uST_TRANS_V2_SendReceiverInfoIAuthTabCallbackDefault);
        }
    }

    private String prefetch() {
        int iIAuthTabCallbackStub = this.access000.IAuthTabCallbackStub();
        if (iIAuthTabCallbackStub != 13 && iIAuthTabCallbackStub != 10 && iIAuthTabCallbackStub != 133) {
            if (iIAuthTabCallbackStub == 8232 || iIAuthTabCallbackStub == 8233) {
                this.access000.onExtraCallback();
                return String.valueOf(Character.toChars(iIAuthTabCallbackStub));
            }
            return BuildConfig.FLAVOR;
        }
        if (iIAuthTabCallbackStub == 13 && 10 == this.access000.onNavigationEvent(1)) {
            this.access000.onExtraCallback(2);
            return "\n";
        }
        this.access000.onExtraCallback();
        return "\n";
    }

    private List<getOCSPAddress> onNavigationEvent(getOCSPAddress... getocspaddressArr) {
        ArrayList arrayList = new ArrayList();
        for (getOCSPAddress getocspaddress : getocspaddressArr) {
            if (getocspaddress != null && (this.IAuthTabCallback_Parcel || !(getocspaddress instanceof getDateOfSignPrikey))) {
                arrayList.add(getocspaddress);
            }
        }
        return arrayList;
    }

    @Override // o.getCertCPS
    public void IAuthTabCallback() {
        this.access000.asInterface();
    }

    static class onNavigationEvent {
        private final int IAuthTabCallback;
        private final Boolean onNavigationEvent;

        public onNavigationEvent(Boolean bool, int i) {
            this.onNavigationEvent = bool;
            this.IAuthTabCallback = i;
        }

        public boolean onExtraCallbackWithResult() {
            Boolean bool = this.onNavigationEvent;
            return bool == null || bool.booleanValue();
        }

        public boolean IAuthTabCallback() {
            Boolean bool = this.onNavigationEvent;
            return bool != null && bool.booleanValue();
        }

        public int onWarmupCompleted() {
            return this.IAuthTabCallback;
        }
    }
}
