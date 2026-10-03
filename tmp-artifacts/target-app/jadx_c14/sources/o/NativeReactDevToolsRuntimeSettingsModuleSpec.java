package o;

import android.content.Context;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.CheckMask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeReactDevToolsRuntimeSettingsModuleSpec {
    public static final int $stable = 8;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private int offset;
    private final String yearMonth;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof NativeReactDevToolsRuntimeSettingsModuleSpec) {
            return Intrinsics.areEqual(this.yearMonth, ((NativeReactDevToolsRuntimeSettingsModuleSpec) obj).yearMonth);
        }
        int i4 = onExtraCallbackWithResult + 113;
        onExtraCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.yearMonth;
        if (i3 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionInfoYearMonth(yearMonth=" + this.yearMonth + ")";
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public NativeReactDevToolsRuntimeSettingsModuleSpec(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.yearMonth = str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.yearMonth;
        int i4 = i3 + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.zzag r18) {
        /*
            r17 = this;
            r1 = 2
            int r0 = r1 % r1
            int r0 = o.NativeReactDevToolsRuntimeSettingsModuleSpec.onExtraCallback
            int r0 = r0 + 19
            int r2 = r0 % 128
            o.NativeReactDevToolsRuntimeSettingsModuleSpec.onExtraCallbackWithResult = r2
            int r0 = r0 % r1
            java.lang.String r2 = ""
            r3 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.util.Calendar r4 = r18.onNavigationEvent()
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2e
            o.CommonModule_closeView r0 = o.CommonModule_closeView.onWarmupCompleted     // Catch: java.lang.Throwable -> L2e
            o.IdGeneratorExternalSyntheticLambda1 r0 = r0.extraCallbackWithResult()     // Catch: java.lang.Throwable -> L2e
            r5 = r17
            java.lang.String r6 = r5.yearMonth     // Catch: java.lang.Throwable -> L2c
            java.util.Date r0 = r0.parse(r6)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L2c
            goto L3b
        L2c:
            r0 = move-exception
            goto L31
        L2e:
            r0 = move-exception
            r5 = r17
        L31:
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
        L3b:
            boolean r6 = kotlin.Result.onExtraCallback(r0)
            r7 = 0
            if (r6 == 0) goto L4c
            int r0 = o.NativeReactDevToolsRuntimeSettingsModuleSpec.onExtraCallbackWithResult
            int r0 = r0 + 113
            int r6 = r0 % 128
            o.NativeReactDevToolsRuntimeSettingsModuleSpec.onExtraCallback = r6
            int r0 = r0 % r1
            r0 = r7
        L4c:
            java.util.Date r0 = (java.util.Date) r0
            if (r0 != 0) goto L54
            java.util.Date r0 = r18.asBinder()
        L54:
            r4.setTime(r0)
            o.CheckMask$onWarmupCompleted r0 = o.CheckMask.onWarmupCompleted.onExtraCallback
            o.ResetInputBGRLivenessChecker r8 = r0.onExtraCallbackWithResult()
            java.util.Date r9 = r4.getTime()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            o.followRedirects r0 = o.followRedirects.onExtraCallbackWithResult
            java.lang.Object[] r12 = new java.lang.Object[]{r0}
            int r15 = im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()
            int r14 = im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()
            int r16 = im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()
            int r11 = im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()
            r10 = -603441979(0xffffffffdc0834c5, float:-1.5335447E17)
            r13 = 603441979(0x23f7cb3b, float:2.6865865E-17)
            java.lang.Object r0 = o.followRedirects.IAuthTabCallback(r10, r11, r12, r13, r14, r15, r16)
            r10 = r0
            android.content.Context r10 = (android.content.Context) r10
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r0 = o.ResetInputBGRLivenessChecker.onExtraCallback(r8, r9, r10, r11, r12, r13)
            int r2 = o.NativeReactDevToolsRuntimeSettingsModuleSpec.onExtraCallbackWithResult
            int r2 = r2 + 7
            int r3 = r2 % 128
            o.NativeReactDevToolsRuntimeSettingsModuleSpec.onExtraCallback = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L9a
            return r0
        L9a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeReactDevToolsRuntimeSettingsModuleSpec.onExtraCallbackWithResult(o.zzag):java.lang.String");
    }

    public final String onNavigationEvent(@NotNull zzag zzagVar) {
        Object obj;
        String strOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Calendar calendarOnNavigationEvent = zzagVar.onNavigationEvent();
        int i2 = calendarOnNavigationEvent.get(1);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult().parse(this.yearMonth));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i3 = onExtraCallback + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 70 / 0;
            }
            obj = null;
        }
        Date dateAsBinder = (Date) obj;
        if (dateAsBinder == null) {
            int i5 = onExtraCallbackWithResult + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            dateAsBinder = zzagVar.asBinder();
            int i7 = onExtraCallback + 113;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        calendarOnNavigationEvent.setTime(dateAsBinder);
        if (i2 != calendarOnNavigationEvent.get(1)) {
            int i9 = onExtraCallback + 93;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            ResetInputBGRLivenessChecker resetInputBGRLivenessCheckerOnExtraCallbackWithResult = CheckMask.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult();
            Date time = calendarOnNavigationEvent.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            strOnExtraCallback = ResetInputBGRLivenessChecker.onExtraCallback(resetInputBGRLivenessCheckerOnExtraCallbackWithResult, time, (Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()), (TimeZone) null, 4, (Object) null);
        } else {
            ResetInputBGRLivenessChecker resetInputBGRLivenessCheckerOnWarmupCompleted = CheckMask.onNavigationEvent.onWarmupCompleted.onWarmupCompleted();
            Date time2 = calendarOnNavigationEvent.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "");
            strOnExtraCallback = ResetInputBGRLivenessChecker.onExtraCallback(resetInputBGRLivenessCheckerOnWarmupCompleted, time2, (Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()), (TimeZone) null, 4, (Object) null);
        }
        int i11 = onExtraCallback + 63;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 97 / 0;
        }
        return strOnExtraCallback;
    }
}
