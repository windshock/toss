package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.PageShowPoint;
import o.getScreenTop$IAuthTabCallback;
import o.getTitleBarHeight$onWarmupCompleted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isTransparentTitle {
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 129;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static long IAuthTabCallback = 7798559133331975163L;
    private static int onWarmupCompleted = -1776194565;
    private static char onExtraCallback = 24145;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = (s3 * 4) + 1;
        int i4 = 110 - s;
        int i5 = s2 + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 += -i5;
            i5 = i6;
            i = i2;
            int i7 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i5 = bArr[i7];
            i4 += -i5;
            i5 = i6;
            i = i2;
            int i72 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            int i722 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b A[PHI: r2
      0x005b: PHI (r2v27 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[PHI: r2
      0x005e: PHI (r2v24 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[PHI: r2
      0x009d: PHI (r2v23 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0217 A[PHI: r2
      0x0217: PHI (r2v20 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0265 A[PHI: r2
      0x0265: PHI (r2v18 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b3 A[PHI: r2
      0x02b3: PHI (r2v16 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0301 A[PHI: r2
      0x0301: PHI (r2v14 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0350 A[PHI: r2
      0x0350: PHI (r2v12 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052 A[PHI: r2
      0x0052: PHI (r2v32 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055 A[PHI: r2
      0x0055: PHI (r2v30 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[PHI: r2
      0x0058: PHI (r2v28 java.lang.String) = (r2v11 java.lang.String), (r2v42 java.lang.String) binds: [B:13:0x0098, B:5:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final getTitleBarHeight onWarmupCompleted(@NotNull specToLayoutParam spectolayoutparam) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        final boolean z = true;
        final boolean z2 = false;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            a((char) (4117 >>> TextUtils.getTrimmedLength("")), ViewConfiguration.getScrollBarSize() >>> 47, new char[]{51762, 38044, 62963, 57733, 7075, 58237, 35455, 22228, 28368, 52713, 33499, 28759, 34561, 62078, 48228, 65377, 12651, 34186, 39494, 26795, 63690, 47410, 59099, 1931, 22723, 45634, 47277, 25051, 20960, 27485, 12530, 26931, 22337, 1459, 464, 56357, 26739, 5931, 57003, 51675, 32800, 7529, 28843, 31946, 38693, 22544, 16735, 34290, 23782, 61584, 37256, 54654, 34178, 18901}, new char[]{0, 0, 0, 0}, new char[]{12171, 41778, 47617, 24384}, objArr);
            strIntern = ((String) objArr[0]).intern();
            Intrinsics.checkNotNullParameter(spectolayoutparam, "");
            switch (IAuthTabCallback.onExtraCallback[spectolayoutparam.ordinal()]) {
                case 1:
                    String str = strIntern;
                    final List listListOf = CollectionsKt.listOf(new WindowInfoProxy[]{new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 가능 계좌 - 잔액 있음", str, "0000", null, null, "11", 300000L, 310000L, 20000L, 10000L), new WindowInfoProxy("5678", "33", "orgCodeTest2", "246810", null, "해지 가능 계좌 - 잔액 있음", str, "0000", null, null, "11", 200000L, 210000L, 30000L, 20000L)});
                    final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) CollectionsKt.firstOrNull(PageShowPoint.Companion.IAuthTabCallback());
                    return new getTitleBarHeight(listListOf, tabBarInfoQueryPointOnTabBarInfoQueryListener, z2) { // from class: o.getTitleBarHeight$onTransact
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;
                        private final List<WindowInfoProxy> IAuthTabCallback;
                        private final boolean onExtraCallbackWithResult;
                        private final TabBarInfoQueryPointOnTabBarInfoQueryListener onWarmupCompleted;

                        public boolean equals(@Nullable Object obj) {
                            int i3 = 2 % 2;
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onTransact)) {
                                int i4 = onExtraCallback + 81;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                return false;
                            }
                            getTitleBarHeight$onTransact gettitlebarheight_ontransact = (getTitleBarHeight$onTransact) obj;
                            if (!Intrinsics.areEqual(this.IAuthTabCallback, gettitlebarheight_ontransact.IAuthTabCallback)) {
                                int i6 = onExtraCallback + 115;
                                onNavigationEvent = i6 % 128;
                                int i7 = i6 % 2;
                                return false;
                            }
                            if (!Intrinsics.areEqual(this.onWarmupCompleted, gettitlebarheight_ontransact.onWarmupCompleted)) {
                                int i8 = onExtraCallback + 113;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                                return false;
                            }
                            if (this.onExtraCallbackWithResult == gettitlebarheight_ontransact.onExtraCallbackWithResult) {
                                return true;
                            }
                            int i10 = onNavigationEvent + 59;
                            onExtraCallback = i10 % 128;
                            return i10 % 2 != 0;
                        }

                        public int hashCode() {
                            int iHashCode;
                            int i3 = 2 % 2;
                            int iHashCode2 = this.IAuthTabCallback.hashCode();
                            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener2 = this.onWarmupCompleted;
                            if (tabBarInfoQueryPointOnTabBarInfoQueryListener2 == null) {
                                int i4 = onNavigationEvent + 73;
                                onExtraCallback = i4 % 128;
                                int i5 = i4 % 2;
                                iHashCode = 0;
                            } else {
                                iHashCode = tabBarInfoQueryPointOnTabBarInfoQueryListener2.hashCode();
                            }
                            int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
                            int i6 = onExtraCallback + 83;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                return iHashCode3;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public String toString() {
                            int i3 = 2 % 2;
                            String str2 = "Success(availableAccounts=" + this.IAuthTabCallback + ", balanceReceiveAccount=" + this.onWarmupCompleted + ", isDonation=" + this.onExtraCallbackWithResult + ")";
                            int i4 = onNavigationEvent + 45;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            return str2;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listListOf, "");
                            this.IAuthTabCallback = listListOf;
                            this.onWarmupCompleted = tabBarInfoQueryPointOnTabBarInfoQueryListener;
                            this.onExtraCallbackWithResult = z2;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 49;
                            int i5 = i4 % 128;
                            onExtraCallback = i5;
                            if (i4 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            List<WindowInfoProxy> list = this.IAuthTabCallback;
                            int i6 = i5 + 71;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 48 / 0;
                            }
                            return list;
                        }

                        public final TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallback() {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallback + 105;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                return this.onWarmupCompleted;
                            }
                            throw null;
                        }

                        public final boolean asInterface() {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallback + 61;
                            onNavigationEvent = i4 % 128;
                            int i5 = i4 % 2;
                            boolean z3 = this.onExtraCallbackWithResult;
                            if (i5 == 0) {
                                int i6 = 80 / 0;
                            }
                            return z3;
                        }

                        public final boolean onNavigationEvent() {
                            int i3 = 2 % 2;
                            List<WindowInfoProxy> list = this.IAuthTabCallback;
                            if ((list instanceof Collection) && !(!list.isEmpty())) {
                                return true;
                            }
                            Iterator<T> it = list.iterator();
                            int i4 = onExtraCallback + 5;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 5 % 5;
                            }
                            while (it.hasNext()) {
                                if (((WindowInfoProxy) it.next()).onNavigationEvent() > 0) {
                                    int i6 = onNavigationEvent + 91;
                                    onExtraCallback = i6 % 128;
                                    int i7 = i6 % 2;
                                    return false;
                                }
                            }
                            return true;
                        }

                        public final long onWarmupCompleted() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 41;
                            onExtraCallback = i4 % 128;
                            Iterator<T> it = (i4 % 2 != 0 ? this.IAuthTabCallback : this.IAuthTabCallback).iterator();
                            long jOnNavigationEvent = 0;
                            while (it.hasNext()) {
                                int i5 = onExtraCallback + 69;
                                onNavigationEvent = i5 % 128;
                                int i6 = i5 % 2;
                                jOnNavigationEvent += ((WindowInfoProxy) it.next()).onNavigationEvent();
                            }
                            return jOnNavigationEvent;
                        }

                        public final long IAuthTabCallbackDefault() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 71;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            int i6 = onNavigationEvent + 69;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 2 / 4;
                            }
                            long jLongValue = 0;
                            while (it.hasNext()) {
                                Object[] objArr2 = {(WindowInfoProxy) it.next()};
                                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                                jLongValue += ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, 1142699074, iOnExtraCallback2, -1142699074)).longValue();
                                int i8 = onExtraCallback + 99;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                            }
                            int i10 = onExtraCallback + 1;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 84 / 0;
                            }
                            return jLongValue;
                        }

                        public final long IAuthTabCallbackStub() {
                            int i3 = 2 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            long jIAuthTabCallbackStub = 0;
                            while (it.hasNext()) {
                                int i4 = onExtraCallback + 9;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                jIAuthTabCallbackStub += ((WindowInfoProxy) it.next()).IAuthTabCallbackStub();
                                int i6 = onNavigationEvent + 79;
                                onExtraCallback = i6 % 128;
                                int i7 = i6 % 2;
                            }
                            return jIAuthTabCallbackStub;
                        }

                        public final long IAuthTabCallback() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 113;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            int i6 = onExtraCallback + 7;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            long jLongValue = 0;
                            while (!(!it.hasNext())) {
                                int i8 = onNavigationEvent + 41;
                                onExtraCallback = i8 % 128;
                                if (i8 % 2 != 0) {
                                    jLongValue %= ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{(WindowInfoProxy) it.next()}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 691346681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -691346679)).longValue();
                                } else {
                                    jLongValue += ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{(WindowInfoProxy) it.next()}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 691346681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -691346679)).longValue();
                                }
                            }
                            return jLongValue;
                        }
                    };
                case 2:
                    String str2 = strIntern;
                    final List listListOf2 = CollectionsKt.listOf(new WindowInfoProxy[]{new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 가능 계좌 - 잔액 있음", str2, "0000", null, null, "11", 300000L, 310000L, 20000L, 10000L), new WindowInfoProxy("5678", "33", "orgCodeTest2", "246810", null, "해지 가능 계좌 - 잔액 있음", str2, "0000", null, null, "11", 200000L, 210000L, 30000L, 20000L)});
                    final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener2 = null;
                    return new getTitleBarHeight(listListOf2, tabBarInfoQueryPointOnTabBarInfoQueryListener2, z) { // from class: o.getTitleBarHeight$onTransact
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;
                        private final List<WindowInfoProxy> IAuthTabCallback;
                        private final boolean onExtraCallbackWithResult;
                        private final TabBarInfoQueryPointOnTabBarInfoQueryListener onWarmupCompleted;

                        public boolean equals(@Nullable Object obj) {
                            int i3 = 2 % 2;
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onTransact)) {
                                int i4 = onExtraCallback + 81;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                return false;
                            }
                            getTitleBarHeight$onTransact gettitlebarheight_ontransact = (getTitleBarHeight$onTransact) obj;
                            if (!Intrinsics.areEqual(this.IAuthTabCallback, gettitlebarheight_ontransact.IAuthTabCallback)) {
                                int i6 = onExtraCallback + 115;
                                onNavigationEvent = i6 % 128;
                                int i7 = i6 % 2;
                                return false;
                            }
                            if (!Intrinsics.areEqual(this.onWarmupCompleted, gettitlebarheight_ontransact.onWarmupCompleted)) {
                                int i8 = onExtraCallback + 113;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                                return false;
                            }
                            if (this.onExtraCallbackWithResult == gettitlebarheight_ontransact.onExtraCallbackWithResult) {
                                return true;
                            }
                            int i10 = onNavigationEvent + 59;
                            onExtraCallback = i10 % 128;
                            return i10 % 2 != 0;
                        }

                        public int hashCode() {
                            int iHashCode;
                            int i3 = 2 % 2;
                            int iHashCode2 = this.IAuthTabCallback.hashCode();
                            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener22 = this.onWarmupCompleted;
                            if (tabBarInfoQueryPointOnTabBarInfoQueryListener22 == null) {
                                int i4 = onNavigationEvent + 73;
                                onExtraCallback = i4 % 128;
                                int i5 = i4 % 2;
                                iHashCode = 0;
                            } else {
                                iHashCode = tabBarInfoQueryPointOnTabBarInfoQueryListener22.hashCode();
                            }
                            int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
                            int i6 = onExtraCallback + 83;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                return iHashCode3;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public String toString() {
                            int i3 = 2 % 2;
                            String str22 = "Success(availableAccounts=" + this.IAuthTabCallback + ", balanceReceiveAccount=" + this.onWarmupCompleted + ", isDonation=" + this.onExtraCallbackWithResult + ")";
                            int i4 = onNavigationEvent + 45;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            return str22;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listListOf2, "");
                            this.IAuthTabCallback = listListOf2;
                            this.onWarmupCompleted = tabBarInfoQueryPointOnTabBarInfoQueryListener2;
                            this.onExtraCallbackWithResult = z;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 49;
                            int i5 = i4 % 128;
                            onExtraCallback = i5;
                            if (i4 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            List<WindowInfoProxy> list = this.IAuthTabCallback;
                            int i6 = i5 + 71;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 48 / 0;
                            }
                            return list;
                        }

                        public final TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallback() {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallback + 105;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                return this.onWarmupCompleted;
                            }
                            throw null;
                        }

                        public final boolean asInterface() {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallback + 61;
                            onNavigationEvent = i4 % 128;
                            int i5 = i4 % 2;
                            boolean z3 = this.onExtraCallbackWithResult;
                            if (i5 == 0) {
                                int i6 = 80 / 0;
                            }
                            return z3;
                        }

                        public final boolean onNavigationEvent() {
                            int i3 = 2 % 2;
                            List<WindowInfoProxy> list = this.IAuthTabCallback;
                            if ((list instanceof Collection) && !(!list.isEmpty())) {
                                return true;
                            }
                            Iterator<T> it = list.iterator();
                            int i4 = onExtraCallback + 5;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 5 % 5;
                            }
                            while (it.hasNext()) {
                                if (((WindowInfoProxy) it.next()).onNavigationEvent() > 0) {
                                    int i6 = onNavigationEvent + 91;
                                    onExtraCallback = i6 % 128;
                                    int i7 = i6 % 2;
                                    return false;
                                }
                            }
                            return true;
                        }

                        public final long onWarmupCompleted() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 41;
                            onExtraCallback = i4 % 128;
                            Iterator<T> it = (i4 % 2 != 0 ? this.IAuthTabCallback : this.IAuthTabCallback).iterator();
                            long jOnNavigationEvent = 0;
                            while (it.hasNext()) {
                                int i5 = onExtraCallback + 69;
                                onNavigationEvent = i5 % 128;
                                int i6 = i5 % 2;
                                jOnNavigationEvent += ((WindowInfoProxy) it.next()).onNavigationEvent();
                            }
                            return jOnNavigationEvent;
                        }

                        public final long IAuthTabCallbackDefault() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 71;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            int i6 = onNavigationEvent + 69;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 2 / 4;
                            }
                            long jLongValue = 0;
                            while (it.hasNext()) {
                                Object[] objArr2 = {(WindowInfoProxy) it.next()};
                                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                                jLongValue += ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, 1142699074, iOnExtraCallback2, -1142699074)).longValue();
                                int i8 = onExtraCallback + 99;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                            }
                            int i10 = onExtraCallback + 1;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 84 / 0;
                            }
                            return jLongValue;
                        }

                        public final long IAuthTabCallbackStub() {
                            int i3 = 2 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            long jIAuthTabCallbackStub = 0;
                            while (it.hasNext()) {
                                int i4 = onExtraCallback + 9;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                jIAuthTabCallbackStub += ((WindowInfoProxy) it.next()).IAuthTabCallbackStub();
                                int i6 = onNavigationEvent + 79;
                                onExtraCallback = i6 % 128;
                                int i7 = i6 % 2;
                            }
                            return jIAuthTabCallbackStub;
                        }

                        public final long IAuthTabCallback() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 113;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            int i6 = onExtraCallback + 7;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            long jLongValue = 0;
                            while (!(!it.hasNext())) {
                                int i8 = onNavigationEvent + 41;
                                onExtraCallback = i8 % 128;
                                if (i8 % 2 != 0) {
                                    jLongValue %= ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{(WindowInfoProxy) it.next()}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 691346681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -691346679)).longValue();
                                } else {
                                    jLongValue += ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{(WindowInfoProxy) it.next()}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 691346681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -691346679)).longValue();
                                }
                            }
                            return jLongValue;
                        }
                    };
                case 3:
                    String str3 = strIntern;
                    final List listListOf3 = CollectionsKt.listOf(new WindowInfoProxy[]{new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 가능 계좌 - 잔액 없음", str3, "0000", null, null, "11", 0L, 0L, 0L, 0L), new WindowInfoProxy("5678", "33", "orgCodeTest2", "246810", null, "해지 가능 계좌 - 잔액 없음", str3, "0000", null, null, "11", 0L, 0L, 0L, 0L)});
                    final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener3 = null;
                    getTitleBarHeight gettitlebarheight = new getTitleBarHeight(listListOf3, tabBarInfoQueryPointOnTabBarInfoQueryListener3, z2) { // from class: o.getTitleBarHeight$onTransact
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;
                        private final List<WindowInfoProxy> IAuthTabCallback;
                        private final boolean onExtraCallbackWithResult;
                        private final TabBarInfoQueryPointOnTabBarInfoQueryListener onWarmupCompleted;

                        public boolean equals(@Nullable Object obj) {
                            int i3 = 2 % 2;
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onTransact)) {
                                int i4 = onExtraCallback + 81;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                return false;
                            }
                            getTitleBarHeight$onTransact gettitlebarheight_ontransact = (getTitleBarHeight$onTransact) obj;
                            if (!Intrinsics.areEqual(this.IAuthTabCallback, gettitlebarheight_ontransact.IAuthTabCallback)) {
                                int i6 = onExtraCallback + 115;
                                onNavigationEvent = i6 % 128;
                                int i7 = i6 % 2;
                                return false;
                            }
                            if (!Intrinsics.areEqual(this.onWarmupCompleted, gettitlebarheight_ontransact.onWarmupCompleted)) {
                                int i8 = onExtraCallback + 113;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                                return false;
                            }
                            if (this.onExtraCallbackWithResult == gettitlebarheight_ontransact.onExtraCallbackWithResult) {
                                return true;
                            }
                            int i10 = onNavigationEvent + 59;
                            onExtraCallback = i10 % 128;
                            return i10 % 2 != 0;
                        }

                        public int hashCode() {
                            int iHashCode;
                            int i3 = 2 % 2;
                            int iHashCode2 = this.IAuthTabCallback.hashCode();
                            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener22 = this.onWarmupCompleted;
                            if (tabBarInfoQueryPointOnTabBarInfoQueryListener22 == null) {
                                int i4 = onNavigationEvent + 73;
                                onExtraCallback = i4 % 128;
                                int i5 = i4 % 2;
                                iHashCode = 0;
                            } else {
                                iHashCode = tabBarInfoQueryPointOnTabBarInfoQueryListener22.hashCode();
                            }
                            int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
                            int i6 = onExtraCallback + 83;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                return iHashCode3;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public String toString() {
                            int i3 = 2 % 2;
                            String str22 = "Success(availableAccounts=" + this.IAuthTabCallback + ", balanceReceiveAccount=" + this.onWarmupCompleted + ", isDonation=" + this.onExtraCallbackWithResult + ")";
                            int i4 = onNavigationEvent + 45;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            return str22;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listListOf3, "");
                            this.IAuthTabCallback = listListOf3;
                            this.onWarmupCompleted = tabBarInfoQueryPointOnTabBarInfoQueryListener3;
                            this.onExtraCallbackWithResult = z2;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 49;
                            int i5 = i4 % 128;
                            onExtraCallback = i5;
                            if (i4 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            List<WindowInfoProxy> list = this.IAuthTabCallback;
                            int i6 = i5 + 71;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 48 / 0;
                            }
                            return list;
                        }

                        public final TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallback() {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallback + 105;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                return this.onWarmupCompleted;
                            }
                            throw null;
                        }

                        public final boolean asInterface() {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallback + 61;
                            onNavigationEvent = i4 % 128;
                            int i5 = i4 % 2;
                            boolean z3 = this.onExtraCallbackWithResult;
                            if (i5 == 0) {
                                int i6 = 80 / 0;
                            }
                            return z3;
                        }

                        public final boolean onNavigationEvent() {
                            int i3 = 2 % 2;
                            List<WindowInfoProxy> list = this.IAuthTabCallback;
                            if ((list instanceof Collection) && !(!list.isEmpty())) {
                                return true;
                            }
                            Iterator<T> it = list.iterator();
                            int i4 = onExtraCallback + 5;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 5 % 5;
                            }
                            while (it.hasNext()) {
                                if (((WindowInfoProxy) it.next()).onNavigationEvent() > 0) {
                                    int i6 = onNavigationEvent + 91;
                                    onExtraCallback = i6 % 128;
                                    int i7 = i6 % 2;
                                    return false;
                                }
                            }
                            return true;
                        }

                        public final long onWarmupCompleted() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 41;
                            onExtraCallback = i4 % 128;
                            Iterator<T> it = (i4 % 2 != 0 ? this.IAuthTabCallback : this.IAuthTabCallback).iterator();
                            long jOnNavigationEvent = 0;
                            while (it.hasNext()) {
                                int i5 = onExtraCallback + 69;
                                onNavigationEvent = i5 % 128;
                                int i6 = i5 % 2;
                                jOnNavigationEvent += ((WindowInfoProxy) it.next()).onNavigationEvent();
                            }
                            return jOnNavigationEvent;
                        }

                        public final long IAuthTabCallbackDefault() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 71;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            int i6 = onNavigationEvent + 69;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 2 / 4;
                            }
                            long jLongValue = 0;
                            while (it.hasNext()) {
                                Object[] objArr2 = {(WindowInfoProxy) it.next()};
                                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                                jLongValue += ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, 1142699074, iOnExtraCallback2, -1142699074)).longValue();
                                int i8 = onExtraCallback + 99;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                            }
                            int i10 = onExtraCallback + 1;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 84 / 0;
                            }
                            return jLongValue;
                        }

                        public final long IAuthTabCallbackStub() {
                            int i3 = 2 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            long jIAuthTabCallbackStub = 0;
                            while (it.hasNext()) {
                                int i4 = onExtraCallback + 9;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                jIAuthTabCallbackStub += ((WindowInfoProxy) it.next()).IAuthTabCallbackStub();
                                int i6 = onNavigationEvent + 79;
                                onExtraCallback = i6 % 128;
                                int i7 = i6 % 2;
                            }
                            return jIAuthTabCallbackStub;
                        }

                        public final long IAuthTabCallback() {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 113;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            Iterator<T> it = this.IAuthTabCallback.iterator();
                            int i6 = onExtraCallback + 7;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            long jLongValue = 0;
                            while (!(!it.hasNext())) {
                                int i8 = onNavigationEvent + 41;
                                onExtraCallback = i8 % 128;
                                if (i8 % 2 != 0) {
                                    jLongValue %= ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{(WindowInfoProxy) it.next()}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 691346681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -691346679)).longValue();
                                } else {
                                    jLongValue += ((Long) WindowInfoProxy.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{(WindowInfoProxy) it.next()}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 691346681, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -691346679)).longValue();
                                }
                            }
                            return jLongValue;
                        }
                    };
                    int i3 = onExtraCallbackWithResult + 101;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return gettitlebarheight;
                case 4:
                    String str4 = strIntern;
                    final List listListOf4 = CollectionsKt.listOf(new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 가능 계좌 - 잔액 있음", str4, "0000", null, null, "11", 300000L, 310000L, 20000L, 10000L));
                    final List listListOf5 = CollectionsKt.listOf(new WindowInfoProxy("5678", "33", "orgCodeTest2", "246810", null, "해지 불가능 계좌 - 잔액 없음", str4, "5012", "해지 불가능한 계좌", null, "11", 0L, 0L, 0L, 0L));
                    return new getTitleBarHeight(listListOf4, listListOf5) { // from class: o.getTitleBarHeight$onExtraCallbackWithResult
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;
                        private final List<WindowInfoProxy> onExtraCallback;
                        private final List<WindowInfoProxy> onExtraCallbackWithResult;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent;
                            int i7 = i6 + 45;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            if (this == obj) {
                                int i9 = i6 + 63;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onExtraCallbackWithResult)) {
                                return false;
                            }
                            getTitleBarHeight$onExtraCallbackWithResult gettitlebarheight_onextracallbackwithresult = (getTitleBarHeight$onExtraCallbackWithResult) obj;
                            if (Intrinsics.areEqual(this.onExtraCallback, gettitlebarheight_onextracallbackwithresult.onExtraCallback)) {
                                if (Intrinsics.areEqual(this.onExtraCallbackWithResult, gettitlebarheight_onextracallbackwithresult.onExtraCallbackWithResult)) {
                                    return true;
                                }
                                int i11 = IAuthTabCallback + 121;
                                onNavigationEvent = i11 % 128;
                                return i11 % 2 == 0;
                            }
                            int i12 = onNavigationEvent;
                            int i13 = i12 + 125;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            int i15 = i12 + 95;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            return false;
                        }

                        public int hashCode() {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 103;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            int iHashCode = this.onExtraCallback.hashCode();
                            return i7 == 0 ? (iHashCode * 123) / this.onExtraCallbackWithResult.hashCode() : (iHashCode * 31) + this.onExtraCallbackWithResult.hashCode();
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str5 = "PartialSuccess(availableAccounts=" + this.onExtraCallback + ", unavailableAccounts=" + this.onExtraCallbackWithResult + ")";
                            int i6 = IAuthTabCallback + 89;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            return str5;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listListOf4, "");
                            Intrinsics.checkNotNullParameter(listListOf5, "");
                            this.onExtraCallback = listListOf4;
                            this.onExtraCallbackWithResult = listListOf5;
                        }

                        public final List<WindowInfoProxy> onExtraCallback() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 25;
                            int i7 = i6 % 128;
                            IAuthTabCallback = i7;
                            int i8 = i6 % 2;
                            List<WindowInfoProxy> list = this.onExtraCallback;
                            int i9 = i7 + 1;
                            onNavigationEvent = i9 % 128;
                            if (i9 % 2 != 0) {
                                return list;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 25;
                            IAuthTabCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                                return this.onExtraCallbackWithResult;
                            }
                            throw null;
                        }
                    };
                case 5:
                    String str5 = strIntern;
                    final List listListOf6 = CollectionsKt.listOf(new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 가능 계좌 - 잔액 없음", str5, "0000", null, null, "11", 0L, 0L, 0L, 0L));
                    final List listListOf7 = CollectionsKt.listOf(new WindowInfoProxy("5678", "33", "orgCodeTest2", "246810", null, "해지 불가능 계좌 - 잔액 있음", str5, "5012", "해지 불가능한 계좌", null, "11", 200000L, 210000L, 30000L, 20000L));
                    return new getTitleBarHeight(listListOf6, listListOf7) { // from class: o.getTitleBarHeight$onExtraCallbackWithResult
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;
                        private final List<WindowInfoProxy> onExtraCallback;
                        private final List<WindowInfoProxy> onExtraCallbackWithResult;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent;
                            int i7 = i6 + 45;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            if (this == obj) {
                                int i9 = i6 + 63;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onExtraCallbackWithResult)) {
                                return false;
                            }
                            getTitleBarHeight$onExtraCallbackWithResult gettitlebarheight_onextracallbackwithresult = (getTitleBarHeight$onExtraCallbackWithResult) obj;
                            if (Intrinsics.areEqual(this.onExtraCallback, gettitlebarheight_onextracallbackwithresult.onExtraCallback)) {
                                if (Intrinsics.areEqual(this.onExtraCallbackWithResult, gettitlebarheight_onextracallbackwithresult.onExtraCallbackWithResult)) {
                                    return true;
                                }
                                int i11 = IAuthTabCallback + 121;
                                onNavigationEvent = i11 % 128;
                                return i11 % 2 == 0;
                            }
                            int i12 = onNavigationEvent;
                            int i13 = i12 + 125;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            int i15 = i12 + 95;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            return false;
                        }

                        public int hashCode() {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 103;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            int iHashCode = this.onExtraCallback.hashCode();
                            return i7 == 0 ? (iHashCode * 123) / this.onExtraCallbackWithResult.hashCode() : (iHashCode * 31) + this.onExtraCallbackWithResult.hashCode();
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str52 = "PartialSuccess(availableAccounts=" + this.onExtraCallback + ", unavailableAccounts=" + this.onExtraCallbackWithResult + ")";
                            int i6 = IAuthTabCallback + 89;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            return str52;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listListOf6, "");
                            Intrinsics.checkNotNullParameter(listListOf7, "");
                            this.onExtraCallback = listListOf6;
                            this.onExtraCallbackWithResult = listListOf7;
                        }

                        public final List<WindowInfoProxy> onExtraCallback() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 25;
                            int i7 = i6 % 128;
                            IAuthTabCallback = i7;
                            int i8 = i6 % 2;
                            List<WindowInfoProxy> list = this.onExtraCallback;
                            int i9 = i7 + 1;
                            onNavigationEvent = i9 % 128;
                            if (i9 % 2 != 0) {
                                return list;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 25;
                            IAuthTabCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                                return this.onExtraCallbackWithResult;
                            }
                            throw null;
                        }
                    };
                case 6:
                    PageShowPoint.onWarmupCompleted onwarmupcompleted = PageShowPoint.Companion;
                    final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener4 = (TabBarInfoQueryPointOnTabBarInfoQueryListener) CollectionsKt.firstOrNull(onwarmupcompleted.IAuthTabCallback());
                    final List listDrop = CollectionsKt.drop(onwarmupcompleted.IAuthTabCallback(), 1);
                    return new getTitleBarHeight(tabBarInfoQueryPointOnTabBarInfoQueryListener4, listDrop) { // from class: o.getTitleBarHeight$onExtraCallback
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;
                        private final TabBarInfoQueryPointOnTabBarInfoQueryListener IAuthTabCallback;
                        private final List<TabBarInfoQueryPointOnTabBarInfoQueryListener> onWarmupCompleted;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            if (this == obj) {
                                int i6 = onExtraCallbackWithResult + 107;
                                onNavigationEvent = i6 % 128;
                                int i7 = i6 % 2;
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onExtraCallback)) {
                                return false;
                            }
                            getTitleBarHeight$onExtraCallback gettitlebarheight_onextracallback = (getTitleBarHeight$onExtraCallback) obj;
                            if (Intrinsics.areEqual(this.IAuthTabCallback, gettitlebarheight_onextracallback.IAuthTabCallback)) {
                                if (Intrinsics.areEqual(this.onWarmupCompleted, gettitlebarheight_onextracallback.onWarmupCompleted)) {
                                    return true;
                                }
                                int i8 = onExtraCallbackWithResult + 23;
                                onNavigationEvent = i8 % 128;
                                return i8 % 2 == 0;
                            }
                            int i9 = onNavigationEvent + 3;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 == 0) {
                                return false;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }

                        public int hashCode() {
                            int iHashCode;
                            int i5 = 2 % 2;
                            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener5 = this.IAuthTabCallback;
                            if (tabBarInfoQueryPointOnTabBarInfoQueryListener5 == null) {
                                int i6 = onNavigationEvent + 29;
                                onExtraCallbackWithResult = i6 % 128;
                                int i7 = i6 % 2;
                                iHashCode = 0;
                            } else {
                                iHashCode = tabBarInfoQueryPointOnTabBarInfoQueryListener5.hashCode();
                                int i8 = onNavigationEvent + 113;
                                onExtraCallbackWithResult = i8 % 128;
                                int i9 = i8 % 2;
                            }
                            int iHashCode2 = (iHashCode * 31) + this.onWarmupCompleted.hashCode();
                            int i10 = onExtraCallbackWithResult + 47;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 7 / 0;
                            }
                            return iHashCode2;
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str6 = "BalanceReceiveAccountError(selectedReceiveAccount=" + this.IAuthTabCallback + ", balanceReceiveAvailableAccounts=" + this.onWarmupCompleted + ")";
                            int i6 = onExtraCallbackWithResult + 79;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                return str6;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listDrop, "");
                            this.IAuthTabCallback = tabBarInfoQueryPointOnTabBarInfoQueryListener4;
                            this.onWarmupCompleted = listDrop;
                        }

                        public final TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallbackWithResult() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 51;
                            onExtraCallbackWithResult = i6 % 128;
                            if (i6 % 2 == 0) {
                                return this.IAuthTabCallback;
                            }
                            throw null;
                        }

                        public final List<TabBarInfoQueryPointOnTabBarInfoQueryListener> onExtraCallback() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 81;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                return this.onWarmupCompleted;
                            }
                            throw null;
                        }
                    };
                case 7:
                    String str6 = strIntern;
                    final List listListOf8 = CollectionsKt.listOf(new WindowInfoProxy[]{new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 불가능 계좌 - 잔액 없음", str6, "5012", "해지 불가능한 계좌", null, "11", 0L, 0L, 0L, 0L), new WindowInfoProxy("5678", "33", "orgCodeTest2", "246810", null, "해지 불가능 계좌 - 잔액 있음", str6, "5016", "해지 불가능한 계좌", null, "11", 200000L, 210000L, 30000L, 20000L)});
                    return new getTitleBarHeight(listListOf8) { // from class: o.getTitleBarHeight$onNavigationEvent
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;
                        private final List<WindowInfoProxy> IAuthTabCallback;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback + 123;
                            int i7 = i6 % 128;
                            onNavigationEvent = i7;
                            int i8 = i6 % 2;
                            if (this == obj) {
                                int i9 = i7 + 75;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onNavigationEvent)) {
                                return false;
                            }
                            if (!(!Intrinsics.areEqual(this.IAuthTabCallback, ((getTitleBarHeight$onNavigationEvent) obj).IAuthTabCallback))) {
                                return true;
                            }
                            int i11 = onExtraCallback + 75;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            return false;
                        }

                        public int hashCode() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 109;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            int iHashCode = this.IAuthTabCallback.hashCode();
                            int i8 = onExtraCallback + 15;
                            onNavigationEvent = i8 % 128;
                            if (i8 % 2 != 0) {
                                return iHashCode;
                            }
                            throw null;
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str7 = "AllAccountStateUnavailable(unavailableAccounts=" + this.IAuthTabCallback + ")";
                            int i6 = onNavigationEvent + 73;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                                return str7;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listListOf8, "");
                            this.IAuthTabCallback = listListOf8;
                        }

                        public final List<WindowInfoProxy> IAuthTabCallback() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 109;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                                return this.IAuthTabCallback;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                case 8:
                    final List listListOf9 = CollectionsKt.listOf(new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 불가능 계좌 - 잔액 없음", strIntern, "5207", "예상 지급액이 마이너스입니다.", null, "11", 0L, -1000L, 0L, 0L));
                    return new getTitleBarHeight(listListOf9) { // from class: o.getTitleBarHeight$IAuthTabCallbackStub
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;
                        private final List<WindowInfoProxy> onNavigationEvent;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult;
                            int i7 = i6 + 33;
                            IAuthTabCallback = i7 % 128;
                            Object obj2 = null;
                            if (i7 % 2 != 0) {
                                throw null;
                            }
                            if (this == obj) {
                                int i8 = i6 + 25;
                                IAuthTabCallback = i8 % 128;
                                if (i8 % 2 == 0) {
                                    return true;
                                }
                                obj2.hashCode();
                                throw null;
                            }
                            if (obj instanceof getTitleBarHeight$IAuthTabCallbackStub) {
                                return Intrinsics.areEqual(this.onNavigationEvent, ((getTitleBarHeight$IAuthTabCallbackStub) obj).onNavigationEvent);
                            }
                            int i9 = i6 + 117;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return false;
                        }

                        public int hashCode() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 77;
                            IAuthTabCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                this.onNavigationEvent.hashCode();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int iHashCode = this.onNavigationEvent.hashCode();
                            int i7 = IAuthTabCallback + 109;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                            return iHashCode;
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str7 = "PaymentAmountMinusError(unavailableAccounts=" + this.onNavigationEvent + ")";
                            int i6 = IAuthTabCallback + 55;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            return str7;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listListOf9, "");
                            this.onNavigationEvent = listListOf9;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 39;
                            IAuthTabCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                                return this.onNavigationEvent;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                case 9:
                    String str7 = strIntern;
                    final getTitleBarHeight$onWarmupCompleted.IAuthTabCallback iAuthTabCallback = getTitleBarHeight$onWarmupCompleted.IAuthTabCallback.THIRD_PARTY_ERROR;
                    final List listListOf10 = CollectionsKt.listOf(new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 불가능 계좌 - 은행 오류", str7, "5001", "은행 시스템 오류", null, "11", 0L, 0L, 0L, 0L));
                    return new getTitleBarHeight(iAuthTabCallback, listListOf10) { // from class: o.getTitleBarHeight$onWarmupCompleted
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;
                        private final List<WindowInfoProxy> onExtraCallbackWithResult;
                        private final IAuthTabCallback onNavigationEvent;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onWarmupCompleted)) {
                                int i6 = IAuthTabCallback + 3;
                                onExtraCallback = i6 % 128;
                                int i7 = i6 % 2;
                                return false;
                            }
                            getTitleBarHeight$onWarmupCompleted gettitlebarheight_onwarmupcompleted = (getTitleBarHeight$onWarmupCompleted) obj;
                            if (this.onNavigationEvent != gettitlebarheight_onwarmupcompleted.onNavigationEvent) {
                                return false;
                            }
                            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, gettitlebarheight_onwarmupcompleted.onExtraCallbackWithResult)) {
                                return true;
                            }
                            int i8 = IAuthTabCallback + 7;
                            int i9 = i8 % 128;
                            onExtraCallback = i9;
                            int i10 = i8 % 2;
                            int i11 = i9 + 47;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 86 / 0;
                            }
                            return false;
                        }

                        public int hashCode() {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 41;
                            onExtraCallback = i6 % 128;
                            int iHashCode = i6 % 2 == 0 ? (this.onNavigationEvent.hashCode() - 79) % this.onExtraCallbackWithResult.hashCode() : (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
                            int i7 = onExtraCallback + 81;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return iHashCode;
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str8 = "AllFailure(failReason=" + this.onNavigationEvent + ", unavailableAccounts=" + this.onExtraCallbackWithResult + ")";
                            int i6 = IAuthTabCallback + 95;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                return str8;
                            }
                            throw null;
                        }

                        {
                            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
                            Intrinsics.checkNotNullParameter(listListOf10, "");
                            this.onNavigationEvent = iAuthTabCallback;
                            this.onExtraCallbackWithResult = listListOf10;
                        }

                        public final IAuthTabCallback IAuthTabCallback() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback + 9;
                            int i7 = i6 % 128;
                            IAuthTabCallback = i7;
                            int i8 = i6 % 2;
                            IAuthTabCallback iAuthTabCallback2 = this.onNavigationEvent;
                            int i9 = i7 + 111;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return iAuthTabCallback2;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback;
                            int i7 = i6 + 53;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                throw null;
                            }
                            List<WindowInfoProxy> list = this.onExtraCallbackWithResult;
                            int i8 = i6 + 49;
                            IAuthTabCallback = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 96 / 0;
                            }
                            return list;
                        }

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        public static final class IAuthTabCallback {
                            private static final /* synthetic */ EnumEntries $ENTRIES;
                            private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent = 1;
                            public static final IAuthTabCallback THIRD_PARTY_ERROR = new IAuthTabCallback("THIRD_PARTY_ERROR", 0);
                            public static final IAuthTabCallback DONATION_ERROR = new IAuthTabCallback("DONATION_ERROR", 1);
                            public static final IAuthTabCallback SYSTEM_ERROR = new IAuthTabCallback("SYSTEM_ERROR", 2);

                            private static final /* synthetic */ IAuthTabCallback[] $values() {
                                int i = 2 % 2;
                                int i2 = IAuthTabCallback + 125;
                                int i3 = i2 % 128;
                                onNavigationEvent = i3;
                                int i4 = i2 % 2;
                                IAuthTabCallback[] iAuthTabCallbackArr = {THIRD_PARTY_ERROR, DONATION_ERROR, SYSTEM_ERROR};
                                int i5 = i3 + 125;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                return iAuthTabCallbackArr;
                            }

                            public static EnumEntries<IAuthTabCallback> getEntries() {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent;
                                int i3 = i2 + 61;
                                IAuthTabCallback = i3 % 128;
                                int i4 = i3 % 2;
                                EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
                                int i5 = i2 + 5;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                return enumEntries;
                            }

                            public static IAuthTabCallback valueOf(String str) {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent + 61;
                                IAuthTabCallback = i2 % 128;
                                int i3 = i2 % 2;
                                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                                if (i3 != 0) {
                                    throw null;
                                }
                                int i4 = IAuthTabCallback + 27;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                return iAuthTabCallback;
                            }

                            public static IAuthTabCallback[] values() {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent + 107;
                                IAuthTabCallback = i2 % 128;
                                int i3 = i2 % 2;
                                IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
                                if (i3 == 0) {
                                    return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
                                }
                                throw null;
                            }

                            private IAuthTabCallback(String str, int i) {
                            }

                            static {
                                IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                                $VALUES = iAuthTabCallbackArr$values;
                                $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                                int i = onExtraCallback + 49;
                                onExtraCallbackWithResult = i % 128;
                                if (i % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                    };
                case 10:
                    String str8 = strIntern;
                    final getTitleBarHeight$onWarmupCompleted.IAuthTabCallback iAuthTabCallback2 = getTitleBarHeight$onWarmupCompleted.IAuthTabCallback.THIRD_PARTY_ERROR;
                    final List listListOf11 = CollectionsKt.listOf(new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 불가능 계좌 - TOSS 오류", str8, "5203", "TOSS 시스템 오류", null, "11", 0L, 0L, 0L, 0L));
                    return new getTitleBarHeight(iAuthTabCallback2, listListOf11) { // from class: o.getTitleBarHeight$onWarmupCompleted
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;
                        private final List<WindowInfoProxy> onExtraCallbackWithResult;
                        private final IAuthTabCallback onNavigationEvent;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onWarmupCompleted)) {
                                int i6 = IAuthTabCallback + 3;
                                onExtraCallback = i6 % 128;
                                int i7 = i6 % 2;
                                return false;
                            }
                            getTitleBarHeight$onWarmupCompleted gettitlebarheight_onwarmupcompleted = (getTitleBarHeight$onWarmupCompleted) obj;
                            if (this.onNavigationEvent != gettitlebarheight_onwarmupcompleted.onNavigationEvent) {
                                return false;
                            }
                            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, gettitlebarheight_onwarmupcompleted.onExtraCallbackWithResult)) {
                                return true;
                            }
                            int i8 = IAuthTabCallback + 7;
                            int i9 = i8 % 128;
                            onExtraCallback = i9;
                            int i10 = i8 % 2;
                            int i11 = i9 + 47;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 86 / 0;
                            }
                            return false;
                        }

                        public int hashCode() {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 41;
                            onExtraCallback = i6 % 128;
                            int iHashCode = i6 % 2 == 0 ? (this.onNavigationEvent.hashCode() - 79) % this.onExtraCallbackWithResult.hashCode() : (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
                            int i7 = onExtraCallback + 81;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return iHashCode;
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str82 = "AllFailure(failReason=" + this.onNavigationEvent + ", unavailableAccounts=" + this.onExtraCallbackWithResult + ")";
                            int i6 = IAuthTabCallback + 95;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                return str82;
                            }
                            throw null;
                        }

                        {
                            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
                            Intrinsics.checkNotNullParameter(listListOf11, "");
                            this.onNavigationEvent = iAuthTabCallback2;
                            this.onExtraCallbackWithResult = listListOf11;
                        }

                        public final IAuthTabCallback IAuthTabCallback() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback + 9;
                            int i7 = i6 % 128;
                            IAuthTabCallback = i7;
                            int i8 = i6 % 2;
                            IAuthTabCallback iAuthTabCallback22 = this.onNavigationEvent;
                            int i9 = i7 + 111;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return iAuthTabCallback22;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback;
                            int i7 = i6 + 53;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                throw null;
                            }
                            List<WindowInfoProxy> list = this.onExtraCallbackWithResult;
                            int i8 = i6 + 49;
                            IAuthTabCallback = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 96 / 0;
                            }
                            return list;
                        }

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        public static final class IAuthTabCallback {
                            private static final /* synthetic */ EnumEntries $ENTRIES;
                            private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent = 1;
                            public static final IAuthTabCallback THIRD_PARTY_ERROR = new IAuthTabCallback("THIRD_PARTY_ERROR", 0);
                            public static final IAuthTabCallback DONATION_ERROR = new IAuthTabCallback("DONATION_ERROR", 1);
                            public static final IAuthTabCallback SYSTEM_ERROR = new IAuthTabCallback("SYSTEM_ERROR", 2);

                            private static final /* synthetic */ IAuthTabCallback[] $values() {
                                int i = 2 % 2;
                                int i2 = IAuthTabCallback + 125;
                                int i3 = i2 % 128;
                                onNavigationEvent = i3;
                                int i4 = i2 % 2;
                                IAuthTabCallback[] iAuthTabCallbackArr = {THIRD_PARTY_ERROR, DONATION_ERROR, SYSTEM_ERROR};
                                int i5 = i3 + 125;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                return iAuthTabCallbackArr;
                            }

                            public static EnumEntries<IAuthTabCallback> getEntries() {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent;
                                int i3 = i2 + 61;
                                IAuthTabCallback = i3 % 128;
                                int i4 = i3 % 2;
                                EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
                                int i5 = i2 + 5;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                return enumEntries;
                            }

                            public static IAuthTabCallback valueOf(String str) {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent + 61;
                                IAuthTabCallback = i2 % 128;
                                int i3 = i2 % 2;
                                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                                if (i3 != 0) {
                                    throw null;
                                }
                                int i4 = IAuthTabCallback + 27;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                return iAuthTabCallback;
                            }

                            public static IAuthTabCallback[] values() {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent + 107;
                                IAuthTabCallback = i2 % 128;
                                int i3 = i2 % 2;
                                IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
                                if (i3 == 0) {
                                    return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
                                }
                                throw null;
                            }

                            private IAuthTabCallback(String str, int i) {
                            }

                            static {
                                IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                                $VALUES = iAuthTabCallbackArr$values;
                                $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                                int i = onExtraCallback + 49;
                                onExtraCallbackWithResult = i % 128;
                                if (i % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                    };
                case 11:
                    String str9 = strIntern;
                    final getTitleBarHeight$onWarmupCompleted.IAuthTabCallback iAuthTabCallback3 = getTitleBarHeight$onWarmupCompleted.IAuthTabCallback.DONATION_ERROR;
                    final List listListOf12 = CollectionsKt.listOf(new WindowInfoProxy("1234", "22", "orgCodeTest1", "1234567890", null, "해지 불가능 계좌 - 기부 오류", str9, "5027", "기부 처리 오류", null, "11", 0L, 0L, 0L, 0L));
                    return new getTitleBarHeight(iAuthTabCallback3, listListOf12) { // from class: o.getTitleBarHeight$onWarmupCompleted
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;
                        private final List<WindowInfoProxy> onExtraCallbackWithResult;
                        private final IAuthTabCallback onNavigationEvent;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onWarmupCompleted)) {
                                int i6 = IAuthTabCallback + 3;
                                onExtraCallback = i6 % 128;
                                int i7 = i6 % 2;
                                return false;
                            }
                            getTitleBarHeight$onWarmupCompleted gettitlebarheight_onwarmupcompleted = (getTitleBarHeight$onWarmupCompleted) obj;
                            if (this.onNavigationEvent != gettitlebarheight_onwarmupcompleted.onNavigationEvent) {
                                return false;
                            }
                            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, gettitlebarheight_onwarmupcompleted.onExtraCallbackWithResult)) {
                                return true;
                            }
                            int i8 = IAuthTabCallback + 7;
                            int i9 = i8 % 128;
                            onExtraCallback = i9;
                            int i10 = i8 % 2;
                            int i11 = i9 + 47;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 86 / 0;
                            }
                            return false;
                        }

                        public int hashCode() {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 41;
                            onExtraCallback = i6 % 128;
                            int iHashCode = i6 % 2 == 0 ? (this.onNavigationEvent.hashCode() - 79) % this.onExtraCallbackWithResult.hashCode() : (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
                            int i7 = onExtraCallback + 81;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return iHashCode;
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str82 = "AllFailure(failReason=" + this.onNavigationEvent + ", unavailableAccounts=" + this.onExtraCallbackWithResult + ")";
                            int i6 = IAuthTabCallback + 95;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                return str82;
                            }
                            throw null;
                        }

                        {
                            Intrinsics.checkNotNullParameter(iAuthTabCallback3, "");
                            Intrinsics.checkNotNullParameter(listListOf12, "");
                            this.onNavigationEvent = iAuthTabCallback3;
                            this.onExtraCallbackWithResult = listListOf12;
                        }

                        public final IAuthTabCallback IAuthTabCallback() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback + 9;
                            int i7 = i6 % 128;
                            IAuthTabCallback = i7;
                            int i8 = i6 % 2;
                            IAuthTabCallback iAuthTabCallback22 = this.onNavigationEvent;
                            int i9 = i7 + 111;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return iAuthTabCallback22;
                        }

                        public final List<WindowInfoProxy> onExtraCallbackWithResult() {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback;
                            int i7 = i6 + 53;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                throw null;
                            }
                            List<WindowInfoProxy> list = this.onExtraCallbackWithResult;
                            int i8 = i6 + 49;
                            IAuthTabCallback = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 96 / 0;
                            }
                            return list;
                        }

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        public static final class IAuthTabCallback {
                            private static final /* synthetic */ EnumEntries $ENTRIES;
                            private static final /* synthetic */ IAuthTabCallback[] $VALUES;
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent = 1;
                            public static final IAuthTabCallback THIRD_PARTY_ERROR = new IAuthTabCallback("THIRD_PARTY_ERROR", 0);
                            public static final IAuthTabCallback DONATION_ERROR = new IAuthTabCallback("DONATION_ERROR", 1);
                            public static final IAuthTabCallback SYSTEM_ERROR = new IAuthTabCallback("SYSTEM_ERROR", 2);

                            private static final /* synthetic */ IAuthTabCallback[] $values() {
                                int i = 2 % 2;
                                int i2 = IAuthTabCallback + 125;
                                int i3 = i2 % 128;
                                onNavigationEvent = i3;
                                int i4 = i2 % 2;
                                IAuthTabCallback[] iAuthTabCallbackArr = {THIRD_PARTY_ERROR, DONATION_ERROR, SYSTEM_ERROR};
                                int i5 = i3 + 125;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                return iAuthTabCallbackArr;
                            }

                            public static EnumEntries<IAuthTabCallback> getEntries() {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent;
                                int i3 = i2 + 61;
                                IAuthTabCallback = i3 % 128;
                                int i4 = i3 % 2;
                                EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
                                int i5 = i2 + 5;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                return enumEntries;
                            }

                            public static IAuthTabCallback valueOf(String str) {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent + 61;
                                IAuthTabCallback = i2 % 128;
                                int i3 = i2 % 2;
                                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                                if (i3 != 0) {
                                    throw null;
                                }
                                int i4 = IAuthTabCallback + 27;
                                onNavigationEvent = i4 % 128;
                                int i5 = i4 % 2;
                                return iAuthTabCallback;
                            }

                            public static IAuthTabCallback[] values() {
                                int i = 2 % 2;
                                int i2 = onNavigationEvent + 107;
                                IAuthTabCallback = i2 % 128;
                                int i3 = i2 % 2;
                                IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
                                if (i3 == 0) {
                                    return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
                                }
                                throw null;
                            }

                            private IAuthTabCallback(String str, int i) {
                            }

                            static {
                                IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                                $VALUES = iAuthTabCallbackArr$values;
                                $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                                int i = onExtraCallback + 49;
                                onExtraCallbackWithResult = i % 128;
                                if (i % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                    };
                case 12:
                    String str10 = strIntern;
                    final List listListOf13 = CollectionsKt.listOf(new WindowInfoProxy[]{new WindowInfoProxy("1234", "088", "orgCodeTest1", "8882297278567358", null, "해지 불가능 계좌 - 기타 사유", str10, "9099", "기타 사유로 처리 불가", null, "11", 0L, 0L, 0L, 0L), new WindowInfoProxy("5678", "003", "orgCodeTest2", "4829099677347238", null, "해지 불가능 계좌 - 계좌 번호 오류", str10, "5003", "계좌 번호 오류", null, "11", 0L, 0L, 0L, 0L), new WindowInfoProxy("9012", "088", "orgCodeTest3", "3492273207661598", null, "해지 불가능 계좌 - 기타 사유", str10, "9099", "기타 사유로 처리 불가", null, "11", 0L, 0L, 0L, 0L)});
                    return new getTitleBarHeight(listListOf13) { // from class: o.getTitleBarHeight$onNavigationEvent
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;
                        private final List<WindowInfoProxy> IAuthTabCallback;

                        public boolean equals(@Nullable Object obj) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallback + 123;
                            int i7 = i6 % 128;
                            onNavigationEvent = i7;
                            int i8 = i6 % 2;
                            if (this == obj) {
                                int i9 = i7 + 75;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return true;
                            }
                            if (!(obj instanceof getTitleBarHeight$onNavigationEvent)) {
                                return false;
                            }
                            if (!(!Intrinsics.areEqual(this.IAuthTabCallback, ((getTitleBarHeight$onNavigationEvent) obj).IAuthTabCallback))) {
                                return true;
                            }
                            int i11 = onExtraCallback + 75;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            return false;
                        }

                        public int hashCode() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 109;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            int iHashCode = this.IAuthTabCallback.hashCode();
                            int i8 = onExtraCallback + 15;
                            onNavigationEvent = i8 % 128;
                            if (i8 % 2 != 0) {
                                return iHashCode;
                            }
                            throw null;
                        }

                        public String toString() {
                            int i5 = 2 % 2;
                            String str72 = "AllAccountStateUnavailable(unavailableAccounts=" + this.IAuthTabCallback + ")";
                            int i6 = onNavigationEvent + 73;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                                return str72;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        {
                            Intrinsics.checkNotNullParameter(listListOf13, "");
                            this.IAuthTabCallback = listListOf13;
                        }

                        public final List<WindowInfoProxy> IAuthTabCallback() {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 109;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                                return this.IAuthTabCallback;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        Object[] objArr2 = new Object[1];
        a((char) (16570 - TextUtils.getTrimmedLength("")), ViewConfiguration.getScrollBarSize() >> 8, new char[]{51762, 38044, 62963, 57733, 7075, 58237, 35455, 22228, 28368, 52713, 33499, 28759, 34561, 62078, 48228, 65377, 12651, 34186, 39494, 26795, 63690, 47410, 59099, 1931, 22723, 45634, 47277, 25051, 20960, 27485, 12530, 26931, 22337, 1459, 464, 56357, 26739, 5931, 57003, 51675, 32800, 7529, 28843, 31946, 38693, 22544, 16735, 34290, 23782, 61584, 37256, 54654, 34178, 18901}, new char[]{0, 0, 0, 0}, new char[]{12171, 41778, 47617, 24384}, objArr2);
        strIntern = ((String) objArr2[0]).intern();
        Intrinsics.checkNotNullParameter(spectolayoutparam, "");
        switch (IAuthTabCallback.onExtraCallback[spectolayoutparam.ordinal()]) {
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 53;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 67;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 43 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char maximumFlingVelocity = (char) (49123 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 44;
                    int size = 1494 - View.MeasureSpec.getSize(0);
                    byte b3 = (byte) ($$b & 7);
                    byte b4 = (byte) (-b3);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, tapTimeout, size, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23971), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 45849), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, View.getDefaultSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 61;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final getScreenTop onWarmupCompleted(@NotNull getWidthSpec getwidthspec) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        final boolean z = false;
        final boolean z2 = true;
        Object[] objArr = new Object[1];
        a((char) (16570 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), KeyEvent.getDeadChar(0, 0), new char[]{51762, 38044, 62963, 57733, 7075, 58237, 35455, 22228, 28368, 52713, 33499, 28759, 34561, 62078, 48228, 65377, 12651, 34186, 39494, 26795, 63690, 47410, 59099, 1931, 22723, 45634, 47277, 25051, 20960, 27485, 12530, 26931, 22337, 1459, 464, 56357, 26739, 5931, 57003, 51675, 32800, 7529, 28843, 31946, 38693, 22544, 16735, 34290, 23782, 61584, 37256, 54654, 34178, 18901}, new char[]{0, 0, 0, 0}, new char[]{12171, 41778, 47617, 24384}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intrinsics.checkNotNullParameter(getwidthspec, "");
        final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = null;
        switch (IAuthTabCallback.IAuthTabCallback[getwidthspec.ordinal()]) {
            case 1:
                final List listListOf = CollectionsKt.listOf(new getCurrentColorScheme[]{new getCurrentColorScheme("1234", "22", "orgCodeTest1", "1234567890", null, "이체 성공 옮기기 1", strIntern, "0000", "0000", null, "11", 300000L, 310000L, 20000L, 10000L, false), new getCurrentColorScheme("5678", "33", "orgCodeTest2", "246810", null, "이체 성공 옮기기 2", strIntern, "0000", "0000", null, "11", 200000L, 210000L, 30000L, 20000L, false)});
                final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener2 = (TabBarInfoQueryPointOnTabBarInfoQueryListener) CollectionsKt.firstOrNull(PageShowPoint.Companion.IAuthTabCallback());
                return new getScreenTop(listListOf, tabBarInfoQueryPointOnTabBarInfoQueryListener2, z) { // from class: o.getScreenTop$onNavigationEvent
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;
                    private final boolean onExtraCallback;
                    private final TabBarInfoQueryPointOnTabBarInfoQueryListener onNavigationEvent;
                    private final List<getCurrentColorScheme> onWarmupCompleted;

                    public boolean equals(@Nullable Object obj) {
                        int i4 = 2 % 2;
                        if (this == obj) {
                            int i5 = onExtraCallbackWithResult + 43;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            return true;
                        }
                        if (!(obj instanceof getScreenTop$onNavigationEvent)) {
                            int i7 = onExtraCallbackWithResult + 83;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                        getScreenTop$onNavigationEvent getscreentop_onnavigationevent = (getScreenTop$onNavigationEvent) obj;
                        if (!Intrinsics.areEqual(this.onWarmupCompleted, getscreentop_onnavigationevent.onWarmupCompleted)) {
                            int i9 = IAuthTabCallback + 117;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            return false;
                        }
                        if (Intrinsics.areEqual(this.onNavigationEvent, getscreentop_onnavigationevent.onNavigationEvent)) {
                            return this.onExtraCallback == getscreentop_onnavigationevent.onExtraCallback;
                        }
                        int i11 = IAuthTabCallback + 7;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int iHashCode;
                        int i4 = 2 % 2;
                        int iHashCode2 = this.onWarmupCompleted.hashCode();
                        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener3 = this.onNavigationEvent;
                        if (tabBarInfoQueryPointOnTabBarInfoQueryListener3 == null) {
                            int i5 = onExtraCallbackWithResult + 119;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            iHashCode = 0;
                        } else {
                            iHashCode = tabBarInfoQueryPointOnTabBarInfoQueryListener3.hashCode();
                        }
                        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallback);
                        int i7 = IAuthTabCallback + 101;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return iHashCode3;
                    }

                    public String toString() {
                        int i4 = 2 % 2;
                        String str = "Success(transferSuccessAccounts=" + this.onWarmupCompleted + ", receiveAccount=" + this.onNavigationEvent + ", isDonation=" + this.onExtraCallback + ")";
                        int i5 = onExtraCallbackWithResult + 21;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 59 / 0;
                        }
                        return str;
                    }

                    {
                        Intrinsics.checkNotNullParameter(listListOf, "");
                        this.onWarmupCompleted = listListOf;
                        this.onNavigationEvent = tabBarInfoQueryPointOnTabBarInfoQueryListener2;
                        this.onExtraCallback = z;
                    }

                    public final TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallbackWithResult() {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 47;
                        int i6 = i5 % 128;
                        IAuthTabCallback = i6;
                        int i7 = i5 % 2;
                        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener3 = this.onNavigationEvent;
                        int i8 = i6 + 45;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 == 0) {
                            return tabBarInfoQueryPointOnTabBarInfoQueryListener3;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public final boolean onWarmupCompleted() {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 19;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            return this.onExtraCallback;
                        }
                        throw null;
                    }

                    public final long onNavigationEvent() {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 69;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Iterator<T> it = this.onWarmupCompleted.iterator();
                        long jIAuthTabCallbackStub = 0;
                        while (it.hasNext()) {
                            int i7 = IAuthTabCallback + 97;
                            onExtraCallbackWithResult = i7 % 128;
                            jIAuthTabCallbackStub = i7 % 2 != 0 ? jIAuthTabCallbackStub % ((getCurrentColorScheme) it.next()).IAuthTabCallbackStub() : jIAuthTabCallbackStub + ((getCurrentColorScheme) it.next()).IAuthTabCallbackStub();
                        }
                        int i8 = IAuthTabCallback + 89;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        return jIAuthTabCallbackStub;
                    }

                    public final boolean onExtraCallback() {
                        int i4 = 2 % 2;
                        List<getCurrentColorScheme> list = this.onWarmupCompleted;
                        if (list instanceof Collection) {
                            int i5 = onExtraCallbackWithResult + 13;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            if (list.isEmpty()) {
                                return true;
                            }
                        }
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            int i7 = onExtraCallbackWithResult + 21;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 == 0) {
                                ((getCurrentColorScheme) it.next()).asInterface();
                                throw null;
                            }
                            if (((getCurrentColorScheme) it.next()).asInterface() != null) {
                                int i8 = onExtraCallbackWithResult + 1;
                                IAuthTabCallback = i8 % 128;
                                return i8 % 2 == 0;
                            }
                        }
                        int i9 = IAuthTabCallback + 103;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        return true;
                    }
                };
            case 2:
                final List listListOf2 = CollectionsKt.listOf(new getCurrentColorScheme[]{new getCurrentColorScheme("1234", "22", "orgCodeTest1", "1234567890", null, "이체 성공 기부 1", strIntern, "0000", "0000", null, "11", 300000L, 310000L, 20000L, 10000L, false), new getCurrentColorScheme("5678", "33", "orgCodeTest2", "246810", null, "이체 성공 기부 2", strIntern, "0000", "0000", null, "11", 200000L, 210000L, 30000L, 20000L, false)});
                getScreenTop getscreentop = new getScreenTop(listListOf2, tabBarInfoQueryPointOnTabBarInfoQueryListener, z2) { // from class: o.getScreenTop$onNavigationEvent
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;
                    private final boolean onExtraCallback;
                    private final TabBarInfoQueryPointOnTabBarInfoQueryListener onNavigationEvent;
                    private final List<getCurrentColorScheme> onWarmupCompleted;

                    public boolean equals(@Nullable Object obj) {
                        int i4 = 2 % 2;
                        if (this == obj) {
                            int i5 = onExtraCallbackWithResult + 43;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            return true;
                        }
                        if (!(obj instanceof getScreenTop$onNavigationEvent)) {
                            int i7 = onExtraCallbackWithResult + 83;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                        getScreenTop$onNavigationEvent getscreentop_onnavigationevent = (getScreenTop$onNavigationEvent) obj;
                        if (!Intrinsics.areEqual(this.onWarmupCompleted, getscreentop_onnavigationevent.onWarmupCompleted)) {
                            int i9 = IAuthTabCallback + 117;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            return false;
                        }
                        if (Intrinsics.areEqual(this.onNavigationEvent, getscreentop_onnavigationevent.onNavigationEvent)) {
                            return this.onExtraCallback == getscreentop_onnavigationevent.onExtraCallback;
                        }
                        int i11 = IAuthTabCallback + 7;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int iHashCode;
                        int i4 = 2 % 2;
                        int iHashCode2 = this.onWarmupCompleted.hashCode();
                        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener3 = this.onNavigationEvent;
                        if (tabBarInfoQueryPointOnTabBarInfoQueryListener3 == null) {
                            int i5 = onExtraCallbackWithResult + 119;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            iHashCode = 0;
                        } else {
                            iHashCode = tabBarInfoQueryPointOnTabBarInfoQueryListener3.hashCode();
                        }
                        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallback);
                        int i7 = IAuthTabCallback + 101;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return iHashCode3;
                    }

                    public String toString() {
                        int i4 = 2 % 2;
                        String str = "Success(transferSuccessAccounts=" + this.onWarmupCompleted + ", receiveAccount=" + this.onNavigationEvent + ", isDonation=" + this.onExtraCallback + ")";
                        int i5 = onExtraCallbackWithResult + 21;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 59 / 0;
                        }
                        return str;
                    }

                    {
                        Intrinsics.checkNotNullParameter(listListOf2, "");
                        this.onWarmupCompleted = listListOf2;
                        this.onNavigationEvent = tabBarInfoQueryPointOnTabBarInfoQueryListener;
                        this.onExtraCallback = z2;
                    }

                    public final TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallbackWithResult() {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 47;
                        int i6 = i5 % 128;
                        IAuthTabCallback = i6;
                        int i7 = i5 % 2;
                        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener3 = this.onNavigationEvent;
                        int i8 = i6 + 45;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 == 0) {
                            return tabBarInfoQueryPointOnTabBarInfoQueryListener3;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public final boolean onWarmupCompleted() {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 19;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            return this.onExtraCallback;
                        }
                        throw null;
                    }

                    public final long onNavigationEvent() {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 69;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Iterator<T> it = this.onWarmupCompleted.iterator();
                        long jIAuthTabCallbackStub = 0;
                        while (it.hasNext()) {
                            int i7 = IAuthTabCallback + 97;
                            onExtraCallbackWithResult = i7 % 128;
                            jIAuthTabCallbackStub = i7 % 2 != 0 ? jIAuthTabCallbackStub % ((getCurrentColorScheme) it.next()).IAuthTabCallbackStub() : jIAuthTabCallbackStub + ((getCurrentColorScheme) it.next()).IAuthTabCallbackStub();
                        }
                        int i8 = IAuthTabCallback + 89;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        return jIAuthTabCallbackStub;
                    }

                    public final boolean onExtraCallback() {
                        int i4 = 2 % 2;
                        List<getCurrentColorScheme> list = this.onWarmupCompleted;
                        if (list instanceof Collection) {
                            int i5 = onExtraCallbackWithResult + 13;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            if (list.isEmpty()) {
                                return true;
                            }
                        }
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            int i7 = onExtraCallbackWithResult + 21;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 == 0) {
                                ((getCurrentColorScheme) it.next()).asInterface();
                                throw null;
                            }
                            if (((getCurrentColorScheme) it.next()).asInterface() != null) {
                                int i8 = onExtraCallbackWithResult + 1;
                                IAuthTabCallback = i8 % 128;
                                return i8 % 2 == 0;
                            }
                        }
                        int i9 = IAuthTabCallback + 103;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        return true;
                    }
                };
                int i4 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getscreentop;
            case 3:
                final List listListOf3 = CollectionsKt.listOf(new getCurrentColorScheme[]{new getCurrentColorScheme("1234", "22", "orgCodeTest1", "1234567890", null, "해지 성공 계좌1", strIntern, "0000", null, null, "11", 0L, 0L, 0L, 0L, true), new getCurrentColorScheme("5678", "33", "orgCodeTest2", "246810", null, "해지 성공 계좌2", strIntern, "0000", null, null, "11", 0L, 0L, 0L, 0L, true)});
                return new getScreenTop(listListOf3, tabBarInfoQueryPointOnTabBarInfoQueryListener, z) { // from class: o.getScreenTop$onNavigationEvent
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;
                    private final boolean onExtraCallback;
                    private final TabBarInfoQueryPointOnTabBarInfoQueryListener onNavigationEvent;
                    private final List<getCurrentColorScheme> onWarmupCompleted;

                    public boolean equals(@Nullable Object obj) {
                        int i42 = 2 % 2;
                        if (this == obj) {
                            int i52 = onExtraCallbackWithResult + 43;
                            IAuthTabCallback = i52 % 128;
                            int i6 = i52 % 2;
                            return true;
                        }
                        if (!(obj instanceof getScreenTop$onNavigationEvent)) {
                            int i7 = onExtraCallbackWithResult + 83;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                        getScreenTop$onNavigationEvent getscreentop_onnavigationevent = (getScreenTop$onNavigationEvent) obj;
                        if (!Intrinsics.areEqual(this.onWarmupCompleted, getscreentop_onnavigationevent.onWarmupCompleted)) {
                            int i9 = IAuthTabCallback + 117;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            return false;
                        }
                        if (Intrinsics.areEqual(this.onNavigationEvent, getscreentop_onnavigationevent.onNavigationEvent)) {
                            return this.onExtraCallback == getscreentop_onnavigationevent.onExtraCallback;
                        }
                        int i11 = IAuthTabCallback + 7;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int iHashCode;
                        int i42 = 2 % 2;
                        int iHashCode2 = this.onWarmupCompleted.hashCode();
                        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener3 = this.onNavigationEvent;
                        if (tabBarInfoQueryPointOnTabBarInfoQueryListener3 == null) {
                            int i52 = onExtraCallbackWithResult + 119;
                            IAuthTabCallback = i52 % 128;
                            int i6 = i52 % 2;
                            iHashCode = 0;
                        } else {
                            iHashCode = tabBarInfoQueryPointOnTabBarInfoQueryListener3.hashCode();
                        }
                        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallback);
                        int i7 = IAuthTabCallback + 101;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return iHashCode3;
                    }

                    public String toString() {
                        int i42 = 2 % 2;
                        String str = "Success(transferSuccessAccounts=" + this.onWarmupCompleted + ", receiveAccount=" + this.onNavigationEvent + ", isDonation=" + this.onExtraCallback + ")";
                        int i52 = onExtraCallbackWithResult + 21;
                        IAuthTabCallback = i52 % 128;
                        if (i52 % 2 == 0) {
                            int i6 = 59 / 0;
                        }
                        return str;
                    }

                    {
                        Intrinsics.checkNotNullParameter(listListOf3, "");
                        this.onWarmupCompleted = listListOf3;
                        this.onNavigationEvent = tabBarInfoQueryPointOnTabBarInfoQueryListener;
                        this.onExtraCallback = z;
                    }

                    public final TabBarInfoQueryPointOnTabBarInfoQueryListener onExtraCallbackWithResult() {
                        int i42 = 2 % 2;
                        int i52 = onExtraCallbackWithResult + 47;
                        int i6 = i52 % 128;
                        IAuthTabCallback = i6;
                        int i7 = i52 % 2;
                        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener3 = this.onNavigationEvent;
                        int i8 = i6 + 45;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 == 0) {
                            return tabBarInfoQueryPointOnTabBarInfoQueryListener3;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public final boolean onWarmupCompleted() {
                        int i42 = 2 % 2;
                        int i52 = IAuthTabCallback + 19;
                        onExtraCallbackWithResult = i52 % 128;
                        if (i52 % 2 == 0) {
                            return this.onExtraCallback;
                        }
                        throw null;
                    }

                    public final long onNavigationEvent() {
                        int i42 = 2 % 2;
                        int i52 = onExtraCallbackWithResult + 69;
                        IAuthTabCallback = i52 % 128;
                        int i6 = i52 % 2;
                        Iterator<T> it = this.onWarmupCompleted.iterator();
                        long jIAuthTabCallbackStub = 0;
                        while (it.hasNext()) {
                            int i7 = IAuthTabCallback + 97;
                            onExtraCallbackWithResult = i7 % 128;
                            jIAuthTabCallbackStub = i7 % 2 != 0 ? jIAuthTabCallbackStub % ((getCurrentColorScheme) it.next()).IAuthTabCallbackStub() : jIAuthTabCallbackStub + ((getCurrentColorScheme) it.next()).IAuthTabCallbackStub();
                        }
                        int i8 = IAuthTabCallback + 89;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        return jIAuthTabCallbackStub;
                    }

                    public final boolean onExtraCallback() {
                        int i42 = 2 % 2;
                        List<getCurrentColorScheme> list = this.onWarmupCompleted;
                        if (list instanceof Collection) {
                            int i52 = onExtraCallbackWithResult + 13;
                            IAuthTabCallback = i52 % 128;
                            int i6 = i52 % 2;
                            if (list.isEmpty()) {
                                return true;
                            }
                        }
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            int i7 = onExtraCallbackWithResult + 21;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 == 0) {
                                ((getCurrentColorScheme) it.next()).asInterface();
                                throw null;
                            }
                            if (((getCurrentColorScheme) it.next()).asInterface() != null) {
                                int i8 = onExtraCallbackWithResult + 1;
                                IAuthTabCallback = i8 % 128;
                                return i8 % 2 == 0;
                            }
                        }
                        int i9 = IAuthTabCallback + 103;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        return true;
                    }
                };
            case 4:
                final List listListOf4 = CollectionsKt.listOf(new getCurrentColorScheme[]{new getCurrentColorScheme("1234", "22", "orgCodeTest1", "1234567890", null, "이체 성공 계좌", strIntern, "0000", "0000", null, "11", 300000L, 310000L, 20000L, 10000L, false), new getCurrentColorScheme("5678", "33", "orgCodeTest2", "246810", null, "해지 성공 계좌", strIntern, "0000", null, null, "11", 0L, 0L, 0L, 0L, true)});
                final List listListOf5 = CollectionsKt.listOf(new getCurrentColorScheme[]{new getCurrentColorScheme("1357", "27", "orgCodeTest4", "1111111111", null, "이체중 계좌", strIntern, "0000", "5999", null, "11", 300000L, 310000L, 20000L, 10000L, false), new getCurrentColorScheme("5678", "31", "orgCodeTest5", "1111111112", null, "해지 성공, 이체 실패", strIntern, "0000", "5000", null, "11", 150000L, 140000L, 0L, 10000L, false), new getCurrentColorScheme("9101", "35", "orgCodeTest6", "1111111113", null, "해지 실패 계좌", strIntern, "5000", null, null, "11", 0L, 0L, 0L, 0L, true)});
                return new getScreenTop(listListOf4, listListOf5) { // from class: o.getScreenTop$onExtraCallbackWithResult
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;
                    private final List<getCurrentColorScheme> onExtraCallbackWithResult;
                    private final List<getCurrentColorScheme> onNavigationEvent;

                    public boolean equals(@Nullable Object obj) {
                        int i6 = 2 % 2;
                        if (this == obj) {
                            int i7 = IAuthTabCallback + 7;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                            return true;
                        }
                        if (!(obj instanceof getScreenTop$onExtraCallbackWithResult)) {
                            int i9 = onWarmupCompleted + 33;
                            IAuthTabCallback = i9 % 128;
                            return i9 % 2 == 0;
                        }
                        getScreenTop$onExtraCallbackWithResult getscreentop_onextracallbackwithresult = (getScreenTop$onExtraCallbackWithResult) obj;
                        Object obj2 = null;
                        if (!Intrinsics.areEqual(this.onNavigationEvent, getscreentop_onextracallbackwithresult.onNavigationEvent)) {
                            int i10 = IAuthTabCallback + 39;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 == 0) {
                                return false;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, getscreentop_onextracallbackwithresult.onExtraCallbackWithResult)) {
                            return true;
                        }
                        int i11 = IAuthTabCallback + 113;
                        int i12 = i11 % 128;
                        onWarmupCompleted = i12;
                        int i13 = i11 % 2;
                        int i14 = i12 + 123;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }

                    public int hashCode() {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 99;
                        IAuthTabCallback = i7 % 128;
                        int iHashCode = i7 % 2 == 0 ? this.onNavigationEvent.hashCode() - this.onExtraCallbackWithResult.hashCode() : (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
                        int i8 = IAuthTabCallback + 125;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 64 / 0;
                        }
                        return iHashCode;
                    }

                    public String toString() {
                        int i6 = 2 % 2;
                        String str = "PartialSuccess(transferSuccessAccounts=" + this.onNavigationEvent + ", transferFailureAccounts=" + this.onExtraCallbackWithResult + ")";
                        int i7 = onWarmupCompleted + 105;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            return str;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    {
                        Intrinsics.checkNotNullParameter(listListOf4, "");
                        Intrinsics.checkNotNullParameter(listListOf5, "");
                        this.onNavigationEvent = listListOf4;
                        this.onExtraCallbackWithResult = listListOf5;
                    }

                    public final List<getCurrentColorScheme> onWarmupCompleted() {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 23;
                        int i8 = i7 % 128;
                        IAuthTabCallback = i8;
                        if (i7 % 2 == 0) {
                            throw null;
                        }
                        List<getCurrentColorScheme> list = this.onNavigationEvent;
                        int i9 = i8 + 41;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        return list;
                    }

                    public final List<getCurrentColorScheme> onNavigationEvent() {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 103;
                        int i8 = i7 % 128;
                        onWarmupCompleted = i8;
                        Object obj = null;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                        List<getCurrentColorScheme> list = this.onExtraCallbackWithResult;
                        int i9 = i8 + 67;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            return list;
                        }
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final boolean IAuthTabCallback() {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 45;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        if (!this.onExtraCallbackWithResult.isEmpty()) {
                            List<getCurrentColorScheme> list = this.onExtraCallbackWithResult;
                            if (list instanceof Collection) {
                                int i9 = onWarmupCompleted + 125;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                if (!list.isEmpty()) {
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        if (Intrinsics.areEqual(((getCurrentColorScheme) it.next()).asInterface(), "5999")) {
                                            int i11 = IAuthTabCallback + 21;
                                            int i12 = i11 % 128;
                                            onWarmupCompleted = i12;
                                            boolean z3 = i11 % 2 == 0;
                                            int i13 = i12 + 33;
                                            IAuthTabCallback = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                return z3;
                                            }
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                        int i14 = IAuthTabCallback + 57;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        return false;
                    }
                };
            case 5:
                final getScreenTop$IAuthTabCallback.onWarmupCompleted onwarmupcompleted = getScreenTop$IAuthTabCallback.onWarmupCompleted.THIRD_PARTY_ERROR;
                final List listListOf6 = CollectionsKt.listOf(new getCurrentColorScheme("1234", "22", "orgCodeTest1", "1234567890", null, "해지 불가능 계좌 - 은행 오류", strIntern, "5001", null, null, "11", 0L, 0L, 0L, 0L, true));
                return new getScreenTop(onwarmupcompleted, listListOf6) { // from class: o.getScreenTop$IAuthTabCallback
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;
                    private final onWarmupCompleted onNavigationEvent;
                    private final List<getCurrentColorScheme> onWarmupCompleted;

                    public boolean equals(@Nullable Object obj) {
                        int i6 = 2 % 2;
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof getScreenTop$IAuthTabCallback)) {
                            int i7 = onExtraCallback + 29;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                        getScreenTop$IAuthTabCallback getscreentop_iauthtabcallback = (getScreenTop$IAuthTabCallback) obj;
                        if (this.onNavigationEvent != getscreentop_iauthtabcallback.onNavigationEvent) {
                            return false;
                        }
                        if (Intrinsics.areEqual(this.onWarmupCompleted, getscreentop_iauthtabcallback.onWarmupCompleted)) {
                            return true;
                        }
                        int i9 = IAuthTabCallback + 19;
                        int i10 = i9 % 128;
                        onExtraCallback = i10;
                        int i11 = i9 % 2;
                        int i12 = i10 + 105;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 57;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        int iHashCode = this.onNavigationEvent.hashCode();
                        return i8 != 0 ? (iHashCode - 100) << this.onWarmupCompleted.hashCode() : (iHashCode * 31) + this.onWarmupCompleted.hashCode();
                    }

                    public String toString() {
                        int i6 = 2 % 2;
                        String str = "AllFailure(failReason=" + this.onNavigationEvent + ", transferFailureAccounts=" + this.onWarmupCompleted + ")";
                        int i7 = onExtraCallback + 19;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            return str;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    {
                        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                        Intrinsics.checkNotNullParameter(listListOf6, "");
                        this.onNavigationEvent = onwarmupcompleted;
                        this.onWarmupCompleted = listListOf6;
                    }

                    public final onWarmupCompleted onWarmupCompleted() {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback;
                        int i8 = i7 + 51;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                        onWarmupCompleted onwarmupcompleted2 = this.onNavigationEvent;
                        int i9 = i7 + 55;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        return onwarmupcompleted2;
                    }

                    public final List<getCurrentColorScheme> onExtraCallbackWithResult() {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 65;
                        int i8 = i7 % 128;
                        onExtraCallback = i8;
                        Object obj = null;
                        if (i7 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        List<getCurrentColorScheme> list = this.onWarmupCompleted;
                        int i9 = i8 + 125;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            return list;
                        }
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    public static final class onWarmupCompleted {
                        private static final /* synthetic */ EnumEntries $ENTRIES;
                        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;
                        public static final onWarmupCompleted THIRD_PARTY_ERROR = new onWarmupCompleted("THIRD_PARTY_ERROR", 0);
                        public static final onWarmupCompleted DONATION_ERROR = new onWarmupCompleted("DONATION_ERROR", 1);
                        public static final onWarmupCompleted SYSTEM_ERROR = new onWarmupCompleted("SYSTEM_ERROR", 2);

                        private static final /* synthetic */ onWarmupCompleted[] $values() {
                            int i = 2 % 2;
                            int i2 = onWarmupCompleted + 105;
                            int i3 = i2 % 128;
                            onExtraCallbackWithResult = i3;
                            int i4 = i2 % 2;
                            onWarmupCompleted[] onwarmupcompletedArr = {THIRD_PARTY_ERROR, DONATION_ERROR, SYSTEM_ERROR};
                            int i5 = i3 + 97;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            return onwarmupcompletedArr;
                        }

                        public static EnumEntries<onWarmupCompleted> getEntries() {
                            int i = 2 % 2;
                            int i2 = onWarmupCompleted;
                            int i3 = i2 + 105;
                            onExtraCallbackWithResult = i3 % 128;
                            if (i3 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                            int i4 = i2 + 93;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            return enumEntries;
                        }

                        public static onWarmupCompleted valueOf(String str) {
                            int i = 2 % 2;
                            int i2 = onExtraCallbackWithResult + 59;
                            onWarmupCompleted = i2 % 128;
                            int i3 = i2 % 2;
                            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                            int i4 = onWarmupCompleted + 53;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            return onwarmupcompleted;
                        }

                        public static onWarmupCompleted[] values() {
                            int i = 2 % 2;
                            int i2 = onExtraCallbackWithResult + 71;
                            onWarmupCompleted = i2 % 128;
                            if (i2 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                            int i3 = onWarmupCompleted + 79;
                            onExtraCallbackWithResult = i3 % 128;
                            int i4 = i3 % 2;
                            return onwarmupcompletedArr;
                        }

                        private onWarmupCompleted(String str, int i) {
                        }

                        static {
                            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                            $VALUES = onwarmupcompletedArr$values;
                            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                            int i = onExtraCallback + 53;
                            IAuthTabCallback = i % 128;
                            if (i % 2 != 0) {
                                throw null;
                            }
                        }
                    }
                };
            case 6:
                final getScreenTop$IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = getScreenTop$IAuthTabCallback.onWarmupCompleted.THIRD_PARTY_ERROR;
                final List listListOf7 = CollectionsKt.listOf(new getCurrentColorScheme("1234", "22", "orgCodeTest1", "1234567890", null, "해지 불가능 계좌 - TOSS 오류", strIntern, "5203", null, null, "11", 0L, 0L, 0L, 0L, true));
                getScreenTop getscreentop2 = new getScreenTop(onwarmupcompleted2, listListOf7) { // from class: o.getScreenTop$IAuthTabCallback
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;
                    private final onWarmupCompleted onNavigationEvent;
                    private final List<getCurrentColorScheme> onWarmupCompleted;

                    public boolean equals(@Nullable Object obj) {
                        int i6 = 2 % 2;
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof getScreenTop$IAuthTabCallback)) {
                            int i7 = onExtraCallback + 29;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                        getScreenTop$IAuthTabCallback getscreentop_iauthtabcallback = (getScreenTop$IAuthTabCallback) obj;
                        if (this.onNavigationEvent != getscreentop_iauthtabcallback.onNavigationEvent) {
                            return false;
                        }
                        if (Intrinsics.areEqual(this.onWarmupCompleted, getscreentop_iauthtabcallback.onWarmupCompleted)) {
                            return true;
                        }
                        int i9 = IAuthTabCallback + 19;
                        int i10 = i9 % 128;
                        onExtraCallback = i10;
                        int i11 = i9 % 2;
                        int i12 = i10 + 105;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 57;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        int iHashCode = this.onNavigationEvent.hashCode();
                        return i8 != 0 ? (iHashCode - 100) << this.onWarmupCompleted.hashCode() : (iHashCode * 31) + this.onWarmupCompleted.hashCode();
                    }

                    public String toString() {
                        int i6 = 2 % 2;
                        String str = "AllFailure(failReason=" + this.onNavigationEvent + ", transferFailureAccounts=" + this.onWarmupCompleted + ")";
                        int i7 = onExtraCallback + 19;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            return str;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    {
                        Intrinsics.checkNotNullParameter(onwarmupcompleted2, "");
                        Intrinsics.checkNotNullParameter(listListOf7, "");
                        this.onNavigationEvent = onwarmupcompleted2;
                        this.onWarmupCompleted = listListOf7;
                    }

                    public final onWarmupCompleted onWarmupCompleted() {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback;
                        int i8 = i7 + 51;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                        onWarmupCompleted onwarmupcompleted22 = this.onNavigationEvent;
                        int i9 = i7 + 55;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        return onwarmupcompleted22;
                    }

                    public final List<getCurrentColorScheme> onExtraCallbackWithResult() {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 65;
                        int i8 = i7 % 128;
                        onExtraCallback = i8;
                        Object obj = null;
                        if (i7 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        List<getCurrentColorScheme> list = this.onWarmupCompleted;
                        int i9 = i8 + 125;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            return list;
                        }
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    public static final class onWarmupCompleted {
                        private static final /* synthetic */ EnumEntries $ENTRIES;
                        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;
                        public static final onWarmupCompleted THIRD_PARTY_ERROR = new onWarmupCompleted("THIRD_PARTY_ERROR", 0);
                        public static final onWarmupCompleted DONATION_ERROR = new onWarmupCompleted("DONATION_ERROR", 1);
                        public static final onWarmupCompleted SYSTEM_ERROR = new onWarmupCompleted("SYSTEM_ERROR", 2);

                        private static final /* synthetic */ onWarmupCompleted[] $values() {
                            int i = 2 % 2;
                            int i2 = onWarmupCompleted + 105;
                            int i3 = i2 % 128;
                            onExtraCallbackWithResult = i3;
                            int i4 = i2 % 2;
                            onWarmupCompleted[] onwarmupcompletedArr = {THIRD_PARTY_ERROR, DONATION_ERROR, SYSTEM_ERROR};
                            int i5 = i3 + 97;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            return onwarmupcompletedArr;
                        }

                        public static EnumEntries<onWarmupCompleted> getEntries() {
                            int i = 2 % 2;
                            int i2 = onWarmupCompleted;
                            int i3 = i2 + 105;
                            onExtraCallbackWithResult = i3 % 128;
                            if (i3 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                            int i4 = i2 + 93;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            return enumEntries;
                        }

                        public static onWarmupCompleted valueOf(String str) {
                            int i = 2 % 2;
                            int i2 = onExtraCallbackWithResult + 59;
                            onWarmupCompleted = i2 % 128;
                            int i3 = i2 % 2;
                            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                            int i4 = onWarmupCompleted + 53;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            return onwarmupcompleted;
                        }

                        public static onWarmupCompleted[] values() {
                            int i = 2 % 2;
                            int i2 = onExtraCallbackWithResult + 71;
                            onWarmupCompleted = i2 % 128;
                            if (i2 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                            int i3 = onWarmupCompleted + 79;
                            onExtraCallbackWithResult = i3 % 128;
                            int i4 = i3 % 2;
                            return onwarmupcompletedArr;
                        }

                        private onWarmupCompleted(String str, int i) {
                        }

                        static {
                            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                            $VALUES = onwarmupcompletedArr$values;
                            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                            int i = onExtraCallback + 53;
                            IAuthTabCallback = i % 128;
                            if (i % 2 != 0) {
                                throw null;
                            }
                        }
                    }
                };
                int i6 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return getscreentop2;
            case 7:
                final getScreenTop$IAuthTabCallback.onWarmupCompleted onwarmupcompleted3 = getScreenTop$IAuthTabCallback.onWarmupCompleted.DONATION_ERROR;
                final List listListOf8 = CollectionsKt.listOf(new getCurrentColorScheme("1234", "22", "orgCodeTest1", "1234567890", null, "해지 불가능 계좌 - 기부 오류", strIntern, "5027", null, null, "11", 0L, 0L, 0L, 0L, true));
                getScreenTop getscreentop3 = new getScreenTop(onwarmupcompleted3, listListOf8) { // from class: o.getScreenTop$IAuthTabCallback
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;
                    private final onWarmupCompleted onNavigationEvent;
                    private final List<getCurrentColorScheme> onWarmupCompleted;

                    public boolean equals(@Nullable Object obj) {
                        int i62 = 2 % 2;
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof getScreenTop$IAuthTabCallback)) {
                            int i72 = onExtraCallback + 29;
                            IAuthTabCallback = i72 % 128;
                            int i8 = i72 % 2;
                            return false;
                        }
                        getScreenTop$IAuthTabCallback getscreentop_iauthtabcallback = (getScreenTop$IAuthTabCallback) obj;
                        if (this.onNavigationEvent != getscreentop_iauthtabcallback.onNavigationEvent) {
                            return false;
                        }
                        if (Intrinsics.areEqual(this.onWarmupCompleted, getscreentop_iauthtabcallback.onWarmupCompleted)) {
                            return true;
                        }
                        int i9 = IAuthTabCallback + 19;
                        int i10 = i9 % 128;
                        onExtraCallback = i10;
                        int i11 = i9 % 2;
                        int i12 = i10 + 105;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int i62 = 2 % 2;
                        int i72 = onExtraCallback + 57;
                        IAuthTabCallback = i72 % 128;
                        int i8 = i72 % 2;
                        int iHashCode = this.onNavigationEvent.hashCode();
                        return i8 != 0 ? (iHashCode - 100) << this.onWarmupCompleted.hashCode() : (iHashCode * 31) + this.onWarmupCompleted.hashCode();
                    }

                    public String toString() {
                        int i62 = 2 % 2;
                        String str = "AllFailure(failReason=" + this.onNavigationEvent + ", transferFailureAccounts=" + this.onWarmupCompleted + ")";
                        int i72 = onExtraCallback + 19;
                        IAuthTabCallback = i72 % 128;
                        if (i72 % 2 == 0) {
                            return str;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    {
                        Intrinsics.checkNotNullParameter(onwarmupcompleted3, "");
                        Intrinsics.checkNotNullParameter(listListOf8, "");
                        this.onNavigationEvent = onwarmupcompleted3;
                        this.onWarmupCompleted = listListOf8;
                    }

                    public final onWarmupCompleted onWarmupCompleted() {
                        int i62 = 2 % 2;
                        int i72 = onExtraCallback;
                        int i8 = i72 + 51;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                        onWarmupCompleted onwarmupcompleted22 = this.onNavigationEvent;
                        int i9 = i72 + 55;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        return onwarmupcompleted22;
                    }

                    public final List<getCurrentColorScheme> onExtraCallbackWithResult() {
                        int i62 = 2 % 2;
                        int i72 = IAuthTabCallback + 65;
                        int i8 = i72 % 128;
                        onExtraCallback = i8;
                        Object obj = null;
                        if (i72 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        List<getCurrentColorScheme> list = this.onWarmupCompleted;
                        int i9 = i8 + 125;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            return list;
                        }
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    public static final class onWarmupCompleted {
                        private static final /* synthetic */ EnumEntries $ENTRIES;
                        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;
                        public static final onWarmupCompleted THIRD_PARTY_ERROR = new onWarmupCompleted("THIRD_PARTY_ERROR", 0);
                        public static final onWarmupCompleted DONATION_ERROR = new onWarmupCompleted("DONATION_ERROR", 1);
                        public static final onWarmupCompleted SYSTEM_ERROR = new onWarmupCompleted("SYSTEM_ERROR", 2);

                        private static final /* synthetic */ onWarmupCompleted[] $values() {
                            int i = 2 % 2;
                            int i2 = onWarmupCompleted + 105;
                            int i3 = i2 % 128;
                            onExtraCallbackWithResult = i3;
                            int i4 = i2 % 2;
                            onWarmupCompleted[] onwarmupcompletedArr = {THIRD_PARTY_ERROR, DONATION_ERROR, SYSTEM_ERROR};
                            int i5 = i3 + 97;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            return onwarmupcompletedArr;
                        }

                        public static EnumEntries<onWarmupCompleted> getEntries() {
                            int i = 2 % 2;
                            int i2 = onWarmupCompleted;
                            int i3 = i2 + 105;
                            onExtraCallbackWithResult = i3 % 128;
                            if (i3 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
                            int i4 = i2 + 93;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            return enumEntries;
                        }

                        public static onWarmupCompleted valueOf(String str) {
                            int i = 2 % 2;
                            int i2 = onExtraCallbackWithResult + 59;
                            onWarmupCompleted = i2 % 128;
                            int i3 = i2 % 2;
                            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
                            int i4 = onWarmupCompleted + 53;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            return onwarmupcompleted;
                        }

                        public static onWarmupCompleted[] values() {
                            int i = 2 % 2;
                            int i2 = onExtraCallbackWithResult + 71;
                            onWarmupCompleted = i2 % 128;
                            if (i2 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                            int i3 = onWarmupCompleted + 79;
                            onExtraCallbackWithResult = i3 % 128;
                            int i4 = i3 % 2;
                            return onwarmupcompletedArr;
                        }

                        private onWarmupCompleted(String str, int i) {
                        }

                        static {
                            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
                            $VALUES = onwarmupcompletedArr$values;
                            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
                            int i = onExtraCallback + 53;
                            IAuthTabCallback = i % 128;
                            if (i % 2 != 0) {
                                throw null;
                            }
                        }
                    }
                };
                int i8 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return getscreentop3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
