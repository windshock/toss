package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onMediaDownloaded extends BaseApiResponse<List<? extends onNavigationEvent>> {
    public static final int $stable = 8;

    public static final class onNavigationEvent {
        public static final int $stable = 8;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @SerializedName("accountGroupName")
        private String accountGroupName;

        @SerializedName("bankAccountNo")
        private String bankAccountNo;

        @SerializedName("bankCode")
        private int bankCode;

        @SerializedName("checkNameResult")
        private String checkNameResult;

        @SerializedName("registerStatus")
        private onExtraCallback registerStatus;

        @SerializedName("resultMessage")
        private String resultMessage;

        @SerializedName("success")
        private boolean success;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.accountGroupName, onnavigationevent.accountGroupName)) {
                int i3 = onNavigationEvent + 29;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.bankAccountNo, onnavigationevent.bankAccountNo)) {
                int i5 = onNavigationEvent;
                int i6 = i5 + 23;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 67;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            if (this.bankCode != onnavigationevent.bankCode || !Intrinsics.areEqual(this.checkNameResult, onnavigationevent.checkNameResult)) {
                return false;
            }
            if (this.registerStatus != onnavigationevent.registerStatus) {
                int i9 = onNavigationEvent + 125;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (this.success == onnavigationevent.success) {
                return Intrinsics.areEqual(this.resultMessage, onnavigationevent.resultMessage);
            }
            int i10 = onNavigationEvent + 29;
            onExtraCallback = i10 % 128;
            return i10 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.accountGroupName.hashCode();
            int iHashCode3 = this.bankAccountNo.hashCode();
            int iHashCode4 = Integer.hashCode(this.bankCode);
            int iHashCode5 = this.checkNameResult.hashCode();
            int iHashCode6 = this.registerStatus.hashCode();
            int iHashCode7 = Boolean.hashCode(this.success);
            String str = this.resultMessage;
            if (str == null) {
                int i4 = onExtraCallback + 5;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ResultAccount(accountGroupName=" + this.accountGroupName + ", bankAccountNo=" + this.bankAccountNo + ", bankCode=" + this.bankCode + ", checkNameResult=" + this.checkNameResult + ", registerStatus=" + this.registerStatus + ", success=" + this.success + ", resultMessage=" + this.resultMessage + ")";
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.bankAccountNo;
            int i5 = i3 + 113;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
            }
            return str;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = this.bankCode;
            int i5 = i3 + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.resultMessage;
            }
            throw null;
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            if (this.success) {
                int i2 = onExtraCallback + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    onExtraCallback onextracallback = onExtraCallback.SUCCESS_WRITE;
                    throw null;
                }
                if (this.registerStatus == onExtraCallback.SUCCESS_WRITE) {
                    return true;
                }
            }
            int i3 = onNavigationEvent + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback FAIL;
        public static final onExtraCallback SUCCESS_READ;
        public static final onExtraCallback SUCCESS_WRITE;
        private static long onExtraCallback;
        private static char[] onNavigationEvent;
        private static int onWarmupCompleted;
        private static final byte[] $$a = {57, 22, -21, -92};
        private static final int $$b = 91;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r7, short r8, byte r9) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 1
                byte[] r0 = o.onMediaDownloaded.onExtraCallback.$$a
                int r9 = r9 * 2
                int r9 = r9 + 4
                int r8 = r8 * 2
                int r8 = 97 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r8 = r9
                r4 = r2
                goto L2a
            L17:
                r3 = r2
                r6 = r9
                r9 = r8
                r8 = r6
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L28:
                r3 = r0[r8]
            L2a:
                int r9 = r9 + r3
                int r8 = r8 + 1
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onMediaDownloaded.onExtraCallback.$$c(short, short, byte):java.lang.String");
        }

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = SUCCESS_WRITE;
            if (i3 != 0) {
                return new onExtraCallback[]{onextracallback, SUCCESS_READ, FAIL};
            }
            onExtraCallback onextracallback2 = SUCCESS_READ;
            onExtraCallback onextracallback3 = FAIL;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[3];
            onextracallbackArr[0] = onextracallback;
            onextracallbackArr[1] = onextracallback2;
            onextracallbackArr[5] = onextracallback3;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onWarmupCompleted = 0;
            IAuthTabCallback();
            SUCCESS_WRITE = new onExtraCallback("SUCCESS_WRITE", 0);
            SUCCESS_READ = new onExtraCallback("SUCCESS_READ", 1);
            Object[] objArr = new Object[1];
            a(Process.myTid() >> 22, 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (10276 - TextUtils.indexOf("", "", 0)), objArr);
            FAIL = new onExtraCallback(((String) objArr[0]).intern(), 2);
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = asInterface + 105;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            float f;
            char c2;
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (true) {
                f = 0.0f;
                c2 = '0';
                if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                    break;
                }
                int i4 = $10 + 89;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getOffsetBefore("", 0) + 17, TextUtils.indexOf((CharSequence) "", '0', 0) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 46133), (KeyEvent.getMaxKeyCode() >> 16) + 31, 20219 - Process.getGidForName(""), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 49123), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1494 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            int i7 = $10 + 25;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        char cIndexOf = (char) (49122 - TextUtils.indexOf("", c2, 0, 0));
                        int iLastIndexOf = TextUtils.lastIndexOf("", c2, 0, 0) + 45;
                        int i9 = 1494 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iLastIndexOf, i9, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i10 = $10 + 89;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    f = 0.0f;
                    c2 = '0';
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            String str = new String(cArr);
            int i12 = $10 + 45;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str;
        }

        static void IAuthTabCallback() {
            onNavigationEvent = new char[]{50614, 29891, 42845, 53738};
            onExtraCallback = -7125342996619633498L;
        }
    }
}
