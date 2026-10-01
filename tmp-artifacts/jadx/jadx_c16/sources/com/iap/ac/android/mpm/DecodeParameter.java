package com.iap.ac.android.mpm;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class DecodeParameter {
    public String acDecodeConfigFromServer;
    public String codeValue;
    public String merchantType;
    public String scene = "from_scan";
    public String sourceAppPackageName;

    public String toString() {
        return String.format("DecodeParameter[code=%s,merchantType=%s,scene=%s,pkg=%s,config=%s]", this.codeValue, this.merchantType, this.scene, this.sourceAppPackageName, this.acDecodeConfigFromServer);
    }
}
