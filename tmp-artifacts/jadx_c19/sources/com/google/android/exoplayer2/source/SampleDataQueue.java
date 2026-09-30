package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private AllocationNode firstAllocationNode;
    private AllocationNode readAllocationNode;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private AllocationNode writeAllocationNode;

    public SampleDataQueue(Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.scratch = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    public void reset() {
        clearAllocationNodes(this.firstAllocationNode);
        this.firstAllocationNode.reset(0L, this.allocationLength);
        AllocationNode allocationNode = this.firstAllocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    public void discardUpstreamSampleBytes(long j) {
        Assertions.checkArgument(j <= this.totalBytesWritten);
        this.totalBytesWritten = j;
        if (j != 0) {
            AllocationNode allocationNode = this.firstAllocationNode;
            if (j != allocationNode.startPosition) {
                while (this.totalBytesWritten > allocationNode.endPosition) {
                    allocationNode = allocationNode.next;
                }
                AllocationNode allocationNode2 = (AllocationNode) Assertions.checkNotNull(allocationNode.next);
                clearAllocationNodes(allocationNode2);
                AllocationNode allocationNode3 = new AllocationNode(allocationNode.endPosition, this.allocationLength);
                allocationNode.next = allocationNode3;
                if (this.totalBytesWritten == allocationNode.endPosition) {
                    allocationNode = allocationNode3;
                }
                this.writeAllocationNode = allocationNode;
                if (this.readAllocationNode == allocationNode2) {
                    this.readAllocationNode = allocationNode3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode4 = new AllocationNode(this.totalBytesWritten, this.allocationLength);
        this.firstAllocationNode = allocationNode4;
        this.readAllocationNode = allocationNode4;
        this.writeAllocationNode = allocationNode4;
    }

    public void rewind() {
        this.readAllocationNode = this.firstAllocationNode;
    }

    public void readToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue$SampleExtrasHolder sampleQueue$SampleExtrasHolder) {
        this.readAllocationNode = readSampleData(this.readAllocationNode, decoderInputBuffer, sampleQueue$SampleExtrasHolder, this.scratch);
    }

    public void peekToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue$SampleExtrasHolder sampleQueue$SampleExtrasHolder) {
        readSampleData(this.readAllocationNode, decoderInputBuffer, sampleQueue$SampleExtrasHolder, this.scratch);
    }

    public void discardDownstreamTo(long j) {
        AllocationNode allocationNode;
        if (j != -1) {
            while (true) {
                allocationNode = this.firstAllocationNode;
                if (j < allocationNode.endPosition) {
                    break;
                }
                this.allocator.release(allocationNode.allocation);
                this.firstAllocationNode = this.firstAllocationNode.clear();
            }
            if (this.readAllocationNode.startPosition < allocationNode.startPosition) {
                this.readAllocationNode = allocationNode;
            }
        }
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public int sampleData(DataReader dataReader, int i2, boolean z) throws IOException {
        int iPreAppend = preAppend(i2);
        AllocationNode allocationNode = this.writeAllocationNode;
        int i3 = dataReader.read(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
        if (i3 != -1) {
            postAppend(i3);
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void sampleData(ParsableByteArray parsableByteArray, int i2) {
        while (i2 > 0) {
            int iPreAppend = preAppend(i2);
            AllocationNode allocationNode = this.writeAllocationNode;
            parsableByteArray.readBytes(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), iPreAppend);
            i2 -= iPreAppend;
            postAppend(iPreAppend);
        }
    }

    private void clearAllocationNodes(AllocationNode allocationNode) {
        if (allocationNode.allocation == null) {
            return;
        }
        this.allocator.release(allocationNode);
        allocationNode.clear();
    }

    private int preAppend(int i2) {
        AllocationNode allocationNode = this.writeAllocationNode;
        if (allocationNode.allocation == null) {
            allocationNode.initialize(this.allocator.allocate(), new AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return Math.min(i2, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private void postAppend(int i2) {
        long j = this.totalBytesWritten + i2;
        this.totalBytesWritten = j;
        AllocationNode allocationNode = this.writeAllocationNode;
        if (j == allocationNode.endPosition) {
            this.writeAllocationNode = allocationNode.next;
        }
    }

    private static AllocationNode readSampleData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue$SampleExtrasHolder sampleQueue$SampleExtrasHolder, ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.isEncrypted()) {
            allocationNode = readEncryptionData(allocationNode, decoderInputBuffer, sampleQueue$SampleExtrasHolder, parsableByteArray);
        }
        if (decoderInputBuffer.hasSupplementalData()) {
            parsableByteArray.reset(4);
            AllocationNode data = readData(allocationNode, sampleQueue$SampleExtrasHolder.offset, parsableByteArray.getData(), 4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            sampleQueue$SampleExtrasHolder.offset += 4;
            sampleQueue$SampleExtrasHolder.size -= 4;
            decoderInputBuffer.ensureSpaceForWrite(unsignedIntToInt);
            AllocationNode data2 = readData(data, sampleQueue$SampleExtrasHolder.offset, decoderInputBuffer.data, unsignedIntToInt);
            sampleQueue$SampleExtrasHolder.offset += unsignedIntToInt;
            int i2 = sampleQueue$SampleExtrasHolder.size - unsignedIntToInt;
            sampleQueue$SampleExtrasHolder.size = i2;
            decoderInputBuffer.resetSupplementalData(i2);
            return readData(data2, sampleQueue$SampleExtrasHolder.offset, decoderInputBuffer.supplementalData, sampleQueue$SampleExtrasHolder.size);
        }
        decoderInputBuffer.ensureSpaceForWrite(sampleQueue$SampleExtrasHolder.size);
        return readData(allocationNode, sampleQueue$SampleExtrasHolder.offset, decoderInputBuffer.data, sampleQueue$SampleExtrasHolder.size);
    }

    private static AllocationNode readEncryptionData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue$SampleExtrasHolder sampleQueue$SampleExtrasHolder, ParsableByteArray parsableByteArray) {
        long j = sampleQueue$SampleExtrasHolder.offset;
        int unsignedShort = 1;
        parsableByteArray.reset(1);
        AllocationNode data = readData(allocationNode, j, parsableByteArray.getData(), 1);
        long j2 = j + 1;
        byte b = parsableByteArray.getData()[0];
        boolean z = (b & 128) != 0;
        int i2 = b & Byte.MAX_VALUE;
        CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        byte[] bArr = cryptoInfo.iv;
        if (bArr == null) {
            cryptoInfo.iv = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        AllocationNode data2 = readData(data, j2, cryptoInfo.iv, i2);
        long j3 = j2 + i2;
        if (z) {
            parsableByteArray.reset(2);
            data2 = readData(data2, j3, parsableByteArray.getData(), 2);
            j3 += 2;
            unsignedShort = parsableByteArray.readUnsignedShort();
        }
        int i3 = unsignedShort;
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i3) {
            iArr3 = new int[i3];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i4 = i3 * 6;
            parsableByteArray.reset(i4);
            data2 = readData(data2, j3, parsableByteArray.getData(), i4);
            j3 += i4;
            parsableByteArray.setPosition(0);
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5] = parsableByteArray.readUnsignedShort();
                iArr4[i5] = parsableByteArray.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sampleQueue$SampleExtrasHolder.size - ((int) (j3 - sampleQueue$SampleExtrasHolder.offset));
        }
        TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) Util.castNonNull(sampleQueue$SampleExtrasHolder.cryptoData);
        cryptoInfo.set(i3, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j4 = sampleQueue$SampleExtrasHolder.offset;
        int i6 = (int) (j3 - j4);
        sampleQueue$SampleExtrasHolder.offset = j4 + i6;
        sampleQueue$SampleExtrasHolder.size -= i6;
        return data2;
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j, ByteBuffer byteBuffer, int i2) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (nodeContainingPosition.endPosition - j));
            byteBuffer.put(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j), iMin);
            i2 -= iMin;
            j += iMin;
            if (j == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j, byte[] bArr, int i2) {
        AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (nodeContainingPosition.endPosition - j));
            System.arraycopy(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j += iMin;
            if (j == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static AllocationNode getNodeContainingPosition(AllocationNode allocationNode, long j) {
        while (j >= allocationNode.endPosition) {
            allocationNode = allocationNode.next;
        }
        return allocationNode;
    }

    static final class AllocationNode implements Allocator.AllocationNode {
        public Allocation allocation;
        public long endPosition;
        public AllocationNode next;
        public long startPosition;

        public AllocationNode(long j, int i2) {
            reset(j, i2);
        }

        public void reset(long j, int i2) {
            Assertions.checkState(this.allocation == null);
            this.startPosition = j;
            this.endPosition = j + i2;
        }

        public void initialize(Allocation allocation, AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
        }

        public int translateOffset(long j) {
            return ((int) (j - this.startPosition)) + this.allocation.offset;
        }

        public AllocationNode clear() {
            this.allocation = null;
            AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        public Allocation getAllocation() {
            return (Allocation) Assertions.checkNotNull(this.allocation);
        }

        public Allocator.AllocationNode next() {
            AllocationNode allocationNode = this.next;
            if (allocationNode == null || allocationNode.allocation == null) {
                return null;
            }
            return allocationNode;
        }
    }
}
