package viva.republica.toss.password;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.base.BaseActivity;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TypeUtils1;
import o.TypeUtils7;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getNavigationBar;
import o.isJSONTypeIgnore;
import o.isJacksonCreator;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.setRandomHost;
import o.shortValue;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.password.PasswordSettingActivity;
import viva.republica.toss.password.ResetPasswordSchemeActivity$onCreate$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResetPasswordSchemeActivity extends Hilt_ResetPasswordSchemeActivity {

    @Inject
    public isJacksonCreator authUiConfig;

    @Inject
    public shortValue authenticator;
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.password.ResetPasswordSchemeActivity$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return ResetPasswordSchemeActivity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {46, -95, 11, -87};
    private static final int $$b = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackDefault = 478309050;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, byte r8, byte r9) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 1
            int r7 = r7 * 4
            int r7 = 105 - r7
            byte[] r0 = viva.republica.toss.password.ResetPasswordSchemeActivity.$$a
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.ResetPasswordSchemeActivity.$$c(byte, byte, byte):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(ResetPasswordSchemeActivity resetPasswordSchemeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(resetPasswordSchemeActivity, iEngagementSignalsCallbackDefault);
        }
        onNavigationEvent(resetPasswordSchemeActivity, iEngagementSignalsCallbackDefault);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 97;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = i2 + 89;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final /* synthetic */ void onExtraCallback(ResetPasswordSchemeActivity resetPasswordSchemeActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        resetPasswordSchemeActivity.ICustomTabsServiceStub();
        int i4 = asInterface + 9;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 9;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return sessionTrackerb;
    }

    public final shortValue IAuthTabCallback() {
        int i = 2 % 2;
        shortValue shortvalue = this.authenticator;
        if (shortvalue == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return shortvalue;
    }

    public final isJacksonCreator onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        isJacksonCreator isjacksoncreator = this.authUiConfig;
        if (isjacksoncreator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 13;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return isjacksoncreator;
    }

    private static final Unit onNavigationEvent(ResetPasswordSchemeActivity resetPasswordSchemeActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            resetPasswordSchemeActivity.ICustomTabsServiceStub();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        resetPasswordSchemeActivity.ICustomTabsServiceStub();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.password.Hilt_ResetPasswordSchemeActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 106, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022768).substring(0, 7).codePointAt(6) - 46, new char[]{65532, 7, 65528, 65535, 7}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019668).substring(0, 31).length() + 225, objArr);
            extras.getString(((String) objArr[0]).intern());
            int i4 = asBinder + 15;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022623).substring(0, 4).codePointAt(2) - 54, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 14, new char[]{4, '\b', 65533, 3, 2, 65528, 65529, 7, 65527, 6, 65533}, false, (ViewConfiguration.getScrollBarSize() >> 8) + 255, objArr2);
            extras2.getString(((String) objArr2[0]).intern());
        }
        ResetPasswordSchemeActivity$onCreate$$inlined$CoroutineExceptionHandler$1 resetPasswordSchemeActivity$onCreate$$inlined$CoroutineExceptionHandler$1 = new ResetPasswordSchemeActivity$onCreate$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.extraCallbackWithResult, this);
        if (!onNavigationEvent().IAuthTabCallback(this)) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), resetPasswordSchemeActivity$onCreate$$inlined$CoroutineExceptionHandler$1, (setRandomHost) null, new AnonymousClass1(null), 2, (Object) null);
            return;
        }
        int i6 = asBinder + 69;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        startActivity(PasswordSettingActivity.onNavigationEvent.onNavigationEvent(PasswordSettingActivity.Companion, this, UTF8Decoder.CHECK_RESET_PASSWORD, 63L, false, false, null, 56, null));
        int i8 = asBinder + 83;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: viva.republica.toss.password.ResetPasswordSchemeActivity$onCreate$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static final byte[] $$a = {109, 5, -57, 108};
        private static final int $$b = 107;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 478308897;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v7, types: [int] */
        /* JADX WARN: Type inference failed for: r6v9, types: [int] */
        /* JADX WARN: Type inference failed for: r7v2, types: [int] */
        private static String $$c(short s, byte b, short s2) {
            int i = s2 * 4;
            ?? r7 = (b * 4) + 105;
            byte[] bArr = $$a;
            int i2 = (s * 2) + 4;
            byte[] bArr2 = new byte[1 - i];
            int i3 = 0 - i;
            int i4 = -1;
            byte b2 = r7;
            if (bArr == null) {
                b2 = i2 + r7;
                i2++;
            }
            while (true) {
                i4++;
                bArr2[i4] = b2;
                if (i4 == i3) {
                    return new String(bArr2, 0);
                }
                byte b3 = b2;
                b2 = b3 + bArr[i2];
                i2++;
            }
        }

        AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onWarmupCompleted(TypeUtils7 typeUtils7) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(typeUtils7);
            int i4 = IAuthTabCallback + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass1 anonymousClass1 = ResetPasswordSchemeActivity.this.new AnonymousClass1(access13800Var);
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onExtraCallbackWithResult(TypeUtils7 typeUtils7) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            typeUtils7.onWarmupCompleted(true);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 13;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    Object[] objArr = new Object[1];
                    a(Color.alpha(0) + 47, Process.getGidForName("") + 37, new char[]{24, '\r', 27, 65476, 65483, '\t', 15, 19, 26, 18, '\r', 65483, 65476, '\t', 22, 19, '\n', '\t', 6, 65476, 65483, '\t', 17, 25, 23, '\t', 22, 65483, 65476, 19, 24, 65476, 16, 16, 5, 7, '\t', 18, '\r', 24, 25, 19, 22, 19, 7, 65476, '\f'}, true, TextUtils.indexOf((CharSequence) "", '0') + 101, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = i4 + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                int i7 = IAuthTabCallback + 119;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                objOnExtraCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                getByteBuffer getbytebufferIAuthTabCallback = shortValue.IAuthTabCallback(ResetPasswordSchemeActivity.this.IAuthTabCallback(), ResetPasswordSchemeActivity.this, UTF8Decoder.CHECK_RESET_PASSWORD, 63L, true, false, false, false, (shortValue.onNavigationEvent) null, false, (Function0) null, false, (TypeUtils1) null, false, (String) null, new ResetPasswordSchemeActivity$onCreate$1$.ExternalSyntheticLambda0(), 16368, (Object) null);
                this.label = 1;
                objOnExtraCallback = RxAwaitKt.onExtraCallback(getbytebufferIAuthTabCallback, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objOnExtraCallback;
            BaseActivity baseActivity = ResetPasswordSchemeActivity.this;
            PasswordSettingActivity.onNavigationEvent onnavigationevent = PasswordSettingActivity.Companion;
            Intrinsics.checkNotNull(isjsontypeignore);
            baseActivity.startActivity(PasswordSettingActivity.onNavigationEvent.onExtraCallback(onnavigationevent, baseActivity, isjsontypeignore, true, false, null, 24, null));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.ResetPasswordSchemeActivity.AnonymousClass1.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            overridePendingTransition(1, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        Intent intentOnExtraCallbackWithResult = setEngagementSignalsCallback().onExtraCallbackWithResult(this);
        intentOnExtraCallbackWithResult.addFlags(67108864);
        intentOnExtraCallbackWithResult.addFlags(32768);
        intentOnExtraCallbackWithResult.addFlags(268435456);
        getNavigationBar.IAuthTabCallback(intentOnExtraCallbackWithResult, this);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.ResetPasswordSchemeActivity.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    @Override // viva.republica.toss.password.Hilt_ResetPasswordSchemeActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.password.Hilt_ResetPasswordSchemeActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 103;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.password.Hilt_ResetPasswordSchemeActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = asBinder + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.password.Hilt_ResetPasswordSchemeActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asInterface + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }
}
