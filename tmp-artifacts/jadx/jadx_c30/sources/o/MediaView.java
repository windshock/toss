package o;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;
import o.MediaView;
import o.setCornerBottomRightRadius;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class MediaView extends dj9 {
    private final Deque<byte[]> IAuthTabCallback;
    private final OutputStream onExtraCallback;
    private final setCornerBottomRightRadius onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final Deque<onExtraCallbackWithResult> onTransact;
    private final byte[] onWarmupCompleted;

    public static final class onExtraCallbackWithResult {
        private int IAuthTabCallback;
        private boolean onExtraCallback;
        private final Deque<byte[]> onExtraCallbackWithResult = new LinkedList();
        private int onNavigationEvent;

        onExtraCallbackWithResult() {
        }

        private static int IAuthTabCallback(int i, int i2) {
            int i3 = 15;
            int iMin = Math.min(i, 15);
            if (i2 < 4) {
                i3 = 0;
            } else if (i2 < 19) {
                i3 = i2 - 4;
            }
            return (iMin << 4) | i3;
        }

        private static void onExtraCallback(int i, OutputStream outputStream) throws IOException {
            while (i >= 255) {
                outputStream.write(GF2Field.MASK);
                i -= 255;
            }
            outputStream.write(i);
        }

        byte[] IAuthTabCallback(setCornerBottomRightRadius.onNavigationEvent onnavigationevent) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.onWarmupCompleted(), onnavigationevent.onWarmupCompleted() + onnavigationevent.onNavigationEvent());
            this.onExtraCallbackWithResult.add(bArrCopyOfRange);
            return bArrCopyOfRange;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        boolean onWarmupCompleted(int i) {
            return onExtraCallbackWithResult() && i >= 16;
        }

        boolean onExtraCallbackWithResult() {
            return this.IAuthTabCallback > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean onNavigationEvent() {
            return this.onExtraCallback;
        }

        int IAuthTabCallback() {
            return onExtraCallback() + this.onNavigationEvent;
        }

        private int onExtraCallback() {
            return this.onExtraCallbackWithResult.stream().mapToInt(new ToIntFunction() { // from class: org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair$$ExternalSyntheticLambda0
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return MediaView.onExtraCallbackWithResult.onNavigationEvent((byte[]) obj);
                }
            }).sum();
        }

        public static /* synthetic */ int onNavigationEvent(byte[] bArr) {
            return bArr.length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onWarmupCompleted(byte[] bArr) {
            this.onExtraCallbackWithResult.addFirst(bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
            Iterator<byte[]> itDescendingIterator = this.onExtraCallbackWithResult.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                onextracallbackwithresult.onWarmupCompleted(itDescendingIterator.next());
            }
        }

        void onExtraCallbackWithResult(setCornerBottomRightRadius.onExtraCallbackWithResult onextracallbackwithresult) {
            if (onExtraCallbackWithResult()) {
                throw new IllegalStateException();
            }
            this.IAuthTabCallback = onextracallbackwithresult.onNavigationEvent();
            this.onNavigationEvent = onextracallbackwithresult.onWarmupCompleted();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public onExtraCallbackWithResult onNavigationEvent(int i) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
            onextracallbackwithresult.onExtraCallbackWithResult.addAll(this.onExtraCallbackWithResult);
            onextracallbackwithresult.IAuthTabCallback = this.IAuthTabCallback;
            onextracallbackwithresult.onNavigationEvent = i;
            return onextracallbackwithresult;
        }

        void onExtraCallback(OutputStream outputStream) throws IOException {
            int iOnExtraCallback = onExtraCallback();
            outputStream.write(IAuthTabCallback(iOnExtraCallback, this.onNavigationEvent));
            if (iOnExtraCallback >= 15) {
                onExtraCallback(iOnExtraCallback - 15, outputStream);
            }
            Iterator<byte[]> it = this.onExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                outputStream.write(it.next());
            }
            if (onExtraCallbackWithResult()) {
                showPrivacyActivity.onExtraCallbackWithResult(outputStream, this.IAuthTabCallback, 2);
                int i = this.onNavigationEvent;
                if (i - 4 >= 15) {
                    onExtraCallback(i - 19, outputStream);
                }
            }
            this.onExtraCallback = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.MediaView$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[setCornerBottomRightRadius.onExtraCallback.onExtraCallbackWithResult.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[setCornerBottomRightRadius.onExtraCallback.onExtraCallbackWithResult.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[setCornerBottomRightRadius.onExtraCallback.onExtraCallbackWithResult.BACK_REFERENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[setCornerBottomRightRadius.onExtraCallback.onExtraCallbackWithResult.EOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ void onExtraCallback(MediaView mediaView, setCornerBottomRightRadius.onExtraCallback onextracallback) throws IOException {
        int i = AnonymousClass3.onNavigationEvent[onextracallback.IAuthTabCallback().ordinal()];
        if (i == 1) {
            mediaView.onExtraCallback((setCornerBottomRightRadius.onNavigationEvent) onextracallback);
        } else if (i == 2) {
            mediaView.onExtraCallbackWithResult((setCornerBottomRightRadius.onExtraCallbackWithResult) onextracallback);
        } else {
            if (i != 3) {
                return;
            }
            mediaView.IAuthTabCallbackDefault();
        }
    }

    private void onExtraCallbackWithResult(setCornerBottomRightRadius.onExtraCallbackWithResult onextracallbackwithresult) throws IOException {
        IAuthTabCallback(onextracallbackwithresult.onWarmupCompleted()).onExtraCallbackWithResult(onextracallbackwithresult);
        onExtraCallback(onextracallbackwithresult);
        onWarmupCompleted();
    }

    private void onExtraCallback(setCornerBottomRightRadius.onNavigationEvent onnavigationevent) throws IOException {
        onExtraCallbackWithResult(IAuthTabCallback(onnavigationevent.onNavigationEvent()).IAuthTabCallback(onnavigationevent));
        onWarmupCompleted();
    }

    private void onExtraCallbackWithResult() {
        Iterator<byte[]> it = this.IAuthTabCallback.iterator();
        int i = 0;
        int length = 0;
        while (it.hasNext()) {
            i++;
            length += it.next().length;
            if (length >= 65536) {
                break;
            }
        }
        int size = this.IAuthTabCallback.size();
        while (i < size) {
            this.IAuthTabCallback.removeLast();
            i++;
        }
    }

    private void onWarmupCompleted() {
        onExtraCallbackWithResult();
        onNavigationEvent();
    }

    private void onNavigationEvent() {
        Iterator<onExtraCallbackWithResult> itDescendingIterator = this.onTransact.descendingIterator();
        int i = 0;
        int iIAuthTabCallback = 0;
        while (itDescendingIterator.hasNext()) {
            i++;
            iIAuthTabCallback += itDescendingIterator.next().IAuthTabCallback();
            if (iIAuthTabCallback >= 65536) {
                break;
            }
        }
        int size = this.onTransact.size();
        while (i < size && this.onTransact.peekFirst().onNavigationEvent()) {
            this.onTransact.removeFirst();
            i++;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            IAuthTabCallback();
        } finally {
            this.onExtraCallback.close();
        }
    }

    private byte[] onWarmupCompleted(int i, int i2) {
        byte[] bArr = new byte[i2];
        if (i == 1) {
            byte[] bArrPeekFirst = this.IAuthTabCallback.peekFirst();
            byte b = bArrPeekFirst[bArrPeekFirst.length - 1];
            if (b != 0) {
                Arrays.fill(bArr, b);
            }
            return bArr;
        }
        onExtraCallbackWithResult(bArr, i, i2);
        return bArr;
    }

    private void onExtraCallbackWithResult(byte[] bArr, int i, int i2) {
        int length;
        int iMin;
        byte[] next;
        int i3 = i;
        int i4 = 0;
        while (i2 > 0) {
            if (i3 > 0) {
                Iterator<byte[]> it = this.IAuthTabCallback.iterator();
                int length2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.length + length2 >= i3) {
                        break;
                    } else {
                        length2 += next.length;
                    }
                }
                if (next == null) {
                    throw new IllegalStateException("Failed to find a block containing offset " + i);
                }
                length = (length2 + next.length) - i3;
                iMin = Math.min(i2, next.length - length);
            } else {
                length = -i3;
                iMin = Math.min(i2, i4 + i3);
                next = bArr;
            }
            System.arraycopy(next, length, bArr, i4, iMin);
            i3 -= iMin;
            i2 -= iMin;
            i4 += iMin;
        }
    }

    public void IAuthTabCallback() throws IOException {
        if (this.onNavigationEvent) {
            return;
        }
        this.onExtraCallbackWithResult.onExtraCallback();
        this.onNavigationEvent = true;
    }

    private void onExtraCallback(setCornerBottomRightRadius.onExtraCallbackWithResult onextracallbackwithresult) {
        this.IAuthTabCallback.addFirst(onWarmupCompleted(onextracallbackwithresult.onNavigationEvent(), onextracallbackwithresult.onWarmupCompleted()));
    }

    private void onExtraCallbackWithResult(byte[] bArr) {
        this.IAuthTabCallback.addFirst(bArr);
    }

    private void onExtraCallback() {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Iterator<onExtraCallbackWithResult> itDescendingIterator = this.onTransact.descendingIterator();
        int i = 0;
        while (itDescendingIterator.hasNext()) {
            onExtraCallbackWithResult next = itDescendingIterator.next();
            if (next.onNavigationEvent()) {
                break;
            }
            int iIAuthTabCallback = next.IAuthTabCallback();
            linkedList2.addFirst(Integer.valueOf(iIAuthTabCallback));
            linkedList.addFirst(next);
            i += iIAuthTabCallback;
            if (i >= 12) {
                break;
            }
        }
        final Deque<onExtraCallbackWithResult> deque = this.onTransact;
        linkedList.forEach(new Consumer() { // from class: org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                deque.remove((MediaView.onExtraCallbackWithResult) obj);
            }
        });
        int size = linkedList.size();
        int iIntValue = 0;
        for (int i2 = 1; i2 < size; i2++) {
            iIntValue += ((Integer) linkedList2.get(i2)).intValue();
        }
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        if (iIntValue > 0) {
            onextracallbackwithresult.onWarmupCompleted(onWarmupCompleted(iIntValue, iIntValue));
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) linkedList.get(0);
        int i3 = 12 - iIntValue;
        int iOnWarmupCompleted = onextracallbackwithresult2.onExtraCallbackWithResult() ? onextracallbackwithresult2.onWarmupCompleted() : 0;
        if (onextracallbackwithresult2.onExtraCallbackWithResult() && iOnWarmupCompleted >= 16 - iIntValue) {
            onextracallbackwithresult.onWarmupCompleted(onWarmupCompleted(iIntValue + i3, i3));
            this.onTransact.add(onextracallbackwithresult2.onNavigationEvent(iOnWarmupCompleted - i3));
        } else {
            if (onextracallbackwithresult2.onExtraCallbackWithResult()) {
                onextracallbackwithresult.onWarmupCompleted(onWarmupCompleted(iIntValue + iOnWarmupCompleted, iOnWarmupCompleted));
            }
            onextracallbackwithresult2.onExtraCallbackWithResult(onextracallbackwithresult);
        }
        this.onTransact.add(onextracallbackwithresult);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.onExtraCallbackWithResult.onWarmupCompleted(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.onWarmupCompleted;
        bArr[0] = (byte) i;
        write(bArr);
    }

    private onExtraCallbackWithResult IAuthTabCallback(int i) throws IOException {
        onWarmupCompleted(i);
        onExtraCallbackWithResult onextracallbackwithresultPeekLast = this.onTransact.peekLast();
        if (onextracallbackwithresultPeekLast != null && !onextracallbackwithresultPeekLast.onExtraCallbackWithResult()) {
            return onextracallbackwithresultPeekLast;
        }
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        this.onTransact.addLast(onextracallbackwithresult);
        return onextracallbackwithresult;
    }

    private void IAuthTabCallbackDefault() throws IOException {
        onExtraCallback();
        for (onExtraCallbackWithResult onextracallbackwithresult : this.onTransact) {
            if (!onextracallbackwithresult.onNavigationEvent()) {
                onextracallbackwithresult.onExtraCallback(this.onExtraCallback);
            }
        }
        this.onTransact.clear();
    }

    private void onWarmupCompleted(int i) throws IOException {
        Iterator<onExtraCallbackWithResult> itDescendingIterator = this.onTransact.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            onExtraCallbackWithResult next = itDescendingIterator.next();
            if (next.onNavigationEvent()) {
                break;
            } else {
                i += next.IAuthTabCallback();
            }
        }
        for (onExtraCallbackWithResult onextracallbackwithresult : this.onTransact) {
            if (!onextracallbackwithresult.onNavigationEvent()) {
                i -= onextracallbackwithresult.IAuthTabCallback();
                if (!onextracallbackwithresult.onWarmupCompleted(i)) {
                    return;
                } else {
                    onextracallbackwithresult.onExtraCallback(this.onExtraCallback);
                }
            }
        }
    }
}
