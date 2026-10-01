package com.tmoney.utils;

import android.text.TextUtils;
import com.tmoney.d.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CryptoHelper {
    public static String decode(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            a aVar = a.getInstance();
            if (aVar.ivByteKey() != null && aVar.cryptoHelperByteKey() != null) {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(aVar.ivByteKey());
                SecretKeySpec secretKeySpec = new SecretKeySpec(aVar.cryptoHelperByteKey(), aVar.sdkAlgorithm());
                Cipher cipher = Cipher.getInstance(aVar.sdkTransformation());
                cipher.init(2, secretKeySpec, ivParameterSpec);
                return new String(cipher.doFinal(ByteHelper.hexStringToByteArray(str)));
            }
            return "";
        } catch (Exception e) {
            LogHelper.e("CryptoHelper", "decode::" + LogHelper.printStackTraceToString(e));
            return "";
        }
    }

    public static String encode(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            a aVar = a.getInstance();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(aVar.ivByteKey());
            SecretKeySpec secretKeySpec = new SecretKeySpec(aVar.cryptoHelperByteKey(), aVar.sdkAlgorithm());
            Cipher cipher = Cipher.getInstance(aVar.sdkTransformation());
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return ByteHelper.byteArrayToHexString(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            LogHelper.e("CryptoHelper", "encode::" + LogHelper.printStackTraceToString(e));
            return "";
        }
    }

    public static String logEncode(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            a aVar = a.getInstance();
            Cipher cipher = Cipher.getInstance(aVar.logTransformation());
            cipher.init(1, new SecretKeySpec(aVar.logKey(), aVar.logAlgorithm()));
            return ByteHelper.byteArrayToHexString(cipher.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return "";
        }
    }
}
