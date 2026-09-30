package com.initech.core.wrapper.pkcs.pkcs5;

import com.initech.core.INISAFECore;
import com.initech.core.exception.INICoreException;
import com.initech.core.util.LogUtil;
import com.initech.cryptox.SecretKeyFactory;
import com.initech.cryptox.util.Hex;
import com.initech.provider.crypto.InitechProvider;
import com.initech.provider.pkcs.pkcs5.PBEKey;
import com.initech.provider.pkcs.pkcs5.PBKDF1;
import com.initech.provider.pkcs.pkcs5.PBKDF2;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Mac;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PKCS5Manager {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.core.exception.INICoreException */
    public byte[] createDerivedKey1(String str, String str2, String str3, int i) throws INICoreException, NoSuchAlgorithmException {
        try {
            INISAFECore.CoreLogger(4, "salt: " + str);
            INISAFECore.CoreLogger(4, "passwd: " + str2);
            INISAFECore.CoreLogger(4, "hash: " + str3);
            INISAFECore.CoreLogger(4, "count: " + i);
            return new PBKDF1(new PBEKey(SecretKeyFactory.getInstance("PKCS5").generateSecret(new PBEKeySpec(str2.toCharArray())).getEncoded()), new PBEParameterSpec(str.getBytes(), i), MessageDigest.getInstance(str3), 16).process();
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str3 + ")");
            throw new INICoreException(e);
        } catch (InvalidKeySpecException e2) {
            INISAFECore.CoreLogger(1, "PKCS5 PBKDF1 형식의 키를 생성하는 중 오류가 발생했습니다. salt=[" + str + "], password=[" + str2 + "], hash=[" + str3 + "], count=[" + i + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new INICoreException(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.core.exception.INICoreException */
    public byte[] createDerivedKey1(byte[] bArr, String str, String str2, int i) throws INICoreException, NoSuchAlgorithmException {
        try {
            INISAFECore.CoreLogger(4, "salt: " + Hex.dumpHex(bArr));
            INISAFECore.CoreLogger(4, "passwd: " + str);
            INISAFECore.CoreLogger(4, "hash: " + str2);
            INISAFECore.CoreLogger(4, "count: " + i);
            return new PBKDF1(new PBEKey(SecretKeyFactory.getInstance("PKCS5").generateSecret(new PBEKeySpec(str.toCharArray())).getEncoded()), new PBEParameterSpec(bArr, i), MessageDigest.getInstance(str2), 16).process();
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str2 + ")");
            throw new INICoreException(e);
        } catch (InvalidKeySpecException e2) {
            INISAFECore.CoreLogger(1, "PKCS5 PBKDF1 형식의 키를 생성하는 중 오류가 발생했습니다. salt=[" + bArr + "], password=[" + str + "], hash=[" + str2 + "], count=[" + i + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new INICoreException(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.core.exception.INICoreException */
    public byte[] createDerivedKey1(byte[] bArr, String str, String str2, int i, int i2) throws INICoreException, NoSuchAlgorithmException {
        try {
            INISAFECore.CoreLogger(4, "salt: " + Hex.dumpHex(bArr));
            INISAFECore.CoreLogger(4, "passwd: " + str);
            INISAFECore.CoreLogger(4, "hash: " + str2);
            INISAFECore.CoreLogger(4, "count: " + i);
            return new PBKDF1(new PBEKey(SecretKeyFactory.getInstance("PKCS5").generateSecret(new PBEKeySpec(str.toCharArray())).getEncoded()), new PBEParameterSpec(bArr, i), MessageDigest.getInstance(str2), i2).process();
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str2 + ")");
            throw new INICoreException(e);
        } catch (InvalidKeySpecException e2) {
            INISAFECore.CoreLogger(1, "PKCS5 PBKDF1 형식의 키를 생성하는 중 오류가 발생했습니다. salt=[" + bArr + "], password=[" + str + "], hash=[" + str2 + "], count=[" + i + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new INICoreException(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.core.exception.INICoreException */
    public byte[] createDerivedKey2(String str, String str2, String str3, int i) throws INICoreException {
        try {
            INISAFECore.CoreLogger(4, "salt: " + str);
            INISAFECore.CoreLogger(4, "passwd: " + str2);
            INISAFECore.CoreLogger(4, "hash: " + str3);
            INISAFECore.CoreLogger(4, "count: " + i);
            return new PBKDF2(new PBEKey(SecretKeyFactory.getInstance("PKCS5").generateSecret(new PBEKeySpec(str2.toCharArray())).getEncoded()), new PBEParameterSpec(str.getBytes(), i), Mac.getInstance(str3, InitechProvider.NAME), 16).process();
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str3 + ")");
            throw new INICoreException(e);
        } catch (NoSuchProviderException e2) {
            throw new INICoreException(e2);
        } catch (InvalidKeySpecException e3) {
            INISAFECore.CoreLogger(1, "PKCS5 PBKDF2 형식의 키를 생성하는 중 오류가 발생했습니다. salt=[" + str + "], password=[" + str2 + "], hash=[" + str3 + "], count=[" + i + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e3);
            throw new INICoreException(e3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.core.exception.INICoreException */
    public byte[] createDerivedKey2(byte[] bArr, String str, String str2, int i) throws INICoreException {
        try {
            INISAFECore.CoreLogger(4, "salt: " + Hex.dumpHex(bArr));
            INISAFECore.CoreLogger(4, "passwd: " + str);
            INISAFECore.CoreLogger(4, "hash: " + str2);
            INISAFECore.CoreLogger(4, "count: " + i);
            return new PBKDF2(new PBEKey(SecretKeyFactory.getInstance("PKCS5").generateSecret(new PBEKeySpec(str.toCharArray())).getEncoded()), new PBEParameterSpec(bArr, i), Mac.getInstance(str2, InitechProvider.NAME), 16).process();
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str2 + ")");
            throw new INICoreException(e);
        } catch (NoSuchProviderException e2) {
            throw new INICoreException(e2);
        } catch (InvalidKeySpecException e3) {
            INISAFECore.CoreLogger(1, "PKCS5 PBKDF2 형식의 키를 생성하는 중 오류가 발생했습니다. salt=[" + bArr + "], password=[" + str + "], hash=[" + str2 + "], count=[" + i + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e3);
            throw new INICoreException(e3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.core.exception.INICoreException */
    public byte[] createDerivedKey2(byte[] bArr, String str, String str2, int i, int i2) throws INICoreException {
        try {
            INISAFECore.CoreLogger(4, "salt: " + Hex.dumpHex(bArr));
            INISAFECore.CoreLogger(4, "passwd: " + str);
            INISAFECore.CoreLogger(4, "hash: " + str2);
            INISAFECore.CoreLogger(4, "count: " + i);
            INISAFECore.CoreLogger(4, "ret_len: " + i2);
            return new PBKDF2(new PBEKey(SecretKeyFactory.getInstance("PKCS5").generateSecret(new PBEKeySpec(str.toCharArray())).getEncoded()), new PBEParameterSpec(bArr, i), Mac.getInstance(str2, InitechProvider.NAME), i2).process();
        } catch (NoSuchAlgorithmException e) {
            INISAFECore.CoreLogger(1, "지원하지 않는 알고리즘 입니다. (알고리즘: " + str2 + ")");
            throw new INICoreException(e);
        } catch (InvalidKeySpecException e2) {
            INISAFECore.CoreLogger(1, "PKCS5 PBKDF2 형식의 키를 생성하는 중 오류가 발생했습니다. salt=[" + bArr + "], password=[" + str + "], hash=[" + str2 + "], count=[" + i + "]");
            LogUtil.writeStackTrace(INISAFECore.CoreLogger, e2);
            throw new INICoreException(e2);
        } catch (Exception e3) {
            throw new INICoreException(e3);
        }
    }
}
