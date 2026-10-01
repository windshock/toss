package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpPacketReorderingQueue;
import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtpPacketReorderingQueue {
    static final int MAX_SEQUENCE_LEAP_ALLOWED = 1000;
    private static final int QUEUE_SIZE_THRESHOLD_FOR_RESET = 5000;
    private int lastDequeuedSequenceNumber;
    private int lastReceivedSequenceNumber;
    private final TreeSet<RtpPacketContainer> packetQueue = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.source.rtsp.RtpPacketReorderingQueue$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return RtpPacketReorderingQueue.calculateSequenceNumberShift(((RtpPacketReorderingQueue.RtpPacketContainer) obj).packet.sequenceNumber, ((RtpPacketReorderingQueue.RtpPacketContainer) obj2).packet.sequenceNumber);
        }
    });
    private boolean started;

    public RtpPacketReorderingQueue() {
        reset();
    }

    public void reset() {
        synchronized (this) {
            this.packetQueue.clear();
            this.started = false;
            this.lastDequeuedSequenceNumber = -1;
            this.lastReceivedSequenceNumber = -1;
        }
    }

    public boolean offer(RtpPacket rtpPacket, long j) {
        synchronized (this) {
            if (this.packetQueue.size() >= QUEUE_SIZE_THRESHOLD_FOR_RESET) {
                throw new IllegalStateException("Queue size limit of 5000 reached.");
            }
            int i2 = rtpPacket.sequenceNumber;
            if (!this.started) {
                reset();
                this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i2);
                this.started = true;
                addToQueue(new RtpPacketContainer(rtpPacket, j));
                return true;
            }
            if (Math.abs(calculateSequenceNumberShift(i2, RtpPacket.getNextSequenceNumber(this.lastReceivedSequenceNumber))) < MAX_SEQUENCE_LEAP_ALLOWED) {
                if (calculateSequenceNumberShift(i2, this.lastDequeuedSequenceNumber) <= 0) {
                    return false;
                }
                addToQueue(new RtpPacketContainer(rtpPacket, j));
                return true;
            }
            this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i2);
            this.packetQueue.clear();
            addToQueue(new RtpPacketContainer(rtpPacket, j));
            return true;
        }
    }

    public RtpPacket poll(long j) {
        synchronized (this) {
            if (this.packetQueue.isEmpty()) {
                return null;
            }
            RtpPacketContainer rtpPacketContainerFirst = this.packetQueue.first();
            int i2 = rtpPacketContainerFirst.packet.sequenceNumber;
            if (i2 != RtpPacket.getNextSequenceNumber(this.lastDequeuedSequenceNumber) && j < rtpPacketContainerFirst.receivedTimestampMs) {
                return null;
            }
            this.packetQueue.pollFirst();
            this.lastDequeuedSequenceNumber = i2;
            return rtpPacketContainerFirst.packet;
        }
    }

    private void addToQueue(RtpPacketContainer rtpPacketContainer) {
        synchronized (this) {
            this.lastReceivedSequenceNumber = rtpPacketContainer.packet.sequenceNumber;
            this.packetQueue.add(rtpPacketContainer);
        }
    }

    static final class RtpPacketContainer {
        public final RtpPacket packet;
        public final long receivedTimestampMs;

        public RtpPacketContainer(RtpPacket rtpPacket, long j) {
            this.packet = rtpPacket;
            this.receivedTimestampMs = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calculateSequenceNumberShift(int i2, int i3) {
        int iMin;
        int i4 = i2 - i3;
        return (Math.abs(i4) <= MAX_SEQUENCE_LEAP_ALLOWED || (iMin = (Math.min(i2, i3) - Math.max(i2, i3)) + RtpPacket.MAX_SEQUENCE_NUMBER) >= MAX_SEQUENCE_LEAP_ALLOWED) ? i4 : i2 < i3 ? iMin : -iMin;
    }
}
