package com.skt.usp.tools.dao;

import com.skt.usp.UCPManagerConnection;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCPAppInfo extends AbstractDao {
    protected UCPManagerConnection m_oConnection;
    protected String m_strPkgName;
    protected String m_strStId;
    protected int m_strCnt = 1;
    protected boolean m_bCheckedRightment = false;

    public String getPkgName() {
        return this.m_strPkgName;
    }

    public String getNopKey() {
        return this.m_strStId;
    }

    public void setCheckedRightment(boolean z) {
        this.m_bCheckedRightment = z;
    }

    public boolean getCheckedRightment() {
        return this.m_bCheckedRightment;
    }

    public UCPManagerConnection getConnection() {
        return this.m_oConnection;
    }

    public UCPAppInfo(String str, String str2, UCPManagerConnection uCPManagerConnection) {
        this.m_strPkgName = str;
        this.m_strStId = str2;
        this.m_oConnection = uCPManagerConnection;
    }

    public int getM_strCnt() {
        return this.m_strCnt;
    }

    public void setM_strCnt(int i) {
        this.m_strCnt = i;
    }

    public int plusStrCnt() {
        int i = this.m_strCnt + 1;
        this.m_strCnt = i;
        return i;
    }

    public int minusStrCnt() {
        int i = this.m_strCnt - 1;
        this.m_strCnt = i;
        return i;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("UCPAppInfo [");
        String str3 = "";
        if (this.m_strPkgName != null) {
            str = "m_strPkgName=" + this.m_strPkgName + ", ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.m_strStId != null) {
            str2 = "m_strStId=" + this.m_strStId + ", ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("m_bCheckedRightment=");
        sb.append(this.m_bCheckedRightment);
        sb.append(", ");
        if (this.m_oConnection != null) {
            str3 = "m_oConnection=" + this.m_oConnection + ", ";
        }
        sb.append(str3);
        sb.append("m_strCnt=");
        sb.append(this.m_strCnt);
        sb.append("]");
        return sb.toString();
    }
}
