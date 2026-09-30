package o;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import im.toss.uikit.R;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class generateLink {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ int onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(context);
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(context);
        int i3 = onWarmupCompleted + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        float f;
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i2 | i3));
        int i12 = i8 | i2;
        int i13 = (~(i | i2)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i2 + i3 + i4 + ((-1468046718) * i5) + (327422179 * i6);
        int i16 = i15 * i15;
        int i17 = (677926197 * i2) + 1810235392 + (1154460365 * i3) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i4) + (1933049856 * i5) + (743702528 * i6) + (286654464 * i16);
        int i18 = (i2 * (-645773371)) + 280972133 + (i3 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i4 * (-645772719)) + (i5 * 1523302178) + (i6 * 1475409363) + (i16 * (-1007288320));
        int i19 = i17 + (i18 * i18 * (-492175360));
        if (i19 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }
        Context context = (Context) objArr[0];
        int i20 = 2 % 2;
        int i21 = onNavigationEvent + 49;
        onWarmupCompleted = i21 % 128;
        if (i21 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            ActivityManager.MemoryInfo memoryInfoIAuthTabCallback = IAuthTabCallback(context);
            f = memoryInfoIAuthTabCallback.availMem % memoryInfoIAuthTabCallback.totalMem;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            ActivityManager.MemoryInfo memoryInfoIAuthTabCallback2 = IAuthTabCallback(context);
            f = memoryInfoIAuthTabCallback2.availMem / memoryInfoIAuthTabCallback2.totalMem;
        }
        return Float.valueOf(f);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean zIAuthTabCallback;
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            zIAuthTabCallback = IAuthTabCallback(resources);
            int i3 = 54 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources2 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            zIAuthTabCallback = IAuthTabCallback(resources2);
        }
        return Boolean.valueOf(zIAuthTabCallback);
    }

    public static final boolean IAuthTabCallback(@NotNull Resources resources) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        if ((resources.getConfiguration().uiMode & 48) != 32) {
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return true;
    }

    public static final ActivityManager.MemoryInfo IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
        Intrinsics.checkNotNull(systemService);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return memoryInfo;
    }

    public static /* synthetic */ Context onNavigationEvent(Context context, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 87;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            int i6 = i5 + 67;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i = R.style.WhiteTheme;
            if (i7 == 0) {
                int i8 = 43 / 0;
            }
        }
        return (Context) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -292972216, new Object[]{context, Integer.valueOf(i)}, 292972217, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Context context = (Context) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Configuration configuration = new Configuration();
        configuration.uiMode = (context.getResources().getConfiguration().uiMode & (-49)) | 16;
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(context, iIntValue);
        mediaMetadataCompat.onNavigationEvent(configuration);
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return mediaMetadataCompat;
    }

    public static /* synthetic */ Context onExtraCallback(Context context, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            i = R.style.DarkTheme;
        }
        Context contextOnNavigationEvent = onNavigationEvent(context, i);
        int i5 = onWarmupCompleted + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return contextOnNavigationEvent;
        }
        throw null;
    }

    public static final Context onNavigationEvent(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Configuration configuration = new Configuration();
        configuration.uiMode = (context.getResources().getConfiguration().uiMode & (-49)) | 32;
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(context, i);
        mediaMetadataCompat.onNavigationEvent(configuration);
        int i3 = onWarmupCompleted + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return mediaMetadataCompat;
    }

    public static /* synthetic */ Context onExtraCallback(Context context, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = onWarmupCompleted + 113;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = R.style.WhiteTheme;
        }
        if ((i3 & 2) != 0) {
            int i7 = onNavigationEvent + 123;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i2 = R.style.DarkTheme;
        }
        return onExtraCallback(context, i, i2);
    }

    public static final Context onExtraCallback(@NotNull Context context, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (!readIntokhttp.onExtraCallback(configuration)) {
            Context contextOnNavigationEvent = onNavigationEvent(context, i2);
            int i6 = onWarmupCompleted + 83;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return contextOnNavigationEvent;
            }
            throw null;
        }
        int i7 = onWarmupCompleted + 61;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return (Context) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -292972216, new Object[]{context, Integer.valueOf(i)}, 292972217, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        }
        Object[] objArr = {context, Integer.valueOf(i)};
        int i8 = 65 / 0;
        return (Context) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -292972216, objArr, 292972217, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static final float onNavigationEvent(@NotNull Context context) throws Resources.NotFoundException {
        WindowManager windowManager;
        int iAccess000;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback != null) {
            windowManager = activityIAuthTabCallback.getWindowManager();
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        } else {
            windowManager = null;
        }
        if (windowManager != null) {
            int i4 = onWarmupCompleted + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (Build.VERSION.SDK_INT >= 30) {
                int i6 = onNavigationEvent + 113;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                iAccess000 = windowManager.getCurrentWindowMetrics().getBounds().height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                iAccess000 = displayMetrics.heightPixels;
            }
        } else {
            M_ m_ = M_.onExtraCallback;
            iAccess000 = m_.access000() + m_.IAuthTabCallbackDefault() + m_.onExtraCallbackWithResult();
        }
        return iAccess000;
    }

    public static final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = setReferrerName.onWarmupCompleted.IAuthTabCallback().get();
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        int i5 = onNavigationEvent + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Integer numValueOf = Integer.valueOf(i4);
        int i7 = onNavigationEvent + 83;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 37 / 0;
        }
        return numValueOf;
    }

    public static final int onExtraCallbackWithResult(@NotNull Context context) {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            i = 4;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            i = 3;
        }
        return onNavigationEvent(context, false, false, i, null);
    }

    public static final void asInterface(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (onExtraCallback() == null) {
            int i4 = onNavigationEvent + 97;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                asBinder(context);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (asBinder(context) == null) {
                ((Integer) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -910229894, new Object[]{context, false, false}, 910229894, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue();
                return;
            }
        }
        int i5 = onNavigationEvent + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
    }

    static /* synthetic */ int onNavigationEvent(Context context, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 107;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if ((i & 2) != 0) {
            int i7 = i4 + 41;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        }
        return ((Integer) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -910229894, new Object[]{context, Boolean.valueOf(z), Boolean.valueOf(z2)}, 910229894, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue();
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Integer>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Context $this_calcPerformanceScoreInternal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Context context, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$this_calcPerformanceScoreInternal = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$this_calcPerformanceScoreInternal, access13800Var);
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends Integer>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Result<? extends Integer>> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg2, access13800Var2);
            }
            onExtraCallback(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Result<Integer>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.generateLink$onNavigationEvent$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Integer>>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ Context $this_calcPerformanceScoreInternal;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Context context, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$this_calcPerformanceScoreInternal = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_calcPerformanceScoreInternal, access13800Var);
                anonymousClass3.L$0 = obj;
                int i2 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends Integer>> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i2 % 128;
                findResAndMsg findresandmsg2 = findresandmsg;
                access13800<? super Result<? extends Integer>> access13800Var2 = access13800Var;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(findresandmsg2, access13800Var2);
                }
                onWarmupCompleted(findresandmsg2, access13800Var2);
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Result<Integer>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass3.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
            
                r1 = kotlin.Result.Companion;
                r4 = kotlin.Result.m31constructorimpl(o.access14000.onNavigationEvent(o.generateLink.onExtraCallback(r4)));
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
            
                r4 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
            
                r1 = kotlin.Result.Companion;
                r4 = kotlin.Result.m31constructorimpl(kotlin.ResultKt.createFailure(r4));
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
            
                if (r3.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            
                if (r3.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r4);
                r4 = r3.$this_calcPerformanceScoreInternal;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM31constructorimpl;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 74 / 0;
                }
                Result resultIAuthTabCallback = Result.IAuthTabCallback(objM31constructorimpl);
                int i4 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return resultIAuthTabCallback;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14100.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = IAuthTabCallback + 113;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
                int i6 = onNavigationEvent + 107;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_calcPerformanceScoreInternal, null);
            this.label = 1;
            Object objOnWarmupCompleted = doGet.onWarmupCompleted(1000L, anonymousClass3, this);
            if (objOnWarmupCompleted != objOnExtraCallback) {
                return objOnWarmupCompleted;
            }
            int i8 = IAuthTabCallback + 5;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return objOnExtraCallback;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iOnTransact;
        int iIntValue = 0;
        Context context = (Context) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnExtraCallback = onExtraCallback();
        if (numOnExtraCallback == null) {
            Object obj = null;
            if (zBooleanValue) {
                int i4 = onWarmupCompleted + 83;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    Integer numAsBinder = asBinder(context);
                    if (numAsBinder != null) {
                        setReferrerName.onWarmupCompleted.IAuthTabCallback().set(numAsBinder.intValue());
                        Objects.toString(numAsBinder);
                        return Integer.valueOf(numAsBinder.intValue() + onTransact(context));
                    }
                } else {
                    asBinder(context);
                    throw null;
                }
            }
            if (zBooleanValue2) {
                int i5 = onWarmupCompleted + 11;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    onTransact(context);
                    obj.hashCode();
                    throw null;
                }
                iOnTransact = onTransact(context);
            } else {
                iOnTransact = 0;
            }
            Result result = (Result) onLoadCleared.onExtraCallback(null, new onNavigationEvent(context, null), 1, null);
            if (result != null) {
                Object objOnNavigationEvent = result.onNavigationEvent();
                if (Result.onExtraCallback(objOnNavigationEvent)) {
                    objOnNavigationEvent = 0;
                }
                iIntValue = ((Number) objOnNavigationEvent).intValue();
            }
            if (result != null) {
                int i6 = onNavigationEvent + 105;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    setReferrerName.onWarmupCompleted.IAuthTabCallback().set(iIntValue);
                    if (Result.onNavigationEvent(result.onNavigationEvent())) {
                        onExtraCallbackWithResult(context, iIntValue);
                    }
                } else {
                    setReferrerName.onWarmupCompleted.IAuthTabCallback().set(iIntValue);
                    Result.onNavigationEvent(result.onNavigationEvent());
                    throw null;
                }
            }
            return Integer.valueOf(iIntValue + iOnTransact);
        }
        return Integer.valueOf(numOnExtraCallback.intValue());
    }

    private static final Integer asBinder(Context context) {
        Object objM31constructorimpl;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("device_performance_score", 0);
            objM31constructorimpl = Result.m31constructorimpl((Intrinsics.areEqual(sharedPreferences.getString("build_fingerprint", null), Build.FINGERPRINT) && sharedPreferences.contains("static_performance_score")) ? Integer.valueOf(sharedPreferences.getInt("static_performance_score", 0)) : null);
            int i4 = onNavigationEvent + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.onExtraCallback(objM31constructorimpl) ? null : objM31constructorimpl);
    }

    private static final void onExtraCallbackWithResult(Context context, int i) {
        Object objM31constructorimpl;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        try {
            Result.Companion companion = Result.Companion;
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("device_performance_score", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt("static_performance_score", i).putString("build_fingerprint", Build.FINGERPRINT);
            editorEdit.apply();
            objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            int i5 = onNavigationEvent + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 2;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        Result.onExtraCallback(objM31constructorimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int IAuthTabCallbackDefault(Context context) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int iOnWarmupCompleted;
        int i = 2 % 2;
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "");
        ActivityManager activityManager = (ActivityManager) systemService;
        PackageManager packageManager = context.getPackageManager();
        int i2 = activityManager.getDeviceConfigurationInfo().reqGlEsVersion;
        int i3 = i2 >= 196609 ? 3 : i2 >= 196608 ? 2 : 0;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors >= 8) {
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            i3 = i4 % 2 == 0 ? i3 + 4 : i3 + 2;
        } else if (iAvailableProcessors >= 6) {
            i3++;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        if (j >= 5368709120L) {
            i3 += 2;
        } else if (j >= 3221225472L) {
            i3++;
        }
        if (packageManager.hasSystemFeature("android.hardware.vr.high_performance")) {
            int i5 = onWarmupCompleted + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i3++;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int i7 = onWarmupCompleted + 115;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0 ? (iOnWarmupCompleted = setBrandDomain.onWarmupCompleted()) >= 13 : (iOnWarmupCompleted = setBrandDomain.onWarmupCompleted()) >= 120) {
                i3 += 3;
            } else if (iOnWarmupCompleted >= 12) {
                int i8 = onNavigationEvent + 9;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                i3 += 2;
            }
        }
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.vulkan.version", 4202496);
        boolean z = true;
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.vulkan.level", 1);
        if (zHasSystemFeature) {
            i3 += 2;
        } else if (zHasSystemFeature2) {
            i3++;
        }
        try {
            Result.Companion companion = Result.Companion;
            Object systemService2 = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService2, "");
            Display.Mode[] supportedModes = ((WindowManager) systemService2).getDefaultDisplay().getSupportedModes();
            Intrinsics.checkNotNullExpressionValue(supportedModes, "");
            float refreshRate = 0.0f;
            for (Display.Mode mode : supportedModes) {
                if (mode.getRefreshRate() > refreshRate) {
                    refreshRate = mode.getRefreshRate();
                }
            }
            if (refreshRate >= 120.0f) {
                i3 += 2;
            } else if (refreshRate >= 90.0f) {
                i3++;
            }
            Result.m31constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (activityManager.isLowRamDevice()) {
            i3--;
        }
        if (packageManager.hasSystemFeature("android.hardware.opengles.aep")) {
            i3++;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (packageManager.hasSystemFeature("android.hardware.vulkan.version", 4206592)) {
            int i11 = onWarmupCompleted + 71;
            onNavigationEvent = i11 % 128;
            i3 = i11 % 2 == 0 ? i3 << 1 : i3 + 1;
        }
        if (i10 >= 28 && packageManager.hasSystemFeature("android.hardware.strongbox_keystore")) {
            int i12 = onWarmupCompleted + 111;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            i3++;
        }
        try {
            Result.Companion companion3 = Result.Companion;
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            Intrinsics.checkNotNull(codecInfos);
            int length = codecInfos.length;
            int i14 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i14 < length) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i14];
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    Intrinsics.checkNotNullExpressionValue(supportedTypes, "");
                    int length2 = supportedTypes.length;
                    int i15 = 0;
                    while (i15 < length2) {
                        String str = supportedTypes[i15];
                        if (StringsKt__StringsJVMKt.equals(str, "video/av01", z)) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                int i16 = onWarmupCompleted + 95;
                                onNavigationEvent = i16 % 128;
                                int i17 = i16 % 2;
                                if (mediaCodecInfo.isHardwareAccelerated()) {
                                    z2 = z;
                                }
                            }
                        }
                        if (StringsKt__StringsJVMKt.equals(str, "video/hevc", z) && (codecProfileLevelArr = mediaCodecInfo.getCapabilitiesForType(str).profileLevels) != null) {
                            int length3 = codecProfileLevelArr.length;
                            int i18 = 0;
                            while (i18 < length3) {
                                int i19 = onWarmupCompleted + 61;
                                MediaCodecInfo[] mediaCodecInfoArr = codecInfos;
                                onNavigationEvent = i19 % 128;
                                if (i19 % 2 == 0) {
                                    if (codecProfileLevelArr[i18].profile == 3) {
                                        if (Build.VERSION.SDK_INT >= 29 || mediaCodecInfo.isHardwareAccelerated()) {
                                            z3 = true;
                                        }
                                    }
                                } else if (codecProfileLevelArr[i18].profile == 2) {
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        z3 = true;
                                    }
                                }
                                i18++;
                                int i20 = onWarmupCompleted + 95;
                                onNavigationEvent = i20 % 128;
                                int i21 = i20 % 2;
                                codecInfos = mediaCodecInfoArr;
                            }
                        }
                        i15++;
                        codecInfos = codecInfos;
                        z = true;
                    }
                }
                i14++;
                codecInfos = codecInfos;
                z = true;
            }
            if (z2) {
                i3++;
            }
            if (z3) {
                int i22 = onWarmupCompleted + 49;
                onNavigationEvent = i22 % 128;
                i3 = i22 % 2 == 0 ? i3 << 1 : i3 + 1;
            }
            Result.m31constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th2));
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[PHI: r4
      0x0038: PHI (r4v11 int) = (r4v10 int), (r4v14 int) binds: [B:13:0x0036, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int onTransact(Context context) {
        int i;
        int currentThermalStatus;
        int i2 = 2 % 2;
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "");
        PowerManager powerManager = (PowerManager) systemService;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            int i4 = onNavigationEvent + 81;
            onWarmupCompleted = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Result.Companion companion = Result.Companion;
                    try {
                        currentThermalStatus = powerManager.getCurrentThermalStatus();
                        if (currentThermalStatus == 3) {
                            i3 = -1;
                        } else if (currentThermalStatus == 3 || currentThermalStatus == 4 || currentThermalStatus == 5) {
                            i3 = -2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i3 = 1;
                        Result.Companion companion2 = Result.Companion;
                        Result.m31constructorimpl(ResultKt.createFailure(th));
                        i = onNavigationEvent + 59;
                        onWarmupCompleted = i % 128;
                        if (i % 2 != 0) {
                        }
                    }
                } else {
                    Result.Companion companion3 = Result.Companion;
                    currentThermalStatus = powerManager.getCurrentThermalStatus();
                    if (currentThermalStatus != 2) {
                    }
                }
                Result.m31constructorimpl(Unit.INSTANCE);
                return i3;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        i = onNavigationEvent + 59;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return i3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int IAuthTabCallback(Context context, boolean z, boolean z2) {
        return ((Integer) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -910229894, new Object[]{context, Boolean.valueOf(z), Boolean.valueOf(z2)}, 910229894, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).intValue();
    }

    public static final float onWarmupCompleted(@NotNull Context context) {
        return ((Float) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1120791093, new Object[]{context}, -1120791091, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
    }

    public static final Context onExtraCallback(@NotNull Context context, int i) {
        return (Context) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -292972216, new Object[]{context, Integer.valueOf(i)}, 292972217, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static final boolean IAuthTabCallbackStub(@NotNull Context context) {
        return ((Boolean) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
    }
}
