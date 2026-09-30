package o;

import java.util.List;
import org.xbill.DNS.Record;
import org.xbill.DNS.dnssec.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class JCertTransfer extends GetKMCert {
    private static final AppSetIdAndScope1 onNavigationEvent = ea10.onWarmupCompleted(JCertTransfer.class);
    private final List<Integer> algo;
    private String badReason;
    private int edeReason;
    private boolean isEmpty;

    @Override // o.GetKMCert
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JCertTransfer)) {
            return false;
        }
        JCertTransfer jCertTransfer = (JCertTransfer) obj;
        if (!jCertTransfer.onWarmupCompleted(this) || !super.equals(obj) || this.edeReason != jCertTransfer.edeReason || this.isEmpty != jCertTransfer.isEmpty) {
            return false;
        }
        String str = this.badReason;
        String str2 = jCertTransfer.badReason;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // o.GetKMCert
    public int hashCode() {
        int iHashCode = super.hashCode();
        int i = this.edeReason;
        int i2 = this.isEmpty ? 79 : 97;
        String str = this.badReason;
        return (((((iHashCode * 59) + i) * 59) + i2) * 59) + (str == null ? 43 : str.hashCode());
    }

    @Override // o.GetKMCert
    public boolean onWarmupCompleted(Object obj) {
        return obj instanceof JCertTransfer;
    }

    public List<Integer> onExtraCallbackWithResult() {
        return this.algo;
    }

    private JCertTransfer(GetKMCert getKMCert) {
        this(getKMCert, null);
    }

    private JCertTransfer(GetKMCert getKMCert, List<Integer> list) {
        super(getKMCert);
        this.edeReason = -1;
        this.algo = list;
    }

    private JCertTransfer(yzp2 yzp2Var, int i, long j, boolean z) {
        super(new GetKMCert(Record.onExtraCallbackWithResult(yzp2Var, 48, i, j)));
        this.edeReason = -1;
        this.isEmpty = true;
        this.algo = null;
        if (z) {
            onExtraCallback(GetPassword.BOGUS);
        }
    }

    public static JCertTransfer onExtraCallback(GetKMCert getKMCert) {
        return new JCertTransfer(getKMCert);
    }

    public static JCertTransfer onExtraCallbackWithResult(GetKMCert getKMCert, List<Integer> list) {
        return new JCertTransfer(getKMCert, list);
    }

    public static JCertTransfer IAuthTabCallback(yzp2 yzp2Var, int i, long j) {
        return new JCertTransfer(yzp2Var, i, j, false);
    }

    public static JCertTransfer onWarmupCompleted(yzp2 yzp2Var, int i, long j) {
        return new JCertTransfer(yzp2Var, i, j, true);
    }

    public boolean getInterfaceDescriptor() {
        return this.isEmpty && IAuthTabCallback_Parcel() == GetPassword.UNCHECKED;
    }

    public boolean onNavigationEvent() {
        return this.isEmpty && IAuthTabCallback_Parcel() == GetPassword.BOGUS;
    }

    public boolean access000() {
        return !this.isEmpty && IAuthTabCallback_Parcel() == GetPassword.SECURE;
    }

    public void onNavigationEvent(int i, String str) {
        this.edeReason = i;
        this.badReason = str;
    }

    GetCertNum IAuthTabCallback(GetKMCert getKMCert) {
        if (getKMCert.ICustomTabsCallback() == null) {
            if (getKMCert.onExtraCallback() == 5 && getKMCert.IAuthTabCallback_Parcel() == GetPassword.SECURE) {
                return new GetCertNum(getKMCert.IAuthTabCallback_Parcel(), -1, null);
            }
            new Object[]{getKMCert.asInterface(), ryzbycx.onWarmupCompleted(getKMCert.onTransact()), lt54.onNavigationEvent(getKMCert.onExtraCallback())};
            if (getInterfaceDescriptor()) {
                String strOnExtraCallbackWithResult = this.badReason;
                if (strOnExtraCallbackWithResult == null) {
                    strOnExtraCallbackWithResult = R.onExtraCallbackWithResult("validate.insecure_unsigned", new Object[0]);
                }
                return new GetCertNum(GetPassword.INSECURE, this.edeReason, strOnExtraCallbackWithResult);
            }
            if (access000()) {
                return new GetCertNum(GetPassword.BOGUS, 10, R.onExtraCallbackWithResult("validate.bogus.missingsig", new Object[0]));
            }
            return new GetCertNum(GetPassword.BOGUS, this.edeReason, R.onExtraCallbackWithResult("validate.bogus", this.badReason));
        }
        if (onNavigationEvent()) {
            return new GetCertNum(GetPassword.BOGUS, this.edeReason, R.onExtraCallbackWithResult("validate.bogus.badkey", asInterface(), this.badReason));
        }
        if (!getInterfaceDescriptor()) {
            return null;
        }
        String strOnExtraCallbackWithResult2 = this.badReason;
        if (strOnExtraCallbackWithResult2 == null) {
            strOnExtraCallbackWithResult2 = R.onExtraCallbackWithResult("validate.insecure", new Object[0]);
        }
        return new GetCertNum(GetPassword.INSECURE, this.edeReason, strOnExtraCallbackWithResult2);
    }
}
