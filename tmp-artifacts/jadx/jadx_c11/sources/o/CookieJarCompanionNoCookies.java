package o;

import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.tds.graphics.gl.compose.RenderObject;
import im.toss.tds.graphics.gl.view.ViewRenderingPipeline$;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CommonContextMenuAreaKtExternalSyntheticLambda7;
import o.CookieJarCompanionNoCookies;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CookieJarCompanionNoCookies {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private final ConcurrentHashMap<String, RenderObject> IAuthTabCallback;
    private final CommonContextMenuAreaKtExternalSyntheticLambda7 onExtraCallback;
    private final secure onExtraCallbackWithResult;
    private final Function1<RenderObject, Unit> onNavigationEvent;
    private final ConcurrentHashMap<String, Boolean> onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = (CookieJarCompanionNoCookies) objArr[0];
        RenderObject renderObject = (RenderObject) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(cookieJarCompanionNoCookies, renderObject);
        }
        onWarmupCompleted(cookieJarCompanionNoCookies, renderObject);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject, CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -1573385657, new Object[]{cookieJarCompanionNoCookies, renderObject, onnavigationevent}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1573385659);
        }
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cookieJarCompanionNoCookies, renderObject);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~((~i3) | i8);
        int i10 = i3 | i8;
        int i11 = i6 + i4 + i + ((-189913888) * i2) + ((-1809372279) * i5);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i6) - 1671495680) + (10634006 * i4) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i) + (952107008 * i2) + (1092222976 * i5) + ((-70844416) * i12);
        int i14 = (i6 * 986545540) + 223666697 + (i4 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i * 986544659) + (i2 * 1843362976) + (i5 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = (CookieJarCompanionNoCookies) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cookieJarCompanionNoCookies, str);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject, CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(cookieJarCompanionNoCookies, renderObject, onnavigationevent);
        }
        onExtraCallbackWithResult(cookieJarCompanionNoCookies, renderObject, onnavigationevent);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onTransact(cookieJarCompanionNoCookies, renderObject);
        int i4 = asInterface + 63;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(RenderObject renderObject, deprecated_secure deprecated_secureVar, CookieJarCompanionNoCookies cookieJarCompanionNoCookies) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(renderObject, deprecated_secureVar, cookieJarCompanionNoCookies);
        int i4 = IAuthTabCallbackDefault + 117;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public CookieJarCompanionNoCookies(@NotNull secure secureVar, @NotNull CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda7) {
        Intrinsics.checkNotNullParameter(secureVar, "");
        Intrinsics.checkNotNullParameter(commonContextMenuAreaKtExternalSyntheticLambda7, "");
        this.onExtraCallbackWithResult = secureVar;
        this.onExtraCallback = commonContextMenuAreaKtExternalSyntheticLambda7;
        this.IAuthTabCallback = new ConcurrentHashMap<>();
        this.onWarmupCompleted = new ConcurrentHashMap<>();
        this.onNavigationEvent = new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewRenderingPipeline$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 11;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this.f$0, (RenderObject) obj};
                Unit unit = (Unit) CookieJarCompanionNoCookies.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -152016493, objArr, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 152016496);
                int i4 = onWarmupCompleted + 27;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 68 / 0;
                }
                return unit;
            }
        };
    }

    private static final Unit onWarmupCompleted(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject) throws Throwable {
        int i = 2 % 2;
        ConcurrentHashMap<String, Boolean> concurrentHashMap = cookieJarCompanionNoCookies.onWarmupCompleted;
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        if (Intrinsics.areEqual(concurrentHashMap.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, iOnNavigationEvent, 1674398857, iOnNavigationEvent2, new Object[]{renderObject}, iOnNavigationEvent3)), Boolean.TRUE)) {
            int i2 = asInterface + 5;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                cookieJarCompanionNoCookies.onExtraCallbackWithResult.onWarmupCompleted(renderObject);
                cookieJarCompanionNoCookies.onExtraCallbackWithResult.onWarmupCompleted();
            } else {
                cookieJarCompanionNoCookies.onExtraCallbackWithResult.onWarmupCompleted(renderObject);
                cookieJarCompanionNoCookies.onExtraCallbackWithResult.onWarmupCompleted();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public final void onWarmupCompleted(@NotNull Function1<? super CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent, Unit> function1) {
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Collection<RenderObject> collectionValues = this.IAuthTabCallback.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            collectionValues.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Collection<RenderObject> collectionValues2 = this.IAuthTabCallback.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
        Iterator<T> it = collectionValues2.iterator();
        while (it.hasNext()) {
            int i3 = asInterface + 107;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                onnavigationeventOnWarmupCompleted = ((RenderObject) it.next()).onWarmupCompleted();
                int i4 = 82 / 0;
                if (onnavigationeventOnWarmupCompleted != null) {
                    function1.invoke(onnavigationeventOnWarmupCompleted);
                }
            } else {
                onnavigationeventOnWarmupCompleted = ((RenderObject) it.next()).onWarmupCompleted();
                if (onnavigationeventOnWarmupCompleted != null) {
                    function1.invoke(onnavigationeventOnWarmupCompleted);
                }
            }
        }
        int i5 = asInterface + 29;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onExtraCallbackWithResult(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject, CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        cookieJarCompanionNoCookies.onNavigationEvent.invoke(renderObject);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 37;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallback(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        cookieJarCompanionNoCookies.onNavigationEvent.invoke(renderObject);
        int i4 = IAuthTabCallbackDefault + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@NotNull final RenderObject renderObject) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(renderObject, "");
        ConcurrentHashMap<String, RenderObject> concurrentHashMap = this.IAuthTabCallback;
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        concurrentHashMap.put((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, iOnNavigationEvent, 1674398857, iOnNavigationEvent2, new Object[]{renderObject}, iOnNavigationEvent3), renderObject);
        renderObject.onWarmupCompleted(this.onNavigationEvent);
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationeventOnWarmupCompleted = renderObject.onWarmupCompleted();
        if (onnavigationeventOnWarmupCompleted == null) {
            this.onExtraCallback.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewRenderingPipeline$$ExternalSyntheticLambda6
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        CookieJarCompanionNoCookies.IAuthTabCallback(this.f$0, renderObject);
                        throw null;
                    }
                    CookieJarCompanionNoCookies.IAuthTabCallback(this.f$0, renderObject);
                    int i6 = onWarmupCompleted + 119;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                }
            });
            return;
        }
        onnavigationeventOnWarmupCompleted.onNavigationEvent(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewRenderingPipeline$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 123;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnExtraCallback = CookieJarCompanionNoCookies.onExtraCallback(this.f$0, renderObject, (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj);
                int i7 = onWarmupCompleted + 1;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        });
        int i4 = asInterface + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final RenderObject IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = asInterface + 41;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return this.IAuthTabCallback.get(str);
        }
        int i4 = asInterface + 95;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void onExtraCallback(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {cookieJarCompanionNoCookies.onExtraCallbackWithResult, str};
        secure.onWarmupCompleted(929987672, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -929987671, objArr);
        int i4 = IAuthTabCallbackDefault + 99;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (str != null) {
            RenderObject renderObjectRemove = this.IAuthTabCallback.remove(str);
            if (renderObjectRemove != null) {
                this.onExtraCallback.onWarmupCompleted(new ViewRenderingPipeline$.ExternalSyntheticLambda2(this, str));
                renderObjectRemove.onNavigationEvent();
            }
            this.onWarmupCompleted.remove(str);
            return;
        }
        int i5 = i3 + 27;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@Nullable String str, @NotNull final deprecated_secure deprecated_secureVar) {
        final RenderObject renderObjectIAuthTabCallback;
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            renderObjectIAuthTabCallback = IAuthTabCallback(str);
            int i3 = 72 / 0;
            if (renderObjectIAuthTabCallback == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            renderObjectIAuthTabCallback = IAuthTabCallback(str);
            if (renderObjectIAuthTabCallback == null) {
                return;
            }
        }
        this.onExtraCallback.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewRenderingPipeline$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                RenderObject renderObject = renderObjectIAuthTabCallback;
                if (i6 != 0) {
                    CookieJarCompanionNoCookies.onWarmupCompleted(renderObject, deprecated_secureVar, this);
                } else {
                    CookieJarCompanionNoCookies.onWarmupCompleted(renderObject, deprecated_secureVar, this);
                    int i7 = 49 / 0;
                }
            }
        });
        int i4 = asInterface + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback(RenderObject renderObject, deprecated_secure deprecated_secureVar, CookieJarCompanionNoCookies cookieJarCompanionNoCookies) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), 434526393, iOnNavigationEvent, -434526393, iOnNavigationEvent2, new Object[]{renderObject, deprecated_secureVar}, iOnNavigationEvent3);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = cookieJarCompanionNoCookies.onWarmupCompleted;
        int iOnNavigationEvent4 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent5 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent6 = RNSScreenManagerDelegate.onNavigationEvent();
        Object obj = null;
        if (Intrinsics.areEqual(concurrentHashMap.get((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, iOnNavigationEvent4, 1674398857, iOnNavigationEvent5, new Object[]{renderObject}, iOnNavigationEvent6)), Boolean.TRUE)) {
            int i4 = asInterface + 97;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                cookieJarCompanionNoCookies.onExtraCallbackWithResult.onWarmupCompleted(renderObject);
                cookieJarCompanionNoCookies.onExtraCallbackWithResult.onWarmupCompleted();
                throw null;
            }
            cookieJarCompanionNoCookies.onExtraCallbackWithResult.onWarmupCompleted(renderObject);
            cookieJarCompanionNoCookies.onExtraCallbackWithResult.onWarmupCompleted();
        }
        int i5 = IAuthTabCallbackDefault + 93;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = (CookieJarCompanionNoCookies) objArr[0];
        RenderObject renderObject = (RenderObject) objArr[1];
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent = (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        cookieJarCompanionNoCookies.onNavigationEvent.invoke(renderObject);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onTransact(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        cookieJarCompanionNoCookies.onNavigationEvent.invoke(renderObject);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
    }

    public final void IAuthTabCallback(@Nullable String str, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            final RenderObject renderObjectIAuthTabCallback = IAuthTabCallback(str);
            if (renderObjectIAuthTabCallback != null) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = this.onWarmupCompleted;
                int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
                int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
                concurrentHashMap.put((String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, iOnNavigationEvent, 1674398857, iOnNavigationEvent2, new Object[]{renderObjectIAuthTabCallback}, iOnNavigationEvent3), Boolean.TRUE);
                RenderObject.onExtraCallback(renderObjectIAuthTabCallback, j, false, 2, null);
                CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationeventOnWarmupCompleted = renderObjectIAuthTabCallback.onWarmupCompleted();
                if (onnavigationeventOnWarmupCompleted != null) {
                    onnavigationeventOnWarmupCompleted.onNavigationEvent(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewRenderingPipeline$$ExternalSyntheticLambda3
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i3 = 2 % 2;
                            int i4 = onWarmupCompleted + 33;
                            onNavigationEvent = i4 % 128;
                            int i5 = i4 % 2;
                            CookieJarCompanionNoCookies cookieJarCompanionNoCookies = this.f$0;
                            if (i5 != 0) {
                                return CookieJarCompanionNoCookies.IAuthTabCallback(cookieJarCompanionNoCookies, renderObjectIAuthTabCallback, (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj);
                            }
                            CookieJarCompanionNoCookies.IAuthTabCallback(cookieJarCompanionNoCookies, renderObjectIAuthTabCallback, (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    });
                    return;
                }
                this.onExtraCallback.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewRenderingPipeline$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = 2 % 2;
                        int i4 = onWarmupCompleted + 69;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            CookieJarCompanionNoCookies.onNavigationEvent(this.f$0, renderObjectIAuthTabCallback);
                            int i5 = 29 / 0;
                        } else {
                            CookieJarCompanionNoCookies.onNavigationEvent(this.f$0, renderObjectIAuthTabCallback);
                        }
                        int i6 = onWarmupCompleted + 117;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 55 / 0;
                        }
                    }
                });
            }
            int i3 = asInterface + 21;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        IAuthTabCallback(str);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = (CookieJarCompanionNoCookies) objArr[0];
        int i = 2 % 2;
        Iterator<Map.Entry<String, RenderObject>> it = cookieJarCompanionNoCookies.IAuthTabCallback.entrySet().iterator();
        int i2 = asInterface + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            RenderObject value = it.next().getValue();
            value.onNavigationEvent();
            value.onWarmupCompleted((Function1<? super RenderObject, Unit>) null);
            secure secureVar = cookieJarCompanionNoCookies.onExtraCallbackWithResult;
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
            int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
            Object[] objArr2 = {secureVar, (String) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, iOnNavigationEvent, 1674398857, iOnNavigationEvent2, new Object[]{value}, iOnNavigationEvent3)};
            secure.onWarmupCompleted(929987672, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -929987671, objArr2);
        }
        cookieJarCompanionNoCookies.IAuthTabCallback.clear();
        cookieJarCompanionNoCookies.onWarmupCompleted.clear();
        int i4 = asInterface + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return null;
    }

    public static /* synthetic */ void onNavigationEvent(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, String str) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, 1809622716, new Object[]{cookieJarCompanionNoCookies, str}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1809622716);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -152016493, new Object[]{cookieJarCompanionNoCookies, renderObject}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 152016496);
    }

    private static final Unit onNavigationEvent(CookieJarCompanionNoCookies cookieJarCompanionNoCookies, RenderObject renderObject, CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -1573385657, new Object[]{cookieJarCompanionNoCookies, renderObject, onnavigationevent}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1573385659);
    }

    public final void onWarmupCompleted() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, -1836639166, new Object[]{this}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1836639167);
    }
}
