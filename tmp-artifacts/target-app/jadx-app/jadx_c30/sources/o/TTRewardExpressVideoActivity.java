package o;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTRewardExpressVideoActivity {
    static final TTRewardExpressVideoActivity[] onNavigationEvent = new TTRewardExpressVideoActivity[0];
    boolean IAuthTabCallback;
    int IAuthTabCallbackDefault;
    long IAuthTabCallbackStub;
    long[] asBinder;
    long[] asInterface;
    TTPlayableLandingPageActivity4[] onExtraCallback;
    TTPlayableLandingPageActivity5[] onExtraCallbackWithResult;
    long onTransact;
    long onWarmupCompleted;

    TTRewardExpressVideoActivity() {
    }

    int onExtraCallbackWithResult(int i) {
        if (this.onExtraCallbackWithResult == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            TTPlayableLandingPageActivity5[] tTPlayableLandingPageActivity5Arr = this.onExtraCallbackWithResult;
            if (i2 >= tTPlayableLandingPageActivity5Arr.length) {
                return -1;
            }
            if (tTPlayableLandingPageActivity5Arr[i2].IAuthTabCallback == i) {
                return i2;
            }
            i2++;
        }
    }

    Iterable<TTPlayableLandingPageActivity4> IAuthTabCallback() throws IOException {
        TTPlayableLandingPageActivity4[] tTPlayableLandingPageActivity4Arr;
        long[] jArr = this.asInterface;
        if (jArr == null || (tTPlayableLandingPageActivity4Arr = this.onExtraCallback) == null || jArr.length == 0 || tTPlayableLandingPageActivity4Arr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        int i = (int) this.asInterface[0];
        while (i >= 0) {
            TTPlayableLandingPageActivity4[] tTPlayableLandingPageActivity4Arr2 = this.onExtraCallback;
            if (i >= tTPlayableLandingPageActivity4Arr2.length) {
                break;
            }
            if (linkedList.contains(tTPlayableLandingPageActivity4Arr2[i])) {
                throw new IOException("folder uses the same coder more than once in coder chain");
            }
            linkedList.addLast(this.onExtraCallback[i]);
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            i = iOnExtraCallbackWithResult != -1 ? (int) this.onExtraCallbackWithResult[iOnExtraCallbackWithResult].onExtraCallback : -1;
        }
        return linkedList;
    }

    long onNavigationEvent() {
        long j = this.onTransact;
        if (j == 0) {
            return 0L;
        }
        for (int i = ((int) j) - 1; i >= 0; i--) {
            if (onExtraCallbackWithResult(i) < 0) {
                return this.asBinder[i];
            }
        }
        return 0L;
    }

    long onNavigationEvent(TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4) {
        if (this.onExtraCallback == null) {
            return 0L;
        }
        int i = 0;
        while (true) {
            TTPlayableLandingPageActivity4[] tTPlayableLandingPageActivity4Arr = this.onExtraCallback;
            if (i >= tTPlayableLandingPageActivity4Arr.length) {
                return 0L;
            }
            if (tTPlayableLandingPageActivity4Arr[i] == tTPlayableLandingPageActivity4) {
                return this.asBinder[i];
            }
            i++;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Folder with ");
        sb.append(this.onExtraCallback.length);
        sb.append(" coders, ");
        sb.append(this.IAuthTabCallbackStub);
        sb.append(" input streams, ");
        sb.append(this.onTransact);
        sb.append(" output streams, ");
        sb.append(this.onExtraCallbackWithResult.length);
        sb.append(" bind pairs, ");
        sb.append(this.asInterface.length);
        sb.append(" packed streams, ");
        sb.append(this.asBinder.length);
        sb.append(" unpack sizes, ");
        if (this.IAuthTabCallback) {
            str = "with CRC " + this.onWarmupCompleted;
        } else {
            str = "without CRC";
        }
        sb.append(str);
        sb.append(" and ");
        sb.append(this.IAuthTabCallbackDefault);
        sb.append(" unpack streams");
        return sb.toString();
    }
}
