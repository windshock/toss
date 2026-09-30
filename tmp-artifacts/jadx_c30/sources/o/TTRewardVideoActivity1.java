package o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.zip.CRC32;
import o.TTPlayableLandingPageActivity71;
import o.TTRewardVideoActivity1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTRewardVideoActivity1 implements Closeable {
    private TTLandingPageActivitysya IAuthTabCallback;
    private boolean asBinder;
    private int asInterface;
    private getButtonText[] onExtraCallback;
    private final Map<TTPlayableLandingPageActivity71, long[]> onExtraCallbackWithResult;
    private Iterable<? extends TTRewardVideoActivity21> onNavigationEvent;
    private final List<TTPlayableLandingPageActivity71> onTransact;
    private final SeekableByteChannel onWarmupCompleted;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.asBinder) {
                IAuthTabCallback();
            }
        } finally {
            this.onWarmupCompleted.close();
        }
    }

    public void IAuthTabCallback() throws IOException {
        if (this.asBinder) {
            throw new IOException("This archive has already been finished");
        }
        this.asBinder = true;
        long jPosition = this.onWarmupCompleted.position();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        IAuthTabCallbackStub(dataOutputStream);
        dataOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.onWarmupCompleted.write(ByteBuffer.wrap(byteArray));
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray);
        byte[] bArr = TTPlayableLandingPageActivity8.onExtraCallbackWithResult;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArr.length + 26).order(ByteOrder.LITTLE_ENDIAN);
        this.onWarmupCompleted.position(0L);
        byteBufferOrder.put(bArr);
        byteBufferOrder.put((byte) 0).put((byte) 2);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putLong(jPosition - 32).putLong(byteArray.length & BodyPartID.bodyIdMax).putInt((int) crc32.getValue());
        crc32.reset();
        crc32.update(byteBufferOrder.array(), bArr.length + 6, 20);
        byteBufferOrder.putInt(bArr.length + 2, (int) crc32.getValue());
        byteBufferOrder.flip();
        this.onWarmupCompleted.write(byteBufferOrder);
    }

    private Iterable<? extends TTRewardVideoActivity21> onWarmupCompleted(TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71) {
        Iterable<? extends TTRewardVideoActivity21> iterableOnExtraCallback = tTPlayableLandingPageActivity71.onExtraCallback();
        if (iterableOnExtraCallback == null) {
            iterableOnExtraCallback = this.onNavigationEvent;
        }
        TTLandingPageActivitysya tTLandingPageActivitysya = this.IAuthTabCallback;
        return tTLandingPageActivitysya != null ? (Iterable) Stream.concat(Stream.of(new TTRewardVideoActivity21(TTRewardVideoActivity.AES256SHA256, tTLandingPageActivitysya)), StreamSupport.stream(iterableOnExtraCallback.spliterator(), false)).collect(Collectors.toList()) : iterableOnExtraCallback;
    }

    private void onExtraCallbackWithResult(DataOutput dataOutput, BitSet bitSet, int i) throws IOException {
        int i2 = 0;
        int i3 = 7;
        for (int i4 = 0; i4 < i; i4++) {
            i2 |= (bitSet.get(i4) ? 1 : 0) << i3;
            i3--;
            if (i3 < 0) {
                dataOutput.write(i2);
                i2 = 0;
                i3 = 7;
            }
        }
        if (i3 != 7) {
            dataOutput.write(i2);
        }
    }

    private void onNavigationEvent(DataOutput dataOutput) throws IOException {
        boolean z = false;
        BitSet bitSet = new BitSet(0);
        int i = 0;
        for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 : this.onTransact) {
            if (!tTPlayableLandingPageActivity71.extraCallback()) {
                boolean zICustomTabsCallback = tTPlayableLandingPageActivity71.ICustomTabsCallback();
                bitSet.set(i, zICustomTabsCallback);
                z |= zICustomTabsCallback;
                i++;
            }
        }
        if (z) {
            dataOutput.write(16);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            onExtraCallbackWithResult(dataOutputStream, bitSet, i);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            onExtraCallbackWithResult(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void onExtraCallback(DataOutput dataOutput) throws IOException {
        Iterator<TTPlayableLandingPageActivity71> it = this.onTransact.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().asBinder()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(19);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.onTransact.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.onTransact.size());
                for (int i2 = 0; i2 < this.onTransact.size(); i2++) {
                    bitSet.set(i2, this.onTransact.get(i2).asBinder());
                }
                onExtraCallbackWithResult(dataOutputStream, bitSet, this.onTransact.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 : this.onTransact) {
                if (tTPlayableLandingPageActivity71.asBinder()) {
                    dataOutputStream.writeLong(Long.reverseBytes(PAGNativeAdLoadCallback.tG_(tTPlayableLandingPageActivity71.sV_())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            onExtraCallbackWithResult(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void IAuthTabCallback(DataOutput dataOutput) throws IOException {
        Iterator<TTPlayableLandingPageActivity71> it = this.onTransact.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().IAuthTabCallbackStub()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(18);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.onTransact.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.onTransact.size());
                for (int i2 = 0; i2 < this.onTransact.size(); i2++) {
                    bitSet.set(i2, this.onTransact.get(i2).IAuthTabCallbackStub());
                }
                onExtraCallbackWithResult(dataOutputStream, bitSet, this.onTransact.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 : this.onTransact) {
                if (tTPlayableLandingPageActivity71.IAuthTabCallbackStub()) {
                    dataOutputStream.writeLong(Long.reverseBytes(PAGNativeAdLoadCallback.tG_(tTPlayableLandingPageActivity71.sW_())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            onExtraCallbackWithResult(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void onExtraCallbackWithResult(DataOutput dataOutput) throws IOException {
        boolean z = false;
        BitSet bitSet = new BitSet(0);
        int i = 0;
        for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 : this.onTransact) {
            if (!tTPlayableLandingPageActivity71.extraCallback()) {
                boolean z2 = !tTPlayableLandingPageActivity71.readTypedObject();
                bitSet.set(i, z2);
                z |= z2;
                i++;
            }
        }
        if (z) {
            dataOutput.write(15);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            onExtraCallbackWithResult(dataOutputStream, bitSet, i);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            onExtraCallbackWithResult(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71) {
        return !tTPlayableLandingPageActivity71.extraCallback();
    }

    private void onWarmupCompleted(DataOutput dataOutput) throws IOException {
        if (this.onTransact.stream().anyMatch(new Predicate() { // from class: org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return TTRewardVideoActivity1.IAuthTabCallback((TTPlayableLandingPageActivity71) obj);
            }
        })) {
            dataOutput.write(14);
            BitSet bitSet = new BitSet(this.onTransact.size());
            for (int i = 0; i < this.onTransact.size(); i++) {
                bitSet.set(i, !this.onTransact.get(i).extraCallback());
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            onExtraCallbackWithResult(dataOutputStream, bitSet, this.onTransact.size());
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            onExtraCallbackWithResult(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void IAuthTabCallbackDefault(DataOutput dataOutput) throws IOException {
        Iterator<TTPlayableLandingPageActivity71> it = this.onTransact.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().IAuthTabCallbackDefault()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(20);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.onTransact.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.onTransact.size());
                for (int i2 = 0; i2 < this.onTransact.size(); i2++) {
                    bitSet.set(i2, this.onTransact.get(i2).IAuthTabCallbackDefault());
                }
                onExtraCallbackWithResult(dataOutputStream, bitSet, this.onTransact.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 : this.onTransact) {
                if (tTPlayableLandingPageActivity71.IAuthTabCallbackDefault()) {
                    dataOutputStream.writeLong(Long.reverseBytes(PAGNativeAdLoadCallback.tG_(tTPlayableLandingPageActivity71.sX_())));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            onExtraCallbackWithResult(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void asInterface(DataOutput dataOutput) throws IOException {
        dataOutput.write(17);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.write(0);
        Iterator<TTPlayableLandingPageActivity71> it = this.onTransact.iterator();
        while (it.hasNext()) {
            dataOutputStream.write(it.next().IAuthTabCallbackStubProxy().getBytes(StandardCharsets.UTF_16LE));
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        onExtraCallbackWithResult(dataOutput, byteArray.length);
        dataOutput.write(byteArray);
    }

    private void onTransact(DataOutput dataOutput) throws IOException {
        dataOutput.write(5);
        onExtraCallbackWithResult(dataOutput, this.onTransact.size());
        onWarmupCompleted(dataOutput);
        onExtraCallbackWithResult(dataOutput);
        onNavigationEvent(dataOutput);
        asInterface(dataOutput);
        IAuthTabCallback(dataOutput);
        onExtraCallback(dataOutput);
        IAuthTabCallbackDefault(dataOutput);
        asBinder(dataOutput);
        dataOutput.write(0);
    }

    private void asBinder(DataOutput dataOutput) throws IOException {
        Iterator<TTPlayableLandingPageActivity71> it = this.onTransact.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().IAuthTabCallback_Parcel()) {
                i++;
            }
        }
        if (i > 0) {
            dataOutput.write(21);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (i != this.onTransact.size()) {
                dataOutputStream.write(0);
                BitSet bitSet = new BitSet(this.onTransact.size());
                for (int i2 = 0; i2 < this.onTransact.size(); i2++) {
                    bitSet.set(i2, this.onTransact.get(i2).IAuthTabCallback_Parcel());
                }
                onExtraCallbackWithResult(dataOutputStream, bitSet, this.onTransact.size());
            } else {
                dataOutputStream.write(1);
            }
            dataOutputStream.write(0);
            for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 : this.onTransact) {
                if (tTPlayableLandingPageActivity71.IAuthTabCallback_Parcel()) {
                    dataOutputStream.writeInt(Integer.reverseBytes(tTPlayableLandingPageActivity71.access100()));
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            onExtraCallbackWithResult(dataOutput, byteArray.length);
            dataOutput.write(byteArray);
        }
    }

    private void IAuthTabCallback(DataOutput dataOutput, TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<? extends TTRewardVideoActivity21> it = onWarmupCompleted(tTPlayableLandingPageActivity71).iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            IAuthTabCallback(it.next(), byteArrayOutputStream);
        }
        onExtraCallbackWithResult(dataOutput, i);
        dataOutput.write(byteArrayOutputStream.toByteArray());
        long j = 0;
        while (j < i - 1) {
            long j2 = 1 + j;
            onExtraCallbackWithResult(dataOutput, j2);
            onExtraCallbackWithResult(dataOutput, j);
            j = j2;
        }
    }

    private void IAuthTabCallbackStub(DataOutput dataOutput) throws IOException {
        dataOutput.write(1);
        dataOutput.write(4);
        IAuthTabCallback_Parcel(dataOutput);
        onTransact(dataOutput);
        dataOutput.write(0);
    }

    private void access100(DataOutput dataOutput) throws IOException {
        dataOutput.write(6);
        onExtraCallbackWithResult(dataOutput, 0L);
        onExtraCallbackWithResult(dataOutput, this.asInterface & BodyPartID.bodyIdMax);
        dataOutput.write(9);
        for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 : this.onTransact) {
            if (tTPlayableLandingPageActivity71.extraCallback()) {
                onExtraCallbackWithResult(dataOutput, tTPlayableLandingPageActivity71.onNavigationEvent());
            }
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity712 : this.onTransact) {
            if (tTPlayableLandingPageActivity712.extraCallback()) {
                dataOutput.writeInt(Integer.reverseBytes((int) tTPlayableLandingPageActivity712.onWarmupCompleted()));
            }
        }
        dataOutput.write(0);
    }

    private void IAuthTabCallback(TTRewardVideoActivity21 tTRewardVideoActivity21, OutputStream outputStream) throws IOException {
        byte[] id = tTRewardVideoActivity21.onExtraCallbackWithResult().getId();
        byte[] bArrOnWarmupCompleted = TTPlayableLandingPageActivity2.onExtraCallback(tTRewardVideoActivity21.onExtraCallbackWithResult()).onWarmupCompleted(tTRewardVideoActivity21.onExtraCallback());
        int length = id.length;
        if (bArrOnWarmupCompleted.length > 0) {
            length |= 32;
        }
        outputStream.write(length);
        outputStream.write(id);
        if (bArrOnWarmupCompleted.length > 0) {
            outputStream.write(bArrOnWarmupCompleted.length);
            outputStream.write(bArrOnWarmupCompleted);
        }
    }

    private void IAuthTabCallback_Parcel(DataOutput dataOutput) throws IOException {
        if (this.asInterface > 0) {
            access100(dataOutput);
            getInterfaceDescriptor(dataOutput);
        }
        IAuthTabCallbackStubProxy(dataOutput);
        dataOutput.write(0);
    }

    private void IAuthTabCallbackStubProxy(DataOutput dataOutput) throws IOException {
        dataOutput.write(8);
        dataOutput.write(0);
    }

    private void onExtraCallbackWithResult(DataOutput dataOutput, long j) throws IOException {
        int i = 0;
        int i2 = 128;
        int i3 = 0;
        while (true) {
            if (i3 >= 8) {
                break;
            }
            int i4 = i3 + 1;
            if (j < (1 << (i4 * 7))) {
                i = (int) (i | (j >>> (i3 << 3)));
                break;
            } else {
                i |= i2;
                i2 >>>= 1;
                i3 = i4;
            }
        }
        dataOutput.write(i);
        while (i3 > 0) {
            dataOutput.write((int) (255 & j));
            j >>>= 8;
            i3--;
        }
    }

    private void getInterfaceDescriptor(DataOutput dataOutput) throws IOException {
        dataOutput.write(7);
        dataOutput.write(11);
        onExtraCallbackWithResult(dataOutput, this.asInterface);
        dataOutput.write(0);
        for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 : this.onTransact) {
            if (tTPlayableLandingPageActivity71.extraCallback()) {
                IAuthTabCallback(dataOutput, tTPlayableLandingPageActivity71);
            }
        }
        dataOutput.write(12);
        for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity712 : this.onTransact) {
            if (tTPlayableLandingPageActivity712.extraCallback()) {
                long[] jArr = this.onExtraCallbackWithResult.get(tTPlayableLandingPageActivity712);
                if (jArr != null) {
                    for (long j : jArr) {
                        onExtraCallbackWithResult(dataOutput, j);
                    }
                }
                onExtraCallbackWithResult(dataOutput, tTPlayableLandingPageActivity712.access000());
            }
        }
        dataOutput.write(10);
        dataOutput.write(1);
        for (TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity713 : this.onTransact) {
            if (tTPlayableLandingPageActivity713.extraCallback()) {
                dataOutput.writeInt(Integer.reverseBytes((int) tTPlayableLandingPageActivity713.onExtraCallbackWithResult()));
            }
        }
        dataOutput.write(0);
    }
}
