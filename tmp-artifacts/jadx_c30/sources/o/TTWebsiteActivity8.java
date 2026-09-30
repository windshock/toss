package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import org.apache.commons.compress.archivers.zip.Zip64RequiredException;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTWebsiteActivity8 extends TTLandingPageActivity17 {
    protected boolean IAuthTabCallbackDefault;
    private String IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private boolean ICustomTabsCallbackStub;
    private TTWebsiteActivity7 ICustomTabsCallbackStubProxy;
    private final SeekableByteChannel access000;
    private long access100;
    private final List<TTWebsiteActivity2> extraCallback;
    private boolean extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private final Map<Integer, Integer> onActivityLayout;
    private final OutputStream onActivityResized;
    private final Map<TTWebsiteActivity2, onExtraCallback> onMessageChannelReady;
    private final boolean onMinimized;
    private final TTVideoLandingPageLink2Activity12 onPostMessage;
    private TTWebsiteActivity3 onRelationshipValidationResult;
    private boolean readTypedObject;
    private IAuthTabCallback writeTypedObject;
    private static final byte[] onTransact = {0, 0};
    private static final byte[] asInterface = {0, 0, 0, 0};
    private static final byte[] asBinder = dj12.onWarmupCompleted(1);
    static final byte[] onExtraCallback = dj12.onExtraCallbackWithResult.onExtraCallbackWithResult();
    static final byte[] onWarmupCompleted = dj12.onNavigationEvent.onExtraCallbackWithResult();
    static final byte[] onNavigationEvent = dj12.onWarmupCompleted.onExtraCallbackWithResult();
    static final byte[] onExtraCallbackWithResult = dj12.onWarmupCompleted(101010256);
    static final byte[] IAuthTabCallbackStub = dj12.onWarmupCompleted(101075792);
    static final byte[] IAuthTabCallback = dj12.onWarmupCompleted(117853008);

    private int onExtraCallback(int i) {
        return i == 8 ? 20 : 10;
    }

    static final class IAuthTabCallback {
        private boolean onNavigationEvent;
        private final TTWebsiteActivity2 onWarmupCompleted;
    }

    static final class onExtraCallback {
        private final long onExtraCallback;
        private final boolean onWarmupCompleted;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.IAuthTabCallbackDefault) {
                onExtraCallback();
            }
        } finally {
            onNavigationEvent();
        }
    }

    private byte[] onNavigationEvent(TTWebsiteActivity2 tTWebsiteActivity2) throws IOException {
        TTWebsiteActivity3 tTWebsiteActivity3;
        onExtraCallback onextracallback = this.onMessageChannelReady.get(tTWebsiteActivity2);
        boolean z = IAuthTabCallback(tTWebsiteActivity2) || tTWebsiteActivity2.getCompressedSize() >= BodyPartID.bodyIdMax || tTWebsiteActivity2.getSize() >= BodyPartID.bodyIdMax || onextracallback.onExtraCallback >= BodyPartID.bodyIdMax || tTWebsiteActivity2.IAuthTabCallback() >= 65535 || (tTWebsiteActivity3 = this.onRelationshipValidationResult) == TTWebsiteActivity3.Always || tTWebsiteActivity3 == TTWebsiteActivity3.AlwaysWithCompatibility;
        if (!z || this.onRelationshipValidationResult != TTWebsiteActivity3.Never) {
            IAuthTabCallback(tTWebsiteActivity2, onextracallback.onExtraCallback, z);
            return onNavigationEvent(tTWebsiteActivity2, onExtraCallbackWithResult(tTWebsiteActivity2), onextracallback, z);
        }
        throw new Zip64RequiredException("Archive's size exceeds the limit of 4GByte.");
    }

    private byte[] onNavigationEvent(TTWebsiteActivity2 tTWebsiteActivity2, ByteBuffer byteBuffer, onExtraCallback onextracallback, boolean z) throws IOException {
        TTWebsiteActivity3 tTWebsiteActivity3;
        if (this.onMinimized) {
            int iOnExtraCallbackWithResult = ((dj16) this.onActivityResized).onExtraCallbackWithResult();
            if (this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)) == null) {
                this.onActivityLayout.put(Integer.valueOf(iOnExtraCallbackWithResult), 1);
            } else {
                this.onActivityLayout.put(Integer.valueOf(iOnExtraCallbackWithResult), Integer.valueOf(this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)).intValue() + 1));
            }
        }
        byte[] bArrOnNavigationEvent = tTWebsiteActivity2.onNavigationEvent();
        int length = bArrOnNavigationEvent.length;
        String comment = tTWebsiteActivity2.getComment();
        if (comment == null) {
            comment = BuildConfig.FLAVOR;
        }
        ByteBuffer byteBufferOnExtraCallbackWithResult = onExtraCallback(tTWebsiteActivity2).onExtraCallbackWithResult(comment);
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int iLimit2 = byteBufferOnExtraCallbackWithResult.limit() - byteBufferOnExtraCallbackWithResult.position();
        int i = iLimit + 46;
        int i2 = i + length;
        byte[] bArr = new byte[i2 + iLimit2];
        System.arraycopy(onNavigationEvent, 0, bArr, 0, 4);
        dj4.IAuthTabCallback((tTWebsiteActivity2.asInterface() << 8) | (!this.readTypedObject ? 20 : 45), bArr, 4);
        int method = tTWebsiteActivity2.getMethod();
        boolean zOnWarmupCompleted = this.ICustomTabsCallbackStubProxy.onWarmupCompleted(tTWebsiteActivity2.getName());
        dj4.IAuthTabCallback(onExtraCallbackWithResult(method, z, onextracallback.onWarmupCompleted), bArr, 6);
        IAuthTabCallback(!zOnWarmupCompleted && this.extraCallbackWithResult, onextracallback.onWarmupCompleted).onNavigationEvent(bArr, 8);
        dj4.IAuthTabCallback(method, bArr, 10);
        dj5.IAuthTabCallback(tTWebsiteActivity2.getTime(), bArr, 12);
        dj12.onNavigationEvent(tTWebsiteActivity2.getCrc(), bArr, 16);
        if (tTWebsiteActivity2.getCompressedSize() >= BodyPartID.bodyIdMax || tTWebsiteActivity2.getSize() >= BodyPartID.bodyIdMax || (tTWebsiteActivity3 = this.onRelationshipValidationResult) == TTWebsiteActivity3.Always || tTWebsiteActivity3 == TTWebsiteActivity3.AlwaysWithCompatibility) {
            dj12 dj12Var = dj12.onTransact;
            dj12Var.onExtraCallback(bArr, 20);
            dj12Var.onExtraCallback(bArr, 24);
        } else {
            dj12.onNavigationEvent(tTWebsiteActivity2.getCompressedSize(), bArr, 20);
            dj12.onNavigationEvent(tTWebsiteActivity2.getSize(), bArr, 24);
        }
        dj4.IAuthTabCallback(iLimit, bArr, 28);
        dj4.IAuthTabCallback(length, bArr, 30);
        dj4.IAuthTabCallback(iLimit2, bArr, 32);
        if (!this.onMinimized) {
            System.arraycopy(onTransact, 0, bArr, 34, 2);
        } else if (tTWebsiteActivity2.IAuthTabCallback() >= 65535 || this.onRelationshipValidationResult == TTWebsiteActivity3.Always) {
            dj4.IAuthTabCallback(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, bArr, 34);
        } else {
            dj4.IAuthTabCallback((int) tTWebsiteActivity2.IAuthTabCallback(), bArr, 34);
        }
        dj4.IAuthTabCallback(tTWebsiteActivity2.IAuthTabCallbackStub(), bArr, 36);
        dj12.onNavigationEvent(tTWebsiteActivity2.onExtraCallbackWithResult(), bArr, 38);
        if (onextracallback.onExtraCallback < BodyPartID.bodyIdMax && this.onRelationshipValidationResult != TTWebsiteActivity3.Always) {
            dj12.onNavigationEvent(Math.min(onextracallback.onExtraCallback, BodyPartID.bodyIdMax), bArr, 42);
        } else {
            dj12.onNavigationEvent(BodyPartID.bodyIdMax, bArr, 42);
        }
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 46, iLimit);
        System.arraycopy(bArrOnNavigationEvent, 0, bArr, i, length);
        System.arraycopy(byteBufferOnExtraCallbackWithResult.array(), byteBufferOnExtraCallbackWithResult.arrayOffset(), bArr, i2, iLimit2);
        return bArr;
    }

    void onNavigationEvent() throws IOException {
        try {
            SeekableByteChannel seekableByteChannel = this.access000;
            if (seekableByteChannel != null) {
                seekableByteChannel.close();
            }
        } finally {
            OutputStream outputStream = this.onActivityResized;
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public void onExtraCallback() throws Throwable {
        if (this.IAuthTabCallbackDefault) {
            throw new IOException("This archive has already been finished");
        }
        if (this.writeTypedObject != null) {
            throw new IOException("This archive contains unclosed entries.");
        }
        long jAsInterface = this.onPostMessage.asInterface();
        this.IAuthTabCallback_Parcel = jAsInterface;
        if (this.onMinimized) {
            this.IAuthTabCallback_Parcel = ((dj16) this.onActivityResized).onNavigationEvent();
            this.getInterfaceDescriptor = r2.onExtraCallbackWithResult();
        }
        asInterface();
        this.access100 = this.onPostMessage.asInterface() - jAsInterface;
        ByteBuffer byteBufferOnExtraCallbackWithResult = this.ICustomTabsCallbackStubProxy.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy);
        this.ICustomTabsCallback = (byteBufferOnExtraCallbackWithResult.limit() - byteBufferOnExtraCallbackWithResult.position()) + 22;
        onWarmupCompleted();
        onExtraCallbackWithResult();
        this.onMessageChannelReady.clear();
        this.extraCallback.clear();
        this.onPostMessage.close();
        if (this.onMinimized) {
            this.onActivityResized.close();
        }
        this.IAuthTabCallbackDefault = true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.onActivityResized;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    private TTWebsiteActivity7 onExtraCallback(TTWebsiteActivity2 tTWebsiteActivity2) {
        return (this.ICustomTabsCallbackStubProxy.onWarmupCompleted(tTWebsiteActivity2.getName()) || !this.extraCallbackWithResult) ? this.ICustomTabsCallbackStubProxy : dj13.onExtraCallback;
    }

    private TTVideoLandingPageLink2Activity1 IAuthTabCallback(boolean z, boolean z2) {
        TTVideoLandingPageLink2Activity1 tTVideoLandingPageLink2Activity1 = new TTVideoLandingPageLink2Activity1();
        tTVideoLandingPageLink2Activity1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub || z);
        if (z2) {
            tTVideoLandingPageLink2Activity1.onWarmupCompleted(true);
        }
        return tTVideoLandingPageLink2Activity1;
    }

    private ByteBuffer onExtraCallbackWithResult(TTWebsiteActivity2 tTWebsiteActivity2) throws IOException {
        return onExtraCallback(tTWebsiteActivity2).onExtraCallbackWithResult(tTWebsiteActivity2.getName());
    }

    private TTWebsiteActivity5 onWarmupCompleted(TTWebsiteActivity2 tTWebsiteActivity2) {
        IAuthTabCallback iAuthTabCallback = this.writeTypedObject;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onNavigationEvent = !this.readTypedObject;
        }
        this.readTypedObject = true;
        dj11 dj11VarOnExtraCallbackWithResult = tTWebsiteActivity2.onExtraCallbackWithResult(TTWebsiteActivity5.onExtraCallbackWithResult);
        TTWebsiteActivity5 tTWebsiteActivity5 = dj11VarOnExtraCallbackWithResult instanceof TTWebsiteActivity5 ? (TTWebsiteActivity5) dj11VarOnExtraCallbackWithResult : null;
        if (tTWebsiteActivity5 == null) {
            tTWebsiteActivity5 = new TTWebsiteActivity5();
        }
        tTWebsiteActivity2.onWarmupCompleted(tTWebsiteActivity5);
        return tTWebsiteActivity5;
    }

    private void IAuthTabCallback(TTWebsiteActivity2 tTWebsiteActivity2, long j, boolean z) {
        TTWebsiteActivity3 tTWebsiteActivity3;
        if (z) {
            TTWebsiteActivity5 tTWebsiteActivity5OnWarmupCompleted = onWarmupCompleted(tTWebsiteActivity2);
            if (tTWebsiteActivity2.getCompressedSize() >= BodyPartID.bodyIdMax || tTWebsiteActivity2.getSize() >= BodyPartID.bodyIdMax || (tTWebsiteActivity3 = this.onRelationshipValidationResult) == TTWebsiteActivity3.Always || tTWebsiteActivity3 == TTWebsiteActivity3.AlwaysWithCompatibility) {
                tTWebsiteActivity5OnWarmupCompleted.onNavigationEvent(new TTWebsiteActivity6(tTWebsiteActivity2.getCompressedSize()));
                tTWebsiteActivity5OnWarmupCompleted.IAuthTabCallback(new TTWebsiteActivity6(tTWebsiteActivity2.getSize()));
            } else {
                tTWebsiteActivity5OnWarmupCompleted.onNavigationEvent(null);
                tTWebsiteActivity5OnWarmupCompleted.IAuthTabCallback(null);
            }
            boolean z2 = j >= BodyPartID.bodyIdMax || this.onRelationshipValidationResult == TTWebsiteActivity3.Always;
            boolean z3 = tTWebsiteActivity2.IAuthTabCallback() >= 65535 || this.onRelationshipValidationResult == TTWebsiteActivity3.Always;
            if (z2 || z3) {
                tTWebsiteActivity5OnWarmupCompleted.onWarmupCompleted(new TTWebsiteActivity6(j));
            }
            if (z3) {
                tTWebsiteActivity5OnWarmupCompleted.onExtraCallback(new dj12(tTWebsiteActivity2.IAuthTabCallback()));
            }
            tTWebsiteActivity2.onTransact();
        }
    }

    private boolean IAuthTabCallback(TTWebsiteActivity2 tTWebsiteActivity2) {
        return tTWebsiteActivity2.onExtraCallbackWithResult(TTWebsiteActivity5.onExtraCallbackWithResult) instanceof TTWebsiteActivity5;
    }

    private boolean IAuthTabCallback() {
        int iOnExtraCallbackWithResult = this.onMinimized ? ((dj16) this.onActivityResized).onExtraCallbackWithResult() : 0;
        return iOnExtraCallbackWithResult >= 65535 || this.getInterfaceDescriptor >= 65535 || (this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)) == null ? 0 : this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)).intValue()) >= 65535 || this.extraCallback.size() >= 65535 || this.access100 >= BodyPartID.bodyIdMax || this.IAuthTabCallback_Parcel >= BodyPartID.bodyIdMax;
    }

    private void IAuthTabCallbackDefault() throws Zip64RequiredException {
        if (this.onRelationshipValidationResult == TTWebsiteActivity3.Never) {
            int iOnExtraCallbackWithResult = this.onMinimized ? ((dj16) this.onActivityResized).onExtraCallbackWithResult() : 0;
            if (iOnExtraCallbackWithResult >= 65535) {
                throw new Zip64RequiredException("Number of the disk of End Of Central Directory exceeds the limit of 65535.");
            }
            if (this.getInterfaceDescriptor >= 65535) {
                throw new Zip64RequiredException("Number of the disk with the start of Central Directory exceeds the limit of 65535.");
            }
            if (this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)) != null && this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)).intValue() >= 65535) {
                throw new Zip64RequiredException("Number of entries on this disk exceeds the limit of 65535.");
            }
            if (this.extraCallback.size() >= 65535) {
                throw new Zip64RequiredException("Archive contains more than 65535 entries.");
            }
            if (this.access100 >= BodyPartID.bodyIdMax) {
                throw new Zip64RequiredException("The size of the entire central directory exceeds the limit of 4GByte.");
            }
            if (this.IAuthTabCallback_Parcel >= BodyPartID.bodyIdMax) {
                throw new Zip64RequiredException("Archive's size exceeds the limit of 4GByte.");
            }
        }
    }

    private int onExtraCallbackWithResult(int i, boolean z, boolean z2) {
        if (z) {
            return 45;
        }
        if (z2) {
            return 20;
        }
        return onExtraCallback(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        IAuthTabCallback iAuthTabCallback = this.writeTypedObject;
        if (iAuthTabCallback != null) {
            dj5.onNavigationEvent(iAuthTabCallback.onWarmupCompleted);
            onNavigationEvent(this.onPostMessage.onExtraCallback(bArr, i, i2, this.writeTypedObject.onWarmupCompleted.getMethod()));
            return;
        }
        throw new IllegalStateException("No current entry");
    }

    protected void onExtraCallbackWithResult() throws Throwable {
        if (!this.readTypedObject && this.onMinimized) {
            ((dj16) this.onActivityResized).onWarmupCompleted(this.ICustomTabsCallback);
        }
        IAuthTabCallbackDefault();
        onWarmupCompleted(onExtraCallbackWithResult);
        int iIntValue = 0;
        int iOnExtraCallbackWithResult = this.onMinimized ? ((dj16) this.onActivityResized).onExtraCallbackWithResult() : 0;
        onWarmupCompleted(dj4.IAuthTabCallback(iOnExtraCallbackWithResult));
        onWarmupCompleted(dj4.IAuthTabCallback((int) this.getInterfaceDescriptor));
        int size = this.extraCallback.size();
        if (!this.onMinimized) {
            iIntValue = size;
        } else if (this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)) != null) {
            iIntValue = this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)).intValue();
        }
        onWarmupCompleted(dj4.IAuthTabCallback(Math.min(iIntValue, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)));
        onWarmupCompleted(dj4.IAuthTabCallback(Math.min(size, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)));
        onWarmupCompleted(dj12.onWarmupCompleted(Math.min(this.access100, BodyPartID.bodyIdMax)));
        onWarmupCompleted(dj12.onWarmupCompleted(Math.min(this.IAuthTabCallback_Parcel, BodyPartID.bodyIdMax)));
        ByteBuffer byteBufferOnExtraCallbackWithResult = this.ICustomTabsCallbackStubProxy.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy);
        int iLimit = byteBufferOnExtraCallbackWithResult.limit() - byteBufferOnExtraCallbackWithResult.position();
        onWarmupCompleted(dj4.IAuthTabCallback(iLimit));
        this.onPostMessage.IAuthTabCallback(byteBufferOnExtraCallbackWithResult.array(), byteBufferOnExtraCallbackWithResult.arrayOffset(), iLimit);
    }

    private void asInterface() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        Iterator<TTWebsiteActivity2> it = this.extraCallback.iterator();
        while (true) {
            int i = 0;
            while (it.hasNext()) {
                byteArrayOutputStream.write(onNavigationEvent(it.next()));
                i++;
                if (i > 1000) {
                    break;
                }
            }
            onWarmupCompleted(byteArrayOutputStream.toByteArray());
            return;
            onWarmupCompleted(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }

    private void onWarmupCompleted(byte[] bArr) throws IOException {
        this.onPostMessage.onNavigationEvent(bArr);
    }

    protected final void onExtraCallback(byte[] bArr) throws IOException {
        this.onPostMessage.onWarmupCompleted(bArr, 0, bArr.length);
    }

    protected void onWarmupCompleted() throws Throwable {
        long jOnExtraCallbackWithResult;
        if (this.onRelationshipValidationResult != TTWebsiteActivity3.Never) {
            if (!this.readTypedObject && IAuthTabCallback()) {
                this.readTypedObject = true;
            }
            if (this.readTypedObject) {
                long jAsInterface = this.onPostMessage.asInterface();
                if (this.onMinimized) {
                    dj16 dj16Var = (dj16) this.onActivityResized;
                    jAsInterface = dj16Var.onNavigationEvent();
                    jOnExtraCallbackWithResult = dj16Var.onExtraCallbackWithResult();
                } else {
                    jOnExtraCallbackWithResult = 0;
                }
                onExtraCallback(IAuthTabCallbackStub);
                onExtraCallback(TTWebsiteActivity6.IAuthTabCallback(44L));
                onExtraCallback(dj4.IAuthTabCallback(45));
                onExtraCallback(dj4.IAuthTabCallback(45));
                int size = 0;
                int iOnExtraCallbackWithResult = this.onMinimized ? ((dj16) this.onActivityResized).onExtraCallbackWithResult() : 0;
                onExtraCallback(dj12.onWarmupCompleted(iOnExtraCallbackWithResult));
                onExtraCallback(dj12.onWarmupCompleted(this.getInterfaceDescriptor));
                if (this.onMinimized) {
                    if (this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)) != null) {
                        size = this.onActivityLayout.get(Integer.valueOf(iOnExtraCallbackWithResult)).intValue();
                    }
                } else {
                    size = this.extraCallback.size();
                }
                onExtraCallback(TTWebsiteActivity6.IAuthTabCallback(size));
                onExtraCallback(TTWebsiteActivity6.IAuthTabCallback(this.extraCallback.size()));
                onExtraCallback(TTWebsiteActivity6.IAuthTabCallback(this.access100));
                onExtraCallback(TTWebsiteActivity6.IAuthTabCallback(this.IAuthTabCallback_Parcel));
                if (this.onMinimized) {
                    ((dj16) this.onActivityResized).onWarmupCompleted(this.ICustomTabsCallback + 20);
                }
                onExtraCallback(IAuthTabCallback);
                onExtraCallback(dj12.onWarmupCompleted(jOnExtraCallbackWithResult));
                onExtraCallback(TTWebsiteActivity6.IAuthTabCallback(jAsInterface));
                if (this.onMinimized) {
                    onExtraCallback(dj12.onWarmupCompleted(((dj16) this.onActivityResized).onExtraCallbackWithResult() + 1));
                } else {
                    onExtraCallback(asBinder);
                }
            }
        }
    }
}
