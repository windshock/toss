package org.jmrtd.protocol;

import java.io.Serializable;
import java.security.PublicKey;
import java.util.Arrays;
import net.sf.scuba.util.Hex;
import org.jmrtd.Util;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class AAResult implements Serializable {
    private static final long serialVersionUID = 8800803919646625713L;
    private byte[] challenge;
    private String digestAlgorithm;
    private PublicKey publicKey;
    private byte[] response;
    private String signatureAlgorithm;

    public AAResult(PublicKey publicKey, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.publicKey = publicKey;
        this.digestAlgorithm = str;
        this.signatureAlgorithm = str2;
        this.challenge = bArr;
        this.response = bArr2;
    }

    public byte[] getChallenge() {
        return this.challenge;
    }

    public byte[] getResponse() {
        return this.response;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public String getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public String toString() {
        return "AAResult [publicKey: " + Util.getDetailedPublicKeyAlgorithm(this.publicKey) + ", digestAlgorithm: " + this.digestAlgorithm + ", signatureAlgorithm: " + this.signatureAlgorithm + ", challenge: " + Hex.bytesToHexString(this.challenge) + ", response: " + Hex.bytesToHexString(this.response);
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.challenge);
        String str = this.digestAlgorithm;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        PublicKey publicKey = this.publicKey;
        int iHashCode3 = publicKey == null ? 0 : publicKey.hashCode();
        int iHashCode4 = Arrays.hashCode(this.response);
        String str2 = this.signatureAlgorithm;
        return ((((((((iHashCode + 1303377669) * 1991) + iHashCode2) * 1991) + iHashCode3) * 1991) + iHashCode4) * 1991) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AAResult aAResult = (AAResult) obj;
        if (!Arrays.equals(this.challenge, aAResult.challenge)) {
            return false;
        }
        String str = this.digestAlgorithm;
        if (str == null) {
            if (aAResult.digestAlgorithm != null) {
                return false;
            }
        } else if (!str.equals(aAResult.digestAlgorithm)) {
            return false;
        }
        PublicKey publicKey = this.publicKey;
        if (publicKey == null) {
            if (aAResult.publicKey != null) {
                return false;
            }
        } else if (!publicKey.equals(aAResult.publicKey)) {
            return false;
        }
        if (!Arrays.equals(this.response, aAResult.response)) {
            return false;
        }
        String str2 = this.signatureAlgorithm;
        if (str2 == null) {
            if (aAResult.signatureAlgorithm != null) {
                return false;
            }
        } else if (!str2.equals(aAResult.signatureAlgorithm)) {
            return false;
        }
        return true;
    }
}
