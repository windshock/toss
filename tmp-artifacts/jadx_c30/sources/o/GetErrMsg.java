package o;

import java.security.NoSuchAlgorithmException;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;
import o.HookTool;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.TextParseException;
import org.xbill.DNS.dnssec.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetErrMsg {
    private final TreeMap<Integer, Integer> IAuthTabCallback;
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onWarmupCompleted(GetErrMsg.class);
    private static final yzp2 onExtraCallback = yzp2.onWarmupCompleted("*");

    private boolean IAuthTabCallback(int i) {
        return i == 1;
    }

    GetErrMsg() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        this.IAuthTabCallback = treeMap;
        treeMap.put(1024, 150);
        treeMap.put(2048, Integer.valueOf(verifySignatureValue_NoAlgorithmInfo.RESULT_TOSS_CARD_AUTO_CHARGE_REMOVED));
        treeMap.put(Integer.valueOf(PKIFailureInfo.certConfirmed), 2500);
    }

    static final class onExtraCallbackWithResult {
        private final sz3 IAuthTabCallback;
        private final yzp2 onExtraCallback;
        private GetPassword onExtraCallbackWithResult;
        private sz3 onWarmupCompleted;

        private onExtraCallbackWithResult(yzp2 yzp2Var, sz3 sz3Var) {
            this.onExtraCallbackWithResult = GetPassword.UNCHECKED;
            this.onExtraCallback = yzp2Var;
            this.IAuthTabCallback = sz3Var;
        }
    }

    public void onWarmupCompleted(List<GetKMCert> list) {
        ListIterator<GetKMCert> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (!IAuthTabCallback(listIterator.next().onWarmupCompleted().onExtraCallbackWithResult())) {
                listIterator.remove();
            }
        }
    }

    private yzp2 onWarmupCompleted(yzp2 yzp2Var) {
        try {
            return yzp2.onWarmupCompleted(onExtraCallback, yzp2Var);
        } catch (NameTooLongException unused) {
            return null;
        }
    }

    private yzp2 onExtraCallbackWithResult(yzp2 yzp2Var, yzp2 yzp2Var2) {
        int iIAuthTabCallback = (yzp2Var.IAuthTabCallback() - yzp2Var2.IAuthTabCallback()) - 1;
        return iIAuthTabCallback > 0 ? new yzp2(yzp2Var, iIAuthTabCallback) : yzp2Var;
    }

    private sz3 onExtraCallbackWithResult(yzp2 yzp2Var, yzp2 yzp2Var2, List<GetKMCert> list, GetSignCert getSignCert) {
        sz3 sz3Var;
        for (GetKMCert getKMCert : list) {
            int i = getSignCert.IAuthTabCallback;
            if (i >= 8) {
                if (i != getSignCert.onExtraCallback) {
                    return null;
                }
                getSignCert.IAuthTabCallback = -1;
                return null;
            }
            try {
                sz3Var = (sz3) getKMCert.onWarmupCompleted();
            } catch (NoSuchAlgorithmException | TextParseException unused) {
                getSignCert.onExtraCallback++;
            }
            if (new yzp2(getSignCert.onNavigationEvent(sz3Var, yzp2Var).IAuthTabCallback(), yzp2Var2).equals(sz3Var.access000())) {
                return sz3Var;
            }
        }
        return null;
    }

    private boolean onExtraCallbackWithResult(sz3 sz3Var, yzp2 yzp2Var, byte[] bArr) {
        if (!new yzp2(sz3Var.access000(), 1).equals(yzp2Var)) {
            return false;
        }
        byte[] bArrOnExtraCallback = new TRANS_VeriSign_SignedData("0123456789ABCDEFGHIJKLMNOPQRSTUV=", false, false).onExtraCallback(sz3Var.access000().onWarmupCompleted(0));
        byte[] bArrAsInterface = sz3Var.asInterface();
        if (CertList.onNavigationEvent(bArrOnExtraCallback, bArr) >= 0 || CertList.onNavigationEvent(bArr, bArrAsInterface) >= 0) {
            return CertList.onNavigationEvent(bArrAsInterface, bArrOnExtraCallback) <= 0 && (CertList.onNavigationEvent(bArr, bArrOnExtraCallback) > 0 || CertList.onNavigationEvent(bArr, bArrAsInterface) < 0);
        }
        return true;
    }

    private sz3 onNavigationEvent(yzp2 yzp2Var, yzp2 yzp2Var2, List<GetKMCert> list, GetSignCert getSignCert) {
        sz3 sz3Var;
        for (GetKMCert getKMCert : list) {
            int i = getSignCert.IAuthTabCallback;
            if (i >= 8) {
                if (getSignCert.onExtraCallback == i) {
                    getSignCert.IAuthTabCallback = -1;
                }
                return null;
            }
            try {
                sz3Var = (sz3) getKMCert.onWarmupCompleted();
            } catch (NoSuchAlgorithmException unused) {
                getSignCert.onExtraCallback++;
            }
            if (onExtraCallbackWithResult(sz3Var, yzp2Var2, getSignCert.onNavigationEvent(sz3Var, yzp2Var).onExtraCallback())) {
                return sz3Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private onExtraCallbackWithResult onExtraCallback(yzp2 yzp2Var, yzp2 yzp2Var2, List<GetKMCert> list, GetSignCert getSignCert) {
        int i;
        while (true) {
            if (yzp2Var.IAuthTabCallback() < yzp2Var2.IAuthTabCallback() || (i = getSignCert.IAuthTabCallback) >= 8 || i == -1) {
                break;
            }
            sz3 sz3VarOnExtraCallbackWithResult = onExtraCallbackWithResult(yzp2Var, yzp2Var2, list, getSignCert);
            if (sz3VarOnExtraCallbackWithResult != null) {
                return new onExtraCallbackWithResult(yzp2Var, sz3VarOnExtraCallbackWithResult);
            }
            yzp2Var = new yzp2(yzp2Var, 1);
        }
    }

    private onExtraCallbackWithResult onWarmupCompleted(yzp2 yzp2Var, yzp2 yzp2Var2, List<GetKMCert> list, GetSignCert getSignCert) {
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(yzp2Var, yzp2Var2, list, getSignCert);
        if (onextracallbackwithresultOnExtraCallback != null) {
            if (onextracallbackwithresultOnExtraCallback.onExtraCallback.equals(yzp2Var)) {
                onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult = GetPassword.BOGUS;
                return onextracallbackwithresultOnExtraCallback;
            }
            if (!onextracallbackwithresultOnExtraCallback.IAuthTabCallback.onExtraCallback(2) || onextracallbackwithresultOnExtraCallback.IAuthTabCallback.onExtraCallback(6)) {
                if (onextracallbackwithresultOnExtraCallback.IAuthTabCallback.onExtraCallback(39)) {
                    onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult = GetPassword.BOGUS;
                    return onextracallbackwithresultOnExtraCallback;
                }
                onextracallbackwithresultOnExtraCallback.onWarmupCompleted = onNavigationEvent(onExtraCallbackWithResult(yzp2Var, onextracallbackwithresultOnExtraCallback.onExtraCallback), yzp2Var2, list, getSignCert);
                if (onextracallbackwithresultOnExtraCallback.onWarmupCompleted == null) {
                    onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult = GetPassword.BOGUS;
                    return onextracallbackwithresultOnExtraCallback;
                }
                onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult = GetPassword.SECURE;
                return onextracallbackwithresultOnExtraCallback;
            }
            if (!onextracallbackwithresultOnExtraCallback.IAuthTabCallback.onExtraCallback(43)) {
                onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult = GetPassword.INSECURE;
                return onextracallbackwithresultOnExtraCallback;
            }
            onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult = GetPassword.BOGUS;
            return onextracallbackwithresultOnExtraCallback;
        }
        sz3 sz3Var = null;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(yzp2.onExtraCallback, sz3Var);
        onextracallbackwithresult.onExtraCallbackWithResult = GetPassword.BOGUS;
        return onextracallbackwithresult;
    }

    private boolean IAuthTabCallback(GetKMCert getKMCert, ConstantServerType constantServerType) {
        Integer numFloorKey;
        int iBitLength;
        JCertTransfer jCertTransferOnNavigationEvent = constantServerType.onNavigationEvent(getKMCert.ICustomTabsCallback(), getKMCert.onTransact());
        if (jCertTransferOnNavigationEvent == null) {
            return false;
        }
        try {
            int i = Integer.MAX_VALUE;
            for (copyStringToBuffer copystringtobuffer : jCertTransferOnNavigationEvent.onWarmupCompleted(false)) {
                if ((copystringtobuffer.onNavigationEvent() & 256) == 256) {
                    switch (copystringtobuffer.onExtraCallback()) {
                        case 3:
                        case 6:
                            iBitLength = ((DSAPublicKey) copystringtobuffer.IAuthTabCallbackDefault()).getParams().getP().bitLength();
                            break;
                        case 4:
                        case 9:
                        case 11:
                        default:
                            return false;
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                            iBitLength = ((RSAPublicKey) copystringtobuffer.IAuthTabCallbackDefault()).getModulus().bitLength();
                            break;
                        case 12:
                            iBitLength = 512;
                            break;
                        case 13:
                        case 14:
                            iBitLength = ((ECPublicKey) copystringtobuffer.IAuthTabCallbackDefault()).getParams().getCurve().getField().getFieldSize();
                            break;
                        case 15:
                            iBitLength = 256;
                            break;
                        case 16:
                            iBitLength = 456;
                            break;
                    }
                    if (iBitLength < i) {
                        i = iBitLength;
                    }
                }
            }
            numFloorKey = this.IAuthTabCallback.floorKey(Integer.valueOf(i));
            if (numFloorKey == null) {
                numFloorKey = this.IAuthTabCallback.firstKey();
            }
        } catch (HookTool.onWarmupCompleted unused) {
        }
        return getKMCert.onWarmupCompleted().onExtraCallback() <= this.IAuthTabCallback.get(numFloorKey).intValue();
    }

    public boolean onNavigationEvent(List<GetKMCert> list, ConstantServerType constantServerType) {
        HashMap map = new HashMap();
        Iterator<GetKMCert> it = list.iterator();
        while (it.hasNext()) {
            for (sz3 sz3Var : it.next().IAuthTabCallbackDefault()) {
                yzp2 yzp2Var = new yzp2(sz3Var.access000(), 1);
                sz3 sz3Var2 = (sz3) map.get(yzp2Var);
                if (sz3Var2 != null) {
                    if (sz3Var.onExtraCallbackWithResult() != sz3Var2.onExtraCallbackWithResult() || sz3Var.onExtraCallback() != sz3Var2.onExtraCallback()) {
                        return true;
                    }
                    if ((sz3Var.onTransact() == null) ^ (sz3Var2.onTransact() == null)) {
                        return true;
                    }
                    if (sz3Var.onTransact() != null && CertList.onNavigationEvent(sz3Var.onTransact(), sz3Var2.onTransact()) != 0) {
                        return true;
                    }
                } else {
                    map.put(yzp2Var, sz3Var);
                }
            }
        }
        Iterator<GetKMCert> it2 = list.iterator();
        while (it2.hasNext()) {
            if (IAuthTabCallback(it2.next(), constantServerType)) {
                return false;
            }
        }
        return true;
    }

    public GetPassword onExtraCallbackWithResult(List<GetKMCert> list, yzp2 yzp2Var, yzp2 yzp2Var2, GetSignCert getSignCert) {
        if (list == null || list.isEmpty()) {
            return GetPassword.BOGUS;
        }
        onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted(yzp2Var, yzp2Var2, list, getSignCert);
        GetPassword getPassword = onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult;
        GetPassword getPassword2 = GetPassword.SECURE;
        if (getPassword != getPassword2) {
            return onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult;
        }
        yzp2 yzp2VarOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresultOnWarmupCompleted.onExtraCallback);
        if (yzp2VarOnWarmupCompleted == null) {
            return GetPassword.BOGUS;
        }
        if (onNavigationEvent(yzp2VarOnWarmupCompleted, yzp2Var2, list, getSignCert) != null) {
            return (onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted.onNavigationEvent() & 1) == 1 ? GetPassword.INSECURE : getPassword2;
        }
        int i = getSignCert.IAuthTabCallback;
        if (i == -1) {
            return GetPassword.BOGUS;
        }
        if (i == 8) {
            return GetPassword.UNCHECKED;
        }
        return GetPassword.BOGUS;
    }

    public GetCertNum onWarmupCompleted(List<GetKMCert> list, yzp2 yzp2Var, int i, yzp2 yzp2Var2, GetSignCert getSignCert) {
        int i2;
        if (list == null || list.isEmpty()) {
            return new GetCertNum(GetPassword.BOGUS, 12, R.onExtraCallbackWithResult("failed.nsec3.none", new Object[0]));
        }
        sz3 sz3VarOnExtraCallbackWithResult = onExtraCallbackWithResult(yzp2Var, yzp2Var2, list, getSignCert);
        if (sz3VarOnExtraCallbackWithResult != null) {
            if (sz3VarOnExtraCallbackWithResult.onExtraCallback(i)) {
                return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("failed.nsec3.type_exists", new Object[0]));
            }
            if (sz3VarOnExtraCallbackWithResult.onExtraCallback(5)) {
                return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("failed.nsec3.cname_exists", new Object[0]));
            }
            if (i == 43 && sz3VarOnExtraCallbackWithResult.onExtraCallback(6) && !yzp2.IAuthTabCallback.equals(yzp2Var)) {
                return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("failed.nsec3.apex_abuse", new Object[0]));
            }
            if (i != 43 && sz3VarOnExtraCallbackWithResult.onExtraCallback(2) && !sz3VarOnExtraCallbackWithResult.onExtraCallback(6)) {
                if (!sz3VarOnExtraCallbackWithResult.onExtraCallback(43)) {
                    return new GetCertNum(GetPassword.INSECURE, -1, null);
                }
                return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("failed.nsec3.delegation", new Object[0]));
            }
            return new GetCertNum(GetPassword.SECURE, -1, null);
        }
        int i3 = getSignCert.IAuthTabCallback;
        if (i3 == -1) {
            return new GetCertNum(GetPassword.BOGUS, 6, R.onExtraCallbackWithResult("failed.nsec3.hash_errors", new Object[0]));
        }
        if (i3 == 8) {
            return new GetCertNum(GetPassword.UNCHECKED, -1, null);
        }
        onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted(yzp2Var, yzp2Var2, list, getSignCert);
        GetPassword getPassword = onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult;
        GetPassword getPassword2 = GetPassword.BOGUS;
        if (getPassword != getPassword2) {
            GetPassword getPassword3 = onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult;
            GetPassword getPassword4 = GetPassword.INSECURE;
            if (getPassword3 != getPassword4 || i == 43) {
                GetPassword getPassword5 = onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult;
                GetPassword getPassword6 = GetPassword.UNCHECKED;
                if (getPassword5 == getPassword6) {
                    return new GetCertNum(getPassword6, -1, null);
                }
                sz3 sz3VarOnExtraCallbackWithResult2 = onExtraCallbackWithResult(onWarmupCompleted(onextracallbackwithresultOnWarmupCompleted.onExtraCallback), yzp2Var2, list, getSignCert);
                if (sz3VarOnExtraCallbackWithResult2 != null) {
                    if (sz3VarOnExtraCallbackWithResult2.onExtraCallback(i)) {
                        lt54.onNavigationEvent(i);
                        return new GetCertNum(getPassword2, 6, R.onExtraCallbackWithResult("failed.nsec3.type_exists_wc", new Object[0]));
                    }
                    if (sz3VarOnExtraCallbackWithResult2.onExtraCallback(5)) {
                        return new GetCertNum(getPassword2, 6, R.onExtraCallbackWithResult("failed.nsec3.cname_exists_wc", new Object[0]));
                    }
                    if (i != 43) {
                        i2 = 43;
                    } else {
                        if (yzp2Var.IAuthTabCallback() != 1 && sz3VarOnExtraCallbackWithResult2.onExtraCallback(6)) {
                            return new GetCertNum(getPassword2, 6, R.onExtraCallbackWithResult("failed.nsec3.wc_soa", new Object[0]));
                        }
                        i2 = 43;
                    }
                    if (i == i2 || !sz3VarOnExtraCallbackWithResult2.onExtraCallback(2) || sz3VarOnExtraCallbackWithResult2.onExtraCallback(6)) {
                        if (onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted != null && (onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted.onNavigationEvent() & 1) == 1) {
                            return new GetCertNum(getPassword4, -1, null);
                        }
                        return new GetCertNum(GetPassword.SECURE, -1, null);
                    }
                    return new GetCertNum(getPassword2, 6, R.onExtraCallbackWithResult("failed.nsec3.delegation_wc", new Object[0]));
                }
                int i4 = getSignCert.IAuthTabCallback;
                if (i4 == -1) {
                    return new GetCertNum(getPassword2, 6, R.onExtraCallbackWithResult("failed.nsec3.wc.hash_errors", new Object[0]));
                }
                if (i4 != 8) {
                    if (onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted != null) {
                        if ((onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted.onNavigationEvent() & 1) != 0) {
                            return new GetCertNum(getPassword4, -1, null);
                        }
                        if (i != 43) {
                            return new GetCertNum(getPassword2, 6, R.onExtraCallbackWithResult("failed.nsec3.not_optout", new Object[0]));
                        }
                        return new GetCertNum(getPassword2, 12, R.onExtraCallbackWithResult("failed.nsec3.not_found", new Object[0]));
                    }
                    return new GetCertNum(getPassword2, 12, R.onExtraCallbackWithResult("failed.nsec3.no_next", new Object[0]));
                }
                return new GetCertNum(getPassword6, -1, null);
            }
            return new GetCertNum(getPassword4, -1, null);
        }
        return new GetCertNum(getPassword2, 6, R.onExtraCallbackWithResult("failed.nsec3.qname_ce", new Object[0]));
    }

    public GetPassword onWarmupCompleted(List<GetKMCert> list, yzp2 yzp2Var, yzp2 yzp2Var2, yzp2 yzp2Var3, GetSignCert getSignCert) {
        if (list == null || list.isEmpty() || yzp2Var == null || yzp2Var3 == null) {
            return GetPassword.BOGUS;
        }
        sz3 sz3Var = null;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(new yzp2(yzp2Var3, 1), sz3Var);
        onextracallbackwithresult.onWarmupCompleted = onNavigationEvent(onExtraCallbackWithResult(yzp2Var, onextracallbackwithresult.onExtraCallback), yzp2Var2, list, getSignCert);
        if (onextracallbackwithresult.onWarmupCompleted == null) {
            new Object[]{yzp2Var, onextracallbackwithresult.onExtraCallback, yzp2Var3};
            return GetPassword.BOGUS;
        }
        if ((onextracallbackwithresult.onWarmupCompleted.onNavigationEvent() & 1) == 1) {
            return GetPassword.INSECURE;
        }
        return GetPassword.SECURE;
    }

    public GetPassword onWarmupCompleted(List<GetKMCert> list, yzp2 yzp2Var, yzp2 yzp2Var2, GetSignCert getSignCert) {
        if (list == null || list.isEmpty()) {
            return GetPassword.BOGUS;
        }
        sz3 sz3VarOnExtraCallbackWithResult = onExtraCallbackWithResult(yzp2Var, yzp2Var2, list, getSignCert);
        if (sz3VarOnExtraCallbackWithResult != null) {
            if (sz3VarOnExtraCallbackWithResult.onExtraCallback(6) || sz3VarOnExtraCallbackWithResult.onExtraCallback(43)) {
                return GetPassword.BOGUS;
            }
            if (!sz3VarOnExtraCallbackWithResult.onExtraCallback(2)) {
                return GetPassword.INDETERMINATE;
            }
            return GetPassword.SECURE;
        }
        onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted(yzp2Var, yzp2Var2, list, getSignCert);
        if (onextracallbackwithresultOnWarmupCompleted.onExtraCallbackWithResult == GetPassword.SECURE) {
            if ((onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted.onNavigationEvent() & 1) != 1) {
                return GetPassword.BOGUS;
            }
            return GetPassword.INSECURE;
        }
        return GetPassword.BOGUS;
    }
}
