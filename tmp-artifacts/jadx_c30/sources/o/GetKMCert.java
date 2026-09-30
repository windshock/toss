package o;

import java.util.List;
import org.xbill.DNS.RRSIGRecord;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GetKMCert extends RRset {
    private yzp2 ownerName;
    private GetPassword securityStatus;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetKMCert)) {
            return false;
        }
        GetKMCert getKMCert = (GetKMCert) obj;
        if (!getKMCert.onWarmupCompleted(this) || !super.equals(obj)) {
            return false;
        }
        GetPassword getPasswordIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        GetPassword getPasswordIAuthTabCallback_Parcel2 = getKMCert.IAuthTabCallback_Parcel();
        if (getPasswordIAuthTabCallback_Parcel != null ? !getPasswordIAuthTabCallback_Parcel.equals(getPasswordIAuthTabCallback_Parcel2) : getPasswordIAuthTabCallback_Parcel2 != null) {
            return false;
        }
        yzp2 yzp2Var = this.ownerName;
        yzp2 yzp2Var2 = getKMCert.ownerName;
        return yzp2Var != null ? yzp2Var.equals(yzp2Var2) : yzp2Var2 == null;
    }

    public int hashCode() {
        int iHashCode = super.hashCode();
        GetPassword getPasswordIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int iHashCode2 = getPasswordIAuthTabCallback_Parcel == null ? 43 : getPasswordIAuthTabCallback_Parcel.hashCode();
        yzp2 yzp2Var = this.ownerName;
        return (((iHashCode * 59) + iHashCode2) * 59) + (yzp2Var != null ? yzp2Var.hashCode() : 43);
    }

    public boolean onWarmupCompleted(Object obj) {
        return obj instanceof GetKMCert;
    }

    public GetKMCert() {
        this.securityStatus = GetPassword.UNCHECKED;
    }

    public GetKMCert(Record record) {
        super(record);
        this.securityStatus = GetPassword.UNCHECKED;
    }

    public GetKMCert(RRset rRset) {
        super(rRset);
        this.securityStatus = GetPassword.UNCHECKED;
    }

    public GetKMCert(GetKMCert getKMCert) {
        super(getKMCert);
        this.securityStatus = getKMCert.securityStatus;
        this.ownerName = getKMCert.ownerName;
    }

    public GetPassword IAuthTabCallback_Parcel() {
        return this.securityStatus;
    }

    public void onExtraCallback(GetPassword getPassword) {
        this.securityStatus = getPassword;
    }

    public yzp2 ICustomTabsCallback() {
        List listIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        if (listIAuthTabCallbackStubProxy.isEmpty()) {
            return null;
        }
        return ((RRSIGRecord) listIAuthTabCallbackStubProxy.get(0)).asBinder();
    }

    public yzp2 asInterface() {
        yzp2 yzp2Var = this.ownerName;
        return yzp2Var == null ? super.asInterface() : yzp2Var;
    }

    public void onExtraCallbackWithResult(yzp2 yzp2Var) {
        this.ownerName = yzp2Var;
    }
}
