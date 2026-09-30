package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.google.android.exoplayer2.util.Util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspAuthenticationInfo {
    private static final String ALGORITHM = "MD5";
    public static final int BASIC = 1;
    private static final String BASIC_AUTHORIZATION_HEADER_FORMAT = "Basic %s";
    public static final int DIGEST = 2;
    private static final String DIGEST_AUTHORIZATION_HEADER_FORMAT = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"";
    private static final String DIGEST_AUTHORIZATION_HEADER_FORMAT_WITH_OPAQUE = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"";
    public final int authenticationMechanism;
    public final String nonce;
    public final String opaque;
    public final String realm;

    public RtspAuthenticationInfo(int i2, String str, String str2, String str3) {
        this.authenticationMechanism = i2;
        this.realm = str;
        this.nonce = str2;
        this.opaque = str3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    public String getAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo, Uri uri, int i2) throws ParserException {
        int i3 = this.authenticationMechanism;
        if (i3 == 1) {
            return getBasicAuthorizationHeaderValue(rtspAuthUserInfo);
        }
        if (i3 == 2) {
            return getDigestAuthorizationHeaderValue(rtspAuthUserInfo, uri, i2);
        }
        throw ParserException.createForManifestWithUnsupportedFeature((String) null, new UnsupportedOperationException());
    }

    private String getBasicAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo) {
        return Util.formatInvariant(BASIC_AUTHORIZATION_HEADER_FORMAT, new Object[]{Base64.encodeToString(RtspMessageUtil.getStringBytes(rtspAuthUserInfo.username + ":" + rtspAuthUserInfo.password), 0)});
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private String getDigestAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo, Uri uri, int i2) throws ParserException, NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
            String methodString = RtspMessageUtil.toMethodString(i2);
            String hexString = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(rtspAuthUserInfo.username + ":" + this.realm + ":" + rtspAuthUserInfo.password)));
            StringBuilder sb = new StringBuilder();
            sb.append(methodString);
            sb.append(":");
            sb.append(uri);
            String hexString2 = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(hexString + ":" + this.nonce + ":" + Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(sb.toString()))))));
            if (this.opaque.isEmpty()) {
                return Util.formatInvariant(DIGEST_AUTHORIZATION_HEADER_FORMAT, new Object[]{rtspAuthUserInfo.username, this.realm, this.nonce, uri, hexString2});
            }
            return Util.formatInvariant(DIGEST_AUTHORIZATION_HEADER_FORMAT_WITH_OPAQUE, new Object[]{rtspAuthUserInfo.username, this.realm, this.nonce, uri, hexString2, this.opaque});
        } catch (NoSuchAlgorithmException e) {
            throw ParserException.createForManifestWithUnsupportedFeature((String) null, e);
        }
    }
}
