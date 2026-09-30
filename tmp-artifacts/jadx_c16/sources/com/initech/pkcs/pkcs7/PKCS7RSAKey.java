package com.initech.pkcs.pkcs7;

import com.initech.asn1.useful.IssuerAndSerialNumber;
import com.initech.pkcs.pkcs8.EncryptedPrivateKeyInfo;
import com.initech.pki.util.OpenSSLPEM;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PKCS7RSAKey implements PKCS7KeyManager {
    private List a;
    private List b;
    private List c;

    public PKCS7RSAKey() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public PKCS7RSAKey(String str, String str2, String str3) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        try {
            fileInputStream = new FileInputStream(str3);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (fileInputStream.available() > Integer.MAX_VALUE) {
                throw new IOException("파일의 크기가 너무 큽니다.");
            }
            int iAvailable = fileInputStream.available();
            if (iAvailable > Integer.MAX_VALUE || iAvailable < Integer.MIN_VALUE) {
                throw new IOException();
            }
            byte[] bArr = new byte[iAvailable];
            fileInputStream.read(bArr);
            X509Certificate x509CertificateLoadCertificate = loadCertificate(bArr);
            IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber();
            issuerAndSerialNumber.set(x509CertificateLoadCertificate);
            this.a.add(issuerAndSerialNumber);
            this.c.add(x509CertificateLoadCertificate);
            if (str != null) {
                this.b.add(loadPrivateKey(str, str2));
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public PKCS7RSAKey(String str, String str2, String str3, boolean z) throws Throwable {
        FileInputStream fileInputStream = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str3);
            try {
                int iAvailable = fileInputStream2.available();
                if (iAvailable > Integer.MAX_VALUE || iAvailable < Integer.MIN_VALUE) {
                    throw new IOException();
                }
                byte[] bArr = new byte[iAvailable];
                fileInputStream2.read(bArr);
                X509Certificate x509CertificateLoadCertificate = loadCertificate(bArr);
                IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber();
                issuerAndSerialNumber.set(x509CertificateLoadCertificate);
                this.a.add(issuerAndSerialNumber);
                this.c.add(x509CertificateLoadCertificate);
                if (str != null) {
                    this.b.add(z ? loadPrivateKey(str, str2) : loadUserPrivateKey(str, str2));
                }
                fileInputStream2.close();
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public PKCS7RSAKey(PrivateKey privateKey, X509Certificate x509Certificate) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber();
        issuerAndSerialNumber.set(x509Certificate);
        this.a.add(issuerAndSerialNumber);
        this.c.add(x509Certificate);
        if (privateKey != null) {
            this.b.add(privateKey);
        }
    }

    public PKCS7RSAKey(PrivateKey[] privateKeyArr, X509Certificate[] x509CertificateArr) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        for (int i = 0; i < privateKeyArr.length; i++) {
            IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber();
            issuerAndSerialNumber.set(x509CertificateArr[i]);
            this.a.add(issuerAndSerialNumber);
            this.c.add(x509CertificateArr[i]);
            this.b.add(privateKeyArr[i]);
        }
    }

    public static PrivateKey loadUserPrivateKey(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (IOException unused) {
            fileInputStream = null;
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            int iAvailable = fileInputStream.available();
            if (iAvailable > Integer.MAX_VALUE || iAvailable < Integer.MIN_VALUE) {
                throw new IOException("파일의 크기가 너무 큽니다.");
            }
            byte[] bArr = new byte[iAvailable];
            fileInputStream.read(bArr);
            PrivateKey decryptedPrivateKey = OpenSSLPEM.getDecryptedPrivateKey(new String(bArr), new PBEKeySpec(str2.toCharArray()));
            try {
                fileInputStream.close();
            } catch (Exception unused3) {
            }
            return decryptedPrivateKey;
        } catch (IOException unused4) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused5) {
                }
            }
            return null;
        } catch (Exception unused6) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused7) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused8) {
                }
            }
            throw th;
        }
    }

    @Override // com.initech.pkcs.pkcs7.PKCS7KeyManager
    public X509Certificate getCertificate(IssuerAndSerialNumber issuerAndSerialNumber) {
        if (issuerAndSerialNumber == null) {
            throw new IllegalArgumentException("IssuerAndSerialNumber parameter is null");
        }
        if (this.a.size() <= 0) {
            throw new IllegalStateException("empty issuerAndSerialNumber list");
        }
        int iIndexOf = this.a.indexOf(issuerAndSerialNumber);
        if (iIndexOf >= 0) {
            return (X509Certificate) this.c.get(iIndexOf);
        }
        return null;
    }

    @Override // com.initech.pkcs.pkcs7.PKCS7KeyManager
    public PrivateKey getPrivateKey(IssuerAndSerialNumber issuerAndSerialNumber) {
        if (issuerAndSerialNumber == null) {
            throw new IllegalArgumentException("IssuerAndSerialNumber parameter is null");
        }
        if (this.a.size() <= 0) {
            throw new IllegalStateException("empty issuerAndSerialNumber list");
        }
        int iIndexOf = this.a.indexOf(issuerAndSerialNumber);
        if (iIndexOf >= 0) {
            return (PrivateKey) this.b.get(iIndexOf);
        }
        return null;
    }

    protected X509Certificate loadCertificate(byte[] bArr) throws CertificateException, NoSuchProviderException {
        return (X509Certificate) CertificateFactory.getInstance("X.509", "Initech").generateCertificate(new ByteArrayInputStream(bArr));
    }

    protected PrivateKey loadPrivateKey(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        try {
            if (!new File(str).exists()) {
                throw new FileNotFoundException(str);
            }
            char[] charArray = str2.toCharArray();
            fileInputStream = new FileInputStream(str);
            try {
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                int iAvailable = dataInputStream.available();
                if (iAvailable > Integer.MAX_VALUE || iAvailable < Integer.MIN_VALUE) {
                    throw new IOException("데이터의 길이가 너무 긺");
                }
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                PrivateKey privateKeyDecrypt = new EncryptedPrivateKeyInfo(bArr).decrypt(new PBEKeySpec(charArray));
                fileInputStream.close();
                return privateKeyDecrypt;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public void setKey(X509Certificate x509Certificate, PrivateKey privateKey) {
        if (x509Certificate == null) {
            throw new IllegalArgumentException("X509Certificate parameter is null");
        }
        IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber();
        issuerAndSerialNumber.set(x509Certificate);
        this.a.add(issuerAndSerialNumber);
        this.c.add(x509Certificate);
        this.b.add(privateKey);
    }
}
