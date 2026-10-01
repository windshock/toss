package okhttp3.internal;

import java.io.EOFException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.TTBaseActivity;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class _HostnamesCommonKt {
    private static final Regex VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return VERIFY_AS_IP_ADDRESS.onExtraCallbackWithResult(str);
    }

    public static final boolean containsInvalidLabelLengths(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        if (length > 0 && length < 254) {
            int i = 0;
            while (true) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '.', i, false, 4, (Object) null);
                int length2 = iIndexOf$default == -1 ? str.length() - i : iIndexOf$default - i;
                if (length2 <= 0 || length2 >= 64) {
                    break;
                }
                if (iIndexOf$default == -1 || iIndexOf$default == str.length() - 1) {
                    break;
                }
                i = iIndexOf$default + 1;
            }
            return false;
        }
        return true;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0 || StringsKt__StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r13 == 16) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r14 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        r0 = kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r9, r9, 16 - (r13 - r14), r14, r13);
        kotlin.collections.ArraysKt___ArraysJvmKt.fill(r9, (byte) 0, r14, (16 - r13) + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] decodeIpv6(@NotNull String str, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            if (i4 < i2) {
                if (i7 != 16) {
                    int i8 = i4 + 2;
                    if (i8 <= i2 && StringsKt__StringsJVMKt.startsWith$default(str, "::", i4, false, 4, null)) {
                        if (i5 == -1) {
                            i7 += 2;
                            if (i8 != i2) {
                                i6 = i8;
                                i5 = i7;
                                i4 = i6;
                                int i9 = 0;
                                while (i4 < i2) {
                                }
                                i3 = i4 - i6;
                                if (i3 == 0) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i5 = i7;
                            break;
                        }
                        return null;
                    }
                    if (i7 != 0) {
                        if (StringsKt__StringsJVMKt.startsWith$default(str, ":", i4, false, 4, null)) {
                            i4++;
                        } else {
                            if (!StringsKt__StringsJVMKt.startsWith$default(str, ".", i4, false, 4, null) || !decodeIpv4Suffix(str, i6, i2, bArr, i7 - 2)) {
                                return null;
                            }
                            i7 += 2;
                        }
                    }
                    i6 = i4;
                    i4 = i6;
                    int i92 = 0;
                    while (i4 < i2) {
                        int hexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i4));
                        if (hexDigit == -1) {
                            break;
                        }
                        i92 = (i92 << 4) + hexDigit;
                        i4++;
                    }
                    i3 = i4 - i6;
                    if (i3 == 0 || i3 > 4) {
                        break;
                    }
                    bArr[i7] = (byte) (i92 >>> 8);
                    bArr[i7 + 1] = (byte) i92;
                    i7 += 2;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    public static final boolean decodeIpv4Suffix(@NotNull String str, int i, int i2, @NotNull byte[] bArr, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    public static final String inet6AddressToAscii(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        while (i2 < bArr.length) {
            if (i2 == i) {
                tTBaseActivity.onExtraCallbackWithResult(58);
                i2 += i4;
                if (i2 == 16) {
                    tTBaseActivity.onExtraCallbackWithResult(58);
                }
            } else {
                if (i2 > 0) {
                    tTBaseActivity.onExtraCallbackWithResult(58);
                }
                tTBaseActivity.access000((_UtilCommonKt.and(bArr[i2], 255) << 8) | _UtilCommonKt.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return tTBaseActivity.onRelationshipValidationResult();
    }

    public static final byte[] canonicalizeInetAddress(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return isMappedIpv4Address(bArr) ? ArraysKt___ArraysKt.sliceArray(bArr, RangesKt___RangesKt.until(12, 16)) : bArr;
    }

    private static final boolean isMappedIpv4Address(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    public static final String inet4AddressToAscii(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length != 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new TTBaseActivity().IAuthTabCallbackStubProxy(_UtilCommonKt.and(bArr[0], 255)).onExtraCallbackWithResult(46).IAuthTabCallbackStubProxy(_UtilCommonKt.and(bArr[1], 255)).onExtraCallbackWithResult(46).IAuthTabCallbackStubProxy(_UtilCommonKt.and(bArr[2], 255)).onExtraCallbackWithResult(46).IAuthTabCallbackStubProxy(_UtilCommonKt.and(bArr[3], 255)).onRelationshipValidationResult();
    }

    public static final String toCanonicalHost(@NotNull String str) {
        byte[] bArrDecodeIpv6;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
            if (StringsKt__StringsJVMKt.startsWith$default(str, "[", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(str, "]", false, 2, null)) {
                bArrDecodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                bArrDecodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (bArrDecodeIpv6 == null) {
                return null;
            }
            byte[] bArrCanonicalizeInetAddress = canonicalizeInetAddress(bArrDecodeIpv6);
            if (bArrCanonicalizeInetAddress.length == 16) {
                return inet6AddressToAscii(bArrCanonicalizeInetAddress);
            }
            if (bArrCanonicalizeInetAddress.length == 4) {
                return inet4AddressToAscii(bArrCanonicalizeInetAddress);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        String strIdnToAscii = idnToAscii(str);
        if (strIdnToAscii == null || strIdnToAscii.length() == 0 || containsInvalidHostnameAsciiCodes(strIdnToAscii) || containsInvalidLabelLengths(strIdnToAscii)) {
            return null;
        }
        return strIdnToAscii;
    }

    public static final String idnToAscii(@NotNull String str) throws EOFException {
        Intrinsics.checkNotNullParameter(str, "");
        TTBaseActivity tTBaseActivityOnExtraCallback = new TTBaseActivity().onExtraCallback(str);
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        while (!tTBaseActivityOnExtraCallback.IAuthTabCallback_Parcel()) {
            if (!IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(tTBaseActivityOnExtraCallback.ICustomTabsCallbackStub(), tTBaseActivity)) {
                return null;
            }
        }
        tTBaseActivityOnExtraCallback.onExtraCallback(_NormalizeJvmKt.normalizeNfc(tTBaseActivity.onRelationshipValidationResult()));
        Punycode punycode = Punycode.INSTANCE;
        String strDecode = punycode.decode(tTBaseActivityOnExtraCallback.onRelationshipValidationResult());
        if (strDecode != null && Intrinsics.areEqual(strDecode, _NormalizeJvmKt.normalizeNfc(strDecode))) {
            return punycode.encode(strDecode);
        }
        return null;
    }
}
