package im.toss.appsintoss.iap;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getTileModeX;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchaseHistoryDetailActivity$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    int label;
    final /* synthetic */ InAppPurchaseHistoryDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchaseHistoryDetailActivity$onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, access13800<? super InAppPurchaseHistoryDetailActivity$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchaseHistoryDetailActivity;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i4 == 0) {
            int i5 = 16 / 0;
        }
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchaseHistoryDetailActivity$onWarmupCompleted inAppPurchaseHistoryDetailActivity$onWarmupCompleted = new InAppPurchaseHistoryDetailActivity$onWarmupCompleted(this.this$0, access13800Var);
        int i3 = onExtraCallback + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
        return inAppPurchaseHistoryDetailActivity$onWarmupCompleted;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        onWarmupCompleted = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        IAuthTabCallback(findresandmsg, access13800Var);
        throw null;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$onWarmupCompleted$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;
        final /* synthetic */ InAppPurchaseHistoryDetailActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, access13800<? super AnonymousClass3> access13800Var) {
            super(2, access13800Var);
            this.this$0 = inAppPurchaseHistoryDetailActivity;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i4 != 0) {
                int i5 = 13 / 0;
            }
            int i6 = onExtraCallbackWithResult + 1;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, access13800Var);
            int i3 = onExtraCallbackWithResult + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass3;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i5 = onExtraCallback + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objIAuthTabCallback;
        }

        /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$onWarmupCompleted$3$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallback;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InAppPurchaseHistoryDetailActivity this$0;
            private static char[] onWarmupCompleted = {32419, 32432, 32418, 32416, 32425, 32417};
            private static int IAuthTabCallback = -1184333987;
            private static boolean onExtraCallbackWithResult = true;
            private static boolean onNavigationEvent = true;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = inAppPurchaseHistoryDetailActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, access13800Var);
                anonymousClass5.Z$0 = ((Boolean) obj).booleanValue();
                int i3 = onExtraCallback + 117;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return anonymousClass5;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackDefault + 61;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (i4 == 0) {
                    return onExtraCallback(zBooleanValue, (access13800) obj2);
                }
                onExtraCallback(zBooleanValue, (access13800) obj2);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(boolean z, access13800<? super Unit> access13800Var) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 91;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                int i5 = onExtraCallback + 27;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
            
                if (r1 != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
            
                r8 = r7.this$0;
                r1 = r8.getString(im.toss.appsintoss.R.string.appsintoss_in_app_purchase_error_retry);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
                new im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent(r8, r1).onNavigationEvent();
                r8 = im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$onWarmupCompleted.AnonymousClass3.AnonymousClass5.onExtraCallback + 13;
                im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$onWarmupCompleted.AnonymousClass3.AnonymousClass5.IAuthTabCallbackDefault = r8 % 128;
                r8 = r8 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
            
                return kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
            
                if (r7.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
            
                if (r7.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r8);
                r8 = r7.this$0;
                r5 = new java.lang.Object[1];
                a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, (-16777089) - android.graphics.Color.rgb(0, 0, 0), r5);
                im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity.onWarmupCompleted(r8, "issue_result_observed", o.access8100.onNavigationEvent(o.getWrite.IAuthTabCallback(((java.lang.String) r5[0]).intern(), o.access14000.onNavigationEvent(r1))));
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackDefault + 35;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    z = this.Z$0;
                    int i4 = 80 / 0;
                } else {
                    z = this.Z$0;
                }
            }

            private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
                int i3;
                char[] cArr2;
                int i4 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                char[] cArr3 = onWarmupCompleted;
                if (cArr3 != null) {
                    int i5 = $11 + 89;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $11 + 93;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 77 - View.MeasureSpec.getMode(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                                }
                                cArr4[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                i7 >>>= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr3[i7])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), Color.green(0) + 77, 20952 - (ViewConfiguration.getPressedStateDuration() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                                }
                                cArr4[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                                i7++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                    }
                    cArr3 = cArr4;
                }
                Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                char c = '0';
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0', 0) + 76, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16036, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                if (onNavigationEvent) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i9 = $11 + 35;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i2] >> iIntValue);
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 63 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        } else {
                            cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63, ImageFormat.getBitsPerPixel(0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback5).invoke(null, objArr6);
                        }
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                if (!onExtraCallbackWithResult) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i10 = $10 + 51;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i2] * iIntValue);
                            i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted >> 1;
                        } else {
                            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                            i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                        }
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i3;
                    }
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i11 = $10 + 41;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i12 = $11 + 89;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0) + 1), 63 - View.resolveSize(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    c = '0';
                }
                objArr[0] = new String(cArr2);
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 83;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {InAppPurchaseHistoryDetailActivity.onExtraCallbackWithResult(this.this$0)};
                int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                getTileModeX gettilemodex = (getTileModeX) InAppPurchaseHistoryDetailViewModel.onWarmupCompleted(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, 691326277, objArr, -691326276, iIAuthTabCallback2);
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(gettilemodex, anonymousClass5, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallback + 109;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i6 = 90 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 != 0) {
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(inAppPurchaseHistoryDetailActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(inAppPurchaseHistoryDetailActivity, onextracallback, anonymousClass3, this) == objOnWarmupCompleted) {
                int i6 = onExtraCallback + 19;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 35 / 0;
                }
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
