package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class NodeEntry {
    final int nodeHeight;
    final byte[] nodeValue;

    NodeEntry(byte[] bArr, int i) {
        this.nodeValue = bArr;
        this.nodeHeight = i;
    }
}
