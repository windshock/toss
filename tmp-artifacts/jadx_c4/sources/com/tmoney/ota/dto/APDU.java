package com.tmoney.ota.dto;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class APDU implements Serializable {
    private String a;
    private String[] b;

    public APDU(String str, String... strArr) {
        this.a = str == null ? "" : str;
        this.b = strArr;
    }

    public String getCMD() {
        return this.a;
    }

    public String[] getSW() {
        return this.b;
    }

    public boolean isSuccess(String str) {
        for (String str2 : this.b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void setCMD(String str) {
        this.a = str;
    }

    public void setSW(String[] strArr) {
        this.b = strArr;
    }
}
