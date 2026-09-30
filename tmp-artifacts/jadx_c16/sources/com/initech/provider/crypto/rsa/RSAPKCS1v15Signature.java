package com.initech.provider.crypto.rsa;

import com.initech.cryptox.Signature;
import com.initech.provider.crypto.InitechProvider;
import com.initech.provider.crypto.md.SHA1;
import com.initech.provider.crypto.md.SHA224;
import com.initech.provider.crypto.md.SHA256;
import com.initech.provider.crypto.md.SHA384;
import com.initech.provider.crypto.md.SHA512;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class RSAPKCS1v15Signature extends Signature {
    private MessageDigest hash;
    private String hashAlg;
    private EMSAPKCS15Codec pkcs1;
    private RSAPrivateKey privateKey;
    private RSAPublicKey publicKey;

    public Object _engineGetParameter(String str) throws InvalidParameterException {
        return null;
    }

    public void _engineSetParameter(String str, Object obj) throws InvalidParameterException {
    }

    public RSAPKCS1v15Signature() throws NoSuchAlgorithmException, NoSuchProviderException {
        this("SHA-256");
    }

    public RSAPKCS1v15Signature(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        super(str + "withRSAPKCS1v1_5");
        this.hashAlg = str;
        if (str.equalsIgnoreCase("SHA1")) {
            this.hash = new SHA1();
            this.pkcs1 = new EMSAPKCS15Codec(this.hash);
            return;
        }
        if (str.equalsIgnoreCase("SHA-224") || str.equalsIgnoreCase("SHA224")) {
            this.hash = new SHA224();
            this.pkcs1 = new EMSAPKCS15Codec(this.hash);
            return;
        }
        if (str.equalsIgnoreCase("SHA-256") || str.equalsIgnoreCase("SHA256")) {
            this.hash = new SHA256();
            this.pkcs1 = new EMSAPKCS15Codec(this.hash);
            return;
        }
        if (str.equalsIgnoreCase("SHA-384") || str.equalsIgnoreCase("SHA384")) {
            this.hash = new SHA384();
            this.pkcs1 = new EMSAPKCS15Codec(this.hash);
        } else if (str.equalsIgnoreCase("SHA-512") || str.equalsIgnoreCase("SHA512")) {
            this.hash = new SHA512();
            this.pkcs1 = new EMSAPKCS15Codec(this.hash);
        } else {
            this.hash = MessageDigest.getInstance(str, InitechProvider.NAME);
            this.pkcs1 = new EMSAPKCS15Codec(this.hash);
        }
    }

    public void _engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            this.privateKey = (RSAPrivateKey) privateKey;
            this.hash.reset();
            return;
        }
        throw new InvalidKeyException();
    }

    public void _engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof RSAPublicKey) {
            this.publicKey = (RSAPublicKey) publicKey;
            this.hash.reset();
            return;
        }
        throw new InvalidKeyException();
    }

    public byte[] _engineSign() throws SignatureException {
        byte[] bArrEncode = null;
        try {
            try {
                int iBitLength = (this.privateKey.getModulus().bitLength() + 7) / 8;
                bArrEncode = this.pkcs1.encode(this.hash.digest(), iBitLength);
                return I2OSP(RSADP(new BigInteger(1, bArrEncode)), iBitLength);
            } catch (Exception unused) {
                throw new SignatureException();
            }
        } finally {
            if (bArrEncode != null) {
                Arrays.fill(bArrEncode, (byte) 0);
            }
        }
    }

    private BigInteger RSADP(BigInteger bigInteger) {
        BigInteger modulus = this.privateKey.getModulus();
        if (bigInteger.compareTo(BigInteger.ZERO) < 0 || bigInteger.compareTo(modulus.subtract(BigInteger.ONE)) > 0) {
            throw new IllegalArgumentException();
        }
        return bigInteger.modPow(this.privateKey.getPrivateExponent(), this.privateKey.getModulus());
    }

    private BigInteger RSAEP(BigInteger bigInteger) {
        BigInteger modulus = this.publicKey.getModulus();
        if (bigInteger.compareTo(BigInteger.ZERO) < 0 || bigInteger.compareTo(modulus.subtract(BigInteger.ONE)) > 0) {
            throw new IllegalArgumentException();
        }
        return bigInteger.modPow(this.publicKey.getPublicExponent(), modulus);
    }

    public byte[] I2OSP(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
            return bArr;
        }
        if (byteArray.length <= i) {
            return byteArray;
        }
        int length = byteArray.length - i;
        for (int i2 = 0; i2 < length; i2++) {
            if (byteArray[i2] != 0) {
                throw new IllegalArgumentException("integer too large");
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(byteArray, length, bArr2, 0, i);
        return bArr2;
    }

    public void _engineUpdate(byte b) throws SignatureException {
        this.hash.update(b);
    }

    public void _engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.hash.update(bArr, i, i2);
    }

    public boolean _engineVerify(byte[] bArr) throws SignatureException {
        int iBitLength = (this.publicKey.getModulus().bitLength() + 7) / 8;
        if (bArr.length != iBitLength) {
            return false;
        }
        return Arrays.equals(I2OSP(RSAEP(new BigInteger(1, bArr)), iBitLength), this.pkcs1.encode(this.hash.digest(), iBitLength));
    }
}
