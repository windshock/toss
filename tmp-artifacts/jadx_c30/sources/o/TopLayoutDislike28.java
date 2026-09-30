package o;

import java.io.IOException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TopLayoutDislike28 {
    private static final int[] onExtraCallback = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] onExtraCallbackWithResult = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] onWarmupCompleted = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] IAuthTabCallback = {PKIFailureInfo.unsupportedVersion, 131076, 131075, 196610, PKIFailureInfo.unsupportedVersion, 131076, 131075, 262145, PKIFailureInfo.unsupportedVersion, 131076, 131075, 196610, PKIFailureInfo.unsupportedVersion, 131076, 131075, 262149};

    TopLayoutDislike28() {
    }

    private static int IAuthTabCallback(TopLayoutDislike23 topLayoutDislike23) {
        if (TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) == 0) {
            return 0;
        }
        int iIAuthTabCallback = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 3);
        if (iIAuthTabCallback == 0) {
            return 1;
        }
        return TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, iIAuthTabCallback) + (1 << iIAuthTabCallback);
    }

    private static void onNavigationEvent(TopLayoutDislike23 topLayoutDislike23, bindIconData bindicondata) {
        boolean z = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) == 1;
        bindicondata.ICustomTabsCallbackStub = z;
        bindicondata.newSession = 0;
        bindicondata.extraCommand = false;
        bindicondata.ICustomTabsService = false;
        if (!z || TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) == 0) {
            int iIAuthTabCallback = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 2) + 4;
            if (iIAuthTabCallback == 7) {
                bindicondata.ICustomTabsService = true;
                if (TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) != 0) {
                    throw new TopLayoutDislike26("Corrupted reserved bit");
                }
                int iIAuthTabCallback2 = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 2);
                if (iIAuthTabCallback2 == 0) {
                    return;
                }
                for (int i = 0; i < iIAuthTabCallback2; i++) {
                    int iIAuthTabCallback3 = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 8);
                    if (iIAuthTabCallback3 == 0 && i + 1 == iIAuthTabCallback2 && iIAuthTabCallback2 > 1) {
                        throw new TopLayoutDislike26("Exuberant nibble");
                    }
                    bindicondata.newSession = (iIAuthTabCallback3 << (i << 3)) | bindicondata.newSession;
                }
            } else {
                for (int i2 = 0; i2 < iIAuthTabCallback; i2++) {
                    int iIAuthTabCallback4 = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 4);
                    if (iIAuthTabCallback4 == 0 && i2 + 1 == iIAuthTabCallback && iIAuthTabCallback > 4) {
                        throw new TopLayoutDislike26("Exuberant nibble");
                    }
                    bindicondata.newSession = (iIAuthTabCallback4 << (i2 << 2)) | bindicondata.newSession;
                }
            }
            bindicondata.newSession++;
            if (bindicondata.ICustomTabsCallbackStub) {
                return;
            }
            bindicondata.extraCommand = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) == 1;
        }
    }

    private static int onExtraCallbackWithResult(int[] iArr, int i, TopLayoutDislike23 topLayoutDislike23) {
        long j = topLayoutDislike23.onExtraCallback;
        int i2 = topLayoutDislike23.onWarmupCompleted;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & GF2Field.MASK);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        int i7 = i5 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        if (i6 <= 8) {
            topLayoutDislike23.onWarmupCompleted = i2 + i6;
            return i7;
        }
        int i8 = iArr[i4 + i7 + ((i3 & ((1 << i6) - 1)) >>> 8)];
        topLayoutDislike23.onWarmupCompleted = i2 + (i8 >> 16) + 8;
        return i8 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    private static int IAuthTabCallback(int[] iArr, int i, TopLayoutDislike23 topLayoutDislike23) {
        TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iArr, i, topLayoutDislike23);
        return initOneSlotMultipleAdsLayoutForThreeAdVertical.IAuthTabCallback[iOnExtraCallbackWithResult] + TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, initOneSlotMultipleAdsLayoutForThreeAdVertical.onWarmupCompleted[iOnExtraCallbackWithResult]);
    }

    private static int onNavigationEvent(int i, int[] iArr, int i2) {
        return i < 16 ? iArr[(i2 + onExtraCallbackWithResult[i]) & 3] + onWarmupCompleted[i] : i - 15;
    }

    private static void onExtraCallback(int[] iArr, int i) {
        int i2 = iArr[i];
        while (i > 0) {
            iArr[i] = iArr[i - 1];
            i--;
        }
        iArr[0] = i2;
    }

    private static void IAuthTabCallback(byte[] bArr, int i) {
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bArr[i3] & 255;
            bArr[i3] = (byte) iArr[i4];
            if (i4 != 0) {
                onExtraCallback(iArr, i4);
            }
        }
    }

    private static void onExtraCallback(int[] iArr, int i, int[] iArr2, TopLayoutDislike23 topLayoutDislike23) throws IOException {
        int[] iArr3 = new int[32];
        TopLayoutDislike27.onNavigationEvent(iArr3, 0, 5, iArr, 18);
        int i2 = 8;
        int i3 = 32768;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i && i3 > 0) {
            TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
            TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
            long j = topLayoutDislike23.onExtraCallback;
            int i7 = topLayoutDislike23.onWarmupCompleted;
            int i8 = iArr3[((int) (j >>> i7)) & 31];
            topLayoutDislike23.onWarmupCompleted = i7 + (i8 >> 16);
            int i9 = i8 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            if (i9 < 16) {
                int i10 = i4 + 1;
                iArr2[i4] = i9;
                if (i9 != 0) {
                    i3 -= 32768 >> i9;
                    i2 = i9;
                }
                i4 = i10;
                i6 = 0;
            } else {
                int i11 = i9 - 14;
                int i12 = i9 == 16 ? i2 : 0;
                if (i5 != i12) {
                    i6 = 0;
                    i5 = i12;
                }
                int iIAuthTabCallback = (i6 > 0 ? (i6 - 2) << i11 : i6) + TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, i11) + 3;
                int i13 = iIAuthTabCallback - i6;
                if (i4 + i13 > i) {
                    throw new TopLayoutDislike26("symbol + repeatDelta > numSymbols");
                }
                int i14 = 0;
                while (i14 < i13) {
                    iArr2[i4] = i5;
                    i14++;
                    i4++;
                }
                if (i5 != 0) {
                    i3 -= i13 << (15 - i5);
                }
                i6 = iIAuthTabCallback;
            }
        }
        if (i3 != 0) {
            throw new TopLayoutDislike26("Unused space");
        }
        bindTitleData.onExtraCallbackWithResult(iArr2, i4, i - i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r4 != r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r8 == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void onExtraCallbackWithResult(int i, int[] iArr, int i2, TopLayoutDislike23 topLayoutDislike23) throws IOException {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
        int[] iArr2 = new int[i];
        int iIAuthTabCallback = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 2);
        if (iIAuthTabCallback == 1) {
            int i5 = i - 1;
            int[] iArr3 = new int[4];
            int iIAuthTabCallback2 = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 2) + 1;
            int i6 = 0;
            while (i5 != 0) {
                i5 >>= 1;
                i6++;
            }
            for (int i7 = 0; i7 < iIAuthTabCallback2; i7++) {
                int iIAuthTabCallback3 = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, i6) % i;
                iArr3[i7] = iIAuthTabCallback3;
                iArr2[iIAuthTabCallback3] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (iIAuthTabCallback2 != 1) {
                if (iIAuthTabCallback2 == 2) {
                    int i8 = iArr3[0];
                    int i9 = iArr3[1];
                    z = i8 != i9;
                    iArr2[i9] = 1;
                } else {
                    if (iIAuthTabCallback2 == 3) {
                        int i10 = iArr3[0];
                        int i11 = iArr3[1];
                        if (i10 != i11) {
                            int i12 = iArr3[2];
                            if (i10 != i12) {
                            }
                        }
                        throw new TopLayoutDislike26("Can't readHuffmanCode");
                    }
                    int i13 = iArr3[0];
                    int i14 = iArr3[1];
                    z2 = (i13 == i14 || i13 == (i3 = iArr3[2]) || i13 == (i4 = iArr3[3]) || i14 == i3 || i14 == i4 || i3 == i4) ? false : true;
                    if (TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                }
            }
            TopLayoutDislike27.onNavigationEvent(iArr, i2, 8, iArr2, i);
            return;
        }
        int[] iArr4 = new int[18];
        int i15 = 0;
        int i16 = 32;
        while (iIAuthTabCallback < 18 && i16 > 0) {
            int i17 = onExtraCallback[iIAuthTabCallback];
            TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
            long j = topLayoutDislike23.onExtraCallback;
            int i18 = topLayoutDislike23.onWarmupCompleted;
            int i19 = IAuthTabCallback[((int) (j >>> i18)) & 15];
            topLayoutDislike23.onWarmupCompleted = i18 + (i19 >> 16);
            int i20 = i19 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            iArr4[i17] = i20;
            if (i20 != 0) {
                i16 -= 32 >> i20;
                i15++;
            }
            iIAuthTabCallback++;
        }
        z = i15 == 1 || i16 == 0;
        onExtraCallback(iArr4, i, iArr2, topLayoutDislike23);
        z2 = z;
    }

    private static int onExtraCallback(int i, byte[] bArr, TopLayoutDislike23 topLayoutDislike23) throws IOException {
        TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
        int iIAuthTabCallback = IAuthTabCallback(topLayoutDislike23) + 1;
        if (iIAuthTabCallback == 1) {
            bindTitleData.onWarmupCompleted(bArr, 0, i);
            return iIAuthTabCallback;
        }
        int iIAuthTabCallback2 = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) == 1 ? TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 4) + 1 : 0;
        int[] iArr = new int[1080];
        onExtraCallbackWithResult(iIAuthTabCallback + iIAuthTabCallback2, iArr, 0, topLayoutDislike23);
        int i2 = 0;
        while (i2 < i) {
            TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
            TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iArr, 0, topLayoutDislike23);
            if (iOnExtraCallbackWithResult == 0) {
                bArr[i2] = 0;
            } else if (iOnExtraCallbackWithResult <= iIAuthTabCallback2) {
                for (int iIAuthTabCallback3 = (1 << iOnExtraCallbackWithResult) + TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, iOnExtraCallbackWithResult); iIAuthTabCallback3 != 0; iIAuthTabCallback3--) {
                    if (i2 >= i) {
                        throw new TopLayoutDislike26("Corrupted context map");
                    }
                    bArr[i2] = 0;
                    i2++;
                }
            } else {
                bArr[i2] = (byte) (iOnExtraCallbackWithResult - iIAuthTabCallback2);
            }
            i2++;
        }
        if (TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) == 1) {
            IAuthTabCallback(bArr, i);
        }
        return iIAuthTabCallback;
    }

    private static void onExtraCallbackWithResult(bindIconData bindicondata, int i) {
        int i2;
        TopLayoutDislike23 topLayoutDislike23 = bindicondata.onExtraCallback;
        int[] iArr = bindicondata.IAuthTabCallback;
        int i3 = i << 1;
        TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
        int i4 = i * 1080;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(bindicondata.onNavigationEvent, i4, topLayoutDislike23);
        bindicondata.onExtraCallbackWithResult[i] = IAuthTabCallback(bindicondata.onWarmupCompleted, i4, topLayoutDislike23);
        if (iOnExtraCallbackWithResult == 1) {
            i2 = iArr[i3 + 1] + 1;
        } else {
            i2 = iOnExtraCallbackWithResult == 0 ? iArr[i3] : iOnExtraCallbackWithResult - 2;
        }
        int i5 = bindicondata.requestPostMessageChannel[i];
        if (i2 >= i5) {
            i2 -= i5;
        }
        int i6 = i3 + 1;
        iArr[i3] = iArr[i6];
        iArr[i6] = i2;
    }

    private static void onNavigationEvent(bindIconData bindicondata) {
        onExtraCallbackWithResult(bindicondata, 0);
        int i = bindicondata.IAuthTabCallback[1];
        int i2 = i << 6;
        bindicondata.access000 = i2;
        int i3 = bindicondata.access100[i2] & 255;
        bindicondata.isEngagementSignalsApiAvailable = i3;
        bindicondata.mayLaunchUrl = bindicondata.onUnminimized.IAuthTabCallback[i3];
        byte b = bindicondata.IAuthTabCallback_Parcel[i];
        int[] iArr = TopLayoutDislike22.IAuthTabCallback;
        bindicondata.IAuthTabCallbackDefault = iArr[b];
        bindicondata.asInterface = iArr[b + 1];
    }

    private static void onExtraCallbackWithResult(bindIconData bindicondata) {
        onExtraCallbackWithResult(bindicondata, 1);
        bindicondata.ICustomTabsServiceStubProxy = bindicondata.ICustomTabsCallbackStubProxy.IAuthTabCallback[bindicondata.IAuthTabCallback[3]];
    }

    private static void onExtraCallback(bindIconData bindicondata) {
        onExtraCallbackWithResult(bindicondata, 2);
        bindicondata.extraCallbackWithResult = bindicondata.IAuthTabCallback[5] << 2;
    }

    private static void asInterface(bindIconData bindicondata) {
        int i;
        int i2 = bindicondata.newAuthTabSession;
        long j = i2;
        long j2 = bindicondata.onActivityLayout;
        if (j > j2) {
            int i3 = (int) j2;
            while (true) {
                int i4 = i2 >> 1;
                if (i4 <= i3 + bindicondata.readTypedObject.length) {
                    break;
                } else {
                    i2 = i4;
                }
            }
            if (!bindicondata.ICustomTabsCallbackStub && i2 < 16384 && bindicondata.newAuthTabSession >= 16384) {
                i2 = 16384;
            }
        }
        int i5 = bindicondata.validateRelationship;
        if (i2 <= i5) {
            return;
        }
        byte[] bArr = new byte[i2 + 37];
        byte[] bArr2 = bindicondata.ICustomTabsServiceStub;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i5);
        } else {
            byte[] bArr3 = bindicondata.readTypedObject;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i6 = bindicondata.prefetch;
                if (length > i6) {
                    i = length - i6;
                } else {
                    i6 = length;
                    i = 0;
                }
                System.arraycopy(bArr3, i, bArr, 0, i6);
                bindicondata.ICustomTabsServiceDefault = i6;
                bindicondata.IAuthTabCallbackStub = i6;
            }
        }
        bindicondata.ICustomTabsServiceStub = bArr;
        bindicondata.validateRelationship = i2;
    }

    private static void asBinder(bindIconData bindicondata) throws IOException {
        TopLayoutDislike23 topLayoutDislike23 = bindicondata.onExtraCallback;
        if (bindicondata.ICustomTabsCallbackStub) {
            bindicondata.postMessage = 10;
            bindicondata.asBinder = bindicondata.ICustomTabsServiceDefault;
            bindicondata.onTransact = 0;
            bindicondata.updateVisuals = 12;
            return;
        }
        getITopLayout getitoplayout = bindicondata.onUnminimized;
        getitoplayout.onNavigationEvent = null;
        getitoplayout.IAuthTabCallback = null;
        getITopLayout getitoplayout2 = bindicondata.ICustomTabsCallbackStubProxy;
        getitoplayout2.onNavigationEvent = null;
        getitoplayout2.IAuthTabCallback = null;
        getITopLayout getitoplayout3 = bindicondata.onRelationshipValidationResult;
        getitoplayout3.onNavigationEvent = null;
        getitoplayout3.IAuthTabCallback = null;
        TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
        onNavigationEvent(topLayoutDislike23, bindicondata);
        if (bindicondata.newSession != 0 || bindicondata.ICustomTabsService) {
            if (bindicondata.extraCommand || bindicondata.ICustomTabsService) {
                TopLayoutDislike23.onExtraCallback(topLayoutDislike23);
                bindicondata.updateVisuals = bindicondata.ICustomTabsService ? 4 : 5;
            } else {
                bindicondata.updateVisuals = 2;
            }
            if (bindicondata.ICustomTabsService) {
                return;
            }
            bindicondata.onActivityLayout += bindicondata.newSession;
            if (bindicondata.validateRelationship < bindicondata.newAuthTabSession) {
                asInterface(bindicondata);
            }
        }
    }

    private static void onTransact(bindIconData bindicondata) throws IOException {
        int i;
        int[] iArr;
        TopLayoutDislike23 topLayoutDislike23 = bindicondata.onExtraCallback;
        for (int i2 = 0; i2 < 3; i2++) {
            bindicondata.requestPostMessageChannel[i2] = IAuthTabCallback(topLayoutDislike23) + 1;
            bindicondata.onExtraCallbackWithResult[i2] = 268435456;
            int i3 = bindicondata.requestPostMessageChannel[i2];
            if (i3 > 1) {
                int i4 = i2 * 1080;
                onExtraCallbackWithResult(i3 + 2, bindicondata.onNavigationEvent, i4, topLayoutDislike23);
                onExtraCallbackWithResult(26, bindicondata.onWarmupCompleted, i4, topLayoutDislike23);
                bindicondata.onExtraCallbackWithResult[i2] = IAuthTabCallback(bindicondata.onWarmupCompleted, i4, topLayoutDislike23);
            }
        }
        TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
        bindicondata.onMinimized = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 2);
        int iIAuthTabCallback = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 4);
        int i5 = bindicondata.onMinimized;
        int i6 = (iIAuthTabCallback << i5) + 16;
        bindicondata.prefetchWithMultipleUrls = i6;
        bindicondata.onMessageChannelReady = (1 << i5) - 1;
        bindicondata.IAuthTabCallback_Parcel = new byte[bindicondata.requestPostMessageChannel[0]];
        int i7 = 0;
        while (true) {
            i = bindicondata.requestPostMessageChannel[0];
            if (i7 >= i) {
                break;
            }
            int iMin = Math.min(i7 + 96, i);
            while (i7 < iMin) {
                bindicondata.IAuthTabCallback_Parcel[i7] = (byte) (TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 2) << 1);
                i7++;
            }
            TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
        }
        int i8 = i << 6;
        byte[] bArr = new byte[i8];
        bindicondata.access100 = bArr;
        int iOnExtraCallback = onExtraCallback(i8, bArr, topLayoutDislike23);
        bindicondata.ICustomTabsService_Parcel = true;
        int i9 = 0;
        while (true) {
            iArr = bindicondata.requestPostMessageChannel;
            if (i9 >= (iArr[0] << 6)) {
                break;
            }
            if (bindicondata.access100[i9] != (i9 >> 6)) {
                bindicondata.ICustomTabsService_Parcel = false;
                break;
            }
            i9++;
        }
        int i10 = iArr[2] << 2;
        byte[] bArr2 = new byte[i10];
        bindicondata.extraCallback = bArr2;
        int iOnExtraCallback2 = onExtraCallback(i10, bArr2, topLayoutDislike23);
        getITopLayout.IAuthTabCallback(bindicondata.onUnminimized, 256, iOnExtraCallback);
        getITopLayout.IAuthTabCallback(bindicondata.ICustomTabsCallbackStubProxy, 704, bindicondata.requestPostMessageChannel[1]);
        getITopLayout.IAuthTabCallback(bindicondata.onRelationshipValidationResult, i6 + (48 << i5), iOnExtraCallback2);
        getITopLayout.onWarmupCompleted(bindicondata.onUnminimized, topLayoutDislike23);
        getITopLayout.onWarmupCompleted(bindicondata.ICustomTabsCallbackStubProxy, topLayoutDislike23);
        getITopLayout.onWarmupCompleted(bindicondata.onRelationshipValidationResult, topLayoutDislike23);
        bindicondata.access000 = 0;
        bindicondata.extraCallbackWithResult = 0;
        int[] iArr2 = TopLayoutDislike22.IAuthTabCallback;
        byte b = bindicondata.IAuthTabCallback_Parcel[0];
        bindicondata.IAuthTabCallbackDefault = iArr2[b];
        bindicondata.asInterface = iArr2[b + 1];
        bindicondata.isEngagementSignalsApiAvailable = 0;
        bindicondata.mayLaunchUrl = bindicondata.onUnminimized.IAuthTabCallback[0];
        bindicondata.ICustomTabsServiceStubProxy = bindicondata.ICustomTabsCallbackStubProxy.IAuthTabCallback[0];
        int[] iArr3 = bindicondata.IAuthTabCallback;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    private static void IAuthTabCallback(bindIconData bindicondata) throws IOException {
        TopLayoutDislike23 topLayoutDislike23 = bindicondata.onExtraCallback;
        byte[] bArr = bindicondata.ICustomTabsServiceStub;
        int i = bindicondata.newSession;
        if (i <= 0) {
            TopLayoutDislike23.IAuthTabCallbackDefault(topLayoutDislike23);
            bindicondata.updateVisuals = 1;
            return;
        }
        int iMin = Math.min(bindicondata.validateRelationship - bindicondata.ICustomTabsServiceDefault, i);
        TopLayoutDislike23.onNavigationEvent(topLayoutDislike23, bArr, bindicondata.ICustomTabsServiceDefault, iMin);
        bindicondata.newSession -= iMin;
        int i2 = bindicondata.ICustomTabsServiceDefault + iMin;
        bindicondata.ICustomTabsServiceDefault = i2;
        int i3 = bindicondata.validateRelationship;
        if (i2 == i3) {
            bindicondata.postMessage = 5;
            bindicondata.asBinder = i3;
            bindicondata.onTransact = 0;
            bindicondata.updateVisuals = 12;
            return;
        }
        TopLayoutDislike23.IAuthTabCallbackDefault(topLayoutDislike23);
        bindicondata.updateVisuals = 1;
    }

    private static boolean IAuthTabCallbackStub(bindIconData bindicondata) {
        int i = bindicondata.IAuthTabCallbackStub;
        if (i != 0) {
            bindicondata.onTransact += i;
            bindicondata.IAuthTabCallbackStub = 0;
        }
        int iMin = Math.min(bindicondata.requestPostMessageChannelWithExtras - bindicondata.warmup, bindicondata.asBinder - bindicondata.onTransact);
        if (iMin != 0) {
            System.arraycopy(bindicondata.ICustomTabsServiceStub, bindicondata.onTransact, bindicondata.setEngagementSignalsCallback, bindicondata.receiveFile + bindicondata.warmup, iMin);
            bindicondata.warmup += iMin;
            bindicondata.onTransact += iMin;
        }
        return bindicondata.warmup < bindicondata.requestPostMessageChannelWithExtras;
    }

    static void onNavigationEvent(bindIconData bindicondata, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        bindicondata.readTypedObject = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        throw new o.TopLayoutDislike26("Invalid backward reference");
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d A[LOOP:3: B:49:0x013d->B:191:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void onWarmupCompleted(bindIconData bindicondata) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = bindicondata.updateVisuals;
        if (i7 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (i7 == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        TopLayoutDislike23 topLayoutDislike23 = bindicondata.onExtraCallback;
        int i8 = bindicondata.validateRelationship - 1;
        byte[] bArr = bindicondata.ICustomTabsServiceStub;
        while (true) {
            byte[] bArr2 = bArr;
            while (true) {
                int i9 = bindicondata.updateVisuals;
                if (i9 == 10) {
                    if (i9 == 10) {
                        if (bindicondata.newSession < 0) {
                            throw new TopLayoutDislike26("Invalid metablock length");
                        }
                        TopLayoutDislike23.onExtraCallback(topLayoutDislike23);
                        TopLayoutDislike23.onExtraCallbackWithResult(bindicondata.onExtraCallback, true);
                        return;
                    }
                    return;
                }
                if (i9 != 12) {
                    int i10 = 0;
                    switch (i9) {
                        case 1:
                            if (bindicondata.newSession < 0) {
                                throw new TopLayoutDislike26("Invalid metablock length");
                            }
                            asBinder(bindicondata);
                            i8 = bindicondata.validateRelationship - 1;
                            bArr = bindicondata.ICustomTabsServiceStub;
                        case 2:
                            onTransact(bindicondata);
                            bindicondata.updateVisuals = 3;
                            if (bindicondata.newSession > 0) {
                                bindicondata.updateVisuals = 1;
                                break;
                            } else {
                                TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
                                if (bindicondata.onExtraCallbackWithResult[1] == 0) {
                                    onExtraCallbackWithResult(bindicondata);
                                }
                                int[] iArr = bindicondata.onExtraCallbackWithResult;
                                iArr[1] = iArr[1] - 1;
                                TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
                                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(bindicondata.ICustomTabsCallbackStubProxy.onNavigationEvent, bindicondata.ICustomTabsServiceStubProxy, topLayoutDislike23);
                                int i11 = iOnExtraCallbackWithResult >>> 6;
                                bindicondata.onActivityResized = 0;
                                if (i11 >= 2) {
                                    i11 -= 2;
                                    bindicondata.onActivityResized = -1;
                                }
                                int i12 = initOneSlotMultipleAdsLayoutForThreeAdVertical.onTransact[i11] + ((iOnExtraCallbackWithResult >>> 3) & 7);
                                int i13 = initOneSlotMultipleAdsLayoutForThreeAdVertical.onExtraCallbackWithResult[i11] + (iOnExtraCallbackWithResult & 7);
                                bindicondata.ICustomTabsCallbackDefault = initOneSlotMultipleAdsLayoutForThreeAdVertical.IAuthTabCallbackStub[i12] + TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, initOneSlotMultipleAdsLayoutForThreeAdVertical.IAuthTabCallbackDefault[i12]);
                                bindicondata.IAuthTabCallbackStubProxy = initOneSlotMultipleAdsLayoutForThreeAdVertical.onNavigationEvent[i13] + TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, initOneSlotMultipleAdsLayoutForThreeAdVertical.onExtraCallback[i13]);
                                bindicondata.ICustomTabsCallback_Parcel = 0;
                                bindicondata.updateVisuals = 6;
                                if (bindicondata.ICustomTabsService_Parcel) {
                                    int i14 = bindicondata.ICustomTabsServiceDefault;
                                    int i15 = bArr2[(i14 - 1) & i8] & 255;
                                    int i16 = bArr2[(i14 - 2) & i8] & 255;
                                    while (true) {
                                        if (bindicondata.ICustomTabsCallback_Parcel < bindicondata.ICustomTabsCallbackDefault) {
                                            TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
                                            if (bindicondata.onExtraCallbackWithResult[0] == 0) {
                                                onNavigationEvent(bindicondata);
                                            }
                                            byte[] bArr3 = bindicondata.access100;
                                            int i17 = bindicondata.access000;
                                            int[] iArr2 = TopLayoutDislike22.onExtraCallback;
                                            byte b = bArr3[i17 + (iArr2[bindicondata.asInterface + i16] | iArr2[bindicondata.IAuthTabCallbackDefault + i15])];
                                            int[] iArr3 = bindicondata.onExtraCallbackWithResult;
                                            iArr3[0] = iArr3[0] - 1;
                                            TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
                                            getITopLayout getitoplayout = bindicondata.onUnminimized;
                                            int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(getitoplayout.onNavigationEvent, getitoplayout.IAuthTabCallback[b & 255], topLayoutDislike23);
                                            int i18 = bindicondata.ICustomTabsServiceDefault;
                                            bArr2[i18] = (byte) iOnExtraCallbackWithResult2;
                                            bindicondata.ICustomTabsCallback_Parcel++;
                                            bindicondata.ICustomTabsServiceDefault = i18 + 1;
                                            if (i18 == i8) {
                                                bindicondata.postMessage = 6;
                                                bindicondata.asBinder = bindicondata.validateRelationship;
                                                bindicondata.onTransact = 0;
                                                bindicondata.updateVisuals = 12;
                                            } else {
                                                int i19 = i15;
                                                i15 = iOnExtraCallbackWithResult2;
                                                i16 = i19;
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (bindicondata.ICustomTabsCallback_Parcel < bindicondata.ICustomTabsCallbackDefault) {
                                            TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
                                            if (bindicondata.onExtraCallbackWithResult[0] == 0) {
                                                onNavigationEvent(bindicondata);
                                            }
                                            int[] iArr4 = bindicondata.onExtraCallbackWithResult;
                                            iArr4[0] = iArr4[0] - 1;
                                            TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
                                            bArr2[bindicondata.ICustomTabsServiceDefault] = (byte) onExtraCallbackWithResult(bindicondata.onUnminimized.onNavigationEvent, bindicondata.mayLaunchUrl, topLayoutDislike23);
                                            bindicondata.ICustomTabsCallback_Parcel++;
                                            int i20 = bindicondata.ICustomTabsServiceDefault;
                                            bindicondata.ICustomTabsServiceDefault = i20 + 1;
                                            if (i20 == i8) {
                                                bindicondata.postMessage = 6;
                                                bindicondata.asBinder = bindicondata.validateRelationship;
                                                bindicondata.onTransact = 0;
                                                bindicondata.updateVisuals = 12;
                                            }
                                        }
                                    }
                                }
                                if (bindicondata.updateVisuals == 6) {
                                    continue;
                                } else {
                                    int i21 = bindicondata.newSession - bindicondata.ICustomTabsCallbackDefault;
                                    bindicondata.newSession = i21;
                                    if (i21 <= 0) {
                                        bindicondata.updateVisuals = 3;
                                        break;
                                    } else {
                                        if (bindicondata.onActivityResized < 0) {
                                            TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
                                            if (bindicondata.onExtraCallbackWithResult[2] == 0) {
                                                onExtraCallback(bindicondata);
                                            }
                                            int[] iArr5 = bindicondata.onExtraCallbackWithResult;
                                            iArr5[2] = iArr5[2] - 1;
                                            TopLayoutDislike23.onExtraCallbackWithResult(topLayoutDislike23);
                                            getITopLayout getitoplayout2 = bindicondata.onRelationshipValidationResult;
                                            int[] iArr6 = getitoplayout2.onNavigationEvent;
                                            int[] iArr7 = getitoplayout2.IAuthTabCallback;
                                            byte[] bArr4 = bindicondata.extraCallback;
                                            int i22 = bindicondata.extraCallbackWithResult;
                                            int i23 = bindicondata.IAuthTabCallbackStubProxy;
                                            int iOnExtraCallbackWithResult3 = onExtraCallbackWithResult(iArr6, iArr7[bArr4[i22 + (i23 > 4 ? 3 : i23 - 2)] & 255], topLayoutDislike23);
                                            bindicondata.onActivityResized = iOnExtraCallbackWithResult3;
                                            int i24 = bindicondata.prefetchWithMultipleUrls;
                                            if (iOnExtraCallbackWithResult3 >= i24) {
                                                int i25 = iOnExtraCallbackWithResult3 - i24;
                                                int i26 = bindicondata.onMessageChannelReady;
                                                int i27 = i25 >>> bindicondata.onMinimized;
                                                bindicondata.onActivityResized = i27;
                                                int i28 = (i27 >>> 1) + 1;
                                                bindicondata.onActivityResized = i24 + (i25 & i26) + ((((((i27 & 1) + 2) << i28) - 4) + TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, i28)) << bindicondata.onMinimized);
                                            }
                                        }
                                        int iOnNavigationEvent = onNavigationEvent(bindicondata.onActivityResized, bindicondata.writeTypedObject, bindicondata.ICustomTabsCallback);
                                        bindicondata.onPostMessage = iOnNavigationEvent;
                                        if (iOnNavigationEvent < 0) {
                                            throw new TopLayoutDislike26("Negative distance");
                                        }
                                        int i29 = bindicondata.newSessionWithExtras;
                                        int i30 = bindicondata.prefetch;
                                        if (i29 != i30 && (i6 = bindicondata.ICustomTabsServiceDefault) < i30) {
                                            bindicondata.newSessionWithExtras = i6;
                                        } else {
                                            bindicondata.newSessionWithExtras = i30;
                                        }
                                        bindicondata.getInterfaceDescriptor = bindicondata.ICustomTabsServiceDefault;
                                        if (iOnNavigationEvent > bindicondata.newSessionWithExtras) {
                                            bindicondata.updateVisuals = 9;
                                            break;
                                        } else {
                                            if (bindicondata.onActivityResized > 0) {
                                                int[] iArr8 = bindicondata.writeTypedObject;
                                                int i31 = bindicondata.ICustomTabsCallback;
                                                iArr8[i31 & 3] = iOnNavigationEvent;
                                                bindicondata.ICustomTabsCallback = i31 + 1;
                                            }
                                            if (bindicondata.IAuthTabCallbackStubProxy > bindicondata.newSession) {
                                                throw new TopLayoutDislike26("Invalid backward reference");
                                            }
                                            bindicondata.ICustomTabsCallback_Parcel = 0;
                                            bindicondata.updateVisuals = 7;
                                            int i32 = bindicondata.ICustomTabsServiceDefault;
                                            i = (i32 - bindicondata.onPostMessage) & i8;
                                            i2 = bindicondata.IAuthTabCallbackStubProxy - bindicondata.ICustomTabsCallback_Parcel;
                                            if (i + i2 >= i8 && i32 + i2 < i8) {
                                                while (i10 < i2) {
                                                    bArr2[i32] = bArr2[i];
                                                    i10++;
                                                    i32++;
                                                    i++;
                                                }
                                                bindicondata.ICustomTabsCallback_Parcel += i2;
                                                bindicondata.newSession -= i2;
                                                bindicondata.ICustomTabsServiceDefault += i2;
                                            } else {
                                                do {
                                                    i3 = bindicondata.ICustomTabsCallback_Parcel;
                                                    if (i3 >= bindicondata.IAuthTabCallbackStubProxy) {
                                                        i4 = bindicondata.ICustomTabsServiceDefault;
                                                        bArr2[i4] = bArr2[(i4 - bindicondata.onPostMessage) & i8];
                                                        bindicondata.newSession--;
                                                        bindicondata.ICustomTabsCallback_Parcel = i3 + 1;
                                                        bindicondata.ICustomTabsServiceDefault = i4 + 1;
                                                    }
                                                } while (i4 != i8);
                                                i5 = 7;
                                                bindicondata.postMessage = 7;
                                                bindicondata.asBinder = bindicondata.validateRelationship;
                                                bindicondata.onTransact = 0;
                                                bindicondata.updateVisuals = 12;
                                                if (bindicondata.updateVisuals != i5) {
                                                    break;
                                                } else {
                                                    bindicondata.updateVisuals = 3;
                                                    break;
                                                }
                                            }
                                            i5 = 7;
                                            if (bindicondata.updateVisuals != i5) {
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (bindicondata.newSession > 0) {
                            }
                            break;
                        case 4:
                            while (bindicondata.newSession > 0) {
                                TopLayoutDislike23.onWarmupCompleted(topLayoutDislike23);
                                TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 8);
                                bindicondata.newSession--;
                            }
                            bindicondata.updateVisuals = 1;
                            break;
                        case 5:
                            IAuthTabCallback(bindicondata);
                            break;
                        case 6:
                            if (bindicondata.ICustomTabsService_Parcel) {
                            }
                            if (bindicondata.updateVisuals == 6) {
                            }
                            break;
                        case 7:
                            int i322 = bindicondata.ICustomTabsServiceDefault;
                            i = (i322 - bindicondata.onPostMessage) & i8;
                            i2 = bindicondata.IAuthTabCallbackStubProxy - bindicondata.ICustomTabsCallback_Parcel;
                            if (i + i2 >= i8) {
                                do {
                                    i3 = bindicondata.ICustomTabsCallback_Parcel;
                                    if (i3 >= bindicondata.IAuthTabCallbackStubProxy) {
                                    }
                                } while (i4 != i8);
                                i5 = 7;
                                bindicondata.postMessage = 7;
                                bindicondata.asBinder = bindicondata.validateRelationship;
                                bindicondata.onTransact = 0;
                                bindicondata.updateVisuals = 12;
                                if (bindicondata.updateVisuals != i5) {
                                }
                                break;
                            }
                            break;
                        case 8:
                            int i33 = bindicondata.validateRelationship;
                            System.arraycopy(bArr2, i33, bArr2, 0, bindicondata.getInterfaceDescriptor - i33);
                            bindicondata.updateVisuals = 3;
                            break;
                        case 9:
                            int i34 = bindicondata.IAuthTabCallbackStubProxy;
                            if (i34 < 4 || i34 > 24) {
                                break;
                            } else {
                                int i35 = bindDescData.onWarmupCompleted[i34];
                                int i36 = (bindicondata.onPostMessage - bindicondata.newSessionWithExtras) - 1;
                                int i37 = bindDescData.onExtraCallback[i34];
                                int i38 = i36 >>> i37;
                                initOneSlotMultipleAdsLayoutForTwoAdVertical[] initoneslotmultipleadslayoutfortwoadverticalArr = initOneSlotMultipleAdsLayoutForTwoAdVertical.onExtraCallback;
                                if (i38 < initoneslotmultipleadslayoutfortwoadverticalArr.length) {
                                    int iOnNavigationEvent2 = initOneSlotMultipleAdsLayoutForTwoAdVertical.onNavigationEvent(bArr2, bindicondata.getInterfaceDescriptor, bindDescData.onNavigationEvent(), ((i36 & ((1 << i37) - 1)) * i34) + i35, bindicondata.IAuthTabCallbackStubProxy, initoneslotmultipleadslayoutfortwoadverticalArr[i38]);
                                    int i39 = bindicondata.getInterfaceDescriptor + iOnNavigationEvent2;
                                    bindicondata.getInterfaceDescriptor = i39;
                                    bindicondata.ICustomTabsServiceDefault += iOnNavigationEvent2;
                                    bindicondata.newSession -= iOnNavigationEvent2;
                                    int i40 = bindicondata.validateRelationship;
                                    if (i39 >= i40) {
                                        bindicondata.postMessage = 8;
                                        bindicondata.asBinder = i40;
                                        bindicondata.onTransact = 0;
                                        bindicondata.updateVisuals = 12;
                                        break;
                                    } else {
                                        bindicondata.updateVisuals = 3;
                                        break;
                                    }
                                } else {
                                    throw new TopLayoutDislike26("Invalid backward reference");
                                }
                            }
                            break;
                        default:
                            throw new TopLayoutDislike26("Unexpected state " + bindicondata.updateVisuals);
                    }
                } else {
                    if (!IAuthTabCallbackStub(bindicondata)) {
                        return;
                    }
                    int i41 = bindicondata.ICustomTabsServiceDefault;
                    int i42 = bindicondata.prefetch;
                    if (i41 >= i42) {
                        bindicondata.newSessionWithExtras = i42;
                    }
                    bindicondata.ICustomTabsServiceDefault = i41 & i8;
                    bindicondata.updateVisuals = bindicondata.postMessage;
                }
            }
        }
    }
}
