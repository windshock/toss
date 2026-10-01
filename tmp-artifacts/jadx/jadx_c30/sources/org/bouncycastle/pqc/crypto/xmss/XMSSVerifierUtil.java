package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class XMSSVerifierUtil {
    XMSSVerifierUtil() {
    }

    static XMSSNode getRootNodeFromSignature(WOTSPlus wOTSPlus, int i, byte[] bArr, XMSSReducedSignature xMSSReducedSignature, OTSHashAddress oTSHashAddress, int i2) {
        if (bArr.length != wOTSPlus.getParams().getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (xMSSReducedSignature == null) {
            throw new NullPointerException("signature == null");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        LTreeAddress lTreeAddressBuild = new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withLTreeAddress(oTSHashAddress.getOTSAddress()).build();
        HashTreeAddress hashTreeAddressBuild = new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withTreeIndex(oTSHashAddress.getOTSAddress()).build();
        XMSSNode[] xMSSNodeArr = new XMSSNode[2];
        xMSSNodeArr[0] = XMSSNodeUtil.lTree(wOTSPlus, wOTSPlus.getPublicKeyFromSignature(bArr, xMSSReducedSignature.getWOTSPlusSignature(), oTSHashAddress), lTreeAddressBuild);
        for (int i3 = 0; i3 < i; i3++) {
            HashTreeAddress hashTreeAddressBuild2 = new HashTreeAddress.Builder().withLayerAddress(hashTreeAddressBuild.getLayerAddress()).withTreeAddress(hashTreeAddressBuild.getTreeAddress()).withTreeHeight(i3).withTreeIndex(hashTreeAddressBuild.getTreeIndex()).withKeyAndMask(hashTreeAddressBuild.getKeyAndMask()).build();
            if (Math.floor(i2 / (1 << i3)) % 2.0d == 0.0d) {
                hashTreeAddressBuild = new HashTreeAddress.Builder().withLayerAddress(hashTreeAddressBuild2.getLayerAddress()).withTreeAddress(hashTreeAddressBuild2.getTreeAddress()).withTreeHeight(hashTreeAddressBuild2.getTreeHeight()).withTreeIndex(hashTreeAddressBuild2.getTreeIndex() / 2).withKeyAndMask(hashTreeAddressBuild2.getKeyAndMask()).build();
                XMSSNode xMSSNodeRandomizeHash = XMSSNodeUtil.randomizeHash(wOTSPlus, xMSSNodeArr[0], xMSSReducedSignature.getAuthPath().get(i3), hashTreeAddressBuild);
                xMSSNodeArr[1] = xMSSNodeRandomizeHash;
                xMSSNodeArr[1] = new XMSSNode(xMSSNodeRandomizeHash.getHeight() + 1, xMSSNodeArr[1].getValue());
            } else {
                hashTreeAddressBuild = new HashTreeAddress.Builder().withLayerAddress(hashTreeAddressBuild2.getLayerAddress()).withTreeAddress(hashTreeAddressBuild2.getTreeAddress()).withTreeHeight(hashTreeAddressBuild2.getTreeHeight()).withTreeIndex((hashTreeAddressBuild2.getTreeIndex() - 1) / 2).withKeyAndMask(hashTreeAddressBuild2.getKeyAndMask()).build();
                XMSSNode xMSSNodeRandomizeHash2 = XMSSNodeUtil.randomizeHash(wOTSPlus, xMSSReducedSignature.getAuthPath().get(i3), xMSSNodeArr[0], hashTreeAddressBuild);
                xMSSNodeArr[1] = xMSSNodeRandomizeHash2;
                xMSSNodeArr[1] = new XMSSNode(xMSSNodeRandomizeHash2.getHeight() + 1, xMSSNodeArr[1].getValue());
            }
            xMSSNodeArr[0] = xMSSNodeArr[1];
        }
        return xMSSNodeArr[0];
    }
}
