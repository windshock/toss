package com.initech.inisafesign.util;

import com.initech.core.crypto.INICipher;
import com.initech.core.util.LogUtil;
import com.initech.inibase.logger.Logger;
import com.initech.pki.util.Base64Util;
import com.initech.pki.util.Hex;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class Encrypt_pw {
    private Logger a = Logger.getLogger(getClass());
    public String algName = "SEED/CBC/PKCS5Padding";
    private INICipher b = new INICipher();

    public byte[] encrypt(String str) {
        try {
            String str2 = System.currentTimeMillis() + "1234561";
            this.a.debug("systime: " + str2);
            return Base64Util.encode(new INICipher().doPassword_encrypt(str2 + str, this.algName), false);
        } catch (Exception e) {
            this.a.error("msg: " + str);
            LogUtil.writeStackTrace(this.a, e);
            return null;
        }
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return this.b.Symmetric_decrypt(this.b.Symmetric_makeSessionKey(bArr, "SEED"), bArr2, this.algName, Base64Util.decode(bArr3));
        } catch (Exception e) {
            this.a.error("key: " + Hex.dumpHex(bArr));
            this.a.error("iv: " + Hex.dumpHex(bArr2));
            this.a.error("enc: " + Hex.dumpHex(bArr3));
            this.a.error(">>>>>>>>>> 복호화에 실패했습니다.(키가 잘못되었습니다.)");
            LogUtil.writeStackTrace(this.a, e);
            return new byte[0];
        }
    }

    public byte[] decrypt(byte[] bArr) {
        try {
            byte[] bArrDoPassword_decrypt = this.b.doPassword_decrypt(Base64Util.decode(bArr), this.algName);
            byte[] bArr2 = new byte[bArrDoPassword_decrypt.length - 20];
            System.arraycopy(bArrDoPassword_decrypt, 20, bArr2, 0, bArrDoPassword_decrypt.length - 20);
            return bArr2;
        } catch (Exception e) {
            this.a.error(">>>>>>>>>> 복호화에 실패했습니다.(키가 잘못되었습니다.)");
            LogUtil.writeStackTrace(this.a, e);
            return new byte[0];
        }
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length != 1) {
            System.out.println("Usage: java Encrypt_pw [encrypt|decrypt]");
            return;
        }
        Encrypt_pw encrypt_pw = new Encrypt_pw();
        if (strArr[0].equalsIgnoreCase("encrypt")) {
            System.out.print("Enter Password : ");
            String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
            String str = new String(encrypt_pw.encrypt(line));
            System.out.println();
            System.out.println("Inputed Password : [" + line + "]");
            System.out.println("Encrypted Password : [" + str + "]");
            return;
        }
        if (strArr[0].equalsIgnoreCase("decrypt")) {
            System.out.print("Enter Encrypted Password : ");
            String line2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
            String str2 = new String(encrypt_pw.decrypt(line2.getBytes()));
            System.out.println();
            System.out.println("Encrypted Password : [" + line2 + "]");
            System.out.println("Decrytped Password : [" + str2 + "]");
            return;
        }
        System.out.println("Usage: java Encrypt_pw [encrypt|decrypt]");
    }
}
