package com.tnkfactory.ad.rwd.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.tnkfactory.ad.R;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TAlertDialog extends Dialog {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private String message;
    private Function0<Unit> onCancel;
    private Function0<Unit> onConfirm;
    private String strCancel;
    private String strConfirm;
    private String title;

    public static final class Builder {
        public final TAlertDialog a;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.a = new TAlertDialog(context);
        }

        public final TAlertDialog build() {
            return this.a;
        }

        public final TAlertDialog getDlg() {
            return this.a;
        }

        public final Builder setCancelText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.a.setStrCancel(str);
            return this;
        }

        public final Builder setConfirmText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.a.setStrConfirm(str);
            return this;
        }

        public final Builder setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.a.setMessage(str);
            return this;
        }

        public final Builder setOnCancel(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.a.setOnCancel(function0);
            return this;
        }

        public final Builder setOnConfirm(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.a.setOnConfirm(function0);
            return this;
        }

        public final Builder setTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.a.setTitle(str);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void show(@NotNull Context context, @NotNull String str, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            TAlertDialog tAlertDialog = new TAlertDialog(context);
            tAlertDialog.setMessage(str);
            tAlertDialog.setOnCancel(function02);
            tAlertDialog.setOnConfirm(function0);
            tAlertDialog.setStrConfirm("");
            tAlertDialog.setStrCancel("");
            tAlertDialog.show();
            Unit unit = Unit.INSTANCE;
        }

        private Companion() {
        }

        public final void show(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            TAlertDialog tAlertDialog = new TAlertDialog(context);
            tAlertDialog.setMessage(str);
            tAlertDialog.setOnCancel(function02);
            tAlertDialog.setOnConfirm(function0);
            tAlertDialog.setStrConfirm(str2);
            tAlertDialog.setStrCancel(str3);
            tAlertDialog.show();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void $r8$lambda$SIiKeJySNi7sxnYpDyk7hqTaM2w(Function0 function0, TAlertDialog tAlertDialog, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$2$lambda$1(function0, tAlertDialog, view);
        if (i4 == 0) {
            int i5 = 52 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$zWOnsH2sPWLryKauFpSTtroa1go(Function0 function0, TAlertDialog tAlertDialog, View view) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$5$lambda$4(function0, tAlertDialog, view);
        int i5 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static {
        onNavigationEvent();
        Companion = new Companion(null);
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TAlertDialog(@NotNull Context context) {
        super(context, R.style.tnk_full_screen_dialog);
        Intrinsics.checkNotNullParameter(context, "");
        this.title = "";
        this.message = "";
    }

    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        String str = this.message;
        int i6 = i3 + 111;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Function0<Unit> getOnCancel() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        Function0<Unit> function0 = this.onCancel;
        int i6 = i4 + 23;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return function0;
    }

    public final Function0<Unit> getOnConfirm() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.onConfirm;
        }
        throw null;
    }

    public final String getStrCancel() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.strCancel;
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        return str;
    }

    public final String getStrConfirm() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        String str = this.strConfirm;
        int i6 = i4 + 77;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTitle() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i5 = i4 + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMessage(@NotNull String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            int i4 = 74 / 0;
        }
    }

    public final void setOnCancel(@Nullable Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 27;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.onCancel = function0;
        int i6 = i4 + 47;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function0<Unit> function0 = this.onCancel;
        if (function0 != null) {
            function0.invoke();
            int i4 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setOnConfirm(@Nullable Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onConfirm = function0;
        if (i4 != 0) {
            throw null;
        }
    }

    public final void setStrCancel(@Nullable String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.strCancel = str;
        int i6 = i4 + 95;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setStrConfirm(@Nullable String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.strConfirm = str;
        if (i4 == 0) {
            int i5 = 2 / 0;
        }
    }

    public final void setTitle(@NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void onCreate$lambda$2$lambda$1(Function0 function0, TAlertDialog tAlertDialog, View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            function0.invoke();
            tAlertDialog.dismiss();
        } else {
            function0.invoke();
            tAlertDialog.dismiss();
            throw null;
        }
    }

    private static final void onCreate$lambda$5$lambda$4(Function0 function0, TAlertDialog tAlertDialog, View view) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        tAlertDialog.dismiss();
        int i5 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        Unit unit;
        Unit unit2;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        Object obj = null;
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.com_tnk_offerwall_dialog_alert, (ViewGroup) null));
        TextView textView = (TextView) findViewById(R.id.com_tnk_tv_title);
        TextView textView2 = (TextView) findViewById(R.id.tv_message);
        TextView textView3 = (TextView) findViewById(R.id.btn_confirm);
        TextView textView4 = (TextView) findViewById(R.id.btn_cancel);
        if (!TextUtils.isEmpty(this.title)) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(this.title);
            }
        }
        if (textView2 != null) {
            int i3 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                textView2.setText(this.message);
                obj.hashCode();
                throw null;
            }
            textView2.setText(this.message);
        }
        final Function0<Unit> function0 = this.onCancel;
        if (function0 != null) {
            int i4 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView4 != null) {
                textView4.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.rwd.common.TAlertDialog$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TAlertDialog.$r8$lambda$SIiKeJySNi7sxnYpDyk7hqTaM2w(function0, this, view);
                    }
                });
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
        }
        final Function0<Unit> function02 = this.onConfirm;
        if (function02 == null) {
            Intrinsics.checkNotNull(textView3);
            textView3.setVisibility(8);
            int i6 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.rwd.common.TAlertDialog$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TAlertDialog.$r8$lambda$zWOnsH2sPWLryKauFpSTtroa1go(function02, this, view);
                    }
                });
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
            }
        }
        if (!TextUtils.isEmpty(this.strConfirm)) {
            int i8 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            if (textView3 != null) {
                textView3.setText(this.strConfirm);
            }
        } else if (textView3 != null) {
            int i9 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{3326, 55979, 16274, 1232, 38302, 48030}, AndroidCharacter.getMirror('0') - '0', objArr);
            textView3.setText(((String) objArr[0]).intern());
        }
        if (!TextUtils.isEmpty(this.strCancel)) {
            int i11 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (textView4 != null) {
                textView4.setText(this.strCancel);
            }
        } else if (textView4 != null) {
            int i12 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            textView4.setText("취소");
        }
        setCancelable(true);
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $10 + 79;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 45812), View.resolveSizeAndState(0, 0, 0) + 84, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 19, 8808 - TextUtils.getTrimmedLength(""), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 71;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onNavigationEvent() {
        onNavigationEvent = 1249515270186370870L;
    }
}
