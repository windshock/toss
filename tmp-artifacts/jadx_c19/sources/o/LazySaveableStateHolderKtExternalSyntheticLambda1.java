package o;

import com.alibaba.griver.base.common.utils.HexStringUtil;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LazySaveableStateHolderKtExternalSyntheticLambda1 {
    public static final ByteBuffer IAuthTabCallback;
    public static final byte[] onExtraCallbackWithResult;
    public static final LazyLayoutPinnableItemKtExternalSyntheticLambda0 onWarmupCompleted;
    static final Charset onNavigationEvent = Charset.forName("US-ASCII");
    public static final Charset onTransact = Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME);
    static final Charset onExtraCallback = Charset.forName("ISO-8859-1");

    public interface IAuthTabCallback extends asBinder<Double> {
        @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        IAuthTabCallback onNavigationEvent(int i2);
    }

    public interface IAuthTabCallbackDefault extends asBinder<Long> {
        @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        IAuthTabCallbackDefault onNavigationEvent(int i2);
    }

    public interface IAuthTabCallbackStub extends asBinder<Integer> {
        @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        IAuthTabCallbackStub onNavigationEvent(int i2);
    }

    public interface asBinder<E> extends List<E>, RandomAccess {
        boolean onExtraCallbackWithResult();

        asBinder<E> onNavigationEvent(int i2);

        void onNavigationEvent();
    }

    public interface asInterface extends asBinder<Float> {
        @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        asInterface onNavigationEvent(int i2);
    }

    public interface onExtraCallback<T extends onWarmupCompleted> {
        T onWarmupCompleted(int i2);
    }

    public interface onExtraCallbackWithResult extends asBinder<Boolean> {
        @Override // o.LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        onExtraCallbackWithResult onNavigationEvent(int i2);
    }

    public interface onNavigationEvent {
        boolean onExtraCallbackWithResult(int i2);
    }

    public interface onWarmupCompleted {
        int getNumber();
    }

    public static int IAuthTabCallback(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int onExtraCallback(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T onNavigationEvent(T t) {
        return t;
    }

    static {
        byte[] bArr = new byte[0];
        onExtraCallbackWithResult = bArr;
        IAuthTabCallback = ByteBuffer.wrap(bArr);
        onWarmupCompleted = LazyLayoutPinnableItemKtExternalSyntheticLambda0.onWarmupCompleted(bArr);
    }

    static <T> T onNavigationEvent(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int onNavigationEvent(byte[] bArr) {
        return IAuthTabCallback(bArr, 0, bArr.length);
    }

    static int IAuthTabCallback(byte[] bArr, int i2, int i3) {
        int iOnExtraCallback = onExtraCallback(i3, bArr, i2, i3);
        if (iOnExtraCallback == 0) {
            return 1;
        }
        return iOnExtraCallback;
    }

    static int onExtraCallback(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    static Object onWarmupCompleted(Object obj, Object obj2) {
        return ((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj).onUnminimized().IAuthTabCallback((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj2).IAuthTabCallbackStub();
    }
}
