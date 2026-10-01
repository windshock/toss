package o;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryActivity51 extends TTBaseLandingPageActivity {
    private final transient int[] IAuthTabCallback;
    private final transient byte[][] onWarmupCompleted;

    public final byte[][] ICustomTabsCallback() {
        return this.onWarmupCompleted;
    }

    public final int[] extraCallback() {
        return this.IAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTHistoryActivity51(@NotNull byte[][] bArr, @NotNull int[] iArr) {
        super(TTBaseLandingPageActivity.EMPTY.onWarmupCompleted());
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        this.onWarmupCompleted = bArr;
        this.IAuthTabCallback = iArr;
    }

    @Override // o.TTBaseLandingPageActivity
    public String onExtraCallbackWithResult(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "");
        return readTypedObject().onExtraCallbackWithResult(charset);
    }

    @Override // o.TTBaseLandingPageActivity
    public String IAuthTabCallback() {
        return readTypedObject().IAuthTabCallback();
    }

    @Override // o.TTBaseLandingPageActivity
    public String asInterface() {
        return readTypedObject().asInterface();
    }

    @Override // o.TTBaseLandingPageActivity
    public TTBaseLandingPageActivity IAuthTabCallbackStubProxy() {
        return readTypedObject().IAuthTabCallbackStubProxy();
    }

    @Override // o.TTBaseLandingPageActivity
    public TTBaseLandingPageActivity onExtraCallback(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = ICustomTabsCallback().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = extraCallback()[length + i];
            int i4 = extraCallback()[i];
            messageDigest.update(ICustomTabsCallback()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new TTBaseLandingPageActivity(bArrDigest);
    }

    @Override // o.TTBaseLandingPageActivity
    public int onExtraCallback(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return readTypedObject().onExtraCallback(bArr, i);
    }

    @Override // o.TTBaseLandingPageActivity
    public int onWarmupCompleted(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return readTypedObject().onWarmupCompleted(bArr, i);
    }

    private final TTBaseLandingPageActivity readTypedObject() {
        return new TTBaseLandingPageActivity(access000());
    }

    @Override // o.TTBaseLandingPageActivity
    public byte[] IAuthTabCallbackStub() {
        return access000();
    }

    @Override // o.TTBaseLandingPageActivity
    public String toString() {
        return readTypedObject().toString();
    }

    private final Object writeReplace() {
        TTBaseLandingPageActivity typedObject = readTypedObject();
        Intrinsics.checkNotNull(typedObject, "");
        return typedObject;
    }

    @Override // o.TTBaseLandingPageActivity
    public TTBaseLandingPageActivity onExtraCallbackWithResult(int i, int i2) {
        int iOnExtraCallback = TTAppOpenAdActivity6.onExtraCallback(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (iOnExtraCallback > access100()) {
            throw new IllegalArgumentException(("endIndex=" + iOnExtraCallback + " > length(" + access100() + ')').toString());
        }
        int i3 = iOnExtraCallback - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iOnExtraCallback + " < beginIndex=" + i).toString());
        }
        if (i == 0 && iOnExtraCallback == access100()) {
            return this;
        }
        if (i == iOnExtraCallback) {
            return TTBaseLandingPageActivity.EMPTY;
        }
        int iOnExtraCallback2 = TTHistoryLandingPageActivity11.onExtraCallback(this, i);
        int iOnExtraCallback3 = TTHistoryLandingPageActivity11.onExtraCallback(this, iOnExtraCallback - 1);
        byte[][] bArr = (byte[][]) ArraysKt___ArraysJvmKt.copyOfRange(ICustomTabsCallback(), iOnExtraCallback2, iOnExtraCallback3 + 1);
        int[] iArr = new int[bArr.length << 1];
        if (iOnExtraCallback2 <= iOnExtraCallback3) {
            int i4 = iOnExtraCallback2;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(extraCallback()[i4] - i, i3);
                iArr[bArr.length + i5] = extraCallback()[ICustomTabsCallback().length + i4];
                if (i4 == iOnExtraCallback3) {
                    break;
                }
                i4++;
                i5++;
            }
        }
        int i6 = iOnExtraCallback2 != 0 ? extraCallback()[iOnExtraCallback2 - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i - i6);
        return new TTHistoryActivity51(bArr, iArr);
    }

    @Override // o.TTBaseLandingPageActivity
    public byte onNavigationEvent(int i) {
        TTAppOpenAdActivity6.onExtraCallbackWithResult(extraCallback()[ICustomTabsCallback().length - 1], i, 1L);
        int iOnExtraCallback = TTHistoryLandingPageActivity11.onExtraCallback(this, i);
        return ICustomTabsCallback()[iOnExtraCallback][(i - (iOnExtraCallback == 0 ? 0 : extraCallback()[iOnExtraCallback - 1])) + extraCallback()[ICustomTabsCallback().length + iOnExtraCallback]];
    }

    @Override // o.TTBaseLandingPageActivity
    public int onNavigationEvent() {
        return extraCallback()[ICustomTabsCallback().length - 1];
    }

    @Override // o.TTBaseLandingPageActivity
    public byte[] access000() {
        byte[] bArr = new byte[access100()];
        int length = ICustomTabsCallback().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = extraCallback()[length + i];
            int i5 = extraCallback()[i];
            int i6 = i5 - i2;
            ArraysKt___ArraysJvmKt.copyInto(ICustomTabsCallback()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // o.TTBaseLandingPageActivity
    public void onWarmupCompleted(@NotNull TTBaseActivity tTBaseActivity, int i, int i2) {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        int i3 = i + i2;
        int iOnExtraCallback = TTHistoryLandingPageActivity11.onExtraCallback(this, i);
        while (i < i3) {
            int i4 = iOnExtraCallback == 0 ? 0 : extraCallback()[iOnExtraCallback - 1];
            int i5 = extraCallback()[iOnExtraCallback];
            int i6 = extraCallback()[ICustomTabsCallback().length + iOnExtraCallback];
            int iMin = Math.min(i3, (i5 - i4) + i4) - i;
            int i7 = i6 + (i - i4);
            TTHistoryActivity2 tTHistoryActivity2 = new TTHistoryActivity2(ICustomTabsCallback()[iOnExtraCallback], i7, i7 + iMin, true, false);
            TTHistoryActivity2 tTHistoryActivity22 = tTBaseActivity.head;
            if (tTHistoryActivity22 == null) {
                tTHistoryActivity2.prev = tTHistoryActivity2;
                tTHistoryActivity2.next = tTHistoryActivity2;
                tTBaseActivity.head = tTHistoryActivity2;
            } else {
                Intrinsics.checkNotNull(tTHistoryActivity22);
                TTHistoryActivity2 tTHistoryActivity23 = tTHistoryActivity22.prev;
                Intrinsics.checkNotNull(tTHistoryActivity23);
                tTHistoryActivity23.onNavigationEvent(tTHistoryActivity2);
            }
            i += iMin;
            iOnExtraCallback++;
        }
        tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() + i2);
    }

    @Override // o.TTBaseLandingPageActivity
    public boolean onExtraCallbackWithResult(int i, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        if (i < 0 || i > access100() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iOnExtraCallback = TTHistoryLandingPageActivity11.onExtraCallback(this, i);
        while (i < i4) {
            int i5 = iOnExtraCallback == 0 ? 0 : extraCallback()[iOnExtraCallback - 1];
            int i6 = extraCallback()[iOnExtraCallback];
            int i7 = extraCallback()[ICustomTabsCallback().length + iOnExtraCallback];
            int iMin = Math.min(i4, (i6 - i5) + i5) - i;
            if (!tTBaseLandingPageActivity.IAuthTabCallback(i2, ICustomTabsCallback()[iOnExtraCallback], i7 + (i - i5), iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iOnExtraCallback++;
        }
        return true;
    }

    @Override // o.TTBaseLandingPageActivity
    public boolean IAuthTabCallback(int i, @NotNull byte[] bArr, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i4 < 0 || i4 > access100() - i3 || i5 < 0 || i5 > bArr.length - i3) {
            return false;
        }
        int i6 = i3 + i4;
        int iOnExtraCallback = TTHistoryLandingPageActivity11.onExtraCallback(this, i);
        while (i4 < i6) {
            int i7 = iOnExtraCallback == 0 ? 0 : extraCallback()[iOnExtraCallback - 1];
            int i8 = extraCallback()[iOnExtraCallback];
            int i9 = extraCallback()[ICustomTabsCallback().length + iOnExtraCallback];
            int iMin = Math.min(i6, (i8 - i7) + i7) - i4;
            if (!((Boolean) TTAppOpenAdActivity6.onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{ICustomTabsCallback()[iOnExtraCallback], Integer.valueOf(i9 + (i4 - i7)), bArr, Integer.valueOf(i5), Integer.valueOf(iMin)}, -386312370, 386312371, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).booleanValue()) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iOnExtraCallback++;
        }
        return true;
    }

    @Override // o.TTBaseLandingPageActivity
    public void onNavigationEvent(int i, @NotNull byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        long j = i3;
        TTAppOpenAdActivity6.onExtraCallbackWithResult(access100(), i, j);
        TTAppOpenAdActivity6.onExtraCallbackWithResult(bArr.length, i2, j);
        int i4 = i3 + i;
        int iOnExtraCallback = TTHistoryLandingPageActivity11.onExtraCallback(this, i);
        while (i < i4) {
            int i5 = iOnExtraCallback == 0 ? 0 : extraCallback()[iOnExtraCallback - 1];
            int i6 = extraCallback()[iOnExtraCallback];
            int i7 = extraCallback()[ICustomTabsCallback().length + iOnExtraCallback];
            int iMin = Math.min(i4, (i6 - i5) + i5) - i;
            int i8 = i7 + (i - i5);
            ArraysKt___ArraysJvmKt.copyInto(ICustomTabsCallback()[iOnExtraCallback], bArr, i2, i8, i8 + iMin);
            i2 += iMin;
            i += iMin;
            iOnExtraCallback++;
        }
    }

    @Override // o.TTBaseLandingPageActivity
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TTBaseLandingPageActivity) {
            TTBaseLandingPageActivity tTBaseLandingPageActivity = (TTBaseLandingPageActivity) obj;
            if (tTBaseLandingPageActivity.access100() == access100() && onExtraCallbackWithResult(0, tTBaseLandingPageActivity, 0, access100())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.TTBaseLandingPageActivity
    public int hashCode() {
        int iOnExtraCallback = onExtraCallback();
        if (iOnExtraCallback != 0) {
            return iOnExtraCallback;
        }
        int length = ICustomTabsCallback().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = extraCallback()[length + i];
            int i5 = extraCallback()[i];
            byte[] bArr = ICustomTabsCallback()[i];
            for (int i6 = i4; i6 < (i5 - i3) + i4; i6++) {
                i2 = (i2 * 31) + bArr[i6];
            }
            i++;
            i3 = i5;
        }
        onWarmupCompleted(i2);
        return i2;
    }
}
