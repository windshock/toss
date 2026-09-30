package o;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GetSignCert {
    private static final TRANS_VeriSign_SignedData onExtraCallbackWithResult = new TRANS_VeriSign_SignedData("0123456789ABCDEFGHIJKLMNOPQRSTUV=", false, false);
    int IAuthTabCallback;
    int onExtraCallback;
    private final Map<String, onExtraCallback> onNavigationEvent = new HashMap();

    GetSignCert() {
    }

    public onExtraCallback onNavigationEvent(sz3 sz3Var, yzp2 yzp2Var) throws NoSuchAlgorithmException {
        String strIAuthTabCallback = IAuthTabCallback(sz3Var, yzp2Var);
        onExtraCallback onextracallback = this.onNavigationEvent.get(strIAuthTabCallback);
        if (onextracallback != null) {
            return onextracallback;
        }
        onExtraCallback onextracallback2 = new onExtraCallback(sz3Var.IAuthTabCallback(yzp2Var));
        this.onNavigationEvent.put(strIAuthTabCallback, onextracallback2);
        this.IAuthTabCallback++;
        return onextracallback2;
    }

    static class onExtraCallback {
        private String IAuthTabCallback;
        private final byte[] onNavigationEvent;

        public onExtraCallback(byte[] bArr) {
            this.onNavigationEvent = bArr;
        }

        public byte[] onExtraCallback() {
            return this.onNavigationEvent;
        }

        String IAuthTabCallback() {
            if (this.IAuthTabCallback == null) {
                this.IAuthTabCallback = GetSignCert.onExtraCallbackWithResult.onWarmupCompleted(this.onNavigationEvent);
            }
            return this.IAuthTabCallback;
        }
    }

    private String IAuthTabCallback(sz3 sz3Var, yzp2 yzp2Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(yzp2Var);
        sb.append("/");
        sb.append(sz3Var.onExtraCallbackWithResult());
        sb.append("/");
        sb.append(sz3Var.onExtraCallback());
        sb.append("/");
        sb.append(sz3Var.onTransact() == null ? "-" : new BigInteger(sz3Var.onTransact()).toString());
        return sb.toString();
    }
}
