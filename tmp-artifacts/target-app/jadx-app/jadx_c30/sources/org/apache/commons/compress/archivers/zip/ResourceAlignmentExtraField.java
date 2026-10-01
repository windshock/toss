package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;
import o.dj11;
import o.dj4;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ResourceAlignmentExtraField implements dj11 {
    public static final dj4 onWarmupCompleted = new dj4(41246);
    private boolean IAuthTabCallback;
    private int onExtraCallback;
    private short onNavigationEvent;

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        return dj4.IAuthTabCallback(this.onNavigationEvent | (this.IAuthTabCallback ? (short) 32768 : (short) 0));
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        return new dj4(2);
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return onWarmupCompleted;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        byte[] bArr = new byte[this.onExtraCallback + 2];
        dj4.IAuthTabCallback(this.onNavigationEvent | (this.IAuthTabCallback ? (short) 32768 : (short) 0), bArr, 0);
        return bArr;
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        return new dj4(this.onExtraCallback + 2);
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 2) {
            throw new ZipException("Too short content for ResourceAlignmentExtraField (0xa11e): " + i2);
        }
        int iIAuthTabCallback = dj4.IAuthTabCallback(bArr, i);
        this.onNavigationEvent = (short) (iIAuthTabCallback & 32767);
        this.IAuthTabCallback = (iIAuthTabCallback & 32768) != 0;
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        onExtraCallback(bArr, i, i2);
        this.onExtraCallback = i2 - 2;
    }
}
