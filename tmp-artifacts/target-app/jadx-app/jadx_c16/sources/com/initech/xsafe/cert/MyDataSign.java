package com.initech.xsafe.cert;

import com.initech.asn1.ASN1Exception;
import com.initech.asn1.DEREncoder;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class MyDataSign {
    public static final /* synthetic */ boolean a = true;

    public final byte[] a(String str) {
        UCPIDRequestInfo uCPIDRequestInfoA = a(new JSONObject(str));
        DEREncoder dEREncoder = new DEREncoder();
        uCPIDRequestInfoA.encode(dEREncoder);
        return dEREncoder.toByteArray();
    }

    public void requestJsonParse(String str, b bVar) throws JSONException, ASN1Exception {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ucpidRequestInfo");
            Objects.requireNonNull(jSONObjectOptJSONObject);
            String string = jSONObjectOptJSONObject.toString();
            a aVar = new a();
            aVar.a(jSONObject.optString("orgCode"));
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("consentInfo");
            Objects.requireNonNull(jSONObjectOptJSONObject2);
            aVar.a(jSONObjectOptJSONObject2.toString().getBytes());
            aVar.b(a(string));
            arrayList.add(aVar);
        }
        bVar.a(arrayList);
    }

    public final UCPIDRequestInfo a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("userAgreement");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("userAgreeInfo");
        String strOptString2 = jSONObject.optString("ispUrlInfo");
        String strOptString3 = jSONObject.optString("ucpidNonce");
        if (!a && jSONObjectOptJSONObject == null) {
            throw new AssertionError();
        }
        UCPIDPersonInfo uCPIDPersonInfoA = a(strOptString, jSONObjectOptJSONObject);
        UCPIDRequestInfo uCPIDRequestInfo = new UCPIDRequestInfo();
        uCPIDRequestInfo.setUcpidNonce(strOptString3.getBytes());
        uCPIDRequestInfo.setPersonInfoReq(uCPIDPersonInfoA);
        uCPIDRequestInfo.setVersion(2);
        uCPIDRequestInfo.setModuleName("INISAFE_UCPID_Client");
        uCPIDRequestInfo.setModuleVendorName("INITECH");
        uCPIDRequestInfo.setModuleVersionMajor(2);
        uCPIDRequestInfo.setModuleVersionMinor(0);
        uCPIDRequestInfo.setModuleVersionBuild(0);
        uCPIDRequestInfo.setModuleVersionRevision(0);
        uCPIDRequestInfo.setIspUrlInfo(strOptString2);
        return uCPIDRequestInfo;
    }

    public final UCPIDPersonInfo a(String str, JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean("realName");
        boolean zOptBoolean2 = jSONObject.optBoolean("gender");
        boolean zOptBoolean3 = jSONObject.optBoolean("nationalInfo");
        boolean zOptBoolean4 = jSONObject.optBoolean("birthDate");
        boolean zOptBoolean5 = jSONObject.optBoolean("ci");
        UCPIDPersonInfo uCPIDPersonInfo = new UCPIDPersonInfo();
        uCPIDPersonInfo.setUserAgreement(str);
        uCPIDPersonInfo.setAgreeRealName(zOptBoolean);
        uCPIDPersonInfo.setAgreeGender(zOptBoolean2);
        uCPIDPersonInfo.setAgreeNationalInfo(zOptBoolean3);
        uCPIDPersonInfo.setAgreeBirthDate(zOptBoolean4);
        uCPIDPersonInfo.setAgreeCI(zOptBoolean5);
        return uCPIDPersonInfo;
    }
}
